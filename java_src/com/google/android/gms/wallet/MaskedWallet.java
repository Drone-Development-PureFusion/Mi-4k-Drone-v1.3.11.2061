package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
/* loaded from: classes.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new C9407q();

    /* renamed from: a */
    String f29502a;

    /* renamed from: b */
    String f29503b;

    /* renamed from: c */
    String[] f29504c;

    /* renamed from: d */
    String f29505d;

    /* renamed from: e */
    Address f29506e;

    /* renamed from: f */
    Address f29507f;

    /* renamed from: g */
    LoyaltyWalletObject[] f29508g;

    /* renamed from: h */
    OfferWalletObject[] f29509h;

    /* renamed from: i */
    UserAddress f29510i;

    /* renamed from: j */
    UserAddress f29511j;

    /* renamed from: k */
    InstrumentInfo[] f29512k;

    /* renamed from: l */
    private final int f29513l;

    /* renamed from: com.google.android.gms.wallet.MaskedWallet$a */
    /* loaded from: classes.dex */
    public final class C9339a {
        private C9339a() {
        }

        /* renamed from: a */
        public C9339a m8525a(UserAddress userAddress) {
            MaskedWallet.this.f29510i = userAddress;
            return this;
        }

        /* renamed from: a */
        public C9339a m8524a(String str) {
            MaskedWallet.this.f29502a = str;
            return this;
        }

        /* renamed from: a */
        public C9339a m8523a(InstrumentInfo[] instrumentInfoArr) {
            MaskedWallet.this.f29512k = instrumentInfoArr;
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C9339a m8522a(LoyaltyWalletObject[] loyaltyWalletObjectArr) {
            MaskedWallet.this.f29508g = loyaltyWalletObjectArr;
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C9339a m8521a(OfferWalletObject[] offerWalletObjectArr) {
            MaskedWallet.this.f29509h = offerWalletObjectArr;
            return this;
        }

        /* renamed from: a */
        public C9339a m8520a(String[] strArr) {
            MaskedWallet.this.f29504c = strArr;
            return this;
        }

        /* renamed from: a */
        public MaskedWallet m8526a() {
            return MaskedWallet.this;
        }

        /* renamed from: b */
        public C9339a m8519b(UserAddress userAddress) {
            MaskedWallet.this.f29511j = userAddress;
            return this;
        }

        /* renamed from: b */
        public C9339a m8518b(String str) {
            MaskedWallet.this.f29503b = str;
            return this;
        }

        /* renamed from: c */
        public C9339a m8517c(String str) {
            MaskedWallet.this.f29505d = str;
            return this;
        }
    }

    private MaskedWallet() {
        this.f29513l = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MaskedWallet(int i, String str, String str2, String[] strArr, String str3, Address address, Address address2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.f29513l = i;
        this.f29502a = str;
        this.f29503b = str2;
        this.f29504c = strArr;
        this.f29505d = str3;
        this.f29506e = address;
        this.f29507f = address2;
        this.f29508g = loyaltyWalletObjectArr;
        this.f29509h = offerWalletObjectArr;
        this.f29510i = userAddress;
        this.f29511j = userAddress2;
        this.f29512k = instrumentInfoArr;
    }

    /* renamed from: a */
    public static C9339a m8538a() {
        MaskedWallet maskedWallet = new MaskedWallet();
        maskedWallet.getClass();
        return new C9339a();
    }

    /* renamed from: a */
    public static C9339a m8537a(MaskedWallet maskedWallet) {
        C4588d.m23627a(maskedWallet);
        return m8538a().m8524a(maskedWallet.m8535c()).m8518b(maskedWallet.m8534d()).m8520a(maskedWallet.m8533e()).m8523a(maskedWallet.m8532f()).m8517c(maskedWallet.m8531g()).m8522a(maskedWallet.m8530h()).m8521a(maskedWallet.m8529i()).m8525a(maskedWallet.m8528j()).m8519b(maskedWallet.m8527k());
    }

    /* renamed from: b */
    public int m8536b() {
        return this.f29513l;
    }

    /* renamed from: c */
    public String m8535c() {
        return this.f29502a;
    }

    /* renamed from: d */
    public String m8534d() {
        return this.f29503b;
    }

    /* renamed from: e */
    public String[] m8533e() {
        return this.f29504c;
    }

    /* renamed from: f */
    public InstrumentInfo[] m8532f() {
        return this.f29512k;
    }

    /* renamed from: g */
    public String m8531g() {
        return this.f29505d;
    }

    @Deprecated
    /* renamed from: h */
    public LoyaltyWalletObject[] m8530h() {
        return this.f29508g;
    }

    @Deprecated
    /* renamed from: i */
    public OfferWalletObject[] m8529i() {
        return this.f29509h;
    }

    /* renamed from: j */
    public UserAddress m8528j() {
        return this.f29510i;
    }

    /* renamed from: k */
    public UserAddress m8527k() {
        return this.f29511j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9407q.m8204a(this, parcel, i);
    }
}
