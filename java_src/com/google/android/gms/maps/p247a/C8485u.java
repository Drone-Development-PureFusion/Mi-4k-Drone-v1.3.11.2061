package com.google.android.gms.maps.p247a;

import android.os.Bundle;
import android.os.Parcelable;
/* renamed from: com.google.android.gms.maps.a.u */
/* loaded from: classes2.dex */
public final class C8485u {
    private C8485u() {
    }

    /* renamed from: a */
    public static void m11647a(Bundle bundle, String str, Parcelable parcelable) {
        bundle.setClassLoader(C8485u.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(C8485u.class.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
