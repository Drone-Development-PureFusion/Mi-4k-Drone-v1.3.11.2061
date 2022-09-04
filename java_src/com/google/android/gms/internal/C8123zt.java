package com.google.android.gms.internal;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.BinderC3698q;
import com.google.android.gms.internal.C7957wx;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.acr;
import java.util.concurrent.TimeUnit;
@aaa
/* renamed from: com.google.android.gms.internal.zt */
/* loaded from: classes.dex */
public class C8123zt {

    /* renamed from: a */
    private static final long f26510a = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: b */
    private static final Object f26511b = new Object();

    /* renamed from: c */
    private static boolean f26512c = false;

    /* renamed from: d */
    private static C7957wx f26513d = null;

    /* renamed from: e */
    private final Context f26514e;

    /* renamed from: f */
    private final abi.C6129a f26515f;

    /* renamed from: g */
    private final BinderC3698q f26516g;

    /* renamed from: h */
    private final C7667ro f26517h;

    /* renamed from: i */
    private C7946wv f26518i;

    /* renamed from: j */
    private C7957wx.C7979e f26519j;

    /* renamed from: k */
    private AbstractC7944wu f26520k;

    /* renamed from: l */
    private boolean f26521l;

    /* renamed from: com.google.android.gms.internal.zt$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8127a {
        /* renamed from: a */
        public void mo12735a() {
        }

        /* renamed from: a */
        public abstract void mo12734a(AbstractC7980wy abstractC7980wy);
    }

    public C8123zt(Context context, abi.C6129a c6129a, BinderC3698q binderC3698q, C7667ro c7667ro) {
        this.f26521l = false;
        this.f26514e = context;
        this.f26515f = c6129a;
        this.f26516g = binderC3698q;
        this.f26517h = c7667ro;
        this.f26521l = C7788uf.f25806bK.m13486c().booleanValue();
    }

    /* renamed from: a */
    public static String m12777a(abi.C6129a c6129a, String str) {
        String valueOf = String.valueOf(c6129a.f20921b.f14566b.indexOf(UriUtil.HTTPS_SCHEME) == 0 ? "https:" : "http:");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: g */
    private void m12769g() {
        synchronized (f26511b) {
            if (!f26512c) {
                f26513d = new C7957wx(this.f26514e.getApplicationContext() != null ? this.f26514e.getApplicationContext() : this.f26514e, this.f26515f.f20920a.f14495k, m12777a(this.f26515f, C7788uf.f25804bI.m13486c()), new aca<AbstractC7944wu>() { // from class: com.google.android.gms.internal.zt.3
                    @Override // com.google.android.gms.internal.aca
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo12761a(AbstractC7944wu abstractC7944wu) {
                        abstractC7944wu.mo13158a(C8123zt.this.f26516g, C8123zt.this.f26516g, C8123zt.this.f26516g, C8123zt.this.f26516g, false, null, null, null, null);
                    }
                }, new C7957wx.C7969b());
                f26512c = true;
            }
        }
    }

    /* renamed from: h */
    private void m12768h() {
        this.f26519j = new C7957wx.C7979e(m12771e().m13144b(this.f26517h));
    }

    /* renamed from: i */
    private void m12767i() {
        this.f26518i = new C7946wv();
    }

    /* renamed from: j */
    private void m12766j() {
        this.f26520k = m12773c().m13161a(this.f26514e, this.f26515f.f20920a.f14495k, m12777a(this.f26515f, C7788uf.f25804bI.m13486c()), this.f26517h, this.f26516g.n()).get(f26510a, TimeUnit.MILLISECONDS);
        this.f26520k.mo13158a(this.f26516g, this.f26516g, this.f26516g, this.f26516g, false, null, null, null, null);
    }

    /* renamed from: a */
    public void m12778a() {
        if (this.f26521l) {
            m12769g();
        } else {
            m12767i();
        }
    }

    /* renamed from: a */
    public void m12776a(final AbstractC8127a abstractC8127a) {
        if (this.f26521l) {
            C7957wx.C7979e m12770f = m12770f();
            if (m12770f == null) {
                abr.d("SharedJavascriptEngine not initialized");
                return;
            } else {
                m12770f.mo13122a(new acr.AbstractC6193c<AbstractC7980wy>() { // from class: com.google.android.gms.internal.zt.1
                    @Override // com.google.android.gms.internal.acr.AbstractC6193c
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo12764a(AbstractC7980wy abstractC7980wy) {
                        abstractC8127a.mo12734a(abstractC7980wy);
                    }
                }, new acr.AbstractC6191a() { // from class: com.google.android.gms.internal.zt.2
                    @Override // com.google.android.gms.internal.acr.AbstractC6191a
                    /* renamed from: a */
                    public void mo12763a() {
                        abstractC8127a.mo12735a();
                    }
                });
                return;
            }
        }
        AbstractC7944wu m12772d = m12772d();
        if (m12772d == null) {
            abr.d("JavascriptEngine not initialized");
        } else {
            abstractC8127a.mo12734a(m12772d);
        }
    }

    /* renamed from: b */
    public void m12774b() {
        if (this.f26521l) {
            m12768h();
        } else {
            m12766j();
        }
    }

    /* renamed from: c */
    protected C7946wv m12773c() {
        return this.f26518i;
    }

    /* renamed from: d */
    protected AbstractC7944wu m12772d() {
        return this.f26520k;
    }

    /* renamed from: e */
    protected C7957wx m12771e() {
        return f26513d;
    }

    /* renamed from: f */
    protected C7957wx.C7979e m12770f() {
        return this.f26519j;
    }
}
