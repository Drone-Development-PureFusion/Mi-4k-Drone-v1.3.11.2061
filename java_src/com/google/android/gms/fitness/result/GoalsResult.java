package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Goal;
import java.util.List;
/* loaded from: classes2.dex */
public class GoalsResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<GoalsResult> CREATOR = new C5258i();

    /* renamed from: a */
    private final int f19110a;

    /* renamed from: b */
    private final Status f19111b;

    /* renamed from: c */
    private final List<Goal> f19112c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoalsResult(int i, Status status, List<Goal> list) {
        this.f19110a = i;
        this.f19111b = status;
        this.f19112c = list;
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f19111b;
    }

    /* renamed from: b */
    public List<Goal> m20929b() {
        return this.f19112c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m20928c() {
        return this.f19110a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5258i.m20879a(this, parcel, i);
    }
}
