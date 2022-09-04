package com.fimi.soul.biz.p184l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p185m.AbstractC1935a;
import com.fimi.soul.entity.AddPlane;
import com.fimi.soul.entity.AddPlaneback;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.C3083ak;
import com.fimi.soul.utils.NetUtil;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.l.a */
/* loaded from: classes.dex */
public class C1914a implements AbstractC1935a {
    @Override // com.fimi.soul.biz.p185m.AbstractC1936b
    /* renamed from: a */
    public PlaneMsg mo33448a(Context context) {
        return null;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1935a
    /* renamed from: a */
    public PlaneMsg mo33506a(AddPlane addPlane, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addPlane"));
        arrayList.add(new BasicNameValuePair("userID", addPlane.getUserID() + ""));
        arrayList.add(new BasicNameValuePair("cloud_deck_ID", addPlane.getCloud_deck_ID() == null ? "" : addPlane.getCloud_deck_ID()));
        arrayList.add(new BasicNameValuePair("receiver_control_ID", addPlane.getReceiver_control_ID()));
        arrayList.add(new BasicNameValuePair("fly_control_ID", addPlane.getFly_control_ID()));
        arrayList.add(new BasicNameValuePair("remote_control_ID", addPlane.getRemote_control_ID()));
        arrayList.add(new BasicNameValuePair("charge_count", addPlane.getCharge_count() + ""));
        arrayList.add(new BasicNameValuePair("note", addPlane.getNote() == null ? "" : addPlane.getNote()));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setData((AddPlaneback) C3083ak.m29323b(AddPlaneback.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
            planeMsg.setCommandCode(string2);
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
        return null;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1936b
    /* renamed from: b */
    public boolean mo33504b(String str, Context context) {
        return false;
    }
}
