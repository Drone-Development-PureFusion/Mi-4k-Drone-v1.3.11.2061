package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
/* loaded from: classes2.dex */
public final class RealTimeMessage implements Parcelable {
    public static final Parcelable.Creator<RealTimeMessage> CREATOR = new Parcelable.Creator<RealTimeMessage>() { // from class: com.google.android.gms.games.multiplayer.realtime.RealTimeMessage.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RealTimeMessage createFromParcel(Parcel parcel) {
            return new RealTimeMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RealTimeMessage[] newArray(int i) {
            return new RealTimeMessage[i];
        }
    };

    /* renamed from: a */
    public static final int f20196a = 0;

    /* renamed from: b */
    public static final int f20197b = 1;

    /* renamed from: c */
    private final String f20198c;

    /* renamed from: d */
    private final byte[] f20199d;

    /* renamed from: e */
    private final int f20200e;

    private RealTimeMessage(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    public RealTimeMessage(String str, byte[] bArr, int i) {
        this.f20198c = (String) C4588d.m23627a(str);
        this.f20199d = (byte[]) ((byte[]) C4588d.m23627a(bArr)).clone();
        this.f20200e = i;
    }

    /* renamed from: a */
    public String m19444a() {
        return this.f20198c;
    }

    /* renamed from: b */
    public byte[] m19443b() {
        return this.f20199d;
    }

    /* renamed from: c */
    public boolean m19442c() {
        return this.f20200e == 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20198c);
        parcel.writeByteArray(this.f20199d);
        parcel.writeInt(this.f20200e);
    }
}
