package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4598n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class GameRequestCluster extends AbstractSafeParcelable implements GameRequest {
    public static final C5928a CREATOR = new C5928a();

    /* renamed from: g */
    private final int f20132g;

    /* renamed from: h */
    private final ArrayList<GameRequestEntity> f20133h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GameRequestCluster(int i, ArrayList<GameRequestEntity> arrayList) {
        this.f20132g = i;
        this.f20133h = arrayList;
        m19524p();
    }

    /* renamed from: p */
    private void m19524p() {
        C4598n.m23593a(!this.f20133h.isEmpty());
        GameRequestEntity gameRequestEntity = this.f20133h.get(0);
        int size = this.f20133h.size();
        for (int i = 1; i < size; i++) {
            GameRequestEntity gameRequestEntity2 = this.f20133h.get(i);
            C4598n.m23592a(gameRequestEntity.mo19178j() == gameRequestEntity2.mo19178j(), "All the requests must be of the same type");
            C4598n.m23592a(gameRequestEntity.mo19180g().equals(gameRequestEntity2.mo19180g()), "All the requests must be from the same sender");
        }
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: a */
    public boolean mo19184a(String str) {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    /* renamed from: c */
    public int m19528c() {
        return this.f20132g;
    }

    /* renamed from: d */
    public ArrayList<GameRequest> m19527d() {
        return new ArrayList<>(this.f20133h);
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: e */
    public String mo19182e() {
        return this.f20133h.get(0).mo19182e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GameRequestCluster)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        GameRequestCluster gameRequestCluster = (GameRequestCluster) obj;
        if (gameRequestCluster.f20133h.size() != this.f20133h.size()) {
            return false;
        }
        int size = this.f20133h.size();
        for (int i = 0; i < size; i++) {
            if (!this.f20133h.get(i).equals(gameRequestCluster.f20133h.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: f */
    public Game mo19181f() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: g */
    public Player mo19180g() {
        return this.f20133h.get(0).mo19180g();
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: h */
    public ArrayList<Player> mo19174o() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int hashCode() {
        return C4585c.m23633a(this.f20133h.toArray());
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: i */
    public byte[] mo19179i() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: j */
    public int mo19178j() {
        return this.f20133h.get(0).mo19178j();
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: k */
    public long mo19177k() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: l */
    public long mo19176l() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: m */
    public int mo19175m() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: n */
    public GameRequest mo7785a() {
        return this;
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: p_ */
    public int mo19173p_(String str) {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5928a.m19521a(this, parcel, i);
    }
}
