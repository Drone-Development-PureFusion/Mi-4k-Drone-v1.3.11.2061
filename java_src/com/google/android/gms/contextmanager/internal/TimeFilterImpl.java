package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class TimeFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeFilterImpl> CREATOR = new C4789q();

    /* renamed from: a */
    private final int f17448a;

    /* renamed from: b */
    private final ArrayList<Interval> f17449b;

    /* renamed from: c */
    private final int[] f17450c;

    /* loaded from: classes2.dex */
    public static class Interval extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Interval> CREATOR = new C4790r();

        /* renamed from: a */
        private final int f17451a;

        /* renamed from: b */
        private final long f17452b;

        /* renamed from: c */
        private final long f17453c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Interval(int i, long j, long j2) {
            this.f17451a = i;
            this.f17452b = j;
            this.f17453c = j2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m22830a() {
            return this.f17451a;
        }

        /* renamed from: b */
        public long m22829b() {
            return this.f17452b;
        }

        /* renamed from: c */
        public long m22828c() {
            return this.f17453c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.f17452b == interval.m22829b() && this.f17453c == interval.m22828c();
        }

        public int hashCode() {
            return C4585c.m23633a(Long.valueOf(this.f17452b), Long.valueOf(this.f17453c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C4790r.m22750a(this, parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TimeFilterImpl(int i, ArrayList<Interval> arrayList, int[] iArr) {
        this.f17448a = i;
        this.f17449b = arrayList;
        this.f17450c = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m22833a() {
        return this.f17448a;
    }

    /* renamed from: b */
    public ArrayList<Interval> m22832b() {
        return this.f17449b;
    }

    /* renamed from: c */
    public int[] m22831c() {
        return this.f17450c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeFilterImpl)) {
            return false;
        }
        TimeFilterImpl timeFilterImpl = (TimeFilterImpl) obj;
        return C4585c.m23634a(this.f17449b, timeFilterImpl.f17449b) && C4585c.m23634a(this.f17450c, timeFilterImpl.f17450c);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17449b, this.f17450c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4789q.m22753a(this, parcel, i);
    }
}
