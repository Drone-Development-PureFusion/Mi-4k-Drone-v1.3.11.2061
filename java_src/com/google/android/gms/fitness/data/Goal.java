package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.C5129d;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public class Goal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Goal> CREATOR = new C5164v();

    /* renamed from: a */
    private final int f18594a;

    /* renamed from: b */
    private final long f18595b;

    /* renamed from: c */
    private final long f18596c;

    /* renamed from: d */
    private final List<Integer> f18597d;

    /* renamed from: e */
    private final Recurrence f18598e;

    /* renamed from: f */
    private final int f18599f;

    /* renamed from: g */
    private final MetricObjective f18600g;

    /* renamed from: h */
    private final DurationObjective f18601h;

    /* renamed from: i */
    private final FrequencyObjective f18602i;

    /* loaded from: classes2.dex */
    public static class DurationObjective extends AbstractSafeParcelable {
        public static final Parcelable.Creator<DurationObjective> CREATOR = new C5161s();

        /* renamed from: a */
        private final int f18603a;

        /* renamed from: b */
        private final long f18604b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public DurationObjective(int i, long j) {
            this.f18603a = i;
            this.f18604b = j;
        }

        /* renamed from: a */
        private boolean m21598a(DurationObjective durationObjective) {
            return this.f18604b == durationObjective.f18604b;
        }

        /* renamed from: a */
        public long m21599a() {
            return this.f18604b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m21597b() {
            return this.f18603a;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof DurationObjective) && m21598a((DurationObjective) obj));
        }

        public int hashCode() {
            return C4585c.m23633a(Long.valueOf(this.f18604b));
        }

        public String toString() {
            return C4585c.m23635a(this).m23632a("duration", Long.valueOf(this.f18604b)).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C5161s.m21429a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class FrequencyObjective extends AbstractSafeParcelable {
        public static final Parcelable.Creator<FrequencyObjective> CREATOR = new C5163u();

        /* renamed from: a */
        private final int f18605a;

        /* renamed from: b */
        private final int f18606b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public FrequencyObjective(int i, int i2) {
            this.f18605a = i;
            this.f18606b = i2;
        }

        /* renamed from: a */
        private boolean m21595a(FrequencyObjective frequencyObjective) {
            return this.f18606b == frequencyObjective.f18606b;
        }

        /* renamed from: a */
        public int m21596a() {
            return this.f18606b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m21594b() {
            return this.f18605a;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof FrequencyObjective) && m21595a((FrequencyObjective) obj));
        }

        public int hashCode() {
            return C4585c.m23633a(Integer.valueOf(this.f18606b));
        }

        public String toString() {
            return C4585c.m23635a(this).m23632a("frequency", Integer.valueOf(this.f18606b)).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C5163u.m21423a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class MetricObjective extends AbstractSafeParcelable {
        public static final Parcelable.Creator<MetricObjective> CREATOR = new C5139aa();

        /* renamed from: a */
        private final int f18607a;

        /* renamed from: b */
        private final String f18608b;

        /* renamed from: c */
        private final double f18609c;

        /* renamed from: d */
        private final double f18610d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public MetricObjective(int i, String str, double d, double d2) {
            this.f18607a = i;
            this.f18608b = str;
            this.f18609c = d;
            this.f18610d = d2;
        }

        /* renamed from: a */
        private boolean m21592a(MetricObjective metricObjective) {
            return C4585c.m23634a(this.f18608b, metricObjective.f18608b) && this.f18609c == metricObjective.f18609c && this.f18610d == metricObjective.f18610d;
        }

        /* renamed from: a */
        public String m21593a() {
            return this.f18608b;
        }

        /* renamed from: b */
        public double m21591b() {
            return this.f18609c;
        }

        /* renamed from: c */
        public double m21590c() {
            return this.f18610d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public int m21589d() {
            return this.f18607a;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof MetricObjective) && m21592a((MetricObjective) obj));
        }

        public int hashCode() {
            return C4585c.m23633a(this.f18608b, Double.valueOf(this.f18609c), Double.valueOf(this.f18610d));
        }

        public String toString() {
            return C4585c.m23635a(this).m23632a("dataTypeName", this.f18608b).m23632a("value", Double.valueOf(this.f18609c)).m23632a("initValue", Double.valueOf(this.f18610d)).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C5139aa.m21496a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class Recurrence extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Recurrence> CREATOR = new C5143ae();

        /* renamed from: a */
        private final int f18611a;

        /* renamed from: b */
        private final int f18612b;

        /* renamed from: c */
        private final int f18613c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Recurrence(int i, int i2, int i3) {
            this.f18611a = i;
            this.f18612b = i2;
            C4588d.m23623a(i3 > 0 && i3 <= 3);
            this.f18613c = i3;
        }

        /* renamed from: a */
        private static String m21587a(int i) {
            switch (i) {
                case 1:
                    return "day";
                case 2:
                    return "week";
                case 3:
                    return "month";
                default:
                    throw new IllegalArgumentException("invalid unit value");
            }
        }

        /* renamed from: a */
        private boolean m21586a(Recurrence recurrence) {
            return this.f18612b == recurrence.f18612b && this.f18613c == recurrence.f18613c;
        }

        /* renamed from: a */
        public int m21588a() {
            return this.f18612b;
        }

        /* renamed from: b */
        public int m21585b() {
            return this.f18613c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public int m21584c() {
            return this.f18611a;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Recurrence) && m21586a((Recurrence) obj));
        }

        public int hashCode() {
            return C4585c.m23633a(Integer.valueOf(this.f18612b), Integer.valueOf(this.f18613c));
        }

        public String toString() {
            return C4585c.m23635a(this).m23632a("count", Integer.valueOf(this.f18612b)).m23632a("unit", m21587a(this.f18613c)).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C5143ae.m21484a(this, parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Goal(int i, long j, long j2, List<Integer> list, Recurrence recurrence, int i2, MetricObjective metricObjective, DurationObjective durationObjective, FrequencyObjective frequencyObjective) {
        this.f18594a = i;
        this.f18595b = j;
        this.f18596c = j2;
        this.f18597d = list == null ? Collections.emptyList() : list;
        this.f18598e = recurrence;
        this.f18599f = i2;
        this.f18600g = metricObjective;
        this.f18601h = durationObjective;
        this.f18602i = frequencyObjective;
    }

    /* renamed from: a */
    private static String m21610a(int i) {
        switch (i) {
            case 0:
                return "unknown";
            case 1:
                return "metric";
            case 2:
                return "duration";
            case 3:
                return "frequency";
            default:
                throw new IllegalArgumentException("invalid objective type value");
        }
    }

    /* renamed from: a */
    private boolean m21609a(Goal goal) {
        return this.f18595b == goal.f18595b && this.f18596c == goal.f18596c && C4585c.m23634a(this.f18597d, goal.f18597d) && C4585c.m23634a(this.f18598e, goal.f18598e) && this.f18599f == goal.f18599f && C4585c.m23634a(this.f18600g, goal.f18600g) && C4585c.m23634a(this.f18601h, goal.f18601h) && C4585c.m23634a(this.f18602i, goal.f18602i);
    }

    @Nullable
    /* renamed from: a */
    public Set<String> m21611a() {
        if (this.f18597d.isEmpty()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (Integer num : this.f18597d) {
            hashSet.add(C5129d.m21768a(num.intValue()));
        }
        return hashSet;
    }

    /* renamed from: b */
    public Recurrence m21608b() {
        return this.f18598e;
    }

    /* renamed from: c */
    public int m21607c() {
        return this.f18599f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m21606d() {
        return this.f18594a;
    }

    /* renamed from: e */
    public long m21605e() {
        return this.f18595b;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Goal) && m21609a((Goal) obj));
    }

    /* renamed from: f */
    public long m21604f() {
        return this.f18596c;
    }

    /* renamed from: g */
    public List<Integer> m21603g() {
        return this.f18597d;
    }

    /* renamed from: h */
    public MetricObjective m21602h() {
        return this.f18600g;
    }

    public int hashCode() {
        return C4585c.m23633a(Long.valueOf(this.f18595b), Long.valueOf(this.f18596c), m21611a(), this.f18598e, Integer.valueOf(this.f18599f), this.f18600g, this.f18601h, this.f18602i);
    }

    /* renamed from: i */
    public DurationObjective m21601i() {
        return this.f18601h;
    }

    /* renamed from: j */
    public FrequencyObjective m21600j() {
        return this.f18602i;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("startTime", Long.valueOf(this.f18595b)).m23632a("endTime", Long.valueOf(this.f18596c)).m23632a("activities", m21611a()).m23632a("recurrence", this.f18598e).m23632a("objectiveType", m21610a(this.f18599f)).m23632a("metricObjective", this.f18600g).m23632a("durationObjective", this.f18601h).m23632a("frequencyObjective", this.f18602i).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5164v.m21420a(this, parcel, i);
    }
}
