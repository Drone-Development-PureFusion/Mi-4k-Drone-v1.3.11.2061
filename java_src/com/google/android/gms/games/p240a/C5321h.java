package com.google.android.gms.games.p240a;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4684g;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
/* renamed from: com.google.android.gms.games.a.h */
/* loaded from: classes2.dex */
public final class C5321h implements AbstractC5316e {

    /* renamed from: b */
    private final long f19280b;

    /* renamed from: c */
    private final String f19281c;

    /* renamed from: d */
    private final String f19282d;

    /* renamed from: e */
    private final long f19283e;

    /* renamed from: f */
    private final long f19284f;

    /* renamed from: g */
    private final String f19285g;

    /* renamed from: h */
    private final Uri f19286h;

    /* renamed from: i */
    private final Uri f19287i;

    /* renamed from: j */
    private final PlayerEntity f19288j;

    /* renamed from: k */
    private final String f19289k;

    /* renamed from: l */
    private final String f19290l;

    /* renamed from: m */
    private final String f19291m;

    public C5321h(AbstractC5316e abstractC5316e) {
        this.f19280b = abstractC5316e.mo20688c();
        this.f19281c = (String) C4588d.m23627a(abstractC5316e.mo20686d());
        this.f19282d = (String) C4588d.m23627a(abstractC5316e.mo20685e());
        this.f19283e = abstractC5316e.mo20684f();
        this.f19284f = abstractC5316e.mo20683g();
        this.f19285g = abstractC5316e.mo20682h();
        this.f19286h = abstractC5316e.mo20681i();
        this.f19287i = abstractC5316e.mo20680j();
        Player mo20679k = abstractC5316e.mo20679k();
        this.f19288j = mo20679k == null ? null : (PlayerEntity) mo20679k.a();
        this.f19289k = abstractC5316e.mo20678l();
        this.f19290l = abstractC5316e.getScoreHolderIconImageUrl();
        this.f19291m = abstractC5316e.getScoreHolderHiResImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20694a(AbstractC5316e abstractC5316e) {
        return C4585c.m23633a(Long.valueOf(abstractC5316e.mo20688c()), abstractC5316e.mo20686d(), Long.valueOf(abstractC5316e.mo20684f()), abstractC5316e.mo20685e(), Long.valueOf(abstractC5316e.mo20683g()), abstractC5316e.mo20682h(), abstractC5316e.mo20681i(), abstractC5316e.mo20680j(), abstractC5316e.mo20679k());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m20693a(AbstractC5316e abstractC5316e, Object obj) {
        if (!(obj instanceof AbstractC5316e)) {
            return false;
        }
        if (abstractC5316e == obj) {
            return true;
        }
        AbstractC5316e abstractC5316e2 = (AbstractC5316e) obj;
        return C4585c.m23634a(Long.valueOf(abstractC5316e2.mo20688c()), Long.valueOf(abstractC5316e.mo20688c())) && C4585c.m23634a(abstractC5316e2.mo20686d(), abstractC5316e.mo20686d()) && C4585c.m23634a(Long.valueOf(abstractC5316e2.mo20684f()), Long.valueOf(abstractC5316e.mo20684f())) && C4585c.m23634a(abstractC5316e2.mo20685e(), abstractC5316e.mo20685e()) && C4585c.m23634a(Long.valueOf(abstractC5316e2.mo20683g()), Long.valueOf(abstractC5316e.mo20683g())) && C4585c.m23634a(abstractC5316e2.mo20682h(), abstractC5316e.mo20682h()) && C4585c.m23634a(abstractC5316e2.mo20681i(), abstractC5316e.mo20681i()) && C4585c.m23634a(abstractC5316e2.mo20680j(), abstractC5316e.mo20680j()) && C4585c.m23634a(abstractC5316e2.mo20679k(), abstractC5316e.mo20679k()) && C4585c.m23634a(abstractC5316e2.mo20678l(), abstractC5316e.mo20678l());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m20692b(AbstractC5316e abstractC5316e) {
        return C4585c.m23635a(abstractC5316e).m23632a("Rank", Long.valueOf(abstractC5316e.mo20688c())).m23632a("DisplayRank", abstractC5316e.mo20686d()).m23632a("Score", Long.valueOf(abstractC5316e.mo20684f())).m23632a("DisplayScore", abstractC5316e.mo20685e()).m23632a("Timestamp", Long.valueOf(abstractC5316e.mo20683g())).m23632a("DisplayName", abstractC5316e.mo20682h()).m23632a("IconImageUri", abstractC5316e.mo20681i()).m23632a("IconImageUrl", abstractC5316e.getScoreHolderIconImageUrl()).m23632a("HiResImageUri", abstractC5316e.mo20680j()).m23632a("HiResImageUrl", abstractC5316e.getScoreHolderHiResImageUrl()).m23632a("Player", abstractC5316e.mo20679k() == null ? null : abstractC5316e.mo20679k()).m23632a("ScoreTag", abstractC5316e.mo20678l()).toString();
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: a */
    public void mo20690a(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f19281c, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: b */
    public void mo20689b(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f19282d, charArrayBuffer);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: c */
    public long mo20688c() {
        return this.f19280b;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: c */
    public void mo20687c(CharArrayBuffer charArrayBuffer) {
        if (this.f19288j == null) {
            C4684g.m23139a(this.f19285g, charArrayBuffer);
        } else {
            this.f19288j.mo20736a(charArrayBuffer);
        }
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: d */
    public String mo20686d() {
        return this.f19281c;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: e */
    public String mo20685e() {
        return this.f19282d;
    }

    public boolean equals(Object obj) {
        return m20693a(this, obj);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: f */
    public long mo20684f() {
        return this.f19283e;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: g */
    public long mo20683g() {
        return this.f19284f;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    public String getScoreHolderHiResImageUrl() {
        return this.f19288j == null ? this.f19291m : this.f19288j.getHiResImageUrl();
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    public String getScoreHolderIconImageUrl() {
        return this.f19288j == null ? this.f19290l : this.f19288j.getIconImageUrl();
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: h */
    public String mo20682h() {
        return this.f19288j == null ? this.f19285g : this.f19288j.mo20733d();
    }

    public int hashCode() {
        return m20694a(this);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: i */
    public Uri mo20681i() {
        return this.f19288j == null ? this.f19286h : this.f19288j.mo20728i();
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: j */
    public Uri mo20680j() {
        return this.f19288j == null ? this.f19287i : this.f19288j.mo20726k();
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: k */
    public Player mo20679k() {
        return this.f19288j;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5316e
    /* renamed from: l */
    public String mo20678l() {
        return this.f19289k;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: m */
    public AbstractC5316e mo7785a() {
        return this;
    }

    public String toString() {
        return m20692b(this);
    }
}
