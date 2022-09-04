package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4684g;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class QuestEntity extends AbstractSafeParcelable implements Quest {
    public static final Parcelable.Creator<QuestEntity> CREATOR = new C5989d();

    /* renamed from: h */
    private final int f20296h;

    /* renamed from: i */
    private final GameEntity f20297i;

    /* renamed from: j */
    private final String f20298j;

    /* renamed from: k */
    private final long f20299k;

    /* renamed from: l */
    private final Uri f20300l;

    /* renamed from: m */
    private final String f20301m;

    /* renamed from: n */
    private final String f20302n;

    /* renamed from: o */
    private final long f20303o;

    /* renamed from: p */
    private final long f20304p;

    /* renamed from: q */
    private final Uri f20305q;

    /* renamed from: r */
    private final String f20306r;

    /* renamed from: s */
    private final String f20307s;

    /* renamed from: t */
    private final long f20308t;

    /* renamed from: u */
    private final long f20309u;

    /* renamed from: v */
    private final int f20310v;

    /* renamed from: w */
    private final int f20311w;

    /* renamed from: x */
    private final ArrayList<MilestoneEntity> f20312x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public QuestEntity(int i, GameEntity gameEntity, String str, long j, Uri uri, String str2, String str3, long j2, long j3, Uri uri2, String str4, String str5, long j4, long j5, int i2, int i3, ArrayList<MilestoneEntity> arrayList) {
        this.f20296h = i;
        this.f20297i = gameEntity;
        this.f20298j = str;
        this.f20299k = j;
        this.f20300l = uri;
        this.f20301m = str2;
        this.f20302n = str3;
        this.f20303o = j2;
        this.f20304p = j3;
        this.f20305q = uri2;
        this.f20306r = str4;
        this.f20307s = str5;
        this.f20308t = j4;
        this.f20309u = j5;
        this.f20310v = i2;
        this.f20311w = i3;
        this.f20312x = arrayList;
    }

    public QuestEntity(Quest quest) {
        this.f20296h = 2;
        this.f20297i = new GameEntity(quest.mo19223j());
        this.f20298j = quest.mo19230c();
        this.f20299k = quest.mo19220m();
        this.f20302n = quest.mo19228e();
        this.f20300l = quest.mo19227f();
        this.f20301m = quest.getBannerImageUrl();
        this.f20303o = quest.mo19219n();
        this.f20305q = quest.mo19226g();
        this.f20306r = quest.getIconImageUrl();
        this.f20304p = quest.mo19218o();
        this.f20307s = quest.mo19229d();
        this.f20308t = quest.mo19217p();
        this.f20309u = quest.mo19216q();
        this.f20310v = quest.mo19222k();
        this.f20311w = quest.mo19221l();
        List<Milestone> mo19224i = quest.mo19224i();
        int size = mo19224i.size();
        this.f20312x = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.f20312x.add((MilestoneEntity) mo19224i.get(i).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19237a(Quest quest) {
        return C4585c.m23633a(quest.mo19223j(), quest.mo19230c(), Long.valueOf(quest.mo19220m()), quest.mo19227f(), quest.mo19228e(), Long.valueOf(quest.mo19219n()), quest.mo19226g(), Long.valueOf(quest.mo19218o()), quest.mo19224i(), quest.mo19229d(), Long.valueOf(quest.mo19217p()), Long.valueOf(quest.mo19216q()), Integer.valueOf(quest.mo19222k()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19236a(Quest quest, Object obj) {
        if (!(obj instanceof Quest)) {
            return false;
        }
        if (quest == obj) {
            return true;
        }
        Quest quest2 = (Quest) obj;
        return C4585c.m23634a(quest2.mo19223j(), quest.mo19223j()) && C4585c.m23634a(quest2.mo19230c(), quest.mo19230c()) && C4585c.m23634a(Long.valueOf(quest2.mo19220m()), Long.valueOf(quest.mo19220m())) && C4585c.m23634a(quest2.mo19227f(), quest.mo19227f()) && C4585c.m23634a(quest2.mo19228e(), quest.mo19228e()) && C4585c.m23634a(Long.valueOf(quest2.mo19219n()), Long.valueOf(quest.mo19219n())) && C4585c.m23634a(quest2.mo19226g(), quest.mo19226g()) && C4585c.m23634a(Long.valueOf(quest2.mo19218o()), Long.valueOf(quest.mo19218o())) && C4585c.m23634a(quest2.mo19224i(), quest.mo19224i()) && C4585c.m23634a(quest2.mo19229d(), quest.mo19229d()) && C4585c.m23634a(Long.valueOf(quest2.mo19217p()), Long.valueOf(quest.mo19217p())) && C4585c.m23634a(Long.valueOf(quest2.mo19216q()), Long.valueOf(quest.mo19216q())) && C4585c.m23634a(Integer.valueOf(quest2.mo19222k()), Integer.valueOf(quest.mo19222k()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19235b(Quest quest) {
        return C4585c.m23635a(quest).m23632a("Game", quest.mo19223j()).m23632a("QuestId", quest.mo19230c()).m23632a("AcceptedTimestamp", Long.valueOf(quest.mo19220m())).m23632a("BannerImageUri", quest.mo19227f()).m23632a("BannerImageUrl", quest.getBannerImageUrl()).m23632a("Description", quest.mo19228e()).m23632a("EndTimestamp", Long.valueOf(quest.mo19219n())).m23632a("IconImageUri", quest.mo19226g()).m23632a("IconImageUrl", quest.getIconImageUrl()).m23632a("LastUpdatedTimestamp", Long.valueOf(quest.mo19218o())).m23632a("Milestones", quest.mo19224i()).m23632a("Name", quest.mo19229d()).m23632a("NotifyTimestamp", Long.valueOf(quest.mo19217p())).m23632a("StartTimestamp", Long.valueOf(quest.mo19216q())).m23632a("State", Integer.valueOf(quest.mo19222k())).toString();
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: a */
    public void mo19232a(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f20307s, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: b */
    public void mo19231b(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f20302n, charArrayBuffer);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: c */
    public String mo19230c() {
        return this.f20298j;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: d */
    public String mo19229d() {
        return this.f20307s;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: e */
    public String mo19228e() {
        return this.f20302n;
    }

    public boolean equals(Object obj) {
        return m19236a(this, obj);
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: f */
    public Uri mo19227f() {
        return this.f20300l;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: g */
    public Uri mo19226g() {
        return this.f20305q;
    }

    @Override // com.google.android.gms.games.quest.Quest
    public String getBannerImageUrl() {
        return this.f20301m;
    }

    @Override // com.google.android.gms.games.quest.Quest
    public String getIconImageUrl() {
        return this.f20306r;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: h */
    public Milestone mo19225h() {
        return mo19224i().get(0);
    }

    public int hashCode() {
        return m19237a(this);
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: i */
    public List<Milestone> mo19224i() {
        return new ArrayList(this.f20312x);
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: j */
    public Game mo19223j() {
        return this.f20297i;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: k */
    public int mo19222k() {
        return this.f20310v;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: l */
    public int mo19221l() {
        return this.f20311w;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: m */
    public long mo19220m() {
        return this.f20299k;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: n */
    public long mo19219n() {
        return this.f20303o;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: o */
    public long mo19218o() {
        return this.f20304p;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: p */
    public long mo19217p() {
        return this.f20308t;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: q */
    public long mo19216q() {
        return this.f20309u;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: r */
    public boolean mo19215r() {
        return this.f20308t <= System.currentTimeMillis() + 1800000;
    }

    /* renamed from: s */
    public int m19234s() {
        return this.f20296h;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: t */
    public Quest mo7785a() {
        return this;
    }

    public String toString() {
        return m19235b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5989d.m19206a(this, parcel, i);
    }
}
