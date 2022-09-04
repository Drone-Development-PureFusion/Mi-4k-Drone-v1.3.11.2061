package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4678a;
import com.google.android.gms.common.util.C4679b;
import com.google.android.gms.fitness.data.Field;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class DataType extends AbstractSafeParcelable {

    /* renamed from: a */
    public static final String f18446a = "vnd.google.fitness.data_type/";

    /* renamed from: X */
    private final int f18472X;

    /* renamed from: Y */
    private final String f18473Y;

    /* renamed from: Z */
    private final List<Field> f18474Z;

    /* renamed from: b */
    public static final DataType f18447b = new DataType("com.google.step_count.delta", Field.f18563d);
    @KeepName
    public static final DataType TYPE_STEP_COUNT_CUMULATIVE = new DataType("com.google.step_count.cumulative", Field.f18563d);

    /* renamed from: c */
    public static final DataType f18448c = new DataType("com.google.step_count.cadence", Field.f18580u);

    /* renamed from: d */
    public static final DataType f18449d = new DataType("com.google.stride_model", Field.f18581v);

    /* renamed from: e */
    public static final DataType f18450e = new DataType("com.google.activity.segment", Field.f18527a);

    /* renamed from: f */
    public static final DataType f18451f = new DataType("com.google.floor_change", Field.f18527a, Field.f18561b, Field.f18535aa, Field.f18538ad);
    @Deprecated

    /* renamed from: g */
    public static final DataType f18452g = new DataType("com.google.calories.consumed", Field.f18583x);

    /* renamed from: h */
    public static final DataType f18453h = new DataType("com.google.calories.expended", Field.f18583x);

    /* renamed from: i */
    public static final DataType f18454i = new DataType("com.google.calories.bmr", Field.f18583x);

    /* renamed from: j */
    public static final DataType f18455j = new DataType("com.google.power.sample", Field.f18584y);
    @Deprecated

    /* renamed from: k */
    public static final DataType f18456k = new DataType("com.google.activity.sample", Field.f18527a, Field.f18561b);

    /* renamed from: l */
    public static final DataType f18457l = new DataType("com.google.activity.samples", Field.f18562c);

    /* renamed from: m */
    public static final DataType f18458m = new DataType("com.google.accelerometer", Field.C5133a.f18590a, Field.C5133a.f18591b, Field.C5133a.f18592c);

    /* renamed from: n */
    public static final DataType f18459n = new DataType("com.google.sensor.events", Field.f18528aA, Field.f18529aB, Field.f18530aC);
    @RequiresPermission(conditional = true, value = "android.permission.BODY_SENSORS")

    /* renamed from: o */
    public static final DataType f18460o = new DataType("com.google.heart_rate.bpm", Field.f18569j);
    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_FINE_LOCATION")

    /* renamed from: p */
    public static final DataType f18461p = new DataType("com.google.location.sample", Field.f18570k, Field.f18571l, Field.f18572m, Field.f18573n);
    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_FINE_LOCATION")

    /* renamed from: q */
    public static final DataType f18462q = new DataType("com.google.location.track", Field.f18570k, Field.f18571l, Field.f18572m, Field.f18573n);
    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_FINE_LOCATION")

    /* renamed from: r */
    public static final DataType f18463r = new DataType("com.google.distance.delta", Field.f18574o);
    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_FINE_LOCATION")
    @KeepName
    public static final DataType TYPE_DISTANCE_CUMULATIVE = new DataType("com.google.distance.cumulative", Field.f18574o);
    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_FINE_LOCATION")

    /* renamed from: s */
    public static final DataType f18464s = new DataType("com.google.speed", Field.f18579t);

    /* renamed from: t */
    public static final DataType f18465t = new DataType("com.google.cycling.wheel_revolution.cumulative", Field.f18582w);

    /* renamed from: u */
    public static final DataType f18466u = new DataType("com.google.cycling.wheel_revolution.rpm", Field.f18580u);

    /* renamed from: v */
    public static final DataType f18467v = new DataType("com.google.cycling.pedaling.cumulative", Field.f18582w);

    /* renamed from: w */
    public static final DataType f18468w = new DataType("com.google.cycling.pedaling.cadence", Field.f18580u);

    /* renamed from: x */
    public static final DataType f18469x = new DataType("com.google.height", Field.f18575p);

    /* renamed from: y */
    public static final DataType f18470y = new DataType("com.google.weight", Field.f18576q);

    /* renamed from: z */
    public static final DataType f18471z = new DataType("com.google.body.fat.percentage", Field.f18578s);

    /* renamed from: A */
    public static final DataType f18423A = new DataType("com.google.body.waist.circumference", Field.f18577r);

    /* renamed from: B */
    public static final DataType f18424B = new DataType("com.google.body.hip.circumference", Field.f18577r);

    /* renamed from: C */
    public static final DataType f18425C = new DataType("com.google.nutrition", Field.f18508H, Field.f18501A, Field.f18507G);

    /* renamed from: D */
    public static final DataType f18426D = new DataType("com.google.hydration", Field.f18585z);

    /* renamed from: E */
    public static final DataType f18427E = new DataType("com.google.activity.exercise", Field.f18541ag, Field.f18542ah, Field.f18564e, Field.f18544aj, Field.f18543ai);

    /* renamed from: F */
    public static final DataType f18428F = new DataType("com.google.activity.summary", Field.f18527a, Field.f18564e, Field.f18552ar);

    /* renamed from: G */
    public static final DataType f18429G = new DataType("com.google.floor_change.summary", Field.f18567h, Field.f18568i, Field.f18536ab, Field.f18537ac, Field.f18539ae, Field.f18540af);

    /* renamed from: H */
    public static final DataType f18430H = new DataType("com.google.calories.bmr.summary", Field.f18553as, Field.f18554at, Field.f18555au);

    /* renamed from: I */
    public static final DataType f18431I = f18447b;

    /* renamed from: J */
    public static final DataType f18432J = f18463r;
    @Deprecated

    /* renamed from: K */
    public static final DataType f18433K = f18452g;

    /* renamed from: L */
    public static final DataType f18434L = f18453h;
    @RequiresPermission(conditional = true, value = "android.permission.BODY_SENSORS")

    /* renamed from: M */
    public static final DataType f18435M = new DataType("com.google.heart_rate.summary", Field.f18553as, Field.f18554at, Field.f18555au);
    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_FINE_LOCATION")

    /* renamed from: N */
    public static final DataType f18436N = new DataType("com.google.location.bounding_box", Field.f18556av, Field.f18557aw, Field.f18558ax, Field.f18559ay);

    /* renamed from: O */
    public static final DataType f18437O = new DataType("com.google.power.summary", Field.f18553as, Field.f18554at, Field.f18555au);

    /* renamed from: P */
    public static final DataType f18438P = new DataType("com.google.speed.summary", Field.f18553as, Field.f18554at, Field.f18555au);

    /* renamed from: Q */
    public static final DataType f18439Q = new DataType("com.google.body.fat.percentage.summary", Field.f18553as, Field.f18554at, Field.f18555au);

    /* renamed from: R */
    public static final DataType f18440R = new DataType("com.google.body.hip.circumference.summary", Field.f18553as, Field.f18554at, Field.f18555au);

    /* renamed from: S */
    public static final DataType f18441S = new DataType("com.google.body.waist.circumference.summary", Field.f18553as, Field.f18554at, Field.f18555au);

    /* renamed from: T */
    public static final DataType f18442T = new DataType("com.google.weight.summary", Field.f18553as, Field.f18554at, Field.f18555au);

    /* renamed from: U */
    public static final DataType f18443U = new DataType("com.google.nutrition.summary", Field.f18508H, Field.f18501A);

    /* renamed from: V */
    public static final DataType f18444V = f18426D;
    @Deprecated

    /* renamed from: W */
    public static final Set<DataType> f18445W = new C4678a();
    public static final Parcelable.Creator<DataType> CREATOR = new C5157o();

    /* renamed from: com.google.android.gms.fitness.data.DataType$a */
    /* loaded from: classes2.dex */
    public static final class C5132a {

        /* renamed from: a */
        public static final DataType f18475a = new DataType("com.google.internal.session.debug", Field.C5133a.f18593d);
    }

    static {
        f18445W.add(f18450e);
        f18445W.add(f18454i);
        f18445W.add(f18471z);
        f18445W.add(f18424B);
        f18445W.add(f18423A);
        f18445W.add(f18452g);
        f18445W.add(f18453h);
        f18445W.add(f18463r);
        f18445W.add(f18451f);
        f18445W.add(f18461p);
        f18445W.add(f18425C);
        f18445W.add(f18426D);
        f18445W.add(f18460o);
        f18445W.add(f18455j);
        f18445W.add(f18464s);
        f18445W.add(f18447b);
        f18445W.add(f18470y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataType(int i, String str, List<Field> list) {
        this.f18472X = i;
        this.f18473Y = str;
        this.f18474Z = Collections.unmodifiableList(list);
    }

    public DataType(String str, Field... fieldArr) {
        this(1, str, C4679b.m23164a(fieldArr));
    }

    /* renamed from: a */
    public static List<DataType> m21658a(DataType dataType) {
        List<DataType> list = C5144b.f18748a.get(dataType);
        return list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    /* renamed from: b */
    public static String m21655b(DataType dataType) {
        String valueOf = String.valueOf(f18446a);
        String valueOf2 = String.valueOf(dataType.m21659a());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: c */
    private boolean m21653c(DataType dataType) {
        return this.f18473Y.equals(dataType.f18473Y) && this.f18474Z.equals(dataType.f18474Z);
    }

    /* renamed from: a */
    public int m21657a(Field field) {
        int indexOf = this.f18474Z.indexOf(field);
        if (indexOf < 0) {
            throw new IllegalArgumentException(String.format("%s not a field of %s", field, this));
        }
        return indexOf;
    }

    /* renamed from: a */
    public String m21659a() {
        return this.f18473Y;
    }

    /* renamed from: b */
    public List<Field> m21656b() {
        return this.f18474Z;
    }

    /* renamed from: c */
    public String m21654c() {
        return this.f18473Y.startsWith("com.google.") ? this.f18473Y.substring(11) : this.f18473Y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m21652d() {
        return this.f18472X;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataType) && m21653c((DataType) obj));
    }

    public int hashCode() {
        return this.f18473Y.hashCode();
    }

    public String toString() {
        return String.format("DataType{%s%s}", this.f18473Y, this.f18474Z);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5157o.m21439a(this, parcel, i);
    }
}
