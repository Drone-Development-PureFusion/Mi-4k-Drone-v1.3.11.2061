package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class OnResourceIdSetResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnResourceIdSetResponse> CREATOR = new C4851ag();

    /* renamed from: a */
    private final int f17781a;

    /* renamed from: b */
    private final List<String> f17782b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnResourceIdSetResponse(int i, List<String> list) {
        this.f17781a = i;
        this.f17782b = list;
    }

    /* renamed from: a */
    public int m22604a() {
        return this.f17781a;
    }

    /* renamed from: b */
    public List<String> m22603b() {
        return this.f17782b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4851ag.m22577a(this, parcel, i);
    }
}
