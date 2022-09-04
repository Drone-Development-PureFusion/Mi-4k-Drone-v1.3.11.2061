package com.tencent.open.p265b;

import android.os.SystemClock;
import com.tencent.open.utils.Util;
/* renamed from: com.tencent.open.b.d */
/* loaded from: classes.dex */
public class C10266d {

    /* renamed from: a */
    protected static C10266d f31934a;

    protected C10266d() {
    }

    /* renamed from: a */
    public static synchronized C10266d m5641a() {
        C10266d c10266d;
        synchronized (C10266d.class) {
            if (f31934a == null) {
                f31934a = new C10266d();
            }
            c10266d = f31934a;
        }
        return c10266d;
    }

    /* renamed from: a */
    public void m5640a(int i, String str, String str2, String str3, String str4, Long l, int i2, int i3, String str5) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
        long j = (l.longValue() == 0 || elapsedRealtime < 0) ? 0L : elapsedRealtime;
        StringBuffer stringBuffer = new StringBuffer("http://c.isdspeed.qq.com/code.cgi");
        stringBuffer.append("?domain=mobile.opensdk.com&cgi=opensdk&type=").append(i).append("&code=").append(i2).append("&time=").append(j).append("&rate=").append(i3).append("&uin=").append(str2).append("&data=");
        C10269g.m5630a().m5623a(stringBuffer.toString(), "GET", Util.composeHaboCgiReportParams(String.valueOf(i), String.valueOf(i2), String.valueOf(j), String.valueOf(i3), str, str2, str3, str4, str5), true);
    }

    /* renamed from: a */
    public void m5639a(String str, String str2, String str3, String str4, String str5, String str6) {
        C10269g.m5630a().m5628a(Util.composeViaReportParams(str, str3, str4, str5, str2, str6), str2, true);
    }

    /* renamed from: a */
    public void m5638a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C10269g.m5630a().m5628a(Util.composeViaReportParams(str, str4, str5, str3, str2, str6, "", str7, str8, "", "", ""), str2, false);
    }

    /* renamed from: a */
    public void m5637a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        C10269g.m5630a().m5628a(Util.composeViaReportParams(str, str4, str5, str3, str2, str6, str7, "", "", str8, str9, str10), str2, false);
    }
}
