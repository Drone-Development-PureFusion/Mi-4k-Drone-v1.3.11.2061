package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.tagmanager.AbstractC9032af;
import com.google.android.gms.tagmanager.AbstractC9042aj;
/* loaded from: classes2.dex */
public class apq {

    /* renamed from: a */
    private final Context f22748a;

    /* renamed from: b */
    private final String f22749b;

    /* renamed from: c */
    private final AbstractC9042aj f22750c;

    /* renamed from: d */
    private final AbstractC9032af f22751d;

    public apq(Context context, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af, String str) {
        this.f22748a = context.getApplicationContext();
        this.f22750c = abstractC9042aj;
        this.f22751d = abstractC9032af;
        this.f22749b = str;
    }

    /* renamed from: a */
    public C6716app m16319a(C6865dv c6865dv, C6873dy c6873dy) {
        return new C6716app(this.f22748a, this.f22749b, c6865dv, c6873dy, this.f22750c, this.f22751d);
    }
}
