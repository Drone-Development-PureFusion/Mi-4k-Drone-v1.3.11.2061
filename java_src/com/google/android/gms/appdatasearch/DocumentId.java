package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class DocumentId extends AbstractSafeParcelable {
    public static final C3955c CREATOR = new C3955c();

    /* renamed from: a */
    final int f15236a;

    /* renamed from: b */
    final String f15237b;

    /* renamed from: c */
    final String f15238c;

    /* renamed from: d */
    final String f15239d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DocumentId(int i, String str, String str2, String str3) {
        this.f15236a = i;
        this.f15237b = str;
        this.f15238c = str2;
        this.f15239d = str3;
    }

    public DocumentId(String str, String str2, String str3) {
        this(1, str, str2, str3);
    }

    public String toString() {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", this.f15237b, this.f15238c, this.f15239d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3955c c3955c = CREATOR;
        C3955c.m25923a(this, parcel, i);
    }
}
