package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
/* loaded from: classes2.dex */
public class CustomProperty extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CustomProperty> CREATOR = new C5004c();

    /* renamed from: a */
    final int f17992a;

    /* renamed from: b */
    final CustomPropertyKey f17993b;

    /* renamed from: c */
    final String f17994c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CustomProperty(int i, CustomPropertyKey customPropertyKey, String str) {
        this.f17992a = i;
        C4588d.m23626a(customPropertyKey, "key");
        this.f17993b = customPropertyKey;
        this.f17994c = str;
    }

    public CustomProperty(CustomPropertyKey customPropertyKey, String str) {
        this(1, customPropertyKey, str);
    }

    /* renamed from: a */
    public CustomPropertyKey m22158a() {
        return this.f17993b;
    }

    /* renamed from: b */
    public String m22157b() {
        return this.f17994c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        CustomProperty customProperty = (CustomProperty) obj;
        return C4585c.m23634a(this.f17993b, customProperty.f17993b) && C4585c.m23634a(this.f17994c, customProperty.f17994c);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17993b, this.f17994c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5004c.m22138a(this, parcel, i);
    }
}
