package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.drive.realtime.internal.event.c */
/* loaded from: classes2.dex */
public class C5065c implements Parcelable.Creator<ParcelableEvent> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21920a(ParcelableEvent parcelableEvent, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, parcelableEvent.f18138a);
        C4630b.m23464a(parcel, 2, parcelableEvent.f18139b, false);
        C4630b.m23464a(parcel, 3, parcelableEvent.f18140c, false);
        C4630b.m23449b(parcel, 4, parcelableEvent.f18141d, false);
        C4630b.m23461a(parcel, 5, parcelableEvent.f18142e);
        C4630b.m23464a(parcel, 6, parcelableEvent.f18145h, false);
        C4630b.m23464a(parcel, 7, parcelableEvent.f18146i, false);
        C4630b.m23470a(parcel, 8, (Parcelable) parcelableEvent.f18147j, i, false);
        C4630b.m23470a(parcel, 9, (Parcelable) parcelableEvent.f18148k, i, false);
        C4630b.m23470a(parcel, 10, (Parcelable) parcelableEvent.f18149l, i, false);
        C4630b.m23470a(parcel, 11, (Parcelable) parcelableEvent.f18150m, i, false);
        C4630b.m23470a(parcel, 12, (Parcelable) parcelableEvent.f18151n, i, false);
        C4630b.m23470a(parcel, 13, (Parcelable) parcelableEvent.f18152o, i, false);
        C4630b.m23470a(parcel, 14, (Parcelable) parcelableEvent.f18153p, i, false);
        C4630b.m23470a(parcel, 15, (Parcelable) parcelableEvent.f18154q, i, false);
        C4630b.m23461a(parcel, 16, parcelableEvent.f18143f);
        C4630b.m23461a(parcel, 17, parcelableEvent.f18144g);
        C4630b.m23470a(parcel, 18, (Parcelable) parcelableEvent.f18155r, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParcelableEvent createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str3 = null;
        String str4 = null;
        TextInsertedDetails textInsertedDetails = null;
        TextDeletedDetails textDeletedDetails = null;
        ValuesAddedDetails valuesAddedDetails = null;
        ValuesRemovedDetails valuesRemovedDetails = null;
        ValuesSetDetails valuesSetDetails = null;
        ValueChangedDetails valueChangedDetails = null;
        ReferenceShiftedDetails referenceShiftedDetails = null;
        ObjectChangedDetails objectChangedDetails = null;
        FieldChangedDetails fieldChangedDetails = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                case 5:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    textInsertedDetails = (TextInsertedDetails) C4628a.m23510a(parcel, m23514a, TextInsertedDetails.CREATOR);
                    break;
                case 9:
                    textDeletedDetails = (TextDeletedDetails) C4628a.m23510a(parcel, m23514a, TextDeletedDetails.CREATOR);
                    break;
                case 10:
                    valuesAddedDetails = (ValuesAddedDetails) C4628a.m23510a(parcel, m23514a, ValuesAddedDetails.CREATOR);
                    break;
                case 11:
                    valuesRemovedDetails = (ValuesRemovedDetails) C4628a.m23510a(parcel, m23514a, ValuesRemovedDetails.CREATOR);
                    break;
                case 12:
                    valuesSetDetails = (ValuesSetDetails) C4628a.m23510a(parcel, m23514a, ValuesSetDetails.CREATOR);
                    break;
                case 13:
                    valueChangedDetails = (ValueChangedDetails) C4628a.m23510a(parcel, m23514a, ValueChangedDetails.CREATOR);
                    break;
                case 14:
                    referenceShiftedDetails = (ReferenceShiftedDetails) C4628a.m23510a(parcel, m23514a, ReferenceShiftedDetails.CREATOR);
                    break;
                case 15:
                    objectChangedDetails = (ObjectChangedDetails) C4628a.m23510a(parcel, m23514a, ObjectChangedDetails.CREATOR);
                    break;
                case 16:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 17:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 18:
                    fieldChangedDetails = (FieldChangedDetails) C4628a.m23510a(parcel, m23514a, FieldChangedDetails.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ParcelableEvent(i, str, str2, arrayList, z, z2, z3, str3, str4, textInsertedDetails, textDeletedDetails, valuesAddedDetails, valuesRemovedDetails, valuesSetDetails, valueChangedDetails, referenceShiftedDetails, objectChangedDetails, fieldChangedDetails);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParcelableEvent[] newArray(int i) {
        return new ParcelableEvent[i];
    }
}
