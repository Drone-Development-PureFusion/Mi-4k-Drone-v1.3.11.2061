package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4683f;
import java.util.Set;
/* loaded from: classes2.dex */
public final class UserDataType extends AbstractSafeParcelable {

    /* renamed from: e */
    final int f26915e;

    /* renamed from: f */
    final String f26916f;

    /* renamed from: g */
    final int f26917g;

    /* renamed from: a */
    public static final UserDataType f26911a = m12325a("test_type", 1);

    /* renamed from: b */
    public static final UserDataType f26912b = m12325a("labeled_place", 6);

    /* renamed from: c */
    public static final UserDataType f26913c = m12325a("here_content", 7);

    /* renamed from: d */
    public static final Set<UserDataType> f26914d = C4683f.m23149a(f26911a, f26912b, f26913c);
    public static final C8334z CREATOR = new C8334z();

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserDataType(int i, String str, int i2) {
        C4588d.m23625a(str);
        this.f26915e = i;
        this.f26916f = str;
        this.f26917g = i2;
    }

    /* renamed from: a */
    private static UserDataType m12325a(String str, int i) {
        return new UserDataType(0, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDataType)) {
            return false;
        }
        UserDataType userDataType = (UserDataType) obj;
        return this.f26916f.equals(userDataType.f26916f) && this.f26917g == userDataType.f26917g;
    }

    public int hashCode() {
        return this.f26916f.hashCode();
    }

    public String toString() {
        return this.f26916f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8334z.m12043a(this, parcel, i);
    }
}
