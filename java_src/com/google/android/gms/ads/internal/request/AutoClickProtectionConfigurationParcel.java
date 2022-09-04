package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* loaded from: classes.dex */
public final class AutoClickProtectionConfigurationParcel extends AbstractSafeParcelable {
    public static final C3727i CREATOR = new C3727i();

    /* renamed from: a */
    public final int f14591a;

    /* renamed from: b */
    public final boolean f14592b;
    @Nullable

    /* renamed from: c */
    public final List<String> f14593c;

    public AutoClickProtectionConfigurationParcel() {
        this(1, false, Collections.emptyList());
    }

    public AutoClickProtectionConfigurationParcel(int i, boolean z, List<String> list) {
        this.f14591a = i;
        this.f14592b = z;
        this.f14593c = list;
    }

    public AutoClickProtectionConfigurationParcel(boolean z) {
        this(1, z, Collections.emptyList());
    }

    public AutoClickProtectionConfigurationParcel(boolean z, List<String> list) {
        this(1, z, list);
    }

    @Nullable
    /* renamed from: a */
    public static AutoClickProtectionConfigurationParcel m27039a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new AutoClickProtectionConfigurationParcel();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (JSONException e) {
                    abr.d("Error grabbing url from json.", e);
                }
            }
        }
        return new AutoClickProtectionConfigurationParcel(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3727i.m27000a(this, parcel, i);
    }
}
