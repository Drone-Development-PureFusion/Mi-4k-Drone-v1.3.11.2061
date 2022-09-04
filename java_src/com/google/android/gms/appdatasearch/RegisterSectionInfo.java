package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
/* loaded from: classes2.dex */
public class RegisterSectionInfo extends AbstractSafeParcelable {
    public static final C3961i CREATOR = new C3961i();

    /* renamed from: a */
    final int f15260a;

    /* renamed from: b */
    public final String f15261b;

    /* renamed from: c */
    public final String f15262c;

    /* renamed from: d */
    public final boolean f15263d;

    /* renamed from: e */
    public final int f15264e;

    /* renamed from: f */
    public final boolean f15265f;

    /* renamed from: g */
    public final String f15266g;

    /* renamed from: h */
    public final Feature[] f15267h;

    /* renamed from: i */
    final int[] f15268i;

    /* renamed from: j */
    public final String f15269j;

    /* renamed from: com.google.android.gms.appdatasearch.RegisterSectionInfo$a */
    /* loaded from: classes2.dex */
    public static final class C3949a {

        /* renamed from: a */
        private final String f15270a;

        /* renamed from: b */
        private String f15271b;

        /* renamed from: c */
        private boolean f15272c;

        /* renamed from: e */
        private boolean f15274e;

        /* renamed from: g */
        private BitSet f15276g;

        /* renamed from: h */
        private String f15277h;

        /* renamed from: d */
        private int f15273d = 1;

        /* renamed from: f */
        private final List<Feature> f15275f = new ArrayList();

        public C3949a(String str) {
            this.f15270a = str;
        }

        /* renamed from: a */
        public C3949a m25949a(int i) {
            if (this.f15276g == null) {
                this.f15276g = new BitSet();
            }
            this.f15276g.set(i);
            return this;
        }

        /* renamed from: a */
        public C3949a m25948a(String str) {
            this.f15271b = str;
            return this;
        }

        /* renamed from: a */
        public C3949a m25947a(boolean z) {
            this.f15272c = z;
            return this;
        }

        /* renamed from: a */
        public RegisterSectionInfo m25950a() {
            int[] iArr;
            int i = 0;
            if (this.f15276g != null) {
                iArr = new int[this.f15276g.cardinality()];
                int nextSetBit = this.f15276g.nextSetBit(0);
                while (nextSetBit >= 0) {
                    iArr[i] = nextSetBit;
                    nextSetBit = this.f15276g.nextSetBit(nextSetBit + 1);
                    i++;
                }
            } else {
                iArr = null;
            }
            return new RegisterSectionInfo(this.f15270a, this.f15271b, this.f15272c, this.f15273d, this.f15274e, null, (Feature[]) this.f15275f.toArray(new Feature[this.f15275f.size()]), iArr, this.f15277h);
        }

        /* renamed from: b */
        public C3949a m25946b(String str) {
            this.f15277h = str;
            return this;
        }

        /* renamed from: b */
        public C3949a m25945b(boolean z) {
            this.f15274e = z;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RegisterSectionInfo(int i, String str, String str2, boolean z, int i2, boolean z2, String str3, Feature[] featureArr, int[] iArr, String str4) {
        this.f15260a = i;
        this.f15261b = str;
        this.f15262c = str2;
        this.f15263d = z;
        this.f15264e = i2;
        this.f15265f = z2;
        this.f15266g = str3;
        this.f15267h = featureArr;
        this.f15268i = iArr;
        this.f15269j = str4;
    }

    RegisterSectionInfo(String str, String str2, boolean z, int i, boolean z2, String str3, Feature[] featureArr, int[] iArr, String str4) {
        this(2, str, str2, z, i, z2, str3, featureArr, iArr, str4);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3961i c3961i = CREATOR;
        C3961i.m25905a(this, parcel, i);
    }
}
