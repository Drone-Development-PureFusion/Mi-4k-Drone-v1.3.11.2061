package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.aaa;
import java.util.ArrayList;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.ads.internal.client.w */
/* loaded from: classes.dex */
public final class C3584w {

    /* renamed from: a */
    private long f14039a;

    /* renamed from: b */
    private Bundle f14040b;

    /* renamed from: c */
    private int f14041c;

    /* renamed from: d */
    private List<String> f14042d;

    /* renamed from: e */
    private boolean f14043e;

    /* renamed from: f */
    private int f14044f;

    /* renamed from: g */
    private boolean f14045g;

    /* renamed from: h */
    private String f14046h;

    /* renamed from: i */
    private SearchAdRequestParcel f14047i;

    /* renamed from: j */
    private Location f14048j;

    /* renamed from: k */
    private String f14049k;

    /* renamed from: l */
    private Bundle f14050l;

    /* renamed from: m */
    private Bundle f14051m;

    /* renamed from: n */
    private List<String> f14052n;

    /* renamed from: o */
    private String f14053o;

    /* renamed from: p */
    private String f14054p;

    /* renamed from: q */
    private boolean f14055q;

    public C3584w() {
        this.f14039a = -1L;
        this.f14040b = new Bundle();
        this.f14041c = -1;
        this.f14042d = new ArrayList();
        this.f14043e = false;
        this.f14044f = -1;
        this.f14045g = false;
        this.f14046h = null;
        this.f14047i = null;
        this.f14048j = null;
        this.f14049k = null;
        this.f14050l = new Bundle();
        this.f14051m = new Bundle();
        this.f14052n = new ArrayList();
        this.f14053o = null;
        this.f14054p = null;
        this.f14055q = false;
    }

    public C3584w(AdRequestParcel adRequestParcel) {
        this.f14039a = adRequestParcel.f13846b;
        this.f14040b = adRequestParcel.f13847c;
        this.f14041c = adRequestParcel.f13848d;
        this.f14042d = adRequestParcel.f13849e;
        this.f14043e = adRequestParcel.f13850f;
        this.f14044f = adRequestParcel.f13851g;
        this.f14045g = adRequestParcel.f13852h;
        this.f14046h = adRequestParcel.f13853i;
        this.f14047i = adRequestParcel.f13854j;
        this.f14048j = adRequestParcel.f13855k;
        this.f14049k = adRequestParcel.f13856l;
        this.f14050l = adRequestParcel.f13857m;
        this.f14051m = adRequestParcel.f13858n;
        this.f14052n = adRequestParcel.f13859o;
        this.f14053o = adRequestParcel.f13860p;
        this.f14054p = adRequestParcel.f13861q;
    }

    /* renamed from: a */
    public AdRequestParcel m27419a() {
        return new AdRequestParcel(7, this.f14039a, this.f14040b, this.f14041c, this.f14042d, this.f14043e, this.f14044f, this.f14045g, this.f14046h, this.f14047i, this.f14048j, this.f14049k, this.f14050l, this.f14051m, this.f14052n, this.f14053o, this.f14054p, false);
    }

    /* renamed from: a */
    public C3584w m27418a(@Nullable Location location) {
        this.f14048j = location;
        return this;
    }
}
