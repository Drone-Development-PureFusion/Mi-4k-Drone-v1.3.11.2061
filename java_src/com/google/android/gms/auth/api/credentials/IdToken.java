package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.internal.C4013b;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new C4010h();

    /* renamed from: a */
    final int f15419a;
    @NonNull

    /* renamed from: b */
    private final String f15420b;
    @NonNull

    /* renamed from: c */
    private final String f15421c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IdToken(int i, @NonNull String str, @NonNull String str2) {
        C4013b.m25744a(str);
        C4588d.m23618b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f15419a = i;
        this.f15420b = str;
        this.f15421c = str2;
    }

    public IdToken(@NonNull String str, @NonNull String str2) {
        this(1, str, str2);
    }

    @NonNull
    /* renamed from: a */
    public String m25781a() {
        return this.f15420b;
    }

    @NonNull
    /* renamed from: b */
    public String m25780b() {
        return this.f15421c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4010h.m25751a(this, parcel, i);
    }
}
