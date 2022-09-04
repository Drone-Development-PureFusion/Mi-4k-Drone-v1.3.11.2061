package com.google.android.gms.internal;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.ns */
/* loaded from: classes2.dex */
public final class C7466ns {

    /* renamed from: a */
    private C7513ot f24942a = C7513ot.f24999a;

    /* renamed from: b */
    private EnumC7482oh f24943b = EnumC7482oh.DEFAULT;

    /* renamed from: c */
    private AbstractC7458nq f24944c = EnumC7451no.IDENTITY;

    /* renamed from: d */
    private final Map<Type, AbstractC7467nt<?>> f24945d = new HashMap();

    /* renamed from: e */
    private final List<AbstractC7489ok> f24946e = new ArrayList();

    /* renamed from: f */
    private final List<AbstractC7489ok> f24947f = new ArrayList();

    /* renamed from: g */
    private int f24948g = 2;

    /* renamed from: h */
    private int f24949h = 2;

    /* renamed from: i */
    private boolean f24950i = true;

    /* renamed from: a */
    private void m14381a(String str, int i, int i2, List<AbstractC7489ok> list) {
        C7448nl c7448nl;
        if (str != null && !"".equals(str.trim())) {
            c7448nl = new C7448nl(str);
        } else if (i == 2 || i2 == 2) {
            return;
        } else {
            c7448nl = new C7448nl(i, i2);
        }
        list.add(C7485oi.m14338a(C7597po.m14167b(Date.class), c7448nl));
        list.add(C7485oi.m14338a(C7597po.m14167b(Timestamp.class), c7448nl));
        list.add(C7485oi.m14338a(C7597po.m14167b(java.sql.Date.class), c7448nl));
    }

    /* renamed from: a */
    public C7466ns m14382a() {
        this.f24950i = false;
        return this;
    }

    /* renamed from: a */
    public C7466ns m14380a(Type type, Object obj) {
        C7494op.m14329a((obj instanceof AbstractC7480of) || (obj instanceof AbstractC7470nw) || (obj instanceof AbstractC7467nt) || (obj instanceof AbstractC7488oj));
        if (obj instanceof AbstractC7467nt) {
            this.f24945d.put(type, (AbstractC7467nt) obj);
        }
        if ((obj instanceof AbstractC7480of) || (obj instanceof AbstractC7470nw)) {
            this.f24946e.add(C7485oi.m14337b(C7597po.m14169a(type), obj));
        }
        if (obj instanceof AbstractC7488oj) {
            this.f24946e.add(C7562pn.m14231a(C7597po.m14169a(type), (AbstractC7488oj) obj));
        }
        return this;
    }

    /* renamed from: a */
    public C7466ns m14379a(int... iArr) {
        this.f24942a = this.f24942a.m14294a(iArr);
        return this;
    }

    /* renamed from: a */
    public C7466ns m14378a(AbstractC7449nm... abstractC7449nmArr) {
        for (AbstractC7449nm abstractC7449nm : abstractC7449nmArr) {
            this.f24942a = this.f24942a.m14301a(abstractC7449nm, true, true);
        }
        return this;
    }

    /* renamed from: b */
    public C7459nr m14377b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f24946e);
        Collections.reverse(arrayList);
        arrayList.addAll(this.f24947f);
        m14381a(null, this.f24948g, this.f24949h, arrayList);
        return new C7459nr(this.f24942a, this.f24944c, this.f24945d, false, false, false, this.f24950i, false, false, this.f24943b, arrayList);
    }
}
