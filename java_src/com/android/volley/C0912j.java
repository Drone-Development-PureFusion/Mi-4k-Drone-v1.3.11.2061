package com.android.volley;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
/* renamed from: com.android.volley.j */
/* loaded from: classes.dex */
public class C0912j implements Serializable {
    private static final long serialVersionUID = -20150728102000L;

    /* renamed from: a */
    public final int f2014a;

    /* renamed from: b */
    public final byte[] f2015b;

    /* renamed from: c */
    public final Map<String, String> f2016c;

    /* renamed from: d */
    public final boolean f2017d;

    /* renamed from: e */
    public final long f2018e;

    public C0912j(int i, byte[] bArr, Map<String, String> map, boolean z) {
        this(i, bArr, map, z, 0L);
    }

    public C0912j(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.f2014a = i;
        this.f2015b = bArr;
        this.f2016c = map;
        this.f2017d = z;
        this.f2018e = j;
    }

    public C0912j(byte[] bArr) {
        this(200, bArr, Collections.emptyMap(), false, 0L);
    }

    public C0912j(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }
}
