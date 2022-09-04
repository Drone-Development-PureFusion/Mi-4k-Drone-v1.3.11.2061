package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;
/* loaded from: classes2.dex */
public class CloseContentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloseContentsRequest> CREATOR = new C4884bh();

    /* renamed from: a */
    final int f17675a;

    /* renamed from: b */
    final Contents f17676b;

    /* renamed from: c */
    final Boolean f17677c;

    /* renamed from: d */
    final int f17678d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CloseContentsRequest(int i, Contents contents, Boolean bool, int i2) {
        this.f17675a = i;
        this.f17676b = contents;
        this.f17677c = bool;
        this.f17678d = i2;
    }

    public CloseContentsRequest(int i, boolean z) {
        this(1, null, Boolean.valueOf(z), i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4884bh.m22499a(this, parcel, i);
    }
}
