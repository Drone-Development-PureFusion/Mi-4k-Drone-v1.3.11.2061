package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;
/* loaded from: classes2.dex */
public class OnListParentsResponse extends WriteAwareParcelable {
    public static final Parcelable.Creator<OnListParentsResponse> CREATOR = new C4847ac();

    /* renamed from: a */
    final int f17773a;

    /* renamed from: b */
    final DataHolder f17774b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnListParentsResponse(int i, DataHolder dataHolder) {
        this.f17773a = i;
        this.f17774b = dataHolder;
    }

    @Override // com.google.android.gms.drive.WriteAwareParcelable
    /* renamed from: a */
    protected void mo22607a(Parcel parcel, int i) {
        C4847ac.m22589a(this, parcel, i);
    }

    /* renamed from: b */
    public DataHolder m22606b() {
        return this.f17774b;
    }
}
