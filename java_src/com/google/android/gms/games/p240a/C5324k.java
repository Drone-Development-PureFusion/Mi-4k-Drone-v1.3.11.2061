package com.google.android.gms.games.p240a;

import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.games.internal.p242b.C5649h;
import com.google.android.gms.games.internal.p242b.C5665x;
/* renamed from: com.google.android.gms.games.a.k */
/* loaded from: classes2.dex */
public final class C5324k implements AbstractC5323j {

    /* renamed from: j */
    private final int f19302j;

    /* renamed from: k */
    private final int f19303k;

    /* renamed from: l */
    private final boolean f19304l;

    /* renamed from: m */
    private final long f19305m;

    /* renamed from: n */
    private final String f19306n;

    /* renamed from: o */
    private final long f19307o;

    /* renamed from: p */
    private final String f19308p;

    /* renamed from: q */
    private final String f19309q;

    /* renamed from: r */
    private final long f19310r;

    /* renamed from: s */
    private final String f19311s;

    /* renamed from: t */
    private final String f19312t;

    /* renamed from: u */
    private final String f19313u;

    public C5324k(AbstractC5323j abstractC5323j) {
        this.f19302j = abstractC5323j.mo20672c();
        this.f19303k = abstractC5323j.mo20671d();
        this.f19304l = abstractC5323j.mo20670e();
        this.f19305m = abstractC5323j.mo20669f();
        this.f19306n = abstractC5323j.mo20668g();
        this.f19307o = abstractC5323j.mo20667h();
        this.f19308p = abstractC5323j.mo20666i();
        this.f19309q = abstractC5323j.mo20665j();
        this.f19310r = abstractC5323j.mo20664k();
        this.f19311s = abstractC5323j.mo20663l();
        this.f19312t = abstractC5323j.mo20662m();
        this.f19313u = abstractC5323j.mo20661n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20676a(AbstractC5323j abstractC5323j) {
        return C4585c.m23633a(Integer.valueOf(abstractC5323j.mo20672c()), Integer.valueOf(abstractC5323j.mo20671d()), Boolean.valueOf(abstractC5323j.mo20670e()), Long.valueOf(abstractC5323j.mo20669f()), abstractC5323j.mo20668g(), Long.valueOf(abstractC5323j.mo20667h()), abstractC5323j.mo20666i(), Long.valueOf(abstractC5323j.mo20664k()), abstractC5323j.mo20663l(), abstractC5323j.mo20661n(), abstractC5323j.mo20662m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m20675a(AbstractC5323j abstractC5323j, Object obj) {
        if (!(obj instanceof AbstractC5323j)) {
            return false;
        }
        if (abstractC5323j == obj) {
            return true;
        }
        AbstractC5323j abstractC5323j2 = (AbstractC5323j) obj;
        return C4585c.m23634a(Integer.valueOf(abstractC5323j2.mo20672c()), Integer.valueOf(abstractC5323j.mo20672c())) && C4585c.m23634a(Integer.valueOf(abstractC5323j2.mo20671d()), Integer.valueOf(abstractC5323j.mo20671d())) && C4585c.m23634a(Boolean.valueOf(abstractC5323j2.mo20670e()), Boolean.valueOf(abstractC5323j.mo20670e())) && C4585c.m23634a(Long.valueOf(abstractC5323j2.mo20669f()), Long.valueOf(abstractC5323j.mo20669f())) && C4585c.m23634a(abstractC5323j2.mo20668g(), abstractC5323j.mo20668g()) && C4585c.m23634a(Long.valueOf(abstractC5323j2.mo20667h()), Long.valueOf(abstractC5323j.mo20667h())) && C4585c.m23634a(abstractC5323j2.mo20666i(), abstractC5323j.mo20666i()) && C4585c.m23634a(Long.valueOf(abstractC5323j2.mo20664k()), Long.valueOf(abstractC5323j.mo20664k())) && C4585c.m23634a(abstractC5323j2.mo20663l(), abstractC5323j.mo20663l()) && C4585c.m23634a(abstractC5323j2.mo20661n(), abstractC5323j.mo20661n()) && C4585c.m23634a(abstractC5323j2.mo20662m(), abstractC5323j.mo20662m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m20674b(AbstractC5323j abstractC5323j) {
        return C4585c.m23635a(abstractC5323j).m23632a("TimeSpan", C5665x.m20224a(abstractC5323j.mo20672c())).m23632a("Collection", C5649h.m20229a(abstractC5323j.mo20671d())).m23632a("RawPlayerScore", abstractC5323j.mo20670e() ? Long.valueOf(abstractC5323j.mo20669f()) : "none").m23632a("DisplayPlayerScore", abstractC5323j.mo20670e() ? abstractC5323j.mo20668g() : "none").m23632a("PlayerRank", abstractC5323j.mo20670e() ? Long.valueOf(abstractC5323j.mo20667h()) : "none").m23632a("DisplayPlayerRank", abstractC5323j.mo20670e() ? abstractC5323j.mo20666i() : "none").m23632a("NumScores", Long.valueOf(abstractC5323j.mo20664k())).m23632a("TopPageNextToken", abstractC5323j.mo20663l()).m23632a("WindowPageNextToken", abstractC5323j.mo20661n()).m23632a("WindowPagePrevToken", abstractC5323j.mo20662m()).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: c */
    public int mo20672c() {
        return this.f19302j;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: d */
    public int mo20671d() {
        return this.f19303k;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: e */
    public boolean mo20670e() {
        return this.f19304l;
    }

    public boolean equals(Object obj) {
        return m20675a(this, obj);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: f */
    public long mo20669f() {
        return this.f19305m;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: g */
    public String mo20668g() {
        return this.f19306n;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: h */
    public long mo20667h() {
        return this.f19307o;
    }

    public int hashCode() {
        return m20676a(this);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: i */
    public String mo20666i() {
        return this.f19308p;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: j */
    public String mo20665j() {
        return this.f19309q;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: k */
    public long mo20664k() {
        return this.f19310r;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: l */
    public String mo20663l() {
        return this.f19311s;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: m */
    public String mo20662m() {
        return this.f19312t;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5323j
    /* renamed from: n */
    public String mo20661n() {
        return this.f19313u;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: o */
    public AbstractC5323j mo7785a() {
        return this;
    }

    public String toString() {
        return m20674b(this);
    }
}
