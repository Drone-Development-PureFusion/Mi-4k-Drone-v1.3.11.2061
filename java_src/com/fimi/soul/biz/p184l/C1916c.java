package com.fimi.soul.biz.p184l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p185m.AbstractC1938d;
import com.fimi.soul.entity.Describehistor;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.C3083ak;
import com.fimi.soul.utils.NetUtil;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.l.c */
/* loaded from: classes.dex */
public class C1916c implements AbstractC1938d {
    @Override // com.fimi.soul.biz.p185m.AbstractC1936b
    /* renamed from: a */
    public PlaneMsg mo33448a(Context context) {
        return null;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1936b
    /* renamed from: a */
    public PlaneMsg mo33505a(String str, Context context) {
        return null;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1938d
    /* renamed from: b */
    public PlaneMsg mo33491b(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getBillBoardYear"));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            ArrayList m29326a = C3083ak.m29326a(Describehistor[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
            planeMsg.setData(m29326a);
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1938d
    /* renamed from: c */
    public PlaneMsg mo33490c(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getBillBoardMonth"));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            ArrayList m29326a = C3083ak.m29326a(Describehistor[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
            planeMsg.setData(m29326a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1938d
    /* renamed from: d */
    public PlaneMsg mo33489d(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getBillBoardWeek"));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            ArrayList m29326a = C3083ak.m29326a(Describehistor[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
            planeMsg.setData(m29326a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1938d
    /* renamed from: e */
    public PlaneMsg mo33488e(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getBillBoardDay"));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            ArrayList m29326a = C3083ak.m29326a(Describehistor[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
            planeMsg.setData(m29326a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }
}
