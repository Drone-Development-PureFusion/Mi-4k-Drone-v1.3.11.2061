package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.overlay.C3663k;
import com.google.android.gms.common.internal.C4588d;
@aaa
/* loaded from: classes.dex */
public class acx {

    /* renamed from: a */
    private final acy f21166a;

    /* renamed from: b */
    private final Context f21167b;

    /* renamed from: c */
    private final ViewGroup f21168c;

    /* renamed from: d */
    private C3663k f21169d;

    public acx(Context context, ViewGroup viewGroup, acy acyVar) {
        this(context, viewGroup, acyVar, null);
    }

    acx(Context context, ViewGroup viewGroup, acy acyVar, C3663k c3663k) {
        this.f21167b = context;
        this.f21168c = viewGroup;
        this.f21166a = acyVar;
        this.f21169d = c3663k;
    }

    /* renamed from: a */
    public C3663k m18189a() {
        C4588d.m23620b("getAdVideoUnderlay must be called from the UI thread.");
        return this.f21169d;
    }

    /* renamed from: a */
    public void m18188a(int i, int i2, int i3, int i4) {
        C4588d.m23620b("The underlay may only be modified from the UI thread.");
        if (this.f21169d != null) {
            this.f21169d.m27194a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public void m18187a(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (this.f21169d != null) {
            return;
        }
        C7794uj.m13449a(this.f21166a.mo18071y().m13442a(), this.f21166a.mo18072x(), "vpr2");
        this.f21169d = new C3663k(this.f21167b, this.f21166a, i5, z, this.f21166a.mo18071y().m13442a());
        this.f21168c.addView(this.f21169d, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f21169d.m27194a(i, i2, i3, i4);
        this.f21166a.mo18084l().m18166a(false);
    }

    /* renamed from: b */
    public void m18186b() {
        C4588d.m23620b("onPause must be called from the UI thread.");
        if (this.f21169d != null) {
            this.f21169d.m27181h();
        }
    }

    /* renamed from: c */
    public void m18185c() {
        C4588d.m23620b("onDestroy must be called from the UI thread.");
        if (this.f21169d != null) {
            this.f21169d.m27176m();
            this.f21168c.removeView(this.f21169d);
            this.f21169d = null;
        }
    }
}
