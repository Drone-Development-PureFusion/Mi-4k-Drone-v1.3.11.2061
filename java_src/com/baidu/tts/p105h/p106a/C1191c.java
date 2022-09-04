package com.baidu.tts.p105h.p106a;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.p102f.EnumC1182n;
import java.util.Hashtable;
/* renamed from: com.baidu.tts.h.a.c */
/* loaded from: classes.dex */
public class C1191c {

    /* renamed from: a */
    private static volatile C1191c f3011a = null;

    /* renamed from: b */
    private Hashtable<EnumC1182n, C1190b> f3012b = new Hashtable<>();

    private C1191c() {
    }

    /* renamed from: a */
    public static C1191c m36299a() {
        if (f3011a == null) {
            synchronized (C1191c.class) {
                if (f3011a == null) {
                    f3011a = new C1191c();
                }
            }
        }
        return f3011a;
    }

    /* renamed from: a */
    public TtsError m36297a(EnumC1182n enumC1182n, int i) {
        return m36296a(enumC1182n, i, null);
    }

    /* renamed from: a */
    public TtsError m36296a(EnumC1182n enumC1182n, int i, String str) {
        return m36295a(enumC1182n, i, str, null);
    }

    /* renamed from: a */
    public TtsError m36295a(EnumC1182n enumC1182n, int i, String str, Throwable th) {
        TtsError m36292b = m36292b(enumC1182n);
        m36292b.setCode(i);
        m36292b.setMessage(str);
        m36292b.setThrowable(th);
        return m36292b;
    }

    /* renamed from: a */
    public TtsError m36294a(EnumC1182n enumC1182n, String str) {
        return m36296a(enumC1182n, 0, str);
    }

    /* renamed from: a */
    public TtsError m36293a(EnumC1182n enumC1182n, Throwable th) {
        TtsError m36292b = m36292b(enumC1182n);
        m36292b.setThrowable(th);
        return m36292b;
    }

    /* renamed from: a */
    public C1190b m36298a(EnumC1182n enumC1182n) {
        C1190b c1190b = this.f3012b.get(enumC1182n);
        if (c1190b == null) {
            C1190b c1190b2 = new C1190b(enumC1182n);
            this.f3012b.put(enumC1182n, c1190b2);
            return c1190b2;
        }
        return c1190b;
    }

    /* renamed from: b */
    public TtsError m36292b(EnumC1182n enumC1182n) {
        C1190b m36298a = m36298a(enumC1182n);
        TtsError ttsError = new TtsError();
        ttsError.setTtsErrorFlyweight(m36298a);
        return ttsError;
    }
}
