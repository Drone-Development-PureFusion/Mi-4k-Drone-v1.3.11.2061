package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.internal.C4013b;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new C4006d();

    /* renamed from: a */
    public static final String f15372a = "com.google.android.gms.credentials.Credential";

    /* renamed from: b */
    final int f15373b;

    /* renamed from: c */
    private final String f15374c;
    @Nullable

    /* renamed from: d */
    private final String f15375d;
    @Nullable

    /* renamed from: e */
    private final Uri f15376e;

    /* renamed from: f */
    private final List<IdToken> f15377f;
    @Nullable

    /* renamed from: g */
    private final String f15378g;
    @Nullable

    /* renamed from: h */
    private final String f15379h;
    @Nullable

    /* renamed from: i */
    private final String f15380i;
    @Nullable

    /* renamed from: j */
    private final String f15381j;

    /* renamed from: com.google.android.gms.auth.api.credentials.Credential$a */
    /* loaded from: classes2.dex */
    public static class C3993a {

        /* renamed from: a */
        private final String f15382a;

        /* renamed from: b */
        private String f15383b;

        /* renamed from: c */
        private Uri f15384c;

        /* renamed from: d */
        private List<IdToken> f15385d;

        /* renamed from: e */
        private String f15386e;

        /* renamed from: f */
        private String f15387f;

        /* renamed from: g */
        private String f15388g;

        /* renamed from: h */
        private String f15389h;

        public C3993a(Credential credential) {
            this.f15382a = credential.f15374c;
            this.f15383b = credential.f15375d;
            this.f15384c = credential.f15376e;
            this.f15385d = credential.f15377f;
            this.f15386e = credential.f15378g;
            this.f15387f = credential.f15379h;
            this.f15388g = credential.f15380i;
            this.f15389h = credential.f15381j;
        }

        public C3993a(String str) {
            this.f15382a = str;
        }

        /* renamed from: a */
        public C3993a m25825a(Uri uri) {
            this.f15384c = uri;
            return this;
        }

        /* renamed from: a */
        public C3993a m25824a(String str) {
            this.f15383b = str;
            return this;
        }

        /* renamed from: a */
        public Credential m25826a() {
            return new Credential(3, this.f15382a, this.f15383b, this.f15384c, this.f15385d, this.f15386e, this.f15387f, this.f15388g, this.f15389h);
        }

        /* renamed from: b */
        public C3993a m25823b(String str) {
            this.f15386e = str;
            return this;
        }

        /* renamed from: c */
        public C3993a m25822c(String str) {
            this.f15387f = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Credential(int i, String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6) {
        this.f15373b = i;
        String trim = ((String) C4588d.m23626a(str, (Object) "credential identifier cannot be null")).trim();
        C4588d.m23624a(trim, (Object) "credential identifier cannot be empty");
        this.f15374c = trim;
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f15375d = str2;
        this.f15376e = uri;
        this.f15377f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f15378g = str3;
        if (str3 == null || !str3.isEmpty()) {
            if (!TextUtils.isEmpty(str4)) {
                C4013b.m25744a(str4);
            }
            this.f15379h = str4;
            this.f15380i = str5;
            this.f15381j = str6;
            if (!TextUtils.isEmpty(this.f15378g) && !TextUtils.isEmpty(this.f15379h)) {
                throw new IllegalStateException("password and accountType cannot both be set");
            }
            return;
        }
        throw new IllegalArgumentException("password cannot be empty");
    }

    /* renamed from: a */
    public String m25842a() {
        return this.f15374c;
    }

    @Nullable
    /* renamed from: b */
    public String m25840b() {
        return this.f15375d;
    }

    @Nullable
    /* renamed from: c */
    public Uri m25838c() {
        return this.f15376e;
    }

    /* renamed from: d */
    public List<IdToken> m25836d() {
        return this.f15377f;
    }

    @Nullable
    /* renamed from: e */
    public String m25834e() {
        return this.f15378g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f15374c, credential.f15374c) && TextUtils.equals(this.f15375d, credential.f15375d) && C4585c.m23634a(this.f15376e, credential.f15376e) && TextUtils.equals(this.f15378g, credential.f15378g) && TextUtils.equals(this.f15379h, credential.f15379h) && TextUtils.equals(this.f15380i, credential.f15380i);
    }

    @Nullable
    /* renamed from: f */
    public String m25832f() {
        return this.f15380i;
    }

    @Nullable
    /* renamed from: g */
    public String m25830g() {
        return this.f15379h;
    }

    /* renamed from: h */
    public String m25828h() {
        return this.f15381j;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f15374c, this.f15375d, this.f15376e, this.f15378g, this.f15379h, this.f15380i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4006d.m25763a(this, parcel, i);
    }
}
