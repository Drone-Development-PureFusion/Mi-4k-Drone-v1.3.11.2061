package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import com.tencent.open.p264a.C10257f;
import java.lang.ref.WeakReference;
import java.net.URL;
/* loaded from: classes2.dex */
public class ServerSetting {
    public static final String APP_DETAIL_PAGE = "http://fusion.qq.com/cgi-bin/qzapps/unified_jump?appid=%1$s&from=%2$s&isOpenAppID=1";
    public static final String CGI_FETCH_QQ_URL = "http://fusion.qq.com/cgi-bin/qzapps/mapp_getappinfo.cgi";
    public static final String DEFAULT_CGI_AUTHORIZE = "http://openmobile.qq.com/oauth2.0/m_authorize?";
    public static final String DEFAULT_LOCAL_STORAGE_URI = "http://qzs.qq.com";
    public static final String DEFAULT_REDIRECT_URI = "auth://tauth.qq.com/";
    public static final String DEFAULT_URL_ASK = "http://qzs.qq.com/open/mobile/request/sdk_request.html?";
    public static final String DEFAULT_URL_BRAG = "http://qzs.qq.com/open/mobile/brag/sdk_brag.html?";
    public static final String DEFAULT_URL_GIFT = "http://qzs.qq.com/open/mobile/request/sdk_request.html?";
    public static final String DEFAULT_URL_GRAPH_BASE = "https://openmobile.qq.com/";
    public static final String DEFAULT_URL_INVITE = "http://qzs.qq.com/open/mobile/invite/sdk_invite.html?";
    public static final String DEFAULT_URL_REACTIVE = "http://qzs.qq.com/open/mobile/reactive/sdk_reactive.html?";
    public static final String DEFAULT_URL_REPORT = "http://wspeed.qq.com/w.cgi";
    public static final String DEFAULT_URL_SEND_STORY = "http://qzs.qq.com/open/mobile/sendstory/sdk_sendstory_v1.3.html?";
    public static final String DEFAULT_URL_VOICE = "http://qzs.qq.com/open/mobile/not_support.html?";
    public static final String DOWNLOAD_QQ_URL = "http://qzs.qq.com/open/mobile/login/qzsjump.html?";
    public static final String DOWNLOAD_QQ_URL_COMMON = "http://qzs.qq.com/open/mobile/sdk_common/down_qq.htm?";
    public static final int ENVIRONMENT_EXPERIENCE = 1;
    public static final int ENVIRONMENT_NORMOL = 0;
    public static final String KEY_HOST_ANALY = "analy.qq.com";
    public static final String KEY_HOST_APPIC = "appic.qq.com";
    public static final String KEY_HOST_APP_SUPPORT = "appsupport.qq.com";
    public static final String KEY_HOST_FUSION = "fusion.qq.com";
    public static final String KEY_HOST_I_GTIMG = "i.gtimg.cn";
    public static final String KEY_HOST_MAPP_QZONE = "mapp.qzone.qq.com";
    public static final String KEY_HOST_OPEN_MOBILE = "openmobile.qq.com";
    public static final String KEY_HOST_QZAPP_QLOGO = "qzapp.qlogo.cn";
    public static final String KEY_HOST_QZS_QQ = "qzs.qq.com";
    public static final String KEY_OPEN_ENV = "OpenEnvironment";
    public static final String KEY_OPEN_SETTING = "OpenSettings";
    public static final String NEED_QQ_VERSION_TIPS_URL = "http://openmobile.qq.com/oauth2.0/m_jump_by_version?";
    public static final String URL_FUSION_BASE = "http://fusion.qq.com";
    public static final String URL_FUSION_CGI_BASE = "http://fusion.qq.com/cgi-bin";
    public static final String URL_PRIZE_EXCHANGE = "http://fusion.qq.com/cgi-bin/prize_sharing/exchange_prize.cgi";
    public static final String URL_PRIZE_GET_ACTIVITY_STATE = "http://fusion.qq.com/cgi-bin/prize_sharing/get_activity_state.cgi";
    public static final String URL_PRIZE_MAKE_SHARE_URL = "http://fusion.qq.com/cgi-bin/prize_sharing/make_share_url.cgi";
    public static final String URL_PRIZE_QUERY_UNEXCHANGE = "http://fusion.qq.com/cgi-bin/prize_sharing/query_unexchange_prize.cgi";

    /* renamed from: a */
    private static final String f32009a = C10257f.f31917d + "." + ServerSetting.class.getName();

    /* renamed from: b */
    private static ServerSetting f32010b = null;

    /* renamed from: c */
    private volatile WeakReference<SharedPreferences> f32011c = null;

    public static synchronized ServerSetting getInstance() {
        ServerSetting serverSetting;
        synchronized (ServerSetting.class) {
            if (f32010b == null) {
                f32010b = new ServerSetting();
            }
            serverSetting = f32010b;
        }
        return serverSetting;
    }

    public void changeServer() {
        this.f32011c = null;
    }

    public String getEnvUrl(Context context, String str) {
        if (this.f32011c == null || this.f32011c.get() == null) {
            this.f32011c = new WeakReference<>(context.getSharedPreferences("ServerPrefs", 0));
        }
        try {
            String host = new URL(str).getHost();
            if (host == null) {
                C10257f.m5667e(f32009a, "Get host error. url=" + str);
                return str;
            }
            String string = this.f32011c.get().getString(host, null);
            if (string == null || host.equals(string)) {
                C10257f.m5673b(f32009a, "host=" + host + ", envHost=" + string);
                return str;
            }
            String replace = str.replace(host, string);
            C10257f.m5673b(f32009a, "return environment url : " + replace);
            return replace;
        } catch (Exception e) {
            C10257f.m5667e(f32009a, "getEnvUrl url=" + str + "error.: " + e.getMessage());
            return str;
        }
    }

    public void setEnvironment(Context context, int i) {
        if (context != null && (this.f32011c == null || this.f32011c.get() == null)) {
            this.f32011c = new WeakReference<>(context.getSharedPreferences("ServerPrefs", 0));
        }
        if (i != 0 && i != 1) {
            C10257f.m5667e(f32009a, "??????????????????????????????????????????0??????????????????1");
            return;
        }
        switch (i) {
            case 0:
                SharedPreferences.Editor edit = this.f32011c.get().edit();
                edit.putInt("ServerType", 0);
                edit.putString(KEY_OPEN_ENV, "formal");
                edit.putString(KEY_HOST_QZS_QQ, KEY_HOST_QZS_QQ);
                edit.putString(KEY_HOST_OPEN_MOBILE, KEY_HOST_OPEN_MOBILE);
                edit.commit();
                changeServer();
                Toast.makeText(context, "????????????????????????", 0).show();
                return;
            case 1:
                SharedPreferences.Editor edit2 = this.f32011c.get().edit();
                edit2.putInt("ServerType", 1);
                edit2.putString(KEY_OPEN_ENV, "exp");
                edit2.putString(KEY_HOST_QZS_QQ, "testmobile.qq.com");
                edit2.putString(KEY_HOST_OPEN_MOBILE, "test.openmobile.qq.com");
                edit2.commit();
                changeServer();
                Toast.makeText(context, "????????????????????????", 0).show();
                return;
            default:
                return;
        }
    }
}
