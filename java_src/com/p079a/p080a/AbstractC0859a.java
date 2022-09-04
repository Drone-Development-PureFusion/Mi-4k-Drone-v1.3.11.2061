package com.p079a.p080a;

import java.io.UnsupportedEncodingException;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
/* renamed from: com.a.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0859a implements AbstractC0891x {

    /* renamed from: a */
    private long f1742a;

    /* renamed from: b */
    private byte[] f1743b;

    /* renamed from: c */
    private byte[] f1744c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0859a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0859a(String str, byte[] bArr) {
        this(str, bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0859a(String str, byte[] bArr, int i, int i2) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        this.f1742a = crc32.getValue();
        try {
            this.f1743b = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("FATAL: UTF-8 encoding not supported.", e);
        }
    }

    /* renamed from: g */
    private void m37655g() {
        if (this.f1743b == null) {
            return;
        }
        this.f1744c = new byte[this.f1743b.length + 5];
        this.f1744c[0] = 1;
        System.arraycopy(C0898z.m37448a(this.f1742a), 0, this.f1744c, 1, 4);
        System.arraycopy(this.f1743b, 0, this.f1744c, 5, this.f1743b.length);
    }

    /* renamed from: a */
    public void m37659a(long j) {
        this.f1742a = j;
        this.f1744c = null;
    }

    /* renamed from: a */
    public void m37658a(byte[] bArr) {
        if (bArr != null) {
            this.f1743b = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.f1743b, 0, bArr.length);
        } else {
            this.f1743b = null;
        }
        this.f1744c = null;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: a */
    public void mo37483a(byte[] bArr, int i, int i2) {
        if (i2 < 5) {
            throw new ZipException("UniCode path extra data must have at least 5 bytes.");
        }
        byte b = bArr[i];
        if (b != 1) {
            throw new ZipException("Unsupported version [" + ((int) b) + "] for UniCode path extra data.");
        }
        this.f1742a = C0898z.m37446a(bArr, i + 1);
        this.f1743b = new byte[i2 - 5];
        System.arraycopy(bArr, i + 5, this.f1743b, 0, i2 - 5);
        this.f1744c = null;
    }

    /* renamed from: b */
    public byte[] m37657b() {
        if (this.f1743b != null) {
            byte[] bArr = new byte[this.f1743b.length];
            System.arraycopy(this.f1743b, 0, bArr, 0, bArr.length);
            return bArr;
        }
        return null;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: c */
    public byte[] mo37482c() {
        if (this.f1744c == null) {
            m37655g();
        }
        if (this.f1744c != null) {
            byte[] bArr = new byte[this.f1744c.length];
            System.arraycopy(this.f1744c, 0, bArr, 0, bArr.length);
            return bArr;
        }
        return null;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: d */
    public C0863ab mo37481d() {
        if (this.f1744c == null) {
            m37655g();
        }
        return new C0863ab(this.f1744c.length);
    }

    /* renamed from: d_ */
    public long m37656d_() {
        return this.f1742a;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: e */
    public byte[] mo37480e() {
        return mo37482c();
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: f */
    public C0863ab mo37479f() {
        return mo37481d();
    }
}
