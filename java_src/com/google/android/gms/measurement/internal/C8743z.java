package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.internal.aie;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
/* renamed from: com.google.android.gms.measurement.internal.z */
/* loaded from: classes2.dex */
public class C8743z extends AbstractC8683b {

    /* renamed from: a */
    private static final X500Principal f27984a = new X500Principal("CN=Android Debug,O=Android,C=US");

    /* renamed from: b */
    private String f27985b;

    /* renamed from: c */
    private String f27986c;

    /* renamed from: d */
    private int f27987d;

    /* renamed from: e */
    private String f27988e;

    /* renamed from: f */
    private String f27989f;

    /* renamed from: g */
    private long f27990g;

    /* renamed from: h */
    private String f27991h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8743z(C8668aj c8668aj) {
        super(c8668aj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public int m10319A() {
        c();
        return this.f27987d;
    }

    /* renamed from: B */
    String m10318B() {
        c();
        return this.f27988e;
    }

    /* renamed from: C */
    long m10317C() {
        return mo10292y().m10472M();
    }

    /* renamed from: D */
    long m10316D() {
        c();
        return this.f27990g;
    }

    /* renamed from: E */
    boolean m10315E() {
        try {
            PackageInfo packageInfo = mo10300q().getPackageManager().getPackageInfo(mo10300q().getPackageName(), 64);
            if (packageInfo != null && packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(f27984a);
            }
        } catch (PackageManager.NameNotFoundException e) {
            mo10294w().m10834f().m10830a("Package name not found", e);
        } catch (CertificateException e2) {
            mo10294w().m10834f().m10830a("Error obtaining certificate", e2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AppMetadata m10313a(String str) {
        return new AppMetadata(m10311f(), m10310g(), m10291z(), m10319A(), m10318B(), m10317C(), m10316D(), str, this.f27815n.m10744E(), !mo10293x().f27699m, mo10293x().m10793g());
    }

    /* renamed from: a */
    protected void m10314a(Status status) {
        if (status == null) {
            mo10294w().m10834f().m10831a("GoogleService failed to initialize (no status)");
        } else {
            mo10294w().m10834f().m10829a("GoogleService failed to initialize, status", Integer.valueOf(status.m24015i()), status.m24021c());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8683b
    /* renamed from: e */
    protected void mo10312e() {
        boolean z;
        String str = "unknown";
        String str2 = "Unknown";
        int i = Integer.MIN_VALUE;
        String str3 = "Unknown";
        String packageName = mo10300q().getPackageName();
        PackageManager packageManager = mo10300q().getPackageManager();
        if (packageManager == null) {
            mo10294w().m10834f().m10831a("PackageManager is null, app identity information might be inaccurate");
        } else {
            str = packageManager.getInstallerPackageName(packageName);
            if (str == null) {
                str = "manual_install";
            } else if ("com.android.vending".equals(str)) {
                str = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(mo10300q().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    if (!TextUtils.isEmpty(applicationLabel)) {
                        str3 = applicationLabel.toString();
                    }
                    str2 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException e) {
                mo10294w().m10834f().m10830a("Error retrieving package info: appName", str3);
            }
        }
        this.f27985b = packageName;
        this.f27988e = str;
        this.f27986c = str2;
        this.f27987d = i;
        this.f27989f = str3;
        this.f27990g = 0L;
        MessageDigest m10498j = C8723m.m10498j("MD5");
        if (m10498j == null) {
            mo10294w().m10834f().m10831a("Could not get MD5 instance");
            this.f27990g = -1L;
        } else if (packageManager != null) {
            try {
                if (!m10315E()) {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo(mo10300q().getPackageName(), 64);
                    if (packageInfo2.signatures != null && packageInfo2.signatures.length > 0) {
                        this.f27990g = C8723m.m10507c(m10498j.digest(packageInfo2.signatures[0].toByteArray()));
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                mo10294w().m10834f().m10830a("Package name not found", e2);
            }
        }
        Status m17248a = mo10292y().m10471N() ? aie.m17248a(mo10300q(), Constants.ACCEPT_TIME_SEPARATOR_SERVER, true) : aie.m17249a(mo10300q());
        boolean z2 = m17248a != null && m17248a.m24018f();
        if (!z2) {
            m10314a(m17248a);
        }
        if (z2) {
            Boolean m10468Q = mo10292y().m10468Q();
            if (mo10292y().m10469P()) {
                mo10294w().m10845C().m10831a("Collection disabled with firebase_analytics_collection_deactivated=1");
                z = false;
            } else if (m10468Q != null && !m10468Q.booleanValue()) {
                mo10294w().m10845C().m10831a("Collection disabled with firebase_analytics_collection_enabled=0");
                z = false;
            } else if (m10468Q != null || !mo10292y().m10467R()) {
                mo10294w().m10843E().m10831a("Collection enabled");
                z = true;
            } else {
                mo10294w().m10845C().m10831a("Collection disabled with google_app_measurement_enable=0");
                z = false;
            }
        } else {
            z = false;
        }
        this.f27991h = "";
        if (!mo10292y().m10471N()) {
            try {
                String m17250a = aie.m17250a();
                if (TextUtils.isEmpty(m17250a)) {
                    m17250a = "";
                }
                this.f27991h = m17250a;
                if (!z) {
                    return;
                }
                mo10294w().m10843E().m10829a("App package, google app id", this.f27985b, this.f27991h);
            } catch (IllegalStateException e3) {
                mo10294w().m10834f().m10830a("getGoogleAppId or isMeasurementEnabled failed with exception", e3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public String m10311f() {
        c();
        return this.f27985b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public String m10310g() {
        c();
        return this.f27991h;
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
    String m10291z() {
        c();
        return this.f27986c;
    }
}
