package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.ads.p225a.C3433a;
import com.google.android.gms.internal.AbstractC7723tc;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import com.tencent.p263mm.sdk.platformtools.LocaleUtil;
/* renamed from: com.google.android.gms.internal.ta */
/* loaded from: classes2.dex */
public final class BinderC7721ta extends AbstractC7723tc.AbstractBinderC7724a {

    /* renamed from: a */
    private final C7666rn f25572a;

    /* renamed from: b */
    private final C7667ro f25573b;

    /* renamed from: c */
    private final C7636qs f25574c;

    /* renamed from: d */
    private boolean f25575d = false;

    public BinderC7721ta(String str, Context context, boolean z) {
        this.f25572a = C7666rn.m13795a(str, context, z);
        this.f25573b = new C7667ro(this.f25572a);
        this.f25574c = z ? null : C7636qs.m14020c(context);
    }

    /* renamed from: a */
    private AbstractC4170e m13656a(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2, boolean z) {
        try {
            Uri uri = (Uri) BinderC4173f.m25294a(abstractC4170e);
            Context context = (Context) BinderC4173f.m25294a(abstractC4170e2);
            return BinderC4173f.m25293a(z ? this.f25573b.m13791a(uri, context) : this.f25573b.m13783b(uri, context));
        } catch (C7668rp e) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7723tc
    /* renamed from: a */
    public AbstractC4170e mo13649a(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2) {
        return m13656a(abstractC4170e, abstractC4170e2, true);
    }

    @Override // com.google.android.gms.internal.AbstractC7723tc
    /* renamed from: a */
    public String mo13651a() {
        return LocaleUtil.MALAY;
    }

    @Override // com.google.android.gms.internal.AbstractC7723tc
    /* renamed from: a */
    public String mo13648a(AbstractC4170e abstractC4170e, String str) {
        return this.f25572a.a((Context) BinderC4173f.m25294a(abstractC4170e), str);
    }

    @Override // com.google.android.gms.internal.AbstractC7723tc
    /* renamed from: a */
    public void mo13647a(String str) {
        this.f25573b.m13786a(str);
    }

    @Override // com.google.android.gms.internal.AbstractC7723tc
    /* renamed from: a */
    public void mo13646a(String str, String str2) {
        this.f25573b.m13785a(str, str2);
    }

    @Override // com.google.android.gms.internal.AbstractC7723tc
    /* renamed from: a */
    public boolean mo13650a(AbstractC4170e abstractC4170e) {
        return this.f25573b.m13792a((Uri) BinderC4173f.m25294a(abstractC4170e));
    }

    @Override // com.google.android.gms.internal.AbstractC7723tc
    /* renamed from: a */
    public boolean mo13645a(String str, boolean z) {
        if (this.f25574c == null) {
            return false;
        }
        this.f25574c.m14022a(new C3433a.C3434a(str, z));
        this.f25575d = true;
        return true;
    }

    @Override // com.google.android.gms.internal.AbstractC7723tc
    /* renamed from: b */
    public AbstractC4170e mo13643b(AbstractC4170e abstractC4170e, AbstractC4170e abstractC4170e2) {
        return m13656a(abstractC4170e, abstractC4170e2, false);
    }

    @Override // com.google.android.gms.internal.AbstractC7723tc
    /* renamed from: b */
    public boolean mo13644b(AbstractC4170e abstractC4170e) {
        return this.f25573b.m13781c((Uri) BinderC4173f.m25294a(abstractC4170e));
    }

    @Override // com.google.android.gms.internal.AbstractC7723tc
    /* renamed from: c */
    public String mo13642c(AbstractC4170e abstractC4170e) {
        Context context = (Context) BinderC4173f.m25294a(abstractC4170e);
        String a = this.f25572a.a(context);
        if (this.f25574c == null || !this.f25575d) {
            return a;
        }
        String m14021a = this.f25574c.m14021a(a, this.f25574c.a(context));
        this.f25575d = false;
        return m14021a;
    }

    @Override // com.google.android.gms.internal.AbstractC7723tc
    /* renamed from: d */
    public void mo13641d(AbstractC4170e abstractC4170e) {
        this.f25573b.m13787a((MotionEvent) BinderC4173f.m25294a(abstractC4170e));
    }
}
