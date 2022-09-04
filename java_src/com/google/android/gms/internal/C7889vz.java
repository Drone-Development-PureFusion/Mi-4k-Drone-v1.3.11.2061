package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.vz */
/* loaded from: classes.dex */
public class C7889vz implements AbstractC7877vt {

    /* renamed from: a */
    final HashMap<String, acl<JSONObject>> f26028a = new HashMap<>();

    /* renamed from: a */
    public Future<JSONObject> m13292a(String str) {
        acl<JSONObject> aclVar = new acl<>();
        this.f26028a.put(str, aclVar);
        return aclVar;
    }

    @Override // com.google.android.gms.internal.AbstractC7877vt
    /* renamed from: a */
    public void mo12713a(acy acyVar, Map<String, String> map) {
        m13291a(map.get("request_id"), map.get("fetched_ad"));
    }

    /* renamed from: a */
    public void m13291a(String str, String str2) {
        abr.a("Received ad from the cache.");
        acl<JSONObject> aclVar = this.f26028a.get(str);
        if (aclVar == null) {
            abr.b("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            aclVar.m18209b((acl<JSONObject>) new JSONObject(str2));
        } catch (JSONException e) {
            abr.b("Failed constructing JSON object from value passed from javascript", e);
            aclVar.m18209b((acl<JSONObject>) null);
        } finally {
            this.f26028a.remove(str);
        }
    }

    /* renamed from: b */
    public void m13290b(String str) {
        acl<JSONObject> aclVar = this.f26028a.get(str);
        if (aclVar == null) {
            abr.b("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!aclVar.isDone()) {
            aclVar.cancel(true);
        }
        this.f26028a.remove(str);
    }
}
