package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C4088k CREATOR = new C4088k();

    /* renamed from: a */
    final int f15342a;

    /* renamed from: b */
    private final String f15343b;

    /* renamed from: c */
    private final Long f15344c;

    /* renamed from: d */
    private final boolean f15345d;

    /* renamed from: e */
    private final boolean f15346e;

    /* renamed from: f */
    private final List<String> f15347f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list) {
        this.f15342a = i;
        this.f15343b = C4588d.m23625a(str);
        this.f15344c = l;
        this.f15345d = z;
        this.f15346e = z2;
        this.f15347f = list;
    }

    @Nullable
    /* renamed from: a */
    public static TokenData m25861a(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    /* renamed from: a */
    public String m25862a() {
        return this.f15343b;
    }

    @Nullable
    /* renamed from: b */
    public Long m25860b() {
        return this.f15344c;
    }

    /* renamed from: c */
    public boolean m25859c() {
        return this.f15345d;
    }

    /* renamed from: d */
    public boolean m25858d() {
        return this.f15346e;
    }

    @Nullable
    /* renamed from: e */
    public List<String> m25857e() {
        return this.f15347f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f15343b, tokenData.f15343b) && C4585c.m23634a(this.f15344c, tokenData.f15344c) && this.f15345d == tokenData.f15345d && this.f15346e == tokenData.f15346e && C4585c.m23634a(this.f15347f, tokenData.f15347f);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f15343b, this.f15344c, Boolean.valueOf(this.f15345d), Boolean.valueOf(this.f15346e), this.f15347f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4088k.m25516a(this, parcel, i);
    }
}
