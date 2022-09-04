package p000a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.tencent.open.GameAppOperation;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c;
/* renamed from: a.k */
/* loaded from: classes.dex */
public class C0017k {

    /* renamed from: a */
    public static final String f41a = "com.parse.bolts.measurement_event";

    /* renamed from: b */
    public static final String f42b = "event_name";

    /* renamed from: c */
    public static final String f43c = "event_args";

    /* renamed from: d */
    public static final String f44d = "al_nav_out";

    /* renamed from: e */
    public static final String f45e = "al_nav_in";

    /* renamed from: f */
    private Context f46f;

    /* renamed from: g */
    private String f47g;

    /* renamed from: h */
    private Bundle f48h;

    private C0017k(Context context, String str, Bundle bundle) {
        this.f46f = context.getApplicationContext();
        this.f47g = str;
        this.f48h = bundle;
    }

    /* renamed from: a */
    private static Bundle m39941a(Context context, String str, Bundle bundle, Intent intent) {
        Bundle bundle2 = new Bundle();
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity != null) {
            bundle2.putString(AbstractC0436c.f562i, resolveActivity.getShortClassName());
        }
        if (f44d.equals(str)) {
            if (resolveActivity != null) {
                bundle2.putString("package", resolveActivity.getPackageName());
            }
            if (intent.getData() != null) {
                bundle2.putString("outputURL", intent.getData().toString());
            }
            if (intent.getScheme() != null) {
                bundle2.putString("outputURLScheme", intent.getScheme());
            }
        } else if (f45e.equals(str)) {
            if (intent.getData() != null) {
                bundle2.putString("inputURL", intent.getData().toString());
            }
            if (intent.getScheme() != null) {
                bundle2.putString("inputURLScheme", intent.getScheme());
            }
        }
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof Bundle) {
                for (String str3 : ((Bundle) obj).keySet()) {
                    String m39940a = m39940a(((Bundle) obj).get(str3));
                    if (str2.equals("referer_app_link")) {
                        if (str3.equalsIgnoreCase("url")) {
                            bundle2.putString("refererURL", m39940a);
                        } else if (str3.equalsIgnoreCase(GameAppOperation.QQFAV_DATALINE_APPNAME)) {
                            bundle2.putString("refererAppName", m39940a);
                        } else if (str3.equalsIgnoreCase("package")) {
                            bundle2.putString("sourceApplication", m39940a);
                        }
                    }
                    bundle2.putString(str2 + "/" + str3, m39940a);
                }
            } else {
                String m39940a2 = m39940a(obj);
                if (str2.equals("target_url")) {
                    Uri parse = Uri.parse(m39940a2);
                    bundle2.putString("targetURL", parse.toString());
                    bundle2.putString("targetURLHost", parse.getHost());
                } else {
                    bundle2.putString(str2, m39940a2);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: a */
    private static String m39940a(Object obj) {
        String str = null;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj.toString();
        }
        try {
            str = obj instanceof Collection ? new JSONArray((Collection) obj).toString() : obj instanceof Map ? new JSONObject((Map) obj).toString() : obj.toString();
            return str;
        } catch (Exception e) {
            return str;
        }
    }

    /* renamed from: a */
    private void m39943a() {
        if (this.f47g == null) {
            Log.d(getClass().getName(), "Event name is required");
        }
        try {
            Class<?> cls = Class.forName("android.support.v4.content.LocalBroadcastManager");
            Method method = cls.getMethod("getInstance", Context.class);
            Method method2 = cls.getMethod("sendBroadcast", Intent.class);
            Object invoke = method.invoke(null, this.f46f);
            Intent intent = new Intent(f41a);
            intent.putExtra(f42b, this.f47g);
            intent.putExtra(f43c, this.f48h);
            method2.invoke(invoke, intent);
        } catch (Exception e) {
            Log.d(getClass().getName(), "LocalBroadcastManager in android support library is required to raise bolts event.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m39942a(Context context, String str, Intent intent, Map<String, String> map) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        if (intent != null) {
            Bundle m39953a = C0010f.m39953a(intent);
            if (m39953a != null) {
                bundle = m39941a(context, str, m39953a, intent);
                if (map != null) {
                    for (String str2 : map.keySet()) {
                        bundle.putString(str2, map.get(str2));
                    }
                }
                new C0017k(context, str, bundle).m39943a();
            }
            Uri data = intent.getData();
            if (data != null) {
                bundle2.putString("intentData", data.toString());
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str3 : extras.keySet()) {
                    bundle2.putString(str3, m39940a(extras.get(str3)));
                }
            }
        }
        bundle = bundle2;
        if (map != null) {
        }
        new C0017k(context, str, bundle).m39943a();
    }
}
