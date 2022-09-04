package com.google.android.gms.ads.mediation;

import android.os.Bundle;
/* renamed from: com.google.android.gms.ads.mediation.b */
/* loaded from: classes2.dex */
public interface AbstractC3792b {

    /* renamed from: com.google.android.gms.ads.mediation.b$a */
    /* loaded from: classes2.dex */
    public static class C3793a {

        /* renamed from: a */
        private int f14794a;

        /* renamed from: a */
        public Bundle m26817a() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.f14794a);
            return bundle;
        }

        /* renamed from: a */
        public C3793a m26816a(int i) {
            this.f14794a = i;
            return this;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
