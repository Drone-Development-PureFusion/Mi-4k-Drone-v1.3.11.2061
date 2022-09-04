package com.fimi.soul.biz.p184l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p185m.AbstractC1948n;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.SumFlyDataByMonth;
import com.fimi.soul.entity.UpdateDroneItem;
import com.fimi.soul.entity.UpdatePlannerBackdata;
import com.fimi.soul.utils.C3083ak;
import com.fimi.soul.utils.NetUtil;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.l.r */
/* loaded from: classes.dex */
public class C1932r implements AbstractC1948n {
    @Override // com.fimi.soul.biz.p185m.AbstractC1936b
    /* renamed from: a */
    public PlaneMsg mo33448a(Context context) {
        return null;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1948n
    /* renamed from: a */
    public PlaneMsg mo33474a(UpdateDroneItem updateDroneItem, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addPlaneAction"));
        arrayList.add(new BasicNameValuePair("flyJourney", updateDroneItem.getDistance() + ""));
        arrayList.add(new BasicNameValuePair("flyTimeSum", updateDroneItem.getSportTime() + ""));
        arrayList.add(new BasicNameValuePair("flyFileUrl", updateDroneItem.getUploadurl()));
        arrayList.add(new BasicNameValuePair("planeID", updateDroneItem.getPlaneID() == null ? "123" : updateDroneItem.getPlaneID()));
        arrayList.add(new BasicNameValuePair("userID", C1756a.m34259c(context).getUserID()));
        arrayList.add(new BasicNameValuePair("startDate", updateDroneItem.getRecord_time()));
        arrayList.add(new BasicNameValuePair("endDate", updateDroneItem.getEndddata()));
        arrayList.add(new BasicNameValuePair("year", updateDroneItem.getYear() + ""));
        arrayList.add(new BasicNameValuePair("month", updateDroneItem.getMonth() + ""));
        arrayList.add(new BasicNameValuePair("maxHight", updateDroneItem.getMaxhight() + ""));
        arrayList.add(new BasicNameValuePair("latitude", updateDroneItem.getLatitude() + ""));
        arrayList.add(new BasicNameValuePair("latitude", updateDroneItem.getLongitude() + ""));
        arrayList.add(new BasicNameValuePair("fcType ", updateDroneItem.getFcType()));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
            planeMsg.setData((UpdatePlannerBackdata) C3083ak.m29323b(UpdatePlannerBackdata.class, jSONObject.get(UriUtil.DATA_SCHEME).toString()));
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1948n
    /* renamed from: a */
    public PlaneMsg mo33473a(String str, String str2, int i, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getPlaneActionListByMonth"));
        arrayList.add(new BasicNameValuePair("userID", str));
        arrayList.add(new BasicNameValuePair("monthDate", str2));
        arrayList.add(new BasicNameValuePair("curPage", "1"));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            ArrayList m29326a = C3083ak.m29326a(UpdatePlannerBackdata[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1948n
    /* renamed from: b */
    public PlaneMsg mo33472b(UpdateDroneItem updateDroneItem, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "delPlaneActoin"));
        arrayList.add(new BasicNameValuePair("planeActionID", updateDroneItem.getFlag() + ""));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1948n
    /* renamed from: c */
    public PlaneMsg mo33471c(String str, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addPlaneActionList"));
        arrayList.add(new BasicNameValuePair("jsonContent", str));
        String m29411a = NetUtil.m29411a(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29411a);
            ArrayList m29326a = C3083ak.m29326a(UpdatePlannerBackdata[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1948n
    /* renamed from: d */
    public PlaneMsg mo33470d(String str, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getPlaneActionListByUserID"));
        arrayList.add(new BasicNameValuePair("userID", str));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            ArrayList m29326a = C3083ak.m29326a(UpdatePlannerBackdata[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1948n
    /* renamed from: e */
    public PlaneMsg mo33469e(String str, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "sumFlyDataByMonth"));
        arrayList.add(new BasicNameValuePair("userID", str));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            ArrayList m29326a = C3083ak.m29326a(SumFlyDataByMonth[].class, jSONObject.get(UriUtil.DATA_SCHEME).toString());
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
