package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.BinderC3698q;
import com.google.android.gms.ads.internal.formats.AbstractC3603i;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC8017xu;
import com.google.android.gms.internal.AbstractC8020xv;
import com.google.android.gms.internal.C7667ro;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.acy;
import com.google.android.gms.p232c.BinderC4173f;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.ads.internal.formats.h */
/* loaded from: classes.dex */
public class C3602h extends C3605j {
    @Nullable

    /* renamed from: a */
    private AbstractC8017xu f14127a;
    @Nullable

    /* renamed from: b */
    private AbstractC8020xv f14128b;

    /* renamed from: c */
    private final BinderC3698q f14129c;
    @Nullable

    /* renamed from: d */
    private AbstractC3603i f14130d;

    /* renamed from: e */
    private boolean f14131e;

    /* renamed from: f */
    private Object f14132f;

    private C3602h(Context context, BinderC3698q binderC3698q, C7667ro c7667ro, AbstractC3603i.AbstractC3604a abstractC3604a) {
        super(context, binderC3698q, null, c7667ro, null, abstractC3604a, null, null);
        this.f14131e = false;
        this.f14132f = new Object();
        this.f14129c = binderC3698q;
    }

    public C3602h(Context context, BinderC3698q binderC3698q, C7667ro c7667ro, AbstractC8017xu abstractC8017xu, AbstractC3603i.AbstractC3604a abstractC3604a) {
        this(context, binderC3698q, c7667ro, abstractC3604a);
        this.f14127a = abstractC8017xu;
    }

    public C3602h(Context context, BinderC3698q binderC3698q, C7667ro c7667ro, AbstractC8020xv abstractC8020xv, AbstractC3603i.AbstractC3604a abstractC3604a) {
        this(context, binderC3698q, c7667ro, abstractC3604a);
        this.f14128b = abstractC8020xv;
    }

    @Override // com.google.android.gms.ads.internal.formats.C3605j
    @Nullable
    /* renamed from: a */
    public C3596b mo27376a(View.OnClickListener onClickListener) {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.formats.C3605j, com.google.android.gms.ads.internal.formats.AbstractC3603i
    /* renamed from: a */
    public void mo27378a() {
        C4588d.m23620b("recordImpression must be called on the main UI thread.");
        synchronized (this.f14132f) {
            a(true);
            if (this.f14130d != null) {
                this.f14130d.mo27378a();
                this.f14129c.B();
            } else {
                try {
                    if (this.f14127a != null && !this.f14127a.mo13004j()) {
                        this.f14127a.mo13005i();
                        this.f14129c.B();
                    } else if (this.f14128b != null && !this.f14128b.mo12990h()) {
                        this.f14128b.mo12991g();
                        this.f14129c.B();
                    }
                } catch (RemoteException e) {
                    abr.d("Failed to call recordImpression", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.formats.C3605j, com.google.android.gms.ads.internal.formats.AbstractC3603i
    /* renamed from: a */
    public void mo27372a(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f14132f) {
            try {
                if (this.f14127a != null) {
                    this.f14127a.mo13011c(BinderC4173f.m25293a(view));
                } else if (this.f14128b != null) {
                    this.f14128b.mo12995c(BinderC4173f.m25293a(view));
                }
            } catch (RemoteException e) {
                abr.d("Failed to call untrackView", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.formats.C3605j
    /* renamed from: a */
    public void mo27371a(View view, Map<String, WeakReference<View>> map, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        synchronized (this.f14132f) {
            this.f14131e = true;
            try {
                if (this.f14127a != null) {
                    this.f14127a.mo13013b(BinderC4173f.m25293a(view));
                } else if (this.f14128b != null) {
                    this.f14128b.mo12997b(BinderC4173f.m25293a(view));
                }
            } catch (RemoteException e) {
                abr.d("Failed to call prepareAd", e);
            }
            this.f14131e = false;
        }
    }

    @Override // com.google.android.gms.ads.internal.formats.C3605j, com.google.android.gms.ads.internal.formats.AbstractC3603i
    /* renamed from: a */
    public void mo27370a(View view, Map<String, WeakReference<View>> map, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C4588d.m23620b("performClick must be called on the main UI thread.");
        synchronized (this.f14132f) {
            if (this.f14130d != null) {
                this.f14130d.mo27370a(view, map, jSONObject, jSONObject2, jSONObject3);
                this.f14129c.e();
            } else {
                try {
                    if (this.f14127a != null && !this.f14127a.mo13003k()) {
                        this.f14127a.mo13015a(BinderC4173f.m25293a(view));
                        this.f14129c.e();
                    }
                    if (this.f14128b != null && !this.f14128b.mo12989i()) {
                        this.f14128b.mo12999a(BinderC4173f.m25293a(view));
                        this.f14129c.e();
                    }
                } catch (RemoteException e) {
                    abr.d("Failed to call performClick", e);
                }
            }
        }
    }

    /* renamed from: a */
    public void m27384a(@Nullable AbstractC3603i abstractC3603i) {
        synchronized (this.f14132f) {
            this.f14130d = abstractC3603i;
        }
    }

    /* renamed from: b */
    public boolean m27383b() {
        boolean z;
        synchronized (this.f14132f) {
            z = this.f14131e;
        }
        return z;
    }

    /* renamed from: c */
    public AbstractC3603i m27382c() {
        AbstractC3603i abstractC3603i;
        synchronized (this.f14132f) {
            abstractC3603i = this.f14130d;
        }
        return abstractC3603i;
    }

    @Override // com.google.android.gms.ads.internal.formats.C3605j
    @Nullable
    /* renamed from: d */
    public acy mo27363d() {
        return null;
    }
}
