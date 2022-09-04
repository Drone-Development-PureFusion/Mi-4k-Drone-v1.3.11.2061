package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.formats.AbstractC3603i;
import com.google.android.gms.internal.AbstractC7813uu;
import com.google.android.gms.internal.AbstractC7831vb;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.ads.internal.formats.e */
/* loaded from: classes.dex */
public class BinderC3599e extends AbstractC7831vb.AbstractBinderC7832a implements AbstractC3603i.AbstractC3604a {

    /* renamed from: a */
    private String f14111a;

    /* renamed from: b */
    private List<BinderC3597c> f14112b;

    /* renamed from: c */
    private String f14113c;

    /* renamed from: d */
    private AbstractC7813uu f14114d;

    /* renamed from: e */
    private String f14115e;

    /* renamed from: f */
    private String f14116f;
    @Nullable

    /* renamed from: g */
    private C3595a f14117g;

    /* renamed from: h */
    private Bundle f14118h;

    /* renamed from: i */
    private Object f14119i = new Object();

    /* renamed from: j */
    private AbstractC3603i f14120j;

    public BinderC3599e(String str, List list, String str2, AbstractC7813uu abstractC7813uu, String str3, String str4, @Nullable C3595a c3595a, Bundle bundle) {
        this.f14111a = str;
        this.f14112b = list;
        this.f14113c = str2;
        this.f14114d = abstractC7813uu;
        this.f14115e = str3;
        this.f14116f = str4;
        this.f14117g = c3595a;
        this.f14118h = bundle;
    }

    @Override // com.google.android.gms.internal.AbstractC7831vb
    /* renamed from: a */
    public String mo13364a() {
        return this.f14111a;
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i.AbstractC3604a
    /* renamed from: a */
    public void mo27381a(AbstractC3603i abstractC3603i) {
        synchronized (this.f14119i) {
            this.f14120j = abstractC3603i;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7831vb
    /* renamed from: b */
    public List mo13363b() {
        return this.f14112b;
    }

    @Override // com.google.android.gms.internal.AbstractC7831vb
    /* renamed from: c */
    public String mo13362c() {
        return this.f14113c;
    }

    @Override // com.google.android.gms.internal.AbstractC7831vb
    /* renamed from: d */
    public AbstractC7813uu mo13361d() {
        return this.f14114d;
    }

    @Override // com.google.android.gms.internal.AbstractC7831vb
    /* renamed from: e */
    public String mo13360e() {
        return this.f14115e;
    }

    @Override // com.google.android.gms.internal.AbstractC7831vb
    /* renamed from: f */
    public String mo13359f() {
        return this.f14116f;
    }

    @Override // com.google.android.gms.internal.AbstractC7831vb
    /* renamed from: g */
    public AbstractC4170e mo13358g() {
        return BinderC4173f.m25293a(this.f14120j);
    }

    @Override // com.google.android.gms.internal.AbstractC7831vb
    /* renamed from: h */
    public Bundle mo13357h() {
        return this.f14118h;
    }

    @Override // com.google.android.gms.internal.AbstractC7831vb
    /* renamed from: i */
    public void mo13356i() {
        this.f14111a = null;
        this.f14112b = null;
        this.f14113c = null;
        this.f14114d = null;
        this.f14115e = null;
        this.f14116f = null;
        this.f14117g = null;
        this.f14118h = null;
        this.f14119i = null;
        this.f14120j = null;
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i.AbstractC3604a
    /* renamed from: k */
    public String mo27380k() {
        return "1";
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i.AbstractC3604a
    /* renamed from: l */
    public String mo13338l() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i.AbstractC3604a
    /* renamed from: m */
    public C3595a mo27379m() {
        return this.f14117g;
    }
}
