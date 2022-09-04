package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.tencent.p263mm.sdk.contact.RContact;
@Deprecated
/* loaded from: classes.dex */
public class PlaceAlias extends AbstractSafeParcelable {
    public static final C8303d CREATOR = new C8303d();

    /* renamed from: a */
    public static final PlaceAlias f27179a = new PlaceAlias(0, "Home");

    /* renamed from: b */
    public static final PlaceAlias f27180b = new PlaceAlias(0, "Work");

    /* renamed from: c */
    final int f27181c;

    /* renamed from: d */
    private final String f27182d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlaceAlias(int i, String str) {
        this.f27181c = i;
        this.f27182d = str;
    }

    /* renamed from: a */
    public String m12133a() {
        return this.f27182d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceAlias) {
            return C4585c.m23634a(this.f27182d, ((PlaceAlias) obj).f27182d);
        }
        return false;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f27182d);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a(RContact.COL_ALIAS, this.f27182d).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8303d.m12117a(this, parcel, i);
    }
}
