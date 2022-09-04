package com.p079a.p080a;

import java.util.zip.ZipException;
/* renamed from: com.a.a.g */
/* loaded from: classes.dex */
public final class C0871g implements AbstractC0891x {

    /* renamed from: a */
    private static final C0863ab f1824a = new C0863ab(51966);

    /* renamed from: b */
    private static final C0863ab f1825b = new C0863ab(0);

    /* renamed from: c */
    private static final byte[] f1826c = new byte[0];

    /* renamed from: d */
    private static final C0871g f1827d = new C0871g();

    /* renamed from: b */
    public static C0871g m37553b() {
        return f1827d;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: a */
    public C0863ab mo37484a() {
        return f1824a;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: a */
    public void mo37483a(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: c */
    public byte[] mo37482c() {
        return f1826c;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: d */
    public C0863ab mo37481d() {
        return f1825b;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: e */
    public byte[] mo37480e() {
        return f1826c;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: f */
    public C0863ab mo37479f() {
        return f1825b;
    }
}
