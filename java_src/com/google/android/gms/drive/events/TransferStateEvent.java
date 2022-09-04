package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.List;
/* loaded from: classes2.dex */
public final class TransferStateEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Parcelable.Creator<TransferStateEvent> CREATOR = new C4833r();

    /* renamed from: a */
    final int f17618a;

    /* renamed from: b */
    final String f17619b;

    /* renamed from: c */
    final List<TransferProgressData> f17620c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransferStateEvent(int i, String str, List<TransferProgressData> list) {
        this.f17618a = i;
        this.f17619b = str;
        this.f17620c = list;
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    /* renamed from: a */
    public int mo22667a() {
        return 7;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        TransferStateEvent transferStateEvent = (TransferStateEvent) obj;
        return C4585c.m23634a(this.f17619b, transferStateEvent.f17619b) && C4585c.m23634a(this.f17620c, transferStateEvent.f17620c);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17619b, this.f17620c);
    }

    public String toString() {
        return String.format("TransferStateEvent[%s]", TextUtils.join("','", this.f17620c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4833r.m22628a(this, parcel, i);
    }
}
