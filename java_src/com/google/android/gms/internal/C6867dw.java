package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.dw */
/* loaded from: classes2.dex */
public final class C6867dw {

    /* renamed from: a */
    private final Map<String, C6876dz> f23084a;

    /* renamed from: b */
    private final C6876dz f23085b;

    /* renamed from: com.google.android.gms.internal.dw$a */
    /* loaded from: classes2.dex */
    public static class C6869a {

        /* renamed from: a */
        private final Map<String, C6876dz> f23086a = new HashMap();

        /* renamed from: b */
        private C6876dz f23087b;

        /* renamed from: a */
        public C6869a m16083a(C6876dz c6876dz) {
            this.f23087b = c6876dz;
            return this;
        }

        /* renamed from: a */
        public C6869a m16082a(String str, C6876dz c6876dz) {
            this.f23086a.put(str, c6876dz);
            return this;
        }

        /* renamed from: a */
        public C6867dw m16084a() {
            return new C6867dw(this.f23086a, this.f23087b);
        }
    }

    private C6867dw(Map<String, C6876dz> map, C6876dz c6876dz) {
        this.f23084a = Collections.unmodifiableMap(map);
        this.f23085b = c6876dz;
    }

    /* renamed from: a */
    public Map<String, C6876dz> m16085a() {
        return this.f23084a;
    }

    public String toString() {
        String valueOf = String.valueOf(m16085a());
        String valueOf2 = String.valueOf(this.f23085b);
        return new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length()).append("Properties: ").append(valueOf).append(" pushAfterEvaluate: ").append(valueOf2).toString();
    }
}
