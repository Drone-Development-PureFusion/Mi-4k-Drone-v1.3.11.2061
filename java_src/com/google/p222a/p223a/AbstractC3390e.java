package com.google.p222a.p223a;

import java.io.IOException;
/* renamed from: com.google.a.a.e */
/* loaded from: classes.dex */
public abstract class AbstractC3390e {
    /* renamed from: a */
    public abstract int mo4533a();

    /* renamed from: a */
    public abstract AbstractC3390e mo4530a(C3386b c3386b);

    /* renamed from: a */
    public AbstractC3390e m27937a(byte[] bArr) {
        return m27935b(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public abstract void mo4529a(C3387c c3387c);

    /* renamed from: a */
    public void m27936a(byte[] bArr, int i, int i2) {
        try {
            C3387c m27978a = C3387c.m27978a(bArr, i, i2);
            mo4529a(m27978a);
            m27978a.m27963c();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m27938a(C3386b c3386b, int i) {
        return c3386b.m28014b(i);
    }

    /* renamed from: b */
    public abstract int mo4526b();

    /* renamed from: b */
    public AbstractC3390e m27935b(byte[] bArr, int i, int i2) {
        try {
            C3386b m28016a = C3386b.m28016a(bArr, i, i2);
            mo4530a(m28016a);
            m28016a.m28020a(0);
            return this;
        } catch (C3389d e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    /* renamed from: c */
    public byte[] m27934c() {
        byte[] bArr = new byte[mo4526b()];
        m27936a(bArr, 0, bArr.length);
        return bArr;
    }
}
