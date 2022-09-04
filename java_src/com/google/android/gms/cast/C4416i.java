package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.cast.i */
/* loaded from: classes2.dex */
public class C4416i implements Parcelable.Creator<ApplicationMetadata> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m24281a(ApplicationMetadata applicationMetadata, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, applicationMetadata.m25260a());
        C4630b.m23464a(parcel, 2, applicationMetadata.m25257b(), false);
        C4630b.m23464a(parcel, 3, applicationMetadata.m25256c(), false);
        C4630b.m23447c(parcel, 4, applicationMetadata.m25252g(), false);
        C4630b.m23449b(parcel, 5, applicationMetadata.m25255d(), false);
        C4630b.m23464a(parcel, 6, applicationMetadata.m25254e(), false);
        C4630b.m23470a(parcel, 7, (Parcelable) applicationMetadata.m25253f(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ApplicationMetadata createFromParcel(Parcel parcel) {
        Uri uri = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, WebImage.CREATOR);
                    break;
                case 5:
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                case 6:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ApplicationMetadata(i, str3, str2, arrayList2, arrayList, str, uri);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ApplicationMetadata[] newArray(int i) {
        return new ApplicationMetadata[i];
    }
}
