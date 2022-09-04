package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.places.AbstractC8237a;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class AutocompletePredictionEntity extends AbstractSafeParcelable implements AbstractC8237a {
    public static final Parcelable.Creator<AutocompletePredictionEntity> CREATOR = new C8249a();

    /* renamed from: k */
    private static final List<SubstringEntity> f27051k = Collections.emptyList();

    /* renamed from: a */
    final int f27052a;

    /* renamed from: b */
    final String f27053b;

    /* renamed from: c */
    final String f27054c;

    /* renamed from: d */
    final List<Integer> f27055d;

    /* renamed from: e */
    final List<SubstringEntity> f27056e;

    /* renamed from: f */
    final int f27057f;

    /* renamed from: g */
    final String f27058g;

    /* renamed from: h */
    final List<SubstringEntity> f27059h;

    /* renamed from: i */
    final String f27060i;

    /* renamed from: j */
    final List<SubstringEntity> f27061j;

    /* loaded from: classes2.dex */
    public static class SubstringEntity extends AbstractSafeParcelable {
        public static final Parcelable.Creator<SubstringEntity> CREATOR = new C8288u();

        /* renamed from: a */
        final int f27062a;

        /* renamed from: b */
        final int f27063b;

        /* renamed from: c */
        final int f27064c;

        public SubstringEntity(int i, int i2, int i3) {
            this.f27062a = i;
            this.f27063b = i2;
            this.f27064c = i3;
        }

        /* renamed from: a */
        public int m12314a() {
            return this.f27063b;
        }

        /* renamed from: b */
        public int m12313b() {
            return this.f27064c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubstringEntity)) {
                return false;
            }
            SubstringEntity substringEntity = (SubstringEntity) obj;
            return C4585c.m23634a(Integer.valueOf(this.f27063b), Integer.valueOf(substringEntity.f27063b)) && C4585c.m23634a(Integer.valueOf(this.f27064c), Integer.valueOf(substringEntity.f27064c));
        }

        public int hashCode() {
            return C4585c.m23633a(Integer.valueOf(this.f27063b), Integer.valueOf(this.f27064c));
        }

        public String toString() {
            return C4585c.m23635a(this).m23632a("offset", Integer.valueOf(this.f27063b)).m23632a("length", Integer.valueOf(this.f27064c)).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8288u.m12151a(this, parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutocompletePredictionEntity(int i, String str, List<Integer> list, int i2, String str2, List<SubstringEntity> list2, String str3, List<SubstringEntity> list3, String str4, List<SubstringEntity> list4) {
        this.f27052a = i;
        this.f27054c = str;
        this.f27055d = list;
        this.f27057f = i2;
        this.f27053b = str2;
        this.f27056e = list2;
        this.f27058g = str3;
        this.f27059h = list3;
        this.f27060i = str4;
        this.f27061j = list4;
    }

    /* renamed from: a */
    public static AutocompletePredictionEntity m12316a(String str, List<Integer> list, int i, String str2, List<SubstringEntity> list2, String str3, List<SubstringEntity> list3, String str4, List<SubstringEntity> list4) {
        return new AutocompletePredictionEntity(0, str, list, i, (String) C4588d.m23627a(str2), list2, str3, list3, str4, list4);
    }

    @Override // com.google.android.gms.location.places.AbstractC8237a
    /* renamed from: a */
    public CharSequence mo12277a(@Nullable CharacterStyle characterStyle) {
        return C8251c.m12264a(this.f27053b, this.f27056e, characterStyle);
    }

    @Override // com.google.android.gms.location.places.AbstractC8237a
    /* renamed from: b */
    public CharSequence mo12276b(@Nullable CharacterStyle characterStyle) {
        return C8251c.m12264a(this.f27058g, this.f27059h, characterStyle);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.location.places.AbstractC8237a
    /* renamed from: c */
    public CharSequence mo12274c(@Nullable CharacterStyle characterStyle) {
        return C8251c.m12264a(this.f27060i, this.f27061j, characterStyle);
    }

    @Override // com.google.android.gms.location.places.AbstractC8237a
    @Nullable
    /* renamed from: c */
    public String mo12275c() {
        return this.f27054c;
    }

    @Override // com.google.android.gms.location.places.AbstractC8237a
    /* renamed from: d */
    public List<Integer> mo12273d() {
        return this.f27055d;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: e */
    public AbstractC8237a mo7785a() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocompletePredictionEntity)) {
            return false;
        }
        AutocompletePredictionEntity autocompletePredictionEntity = (AutocompletePredictionEntity) obj;
        return C4585c.m23634a(this.f27054c, autocompletePredictionEntity.f27054c) && C4585c.m23634a(this.f27055d, autocompletePredictionEntity.f27055d) && C4585c.m23634a(Integer.valueOf(this.f27057f), Integer.valueOf(autocompletePredictionEntity.f27057f)) && C4585c.m23634a(this.f27053b, autocompletePredictionEntity.f27053b) && C4585c.m23634a(this.f27056e, autocompletePredictionEntity.f27056e) && C4585c.m23634a(this.f27058g, autocompletePredictionEntity.f27058g) && C4585c.m23634a(this.f27059h, autocompletePredictionEntity.f27059h) && C4585c.m23634a(this.f27060i, autocompletePredictionEntity.f27060i) && C4585c.m23634a(this.f27061j, autocompletePredictionEntity.f27061j);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f27054c, this.f27055d, Integer.valueOf(this.f27057f), this.f27053b, this.f27056e, this.f27058g, this.f27059h, this.f27060i, this.f27061j);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("placeId", this.f27054c).m23632a("placeTypes", this.f27055d).m23632a("fullText", this.f27053b).m23632a("fullTextMatchedSubstrings", this.f27056e).m23632a("primaryText", this.f27058g).m23632a("primaryTextMatchedSubstrings", this.f27059h).m23632a("secondaryText", this.f27060i).m23632a("secondaryTextMatchedSubstrings", this.f27061j).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8249a.m12278a(this, parcel, i);
    }
}
