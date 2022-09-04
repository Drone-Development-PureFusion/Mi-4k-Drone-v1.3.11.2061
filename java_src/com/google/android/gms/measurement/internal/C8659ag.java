package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.MainThread;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.measurement.AppMeasurement;
/* renamed from: com.google.android.gms.measurement.internal.ag */
/* loaded from: classes.dex */
public final class C8659ag {

    /* renamed from: a */
    static Boolean f27720a;

    /* renamed from: b */
    static Boolean f27721b;

    /* renamed from: c */
    private final AbstractC8661a f27722c;

    /* renamed from: com.google.android.gms.measurement.internal.ag$a */
    /* loaded from: classes.dex */
    public interface AbstractC8661a {
        /* renamed from: a */
        void mo10777a(Context context, Intent intent);
    }

    public C8659ag(AbstractC8661a abstractC8661a) {
        C4588d.m23627a(abstractC8661a);
        this.f27722c = abstractC8661a;
    }

    /* renamed from: a */
    public static boolean m10778a(Context context, boolean z) {
        C4588d.m23627a(context);
        if (f27720a == null || z) {
            if (f27721b != null && z) {
                return f27721b.booleanValue();
            }
            boolean m10547a = C8723m.m10547a(context, z ? "com.google.android.gms.measurement.PackageMeasurementReceiver" : "com.google.android.gms.measurement.AppMeasurementReceiver", false);
            if (z) {
                f27721b = Boolean.valueOf(m10547a);
                return m10547a;
            }
            f27720a = Boolean.valueOf(m10547a);
            return m10547a;
        }
        return f27720a.booleanValue();
    }

    @MainThread
    /* renamed from: a */
    public void m10779a(final Context context, Intent intent) {
        final C8668aj m10727a = C8668aj.m10727a(context);
        final C8643ab m10698f = m10727a.m10698f();
        if (intent == null) {
            m10698f.m10832z().m10831a("Receiver called with null intent");
            return;
        }
        boolean m10471N = m10727a.m10701d().m10471N();
        String action = intent.getAction();
        if (m10471N) {
            m10698f.m10843E().m10830a("Device receiver got", action);
        } else {
            m10698f.m10843E().m10830a("Local receiver got", action);
        }
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            C8706f.m10587a(context, m10471N && !m10727a.m10745D());
            Intent className = new Intent().setClassName(context, (!m10471N || m10727a.m10745D()) ? "com.google.android.gms.measurement.AppMeasurementService" : "com.google.android.gms.measurement.PackageMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            this.f27722c.mo10777a(context, className);
        } else if (m10471N || !"com.android.vending.INSTALL_REFERRER".equals(action)) {
        } else {
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                m10698f.m10843E().m10831a("Install referrer extras are null");
                return;
            }
            final Bundle m10546a = m10727a.m10689o().m10546a(Uri.parse(stringExtra));
            if (m10546a == null) {
                m10698f.m10843E().m10831a("No campaign defined in install referrer broadcast");
                return;
            }
            final long longExtra = 1000 * intent.getLongExtra("referrer_timestamp_seconds", 0L);
            if (longExtra == 0) {
                m10698f.m10832z().m10831a("Install referrer is missing timestamp");
            }
            m10727a.m10696h().m10762a(new Runnable() { // from class: com.google.android.gms.measurement.internal.ag.1
                @Override // java.lang.Runnable
                public void run() {
                    C8722l m10380c = m10727a.m10688p().m10380c(m10727a.m10682v().m10311f(), "_fot");
                    long longValue = (m10380c == null || !(m10380c.f27913d instanceof Long)) ? 0L : ((Long) m10380c.f27913d).longValue();
                    long j = longExtra;
                    long j2 = (longValue <= 0 || (j < longValue && j > 0)) ? j : longValue - 1;
                    if (j2 > 0) {
                        m10546a.putLong("click_timestamp", j2);
                    }
                    AppMeasurement.getInstance(context).m10909a("auto", "_cmp", m10546a);
                    m10698f.m10843E().m10831a("Install campaign recorded");
                }
            });
        }
    }
}
