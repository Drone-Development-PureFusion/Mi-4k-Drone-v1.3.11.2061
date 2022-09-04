package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.location.internal.ParcelableGeofence;
/* renamed from: com.google.android.gms.location.f */
/* loaded from: classes2.dex */
public interface AbstractC8167f {

    /* renamed from: a */
    public static final int f26713a = 1;

    /* renamed from: b */
    public static final int f26714b = 2;

    /* renamed from: c */
    public static final int f26715c = 4;

    /* renamed from: d */
    public static final long f26716d = -1;

    /* renamed from: com.google.android.gms.location.f$a */
    /* loaded from: classes2.dex */
    public static final class C8168a {

        /* renamed from: e */
        private double f26721e;

        /* renamed from: f */
        private double f26722f;

        /* renamed from: g */
        private float f26723g;

        /* renamed from: a */
        private String f26717a = null;

        /* renamed from: b */
        private int f26718b = 0;

        /* renamed from: c */
        private long f26719c = Long.MIN_VALUE;

        /* renamed from: d */
        private short f26720d = -1;

        /* renamed from: h */
        private int f26724h = 0;

        /* renamed from: i */
        private int f26725i = -1;

        /* renamed from: a */
        public C8168a m12565a(double d, double d2, float f) {
            this.f26720d = (short) 1;
            this.f26721e = d;
            this.f26722f = d2;
            this.f26723g = f;
            return this;
        }

        /* renamed from: a */
        public C8168a m12564a(int i) {
            this.f26718b = i;
            return this;
        }

        /* renamed from: a */
        public C8168a m12563a(long j) {
            if (j < 0) {
                this.f26719c = -1L;
            } else {
                this.f26719c = SystemClock.elapsedRealtime() + j;
            }
            return this;
        }

        /* renamed from: a */
        public C8168a m12562a(String str) {
            this.f26717a = str;
            return this;
        }

        /* renamed from: a */
        public AbstractC8167f m12566a() {
            if (this.f26717a == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            if (this.f26718b == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((this.f26718b & 4) != 0 && this.f26725i < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            if (this.f26719c == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.f26720d == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (this.f26724h >= 0) {
                return new ParcelableGeofence(this.f26717a, this.f26718b, (short) 1, this.f26721e, this.f26722f, this.f26723g, this.f26719c, this.f26724h, this.f26725i);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        /* renamed from: b */
        public C8168a m12561b(int i) {
            this.f26724h = i;
            return this;
        }

        /* renamed from: c */
        public C8168a m12560c(int i) {
            this.f26725i = i;
            return this;
        }
    }

    /* renamed from: a */
    String mo12535a();
}
