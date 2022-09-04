package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4685h;
import com.google.android.gms.tagmanager.AbstractC9032af;
import com.google.android.gms.tagmanager.AbstractC9042aj;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes2.dex */
public class aor {

    /* renamed from: a */
    private final Context f22652a;

    /* renamed from: b */
    private final C6841di f22653b;

    /* renamed from: c */
    private final ExecutorService f22654c;

    /* renamed from: d */
    private final ScheduledExecutorService f22655d;

    /* renamed from: e */
    private final AbstractC9042aj f22656e;

    /* renamed from: f */
    private final AbstractC9032af f22657f;

    public aor(Context context, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af) {
        this(context, abstractC9042aj, abstractC9032af, new C6841di(context), apz.m16245a(), apz.m16244b());
    }

    aor(Context context, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af, C6841di c6841di, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f22652a = ((Context) C4588d.m23627a(context)).getApplicationContext();
        this.f22656e = (AbstractC9042aj) C4588d.m23627a(abstractC9042aj);
        this.f22657f = (AbstractC9032af) C4588d.m23627a(abstractC9032af);
        this.f22653b = (C6841di) C4588d.m23627a(c6841di);
        this.f22654c = (ExecutorService) C4588d.m23627a(executorService);
        this.f22655d = (ScheduledExecutorService) C4588d.m23627a(scheduledExecutorService);
    }

    /* renamed from: a */
    public aoq m16445a(String str, @Nullable String str2, @Nullable String str3) {
        return new aoq(str, str2, str3, new apq(this.f22652a, this.f22656e, this.f22657f, str), this.f22653b, this.f22654c, this.f22655d, this.f22656e, C4685h.m23138d(), new aos(this.f22652a, str));
    }
}
