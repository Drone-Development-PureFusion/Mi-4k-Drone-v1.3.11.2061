package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class HandleClientLifecycleEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HandleClientLifecycleEventRequest> CREATOR = new C8848h();

    /* renamed from: a */
    public final int f28270a;
    @Deprecated

    /* renamed from: b */
    public final ClientAppContext f28271b;

    /* renamed from: c */
    public final int f28272c;

    public HandleClientLifecycleEventRequest(int i) {
        this(1, null, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandleClientLifecycleEventRequest(int i, ClientAppContext clientAppContext, int i2) {
        this.f28270a = i;
        this.f28271b = clientAppContext;
        this.f28272c = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8848h.m9870a(this, parcel, i);
    }
}
