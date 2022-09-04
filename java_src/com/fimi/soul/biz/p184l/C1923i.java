package com.fimi.soul.biz.p184l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p185m.AbstractC1940f;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.C3083ak;
import com.fimi.soul.utils.NetUtil;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.l.i */
/* loaded from: classes.dex */
public class C1923i implements AbstractC1940f {
    @Override // com.fimi.soul.biz.p185m.AbstractC1940f
    /* renamed from: a */
    public PlaneMsg mo33487a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getActivePushMsg"));
        arrayList.add(new BasicNameValuePair("userID", C1756a.m34259c(context).getUserID()));
        arrayList.add(new BasicNameValuePair("appType", "0"));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData((HistoryPushMessage) C3083ak.m29323b(HistoryPushMessage.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
            }
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return planeMsg;
    }
}
