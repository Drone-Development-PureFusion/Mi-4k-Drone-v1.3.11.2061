package com.baidu.tts.p090b.p091a;

import com.baidu.tts.p090b.p091a.p092a.AbstractC1079d;
import com.baidu.tts.p090b.p091a.p092a.C1076c;
import com.baidu.tts.p090b.p091a.p093b.AbstractC1086b;
import com.baidu.tts.p090b.p091a.p093b.C1089d;
import com.baidu.tts.p090b.p091a.p093b.C1092e;
import com.baidu.tts.p090b.p091a.p093b.C1096f;
import com.baidu.tts.p102f.EnumC1174f;
/* renamed from: com.baidu.tts.b.a.a */
/* loaded from: classes.dex */
public class C1072a {

    /* renamed from: a */
    private static volatile C1072a f2490a = null;

    private C1072a() {
    }

    /* renamed from: a */
    private AbstractC1079d m36749a(AbstractC1086b abstractC1086b) {
        C1076c c1076c = new C1076c();
        c1076c.mo36716a(abstractC1086b);
        return c1076c;
    }

    /* renamed from: a */
    public static C1072a m36750a() {
        if (f2490a == null) {
            synchronized (C1072a.class) {
                if (f2490a == null) {
                    f2490a = new C1072a();
                }
            }
        }
        return f2490a;
    }

    /* renamed from: b */
    private AbstractC1079d m36747b() {
        return m36749a(new C1096f());
    }

    /* renamed from: c */
    private AbstractC1079d m36746c() {
        return m36749a(new C1092e());
    }

    /* renamed from: d */
    private AbstractC1079d m36745d() {
        return m36749a(new C1089d());
    }

    /* renamed from: a */
    public AbstractC1079d m36748a(EnumC1174f enumC1174f) {
        switch (enumC1174f) {
            case ONLINE:
                return m36747b();
            case OFFLINE:
                return m36746c();
            case MIX:
                return m36745d();
            default:
                return null;
        }
    }
}
