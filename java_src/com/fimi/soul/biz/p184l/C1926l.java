package com.fimi.soul.biz.p184l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p185m.AbstractC1943i;
import com.fimi.soul.entity.Plane;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.C3083ak;
import com.fimi.soul.utils.NetUtil;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.l.l */
/* loaded from: classes.dex */
public class C1926l implements AbstractC1943i {
    @Override // com.fimi.soul.biz.p185m.AbstractC1936b
    /* renamed from: a */
    public PlaneMsg mo33448a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getAllPlane"));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            ArrayList m29326a = C3083ak.m29326a(Plane[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString());
            planeMsg.setCommandCode(string2);
            planeMsg.setData(m29326a);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return planeMsg;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1943i
    /* renamed from: a */
    public PlaneMsg mo33482a(Plane plane, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addPlane"));
        arrayList.add(new BasicNameValuePair("version", plane.getVersion()));
        arrayList.add(new BasicNameValuePair("flyControlID", plane.getFlyControlID()));
        arrayList.add(new BasicNameValuePair("rcIC", plane.getRcIC()));
        arrayList.add(new BasicNameValuePair("userId", plane.getUser().getUserIDs() + ""));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setCommandCode(string2);
            planeMsg.setData((User) C3083ak.m29323b(User.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return planeMsg;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1936b
    /* renamed from: a */
    public PlaneMsg mo33505a(String str, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getPlaneById"));
        arrayList.add(new BasicNameValuePair("planeid", str));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                String jSONObject2 = jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString();
                planeMsg.setData((Plane) C3083ak.m29323b(Plane.class, jSONObject2));
                m29406b = jSONObject2;
            }
            planeMsg.setCommandCode(string2);
            planeMsg.setData((User) C3083ak.m29323b(User.class, m29406b));
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return planeMsg;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1936b
    /* renamed from: b */
    public boolean mo33504b(String str, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "delPlaneById"));
        arrayList.add(new BasicNameValuePair("planeid", str));
        try {
            return new JSONObject(NetUtil.m29406b(C1756a.f4551j, arrayList, context)).getBoolean("success");
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }
}
