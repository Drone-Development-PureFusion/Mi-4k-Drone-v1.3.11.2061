package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;
/* loaded from: classes2.dex */
public class OpenFileIntentSenderRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OpenFileIntentSenderRequest> CREATOR = new C4856al();

    /* renamed from: a */
    final int f17793a;

    /* renamed from: b */
    final String f17794b;

    /* renamed from: c */
    final String[] f17795c;

    /* renamed from: d */
    final DriveId f17796d;

    /* renamed from: e */
    final FilterHolder f17797e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OpenFileIntentSenderRequest(int i, String str, String[] strArr, DriveId driveId, FilterHolder filterHolder) {
        this.f17793a = i;
        this.f17794b = str;
        this.f17795c = strArr;
        this.f17796d = driveId;
        this.f17797e = filterHolder;
    }

    public OpenFileIntentSenderRequest(String str, String[] strArr, DriveId driveId, FilterHolder filterHolder) {
        this(1, str, strArr, driveId, filterHolder);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4856al.m22565a(this, parcel, i);
    }
}
