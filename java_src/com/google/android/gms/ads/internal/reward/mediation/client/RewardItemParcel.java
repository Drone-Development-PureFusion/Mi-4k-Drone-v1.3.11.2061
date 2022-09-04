package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.p226b.AbstractC3438a;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* loaded from: classes.dex */
public final class RewardItemParcel extends AbstractSafeParcelable {
    public static final C3767c CREATOR = new C3767c();

    /* renamed from: a */
    public final int f14673a;

    /* renamed from: b */
    public final String f14674b;

    /* renamed from: c */
    public final int f14675c;

    public RewardItemParcel(int i, String str, int i2) {
        this.f14673a = i;
        this.f14674b = str;
        this.f14675c = i2;
    }

    public RewardItemParcel(AbstractC3438a abstractC3438a) {
        this(1, abstractC3438a.mo26970a(), abstractC3438a.mo26969b());
    }

    public RewardItemParcel(String str, int i) {
        this(1, str, i);
    }

    @Nullable
    /* renamed from: a */
    public static RewardItemParcel m26949a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m26948a(new JSONArray(str));
        } catch (JSONException e) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public static RewardItemParcel m26948a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new RewardItemParcel(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    /* renamed from: a */
    public JSONArray m26950a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rb_type", this.f14674b);
        jSONObject.put("rb_amount", this.f14675c);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof RewardItemParcel)) {
            return false;
        }
        RewardItemParcel rewardItemParcel = (RewardItemParcel) obj;
        return C4585c.m23634a(this.f14674b, rewardItemParcel.f14674b) && C4585c.m23634a(Integer.valueOf(this.f14675c), Integer.valueOf(rewardItemParcel.f14675c));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f14674b, Integer.valueOf(this.f14675c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3767c.m26934a(this, parcel, i);
    }
}
