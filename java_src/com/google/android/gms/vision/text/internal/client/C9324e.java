package com.google.android.gms.vision.text.internal.client;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.vision.text.internal.client.e */
/* loaded from: classes2.dex */
public class C9324e implements Parcelable.Creator<RecognitionOptions> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8619a(RecognitionOptions recognitionOptions, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, recognitionOptions.f29398a);
        C4630b.m23470a(parcel, 2, (Parcelable) recognitionOptions.f29399b, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RecognitionOptions createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Rect rect = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    rect = (Rect) C4628a.m23510a(parcel, m23514a, Rect.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new RecognitionOptions(i, rect);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RecognitionOptions[] newArray(int i) {
        return new RecognitionOptions[i];
    }
}
