package com.google.android.gms.games.p240a;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
/* renamed from: com.google.android.gms.games.a.i */
/* loaded from: classes2.dex */
public final class C5322i extends AbstractC4531j implements AbstractC5316e {

    /* renamed from: c */
    private final PlayerRef f19292c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5322i(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.f19292c = new PlayerRef(dataHolder, i);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: a */
    public void mo20690a(CharArrayBuffer charArrayBuffer) {
        a("display_rank", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: b */
    public void mo20689b(CharArrayBuffer charArrayBuffer) {
        a("display_score", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: c */
    public long mo20688c() {
        return b("rank");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: c */
    public void mo20687c(CharArrayBuffer charArrayBuffer) {
        if (i("external_player_id")) {
            a("default_display_name", charArrayBuffer);
        } else {
            this.f19292c.mo20736a(charArrayBuffer);
        }
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: d */
    public String mo20686d() {
        return e("display_rank");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: e */
    public String mo20685e() {
        return e("display_score");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return C5321h.m20693a(this, obj);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: f */
    public long mo20684f() {
        return b("raw_score");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: g */
    public long mo20683g() {
        return b("achieved_timestamp");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    public String getScoreHolderHiResImageUrl() {
        if (i("external_player_id")) {
            return null;
        }
        return this.f19292c.getHiResImageUrl();
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    public String getScoreHolderIconImageUrl() {
        return i("external_player_id") ? e("default_display_image_url") : this.f19292c.getIconImageUrl();
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: h */
    public String mo20682h() {
        return i("external_player_id") ? e("default_display_name") : this.f19292c.mo20733d();
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return C5321h.m20694a(this);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: i */
    public Uri mo20681i() {
        return i("external_player_id") ? h("default_display_image_uri") : this.f19292c.mo20728i();
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: j */
    public Uri mo20680j() {
        if (i("external_player_id")) {
            return null;
        }
        return this.f19292c.mo20726k();
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: k */
    public Player mo20679k() {
        if (i("external_player_id")) {
            return null;
        }
        return this.f19292c;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: l */
    public String mo20678l() {
        return e("score_tag");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: m */
    public AbstractC5316e mo7785a() {
        return new C5321h(this);
    }

    public String toString() {
        return C5321h.m20692b(this);
    }
}
