package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.all;
/* loaded from: classes2.dex */
public class ListSubscriptionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ListSubscriptionsRequest> CREATOR = new C5213ai();

    /* renamed from: a */
    private final int f18958a;

    /* renamed from: b */
    private final DataType f18959b;

    /* renamed from: c */
    private final all f18960c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ListSubscriptionsRequest(int i, DataType dataType, IBinder iBinder) {
        this.f18958a = i;
        this.f18959b = dataType;
        this.f18960c = all.AbstractBinderC6502a.m16939a(iBinder);
    }

    public ListSubscriptionsRequest(DataType dataType, all allVar) {
        this.f18958a = 3;
        this.f18959b = dataType;
        this.f18960c = allVar;
    }

    /* renamed from: a */
    public DataType m21232a() {
        return this.f18959b;
    }

    /* renamed from: b */
    public IBinder m21231b() {
        if (this.f18960c == null) {
            return null;
        }
        return this.f18960c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m21230c() {
        return this.f18958a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5213ai.m21082a(this, parcel, i);
    }
}
