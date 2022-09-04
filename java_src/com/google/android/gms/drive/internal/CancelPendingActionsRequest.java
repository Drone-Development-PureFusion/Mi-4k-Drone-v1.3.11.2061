package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class CancelPendingActionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CancelPendingActionsRequest> CREATOR = new C4880bd();

    /* renamed from: a */
    final int f17657a;

    /* renamed from: b */
    final List<String> f17658b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CancelPendingActionsRequest(int i, List<String> list) {
        this.f17657a = i;
        this.f17658b = list;
    }

    public CancelPendingActionsRequest(List<String> list) {
        this(1, list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4880bd.m22511a(this, parcel, i);
    }
}
