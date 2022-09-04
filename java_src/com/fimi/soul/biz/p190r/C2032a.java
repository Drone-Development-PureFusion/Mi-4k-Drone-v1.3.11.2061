package com.fimi.soul.biz.p190r;

import android.content.Context;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.manager.C1997r;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.FlyModeLog;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3153y;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.r.a */
/* loaded from: classes.dex */
public class C2032a {

    /* renamed from: c */
    private static C2032a f5712c = null;

    /* renamed from: a */
    private C1997r f5713a;

    /* renamed from: b */
    private Context f5714b;

    /* renamed from: d */
    private C3153y f5715d;

    private C2032a(Context context) {
        this.f5713a = C1997r.m33315a(context);
        this.f5714b = context;
        this.f5715d = C3153y.m29003a(this.f5714b);
    }

    /* renamed from: a */
    public static C2032a m33177a(Context context) {
        if (f5712c == null) {
            f5712c = new C2032a(context.getApplicationContext());
        }
        return f5712c;
    }

    /* renamed from: a */
    public void m33178a() {
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.biz.r.a.2
            @Override // java.lang.Runnable
            public void run() {
                if (!C3103au.m29221b(C2032a.this.f5714b)) {
                    return;
                }
                List<FlyModeLog> m29004a = C2032a.this.f5715d.m29004a();
                if (m29004a.size() <= 0) {
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                try {
                    for (FlyModeLog flyModeLog : m29004a) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("userID", flyModeLog.getUserID());
                        jSONObject.put("fcVersion", flyModeLog.getFcVersion());
                        jSONObject.put("openType", flyModeLog.getOpenType());
                        jSONObject.put("applyTime", flyModeLog.getInsertTime());
                        jSONObject.put("x2Version", flyModeLog.getX2Version());
                        jSONObject.put("appType", flyModeLog.getAppType());
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C2032a.this.f5713a.m33313a(jSONArray.toString(), new AbstractC1945k() { // from class: com.fimi.soul.biz.r.a.2.1
                    @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                    /* renamed from: a */
                    public void mo28106a(PlaneMsg planeMsg, File file) {
                        if (planeMsg.isSuccess()) {
                            C2032a.this.f5715d.m29001b();
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void m33175a(final FlyModeLog flyModeLog) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userID", flyModeLog.getUserID());
            jSONObject.put("fcVersion", flyModeLog.getFcVersion());
            jSONObject.put("openType", flyModeLog.getOpenType());
            jSONObject.put("applyTime", flyModeLog.getApplyTime());
            jSONObject.put("x2Version", flyModeLog.getX2Version());
            jSONObject.put("appType", flyModeLog.getAppType());
            jSONArray.put(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (C3103au.m29221b(this.f5714b)) {
            this.f5713a.m33313a(jSONArray.toString(), new AbstractC1945k() { // from class: com.fimi.soul.biz.r.a.1
                @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                /* renamed from: a */
                public void mo28106a(PlaneMsg planeMsg, File file) {
                    if (!planeMsg.isSuccess()) {
                        C2032a.this.f5715d.m29002a(flyModeLog);
                    }
                }
            });
        } else {
            this.f5715d.m29002a(flyModeLog);
        }
    }
}
