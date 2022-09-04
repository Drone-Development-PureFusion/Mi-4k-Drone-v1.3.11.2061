package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.games.internal.p242b.C5655n;
import com.xiaomi.market.sdk.C10447l;
/* renamed from: com.google.android.gms.games.internal.game.e */
/* loaded from: classes2.dex */
public final class C5902e extends AbstractC4531j implements AbstractC5900c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5902e(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: a */
    public String m19949a() {
        return e("external_game_id");
    }

    /* renamed from: d */
    public String m19948d() {
        return e("instance_display_name");
    }

    /* renamed from: e */
    public boolean m19947e() {
        return c("real_time_support") > 0;
    }

    /* renamed from: f */
    public boolean m19946f() {
        return c("turn_based_support") > 0;
    }

    /* renamed from: g */
    public int m19945g() {
        return c("platform_type");
    }

    /* renamed from: h */
    public String m19944h() {
        return e(C10447l.PACKAGE_NAME);
    }

    /* renamed from: i */
    public boolean m19943i() {
        return c("piracy_check") > 0;
    }

    /* renamed from: j */
    public boolean m19942j() {
        return c("installed") > 0;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("ApplicationId", m19949a()).m23632a("DisplayName", m19948d()).m23632a("SupportsRealTime", Boolean.valueOf(m19947e())).m23632a("SupportsTurnBased", Boolean.valueOf(m19946f())).m23632a("PlatformType", C5655n.m20227a(m19945g())).m23632a("PackageName", m19944h()).m23632a("PiracyCheckEnabled", Boolean.valueOf(m19943i())).m23632a("Installed", Boolean.valueOf(m19942j())).toString();
    }
}
