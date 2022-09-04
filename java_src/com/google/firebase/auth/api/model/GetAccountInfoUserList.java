package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7022gc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class GetAccountInfoUserList extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAccountInfoUserList> CREATOR = new C9721c();
    @AbstractC7022gc

    /* renamed from: a */
    public final int f30383a;

    /* renamed from: b */
    private List<GetAccountInfoUser> f30384b;

    public GetAccountInfoUserList() {
        this.f30383a = 1;
        this.f30384b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetAccountInfoUserList(int i, List<GetAccountInfoUser> list) {
        this.f30383a = i;
        this.f30384b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public List<GetAccountInfoUser> m7333a() {
        return this.f30384b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9721c.m7297a(this, parcel, i);
    }
}
