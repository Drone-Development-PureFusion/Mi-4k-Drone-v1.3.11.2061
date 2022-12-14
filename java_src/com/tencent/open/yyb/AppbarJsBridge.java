package com.tencent.open.yyb;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.facebook.common.util.UriUtil;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.utils.Util;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* loaded from: classes2.dex */
public class AppbarJsBridge {
    public static final int AUTHORIZE_FAIL = -5;
    public static final String BUTTON_CLICK_CALLBACK_FUNCTION_NAME = "clickCallback";
    public static final String CALLBACK_LOGIN = "loginCallback";
    public static final String CALLBACK_SHARE = "shareCallback";
    public static final int Code_Java_Exception = -3;
    public static final int Code_None = -2;
    public static final int JSBRIDGE_VERSION = 1;
    public static final String JS_BRIDGE_SCHEME = "jsb://";
    public static final String READY_CALLBACK_FUNCTION_NAME = "readyCallback";
    public static final int Result_Fail = -1;
    public static final int Result_OK = 0;
    public static final int SHARE_QQ = 1;
    public static final int SHARE_QZ = 2;
    public static final int SHARE_TIMELINE = 4;
    public static final int SHARE_WX = 3;

    /* renamed from: a */
    private WebView f32070a;

    /* renamed from: b */
    private Activity f32071b;

    public AppbarJsBridge(Activity activity, WebView webView) {
        this.f32071b = activity;
        this.f32070a = webView;
    }

    /* renamed from: a */
    private void m5550a(Uri uri, String str, int i, String str2) {
        C10257f.m5673b(C10257f.f31917d, "-->callAMethod : uri = " + uri);
        if (!m5549a(str)) {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            responseFail(str2, i, str, -5);
            return;
        }
        try {
            AppbarJsBridge.class.getDeclaredMethod(str, Uri.class, Integer.TYPE, String.class, String.class).invoke(this, uri, Integer.valueOf(i), str, str2);
        } catch (Exception e) {
            C10257f.m5673b(C10257f.f31917d, "-->callAMethod : Exception = " + e.getMessage());
            e.printStackTrace();
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            responseFail(str2, i, str, -3);
        }
    }

    /* renamed from: a */
    private boolean m5549a(String str) {
        return true;
    }

    public void callback(String str, String str2) {
        if (this.f32070a != null) {
            StringBuffer stringBuffer = new StringBuffer("javascript:");
            stringBuffer.append("if(!!").append(str).append("){");
            stringBuffer.append(str);
            stringBuffer.append("(");
            stringBuffer.append(str2);
            stringBuffer.append(")}");
            this.f32070a.loadUrl(stringBuffer.toString());
        }
    }

    public void clickCallback() {
        response(BUTTON_CLICK_CALLBACK_FUNCTION_NAME, 0, null, "");
    }

    public void closeWebView(Uri uri, int i, String str, String str2) {
        C10257f.m5673b(C10257f.f31917d, "-->closeWebView : url = " + uri);
        this.f32071b.finish();
    }

    public void getAppInfo(Uri uri, int i, String str, String str2) {
        String[] split;
        String queryParameter = uri.getQueryParameter("packagenames");
        C10257f.m5673b(C10257f.f31917d, "-->getAppInfo : packageNames = " + queryParameter);
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(str2) || (split = queryParameter.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) == null || split.length == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str3 : split) {
            String trim = str3.trim();
            PackageInfo packageInfo = null;
            try {
                packageInfo = this.f32071b.getPackageManager().getPackageInfo(trim, 0);
            } catch (PackageManager.NameNotFoundException e) {
                C10257f.m5673b(C10257f.f31917d, "-->getAppInfo : NameNotFoundException e1");
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (packageInfo != null) {
                    jSONObject2.put("install", 1);
                    jSONObject2.put("appName", packageInfo.applicationInfo.name);
                    jSONObject2.put("verCode", packageInfo.versionCode);
                    jSONObject2.put("verName", packageInfo.versionName);
                } else {
                    jSONObject2.put("install", 0);
                }
                jSONObject.put(trim, jSONObject2);
            } catch (Exception e2) {
                responseFail(str2, i, str, -3);
            }
        }
        C10257f.m5673b(C10257f.f31917d, "-->getAppInfo : result = " + jSONObject.toString());
        response(str2, i, str, jSONObject.toString());
    }

    public int getVersion() {
        return 1;
    }

    public void invoke(String str) {
        int i;
        C10257f.m5673b(C10257f.f31917d, "-->invoke : url = " + str);
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        C10257f.m5673b(C10257f.f31917d, "-->invoke : hostAsMethodName = " + host);
        if (TextUtils.isEmpty(host)) {
            return;
        }
        List<String> pathSegments = parse.getPathSegments();
        String str2 = null;
        if (pathSegments == null || pathSegments.size() <= 0) {
            i = 0;
        } else {
            i = Util.parseIntValue(pathSegments.get(0));
            if (pathSegments.size() > 1) {
                str2 = pathSegments.get(1);
            }
        }
        C10257f.m5673b(C10257f.f31917d, "-->invoke : seqid = " + i + " callbackName = " + str2);
        if (!host.equals("callBatch")) {
            m5550a(parse, host, i, str2);
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(parse.getQueryParameter("param"));
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string = jSONObject.getString("method");
                int i3 = jSONObject.getInt("seqid");
                String optString = jSONObject.optString("callback");
                JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                StringBuilder sb = new StringBuilder();
                sb.append(JS_BRIDGE_SCHEME).append(string).append("/").append(i3).append("/").append(!TextUtils.isEmpty(optString) ? optString : "").append(C0363a.f360a);
                if (jSONObject2 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        sb.append(next).append("=").append(Uri.encode(Uri.decode(jSONObject2.getString(next)))).append("&");
                    }
                }
                m5550a(Uri.parse(sb.toString()), string, i3, optString);
            }
        } catch (Exception e) {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            responseFail(str2, i, host, -5);
        }
    }

    public void openLoginActivity(Uri uri, int i, String str, String str2) {
        C10257f.m5673b(C10257f.f31917d, "-->openLoginActivity : url = " + uri);
        ((AppbarActivity) this.f32071b).login();
    }

    public void openNewWindow(Uri uri, int i, String str, String str2) {
        String queryParameter = uri.getQueryParameter("url");
        try {
            Intent intent = new Intent(this.f32071b, AppbarActivity.class);
            intent.putExtra("url", queryParameter);
            this.f32071b.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pageControl(Uri uri, int i, String str, String str2) {
        C10257f.m5673b(C10257f.f31917d, "-->pageControl : url = " + uri);
        int parseIntValue = Util.parseIntValue(uri.getQueryParameter("type"));
        if (this.f32070a != null) {
            if (parseIntValue == 1) {
                this.f32070a.goBack();
            } else if (parseIntValue == 2) {
                this.f32070a.goForward();
            } else {
                this.f32070a.reload();
            }
        }
        response(str2, i, str, "");
    }

    public void ready() {
        response(READY_CALLBACK_FUNCTION_NAME, 1, null, "true");
    }

    public void response(String str, int i, String str2, String str3) {
        response(str, i, str2, str3, null);
    }

    public void response(String str, int i, String str2, String str3, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", 0);
            jSONObject.put(UriUtil.DATA_SCHEME, str3);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("method", str2);
            }
            jSONObject.put("seqid", i);
            if (map != null) {
                for (String str4 : map.keySet()) {
                    jSONObject.put(str4, map.get(str4));
                }
            }
            callback(str, jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void responseFail(String str, int i, String str2, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", -1);
            jSONObject.put(XiaomiOAuthConstants.EXTRA_CODE_2, i2);
            jSONObject.put("method", str2);
            jSONObject.put("seqid", i);
            callback(str, jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void responseShare(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", i + "");
        response(CALLBACK_SHARE, 0, null, "0", hashMap);
    }

    public void responseShareFail(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", i + "");
        response(CALLBACK_SHARE, 0, null, "1", hashMap);
    }

    public void setWebView(Uri uri, int i, String str, String str2) {
        boolean z = true;
        try {
            String queryParameter = uri.getQueryParameter("title");
            int parseIntValue = Util.parseIntValue(uri.getQueryParameter("buttonVisible"), 0);
            if (!TextUtils.isEmpty(queryParameter)) {
                ((AppbarActivity) this.f32071b).setAppbarTitle(queryParameter);
            }
            AppbarActivity appbarActivity = (AppbarActivity) this.f32071b;
            if (parseIntValue != 1) {
                z = false;
            }
            appbarActivity.setShareVisibility(z);
            C10257f.m5673b(C10257f.f31917d, "-->setWebView : url = " + uri + " -- buttonVisiable = " + parseIntValue);
            response(str2, i, str, "");
        } catch (Exception e) {
            responseFail(str2, i, str, -3);
        }
    }

    public void share(Uri uri, int i, String str, String str2) {
        C10257f.m5673b(C10257f.f31917d, "-->share : url = " + uri);
        String queryParameter = uri.getQueryParameter("title");
        String queryParameter2 = uri.getQueryParameter("summary");
        String queryParameter3 = uri.getQueryParameter("iconUrl");
        if (TextUtils.isEmpty(queryParameter3)) {
            queryParameter3 = "http://qzs.qq.com/open/mobile/jsbridge/demo.htm";
        }
        String queryParameter4 = uri.getQueryParameter("jumpUrl");
        C10257f.m5673b(C10257f.f31917d, "-->share : title = " + queryParameter);
        C10257f.m5673b(C10257f.f31917d, "-->share : summary = " + queryParameter2);
        C10257f.m5673b(C10257f.f31917d, "-->share : iconUrl = " + queryParameter3);
        C10257f.m5673b(C10257f.f31917d, "-->share : jumpUrl = " + queryParameter4);
        ShareModel shareModel = new ShareModel();
        shareModel.f32072a = queryParameter;
        shareModel.f32073b = queryParameter2;
        shareModel.f32074c = queryParameter3;
        shareModel.f32075d = queryParameter4;
        ((AppbarActivity) this.f32071b).setShareModel(shareModel);
        switch (Util.parseIntValue(uri.getQueryParameter("type"), 0)) {
            case 1:
                ((AppbarActivity) this.f32071b).shareToQQ();
                return;
            case 2:
                ((AppbarActivity) this.f32071b).shareToQzone();
                return;
            case 3:
                ((AppbarActivity) this.f32071b).shareToWX();
                return;
            case 4:
                ((AppbarActivity) this.f32071b).shareToTimeline();
                return;
            default:
                ((AppbarActivity) this.f32071b).showFloatingDialog();
                return;
        }
    }
}
