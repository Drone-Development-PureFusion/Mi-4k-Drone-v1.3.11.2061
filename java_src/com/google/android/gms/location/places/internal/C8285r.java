package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.AbstractC8240d;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
/* renamed from: com.google.android.gms.location.places.internal.r */
/* loaded from: classes2.dex */
public class C8285r extends AbstractC8287t implements AbstractC8240d {

    /* renamed from: bx */
    private final String f27151bx = a("place_id", "");

    public C8285r(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: s */
    private PlaceEntity m12168s() {
        PlaceEntity m12298a = new PlaceEntity.C8248a().m12285c(mo12182e().toString()).m12286b(m12167t()).m12291a(mo12184c()).m12289a(m12170q()).m12293a(mo12179h()).m12297a(m12171p()).m12287b(mo12180g().toString()).m12284d(mo12176k().toString()).m12296a(mo12174m()).m12288b(mo12175l()).m12290a(mo12183d()).m12292a(mo12178i()).m12294a(mo12177j()).m12295a(m12169r()).m12298a();
        m12298a.m12311a(mo12181f());
        return m12298a;
    }

    /* renamed from: t */
    private List<String> m12167t() {
        return b("place_attributions", Collections.emptyList());
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: c */
    public String mo12184c() {
        return this.f27151bx;
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: d */
    public List<Integer> mo12183d() {
        return a("place_types", Collections.emptyList());
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: e */
    public CharSequence mo12182e() {
        return a("place_address", "");
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: f */
    public Locale mo12181f() {
        String a = a("place_locale_language", "");
        if (!TextUtils.isEmpty(a)) {
            return new Locale(a, a("place_locale_country", ""));
        }
        String a2 = a("place_locale", "");
        return !TextUtils.isEmpty(a2) ? new Locale(a2) : Locale.getDefault();
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: g */
    public CharSequence mo12180g() {
        return a("place_name", "");
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: h */
    public LatLng mo12179h() {
        return (LatLng) a("place_lat_lng", LatLng.CREATOR);
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: i */
    public LatLngBounds mo12178i() {
        return (LatLngBounds) a("place_viewport", LatLngBounds.CREATOR);
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: j */
    public Uri mo12177j() {
        String a = a("place_website_uri", (String) null);
        if (a == null) {
            return null;
        }
        return Uri.parse(a);
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: k */
    public CharSequence mo12176k() {
        return a("place_phone_number", "");
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: l */
    public float mo12175l() {
        return a("place_rating", -1.0f);
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: m */
    public int mo12174m() {
        return a("place_price_level", -1);
    }

    @Override // com.google.android.gms.location.places.AbstractC8240d
    /* renamed from: n */
    public CharSequence mo12173n() {
        return C8251c.m12263a(m12167t());
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: o */
    public AbstractC8240d mo7785a() {
        return m12168s();
    }

    /* renamed from: p */
    public float m12171p() {
        return a("place_level_number", 0.0f);
    }

    /* renamed from: q */
    public boolean m12170q() {
        return a("place_is_permanently_closed", false);
    }

    /* renamed from: r */
    public long m12169r() {
        return a("place_timestamp_secs", 0L);
    }
}
