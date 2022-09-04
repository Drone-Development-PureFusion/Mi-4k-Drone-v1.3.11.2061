package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class SetFileUploadPreferencesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetFileUploadPreferencesRequest> CREATOR = new C4861aq();

    /* renamed from: a */
    final int f17813a;

    /* renamed from: b */
    final FileUploadPreferencesImpl f17814b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SetFileUploadPreferencesRequest(int i, FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this.f17813a = i;
        this.f17814b = fileUploadPreferencesImpl;
    }

    public SetFileUploadPreferencesRequest(FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this(1, fileUploadPreferencesImpl);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4861aq.m22550a(this, parcel, i);
    }
}
