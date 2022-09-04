package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferStateEvent;
/* loaded from: classes2.dex */
public class OnEventResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnEventResponse> CREATOR = new C4983y();

    /* renamed from: a */
    final int f17760a;

    /* renamed from: b */
    final int f17761b;

    /* renamed from: c */
    final ChangeEvent f17762c;

    /* renamed from: d */
    final CompletionEvent f17763d;

    /* renamed from: e */
    final QueryResultEventParcelable f17764e;

    /* renamed from: f */
    final ChangesAvailableEvent f17765f;

    /* renamed from: g */
    final TransferStateEvent f17766g;

    /* renamed from: h */
    final TransferProgressEvent f17767h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnEventResponse(int i, int i2, ChangeEvent changeEvent, CompletionEvent completionEvent, QueryResultEventParcelable queryResultEventParcelable, ChangesAvailableEvent changesAvailableEvent, TransferStateEvent transferStateEvent, TransferProgressEvent transferProgressEvent) {
        this.f17760a = i;
        this.f17761b = i2;
        this.f17762c = changeEvent;
        this.f17763d = completionEvent;
        this.f17764e = queryResultEventParcelable;
        this.f17765f = changesAvailableEvent;
        this.f17766g = transferStateEvent;
        this.f17767h = transferProgressEvent;
    }

    /* renamed from: a */
    public DriveEvent m22610a() {
        switch (this.f17761b) {
            case 1:
                return this.f17762c;
            case 2:
                return this.f17763d;
            case 3:
                return this.f17764e;
            case 4:
                return this.f17765f;
            case 5:
            case 6:
            default:
                throw new IllegalStateException(new StringBuilder(33).append("Unexpected event type ").append(this.f17761b).toString());
            case 7:
                return this.f17766g;
            case 8:
                return this.f17767h;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4983y.m22229a(this, parcel, i);
    }
}
