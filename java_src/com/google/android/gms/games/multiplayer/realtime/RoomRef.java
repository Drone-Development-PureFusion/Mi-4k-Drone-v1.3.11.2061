package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class RoomRef extends AbstractC4531j implements Room {

    /* renamed from: f */
    private final int f20216f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RoomRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f20216f = i2;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: a */
    public int mo19426a(String str) {
        return RoomEntity.m19437a((Room) this, str);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: a */
    public void mo19427a(CharArrayBuffer charArrayBuffer) {
        a("description", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: c */
    public String mo19425c() {
        return e("external_match_id");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: d */
    public String mo19424d() {
        return e("creator_external");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: e */
    public long mo19423e() {
        return b("creation_timestamp");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return RoomEntity.m19438a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: f */
    public int mo19422f() {
        return c("status");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: g */
    public String mo19421g() {
        return e("description");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: h */
    public int mo19420h() {
        return c("variant");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return RoomEntity.m19439a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: i */
    public Bundle mo19419i() {
        if (!d("has_automatch_criteria")) {
            return null;
        }
        return AbstractC5955d.m19398a(c("automatch_min_players"), c("automatch_max_players"), b("automatch_bit_mask"));
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: j */
    public int mo19418j() {
        return c("automatch_wait_estimate_sec");
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: k */
    public ArrayList<String> mo19417k() {
        return RoomEntity.m19433c(this);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: k_ */
    public String mo19416k_(String str) {
        return RoomEntity.m19434b(this, str);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: l */
    public Room mo7785a() {
        return new RoomEntity(this);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: l_ */
    public Participant mo19414l_(String str) {
        return RoomEntity.m19432c(this, str);
    }

    @Override // com.google.android.gms.games.multiplayer.AbstractC5948j
    /* renamed from: m */
    public ArrayList<Participant> mo19340m() {
        ArrayList<Participant> arrayList = new ArrayList<>(this.f20216f);
        for (int i = 0; i < this.f20216f; i++) {
            arrayList.add(new ParticipantRef(this.f16909c_, this.f16910d_ + i));
        }
        return arrayList;
    }

    public String toString() {
        return RoomEntity.m19435b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((RoomEntity) ((Room) mo7785a())).writeToParcel(parcel, i);
    }
}
