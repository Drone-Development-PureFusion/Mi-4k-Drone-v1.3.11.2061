package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.drive.events.g */
/* loaded from: classes2.dex */
public class C4819g implements Parcelable.Creator<CompletionEvent> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22652a(CompletionEvent completionEvent, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, completionEvent.f17588e);
        C4630b.m23470a(parcel, 2, (Parcelable) completionEvent.f17589f, i, false);
        C4630b.m23464a(parcel, 3, completionEvent.f17590g, false);
        C4630b.m23470a(parcel, 4, (Parcelable) completionEvent.f17591h, i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) completionEvent.f17592i, i, false);
        C4630b.m23470a(parcel, 6, (Parcelable) completionEvent.f17593j, i, false);
        C4630b.m23449b(parcel, 7, completionEvent.f17594k, false);
        C4630b.m23475a(parcel, 8, completionEvent.f17595l);
        C4630b.m23472a(parcel, 9, completionEvent.f17596m, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CompletionEvent createFromParcel(Parcel parcel) {
        int i = 0;
        IBinder iBinder = null;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList<String> arrayList = null;
        MetadataBundle metadataBundle = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        String str = null;
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    driveId = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) C4628a.m23510a(parcel, m23514a, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    parcelFileDescriptor = (ParcelFileDescriptor) C4628a.m23510a(parcel, m23514a, ParcelFileDescriptor.CREATOR);
                    break;
                case 6:
                    metadataBundle = (MetadataBundle) C4628a.m23510a(parcel, m23514a, MetadataBundle.CREATOR);
                    break;
                case 7:
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                case 8:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 9:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CompletionEvent(i2, driveId, str, parcelFileDescriptor2, parcelFileDescriptor, metadataBundle, arrayList, i, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CompletionEvent[] newArray(int i) {
        return new CompletionEvent[i];
    }
}
