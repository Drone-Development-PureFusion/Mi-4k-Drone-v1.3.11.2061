package com.google.android.gms.fitness.data;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.akk;
import com.google.android.gms.internal.ame;
/* loaded from: classes2.dex */
public final class Device extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Device> CREATOR = new C5160r();

    /* renamed from: a */
    public static final int f18487a = 0;

    /* renamed from: b */
    public static final int f18488b = 1;

    /* renamed from: c */
    public static final int f18489c = 2;

    /* renamed from: d */
    public static final int f18490d = 3;

    /* renamed from: e */
    public static final int f18491e = 4;

    /* renamed from: f */
    public static final int f18492f = 5;

    /* renamed from: g */
    public static final int f18493g = 6;

    /* renamed from: h */
    private final int f18494h;

    /* renamed from: i */
    private final String f18495i;

    /* renamed from: j */
    private final String f18496j;

    /* renamed from: k */
    private final String f18497k;

    /* renamed from: l */
    private final String f18498l;

    /* renamed from: m */
    private final int f18499m;

    /* renamed from: n */
    private final int f18500n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Device(int i, String str, String str2, String str3, String str4, int i2, int i3) {
        this.f18494h = i;
        this.f18495i = (String) C4588d.m23627a(str);
        this.f18496j = (String) C4588d.m23627a(str2);
        this.f18497k = "";
        this.f18498l = m21639a(str4);
        this.f18499m = i2;
        this.f18500n = i3;
    }

    public Device(String str, String str2, String str3, int i) {
        this(str, str2, "", str3, i, 0);
    }

    public Device(String str, String str2, String str3, String str4, int i, int i2) {
        this(1, str, str2, "", str4, i, i2);
    }

    /* renamed from: a */
    public static Device m21641a(Context context) {
        int m17025b = akk.m17025b(context);
        return new Device(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, m21637b(context), m17025b, 2);
    }

    /* renamed from: a */
    private String m21639a(String str) {
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Device UID is null.");
    }

    /* renamed from: a */
    private boolean m21640a(Device device) {
        return C4585c.m23634a(this.f18495i, device.f18495i) && C4585c.m23634a(this.f18496j, device.f18496j) && C4585c.m23634a(this.f18497k, device.f18497k) && C4585c.m23634a(this.f18498l, device.f18498l) && this.f18499m == device.f18499m && this.f18500n == device.f18500n;
    }

    /* renamed from: b */
    private static String m21637b(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: j */
    private boolean m21629j() {
        return m21633f() == 1;
    }

    /* renamed from: a */
    public String m21642a() {
        return this.f18495i;
    }

    /* renamed from: b */
    public String m21638b() {
        return this.f18496j;
    }

    /* renamed from: c */
    public String m21636c() {
        return this.f18497k;
    }

    /* renamed from: d */
    public String m21635d() {
        return this.f18498l;
    }

    /* renamed from: e */
    public int m21634e() {
        return this.f18499m;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Device) && m21640a((Device) obj));
    }

    /* renamed from: f */
    public int m21633f() {
        return this.f18500n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public String m21632g() {
        return String.format("%s:%s:%s", this.f18495i, this.f18496j, this.f18498l);
    }

    /* renamed from: h */
    public String m21631h() {
        return m21629j() ? this.f18498l : ame.m16833a(this.f18498l);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18495i, this.f18496j, this.f18497k, this.f18498l, Integer.valueOf(this.f18499m));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m21630i() {
        return this.f18494h;
    }

    public String toString() {
        return String.format("Device{%s:%s:%s:%s}", m21632g(), this.f18497k, Integer.valueOf(this.f18499m), Integer.valueOf(this.f18500n));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5160r.m21432a(this, parcel, i);
    }
}
