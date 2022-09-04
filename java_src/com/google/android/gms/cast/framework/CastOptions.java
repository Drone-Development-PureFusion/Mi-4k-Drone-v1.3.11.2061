package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.p253b.C9755a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class CastOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CastOptions> CREATOR = new C4350o();

    /* renamed from: a */
    private final int f16117a;

    /* renamed from: b */
    private final String f16118b;

    /* renamed from: c */
    private final List<String> f16119c;

    /* renamed from: d */
    private final boolean f16120d;

    /* renamed from: e */
    private final LaunchOptions f16121e;

    /* renamed from: f */
    private final boolean f16122f;

    /* renamed from: g */
    private final CastMediaOptions f16123g;

    /* renamed from: h */
    private final boolean f16124h;

    /* renamed from: i */
    private final double f16125i;

    /* renamed from: com.google.android.gms.cast.framework.CastOptions$a */
    /* loaded from: classes2.dex */
    public static final class C4236a {

        /* renamed from: a */
        private String f16126a;

        /* renamed from: c */
        private boolean f16128c;

        /* renamed from: b */
        private List<String> f16127b = new ArrayList();

        /* renamed from: d */
        private LaunchOptions f16129d = new LaunchOptions();

        /* renamed from: e */
        private boolean f16130e = true;

        /* renamed from: f */
        private CastMediaOptions f16131f = new CastMediaOptions.C4287a().m24697a();

        /* renamed from: g */
        private boolean f16132g = true;

        /* renamed from: h */
        private double f16133h = 0.05000000074505806d;

        /* renamed from: a */
        public C4236a m24903a(double d) {
            if (d <= C9755a.f30449c || d > 0.5d) {
                throw new IllegalArgumentException("volumeDelta must be greater than 0 and less or equal to 0.5");
            }
            this.f16133h = d;
            return this;
        }

        /* renamed from: a */
        public C4236a m24902a(LaunchOptions launchOptions) {
            this.f16129d = launchOptions;
            return this;
        }

        /* renamed from: a */
        public C4236a m24901a(CastMediaOptions castMediaOptions) {
            this.f16131f = castMediaOptions;
            return this;
        }

        /* renamed from: a */
        public C4236a m24900a(String str) {
            this.f16126a = str;
            return this;
        }

        /* renamed from: a */
        public C4236a m24899a(List<String> list) {
            this.f16127b = list;
            return this;
        }

        /* renamed from: a */
        public C4236a m24898a(boolean z) {
            this.f16128c = z;
            return this;
        }

        /* renamed from: a */
        public CastOptions m24904a() {
            return new CastOptions(1, this.f16126a, this.f16127b, this.f16128c, this.f16129d, this.f16130e, this.f16131f, this.f16132g, this.f16133h);
        }

        /* renamed from: b */
        public C4236a m24897b(boolean z) {
            this.f16130e = z;
            return this;
        }

        /* renamed from: c */
        public C4236a m24896c(boolean z) {
            this.f16132g = z;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CastOptions(int i, String str, List<String> list, boolean z, LaunchOptions launchOptions, boolean z2, CastMediaOptions castMediaOptions, boolean z3, double d) {
        this.f16117a = i;
        this.f16118b = TextUtils.isEmpty(str) ? "" : str;
        int size = list == null ? 0 : list.size();
        this.f16119c = new ArrayList(size);
        if (size > 0) {
            this.f16119c.addAll(list);
        }
        this.f16120d = z;
        this.f16121e = launchOptions == null ? new LaunchOptions() : launchOptions;
        this.f16122f = z2;
        this.f16123g = castMediaOptions;
        this.f16124h = z3;
        this.f16125i = d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m24913a() {
        return this.f16117a;
    }

    /* renamed from: b */
    public String m24912b() {
        return this.f16118b;
    }

    /* renamed from: c */
    public List<String> m24911c() {
        return Collections.unmodifiableList(this.f16119c);
    }

    /* renamed from: d */
    public boolean m24910d() {
        return this.f16120d;
    }

    /* renamed from: e */
    public LaunchOptions m24909e() {
        return this.f16121e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastOptions)) {
            return false;
        }
        CastOptions castOptions = (CastOptions) obj;
        return C4430f.m24206a(this.f16118b, castOptions.f16118b) && C4430f.m24206a(this.f16119c, castOptions.f16119c) && this.f16120d == castOptions.f16120d && C4430f.m24206a(this.f16121e, castOptions.f16121e) && this.f16122f == castOptions.f16122f && C4430f.m24206a(this.f16123g, castOptions.f16123g) && this.f16124h == castOptions.m24906h() && this.f16125i == castOptions.m24905i();
    }

    /* renamed from: f */
    public boolean m24908f() {
        return this.f16122f;
    }

    /* renamed from: g */
    public CastMediaOptions m24907g() {
        return this.f16123g;
    }

    /* renamed from: h */
    public boolean m24906h() {
        return this.f16124h;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f16118b, this.f16119c, Boolean.valueOf(this.f16120d), this.f16121e, Boolean.valueOf(this.f16122f), this.f16123g, Boolean.valueOf(this.f16124h), Double.valueOf(this.f16125i));
    }

    /* renamed from: i */
    public double m24905i() {
        return this.f16125i;
    }

    public String toString() {
        return "CastOptions(" + String.format("receiverApplicationId=%s", this.f16118b) + ", " + String.format("supportedNamespaces=%s", this.f16119c) + ", " + String.format("stopReceiverApplicationWhenEndingSession=%b", Boolean.valueOf(this.f16120d)) + ", " + String.format("launchOptions=%s", this.f16121e) + ", " + String.format("resumeSavedSession=%s", Boolean.valueOf(this.f16122f)) + ", " + String.format("castMediaOptions=%s", this.f16123g) + ", " + String.format("enableReconnectionService=%s", Boolean.valueOf(this.f16124h)) + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4350o.m24422a(this, parcel, i);
    }
}
