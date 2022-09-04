package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.internal.AbstractC3872ag;
/* renamed from: com.google.android.gms.analytics.internal.n */
/* loaded from: classes2.dex */
public class C3906n extends AbstractC3872ag<C3908o> {

    /* renamed from: com.google.android.gms.analytics.internal.n$a */
    /* loaded from: classes2.dex */
    private static class C3907a extends C3919s implements AbstractC3872ag.AbstractC3873a<C3908o> {

        /* renamed from: a */
        private final C3908o f15121a = new C3908o();

        public C3907a(C3922v c3922v) {
            super(c3922v);
        }

        @Override // com.google.android.gms.analytics.internal.AbstractC3872ag.AbstractC3873a
        /* renamed from: a */
        public C3908o mo26215b() {
            return this.f15121a;
        }

        @Override // com.google.android.gms.analytics.internal.AbstractC3872ag.AbstractC3873a
        /* renamed from: a */
        public void mo26218a(String str, int i) {
            if ("ga_sessionTimeout".equals(str)) {
                this.f15121a.f15124c = i;
            } else {
                d("int configuration name not recognized", str);
            }
        }

        @Override // com.google.android.gms.analytics.internal.AbstractC3872ag.AbstractC3873a
        /* renamed from: a */
        public void mo26217a(String str, String str2) {
            this.f15121a.f15128g.put(str, str2);
        }

        @Override // com.google.android.gms.analytics.internal.AbstractC3872ag.AbstractC3873a
        /* renamed from: a */
        public void mo26216a(String str, boolean z) {
            int i = 1;
            if ("ga_autoActivityTracking".equals(str)) {
                C3908o c3908o = this.f15121a;
                if (!z) {
                    i = 0;
                }
                c3908o.f15125d = i;
            } else if ("ga_anonymizeIp".equals(str)) {
                C3908o c3908o2 = this.f15121a;
                if (!z) {
                    i = 0;
                }
                c3908o2.f15126e = i;
            } else if (!"ga_reportUncaughtExceptions".equals(str)) {
                d("bool configuration name not recognized", str);
            } else {
                C3908o c3908o3 = this.f15121a;
                if (!z) {
                    i = 0;
                }
                c3908o3.f15127f = i;
            }
        }

        @Override // com.google.android.gms.analytics.internal.AbstractC3872ag.AbstractC3873a
        /* renamed from: b */
        public void mo26214b(String str, String str2) {
            if ("ga_trackingId".equals(str)) {
                this.f15121a.f15122a = str2;
            } else if (!"ga_sampleFrequency".equals(str)) {
                d("string configuration name not recognized", str);
            } else {
                try {
                    this.f15121a.f15123b = Double.parseDouble(str2);
                } catch (NumberFormatException e) {
                    c("Error parsing ga_sampleFrequency value", str2, e);
                }
            }
        }
    }

    public C3906n(C3922v c3922v) {
        super(c3922v, new C3907a(c3922v));
    }
}
