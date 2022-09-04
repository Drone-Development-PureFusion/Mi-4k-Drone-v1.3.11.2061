package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.AbstractC9466h;
import com.google.android.gms.wearable.AbstractC9467i;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class DataItemParcelable extends AbstractSafeParcelable implements AbstractC9466h {
    public static final Parcelable.Creator<DataItemParcelable> CREATOR = new C9596f();

    /* renamed from: a */
    final int f29922a;

    /* renamed from: b */
    private final Uri f29923b;

    /* renamed from: c */
    private final Map<String, AbstractC9467i> f29924c;

    /* renamed from: d */
    private byte[] f29925d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataItemParcelable(int i, Uri uri, Bundle bundle, byte[] bArr) {
        this.f29922a = i;
        this.f29923b = uri;
        HashMap hashMap = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            hashMap.put(str, (DataItemAssetParcelable) bundle.getParcelable(str));
        }
        this.f29924c = hashMap;
        this.f29925d = bArr;
    }

    /* renamed from: a */
    public String m8042a(boolean z) {
        StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        String valueOf = String.valueOf(this.f29925d == null ? "null" : Integer.valueOf(this.f29925d.length));
        sb.append(new StringBuilder(String.valueOf(valueOf).length() + 8).append(",dataSz=").append(valueOf).toString());
        sb.append(new StringBuilder(23).append(", numAssets=").append(this.f29924c.size()).toString());
        String valueOf2 = String.valueOf(this.f29923b);
        sb.append(new StringBuilder(String.valueOf(valueOf2).length() + 6).append(", uri=").append(valueOf2).toString());
        if (!z) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : this.f29924c.keySet()) {
            String valueOf3 = String.valueOf(this.f29924c.get(str));
            sb.append(new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(valueOf3).length()).append("\n    ").append(str).append(": ").append(valueOf3).toString());
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // com.google.android.gms.wearable.AbstractC9466h
    /* renamed from: b */
    public DataItemParcelable mo7783a(byte[] bArr) {
        this.f29925d = bArr;
        return this;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.wearable.AbstractC9466h
    /* renamed from: c */
    public Uri mo7782c() {
        return this.f29923b;
    }

    @Override // com.google.android.gms.wearable.AbstractC9466h
    /* renamed from: d */
    public byte[] mo7781d() {
        return this.f29925d;
    }

    @Override // com.google.android.gms.wearable.AbstractC9466h
    /* renamed from: e */
    public Map<String, AbstractC9467i> mo7780e() {
        return this.f29924c;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: f */
    public DataItemParcelable mo7785a() {
        return this;
    }

    /* renamed from: g */
    public Bundle m8039g() {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Map.Entry<String, AbstractC9467i> entry : this.f29924c.entrySet()) {
            bundle.putParcelable(entry.getKey(), new DataItemAssetParcelable(entry.getValue()));
        }
        return bundle;
    }

    public String toString() {
        return m8042a(Log.isLoggable("DataItem", 3));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9596f.m7786a(this, parcel, i);
    }
}
