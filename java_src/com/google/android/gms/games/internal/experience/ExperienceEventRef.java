package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
/* loaded from: classes2.dex */
public final class ExperienceEventRef extends AbstractC4531j implements ExperienceEvent {

    /* renamed from: c */
    private final GameRef f20004c;

    public ExperienceEventRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        if (i("external_game_id")) {
            this.f20004c = null;
        } else {
            this.f20004c = new GameRef(this.f16909c_, this.f16910d_);
        }
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: c */
    public String mo19982c() {
        return e("external_experience_id");
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: d */
    public Game mo19981d() {
        return this.f20004c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: e */
    public String mo19980e() {
        return e("display_title");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return ExperienceEventEntity.m19986a(this, obj);
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: f */
    public String mo19979f() {
        return e("display_description");
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: g */
    public Uri mo19978g() {
        return h("icon_uri");
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public String getIconImageUrl() {
        return e("icon_url");
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: h */
    public long mo19977h() {
        return b("created_timestamp");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return ExperienceEventEntity.m19987a(this);
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: i */
    public long mo19976i() {
        return b("xp_earned");
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: j */
    public long mo19975j() {
        return b("current_xp");
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: k */
    public int mo19974k() {
        return c("type");
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: l */
    public int mo19973l() {
        return c("newLevel");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: m */
    public ExperienceEvent mo7785a() {
        return new ExperienceEventEntity(this);
    }

    public String toString() {
        return ExperienceEventEntity.m19985b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((ExperienceEventEntity) ((ExperienceEvent) mo7785a())).writeToParcel(parcel, i);
    }
}
