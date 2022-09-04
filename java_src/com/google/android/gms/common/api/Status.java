package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.xiaomi.market.sdk.C10445j;
/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements AbstractC4502m, ReflectedParcelable {

    /* renamed from: h */
    private final int f16793h;

    /* renamed from: i */
    private final int f16794i;

    /* renamed from: j */
    private final String f16795j;

    /* renamed from: k */
    private final PendingIntent f16796k;

    /* renamed from: a */
    public static final Status f16786a = new Status(0);

    /* renamed from: b */
    public static final Status f16787b = new Status(14);

    /* renamed from: c */
    public static final Status f16788c = new Status(8);

    /* renamed from: d */
    public static final Status f16789d = new Status(15);

    /* renamed from: e */
    public static final Status f16790e = new Status(16);

    /* renamed from: f */
    public static final Status f16791f = new Status(17);

    /* renamed from: g */
    public static final Status f16792g = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new C4514y();

    public Status(int i) {
        this(i, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f16793h = i;
        this.f16794i = i2;
        this.f16795j = str;
        this.f16796k = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    /* renamed from: k */
    private String m24013k() {
        return this.f16795j != null ? this.f16795j : C4488f.m23981b(this.f16794i);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this;
    }

    /* renamed from: a */
    public void m24023a(Activity activity, int i) {
        if (!m24019e()) {
            return;
        }
        activity.startIntentSenderForResult(this.f16796k.getIntentSender(), i, null, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public PendingIntent m24022b() {
        return this.f16796k;
    }

    @Nullable
    /* renamed from: c */
    public String m24021c() {
        return this.f16795j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m24020d() {
        return this.f16793h;
    }

    /* renamed from: e */
    public boolean m24019e() {
        return this.f16796k != null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f16793h == status.f16793h && this.f16794i == status.f16794i && C4585c.m23634a(this.f16795j, status.f16795j) && C4585c.m23634a(this.f16796k, status.f16796k);
    }

    /* renamed from: f */
    public boolean m24018f() {
        return this.f16794i <= 0;
    }

    /* renamed from: g */
    public boolean m24017g() {
        return this.f16794i == 16;
    }

    /* renamed from: h */
    public boolean m24016h() {
        return this.f16794i == 14;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f16793h), Integer.valueOf(this.f16794i), this.f16795j, this.f16796k);
    }

    /* renamed from: i */
    public int m24015i() {
        return this.f16794i;
    }

    /* renamed from: j */
    public PendingIntent m24014j() {
        return this.f16796k;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("statusCode", m24013k()).m23632a(C10445j.f32463ai, this.f16796k).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4514y.m23921a(this, parcel, i);
    }
}
