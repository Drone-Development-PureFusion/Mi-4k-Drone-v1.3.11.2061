package com.tencent.connect.dataprovider;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public final class DataType {
    public static final int CONTENT_AND_IMAGE_PATH = 1;
    public static final int CONTENT_AND_VIDEO_PATH = 2;
    public static final int CONTENT_ONLY = 4;

    /* loaded from: classes2.dex */
    public static class TextAndMediaPath implements Parcelable {
        public static final Parcelable.Creator<TextAndMediaPath> CREATOR = new Parcelable.Creator<TextAndMediaPath>() { // from class: com.tencent.connect.dataprovider.DataType.TextAndMediaPath.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public TextAndMediaPath mo40147createFromParcel(Parcel parcel) {
                return new TextAndMediaPath(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public TextAndMediaPath[] mo40148newArray(int i) {
                return new TextAndMediaPath[i];
            }
        };

        /* renamed from: a */
        private String f31286a;

        /* renamed from: b */
        private String f31287b;

        private TextAndMediaPath(Parcel parcel) {
            this.f31286a = parcel.readString();
            this.f31287b = parcel.readString();
        }

        public TextAndMediaPath(String str, String str2) {
            this.f31286a = str;
            this.f31287b = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getMediaPath() {
            return this.f31287b;
        }

        public String getText() {
            return this.f31286a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f31286a);
            parcel.writeString(this.f31287b);
        }
    }

    /* loaded from: classes2.dex */
    public static class TextOnly implements Parcelable {
        public static final Parcelable.Creator<TextOnly> CREATOR = new Parcelable.Creator<TextOnly>() { // from class: com.tencent.connect.dataprovider.DataType.TextOnly.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public TextOnly mo40149createFromParcel(Parcel parcel) {
                return new TextOnly(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public TextOnly[] mo40150newArray(int i) {
                return new TextOnly[i];
            }
        };

        /* renamed from: a */
        private String f31288a;

        private TextOnly(Parcel parcel) {
            this.f31288a = parcel.readString();
        }

        public TextOnly(String str) {
            this.f31288a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getText() {
            return this.f31288a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f31288a);
        }
    }
}
