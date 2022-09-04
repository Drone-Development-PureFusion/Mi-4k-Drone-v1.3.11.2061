package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.analytics.p229a.C3833b;
import com.google.android.gms.internal.ajp;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.common.util.z */
/* loaded from: classes2.dex */
public class C4703z {

    /* renamed from: a */
    private static final Method f17308a = m23088a();

    /* renamed from: b */
    private static final Method f17309b = m23081b();

    /* renamed from: c */
    private static final Method f17310c = m23079c();

    /* renamed from: d */
    private static final Method f17311d = m23078d();

    /* renamed from: e */
    private static final Method f17312e = m23077e();

    /* renamed from: a */
    public static int m23084a(WorkSource workSource) {
        if (f17310c != null) {
            try {
                return ((Integer) f17310c.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static WorkSource m23087a(int i, String str) {
        WorkSource workSource = new WorkSource();
        m23082a(workSource, i, str);
        return workSource;
    }

    /* renamed from: a */
    public static WorkSource m23085a(Context context, String str) {
        if (context == null || context.getPackageManager() == null) {
            return null;
        }
        try {
            ApplicationInfo m17110a = ajp.m17106b(context).m17110a(str, 0);
            if (m17110a != null) {
                return m23087a(m17110a.uid, str);
            }
            String valueOf = String.valueOf(str);
            Log.e("WorkSourceUtil", valueOf.length() != 0 ? "Could not get applicationInfo from package: ".concat(valueOf) : new String("Could not get applicationInfo from package: "));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf2 = String.valueOf(str);
            Log.e("WorkSourceUtil", valueOf2.length() != 0 ? "Could not find package: ".concat(valueOf2) : new String("Could not find package: "));
            return null;
        }
    }

    /* renamed from: a */
    public static String m23083a(WorkSource workSource, int i) {
        if (f17312e != null) {
            try {
                return (String) f17312e.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Method m23088a() {
        try {
            return WorkSource.class.getMethod(C3833b.f14899c, Integer.TYPE);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m23082a(WorkSource workSource, int i, String str) {
        if (f17309b != null) {
            if (str == null) {
                str = "";
            }
            try {
                f17309b.invoke(workSource, Integer.valueOf(i), str);
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else if (f17308a == null) {
        } else {
            try {
                f17308a.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    /* renamed from: a */
    public static boolean m23086a(Context context) {
        return (context == null || context.getPackageManager() == null || ajp.m17106b(context).m17109a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    /* renamed from: b */
    private static Method m23081b() {
        if (C4696s.m23107g()) {
            try {
                return WorkSource.class.getMethod(C3833b.f14899c, Integer.TYPE, String.class);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static List<String> m23080b(WorkSource workSource) {
        int m23084a = workSource == null ? 0 : m23084a(workSource);
        if (m23084a == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < m23084a; i++) {
            String m23083a = m23083a(workSource, i);
            if (!C4700w.m23093a(m23083a)) {
                arrayList.add(m23083a);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private static Method m23079c() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m23078d() {
        try {
            return WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m23077e() {
        if (C4696s.m23107g()) {
            try {
                return WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
