package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.games.internal.p242b.C5660s;
import java.util.HashMap;
import java.util.Set;
/* renamed from: com.google.android.gms.games.internal.request.b */
/* loaded from: classes2.dex */
public final class C5929b {

    /* renamed from: a */
    private static final String[] f20134a = {"requestId", "outcome"};

    /* renamed from: b */
    private final int f20135b;

    /* renamed from: c */
    private final HashMap<String, Integer> f20136c;

    /* renamed from: com.google.android.gms.games.internal.request.b$a */
    /* loaded from: classes2.dex */
    public static final class C5931a {

        /* renamed from: a */
        private HashMap<String, Integer> f20137a = new HashMap<>();

        /* renamed from: b */
        private int f20138b = 0;

        /* renamed from: a */
        public C5931a m19516a(int i) {
            this.f20138b = i;
            return this;
        }

        /* renamed from: a */
        public C5931a m19515a(String str, int i) {
            if (C5660s.m20225a(i)) {
                this.f20137a.put(str, Integer.valueOf(i));
            }
            return this;
        }

        /* renamed from: a */
        public C5929b m19517a() {
            return new C5929b(this.f20138b, this.f20137a);
        }
    }

    private C5929b(int i, HashMap<String, Integer> hashMap) {
        this.f20135b = i;
        this.f20136c = hashMap;
    }

    /* renamed from: a */
    public static C5929b m19519a(DataHolder dataHolder) {
        C5931a c5931a = new C5931a();
        c5931a.m19516a(dataHolder.m23883e());
        int m23879g = dataHolder.m23879g();
        for (int i = 0; i < m23879g; i++) {
            int m23898a = dataHolder.m23898a(i);
            c5931a.m19515a(dataHolder.m23886c("requestId", i, m23898a), dataHolder.m23888b("outcome", i, m23898a));
        }
        return c5931a.m19517a();
    }

    /* renamed from: a */
    public int m19518a(String str) {
        C4588d.m23618b(this.f20136c.containsKey(str), new StringBuilder(String.valueOf(str).length() + 46).append("Request ").append(str).append(" was not part of the update operation!").toString());
        return this.f20136c.get(str).intValue();
    }

    /* renamed from: a */
    public Set<String> m19520a() {
        return this.f20136c.keySet();
    }
}
