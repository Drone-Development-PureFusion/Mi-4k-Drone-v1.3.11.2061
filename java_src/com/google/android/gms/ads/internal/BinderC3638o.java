package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AbstractC3547ap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.aby;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.ads.internal.o */
/* loaded from: classes.dex */
public class BinderC3638o extends AbstractC3547ap.AbstractBinderC3548a {

    /* renamed from: b */
    private static final Object f14236b = new Object();
    @Nullable

    /* renamed from: c */
    private static BinderC3638o f14237c;

    /* renamed from: a */
    private final Context f14238a;

    /* renamed from: f */
    private boolean f14241f;

    /* renamed from: h */
    private VersionInfoParcel f14243h;

    /* renamed from: d */
    private final Object f14239d = new Object();

    /* renamed from: g */
    private float f14242g = -1.0f;

    /* renamed from: e */
    private boolean f14240e = false;

    BinderC3638o(Context context, VersionInfoParcel versionInfoParcel) {
        this.f14238a = context;
        this.f14243h = versionInfoParcel;
    }

    /* renamed from: a */
    public static BinderC3638o m27269a(Context context, VersionInfoParcel versionInfoParcel) {
        BinderC3638o binderC3638o;
        synchronized (f14236b) {
            if (f14237c == null) {
                f14237c = new BinderC3638o(context.getApplicationContext(), versionInfoParcel);
            }
            binderC3638o = f14237c;
        }
        return binderC3638o;
    }

    @Nullable
    /* renamed from: b */
    public static BinderC3638o m27265b() {
        BinderC3638o binderC3638o;
        synchronized (f14236b) {
            binderC3638o = f14237c;
        }
        return binderC3638o;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3547ap
    /* renamed from: a */
    public void mo27271a() {
        synchronized (f14236b) {
            if (this.f14240e) {
                abr.d("Mobile ads is initialized already.");
                return;
            }
            this.f14240e = true;
            C3779u.m26886i().m18460a(this.f14238a, this.f14243h);
            C3779u.m26885j().m27663a(this.f14238a);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3547ap
    /* renamed from: a */
    public void mo27270a(float f) {
        synchronized (this.f14239d) {
            this.f14242g = f;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3547ap
    /* renamed from: a */
    public void mo27268a(AbstractC4170e abstractC4170e, String str) {
        aby m27264b = m27264b(abstractC4170e, str);
        if (m27264b == null) {
            abr.b("Context is null. Failed to open debug menu.");
        } else {
            m27264b.m18281a();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3547ap
    /* renamed from: a */
    public void mo27267a(String str) {
        C7788uf.m13470a(this.f14238a);
        if (TextUtils.isEmpty(str) || !C7788uf.f25863cd.m13486c().booleanValue()) {
            return;
        }
        C3779u.m26899A().m27342a(this.f14238a, this.f14243h, true, null, str, null);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3547ap
    /* renamed from: a */
    public void mo27266a(boolean z) {
        synchronized (this.f14239d) {
            this.f14241f = z;
        }
    }

    @Nullable
    /* renamed from: b */
    protected aby m27264b(AbstractC4170e abstractC4170e, String str) {
        Context context;
        if (abstractC4170e != null && (context = (Context) BinderC4173f.m25294a(abstractC4170e)) != null) {
            aby abyVar = new aby(context);
            abyVar.m18277a(str);
            return abyVar;
        }
        return null;
    }

    /* renamed from: c */
    public float m27263c() {
        float f;
        synchronized (this.f14239d) {
            f = this.f14242g;
        }
        return f;
    }

    /* renamed from: d */
    public boolean m27262d() {
        boolean z;
        synchronized (this.f14239d) {
            z = this.f14242g >= 0.0f;
        }
        return z;
    }

    /* renamed from: e */
    public boolean m27261e() {
        boolean z;
        synchronized (this.f14239d) {
            z = this.f14241f;
        }
        return z;
    }
}
