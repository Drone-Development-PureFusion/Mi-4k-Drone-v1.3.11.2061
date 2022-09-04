package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C4062d;
import com.google.android.gms.common.C4538f;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements C4467a.AbstractC4468a.AbstractC4472d, ReflectedParcelable {

    /* renamed from: e */
    final int f15527e;

    /* renamed from: f */
    private final ArrayList<Scope> f15528f;

    /* renamed from: g */
    private Account f15529g;

    /* renamed from: h */
    private boolean f15530h;

    /* renamed from: i */
    private final boolean f15531i;

    /* renamed from: j */
    private final boolean f15532j;

    /* renamed from: k */
    private String f15533k;

    /* renamed from: l */
    private String f15534l;

    /* renamed from: a */
    public static final Scope f15522a = new Scope(C4538f.f16921a);

    /* renamed from: b */
    public static final Scope f15523b = new Scope(C4538f.f16922b);

    /* renamed from: c */
    public static final Scope f15524c = new Scope("openid");

    /* renamed from: d */
    public static final GoogleSignInOptions f15525d = new C4043a().m25650a().m25644c().m25642d();
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C4048e();

    /* renamed from: m */
    private static Comparator<Scope> f15526m = new Comparator<Scope>() { // from class: com.google.android.gms.auth.api.signin.GoogleSignInOptions.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Scope scope, Scope scope2) {
            return scope.m24024a().compareTo(scope2.m24024a());
        }
    };

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* loaded from: classes2.dex */
    public static final class C4043a {

        /* renamed from: a */
        private Set<Scope> f15535a;

        /* renamed from: b */
        private boolean f15536b;

        /* renamed from: c */
        private boolean f15537c;

        /* renamed from: d */
        private boolean f15538d;

        /* renamed from: e */
        private String f15539e;

        /* renamed from: f */
        private Account f15540f;

        /* renamed from: g */
        private String f15541g;

        public C4043a() {
            this.f15535a = new HashSet();
        }

        public C4043a(@NonNull GoogleSignInOptions googleSignInOptions) {
            this.f15535a = new HashSet();
            C4588d.m23627a(googleSignInOptions);
            this.f15535a = new HashSet(googleSignInOptions.f15528f);
            this.f15536b = googleSignInOptions.f15531i;
            this.f15537c = googleSignInOptions.f15532j;
            this.f15538d = googleSignInOptions.f15530h;
            this.f15539e = googleSignInOptions.f15533k;
            this.f15540f = googleSignInOptions.f15529g;
            this.f15541g = googleSignInOptions.f15534l;
        }

        /* renamed from: e */
        private String m25640e(String str) {
            C4588d.m23625a(str);
            C4588d.m23618b(this.f15539e == null || this.f15539e.equals(str), "two different server client ids provided");
            return str;
        }

        /* renamed from: a */
        public C4043a m25650a() {
            this.f15535a.add(GoogleSignInOptions.f15524c);
            return this;
        }

        /* renamed from: a */
        public C4043a m25649a(Scope scope, Scope... scopeArr) {
            this.f15535a.add(scope);
            this.f15535a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: a */
        public C4043a m25648a(String str) {
            this.f15538d = true;
            this.f15539e = m25640e(str);
            return this;
        }

        /* renamed from: a */
        public C4043a m25647a(String str, boolean z) {
            this.f15536b = true;
            this.f15539e = m25640e(str);
            this.f15537c = z;
            return this;
        }

        /* renamed from: b */
        public C4043a m25646b() {
            this.f15535a.add(GoogleSignInOptions.f15523b);
            return this;
        }

        /* renamed from: b */
        public C4043a m25645b(String str) {
            return m25647a(str, false);
        }

        /* renamed from: c */
        public C4043a m25644c() {
            this.f15535a.add(GoogleSignInOptions.f15522a);
            return this;
        }

        /* renamed from: c */
        public C4043a m25643c(String str) {
            this.f15540f = new Account(C4588d.m23625a(str), "com.google");
            return this;
        }

        /* renamed from: d */
        public C4043a m25641d(String str) {
            this.f15541g = C4588d.m23625a(str);
            return this;
        }

        /* renamed from: d */
        public GoogleSignInOptions m25642d() {
            if (this.f15538d && (this.f15540f == null || !this.f15535a.isEmpty())) {
                m25650a();
            }
            return new GoogleSignInOptions(this.f15535a, this.f15540f, this.f15538d, this.f15536b, this.f15537c, this.f15539e, this.f15541g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2) {
        this.f15527e = i;
        this.f15528f = arrayList;
        this.f15529g = account;
        this.f15530h = z;
        this.f15531i = z2;
        this.f15532j = z3;
        this.f15533k = str;
        this.f15534l = str2;
    }

    private GoogleSignInOptions(Set<Scope> set, Account account, boolean z, boolean z2, boolean z3, String str, String str2) {
        this(2, new ArrayList(set), account, z, z2, z3, str, str2);
    }

    @Nullable
    /* renamed from: a */
    public static GoogleSignInOptions m25667a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(hashSet, !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null));
    }

    /* renamed from: j */
    private JSONObject m25652j() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f15528f, f15526m);
            Iterator<Scope> it2 = this.f15528f.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().m24024a());
            }
            jSONObject.put("scopes", jSONArray);
            if (this.f15529g != null) {
                jSONObject.put("accountName", this.f15529g.name);
            }
            jSONObject.put("idTokenRequested", this.f15530h);
            jSONObject.put("forceCodeForRefreshToken", this.f15532j);
            jSONObject.put("serverAuthRequested", this.f15531i);
            if (!TextUtils.isEmpty(this.f15533k)) {
                jSONObject.put("serverClientId", this.f15533k);
            }
            if (!TextUtils.isEmpty(this.f15534l)) {
                jSONObject.put("hostedDomain", this.f15534l);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public ArrayList<Scope> m25669a() {
        return new ArrayList<>(this.f15528f);
    }

    /* renamed from: b */
    public Scope[] m25666b() {
        return (Scope[]) this.f15528f.toArray(new Scope[this.f15528f.size()]);
    }

    /* renamed from: c */
    public Account m25664c() {
        return this.f15529g;
    }

    /* renamed from: d */
    public boolean m25662d() {
        return this.f15530h;
    }

    /* renamed from: e */
    public boolean m25660e() {
        return this.f15531i;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f15528f.size() != googleSignInOptions.m25669a().size() || !this.f15528f.containsAll(googleSignInOptions.m25669a())) {
                return false;
            }
            if (this.f15529g == null) {
                if (googleSignInOptions.m25664c() != null) {
                    return false;
                }
            } else if (!this.f15529g.equals(googleSignInOptions.m25664c())) {
                return false;
            }
            if (TextUtils.isEmpty(this.f15533k)) {
                if (!TextUtils.isEmpty(googleSignInOptions.m25656g())) {
                    return false;
                }
            } else if (!this.f15533k.equals(googleSignInOptions.m25656g())) {
                return false;
            }
            if (this.f15532j != googleSignInOptions.m25658f() || this.f15530h != googleSignInOptions.m25662d()) {
                return false;
            }
            return this.f15531i == googleSignInOptions.m25660e();
        } catch (ClassCastException e) {
            return false;
        }
    }

    /* renamed from: f */
    public boolean m25658f() {
        return this.f15532j;
    }

    /* renamed from: g */
    public String m25656g() {
        return this.f15533k;
    }

    /* renamed from: h */
    public String m25654h() {
        return this.f15534l;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        Iterator<Scope> it2 = this.f15528f.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().m24024a());
        }
        Collections.sort(arrayList);
        return new C4062d().m25599a(arrayList).m25599a(this.f15529g).m25599a(this.f15533k).m25598a(this.f15532j).m25598a(this.f15530h).m25598a(this.f15531i).m25600a();
    }

    /* renamed from: i */
    public String m25653i() {
        return m25652j().toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4048e.m25630a(this, parcel, i);
    }
}
