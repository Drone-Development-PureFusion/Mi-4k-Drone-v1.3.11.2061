package com.facebook.imagepipeline.memory;

import java.io.InputStream;
/* loaded from: classes.dex */
public interface PooledByteBufferFactory {
    /* renamed from: newByteBuffer */
    PooledByteBuffer mo40088newByteBuffer(int i);

    /* renamed from: newByteBuffer */
    PooledByteBuffer mo40089newByteBuffer(InputStream inputStream);

    /* renamed from: newByteBuffer */
    PooledByteBuffer mo40090newByteBuffer(InputStream inputStream, int i);

    /* renamed from: newByteBuffer */
    PooledByteBuffer mo40091newByteBuffer(byte[] bArr);

    /* renamed from: newOutputStream */
    PooledByteBufferOutputStream mo40092newOutputStream();

    /* renamed from: newOutputStream */
    PooledByteBufferOutputStream mo40093newOutputStream(int i);
}
