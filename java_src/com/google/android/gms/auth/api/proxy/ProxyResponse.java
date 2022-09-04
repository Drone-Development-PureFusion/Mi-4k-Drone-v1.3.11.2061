package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new C4040e();

    /* renamed from: a */
    public static final int f15494a = -1;

    /* renamed from: b */
    final int f15495b;

    /* renamed from: c */
    public final int f15496c;

    /* renamed from: d */
    public final PendingIntent f15497d;

    /* renamed from: e */
    public final int f15498e;

    /* renamed from: f */
    final Bundle f15499f;

    /* renamed from: g */
    public final byte[] f15500g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.f15495b = i;
        this.f15496c = i2;
        this.f15498e = i3;
        this.f15499f = bundle;
        this.f15500g = bArr;
        this.f15497d = pendingIntent;
    }

    public ProxyResponse(int i, PendingIntent pendingIntent, int i2, Bundle bundle, byte[] bArr) {
        this(1, i, pendingIntent, i2, bundle, bArr);
    }

    private ProxyResponse(int i, Bundle bundle, byte[] bArr) {
        this(1, 0, null, i, bundle, bArr);
    }

    public ProxyResponse(int i, Map<String, String> map, byte[] bArr) {
        this(i, m25699a(map), bArr);
    }

    /* renamed from: a */
    private static Bundle m25699a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map == null) {
            return bundle;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    /* renamed from: a */
    public static ProxyResponse m25700a(int i, PendingIntent pendingIntent, int i2, Map<String, String> map, byte[] bArr) {
        return new ProxyResponse(1, i, pendingIntent, i2, m25699a(map), bArr);
    }

    /* renamed from: a */
    public Map<String, String> m25701a() {
        if (this.f15499f == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : this.f15499f.keySet()) {
            hashMap.put(str, this.f15499f.getString(str));
        }
        return hashMap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4040e.m25689a(this, parcel, i);
    }
}
