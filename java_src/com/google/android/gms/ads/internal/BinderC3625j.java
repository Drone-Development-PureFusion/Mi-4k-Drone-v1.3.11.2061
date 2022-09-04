package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.p001v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.AbstractC3520ag;
import com.google.android.gms.ads.internal.client.AbstractC3523ah;
import com.google.android.gms.ads.internal.client.AbstractC3544ao;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.AbstractC7839vf;
import com.google.android.gms.internal.AbstractC7842vg;
import com.google.android.gms.internal.AbstractC7845vh;
import com.google.android.gms.internal.AbstractC7848vi;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.ads.internal.j */
/* loaded from: classes.dex */
public class BinderC3625j extends AbstractC3523ah.AbstractBinderC3524a {

    /* renamed from: a */
    private final Context f14188a;

    /* renamed from: b */
    private final AbstractC3520ag f14189b;

    /* renamed from: c */
    private final AbstractC8005xq f14190c;
    @Nullable

    /* renamed from: d */
    private final AbstractC7839vf f14191d;
    @Nullable

    /* renamed from: e */
    private final AbstractC7842vg f14192e;

    /* renamed from: f */
    private final SimpleArrayMap<String, AbstractC7848vi> f14193f;

    /* renamed from: g */
    private final SimpleArrayMap<String, AbstractC7845vh> f14194g;

    /* renamed from: h */
    private final NativeAdOptionsParcel f14195h;

    /* renamed from: j */
    private final AbstractC3544ao f14197j;

    /* renamed from: k */
    private final String f14198k;

    /* renamed from: l */
    private final VersionInfoParcel f14199l;
    @Nullable

    /* renamed from: m */
    private WeakReference<BinderC3698q> f14200m;

    /* renamed from: n */
    private final C3588d f14201n;

    /* renamed from: o */
    private final Object f14202o = new Object();

    /* renamed from: i */
    private final List<String> f14196i = m27320d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC3625j(Context context, String str, AbstractC8005xq abstractC8005xq, VersionInfoParcel versionInfoParcel, AbstractC3520ag abstractC3520ag, AbstractC7839vf abstractC7839vf, AbstractC7842vg abstractC7842vg, SimpleArrayMap<String, AbstractC7848vi> simpleArrayMap, SimpleArrayMap<String, AbstractC7845vh> simpleArrayMap2, NativeAdOptionsParcel nativeAdOptionsParcel, AbstractC3544ao abstractC3544ao, C3588d c3588d) {
        this.f14188a = context;
        this.f14198k = str;
        this.f14190c = abstractC8005xq;
        this.f14199l = versionInfoParcel;
        this.f14189b = abstractC3520ag;
        this.f14192e = abstractC7842vg;
        this.f14191d = abstractC7839vf;
        this.f14193f = simpleArrayMap;
        this.f14194g = simpleArrayMap2;
        this.f14195h = nativeAdOptionsParcel;
        this.f14197j = abstractC3544ao;
        this.f14201n = c3588d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public List<String> m27320d() {
        ArrayList arrayList = new ArrayList();
        if (this.f14192e != null) {
            arrayList.add("1");
        }
        if (this.f14191d != null) {
            arrayList.add("2");
        }
        if (this.f14193f.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3523ah
    /* renamed from: a */
    public void mo27328a(final AdRequestParcel adRequestParcel) {
        m27325a(new Runnable() { // from class: com.google.android.gms.ads.internal.j.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (BinderC3625j.this.f14202o) {
                    BinderC3698q m27322c = BinderC3625j.this.m27322c();
                    BinderC3625j.this.f14200m = new WeakReference(m27322c);
                    m27322c.m27057a(BinderC3625j.this.f14191d);
                    m27322c.m27056a(BinderC3625j.this.f14192e);
                    m27322c.m27065a(BinderC3625j.this.f14193f);
                    m27322c.a(BinderC3625j.this.f14189b);
                    m27322c.m27052b(BinderC3625j.this.f14194g);
                    m27322c.m27053a(BinderC3625j.this.m27320d());
                    m27322c.m27064a(BinderC3625j.this.f14195h);
                    m27322c.a(BinderC3625j.this.f14197j);
                    m27322c.a(adRequestParcel);
                }
            }
        });
    }

    /* renamed from: a */
    protected void m27325a(Runnable runnable) {
        abv.f21039a.post(runnable);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3523ah
    /* renamed from: a */
    public boolean mo27329a() {
        synchronized (this.f14202o) {
            if (this.f14200m != null) {
                BinderC3698q binderC3698q = this.f14200m.get();
                return binderC3698q != null ? binderC3698q.k() : false;
            }
            return false;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3523ah
    @Nullable
    /* renamed from: b */
    public String mo27324b() {
        synchronized (this.f14202o) {
            if (this.f14200m != null) {
                BinderC3698q binderC3698q = this.f14200m.get();
                return binderC3698q != null ? binderC3698q.j() : null;
            }
            return null;
        }
    }

    /* renamed from: c */
    protected BinderC3698q m27322c() {
        return new BinderC3698q(this.f14188a, this.f14201n, AdSizeParcel.m27638a(this.f14188a), this.f14198k, this.f14190c, this.f14199l);
    }
}
