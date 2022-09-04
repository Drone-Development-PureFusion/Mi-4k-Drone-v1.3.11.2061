package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.Task;
/* loaded from: classes.dex */
public class PeriodicTask extends Task {
    public static final Parcelable.Creator<PeriodicTask> CREATOR = new Parcelable.Creator<PeriodicTask>() { // from class: com.google.android.gms.gcm.PeriodicTask.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PeriodicTask createFromParcel(Parcel parcel) {
            return new PeriodicTask(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PeriodicTask[] newArray(int i) {
            return new PeriodicTask[i];
        }
    };

    /* renamed from: a */
    protected long f20504a;

    /* renamed from: b */
    protected long f20505b;

    /* renamed from: com.google.android.gms.gcm.PeriodicTask$a */
    /* loaded from: classes2.dex */
    public static class C6063a extends Task.AbstractC6064a {

        /* renamed from: i */
        private long f20506i = -1;

        /* renamed from: j */
        private long f20507j = -1;

        public C6063a() {
            this.f20525e = true;
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: a */
        public C6063a mo18874b(int i) {
            this.f20521a = i;
            return this;
        }

        /* renamed from: a */
        public C6063a m18897a(long j) {
            this.f20506i = j;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: a */
        public C6063a mo18873b(Bundle bundle) {
            this.f20528h = bundle;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: a */
        public C6063a mo18872b(Class<? extends GcmTaskService> cls) {
            this.f20522b = cls.getName();
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: a */
        public C6063a mo18871b(String str) {
            this.f20523c = str;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: a */
        public C6063a mo18867f(boolean z) {
            this.f20526f = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: a */
        public void mo18875a() {
            super.mo18875a();
            if (this.f20506i == -1) {
                throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
            }
            if (this.f20506i <= 0) {
                throw new IllegalArgumentException(new StringBuilder(66).append("Period set cannot be less than or equal to 0: ").append(this.f20506i).toString());
            } else if (this.f20507j == -1) {
                this.f20507j = ((float) this.f20506i) * 0.1f;
            } else if (this.f20507j <= this.f20506i) {
            } else {
                this.f20507j = this.f20506i;
            }
        }

        /* renamed from: b */
        public C6063a m18890b(long j) {
            this.f20507j = j;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: b */
        public C6063a mo18869d(boolean z) {
            this.f20525e = z;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: b */
        public PeriodicTask mo18870c() {
            mo18875a();
            return new PeriodicTask(this);
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: c */
        public C6063a mo18868e(boolean z) {
            this.f20524d = z;
            return this;
        }
    }

    @Deprecated
    private PeriodicTask(Parcel parcel) {
        super(parcel);
        this.f20504a = -1L;
        this.f20505b = -1L;
        this.f20504a = parcel.readLong();
        this.f20505b = Math.min(parcel.readLong(), this.f20504a);
    }

    private PeriodicTask(C6063a c6063a) {
        super(c6063a);
        this.f20504a = -1L;
        this.f20505b = -1L;
        this.f20504a = c6063a.f20506i;
        this.f20505b = Math.min(c6063a.f20507j, this.f20504a);
    }

    /* renamed from: a */
    public long m18902a() {
        return this.f20504a;
    }

    @Override // com.google.android.gms.gcm.Task
    /* renamed from: a */
    public void mo18886a(Bundle bundle) {
        super.mo18886a(bundle);
        bundle.putLong("period", this.f20504a);
        bundle.putLong("period_flex", this.f20505b);
    }

    /* renamed from: b */
    public long m18901b() {
        return this.f20505b;
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        long m18902a = m18902a();
        return new StringBuilder(String.valueOf(valueOf).length() + 54).append(valueOf).append(" period=").append(m18902a).append(" flex=").append(m18901b()).toString();
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.f20504a);
        parcel.writeLong(this.f20505b);
    }
}
