package com.fimi.soul.biz.p184l;

import android.content.Context;
import android.location.Location;
import android.util.Log;
import com.facebook.common.util.UriUtil;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.manager.C1981o;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.biz.p176d.C1833a;
import com.fimi.soul.biz.p185m.AbstractC1949o;
import com.fimi.soul.entity.FlightTimeInfo;
import com.fimi.soul.entity.NearPerson;
import com.fimi.soul.entity.Page;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.Relation;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.C3083ak;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.NetUtil;
import com.google.firebase.p251a.C9654a;
import com.google.firebase.p253b.C9755a;
import com.xiaomi.account.openauth.AuthorizeApi;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.l.s */
/* loaded from: classes.dex */
public class C1933s implements AbstractC1949o {

    /* renamed from: a */
    private static String f5353a = XiaomiOAuthConstants.OPEN_API_PATH_PROFILE;

    /* renamed from: b */
    private MyLocationManager f5354b;

    public C1933s(Context context) {
        this.f5354b = MyLocationManager.m33443a(context);
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1936b
    /* renamed from: a */
    public PlaneMsg mo33448a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getAllUsers"));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            ArrayList m29326a = C3083ak.m29326a(User[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString());
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: a */
    public PlaneMsg mo33468a(Relation relation, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addUserRelation"));
        arrayList.add(new BasicNameValuePair("userID", relation.getUserID()));
        arrayList.add(new BasicNameValuePair("relationID", relation.getRelationID()));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData((Relation) C3083ak.m29323b(Relation.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
            }
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: a */
    public PlaneMsg mo33467a(User user, int i, String str, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "selectNearbyPerson"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        arrayList.add(new BasicNameValuePair("sex", user.getSex()));
        arrayList.add(new BasicNameValuePair("curLongitude", user.getCurLongitude()));
        arrayList.add(new BasicNameValuePair("curLatitude", user.getCurLatitude()));
        arrayList.add(new BasicNameValuePair("curPage", i + ""));
        arrayList.add(new BasicNameValuePair("pageSize", "20"));
        arrayList.add(new BasicNameValuePair("distance", str));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData(C3083ak.m29326a(NearPerson[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
            }
            if (!jSONObject.isNull("page")) {
                planeMsg.setPage((Page) C3083ak.m29323b(Page.class, jSONObject.getJSONObject("page").toString()));
            }
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: a */
    public PlaneMsg mo33466a(User user, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", MiPushClient.COMMAND_REGISTER));
        arrayList.add(new BasicNameValuePair("name", user.getName()));
        arrayList.add(new BasicNameValuePair("signature", user.getSignature()));
        arrayList.add(new BasicNameValuePair("country", user.getCountry()));
        arrayList.add(new BasicNameValuePair("nickName", user.getNickName()));
        arrayList.add(new BasicNameValuePair("userIDs", user.getUserIDs()));
        arrayList.add(new BasicNameValuePair("xiaomiID", user.getXiaomiID()));
        arrayList.add(new BasicNameValuePair("device", user.getDevice()));
        arrayList.add(new BasicNameValuePair("sex", user.getSex()));
        arrayList.add(new BasicNameValuePair("phone", user.getPhone()));
        arrayList.add(new BasicNameValuePair("userImgUrl", user.getUserImgUrl()));
        Location m33438c = this.f5354b.m33438c();
        if (m33438c != null && C1981o.m33342a(context).m33336d()) {
            arrayList.add(new BasicNameValuePair("curLongitude", this.f5354b.m33440b() + ""));
            arrayList.add(new BasicNameValuePair("curLatitude", this.f5354b.m33444a() + ""));
        }
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                User user2 = (User) C3083ak.m29323b(User.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString());
                if (m33438c != null && C9755a.f30449c != m33438c.getLatitude() && C9755a.f30449c != m33438c.getLongitude()) {
                    user2.setCurLongitude(this.f5354b.m33440b() + "");
                    user2.setCurLatitude(this.f5354b.m33444a() + "");
                }
                if (z) {
                    C1756a.m34264a(context, user2);
                }
                planeMsg.setData(user2);
            }
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: a */
    public PlaneMsg mo33465a(String str, int i, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "selectNickName"));
        arrayList.add(new BasicNameValuePair("nickName", str));
        arrayList.add(new BasicNameValuePair("curPage", i + ""));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData(C3083ak.m29326a(User[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
            }
            if (!jSONObject.isNull("page")) {
                planeMsg.setPage((Page) C3083ak.m29323b(Page.class, jSONObject.getJSONObject("page").toString()));
            }
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
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getUserById"));
        arrayList.add(new BasicNameValuePair("userid", str));
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
                planeMsg.setData((User) C3083ak.m29323b(User.class, jSONObject2));
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: a */
    public PlaneMsg mo33464a(String str, String str2, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", C9654a.C9655a.f30195k));
        arrayList.add(new BasicNameValuePair("name", str));
        arrayList.add(new BasicNameValuePair("pwd", str2));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData((User) C3083ak.m29323b(User.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString()));
            }
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: b */
    public PlaneMsg mo33463b(Context context) {
        JSONObject jSONObject;
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            try {
                jSONObject = new JSONObject(AuthorizeApi.doHttpGet(context, f5353a, Long.parseLong("2882303761517518920"), C1833a.m33967c(context, 0), C1833a.m33969b(context, 0), C1833a.m33971a(context, 0)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (!jSONObject.getString("result").equals("ok")) {
                if (jSONObject.getString("result").equals("error")) {
                    String string = jSONObject.getString("description");
                    planeMsg.setErrorCode(jSONObject.getString(XiaomiOAuthConstants.EXTRA_CODE_2));
                    planeMsg.setErrorMessage(string);
                    planeMsg.setSuccess(false);
                }
                return planeMsg;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(UriUtil.DATA_SCHEME);
            User user = new User();
            user.setXiaomiID(jSONObject2.getString("userId"));
            user.setName(jSONObject2.getString("miliaoNick"));
            user.setNickName(jSONObject2.getString("miliaoNick"));
            user.setDevice(C3103au.m29239a(context));
            if (!jSONObject2.isNull("sex") && jSONObject2.getString("sex").equals(context.getResources().getString(C1704R.C1707string.man))) {
                user.setSex("1");
            } else if (!jSONObject2.isNull("sex") && jSONObject2.getString("sex").equals(context.getResources().getString(C1704R.C1707string.woman))) {
                user.setSex("0");
            }
            return mo33466a(user, context);
        } catch (Exception e2) {
            String string2 = context.getString(C1704R.C1707string.login_xiaomi_account_sync_fail);
            planeMsg.setErrorCode("110");
            planeMsg.setErrorMessage(string2);
            planeMsg.setSuccess(false);
            C1756a.m34261a(string2, C1933s.class);
            return planeMsg;
        }
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: b */
    public PlaneMsg mo33462b(User user, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "editUserImage"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        arrayList.add(new BasicNameValuePair("userImgUrl", user.getUserImgUrl()));
        arrayList.add(new BasicNameValuePair("objectName", user.getObjectName()));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                User user2 = (User) C3083ak.m29323b(User.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString());
                if (z) {
                    C1756a.m34264a(context, user2);
                }
                planeMsg.setData(user2);
            }
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: b */
    public PlaneMsg mo33461b(String str, int i, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getUserRelations"));
        arrayList.add(new BasicNameValuePair("userID", str));
        arrayList.add(new BasicNameValuePair("curPage", i + ""));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData(C3083ak.m29326a(Relation[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
            }
            if (!jSONObject.isNull("page")) {
                planeMsg.setPage((Page) C3083ak.m29323b(Page.class, jSONObject.getJSONObject("page").toString()));
            }
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: b */
    public PlaneMsg mo33460b(String str, String str2, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "editPushRegID"));
        arrayList.add(new BasicNameValuePair("userID", str));
        arrayList.add(new BasicNameValuePair("regID", str2));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        C1756a.m34261a(m29406b, C1933s.class);
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1936b
    /* renamed from: b */
    public boolean mo33504b(String str, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "delUserById"));
        arrayList.add(new BasicNameValuePair("userid", str));
        try {
            return new JSONObject(NetUtil.m29406b(C1756a.f4551j, arrayList, context)).getBoolean("success");
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: c */
    public PlaneMsg mo33459c(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getDynamicDNZ"));
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
            planeMsg.setData(jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: c */
    public PlaneMsg mo33458c(User user, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "editUser"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        arrayList.add(new BasicNameValuePair("sex", user.getSex()));
        arrayList.add(new BasicNameValuePair("signature", user.getSignature()));
        arrayList.add(new BasicNameValuePair("nickName", user.getNickName()));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                User user2 = (User) C3083ak.m29323b(User.class, jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString());
                if (z) {
                    C1756a.m34264a(context, user2);
                }
                planeMsg.setData(user2);
            }
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: c */
    public PlaneMsg mo33457c(String str, int i, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getRelationUserList"));
        arrayList.add(new BasicNameValuePair("relationID", str));
        arrayList.add(new BasicNameValuePair("curPage", i + ""));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                planeMsg.setData(C3083ak.m29326a(Relation[].class, jSONObject.getJSONArray(UriUtil.DATA_SCHEME).toString()));
            }
            if (!jSONObject.isNull("page")) {
                planeMsg.setPage((Page) C3083ak.m29323b(Page.class, jSONObject.getJSONObject("page").toString()));
            }
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: c */
    public PlaneMsg mo33456c(String str, Context context) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        ArrayList arrayList = new ArrayList();
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            arrayList.add(new BasicNameValuePair("commandCode", "addPlaneActionList"));
            arrayList.add(new BasicNameValuePair("jsonContent", str));
            if (str != null && (jSONArray = new JSONArray(str)) != null && (jSONObject = jSONArray.getJSONObject(0)) != null && jSONObject.has("userID")) {
                arrayList.add(new BasicNameValuePair("userID", jSONObject.getString("userID")));
            }
            JSONObject jSONObject2 = new JSONObject(NetUtil.m29406b(C1756a.f4551j, arrayList, context));
            String string = jSONObject2.getString("errorMessage");
            String string2 = jSONObject2.getString("commandCode");
            String string3 = jSONObject2.getString("errorCode");
            boolean z = jSONObject2.getBoolean("success");
            Log.i("ljh", "rt : " + jSONObject2.toString());
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
            planeMsg.setData(C3083ak.m29323b(FlightTimeInfo.class, jSONObject2.getJSONObject(UriUtil.DATA_SCHEME).toString()));
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: c */
    public PlaneMsg mo33455c(String str, String str2, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "addPlaneAction"));
        arrayList.add(new BasicNameValuePair("planeID", str));
        arrayList.add(new BasicNameValuePair("userID", str2));
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
            String jSONObject2 = jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString();
            if (jSONObject2 != null) {
                planeMsg.setData(C3083ak.m29323b(FlightTimeInfo.class, jSONObject2));
            } else {
                planeMsg.setSuccess(false);
            }
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: d */
    public PlaneMsg mo33454d(User user, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "getIsAttention"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        arrayList.add(new BasicNameValuePair("relationID", user.getCountry()));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            planeMsg.setData(jSONObject.getString(UriUtil.DATA_SCHEME));
            planeMsg.setCommandCode(string2);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: e */
    public PlaneMsg mo33453e(User user, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "clearLocation"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        C1756a.m34261a(m29406b, C1933s.class);
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

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: f */
    public PlaneMsg mo33452f(User user, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "exitAircraft"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        C1756a.m34258d(context);
        String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, context);
        C1756a.m34261a(m29406b, C1933s.class);
        PlaneMsg planeMsg = new PlaneMsg();
        try {
            JSONObject jSONObject = new JSONObject(m29406b);
            String string = jSONObject.getString("errorMessage");
            String string2 = jSONObject.getString("commandCode");
            String string3 = jSONObject.getString("errorCode");
            boolean z = jSONObject.getBoolean("success");
            if (!jSONObject.isNull(UriUtil.DATA_SCHEME)) {
                String jSONObject2 = jSONObject.getJSONObject(UriUtil.DATA_SCHEME).toString();
                User user2 = (User) C3083ak.m29323b(User.class, jSONObject2);
                planeMsg.setData(user);
                m29406b = jSONObject2;
            }
            User user3 = (User) C3083ak.m29323b(User.class, m29406b);
            planeMsg.setCommandCode(string2);
            planeMsg.setData(user);
            planeMsg.setErrorCode(string3);
            planeMsg.setErrorMessage(string);
            planeMsg.setSuccess(z);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return planeMsg;
    }

    @Override // com.fimi.soul.biz.p185m.AbstractC1949o
    /* renamed from: g */
    public PlaneMsg mo33451g(User user, Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "editPhone"));
        arrayList.add(new BasicNameValuePair("userID", user.getUserID()));
        arrayList.add(new BasicNameValuePair("phone", user.getPhone()));
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
