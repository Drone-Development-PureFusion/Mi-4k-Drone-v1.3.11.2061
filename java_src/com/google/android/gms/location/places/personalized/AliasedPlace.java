package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class AliasedPlace extends AbstractSafeParcelable {
    public static final C8298a CREATOR = new C8298a();

    /* renamed from: a */
    final int f27173a;

    /* renamed from: b */
    private final String f27174b;

    /* renamed from: c */
    private final List<String> f27175c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AliasedPlace(int i, @NonNull String str, @NonNull List<String> list) {
        this.f27173a = i;
        this.f27174b = str;
        this.f27175c = list;
    }

    /* renamed from: a */
    public String m12136a() {
        return this.f27174b;
    }

    /* renamed from: b */
    public List<String> m12135b() {
        return this.f27175c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasedPlace)) {
            return false;
        }
        AliasedPlace aliasedPlace = (AliasedPlace) obj;
        return this.f27174b.equals(aliasedPlace.f27174b) && this.f27175c.equals(aliasedPlace.f27175c);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f27174b, this.f27175c);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("placeId", this.f27174b).m23632a("placeAliases", this.f27175c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8298a.m12127a(this, parcel, i);
    }
}
