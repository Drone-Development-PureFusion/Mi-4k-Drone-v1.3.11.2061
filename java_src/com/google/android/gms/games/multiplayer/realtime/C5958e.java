package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.games.multiplayer.realtime.AbstractC5955d;
/* renamed from: com.google.android.gms.games.multiplayer.realtime.e */
/* loaded from: classes2.dex */
public final class C5958e extends AbstractC5955d {

    /* renamed from: a */
    private final AbstractC5961h f20225a;

    /* renamed from: b */
    private final AbstractC5960g f20226b;

    /* renamed from: c */
    private final AbstractC5951a f20227c;

    /* renamed from: d */
    private final String f20228d;

    /* renamed from: e */
    private final int f20229e;

    /* renamed from: f */
    private final String[] f20230f;

    /* renamed from: g */
    private final Bundle f20231g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5958e(AbstractC5955d.C5957a c5957a) {
        this.f20225a = c5957a.f20218a;
        this.f20226b = c5957a.f20219b;
        this.f20227c = c5957a.f20220c;
        this.f20228d = c5957a.f20221d;
        this.f20229e = c5957a.f20222e;
        this.f20231g = c5957a.f20224g;
        this.f20230f = (String[]) c5957a.f20223f.toArray(new String[c5957a.f20223f.size()]);
        C4588d.m23626a(this.f20227c, "Must specify a message listener");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5955d
    /* renamed from: a */
    public AbstractC5961h mo19388a() {
        return this.f20225a;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5955d
    /* renamed from: b */
    public String mo19387b() {
        return this.f20228d;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5955d
    /* renamed from: c */
    public AbstractC5960g mo19386c() {
        return this.f20226b;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5955d
    /* renamed from: d */
    public AbstractC5951a mo19385d() {
        return this.f20227c;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5955d
    /* renamed from: e */
    public int mo19384e() {
        return this.f20229e;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5955d
    /* renamed from: f */
    public String[] mo19383f() {
        return this.f20230f;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.AbstractC5955d
    /* renamed from: g */
    public Bundle mo19382g() {
        return this.f20231g;
    }
}
