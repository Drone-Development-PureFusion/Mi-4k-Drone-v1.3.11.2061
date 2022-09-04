package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.internal.C8059yl;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.internal.ym */
/* loaded from: classes.dex */
public class C8062ym extends C8063yn implements AbstractC7877vt {

    /* renamed from: a */
    DisplayMetrics f26413a;

    /* renamed from: b */
    int f26414b = -1;

    /* renamed from: c */
    int f26415c = -1;

    /* renamed from: d */
    int f26416d = -1;

    /* renamed from: e */
    int f26417e = -1;

    /* renamed from: f */
    int f26418f = -1;

    /* renamed from: g */
    int f26419g = -1;

    /* renamed from: h */
    private final acy f26420h;

    /* renamed from: i */
    private final Context f26421i;

    /* renamed from: j */
    private final WindowManager f26422j;

    /* renamed from: k */
    private final C7774tx f26423k;

    /* renamed from: l */
    private float f26424l;

    /* renamed from: m */
    private int f26425m;

    public C8062ym(acy acyVar, Context context, C7774tx c7774tx) {
        super(acyVar);
        this.f26420h = acyVar;
        this.f26421i = context;
        this.f26423k = c7774tx;
        this.f26422j = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: g */
    private void m12888g() {
        this.f26413a = new DisplayMetrics();
        Display defaultDisplay = this.f26422j.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f26413a);
        this.f26424l = this.f26413a.density;
        this.f26425m = defaultDisplay.getRotation();
    }

    /* renamed from: h */
    private void m12887h() {
        int[] iArr = new int[2];
        this.f26420h.getLocationOnScreen(iArr);
        m12894a(C3514ac.m27586a().m26852b(this.f26421i, iArr[0]), C3514ac.m27586a().m26852b(this.f26421i, iArr[1]));
    }

    /* renamed from: i */
    private C8059yl m12886i() {
        return new C8059yl.C8061a().m12902b(this.f26423k.m13503a()).m12904a(this.f26423k.m13501b()).m12900c(this.f26423k.m13497f()).m12898d(this.f26423k.m13500c()).m12896e(this.f26423k.m13499d()).m12906a();
    }

    /* renamed from: a */
    void m12895a() {
        this.f26414b = C3514ac.m27586a().m26851b(this.f26413a, this.f26413a.widthPixels);
        this.f26415c = C3514ac.m27586a().m26851b(this.f26413a, this.f26413a.heightPixels);
        Activity mo18090f = this.f26420h.mo18090f();
        if (mo18090f == null || mo18090f.getWindow() == null) {
            this.f26416d = this.f26414b;
            this.f26417e = this.f26415c;
            return;
        }
        int[] m18383a = C3779u.m26890e().m18383a(mo18090f);
        this.f26416d = C3514ac.m27586a().m26851b(this.f26413a, m18383a[0]);
        this.f26417e = C3514ac.m27586a().m26851b(this.f26413a, m18383a[1]);
    }

    /* renamed from: a */
    public void m12894a(int i, int i2) {
        int i3 = this.f26421i instanceof Activity ? C3779u.m26890e().m18323d((Activity) this.f26421i)[0] : 0;
        if (this.f26420h.mo18085k() == null || !this.f26420h.mo18085k().f13867e) {
            this.f26418f = C3514ac.m27586a().m26852b(this.f26421i, this.f26420h.getMeasuredWidth());
            this.f26419g = C3514ac.m27586a().m26852b(this.f26421i, this.f26420h.getMeasuredHeight());
        }
        b(i, i2 - i3, this.f26418f, this.f26419g);
        this.f26420h.mo18084l().m18183a(i, i2);
    }

    @Override // com.google.android.gms.internal.AbstractC7877vt
    /* renamed from: a */
    public void mo12713a(acy acyVar, Map<String, String> map) {
        m12892c();
    }

    /* renamed from: b */
    void m12893b() {
        if (!this.f26420h.mo18085k().f13867e) {
            this.f26420h.measure(0, 0);
            return;
        }
        this.f26418f = this.f26414b;
        this.f26419g = this.f26415c;
    }

    /* renamed from: c */
    public void m12892c() {
        m12888g();
        m12895a();
        m12893b();
        m12890e();
        m12889f();
        m12887h();
        m12891d();
    }

    /* renamed from: d */
    void m12891d() {
        if (abr.a(2)) {
            abr.c("Dispatching Ready Event.");
        }
        c(this.f26420h.mo18081o().f14733b);
    }

    /* renamed from: e */
    void m12890e() {
        a(this.f26414b, this.f26415c, this.f26416d, this.f26417e, this.f26424l, this.f26425m);
    }

    /* renamed from: f */
    void m12889f() {
        this.f26420h.b("onDeviceFeaturesReceived", m12886i().m12907a());
    }
}
