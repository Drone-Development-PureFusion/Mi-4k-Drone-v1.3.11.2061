package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.BinderC3698q;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.acz;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.zv */
/* loaded from: classes.dex */
public class C8138zv {

    /* renamed from: b */
    private final Context f26569b;

    /* renamed from: c */
    private final C7667ro f26570c;

    /* renamed from: d */
    private final abi.C6129a f26571d;

    /* renamed from: e */
    private final C7801un f26572e;

    /* renamed from: f */
    private final BinderC3698q f26573f;

    /* renamed from: g */
    private ViewTreeObserver.OnGlobalLayoutListener f26574g;

    /* renamed from: h */
    private ViewTreeObserver.OnScrollChangedListener f26575h;

    /* renamed from: a */
    private final Object f26568a = new Object();

    /* renamed from: j */
    private int f26577j = -1;

    /* renamed from: k */
    private int f26578k = -1;

    /* renamed from: i */
    private ach f26576i = new ach(200);

    public C8138zv(Context context, C7667ro c7667ro, abi.C6129a c6129a, C7801un c7801un, BinderC3698q binderC3698q) {
        this.f26569b = context;
        this.f26570c = c7667ro;
        this.f26571d = c6129a;
        this.f26572e = c7801un;
        this.f26573f = binderC3698q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public ViewTreeObserver.OnGlobalLayoutListener m12721a(final WeakReference<acy> weakReference) {
        if (this.f26574g == null) {
            this.f26574g = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.gms.internal.zv.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    C8138zv.this.m12720a((WeakReference<acy>) weakReference, false);
                }
            };
        }
        return this.f26574g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12726a(acy acyVar) {
        acz mo18084l = acyVar.mo18084l();
        mo18084l.m18167a("/video", C7860vs.f25998n);
        mo18084l.m18167a("/videoMeta", C7860vs.f25999o);
        mo18084l.m18167a("/precache", C7860vs.f26000p);
        mo18084l.m18167a("/delayPageLoaded", C7860vs.f26003s);
        mo18084l.m18167a("/instrument", C7860vs.f26001q);
        mo18084l.m18167a("/log", C7860vs.f25993i);
        mo18084l.m18167a("/videoClicked", C7860vs.f25994j);
        mo18084l.m18167a("/trackActiveViewUnit", new AbstractC7877vt() { // from class: com.google.android.gms.internal.zv.2
            @Override // com.google.android.gms.internal.AbstractC7877vt
            /* renamed from: a */
            public void mo12713a(acy acyVar2, Map<String, String> map) {
                C8138zv.this.f26573f.m27069E();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12720a(WeakReference<acy> weakReference, boolean z) {
        acy acyVar;
        if (weakReference == null || (acyVar = weakReference.get()) == null || acyVar.mo18105b() == null) {
            return;
        }
        if (z && !this.f26576i.m18222a()) {
            return;
        }
        int[] iArr = new int[2];
        acyVar.mo18105b().getLocationOnScreen(iArr);
        int m26852b = C3514ac.m27586a().m26852b(this.f26569b, iArr[0]);
        int m26852b2 = C3514ac.m27586a().m26852b(this.f26569b, iArr[1]);
        synchronized (this.f26568a) {
            if (this.f26577j != m26852b || this.f26578k != m26852b2) {
                this.f26577j = m26852b;
                this.f26578k = m26852b2;
                acyVar.mo18084l().m18182a(this.f26577j, this.f26578k, !z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public ViewTreeObserver.OnScrollChangedListener m12716b(final WeakReference<acy> weakReference) {
        if (this.f26575h == null) {
            this.f26575h = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.zv.4
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    C8138zv.this.m12720a((WeakReference<acy>) weakReference, true);
                }
            };
        }
        return this.f26575h;
    }

    /* renamed from: a */
    public aco<acy> m12719a(final JSONObject jSONObject) {
        final acl aclVar = new acl();
        C3779u.m26890e().m18348a(new Runnable() { // from class: com.google.android.gms.internal.zv.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    final acy m12727a = C8138zv.this.m12727a();
                    C8138zv.this.f26573f.m27058a(m12727a);
                    WeakReference weakReference = new WeakReference(m12727a);
                    m12727a.mo18084l().m18179a(C8138zv.this.m12721a(weakReference), C8138zv.this.m12716b(weakReference));
                    C8138zv.this.m12726a(m12727a);
                    m12727a.mo18084l().m18173a(new acz.AbstractC6198b() { // from class: com.google.android.gms.internal.zv.1.1
                        @Override // com.google.android.gms.internal.acz.AbstractC6198b
                        /* renamed from: a */
                        public void mo12715a(acy acyVar) {
                            m12727a.mo13111a("google.afma.nativeAds.renderVideo", jSONObject);
                        }
                    });
                    m12727a.mo18084l().m18174a(new acz.AbstractC6197a() { // from class: com.google.android.gms.internal.zv.1.2
                        @Override // com.google.android.gms.internal.acz.AbstractC6197a
                        /* renamed from: a */
                        public void mo12714a(acy acyVar, boolean z) {
                            C8138zv.this.f26573f.m27066H();
                            aclVar.m18209b((acl) acyVar);
                        }
                    });
                    m12727a.loadUrl(C8123zt.m12777a(C8138zv.this.f26571d, C7788uf.f25805bJ.m13486c()));
                } catch (Exception e) {
                    abr.d("Exception occurred while getting video view", e);
                    aclVar.m18209b((acl) null);
                }
            }
        });
        return aclVar;
    }

    /* renamed from: a */
    acy m12727a() {
        return C3779u.m26889f().m18142a(this.f26569b, AdSizeParcel.m27638a(this.f26569b), false, false, this.f26570c, this.f26571d.f20920a.f14495k, this.f26572e, null, this.f26573f.n());
    }
}
