package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.AbstractC9618x;
/* loaded from: classes2.dex */
public class AddListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddListenerRequest> CREATOR = new C9539au();

    /* renamed from: a */
    final int f29857a;

    /* renamed from: b */
    public final AbstractC9618x f29858b;

    /* renamed from: c */
    public final IntentFilter[] f29859c;

    /* renamed from: d */
    public final String f29860d;

    /* renamed from: e */
    public final String f29861e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AddListenerRequest(int i, IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        this.f29857a = i;
        if (iBinder != null) {
            this.f29858b = AbstractC9618x.AbstractBinderC9619a.m7708a(iBinder);
        } else {
            this.f29858b = null;
        }
        this.f29859c = intentFilterArr;
        this.f29860d = str;
        this.f29861e = str2;
    }

    public AddListenerRequest(BinderC9531as binderC9531as) {
        this.f29857a = 1;
        this.f29858b = binderC9531as;
        this.f29859c = binderC9531as.m7936b();
        this.f29860d = binderC9531as.m7930c();
        this.f29861e = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder m8093a() {
        if (this.f29858b == null) {
            return null;
        }
        return this.f29858b.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9539au.m7914a(this, parcel, i);
    }
}
