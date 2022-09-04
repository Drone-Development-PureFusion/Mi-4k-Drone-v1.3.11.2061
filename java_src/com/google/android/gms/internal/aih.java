package com.google.android.gms.internal;

import android.app.Activity;
import android.support.p001v4.app.FragmentActivity;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4696s;
/* loaded from: classes2.dex */
public class aih {

    /* renamed from: a */
    private final Object f21937a;

    public aih(Activity activity) {
        C4588d.m23626a(activity, "Activity must not be null");
        C4588d.m23618b(C4696s.m23114a() || (activity instanceof FragmentActivity), "This Activity is not supported before platform version 11 (3.0 Honeycomb). Please use FragmentActivity instead.");
        this.f21937a = activity;
    }

    /* renamed from: a */
    public boolean m17227a() {
        return this.f21937a instanceof FragmentActivity;
    }

    /* renamed from: b */
    public Activity m17226b() {
        return (Activity) this.f21937a;
    }

    /* renamed from: c */
    public FragmentActivity m17225c() {
        return (FragmentActivity) this.f21937a;
    }
}
