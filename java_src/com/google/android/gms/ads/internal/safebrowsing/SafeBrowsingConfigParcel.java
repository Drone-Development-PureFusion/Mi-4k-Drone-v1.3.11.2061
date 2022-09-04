package com.google.android.gms.ads.internal.safebrowsing;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import org.json.JSONObject;
@aaa
/* loaded from: classes.dex */
public class SafeBrowsingConfigParcel extends AbstractSafeParcelable {
    public static final C3770b CREATOR = new C3770b();

    /* renamed from: a */
    public final int f14678a;

    /* renamed from: b */
    public final String f14679b;

    /* renamed from: c */
    public final String f14680c;

    /* renamed from: d */
    public final boolean f14681d;

    /* renamed from: e */
    public final boolean f14682e;

    public SafeBrowsingConfigParcel(int i, String str, String str2, boolean z, boolean z2) {
        this.f14678a = i;
        this.f14679b = str;
        this.f14680c = str2;
        this.f14681d = z;
        this.f14682e = z2;
    }

    @Nullable
    /* renamed from: a */
    public static SafeBrowsingConfigParcel m26933a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new SafeBrowsingConfigParcel(1, jSONObject.getString("click_string"), jSONObject.getString("report_url"), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3770b.m26930a(this, parcel, i);
    }
}
