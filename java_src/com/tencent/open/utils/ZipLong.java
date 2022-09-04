package com.tencent.open.utils;

import android.support.p001v4.view.MotionEventCompat;
import org.codehaus.jackson.smile.SmileConstants;
/* loaded from: classes2.dex */
public final class ZipLong implements Cloneable {

    /* renamed from: a */
    private long f32030a;

    public ZipLong(long j) {
        this.f32030a = j;
    }

    public ZipLong(byte[] bArr) {
        this(bArr, 0);
    }

    public ZipLong(byte[] bArr, int i) {
        this.f32030a = (bArr[i + 3] << 24) & 4278190080L;
        this.f32030a += (bArr[i + 2] << 16) & 16711680;
        this.f32030a += (bArr[i + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK;
        this.f32030a += bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof ZipLong) && this.f32030a == ((ZipLong) obj).getValue();
    }

    public byte[] getBytes() {
        return new byte[]{(byte) (this.f32030a & 255), (byte) ((this.f32030a & 65280) >> 8), (byte) ((this.f32030a & 16711680) >> 16), (byte) ((this.f32030a & 4278190080L) >> 24)};
    }

    public long getValue() {
        return this.f32030a;
    }

    public int hashCode() {
        return (int) this.f32030a;
    }
}
