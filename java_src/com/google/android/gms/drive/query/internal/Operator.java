package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class Operator extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Operator> CREATOR = new C5049n();

    /* renamed from: a */
    public static final Operator f18096a = new Operator("=");

    /* renamed from: b */
    public static final Operator f18097b = new Operator("<");

    /* renamed from: c */
    public static final Operator f18098c = new Operator("<=");

    /* renamed from: d */
    public static final Operator f18099d = new Operator(">");

    /* renamed from: e */
    public static final Operator f18100e = new Operator(">=");

    /* renamed from: f */
    public static final Operator f18101f = new Operator("and");

    /* renamed from: g */
    public static final Operator f18102g = new Operator("or");

    /* renamed from: h */
    public static final Operator f18103h = new Operator("not");

    /* renamed from: i */
    public static final Operator f18104i = new Operator("contains");

    /* renamed from: j */
    final String f18105j;

    /* renamed from: k */
    final int f18106k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Operator(int i, String str) {
        this.f18106k = i;
        this.f18105j = str;
    }

    private Operator(String str) {
        this(1, str);
    }

    /* renamed from: a */
    public String m22004a() {
        return this.f18105j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Operator operator = (Operator) obj;
            return this.f18105j == null ? operator.f18105j == null : this.f18105j.equals(operator.f18105j);
        }
        return false;
    }

    public int hashCode() {
        return (this.f18105j == null ? 0 : this.f18105j.hashCode()) + 31;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5049n.m21950a(this, parcel, i);
    }
}
