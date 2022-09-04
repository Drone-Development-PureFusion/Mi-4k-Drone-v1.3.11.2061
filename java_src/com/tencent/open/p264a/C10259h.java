package com.tencent.open.p264a;

import android.text.format.Time;
import android.util.Log;
import com.fimi.soul.module.setting.newhand.C2954b;
import com.xiaomi.mipush.sdk.Constants;
import org.p286a.p287a.p299f.p302c.C11125l;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.tencent.open.a.h */
/* loaded from: classes2.dex */
public final class C10259h {

    /* renamed from: a */
    public static final C10259h f31921a = new C10259h();

    /* renamed from: a */
    public final String m5662a(int i) {
        switch (i) {
            case 1:
                return "V";
            case 2:
                return "D";
            case 4:
                return "I";
            case 8:
                return "W";
            case 16:
                return "E";
            case 32:
                return "A";
            default:
                return Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
    }

    /* renamed from: a */
    public String m5661a(int i, Thread thread, long j, String str, String str2, Throwable th) {
        long j2 = j % 1000;
        Time time = new Time();
        time.set(j);
        StringBuilder sb = new StringBuilder();
        sb.append(m5662a(i)).append('/').append(time.format("%Y-%m-%d %H:%M:%S")).append(C0494h.f686G);
        if (j2 < 10) {
            sb.append("00");
        } else if (j2 < 100) {
            sb.append('0');
        }
        sb.append(j2).append(C11125l.f35805c).append('[');
        if (thread == null) {
            sb.append(C2954b.f10832au);
        } else {
            sb.append(thread.getName());
        }
        sb.append(']').append('[').append(str).append(']').append(C11125l.f35805c).append(str2).append('\n');
        if (th != null) {
            sb.append("* Exception : \n").append(Log.getStackTraceString(th)).append('\n');
        }
        return sb.toString();
    }
}
