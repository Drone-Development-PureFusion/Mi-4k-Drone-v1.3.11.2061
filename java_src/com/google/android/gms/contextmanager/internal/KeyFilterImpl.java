package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class KeyFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyFilterImpl> CREATOR = new C4784l();

    /* renamed from: a */
    private final int f17431a;

    /* renamed from: b */
    private final ArrayList<Inclusion> f17432b;

    /* loaded from: classes2.dex */
    public static class Inclusion extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Inclusion> CREATOR = new C4785m();

        /* renamed from: a */
        private final int f17433a;

        /* renamed from: b */
        private final String[] f17434b;

        /* renamed from: c */
        private final String[] f17435c;

        /* renamed from: d */
        private final String[] f17436d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Inclusion(int i, String[] strArr, String[] strArr2, String[] strArr3) {
            this.f17433a = i;
            this.f17434b = strArr;
            this.f17435c = strArr2;
            this.f17436d = strArr3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m22849a() {
            return this.f17433a;
        }

        /* renamed from: b */
        public String[] m22848b() {
            return this.f17434b;
        }

        /* renamed from: c */
        public String[] m22847c() {
            return this.f17435c;
        }

        /* renamed from: d */
        public String[] m22846d() {
            return this.f17436d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inclusion)) {
                return false;
            }
            Inclusion inclusion = (Inclusion) obj;
            return Arrays.equals(m22848b(), inclusion.m22848b()) && Arrays.equals(m22847c(), inclusion.m22847c()) && Arrays.equals(m22846d(), inclusion.m22846d());
        }

        public int hashCode() {
            return Arrays.hashCode(this.f17434b) + Arrays.hashCode(this.f17435c) + Arrays.hashCode(this.f17436d);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C4785m.m22765a(this, parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyFilterImpl(int i, ArrayList<Inclusion> arrayList) {
        this.f17431a = i;
        this.f17432b = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m22851a() {
        return this.f17431a;
    }

    /* renamed from: b */
    public ArrayList<Inclusion> m22850b() {
        return this.f17432b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyFilterImpl) {
            return m22850b().equals(((KeyFilterImpl) obj).m22850b());
        }
        return false;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17432b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4784l.m22768a(this, parcel, i);
    }
}
