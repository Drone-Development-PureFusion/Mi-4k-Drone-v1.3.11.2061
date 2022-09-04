package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.util.C4684g;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class RoomEntity extends GamesDowngradeableSafeParcel implements Room {
    public static final Parcelable.Creator<RoomEntity> CREATOR = new C5950a();

    /* renamed from: f */
    private final int f20206f;

    /* renamed from: g */
    private final String f20207g;

    /* renamed from: h */
    private final String f20208h;

    /* renamed from: i */
    private final long f20209i;

    /* renamed from: j */
    private final int f20210j;

    /* renamed from: k */
    private final String f20211k;

    /* renamed from: l */
    private final int f20212l;

    /* renamed from: m */
    private final Bundle f20213m;

    /* renamed from: n */
    private final ArrayList<ParticipantEntity> f20214n;

    /* renamed from: o */
    private final int f20215o;

    /* renamed from: com.google.android.gms.games.multiplayer.realtime.RoomEntity$a */
    /* loaded from: classes2.dex */
    static final class C5950a extends C5959f {
        C5950a() {
        }

        @Override // com.google.android.gms.games.multiplayer.realtime.C5959f, android.os.Parcelable.Creator
        /* renamed from: a */
        public RoomEntity createFromParcel(Parcel parcel) {
            if (RoomEntity.b(RoomEntity.q_()) || RoomEntity.j_(RoomEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            Bundle readBundle = parcel.readBundle();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i = 0; i < readInt3; i++) {
                arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
            }
            return new RoomEntity(2, readString, readString2, readLong, readInt, readString3, readInt2, readBundle, arrayList, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RoomEntity(int i, String str, String str2, long j, int i2, String str3, int i3, Bundle bundle, ArrayList<ParticipantEntity> arrayList, int i4) {
        this.f20206f = i;
        this.f20207g = str;
        this.f20208h = str2;
        this.f20209i = j;
        this.f20210j = i2;
        this.f20211k = str3;
        this.f20212l = i3;
        this.f20213m = bundle;
        this.f20214n = arrayList;
        this.f20215o = i4;
    }

    public RoomEntity(Room room) {
        this.f20206f = 2;
        this.f20207g = room.mo19425c();
        this.f20208h = room.mo19424d();
        this.f20209i = room.mo19423e();
        this.f20210j = room.mo19422f();
        this.f20211k = room.mo19421g();
        this.f20212l = room.mo19420h();
        this.f20213m = room.mo19419i();
        ArrayList<Participant> m = room.m();
        int size = m.size();
        this.f20214n = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.f20214n.add((ParticipantEntity) m.get(i).a());
        }
        this.f20215o = room.mo19418j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19439a(Room room) {
        return C4585c.m23633a(room.mo19425c(), room.mo19424d(), Long.valueOf(room.mo19423e()), Integer.valueOf(room.mo19422f()), room.mo19421g(), Integer.valueOf(room.mo19420h()), room.mo19419i(), room.m(), Integer.valueOf(room.mo19418j()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19437a(Room room, String str) {
        ArrayList<Participant> m = room.m();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            Participant participant = m.get(i);
            if (participant.mo19472j().equals(str)) {
                return participant.mo19479c();
            }
        }
        String valueOf = String.valueOf(room.mo19425c());
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(valueOf).length()).append("Participant ").append(str).append(" is not in room ").append(valueOf).toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19438a(Room room, Object obj) {
        if (!(obj instanceof Room)) {
            return false;
        }
        if (room == obj) {
            return true;
        }
        Room room2 = (Room) obj;
        return C4585c.m23634a(room2.mo19425c(), room.mo19425c()) && C4585c.m23634a(room2.mo19424d(), room.mo19424d()) && C4585c.m23634a(Long.valueOf(room2.mo19423e()), Long.valueOf(room.mo19423e())) && C4585c.m23634a(Integer.valueOf(room2.mo19422f()), Integer.valueOf(room.mo19422f())) && C4585c.m23634a(room2.mo19421g(), room.mo19421g()) && C4585c.m23634a(Integer.valueOf(room2.mo19420h()), Integer.valueOf(room.mo19420h())) && C4585c.m23634a(room2.mo19419i(), room.mo19419i()) && C4585c.m23634a(room2.m(), room.m()) && C4585c.m23634a(Integer.valueOf(room2.mo19418j()), Integer.valueOf(room.mo19418j()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19435b(Room room) {
        return C4585c.m23635a(room).m23632a("RoomId", room.mo19425c()).m23632a("CreatorId", room.mo19424d()).m23632a("CreationTimestamp", Long.valueOf(room.mo19423e())).m23632a("RoomStatus", Integer.valueOf(room.mo19422f())).m23632a("Description", room.mo19421g()).m23632a("Variant", Integer.valueOf(room.mo19420h())).m23632a("AutoMatchCriteria", room.mo19419i()).m23632a("Participants", room.m()).m23632a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.mo19418j())).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19434b(Room room, String str) {
        ArrayList<Participant> m = room.m();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            Participant participant = m.get(i);
            Player mo19471k = participant.mo19471k();
            if (mo19471k != null && mo19471k.mo20734c().equals(str)) {
                return participant.mo19472j();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Participant m19432c(Room room, String str) {
        ArrayList<Participant> m = room.m();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            Participant participant = m.get(i);
            if (participant.mo19472j().equals(str)) {
                return participant;
            }
        }
        String valueOf = String.valueOf(room.mo19425c());
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf).length()).append("Participant ").append(str).append(" is not in match ").append(valueOf).toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static ArrayList<String> m19433c(Room room) {
        ArrayList<Participant> m = room.m();
        int size = m.size();
        ArrayList<String> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(m.get(i).mo19472j());
        }
        return arrayList;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: a */
    public int mo19426a(String str) {
        return m19437a((Room) this, str);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: a */
    public void mo19427a(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f20211k, charArrayBuffer);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: c */
    public String mo19425c() {
        return this.f20207g;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: d */
    public String mo19424d() {
        return this.f20208h;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: e */
    public long mo19423e() {
        return this.f20209i;
    }

    public boolean equals(Object obj) {
        return m19438a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: f */
    public int mo19422f() {
        return this.f20210j;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: g */
    public String mo19421g() {
        return this.f20211k;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: h */
    public int mo19420h() {
        return this.f20212l;
    }

    public int hashCode() {
        return m19439a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: i */
    public Bundle mo19419i() {
        return this.f20213m;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: j */
    public int mo19418j() {
        return this.f20215o;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: k */
    public ArrayList<String> mo19417k() {
        return m19433c(this);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: k_ */
    public String mo19416k_(String str) {
        return m19434b(this, str);
    }

    /* renamed from: l */
    public int m19430l() {
        return this.f20206f;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* renamed from: l_ */
    public Participant mo19414l_(String str) {
        return m19432c(this, str);
    }

    @Override // com.google.android.gms.games.multiplayer.AbstractC5948j
    /* renamed from: m */
    public ArrayList<Participant> mo19340m() {
        return new ArrayList<>(this.f20214n);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: n */
    public Room mo7785a() {
        return this;
    }

    public String toString() {
        return m19435b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (!r_()) {
            C5959f.m19379a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f20207g);
        parcel.writeString(this.f20208h);
        parcel.writeLong(this.f20209i);
        parcel.writeInt(this.f20210j);
        parcel.writeString(this.f20211k);
        parcel.writeInt(this.f20212l);
        parcel.writeBundle(this.f20213m);
        int size = this.f20214n.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f20214n.get(i2).writeToParcel(parcel, i);
        }
    }
}
