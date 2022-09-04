package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.dy */
/* loaded from: classes2.dex */
public class C6873dy {

    /* renamed from: a */
    private final List<aqd> f23096a;

    /* renamed from: b */
    private final String f23097b;

    /* renamed from: com.google.android.gms.internal.dy$a */
    /* loaded from: classes2.dex */
    public static class C6875a {

        /* renamed from: a */
        private List<aqd> f23098a = new ArrayList();

        /* renamed from: b */
        private String f23099b;

        /* renamed from: a */
        public C6875a m16070a(aqd aqdVar) {
            this.f23098a.add(aqdVar);
            return this;
        }

        /* renamed from: a */
        public C6875a m16069a(String str) {
            this.f23099b = str;
            return this;
        }

        /* renamed from: a */
        public C6873dy m16071a() {
            return new C6873dy(this.f23099b, this.f23098a);
        }
    }

    private C6873dy(String str, List<aqd> list) {
        this.f23097b = str;
        this.f23096a = list;
    }

    /* renamed from: a */
    public List<aqd> m16072a() {
        return this.f23096a;
    }
}
