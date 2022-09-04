package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.internal.AbstractC3872ag;
/* renamed from: com.google.android.gms.analytics.internal.ap */
/* loaded from: classes2.dex */
public class C3884ap extends AbstractC3872ag<C3886b> {

    /* renamed from: com.google.android.gms.analytics.internal.ap$a */
    /* loaded from: classes2.dex */
    private static class C3885a implements AbstractC3872ag.AbstractC3873a<C3886b> {

        /* renamed from: a */
        private final C3922v f15064a;

        /* renamed from: b */
        private final C3886b f15065b = new C3886b();

        public C3885a(C3922v c3922v) {
            this.f15064a = c3922v;
        }

        @Override // com.google.android.gms.analytics.internal.AbstractC3872ag.AbstractC3873a
        /* renamed from: a */
        public C3886b mo26215b() {
            return this.f15065b;
        }

        @Override // com.google.android.gms.analytics.internal.AbstractC3872ag.AbstractC3873a
        /* renamed from: a */
        public void mo26218a(String str, int i) {
            if ("ga_dispatchPeriod".equals(str)) {
                this.f15065b.f15069d = i;
            } else {
                this.f15064a.m26108f().d("Int xml configuration name not recognized", str);
            }
        }

        @Override // com.google.android.gms.analytics.internal.AbstractC3872ag.AbstractC3873a
        /* renamed from: a */
        public void mo26217a(String str, String str2) {
        }

        @Override // com.google.android.gms.analytics.internal.AbstractC3872ag.AbstractC3873a
        /* renamed from: a */
        public void mo26216a(String str, boolean z) {
            if (!"ga_dryRun".equals(str)) {
                this.f15064a.m26108f().d("Bool xml configuration name not recognized", str);
                return;
            }
            this.f15065b.f15070e = z ? 1 : 0;
        }

        @Override // com.google.android.gms.analytics.internal.AbstractC3872ag.AbstractC3873a
        /* renamed from: b */
        public void mo26214b(String str, String str2) {
            if ("ga_appName".equals(str)) {
                this.f15065b.f15066a = str2;
            } else if ("ga_appVersion".equals(str)) {
                this.f15065b.f15067b = str2;
            } else if ("ga_logLevel".equals(str)) {
                this.f15065b.f15068c = str2;
            } else {
                this.f15064a.m26108f().d("String xml configuration name not recognized", str);
            }
        }
    }

    public C3884ap(C3922v c3922v) {
        super(c3922v, new C3885a(c3922v));
    }
}
