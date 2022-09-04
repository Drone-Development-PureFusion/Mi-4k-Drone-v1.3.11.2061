package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Throwables;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.ThreadSafe;
@ThreadSafe
/* loaded from: classes.dex */
public class NativePooledByteBufferFactory implements PooledByteBufferFactory {
    private final NativeMemoryChunkPool mPool;
    private final PooledByteStreams mPooledByteStreams;

    public NativePooledByteBufferFactory(NativeMemoryChunkPool nativeMemoryChunkPool, PooledByteStreams pooledByteStreams) {
        this.mPool = nativeMemoryChunkPool;
        this.mPooledByteStreams = pooledByteStreams;
    }

    @VisibleForTesting
    NativePooledByteBuffer newByteBuf(InputStream inputStream, NativePooledByteBufferOutputStream nativePooledByteBufferOutputStream) {
        this.mPooledByteStreams.copy(inputStream, nativePooledByteBufferOutputStream);
        return nativePooledByteBufferOutputStream.mo40094toByteBuffer();
    }

    @Override // com.facebook.imagepipeline.memory.PooledByteBufferFactory
    /* renamed from: newByteBuffer */
    public NativePooledByteBuffer mo40088newByteBuffer(int i) {
        Preconditions.checkArgument(i > 0);
        CloseableReference m35506of = CloseableReference.m35506of(this.mPool.get(i), this.mPool);
        try {
            return new NativePooledByteBuffer(m35506of, i);
        } finally {
            m35506of.close();
        }
    }

    @Override // com.facebook.imagepipeline.memory.PooledByteBufferFactory
    /* renamed from: newByteBuffer */
    public NativePooledByteBuffer mo40089newByteBuffer(InputStream inputStream) {
        NativePooledByteBufferOutputStream nativePooledByteBufferOutputStream = new NativePooledByteBufferOutputStream(this.mPool);
        try {
            return newByteBuf(inputStream, nativePooledByteBufferOutputStream);
        } finally {
            nativePooledByteBufferOutputStream.close();
        }
    }

    @Override // com.facebook.imagepipeline.memory.PooledByteBufferFactory
    /* renamed from: newByteBuffer */
    public NativePooledByteBuffer mo40090newByteBuffer(InputStream inputStream, int i) {
        NativePooledByteBufferOutputStream nativePooledByteBufferOutputStream = new NativePooledByteBufferOutputStream(this.mPool, i);
        try {
            return newByteBuf(inputStream, nativePooledByteBufferOutputStream);
        } finally {
            nativePooledByteBufferOutputStream.close();
        }
    }

    @Override // com.facebook.imagepipeline.memory.PooledByteBufferFactory
    /* renamed from: newByteBuffer */
    public NativePooledByteBuffer mo40091newByteBuffer(byte[] bArr) {
        NativePooledByteBufferOutputStream nativePooledByteBufferOutputStream = new NativePooledByteBufferOutputStream(this.mPool, bArr.length);
        try {
            try {
                nativePooledByteBufferOutputStream.write(bArr, 0, bArr.length);
                return nativePooledByteBufferOutputStream.mo40094toByteBuffer();
            } catch (IOException e) {
                throw Throwables.propagate(e);
            }
        } finally {
            nativePooledByteBufferOutputStream.close();
        }
    }

    @Override // com.facebook.imagepipeline.memory.PooledByteBufferFactory
    /* renamed from: newOutputStream */
    public NativePooledByteBufferOutputStream mo40092newOutputStream() {
        return new NativePooledByteBufferOutputStream(this.mPool);
    }

    @Override // com.facebook.imagepipeline.memory.PooledByteBufferFactory
    /* renamed from: newOutputStream */
    public NativePooledByteBufferOutputStream mo40093newOutputStream(int i) {
        return new NativePooledByteBufferOutputStream(this.mPool, i);
    }
}
