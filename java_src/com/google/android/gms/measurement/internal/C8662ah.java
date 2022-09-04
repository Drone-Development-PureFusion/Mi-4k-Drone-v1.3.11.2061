package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.support.annotation.WorkerThread;
import android.support.p001v4.util.ArrayMap;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.internal.C7639qv;
import com.google.android.gms.internal.C7640qw;
import com.google.android.gms.internal.amv;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.IOException;
import java.util.Map;
/* renamed from: com.google.android.gms.measurement.internal.ah */
/* loaded from: classes2.dex */
public class C8662ah extends AbstractC8683b {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f27729a = new ArrayMap();

    /* renamed from: b */
    private final Map<String, Map<String, Boolean>> f27730b = new ArrayMap();

    /* renamed from: c */
    private final Map<String, Map<String, Boolean>> f27731c = new ArrayMap();

    /* renamed from: d */
    private final Map<String, amv.C6587b> f27732d = new ArrayMap();

    /* renamed from: e */
    private final Map<String, String> f27733e = new ArrayMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8662ah(C8668aj c8668aj) {
        super(c8668aj);
    }

    @WorkerThread
    /* renamed from: a */
    private amv.C6587b m10772a(String str, byte[] bArr) {
        if (bArr == null) {
            return new amv.C6587b();
        }
        C7639qv m14009a = C7639qv.m14009a(bArr);
        amv.C6587b c6587b = new amv.C6587b();
        try {
            amv.C6587b c6587b2 = (amv.C6587b) c6587b.mo13816b(m14009a);
            mo10294w().m10843E().m10829a("Parsed config. version, gmp_app_id", c6587b.f22343a, c6587b.f22344b);
            return c6587b;
        } catch (IOException e) {
            mo10294w().m10832z().m10829a("Unable to merge remote config", str, e);
            return null;
        }
    }

    /* renamed from: a */
    private Map<String, String> m10776a(amv.C6587b c6587b) {
        amv.C6588c[] c6588cArr;
        ArrayMap arrayMap = new ArrayMap();
        if (c6587b != null && c6587b.f22346d != null) {
            for (amv.C6588c c6588c : c6587b.f22346d) {
                if (c6588c != null) {
                    arrayMap.put(c6588c.f22350a, c6588c.f22351b);
                }
            }
        }
        return arrayMap;
    }

    /* renamed from: a */
    private void m10774a(String str, amv.C6587b c6587b) {
        amv.C6586a[] c6586aArr;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        if (c6587b != null && c6587b.f22347e != null) {
            for (amv.C6586a c6586a : c6587b.f22347e) {
                if (c6586a != null) {
                    String str2 = AppMeasurement.C8635a.f27587a.get(c6586a.f22340a);
                    if (str2 != null) {
                        c6586a.f22340a = str2;
                    }
                    arrayMap.put(c6586a.f22340a, c6586a.f22341b);
                    arrayMap2.put(c6586a.f22340a, c6586a.f22342c);
                }
            }
        }
        this.f27730b.put(str, arrayMap);
        this.f27731c.put(str, arrayMap2);
    }

    @WorkerThread
    /* renamed from: d */
    private void m10766d(String str) {
        c();
        mo10307j();
        C4588d.m23625a(str);
        if (!this.f27732d.containsKey(str)) {
            byte[] m10379d = mo10299r().m10379d(str);
            if (m10379d == null) {
                this.f27729a.put(str, null);
                this.f27730b.put(str, null);
                this.f27731c.put(str, null);
                this.f27732d.put(str, null);
                this.f27733e.put(str, null);
                return;
            }
            amv.C6587b m10772a = m10772a(str, m10379d);
            this.f27729a.put(str, m10776a(m10772a));
            m10774a(str, m10772a);
            this.f27732d.put(str, m10772a);
            this.f27733e.put(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public amv.C6587b m10775a(String str) {
        c();
        mo10307j();
        C4588d.m23625a(str);
        m10766d(str);
        return this.f27732d.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public String m10773a(String str, String str2) {
        mo10307j();
        m10766d(str);
        Map<String, String> map = this.f27729a.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: a */
    public boolean m10771a(String str, byte[] bArr, String str2) {
        c();
        mo10307j();
        C4588d.m23625a(str);
        amv.C6587b m10772a = m10772a(str, bArr);
        if (m10772a == null) {
            return false;
        }
        m10774a(str, m10772a);
        this.f27732d.put(str, m10772a);
        this.f27733e.put(str, str2);
        this.f27729a.put(str, m10776a(m10772a));
        mo10306k().m10486a(str, m10772a.f22348f);
        try {
            m10772a.f22348f = null;
            byte[] bArr2 = new byte[m10772a.g()];
            m10772a.mo13818a(C7640qw.m13959a(bArr2));
            bArr = bArr2;
        } catch (IOException e) {
            mo10294w().m10832z().m10830a("Unable to serialize reduced-size config.  Storing full config instead.", e);
        }
        mo10299r().m10391a(str, bArr);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: b */
    public String m10770b(String str) {
        mo10307j();
        return this.f27733e.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public boolean m10769b(String str, String str2) {
        Boolean bool;
        mo10307j();
        m10766d(str);
        Map<String, Boolean> map = this.f27730b.get(str);
        if (map != null && (bool = map.get(str2)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: c */
    public void m10768c(String str) {
        mo10307j();
        this.f27733e.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: c */
    public boolean m10767c(String str, String str2) {
        Boolean bool;
        mo10307j();
        m10766d(str);
        Map<String, Boolean> map = this.f27731c.get(str);
        if (map != null && (bool = map.get(str2)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8683b
    /* renamed from: e */
    protected void mo10312e() {
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
