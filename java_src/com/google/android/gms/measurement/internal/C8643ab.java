package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.measurement.AppMeasurement;
import com.xiaomi.mipush.sdk.Constants;
/* renamed from: com.google.android.gms.measurement.internal.ab */
/* loaded from: classes2.dex */
public class C8643ab extends AbstractC8683b {

    /* renamed from: b */
    private final char f27647b;

    /* renamed from: d */
    private final C8645a f27649d;

    /* renamed from: e */
    private final C8645a f27650e;

    /* renamed from: f */
    private final C8645a f27651f;

    /* renamed from: g */
    private final C8645a f27652g;

    /* renamed from: h */
    private final C8645a f27653h;

    /* renamed from: i */
    private final C8645a f27654i;

    /* renamed from: j */
    private final C8645a f27655j;

    /* renamed from: k */
    private final C8645a f27656k;

    /* renamed from: l */
    private final C8645a f27657l;

    /* renamed from: a */
    private final String f27646a = mo10292y().m10458a();

    /* renamed from: c */
    private final long f27648c = mo10292y().m10472M();

    /* renamed from: com.google.android.gms.measurement.internal.ab$a */
    /* loaded from: classes2.dex */
    public class C8645a {

        /* renamed from: b */
        private final int f27661b;

        /* renamed from: c */
        private final boolean f27662c;

        /* renamed from: d */
        private final boolean f27663d;

        C8645a(int i, boolean z, boolean z2) {
            this.f27661b = i;
            this.f27662c = z;
            this.f27663d = z2;
        }

        /* renamed from: a */
        public void m10831a(String str) {
            C8643ab.this.m10838a(this.f27661b, this.f27662c, this.f27663d, str, null, null, null);
        }

        /* renamed from: a */
        public void m10830a(String str, Object obj) {
            C8643ab.this.m10838a(this.f27661b, this.f27662c, this.f27663d, str, obj, null, null);
        }

        /* renamed from: a */
        public void m10829a(String str, Object obj, Object obj2) {
            C8643ab.this.m10838a(this.f27661b, this.f27662c, this.f27663d, str, obj, obj2, null);
        }

        /* renamed from: a */
        public void m10828a(String str, Object obj, Object obj2, Object obj3) {
            C8643ab.this.m10838a(this.f27661b, this.f27662c, this.f27663d, str, obj, obj2, obj3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8643ab(C8668aj c8668aj) {
        super(c8668aj);
        if (mo10292y().m10470O()) {
            this.f27647b = mo10292y().m10471N() ? 'P' : 'C';
        } else {
            this.f27647b = mo10292y().m10471N() ? 'p' : 'c';
        }
        this.f27649d = new C8645a(6, false, false);
        this.f27650e = new C8645a(6, true, false);
        this.f27651f = new C8645a(6, false, true);
        this.f27652g = new C8645a(5, false, false);
        this.f27653h = new C8645a(5, true, false);
        this.f27654i = new C8645a(5, false, true);
        this.f27655j = new C8645a(4, false, false);
        this.f27656k = new C8645a(3, false, false);
        this.f27657l = new C8645a(2, false, false);
    }

    /* renamed from: a */
    private static String m10837a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    /* renamed from: a */
    static String m10836a(boolean z, Object obj) {
        StackTraceElement[] stackTrace;
        String className;
        if (obj == null) {
            return "";
        }
        Object valueOf = obj instanceof Integer ? Long.valueOf(((Integer) obj).intValue()) : obj;
        if (valueOf instanceof Long) {
            if (z && Math.abs(((Long) valueOf).longValue()) >= 100) {
                String str = String.valueOf(valueOf).charAt(0) == '-' ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "";
                String valueOf2 = String.valueOf(Math.abs(((Long) valueOf).longValue()));
                return new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(str).length()).append(str).append(Math.round(Math.pow(10.0d, valueOf2.length() - 1))).append("...").append(str).append(Math.round(Math.pow(10.0d, valueOf2.length()) - 1.0d)).toString();
            }
            return String.valueOf(valueOf);
        } else if (valueOf instanceof Boolean) {
            return String.valueOf(valueOf);
        } else {
            if (!(valueOf instanceof Throwable)) {
                return z ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : String.valueOf(valueOf);
            }
            Throwable th = (Throwable) valueOf;
            StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String m10837a = m10837a(AppMeasurement.class.getCanonicalName());
            String m10837a2 = m10837a(C8668aj.class.getCanonicalName());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                    String m10837a3 = m10837a(className);
                    if (m10837a3.equals(m10837a) || m10837a3.equals(m10837a2)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: a */
    static String m10835a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String m10836a = m10836a(z, obj);
        String m10836a2 = m10836a(z, obj2);
        String m10836a3 = m10836a(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(m10836a)) {
            sb.append(str2);
            sb.append(m10836a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(m10836a2)) {
            sb.append(str2);
            sb.append(m10836a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(m10836a3)) {
            sb.append(str2);
            sb.append(m10836a3);
        }
        return sb.toString();
    }

    /* renamed from: A */
    public C8645a m10847A() {
        return this.f27653h;
    }

    /* renamed from: B */
    public C8645a m10846B() {
        return this.f27654i;
    }

    /* renamed from: C */
    public C8645a m10845C() {
        return this.f27655j;
    }

    /* renamed from: D */
    public C8645a m10844D() {
        return this.f27656k;
    }

    /* renamed from: E */
    public C8645a m10843E() {
        return this.f27657l;
    }

    /* renamed from: F */
    public String m10842F() {
        Pair<String, Long> m10785a = mo10293x().f27688b.m10785a();
        if (m10785a == null || m10785a == C8654af.f27687a) {
            return null;
        }
        String valueOf = String.valueOf(String.valueOf(m10785a.second));
        String str = (String) m10785a.first;
        return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length()).append(valueOf).append(":").append(str).toString();
    }

    /* renamed from: a */
    protected void m10840a(int i, String str) {
        Log.println(i, this.f27646a, str);
    }

    /* renamed from: a */
    public void m10839a(int i, String str, Object obj, Object obj2, Object obj3) {
        C4588d.m23627a(str);
        C8663ai m10693k = this.f27815n.m10693k();
        if (m10693k == null) {
            m10840a(6, "Scheduler not set. Not logging error/warn.");
        } else if (!m10693k.a()) {
            m10840a(6, "Scheduler not initialized. Not logging error/warn.");
        } else if (m10693k.b()) {
            m10840a(6, "Scheduler shutdown. Not logging error/warn.");
        } else {
            if (i < 0) {
                i = 0;
            }
            if (i >= "01VDIWEA?".length()) {
                i = "01VDIWEA?".length() - 1;
            }
            String valueOf = String.valueOf("1");
            char charAt = "01VDIWEA?".charAt(i);
            char c = this.f27647b;
            long j = this.f27648c;
            String valueOf2 = String.valueOf(m10835a(true, str, obj, obj2, obj3));
            final String sb = new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(valueOf2).length()).append(valueOf).append(charAt).append(c).append(j).append(":").append(valueOf2).toString();
            if (sb.length() > 1024) {
                sb = str.substring(0, 1024);
            }
            m10693k.m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.ab.1
                @Override // java.lang.Runnable
                public void run() {
                    C8654af m10699e = C8643ab.this.f27815n.m10699e();
                    if (!m10699e.a() || m10699e.b()) {
                        C8643ab.this.m10840a(6, "Persisted config not initialized . Not logging error/warn.");
                    } else {
                        m10699e.f27688b.m10784a(sb);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    protected void m10838a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && m10841a(i)) {
            m10840a(i, m10835a(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        m10839a(i, str, obj, obj2, obj3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m10841a(int i) {
        return Log.isLoggable(this.f27646a, i);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8683b
    /* renamed from: e */
    protected void mo10312e() {
    }

    /* renamed from: f */
    public C8645a m10834f() {
        return this.f27649d;
    }

    /* renamed from: g */
    public C8645a m10833g() {
        return this.f27650e;
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
    public C8645a m10832z() {
        return this.f27652g;
    }
}
