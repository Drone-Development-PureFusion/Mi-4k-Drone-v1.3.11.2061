package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class ClientAppContext extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ClientAppContext> CREATOR = new C8844d();

    /* renamed from: a */
    final int f28257a;
    @Nullable

    /* renamed from: b */
    public final String f28258b;
    @Nullable

    /* renamed from: c */
    public final String f28259c;

    /* renamed from: d */
    public final boolean f28260d;

    /* renamed from: e */
    public final int f28261e;

    /* renamed from: f */
    public final String f28262f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ClientAppContext(int i, @Nullable String str, @Nullable String str2, boolean z, int i2, @Nullable String str3) {
        this.f28257a = i;
        this.f28258b = str;
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Log.w("NearbyMessages", String.format("ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", str2, "0p:"));
            String valueOf = String.valueOf("0p:");
            String valueOf2 = String.valueOf(str2);
            str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        this.f28259c = str2;
        this.f28260d = z;
        this.f28261e = i2;
        this.f28262f = str3;
    }

    public ClientAppContext(@Nullable String str, @Nullable String str2, boolean z) {
        this(str, str2, z, null, 0);
    }

    public ClientAppContext(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, int i) {
        this(1, str, str2, z, i, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public static final ClientAppContext m9919a(@Nullable ClientAppContext clientAppContext, @Nullable String str, @Nullable String str2, boolean z) {
        if (clientAppContext != null) {
            return clientAppContext;
        }
        if (str != null || str2 != null) {
            return new ClientAppContext(str, str2, z);
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m9918a(String str, String str2) {
        return TextUtils.isEmpty(str) ? TextUtils.isEmpty(str2) : str.equals(str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAppContext)) {
            return false;
        }
        ClientAppContext clientAppContext = (ClientAppContext) obj;
        return m9918a(this.f28258b, clientAppContext.f28258b) && m9918a(this.f28259c, clientAppContext.f28259c) && this.f28260d == clientAppContext.f28260d && m9918a(this.f28262f, clientAppContext.f28262f) && this.f28261e == clientAppContext.f28261e;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f28258b, this.f28259c, Boolean.valueOf(this.f28260d), this.f28262f, Integer.valueOf(this.f28261e));
    }

    public String toString() {
        return String.format("{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", this.f28258b, this.f28259c, Boolean.valueOf(this.f28260d), this.f28262f, Integer.valueOf(this.f28261e));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8844d.m9884a(this, parcel, i);
    }
}
