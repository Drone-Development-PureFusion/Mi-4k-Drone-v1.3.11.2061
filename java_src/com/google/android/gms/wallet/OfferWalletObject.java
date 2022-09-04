package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
/* loaded from: classes2.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new C9410t();

    /* renamed from: a */
    String f29547a;

    /* renamed from: b */
    String f29548b;

    /* renamed from: c */
    CommonWalletObject f29549c;

    /* renamed from: d */
    private final int f29550d;

    OfferWalletObject() {
        this.f29550d = 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f29550d = i;
        this.f29548b = str2;
        if (i < 3) {
            this.f29549c = CommonWalletObject.m8185a().m8181a(str).m8182a();
        } else {
            this.f29549c = commonWalletObject;
        }
    }

    /* renamed from: a */
    public int m8473a() {
        return this.f29550d;
    }

    /* renamed from: b */
    public String m8472b() {
        return this.f29549c.m8183c();
    }

    /* renamed from: c */
    public String m8471c() {
        return this.f29548b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9410t.m8195a(this, parcel, i);
    }
}
