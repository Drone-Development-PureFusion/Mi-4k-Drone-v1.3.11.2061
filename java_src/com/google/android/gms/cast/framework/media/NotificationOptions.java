package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.C3424R;
import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2.dex */
public class NotificationOptions extends AbstractSafeParcelable {

    /* renamed from: a */
    public static final long f16267a = 10000;

    /* renamed from: b */
    public static final long f16268b = 30000;

    /* renamed from: A */
    private final int f16271A;

    /* renamed from: B */
    private final int f16272B;

    /* renamed from: C */
    private final int f16273C;

    /* renamed from: D */
    private final int f16274D;

    /* renamed from: E */
    private final int f16275E;

    /* renamed from: F */
    private final int f16276F;

    /* renamed from: G */
    private final int f16277G;

    /* renamed from: H */
    private final int f16278H;

    /* renamed from: I */
    private final int f16279I;

    /* renamed from: J */
    private final int f16280J;

    /* renamed from: e */
    private final int f16281e;

    /* renamed from: f */
    private final List<String> f16282f;

    /* renamed from: g */
    private final int[] f16283g;

    /* renamed from: h */
    private final long f16284h;

    /* renamed from: i */
    private final String f16285i;

    /* renamed from: j */
    private final int f16286j;

    /* renamed from: k */
    private final int f16287k;

    /* renamed from: l */
    private final int f16288l;

    /* renamed from: m */
    private final int f16289m;

    /* renamed from: n */
    private final int f16290n;

    /* renamed from: o */
    private final int f16291o;

    /* renamed from: p */
    private final int f16292p;

    /* renamed from: q */
    private final int f16293q;

    /* renamed from: r */
    private final int f16294r;

    /* renamed from: s */
    private final int f16295s;

    /* renamed from: t */
    private final int f16296t;

    /* renamed from: u */
    private final int f16297u;

    /* renamed from: v */
    private final int f16298v;

    /* renamed from: w */
    private final int f16299w;

    /* renamed from: x */
    private final int f16300x;

    /* renamed from: y */
    private final int f16301y;

    /* renamed from: z */
    private final int f16302z;

    /* renamed from: c */
    private static final List<String> f16269c = Arrays.asList(MediaIntentReceiver.f16256a, MediaIntentReceiver.f16261f);

    /* renamed from: d */
    private static final int[] f16270d = {0, 1};
    public static final Parcelable.Creator<NotificationOptions> CREATOR = new C4341g();

    /* renamed from: com.google.android.gms.cast.framework.media.NotificationOptions$a */
    /* loaded from: classes2.dex */
    public static final class C4288a {

        /* renamed from: a */
        private String f16303a;

        /* renamed from: b */
        private List<String> f16304b = NotificationOptions.f16269c;

        /* renamed from: c */
        private int[] f16305c = NotificationOptions.f16270d;

        /* renamed from: d */
        private long f16306d = 10000;

        /* renamed from: a */
        public C4288a m24647a(long j) {
            C4588d.m23618b(j > 0, "skipStepMs must be positive.");
            this.f16306d = j;
            return this;
        }

        /* renamed from: a */
        public C4288a m24646a(String str) {
            this.f16303a = str;
            return this;
        }

        /* renamed from: a */
        public C4288a m24645a(List<String> list, int[] iArr) {
            if (list != null || iArr == null) {
                if (list != null && iArr == null) {
                    throw new IllegalArgumentException("When setting compatActionIndices to null, you must also set actions to null.");
                }
                if (list == null || iArr == null) {
                    this.f16304b = NotificationOptions.f16269c;
                    this.f16305c = NotificationOptions.f16270d;
                } else {
                    int size = list.size();
                    if (iArr.length > size) {
                        throw new IllegalArgumentException(String.format(Locale.ROOT, "Invalid number of compat actions: %d > %d.", Integer.valueOf(iArr.length), Integer.valueOf(size)));
                    }
                    for (int i : iArr) {
                        if (i < 0 || i >= size) {
                            throw new IllegalArgumentException(String.format(Locale.ROOT, "Index %d in compatActionIndices out of range: [0, %d]", Integer.valueOf(i), Integer.valueOf(size - 1)));
                        }
                    }
                    this.f16304b = new ArrayList(list);
                    this.f16305c = Arrays.copyOf(iArr, iArr.length);
                }
                return this;
            }
            throw new IllegalArgumentException("When setting actions to null, you must also set compatActionIndices to null.");
        }

        /* renamed from: a */
        public NotificationOptions m24648a() {
            return new NotificationOptions(1, this.f16304b, this.f16305c, this.f16306d, this.f16303a, C3424R.C3425drawable.cast_ic_notification_small_icon, C3424R.C3425drawable.cast_ic_notification_stop_live_stream, C3424R.C3425drawable.cast_ic_notification_pause, C3424R.C3425drawable.cast_ic_notification_play, C3424R.C3425drawable.cast_ic_notification_skip_next, C3424R.C3425drawable.cast_ic_notification_skip_prev, C3424R.C3425drawable.cast_ic_notification_forward, C3424R.C3425drawable.cast_ic_notification_forward10, C3424R.C3425drawable.cast_ic_notification_forward30, C3424R.C3425drawable.cast_ic_notification_rewind, C3424R.C3425drawable.cast_ic_notification_rewind10, C3424R.C3425drawable.cast_ic_notification_rewind30, C3424R.C3425drawable.cast_ic_notification_disconnect, C3424R.dimen.cast_notification_image_size, C3424R.C3427string.cast_casting_to_device, C3424R.C3427string.cast_stop_live_stream, C3424R.C3427string.cast_pause, C3424R.C3427string.cast_play, C3424R.C3427string.cast_skip_next, C3424R.C3427string.cast_skip_prev, C3424R.C3427string.cast_forward, C3424R.C3427string.cast_forward_10, C3424R.C3427string.cast_forward_30, C3424R.C3427string.cast_rewind, C3424R.C3427string.cast_rewind_10, C3424R.C3427string.cast_rewind_30, C3424R.C3427string.cast_disconnect);
        }
    }

    public NotificationOptions(int i, List<String> list, int[] iArr, long j, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28) {
        this.f16281e = i;
        if (list != null) {
            this.f16282f = new ArrayList(list);
        } else {
            this.f16282f = null;
        }
        if (iArr != null) {
            this.f16283g = Arrays.copyOf(iArr, iArr.length);
        } else {
            this.f16283g = null;
        }
        this.f16284h = j;
        this.f16285i = str;
        this.f16286j = i2;
        this.f16287k = i3;
        this.f16288l = i4;
        this.f16289m = i5;
        this.f16290n = i6;
        this.f16291o = i7;
        this.f16292p = i8;
        this.f16293q = i9;
        this.f16294r = i10;
        this.f16295s = i11;
        this.f16296t = i12;
        this.f16297u = i13;
        this.f16298v = i14;
        this.f16299w = i15;
        this.f16300x = i16;
        this.f16301y = i17;
        this.f16302z = i18;
        this.f16271A = i19;
        this.f16272B = i20;
        this.f16273C = i21;
        this.f16274D = i22;
        this.f16275E = i23;
        this.f16276F = i24;
        this.f16277G = i25;
        this.f16278H = i26;
        this.f16279I = i27;
        this.f16280J = i28;
    }

    /* renamed from: A */
    public int m24682A() {
        return this.f16275E;
    }

    /* renamed from: B */
    public int m24681B() {
        return this.f16276F;
    }

    /* renamed from: C */
    public int m24680C() {
        return this.f16277G;
    }

    /* renamed from: D */
    public int m24679D() {
        return this.f16278H;
    }

    /* renamed from: E */
    public int m24678E() {
        return this.f16279I;
    }

    /* renamed from: F */
    public int m24677F() {
        return this.f16280J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m24674a() {
        return this.f16281e;
    }

    /* renamed from: b */
    public List<String> m24673b() {
        return this.f16282f;
    }

    /* renamed from: c */
    public int[] m24672c() {
        return Arrays.copyOf(this.f16283g, this.f16283g.length);
    }

    /* renamed from: d */
    public long m24671d() {
        return this.f16284h;
    }

    /* renamed from: e */
    public String m24670e() {
        return this.f16285i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationOptions)) {
            return false;
        }
        NotificationOptions notificationOptions = (NotificationOptions) obj;
        return C4430f.m24206a(this.f16282f, notificationOptions.f16282f) && Arrays.equals(this.f16283g, notificationOptions.f16283g) && this.f16284h == notificationOptions.f16284h && C4430f.m24206a(this.f16285i, notificationOptions.f16285i);
    }

    /* renamed from: f */
    public int m24669f() {
        return this.f16286j;
    }

    /* renamed from: g */
    public int m24668g() {
        return this.f16287k;
    }

    /* renamed from: h */
    public int m24667h() {
        return this.f16288l;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f16282f, Integer.valueOf(Arrays.hashCode(this.f16283g)), Long.valueOf(this.f16284h), this.f16285i);
    }

    /* renamed from: i */
    public int m24666i() {
        return this.f16289m;
    }

    /* renamed from: j */
    public int m24665j() {
        return this.f16290n;
    }

    /* renamed from: k */
    public int m24664k() {
        return this.f16291o;
    }

    /* renamed from: l */
    public int m24663l() {
        return this.f16292p;
    }

    /* renamed from: m */
    public int m24662m() {
        return this.f16293q;
    }

    /* renamed from: n */
    public int m24661n() {
        return this.f16294r;
    }

    /* renamed from: o */
    public int m24660o() {
        return this.f16295s;
    }

    /* renamed from: p */
    public int m24659p() {
        return this.f16296t;
    }

    /* renamed from: q */
    public int m24658q() {
        return this.f16297u;
    }

    /* renamed from: r */
    public int m24657r() {
        return this.f16298v;
    }

    /* renamed from: s */
    public int m24656s() {
        return this.f16299w;
    }

    /* renamed from: t */
    public int m24655t() {
        return this.f16300x;
    }

    public String toString() {
        return String.format(Locale.ROOT, "NotificationOptions(actions=%s, compatActionIndices=%s, skipStepMs=%s, targetActivityClassName=%s)", this.f16282f, Arrays.toString(this.f16283g), Long.valueOf(this.f16284h), this.f16285i);
    }

    /* renamed from: u */
    public int m24654u() {
        return this.f16301y;
    }

    /* renamed from: v */
    public int m24653v() {
        return this.f16302z;
    }

    /* renamed from: w */
    public int m24652w() {
        return this.f16271A;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4341g.m24479a(this, parcel, i);
    }

    /* renamed from: x */
    public int m24651x() {
        return this.f16272B;
    }

    /* renamed from: y */
    public int m24650y() {
        return this.f16273C;
    }

    /* renamed from: z */
    public int m24649z() {
        return this.f16274D;
    }
}
