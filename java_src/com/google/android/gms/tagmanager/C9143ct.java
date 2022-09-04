package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.AbstractC3849e;
import com.google.android.gms.analytics.C3836c;
import com.google.android.gms.analytics.C3852g;
/* renamed from: com.google.android.gms.tagmanager.ct */
/* loaded from: classes2.dex */
public class C9143ct {

    /* renamed from: a */
    private C3836c f28872a;

    /* renamed from: b */
    private Context f28873b;

    /* renamed from: c */
    private C3852g f28874c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.tagmanager.ct$a */
    /* loaded from: classes2.dex */
    public static class C9144a implements AbstractC3849e {
        C9144a() {
        }

        /* renamed from: b */
        private static int m9146b(int i) {
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
            return m9146b(C9065aw.m9303a());
        }

        @Override // com.google.android.gms.analytics.AbstractC3849e
        /* renamed from: a */
        public void mo9149a(int i) {
            C9065aw.m9299b("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
        }

        @Override // com.google.android.gms.analytics.AbstractC3849e
        /* renamed from: a */
        public void mo9148a(Exception exc) {
            C9065aw.m9300a("", exc);
        }

        @Override // com.google.android.gms.analytics.AbstractC3849e
        /* renamed from: a */
        public void mo9147a(String str) {
            C9065aw.m9295e(str);
        }

        @Override // com.google.android.gms.analytics.AbstractC3849e
        /* renamed from: b */
        public void mo9145b(String str) {
            C9065aw.m9297c(str);
        }

        @Override // com.google.android.gms.analytics.AbstractC3849e
        /* renamed from: c */
        public void mo9144c(String str) {
            C9065aw.m9299b(str);
        }

        @Override // com.google.android.gms.analytics.AbstractC3849e
        /* renamed from: d */
        public void mo9143d(String str) {
            C9065aw.m9301a(str);
        }
    }

    public C9143ct(Context context) {
        this.f28873b = context;
    }

    /* renamed from: b */
    private synchronized void m9151b(String str) {
        if (this.f28872a == null) {
            this.f28872a = C3836c.m26590a(this.f28873b);
            this.f28872a.m26588a(new C9144a());
            this.f28874c = this.f28872a.m26587a(str);
        }
    }

    /* renamed from: a */
    public C3852g m9152a(String str) {
        m9151b(str);
        return this.f28874c;
    }
}
