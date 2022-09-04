package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Locale;
/* loaded from: classes2.dex */
public final class ChangeEvent extends AbstractSafeParcelable implements ResourceEvent {
    public static final Parcelable.Creator<ChangeEvent> CREATOR = new C4815c();

    /* renamed from: a */
    final int f17573a;

    /* renamed from: b */
    final DriveId f17574b;

    /* renamed from: c */
    final int f17575c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChangeEvent(int i, DriveId driveId, int i2) {
        this.f17573a = i;
        this.f17574b = driveId;
        this.f17575c = i2;
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    /* renamed from: a */
    public int mo22667a() {
        return 1;
    }

    @Override // com.google.android.gms.drive.events.ResourceEvent
    /* renamed from: b */
    public DriveId mo22669b() {
        return this.f17574b;
    }

    /* renamed from: c */
    public boolean m22696c() {
        return (this.f17575c & 1) != 0;
    }

    /* renamed from: d */
    public boolean m22695d() {
        return (this.f17575c & 2) != 0;
    }

    /* renamed from: e */
    public boolean m22694e() {
        return (this.f17575c & 4) != 0;
    }

    public String toString() {
        return String.format(Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", this.f17574b, Integer.valueOf(this.f17575c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4815c.m22662a(this, parcel, i);
    }
}
