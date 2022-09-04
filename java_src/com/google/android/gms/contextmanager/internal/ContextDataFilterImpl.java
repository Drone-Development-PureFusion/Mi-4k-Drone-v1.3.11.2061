package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class ContextDataFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContextDataFilterImpl> CREATOR = new C4756a();

    /* renamed from: a */
    private final int f17405a;

    /* renamed from: b */
    private final ArrayList<Inclusion> f17406b;

    /* renamed from: c */
    private final ArrayList<String> f17407c;

    /* renamed from: d */
    private final QueryFilterParameters f17408d;

    /* loaded from: classes2.dex */
    public static class Inclusion extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Inclusion> CREATOR = new C4757b();

        /* renamed from: a */
        private final int f17409a;

        /* renamed from: b */
        private final int f17410b;

        /* renamed from: c */
        private final int f17411c;

        /* renamed from: d */
        private final TimeFilterImpl f17412d;

        /* renamed from: e */
        private final KeyFilterImpl f17413e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Inclusion(int i, int i2, int i3, TimeFilterImpl timeFilterImpl, KeyFilterImpl keyFilterImpl) {
            this.f17409a = i;
            this.f17410b = i2;
            this.f17411c = i3;
            this.f17412d = timeFilterImpl;
            this.f17413e = keyFilterImpl;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m22877a() {
            return this.f17409a;
        }

        /* renamed from: b */
        public int m22876b() {
            return this.f17410b;
        }

        /* renamed from: c */
        public int m22875c() {
            return this.f17411c;
        }

        /* renamed from: d */
        public TimeFilterImpl m22874d() {
            return this.f17412d;
        }

        /* renamed from: e */
        public KeyFilterImpl m22873e() {
            return this.f17413e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inclusion)) {
                return false;
            }
            Inclusion inclusion = (Inclusion) obj;
            return this.f17410b == inclusion.m22876b() && this.f17411c == inclusion.m22875c() && this.f17412d.equals(inclusion.m22874d()) && C4585c.m23634a(this.f17413e, inclusion.m22873e());
        }

        public int hashCode() {
            return C4585c.m23633a(Integer.valueOf(this.f17410b), Integer.valueOf(this.f17411c), this.f17412d, this.f17413e);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C4757b.m22817a(this, parcel, i);
        }
    }

    public ContextDataFilterImpl(int i, ArrayList<Inclusion> arrayList, ArrayList<String> arrayList2, QueryFilterParameters queryFilterParameters) {
        this.f17405a = i;
        this.f17406b = arrayList;
        this.f17407c = arrayList2;
        this.f17408d = queryFilterParameters;
    }

    /* renamed from: a */
    public ArrayList<Inclusion> m22881a() {
        return this.f17406b;
    }

    /* renamed from: b */
    public ArrayList<String> m22880b() {
        return this.f17407c;
    }

    /* renamed from: c */
    public QueryFilterParameters m22879c() {
        return this.f17408d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m22878d() {
        return this.f17405a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextDataFilterImpl)) {
            return false;
        }
        ContextDataFilterImpl contextDataFilterImpl = (ContextDataFilterImpl) obj;
        return C4585c.m23634a(this.f17406b, contextDataFilterImpl.f17406b) && C4585c.m23634a(this.f17407c, contextDataFilterImpl.f17407c);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17406b, this.f17407c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("contexts=[");
        if (this.f17406b != null && this.f17406b.size() > 0) {
            Iterator<Inclusion> it2 = this.f17406b.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().m22875c()).append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4756a.m22820a(this, parcel, i);
    }
}
