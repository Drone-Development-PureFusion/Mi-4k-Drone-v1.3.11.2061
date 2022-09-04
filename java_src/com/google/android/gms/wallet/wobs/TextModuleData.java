package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class TextModuleData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TextModuleData> CREATOR = new C9421f();

    /* renamed from: a */
    String f29770a;

    /* renamed from: b */
    String f29771b;

    /* renamed from: c */
    private final int f29772c;

    TextModuleData() {
        this.f29772c = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextModuleData(int i, String str, String str2) {
        this.f29772c = i;
        this.f29770a = str;
        this.f29771b = str2;
    }

    /* renamed from: a */
    public int m8176a() {
        return this.f29772c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9421f.m8155a(this, parcel, i);
    }
}
