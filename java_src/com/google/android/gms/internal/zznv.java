package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentActivity;
import android.support.p001v4.app.FragmentTransaction;
import com.google.android.gms.cast.framework.C4251c;
/* loaded from: classes2.dex */
public class zznv extends Fragment {
    /* renamed from: a */
    public static void m12695a(@NonNull FragmentActivity fragmentActivity, Bundle bundle) {
        if (bundle == null) {
            zznv zznvVar = new zznv();
            FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
            beginTransaction.add(zznvVar, fragmentActivity.toString());
            beginTransaction.commit();
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onPause() {
        super.onPause();
        C4251c.m24868a(getContext()).m24861b((Activity) getActivity());
    }

    @Override // android.support.p001v4.app.Fragment
    public void onResume() {
        super.onResume();
        C4251c.m24868a(getContext()).m24869a((Activity) getActivity());
    }
}
