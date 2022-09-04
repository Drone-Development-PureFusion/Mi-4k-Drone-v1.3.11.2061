package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.C3632n;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.internal.AbstractC8109zm;
import com.google.android.gms.internal.C8113zn;
import com.google.android.gms.internal.abi;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
@aaa
/* renamed from: com.google.android.gms.internal.zr */
/* loaded from: classes.dex */
public class C8119zr extends AbstractC8109zm {

    /* renamed from: g */
    AbstractC7988xf f26493g;

    /* renamed from: h */
    protected C7996xl f26494h;

    /* renamed from: i */
    private AbstractC8005xq f26495i;

    /* renamed from: j */
    private C7990xh f26496j;

    /* renamed from: k */
    private final C7801un f26497k;

    /* renamed from: l */
    private final acy f26498l;

    /* renamed from: m */
    private boolean f26499m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8119zr(Context context, abi.C6129a c6129a, AbstractC8005xq abstractC8005xq, C8113zn.AbstractC8114a abstractC8114a, C7801un c7801un, acy acyVar) {
        super(context, c6129a, abstractC8114a);
        this.f26495i = abstractC8005xq;
        this.f26496j = c6129a.f20922c;
        this.f26497k = c7801un;
        this.f26498l = acyVar;
    }

    /* renamed from: a */
    private static String m12789a(C7996xl c7996xl) {
        String str = c7996xl.f26272b.f26219d;
        int m12785b = m12785b(c7996xl.f26271a);
        return new StringBuilder(String.valueOf(str).length() + 33).append(str).append(".").append(m12785b).append(".").append(c7996xl.f26277g).toString();
    }

    /* renamed from: a */
    private static String m12786a(List<C7996xl> list) {
        if (list == null) {
            return "".toString();
        }
        String str = "";
        for (C7996xl c7996xl : list) {
            if (c7996xl != null && c7996xl.f26272b != null && !TextUtils.isEmpty(c7996xl.f26272b.f26219d)) {
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(m12789a(c7996xl));
                str = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).append("_").toString();
            }
        }
        return str.substring(0, Math.max(0, str.length() - 1));
    }

    /* renamed from: b */
    private static int m12785b(int i) {
        switch (i) {
            case -1:
                return 4;
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
            default:
                return 6;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
        }
    }

    /* renamed from: c */
    private void m12783c() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.zr.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (C8119zr.this.f26478d) {
                    C8119zr.this.f26499m = C3632n.m27286a(C8119zr.this.f26498l, C8119zr.this.f26494h, countDownLatch);
                }
            }
        });
        try {
            countDownLatch.await(10L, TimeUnit.SECONDS);
            synchronized (this.f26478d) {
                if (!this.f26499m) {
                    throw new AbstractC8109zm.C8112a("View could not be prepared", 0);
                }
                if (this.f26498l.mo18078r()) {
                    throw new AbstractC8109zm.C8112a("Assets not loaded, web view is destroyed", 0);
                }
            }
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(e);
            throw new AbstractC8109zm.C8112a(new StringBuilder(String.valueOf(valueOf).length() + 38).append("Interrupted while waiting for latch : ").append(valueOf).toString(), 0);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8109zm
    /* renamed from: a */
    protected abi mo12791a(int i) {
        AdRequestInfoParcel adRequestInfoParcel = this.f26479e.f20920a;
        return new abi(adRequestInfoParcel.f14487c, this.f26498l, this.f26480f.f14568d, i, this.f26480f.f14570f, this.f26480f.f14574j, this.f26480f.f14576l, this.f26480f.f14575k, adRequestInfoParcel.f14493i, this.f26480f.f14572h, this.f26494h != null ? this.f26494h.f26272b : null, this.f26494h != null ? this.f26494h.f26273c : null, this.f26494h != null ? this.f26494h.f26274d : AdMobAdapter.class.getName(), this.f26496j, this.f26494h != null ? this.f26494h.f26275e : null, this.f26480f.f14573i, this.f26479e.f20923d, this.f26480f.f14571g, this.f26479e.f20925f, this.f26480f.f14578n, this.f26480f.f14579o, this.f26479e.f20927h, null, this.f26480f.f14552C, this.f26480f.f14553D, this.f26480f.f14554E, this.f26496j != null ? this.f26496j.f26245n : false, this.f26480f.f14556G, this.f26493g != null ? m12786a(this.f26493g.mo13058b()) : null, this.f26480f.f14559J, this.f26480f.f14563N);
    }

    @Override // com.google.android.gms.internal.AbstractC8109zm
    /* renamed from: a */
    protected void mo12790a(long j) {
        Bundle bundle;
        synchronized (this.f26478d) {
            this.f26493g = m12784b(j);
        }
        ArrayList arrayList = new ArrayList(this.f26496j.f26232a);
        Bundle bundle2 = this.f26479e.f20920a.f14487c.f13857m;
        if ((bundle2 == null || (bundle = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter")) == null) ? false : bundle.getBoolean("_skipMediation")) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (!((C7989xg) listIterator.next()).f26218c.contains("com.google.ads.mediation.admob.AdMobAdapter")) {
                    listIterator.remove();
                }
            }
        }
        this.f26494h = this.f26493g.mo13059a(arrayList);
        switch (this.f26494h.f26271a) {
            case 0:
                if (this.f26494h.f26272b == null || this.f26494h.f26272b.f26227l == null) {
                    return;
                }
                m12783c();
                return;
            case 1:
                throw new AbstractC8109zm.C8112a("No fill from any mediation ad networks.", 3);
            default:
                throw new AbstractC8109zm.C8112a(new StringBuilder(40).append("Unexpected mediation result: ").append(this.f26494h.f26271a).toString(), 0);
        }
    }

    /* renamed from: b */
    AbstractC7988xf m12784b(long j) {
        return this.f26496j.f26243l != -1 ? new C7999xn(this.f26476b, this.f26479e.f20920a, this.f26495i, this.f26496j, this.f26480f.f14584t, this.f26480f.f14551B, j, C7788uf.f25767aY.m13486c().longValue(), 2) : new C8002xo(this.f26476b, this.f26479e.f20920a, this.f26495i, this.f26496j, this.f26480f.f14584t, this.f26480f.f14551B, j, C7788uf.f25767aY.m13486c().longValue(), this.f26497k);
    }

    @Override // com.google.android.gms.internal.AbstractC8109zm, com.google.android.gms.internal.abq
    /* renamed from: b */
    public void mo12779b() {
        synchronized (this.f26478d) {
            super.mo12779b();
            if (this.f26493g != null) {
                this.f26493g.mo13060a();
            }
        }
    }
}
