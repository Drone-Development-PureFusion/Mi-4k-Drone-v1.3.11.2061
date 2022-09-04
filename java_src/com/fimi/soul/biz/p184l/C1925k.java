package com.fimi.soul.biz.p184l;

import android.content.Context;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p185m.AbstractC1942h;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.utils.NetUtil;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.l.k */
/* loaded from: classes.dex */
public class C1925k implements AbstractC1942h {
    @Override // com.fimi.soul.biz.p185m.AbstractC1936b
    /* renamed from: a */
    public PlaneMsg mo33448a(Context context) {
        return null;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1942h
    /* renamed from: a */
    public PlaneMsg mo33483a(User user, String str, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "applyX2"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        arrayList.add(new BasicNameValuePair("planeID", C3021a.m29616a().m29615a(0).m29550i()));
        arrayList.add(new BasicNameValuePair("sign", str));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            int i = jSONObject.getInt(UriUtil.DATA_SCHEME);
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
            planeMsg.setData(Integer.valueOf(i));
        } catch (JSONException e) {
            e.printStackTrace();
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
