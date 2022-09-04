package com.fimi.soul.biz.p184l;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.fimi.kernel.C1642c;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p185m.AbstractC1951q;
import com.fimi.soul.entity.AppVersion;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.entity.UpgradeResultInfo;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.C3083ak;
import com.fimi.soul.utils.NetUtil;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.l.q */
/* loaded from: classes.dex */
public class C1931q implements AbstractC1951q {
    @Override // com.fimi.soul.biz.p185m.AbstractC1951q, com.fimi.soul.biz.p185m.AbstractC1936b
    /* renamed from: a */
    public PlaneMsg mo33448a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getDeviceNewVersion"));
        String m29410a = NetUtil.m29410a(C1756a.f4551j, arrayList, context, false);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29410a);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            ArrayList m29326a = C3083ak.m29326a(UpdateVersonBean[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString());
            planeMsg.setCommandCode(string2);
            planeMsg.setData(m29326a);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1951q
    /* renamed from: a */
    public PlaneMsg mo33447a(Context context, UpgradeResultInfo upgradeResultInfo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "commitDeviceVersion"));
        arrayList.add(new BasicNameValuePair("userID", upgradeResultInfo.getUserID()));
        arrayList.add(new BasicNameValuePair("jsonStr", upgradeResultInfo.getJsonStr()));
        String m29410a = NetUtil.m29410a(C1756a.f4551j, arrayList, context, false);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29410a);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("errorMessage");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(jSONObject.getString("commandCode"));
            planeMsg.setErrorCode(string2);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1936b
    /* renamed from: a */
    public PlaneMsg mo33505a(String str, Context context) {
        return null;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1951q
    /* renamed from: b */
    public PlaneMsg mo33446b(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getAppVersion"));
        arrayList.add(new BasicNameValuePair("appType", "0"));
        String m29410a = NetUtil.m29410a(C1756a.f4551j, arrayList, context, false);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29410a);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("errorMessage");
            boolean z = jSONObject.getBoolean("success");
            String string3 = jSONObject.getString("commandCode");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData((AppVersion) C3083ak.m29323b(AppVersion.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
            }
            planeMsg.setCommandCode(string3);
            planeMsg.setErrorCode(string2);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1936b
    /* renamed from: b */
    public boolean mo33504b(String str, Context context) {
        return false;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1951q
    /* renamed from: c */
    public PlaneMsg mo33445c(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getDeviceNewVersion"));
        User m34259c = C1756a.m34259c(C1642c.m34893a());
        if (m34259c != null && !TextUtils.isEmpty(m34259c.getUserID())) {
            arrayList.add(new BasicNameValuePair("userID", m34259c.getUserID()));
        }
        String m29410a = NetUtil.m29410a(C1756a.f4551j, arrayList, context, false);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29410a);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            String string3 = jSONObject.getString("commandCode");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData(C3083ak.m29326a(UpdateVersonBean[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
            }
            planeMsg.setCommandCode(string3);
            planeMsg.setErrorCode(string2);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }
}
