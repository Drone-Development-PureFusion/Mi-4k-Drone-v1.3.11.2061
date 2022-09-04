package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.aom;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.common.internal.s */
/* loaded from: classes.dex */
public final class C4626s {

    /* renamed from: a */
    private final Account f17110a;

    /* renamed from: b */
    private final Set<Scope> f17111b;

    /* renamed from: c */
    private final Set<Scope> f17112c;

    /* renamed from: d */
    private final Map<C4467a<?>, C4627a> f17113d;

    /* renamed from: e */
    private final int f17114e;

    /* renamed from: f */
    private final View f17115f;

    /* renamed from: g */
    private final String f17116g;

    /* renamed from: h */
    private final String f17117h;

    /* renamed from: i */
    private final aom f17118i;

    /* renamed from: j */
    private Integer f17119j;

    /* renamed from: com.google.android.gms.common.internal.s$a */
    /* loaded from: classes2.dex */
    public static final class C4627a {

        /* renamed from: a */
        public final Set<Scope> f17120a;

        /* renamed from: b */
        public final boolean f17121b;

        public C4627a(Set<Scope> set, boolean z) {
            C4588d.m23627a(set);
            this.f17120a = Collections.unmodifiableSet(set);
            this.f17121b = z;
        }
    }

    public C4626s(Account account, Set<Scope> set, Map<C4467a<?>, C4627a> map, int i, View view, String str, String str2, aom aomVar) {
        this.f17110a = account;
        this.f17111b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f17113d = map == null ? Collections.EMPTY_MAP : map;
        this.f17115f = view;
        this.f17114e = i;
        this.f17116g = str;
        this.f17117h = str2;
        this.f17118i = aomVar;
        HashSet hashSet = new HashSet(this.f17111b);
        for (C4627a c4627a : this.f17113d.values()) {
            hashSet.addAll(c4627a.f17120a);
        }
        this.f17112c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public static C4626s m23536a(Context context) {
        return new AbstractC4489g.C4490a(context).m23958b();
    }

    @Deprecated
    /* renamed from: a */
    public String m23537a() {
        if (this.f17110a != null) {
            return this.f17110a.name;
        }
        return null;
    }

    /* renamed from: a */
    public Set<Scope> m23535a(C4467a<?> c4467a) {
        C4627a c4627a = this.f17113d.get(c4467a);
        if (c4627a == null || c4627a.f17120a.isEmpty()) {
            return this.f17111b;
        }
        HashSet hashSet = new HashSet(this.f17111b);
        hashSet.addAll(c4627a.f17120a);
        return hashSet;
    }

    /* renamed from: a */
    public void m23534a(Integer num) {
        this.f17119j = num;
    }

    /* renamed from: b */
    public Account m23533b() {
        return this.f17110a;
    }

    /* renamed from: c */
    public Account m23532c() {
        return this.f17110a != null ? this.f17110a : new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public int m23531d() {
        return this.f17114e;
    }

    /* renamed from: e */
    public Set<Scope> m23530e() {
        return this.f17111b;
    }

    /* renamed from: f */
    public Set<Scope> m23529f() {
        return this.f17112c;
    }

    /* renamed from: g */
    public Map<C4467a<?>, C4627a> m23528g() {
        return this.f17113d;
    }

    /* renamed from: h */
    public String m23527h() {
        return this.f17116g;
    }

    /* renamed from: i */
    public String m23526i() {
        return this.f17117h;
    }

    /* renamed from: j */
    public View m23525j() {
        return this.f17115f;
    }

    /* renamed from: k */
    public aom m23524k() {
        return this.f17118i;
    }

    /* renamed from: l */
    public Integer m23523l() {
        return this.f17119j;
    }
}
