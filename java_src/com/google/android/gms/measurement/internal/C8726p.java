package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.annotation.Size;
import android.support.p004v7.media.SystemMediaRouteProvider;
import android.text.TextUtils;
import com.google.android.gms.common.C4648j;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4697t;
import com.google.android.gms.internal.aie;
import com.google.android.gms.measurement.internal.C8738x;
import com.tencent.connect.common.Constants;
import com.tencent.p263mm.sdk.platformtools.Util;
import java.lang.reflect.InvocationTargetException;
/* renamed from: com.google.android.gms.measurement.internal.p */
/* loaded from: classes2.dex */
public class C8726p extends C8682al {

    /* renamed from: a */
    static final String f27914a = String.valueOf(C4648j.f17166c / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");

    /* renamed from: b */
    private Boolean f27915b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8726p(C8668aj c8668aj) {
        super(c8668aj);
    }

    /* renamed from: A */
    public int m10484A() {
        return 2048;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public int m10483B() {
        return 500;
    }

    /* renamed from: C */
    public long m10482C() {
        return C8738x.f27966m.m10328b().intValue();
    }

    /* renamed from: D */
    public long m10481D() {
        return C8738x.f27968o.m10328b().intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public int m10480E() {
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public int m10479F() {
        return 50;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public long m10478G() {
        return Util.MILLSECONDS_OF_HOUR;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public long m10477H() {
        return 60000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public long m10476I() {
        return 61000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public long m10475J() {
        return C8738x.f27953G.m10328b().longValue();
    }

    /* renamed from: K */
    public String m10474K() {
        return "google_app_measurement.db";
    }

    /* renamed from: L */
    public String m10473L() {
        return "google_app_measurement2.db";
    }

    /* renamed from: M */
    public long m10472M() {
        return 9683L;
    }

    /* renamed from: N */
    public boolean m10471N() {
        return false;
    }

    /* renamed from: O */
    public boolean m10470O() {
        if (this.f27915b == null) {
            synchronized (this) {
                if (this.f27915b == null) {
                    ApplicationInfo applicationInfo = mo10300q().getApplicationInfo();
                    String m23098b = C4697t.m23098b();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f27915b = Boolean.valueOf(str != null && str.equals(m23098b));
                    }
                    if (this.f27915b == null) {
                        this.f27915b = Boolean.TRUE;
                        mo10294w().m10834f().m10831a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f27915b.booleanValue();
    }

    /* renamed from: P */
    public boolean m10469P() {
        Boolean m10432g;
        return !m10471N() && (m10432g = m10432g("firebase_analytics_collection_deactivated")) != null && m10432g.booleanValue();
    }

    /* renamed from: Q */
    public Boolean m10468Q() {
        if (m10471N()) {
            return null;
        }
        return m10432g("firebase_analytics_collection_enabled");
    }

    /* renamed from: R */
    public boolean m10467R() {
        return aie.m17246b();
    }

    /* renamed from: S */
    public long m10466S() {
        return C8738x.f27950D.m10328b().longValue();
    }

    /* renamed from: T */
    public long m10465T() {
        return C8738x.f27979z.m10328b().longValue();
    }

    /* renamed from: U */
    public long m10464U() {
        return 1000L;
    }

    /* renamed from: V */
    public long m10463V() {
        return Math.max(0L, C8738x.f27958e.m10328b().longValue());
    }

    /* renamed from: W */
    public int m10462W() {
        return Math.max(0, C8738x.f27964k.m10328b().intValue());
    }

    /* renamed from: X */
    public int m10461X() {
        return Math.max(1, C8738x.f27965l.m10328b().intValue());
    }

    /* renamed from: Y */
    public String m10460Y() {
        return C8738x.f27972s.m10328b();
    }

    /* renamed from: Z */
    public long m10459Z() {
        return C8738x.f27959f.m10328b().longValue();
    }

    /* renamed from: a */
    public int m10457a(@Size(min = 1) String str) {
        return Math.max(0, Math.min(1000000, m10442b(str, C8738x.f27967n)));
    }

    /* renamed from: a */
    public long m10456a(String str, C8738x.C8739a<Long> c8739a) {
        if (str == null) {
            return c8739a.m10328b().longValue();
        }
        String m10773a = mo10297t().m10773a(str, c8739a.m10338a());
        if (TextUtils.isEmpty(m10773a)) {
            return c8739a.m10328b().longValue();
        }
        try {
            return c8739a.m10337a(Long.valueOf(Long.valueOf(m10773a).longValue())).longValue();
        } catch (NumberFormatException e) {
            return c8739a.m10328b().longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m10458a() {
        return C8738x.f27956c.m10328b();
    }

    /* renamed from: a */
    public String m10455a(String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder encodedAuthority = builder.scheme(C8738x.f27960g.m10328b()).encodedAuthority(C8738x.f27961h.m10328b());
        String valueOf = String.valueOf(str);
        encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", str2).appendQueryParameter(Constants.PARAM_PLATFORM, SystemMediaRouteProvider.PACKAGE_NAME).appendQueryParameter("gmp_version", String.valueOf(m10472M()));
        return builder.build().toString();
    }

    /* renamed from: aa */
    public long m10454aa() {
        return Math.max(0L, C8738x.f27973t.m10328b().longValue());
    }

    /* renamed from: ab */
    public long m10453ab() {
        return Math.max(0L, C8738x.f27975v.m10328b().longValue());
    }

    /* renamed from: ac */
    public long m10452ac() {
        return Math.max(0L, C8738x.f27976w.m10328b().longValue());
    }

    /* renamed from: ad */
    public long m10451ad() {
        return Math.max(0L, C8738x.f27977x.m10328b().longValue());
    }

    /* renamed from: ae */
    public long m10450ae() {
        return Math.max(0L, C8738x.f27978y.m10328b().longValue());
    }

    /* renamed from: af */
    public long m10449af() {
        return C8738x.f27974u.m10328b().longValue();
    }

    /* renamed from: ag */
    public long m10448ag() {
        return Math.max(0L, C8738x.f27947A.m10328b().longValue());
    }

    /* renamed from: ah */
    public long m10447ah() {
        return Math.max(0L, C8738x.f27948B.m10328b().longValue());
    }

    /* renamed from: ai */
    public int m10446ai() {
        return Math.min(20, Math.max(0, C8738x.f27949C.m10328b().intValue()));
    }

    /* renamed from: aj */
    public String m10445aj() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "firebase.analytics.debug-mode", "");
        } catch (ClassNotFoundException e) {
            mo10294w().m10834f().m10830a("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            mo10294w().m10834f().m10830a("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            mo10294w().m10834f().m10830a("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            mo10294w().m10834f().m10830a("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    /* renamed from: b */
    public int m10444b() {
        return 25;
    }

    /* renamed from: b */
    public int m10443b(@Size(min = 1) String str) {
        return m10442b(str, C8738x.f27969p);
    }

    /* renamed from: b */
    public int m10442b(String str, C8738x.C8739a<Integer> c8739a) {
        if (str == null) {
            return c8739a.m10328b().intValue();
        }
        String m10773a = mo10297t().m10773a(str, c8739a.m10338a());
        if (TextUtils.isEmpty(m10773a)) {
            return c8739a.m10328b().intValue();
        }
        try {
            return c8739a.m10337a(Integer.valueOf(Integer.valueOf(m10773a).intValue())).intValue();
        } catch (NumberFormatException e) {
            return c8739a.m10328b().intValue();
        }
    }

    /* renamed from: c */
    public int m10441c() {
        return 32;
    }

    /* renamed from: c */
    public int m10440c(@Size(min = 1) String str) {
        return m10442b(str, C8738x.f27970q);
    }

    /* renamed from: d */
    public int m10439d() {
        return 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public long m10438d(String str) {
        return m10456a(str, C8738x.f27957d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m10437e() {
        return 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m10436e(String str) {
        return m10442b(str, C8738x.f27951E);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m10435f() {
        return 36;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m10434f(String str) {
        return Math.max(0, Math.min(2000, m10442b(str, C8738x.f27952F)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m10433g() {
        return 256;
    }

    @Nullable
    /* renamed from: g */
    Boolean m10432g(@Size(min = 1) String str) {
        Boolean bool = null;
        C4588d.m23625a(str);
        try {
            PackageManager packageManager = mo10300q().getPackageManager();
            if (packageManager == null) {
                mo10294w().m10834f().m10831a("Failed to load metadata: PackageManager is null");
            } else {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(mo10300q().getPackageName(), 128);
                if (applicationInfo == null) {
                    mo10294w().m10834f().m10831a("Failed to load metadata: ApplicationInfo is null");
                } else if (applicationInfo.metaData == null) {
                    mo10294w().m10834f().m10831a("Failed to load metadata: Metadata bundle is null");
                } else if (applicationInfo.metaData.containsKey(str)) {
                    bool = Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            mo10294w().m10834f().m10830a("Failed to load metadata: Package name not found", e);
        }
        return bool;
    }

    /* renamed from: h */
    public int m10431h(String str) {
        return m10442b(str, C8738x.f27962i);
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo10309h() {
        super.mo10309h();
    }

    /* renamed from: i */
    public int m10430i(String str) {
        return Math.max(0, m10442b(str, C8738x.f27963j));
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: i */
    public /* bridge */ /* synthetic */ void mo10308i() {
        super.mo10308i();
    }

    /* renamed from: j */
    public int m10429j(String str) {
        return Math.max(0, Math.min(1000000, m10442b(str, C8738x.f27971r)));
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: j */
    public /* bridge */ /* synthetic */ void mo10307j() {
        super.mo10307j();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: k */
    public /* bridge */ /* synthetic */ C8725o mo10306k() {
        return super.mo10306k();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: l */
    public /* bridge */ /* synthetic */ C8685d mo10305l() {
        return super.mo10305l();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: m */
    public /* bridge */ /* synthetic */ C8743z mo10304m() {
        return super.mo10304m();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: n */
    public /* bridge */ /* synthetic */ C8733s mo10303n() {
        return super.mo10303n();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: o */
    public /* bridge */ /* synthetic */ C8693e mo10302o() {
        return super.mo10302o();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: p */
    public /* bridge */ /* synthetic */ AbstractC4682e mo10301p() {
        return super.mo10301p();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: q */
    public /* bridge */ /* synthetic */ Context mo10300q() {
        return super.mo10300q();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: r */
    public /* bridge */ /* synthetic */ C8727q mo10299r() {
        return super.mo10299r();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: s */
    public /* bridge */ /* synthetic */ C8723m mo10298s() {
        return super.mo10298s();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: t */
    public /* bridge */ /* synthetic */ C8662ah mo10297t() {
        return super.mo10297t();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: u */
    public /* bridge */ /* synthetic */ C8710g mo10296u() {
        return super.mo10296u();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: v */
    public /* bridge */ /* synthetic */ C8663ai mo10295v() {
        return super.mo10295v();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: w */
    public /* bridge */ /* synthetic */ C8643ab mo10294w() {
        return super.mo10294w();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: x */
    public /* bridge */ /* synthetic */ C8654af mo10293x() {
        return super.mo10293x();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: y */
    public /* bridge */ /* synthetic */ C8726p mo10292y() {
        return super.mo10292y();
    }

    /* renamed from: z */
    public int m10428z() {
        return 36;
    }
}
