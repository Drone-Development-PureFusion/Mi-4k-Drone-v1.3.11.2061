package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class CheckServerAuthResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CheckServerAuthResult> CREATOR = new C9008c();

    /* renamed from: a */
    final int f28643a;

    /* renamed from: b */
    final boolean f28644b;

    /* renamed from: c */
    final List<Scope> f28645c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckServerAuthResult(int i, boolean z, List<Scope> list) {
        this.f28643a = i;
        this.f28644b = z;
        this.f28645c = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9008c.m9392a(this, parcel, i);
    }
}
