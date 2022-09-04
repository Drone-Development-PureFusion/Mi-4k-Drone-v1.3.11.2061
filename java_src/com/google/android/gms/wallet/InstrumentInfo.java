package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new C9403m();

    /* renamed from: a */
    private final int f29462a;

    /* renamed from: b */
    private String f29463b;

    /* renamed from: c */
    private String f29464c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InstrumentInfo(int i, String str, String str2) {
        this.f29462a = i;
        this.f29463b = str;
        this.f29464c = str2;
    }

    /* renamed from: a */
    public int m8570a() {
        return this.f29462a;
    }

    /* renamed from: b */
    public String m8569b() {
        return this.f29463b;
    }

    /* renamed from: c */
    public String m8568c() {
        return this.f29464c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9403m.m8216a(this, parcel, i);
    }
}
