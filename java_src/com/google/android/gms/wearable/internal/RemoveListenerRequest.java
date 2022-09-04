package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.AbstractC9618x;
/* loaded from: classes2.dex */
public class RemoveListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoveListenerRequest> CREATOR = new C9497ai();

    /* renamed from: a */
    final int f29989a;

    /* renamed from: b */
    public final AbstractC9618x f29990b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemoveListenerRequest(int i, IBinder iBinder) {
        this.f29989a = i;
        if (iBinder != null) {
            this.f29990b = AbstractC9618x.AbstractBinderC9619a.m7708a(iBinder);
        } else {
            this.f29990b = null;
        }
    }

    public RemoveListenerRequest(AbstractC9618x abstractC9618x) {
        this.f29989a = 1;
        this.f29990b = abstractC9618x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder m8037a() {
        if (this.f29990b == null) {
            return null;
        }
        return this.f29990b.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9497ai.m8001a(this, parcel, i);
    }
}
