package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
/* loaded from: classes2.dex */
public class LaunchOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LaunchOptions> CREATOR = new C4448l();

    /* renamed from: a */
    private final int f15851a;

    /* renamed from: b */
    private boolean f15852b;

    /* renamed from: c */
    private String f15853c;

    /* renamed from: com.google.android.gms.cast.LaunchOptions$a */
    /* loaded from: classes2.dex */
    public static final class C4195a {

        /* renamed from: a */
        private LaunchOptions f15854a = new LaunchOptions();

        /* renamed from: a */
        public C4195a m25153a(Locale locale) {
            this.f15854a.m25158a(C4430f.m24204a(locale));
            return this;
        }

        /* renamed from: a */
        public C4195a m25152a(boolean z) {
            this.f15854a.m25157a(z);
            return this;
        }

        /* renamed from: a */
        public LaunchOptions m25154a() {
            return this.f15854a;
        }
    }

    public LaunchOptions() {
        this(1, false, C4430f.m24204a(Locale.getDefault()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LaunchOptions(int i, boolean z, String str) {
        this.f15851a = i;
        this.f15852b = z;
        this.f15853c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m25159a() {
        return this.f15851a;
    }

    /* renamed from: a */
    public void m25158a(String str) {
        this.f15853c = str;
    }

    /* renamed from: a */
    public void m25157a(boolean z) {
        this.f15852b = z;
    }

    /* renamed from: b */
    public boolean m25156b() {
        return this.f15852b;
    }

    /* renamed from: c */
    public String m25155c() {
        return this.f15853c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) obj;
        return this.f15852b == launchOptions.f15852b && C4430f.m24206a(this.f15853c, launchOptions.f15853c);
    }

    public int hashCode() {
        return C4585c.m23633a(Boolean.valueOf(this.f15852b), this.f15853c);
    }

    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", Boolean.valueOf(this.f15852b), this.f15853c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4448l.m24102a(this, parcel, i);
    }
}
