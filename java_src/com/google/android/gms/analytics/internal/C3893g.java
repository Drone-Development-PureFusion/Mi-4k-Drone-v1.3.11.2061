package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.google.android.gms.analytics.internal.g */
/* loaded from: classes2.dex */
public class C3893g extends AbstractC3920t {

    /* renamed from: a */
    private static String f15087a = "3";

    /* renamed from: b */
    private static String f15088b = "01VDIWEA?";

    /* renamed from: c */
    private static C3893g f15089c;

    public C3893g(C3922v c3922v) {
        super(c3922v);
    }

    /* renamed from: b */
    public static C3893g m26287b() {
        return f15089c;
    }

    /* renamed from: a */
    protected String m26289a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object l = obj instanceof Integer ? new Long(((Integer) obj).intValue()) : obj;
        if (!(l instanceof Long)) {
            return l instanceof Boolean ? String.valueOf(l) : l instanceof Throwable ? l.getClass().getCanonicalName() : Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        } else if (Math.abs(((Long) l).longValue()) < 100) {
            return String.valueOf(l);
        } else {
            String str = String.valueOf(l).charAt(0) == '-' ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "";
            String valueOf = String.valueOf(Math.abs(((Long) l).longValue()));
            return str + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
    }

    @Override // com.google.android.gms.analytics.internal.AbstractC3920t
    /* renamed from: a */
    protected void mo26047a() {
        synchronized (C3893g.class) {
            f15089c = this;
        }
    }

    /* renamed from: a */
    public void m26291a(int i, String str, Object obj, Object obj2, Object obj3) {
        String m26339a = C3882ao.f15038c.m26339a();
        if (Log.isLoggable(m26339a, i)) {
            Log.println(i, m26339a, c(str, obj, obj2, obj3));
        }
        if (i >= 5) {
            m26286b(i, str, obj, obj2, obj3);
        }
    }

    /* renamed from: a */
    public void m26290a(C3887c c3887c, String str) {
        if (str == null) {
            str = "no reason provided";
        }
        String c3887c2 = c3887c != null ? c3887c.toString() : "no hit data";
        String valueOf = String.valueOf(str);
        d(valueOf.length() != 0 ? "Discarding hit. ".concat(valueOf) : new String("Discarding hit. "), c3887c2);
    }

    /* renamed from: a */
    public void m26288a(Map<String, String> map, String str) {
        String str2;
        if (str == null) {
            str = "no reason provided";
        }
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(C0494h.f736x);
                }
                sb.append(entry.getKey());
                sb.append(SignatureVisitor.INSTANCEOF);
                sb.append(entry.getValue());
            }
            str2 = sb.toString();
        } else {
            str2 = "no hit data";
        }
        String valueOf = String.valueOf(str);
        d(valueOf.length() != 0 ? "Discarding hit. ".concat(valueOf) : new String("Discarding hit. "), str2);
    }

    /* renamed from: b */
    public synchronized void m26286b(int i, String str, Object obj, Object obj2, Object obj3) {
        int i2 = 0;
        synchronized (this) {
            C4588d.m23627a(str);
            if (i >= 0) {
                i2 = i;
            }
            int length = i2 >= f15088b.length() ? f15088b.length() - 1 : i2;
            char c = q().m26382b() ? q().m26383a() ? 'P' : 'C' : q().m26383a() ? 'p' : 'c';
            String str2 = f15087a;
            char charAt = f15088b.charAt(length);
            String str3 = C3921u.f15153a;
            String valueOf = String.valueOf(c(str, m26289a(obj), m26289a(obj2), m26289a(obj3)));
            String sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(str3).length() + String.valueOf(valueOf).length()).append(str2).append(charAt).append(c).append(str3).append(":").append(valueOf).toString();
            if (sb.length() > 1024) {
                sb = sb.substring(0, 1024);
            }
            C3897j m26100n = k().m26100n();
            if (m26100n != null) {
                m26100n.m26244g().m26242a(sb);
            }
        }
    }
}
