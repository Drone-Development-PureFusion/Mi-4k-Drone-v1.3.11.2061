package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class StringListResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StringListResponse> CREATOR = new C4866av();

    /* renamed from: a */
    private final int f17822a;

    /* renamed from: b */
    private final List<String> f17823b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StringListResponse(int i, List<String> list) {
        this.f17822a = i;
        this.f17823b = list;
    }

    /* renamed from: a */
    public int m22602a() {
        return this.f17822a;
    }

    /* renamed from: b */
    public List<String> m22601b() {
        return this.f17823b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4866av.m22538a(this, parcel, i);
    }
}
