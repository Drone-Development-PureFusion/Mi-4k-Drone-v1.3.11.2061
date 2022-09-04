package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class Strategy extends AbstractSafeParcelable {

    /* renamed from: a */
    public static final int f28185a = 1;

    /* renamed from: b */
    public static final int f28186b = 2;

    /* renamed from: c */
    public static final int f28187c = 3;

    /* renamed from: d */
    public static final int f28188d = 0;

    /* renamed from: e */
    public static final int f28189e = 1;

    /* renamed from: f */
    public static final int f28190f = 300;

    /* renamed from: g */
    public static final int f28191g = 86400;

    /* renamed from: h */
    public static final int f28192h = Integer.MAX_VALUE;

    /* renamed from: l */
    final int f28196l;
    @Deprecated

    /* renamed from: m */
    final int f28197m;

    /* renamed from: n */
    final int f28198n;

    /* renamed from: o */
    final int f28199o;
    @Deprecated

    /* renamed from: p */
    final boolean f28200p;

    /* renamed from: q */
    final int f28201q;

    /* renamed from: r */
    final int f28202r;
    public static final Parcelable.Creator<Strategy> CREATOR = new C8914r();

    /* renamed from: i */
    public static final Strategy f28193i = new C8824a().m9960a();

    /* renamed from: j */
    public static final Strategy f28194j = new C8824a().m9958b(2).m9957c(Integer.MAX_VALUE).m9960a();
    @Deprecated

    /* renamed from: k */
    public static final Strategy f28195k = f28194j;

    /* renamed from: com.google.android.gms.nearby.messages.Strategy$a */
    /* loaded from: classes2.dex */
    public static class C8824a {

        /* renamed from: a */
        private int f28203a = 3;

        /* renamed from: b */
        private int f28204b = 300;

        /* renamed from: c */
        private int f28205c = 0;

        /* renamed from: d */
        private int f28206d = -1;

        /* renamed from: a */
        public C8824a m9959a(int i) {
            this.f28203a = i;
            return this;
        }

        /* renamed from: a */
        public Strategy m9960a() {
            if (this.f28206d == 2 && this.f28205c == 1) {
                throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
            }
            return new Strategy(2, 0, this.f28204b, this.f28205c, false, this.f28206d, this.f28203a);
        }

        /* renamed from: b */
        public C8824a m9958b(int i) {
            this.f28206d = i;
            return this;
        }

        /* renamed from: c */
        public C8824a m9957c(int i) {
            C4588d.m23617b(i == Integer.MAX_VALUE || (i > 0 && i <= 86400), "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", Integer.valueOf(i), Integer.valueOf((int) Strategy.f28191g));
            this.f28204b = i;
            return this;
        }

        /* renamed from: d */
        public C8824a m9956d(int i) {
            this.f28205c = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Strategy(int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        this.f28196l = i;
        this.f28197m = i2;
        if (i2 != 0) {
            switch (i2) {
                case 2:
                    this.f28202r = 1;
                    break;
                case 3:
                    this.f28202r = 2;
                    break;
                default:
                    this.f28202r = 3;
                    break;
            }
        } else {
            this.f28202r = i6;
        }
        this.f28199o = i4;
        this.f28200p = z;
        if (z) {
            this.f28201q = 2;
            this.f28198n = Integer.MAX_VALUE;
            return;
        }
        this.f28198n = i3;
        switch (i5) {
            case -1:
            case 0:
            case 1:
            case 6:
                this.f28201q = -1;
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                this.f28201q = i5;
                return;
        }
    }

    /* renamed from: a */
    private static String m9964a(int i) {
        switch (i) {
            case 0:
                return "DEFAULT";
            case 1:
                return "EARSHOT";
            default:
                return new StringBuilder(19).append("UNKNOWN:").append(i).toString();
        }
    }

    /* renamed from: b */
    private static String m9962b(int i) {
        if (i == -1) {
            return "DEFAULT";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 4) > 0) {
            arrayList.add("ULTRASOUND");
        }
        if ((i & 2) > 0) {
            arrayList.add("BLE");
        }
        return arrayList.isEmpty() ? new StringBuilder(19).append("UNKNOWN:").append(i).toString() : arrayList.toString();
    }

    /* renamed from: c */
    private static String m9961c(int i) {
        if (i == 3) {
            return "DEFAULT";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) > 0) {
            arrayList.add("BROADCAST");
        }
        if ((i & 2) > 0) {
            arrayList.add("SCAN");
        }
        return arrayList.isEmpty() ? new StringBuilder(19).append("UNKNOWN:").append(i).toString() : arrayList.toString();
    }

    /* renamed from: a */
    public int m9965a() {
        return this.f28201q;
    }

    /* renamed from: b */
    public int m9963b() {
        return this.f28202r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.f28196l == strategy.f28196l && this.f28202r == strategy.f28202r && this.f28198n == strategy.f28198n && this.f28199o == strategy.f28199o && this.f28201q == strategy.f28201q;
    }

    public int hashCode() {
        return (((((((this.f28196l * 31) + this.f28202r) * 31) + this.f28198n) * 31) + this.f28199o) * 31) + this.f28201q;
    }

    public String toString() {
        int i = this.f28198n;
        String valueOf = String.valueOf(m9964a(this.f28199o));
        String valueOf2 = String.valueOf(m9962b(this.f28201q));
        String valueOf3 = String.valueOf(m9961c(this.f28202r));
        return new StringBuilder(String.valueOf(valueOf).length() + 81 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append("Strategy{ttlSeconds=").append(i).append(", distanceType=").append(valueOf).append(", discoveryMedium=").append(valueOf2).append(", discoveryMode=").append(valueOf3).append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8914r.m9745a(this, parcel, i);
    }
}
