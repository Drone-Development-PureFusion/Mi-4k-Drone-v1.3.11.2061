package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class Command implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<Command> CREATOR = new Parcelable.Creator<Command>() { // from class: com.google.android.gms.analytics.internal.Command.1
        @Override // android.os.Parcelable.Creator
        @Deprecated
        /* renamed from: a */
        public Command createFromParcel(Parcel parcel) {
            return new Command(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @Deprecated
        /* renamed from: a */
        public Command[] newArray(int i) {
            return new Command[i];
        }
    };

    /* renamed from: a */
    private String f14962a;

    /* renamed from: b */
    private String f14963b;

    /* renamed from: c */
    private String f14964c;

    @Deprecated
    public Command() {
    }

    @Deprecated
    Command(Parcel parcel) {
        m26454a(parcel);
    }

    @Deprecated
    /* renamed from: a */
    private void m26454a(Parcel parcel) {
        this.f14962a = parcel.readString();
        this.f14963b = parcel.readString();
        this.f14964c = parcel.readString();
    }

    /* renamed from: a */
    public String m26455a() {
        return this.f14962a;
    }

    /* renamed from: b */
    public String m26453b() {
        return this.f14964c;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14962a);
        parcel.writeString(this.f14963b);
        parcel.writeString(this.f14964c);
    }
}
