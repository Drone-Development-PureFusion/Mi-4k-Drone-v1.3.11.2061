package com.tencent.open.yyb;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.fimi.soul.utils.C3115ay;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.yyb.C10316a;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class AppbarAgent extends BaseApi {
    public static final String TO_APPBAR_DETAIL = "siteIndex";
    public static final String TO_APPBAR_NEWS = "myMessage";
    public static final String TO_APPBAR_SEND_BLOG = "newThread";
    public static final String wx_appid = "wx8e8dc60535c9cd93";

    /* renamed from: a */
    private Bundle f32068a;

    /* renamed from: b */
    private String f32069b;

    public AppbarAgent(QQToken qQToken) {
        super(qQToken);
    }

    /* renamed from: a */
    private String m5558a() {
        Bundle bundle = new Bundle();
        if (this.mToken != null && this.mToken.getAppId() != null && this.mToken.getAccessToken() != null && this.mToken.getOpenId() != null) {
            bundle.putString("qOpenAppId", this.mToken.getAppId());
            bundle.putString("qOpenId", this.mToken.getOpenId());
            bundle.putString("qAccessToken", this.mToken.getAccessToken());
        }
        bundle.putString("qPackageName", Global.getContext().getPackageName());
        return "&" + m5556a(bundle);
    }

    /* renamed from: a */
    private String m5556a(Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            sb.append(str).append("=").append(bundle.get(str)).append("&");
        }
        String sb2 = sb.toString();
        if (sb2.endsWith("&")) {
            sb2 = sb2.substring(0, sb2.length() - 1);
        }
        C10257f.m5673b("AppbarAgent", "-->encodeParams, result: " + sb2);
        return sb2;
    }

    /* renamed from: a */
    private void m5557a(Activity activity, String str) {
        if (this.mToken == null) {
            return;
        }
        Intent intent = new Intent(activity, AppbarActivity.class);
        intent.putExtra("appid", this.mToken.getAppId());
        if (this.mToken.getAccessToken() != null && this.mToken.getOpenId() != null) {
            C10316a.C10318a c10318a = new C10316a.C10318a();
            c10318a.f32077b = this.mToken.getAccessToken();
            c10318a.f32078c = Long.parseLong(this.mToken.getAppId());
            c10318a.f32076a = this.mToken.getOpenId();
            C10316a.m5546a(activity, str, this.mToken.getOpenId(), this.mToken.getAccessToken(), this.mToken.getAppId());
        }
        intent.putExtra("url", str);
        C10257f.m5673b("AppbarAgent", "-->(AppbarAgent)startAppbar H5 : url = " + str);
        try {
            activity.startActivityForResult(intent, Constants.REQUEST_APPBAR);
        } catch (Exception e) {
            C10257f.m5673b("AppbarAgent", "-->(AppbarAgent)startAppbar : activity not found, start H5");
        }
    }

    /* renamed from: a */
    private boolean m5555a(String str) {
        return TO_APPBAR_DETAIL.equals(str) || TO_APPBAR_NEWS.equals(str) || TO_APPBAR_SEND_BLOG.equals(str) || "sId".equals(str) || "toThread".equals(str);
    }

    /* renamed from: b */
    private Bundle m5553b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("pkgName", Global.getContext().getPackageName());
        if (!TO_APPBAR_DETAIL.equals(str) && !TO_APPBAR_SEND_BLOG.equals(str)) {
            if (TO_APPBAR_NEWS.equals(str)) {
                bundle.putString("source", "myapp");
            } else if ("sId".equals(str)) {
                if (this.f32068a != null) {
                    bundle.putAll(this.f32068a);
                }
            } else if ("toThread".equals(str)) {
                str = String.format("sId/t/%s", this.f32069b);
            }
        }
        bundle.putString(C3115ay.f11611a, str);
        return bundle;
    }

    /* renamed from: b */
    private String m5554b() {
        try {
            PackageInfo packageInfo = Global.getContext().getPackageManager().getPackageInfo("com.tencent.android.qqdownloader", 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private String m5552c(String str) {
        return "http://m.wsq.qq.com/direct?" + m5556a(m5553b(str));
    }

    /* renamed from: d */
    private boolean m5551d(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("^[1-9][0-9]*$", str);
    }

    public void startAppbar(Activity activity, String str) {
        if (!m5555a(str)) {
            Toast.makeText(activity, Constants.MSG_PARAM_ERROR, 0).show();
            return;
        }
        String m5552c = m5552c(str);
        String m5554b = m5554b();
        if (TextUtils.isEmpty(m5554b) || SystemUtils.compareVersion(m5554b, "4.2") < 0) {
            m5557a(activity, m5552c);
            return;
        }
        String str2 = m5552c + m5558a();
        C10257f.m5673b("AppbarAgent", "-->(AppbarAgent)startAppbar : yybUrl = " + str2);
        try {
            Intent intent = new Intent();
            intent.setClassName("com.tencent.android.qqdownloader", "com.tencent.assistant.activity.ExportBrowserActivity");
            intent.putExtra("com.tencent.assistant.BROWSER_URL", str2);
            activity.startActivity(intent);
            activity.overridePendingTransition(17432576, 17432577);
        } catch (Exception e) {
            C10257f.m5673b("AppbarAgent", "-->(AppbarAgent)startAppbar : ExportBrowserActivity not found, start H5");
            m5557a(activity, m5552c);
        }
    }

    public void startAppbarLabel(Activity activity, String str) {
        if (TextUtils.isEmpty(str)) {
            Toast.makeText(activity, Constants.MSG_PARAM_ERROR, 0).show();
            return;
        }
        this.f32068a = new Bundle();
        this.f32068a.putString("params", "label/" + str);
        startAppbar(activity, "sId");
    }

    public void startAppbarThread(Activity activity, String str) {
        if (!m5551d(str)) {
            Toast.makeText(activity, Constants.MSG_PARAM_ERROR, 0).show();
            return;
        }
        this.f32069b = str;
        startAppbar(activity, "toThread");
    }
}
