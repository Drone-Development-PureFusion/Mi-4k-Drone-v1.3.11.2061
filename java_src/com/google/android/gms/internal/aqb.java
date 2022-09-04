package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.analytics.AbstractC3849e;
import com.google.android.gms.analytics.C3836c;
import com.google.android.gms.analytics.C3852g;
/* loaded from: classes2.dex */
public class aqb {

    /* renamed from: a */
    private C3836c f22852a;

    /* renamed from: b */
    private Context f22853b;

    /* renamed from: c */
    private C3852g f22854c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.aqb$a */
    /* loaded from: classes2.dex */
    public static class C6753a implements AbstractC3849e {
        C6753a() {
        }

        /* renamed from: b */
        private static int m16233b(int i) {
            switch (i) {
                case 2:
                    return 0;
                case 3:
                case 4:
                    return 1;
                case 5:
                    return 2;
                case 6:
                default:
                    return 3;
            }
        }

        @Override // com.google.android.gms.analytics.AbstractC3849e
        /* renamed from: a */
        public int mo9150a() {
            return m16233b(aph.m16397a());
        }

        @Override // com.google.android.gms.analytics.AbstractC3849e
        /* renamed from: a */
        public void mo9149a(int i) {
            aph.m16394b("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
        }

        @Override // com.google.android.gms.analytics.AbstractC3849e
        /* renamed from: a */
        public void mo9148a(Exception exc) {
            aph.m16395a("", exc);
        }

        @Override // com.google.android.gms.analytics.AbstractC3849e
        /* renamed from: a */
        public void mo9147a(String str) {
            aph.m16391d(str);
        }

        @Override // com.google.android.gms.analytics.AbstractC3849e
        /* renamed from: b */
        public void mo9145b(String str) {
            aph.m16392c(str);
        }

        @Override // com.google.android.gms.analytics.AbstractC3849e
        /* renamed from: c */
        public void mo9144c(String str) {
            aph.m16394b(str);
        }

        @Override // com.google.android.gms.analytics.AbstractC3849e
        /* renamed from: d */
        public void mo9143d(String str) {
            aph.m16396a(str);
        }
    }

    public aqb(Context context) {
        this.f22853b = context;
    }

    /* renamed from: b */
    private synchronized void m16234b(String str) {
        if (this.f22852a == null) {
            this.f22852a = C3836c.m26590a(this.f22853b);
            this.f22852a.m26588a(new C6753a());
            this.f22854c = this.f22852a.m26587a(str);
        }
    }

    /* renamed from: a */
    public C3852g m16235a(String str) {
        m16234b(str);
        return this.f22854c;
    }
}
