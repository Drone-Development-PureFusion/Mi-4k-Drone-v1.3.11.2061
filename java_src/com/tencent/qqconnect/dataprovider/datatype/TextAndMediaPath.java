package com.tencent.qqconnect.dataprovider.datatype;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class TextAndMediaPath implements Parcelable {
    public static final Parcelable.Creator<TextAndMediaPath> CREATOR = new Parcelable.Creator<TextAndMediaPath>() { // from class: com.tencent.qqconnect.dataprovider.datatype.TextAndMediaPath.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public TextAndMediaPath mo40151createFromParcel(Parcel parcel) {
            return new TextAndMediaPath(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public TextAndMediaPath[] mo40152newArray(int i) {
            return new TextAndMediaPath[i];
        }
    };

    /* renamed from: a */
    private String f32079a;

    /* renamed from: b */
    private String f32080b;

    private TextAndMediaPath(Parcel parcel) {
        this.f32079a = parcel.readString();
        this.f32080b = parcel.readString();
    }

    public TextAndMediaPath(String str, String str2) {
        this.f32079a = str;
        this.f32080b = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getMediaPath() {
        return this.f32080b;
    }

    public String getText() {
        return this.f32079a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32079a);
        parcel.writeString(this.f32080b);
    }
}
