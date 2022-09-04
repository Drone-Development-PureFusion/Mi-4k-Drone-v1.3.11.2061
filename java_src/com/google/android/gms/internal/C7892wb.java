package com.google.android.gms.internal;

import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.C3589e;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.drive.AbstractC4808e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
import p005b.p006a.p007a.p029b.p052m.p053a.C0620k;
@aaa
/* renamed from: com.google.android.gms.internal.wb */
/* loaded from: classes.dex */
public final class C7892wb implements AbstractC7877vt {

    /* renamed from: a */
    private final AbstractC7885vv f26032a;

    /* renamed from: b */
    private final C3589e f26033b;

    /* renamed from: c */
    private final C8053yi f26034c;

    /* renamed from: com.google.android.gms.internal.wb$a */
    /* loaded from: classes2.dex */
    public static class C7893a {

        /* renamed from: a */
        private final acy f26035a;

        public C7893a(acy acyVar) {
            this.f26035a = acyVar;
        }

        /* renamed from: a */
        public Intent m13283a(Context context, Map<String, String> map) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
            ResolveInfo m13285a;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            String str = map.get("u");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (this.f26035a != null) {
                str = C3779u.m26890e().m18351a(this.f26035a, str);
            }
            Uri parse = Uri.parse(str);
            boolean parseBoolean = Boolean.parseBoolean(map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean(map.get("use_running_process"));
            Uri build = UriUtil.HTTP_SCHEME.equalsIgnoreCase(parse.getScheme()) ? parse.buildUpon().scheme(UriUtil.HTTPS_SCHEME).build() : UriUtil.HTTPS_SCHEME.equalsIgnoreCase(parse.getScheme()) ? parse.buildUpon().scheme(UriUtil.HTTP_SCHEME).build() : null;
            ArrayList<ResolveInfo> arrayList = new ArrayList<>();
            Intent m13281a = m13281a(parse);
            Intent m13281a2 = m13281a(build);
            ResolveInfo m13284a = m13284a(context, m13281a, arrayList);
            if (m13284a != null) {
                return m13282a(m13281a, m13284a);
            }
            if (m13281a2 != null && (m13285a = m13285a(context, m13281a2)) != null) {
                Intent m13282a = m13282a(m13281a, m13285a);
                if (m13285a(context, m13282a) != null) {
                    return m13282a;
                }
            }
            if (arrayList.size() == 0) {
                return m13281a;
            }
            if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                Iterator<ResolveInfo> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ResolveInfo next = it2.next();
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.processName.equals(next.activityInfo.packageName)) {
                            return m13282a(m13281a, next);
                        }
                    }
                }
            }
            return parseBoolean ? m13282a(m13281a, arrayList.get(0)) : m13281a;
        }

        /* renamed from: a */
        public Intent m13282a(Intent intent, ResolveInfo resolveInfo) {
            Intent intent2 = new Intent(intent);
            intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            return intent2;
        }

        /* renamed from: a */
        public Intent m13281a(Uri uri) {
            if (uri == null) {
                return null;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(AbstractC4808e.f17570a_);
            intent.setData(uri);
            intent.setAction("android.intent.action.VIEW");
            return intent;
        }

        /* renamed from: a */
        public ResolveInfo m13285a(Context context, Intent intent) {
            return m13284a(context, intent, new ArrayList<>());
        }

        /* renamed from: a */
        public ResolveInfo m13284a(Context context, Intent intent, ArrayList<ResolveInfo> arrayList) {
            ResolveInfo resolveInfo;
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= queryIntentActivities.size()) {
                        break;
                    }
                    ResolveInfo resolveInfo2 = queryIntentActivities.get(i2);
                    if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                    i = i2 + 1;
                }
            }
            resolveInfo = null;
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        }
    }

    public C7892wb(AbstractC7885vv abstractC7885vv, C3589e c3589e, C8053yi c8053yi) {
        this.f26032a = abstractC7885vv;
        this.f26033b = c3589e;
        this.f26034c = c8053yi;
    }

    /* renamed from: a */
    private void m13288a(boolean z) {
        if (this.f26034c != null) {
            this.f26034c.m12919a(z);
        }
    }

    /* renamed from: a */
    private static boolean m13289a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* renamed from: b */
    private static int m13286b(Map<String, String> map) {
        String str = map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return C3779u.m26888g().mo18301b();
            }
            if ("l".equalsIgnoreCase(str)) {
                return C3779u.m26888g().mo18302a();
            }
            if ("c".equalsIgnoreCase(str)) {
                return C3779u.m26888g().mo18290c();
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static void m13287b(acy acyVar, Map<String, String> map) {
        Context context = acyVar.getContext();
        if (TextUtils.isEmpty(map.get("u"))) {
            abr.d("Destination url cannot be empty.");
            return;
        }
        try {
            acyVar.mo18084l().m18177a(new AdLauncherIntentInfoParcel(new C7893a(acyVar).m13283a(context, map)));
        } catch (ActivityNotFoundException e) {
            abr.d(e.getMessage());
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7877vt
    /* renamed from: a */
    public void mo12713a(acy acyVar, Map<String, String> map) {
        String str = map.get("a");
        if (str == null) {
            abr.d("Action missing from an open GMSG.");
        } else if (this.f26033b != null && !this.f26033b.m27402b()) {
            this.f26033b.m27403a(map.get("u"));
        } else {
            acz mo18084l = acyVar.mo18084l();
            if ("expand".equalsIgnoreCase(str)) {
                if (acyVar.mo18080p()) {
                    abr.d("Cannot expand WebView that is already expanded.");
                    return;
                }
                m13288a(false);
                mo18084l.m18165a(m13289a(map), m13286b(map));
            } else if ("webapp".equalsIgnoreCase(str)) {
                String str2 = map.get("u");
                m13288a(false);
                if (str2 != null) {
                    mo18084l.m18164a(m13289a(map), m13286b(map), str2);
                } else {
                    mo18084l.m18163a(m13289a(map), m13286b(map), map.get("html"), map.get("baseurl"));
                }
            } else if (!"in_app_purchase".equalsIgnoreCase(str)) {
                if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase(map.get("system_browser"))) {
                    m13288a(true);
                    m13287b(acyVar, map);
                    return;
                }
                m13288a(true);
                String str3 = map.get("u");
                mo18084l.m18177a(new AdLauncherIntentInfoParcel(map.get(C0620k.f1083a), !TextUtils.isEmpty(str3) ? C3779u.m26890e().m18351a(acyVar, str3) : str3, map.get(C0548a.f931b), map.get("p"), map.get("c"), map.get("f"), map.get("e")));
            } else {
                String str4 = map.get("product_id");
                String str5 = map.get("report_urls");
                if (this.f26032a == null) {
                    return;
                }
                if (str5 == null || str5.isEmpty()) {
                    this.f26032a.mo13296a(str4, new ArrayList<>());
                } else {
                    this.f26032a.mo13296a(str4, new ArrayList<>(Arrays.asList(str5.split(" "))));
                }
            }
        }
    }
}
