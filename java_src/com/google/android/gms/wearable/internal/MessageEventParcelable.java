package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.AbstractC9634n;
import com.xiaomi.mipush.sdk.Constants;
/* loaded from: classes2.dex */
public class MessageEventParcelable extends AbstractSafeParcelable implements AbstractC9634n {
    public static final Parcelable.Creator<MessageEventParcelable> CREATOR = new C9485ac();

    /* renamed from: a */
    final int f29969a;

    /* renamed from: b */
    private final int f29970b;

    /* renamed from: c */
    private final String f29971c;

    /* renamed from: d */
    private final byte[] f29972d;

    /* renamed from: e */
    private final String f29973e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageEventParcelable(int i, int i2, String str, byte[] bArr, String str2) {
        this.f29969a = i;
        this.f29970b = i2;
        this.f29971c = str;
        this.f29972d = bArr;
        this.f29973e = str2;
    }

    @Override // com.google.android.gms.wearable.AbstractC9634n
    /* renamed from: a */
    public int mo7572a() {
        return this.f29970b;
    }

    @Override // com.google.android.gms.wearable.AbstractC9634n
    /* renamed from: b */
    public String mo7571b() {
        return this.f29971c;
    }

    @Override // com.google.android.gms.wearable.AbstractC9634n
    /* renamed from: c */
    public byte[] mo7570c() {
        return this.f29972d;
    }

    @Override // com.google.android.gms.wearable.AbstractC9634n
    /* renamed from: d */
    public String mo7569d() {
        return this.f29973e;
    }

    public String toString() {
        int i = this.f29970b;
        String str = this.f29971c;
        String valueOf = String.valueOf(this.f29972d == null ? "null" : Integer.valueOf(this.f29972d.length));
        return new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(valueOf).length()).append("MessageEventParcelable[").append(i).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(str).append(", size=").append(valueOf).append("]").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9485ac.m8024a(this, parcel, i);
    }
}
