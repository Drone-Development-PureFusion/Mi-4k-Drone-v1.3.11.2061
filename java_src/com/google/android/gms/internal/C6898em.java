package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.em */
/* loaded from: classes2.dex */
public class C6898em {

    /* renamed from: a */
    Map<String, Object> f23267a;

    /* renamed from: b */
    private final Context f23268b;

    /* renamed from: c */
    private final C6908eo f23269c;

    /* renamed from: d */
    private final AbstractC4682e f23270d;

    /* renamed from: e */
    private String f23271e;

    /* renamed from: f */
    private final Map<String, Object> f23272f;

    public C6898em(Context context) {
        this(context, new HashMap(), new C6908eo(context), C4685h.m23138d());
    }

    C6898em(Context context, Map<String, Object> map, C6908eo c6908eo, AbstractC4682e abstractC4682e) {
        this.f23271e = null;
        this.f23267a = new HashMap();
        this.f23268b = context;
        this.f23270d = abstractC4682e;
        this.f23269c = c6908eo;
        this.f23272f = map;
    }

    /* renamed from: a */
    public void m16015a(String str) {
        this.f23271e = str;
    }
}
