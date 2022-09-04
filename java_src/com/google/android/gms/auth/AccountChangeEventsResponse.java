package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new C4080h();

    /* renamed from: a */
    final int f15340a;

    /* renamed from: b */
    final List<AccountChangeEvent> f15341b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AccountChangeEventsResponse(int i, List<AccountChangeEvent> list) {
        this.f15340a = i;
        this.f15341b = (List) C4588d.m23627a(list);
    }

    public AccountChangeEventsResponse(List<AccountChangeEvent> list) {
        this.f15340a = 1;
        this.f15341b = (List) C4588d.m23627a(list);
    }

    /* renamed from: a */
    public List<AccountChangeEvent> m25863a() {
        return this.f15341b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4080h.m25541a(this, parcel, i);
    }
}
