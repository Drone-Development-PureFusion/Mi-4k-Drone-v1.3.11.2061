package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.AbstractC8853k;
import com.google.android.gms.nearby.messages.internal.AbstractC8859m;
/* loaded from: classes.dex */
public final class PublishRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublishRequest> CREATOR = new C8898w();

    /* renamed from: a */
    final int f28278a;

    /* renamed from: b */
    public final MessageWrapper f28279b;

    /* renamed from: c */
    public final Strategy f28280c;

    /* renamed from: d */
    public final AbstractC8853k f28281d;
    @Deprecated

    /* renamed from: e */
    public final String f28282e;
    @Deprecated

    /* renamed from: f */
    public final String f28283f;
    @Deprecated

    /* renamed from: g */
    public final boolean f28284g;

    /* renamed from: h */
    public final AbstractC8859m f28285h;
    @Deprecated

    /* renamed from: i */
    public final boolean f28286i;
    @Deprecated

    /* renamed from: j */
    public final ClientAppContext f28287j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PublishRequest(int i, MessageWrapper messageWrapper, Strategy strategy, IBinder iBinder, String str, String str2, boolean z, IBinder iBinder2, boolean z2, ClientAppContext clientAppContext) {
        this.f28278a = i;
        this.f28279b = messageWrapper;
        this.f28280c = strategy;
        this.f28281d = AbstractC8853k.AbstractBinderC8854a.m9863a(iBinder);
        this.f28282e = str;
        this.f28283f = str2;
        this.f28284g = z;
        this.f28285h = iBinder2 == null ? null : AbstractC8859m.AbstractBinderC8860a.m9853a(iBinder2);
        this.f28286i = z2;
        this.f28287j = ClientAppContext.m9919a(clientAppContext, str2, str, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PublishRequest(MessageWrapper messageWrapper, Strategy strategy, IBinder iBinder, IBinder iBinder2) {
        this(2, messageWrapper, strategy, iBinder, null, null, false, iBinder2, false, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder m9911a() {
        return this.f28281d.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public IBinder m9910b() {
        if (this.f28285h == null) {
            return null;
        }
        return this.f28285h.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8898w.m9778a(this, parcel, i);
    }
}
