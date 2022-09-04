package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import p005b.p006a.p007a.p008a.p020j.C0324k;
/* loaded from: classes2.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C4676g();

    /* renamed from: a */
    final int f17242a;

    /* renamed from: b */
    private final long f17243b;

    /* renamed from: c */
    private int f17244c;

    /* renamed from: d */
    private final String f17245d;

    /* renamed from: e */
    private final String f17246e;

    /* renamed from: f */
    private final String f17247f;

    /* renamed from: g */
    private final int f17248g;

    /* renamed from: h */
    private final List<String> f17249h;

    /* renamed from: i */
    private final String f17250i;

    /* renamed from: j */
    private final long f17251j;

    /* renamed from: k */
    private int f17252k;

    /* renamed from: l */
    private final String f17253l;

    /* renamed from: m */
    private final float f17254m;

    /* renamed from: n */
    private final long f17255n;

    /* renamed from: o */
    private long f17256o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.f17242a = i;
        this.f17243b = j;
        this.f17244c = i2;
        this.f17245d = str;
        this.f17246e = str3;
        this.f17247f = str5;
        this.f17248g = i3;
        this.f17256o = -1L;
        this.f17249h = list;
        this.f17250i = str2;
        this.f17251j = j2;
        this.f17252k = i4;
        this.f17253l = str4;
        this.f17254m = f;
        this.f17255n = j3;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: a */
    public long mo23222a() {
        return this.f17243b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: b */
    public int mo23221b() {
        return this.f17244c;
    }

    /* renamed from: c */
    public String m23220c() {
        return this.f17245d;
    }

    /* renamed from: d */
    public String m23219d() {
        return this.f17246e;
    }

    /* renamed from: e */
    public String m23218e() {
        return this.f17247f;
    }

    /* renamed from: f */
    public int m23217f() {
        return this.f17248g;
    }

    /* renamed from: g */
    public List<String> m23216g() {
        return this.f17249h;
    }

    /* renamed from: h */
    public String m23215h() {
        return this.f17250i;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: i */
    public long mo23214i() {
        return this.f17256o;
    }

    /* renamed from: j */
    public long m23213j() {
        return this.f17251j;
    }

    /* renamed from: k */
    public int m23212k() {
        return this.f17252k;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: l */
    public String mo23211l() {
        String valueOf = String.valueOf(C0324k.f324b);
        String valueOf2 = String.valueOf(m23220c());
        String valueOf3 = String.valueOf(C0324k.f324b);
        int m23217f = m23217f();
        String valueOf4 = String.valueOf(C0324k.f324b);
        String join = m23216g() == null ? "" : TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, m23216g());
        String valueOf5 = String.valueOf(C0324k.f324b);
        int m23212k = m23212k();
        String valueOf6 = String.valueOf(C0324k.f324b);
        String m23219d = m23219d() == null ? "" : m23219d();
        String valueOf7 = String.valueOf(C0324k.f324b);
        String m23210m = m23210m() == null ? "" : m23210m();
        String valueOf8 = String.valueOf(C0324k.f324b);
        float m23209n = m23209n();
        String valueOf9 = String.valueOf(C0324k.f324b);
        String m23218e = m23218e() == null ? "" : m23218e();
        return new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(join).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(m23219d).length() + String.valueOf(valueOf7).length() + String.valueOf(m23210m).length() + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length() + String.valueOf(m23218e).length()).append(valueOf).append(valueOf2).append(valueOf3).append(m23217f).append(valueOf4).append(join).append(valueOf5).append(m23212k).append(valueOf6).append(m23219d).append(valueOf7).append(m23210m).append(valueOf8).append(m23209n).append(valueOf9).append(m23218e).toString();
    }

    /* renamed from: m */
    public String m23210m() {
        return this.f17253l;
    }

    /* renamed from: n */
    public float m23209n() {
        return this.f17254m;
    }

    /* renamed from: o */
    public long m23208o() {
        return this.f17255n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4676g.m23180a(this, parcel, i);
    }
}
