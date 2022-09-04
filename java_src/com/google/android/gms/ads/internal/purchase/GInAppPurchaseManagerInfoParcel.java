package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC8079yx;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* loaded from: classes.dex */
public final class GInAppPurchaseManagerInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C3683a CREATOR = new C3683a();

    /* renamed from: a */
    public final int f14400a;

    /* renamed from: b */
    public final C3696k f14401b;

    /* renamed from: c */
    public final AbstractC8079yx f14402c;

    /* renamed from: d */
    public final Context f14403d;

    /* renamed from: e */
    public final AbstractC3695j f14404e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GInAppPurchaseManagerInfoParcel(int i, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4) {
        this.f14400a = i;
        this.f14401b = (C3696k) BinderC4173f.m25294a(AbstractC4170e.AbstractBinderC4171a.m25295a(iBinder));
        this.f14402c = (AbstractC8079yx) BinderC4173f.m25294a(AbstractC4170e.AbstractBinderC4171a.m25295a(iBinder2));
        this.f14403d = (Context) BinderC4173f.m25294a(AbstractC4170e.AbstractBinderC4171a.m25295a(iBinder3));
        this.f14404e = (AbstractC3695j) BinderC4173f.m25294a(AbstractC4170e.AbstractBinderC4171a.m25295a(iBinder4));
    }

    public GInAppPurchaseManagerInfoParcel(Context context, C3696k c3696k, AbstractC8079yx abstractC8079yx, AbstractC3695j abstractC3695j) {
        this.f14400a = 2;
        this.f14403d = context;
        this.f14401b = c3696k;
        this.f14402c = abstractC8079yx;
        this.f14404e = abstractC3695j;
    }

    /* renamed from: a */
    public static GInAppPurchaseManagerInfoParcel m27117a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            bundleExtra.setClassLoader(GInAppPurchaseManagerInfoParcel.class.getClassLoader());
            return (GInAppPurchaseManagerInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m27116a(Intent intent, GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", gInAppPurchaseManagerInfoParcel);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder m27118a() {
        return BinderC4173f.m25293a(this.f14404e).asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public IBinder m27115b() {
        return BinderC4173f.m25293a(this.f14401b).asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public IBinder m27114c() {
        return BinderC4173f.m25293a(this.f14402c).asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public IBinder m27113d() {
        return BinderC4173f.m25293a(this.f14403d).asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3683a.m27110a(this, parcel, i);
    }
}
