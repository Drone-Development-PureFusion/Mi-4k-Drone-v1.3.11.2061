package com.fimi.soul.base;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.LocationManager;
import android.text.TextUtils;
import com.fimi.kernel.utils.C1681v;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.NetUtil;
import com.google.firebase.p251a.C9654a;
import com.loopj.android.http.AsyncHttpClient;
import com.tencent.p263mm.sdk.contact.RContact;
/* renamed from: com.fimi.soul.base.a */
/* loaded from: classes.dex */
public class C1756a {

    /* renamed from: A */
    public static final String f4508A = "1465961173";

    /* renamed from: B */
    public static final String f4509B = "f423350548790693b784577448fd7d15";

    /* renamed from: C */
    public static final String f4510C = "miserver_preferen_";

    /* renamed from: D */
    public static final String f4511D = "temp_update.apk";

    /* renamed from: E */
    public static final int f4512E = 0;

    /* renamed from: F */
    public static final int f4513F = 1;

    /* renamed from: G */
    public static final String f4514G = "check_firmware_model";

    /* renamed from: H */
    public static final int f4515H = 0;

    /* renamed from: I */
    public static final int f4516I = 1;

    /* renamed from: J */
    public static final String f4517J = "connect_success";

    /* renamed from: K */
    public static final int f4518K = 0;

    /* renamed from: L */
    public static final String f4519L = "is_setting_enter";

    /* renamed from: M */
    public static final int f4520M = 1;

    /* renamed from: N */
    public static final int f4521N = 2;

    /* renamed from: O */
    public static final String f4522O = "wifiDistanceFile";

    /* renamed from: P */
    public static final String f4523P = "ispopDialog";

    /* renamed from: Q */
    public static final String f4524Q = "isdeleteTF";

    /* renamed from: R */
    public static final String f4525R = "isdirectcalicompass";

    /* renamed from: S */
    public static final String f4526S = "sava_flight_all_time";

    /* renamed from: T */
    public static final String f4527T = "save_total_flight_time";

    /* renamed from: U */
    public static final String f4528U = "sava_flight_cur_time";

    /* renamed from: V */
    public static final String f4529V = "sava_flight_cur_count";

    /* renamed from: W */
    public static final String f4530W = "sava_flight_cur_range";

    /* renamed from: X */
    public static final String f4531X = "sava_flight_all_range";

    /* renamed from: Y */
    public static final int f4532Y = 4;

    /* renamed from: Z */
    public static final String f4533Z = "sp_upgrade_xml";

    /* renamed from: a */
    public static final boolean f4534a = false;

    /* renamed from: aa */
    public static final int f4535aa = 5;

    /* renamed from: ab */
    public static final int f4536ab = 2;

    /* renamed from: ac */
    public static final int f4537ac = 4;

    /* renamed from: ad */
    public static final int f4538ad = 10;

    /* renamed from: ae */
    public static final int f4539ae = 5;

    /* renamed from: af */
    public static final int f4540af = 3;

    /* renamed from: ag */
    public static final String f4541ag = "www.baidu.com";

    /* renamed from: ah */
    private static User f4542ah = new User();

    /* renamed from: b */
    public static final int f4543b = 1;

    /* renamed from: c */
    public static final int f4544c = 2;

    /* renamed from: d */
    public static final String f4545d = "MiPlaneApp";

    /* renamed from: e */
    public static final boolean f4546e = false;

    /* renamed from: f */
    public static final boolean f4547f = false;

    /* renamed from: g */
    public static final String f4548g = "https://fimiservice-us.mi-ae.com";

    /* renamed from: h */
    public static final String f4549h = "https://fimiservice-us.mi-ae.com/statement.html";

    /* renamed from: i */
    public static final String f4550i = "https://fimiservice-us.mi-ae.com/privacy.html";

    /* renamed from: j */
    public static final String f4551j = "https://fimiservice-us.mi-ae.com/android/fimi.service";

    /* renamed from: k */
    public static final String f4552k = "";

    /* renamed from: l */
    public static final String f4553l = "yyyy-MM-dd HH:mm:ss";

    /* renamed from: m */
    public static final String f4554m = "MM-dd HH:mm";

    /* renamed from: n */
    public static final String f4555n = "https://awsusor0.fds.api.xiaomi.com";

    /* renamed from: o */
    public static final String f4556o = "bucket-app-us";

    /* renamed from: p */
    public static final String f4557p = "HmacSHA1";

    /* renamed from: q */
    public static final String f4558q = "2882303761517518920";

    /* renamed from: r */
    public static final String f4559r = "5761751863920";

    /* renamed from: s */
    public static final String f4560s = "sp_new_hand";

    /* renamed from: t */
    public static final String f4561t = "wx63bc994fd4e454c2";

    /* renamed from: u */
    public static final String f4562u = "18665971360";

    /* renamed from: v */
    public static final String f4563v = "fimi12345";

    /* renamed from: w */
    public static final String f4564w = "b2d5437b351877d9";

    /* renamed from: x */
    public static final String f4565x = "5c4873e37f2de34e4900cff10349ce6c";

    /* renamed from: y */
    public static final String f4566y = "XiaoMi";

    /* renamed from: z */
    public static final String f4567z = "2882303761517518920";

    /* renamed from: a */
    public static void m34265a(Context context) {
        C1681v m34543a = C1681v.m34543a(context);
        m34543a.m34517g("name");
        m34543a.m34517g(RContact.COL_NICKNAME);
        m34543a.m34517g("sex");
        m34543a.m34517g("device");
        m34543a.m34517g("signature");
        m34543a.m34517g("userIDs");
        m34543a.m34517g("phone");
        m34543a.m34517g("xiaomiId");
        m34543a.m34517g("isfirstloading");
        m34543a.m34517g("userID");
        m34543a.m34517g("userImgUrl");
        m34543a.m34517g("objectName");
        m34543a.m34517g("curLongitude");
        m34543a.m34517g("curLatitude");
    }

    /* renamed from: a */
    public static void m34264a(Context context, User user) {
        m34263a(user);
        C1681v m34543a = C1681v.m34543a(context);
        m34543a.m34540a("name", f4542ah.getName());
        m34543a.m34540a(RContact.COL_NICKNAME, f4542ah.getNickName());
        m34543a.m34540a("sex", f4542ah.getSex());
        m34543a.m34540a("device", f4542ah.getDevice());
        m34543a.m34540a("signature", f4542ah.getSignature());
        m34543a.m34540a("userIDs", f4542ah.getUserIDs());
        m34543a.m34540a("phone", f4542ah.getPhone());
        m34543a.m34540a("xiaomiId", f4542ah.getXiaomiID());
        m34543a.m34540a("userID", f4542ah.getUserID());
        m34543a.m34540a("isfirstloading", "");
        m34543a.m34540a("userImgUrl", f4542ah.getUserImgUrl());
        m34543a.m34540a("objectName", f4542ah.getObjectName());
        m34543a.m34540a("curLongitude", f4542ah.getCurLongitude());
        m34543a.m34540a("curLatitude", f4542ah.getCurLatitude());
    }

    /* renamed from: a */
    public static void m34263a(User user) {
        f4542ah.setCountry(user.getCountry());
        f4542ah.setCurLatitude(user.getCurLatitude());
        f4542ah.setCurLongitude(user.getCurLongitude());
        f4542ah.setDevice(user.getDevice());
        f4542ah.setPhone(user.getPhone());
        f4542ah.setName(user.getName());
        f4542ah.setNickName(user.getNickName());
        f4542ah.setSex(user.getSex());
        f4542ah.setSignature(user.getSignature());
        f4542ah.setUserIDs(user.getUserIDs());
        f4542ah.setUserImgUrl(user.getUserImgUrl());
        f4542ah.setXiaomiID(user.getXiaomiID());
        f4542ah.setUserID(user.getUserID());
        f4542ah.setCurLatitude(user.getCurLatitude());
        f4542ah.setCurLongitude(user.getCurLongitude());
    }

    /* renamed from: a */
    public static void m34262a(AsyncHttpClient asyncHttpClient, SharedPreferences sharedPreferences) {
        asyncHttpClient.addHeader("Cookie", "name=" + sharedPreferences.getString("cookie_name", ""));
        asyncHttpClient.addHeader("Cookie", "password=" + sharedPreferences.getString("cookie_password", ""));
        asyncHttpClient.addHeader("Cookie", "JSESSIONID=" + NetUtil.f11477a);
        asyncHttpClient.addHeader("Cookie", "key=" + sharedPreferences.getString("cookie_key", ""));
        asyncHttpClient.addHeader("Cookie", "datasourceName=" + sharedPreferences.getString("cookie_datasourceName", ""));
    }

    /* renamed from: a */
    public static void m34261a(String str, Class cls) {
    }

    /* renamed from: b */
    public static void m34260b(Context context) {
        C1681v m34543a = C1681v.m34543a(context);
        String m34514h = m34543a.m34514h("name");
        if (m34514h == null || "".equals(m34514h)) {
            f4542ah.setName("小飞");
        } else {
            f4542ah.setName(m34514h);
        }
        String m34514h2 = m34543a.m34514h(RContact.COL_NICKNAME);
        if (m34514h2 == null || "".equals(m34514h2)) {
            f4542ah.setNickName("飞飞");
        } else {
            f4542ah.setNickName(m34514h2);
        }
        String m34514h3 = m34543a.m34514h("sex");
        if (m34514h3 == null || "".equals(m34514h3)) {
            f4542ah.setSex("男");
        } else {
            f4542ah.setSex(m34514h3);
        }
        f4542ah.setSignature(m34543a.m34514h("signature"));
        f4542ah.setXiaomiID(m34543a.m34514h("xiaomiId"));
        f4542ah.setUserIDs(m34543a.m34514h("userIDs"));
        f4542ah.setUserID(m34543a.m34514h("userID"));
        f4542ah.setUserImgUrl(m34543a.m34514h("userImgUrl"));
        f4542ah.setCurLatitude(m34543a.m34514h("curLatitude"));
        f4542ah.setCurLongitude(m34543a.m34514h("curLongitude"));
        f4542ah.setPhone(m34543a.m34514h("phone"));
    }

    /* renamed from: c */
    public static User m34259c(Context context) {
        if (TextUtils.isEmpty(f4542ah.getUserID())) {
            m34260b(context);
        }
        return f4542ah;
    }

    /* renamed from: d */
    public static void m34258d(Context context) {
        C1681v.m34543a(context).m34546a().edit().remove("userID").commit();
        f4542ah.setUserID("");
        f4542ah.setName("");
        f4542ah.setNickName("");
        f4542ah.setSignature("");
        f4542ah.setCountry("");
    }

    /* renamed from: e */
    public static final boolean m34257e(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService(C9654a.C9656b.f30231p);
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }
}
