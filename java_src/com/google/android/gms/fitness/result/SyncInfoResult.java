package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class SyncInfoResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<SyncInfoResult> CREATOR = new C5263n();

    /* renamed from: a */
    private final int f19126a;

    /* renamed from: b */
    private final Status f19127b;

    /* renamed from: c */
    private final long f19128c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SyncInfoResult(int i, Status status, long j) {
        this.f19126a = i;
        this.f19127b = status;
        this.f19128c = j;
    }

    /* renamed from: a */
    private boolean m20908a(SyncInfoResult syncInfoResult) {
        return this.f19127b.equals(syncInfoResult.f19127b) && C4585c.m23634a(Long.valueOf(this.f19128c), Long.valueOf(syncInfoResult.f19128c));
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f19127b;
    }

    /* renamed from: b */
    public long m20907b() {
        return this.f19128c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m20906c() {
        return this.f19126a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SyncInfoResult) && m20908a((SyncInfoResult) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19127b, Long.valueOf(this.f19128c));
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("status", this.f19127b).m23632a("timestamp", Long.valueOf(this.f19128c)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5263n.m20864a(this, parcel, i);
    }
}
