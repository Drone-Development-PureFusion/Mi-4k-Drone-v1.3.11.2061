package com.google.android.gms.games.p240a;

import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
/* renamed from: com.google.android.gms.games.a.l */
/* loaded from: classes2.dex */
public final class C5325l extends AbstractC4531j implements AbstractC5323j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5325l(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: c */
    public int mo20672c() {
        return c("timespan");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: d */
    public int mo20671d() {
        return c("collection");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: e */
    public boolean mo20670e() {
        return !i("player_raw_score");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return C5324k.m20675a(this, obj);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: f */
    public long mo20669f() {
        if (i("player_raw_score")) {
            return -1L;
        }
        return b("player_raw_score");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: g */
    public String mo20668g() {
        return e("player_display_score");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: h */
    public long mo20667h() {
        if (i("player_rank")) {
            return -1L;
        }
        return b("player_rank");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return C5324k.m20676a(this);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: i */
    public String mo20666i() {
        return e("player_display_rank");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: j */
    public String mo20665j() {
        return e("player_score_tag");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: k */
    public long mo20664k() {
        if (i("total_scores")) {
            return -1L;
        }
        return b("total_scores");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: l */
    public String mo20663l() {
        return e("top_page_token_next");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: m */
    public String mo20662m() {
        return e("window_page_token_prev");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: n */
    public String mo20661n() {
        return e("window_page_token_next");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: o */
    public AbstractC5323j mo7785a() {
        return new C5324k(this);
    }

    public String toString() {
        return C5324k.m20674b(this);
    }
}
