package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class ProxyRequest extends AbstractSafeParcelable {

    /* renamed from: a */
    public static final int f15473a = 2;

    /* renamed from: k */
    final int f15483k;

    /* renamed from: l */
    public final String f15484l;

    /* renamed from: m */
    public final int f15485m;

    /* renamed from: n */
    public final long f15486n;

    /* renamed from: o */
    public final byte[] f15487o;

    /* renamed from: p */
    Bundle f15488p;
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new C4039d();

    /* renamed from: b */
    public static final int f15474b = 0;

    /* renamed from: c */
    public static final int f15475c = 1;

    /* renamed from: d */
    public static final int f15476d = 2;

    /* renamed from: e */
    public static final int f15477e = 3;

    /* renamed from: f */
    public static final int f15478f = 4;

    /* renamed from: g */
    public static final int f15479g = 5;

    /* renamed from: h */
    public static final int f15480h = 6;

    /* renamed from: i */
    public static final int f15481i = 7;

    /* renamed from: j */
    public static final int f15482j = 7;

    /* renamed from: com.google.android.gms.auth.api.proxy.ProxyRequest$a */
    /* loaded from: classes2.dex */
    public static class C4034a {

        /* renamed from: a */
        private String f15489a;

        /* renamed from: b */
        private int f15490b = ProxyRequest.f15474b;

        /* renamed from: c */
        private long f15491c = 3000;

        /* renamed from: d */
        private byte[] f15492d = null;

        /* renamed from: e */
        private Bundle f15493e = new Bundle();

        public C4034a(String str) {
            C4588d.m23625a(str);
            if (Patterns.WEB_URL.matcher(str).matches()) {
                this.f15489a = str;
                return;
            }
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 51).append("The supplied url [ ").append(str).append("] is not match Patterns.WEB_URL!").toString());
        }

        /* renamed from: a */
        public C4034a m25705a(int i) {
            C4588d.m23618b(i >= 0 && i <= ProxyRequest.f15482j, "Unrecognized http method code.");
            this.f15490b = i;
            return this;
        }

        /* renamed from: a */
        public C4034a m25704a(long j) {
            C4588d.m23618b(j >= 0, "The specified timeout must be non-negative.");
            this.f15491c = j;
            return this;
        }

        /* renamed from: a */
        public C4034a m25703a(String str, String str2) {
            C4588d.m23624a(str, (Object) "Header name cannot be null or empty!");
            Bundle bundle = this.f15493e;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(str, str2);
            return this;
        }

        /* renamed from: a */
        public C4034a m25702a(byte[] bArr) {
            this.f15492d = bArr;
            return this;
        }

        /* renamed from: a */
        public ProxyRequest m25706a() {
            if (this.f15492d == null) {
                this.f15492d = new byte[0];
            }
            return new ProxyRequest(2, this.f15489a, this.f15490b, this.f15491c, this.f15492d, this.f15493e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.f15483k = i;
        this.f15484l = str;
        this.f15485m = i2;
        this.f15486n = j;
        this.f15487o = bArr;
        this.f15488p = bundle;
    }

    /* renamed from: a */
    public Map<String, String> m25707a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f15488p.size());
        for (String str : this.f15488p.keySet()) {
            linkedHashMap.put(str, this.f15488p.getString(str));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public String toString() {
        String str = this.f15484l;
        return new StringBuilder(String.valueOf(str).length() + 42).append("ProxyRequest[ url: ").append(str).append(", method: ").append(this.f15485m).append(" ]").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4039d.m25692a(this, parcel, i);
    }
}
