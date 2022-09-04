package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Comparator;
/* loaded from: classes2.dex */
public class DetectedActivity extends AbstractSafeParcelable {

    /* renamed from: b */
    public static final int f26639b = 0;

    /* renamed from: c */
    public static final int f26640c = 1;

    /* renamed from: d */
    public static final int f26641d = 2;

    /* renamed from: e */
    public static final int f26642e = 3;

    /* renamed from: f */
    public static final int f26643f = 4;

    /* renamed from: g */
    public static final int f26644g = 5;

    /* renamed from: h */
    public static final int f26645h = 7;

    /* renamed from: i */
    public static final int f26646i = 8;

    /* renamed from: l */
    int f26649l;

    /* renamed from: m */
    int f26650m;

    /* renamed from: n */
    private final int f26651n;

    /* renamed from: a */
    public static final Comparator<DetectedActivity> f26638a = new Comparator<DetectedActivity>() { // from class: com.google.android.gms.location.DetectedActivity.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(DetectedActivity detectedActivity, DetectedActivity detectedActivity2) {
            int compareTo = Integer.valueOf(detectedActivity2.m12646b()).compareTo(Integer.valueOf(detectedActivity.m12646b()));
            return compareTo == 0 ? Integer.valueOf(detectedActivity.m12648a()).compareTo(Integer.valueOf(detectedActivity2.m12648a())) : compareTo;
        }
    };

    /* renamed from: j */
    public static final int[] f26647j = {9, 10};

    /* renamed from: k */
    public static final int[] f26648k = {0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14};
    public static final C8165d CREATOR = new C8165d();

    public DetectedActivity(int i, int i2) {
        this.f26651n = 1;
        this.f26649l = i;
        this.f26650m = i2;
    }

    public DetectedActivity(int i, int i2, int i3) {
        this.f26651n = i;
        this.f26649l = i2;
        this.f26650m = i3;
    }

    /* renamed from: a */
    public static String m12647a(int i) {
        switch (i) {
            case 0:
                return "IN_VEHICLE";
            case 1:
                return "ON_BICYCLE";
            case 2:
                return "ON_FOOT";
            case 3:
                return "STILL";
            case 4:
                return "UNKNOWN";
            case 5:
                return "TILTING";
            case 6:
            default:
                return Integer.toString(i);
            case 7:
                return "WALKING";
            case 8:
                return "RUNNING";
        }
    }

    /* renamed from: b */
    private int m12645b(int i) {
        if (i > 15) {
            return 4;
        }
        return i;
    }

    /* renamed from: a */
    public int m12648a() {
        return m12645b(this.f26649l);
    }

    /* renamed from: b */
    public int m12646b() {
        return this.f26650m;
    }

    /* renamed from: c */
    public int m12644c() {
        return this.f26651n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        return this.f26649l == detectedActivity.f26649l && this.f26650m == detectedActivity.f26650m;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f26649l), Integer.valueOf(this.f26650m));
    }

    public String toString() {
        String valueOf = String.valueOf(m12647a(m12648a()));
        return new StringBuilder(String.valueOf(valueOf).length() + 48).append("DetectedActivity [type=").append(valueOf).append(", confidence=").append(this.f26650m).append("]").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8165d.m12567a(this, parcel, i);
    }
}
