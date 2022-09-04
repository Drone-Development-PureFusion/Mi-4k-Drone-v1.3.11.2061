package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.Task;
/* loaded from: classes.dex */
public class OneoffTask extends Task {
    public static final Parcelable.Creator<OneoffTask> CREATOR = new Parcelable.Creator<OneoffTask>() { // from class: com.google.android.gms.gcm.OneoffTask.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public OneoffTask createFromParcel(Parcel parcel) {
            return new OneoffTask(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public OneoffTask[] newArray(int i) {
            return new OneoffTask[i];
        }
    };

    /* renamed from: a */
    private final long f20499a;

    /* renamed from: b */
    private final long f20500b;

    /* renamed from: com.google.android.gms.gcm.OneoffTask$a */
    /* loaded from: classes2.dex */
    public static class C6060a extends Task.AbstractC6064a {

        /* renamed from: i */
        private long f20501i = -1;

        /* renamed from: j */
        private long f20502j = -1;

        public C6060a() {
            this.f20525e = false;
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: a */
        public C6060a mo18874b(int i) {
            this.f20521a = i;
            return this;
        }

        /* renamed from: a */
        public C6060a m18915a(long j, long j2) {
            this.f20501i = j;
            this.f20502j = j2;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: a */
        public C6060a mo18873b(Bundle bundle) {
            this.f20528h = bundle;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: a */
        public C6060a mo18872b(Class<? extends GcmTaskService> cls) {
            this.f20522b = cls.getName();
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: a */
        public C6060a mo18871b(String str) {
            this.f20523c = str;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: a */
        public C6060a mo18867f(boolean z) {
            this.f20526f = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: a */
        public void mo18875a() {
            super.mo18875a();
            if (this.f20501i == -1 || this.f20502j == -1) {
                throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
            }
            if (this.f20501i < this.f20502j) {
                return;
            }
            throw new IllegalArgumentException("Window start must be shorter than window end.");
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: b */
        public C6060a mo18869d(boolean z) {
            this.f20525e = z;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: b */
        public OneoffTask mo18870c() {
            mo18875a();
            return new OneoffTask(this);
        }

        @Override // com.google.android.gms.gcm.Task.AbstractC6064a
        /* renamed from: c */
        public C6060a mo18868e(boolean z) {
            this.f20524d = z;
            return this;
        }
    }

    @Deprecated
    private OneoffTask(Parcel parcel) {
        super(parcel);
        this.f20499a = parcel.readLong();
        this.f20500b = parcel.readLong();
    }

    private OneoffTask(C6060a c6060a) {
        super(c6060a);
        this.f20499a = c6060a.f20501i;
        this.f20500b = c6060a.f20502j;
    }

    /* renamed from: a */
    public long m18920a() {
        return this.f20499a;
    }

    @Override // com.google.android.gms.gcm.Task
    /* renamed from: a */
    public void mo18886a(Bundle bundle) {
        super.mo18886a(bundle);
        bundle.putLong("window_start", this.f20499a);
        bundle.putLong("window_end", this.f20500b);
    }

    /* renamed from: b */
    public long m18919b() {
        return this.f20500b;
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        long m18920a = m18920a();
        return new StringBuilder(String.valueOf(valueOf).length() + 64).append(valueOf).append(" windowStart=").append(m18920a).append(" windowEnd=").append(m18919b()).toString();
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.f20499a);
        parcel.writeLong(this.f20500b);
    }
}
