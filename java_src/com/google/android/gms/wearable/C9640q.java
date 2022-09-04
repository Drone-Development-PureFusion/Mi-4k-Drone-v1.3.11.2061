package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.AbstractC7649rd;
import com.google.android.gms.internal.C6949fe;
/* renamed from: com.google.android.gms.wearable.q */
/* loaded from: classes2.dex */
public class C9640q {

    /* renamed from: a */
    private final PutDataRequest f30161a;

    /* renamed from: b */
    private final C9628k f30162b = new C9628k();

    private C9640q(PutDataRequest putDataRequest, C9628k c9628k) {
        this.f30161a = putDataRequest;
        if (c9628k != null) {
            this.f30162b.m7637a(c9628k);
        }
    }

    /* renamed from: a */
    public static C9640q m7556a(C9629l c9629l) {
        return new C9640q(PutDataRequest.m8127a(c9629l.m7582a()), c9629l.m7580b());
    }

    /* renamed from: a */
    public static C9640q m7555a(String str) {
        return new C9640q(PutDataRequest.m8125a(str), null);
    }

    /* renamed from: b */
    public static C9640q m7553b(String str) {
        return new C9640q(PutDataRequest.m8120b(str), null);
    }

    /* renamed from: a */
    public Uri m7557a() {
        return this.f30161a.m8128a();
    }

    /* renamed from: b */
    public C9628k m7554b() {
        return this.f30162b;
    }

    /* renamed from: c */
    public C9640q m7552c() {
        this.f30161a.m8111g();
        return this;
    }

    /* renamed from: d */
    public boolean m7551d() {
        return this.f30161a.m8113f();
    }

    /* renamed from: e */
    public PutDataRequest m7550e() {
        C6949fe.C6950a m15895a = C6949fe.m15895a(this.f30162b);
        this.f30161a.m8122a(AbstractC7649rd.m13857a(m15895a.f23344a));
        int size = m15895a.f23345b.size();
        for (int i = 0; i < size; i++) {
            String num = Integer.toString(i);
            Asset asset = m15895a.f23345b.get(i);
            if (num == null) {
                String valueOf = String.valueOf(asset);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("asset key cannot be null: ").append(valueOf).toString());
            } else if (asset == null) {
                String valueOf2 = String.valueOf(num);
                throw new IllegalStateException(valueOf2.length() != 0 ? "asset cannot be null: key=".concat(valueOf2) : new String("asset cannot be null: key="));
            } else {
                if (Log.isLoggable(C9628k.f30153a, 3)) {
                    String valueOf3 = String.valueOf(asset);
                    Log.d(C9628k.f30153a, new StringBuilder(String.valueOf(num).length() + 33 + String.valueOf(valueOf3).length()).append("asPutDataRequest: adding asset: ").append(num).append(" ").append(valueOf3).toString());
                }
                this.f30161a.m8124a(num, asset);
            }
        }
        return this.f30161a;
    }
}
