package com.fimi.soul.biz.p169a;

import android.content.Context;
import android.util.Log;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p158b.AbstractC1632e;
import com.fimi.kernel.p158b.EnumC1626d;
import com.fimi.kernel.p158b.p163e.C1634b;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.entity.UpdateDroneInforBean;
import com.fimi.soul.utils.NetUtil;
import com.google.gson.Gson;
import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
/* renamed from: com.fimi.soul.biz.a.a */
/* loaded from: classes.dex */
public class C1757a {

    /* renamed from: a */
    private C1634b f4568a;

    /* renamed from: b */
    private UpdateDroneInforBean f4569b = (UpdateDroneInforBean) C1642c.m34887c().mo34880a(C2279c.f7281r, UpdateDroneInforBean.class);

    /* renamed from: c */
    private Context f4570c;

    public C1757a(Context context) {
        this.f4568a = null;
        this.f4570c = context;
        this.f4568a = (C1634b) C1642c.m34890a(EnumC1626d.Volley);
    }

    /* renamed from: a */
    public void m34256a() {
        if (this.f4569b == null || "".equals(this.f4569b.getPlaneID())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "commitDeviceVersion"));
        arrayList.add(new BasicNameValuePair("userID", this.f4569b.getUserID() + ""));
        arrayList.add(new BasicNameValuePair("planeID", this.f4569b.getPlaneID()));
        if (C1772d.m34208a().m34187k()) {
            arrayList.add(new BasicNameValuePair("fcType", C2279c.f7234bJ));
        } else {
            arrayList.add(new BasicNameValuePair("fcType", C2279c.f7233bI));
        }
        Gson gson = new Gson();
        gson.toJson(this.f4569b.getmDroneInfoBean());
        arrayList.add(new BasicNameValuePair("jsonStr", gson.toJson(this.f4569b.getmDroneInfoBean())));
        NetUtil.m29408a(arrayList, C1642c.m34893a());
        this.f4568a.mo34912a(String.format("%s?%s", C1756a.f4551j, URLEncodedUtils.format(arrayList, "UTF-8")), new AbstractC1632e<String>() { // from class: com.fimi.soul.biz.a.a.1
            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo30004a(String str) {
                if (str == null || str.length() <= 0) {
                    return;
                }
                Log.e("fdfdf", "sucesss");
            }

            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public void mo30002b(String str) {
            }
        });
    }
}
