package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.C8846f;
import com.google.android.gms.nearby.messages.internal.C8849i;
import java.util.UUID;
/* loaded from: classes2.dex */
public class NearbyDeviceFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NearbyDeviceFilter> CREATOR = new C8831b();

    /* renamed from: a */
    final int f28225a;

    /* renamed from: b */
    final int f28226b;

    /* renamed from: c */
    final byte[] f28227c;

    /* renamed from: d */
    final boolean f28228d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NearbyDeviceFilter(int i, int i2, byte[] bArr, boolean z) {
        this.f28225a = i;
        this.f28226b = i2;
        this.f28227c = bArr;
        this.f28228d = z;
    }

    private NearbyDeviceFilter(int i, byte[] bArr) {
        this(1, i, bArr, false);
    }

    /* renamed from: a */
    public static NearbyDeviceFilter m9944a(String str, @Nullable String str2) {
        String valueOf = String.valueOf(str);
        if (str2 == null) {
            str2 = "";
        }
        String valueOf2 = String.valueOf(str2);
        return new NearbyDeviceFilter(2, new C8846f(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).a());
    }

    /* renamed from: a */
    public static NearbyDeviceFilter m9943a(UUID uuid, @Nullable Short sh, @Nullable Short sh2) {
        return new NearbyDeviceFilter(3, new C8849i(uuid, sh, sh2).a());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8831b.m9936a(this, parcel, i);
    }
}
