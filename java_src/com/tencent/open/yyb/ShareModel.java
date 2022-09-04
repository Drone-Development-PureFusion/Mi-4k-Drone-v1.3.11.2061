package com.tencent.open.yyb;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class ShareModel implements Parcelable {
    public static final Parcelable.Creator<ShareModel> CREATOR = new Parcelable.Creator<ShareModel>() { // from class: com.tencent.open.yyb.ShareModel.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareModel createFromParcel(Parcel parcel) {
            ShareModel shareModel = new ShareModel();
            shareModel.f32072a = parcel.readString();
            shareModel.f32073b = parcel.readString();
            shareModel.f32074c = parcel.readString();
            shareModel.f32075d = parcel.readString();
            return shareModel;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareModel[] newArray(int i) {
            return null;
        }
    };

    /* renamed from: a */
    public String f32072a;

    /* renamed from: b */
    public String f32073b;

    /* renamed from: c */
    public String f32074c;

    /* renamed from: d */
    public String f32075d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32072a);
        parcel.writeString(this.f32073b);
        parcel.writeString(this.f32074c);
        parcel.writeString(this.f32075d);
    }
}
