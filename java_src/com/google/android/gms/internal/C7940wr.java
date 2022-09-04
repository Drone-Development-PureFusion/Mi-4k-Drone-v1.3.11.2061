package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.BinderC3628l;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.C4588d;
import java.util.Iterator;
import java.util.LinkedList;
/* JADX INFO: Access modifiers changed from: package-private */
@aaa
/* renamed from: com.google.android.gms.internal.wr */
/* loaded from: classes.dex */
public class C7940wr {

    /* renamed from: a */
    private final LinkedList<C7941a> f26115a = new LinkedList<>();

    /* renamed from: b */
    private AdRequestParcel f26116b;

    /* renamed from: c */
    private final String f26117c;

    /* renamed from: d */
    private final int f26118d;

    /* renamed from: e */
    private boolean f26119e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.wr$a */
    /* loaded from: classes2.dex */
    public class C7941a {

        /* renamed from: a */
        BinderC3628l f26120a;
        @Nullable

        /* renamed from: b */
        AdRequestParcel f26121b;

        /* renamed from: c */
        C7911wn f26122c;

        /* renamed from: d */
        long f26123d;

        /* renamed from: e */
        boolean f26124e;

        /* renamed from: f */
        boolean f26125f;

        C7941a(C7910wm c7910wm) {
            this.f26120a = c7910wm.m13247b(C7940wr.this.f26117c);
            this.f26122c = new C7911wn();
            this.f26122c.m13246a(this.f26120a);
        }

        C7941a(C7940wr c7940wr, C7910wm c7910wm, AdRequestParcel adRequestParcel) {
            this(c7910wm);
            this.f26121b = adRequestParcel;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m13194a() {
            if (this.f26124e) {
                return;
            }
            this.f26125f = this.f26120a.a(C7938wp.m13218b(this.f26121b != null ? this.f26121b : C7940wr.this.f26116b));
            this.f26124e = true;
            this.f26123d = C3779u.m26884k().mo16434a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7940wr(AdRequestParcel adRequestParcel, String str, int i) {
        C4588d.m23627a(adRequestParcel);
        C4588d.m23627a(str);
        this.f26116b = adRequestParcel;
        this.f26117c = str;
        this.f26118d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AdRequestParcel m13207a() {
        return this.f26116b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C7941a m13206a(@Nullable AdRequestParcel adRequestParcel) {
        if (adRequestParcel != null) {
            this.f26116b = adRequestParcel;
        }
        return this.f26115a.remove();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13205a(C7910wm c7910wm) {
        C7941a c7941a = new C7941a(c7910wm);
        this.f26115a.add(c7941a);
        c7941a.m13194a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13204a(C7910wm c7910wm, AdRequestParcel adRequestParcel) {
        this.f26115a.add(new C7941a(this, c7910wm, adRequestParcel));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m13202b() {
        return this.f26118d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m13200c() {
        return this.f26117c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m13199d() {
        return this.f26115a.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m13198e() {
        int i = 0;
        Iterator<C7941a> it2 = this.f26115a.iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                i = it2.next().f26124e ? i2 + 1 : i2;
            } else {
                return i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m13197f() {
        Iterator<C7941a> it2 = this.f26115a.iterator();
        while (it2.hasNext()) {
            it2.next().m13194a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m13196g() {
        this.f26119e = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m13195h() {
        return this.f26119e;
    }
}
