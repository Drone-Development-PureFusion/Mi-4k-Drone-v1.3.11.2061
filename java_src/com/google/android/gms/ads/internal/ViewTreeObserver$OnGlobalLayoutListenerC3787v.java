package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.p001v4.util.SimpleArrayMap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.client.AbstractC3517af;
import com.google.android.gms.ads.internal.client.AbstractC3520ag;
import com.google.android.gms.ads.internal.client.AbstractC3538am;
import com.google.android.gms.ads.internal.client.AbstractC3544ao;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.purchase.C3696k;
import com.google.android.gms.ads.internal.reward.client.AbstractC3755d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.AbstractC7807ur;
import com.google.android.gms.internal.AbstractC7839vf;
import com.google.android.gms.internal.AbstractC7842vg;
import com.google.android.gms.internal.AbstractC7845vh;
import com.google.android.gms.internal.AbstractC7848vi;
import com.google.android.gms.internal.AbstractC8082yy;
import com.google.android.gms.internal.AbstractC8096zd;
import com.google.android.gms.internal.C7667ro;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abj;
import com.google.android.gms.internal.abo;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abx;
import com.google.android.gms.internal.aby;
import com.google.android.gms.internal.ach;
import com.google.android.gms.internal.ack;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
@aaa
/* renamed from: com.google.android.gms.ads.internal.v */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnGlobalLayoutListenerC3787v implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    @Nullable

    /* renamed from: A */
    List<String> f14748A;
    @Nullable

    /* renamed from: B */
    C3696k f14749B;
    @Nullable

    /* renamed from: C */
    public abo f14750C;
    @Nullable

    /* renamed from: D */
    View f14751D;

    /* renamed from: E */
    public int f14752E;

    /* renamed from: F */
    boolean f14753F;

    /* renamed from: G */
    boolean f14754G;

    /* renamed from: H */
    private HashSet<abj> f14755H;

    /* renamed from: I */
    private int f14756I;

    /* renamed from: J */
    private int f14757J;

    /* renamed from: K */
    private ach f14758K;

    /* renamed from: L */
    private boolean f14759L;

    /* renamed from: M */
    private boolean f14760M;

    /* renamed from: N */
    private boolean f14761N;

    /* renamed from: a */
    final String f14762a;

    /* renamed from: b */
    public String f14763b;

    /* renamed from: c */
    public final Context f14764c;

    /* renamed from: d */
    final C7667ro f14765d;

    /* renamed from: e */
    public final VersionInfoParcel f14766e;
    @Nullable

    /* renamed from: f */
    C3788a f14767f;
    @Nullable

    /* renamed from: g */
    public abq f14768g;
    @Nullable

    /* renamed from: h */
    public abx f14769h;

    /* renamed from: i */
    public AdSizeParcel f14770i;
    @Nullable

    /* renamed from: j */
    public abi f14771j;

    /* renamed from: k */
    public abi.C6129a f14772k;
    @Nullable

    /* renamed from: l */
    public abj f14773l;
    @Nullable

    /* renamed from: m */
    AbstractC3517af f14774m;
    @Nullable

    /* renamed from: n */
    AbstractC3520ag f14775n;
    @Nullable

    /* renamed from: o */
    AbstractC3538am f14776o;
    @Nullable

    /* renamed from: p */
    AbstractC3544ao f14777p;
    @Nullable

    /* renamed from: q */
    AbstractC8082yy f14778q;
    @Nullable

    /* renamed from: r */
    AbstractC8096zd f14779r;
    @Nullable

    /* renamed from: s */
    AbstractC7839vf f14780s;
    @Nullable

    /* renamed from: t */
    AbstractC7842vg f14781t;

    /* renamed from: u */
    SimpleArrayMap<String, AbstractC7845vh> f14782u;

    /* renamed from: v */
    SimpleArrayMap<String, AbstractC7848vi> f14783v;

    /* renamed from: w */
    NativeAdOptionsParcel f14784w;
    @Nullable

    /* renamed from: x */
    VideoOptionsParcel f14785x;
    @Nullable

    /* renamed from: y */
    AbstractC7807ur f14786y;
    @Nullable

    /* renamed from: z */
    AbstractC3755d f14787z;

    /* renamed from: com.google.android.gms.ads.internal.v$a */
    /* loaded from: classes2.dex */
    public static class C3788a extends ViewSwitcher {

        /* renamed from: a */
        private final aby f14788a;
        @Nullable

        /* renamed from: b */
        private final ack f14789b;

        public C3788a(Context context, String str, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
            super(context);
            this.f14788a = new aby(context);
            this.f14788a.m18277a(str);
            if (context instanceof Activity) {
                this.f14789b = new ack((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
            } else {
                this.f14789b = new ack(null, this, onGlobalLayoutListener, onScrollChangedListener);
            }
            this.f14789b.m18218a();
        }

        /* renamed from: a */
        public aby m26821a() {
            return this.f14788a;
        }

        /* renamed from: b */
        public void m26820b() {
            abr.m18409e("Disable position monitoring on adFrame.");
            if (this.f14789b != null) {
                this.f14789b.m18216b();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.f14789b != null) {
                this.f14789b.m18215c();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f14789b != null) {
                this.f14789b.m18214d();
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.f14788a.m18279a(motionEvent);
            return false;
        }

        @Override // android.widget.ViewAnimator, android.view.ViewGroup
        public void removeAllViews() {
            ArrayList<acy> arrayList = new ArrayList();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i2);
                if (childAt != null && (childAt instanceof acy)) {
                    arrayList.add((acy) childAt);
                }
                i = i2 + 1;
            }
            super.removeAllViews();
            for (acy acyVar : arrayList) {
                acyVar.destroy();
            }
        }
    }

    public ViewTreeObserver$OnGlobalLayoutListenerC3787v(Context context, AdSizeParcel adSizeParcel, String str, VersionInfoParcel versionInfoParcel) {
        this(context, adSizeParcel, str, versionInfoParcel, null);
    }

    ViewTreeObserver$OnGlobalLayoutListenerC3787v(Context context, AdSizeParcel adSizeParcel, String str, VersionInfoParcel versionInfoParcel, C7667ro c7667ro) {
        this.f14750C = null;
        this.f14751D = null;
        this.f14752E = 0;
        this.f14753F = false;
        this.f14754G = false;
        this.f14755H = null;
        this.f14756I = -1;
        this.f14757J = -1;
        this.f14759L = true;
        this.f14760M = true;
        this.f14761N = false;
        C7788uf.m13470a(context);
        if (C3779u.m26886i().m18442e() != null) {
            List<String> m13469b = C7788uf.m13469b();
            if (versionInfoParcel.f14734c != 0) {
                m13469b.add(Integer.toString(versionInfoParcel.f14734c));
            }
            C3779u.m26886i().m18442e().m13456a(m13469b);
        }
        this.f14762a = UUID.randomUUID().toString();
        if (adSizeParcel.f13867e || adSizeParcel.f13871i) {
            this.f14767f = null;
        } else {
            this.f14767f = new C3788a(context, str, this, this);
            this.f14767f.setMinimumWidth(adSizeParcel.f13869g);
            this.f14767f.setMinimumHeight(adSizeParcel.f13866d);
            this.f14767f.setVisibility(4);
        }
        this.f14770i = adSizeParcel;
        this.f14763b = str;
        this.f14764c = context;
        this.f14766e = versionInfoParcel;
        this.f14765d = c7667ro == null ? new C7667ro(new RunnableC3624i(this)) : c7667ro;
        this.f14758K = new ach(200L);
        this.f14783v = new SimpleArrayMap<>();
    }

    /* renamed from: b */
    private void m26831b(boolean z) {
        boolean z2 = true;
        if (this.f14767f == null || this.f14771j == null || this.f14771j.f20895b == null || this.f14771j.f20895b.mo18084l() == null) {
            return;
        }
        if (z && !this.f14758K.m18222a()) {
            return;
        }
        if (this.f14771j.f20895b.mo18084l().m18162b()) {
            int[] iArr = new int[2];
            this.f14767f.getLocationOnScreen(iArr);
            int m26852b = C3514ac.m27586a().m26852b(this.f14764c, iArr[0]);
            int m26852b2 = C3514ac.m27586a().m26852b(this.f14764c, iArr[1]);
            if (m26852b != this.f14756I || m26852b2 != this.f14757J) {
                this.f14756I = m26852b;
                this.f14757J = m26852b2;
                acz mo18084l = this.f14771j.f20895b.mo18084l();
                int i = this.f14756I;
                int i2 = this.f14757J;
                if (z) {
                    z2 = false;
                }
                mo18084l.m18182a(i, i2, z2);
            }
        }
        m26822k();
    }

    /* renamed from: k */
    private void m26822k() {
        View findViewById;
        if (this.f14767f == null || (findViewById = this.f14767f.getRootView().findViewById(16908290)) == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        this.f14767f.getGlobalVisibleRect(rect);
        findViewById.getGlobalVisibleRect(rect2);
        if (rect.top != rect2.top) {
            this.f14759L = false;
        }
        if (rect.bottom == rect2.bottom) {
            return;
        }
        this.f14760M = false;
    }

    /* renamed from: a */
    public HashSet<abj> m26835a() {
        return this.f14755H;
    }

    /* renamed from: a */
    public void m26834a(HashSet<abj> hashSet) {
        this.f14755H = hashSet;
    }

    /* renamed from: a */
    public void m26833a(boolean z) {
        if (this.f14752E == 0) {
            m26830c();
        }
        if (this.f14768g != null) {
            this.f14768g.mo12794d();
        }
        if (this.f14769h != null) {
            this.f14769h.mo12794d();
        }
        if (z) {
            this.f14771j = null;
        }
    }

    /* renamed from: b */
    public void m26832b() {
        if (this.f14771j == null || this.f14771j.f20895b == null) {
            return;
        }
        this.f14771j.f20895b.destroy();
    }

    /* renamed from: c */
    public void m26830c() {
        if (this.f14771j == null || this.f14771j.f20895b == null) {
            return;
        }
        this.f14771j.f20895b.stopLoading();
    }

    /* renamed from: d */
    public void m26829d() {
        if (this.f14771j == null || this.f14771j.f20909p == null) {
            return;
        }
        try {
            this.f14771j.f20909p.mo12965c();
        } catch (RemoteException e) {
            abr.d("Could not destroy mediation adapter.");
        }
    }

    /* renamed from: e */
    public boolean m26828e() {
        return this.f14752E == 0;
    }

    /* renamed from: f */
    public boolean m26827f() {
        return this.f14752E == 1;
    }

    /* renamed from: g */
    public void m26826g() {
        if (this.f14767f != null) {
            this.f14767f.m26820b();
        }
    }

    /* renamed from: h */
    public String m26825h() {
        return (!this.f14759L || !this.f14760M) ? this.f14759L ? this.f14761N ? "top-scrollable" : "top-locked" : this.f14760M ? this.f14761N ? "bottom-scrollable" : "bottom-locked" : "" : "";
    }

    /* renamed from: i */
    public void m26824i() {
        if (this.f14773l == null) {
            return;
        }
        if (this.f14771j != null) {
            this.f14773l.m18483a(this.f14771j.f20885A);
            this.f14773l.m18479b(this.f14771j.f20886B);
            this.f14773l.m18478b(this.f14771j.f20907n);
        }
        this.f14773l.m18481a(this.f14770i.f13867e);
    }

    /* renamed from: j */
    public void m26823j() {
        m26826g();
        this.f14775n = null;
        this.f14776o = null;
        this.f14779r = null;
        this.f14778q = null;
        this.f14786y = null;
        this.f14777p = null;
        m26833a(false);
        if (this.f14767f != null) {
            this.f14767f.removeAllViews();
        }
        m26832b();
        m26829d();
        this.f14771j = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m26831b(false);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        m26831b(true);
        this.f14761N = true;
    }
}
