package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
/* renamed from: com.google.android.gms.measurement.internal.j */
/* loaded from: classes2.dex */
public class C8719j extends AbstractC8683b {

    /* renamed from: a */
    private boolean f27906a;

    /* renamed from: b */
    private final AlarmManager f27907b = (AlarmManager) mo10300q().getSystemService("alarm");

    /* renamed from: c */
    private final AbstractC8731r f27908c;

    /* JADX INFO: Access modifiers changed from: protected */
    public C8719j(C8668aj c8668aj) {
        super(c8668aj);
        this.f27908c = new AbstractC8731r(c8668aj) { // from class: com.google.android.gms.measurement.internal.j.1
            @Override // com.google.android.gms.measurement.internal.AbstractC8731r
            /* renamed from: a */
            public void mo10361a() {
                C8719j.this.m10555z();
            }
        };
    }

    /* renamed from: g */
    private PendingIntent m10556g() {
        Intent className = new Intent().setClassName(mo10300q(), (!mo10292y().m10471N() || this.f27815n.m10745D()) ? "com.google.android.gms.measurement.AppMeasurementReceiver" : "com.google.android.gms.measurement.PackageMeasurementReceiver");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        return PendingIntent.getBroadcast(mo10300q(), 0, className, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m10555z() {
        Intent className = new Intent().setClassName(mo10300q(), (!mo10292y().m10471N() || this.f27815n.m10745D()) ? "com.google.android.gms.measurement.AppMeasurementReceiver" : "com.google.android.gms.measurement.PackageMeasurementReceiver");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        mo10300q().sendBroadcast(className);
    }

    /* renamed from: a */
    public void m10559a(long j) {
        boolean z = false;
        c();
        C4588d.m23622a(mo10292y().m10471N() || C8659ag.m10778a(mo10300q(), false), "Receiver not registered/enabled");
        if (mo10292y().m10471N() || C8706f.m10587a(mo10300q(), false)) {
            z = true;
        }
        C4588d.m23622a(z, "Service not registered/enabled");
        m10557f();
        long mo16432b = mo10301p().mo16432b() + j;
        this.f27906a = true;
        if (j < mo10292y().m10450ae() && !this.f27908c.m10357b()) {
            this.f27908c.m10360a(j);
        }
        this.f27907b.setInexactRepeating(2, mo16432b, Math.max(mo10292y().m10449af(), j), m10556g());
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8683b
    /* renamed from: e */
    protected void mo10312e() {
        this.f27907b.cancel(m10556g());
    }

    /* renamed from: f */
    public void m10557f() {
        c();
        this.f27906a = false;
        this.f27907b.cancel(m10556g());
        this.f27908c.m10355c();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo10309h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: i */
    public /* bridge */ /* synthetic */ void mo10308i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: j */
    public /* bridge */ /* synthetic */ void mo10307j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: k */
    public /* bridge */ /* synthetic */ C8725o mo10306k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: l */
    public /* bridge */ /* synthetic */ C8685d mo10305l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: m */
    public /* bridge */ /* synthetic */ C8743z mo10304m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: n */
    public /* bridge */ /* synthetic */ C8733s mo10303n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: o */
    public /* bridge */ /* synthetic */ C8693e mo10302o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: p */
    public /* bridge */ /* synthetic */ AbstractC4682e mo10301p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: q */
    public /* bridge */ /* synthetic */ Context mo10300q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: r */
    public /* bridge */ /* synthetic */ C8727q mo10299r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: s */
    public /* bridge */ /* synthetic */ C8723m mo10298s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: t */
    public /* bridge */ /* synthetic */ C8662ah mo10297t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: u */
    public /* bridge */ /* synthetic */ C8710g mo10296u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: v */
    public /* bridge */ /* synthetic */ C8663ai mo10295v() {
        return super.v();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: w */
    public /* bridge */ /* synthetic */ C8643ab mo10294w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: x */
    public /* bridge */ /* synthetic */ C8654af mo10293x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: y */
    public /* bridge */ /* synthetic */ C8726p mo10292y() {
        return super.y();
    }
}
