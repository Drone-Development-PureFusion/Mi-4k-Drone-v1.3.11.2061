package com.google.android.gms.internal;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.internal.C4558ab;
import com.xiaomi.mipush.sdk.Constants;
import org.p286a.p287a.p299f.p302c.C11125l;
/* loaded from: classes2.dex */
public class ajl {

    /* renamed from: a */
    private final String f22021a;

    /* renamed from: b */
    private final String f22022b;

    /* renamed from: c */
    private final C4558ab f22023c;

    /* renamed from: d */
    private final int f22024d;

    private ajl(String str, String str2) {
        this.f22022b = str2;
        this.f22021a = str;
        this.f22023c = new C4558ab(str);
        this.f22024d = m17119a();
    }

    public ajl(String str, String... strArr) {
        this(str, m17116a(strArr));
    }

    /* renamed from: a */
    private int m17119a() {
        if (Build.VERSION.SDK_INT == 23) {
            String valueOf = String.valueOf(this.f22021a);
            String property = System.getProperty(valueOf.length() != 0 ? "log.tag.".concat(valueOf) : new String("log.tag."));
            if (property != null) {
                char c = 65535;
                switch (property.hashCode()) {
                    case -880503115:
                        if (property.equals("SUPPRESS")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 2251950:
                        if (property.equals("INFO")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 2656902:
                        if (property.equals("WARN")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 64921139:
                        if (property.equals("DEBUG")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 66247144:
                        if (property.equals("ERROR")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1069090146:
                        if (property.equals("VERBOSE")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1940088646:
                        if (property.equals("ASSERT")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return 2;
                    case 1:
                        return 3;
                    case 2:
                        return 4;
                    case 3:
                        return 5;
                    case 4:
                        return 6;
                    case 5:
                        return 7;
                    case 6:
                        return Integer.MAX_VALUE;
                    default:
                        return 4;
                }
            }
        }
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f22021a, i)) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    private static String m17116a(String... strArr) {
        if (strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (String str : strArr) {
            if (sb.length() > 1) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(str);
        }
        sb.append(']').append(C11125l.f35805c);
        return sb.toString();
    }

    /* renamed from: a */
    public void m17117a(String str, Object... objArr) {
        if (m17118a(2)) {
            Log.v(this.f22021a, m17113d(str, objArr));
        }
    }

    /* renamed from: a */
    public boolean m17118a(int i) {
        return this.f22024d <= i;
    }

    /* renamed from: b */
    public void m17115b(String str, Object... objArr) {
        Log.i(this.f22021a, m17113d(str, objArr));
    }

    /* renamed from: c */
    public void m17114c(String str, Object... objArr) {
        Log.w(this.f22021a, m17113d(str, objArr));
    }

    /* renamed from: d */
    protected String m17113d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return this.f22022b.concat(str);
    }
}
