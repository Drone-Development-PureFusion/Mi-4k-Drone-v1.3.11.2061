package com.baidu.tts.p105h.p107b;

import android.content.Context;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p110j.AbstractC1198b;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
/* renamed from: com.baidu.tts.h.b.b */
/* loaded from: classes.dex */
public class C1193b implements AbstractC1198b {

    /* renamed from: a */
    private static volatile C1193b f3016a = null;

    /* renamed from: c */
    private WeakReference<Context> f3018c;

    /* renamed from: b */
    private Hashtable<WeakReference<Context>, C1192a> f3017b = new Hashtable<>();

    /* renamed from: d */
    private Hashtable<String, Object> f3019d = new Hashtable<>();

    private C1193b() {
        this.f3019d.put(EnumC1175g.CTP.m36319a(), "10");
        this.f3019d.put(EnumC1175g.VERSION.m36319a(), "V2.2.9");
    }

    /* renamed from: a */
    public static C1193b m36288a() {
        if (f3016a == null) {
            synchronized (C1193b.class) {
                if (f3016a == null) {
                    f3016a = new C1193b();
                }
            }
        }
        return f3016a;
    }

    /* renamed from: a */
    public C1192a m36285a(WeakReference<Context> weakReference) {
        if (weakReference == null) {
            return null;
        }
        C1192a c1192a = this.f3017b.get(weakReference);
        if (c1192a != null) {
            return c1192a;
        }
        C1192a c1192a2 = new C1192a(weakReference);
        this.f3017b.put(weakReference, c1192a2);
        return c1192a2;
    }

    /* renamed from: a */
    public String m36286a(String str) {
        try {
            return (String) this.f3019d.get(str);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public void m36287a(Context context) {
        this.f3018c = new WeakReference<>(context);
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: b */
    public TtsError mo36091b() {
        return null;
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: c */
    public void mo36090c() {
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: d */
    public void mo36089d() {
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: e */
    public void mo36088e() {
    }

    @Override // com.baidu.tts.p110j.AbstractC1198b
    /* renamed from: f */
    public void mo36087f() {
        if (this.f3017b != null) {
            this.f3017b.clear();
        }
        this.f3018c = null;
    }

    /* renamed from: g */
    public C1192a m36284g() {
        return m36285a(this.f3018c);
    }

    /* renamed from: h */
    public Context m36283h() {
        return this.f3018c.get();
    }

    /* renamed from: i */
    public String m36282i() {
        try {
            C1192a m36284g = m36284g();
            if (m36284g != null) {
                return m36284g.m36291a();
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: j */
    public String m36281j() {
        return m36286a(EnumC1175g.VERSION.m36319a());
    }
}
