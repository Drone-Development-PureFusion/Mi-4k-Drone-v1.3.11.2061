package com.tencent.qqconnect.dataprovider.datatype;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class TextOnly implements Parcelable {
    public static final Parcelable.Creator<TextOnly> CREATOR = new Parcelable.Creator<TextOnly>() { // from class: com.tencent.qqconnect.dataprovider.datatype.TextOnly.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public TextOnly mo40153createFromParcel(Parcel parcel) {
            return new TextOnly(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public TextOnly[] mo40154newArray(int i) {
            return new TextOnly[i];
        }
    };

    /* renamed from: a */
    private String f32081a;

    private TextOnly(Parcel parcel) {
        this.f32081a = parcel.readString();
    }

    public TextOnly(String str) {
        this.f32081a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getText() {
        return this.f32081a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32081a);
    }
}
