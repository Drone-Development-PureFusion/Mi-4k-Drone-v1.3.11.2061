package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.AbstractC6083b;
/* loaded from: classes2.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new C6090b();

    /* renamed from: a */
    String f20585a;

    /* renamed from: b */
    String f20586b;

    /* renamed from: c */
    String f20587c;

    /* renamed from: d */
    String f20588d;

    /* renamed from: e */
    String f20589e;

    /* renamed from: f */
    String f20590f;

    /* renamed from: g */
    String f20591g;

    /* renamed from: h */
    String f20592h;

    /* renamed from: i */
    String f20593i;

    /* renamed from: j */
    String f20594j;

    /* renamed from: k */
    String f20595k;

    /* renamed from: l */
    String f20596l;

    /* renamed from: m */
    boolean f20597m;

    /* renamed from: n */
    String f20598n;

    /* renamed from: o */
    String f20599o;

    /* renamed from: p */
    private final int f20600p;

    UserAddress() {
        this.f20600p = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserAddress(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.f20600p = i;
        this.f20585a = str;
        this.f20586b = str2;
        this.f20587c = str3;
        this.f20588d = str4;
        this.f20589e = str5;
        this.f20590f = str6;
        this.f20591g = str7;
        this.f20592h = str8;
        this.f20593i = str9;
        this.f20594j = str10;
        this.f20595k = str11;
        this.f20596l = str12;
        this.f20597m = z;
        this.f20598n = str13;
        this.f20599o = str14;
    }

    /* renamed from: a */
    public static UserAddress m18794a(Intent intent) {
        if (intent == null || !intent.hasExtra(AbstractC6083b.AbstractC6085b.f20576a)) {
            return null;
        }
        return (UserAddress) intent.getParcelableExtra(AbstractC6083b.AbstractC6085b.f20576a);
    }

    /* renamed from: a */
    public int m18795a() {
        return this.f20600p;
    }

    /* renamed from: b */
    public String m18793b() {
        return this.f20585a;
    }

    /* renamed from: c */
    public String m18792c() {
        return this.f20586b;
    }

    /* renamed from: d */
    public String m18791d() {
        return this.f20587c;
    }

    /* renamed from: e */
    public String m18790e() {
        return this.f20588d;
    }

    /* renamed from: f */
    public String m18789f() {
        return this.f20589e;
    }

    /* renamed from: g */
    public String m18788g() {
        return this.f20590f;
    }

    /* renamed from: h */
    public String m18787h() {
        return this.f20591g;
    }

    /* renamed from: i */
    public String m18786i() {
        return this.f20592h;
    }

    /* renamed from: j */
    public String m18785j() {
        return this.f20593i;
    }

    /* renamed from: k */
    public String m18784k() {
        return this.f20594j;
    }

    /* renamed from: l */
    public String m18783l() {
        return this.f20595k;
    }

    /* renamed from: m */
    public String m18782m() {
        return this.f20596l;
    }

    /* renamed from: n */
    public boolean m18781n() {
        return this.f20597m;
    }

    /* renamed from: o */
    public String m18780o() {
        return this.f20598n;
    }

    /* renamed from: p */
    public String m18779p() {
        return this.f20599o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6090b.m18773a(this, parcel, i);
    }
}
