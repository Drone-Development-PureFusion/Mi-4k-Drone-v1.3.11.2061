package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7649rd;
import com.google.android.gms.internal.ajt;
/* loaded from: classes2.dex */
public class ChangeSequenceNumber extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChangeSequenceNumber> CREATOR = new C5024p();

    /* renamed from: a */
    final int f17498a;

    /* renamed from: b */
    final long f17499b;

    /* renamed from: c */
    final long f17500c;

    /* renamed from: d */
    final long f17501d;

    /* renamed from: e */
    private volatile String f17502e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChangeSequenceNumber(int i, long j, long j2, long j3) {
        boolean z = true;
        C4588d.m23619b(j != -1);
        C4588d.m23619b(j2 != -1);
        C4588d.m23619b(j3 == -1 ? false : z);
        this.f17498a = i;
        this.f17499b = j;
        this.f17500c = j2;
        this.f17501d = j3;
    }

    /* renamed from: a */
    public final String m22746a() {
        if (this.f17502e == null) {
            String encodeToString = Base64.encodeToString(m22745b(), 10);
            String valueOf = String.valueOf("ChangeSequenceNumber:");
            String valueOf2 = String.valueOf(encodeToString);
            this.f17502e = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return this.f17502e;
    }

    /* renamed from: b */
    final byte[] m22745b() {
        ajt ajtVar = new ajt();
        ajtVar.f22045a = this.f17498a;
        ajtVar.f22046b = this.f17499b;
        ajtVar.f22047c = this.f17500c;
        ajtVar.f22048d = this.f17501d;
        return AbstractC7649rd.m13857a(ajtVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ChangeSequenceNumber)) {
            return false;
        }
        ChangeSequenceNumber changeSequenceNumber = (ChangeSequenceNumber) obj;
        return changeSequenceNumber.f17500c == this.f17500c && changeSequenceNumber.f17501d == this.f17501d && changeSequenceNumber.f17499b == this.f17499b;
    }

    public int hashCode() {
        String valueOf = String.valueOf(String.valueOf(this.f17499b));
        String valueOf2 = String.valueOf(String.valueOf(this.f17500c));
        String valueOf3 = String.valueOf(String.valueOf(this.f17501d));
        return new StringBuilder(String.valueOf(valueOf).length() + 0 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append(valueOf).append(valueOf2).append(valueOf3).toString().hashCode();
    }

    public String toString() {
        return m22746a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5024p.m22057a(this, parcel, i);
    }
}
