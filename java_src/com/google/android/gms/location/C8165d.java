package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.location.d */
/* loaded from: classes2.dex */
public class C8165d implements Parcelable.Creator<DetectedActivity> {

    /* renamed from: a */
    public static final int f26710a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12567a(DetectedActivity detectedActivity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, detectedActivity.f26649l);
        C4630b.m23475a(parcel, 2, detectedActivity.f26650m);
        C4630b.m23475a(parcel, 1000, detectedActivity.m12644c());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DetectedActivity createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 1000:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new DetectedActivity(i3, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DetectedActivity[] newArray(int i) {
        return new DetectedActivity[i];
    }
}
