package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3779u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.xm */
/* loaded from: classes.dex */
public class C7998xm {
    /* renamed from: a */
    public List<String> m13070a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }

    /* renamed from: a */
    public void m13071a(Context context, String str, abi abiVar, String str2, boolean z, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String str3 = z ? "1" : "0";
        for (String str4 : list) {
            String replaceAll = str4.replaceAll("@gw_adlocid@", str2).replaceAll("@gw_adnetrefresh@", str3).replaceAll("@gw_qdata@", abiVar.f20911r.f26239h).replaceAll("@gw_sdkver@", str).replaceAll("@gw_sessid@", C3779u.m26886i().m18464a()).replaceAll("@gw_seqnum@", abiVar.f20902i);
            if (!TextUtils.isEmpty(abiVar.f20914u)) {
                replaceAll = replaceAll.replaceAll("@gw_adnetstatus@", abiVar.f20914u);
            }
            if (abiVar.f20908o != null) {
                replaceAll = replaceAll.replaceAll("@gw_adnetid@", abiVar.f20908o.f26217b).replaceAll("@gw_allocid@", abiVar.f20908o.f26219d);
            }
            Future future = (Future) new acg(context, str, replaceAll).mo12820e();
        }
    }
}
