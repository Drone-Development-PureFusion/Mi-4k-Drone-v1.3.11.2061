package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.safebrowsing.AbstractC3771c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC7807ur;
import com.google.android.gms.internal.AbstractC7877vt;
import com.google.android.gms.internal.AbstractC7980wy;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.internal.AbstractC8064yo;
import com.google.android.gms.internal.BinderC7802uo;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.C7801un;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acy;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.ads.internal.c */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3482c extends AbstractBinderC3478b implements AbstractC3623h, AbstractC8064yo {
    public AbstractBinderC3482c(Context context, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, VersionInfoParcel versionInfoParcel, C3588d c3588d) {
        super(context, adSizeParcel, str, abstractC8005xq, versionInfoParcel, c3588d);
    }

    @Override // com.google.android.gms.ads.internal.AbstractC3623h
    /* renamed from: E */
    public void mo27337E() {
        e();
    }

    @Override // com.google.android.gms.ads.internal.AbstractC3623h
    /* renamed from: F */
    public void mo27336F() {
        B();
        h();
    }

    @Override // com.google.android.gms.internal.AbstractC8064yo
    /* renamed from: G */
    public void mo12879G() {
        p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public acy mo27301a(abi.C6129a c6129a, @Nullable C3589e c3589e, @Nullable AbstractC3771c abstractC3771c) {
        acy acyVar = null;
        View nextView = this.f13800f.f14767f.getNextView();
        if (nextView instanceof acy) {
            acyVar = (acy) nextView;
            if (C7788uf.f25777ai.m13486c().booleanValue()) {
                abr.a("Reusing webview...");
                acyVar.mo18119a(this.f13800f.f14764c, this.f13800f.f14770i, this.f13795a);
            } else {
                acyVar.destroy();
                acyVar = null;
            }
        }
        if (acyVar == null) {
            if (nextView != null) {
                this.f13800f.f14767f.removeView(nextView);
            }
            acyVar = C3779u.m26889f().m18142a(this.f13800f.f14764c, this.f13800f.f14770i, false, false, this.f13800f.f14765d, this.f13800f.f14766e, this.f13795a, this, this.f13803i);
            if (this.f13800f.f14770i.f13870h == null) {
                a(acyVar.mo18105b());
            }
        }
        acy acyVar2 = acyVar;
        acyVar2.mo18084l().m18178a(this, this, this, this, false, this, null, c3589e, this, abstractC3771c);
        m27670a(acyVar2);
        acyVar2.mo18101b(c6129a.f20920a.f14507w);
        return acyVar2;
    }

    @Override // com.google.android.gms.internal.AbstractC8064yo
    /* renamed from: a */
    public void mo12878a(int i, int i2, int i3, int i4) {
        r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: a */
    public void mo18575a(final abi.C6129a c6129a, final C7801un c7801un) {
        if (c6129a.f20924e != -2) {
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.c.2
                @Override // java.lang.Runnable
                public void run() {
                    AbstractBinderC3482c.this.b(new abi(c6129a, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        if (c6129a.f20923d != null) {
            this.f13800f.f14770i = c6129a.f20923d;
        }
        if (!c6129a.f20921b.f14572h || c6129a.f20921b.f14551B) {
            final AbstractC3771c mo26925a = this.f13803i.f14062d.mo26925a(this.f13800f.f14764c, c6129a.f20921b);
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.c.3
                @Override // java.lang.Runnable
                public void run() {
                    if (c6129a.f20921b.f14583s && AbstractBinderC3482c.this.f13800f.f14786y != null) {
                        String str = null;
                        if (c6129a.f20921b.f14566b != null) {
                            str = C3779u.m26890e().m18347a(c6129a.f20921b.f14566b);
                        }
                        BinderC7802uo binderC7802uo = new BinderC7802uo(AbstractBinderC3482c.this, str, c6129a.f20921b.f14567c);
                        AbstractBinderC3482c.this.f13800f.f14752E = 1;
                        try {
                            AbstractBinderC3482c.this.f13798d = false;
                            AbstractBinderC3482c.this.f13800f.f14786y.mo13242a(binderC7802uo);
                            return;
                        } catch (RemoteException e) {
                            abr.d("Could not call the onCustomRenderedAdLoadedListener.", e);
                            AbstractBinderC3482c.this.f13798d = true;
                        }
                    }
                    final C3589e c3589e = new C3589e(AbstractBinderC3482c.this.f13800f.f14764c, c6129a);
                    acy mo27301a = AbstractBinderC3482c.this.mo27301a(c6129a, c3589e, mo26925a);
                    mo27301a.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.ads.internal.c.3.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            c3589e.m27404a();
                            return false;
                        }
                    });
                    mo27301a.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.ads.internal.c.3.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            c3589e.m27404a();
                        }
                    });
                    AbstractBinderC3482c.this.f13800f.f14752E = 0;
                    AbstractBinderC3482c.this.f13800f.f14769h = C3779u.m26891d().m12801a(AbstractBinderC3482c.this.f13800f.f14764c, AbstractBinderC3482c.this, c6129a, AbstractBinderC3482c.this.f13800f.f14765d, mo27301a, AbstractBinderC3482c.this.f13807j, AbstractBinderC3482c.this, c7801un);
                }
            });
            return;
        }
        this.f13800f.f14752E = 0;
        this.f13800f.f14769h = C3779u.m26891d().m12801a(this.f13800f.f14764c, this, c6129a, this.f13800f.f14765d, null, this.f13807j, this, c7801un);
    }

    @Override // com.google.android.gms.ads.internal.AbstractBinderC3476a, com.google.android.gms.ads.internal.client.AbstractC3532ak
    /* renamed from: a */
    public void mo13184a(AbstractC7807ur abstractC7807ur) {
        C4588d.m23620b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f13800f.f14786y = abstractC7807ur;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m27670a(AbstractC7980wy abstractC7980wy) {
        abstractC7980wy.mo13113a("/trackActiveViewUnit", new AbstractC7877vt() { // from class: com.google.android.gms.ads.internal.c.1
            @Override // com.google.android.gms.internal.AbstractC7877vt
            /* renamed from: a */
            public void mo12713a(acy acyVar, Map<String, String> map) {
                if (AbstractBinderC3482c.this.f13800f.f14771j != null) {
                    AbstractBinderC3482c.this.f13802h.m13599a(AbstractBinderC3482c.this.f13800f.f14770i, AbstractBinderC3482c.this.f13800f.f14771j, acyVar.mo18105b(), acyVar);
                } else {
                    abr.d("Request to enable ActiveView before adState is available.");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.AbstractBinderC3478b, com.google.android.gms.ads.internal.AbstractBinderC3476a
    /* renamed from: a */
    public boolean mo18574a(@Nullable abi abiVar, abi abiVar2) {
        if (this.f13800f.m26828e() && this.f13800f.f14767f != null) {
            this.f13800f.f14767f.m26821a().m18274b(abiVar2.f20887C);
        }
        return super.mo18574a(abiVar, abiVar2);
    }

    @Override // com.google.android.gms.ads.internal.AbstractC3623h
    /* renamed from: b */
    public void mo27335b(View view) {
        this.f13800f.f14751D = view;
        b(new abi(this.f13800f.f14772k, null, null, null, null, null, null, null));
    }
}
