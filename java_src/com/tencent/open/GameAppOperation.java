package com.tencent.open;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.p259a.C10114a;
import com.tencent.connect.share.QQShare;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.p265b.C10265c;
import com.tencent.open.p265b.C10266d;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.TemporaryStorage;
import com.tencent.open.utils.ThreadManager;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class GameAppOperation extends BaseApi {
    public static final String GAME_FRIEND_ADD_MESSAGE = "add_msg";
    public static final String GAME_FRIEND_LABEL = "friend_label";
    public static final String GAME_FRIEND_OPENID = "fopen_id";
    public static final String GAME_SIGNATURE = "signature";
    public static final String GAME_UNION_ID = "unionid";
    public static final String GAME_UNION_NAME = "union_name";
    public static final String GAME_ZONE_ID = "zoneid";
    public static final char PIC_SYMBOLE = 20;
    public static final String QQFAV_DATALINE_APPNAME = "app_name";
    public static final String QQFAV_DATALINE_AUDIOURL = "audioUrl";
    public static final String QQFAV_DATALINE_DESCRIPTION = "description";
    public static final String QQFAV_DATALINE_FILEDATA = "file_data";
    public static final String QQFAV_DATALINE_IMAGEURL = "image_url";
    public static final String QQFAV_DATALINE_OPENID = "open_id";
    public static final String QQFAV_DATALINE_REQTYPE = "req_type";
    public static final String QQFAV_DATALINE_SHAREID = "share_id";
    public static final String QQFAV_DATALINE_SRCTYPE = "src_type";
    public static final String QQFAV_DATALINE_TITLE = "title";
    public static final int QQFAV_DATALINE_TYPE_AUDIO = 2;
    public static final int QQFAV_DATALINE_TYPE_DEFAULT = 1;
    public static final int QQFAV_DATALINE_TYPE_IMAGE_TEXT = 5;
    public static final int QQFAV_DATALINE_TYPE_TEXT = 6;
    public static final String QQFAV_DATALINE_URL = "url";
    public static final String QQFAV_DATALINE_VERSION = "version";
    public static final String SHARE_PRIZE_ACTIVITY_ID = "activityid";
    public static final String SHARE_PRIZE_IMAGE_URL = "imageUrl";
    public static final String SHARE_PRIZE_SHARE_ID = "shareid";
    public static final String SHARE_PRIZE_SHARE_ID_LIST = "shareid_list";
    public static final String SHARE_PRIZE_SUMMARY = "summary";
    public static final int SHARE_PRIZE_SUMMARY_MAX_LENGTH = 60;
    public static final String SHARE_PRIZE_TARGET_URL = "targetUrl";
    public static final String SHARE_PRIZE_TITLE = "title";
    public static final int SHARE_PRIZE_TITLE_MAX_LENGTH = 45;
    public static final String TROOPBAR_ID = "troopbar_id";

    /* renamed from: a */
    private static final String f31714a = C10257f.f31917d + ".GameAppOper";

    public GameAppOperation(QQToken qQToken) {
        super(qQToken);
    }

    /* renamed from: a */
    private void m5838a(Activity activity) {
        m5836a(activity, "");
    }

    /* renamed from: a */
    private void m5836a(Activity activity, String str) {
        new TDialog(activity, "", getCommonDownloadQQUrl(str), null, this.mToken).show();
    }

    /* renamed from: a */
    private void m5834a(String str, int i, String str2) {
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C10257f.m5676a(C10257f.f31917d, "reportForVia() error: reportType or result is null");
            return;
        }
        switch (i) {
            case 1:
                str3 = "6";
                break;
            case 2:
                str3 = "3";
                break;
            case 3:
            case 4:
            default:
                C10257f.m5667e(C10257f.f31917d, "GameAppOperation -- reportForVia() error: unknow type " + String.valueOf(i));
                return;
            case 5:
                str3 = "1";
                break;
            case 6:
                str3 = "5";
                break;
        }
        C10266d.m5641a().m5637a(this.mToken.getOpenId(), this.mToken.getAppId(), "2", str, Constants.VIA_ACT_TYPE_TWENTY_EIGHT, str2, str3, "0", "", "");
    }

    /* renamed from: a */
    private boolean m5837a(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (activity == null || bundle == null || iUiListener == null) {
            C10257f.m5667e(C10257f.f31917d, "activity or params or listener is null!");
            return false;
        }
        int i = bundle.getInt("req_type", 1);
        if (TextUtils.isEmpty(bundle.getString(QQFAV_DATALINE_APPNAME))) {
            iUiListener.onError(new UiError(-5, "???????????????????????????: app_name", null));
            return false;
        }
        String string = bundle.getString("description");
        String string2 = bundle.getString("url");
        String string3 = bundle.getString(QQFAV_DATALINE_AUDIOURL);
        String string4 = bundle.getString(QQFAV_DATALINE_IMAGEURL);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(QQFAV_DATALINE_FILEDATA);
        switch (i) {
            case 1:
                if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string4)) {
                    iUiListener.onError(new UiError(-5, "???????????????????????????: image_url or url is null", null));
                    return false;
                }
                break;
            case 2:
                if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string4) || TextUtils.isEmpty(string3)) {
                    iUiListener.onError(new UiError(-5, "???????????????????????????: image_url or url or audioUrl is null", null));
                    return false;
                }
                break;
            case 3:
            case 4:
            default:
                iUiListener.onError(new UiError(-5, "??????????????????!: unknow req_type", null));
                return false;
            case 5:
                if (stringArrayList != null && stringArrayList.size() != 0) {
                    int size = stringArrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String trim = stringArrayList.get(i2).trim();
                        if (trim.startsWith("/") && !new File(trim).exists()) {
                            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
                            return false;
                        }
                    }
                    break;
                } else {
                    iUiListener.onError(new UiError(-5, "???????????????????????????: fill_data is null", null));
                    return false;
                }
                break;
            case 6:
                if (TextUtils.isEmpty(string)) {
                    iUiListener.onError(new UiError(-5, "???????????????????????????: description is null", null));
                    return false;
                }
                break;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public Bundle m5833b() {
        if (this.mToken == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        String appId = this.mToken.getAppId();
        String openId = this.mToken.getOpenId();
        String accessToken = this.mToken.getAccessToken();
        if (TextUtils.isEmpty(appId) || TextUtils.isEmpty(openId) || TextUtils.isEmpty(accessToken)) {
            C10257f.m5667e(f31714a, "composeLoginStateParams fail, accesstoken or openid or appid is null");
            return null;
        }
        bundle.putString("appid", this.mToken.getAppId());
        bundle.putString("openid", this.mToken.getOpenId());
        bundle.putString("accesstoken", this.mToken.getAccessToken());
        return bundle;
    }

    public void addToQQFavorites(Activity activity, Bundle bundle, IUiListener iUiListener) {
        C10257f.m5670c(C10257f.f31917d, "addToQQFavorites() -- start");
        int i = bundle.getInt("req_type", 1);
        if (!m5837a(activity, bundle, iUiListener)) {
            m5834a(Constants.VIA_REPORT_TYPE_QQFAVORITES, i, "1");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("mqqapi://share/to_qqfav?src_type=app&version=1&file_type=news");
        String string = bundle.getString(QQFAV_DATALINE_IMAGEURL);
        String string2 = bundle.getString("title");
        String string3 = bundle.getString("description");
        String string4 = bundle.getString("url");
        String string5 = bundle.getString(QQFAV_DATALINE_AUDIOURL);
        String applicationLable = Util.getApplicationLable(activity);
        String string6 = applicationLable == null ? bundle.getString(QQFAV_DATALINE_APPNAME) : applicationLable;
        ArrayList<String> stringArrayList = bundle.getStringArrayList(QQFAV_DATALINE_FILEDATA);
        String appId = this.mToken.getAppId();
        String openId = this.mToken.getOpenId();
        C10257f.m5673b(SystemUtils.QQFAVORITES_CALLBACK_ACTION, "openId:" + openId);
        if (!TextUtils.isEmpty(string)) {
            stringBuffer.append("&image_url=" + Base64.encodeToString(Util.getBytesUTF8(string), 2));
        }
        if (stringArrayList != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    stringBuffer2.append(URLEncoder.encode(stringArrayList.get(i2).trim(), "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    C10257f.m5672b(C10257f.f31917d, "UnsupportedEncodingException", e);
                    stringBuffer2.append(URLEncoder.encode(stringArrayList.get(i2).trim()));
                }
                if (i2 != size - 1) {
                    stringBuffer2.append(";");
                }
            }
            stringBuffer.append("&file_data=" + Base64.encodeToString(Util.getBytesUTF8(stringBuffer2.toString()), 2));
        }
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&title=" + Base64.encodeToString(Util.getBytesUTF8(string2), 2));
        }
        if (!TextUtils.isEmpty(string3)) {
            stringBuffer.append("&description=" + Base64.encodeToString(Util.getBytesUTF8(string3), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(string4)) {
            stringBuffer.append("&url=" + Base64.encodeToString(Util.getBytesUTF8(string4), 2));
        }
        if (!TextUtils.isEmpty(string6)) {
            if (string6.length() > 20) {
                string6 = string6.substring(0, 20) + "...";
            }
            stringBuffer.append("&app_name=" + Base64.encodeToString(Util.getBytesUTF8(string6), 2));
        }
        if (!TextUtils.isEmpty(openId)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(Util.getBytesUTF8(openId), 2));
        }
        if (!TextUtils.isEmpty(string5)) {
            stringBuffer.append("&audioUrl=" + Base64.encodeToString(Util.getBytesUTF8(string5), 2));
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(Util.getBytesUTF8(String.valueOf(i)), 2));
        C10257f.m5673b("addToQQFavorites url: ", stringBuffer.toString());
        C10114a.m6184a(Global.getContext(), this.mToken, "requireApi", SystemUtils.QQFAVORITES_CALLBACK_ACTION);
        this.mActivityIntent = new Intent("android.intent.action.VIEW");
        this.mActivityIntent.setData(Uri.parse(stringBuffer.toString()));
        this.mActivityIntent.putExtra("pkg_name", activity.getPackageName());
        Object obj = TemporaryStorage.set(SystemUtils.QQFAVORITES_CALLBACK_ACTION, iUiListener);
        if (obj != null) {
            ((IUiListener) obj).onCancel();
        }
        if (!hasActivityForIntent() || SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_5_2_0) < 0) {
            C10257f.m5668d(C10257f.f31917d, "-->addToQQFavorites, there is no activity, show download page.");
            m5834a(Constants.VIA_REPORT_TYPE_QQFAVORITES, i, "1");
            m5838a(activity);
        } else {
            try {
                activity.startActivityForResult(this.mActivityIntent, 0);
                m5834a(Constants.VIA_REPORT_TYPE_QQFAVORITES, i, "0");
            } catch (Exception e2) {
                C10257f.m5672b(C10257f.f31917d, "-->addToQQFavorites, start activity exception.", e2);
                m5834a(Constants.VIA_REPORT_TYPE_QQFAVORITES, i, "1");
                m5838a(activity);
            }
        }
        C10257f.m5670c(C10257f.f31917d, "addToQQFavorites() --end");
    }

    public void bindQQGroup(Activity activity, Bundle bundle) {
        C10257f.m5670c(C10257f.f31917d, "-->bindQQGroup()  -- start");
        if (activity == null) {
            Toast.makeText(activity, "Activity????????????", 0).show();
            C10257f.m5667e(C10257f.f31917d, "-->bindQQGroup, activity is empty.");
            C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_BIND_GROUP, "18", "18", "1");
        } else if (bundle == null) {
            Toast.makeText(activity, "Bundle????????????", 0).show();
            C10257f.m5667e(C10257f.f31917d, "-->bindQQGroup, params is empty.");
            C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_BIND_GROUP, "18", "18", "1");
        } else {
            String applicationLable = Util.getApplicationLable(activity);
            StringBuffer stringBuffer = new StringBuffer("mqqapi://gamesdk/bind_group?src_type=app&version=1");
            if (!TextUtils.isEmpty(applicationLable)) {
                stringBuffer.append("&app_name=" + Base64.encodeToString(Util.getBytesUTF8(applicationLable), 2));
            }
            String string = bundle.getString(GAME_UNION_ID);
            if (TextUtils.isEmpty(string)) {
                Toast.makeText(activity, "????????????ID??????", 0).show();
                C10257f.m5667e(C10257f.f31917d, "-->bindQQGroup, game union id is empty.");
                C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_BIND_GROUP, "18", "18", "1");
                return;
            }
            stringBuffer.append("&unionid=" + Base64.encodeToString(Util.getBytesUTF8(string), 2));
            String string2 = bundle.getString(GAME_UNION_NAME);
            if (TextUtils.isEmpty(string2)) {
                Toast.makeText(activity, "????????????????????????", 0).show();
                C10257f.m5667e(C10257f.f31917d, "-->bindQQGroup, game union name is empty.");
                C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_BIND_GROUP, "18", "18", "1");
                return;
            }
            stringBuffer.append("&union_name=" + Base64.encodeToString(Util.getBytesUTF8(string2), 2));
            String string3 = bundle.getString(GAME_ZONE_ID);
            if (TextUtils.isEmpty(string3)) {
                Toast.makeText(activity, "????????????ID??????", 0).show();
                C10257f.m5667e(C10257f.f31917d, "-->bindQQGroup, game zone id  is empty.");
                C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_BIND_GROUP, "18", "18", "1");
                return;
            }
            stringBuffer.append("&zoneid=" + Base64.encodeToString(Util.getBytesUTF8(string3), 2));
            String string4 = bundle.getString("signature");
            if (TextUtils.isEmpty(string4)) {
                Toast.makeText(activity, "??????????????????", 0).show();
                C10257f.m5667e(C10257f.f31917d, "-->bindQQGroup, game signature is empty.");
                C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_BIND_GROUP, "18", "18", "1");
                return;
            }
            stringBuffer.append("&signature=" + Base64.encodeToString(Util.getBytesUTF8(string4), 2));
            String openId = this.mToken.getOpenId();
            if (TextUtils.isEmpty(openId)) {
                Toast.makeText(activity, "Openid??????", 0).show();
                C10257f.m5667e(C10257f.f31917d, "-->bindQQGroup, openid is empty.");
                C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_BIND_GROUP, "18", "18", "1");
                return;
            }
            stringBuffer.append("&openid=" + Base64.encodeToString(Util.getBytesUTF8(openId), 2));
            Bundle composeActivityParams = composeActivityParams();
            for (String str : composeActivityParams.keySet()) {
                composeActivityParams.putString(str, Base64.encodeToString(Util.getBytesUTF8(composeActivityParams.getString(str)), 2));
            }
            stringBuffer.append("&" + Util.encodeUrl(composeActivityParams));
            C10257f.m5673b(C10257f.f31917d, "-->bindQQGroup, url: " + stringBuffer.toString());
            this.mActivityIntent = new Intent("android.intent.action.VIEW");
            this.mActivityIntent.setData(Uri.parse(stringBuffer.toString()));
            if (!hasActivityForIntent() || SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_5_1_0) < 0) {
                C10257f.m5668d(C10257f.f31917d, "-->bind group, there is no activity, show download page.");
                C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_BIND_GROUP, "18", "18", "1");
                m5838a(activity);
            } else {
                try {
                    activity.startActivityForResult(this.mActivityIntent, 0);
                    C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_BIND_GROUP, "18", "18", "0");
                } catch (Exception e) {
                    C10257f.m5672b(C10257f.f31917d, "-->bind group, start activity exception.", e);
                    C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_BIND_GROUP, "18", "18", "1");
                    m5838a(activity);
                }
            }
            C10257f.m5670c(C10257f.f31917d, "-->bindQQGroup()  -- end");
        }
    }

    public void exchangePrize(final Context context, Bundle bundle, final IUiListener iUiListener) {
        if (bundle == null) {
            C10257f.m5667e(f31714a, "exchangePrize failed, params is null.");
            iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "exchangePrize failed, params is null."));
        } else if (this.mToken == null || !this.mToken.isSessionValid()) {
            C10257f.m5667e(f31714a, "exchangePrize failed, auth token is illegal.");
            iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "exchangePrize failed, auth token is illegal."));
        } else if (context == null && Global.getContext() == null) {
            C10257f.m5667e(f31714a, "exchangePrize failed, context is null.");
            iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "exchangePrize failed, context is null."));
        } else {
            ArrayList<String> stringArrayList = bundle.getStringArrayList(SHARE_PRIZE_SHARE_ID_LIST);
            if (stringArrayList == null) {
                C10257f.m5667e(f31714a, "exchangePrize failed, shareid_list is empty.");
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "exchangePrize failed, shareid_list is empty."));
                return;
            }
            final StringBuffer stringBuffer = new StringBuffer("");
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (!TextUtils.isEmpty(str)) {
                    stringBuffer.append(str);
                    if (i < size - 1) {
                        stringBuffer.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
            }
            if (context == null) {
                context = Global.getContext();
            }
            ThreadManager.executeOnSubThread(new Runnable() { // from class: com.tencent.open.GameAppOperation.3
                @Override // java.lang.Runnable
                public void run() {
                    Bundle m5833b = GameAppOperation.this.m5833b();
                    if (m5833b == null) {
                        C10257f.m5667e(GameAppOperation.f31714a, "accesstoken or openid or appid is null, please login first!");
                        iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "accesstoken or openid or appid is null, please login first!"));
                        return;
                    }
                    m5833b.putString(GameAppOperation.SHARE_PRIZE_SHARE_ID, stringBuffer.toString());
                    m5833b.putString("imei", C10265c.m5645b(Global.getContext()));
                    try {
                        iUiListener.onComplete(HttpUtils.request(GameAppOperation.this.mToken, context, ServerSetting.URL_PRIZE_EXCHANGE, m5833b, "GET"));
                    } catch (Exception e) {
                        C10257f.m5672b(GameAppOperation.f31714a, "Exception occur in exchangePrize", e);
                        iUiListener.onError(new UiError(-2, Constants.MSG_IO_ERROR, e.getMessage()));
                    }
                }
            });
        }
    }

    public void isActivityAvailable(final Activity activity, final String str, final IUiListener iUiListener) {
        if (TextUtils.isEmpty(str)) {
            C10257f.m5667e(f31714a, "isActivityAvailable failed, activityId is null.");
            iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "isActivityAvailable failed, activityId is null."));
        } else if (this.mToken != null && this.mToken.isSessionValid()) {
            ThreadManager.executeOnSubThread(new Runnable() { // from class: com.tencent.open.GameAppOperation.4
                @Override // java.lang.Runnable
                public void run() {
                    Bundle m5833b = GameAppOperation.this.m5833b();
                    if (m5833b == null) {
                        C10257f.m5667e(GameAppOperation.f31714a, "accesstoken or openid or appid is null, please login first!");
                        iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "accesstoken or openid or appid is null, please login first!"));
                        return;
                    }
                    m5833b.putString(GameAppOperation.SHARE_PRIZE_ACTIVITY_ID, str);
                    try {
                        iUiListener.onComplete(HttpUtils.request(GameAppOperation.this.mToken, activity.getApplicationContext(), ServerSetting.URL_PRIZE_GET_ACTIVITY_STATE, m5833b, "GET"));
                    } catch (Exception e) {
                        C10257f.m5675a(GameAppOperation.f31714a, "Exception occur in make_share_url", e);
                        iUiListener.onError(new UiError(-6, "Exception occur in make_share_url", e.getMessage()));
                    }
                }
            });
        } else {
            C10257f.m5667e(f31714a, "exchangePrize failed, auth token is illegal.");
            iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "exchangePrize failed, auth token is illegal."));
        }
    }

    public void makeFriend(Activity activity, Bundle bundle) {
        C10257f.m5670c(C10257f.f31917d, "-->makeFriend()  -- start");
        if (bundle == null) {
            C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_MAKE_FRIEND, Constants.VIA_REPORT_TYPE_MAKE_FRIEND, "18", "1");
            return;
        }
        String string = bundle.getString(GAME_FRIEND_OPENID);
        if (TextUtils.isEmpty(string)) {
            C10257f.m5667e(C10257f.f31917d, "-->make friend, fOpenid is empty.");
            C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_MAKE_FRIEND, Constants.VIA_REPORT_TYPE_MAKE_FRIEND, "18", "1");
            return;
        }
        String string2 = bundle.getString(GAME_FRIEND_LABEL);
        String string3 = bundle.getString(GAME_FRIEND_ADD_MESSAGE);
        String applicationLable = Util.getApplicationLable(activity);
        String openId = this.mToken.getOpenId();
        String appId = this.mToken.getAppId();
        C10257f.m5673b(C10257f.f31917d, "-->make friend, fOpenid: " + string + " | label: " + string2 + " | message: " + string3 + " | openid: " + openId + " | appid:" + appId);
        StringBuffer stringBuffer = new StringBuffer("mqqapi://gamesdk/add_friend?src_type=app&version=1");
        stringBuffer.append("&fopen_id=" + Base64.encodeToString(Util.getBytesUTF8(string), 2));
        if (!TextUtils.isEmpty(openId)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(Util.getBytesUTF8(openId), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&app_id=" + appId);
        }
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&friend_label=" + Base64.encodeToString(Util.getBytesUTF8(string2), 2));
        }
        if (!TextUtils.isEmpty(string3)) {
            stringBuffer.append("&add_msg=" + Base64.encodeToString(Util.getBytesUTF8(string3), 2));
        }
        if (!TextUtils.isEmpty(applicationLable)) {
            stringBuffer.append("&app_name=" + Base64.encodeToString(Util.getBytesUTF8(applicationLable), 2));
        }
        C10257f.m5673b(C10257f.f31917d, "-->make friend, url: " + stringBuffer.toString());
        this.mActivityIntent = new Intent("android.intent.action.VIEW");
        this.mActivityIntent.setData(Uri.parse(stringBuffer.toString()));
        if (!hasActivityForIntent() || SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_5_1_0) < 0) {
            C10257f.m5668d(C10257f.f31917d, "-->make friend, there is no activity.");
            m5838a(activity);
            C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_MAKE_FRIEND, Constants.VIA_REPORT_TYPE_MAKE_FRIEND, "18", "1");
        } else {
            try {
                activity.startActivityForResult(this.mActivityIntent, 0);
                C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_MAKE_FRIEND, Constants.VIA_REPORT_TYPE_MAKE_FRIEND, "18", "0");
            } catch (Exception e) {
                C10257f.m5672b(C10257f.f31917d, "-->make friend, start activity exception.", e);
                m5838a(activity);
                C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_MAKE_FRIEND, Constants.VIA_REPORT_TYPE_MAKE_FRIEND, "18", "1");
            }
        }
        C10257f.m5670c(C10257f.f31917d, "-->makeFriend()  -- end");
    }

    public void queryUnexchangePrize(final Context context, final Bundle bundle, final IUiListener iUiListener) {
        if (this.mToken == null || !this.mToken.isSessionValid()) {
            C10257f.m5667e(f31714a, "queryUnexchangePrize failed, auth token is illegal.");
            iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "queryUnexchangePrize failed, auth token is illegal."));
        } else if (context == null && Global.getContext() == null) {
            C10257f.m5667e(f31714a, "queryUnexchangePrize failed, context is null.");
            iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "queryUnexchangePrize failed, context is null."));
        } else if (TextUtils.isEmpty(bundle.getString(SHARE_PRIZE_ACTIVITY_ID))) {
            C10257f.m5667e(f31714a, "queryUnexchangePrize failed, activityId is empty.");
            iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "queryUnexchangePrize failed, activityId is empty."));
        } else {
            if (context == null) {
                context = Global.getContext();
            }
            ThreadManager.executeOnSubThread(new Runnable() { // from class: com.tencent.open.GameAppOperation.2
                @Override // java.lang.Runnable
                public void run() {
                    Bundle m5833b = GameAppOperation.this.m5833b();
                    if (m5833b == null) {
                        C10257f.m5667e(GameAppOperation.f31714a, "accesstoken or openid or appid is null, please login first!");
                        iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "accesstoken or openid or appid is null, please login first!"));
                        return;
                    }
                    m5833b.putAll(bundle);
                    try {
                        iUiListener.onComplete(HttpUtils.request(GameAppOperation.this.mToken, context, ServerSetting.URL_PRIZE_QUERY_UNEXCHANGE, m5833b, "GET"));
                    } catch (Exception e) {
                        C10257f.m5672b(GameAppOperation.f31714a, "Exception occur in queryUnexchangePrize", e);
                        iUiListener.onError(new UiError(-2, Constants.MSG_IO_ERROR, e.getMessage()));
                    }
                }
            });
        }
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
        C10257f.m5670c(C10257f.f31917d, "releaseResource() -- start");
        TemporaryStorage.remove(SystemUtils.QQDATALINE_CALLBACK_ACTION);
        TemporaryStorage.remove(SystemUtils.QQFAVORITES_CALLBACK_ACTION);
        TemporaryStorage.remove(SystemUtils.TROOPBAR_CALLBACK_ACTION);
        C10257f.m5670c(C10257f.f31917d, "releaseResource() -- end");
    }

    public void sendToMyComputer(Activity activity, Bundle bundle, IUiListener iUiListener) {
        C10257f.m5670c(C10257f.f31917d, "sendToMyComputer() --start");
        int i = bundle.getInt("req_type", 1);
        if (!m5837a(activity, bundle, iUiListener)) {
            m5834a(Constants.VIA_REPORT_TYPE_DATALINE, i, "1");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("mqqapi://share/to_qqdataline?src_type=app&version=1&file_type=news");
        String string = bundle.getString(QQFAV_DATALINE_IMAGEURL);
        String string2 = bundle.getString("title");
        String string3 = bundle.getString("description");
        String string4 = bundle.getString("url");
        String string5 = bundle.getString(QQFAV_DATALINE_AUDIOURL);
        String applicationLable = Util.getApplicationLable(activity);
        String string6 = applicationLable == null ? bundle.getString(QQFAV_DATALINE_APPNAME) : applicationLable;
        ArrayList<String> stringArrayList = bundle.getStringArrayList(QQFAV_DATALINE_FILEDATA);
        String appId = this.mToken.getAppId();
        String openId = this.mToken.getOpenId();
        C10257f.m5673b(SystemUtils.QQDATALINE_CALLBACK_ACTION, "openId:" + openId);
        if (!TextUtils.isEmpty(string)) {
            stringBuffer.append("&image_url=" + Base64.encodeToString(Util.getBytesUTF8(string), 2));
        }
        if (stringArrayList != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    stringBuffer2.append(URLEncoder.encode(stringArrayList.get(i2).trim(), "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    C10257f.m5672b(C10257f.f31917d, "UnsupportedEncodingException", e);
                    stringBuffer2.append(URLEncoder.encode(stringArrayList.get(i2).trim()));
                }
                if (i2 != size - 1) {
                    stringBuffer2.append(";");
                }
            }
            stringBuffer.append("&file_data=" + Base64.encodeToString(Util.getBytesUTF8(stringBuffer2.toString()), 2));
        }
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&title=" + Base64.encodeToString(Util.getBytesUTF8(string2), 2));
        }
        if (!TextUtils.isEmpty(string3)) {
            stringBuffer.append("&description=" + Base64.encodeToString(Util.getBytesUTF8(string3), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(string4)) {
            stringBuffer.append("&url=" + Base64.encodeToString(Util.getBytesUTF8(string4), 2));
        }
        if (!TextUtils.isEmpty(string6)) {
            if (string6.length() > 20) {
                string6 = string6.substring(0, 20) + "...";
            }
            stringBuffer.append("&app_name=" + Base64.encodeToString(Util.getBytesUTF8(string6), 2));
        }
        if (!TextUtils.isEmpty(openId)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(Util.getBytesUTF8(openId), 2));
        }
        if (!TextUtils.isEmpty(string5)) {
            stringBuffer.append("&audioUrl=" + Base64.encodeToString(Util.getBytesUTF8(string5), 2));
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(Util.getBytesUTF8(String.valueOf(i)), 2));
        C10257f.m5673b("sendToMyComputer url: ", stringBuffer.toString());
        C10114a.m6184a(Global.getContext(), this.mToken, "requireApi", SystemUtils.QQDATALINE_CALLBACK_ACTION);
        this.mActivityIntent = new Intent("android.intent.action.VIEW");
        this.mActivityIntent.setData(Uri.parse(stringBuffer.toString()));
        this.mActivityIntent.putExtra("pkg_name", activity.getPackageName());
        Object obj = TemporaryStorage.set(SystemUtils.QQDATALINE_CALLBACK_ACTION, iUiListener);
        if (obj != null) {
            ((IUiListener) obj).onCancel();
        }
        if (!hasActivityForIntent() || SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_5_2_0) < 0) {
            C10257f.m5668d(C10257f.f31917d, "-->addToQQFavorites, there is no activity, show download page.");
            m5834a(Constants.VIA_REPORT_TYPE_DATALINE, i, "1");
            m5838a(activity);
        } else {
            try {
                startAssistActivity(activity, Constants.REQUEST_SEND_TO_MY_COMPUTER);
                m5834a(Constants.VIA_REPORT_TYPE_DATALINE, i, "0");
            } catch (Exception e2) {
                C10257f.m5672b(C10257f.f31917d, "-->addToQQFavorites, start activity exception.", e2);
                m5834a(Constants.VIA_REPORT_TYPE_DATALINE, i, "1");
                m5838a(activity);
            }
        }
        C10257f.m5670c(C10257f.f31917d, "sendToMyComputer() --end");
    }

    public void sharePrizeToQQ(final Activity activity, Bundle bundle, final IUiListener iUiListener) {
        if (activity == null || bundle == null || iUiListener == null) {
            C10257f.m5667e(f31714a, "activity or params or listener is null!");
            iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "activity or params or listener is null!"));
            return;
        }
        String string = bundle.getString("title");
        if (TextUtils.isEmpty(string)) {
            C10257f.m5667e(f31714a, "sharePrizeToQQ failed, title is empty.");
            iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "sharePrizeToQQ failed, title is empty."));
            return;
        }
        String string2 = bundle.getString("summary");
        if (TextUtils.isEmpty(string2)) {
            C10257f.m5667e(f31714a, "sharePrizeToQQ failed, sumary is empty.");
            iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "sharePrizeToQQ failed, sumary is empty."));
            return;
        }
        String string3 = bundle.getString("imageUrl");
        if (TextUtils.isEmpty(string3) || (!string3.startsWith("http://") && !string3.startsWith("https://"))) {
            C10257f.m5667e(f31714a, "sharePrizeToQQ failed, imageUrl is empty or illegal.");
            iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "sharePrizeToQQ failed, imageUrl is empty or illegal."));
            return;
        }
        final String string4 = bundle.getString(SHARE_PRIZE_ACTIVITY_ID);
        if (TextUtils.isEmpty(string4)) {
            C10257f.m5667e(f31714a, "sharePrizeToQQ failed, activityId is empty.");
            iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "sharePrizeToQQ failed, activityId is empty."));
            return;
        }
        final Bundle bundle2 = new Bundle();
        bundle2.putString("title", string);
        bundle2.putString("summary", string2);
        bundle2.putString("imageUrl", string3);
        bundle2.putInt("req_type", 1);
        ThreadManager.executeOnSubThread(new Runnable() { // from class: com.tencent.open.GameAppOperation.1
            @Override // java.lang.Runnable
            public void run() {
                Bundle m5833b = GameAppOperation.this.m5833b();
                if (m5833b == null) {
                    C10257f.m5667e(GameAppOperation.f31714a, "accesstoken or openid or appid is null, please login first!");
                    iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "accesstoken or openid or appid is null, please login first!"));
                    return;
                }
                m5833b.putString(GameAppOperation.SHARE_PRIZE_ACTIVITY_ID, string4);
                try {
                    JSONObject request = HttpUtils.request(GameAppOperation.this.mToken, activity.getApplicationContext(), ServerSetting.URL_PRIZE_MAKE_SHARE_URL, m5833b, "GET");
                    try {
                        int i = request.getInt("ret");
                        int i2 = request.getInt("subCode");
                        if (i == 0 && i2 == 0) {
                            bundle2.putString("targetUrl", request.getString("share_url"));
                            new QQShare(activity.getApplicationContext(), GameAppOperation.this.mToken).shareToQQ(activity, bundle2, iUiListener);
                        } else {
                            iUiListener.onError(new UiError(i, "make_share_url error.", request.getString(SocialConstants.PARAM_SEND_MSG)));
                        }
                    } catch (JSONException e) {
                        C10257f.m5667e(GameAppOperation.f31714a, "JSONException occur in make_share_url, errorMsg: " + e.getMessage());
                        iUiListener.onError(new UiError(-4, Constants.MSG_JSON_ERROR, ""));
                    }
                } catch (Exception e2) {
                    C10257f.m5672b(GameAppOperation.f31714a, "Exception occur in make_share_url", e2);
                    iUiListener.onError(new UiError(-2, Constants.MSG_IO_ERROR, e2.getMessage()));
                }
            }
        });
    }

    public void shareToTroopBar(Activity activity, Bundle bundle, IUiListener iUiListener) {
        C10257f.m5670c(C10257f.f31917d, "shareToTroopBar() -- start");
        if (activity == null || bundle == null || iUiListener == null) {
            C10257f.m5667e(C10257f.f31917d, "activity or params or listener is null!");
            return;
        }
        String string = bundle.getString("title");
        if (TextUtils.isEmpty(string)) {
            iUiListener.onError(new UiError(-5, "???????????????????????????: title is null", null));
            C10257f.m5667e(C10257f.f31917d, "shareToTroopBar() -- title is null");
        } else if (string.length() < 4 || string.length() > 25) {
            iUiListener.onError(new UiError(-5, "??????????????????!: title size: 4 ~ 25", null));
            C10257f.m5667e(C10257f.f31917d, "shareToTroopBar() -- title size: 4 ~ 25");
        } else {
            String string2 = bundle.getString("description");
            if (TextUtils.isEmpty(string2)) {
                iUiListener.onError(new UiError(-5, "???????????????????????????: description is null", null));
                C10257f.m5667e(C10257f.f31917d, "shareToTroopBar() -- description is null");
            } else if (string2.length() < 10 || string2.length() > 700) {
                iUiListener.onError(new UiError(-5, "??????????????????!: description size: 10 ~ 700", null));
                C10257f.m5667e(C10257f.f31917d, "shareToTroopBar() -- description size: 10 ~ 700");
            } else {
                ArrayList<String> stringArrayList = bundle.getStringArrayList(QQFAV_DATALINE_FILEDATA);
                StringBuffer stringBuffer = new StringBuffer();
                if (stringArrayList != null && stringArrayList.size() > 0) {
                    int size = stringArrayList.size();
                    if (size > 9) {
                        iUiListener.onError(new UiError(-5, "??????????????????!: file_data size: 1 ~ 9", null));
                        C10257f.m5667e(C10257f.f31917d, "shareToTroopBar() -- file_data size: 1 ~ 9");
                        return;
                    }
                    for (int i = 0; i < size; i++) {
                        String trim = stringArrayList.get(i).trim();
                        if (!trim.startsWith("/")) {
                            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_ERROR, "file_data?????????????????????"));
                            C10257f.m5667e(C10257f.f31917d, "shareToTroopBar(): file_data?????????????????????");
                            return;
                        } else if (trim.startsWith("/") && !new File(trim).exists()) {
                            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_ERROR, "?????????????????????"));
                            C10257f.m5667e(C10257f.f31917d, "shareToTroopBar(): ?????????????????????");
                            return;
                        }
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        try {
                            stringBuffer.append(URLEncoder.encode(stringArrayList.get(i2).trim(), "UTF-8"));
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                            C10257f.m5672b(C10257f.f31917d, "UnsupportedEncodingException: ", e);
                            stringBuffer.append(URLEncoder.encode(stringArrayList.get(i2).trim()));
                        }
                        if (i2 != size - 1) {
                            stringBuffer.append(";");
                        }
                    }
                }
                String string3 = bundle.getString(TROOPBAR_ID);
                if (!TextUtils.isEmpty(string3) && !Util.isNumeric(string3)) {
                    iUiListener.onError(new UiError(-6, "??????????????????! troopbar_id ???????????????", null));
                    C10257f.m5667e(C10257f.f31917d, "shareToTroopBar(): troopbar_id ???????????????");
                    return;
                }
                StringBuffer stringBuffer2 = new StringBuffer("mqqapi://share/to_troopbar?src_type=app&version=1&file_type=news");
                String appId = this.mToken.getAppId();
                String openId = this.mToken.getOpenId();
                C10257f.m5673b(C10257f.f31917d, "shareToTroopBar() -- openId: " + openId);
                String applicationLable = Util.getApplicationLable(activity);
                if (!TextUtils.isEmpty(appId)) {
                    stringBuffer2.append("&share_id=" + appId);
                }
                if (!TextUtils.isEmpty(openId)) {
                    stringBuffer2.append("&open_id=" + Base64.encodeToString(Util.getBytesUTF8(openId), 2));
                }
                if (!TextUtils.isEmpty(applicationLable)) {
                    if (applicationLable.length() > 20) {
                        applicationLable = applicationLable.substring(0, 20) + "...";
                    }
                    stringBuffer2.append("&app_name=" + Base64.encodeToString(Util.getBytesUTF8(applicationLable), 2));
                }
                if (!TextUtils.isEmpty(string)) {
                    stringBuffer2.append("&title=" + Base64.encodeToString(Util.getBytesUTF8(string), 2));
                }
                if (!TextUtils.isEmpty(string2)) {
                    stringBuffer2.append("&description=" + Base64.encodeToString(Util.getBytesUTF8(string2), 2));
                }
                if (!TextUtils.isEmpty(string3)) {
                    stringBuffer2.append("&troopbar_id=" + Base64.encodeToString(Util.getBytesUTF8(string3), 2));
                }
                if (!TextUtils.isEmpty(stringBuffer)) {
                    stringBuffer2.append("&file_data=" + Base64.encodeToString(Util.getBytesUTF8(stringBuffer.toString()), 2));
                }
                C10257f.m5673b("shareToTroopBar, url: ", stringBuffer2.toString());
                C10114a.m6184a(Global.getContext(), this.mToken, "requireApi", SystemUtils.TROOPBAR_CALLBACK_ACTION);
                this.mActivityIntent = new Intent("android.intent.action.VIEW");
                this.mActivityIntent.setData(Uri.parse(stringBuffer2.toString()));
                String packageName = activity.getPackageName();
                if (!TextUtils.isEmpty(packageName)) {
                    this.mActivityIntent.putExtra("pkg_name", packageName);
                }
                Object obj = TemporaryStorage.set(SystemUtils.TROOPBAR_CALLBACK_ACTION, iUiListener);
                if (obj != null) {
                    ((IUiListener) obj).onCancel();
                }
                if (!hasActivityForIntent() || SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_5_3_0) < 0) {
                    C10257f.m5668d(C10257f.f31917d, "-->shareToTroopBar, there is no activity, show download page.");
                    m5836a(activity, SystemUtils.QQ_VERSION_NAME_5_3_0);
                    C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_SHARE_TO_TROOPBAR, Constants.VIA_REPORT_TYPE_SHARE_TO_TROOPBAR, "18", "1");
                } else {
                    try {
                        startAssistActivity(activity, Constants.REQUEST_SHARE_TO_TROOP_BAR);
                        C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_SHARE_TO_TROOPBAR, Constants.VIA_REPORT_TYPE_SHARE_TO_TROOPBAR, "18", "0");
                    } catch (Exception e2) {
                        C10257f.m5672b(C10257f.f31917d, "-->shareToTroopBar, start activity exception.", e2);
                        C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_SHARE_TO_TROOPBAR, Constants.VIA_REPORT_TYPE_SHARE_TO_TROOPBAR, "18", "1");
                        m5836a(activity, SystemUtils.QQ_VERSION_NAME_5_3_0);
                    }
                }
                C10257f.m5670c(C10257f.f31917d, "shareToTroopBar() -- end");
            }
        }
    }
}
