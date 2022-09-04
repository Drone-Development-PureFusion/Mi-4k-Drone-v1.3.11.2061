package com.google.android.gms.contextmanager.fence.internal;

import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7607px;
/* renamed from: com.google.android.gms.contextmanager.fence.internal.d */
/* loaded from: classes2.dex */
public class C4737d {

    /* renamed from: a */
    private final C7607px f17396a;

    public C4737d(C7607px c7607px) {
        this.f17396a = (C7607px) C4588d.m23627a(c7607px);
    }

    /* renamed from: a */
    public static C4737d m22926a(BeaconState.TypeFilter[] typeFilterArr) {
        return new C4737d(m22927a(1, typeFilterArr, 3000L));
    }

    /* renamed from: a */
    private static C7607px m22927a(int i, BeaconState.TypeFilter[] typeFilterArr, long j) {
        C7607px c7607px = new C7607px();
        c7607px.f25226a = i;
        if (typeFilterArr != null && typeFilterArr.length != 0) {
            c7607px.f25228c = new C7607px.C7608a[typeFilterArr.length];
            int i2 = 0;
            for (BeaconState.TypeFilter typeFilter : typeFilterArr) {
                c7607px.f25228c[i2] = ((BeaconStateImpl.TypeFilterImpl) typeFilter).m25462d();
                i2++;
            }
        }
        c7607px.f25227b = j;
        return c7607px;
    }

    /* renamed from: b */
    public static C4737d m22925b(BeaconState.TypeFilter[] typeFilterArr) {
        return new C4737d(m22927a(2, typeFilterArr, 3000L));
    }

    /* renamed from: c */
    public static C4737d m22924c(BeaconState.TypeFilter[] typeFilterArr) {
        return new C4737d(m22927a(3, typeFilterArr, 3000L));
    }

    /* renamed from: a */
    public C7607px m22928a() {
        return this.f17396a;
    }
}
