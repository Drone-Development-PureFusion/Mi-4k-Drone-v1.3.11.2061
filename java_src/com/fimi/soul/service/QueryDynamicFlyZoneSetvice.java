package com.fimi.soul.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p183k.C1903e;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.entity.DynamicDYZ_Entity;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.C3083ak;
import com.fimi.soul.utils.C3132p;
import com.fimi.soul.utils.NetUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class QueryDynamicFlyZoneSetvice extends IntentService {
    public QueryDynamicFlyZoneSetvice() {
        super("QueryDynamicFlyZoneSetvice");
    }

    public QueryDynamicFlyZoneSetvice(String str) {
        super(str);
    }

    /* renamed from: a */
    public static void m29455a(Context context) {
        context.startService(new Intent(context, QueryDynamicFlyZoneSetvice.class));
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(@Nullable Intent intent) {
        List<DynamicDYZ_Entity> m29038a = C3132p.m29037a(getApplicationContext()).m29038a(1, new Date().getTime());
        if (m29038a != null && m29038a.size() > 0) {
            m29038a.get(0).getCurrentVersion();
        }
        C1903e m33631a = C1903e.m33631a();
        if (m33631a.m33628b() == C1903e.EnumC1904a.IDEL) {
            m33631a.m33629a(C1903e.EnumC1904a.QUERY);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("commandCode", "getDynamicDNZ"));
            User m34259c = C1756a.m34259c(this);
            if (m34259c == null) {
                return;
            }
            arrayList.add(new BasicNameValuePair("userID", m34259c.getUserID()));
            String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, this);
            try {
                DroidPlannerApp droidPlannerApp = (DroidPlannerApp) getApplication();
                JSONObject jSONObject = new JSONObject(m29406b);
                if (!jSONObject.getBoolean("success")) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(jSONObject.get(UriUtil.DATA_SCHEME).toString());
                double d = jSONObject2.getDouble("version");
                m33631a.m33630a(d);
                JSONArray jSONArray = new JSONArray(jSONObject2.get("list").toString());
                new Date().getTime();
                if (jSONArray == null) {
                    return;
                }
                if (jSONArray.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        DynamicDYZ_Entity dynamicDYZ_Entity = (DynamicDYZ_Entity) C3083ak.m29323b(DynamicDYZ_Entity.class, jSONArray.getJSONObject(i).toString());
                        if (dynamicDYZ_Entity.getDeviceType() == 1) {
                            dynamicDYZ_Entity.setCurrentVersion(d);
                            arrayList2.add(dynamicDYZ_Entity);
                        }
                    }
                    if (arrayList2.size() > 0) {
                        C3132p.m29037a(getApplicationContext()).m29035a(arrayList2);
                    } else {
                        C3132p.m29037a(getApplicationContext()).m29039a();
                    }
                } else {
                    C3132p.m29037a(getApplicationContext()).m29039a();
                }
                droidPlannerApp.f4493a.mo32909a(C2104d.EnumC2105a.QUERYDYNAMICDATA);
            } catch (Exception e) {
            }
        }
    }
}
