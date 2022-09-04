package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.p255mi.live.openlivesdk.C10024b;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.channel.commonutils.android.C10394e;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10405a;
import com.xiaomi.channel.commonutils.network.C10421b;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.channel.commonutils.string.C10433d;
import com.xiaomi.market.sdk.C10445j;
import com.xiaomi.market.sdk.C10447l;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.smack.C10718b;
import java.util.TreeMap;
import org.json.JSONObject;
/* renamed from: com.xiaomi.push.service.o */
/* loaded from: classes.dex */
public class C10686o {

    /* renamed from: a */
    private static C10685n f33213a;

    /* renamed from: b */
    private static AbstractC10687a f33214b;

    /* renamed from: com.xiaomi.push.service.o$a */
    /* loaded from: classes2.dex */
    public interface AbstractC10687a {
        /* renamed from: a */
        void m4131a();
    }

    /* renamed from: a */
    public static synchronized C10685n m4137a(Context context) {
        C10685n c10685n = null;
        synchronized (C10686o.class) {
            if (f33213a != null) {
                c10685n = f33213a;
            } else {
                SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_account", 0);
                String string = sharedPreferences.getString("uuid", null);
                String string2 = sharedPreferences.getString(Constants.EXTRA_KEY_TOKEN, null);
                String string3 = sharedPreferences.getString("security", null);
                String string4 = sharedPreferences.getString("app_id", null);
                String string5 = sharedPreferences.getString("app_token", null);
                String string6 = sharedPreferences.getString(C10447l.PACKAGE_NAME, null);
                String string7 = sharedPreferences.getString("device_id", null);
                int i = sharedPreferences.getInt("env_type", 1);
                if (!TextUtils.isEmpty(string7) && string7.startsWith("a-")) {
                    string7 = C10394e.m5308e(context);
                    sharedPreferences.edit().putString("device_id", string7).commit();
                }
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                    String m5308e = C10394e.m5308e(context);
                    if ("com.xiaomi.xmsf".equals(context.getPackageName()) || TextUtils.isEmpty(m5308e) || TextUtils.isEmpty(string7) || string7.equals(m5308e)) {
                        f33213a = new C10685n(string, string2, string3, string4, string5, string6, i);
                        c10685n = f33213a;
                    } else {
                        AbstractC10404b.m5264d("erase the old account.");
                        m4133b(context);
                    }
                }
            }
        }
        return c10685n;
    }

    /* renamed from: a */
    public static synchronized C10685n m4135a(Context context, String str, String str2, String str3) {
        PackageInfo packageInfo;
        C10685n c10685n = null;
        synchronized (C10686o.class) {
            TreeMap treeMap = new TreeMap();
            treeMap.put("devid", C10394e.m5313a(context));
            String str4 = m4132c(context) ? "1000271" : str2;
            String str5 = m4132c(context) ? "420100086271" : str3;
            String str6 = m4132c(context) ? "com.xiaomi.xmsf" : str;
            treeMap.put("appid", str4);
            treeMap.put("apptoken", str5);
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str6, 16384);
            } catch (Exception e) {
                AbstractC10404b.m5267a(e);
                packageInfo = null;
            }
            treeMap.put("appversion", packageInfo != null ? String.valueOf(packageInfo.versionCode) : "0");
            treeMap.put("sdkversion", Integer.toString(26));
            treeMap.put(C10024b.f30904g, str6);
            treeMap.put("model", Build.MODEL);
            treeMap.put(Constants.EXTRA_KEY_IMEI_MD5, C10433d.m5176a(C10394e.m5310c(context)));
            treeMap.put(C10445j.f32457ac, Build.VERSION.RELEASE + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Build.VERSION.INCREMENTAL);
            int m5312b = C10394e.m5312b();
            if (m5312b >= 0) {
                treeMap.put("space_id", Integer.toString(m5312b));
            }
            String m5176a = C10433d.m5176a(C10394e.m5306g(context));
            if (!TextUtils.isEmpty(m5176a)) {
                treeMap.put("mac_address", m5176a);
            }
            treeMap.put("android_id", C10394e.m5311b(context));
            C10421b m5226a = C10423d.m5226a(context, m4138a(), treeMap);
            String str7 = "";
            if (m5226a != null) {
                str7 = m5226a.m5231a();
            }
            if (!TextUtils.isEmpty(str7)) {
                JSONObject jSONObject = new JSONObject(str7);
                if (jSONObject.getInt(XiaomiOAuthConstants.EXTRA_CODE_2) == 0) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(UriUtil.DATA_SCHEME);
                    c10685n = new C10685n(jSONObject2.getString("userId") + "@xiaomi.com/an" + C10433d.m5177a(6), jSONObject2.getString(Constants.EXTRA_KEY_TOKEN), jSONObject2.getString("ssecurity"), str4, str5, str6, C10405a.m5259c());
                    m4136a(context, c10685n);
                    f33213a = c10685n;
                } else {
                    C10690r.m4120a(context, jSONObject.getInt(XiaomiOAuthConstants.EXTRA_CODE_2), jSONObject.optString("description"));
                    AbstractC10404b.m5269a(str7);
                }
            }
        }
        return c10685n;
    }

    /* renamed from: a */
    public static String m4138a() {
        if (C10405a.m5260b()) {
            return "http://" + C10718b.f33420c + ":9085/pass/register";
        }
        return "https://" + (C10405a.m5262a() ? "sandbox.xmpush.xiaomi.com" : "register.xmpush.xiaomi.com") + "/pass/register";
    }

    /* renamed from: a */
    public static void m4136a(Context context, C10685n c10685n) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putString("uuid", c10685n.f33206a);
        edit.putString("security", c10685n.f33208c);
        edit.putString(Constants.EXTRA_KEY_TOKEN, c10685n.f33207b);
        edit.putString("app_id", c10685n.f33209d);
        edit.putString(C10447l.PACKAGE_NAME, c10685n.f33211f);
        edit.putString("app_token", c10685n.f33210e);
        edit.putString("device_id", C10394e.m5308e(context));
        edit.putInt("env_type", c10685n.f33212g);
        edit.commit();
        m4134b();
    }

    /* renamed from: b */
    public static void m4134b() {
        if (f33214b != null) {
            f33214b.m4131a();
        }
    }

    /* renamed from: b */
    public static void m4133b(Context context) {
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        f33213a = null;
        m4134b();
    }

    /* renamed from: c */
    private static boolean m4132c(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }
}
