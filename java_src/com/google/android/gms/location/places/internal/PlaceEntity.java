package com.google.android.gms.location.places.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.places.AbstractC8240d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class PlaceEntity extends AbstractSafeParcelable implements ReflectedParcelable, AbstractC8240d {
    public static final C8278l CREATOR = new C8278l();
    @Deprecated

    /* renamed from: bA */
    private final PlaceLocalization f27065bA;

    /* renamed from: bB */
    private final LatLng f27066bB;

    /* renamed from: bC */
    private final float f27067bC;

    /* renamed from: bD */
    private final LatLngBounds f27068bD;

    /* renamed from: bE */
    private final String f27069bE;

    /* renamed from: bF */
    private final Uri f27070bF;

    /* renamed from: bG */
    private final boolean f27071bG;

    /* renamed from: bH */
    private final float f27072bH;

    /* renamed from: bI */
    private final int f27073bI;

    /* renamed from: bJ */
    private final long f27074bJ;

    /* renamed from: bK */
    private final List<Integer> f27075bK;

    /* renamed from: bL */
    private final List<Integer> f27076bL;

    /* renamed from: bM */
    private final String f27077bM;

    /* renamed from: bN */
    private final String f27078bN;

    /* renamed from: bO */
    private final String f27079bO;

    /* renamed from: bP */
    private final String f27080bP;

    /* renamed from: bQ */
    private final List<String> f27081bQ;

    /* renamed from: bR */
    private final Map<Integer, String> f27082bR;

    /* renamed from: bS */
    private final TimeZone f27083bS;

    /* renamed from: bT */
    private Locale f27084bT;

    /* renamed from: bx */
    final int f27085bx;

    /* renamed from: by */
    private final String f27086by;

    /* renamed from: bz */
    private final Bundle f27087bz;

    /* renamed from: com.google.android.gms.location.places.internal.PlaceEntity$a */
    /* loaded from: classes2.dex */
    public static class C8248a {

        /* renamed from: a */
        private int f27088a = 0;

        /* renamed from: b */
        private String f27089b;

        /* renamed from: c */
        private String f27090c;

        /* renamed from: d */
        private LatLng f27091d;

        /* renamed from: e */
        private float f27092e;

        /* renamed from: f */
        private LatLngBounds f27093f;

        /* renamed from: g */
        private Uri f27094g;

        /* renamed from: h */
        private boolean f27095h;

        /* renamed from: i */
        private float f27096i;

        /* renamed from: j */
        private int f27097j;

        /* renamed from: k */
        private long f27098k;

        /* renamed from: l */
        private List<Integer> f27099l;

        /* renamed from: m */
        private String f27100m;

        /* renamed from: n */
        private String f27101n;

        /* renamed from: o */
        private List<String> f27102o;

        /* renamed from: a */
        public C8248a m12297a(float f) {
            this.f27092e = f;
            return this;
        }

        /* renamed from: a */
        public C8248a m12296a(int i) {
            this.f27097j = i;
            return this;
        }

        /* renamed from: a */
        public C8248a m12295a(long j) {
            this.f27098k = j;
            return this;
        }

        /* renamed from: a */
        public C8248a m12294a(Uri uri) {
            this.f27094g = uri;
            return this;
        }

        /* renamed from: a */
        public C8248a m12293a(LatLng latLng) {
            this.f27091d = latLng;
            return this;
        }

        /* renamed from: a */
        public C8248a m12292a(LatLngBounds latLngBounds) {
            this.f27093f = latLngBounds;
            return this;
        }

        /* renamed from: a */
        public C8248a m12291a(String str) {
            this.f27089b = str;
            return this;
        }

        /* renamed from: a */
        public C8248a m12290a(List<Integer> list) {
            this.f27099l = list;
            return this;
        }

        /* renamed from: a */
        public C8248a m12289a(boolean z) {
            this.f27095h = z;
            return this;
        }

        /* renamed from: a */
        public PlaceEntity m12298a() {
            return new PlaceEntity(0, this.f27089b, this.f27099l, Collections.emptyList(), null, this.f27090c, this.f27100m, this.f27101n, null, this.f27102o, this.f27091d, this.f27092e, this.f27093f, null, this.f27094g, this.f27095h, this.f27096i, this.f27097j, this.f27098k, PlaceLocalization.m12281a(this.f27090c, this.f27100m, this.f27101n, null, this.f27102o));
        }

        /* renamed from: b */
        public C8248a m12288b(float f) {
            this.f27096i = f;
            return this;
        }

        /* renamed from: b */
        public C8248a m12287b(String str) {
            this.f27090c = str;
            return this;
        }

        /* renamed from: b */
        public C8248a m12286b(List<String> list) {
            this.f27102o = list;
            return this;
        }

        /* renamed from: c */
        public C8248a m12285c(String str) {
            this.f27100m = str;
            return this;
        }

        /* renamed from: d */
        public C8248a m12284d(String str) {
            this.f27101n = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlaceEntity(int i, String str, List<Integer> list, List<Integer> list2, Bundle bundle, String str2, String str3, String str4, String str5, List<String> list3, LatLng latLng, float f, LatLngBounds latLngBounds, String str6, Uri uri, boolean z, float f2, int i2, long j, PlaceLocalization placeLocalization) {
        this.f27085bx = i;
        this.f27086by = str;
        this.f27076bL = Collections.unmodifiableList(list);
        this.f27075bK = list2;
        this.f27087bz = bundle == null ? new Bundle() : bundle;
        this.f27077bM = str2;
        this.f27078bN = str3;
        this.f27079bO = str4;
        this.f27080bP = str5;
        this.f27081bQ = list3 == null ? Collections.emptyList() : list3;
        this.f27066bB = latLng;
        this.f27067bC = f;
        this.f27068bD = latLngBounds;
        this.f27069bE = str6 == null ? "UTC" : str6;
        this.f27070bF = uri;
        this.f27071bG = z;
        this.f27072bH = f2;
        this.f27073bI = i2;
        this.f27074bJ = j;
        this.f27082bR = Collections.unmodifiableMap(new HashMap());
        this.f27083bS = null;
        this.f27084bT = null;
        this.f27065bA = placeLocalization;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: A */
    public AbstractC8240d mo7785a() {
        return this;
    }

    /* renamed from: a */
    public void m12311a(Locale locale) {
        this.f27084bT = locale;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: c */
    public String mo12184c() {
        return this.f27086by;
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: d */
    public List<Integer> mo12183d() {
        return this.f27076bL;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceEntity)) {
            return false;
        }
        PlaceEntity placeEntity = (PlaceEntity) obj;
        return this.f27086by.equals(placeEntity.f27086by) && C4585c.m23634a(this.f27084bT, placeEntity.f27084bT) && this.f27074bJ == placeEntity.f27074bJ;
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: f */
    public Locale mo12181f() {
        return this.f27084bT;
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: h */
    public LatLng mo12179h() {
        return this.f27066bB;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f27086by, this.f27084bT, Long.valueOf(this.f27074bJ));
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: i */
    public LatLngBounds mo12178i() {
        return this.f27068bD;
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: j */
    public Uri mo12177j() {
        return this.f27070bF;
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: l */
    public float mo12175l() {
        return this.f27072bH;
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: m */
    public int mo12174m() {
        return this.f27073bI;
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: n */
    public CharSequence mo12173n() {
        return C8251c.m12263a(this.f27081bQ);
    }

    /* renamed from: o */
    public List<Integer> m12310o() {
        return this.f27075bK;
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: p */
    public String mo12180g() {
        return this.f27077bM;
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: q */
    public String mo12182e() {
        return this.f27078bN;
    }

    /* renamed from: r */
    public float m12307r() {
        return this.f27067bC;
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: s */
    public String mo12176k() {
        return this.f27079bO;
    }

    /* renamed from: t */
    public String m12305t() {
        return this.f27080bP;
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return C4585c.m23635a(this).m23632a("id", this.f27086by).m23632a("placeTypes", this.f27076bL).m23632a("locale", this.f27084bT).m23632a("name", this.f27077bM).m23632a("address", this.f27078bN).m23632a("phoneNumber", this.f27079bO).m23632a("latlng", this.f27066bB).m23632a("viewport", this.f27068bD).m23632a("websiteUri", this.f27070bF).m23632a("isPermanentlyClosed", Boolean.valueOf(this.f27071bG)).m23632a("priceLevel", Integer.valueOf(this.f27073bI)).m23632a("timestampSecs", Long.valueOf(this.f27074bJ)).toString();
    }

    /* renamed from: u */
    public List<String> m12304u() {
        return this.f27081bQ;
    }

    /* renamed from: v */
    public boolean m12303v() {
        return this.f27071bG;
    }

    /* renamed from: w */
    public long m12302w() {
        return this.f27074bJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8278l.m12204a(this, parcel, i);
    }

    /* renamed from: x */
    public Bundle m12301x() {
        return this.f27087bz;
    }

    /* renamed from: y */
    public String m12300y() {
        return this.f27069bE;
    }

    @Deprecated
    /* renamed from: z */
    public PlaceLocalization m12299z() {
        return this.f27065bA;
    }
}
