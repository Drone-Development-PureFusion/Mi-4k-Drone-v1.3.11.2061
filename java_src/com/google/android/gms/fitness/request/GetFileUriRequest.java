package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ala;
import java.util.Locale;
/* loaded from: classes2.dex */
public class GetFileUriRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetFileUriRequest> CREATOR = new C5206ad();

    /* renamed from: a */
    private final int f18949a;

    /* renamed from: b */
    private final ala f18950b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetFileUriRequest(int i, IBinder iBinder) {
        this.f18949a = i;
        this.f18950b = ala.AbstractBinderC6481a.m16989a(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m21242a() {
        return this.f18949a;
    }

    /* renamed from: b */
    public IBinder m21241b() {
        return this.f18950b.asBinder();
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "GetFileUriRequest {%d, %s}", Integer.valueOf(this.f18949a), this.f18950b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5206ad.m21095a(this, parcel, i);
    }
}
