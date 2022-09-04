package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new C6088c();

    /* renamed from: a */
    List<CountrySpecification> f20566a;

    /* renamed from: b */
    private final int f20567b;

    /* renamed from: com.google.android.gms.identity.intents.UserAddressRequest$a */
    /* loaded from: classes2.dex */
    public final class C6077a {
        private C6077a() {
        }

        /* renamed from: a */
        public C6077a m18806a(CountrySpecification countrySpecification) {
            if (UserAddressRequest.this.f20566a == null) {
                UserAddressRequest.this.f20566a = new ArrayList();
            }
            UserAddressRequest.this.f20566a.add(countrySpecification);
            return this;
        }

        /* renamed from: a */
        public C6077a m18805a(Collection<CountrySpecification> collection) {
            if (UserAddressRequest.this.f20566a == null) {
                UserAddressRequest.this.f20566a = new ArrayList();
            }
            UserAddressRequest.this.f20566a.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public UserAddressRequest m18807a() {
            if (UserAddressRequest.this.f20566a != null) {
                UserAddressRequest.this.f20566a = Collections.unmodifiableList(UserAddressRequest.this.f20566a);
            }
            return UserAddressRequest.this;
        }
    }

    UserAddressRequest() {
        this.f20567b = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserAddressRequest(int i, List<CountrySpecification> list) {
        this.f20567b = i;
        this.f20566a = list;
    }

    /* renamed from: a */
    public static C6077a m18809a() {
        UserAddressRequest userAddressRequest = new UserAddressRequest();
        userAddressRequest.getClass();
        return new C6077a();
    }

    /* renamed from: b */
    public int m18808b() {
        return this.f20567b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6088c.m18798a(this, parcel, i);
    }
}
