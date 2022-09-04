package com.google.android.gms.internal;

import java.io.IOException;
/* renamed from: com.google.android.gms.internal.rd */
/* loaded from: classes2.dex */
public abstract class AbstractC7649rd {

    /* renamed from: ah */
    protected volatile int f25391ah = -1;

    /* renamed from: a */
    public static final <T extends AbstractC7649rd> T m13856a(T t, byte[] bArr) {
        return (T) m13854b(t, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static final void m13855a(AbstractC7649rd abstractC7649rd, byte[] bArr, int i, int i2) {
        try {
            C7640qw m13958a = C7640qw.m13958a(bArr, i, i2);
            abstractC7649rd.mo13818a(m13958a);
            m13958a.m13957b();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    public static final byte[] m13857a(AbstractC7649rd abstractC7649rd) {
        byte[] bArr = new byte[abstractC7649rd.m13852g()];
        m13855a(abstractC7649rd, bArr, 0, bArr.length);
        return bArr;
    }

    /* renamed from: b */
    public static final <T extends AbstractC7649rd> T m13854b(T t, byte[] bArr, int i, int i2) {
        try {
            C7639qv m14008a = C7639qv.m14008a(bArr, i, i2);
            t.mo13816b(m14008a);
            m14008a.m14014a(0);
            return t;
        } catch (C7648rc e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int mo13820a() {
        return 0;
    }

    /* renamed from: a */
    public void mo13818a(C7640qw c7640qw) {
    }

    /* renamed from: b */
    public abstract AbstractC7649rd mo13816b(C7639qv c7639qv);

    @Override // 
    /* renamed from: e */
    public AbstractC7649rd clone() {
        return (AbstractC7649rd) super.clone();
    }

    /* renamed from: f */
    public int m13853f() {
        if (this.f25391ah < 0) {
            m13852g();
        }
        return this.f25391ah;
    }

    /* renamed from: g */
    public int m13852g() {
        int mo13820a = mo13820a();
        this.f25391ah = mo13820a;
        return mo13820a;
    }

    public String toString() {
        return C7650re.m13851a(this);
    }
}
