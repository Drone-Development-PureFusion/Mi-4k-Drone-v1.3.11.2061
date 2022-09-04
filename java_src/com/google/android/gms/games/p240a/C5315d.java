package com.google.android.gms.games.p240a;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.games.a.d */
/* loaded from: classes2.dex */
public final class C5315d extends AbstractC4531j implements AbstractC5312a {

    /* renamed from: c */
    private final int f19275c;

    /* renamed from: d */
    private final Game f19276d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5315d(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f19275c = i2;
        this.f19276d = new GameRef(dataHolder, i);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    /* renamed from: a */
    public void mo20705a(CharArrayBuffer charArrayBuffer) {
        a("name", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    /* renamed from: c */
    public String mo20704c() {
        return e("external_leaderboard_id");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    /* renamed from: d */
    public String mo20703d() {
        return e("name");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    /* renamed from: e */
    public Uri mo20702e() {
        return h("board_icon_image_uri");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return C5314c.m20708a(this, obj);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    /* renamed from: f */
    public int mo20701f() {
        return c("score_order");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    /* renamed from: g */
    public ArrayList<AbstractC5323j> mo20700g() {
        ArrayList<AbstractC5323j> arrayList = new ArrayList<>(this.f19275c);
        for (int i = 0; i < this.f19275c; i++) {
            arrayList.add(new C5325l(this.f16909c_, this.f16910d_ + i));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    public String getIconImageUrl() {
        return e("board_icon_image_url");
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    /* renamed from: h */
    public Game mo20699h() {
        return this.f19276d;
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return C5314c.m20709a(this);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: i */
    public AbstractC5312a mo7785a() {
        return new C5314c(this);
    }

    public String toString() {
        return C5314c.m20707b(this);
    }
}
