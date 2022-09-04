package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.p242b.C5667z;
import com.google.android.gms.games.multiplayer.C5938a;
/* renamed from: com.google.android.gms.games.multiplayer.turnbased.a */
/* loaded from: classes.dex */
public final class C5963a {

    /* renamed from: a */
    private final C5938a f20265a;

    /* renamed from: b */
    private final C5965c f20266b;

    /* renamed from: c */
    private final C5965c f20267c;

    /* renamed from: d */
    private final C5965c f20268d;

    public C5963a(Bundle bundle) {
        DataHolder m19323a = m19323a(bundle, 0);
        if (m19323a != null) {
            this.f20265a = new C5938a(m19323a);
        } else {
            this.f20265a = null;
        }
        DataHolder m19323a2 = m19323a(bundle, 1);
        if (m19323a2 != null) {
            this.f20266b = new C5965c(m19323a2);
        } else {
            this.f20266b = null;
        }
        DataHolder m19323a3 = m19323a(bundle, 2);
        if (m19323a3 != null) {
            this.f20267c = new C5965c(m19323a3);
        } else {
            this.f20267c = null;
        }
        DataHolder m19323a4 = m19323a(bundle, 3);
        if (m19323a4 != null) {
            this.f20268d = new C5965c(m19323a4);
        } else {
            this.f20268d = null;
        }
    }

    /* renamed from: a */
    private static DataHolder m19323a(Bundle bundle, int i) {
        String m20223a = C5667z.m20223a(i);
        if (!bundle.containsKey(m20223a)) {
            return null;
        }
        return (DataHolder) bundle.getParcelable(m20223a);
    }

    /* renamed from: a */
    public C5938a m19324a() {
        return this.f20265a;
    }

    /* renamed from: b */
    public C5965c m19322b() {
        return this.f20266b;
    }

    /* renamed from: c */
    public C5965c m19321c() {
        return this.f20267c;
    }

    /* renamed from: d */
    public C5965c m19320d() {
        return this.f20268d;
    }

    @Deprecated
    /* renamed from: e */
    public void m19319e() {
        m19318f();
    }

    /* renamed from: f */
    public void m19318f() {
        if (this.f20265a != null) {
            this.f20265a.b();
        }
        if (this.f20266b != null) {
            this.f20266b.b();
        }
        if (this.f20267c != null) {
            this.f20267c.b();
        }
        if (this.f20268d != null) {
            this.f20268d.b();
        }
    }

    /* renamed from: g */
    public boolean m19317g() {
        if (this.f20265a == null || this.f20265a.c() <= 0) {
            if (this.f20266b != null && this.f20266b.c() > 0) {
                return true;
            }
            if (this.f20267c != null && this.f20267c.c() > 0) {
                return true;
            }
            return this.f20268d != null && this.f20268d.c() > 0;
        }
        return true;
    }
}
