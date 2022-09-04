package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.anb;
import com.google.android.gms.internal.and;
/* loaded from: classes2.dex */
public class StartScanRequest extends AbstractSafeParcelable {
    public static final C8753g CREATOR = new C8753g();

    /* renamed from: a */
    final int f28038a;

    /* renamed from: b */
    private final and f28039b;

    /* renamed from: c */
    private final anb f28040c;

    /* renamed from: d */
    private final byte f28041d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StartScanRequest(int i, byte b, IBinder iBinder, IBinder iBinder2) {
        this.f28038a = i;
        this.f28041d = b;
        C4588d.m23627a(iBinder);
        this.f28039b = and.AbstractBinderC6606a.m16687a(iBinder);
        C4588d.m23627a(iBinder2);
        this.f28040c = anb.AbstractBinderC6602a.m16700a(iBinder2);
    }

    /* renamed from: a */
    public byte m10257a() {
        return this.f28041d;
    }

    /* renamed from: b */
    public IBinder m10256b() {
        if (this.f28039b == null) {
            return null;
        }
        return this.f28039b.asBinder();
    }

    /* renamed from: c */
    public IBinder m10255c() {
        if (this.f28040c == null) {
            return null;
        }
        return this.f28040c.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8753g c8753g = CREATOR;
        C8753g.m10233a(this, parcel, i);
    }
}
