package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4598n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class ZInvitationCluster extends AbstractSafeParcelable implements Invitation {
    public static final C5918a CREATOR = new C5918a();

    /* renamed from: c */
    private final int f20064c;

    /* renamed from: d */
    private final ArrayList<InvitationEntity> f20065d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZInvitationCluster(int i, ArrayList<InvitationEntity> arrayList) {
        this.f20064c = i;
        this.f20065d = arrayList;
        m19570n();
    }

    /* renamed from: n */
    private void m19570n() {
        C4598n.m23593a(!this.f20065d.isEmpty());
        InvitationEntity invitationEntity = this.f20065d.get(0);
        int size = this.f20065d.size();
        for (int i = 1; i < size; i++) {
            C4598n.m23592a(invitationEntity.mo19493g().equals(this.f20065d.get(i).mo19493g()), "All the invitations must be from the same inviter");
        }
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    /* renamed from: c */
    public int m19573c() {
        return this.f20064c;
    }

    /* renamed from: d */
    public ArrayList<Invitation> m19572d() {
        return new ArrayList<>(this.f20065d);
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: e */
    public Game mo19495e() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ZInvitationCluster)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ZInvitationCluster zInvitationCluster = (ZInvitationCluster) obj;
        if (zInvitationCluster.f20065d.size() != this.f20065d.size()) {
            return false;
        }
        int size = this.f20065d.size();
        for (int i = 0; i < size; i++) {
            if (!this.f20065d.get(i).equals(zInvitationCluster.f20065d.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: f */
    public String mo19494f() {
        return this.f20065d.get(0).mo19494f();
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: g */
    public Participant mo19493g() {
        return this.f20065d.get(0).mo19493g();
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: h */
    public long mo19492h() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int hashCode() {
        return C4585c.m23633a(this.f20065d.toArray());
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: i */
    public int mo19491i() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: j */
    public int mo19490j() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: k */
    public int mo19489k() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: l */
    public Invitation mo7785a() {
        return this;
    }

    @Override // com.google.android.gms.games.multiplayer.AbstractC5948j
    /* renamed from: m */
    public ArrayList<Participant> mo19340m() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5918a.m19567a(this, parcel, i);
    }
}
