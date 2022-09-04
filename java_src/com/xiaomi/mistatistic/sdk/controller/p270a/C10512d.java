package com.xiaomi.mistatistic.sdk.controller.p270a;

import android.text.TextUtils;
import com.xiaomi.mistatistic.sdk.BuildSetting;
import com.xiaomi.mistatistic.sdk.controller.AbstractC10508a;
import com.xiaomi.mistatistic.sdk.controller.AbstractC10524e;
import com.xiaomi.mistatistic.sdk.controller.AbstractC10536q;
import com.xiaomi.mistatistic.sdk.controller.C10526g;
import com.xiaomi.mistatistic.sdk.controller.C10534o;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.a.d */
/* loaded from: classes2.dex */
public class C10512d implements AbstractC10524e {

    /* renamed from: a */
    private AbstractC10513e f32654a;

    /* renamed from: b */
    private String f32655b;

    public C10512d(String str, AbstractC10513e abstractC10513e) {
        this.f32654a = abstractC10513e;
        this.f32655b = str;
    }

    @Override // com.xiaomi.mistatistic.sdk.controller.AbstractC10524e
    /* renamed from: a */
    public void mo4784a() {
        boolean z = false;
        C10534o c10534o = new C10534o();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("app_id", AbstractC10508a.m4878b()));
            arrayList.add(new BasicNameValuePair("app_key", AbstractC10508a.m4877c()));
            arrayList.add(new BasicNameValuePair("device_id", new C10526g().m4853a()));
            arrayList.add(new BasicNameValuePair("channel", AbstractC10508a.m4876d()));
            String m4875e = AbstractC10508a.m4875e();
            if (!TextUtils.isEmpty(m4875e)) {
                arrayList.add(new BasicNameValuePair("version", m4875e));
            }
            arrayList.add(new BasicNameValuePair("stat_value", this.f32655b));
            String m4820a = AbstractC10536q.m4820a(AbstractC10508a.m4880a(), BuildSetting.isTest() ? "http://10.99.168.145:8097/mistats" : "https://data.mistat.xiaomi.com/mistats", arrayList);
            c10534o.m4823a("Upload MiStat data complete, result=" + m4820a);
            if (!TextUtils.isEmpty(m4820a)) {
                if ("ok".equals(new JSONObject(m4820a).getString("status"))) {
                    z = true;
                }
            }
        } catch (IOException e) {
            c10534o.m4822a("Upload MiStat data failed", e);
        } catch (JSONException e2) {
            c10534o.m4822a("Result parse failed", e2);
        }
        this.f32654a.mo4795a(z);
    }
}
