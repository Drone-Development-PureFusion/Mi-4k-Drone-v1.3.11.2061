package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class LineItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LineItem> CREATOR = new C9405o();

    /* renamed from: a */
    String f29468a;

    /* renamed from: b */
    String f29469b;

    /* renamed from: c */
    String f29470c;

    /* renamed from: d */
    String f29471d;

    /* renamed from: e */
    int f29472e;

    /* renamed from: f */
    String f29473f;

    /* renamed from: g */
    private final int f29474g;

    /* renamed from: com.google.android.gms.wallet.LineItem$a */
    /* loaded from: classes2.dex */
    public final class C9336a {
        private C9336a() {
        }

        /* renamed from: a */
        public C9336a m8553a(int i) {
            LineItem.this.f29472e = i;
            return this;
        }

        /* renamed from: a */
        public C9336a m8552a(String str) {
            LineItem.this.f29468a = str;
            return this;
        }

        /* renamed from: a */
        public LineItem m8554a() {
            return LineItem.this;
        }

        /* renamed from: b */
        public C9336a m8551b(String str) {
            LineItem.this.f29469b = str;
            return this;
        }

        /* renamed from: c */
        public C9336a m8550c(String str) {
            LineItem.this.f29470c = str;
            return this;
        }

        /* renamed from: d */
        public C9336a m8549d(String str) {
            LineItem.this.f29471d = str;
            return this;
        }

        /* renamed from: e */
        public C9336a m8548e(String str) {
            LineItem.this.f29473f = str;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.wallet.LineItem$b */
    /* loaded from: classes2.dex */
    public interface AbstractC9337b {

        /* renamed from: a */
        public static final int f29476a = 0;

        /* renamed from: b */
        public static final int f29477b = 1;

        /* renamed from: c */
        public static final int f29478c = 2;
    }

    LineItem() {
        this.f29474g = 1;
        this.f29472e = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LineItem(int i, String str, String str2, String str3, String str4, int i2, String str5) {
        this.f29474g = i;
        this.f29468a = str;
        this.f29469b = str2;
        this.f29470c = str3;
        this.f29471d = str4;
        this.f29472e = i2;
        this.f29473f = str5;
    }

    /* renamed from: a */
    public static C9336a m8562a() {
        LineItem lineItem = new LineItem();
        lineItem.getClass();
        return new C9336a();
    }

    /* renamed from: b */
    public int m8561b() {
        return this.f29474g;
    }

    /* renamed from: c */
    public String m8560c() {
        return this.f29468a;
    }

    /* renamed from: d */
    public String m8559d() {
        return this.f29469b;
    }

    /* renamed from: e */
    public String m8558e() {
        return this.f29470c;
    }

    /* renamed from: f */
    public String m8557f() {
        return this.f29471d;
    }

    /* renamed from: g */
    public int m8556g() {
        return this.f29472e;
    }

    /* renamed from: h */
    public String m8555h() {
        return this.f29473f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9405o.m8210a(this, parcel, i);
    }
}
