package com.p079a.p080a;

import java.nio.ByteBuffer;
/* renamed from: com.a.a.e */
/* loaded from: classes.dex */
class C0869e implements AbstractC0887u {

    /* renamed from: a */
    private final String f1815a;

    public C0869e() {
        this.f1815a = null;
    }

    public C0869e(String str) {
        this.f1815a = str;
    }

    @Override // com.p079a.p080a.AbstractC0887u
    /* renamed from: a */
    public String mo37520a(byte[] bArr) {
        return this.f1815a == null ? new String(bArr) : new String(bArr, this.f1815a);
    }

    @Override // com.p079a.p080a.AbstractC0887u
    /* renamed from: a */
    public boolean mo37521a(String str) {
        return true;
    }

    @Override // com.p079a.p080a.AbstractC0887u
    /* renamed from: b */
    public ByteBuffer mo37519b(String str) {
        return this.f1815a == null ? ByteBuffer.wrap(str.getBytes()) : ByteBuffer.wrap(str.getBytes(this.f1815a));
    }
}
