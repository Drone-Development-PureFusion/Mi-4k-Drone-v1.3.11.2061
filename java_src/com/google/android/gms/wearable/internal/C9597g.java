package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.AbstractC9466h;
import com.google.android.gms.wearable.AbstractC9467i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.wearable.internal.g */
/* loaded from: classes2.dex */
public final class C9597g extends AbstractC4531j implements AbstractC9466h {

    /* renamed from: c */
    private final int f30142c;

    public C9597g(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f30142c = i2;
    }

    @Override // com.google.android.gms.wearable.AbstractC9466h
    /* renamed from: a */
    public AbstractC9466h mo7783a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public String m7784a(boolean z) {
        byte[] mo7781d = mo7781d();
        Map<String, AbstractC9467i> mo7780e = mo7780e();
        StringBuilder sb = new StringBuilder("DataItemInternal{ ");
        String valueOf = String.valueOf(mo7782c());
        sb.append(new StringBuilder(String.valueOf(valueOf).length() + 4).append("uri=").append(valueOf).toString());
        String valueOf2 = String.valueOf(mo7781d == null ? "null" : Integer.valueOf(mo7781d.length));
        sb.append(new StringBuilder(String.valueOf(valueOf2).length() + 9).append(", dataSz=").append(valueOf2).toString());
        sb.append(new StringBuilder(23).append(", numAssets=").append(mo7780e.size()).toString());
        if (z && !mo7780e.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            Iterator<Map.Entry<String, AbstractC9467i>> it2 = mo7780e.entrySet().iterator();
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

    @Override // com.google.android.gms.wearable.AbstractC9466h
    /* renamed from: c */
    public Uri mo7782c() {
        return Uri.parse(e("path"));
    }

    @Override // com.google.android.gms.wearable.AbstractC9466h
    /* renamed from: d */
    public byte[] mo7781d() {
        return g(UriUtil.DATA_SCHEME);
    }

    @Override // com.google.android.gms.wearable.AbstractC9466h
    /* renamed from: e */
    public Map<String, AbstractC9467i> mo7780e() {
        HashMap hashMap = new HashMap(this.f30142c);
        for (int i = 0; i < this.f30142c; i++) {
            C9594d c9594d = new C9594d(this.f16909c_, this.f16910d_ + i);
            if (c9594d.mo7793d() != null) {
                hashMap.put(c9594d.mo7793d(), c9594d);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: f */
    public AbstractC9466h mo7785a() {
        return new C9595e(this);
    }

    public String toString() {
        return m7784a(Log.isLoggable("DataItem", 3));
    }
}
