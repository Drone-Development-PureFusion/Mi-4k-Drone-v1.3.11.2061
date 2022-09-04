package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.ByteArrayPool;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.memory.PooledByteBufferOutputStream;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class NetworkFetchProducer implements Producer<EncodedImage> {
    public static final String INTERMEDIATE_RESULT_PRODUCER_EVENT = "intermediate_result";
    @VisibleForTesting
    static final String PRODUCER_NAME = "NetworkFetchProducer";
    private static final int READ_SIZE = 16384;
    @VisibleForTesting
    static final long TIME_BETWEEN_PARTIAL_RESULTS_MS = 100;
    private final ByteArrayPool mByteArrayPool;
    private final NetworkFetcher mNetworkFetcher;
    private final PooledByteBufferFactory mPooledByteBufferFactory;

    public NetworkFetchProducer(PooledByteBufferFactory pooledByteBufferFactory, ByteArrayPool byteArrayPool, NetworkFetcher networkFetcher) {
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
        this.mByteArrayPool = byteArrayPool;
        this.mNetworkFetcher = networkFetcher;
    }

    private static float calculateProgress(int i, int i2) {
        return i2 > 0 ? i / i2 : 1.0f - ((float) Math.exp((-i) / 50000.0d));
    }

    @Nullable
    private Map<String, String> getExtraMap(FetchState fetchState, int i) {
        if (!fetchState.getListener().requiresExtraMap(fetchState.getId())) {
            return null;
        }
        return this.mNetworkFetcher.getExtraMap(fetchState, i);
    }

    private void handleFinalResult(PooledByteBufferOutputStream pooledByteBufferOutputStream, FetchState fetchState) {
        fetchState.getListener().onProducerFinishWithSuccess(fetchState.getId(), PRODUCER_NAME, getExtraMap(fetchState, pooledByteBufferOutputStream.size()));
        notifyConsumer(pooledByteBufferOutputStream, true, fetchState.getConsumer());
    }

    private void maybeHandleIntermediateResult(PooledByteBufferOutputStream pooledByteBufferOutputStream, FetchState fetchState) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!shouldPropagateIntermediateResults(fetchState) || elapsedRealtime - fetchState.getLastIntermediateResultTimeMs() < TIME_BETWEEN_PARTIAL_RESULTS_MS) {
            return;
        }
        fetchState.setLastIntermediateResultTimeMs(elapsedRealtime);
        fetchState.getListener().onProducerEvent(fetchState.getId(), PRODUCER_NAME, INTERMEDIATE_RESULT_PRODUCER_EVENT);
        notifyConsumer(pooledByteBufferOutputStream, false, fetchState.getConsumer());
    }

    private void notifyConsumer(PooledByteBufferOutputStream pooledByteBufferOutputStream, boolean z, Consumer<EncodedImage> consumer) {
        EncodedImage encodedImage;
        CloseableReference m35507of = CloseableReference.m35507of(pooledByteBufferOutputStream.mo40094toByteBuffer());
        try {
            encodedImage = new EncodedImage(m35507of);
            try {
                encodedImage.parseMetaData();
                consumer.onNewResult(encodedImage, z);
                EncodedImage.closeSafely(encodedImage);
                CloseableReference.closeSafely(m35507of);
            } catch (Throwable th) {
                th = th;
                EncodedImage.closeSafely(encodedImage);
                CloseableReference.closeSafely(m35507of);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            encodedImage = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCancellation(FetchState fetchState) {
        fetchState.getListener().onProducerFinishWithCancellation(fetchState.getId(), PRODUCER_NAME, null);
        fetchState.getConsumer().onCancellation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFailure(FetchState fetchState, Throwable th) {
        fetchState.getListener().onProducerFinishWithFailure(fetchState.getId(), PRODUCER_NAME, th, null);
        fetchState.getConsumer().onFailure(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onResponse(FetchState fetchState, InputStream inputStream, int i) {
        PooledByteBufferOutputStream mo40093newOutputStream = i > 0 ? this.mPooledByteBufferFactory.mo40093newOutputStream(i) : this.mPooledByteBufferFactory.mo40092newOutputStream();
        byte[] bArr = this.mByteArrayPool.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.mNetworkFetcher.onFetchCompletion(fetchState, mo40093newOutputStream.size());
                    handleFinalResult(mo40093newOutputStream, fetchState);
                    return;
                } else if (read > 0) {
                    mo40093newOutputStream.write(bArr, 0, read);
                    maybeHandleIntermediateResult(mo40093newOutputStream, fetchState);
                    fetchState.getConsumer().onProgressUpdate(calculateProgress(mo40093newOutputStream.size(), i));
                }
            } finally {
                this.mByteArrayPool.release(bArr);
                mo40093newOutputStream.close();
            }
        }
    }

    private boolean shouldPropagateIntermediateResults(FetchState fetchState) {
        if (!fetchState.getContext().getImageRequest().getProgressiveRenderingEnabled()) {
            return false;
        }
        return this.mNetworkFetcher.shouldPropagate(fetchState);
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        producerContext.getListener().onProducerStart(producerContext.getId(), PRODUCER_NAME);
        final FetchState createFetchState = this.mNetworkFetcher.createFetchState(consumer, producerContext);
        this.mNetworkFetcher.fetch(createFetchState, new NetworkFetcher.Callback() { // from class: com.facebook.imagepipeline.producers.NetworkFetchProducer.1
            @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
            public void onCancellation() {
                NetworkFetchProducer.this.onCancellation(createFetchState);
            }

            @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
            public void onFailure(Throwable th) {
                NetworkFetchProducer.this.onFailure(createFetchState, th);
            }

            @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
            public void onResponse(InputStream inputStream, int i) {
                NetworkFetchProducer.this.onResponse(createFetchState, inputStream, i);
            }
        });
    }
}
