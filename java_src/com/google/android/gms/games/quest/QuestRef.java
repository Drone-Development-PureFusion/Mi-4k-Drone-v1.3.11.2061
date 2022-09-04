package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class QuestRef extends AbstractC4531j implements Quest {

    /* renamed from: h */
    private final Game f20313h;

    /* renamed from: i */
    private final int f20314i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public QuestRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f20313h = new GameRef(dataHolder, i);
        this.f20314i = i2;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: a */
    public void mo19232a(CharArrayBuffer charArrayBuffer) {
        a("quest_name", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: b */
    public void mo19231b(CharArrayBuffer charArrayBuffer) {
        a("quest_description", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: c */
    public String mo19230c() {
        return e("external_quest_id");
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: d */
    public String mo19229d() {
        return e("quest_name");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: e */
    public String mo19228e() {
        return e("quest_description");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return QuestEntity.m19236a(this, obj);
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: f */
    public Uri mo19227f() {
        return h("quest_banner_image_uri");
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: g */
    public Uri mo19226g() {
        return h("quest_icon_image_uri");
    }

    @Override // com.google.android.gms.games.quest.Quest
    public String getBannerImageUrl() {
        return e("quest_banner_image_url");
    }

    @Override // com.google.android.gms.games.quest.Quest
    public String getIconImageUrl() {
        return e("quest_icon_image_url");
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: h */
    public Milestone mo19225h() {
        return mo19224i().get(0);
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return QuestEntity.m19237a(this);
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: i */
    public List<Milestone> mo19224i() {
        ArrayList arrayList = new ArrayList(this.f20314i);
        for (int i = 0; i < this.f20314i; i++) {
            arrayList.add(new MilestoneRef(this.f16909c_, this.f16910d_ + i));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: j */
    public Game mo19223j() {
        return this.f20313h;
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: k */
    public int mo19222k() {
        return c("quest_state");
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: l */
    public int mo19221l() {
        return c("quest_type");
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: m */
    public long mo19220m() {
        return b("accepted_ts");
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: n */
    public long mo19219n() {
        return b("quest_end_ts");
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: o */
    public long mo19218o() {
        return b("quest_last_updated_ts");
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: p */
    public long mo19217p() {
        return b("notification_ts");
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: q */
    public long mo19216q() {
        return b("quest_start_ts");
    }

    @Override // com.google.android.gms.games.quest.Quest
    /* renamed from: r */
    public boolean mo19215r() {
        return mo19217p() <= System.currentTimeMillis() + 1800000;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: s */
    public Quest mo7785a() {
        return new QuestEntity(this);
    }

    public String toString() {
        return QuestEntity.m19235b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((QuestEntity) ((Quest) mo7785a())).writeToParcel(parcel, i);
    }
}
