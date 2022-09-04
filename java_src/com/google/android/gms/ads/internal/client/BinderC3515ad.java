package com.google.android.gms.ads.internal.client;

import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.internal.client.AbstractC3544ao;
import com.google.android.gms.internal.aaa;
import java.util.Random;
@aaa
/* renamed from: com.google.android.gms.ads.internal.client.ad */
/* loaded from: classes.dex */
public class BinderC3515ad extends AbstractC3544ao.AbstractBinderC3545a {

    /* renamed from: b */
    private long f13938b;

    /* renamed from: c */
    private Object f13939c = new Object();

    /* renamed from: a */
    private final Random f13937a = new Random();

    public BinderC3515ad() {
        m27582a();
    }

    /* renamed from: a */
    public void m27582a() {
        synchronized (this.f13939c) {
            int i = 3;
            long j = 0;
            while (true) {
                i--;
                if (i <= 0) {
                    break;
                }
                j = this.f13937a.nextInt() + FimiMediaMeta.AV_CH_WIDE_LEFT;
                if (j != this.f13938b && j != 0) {
                    break;
                }
            }
            this.f13938b = j;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3544ao
    /* renamed from: b */
    public long mo27565b() {
        return this.f13938b;
    }
}
