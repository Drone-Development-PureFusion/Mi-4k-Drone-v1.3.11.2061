package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final C8337s CREATOR = new C8337s();

    /* renamed from: a */
    private final int f26630a;

    /* renamed from: b */
    private final int f26631b;

    /* renamed from: c */
    private final int f26632c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityTransition(int i, int i2, int i3) {
        this.f26630a = i;
        this.f26631b = i2;
        this.f26632c = i3;
    }

    /* renamed from: a */
    public int m12657a() {
        return this.f26630a;
    }

    /* renamed from: b */
    public int m12656b() {
        return this.f26631b;
    }

    /* renamed from: c */
    public int m12655c() {
        return this.f26632c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f26631b == activityTransition.f26631b && this.f26632c == activityTransition.f26632c;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f26631b), Integer.valueOf(this.f26632c));
    }

    public String toString() {
        int i = this.f26631b;
        return new StringBuilder(75).append("ActivityTransition [mActivityType=").append(i).append(", mTransitionType=").append(this.f26632c).append("]").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8337s.m12036a(this, parcel, i);
    }
}
