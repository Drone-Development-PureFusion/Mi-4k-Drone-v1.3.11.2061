package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.AbstractC3501a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7857vp;
import com.google.android.gms.internal.AbstractC7885vv;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.acy;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C3658f CREATOR = new C3658f();

    /* renamed from: a */
    public final int f14253a;

    /* renamed from: b */
    public final AdLauncherIntentInfoParcel f14254b;

    /* renamed from: c */
    public final AbstractC3501a f14255c;

    /* renamed from: d */
    public final AbstractC3659g f14256d;

    /* renamed from: e */
    public final acy f14257e;

    /* renamed from: f */
    public final AbstractC7857vp f14258f;

    /* renamed from: g */
    public final String f14259g;

    /* renamed from: h */
    public final boolean f14260h;

    /* renamed from: i */
    public final String f14261i;

    /* renamed from: j */
    public final AbstractC3670p f14262j;

    /* renamed from: k */
    public final int f14263k;

    /* renamed from: l */
    public final int f14264l;

    /* renamed from: m */
    public final String f14265m;

    /* renamed from: n */
    public final VersionInfoParcel f14266n;

    /* renamed from: o */
    public final AbstractC7885vv f14267o;

    /* renamed from: p */
    public final String f14268p;

    /* renamed from: q */
    public final InterstitialAdParameterParcel f14269q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdOverlayInfoParcel(int i, AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, VersionInfoParcel versionInfoParcel, IBinder iBinder6, String str4, InterstitialAdParameterParcel interstitialAdParameterParcel) {
        this.f14253a = i;
        this.f14254b = adLauncherIntentInfoParcel;
        this.f14255c = (AbstractC3501a) BinderC4173f.m25294a(AbstractC4170e.AbstractBinderC4171a.m25295a(iBinder));
        this.f14256d = (AbstractC3659g) BinderC4173f.m25294a(AbstractC4170e.AbstractBinderC4171a.m25295a(iBinder2));
        this.f14257e = (acy) BinderC4173f.m25294a(AbstractC4170e.AbstractBinderC4171a.m25295a(iBinder3));
        this.f14258f = (AbstractC7857vp) BinderC4173f.m25294a(AbstractC4170e.AbstractBinderC4171a.m25295a(iBinder4));
        this.f14259g = str;
        this.f14260h = z;
        this.f14261i = str2;
        this.f14262j = (AbstractC3670p) BinderC4173f.m25294a(AbstractC4170e.AbstractBinderC4171a.m25295a(iBinder5));
        this.f14263k = i2;
        this.f14264l = i3;
        this.f14265m = str3;
        this.f14266n = versionInfoParcel;
        this.f14267o = (AbstractC7885vv) BinderC4173f.m25294a(AbstractC4170e.AbstractBinderC4171a.m25295a(iBinder6));
        this.f14268p = str4;
        this.f14269q = interstitialAdParameterParcel;
    }

    public AdOverlayInfoParcel(AbstractC3501a abstractC3501a, AbstractC3659g abstractC3659g, AbstractC3670p abstractC3670p, acy acyVar, int i, VersionInfoParcel versionInfoParcel, String str, InterstitialAdParameterParcel interstitialAdParameterParcel) {
        this.f14253a = 4;
        this.f14254b = null;
        this.f14255c = abstractC3501a;
        this.f14256d = abstractC3659g;
        this.f14257e = acyVar;
        this.f14258f = null;
        this.f14259g = null;
        this.f14260h = false;
        this.f14261i = null;
        this.f14262j = abstractC3670p;
        this.f14263k = i;
        this.f14264l = 1;
        this.f14265m = null;
        this.f14266n = versionInfoParcel;
        this.f14267o = null;
        this.f14268p = str;
        this.f14269q = interstitialAdParameterParcel;
    }

    public AdOverlayInfoParcel(AbstractC3501a abstractC3501a, AbstractC3659g abstractC3659g, AbstractC3670p abstractC3670p, acy acyVar, boolean z, int i, VersionInfoParcel versionInfoParcel) {
        this.f14253a = 4;
        this.f14254b = null;
        this.f14255c = abstractC3501a;
        this.f14256d = abstractC3659g;
        this.f14257e = acyVar;
        this.f14258f = null;
        this.f14259g = null;
        this.f14260h = z;
        this.f14261i = null;
        this.f14262j = abstractC3670p;
        this.f14263k = i;
        this.f14264l = 2;
        this.f14265m = null;
        this.f14266n = versionInfoParcel;
        this.f14267o = null;
        this.f14268p = null;
        this.f14269q = null;
    }

    public AdOverlayInfoParcel(AbstractC3501a abstractC3501a, AbstractC3659g abstractC3659g, AbstractC7857vp abstractC7857vp, AbstractC3670p abstractC3670p, acy acyVar, boolean z, int i, String str, VersionInfoParcel versionInfoParcel, AbstractC7885vv abstractC7885vv) {
        this.f14253a = 4;
        this.f14254b = null;
        this.f14255c = abstractC3501a;
        this.f14256d = abstractC3659g;
        this.f14257e = acyVar;
        this.f14258f = abstractC7857vp;
        this.f14259g = null;
        this.f14260h = z;
        this.f14261i = null;
        this.f14262j = abstractC3670p;
        this.f14263k = i;
        this.f14264l = 3;
        this.f14265m = str;
        this.f14266n = versionInfoParcel;
        this.f14267o = abstractC7885vv;
        this.f14268p = null;
        this.f14269q = null;
    }

    public AdOverlayInfoParcel(AbstractC3501a abstractC3501a, AbstractC3659g abstractC3659g, AbstractC7857vp abstractC7857vp, AbstractC3670p abstractC3670p, acy acyVar, boolean z, int i, String str, String str2, VersionInfoParcel versionInfoParcel, AbstractC7885vv abstractC7885vv) {
        this.f14253a = 4;
        this.f14254b = null;
        this.f14255c = abstractC3501a;
        this.f14256d = abstractC3659g;
        this.f14257e = acyVar;
        this.f14258f = abstractC7857vp;
        this.f14259g = str2;
        this.f14260h = z;
        this.f14261i = str;
        this.f14262j = abstractC3670p;
        this.f14263k = i;
        this.f14264l = 3;
        this.f14265m = null;
        this.f14266n = versionInfoParcel;
        this.f14267o = abstractC7885vv;
        this.f14268p = null;
        this.f14269q = null;
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, AbstractC3501a abstractC3501a, AbstractC3659g abstractC3659g, AbstractC3670p abstractC3670p, VersionInfoParcel versionInfoParcel) {
        this.f14253a = 4;
        this.f14254b = adLauncherIntentInfoParcel;
        this.f14255c = abstractC3501a;
        this.f14256d = abstractC3659g;
        this.f14257e = null;
        this.f14258f = null;
        this.f14259g = null;
        this.f14260h = false;
        this.f14261i = null;
        this.f14262j = abstractC3670p;
        this.f14263k = -1;
        this.f14264l = 4;
        this.f14265m = null;
        this.f14266n = versionInfoParcel;
        this.f14267o = null;
        this.f14268p = null;
        this.f14269q = null;
    }

    /* renamed from: a */
    public static AdOverlayInfoParcel m27259a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m27258a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder m27260a() {
        return BinderC4173f.m25293a(this.f14255c).asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public IBinder m27257b() {
        return BinderC4173f.m25293a(this.f14256d).asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public IBinder m27256c() {
        return BinderC4173f.m25293a(this.f14257e).asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public IBinder m27255d() {
        return BinderC4173f.m25293a(this.f14258f).asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public IBinder m27254e() {
        return BinderC4173f.m25293a(this.f14267o).asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public IBinder m27253f() {
        return BinderC4173f.m25293a(this.f14262j).asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3658f.m27211a(this, parcel, i);
    }
}
