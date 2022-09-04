package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;
/* loaded from: classes2.dex */
public class OnListEntriesResponse extends WriteAwareParcelable {
    public static final Parcelable.Creator<OnListEntriesResponse> CREATOR = new C4845aa();

    /* renamed from: a */
    final int f17770a;

    /* renamed from: b */
    final DataHolder f17771b;

    /* renamed from: c */
    final boolean f17772c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnListEntriesResponse(int i, DataHolder dataHolder, boolean z) {
        this.f17770a = i;
        this.f17771b = dataHolder;
        this.f17772c = z;
    }

    @Override // com.google.android.gms.drive.WriteAwareParcelable
    /* renamed from: a */
    protected void mo22607a(Parcel parcel, int i) {
        C4845aa.m22595a(this, parcel, i);
    }

    /* renamed from: b */
    public DataHolder m22609b() {
        return this.f17771b;
    }

    /* renamed from: c */
    public boolean m22608c() {
        return this.f17772c;
    }
}
