package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.search.C3825b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
@aaa
/* loaded from: classes.dex */
public final class SearchAdRequestParcel extends AbstractSafeParcelable {
    public static final C3577p CREATOR = new C3577p();

    /* renamed from: a */
    public final int f13874a;

    /* renamed from: b */
    public final int f13875b;

    /* renamed from: c */
    public final int f13876c;

    /* renamed from: d */
    public final int f13877d;

    /* renamed from: e */
    public final int f13878e;

    /* renamed from: f */
    public final int f13879f;

    /* renamed from: g */
    public final int f13880g;

    /* renamed from: h */
    public final int f13881h;

    /* renamed from: i */
    public final int f13882i;

    /* renamed from: j */
    public final String f13883j;

    /* renamed from: k */
    public final int f13884k;

    /* renamed from: l */
    public final String f13885l;

    /* renamed from: m */
    public final int f13886m;

    /* renamed from: n */
    public final int f13887n;

    /* renamed from: o */
    public final String f13888o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SearchAdRequestParcel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str, int i10, String str2, int i11, int i12, String str3) {
        this.f13874a = i;
        this.f13875b = i2;
        this.f13876c = i3;
        this.f13877d = i4;
        this.f13878e = i5;
        this.f13879f = i6;
        this.f13880g = i7;
        this.f13881h = i8;
        this.f13882i = i9;
        this.f13883j = str;
        this.f13884k = i10;
        this.f13885l = str2;
        this.f13886m = i11;
        this.f13887n = i12;
        this.f13888o = str3;
    }

    public SearchAdRequestParcel(C3825b c3825b) {
        this.f13874a = 1;
        this.f13875b = c3825b.m26692a();
        this.f13876c = c3825b.m26689b();
        this.f13877d = c3825b.m26687c();
        this.f13878e = c3825b.m26685d();
        this.f13879f = c3825b.m26684e();
        this.f13880g = c3825b.m26683f();
        this.f13881h = c3825b.m26682g();
        this.f13882i = c3825b.m26681h();
        this.f13883j = c3825b.m26680i();
        this.f13884k = c3825b.m26679j();
        this.f13885l = c3825b.m26678k();
        this.f13886m = c3825b.m26677l();
        this.f13887n = c3825b.m26676m();
        this.f13888o = c3825b.m26674o();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3577p.m27431a(this, parcel, i);
    }
}
