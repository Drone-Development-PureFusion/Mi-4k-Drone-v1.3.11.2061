package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes2.dex */
public class PlayLoggerContext extends AbstractSafeParcelable {
    public static final C8919a CREATOR = new C8919a();

    /* renamed from: a */
    public final int f28413a;

    /* renamed from: b */
    public final String f28414b;

    /* renamed from: c */
    public final int f28415c;

    /* renamed from: d */
    public final int f28416d;

    /* renamed from: e */
    public final String f28417e;

    /* renamed from: f */
    public final String f28418f;

    /* renamed from: g */
    public final boolean f28419g;

    /* renamed from: h */
    public final String f28420h;

    /* renamed from: i */
    public final boolean f28421i;

    /* renamed from: j */
    public final int f28422j;

    public PlayLoggerContext(int i, String str, int i2, int i3, String str2, String str3, boolean z, String str4, boolean z2, int i4) {
        this.f28413a = i;
        this.f28414b = str;
        this.f28415c = i2;
        this.f28416d = i3;
        this.f28417e = str2;
        this.f28418f = str3;
        this.f28419g = z;
        this.f28420h = str4;
        this.f28421i = z2;
        this.f28422j = i4;
    }

    public PlayLoggerContext(String str, int i, int i2, String str2, String str3, String str4, boolean z, int i3) {
        this.f28413a = 1;
        this.f28414b = (String) C4588d.m23627a(str);
        this.f28415c = i;
        this.f28416d = i2;
        this.f28420h = str2;
        this.f28417e = str3;
        this.f28418f = str4;
        this.f28419g = !z;
        this.f28421i = z;
        this.f28422j = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayLoggerContext)) {
            return false;
        }
        PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
        return this.f28413a == playLoggerContext.f28413a && this.f28414b.equals(playLoggerContext.f28414b) && this.f28415c == playLoggerContext.f28415c && this.f28416d == playLoggerContext.f28416d && C4585c.m23634a(this.f28420h, playLoggerContext.f28420h) && C4585c.m23634a(this.f28417e, playLoggerContext.f28417e) && C4585c.m23634a(this.f28418f, playLoggerContext.f28418f) && this.f28419g == playLoggerContext.f28419g && this.f28421i == playLoggerContext.f28421i && this.f28422j == playLoggerContext.f28422j;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28413a), this.f28414b, Integer.valueOf(this.f28415c), Integer.valueOf(this.f28416d), this.f28420h, this.f28417e, this.f28418f, Boolean.valueOf(this.f28419g), Boolean.valueOf(this.f28421i), Integer.valueOf(this.f28422j));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayLoggerContext[");
        sb.append("versionCode=").append(this.f28413a).append(C0494h.f736x);
        sb.append("package=").append(this.f28414b).append(C0494h.f736x);
        sb.append("packageVersionCode=").append(this.f28415c).append(C0494h.f736x);
        sb.append("logSource=").append(this.f28416d).append(C0494h.f736x);
        sb.append("logSourceName=").append(this.f28420h).append(C0494h.f736x);
        sb.append("uploadAccount=").append(this.f28417e).append(C0494h.f736x);
        sb.append("loggingId=").append(this.f28418f).append(C0494h.f736x);
        sb.append("logAndroidId=").append(this.f28419g).append(C0494h.f736x);
        sb.append("isAnonymous=").append(this.f28421i).append(C0494h.f736x);
        sb.append("qosTier=").append(this.f28422j);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8919a.m9728a(this, parcel, i);
    }
}
