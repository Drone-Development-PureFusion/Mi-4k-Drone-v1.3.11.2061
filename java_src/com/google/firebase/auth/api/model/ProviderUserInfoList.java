package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class ProviderUserInfoList extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProviderUserInfoList> CREATOR = new C9724f();

    /* renamed from: a */
    public final int f30396a;

    /* renamed from: b */
    private List<ProviderUserInfo> f30397b;

    public ProviderUserInfoList() {
        this.f30396a = 1;
        this.f30397b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProviderUserInfoList(int i, List<ProviderUserInfo> list) {
        this.f30396a = i;
        if (list == null || list.isEmpty()) {
            this.f30397b = Collections.emptyList();
        } else {
            this.f30397b = Collections.unmodifiableList(list);
        }
    }

    /* renamed from: a */
    public static ProviderUserInfoList m7319a(ProviderUserInfoList providerUserInfoList) {
        List<ProviderUserInfo> m7320a = providerUserInfoList.m7320a();
        ProviderUserInfoList providerUserInfoList2 = new ProviderUserInfoList();
        if (m7320a != null) {
            providerUserInfoList2.m7320a().addAll(m7320a);
        }
        return providerUserInfoList2;
    }

    /* renamed from: b */
    public static ProviderUserInfoList m7318b() {
        return new ProviderUserInfoList();
    }

    /* renamed from: a */
    public List<ProviderUserInfo> m7320a() {
        return this.f30397b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9724f.m7288a(this, parcel, i);
    }
}
