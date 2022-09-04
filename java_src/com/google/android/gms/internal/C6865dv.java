package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.dv */
/* loaded from: classes2.dex */
public class C6865dv {

    /* renamed from: a */
    private final List<C6870dx> f23076a;

    /* renamed from: b */
    private final Map<String, C6867dw> f23077b;

    /* renamed from: c */
    private String f23078c;

    /* renamed from: d */
    private int f23079d;

    /* renamed from: com.google.android.gms.internal.dv$a */
    /* loaded from: classes2.dex */
    public static class C6866a {

        /* renamed from: a */
        private final List<C6870dx> f23080a = new ArrayList();

        /* renamed from: b */
        private final Map<String, C6867dw> f23081b = new HashMap();

        /* renamed from: c */
        private String f23082c = "";

        /* renamed from: d */
        private int f23083d = 0;

        /* renamed from: a */
        public C6866a m16088a(C6867dw c6867dw) {
            this.f23081b.put(c6867dw.m16085a().get("instance_name").toString(), c6867dw);
            return this;
        }

        /* renamed from: a */
        public C6866a m16087a(C6870dx c6870dx) {
            this.f23080a.add(c6870dx);
            return this;
        }

        /* renamed from: a */
        public C6866a m16086a(String str) {
            this.f23082c = str;
            return this;
        }

        /* renamed from: a */
        public C6865dv m16089a() {
            return new C6865dv(this.f23080a, this.f23081b, this.f23082c, 0);
        }
    }

    public C6865dv(List<C6870dx> list, Map<String, C6867dw> map, String str, int i) {
        this.f23076a = Collections.unmodifiableList(list);
        this.f23077b = Collections.unmodifiableMap(map);
        this.f23078c = str;
        this.f23079d = i;
    }

    /* renamed from: a */
    public C6867dw m16091a(String str) {
        return this.f23077b.get(str);
    }

    /* renamed from: a */
    public List<C6870dx> m16092a() {
        return this.f23076a;
    }

    /* renamed from: b */
    public String m16090b() {
        return this.f23078c;
    }

    public String toString() {
        String valueOf = String.valueOf(m16092a());
        String valueOf2 = String.valueOf(this.f23077b);
        return new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length()).append("Rules: ").append(valueOf).append("\n  Macros: ").append(valueOf2).toString();
    }
}
