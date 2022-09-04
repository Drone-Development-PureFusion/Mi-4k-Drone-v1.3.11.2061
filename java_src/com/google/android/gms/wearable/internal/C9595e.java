package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.AbstractC9466h;
import com.google.android.gms.wearable.AbstractC9467i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.wearable.internal.e */
/* loaded from: classes2.dex */
public class C9595e implements AbstractC9466h {

    /* renamed from: a */
    private Uri f30139a;

    /* renamed from: b */
    private byte[] f30140b;

    /* renamed from: c */
    private Map<String, AbstractC9467i> f30141c;

    public C9595e(AbstractC9466h abstractC9466h) {
        this.f30139a = abstractC9466h.mo7782c();
        this.f30140b = abstractC9466h.mo7781d();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, AbstractC9467i> entry : abstractC9466h.mo7780e().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put(entry.getKey(), entry.getValue().a());
            }
        }
        this.f30141c = Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.wearable.AbstractC9466h
    /* renamed from: a */
    public AbstractC9466h mo7783a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public String m7791a(boolean z) {
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        String valueOf = String.valueOf(this.f30139a);
        sb.append(new StringBuilder(String.valueOf(valueOf).length() + 4).append("uri=").append(valueOf).toString());
        String valueOf2 = String.valueOf(this.f30140b == null ? "null" : Integer.valueOf(this.f30140b.length));
        sb.append(new StringBuilder(String.valueOf(valueOf2).length() + 9).append(", dataSz=").append(valueOf2).toString());
        sb.append(new StringBuilder(23).append(", numAssets=").append(this.f30141c.size()).toString());
        if (z && !this.f30141c.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            Iterator<Map.Entry<String, AbstractC9467i>> it2 = this.f30141c.entrySet().iterator();
            while (true) {
                String str2 = str;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<String, AbstractC9467i> next = it2.next();
                String key = next.getKey();
                String valueOf3 = String.valueOf(next.getValue().mo7794c());
                sb.append(new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(key).length() + String.valueOf(valueOf3).length()).append(str2).append(key).append(": ").append(valueOf3).toString());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.wearable.AbstractC9466h
    /* renamed from: c */
    public Uri mo7782c() {
        return this.f30139a;
    }

    @Override // com.google.android.gms.wearable.AbstractC9466h
    /* renamed from: d */
    public byte[] mo7781d() {
        return this.f30140b;
    }

    @Override // com.google.android.gms.wearable.AbstractC9466h
    /* renamed from: e */
    public Map<String, AbstractC9467i> mo7780e() {
        return this.f30141c;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: f */
    public AbstractC9466h mo7785a() {
        return this;
    }

    public String toString() {
        return m7791a(Log.isLoggable("DataItem", 3));
    }
}
