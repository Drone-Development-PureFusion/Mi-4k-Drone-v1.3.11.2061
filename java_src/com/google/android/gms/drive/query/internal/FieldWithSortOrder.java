package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
/* loaded from: classes2.dex */
public class FieldWithSortOrder extends AbstractSafeParcelable {
    public static final C5038c CREATOR = new C5038c();

    /* renamed from: a */
    final String f18067a;

    /* renamed from: b */
    final boolean f18068b;

    /* renamed from: c */
    final int f18069c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FieldWithSortOrder(int i, String str, boolean z) {
        this.f18069c = i;
        this.f18067a = str;
        this.f18068b = z;
    }

    public FieldWithSortOrder(String str, boolean z) {
        this(1, str, z);
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = this.f18067a;
        objArr[1] = this.f18068b ? "ASC" : "DESC";
        return String.format(locale, "FieldWithSortOrder[%s %s]", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5038c.m21994a(this, parcel, i);
    }
}
