package com.fimi.soul.biz.p184l;

import android.content.Context;
import android.text.TextUtils;
import com.fimi.soul.biz.p185m.AbstractC1946l;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.NetUtil;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
/* renamed from: com.fimi.soul.biz.l.n */
/* loaded from: classes.dex */
public class C1928n implements AbstractC1946l {

    /* renamed from: a */
    private Context f5351a;

    /* renamed from: b */
    private String f5352b;

    public C1928n(Context context) {
        this.f5351a = context;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1946l
    /* renamed from: a */
    public PlaneMsg mo33480a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("ssid", str + ",pwd=" + str2));
        String m29410a = NetUtil.m29410a(this.f5352b + "action/setWifi", arrayList, this.f5351a, true);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            if (!TextUtils.isEmpty(m29410a) && m29410a.contains("ok")) {
                planeMsg.setSuccess(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    /* renamed from: a */
    public String m33512a() {
        return this.f5352b;
    }

    /* renamed from: a */
    public void m33511a(String str) {
        this.f5352b = str;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1946l
    /* renamed from: b */
    public PlaneMsg mo33479b() {
        String m29410a = NetUtil.m29410a(this.f5352b + "dir.log", new ArrayList(), this.f5351a, true);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            if (!TextUtils.isEmpty(m29410a)) {
                planeMsg.setData(C3103au.m29211c(m29410a));
                planeMsg.setSuccess(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1946l
    /* renamed from: c */
    public PlaneMsg mo33478c() {
        String m29410a = NetUtil.m29410a(this.f5352b + "action/getDir", new ArrayList(), this.f5351a, true);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            if (!TextUtils.isEmpty(m29410a)) {
                planeMsg.setSuccess(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1946l
    /* renamed from: d */
    public PlaneMsg mo33477d() {
        String m29410a = NetUtil.m29410a(this.f5352b + "action/reboot", new ArrayList(), this.f5351a, true);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            if (!TextUtils.isEmpty(m29410a) && m29410a.contains("ok")) {
                planeMsg.setSuccess(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }
}
