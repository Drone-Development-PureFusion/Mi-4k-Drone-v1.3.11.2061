package com.tencent.connect.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.p259a.C10114a;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.p265b.C10266d;
import com.tencent.open.utils.AsynLoadImgBack;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.TemporaryStorage;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.net.URLEncoder;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class QzoneShare extends BaseApi {
    public static final String SHARE_TO_QQ_APP_NAME = "appName";
    public static final String SHARE_TO_QQ_AUDIO_URL = "audio_url";
    public static final String SHARE_TO_QQ_EXT_INT = "cflag";
    public static final String SHARE_TO_QQ_EXT_STR = "share_qq_ext_str";
    public static final String SHARE_TO_QQ_IMAGE_LOCAL_URL = "imageLocalUrl";
    public static final String SHARE_TO_QQ_IMAGE_URL = "imageUrl";
    public static final String SHARE_TO_QQ_SITE = "site";
    public static final String SHARE_TO_QQ_SUMMARY = "summary";
    public static final String SHARE_TO_QQ_TARGET_URL = "targetUrl";
    public static final String SHARE_TO_QQ_TITLE = "title";
    public static final String SHARE_TO_QZONE_KEY_TYPE = "req_type";
    public static final int SHARE_TO_QZONE_TYPE_APP = 6;
    public static final int SHARE_TO_QZONE_TYPE_IMAGE = 5;
    public static final int SHARE_TO_QZONE_TYPE_IMAGE_TEXT = 1;
    public static final int SHARE_TO_QZONE_TYPE_NO_TYPE = 0;
    public String mViaShareQzoneType = "";

    /* renamed from: a */
    private boolean f31302a = true;

    /* renamed from: b */
    private boolean f31303b = false;

    /* renamed from: c */
    private boolean f31304c = false;

    /* renamed from: d */
    private boolean f31305d = false;

    public QzoneShare(Context context, QQToken qQToken) {
        super(qQToken);
    }

    /* renamed from: a */
    private StringBuffer m6063a(StringBuffer stringBuffer, Bundle bundle) {
        C10257f.m5670c(C10257f.f31917d, "fillShareToQQParams() --start");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String string = bundle.getString("appName");
        int i = bundle.getInt("req_type", 1);
        String string2 = bundle.getString("title");
        String string3 = bundle.getString("summary");
        bundle.putString("appId", this.mToken.getAppId());
        bundle.putString("sdkp", "a");
        bundle.putString("sdkv", Constants.SDK_VERSION);
        bundle.putString("status_os", Build.VERSION.RELEASE);
        bundle.putString("status_machine", Build.MODEL);
        if (!Util.isEmpty(string2) && string2.length() > 40) {
            bundle.putString("title", string2.substring(0, 40) + "...");
        }
        if (!Util.isEmpty(string3) && string3.length() > 80) {
            bundle.putString("summary", string3.substring(0, 80) + "...");
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("site", string);
        }
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                strArr[i2] = stringArrayList.get(i2);
            }
            bundle.putStringArray("imageUrl", strArr);
        }
        bundle.putString("type", String.valueOf(i));
        stringBuffer.append("&" + Util.encodeUrl(bundle).replaceAll("\\+", "%20"));
        C10257f.m5670c(C10257f.f31917d, "fillShareToQQParams() --end");
        return stringBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6065a(Activity activity, Bundle bundle, IUiListener iUiListener) {
        C10257f.m5670c(C10257f.f31917d, "doshareToQzone() --start");
        StringBuffer stringBuffer = new StringBuffer("mqqapi://share/to_qzone?src_type=app&version=1&file_type=news");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String string = bundle.getString("title");
        String string2 = bundle.getString("summary");
        String string3 = bundle.getString("targetUrl");
        String string4 = bundle.getString("audio_url");
        int i = bundle.getInt("req_type", 1);
        String string5 = bundle.getString("appName");
        int i2 = bundle.getInt("cflag", 0);
        String string6 = bundle.getString("share_qq_ext_str");
        String appId = this.mToken.getAppId();
        String openId = this.mToken.getOpenId();
        C10257f.m5673b("doshareToQzone", "openId:" + openId);
        if (stringArrayList != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            int size = stringArrayList.size() > 9 ? 9 : stringArrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                stringBuffer2.append(URLEncoder.encode(stringArrayList.get(i3)));
                if (i3 != size - 1) {
                    stringBuffer2.append(";");
                }
            }
            stringBuffer.append("&image_url=" + Base64.encodeToString(Util.getBytesUTF8(stringBuffer2.toString()), 2));
        }
        if (!TextUtils.isEmpty(string)) {
            stringBuffer.append("&title=" + Base64.encodeToString(Util.getBytesUTF8(string), 2));
        }
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&description=" + Base64.encodeToString(Util.getBytesUTF8(string2), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(string3)) {
            stringBuffer.append("&url=" + Base64.encodeToString(Util.getBytesUTF8(string3), 2));
        }
        if (!TextUtils.isEmpty(string5)) {
            stringBuffer.append("&app_name=" + Base64.encodeToString(Util.getBytesUTF8(string5), 2));
        }
        if (!Util.isEmpty(openId)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(Util.getBytesUTF8(openId), 2));
        }
        if (!Util.isEmpty(string4)) {
            stringBuffer.append("&audioUrl=" + Base64.encodeToString(Util.getBytesUTF8(string4), 2));
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(Util.getBytesUTF8(String.valueOf(i)), 2));
        if (!Util.isEmpty(string6)) {
            stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(Util.getBytesUTF8(string6), 2));
        }
        stringBuffer.append("&cflag=" + Base64.encodeToString(Util.getBytesUTF8(String.valueOf(i2)), 2));
        C10257f.m5673b("doshareToQzone, url: ", stringBuffer.toString());
        C10114a.m6184a(Global.getContext(), this.mToken, "requireApi", "shareToNativeQQ");
        this.mActivityIntent = new Intent("android.intent.action.VIEW");
        this.mActivityIntent.setData(Uri.parse(stringBuffer.toString()));
        this.mActivityIntent.putExtra("pkg_name", activity.getPackageName());
        if (SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_4_6_0) < 0) {
            if (hasActivityForIntent()) {
                startAssitActivity(activity, iUiListener);
            }
            C10257f.m5670c(C10257f.f31917d, "doShareToQzone() -- QQ Version is < 4.6.0");
        } else {
            C10257f.m5670c(C10257f.f31917d, "doShareToQzone() -- QQ Version is > 4.6.0");
            Object obj = TemporaryStorage.set(SystemUtils.QZONE_SHARE_CALLBACK_ACTION, iUiListener);
            if (obj != null) {
                C10257f.m5670c(C10257f.f31917d, "doShareToQzone() -- do listener onCancel()");
                ((IUiListener) obj).onCancel();
            }
            if (hasActivityForIntent()) {
                startAssistActivity(activity, Constants.REQUEST_QZONE_SHARE);
            }
        }
        if (hasActivityForIntent()) {
            C10266d.m5641a().m5637a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_SHARE_TO_QZONE, "11", "3", "0", this.mViaShareQzoneType, "0", "1", "0");
            C10266d.m5641a().m5640a(0, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
        } else {
            C10266d.m5641a().m5637a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_SHARE_TO_QZONE, "11", "3", "1", this.mViaShareQzoneType, "0", "1", "0");
            C10266d.m5641a().m5640a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "hasActivityForIntent fail");
        }
        C10257f.m5670c(C10257f.f31917d, "doShareToQzone() --end");
    }

    /* renamed from: b */
    private void m6062b(Activity activity, Bundle bundle, IUiListener iUiListener) {
        C10257f.m5676a(C10257f.f31917d, "shareToH5Qzone() -- start");
        Object obj = TemporaryStorage.set(SystemUtils.QZONE_SHARE_CALLBACK_ACTION, iUiListener);
        if (obj != null) {
            C10257f.m5670c(C10257f.f31917d, "shareToH5Qzone() -- do listener onCancel()");
            ((IUiListener) obj).onCancel();
        }
        StringBuffer stringBuffer = new StringBuffer("http://openmobile.qq.com/api/check2?page=qzshare.html&loginpage=loginindex.html&logintype=qzone");
        if (bundle == null) {
            bundle = new Bundle();
        }
        StringBuffer m6063a = m6063a(stringBuffer, bundle);
        C10114a.m6184a(Global.getContext(), this.mToken, "requireApi", "shareToH5QQ");
        Bundle bundle2 = new Bundle();
        bundle2.putString("callbackAction", SystemUtils.QZONE_SHARE_CALLBACK_ACTION);
        bundle2.putString("viaShareType", this.mViaShareQzoneType);
        bundle2.putString("url", m6063a.toString());
        bundle2.putString("openId", this.mToken.getOpenId());
        bundle2.putString("appId", this.mToken.getAppId());
        startAssistActivity(activity, bundle2, Constants.REQUEST_QZONE_SHARE);
        C10266d.m5641a().m5640a(0, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToH5Qzone()");
        C10257f.m5676a(C10257f.f31917d, "shareToH5Qzone() --end");
    }

    @Override // com.tencent.connect.common.BaseApi
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
        TemporaryStorage.remove(SystemUtils.QZONE_SHARE_CALLBACK_ACTION);
    }

    public void shareToQzone(final Activity activity, final Bundle bundle, final IUiListener iUiListener) {
        String str;
        String str2;
        C10257f.m5670c(C10257f.f31917d, "shareToQzone() -- start");
        if (bundle == null) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_NULL_ERROR, null));
            C10266d.m5641a().m5640a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_NULL_ERROR);
            return;
        }
        String string = bundle.getString("title");
        String string2 = bundle.getString("summary");
        String string3 = bundle.getString("targetUrl");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String applicationLable = Util.getApplicationLable(activity);
        if (applicationLable == null) {
            applicationLable = bundle.getString("appName");
        } else if (applicationLable.length() > 20) {
            applicationLable = applicationLable.substring(0, 20) + "...";
        }
        int i = bundle.getInt("req_type");
        switch (i) {
            case 1:
                this.mViaShareQzoneType = "1";
                break;
            case 2:
            case 3:
            case 4:
            default:
                this.mViaShareQzoneType = "1";
                break;
            case 5:
                this.mViaShareQzoneType = "2";
                break;
            case 6:
                this.mViaShareQzoneType = "4";
                break;
        }
        switch (i) {
            case 1:
                this.f31302a = true;
                this.f31303b = false;
                this.f31304c = true;
                this.f31305d = false;
                str = string;
                str2 = string3;
                break;
            case 2:
            case 3:
            case 4:
            default:
                if (!Util.isEmpty(string) || !Util.isEmpty(string2)) {
                    this.f31302a = true;
                } else if (stringArrayList == null || stringArrayList.size() == 0) {
                    string = "??????" + applicationLable + "?????????";
                    this.f31302a = true;
                } else {
                    this.f31302a = false;
                }
                this.f31303b = false;
                this.f31304c = true;
                this.f31305d = false;
                str = string;
                str2 = string3;
                break;
            case 5:
                iUiListener.onError(new UiError(-5, Constants.MSG_SHARE_TYPE_ERROR, null));
                C10257f.m5667e(C10257f.f31917d, "shareToQzone() error--end???????????????????????????????????????????????????????????????");
                C10266d.m5641a().m5640a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() ???????????????????????????????????????????????????????????????");
                return;
            case 6:
                if (SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_5_0_0) >= 0) {
                    String format = String.format(ServerSetting.APP_DETAIL_PAGE, this.mToken.getAppId(), "mqq");
                    bundle.putString("targetUrl", format);
                    str = string;
                    str2 = format;
                    break;
                } else {
                    iUiListener.onError(new UiError(-15, Constants.MSG_PARAM_APPSHARE_TOO_LOW, null));
                    C10257f.m5673b(C10257f.f31917d, "-->shareToQzone, app share is not support below qq5.0.");
                    C10266d.m5641a().m5640a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone, app share is not support below qq5.0.");
                    return;
                }
        }
        if (!Util.hasSDCard() && SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_4_5_0) < 0) {
            iUiListener.onError(new UiError(-6, Constants.MSG_SHARE_NOSD_ERROR, null));
            C10257f.m5667e(C10257f.f31917d, "shareToQzone() sdcard is null--end");
            C10266d.m5641a().m5640a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_NOSD_ERROR);
            return;
        }
        if (this.f31302a) {
            if (TextUtils.isEmpty(str2)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_NULL_ERROR, null));
                C10257f.m5667e(C10257f.f31917d, "shareToQzone() targetUrl null error--end");
                C10266d.m5641a().m5640a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_NULL_ERROR);
                return;
            } else if (!Util.isValidUrl(str2)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_ERROR, null));
                C10257f.m5667e(C10257f.f31917d, "shareToQzone() targetUrl error--end");
                C10266d.m5641a().m5640a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_ERROR);
                return;
            }
        }
        if (this.f31303b) {
            bundle.putString("title", "");
            bundle.putString("summary", "");
        } else if (this.f31304c && Util.isEmpty(str)) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_TITLE_NULL_ERROR, null));
            C10257f.m5667e(C10257f.f31917d, "shareToQzone() title is null--end");
            C10266d.m5641a().m5640a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() title is null");
            return;
        } else {
            if (!Util.isEmpty(str) && str.length() > 200) {
                bundle.putString("title", Util.subString(str, 200, null, null));
            }
            if (!Util.isEmpty(string2) && string2.length() > 600) {
                bundle.putString("summary", Util.subString(string2, 600, null, null));
            }
        }
        if (!TextUtils.isEmpty(applicationLable)) {
            bundle.putString("appName", applicationLable);
        }
        if (stringArrayList != null && (stringArrayList == null || stringArrayList.size() != 0)) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < stringArrayList.size()) {
                    String str3 = stringArrayList.get(i3);
                    if (!Util.isValidUrl(str3) && !Util.isValidPath(str3)) {
                        stringArrayList.remove(i3);
                    }
                    i2 = i3 + 1;
                } else if (stringArrayList.size() == 0) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
                    C10257f.m5667e(C10257f.f31917d, "shareToQzone() MSG_PARAM_IMAGE_URL_FORMAT_ERROR--end");
                    C10266d.m5641a().m5640a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() ?????????????????????!");
                    return;
                } else {
                    bundle.putStringArrayList("imageUrl", stringArrayList);
                }
            }
        } else if (this.f31305d) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_ERROR, null));
            C10257f.m5667e(C10257f.f31917d, "shareToQzone() imageUrl is null -- end");
            C10266d.m5641a().m5640a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
            return;
        }
        if (SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_4_6_0) >= 0) {
            C10146a.m6060a(activity, stringArrayList, new AsynLoadImgBack() { // from class: com.tencent.connect.share.QzoneShare.1
                @Override // com.tencent.open.utils.AsynLoadImgBack
                public void batchSaved(int i4, ArrayList<String> arrayList) {
                    if (i4 == 0) {
                        bundle.putStringArrayList("imageUrl", arrayList);
                    }
                    QzoneShare.this.m6065a(activity, bundle, iUiListener);
                }

                @Override // com.tencent.open.utils.AsynLoadImgBack
                public void saved(int i4, String str4) {
                }
            });
        } else if (SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_4_2_0) < 0 || SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_4_6_0) >= 0) {
            m6062b(activity, bundle, iUiListener);
        } else {
            QQShare qQShare = new QQShare(activity, this.mToken);
            if (stringArrayList != null && stringArrayList.size() > 0) {
                String str4 = stringArrayList.get(0);
                if (i == 5 && !Util.fileExists(str4)) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_MUST_BE_LOCAL, null));
                    C10257f.m5667e(C10257f.f31917d, "shareToQzone()???Q????????????????????????????????????????????????");
                    C10266d.m5641a().m5640a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone()???Q????????????????????????????????????????????????");
                    return;
                }
                bundle.putString("imageLocalUrl", str4);
            }
            if (SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_4_5_0) >= 0) {
                bundle.putInt("cflag", 1);
            }
            qQShare.shareToQQ(activity, bundle, iUiListener);
        }
        C10257f.m5670c(C10257f.f31917d, "shareToQzone() --end");
    }
}
