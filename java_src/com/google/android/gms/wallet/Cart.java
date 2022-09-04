package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class Cart extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Cart> CREATOR = new C9397g();

    /* renamed from: a */
    String f29425a;

    /* renamed from: b */
    String f29426b;

    /* renamed from: c */
    ArrayList<LineItem> f29427c;

    /* renamed from: d */
    private final int f29428d;

    /* renamed from: com.google.android.gms.wallet.Cart$a */
    /* loaded from: classes2.dex */
    public final class C9330a {
        private C9330a() {
        }

        /* renamed from: a */
        public C9330a m8598a(LineItem lineItem) {
            Cart.this.f29427c.add(lineItem);
            return this;
        }

        /* renamed from: a */
        public C9330a m8597a(String str) {
            Cart.this.f29425a = str;
            return this;
        }

        /* renamed from: a */
        public C9330a m8596a(List<LineItem> list) {
            Cart.this.f29427c.clear();
            Cart.this.f29427c.addAll(list);
            return this;
        }

        /* renamed from: a */
        public Cart m8599a() {
            return Cart.this;
        }

        /* renamed from: b */
        public C9330a m8595b(String str) {
            Cart.this.f29426b = str;
            return this;
        }
    }

    Cart() {
        this.f29428d = 1;
        this.f29427c = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Cart(int i, String str, String str2, ArrayList<LineItem> arrayList) {
        this.f29428d = i;
        this.f29425a = str;
        this.f29426b = str2;
        this.f29427c = arrayList;
    }

    /* renamed from: a */
    public static C9330a m8604a() {
        Cart cart = new Cart();
        cart.getClass();
        return new C9330a();
    }

    /* renamed from: b */
    public int m8603b() {
        return this.f29428d;
    }

    /* renamed from: c */
    public String m8602c() {
        return this.f29425a;
    }

    /* renamed from: d */
    public String m8601d() {
        return this.f29426b;
    }

    /* renamed from: e */
    public ArrayList<LineItem> m8600e() {
        return this.f29427c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9397g.m8234a(this, parcel, i);
    }
}
