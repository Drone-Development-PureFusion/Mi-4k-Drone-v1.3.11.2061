package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.client.AbstractC3553c;
import com.google.android.gms.ads.internal.formats.AbstractC3603i;
import com.google.android.gms.internal.AbstractC7813uu;
import com.google.android.gms.internal.AbstractC7826uz;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.firebase.p253b.C9755a;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.ads.internal.formats.d */
/* loaded from: classes.dex */
public class BinderC3598d extends AbstractC7826uz.AbstractBinderC7827a implements AbstractC3603i.AbstractC3604a {

    /* renamed from: a */
    private String f14097a;

    /* renamed from: b */
    private List<BinderC3597c> f14098b;

    /* renamed from: c */
    private String f14099c;

    /* renamed from: d */
    private AbstractC7813uu f14100d;

    /* renamed from: e */
    private String f14101e;

    /* renamed from: f */
    private double f14102f;

    /* renamed from: g */
    private String f14103g;

    /* renamed from: h */
    private String f14104h;
    @Nullable

    /* renamed from: i */
    private C3595a f14105i;

    /* renamed from: j */
    private Bundle f14106j;
    @Nullable

    /* renamed from: k */
    private AbstractC3553c f14107k;
    @Nullable

    /* renamed from: l */
    private View f14108l;

    /* renamed from: m */
    private Object f14109m = new Object();

    /* renamed from: n */
    private AbstractC3603i f14110n;

    public BinderC3598d(String str, List list, String str2, AbstractC7813uu abstractC7813uu, String str3, double d, String str4, String str5, @Nullable C3595a c3595a, Bundle bundle, AbstractC3553c abstractC3553c, View view) {
        this.f14097a = str;
        this.f14098b = list;
        this.f14099c = str2;
        this.f14100d = abstractC7813uu;
        this.f14101e = str3;
        this.f14102f = d;
        this.f14103g = str4;
        this.f14104h = str5;
        this.f14105i = c3595a;
        this.f14106j = bundle;
        this.f14107k = abstractC3553c;
        this.f14108l = view;
    }

    @Override // com.google.android.gms.internal.AbstractC7826uz
    /* renamed from: a */
    public String mo13390a() {
        return this.f14097a;
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i.AbstractC3604a
    /* renamed from: a */
    public void mo27381a(AbstractC3603i abstractC3603i) {
        synchronized (this.f14109m) {
            this.f14110n = abstractC3603i;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7826uz
    /* renamed from: b */
    public List mo13389b() {
        return this.f14098b;
    }

    @Override // com.google.android.gms.internal.AbstractC7826uz
    /* renamed from: c */
    public String mo13388c() {
        return this.f14099c;
    }

    @Override // com.google.android.gms.internal.AbstractC7826uz
    /* renamed from: d */
    public AbstractC7813uu mo13387d() {
        return this.f14100d;
    }

    @Override // com.google.android.gms.internal.AbstractC7826uz
    /* renamed from: e */
    public String mo13386e() {
        return this.f14101e;
    }

    @Override // com.google.android.gms.internal.AbstractC7826uz
    /* renamed from: f */
    public double mo13385f() {
        return this.f14102f;
    }

    @Override // com.google.android.gms.internal.AbstractC7826uz
    /* renamed from: g */
    public String mo13384g() {
        return this.f14103g;
    }

    @Override // com.google.android.gms.internal.AbstractC7826uz
    /* renamed from: h */
    public String mo13383h() {
        return this.f14104h;
    }

    @Override // com.google.android.gms.internal.AbstractC7826uz
    /* renamed from: i */
    public AbstractC3553c mo13382i() {
        return this.f14107k;
    }

    @Override // com.google.android.gms.internal.AbstractC7826uz
    /* renamed from: j */
    public AbstractC4170e mo13381j() {
        return BinderC4173f.m25293a(this.f14110n);
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i.AbstractC3604a
    /* renamed from: k */
    public String mo27380k() {
        return "2";
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i.AbstractC3604a
    /* renamed from: l */
    public String mo13338l() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i.AbstractC3604a
    /* renamed from: m */
    public C3595a mo27379m() {
        return this.f14105i;
    }

    @Override // com.google.android.gms.internal.AbstractC7826uz
    /* renamed from: n */
    public Bundle mo13380n() {
        return this.f14106j;
    }

    /* renamed from: o */
    public View m27385o() {
        return this.f14108l;
    }

    @Override // com.google.android.gms.internal.AbstractC7826uz
    /* renamed from: p */
    public void mo13379p() {
        this.f14097a = null;
        this.f14098b = null;
        this.f14099c = null;
        this.f14100d = null;
        this.f14101e = null;
        this.f14102f = C9755a.f30449c;
        this.f14103g = null;
        this.f14104h = null;
        this.f14105i = null;
        this.f14106j = null;
        this.f14109m = null;
        this.f14110n = null;
        this.f14107k = null;
        this.f14108l = null;
    }
}
