package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.p286a.p287a.p290c.p293c.C11044h;
import org.p286a.p287a.p290c.p293c.C11048l;
/* loaded from: classes2.dex */
public class aou implements aoz {

    /* renamed from: a */
    private static aou f22663a;

    /* renamed from: b */
    private static final Object f22664b = new Object();

    /* renamed from: e */
    private static final Set<String> f22665e = new HashSet(Arrays.asList("GET", C11044h.f35585a, "POST", C11048l.f35589a));

    /* renamed from: c */
    private apo f22666c;

    /* renamed from: d */
    private apa f22667d;

    private aou(Context context) {
        this(apb.m16409a(context), new aps());
    }

    aou(apa apaVar, apo apoVar) {
        this.f22667d = apaVar;
        this.f22666c = apoVar;
    }

    /* renamed from: a */
    public static aoz m16435a(Context context) {
        aou aouVar;
        synchronized (f22664b) {
            if (f22663a == null) {
                f22663a = new aou(context);
            }
            aouVar = f22663a;
        }
        return aouVar;
    }

    @Override // com.google.android.gms.internal.aoz
    /* renamed from: a */
    public void mo16413a() {
        apu.m16305b().m16301d();
    }

    @Override // com.google.android.gms.internal.aoz
    /* renamed from: a */
    public boolean mo16412a(String str) {
        return mo16410a(str, null, null, null, null);
    }

    @Override // com.google.android.gms.internal.aoz
    /* renamed from: a */
    public boolean mo16411a(String str, String str2) {
        return mo16410a(str, null, str2, null, null);
    }

    @Override // com.google.android.gms.internal.aoz
    /* renamed from: a */
    public boolean mo16410a(String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable String str4) {
        if (str2 != null && !f22665e.contains(str2)) {
            aph.m16394b(String.format("Unsupport http method %s. Drop the hit.", str2));
            return false;
        } else if (apn.m16354a().m16351b() || this.f22666c.mo16312a()) {
            this.f22667d.mo16404a(str, str2, str3, map, str4);
            return true;
        } else {
            aph.m16394b("Too many hits sent too quickly (rate throttled).");
            return false;
        }
    }
}
