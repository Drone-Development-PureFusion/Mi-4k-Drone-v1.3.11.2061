package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new C4446j();

    /* renamed from: a */
    public static final int f15785a = 1;

    /* renamed from: b */
    public static final int f15786b = 2;

    /* renamed from: c */
    public static final int f15787c = 4;

    /* renamed from: d */
    public static final int f15788d = 8;

    /* renamed from: e */
    public static final int f15789e = 32;

    /* renamed from: f */
    String f15790f;

    /* renamed from: g */
    private final int f15791g;

    /* renamed from: h */
    private String f15792h;

    /* renamed from: i */
    private Inet4Address f15793i;

    /* renamed from: j */
    private String f15794j;

    /* renamed from: k */
    private String f15795k;

    /* renamed from: l */
    private String f15796l;

    /* renamed from: m */
    private int f15797m;

    /* renamed from: n */
    private List<WebImage> f15798n;

    /* renamed from: o */
    private int f15799o;

    /* renamed from: p */
    private int f15800p;

    /* renamed from: q */
    private String f15801q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CastDevice(int i, String str, String str2, String str3, String str4, String str5, int i2, List<WebImage> list, int i3, int i4, String str6) {
        this.f15791g = i;
        this.f15792h = m25246a(str);
        this.f15790f = m25246a(str2);
        if (!TextUtils.isEmpty(this.f15790f)) {
            try {
                InetAddress byName = InetAddress.getByName(this.f15790f);
                if (byName instanceof Inet4Address) {
                    this.f15793i = (Inet4Address) byName;
                }
            } catch (UnknownHostException e) {
                String str7 = this.f15790f;
                String valueOf = String.valueOf(e.getMessage());
                Log.i("CastDevice", new StringBuilder(String.valueOf(str7).length() + 48 + String.valueOf(valueOf).length()).append("Unable to convert host address (").append(str7).append(") to ipaddress: ").append(valueOf).toString());
            }
        }
        this.f15794j = m25246a(str3);
        this.f15795k = m25246a(str4);
        this.f15796l = m25246a(str5);
        this.f15797m = i2;
        this.f15798n = list == null ? new ArrayList<>() : list;
        this.f15799o = i3;
        this.f15800p = i4;
        this.f15801q = m25246a(str6);
    }

    /* renamed from: a */
    private static String m25246a(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: b */
    public static CastDevice m25243b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    /* renamed from: a */
    public int m25251a() {
        return this.f15791g;
    }

    /* renamed from: a */
    public WebImage m25249a(int i, int i2) {
        WebImage webImage;
        WebImage webImage2 = null;
        if (this.f15798n.isEmpty()) {
            return null;
        }
        if (i <= 0 || i2 <= 0) {
            return this.f15798n.get(0);
        }
        WebImage webImage3 = null;
        for (WebImage webImage4 : this.f15798n) {
            int m23762c = webImage4.m23762c();
            int m23761d = webImage4.m23761d();
            if (m23762c < i || m23761d < i2) {
                if (m23762c < i && m23761d < i2 && (webImage2 == null || (webImage2.m23762c() < m23762c && webImage2.m23761d() < m23761d))) {
                    webImage = webImage3;
                    webImage3 = webImage;
                    webImage2 = webImage4;
                }
                webImage4 = webImage2;
                webImage = webImage3;
                webImage3 = webImage;
                webImage2 = webImage4;
            } else {
                if (webImage3 == null || (webImage3.m23762c() > m23762c && webImage3.m23761d() > m23761d)) {
                    WebImage webImage5 = webImage2;
                    webImage = webImage4;
                    webImage4 = webImage5;
                    webImage3 = webImage;
                    webImage2 = webImage4;
                }
                webImage4 = webImage2;
                webImage = webImage3;
                webImage3 = webImage;
                webImage2 = webImage4;
            }
        }
        if (webImage3 == null) {
            webImage3 = webImage2 != null ? webImage2 : this.f15798n.get(0);
        }
        return webImage3;
    }

    /* renamed from: a */
    public void m25248a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
    }

    /* renamed from: a */
    public boolean m25250a(int i) {
        return (this.f15799o & i) == i;
    }

    /* renamed from: a */
    public boolean m25247a(CastDevice castDevice) {
        if (castDevice == null) {
            return false;
        }
        return this.f15792h == null ? castDevice.f15792h == null : C4430f.m24206a(this.f15792h, castDevice.f15792h);
    }

    /* renamed from: a */
    public boolean m25245a(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (!m25250a(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public String m25244b() {
        return this.f15792h.startsWith("__cast_nearby__") ? this.f15792h.substring("__cast_nearby__".length() + 1) : this.f15792h;
    }

    /* renamed from: c */
    public String m25242c() {
        return this.f15792h;
    }

    /* renamed from: d */
    public Inet4Address m25241d() {
        return this.f15793i;
    }

    /* renamed from: e */
    public String m25240e() {
        return this.f15794j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        return this.f15792h == null ? castDevice.f15792h == null : C4430f.m24206a(this.f15792h, castDevice.f15792h) && C4430f.m24206a(this.f15793i, castDevice.f15793i) && C4430f.m24206a(this.f15795k, castDevice.f15795k) && C4430f.m24206a(this.f15794j, castDevice.f15794j) && C4430f.m24206a(this.f15796l, castDevice.f15796l) && this.f15797m == castDevice.f15797m && C4430f.m24206a(this.f15798n, castDevice.f15798n) && this.f15799o == castDevice.f15799o && this.f15800p == castDevice.f15800p && C4430f.m24206a(this.f15801q, castDevice.f15801q);
    }

    /* renamed from: f */
    public String m25239f() {
        return this.f15795k;
    }

    /* renamed from: g */
    public String m25238g() {
        return this.f15796l;
    }

    /* renamed from: h */
    public String m25237h() {
        return this.f15801q;
    }

    public int hashCode() {
        if (this.f15792h == null) {
            return 0;
        }
        return this.f15792h.hashCode();
    }

    /* renamed from: i */
    public int m25236i() {
        return this.f15797m;
    }

    /* renamed from: j */
    public List<WebImage> m25235j() {
        return Collections.unmodifiableList(this.f15798n);
    }

    /* renamed from: k */
    public boolean m25234k() {
        return !this.f15798n.isEmpty();
    }

    /* renamed from: l */
    public int m25233l() {
        return this.f15799o;
    }

    /* renamed from: m */
    public int m25232m() {
        return this.f15800p;
    }

    /* renamed from: n */
    public boolean m25231n() {
        return !this.f15792h.startsWith("__cast_nearby__");
    }

    public String toString() {
        return String.format("\"%s\" (%s)", this.f15794j, this.f15792h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4446j.m24108a(this, parcel, i);
    }
}
