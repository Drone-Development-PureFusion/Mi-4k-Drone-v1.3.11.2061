package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AbstractC3456a;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.internal.uv */
/* loaded from: classes.dex */
public class C7816uv extends AbstractC3456a.AbstractC3457a {

    /* renamed from: a */
    private final AbstractC7813uu f25952a;

    /* renamed from: b */
    private final Drawable f25953b;

    /* renamed from: c */
    private final Uri f25954c;

    /* renamed from: d */
    private final double f25955d;

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:2|3)|(9:5|6|7|8|9|10|11|12|13)|22|6|7|8|9|10|11|12|13) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:1|2|3|(9:5|6|7|8|9|10|11|12|13)|22|6|7|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        com.google.android.gms.ads.internal.util.client.C3784b.m26843b("Failed to get scale.", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
        com.google.android.gms.ads.internal.util.client.C3784b.m26843b("Failed to get uri.", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7816uv(AbstractC7813uu abstractC7813uu) {
        Drawable drawable;
        AbstractC4170e mo13407a;
        Uri uri = null;
        this.f25952a = abstractC7813uu;
        try {
            mo13407a = this.f25952a.mo13407a();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get drawable.", e);
        }
        if (mo13407a != null) {
            drawable = (Drawable) BinderC4173f.m25294a(mo13407a);
            this.f25953b = drawable;
            uri = this.f25952a.mo13406b();
            this.f25954c = uri;
            double d = 1.0d;
            d = this.f25952a.mo13405c();
            this.f25955d = d;
        }
        drawable = null;
        this.f25953b = drawable;
        uri = this.f25952a.mo13406b();
        this.f25954c = uri;
        double d2 = 1.0d;
        d2 = this.f25952a.mo13405c();
        this.f25955d = d2;
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3456a.AbstractC3457a
    /* renamed from: a */
    public Drawable mo13404a() {
        return this.f25953b;
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3456a.AbstractC3457a
    /* renamed from: b */
    public Uri mo13403b() {
        return this.f25954c;
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3456a.AbstractC3457a
    /* renamed from: c */
    public double mo13402c() {
        return this.f25955d;
    }
}
