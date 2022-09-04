package com.google.android.gms.tagmanager;

import android.content.Context;
/* renamed from: com.google.android.gms.tagmanager.h */
/* loaded from: classes2.dex */
public class C9213h implements AbstractC9026aa {

    /* renamed from: a */
    private static C9213h f29041a;

    /* renamed from: b */
    private static final Object f29042b = new Object();

    /* renamed from: c */
    private AbstractC9095bu f29043c;

    /* renamed from: d */
    private AbstractC9027ab f29044d;

    private C9213h(Context context) {
        this(C9028ac.m9329a(context), new C9125ck());
    }

    C9213h(AbstractC9027ab abstractC9027ab, AbstractC9095bu abstractC9095bu) {
        this.f29044d = abstractC9027ab;
        this.f29043c = abstractC9095bu;
    }

    /* renamed from: a */
    public static AbstractC9026aa m8914a(Context context) {
        C9213h c9213h;
        synchronized (f29042b) {
            if (f29041a == null) {
                f29041a = new C9213h(context);
            }
            c9213h = f29041a;
        }
        return c9213h;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9026aa
    /* renamed from: a */
    public boolean mo8913a(String str) {
        if (!this.f29043c.mo9185a()) {
            C9065aw.m9299b("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
            return false;
        }
        this.f29044d.mo9325a(str);
        return true;
    }
}
