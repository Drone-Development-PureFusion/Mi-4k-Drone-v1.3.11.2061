package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.C4538f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C4047d();

    /* renamed from: a */
    public static AbstractC4682e f15508a = C4685h.m23138d();

    /* renamed from: n */
    private static Comparator<Scope> f15509n = new Comparator<Scope>() { // from class: com.google.android.gms.auth.api.signin.GoogleSignInAccount.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Scope scope, Scope scope2) {
            return scope.m24024a().compareTo(scope2.m24024a());
        }
    };

    /* renamed from: b */
    final int f15510b;

    /* renamed from: c */
    List<Scope> f15511c;

    /* renamed from: d */
    private String f15512d;

    /* renamed from: e */
    private String f15513e;

    /* renamed from: f */
    private String f15514f;

    /* renamed from: g */
    private String f15515g;

    /* renamed from: h */
    private Uri f15516h;

    /* renamed from: i */
    private String f15517i;

    /* renamed from: j */
    private long f15518j;

    /* renamed from: k */
    private String f15519k;

    /* renamed from: l */
    private String f15520l;

    /* renamed from: m */
    private String f15521m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f15510b = i;
        this.f15512d = str;
        this.f15513e = str2;
        this.f15514f = str3;
        this.f15515g = str4;
        this.f15516h = uri;
        this.f15517i = str5;
        this.f15518j = j;
        this.f15519k = str6;
        this.f15511c = list;
        this.f15520l = str7;
        this.f15521m = str8;
    }

    @Nullable
    /* renamed from: a */
    public static GoogleSignInAccount m25687a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        return m25686a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString(C4538f.f16922b, null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet).m25684b(jSONObject.optString("serverAuthCode", null));
    }

    /* renamed from: a */
    public static GoogleSignInAccount m25686a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Uri uri, @Nullable Long l, @NonNull String str7, @NonNull Set<Scope> set) {
        if (l == null) {
            l = Long.valueOf(f15508a.mo16434a() / 1000);
        }
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), C4588d.m23625a(str7), new ArrayList((Collection) C4588d.m23627a(set)), str5, str6);
    }

    /* renamed from: o */
    private JSONObject m25671o() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m25688a() != null) {
                jSONObject.put("id", m25688a());
            }
            if (m25685b() != null) {
                jSONObject.put("tokenId", m25685b());
            }
            if (m25683c() != null) {
                jSONObject.put(C4538f.f16922b, m25683c());
            }
            if (m25682d() != null) {
                jSONObject.put("displayName", m25682d());
            }
            if (m25681e() != null) {
                jSONObject.put("givenName", m25681e());
            }
            if (m25680f() != null) {
                jSONObject.put("familyName", m25680f());
            }
            if (m25679g() != null) {
                jSONObject.put("photoUrl", m25679g().toString());
            }
            if (m25678h() != null) {
                jSONObject.put("serverAuthCode", m25678h());
            }
            jSONObject.put("expirationTime", this.f15518j);
            jSONObject.put("obfuscatedIdentifier", m25675k());
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f15511c, f15509n);
            for (Scope scope : this.f15511c) {
                jSONArray.put(scope.m24024a());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    /* renamed from: a */
    public String m25688a() {
        return this.f15512d;
    }

    /* renamed from: b */
    public GoogleSignInAccount m25684b(String str) {
        this.f15517i = str;
        return this;
    }

    @Nullable
    /* renamed from: b */
    public String m25685b() {
        return this.f15513e;
    }

    @Nullable
    /* renamed from: c */
    public String m25683c() {
        return this.f15514f;
    }

    @Nullable
    /* renamed from: d */
    public String m25682d() {
        return this.f15515g;
    }

    @Nullable
    /* renamed from: e */
    public String m25681e() {
        return this.f15520l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        return ((GoogleSignInAccount) obj).m25673m().equals(m25673m());
    }

    @Nullable
    /* renamed from: f */
    public String m25680f() {
        return this.f15521m;
    }

    @Nullable
    /* renamed from: g */
    public Uri m25679g() {
        return this.f15516h;
    }

    @Nullable
    /* renamed from: h */
    public String m25678h() {
        return this.f15517i;
    }

    public int hashCode() {
        return m25673m().hashCode();
    }

    /* renamed from: i */
    public long m25677i() {
        return this.f15518j;
    }

    /* renamed from: j */
    public boolean m25676j() {
        return f15508a.mo16434a() / 1000 >= this.f15518j - 300;
    }

    @NonNull
    /* renamed from: k */
    public String m25675k() {
        return this.f15519k;
    }

    @NonNull
    /* renamed from: l */
    public Set<Scope> m25674l() {
        return new HashSet(this.f15511c);
    }

    /* renamed from: m */
    public String m25673m() {
        return m25671o().toString();
    }

    /* renamed from: n */
    public String m25672n() {
        JSONObject m25671o = m25671o();
        m25671o.remove("serverAuthCode");
        return m25671o.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4047d.m25633a(this, parcel, i);
    }
}
