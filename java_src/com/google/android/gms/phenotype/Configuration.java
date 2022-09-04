package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public class Configuration extends AbstractSafeParcelable implements Comparable<Configuration> {
    public static final Parcelable.Creator<Configuration> CREATOR = new C8916a();

    /* renamed from: a */
    final int f28397a;

    /* renamed from: b */
    public final int f28398b;

    /* renamed from: c */
    public final Flag[] f28399c;

    /* renamed from: d */
    public final String[] f28400d;

    /* renamed from: e */
    public final Map<String, Flag> f28401e = new TreeMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Configuration(int i, int i2, Flag[] flagArr, String[] strArr) {
        this.f28397a = i;
        this.f28398b = i2;
        this.f28399c = flagArr;
        for (Flag flag : flagArr) {
            this.f28401e.put(flag.f28405b, flag);
        }
        this.f28400d = strArr;
        if (this.f28400d != null) {
            Arrays.sort(this.f28400d);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(Configuration configuration) {
        return this.f28398b - configuration.f28398b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return this.f28397a == configuration.f28397a && this.f28398b == configuration.f28398b && C4585c.m23634a(this.f28401e, configuration.f28401e) && Arrays.equals(this.f28400d, configuration.f28400d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f28397a);
        sb.append(", ");
        sb.append(this.f28398b);
        sb.append(", ");
        sb.append("(");
        for (Flag flag : this.f28401e.values()) {
            sb.append(flag);
            sb.append(", ");
        }
        sb.append(")");
        sb.append(", ");
        sb.append("(");
        if (this.f28400d != null) {
            for (String str : this.f28400d) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append(")");
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8916a.m9734a(this, parcel, i);
    }
}
