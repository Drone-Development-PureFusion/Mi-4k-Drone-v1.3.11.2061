package com.google.android.gms.games.p240a;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.util.C4684g;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.games.a.c */
/* loaded from: classes2.dex */
public final class C5314c implements AbstractC5312a {

    /* renamed from: c */
    private final String f19268c;

    /* renamed from: d */
    private final String f19269d;

    /* renamed from: e */
    private final Uri f19270e;

    /* renamed from: f */
    private final int f19271f;

    /* renamed from: g */
    private final ArrayList<C5324k> f19272g;

    /* renamed from: h */
    private final Game f19273h;

    /* renamed from: i */
    private final String f19274i;

    public C5314c(AbstractC5312a abstractC5312a) {
        this.f19268c = abstractC5312a.mo20704c();
        this.f19269d = abstractC5312a.mo20703d();
        this.f19270e = abstractC5312a.mo20702e();
        this.f19274i = abstractC5312a.getIconImageUrl();
        this.f19271f = abstractC5312a.mo20701f();
        Game mo20699h = abstractC5312a.mo20699h();
        this.f19273h = mo20699h == null ? null : new GameEntity(mo20699h);
        ArrayList<AbstractC5323j> mo20700g = abstractC5312a.mo20700g();
        int size = mo20700g.size();
        this.f19272g = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.f19272g.add((C5324k) mo20700g.get(i).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20709a(AbstractC5312a abstractC5312a) {
        return C4585c.m23633a(abstractC5312a.mo20704c(), abstractC5312a.mo20703d(), abstractC5312a.mo20702e(), Integer.valueOf(abstractC5312a.mo20701f()), abstractC5312a.mo20700g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m20708a(AbstractC5312a abstractC5312a, Object obj) {
        if (!(obj instanceof AbstractC5312a)) {
            return false;
        }
        if (abstractC5312a == obj) {
            return true;
        }
        AbstractC5312a abstractC5312a2 = (AbstractC5312a) obj;
        return C4585c.m23634a(abstractC5312a2.mo20704c(), abstractC5312a.mo20704c()) && C4585c.m23634a(abstractC5312a2.mo20703d(), abstractC5312a.mo20703d()) && C4585c.m23634a(abstractC5312a2.mo20702e(), abstractC5312a.mo20702e()) && C4585c.m23634a(Integer.valueOf(abstractC5312a2.mo20701f()), Integer.valueOf(abstractC5312a.mo20701f())) && C4585c.m23634a(abstractC5312a2.mo20700g(), abstractC5312a.mo20700g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m20707b(AbstractC5312a abstractC5312a) {
        return C4585c.m23635a(abstractC5312a).m23632a("LeaderboardId", abstractC5312a.mo20704c()).m23632a("DisplayName", abstractC5312a.mo20703d()).m23632a("IconImageUri", abstractC5312a.mo20702e()).m23632a("IconImageUrl", abstractC5312a.getIconImageUrl()).m23632a("ScoreOrder", Integer.valueOf(abstractC5312a.mo20701f())).m23632a("Variants", abstractC5312a.mo20700g()).toString();
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    /* renamed from: a */
    public void mo20705a(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f19269d, charArrayBuffer);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    /* renamed from: c */
    public String mo20704c() {
        return this.f19268c;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    /* renamed from: d */
    public String mo20703d() {
        return this.f19269d;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    /* renamed from: e */
    public Uri mo20702e() {
        return this.f19270e;
    }

    public boolean equals(Object obj) {
        return m20708a(this, obj);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    /* renamed from: f */
    public int mo20701f() {
        return this.f19271f;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    /* renamed from: g */
    public ArrayList<AbstractC5323j> mo20700g() {
        return new ArrayList<>(this.f19272g);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    public String getIconImageUrl() {
        return this.f19274i;
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5312a
    /* renamed from: h */
    public Game mo20699h() {
        return this.f19273h;
    }

    public int hashCode() {
        return m20709a(this);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: i */
    public AbstractC5312a mo7785a() {
        return this;
    }

    public String toString() {
        return m20707b(this);
    }
}
