package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.BinderC3628l;
import com.google.android.gms.ads.internal.C3588d;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
@aaa
/* renamed from: com.google.android.gms.internal.wm */
/* loaded from: classes.dex */
public class C7910wm {

    /* renamed from: a */
    private final Context f26067a;

    /* renamed from: b */
    private final AbstractC8005xq f26068b;

    /* renamed from: c */
    private final VersionInfoParcel f26069c;

    /* renamed from: d */
    private final C3588d f26070d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7910wm(Context context, AbstractC8005xq abstractC8005xq, VersionInfoParcel versionInfoParcel, C3588d c3588d) {
        this.f26067a = context;
        this.f26068b = abstractC8005xq;
        this.f26069c = versionInfoParcel;
        this.f26070d = c3588d;
    }

    /* renamed from: a */
    public Context m13250a() {
        return this.f26067a.getApplicationContext();
    }

    /* renamed from: a */
    public BinderC3628l m13249a(String str) {
        return new BinderC3628l(this.f26067a, new AdSizeParcel(), str, this.f26068b, this.f26069c, this.f26070d);
    }

    /* renamed from: b */
    public BinderC3628l m13247b(String str) {
        return new BinderC3628l(this.f26067a.getApplicationContext(), new AdSizeParcel(), str, this.f26068b, this.f26069c, this.f26070d);
    }

    /* renamed from: b */
    public C7910wm m13248b() {
        return new C7910wm(m13250a(), this.f26068b, this.f26069c, this.f26070d);
    }
}
