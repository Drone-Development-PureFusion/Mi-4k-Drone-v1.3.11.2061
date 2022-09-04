package com.fimi.soul.biz.p180h;

import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p205i.C2296ab;
/* renamed from: com.fimi.soul.biz.h.a */
/* loaded from: classes.dex */
public class C1849a {

    /* renamed from: b */
    private static C1849a f5026b;

    /* renamed from: a */
    private String f5027a;

    private C1849a() {
    }

    /* renamed from: a */
    public static C1849a m33913a() {
        if (f5026b == null) {
            synchronized (C1849a.class) {
                if (f5026b == null) {
                    f5026b = new C1849a();
                }
            }
        }
        return f5026b;
    }

    /* renamed from: a */
    public void m33912a(final C2296ab c2296ab) {
        if (c2296ab != null) {
            C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.biz.h.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (c2296ab.m32382a() == 0) {
                        C2196c m32373i = c2296ab.m32373i();
                        StringBuilder sb = new StringBuilder();
                        if (m32373i != null) {
                            byte[] m32755f = m32373i.m32755f();
                            for (int i = 0; i < m32755f.length; i++) {
                                sb.append(Character.forDigit((m32755f[i] & 240) >> 4, 16));
                                sb.append(Character.forDigit(m32755f[i] & 15, 16));
                            }
                        }
                        String substring = sb.toString().substring(18, sb.toString().length() - 4);
                        String str = "";
                        String str2 = "";
                        String str3 = "";
                        String str4 = "";
                        if (substring.length() >= 32) {
                            str = substring.substring(0, 8);
                            str2 = substring.substring(8, 16);
                            str3 = substring.substring(16, 24);
                            str4 = substring.substring(24, 32);
                        } else if (substring.length() >= 24) {
                            str = substring.substring(0, 8);
                            str2 = substring.substring(8, 16);
                            str3 = substring.substring(16, 24);
                            str4 = "00000000";
                        } else if (substring.length() >= 16) {
                            str = substring.substring(0, 8);
                            str2 = substring.substring(8, 16);
                            str3 = "00000000";
                            str4 = "00000000";
                        }
                        sb.delete(0, sb.length());
                        sb.append(str4);
                        sb.append(str3);
                        sb.append(str2);
                        sb.append(str);
                        C1849a.this.m33911a(sb.toString());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void m33911a(String str) {
        this.f5027a = str;
    }

    /* renamed from: b */
    public String m33910b() {
        return this.f5027a;
    }
}
