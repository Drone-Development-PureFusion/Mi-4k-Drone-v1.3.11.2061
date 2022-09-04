package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
/* loaded from: classes.dex */
public final class MaskedWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWalletRequest> CREATOR = new C9408r();

    /* renamed from: a */
    String f29515a;

    /* renamed from: b */
    boolean f29516b;

    /* renamed from: c */
    boolean f29517c;

    /* renamed from: d */
    boolean f29518d;

    /* renamed from: e */
    String f29519e;

    /* renamed from: f */
    String f29520f;

    /* renamed from: g */
    String f29521g;

    /* renamed from: h */
    Cart f29522h;

    /* renamed from: i */
    boolean f29523i;

    /* renamed from: j */
    boolean f29524j;

    /* renamed from: k */
    CountrySpecification[] f29525k;

    /* renamed from: l */
    boolean f29526l;

    /* renamed from: m */
    boolean f29527m;

    /* renamed from: n */
    ArrayList<com.google.android.gms.identity.intents.model.CountrySpecification> f29528n;

    /* renamed from: o */
    PaymentMethodTokenizationParameters f29529o;

    /* renamed from: p */
    ArrayList<Integer> f29530p;

    /* renamed from: q */
    String f29531q;

    /* renamed from: r */
    private final int f29532r;

    /* renamed from: com.google.android.gms.wallet.MaskedWalletRequest$a */
    /* loaded from: classes.dex */
    public final class C9341a {
        private C9341a() {
        }

        /* renamed from: a */
        public C9341a m8498a(int i) {
            if (MaskedWalletRequest.this.f29530p == null) {
                MaskedWalletRequest.this.f29530p = new ArrayList<>();
            }
            MaskedWalletRequest.this.f29530p.add(Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public C9341a m8497a(com.google.android.gms.identity.intents.model.CountrySpecification countrySpecification) {
            if (MaskedWalletRequest.this.f29528n == null) {
                MaskedWalletRequest.this.f29528n = new ArrayList<>();
            }
            MaskedWalletRequest.this.f29528n.add(countrySpecification);
            return this;
        }

        /* renamed from: a */
        public C9341a m8496a(Cart cart) {
            MaskedWalletRequest.this.f29522h = cart;
            return this;
        }

        /* renamed from: a */
        public C9341a m8495a(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
            MaskedWalletRequest.this.f29529o = paymentMethodTokenizationParameters;
            return this;
        }

        /* renamed from: a */
        public C9341a m8494a(String str) {
            MaskedWalletRequest.this.f29515a = str;
            return this;
        }

        /* renamed from: a */
        public C9341a m8493a(Collection<com.google.android.gms.identity.intents.model.CountrySpecification> collection) {
            if (collection != null) {
                if (MaskedWalletRequest.this.f29528n == null) {
                    MaskedWalletRequest.this.f29528n = new ArrayList<>();
                }
                MaskedWalletRequest.this.f29528n.addAll(collection);
            }
            return this;
        }

        /* renamed from: a */
        public C9341a m8492a(boolean z) {
            MaskedWalletRequest.this.f29516b = z;
            return this;
        }

        /* renamed from: a */
        public MaskedWalletRequest m8499a() {
            return MaskedWalletRequest.this;
        }

        /* renamed from: b */
        public C9341a m8491b(String str) {
            MaskedWalletRequest.this.f29519e = str;
            return this;
        }

        /* renamed from: b */
        public C9341a m8490b(Collection<Integer> collection) {
            if (collection != null) {
                if (MaskedWalletRequest.this.f29530p == null) {
                    MaskedWalletRequest.this.f29530p = new ArrayList<>();
                }
                MaskedWalletRequest.this.f29530p.addAll(collection);
            }
            return this;
        }

        /* renamed from: b */
        public C9341a m8489b(boolean z) {
            MaskedWalletRequest.this.f29517c = z;
            return this;
        }

        /* renamed from: c */
        public C9341a m8488c(String str) {
            MaskedWalletRequest.this.f29520f = str;
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C9341a m8487c(boolean z) {
            MaskedWalletRequest.this.f29518d = z;
            return this;
        }

        /* renamed from: d */
        public C9341a m8486d(String str) {
            MaskedWalletRequest.this.f29521g = str;
            return this;
        }

        @Deprecated
        /* renamed from: d */
        public C9341a m8485d(boolean z) {
            MaskedWalletRequest.this.f29524j = z;
            return this;
        }

        /* renamed from: e */
        public C9341a m8484e(boolean z) {
            MaskedWalletRequest.this.f29526l = z;
            return this;
        }

        /* renamed from: f */
        public C9341a m8483f(boolean z) {
            MaskedWalletRequest.this.f29527m = z;
            return this;
        }
    }

    MaskedWalletRequest() {
        this.f29532r = 3;
        this.f29526l = true;
        this.f29527m = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MaskedWalletRequest(int i, String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, Cart cart, boolean z4, boolean z5, CountrySpecification[] countrySpecificationArr, boolean z6, boolean z7, ArrayList<com.google.android.gms.identity.intents.model.CountrySpecification> arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, ArrayList<Integer> arrayList2, String str5) {
        this.f29532r = i;
        this.f29515a = str;
        this.f29516b = z;
        this.f29517c = z2;
        this.f29518d = z3;
        this.f29519e = str2;
        this.f29520f = str3;
        this.f29521g = str4;
        this.f29522h = cart;
        this.f29523i = z4;
        this.f29524j = z5;
        this.f29525k = countrySpecificationArr;
        this.f29526l = z6;
        this.f29527m = z7;
        this.f29528n = arrayList;
        this.f29529o = paymentMethodTokenizationParameters;
        this.f29530p = arrayList2;
        this.f29531q = str5;
    }

    /* renamed from: a */
    public static C9341a m8516a() {
        MaskedWalletRequest maskedWalletRequest = new MaskedWalletRequest();
        maskedWalletRequest.getClass();
        return new C9341a();
    }

    /* renamed from: b */
    public int m8515b() {
        return this.f29532r;
    }

    /* renamed from: c */
    public String m8514c() {
        return this.f29515a;
    }

    /* renamed from: d */
    public boolean m8513d() {
        return this.f29516b;
    }

    /* renamed from: e */
    public boolean m8512e() {
        return this.f29517c;
    }

    @Deprecated
    /* renamed from: f */
    public boolean m8511f() {
        return this.f29518d;
    }

    /* renamed from: g */
    public String m8510g() {
        return this.f29519e;
    }

    /* renamed from: h */
    public String m8509h() {
        return this.f29520f;
    }

    /* renamed from: i */
    public String m8508i() {
        return this.f29521g;
    }

    /* renamed from: j */
    public Cart m8507j() {
        return this.f29522h;
    }

    @Deprecated
    /* renamed from: k */
    public boolean m8506k() {
        return this.f29524j;
    }

    /* renamed from: l */
    public CountrySpecification[] m8505l() {
        return this.f29525k;
    }

    /* renamed from: m */
    public boolean m8504m() {
        return this.f29526l;
    }

    /* renamed from: n */
    public boolean m8503n() {
        return this.f29527m;
    }

    /* renamed from: o */
    public ArrayList<com.google.android.gms.identity.intents.model.CountrySpecification> m8502o() {
        return this.f29528n;
    }

    /* renamed from: p */
    public PaymentMethodTokenizationParameters m8501p() {
        return this.f29529o;
    }

    /* renamed from: q */
    public ArrayList<Integer> m8500q() {
        return this.f29530p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9408r.m8201a(this, parcel, i);
    }
}
