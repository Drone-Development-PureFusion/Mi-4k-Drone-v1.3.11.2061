package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class RelationFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RelationFilterImpl> CREATOR = new C4787o();

    /* renamed from: a */
    private final int f17441a;

    /* renamed from: b */
    private final ArrayList<Inclusion> f17442b;

    /* renamed from: c */
    private final QueryFilterParameters f17443c;

    /* loaded from: classes2.dex */
    public static class Inclusion extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Inclusion> CREATOR = new C4788p();

        /* renamed from: a */
        private final int f17444a;

        /* renamed from: b */
        private final int f17445b;

        /* renamed from: c */
        private final TimeFilterImpl f17446c;

        /* renamed from: d */
        private final KeyFilterImpl f17447d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Inclusion(int i, int i2, TimeFilterImpl timeFilterImpl, KeyFilterImpl keyFilterImpl) {
            this.f17444a = i;
            this.f17445b = i2;
            this.f17446c = timeFilterImpl;
            this.f17447d = keyFilterImpl;
        }

        /* renamed from: a */
        public int m22837a() {
            return this.f17444a;
        }

        /* renamed from: b */
        public int m22836b() {
            return this.f17445b;
        }

        /* renamed from: c */
        public TimeFilterImpl m22835c() {
            return this.f17446c;
        }

        /* renamed from: d */
        public KeyFilterImpl m22834d() {
            return this.f17447d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inclusion)) {
                return false;
            }
            Inclusion inclusion = (Inclusion) obj;
            return m22836b() == inclusion.m22836b() && m22835c().equals(inclusion.m22835c()) && C4585c.m23634a(m22834d(), inclusion.m22834d());
        }

        public int hashCode() {
            return C4585c.m23633a(Integer.valueOf(this.f17445b), this.f17446c, this.f17447d);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C4788p.m22756a(this, parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RelationFilterImpl(int i, ArrayList<Inclusion> arrayList, QueryFilterParameters queryFilterParameters) {
        this.f17441a = i;
        this.f17442b = arrayList;
        this.f17443c = queryFilterParameters;
    }

    /* renamed from: a */
    public int m22840a() {
        return this.f17441a;
    }

    /* renamed from: b */
    public ArrayList<Inclusion> m22839b() {
        return this.f17442b;
    }

    /* renamed from: c */
    public QueryFilterParameters m22838c() {
        return this.f17443c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RelationFilterImpl) {
            return C4585c.m23634a(this.f17442b, ((RelationFilterImpl) obj).f17442b);
        }
        return false;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17442b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4787o.m22759a(this, parcel, i);
    }
}
