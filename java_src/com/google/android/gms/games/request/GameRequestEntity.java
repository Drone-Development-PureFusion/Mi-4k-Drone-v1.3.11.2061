package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public final class GameRequestEntity extends AbstractSafeParcelable implements GameRequest {
    public static final Parcelable.Creator<GameRequestEntity> CREATOR = new C5996b();

    /* renamed from: g */
    private final int f20334g;

    /* renamed from: h */
    private final GameEntity f20335h;

    /* renamed from: i */
    private final PlayerEntity f20336i;

    /* renamed from: j */
    private final byte[] f20337j;

    /* renamed from: k */
    private final String f20338k;

    /* renamed from: l */
    private final ArrayList<PlayerEntity> f20339l;

    /* renamed from: m */
    private final int f20340m;

    /* renamed from: n */
    private final long f20341n;

    /* renamed from: o */
    private final long f20342o;

    /* renamed from: p */
    private final Bundle f20343p;

    /* renamed from: q */
    private final int f20344q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GameRequestEntity(int i, GameEntity gameEntity, PlayerEntity playerEntity, byte[] bArr, String str, ArrayList<PlayerEntity> arrayList, int i2, long j, long j2, Bundle bundle, int i3) {
        this.f20334g = i;
        this.f20335h = gameEntity;
        this.f20336i = playerEntity;
        this.f20337j = bArr;
        this.f20338k = str;
        this.f20339l = arrayList;
        this.f20340m = i2;
        this.f20341n = j;
        this.f20342o = j2;
        this.f20343p = bundle;
        this.f20344q = i3;
    }

    public GameRequestEntity(GameRequest gameRequest) {
        this.f20334g = 2;
        this.f20335h = new GameEntity(gameRequest.mo19181f());
        this.f20336i = new PlayerEntity(gameRequest.mo19180g());
        this.f20338k = gameRequest.mo19182e();
        this.f20340m = gameRequest.mo19178j();
        this.f20341n = gameRequest.mo19177k();
        this.f20342o = gameRequest.mo19176l();
        this.f20344q = gameRequest.mo19175m();
        byte[] mo19179i = gameRequest.mo19179i();
        if (mo19179i == null) {
            this.f20337j = null;
        } else {
            this.f20337j = new byte[mo19179i.length];
            System.arraycopy(mo19179i, 0, this.f20337j, 0, mo19179i.length);
        }
        List<Player> mo19174o = gameRequest.mo19174o();
        int size = mo19174o.size();
        this.f20339l = new ArrayList<>(size);
        this.f20343p = new Bundle();
        for (int i = 0; i < size; i++) {
            Player a = mo19174o.get(i).a();
            String mo20734c = a.mo20734c();
            this.f20339l.add((PlayerEntity) a);
            this.f20343p.putInt(mo20734c, gameRequest.mo19173p_(mo20734c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19191a(GameRequest gameRequest) {
        return C4585c.m23633a(gameRequest.mo19181f(), gameRequest.mo19174o(), gameRequest.mo19182e(), gameRequest.mo19180g(), m19187c(gameRequest), Integer.valueOf(gameRequest.mo19178j()), Long.valueOf(gameRequest.mo19177k()), Long.valueOf(gameRequest.mo19176l()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19190a(GameRequest gameRequest, Object obj) {
        if (!(obj instanceof GameRequest)) {
            return false;
        }
        if (gameRequest == obj) {
            return true;
        }
        GameRequest gameRequest2 = (GameRequest) obj;
        return C4585c.m23634a(gameRequest2.mo19181f(), gameRequest.mo19181f()) && C4585c.m23634a(gameRequest2.mo19174o(), gameRequest.mo19174o()) && C4585c.m23634a(gameRequest2.mo19182e(), gameRequest.mo19182e()) && C4585c.m23634a(gameRequest2.mo19180g(), gameRequest.mo19180g()) && Arrays.equals(m19187c(gameRequest2), m19187c(gameRequest)) && C4585c.m23634a(Integer.valueOf(gameRequest2.mo19178j()), Integer.valueOf(gameRequest.mo19178j())) && C4585c.m23634a(Long.valueOf(gameRequest2.mo19177k()), Long.valueOf(gameRequest.mo19177k())) && C4585c.m23634a(Long.valueOf(gameRequest2.mo19176l()), Long.valueOf(gameRequest.mo19176l()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19189b(GameRequest gameRequest) {
        return C4585c.m23635a(gameRequest).m23632a("Game", gameRequest.mo19181f()).m23632a("Sender", gameRequest.mo19180g()).m23632a("Recipients", gameRequest.mo19174o()).m23632a("Data", gameRequest.mo19179i()).m23632a("RequestId", gameRequest.mo19182e()).m23632a("Type", Integer.valueOf(gameRequest.mo19178j())).m23632a("CreationTimestamp", Long.valueOf(gameRequest.mo19177k())).m23632a("ExpirationTimestamp", Long.valueOf(gameRequest.mo19176l())).toString();
    }

    /* renamed from: c */
    private static int[] m19187c(GameRequest gameRequest) {
        List<Player> mo19174o = gameRequest.mo19174o();
        int size = mo19174o.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = gameRequest.mo19173p_(mo19174o.get(i).mo20734c());
        }
        return iArr;
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: a */
    public boolean mo19184a(String str) {
        return mo19173p_(str) == 1;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    /* renamed from: c */
    public int m19188c() {
        return this.f20334g;
    }

    /* renamed from: d */
    public Bundle m19186d() {
        return this.f20343p;
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: e */
    public String mo19182e() {
        return this.f20338k;
    }

    public boolean equals(Object obj) {
        return m19190a(this, obj);
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: f */
    public Game mo19181f() {
        return this.f20335h;
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: g */
    public Player mo19180g() {
        return this.f20336i;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: h */
    public GameRequest mo7785a() {
        return this;
    }

    public int hashCode() {
        return m19191a(this);
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: i */
    public byte[] mo19179i() {
        return this.f20337j;
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: j */
    public int mo19178j() {
        return this.f20340m;
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: k */
    public long mo19177k() {
        return this.f20341n;
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: l */
    public long mo19176l() {
        return this.f20342o;
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: m */
    public int mo19175m() {
        return this.f20344q;
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: o */
    public List<Player> mo19174o() {
        return new ArrayList(this.f20339l);
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: p_ */
    public int mo19173p_(String str) {
        return this.f20343p.getInt(str, 0);
    }

    public String toString() {
        return m19189b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5996b.m19169a(this, parcel, i);
    }
}
