package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
/* loaded from: classes2.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new C9402l();

    /* renamed from: a */
    final int f29453a;

    /* renamed from: b */
    CommonWalletObject f29454b;

    /* renamed from: c */
    String f29455c;

    /* renamed from: d */
    String f29456d;

    /* renamed from: e */
    String f29457e;

    /* renamed from: f */
    long f29458f;

    /* renamed from: g */
    String f29459g;

    /* renamed from: h */
    long f29460h;

    /* renamed from: i */
    String f29461i;

    GiftCardWalletObject() {
        this.f29454b = CommonWalletObject.m8185a().m8182a();
        this.f29453a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GiftCardWalletObject(int i, CommonWalletObject commonWalletObject, String str, String str2, String str3, long j, String str4, long j2, String str5) {
        this.f29454b = CommonWalletObject.m8185a().m8182a();
        this.f29453a = i;
        this.f29454b = commonWalletObject;
        this.f29455c = str;
        this.f29456d = str2;
        this.f29458f = j;
        this.f29459g = str4;
        this.f29460h = j2;
        this.f29461i = str5;
        this.f29457e = str3;
    }

    /* renamed from: a */
    public int m8572a() {
        return this.f29453a;
    }

    /* renamed from: b */
    public String m8571b() {
        return this.f29454b.m8183c();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9402l.m8219a(this, parcel, i);
    }
}
