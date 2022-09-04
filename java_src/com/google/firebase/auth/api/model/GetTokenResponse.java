package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4685h;
import com.google.android.gms.internal.AbstractC7022gc;
import com.google.android.gms.internal.AbstractC7491om;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
/* loaded from: classes.dex */
public class GetTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetTokenResponse> CREATOR = new C9722d();
    @AbstractC7022gc

    /* renamed from: a */
    public final int f30385a;
    @AbstractC7491om(m14334a = "refresh_token")

    /* renamed from: b */
    private String f30386b;
    @AbstractC7491om(m14334a = "access_token")

    /* renamed from: c */
    private String f30387c;
    @AbstractC7491om(m14334a = "expires_in")

    /* renamed from: d */
    private Long f30388d;
    @AbstractC7491om(m14334a = XiaomiOAuthConstants.EXTRA_TOKEN_TYPE_2)

    /* renamed from: e */
    private String f30389e;
    @AbstractC7491om(m14334a = "issued_at")

    /* renamed from: f */
    private Long f30390f;

    public GetTokenResponse() {
        this.f30385a = 1;
        this.f30390f = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetTokenResponse(int i, String str, String str2, Long l, String str3, Long l2) {
        this.f30385a = i;
        this.f30386b = str;
        this.f30387c = str2;
        this.f30388d = l;
        this.f30389e = str3;
        this.f30390f = l2;
    }

    /* renamed from: a */
    public void m7331a(@NonNull String str) {
        this.f30386b = C4588d.m23625a(str);
    }

    /* renamed from: a */
    public boolean m7332a() {
        return C4685h.m23138d().mo16434a() + MiStatInterface.MIN_UPLOAD_INTERVAL < this.f30390f.longValue() + (this.f30388d.longValue() * 1000);
    }

    /* renamed from: b */
    public String m7330b() {
        return this.f30386b;
    }

    /* renamed from: c */
    public String m7329c() {
        return this.f30387c;
    }

    /* renamed from: d */
    public long m7328d() {
        if (this.f30388d == null) {
            return 0L;
        }
        return this.f30388d.longValue();
    }

    @Nullable
    /* renamed from: e */
    public String m7327e() {
        return this.f30389e;
    }

    /* renamed from: f */
    public long m7326f() {
        return this.f30390f.longValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9722d.m7294a(this, parcel, i);
    }
}
