package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4679b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new C9406p();

    /* renamed from: a */
    String f29479a;

    /* renamed from: b */
    String f29480b;

    /* renamed from: c */
    String f29481c;

    /* renamed from: d */
    String f29482d;

    /* renamed from: e */
    String f29483e;

    /* renamed from: f */
    String f29484f;

    /* renamed from: g */
    String f29485g;

    /* renamed from: h */
    String f29486h;

    /* renamed from: i */
    String f29487i;

    /* renamed from: j */
    String f29488j;

    /* renamed from: k */
    int f29489k;

    /* renamed from: l */
    ArrayList<WalletObjectMessage> f29490l;

    /* renamed from: m */
    TimeInterval f29491m;

    /* renamed from: n */
    ArrayList<LatLng> f29492n;

    /* renamed from: o */
    String f29493o;

    /* renamed from: p */
    String f29494p;

    /* renamed from: q */
    ArrayList<LabelValueRow> f29495q;

    /* renamed from: r */
    boolean f29496r;

    /* renamed from: s */
    ArrayList<UriData> f29497s;

    /* renamed from: t */
    ArrayList<TextModuleData> f29498t;

    /* renamed from: u */
    ArrayList<UriData> f29499u;

    /* renamed from: v */
    LoyaltyPoints f29500v;

    /* renamed from: w */
    private final int f29501w;

    LoyaltyWalletObject() {
        this.f29501w = 4;
        this.f29490l = C4679b.m23173a();
        this.f29492n = C4679b.m23173a();
        this.f29495q = C4679b.m23173a();
        this.f29497s = C4679b.m23173a();
        this.f29498t = C4679b.m23173a();
        this.f29499u = C4679b.m23173a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoyaltyWalletObject(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, ArrayList<WalletObjectMessage> arrayList, TimeInterval timeInterval, ArrayList<LatLng> arrayList2, String str11, String str12, ArrayList<LabelValueRow> arrayList3, boolean z, ArrayList<UriData> arrayList4, ArrayList<TextModuleData> arrayList5, ArrayList<UriData> arrayList6, LoyaltyPoints loyaltyPoints) {
        this.f29501w = i;
        this.f29479a = str;
        this.f29480b = str2;
        this.f29481c = str3;
        this.f29482d = str4;
        this.f29483e = str5;
        this.f29484f = str6;
        this.f29485g = str7;
        this.f29486h = str8;
        this.f29487i = str9;
        this.f29488j = str10;
        this.f29489k = i2;
        this.f29490l = arrayList;
        this.f29491m = timeInterval;
        this.f29492n = arrayList2;
        this.f29493o = str11;
        this.f29494p = str12;
        this.f29495q = arrayList3;
        this.f29496r = z;
        this.f29497s = arrayList4;
        this.f29498t = arrayList5;
        this.f29499u = arrayList6;
        this.f29500v = loyaltyPoints;
    }

    /* renamed from: a */
    public int m8547a() {
        return this.f29501w;
    }

    /* renamed from: b */
    public String m8546b() {
        return this.f29479a;
    }

    /* renamed from: c */
    public String m8545c() {
        return this.f29480b;
    }

    /* renamed from: d */
    public String m8544d() {
        return this.f29481c;
    }

    /* renamed from: e */
    public String m8543e() {
        return this.f29482d;
    }

    /* renamed from: f */
    public String m8542f() {
        return this.f29483e;
    }

    /* renamed from: g */
    public String m8541g() {
        return this.f29484f;
    }

    /* renamed from: h */
    public String m8540h() {
        return this.f29485g;
    }

    /* renamed from: i */
    public String m8539i() {
        return this.f29486h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9406p.m8207a(this, parcel, i);
    }
}
