package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class OnDeviceUsagePreferenceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnDeviceUsagePreferenceResponse> CREATOR = new C4980v();

    /* renamed from: a */
    final int f17750a;

    /* renamed from: b */
    final FileUploadPreferencesImpl f17751b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnDeviceUsagePreferenceResponse(int i, FileUploadPreferencesImpl fileUploadPreferencesImpl) {
        this.f17750a = i;
        this.f17751b = fileUploadPreferencesImpl;
    }

    /* renamed from: a */
    public FileUploadPreferencesImpl m22614a() {
        return this.f17751b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4980v.m22238a(this, parcel, i);
    }
}
