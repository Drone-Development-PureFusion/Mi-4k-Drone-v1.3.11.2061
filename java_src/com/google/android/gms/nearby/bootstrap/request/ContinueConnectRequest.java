package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.anb;
/* loaded from: classes2.dex */
public class ContinueConnectRequest extends AbstractSafeParcelable {
    public static final C8748b CREATOR = new C8748b();

    /* renamed from: a */
    final int f28018a;

    /* renamed from: b */
    private final String f28019b;

    /* renamed from: c */
    private final anb f28020c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ContinueConnectRequest(int i, String str, IBinder iBinder) {
        this.f28018a = i;
        this.f28019b = (String) C4588d.m23627a(str);
        this.f28020c = anb.AbstractBinderC6602a.m16700a(iBinder);
    }

    /* renamed from: a */
    public String m10272a() {
        return this.f28019b;
    }

    /* renamed from: b */
    public IBinder m10271b() {
        if (this.f28020c == null) {
            return null;
        }
        return this.f28020c.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8748b c8748b = CREATOR;
        C8748b.m10248a(this, parcel, i);
    }
}
