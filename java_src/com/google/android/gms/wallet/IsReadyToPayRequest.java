package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new C9404n();

    /* renamed from: a */
    final int f29465a;

    /* renamed from: b */
    ArrayList<Integer> f29466b;

    /* renamed from: com.google.android.gms.wallet.IsReadyToPayRequest$a */
    /* loaded from: classes2.dex */
    public final class C9334a {
        private C9334a() {
        }

        /* renamed from: a */
        public C9334a m8563a(int i) {
            if (IsReadyToPayRequest.this.f29466b == null) {
                IsReadyToPayRequest.this.f29466b = new ArrayList<>();
            }
            IsReadyToPayRequest.this.f29466b.add(Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public IsReadyToPayRequest m8564a() {
            return IsReadyToPayRequest.this;
        }
    }

    IsReadyToPayRequest() {
        this.f29465a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IsReadyToPayRequest(int i, ArrayList<Integer> arrayList) {
        this.f29465a = i;
        this.f29466b = arrayList;
    }

    /* renamed from: c */
    public static C9334a m8565c() {
        IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
        isReadyToPayRequest.getClass();
        return new C9334a();
    }

    /* renamed from: a */
    public int m8567a() {
        return this.f29465a;
    }

    /* renamed from: b */
    public ArrayList<Integer> m8566b() {
        return this.f29466b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9404n.m8213a(this, parcel, i);
    }
}
