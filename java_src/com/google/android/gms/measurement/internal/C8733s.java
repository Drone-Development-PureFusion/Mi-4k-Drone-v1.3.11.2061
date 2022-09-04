package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.util.AbstractC4682e;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.measurement.internal.s */
/* loaded from: classes2.dex */
public class C8733s extends AbstractC8683b {

    /* renamed from: a */
    private long f27933a;

    /* renamed from: b */
    private String f27934b;

    /* renamed from: c */
    private Boolean f27935c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8733s(C8668aj c8668aj) {
        super(c8668aj);
    }

    /* renamed from: A */
    public String m10353A() {
        c();
        return this.f27934b;
    }

    /* renamed from: a */
    public boolean m10352a(Context context) {
        if (this.f27935c == null) {
            if (mo10292y().m10471N()) {
                this.f27935c = true;
            } else {
                this.f27935c = false;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager != null) {
                        packageManager.getPackageInfo("com.google.android.gms", 128);
                        this.f27935c = true;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
        }
        return this.f27935c.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8683b
    /* renamed from: e */
    protected void mo10312e() {
        Calendar calendar = Calendar.getInstance();
        this.f27933a = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String valueOf = String.valueOf(locale.getLanguage().toLowerCase(Locale.ENGLISH));
        String valueOf2 = String.valueOf(locale.getCountry().toLowerCase(Locale.ENGLISH));
        this.f27934b = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append(Constants.ACCEPT_TIME_SEPARATOR_SERVER).append(valueOf2).toString();
    }

    /* renamed from: f */
    public String m10351f() {
        c();
        return Build.MODEL;
    }

    /* renamed from: g */
    public String m10350g() {
        c();
        return Build.VERSION.RELEASE;
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

    /* renamed from: z */
    public long m10349z() {
        c();
        return this.f27933a;
    }
}
