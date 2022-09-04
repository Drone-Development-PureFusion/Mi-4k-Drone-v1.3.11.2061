package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class AdBreakInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdBreakInfo> CREATOR = new C4415h();

    /* renamed from: a */
    private final int f15775a;

    /* renamed from: b */
    private final long f15776b;

    /* renamed from: com.google.android.gms.cast.AdBreakInfo$a */
    /* loaded from: classes2.dex */
    public static class C4178a {

        /* renamed from: a */
        private long f15777a;

        public C4178a(long j) {
            this.f15777a = 0L;
            this.f15777a = j;
        }

        /* renamed from: a */
        public AdBreakInfo m25261a() {
            return new AdBreakInfo(1, this.f15777a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdBreakInfo(int i, long j) {
        this.f15775a = i;
        this.f15776b = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m25263a() {
        return this.f15775a;
    }

    /* renamed from: b */
    public long m25262b() {
        return this.f15776b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4415h.m24284a(this, parcel, i);
    }
}
