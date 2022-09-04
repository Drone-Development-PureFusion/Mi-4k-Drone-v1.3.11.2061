package com.fimi.soul.biz.p184l;

import android.content.Context;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p185m.AbstractC1944j;
import com.fimi.soul.entity.MessagePush;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.NetUtil;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.l.m */
/* loaded from: classes.dex */
public class C1927m implements AbstractC1944j {
    @Override // com.fimi.soul.biz.p185m.AbstractC1944j
    /* renamed from: a */
    public PlaneMsg mo33481a(MessagePush messagePush, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addPushUserRegID"));
        arrayList.add(new BasicNameValuePair("userID", messagePush.getUserID()));
        arrayList.add(new BasicNameValuePair("miRegID", messagePush.getMiRegID()));
        arrayList.add(new BasicNameValuePair("appType", messagePush.getAppType()));
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
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return planeMsg;
    }
}
