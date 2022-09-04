package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.C7794uj;
import com.google.android.gms.internal.C7799ul;
import com.google.android.gms.internal.C7801un;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.acb;
import com.tencent.open.SocialConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.TimeUnit;
@aaa
/* renamed from: com.google.android.gms.ads.internal.overlay.x */
/* loaded from: classes.dex */
public class C3680x {

    /* renamed from: a */
    private final Context f14381a;

    /* renamed from: b */
    private final String f14382b;

    /* renamed from: c */
    private final VersionInfoParcel f14383c;
    @Nullable

    /* renamed from: d */
    private final C7799ul f14384d;
    @Nullable

    /* renamed from: e */
    private final C7801un f14385e;

    /* renamed from: g */
    private final long[] f14387g;

    /* renamed from: h */
    private final String[] f14388h;

    /* renamed from: m */
    private boolean f14393m;

    /* renamed from: n */
    private AbstractC3661i f14394n;

    /* renamed from: o */
    private boolean f14395o;

    /* renamed from: p */
    private boolean f14396p;

    /* renamed from: f */
    private final acb f14386f = new acb.C6178b().m18249a("min_1", Double.MIN_VALUE, 1.0d).m18249a("1_5", 1.0d, 5.0d).m18249a("5_10", 5.0d, 10.0d).m18249a("10_20", 10.0d, 20.0d).m18249a("20_30", 20.0d, 30.0d).m18249a("30_max", 30.0d, Double.MAX_VALUE).m18251a();

    /* renamed from: i */
    private boolean f14389i = false;

    /* renamed from: j */
    private boolean f14390j = false;

    /* renamed from: k */
    private boolean f14391k = false;

    /* renamed from: l */
    private boolean f14392l = false;

    /* renamed from: q */
    private long f14397q = -1;

    public C3680x(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable C7801un c7801un, @Nullable C7799ul c7799ul) {
        this.f14381a = context;
        this.f14383c = versionInfoParcel;
        this.f14382b = str;
        this.f14385e = c7801un;
        this.f14384d = c7799ul;
        String m13486c = C7788uf.f25908z.m13486c();
        if (m13486c == null) {
            this.f14388h = new String[0];
            this.f14387g = new long[0];
            return;
        }
        String[] split = TextUtils.split(m13486c, Constants.ACCEPT_TIME_SEPARATOR_SP);
        this.f14388h = new String[split.length];
        this.f14387g = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f14387g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                abr.d("Unable to parse frame hash target time number.", e);
                this.f14387g[i] = -1;
            }
        }
    }

    /* renamed from: c */
    private void m27124c(AbstractC3661i abstractC3661i) {
        long longValue = C7788uf.f25716A.m13486c().longValue();
        long currentPosition = abstractC3661i.getCurrentPosition();
        for (int i = 0; i < this.f14388h.length; i++) {
            if (this.f14388h[i] == null && longValue > Math.abs(currentPosition - this.f14387g[i])) {
                this.f14388h[i] = m27129a((TextureView) abstractC3661i);
                return;
            }
        }
    }

    /* renamed from: e */
    private void m27122e() {
        if (this.f14391k && !this.f14392l) {
            C7794uj.m13449a(this.f14385e, this.f14384d, "vff2");
            this.f14392l = true;
        }
        long mo16431c = C3779u.m26884k().mo16431c();
        if (this.f14393m && this.f14396p && this.f14397q != -1) {
            this.f14386f.m18253a(TimeUnit.SECONDS.toNanos(1L) / (mo16431c - this.f14397q));
        }
        this.f14396p = this.f14393m;
        this.f14397q = mo16431c;
    }

    @TargetApi(14)
    /* renamed from: a */
    String m27129a(TextureView textureView) {
        long j;
        Bitmap bitmap = textureView.getBitmap(8, 8);
        long j2 = 0;
        long j3 = 63;
        int i = 0;
        while (i < 8) {
            int i2 = 0;
            long j4 = j2;
            while (true) {
                j = j3;
                int i3 = i2;
                if (i3 < 8) {
                    int pixel = bitmap.getPixel(i3, i);
                    j4 |= (Color.green(pixel) + (Color.blue(pixel) + Color.red(pixel)) > 128 ? 1L : 0L) << ((int) j);
                    i2 = i3 + 1;
                    j3 = j - 1;
                }
            }
            i++;
            j3 = j;
            j2 = j4;
        }
        return String.format("%016X", Long.valueOf(j2));
    }

    /* renamed from: a */
    public void m27130a() {
        if (!this.f14389i || this.f14390j) {
            return;
        }
        C7794uj.m13449a(this.f14385e, this.f14384d, "vfr2");
        this.f14390j = true;
    }

    /* renamed from: a */
    public void m27128a(AbstractC3661i abstractC3661i) {
        C7794uj.m13449a(this.f14385e, this.f14384d, "vpc2");
        this.f14389i = true;
        if (this.f14385e != null) {
            this.f14385e.m13433a("vpn", abstractC3661i.mo27210a());
        }
        this.f14394n = abstractC3661i;
    }

    /* renamed from: b */
    public void m27127b() {
        if (!C7788uf.f25907y.m13486c().booleanValue() || this.f14395o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString(SocialConstants.TYPE_REQUEST, this.f14382b);
        bundle.putString("player", this.f14394n.mo27210a());
        for (acb.C6177a c6177a : this.f14386f.m18254a()) {
            String valueOf = String.valueOf("fps_c_");
            String valueOf2 = String.valueOf(c6177a.f21084a);
            bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(c6177a.f21088e));
            String valueOf3 = String.valueOf("fps_p_");
            String valueOf4 = String.valueOf(c6177a.f21084a);
            bundle.putString(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), Double.toString(c6177a.f21087d));
        }
        for (int i = 0; i < this.f14387g.length; i++) {
            String str = this.f14388h[i];
            if (str != null) {
                String valueOf5 = String.valueOf("fh_");
                String valueOf6 = String.valueOf(Long.valueOf(this.f14387g[i]));
                bundle.putString(new StringBuilder(String.valueOf(valueOf5).length() + 0 + String.valueOf(valueOf6).length()).append(valueOf5).append(valueOf6).toString(), str);
            }
        }
        C3779u.m26890e().m18369a(this.f14381a, this.f14383c.f14733b, "gmob-apps", bundle, true);
        this.f14395o = true;
    }

    /* renamed from: b */
    public void m27126b(AbstractC3661i abstractC3661i) {
        m27122e();
        m27124c(abstractC3661i);
    }

    /* renamed from: c */
    public void m27125c() {
        this.f14393m = true;
        if (!this.f14390j || this.f14391k) {
            return;
        }
        C7794uj.m13449a(this.f14385e, this.f14384d, "vfp2");
        this.f14391k = true;
    }

    /* renamed from: d */
    public void m27123d() {
        this.f14393m = false;
    }
}
