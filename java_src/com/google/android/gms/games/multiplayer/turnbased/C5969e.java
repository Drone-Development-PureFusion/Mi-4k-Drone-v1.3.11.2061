package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.games.multiplayer.turnbased.AbstractC5966d;
/* renamed from: com.google.android.gms.games.multiplayer.turnbased.e */
/* loaded from: classes2.dex */
public final class C5969e extends AbstractC5966d {

    /* renamed from: a */
    private final int f20273a;

    /* renamed from: b */
    private final String[] f20274b;

    /* renamed from: c */
    private final Bundle f20275c;

    /* renamed from: d */
    private final int f20276d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5969e(AbstractC5966d.C5968a c5968a) {
        this.f20273a = c5968a.f20269a;
        this.f20276d = c5968a.f20272d;
        this.f20275c = c5968a.f20271c;
        this.f20274b = (String[]) c5968a.f20270b.toArray(new String[c5968a.f20270b.size()]);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5966d
    /* renamed from: a */
    public int mo19306a() {
        return this.f20273a;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5966d
    /* renamed from: b */
    public int mo19305b() {
        return this.f20276d;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5966d
    /* renamed from: c */
    public String[] mo19304c() {
        return this.f20274b;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5966d
    /* renamed from: d */
    public Bundle mo19303d() {
        return this.f20275c;
    }
}
