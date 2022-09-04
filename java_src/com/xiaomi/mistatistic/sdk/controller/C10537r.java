package com.xiaomi.mistatistic.sdk.controller;

import java.io.FilterInputStream;
import java.io.InputStream;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.r */
/* loaded from: classes2.dex */
public final class C10537r extends FilterInputStream {

    /* renamed from: a */
    private boolean f32690a;

    public C10537r(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read;
        if (this.f32690a || (read = super.read(bArr, i, i2)) == -1) {
            this.f32690a = true;
            return -1;
        }
        return read;
    }
}
