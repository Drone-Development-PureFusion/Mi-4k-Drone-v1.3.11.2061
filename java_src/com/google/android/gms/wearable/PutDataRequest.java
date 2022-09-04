package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class PutDataRequest extends AbstractSafeParcelable {

    /* renamed from: a */
    public static final String f29800a = "wear";

    /* renamed from: b */
    final int f29803b;

    /* renamed from: e */
    private final Uri f29804e;

    /* renamed from: f */
    private final Bundle f29805f;

    /* renamed from: g */
    private byte[] f29806g;

    /* renamed from: h */
    private long f29807h;
    public static final Parcelable.Creator<PutDataRequest> CREATOR = new C9449aa();

    /* renamed from: c */
    private static final long f29801c = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: d */
    private static final Random f29802d = new SecureRandom();

    private PutDataRequest(int i, Uri uri) {
        this(i, uri, new Bundle(), null, f29801c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PutDataRequest(int i, Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.f29803b = i;
        this.f29804e = uri;
        this.f29805f = bundle;
        this.f29805f.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        this.f29806g = bArr;
        this.f29807h = j;
    }

    /* renamed from: a */
    public static PutDataRequest m8127a(Uri uri) {
        return new PutDataRequest(2, uri);
    }

    /* renamed from: a */
    public static PutDataRequest m8126a(AbstractC9466h abstractC9466h) {
        PutDataRequest m8127a = m8127a(abstractC9466h.mo7782c());
        for (Map.Entry<String, AbstractC9467i> entry : abstractC9466h.mo7780e().entrySet()) {
            if (entry.getValue().mo7794c() == null) {
                String valueOf = String.valueOf(entry.getKey());
                throw new IllegalStateException(valueOf.length() != 0 ? "Cannot create an asset for a put request without a digest: ".concat(valueOf) : new String("Cannot create an asset for a put request without a digest: "));
            }
            m8127a.m8124a(entry.getKey(), Asset.m8142a(entry.getValue().mo7794c()));
        }
        m8127a.m8122a(abstractC9466h.mo7781d());
        return m8127a;
    }

    /* renamed from: a */
    public static PutDataRequest m8125a(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!str.endsWith("/")) {
            sb.append("/");
        }
        sb.append("PN").append(f29802d.nextLong());
        return new PutDataRequest(2, m8112f(sb.toString()));
    }

    /* renamed from: b */
    public static PutDataRequest m8120b(String str) {
        return m8127a(m8112f(str));
    }

    /* renamed from: f */
    private static Uri m8112f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        }
        if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        if (!str.startsWith("//")) {
            return new Uri.Builder().scheme(f29800a).path(str).build();
        }
        throw new IllegalArgumentException("A path must start with a single / .");
    }

    /* renamed from: a */
    public Uri m8128a() {
        return this.f29804e;
    }

    /* renamed from: a */
    public PutDataRequest m8124a(String str, Asset asset) {
        C4588d.m23627a(str);
        C4588d.m23627a(asset);
        this.f29805f.putParcelable(str, asset);
        return this;
    }

    /* renamed from: a */
    public PutDataRequest m8122a(byte[] bArr) {
        this.f29806g = bArr;
        return this;
    }

    /* renamed from: a */
    public String m8123a(boolean z) {
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        String valueOf = String.valueOf(this.f29806g == null ? "null" : Integer.valueOf(this.f29806g.length));
        sb.append(new StringBuilder(String.valueOf(valueOf).length() + 7).append("dataSz=").append(valueOf).toString());
        sb.append(new StringBuilder(23).append(", numAssets=").append(this.f29805f.size()).toString());
        String valueOf2 = String.valueOf(this.f29804e);
        sb.append(new StringBuilder(String.valueOf(valueOf2).length() + 6).append(", uri=").append(valueOf2).toString());
        sb.append(new StringBuilder(35).append(", syncDeadline=").append(this.f29807h).toString());
        if (!z) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.f29805f.keySet()) {
            String valueOf3 = String.valueOf(this.f29805f.getParcelable(str));
            sb.append(new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(valueOf3).length()).append("\n    ").append(str).append(": ").append(valueOf3).toString());
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    /* renamed from: b */
    public byte[] m8121b() {
        return this.f29806g;
    }

    /* renamed from: c */
    public Asset m8118c(String str) {
        return (Asset) this.f29805f.getParcelable(str);
    }

    /* renamed from: c */
    public Map<String, Asset> m8119c() {
        HashMap hashMap = new HashMap();
        for (String str : this.f29805f.keySet()) {
            hashMap.put(str, (Asset) this.f29805f.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public Bundle m8117d() {
        return this.f29805f;
    }

    /* renamed from: d */
    public boolean m8116d(String str) {
        return this.f29805f.containsKey(str);
    }

    /* renamed from: e */
    public long m8115e() {
        return this.f29807h;
    }

    /* renamed from: e */
    public PutDataRequest m8114e(String str) {
        this.f29805f.remove(str);
        return this;
    }

    /* renamed from: f */
    public boolean m8113f() {
        return this.f29807h == 0;
    }

    /* renamed from: g */
    public PutDataRequest m8111g() {
        this.f29807h = 0L;
        return this;
    }

    public String toString() {
        return m8123a(Log.isLoggable(C9628k.f30153a, 3));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9449aa.m8098a(this, parcel, i);
    }
}
