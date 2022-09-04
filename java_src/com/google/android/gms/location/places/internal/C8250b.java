package com.google.android.gms.location.places.internal;

import android.support.annotation.Nullable;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.AbstractC8237a;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.location.places.internal.b */
/* loaded from: classes2.dex */
public class C8250b extends AbstractC8287t implements AbstractC8237a {
    public C8250b(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: g */
    private String m12270g() {
        return a("ap_description", "");
    }

    /* renamed from: h */
    private String m12269h() {
        return a("ap_primary_text", "");
    }

    /* renamed from: i */
    private String m12268i() {
        return a("ap_secondary_text", "");
    }

    /* renamed from: j */
    private List<AutocompletePredictionEntity.SubstringEntity> m12267j() {
        return a("ap_matched_subscriptions", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
    }

    /* renamed from: k */
    private List<AutocompletePredictionEntity.SubstringEntity> m12266k() {
        return a("ap_primary_text_matched", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
    }

    /* renamed from: l */
    private List<AutocompletePredictionEntity.SubstringEntity> m12265l() {
        return a("ap_secondary_text_matched", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
    }

    @Override // com.google.android.gms.location.places.AbstractC8237a
    /* renamed from: a */
    public CharSequence mo12277a(@Nullable CharacterStyle characterStyle) {
        return C8251c.m12264a(m12270g(), m12267j(), characterStyle);
    }

    @Override // com.google.android.gms.location.places.AbstractC8237a
    /* renamed from: b */
    public CharSequence mo12276b(@Nullable CharacterStyle characterStyle) {
        return C8251c.m12264a(m12269h(), m12266k(), characterStyle);
    }

    @Override // com.google.android.gms.location.places.AbstractC8237a
    /* renamed from: c */
    public CharSequence mo12274c(@Nullable CharacterStyle characterStyle) {
        return C8251c.m12264a(m12268i(), m12265l(), characterStyle);
    }

    @Override // com.google.android.gms.location.places.AbstractC8237a
    /* renamed from: c */
    public String mo12275c() {
        return a("ap_place_id", (String) null);
    }

    @Override // com.google.android.gms.location.places.AbstractC8237a
    /* renamed from: d */
    public List<Integer> mo12273d() {
        return a("ap_place_types", Collections.emptyList());
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: e */
    public AbstractC8237a mo7785a() {
        return AutocompletePredictionEntity.m12316a(mo12275c(), mo12273d(), m12271f(), m12270g(), m12267j(), m12269h(), m12266k(), m12268i(), m12265l());
    }

    /* renamed from: f */
    public int m12271f() {
        return a("ap_personalization_type", 6);
    }
}
