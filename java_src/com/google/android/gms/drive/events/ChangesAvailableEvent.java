package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
/* loaded from: classes2.dex */
public final class ChangesAvailableEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Parcelable.Creator<ChangesAvailableEvent> CREATOR = new C4816d();

    /* renamed from: a */
    final int f17576a;

    /* renamed from: b */
    final String f17577b;

    /* renamed from: c */
    final ChangesAvailableOptions f17578c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChangesAvailableEvent(int i, String str, ChangesAvailableOptions changesAvailableOptions) {
        this.f17576a = i;
        this.f17577b = str;
        this.f17578c = changesAvailableOptions;
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    /* renamed from: a */
    public int mo22667a() {
        return 4;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ChangesAvailableEvent changesAvailableEvent = (ChangesAvailableEvent) obj;
        return C4585c.m23634a(this.f17578c, changesAvailableEvent.f17578c) && C4585c.m23634a(this.f17577b, changesAvailableEvent.f17577b);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17578c, this.f17577b);
    }

    public String toString() {
        return String.format(Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", this.f17578c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4816d.m22659a(this, parcel, i);
    }
}
