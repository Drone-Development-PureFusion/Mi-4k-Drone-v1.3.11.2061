package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4679b;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
@KeepName
/* loaded from: classes2.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new C9416a();

    /* renamed from: a */
    String f29730a;

    /* renamed from: b */
    String f29731b;

    /* renamed from: c */
    String f29732c;

    /* renamed from: d */
    String f29733d;

    /* renamed from: e */
    String f29734e;

    /* renamed from: f */
    String f29735f;

    /* renamed from: g */
    String f29736g;

    /* renamed from: h */
    String f29737h;

    /* renamed from: i */
    int f29738i;

    /* renamed from: j */
    ArrayList<WalletObjectMessage> f29739j;

    /* renamed from: k */
    TimeInterval f29740k;

    /* renamed from: l */
    ArrayList<LatLng> f29741l;

    /* renamed from: m */
    String f29742m;

    /* renamed from: n */
    String f29743n;

    /* renamed from: o */
    ArrayList<LabelValueRow> f29744o;

    /* renamed from: p */
    boolean f29745p;

    /* renamed from: q */
    ArrayList<UriData> f29746q;

    /* renamed from: r */
    ArrayList<TextModuleData> f29747r;

    /* renamed from: s */
    ArrayList<UriData> f29748s;

    /* renamed from: t */
    private final int f29749t;

    /* renamed from: com.google.android.gms.wallet.wobs.CommonWalletObject$a */
    /* loaded from: classes2.dex */
    public final class C9415a {
        private C9415a() {
        }

        /* renamed from: a */
        public C9415a m8181a(String str) {
            CommonWalletObject.this.f29730a = str;
            return this;
        }

        /* renamed from: a */
        public CommonWalletObject m8182a() {
            return CommonWalletObject.this;
        }
    }

    CommonWalletObject() {
        this.f29749t = 1;
        this.f29739j = C4679b.m23173a();
        this.f29741l = C4679b.m23173a();
        this.f29744o = C4679b.m23173a();
        this.f29746q = C4679b.m23173a();
        this.f29747r = C4679b.m23173a();
        this.f29748s = C4679b.m23173a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonWalletObject(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, ArrayList<WalletObjectMessage> arrayList, TimeInterval timeInterval, ArrayList<LatLng> arrayList2, String str9, String str10, ArrayList<LabelValueRow> arrayList3, boolean z, ArrayList<UriData> arrayList4, ArrayList<TextModuleData> arrayList5, ArrayList<UriData> arrayList6) {
        this.f29749t = i;
        this.f29730a = str;
        this.f29731b = str2;
        this.f29732c = str3;
        this.f29733d = str4;
        this.f29734e = str5;
        this.f29735f = str6;
        this.f29736g = str7;
        this.f29737h = str8;
        this.f29738i = i2;
        this.f29739j = arrayList;
        this.f29740k = timeInterval;
        this.f29741l = arrayList2;
        this.f29742m = str9;
        this.f29743n = str10;
        this.f29744o = arrayList3;
        this.f29745p = z;
        this.f29746q = arrayList4;
        this.f29747r = arrayList5;
        this.f29748s = arrayList6;
    }

    /* renamed from: a */
    public static C9415a m8185a() {
        CommonWalletObject commonWalletObject = new CommonWalletObject();
        commonWalletObject.getClass();
        return new C9415a();
    }

    /* renamed from: b */
    public int m8184b() {
        return this.f29749t;
    }

    /* renamed from: c */
    public String m8183c() {
        return this.f29730a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9416a.m8170a(this, parcel, i);
    }
}
