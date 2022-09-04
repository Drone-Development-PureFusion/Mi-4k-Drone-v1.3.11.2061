package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class ListSubscriptionsResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<ListSubscriptionsResult> CREATOR = new C5259j();

    /* renamed from: a */
    private final int f19113a;

    /* renamed from: b */
    private final List<Subscription> f19114b;

    /* renamed from: c */
    private final Status f19115c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ListSubscriptionsResult(int i, List<Subscription> list, Status status) {
        this.f19113a = i;
        this.f19114b = list;
        this.f19115c = status;
    }

    public ListSubscriptionsResult(List<Subscription> list, Status status) {
        this.f19113a = 3;
        this.f19114b = Collections.unmodifiableList(list);
        this.f19115c = (Status) C4588d.m23626a(status, "status");
    }

    /* renamed from: a */
    public static ListSubscriptionsResult m20927a(Status status) {
        return new ListSubscriptionsResult(Collections.emptyList(), status);
    }

    /* renamed from: a */
    private boolean m20925a(ListSubscriptionsResult listSubscriptionsResult) {
        return this.f19115c.equals(listSubscriptionsResult.f19115c) && C4585c.m23634a(this.f19114b, listSubscriptionsResult.f19114b);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f19115c;
    }

    /* renamed from: a */
    public List<Subscription> m20926a(DataType dataType) {
        ArrayList arrayList = new ArrayList();
        for (Subscription subscription : this.f19114b) {
            if (dataType.equals(subscription.m21529f())) {
                arrayList.add(subscription);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public List<Subscription> m20924b() {
        return this.f19114b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m20923c() {
        return this.f19113a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ListSubscriptionsResult) && m20925a((ListSubscriptionsResult) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19115c, this.f19114b);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("status", this.f19115c).m23632a("subscriptions", this.f19114b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5259j.m20876a(this, parcel, i);
    }
}
