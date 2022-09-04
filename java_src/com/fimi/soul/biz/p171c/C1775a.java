package com.fimi.soul.biz.p171c;

import android.content.Context;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.manager.C1997r;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.BatteryOverDischange;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3119d;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.c.a */
/* loaded from: classes.dex */
public class C1775a {

    /* renamed from: a */
    private C3119d f4633a;

    /* renamed from: b */
    private Context f4634b;

    /* renamed from: c */
    private C1997r f4635c;

    public C1775a(Context context) {
        this.f4634b = context;
        this.f4633a = C3119d.m29115a(this.f4634b);
        this.f4635c = C1997r.m33315a(this.f4634b);
    }

    /* renamed from: a */
    public void m34180a() {
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.biz.c.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (!C3103au.m29221b(C1775a.this.f4634b)) {
                    return;
                }
                List<BatteryOverDischange> m29116a = C1775a.this.f4633a.m29116a();
                if (m29116a.size() <= 0) {
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                try {
                    for (BatteryOverDischange batteryOverDischange : m29116a) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("userID", batteryOverDischange.getUserId());
                        jSONObject.put("batteryId", batteryOverDischange.getBatteryId());
                        jSONObject.put("battery_level", batteryOverDischange.getBatteryLevel());
                        jSONObject.put("voltage", batteryOverDischange.getVoltage());
                        jSONObject.put("battery_current", batteryOverDischange.getBatteryCurrent());
                        jSONObject.put("temperature", batteryOverDischange.getTemperature());
                        jSONObject.put("battery_full", batteryOverDischange.getBatteryFull());
                        jSONObject.put("battery_one", batteryOverDischange.getBatteryOne());
                        jSONObject.put("battery_two", batteryOverDischange.getBatteryTwo());
                        jSONObject.put("battery_three", batteryOverDischange.getBatteryThree());
                        jSONObject.put("battery_four", batteryOverDischange.getBatteryFour());
                        jSONObject.put("battery_recyle", batteryOverDischange.getBatteryRecyle());
                        jSONObject.put("version", batteryOverDischange.getVersion());
                        jSONObject.put("appType", batteryOverDischange.getAppType());
                        jSONObject.put("accidentType", batteryOverDischange.getAccidentType());
                        jSONObject.put("updateTimes", batteryOverDischange.getUpdateTimes());
                        jSONObject.put("curElectric ", batteryOverDischange.getCurElectric());
                        jSONObject.put("fcVersion", batteryOverDischange.getFcVersion());
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C1775a.this.f4635c.m33311b(jSONArray.toString(), new AbstractC1945k() { // from class: com.fimi.soul.biz.c.a.1.1
                    @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                    /* renamed from: a */
                    public void mo28106a(PlaneMsg planeMsg, File file) {
                        if (planeMsg.isSuccess()) {
                            C1775a.this.f4633a.m29113b();
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void m34178a(final BatteryOverDischange batteryOverDischange) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userID", batteryOverDischange.getUserId());
            jSONObject.put("batteryId", batteryOverDischange.getBatteryId());
            jSONObject.put("battery_level", batteryOverDischange.getBatteryLevel());
            jSONObject.put("voltage", batteryOverDischange.getVoltage());
            jSONObject.put("battery_current", batteryOverDischange.getBatteryCurrent());
            jSONObject.put("temperature", batteryOverDischange.getTemperature());
            jSONObject.put("battery_full", batteryOverDischange.getBatteryFull());
            jSONObject.put("battery_one", batteryOverDischange.getBatteryOne());
            jSONObject.put("battery_two", batteryOverDischange.getBatteryTwo());
            jSONObject.put("battery_three", batteryOverDischange.getBatteryThree());
            jSONObject.put("battery_four", batteryOverDischange.getBatteryFour());
            jSONObject.put("battery_recyle", batteryOverDischange.getBatteryRecyle());
            jSONObject.put("version", batteryOverDischange.getVersion());
            jSONObject.put("appType", batteryOverDischange.getAppType());
            jSONObject.put("accidentType", batteryOverDischange.getAccidentType());
            jSONObject.put("updateTimes", batteryOverDischange.getUpdateTimes());
            jSONObject.put("curElectric ", batteryOverDischange.getCurElectric());
            jSONObject.put("fcVersion", batteryOverDischange.getFcVersion());
            jSONArray.put(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (C3103au.m29221b(this.f4634b)) {
            this.f4635c.m33311b(jSONArray.toString(), new AbstractC1945k() { // from class: com.fimi.soul.biz.c.a.2
                @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                /* renamed from: a */
                public void mo28106a(PlaneMsg planeMsg, File file) {
                    if (planeMsg.isSuccess()) {
                        return;
                    }
                    C1775a.this.f4633a.m29114a(batteryOverDischange);
                }
            });
        } else {
            this.f4633a.m29114a(batteryOverDischange);
        }
    }
}
