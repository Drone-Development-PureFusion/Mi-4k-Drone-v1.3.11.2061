package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferStateEvent;
/* renamed from: com.google.android.gms.drive.internal.y */
/* loaded from: classes2.dex */
public class C4983y implements Parcelable.Creator<OnEventResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22229a(OnEventResponse onEventResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, onEventResponse.f17760a);
        C4630b.m23475a(parcel, 2, onEventResponse.f17761b);
        C4630b.m23470a(parcel, 3, (Parcelable) onEventResponse.f17762c, i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) onEventResponse.f17763d, i, false);
        C4630b.m23470a(parcel, 6, (Parcelable) onEventResponse.f17764e, i, false);
        C4630b.m23470a(parcel, 7, (Parcelable) onEventResponse.f17765f, i, false);
        C4630b.m23470a(parcel, 9, (Parcelable) onEventResponse.f17766g, i, false);
        C4630b.m23470a(parcel, 10, (Parcelable) onEventResponse.f17767h, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnEventResponse createFromParcel(Parcel parcel) {
        int i = 0;
        TransferProgressEvent transferProgressEvent = null;
        int m23508b = C4628a.m23508b(parcel);
        TransferStateEvent transferStateEvent = null;
        ChangesAvailableEvent changesAvailableEvent = null;
        QueryResultEventParcelable queryResultEventParcelable = null;
        CompletionEvent completionEvent = null;
        ChangeEvent changeEvent = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    changeEvent = (ChangeEvent) C4628a.m23510a(parcel, m23514a, ChangeEvent.CREATOR);
                    break;
                case 4:
                case 8:
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
                case 5:
                    completionEvent = (CompletionEvent) C4628a.m23510a(parcel, m23514a, CompletionEvent.CREATOR);
                    break;
                case 6:
                    queryResultEventParcelable = (QueryResultEventParcelable) C4628a.m23510a(parcel, m23514a, QueryResultEventParcelable.CREATOR);
                    break;
                case 7:
                    changesAvailableEvent = (ChangesAvailableEvent) C4628a.m23510a(parcel, m23514a, ChangesAvailableEvent.CREATOR);
                    break;
                case 9:
                    transferStateEvent = (TransferStateEvent) C4628a.m23510a(parcel, m23514a, TransferStateEvent.CREATOR);
                    break;
                case 10:
                    transferProgressEvent = (TransferProgressEvent) C4628a.m23510a(parcel, m23514a, TransferProgressEvent.CREATOR);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new OnEventResponse(i2, i, changeEvent, completionEvent, queryResultEventParcelable, changesAvailableEvent, transferStateEvent, transferProgressEvent);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnEventResponse[] newArray(int i) {
        return new OnEventResponse[i];
    }
}
