package com.baidu.tts.p090b.p091a.p093b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p090b.p091a.p093b.C1096f;
import com.baidu.tts.p102f.EnumC1178j;
import com.baidu.tts.p102f.EnumC1180l;
import com.baidu.tts.p105h.p107b.C1193b;
import com.baidu.tts.p114m.C1231b;
/* renamed from: com.baidu.tts.b.a.b.c */
/* loaded from: classes.dex */
public class C1087c {

    /* renamed from: a */
    private C1231b f2505a;

    /* renamed from: b */
    private EnumC1178j f2506b;

    /* renamed from: a */
    private boolean m36703a(int i) {
        return m36700b(i) >= 2;
    }

    /* renamed from: b */
    private int m36700b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 1;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 2;
            case 13:
                return 3;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    private boolean m36701b() {
        EnumC1178j enumC1178j = null;
        try {
            enumC1178j = this.f2505a.m36194c();
        } catch (Exception e) {
        }
        if (this.f2506b == null) {
            if (enumC1178j == null) {
                this.f2506b = EnumC1178j.DEFAULT;
                return true;
            }
            this.f2506b = enumC1178j;
            return true;
        }
        if (enumC1178j != null && !this.f2506b.equals(enumC1178j)) {
            this.f2506b = enumC1178j;
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m36699c(int i) {
        switch (i) {
            case 1:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public void m36702a(C1231b c1231b) {
        this.f2505a = c1231b;
    }

    /* renamed from: a */
    public boolean m36704a() {
        try {
            Context m36283h = C1193b.m36288a().m36283h();
            if (m36283h != null) {
                if (m36701b()) {
                    C1096f.C1098b m36199a = this.f2505a.m36199a();
                    if (this.f2506b.equals(EnumC1178j.HIGH_SPEED_SYNTHESIZE) || this.f2506b.equals(EnumC1178j.HIGH_SPEED_SYNTHESIZE_WIFI)) {
                        m36199a.m36648c(EnumC1180l.FAST_SWITCH.m36311b());
                    } else {
                        m36199a.m36648c(EnumC1180l.MIX_ONLINE_REQUEST_TIMEOUT.m36311b());
                    }
                }
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) m36283h.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    int subtype = activeNetworkInfo.getSubtype();
                    switch (this.f2506b) {
                        case DEFAULT:
                        case HIGH_SPEED_SYNTHESIZE_WIFI:
                            if (m36699c(type) || type == 9) {
                                return true;
                            }
                        case HIGH_SPEED_NETWORK:
                        case HIGH_SPEED_SYNTHESIZE:
                            if (m36699c(type) || type == 9 || m36703a(subtype)) {
                                return true;
                            }
                    }
                }
            }
        } catch (Exception e) {
            LoggerProxy.m36554d("MixStrategy", e.toString());
        }
        return false;
    }
}
