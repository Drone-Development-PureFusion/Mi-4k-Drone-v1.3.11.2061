package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.analytics.internal.C3892f;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
/* renamed from: com.google.android.gms.analytics.f */
/* loaded from: classes2.dex */
public class C3851f implements AbstractC3831a {

    /* renamed from: a */
    private final TreeSet<String> f14932a = new TreeSet<>();

    public C3851f(Context context, Collection<String> collection) {
        m26526a(context, collection);
    }

    @Override // com.google.android.gms.analytics.AbstractC3831a
    /* renamed from: a */
    public String mo26525a(String str, Throwable th) {
        return m26523a(m26524a(th), m26522b(m26524a(th)), str);
    }

    /* renamed from: a */
    protected String m26523a(Throwable th, StackTraceElement stackTraceElement, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getSimpleName());
        if (stackTraceElement != null) {
            String[] split = stackTraceElement.getClassName().split("\\.");
            String str2 = "unknown";
            if (split != null && split.length > 0) {
                str2 = split[split.length - 1];
            }
            sb.append(String.format(" (@%s:%s:%s)", str2, stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())));
        }
        if (str != null) {
            sb.append(String.format(" {%s}", str));
        }
        return sb.toString();
    }

    /* renamed from: a */
    protected Throwable m26524a(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    /* renamed from: a */
    public void m26526a(Context context, Collection<String> collection) {
        this.f14932a.clear();
        HashSet<String> hashSet = new HashSet();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            try {
                String packageName = context.getApplicationContext().getPackageName();
                this.f14932a.add(packageName);
                ActivityInfo[] activityInfoArr = context.getApplicationContext().getPackageManager().getPackageInfo(packageName, 1).activities;
                if (activityInfoArr != null) {
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        hashSet.add(activityInfo.packageName);
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                C3892f.m26295a("No package found");
            }
        }
        for (String str : hashSet) {
            Iterator<String> it2 = this.f14932a.iterator();
            boolean z = true;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                if (str.startsWith(next)) {
                    z = false;
                } else if (next.startsWith(str)) {
                    this.f14932a.remove(next);
                }
            }
            if (z) {
                this.f14932a.add(str);
            }
        }
    }

    /* renamed from: b */
    protected StackTraceElement m26522b(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null || stackTrace.length == 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Iterator<String> it2 = this.f14932a.iterator();
            while (it2.hasNext()) {
                if (className.startsWith(it2.next())) {
                    return stackTraceElement;
                }
            }
        }
        return stackTrace[0];
    }
}
