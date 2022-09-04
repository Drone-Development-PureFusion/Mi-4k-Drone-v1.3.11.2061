package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.C5906h;
/* loaded from: classes2.dex */
public final class MilestoneRef extends AbstractC4531j implements Milestone {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MilestoneRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: j */
    private long m19238j() {
        return b("initial_value");
    }

    @Override // com.google.android.gms.games.quest.Milestone
    /* renamed from: c */
    public String mo19245c() {
        return e("external_milestone_id");
    }

    @Override // com.google.android.gms.games.quest.Milestone
    /* renamed from: d */
    public long mo19244d() {
        long b;
        long j = 0;
        switch (mo19242f()) {
            case 1:
                b = 0;
                break;
            case 2:
                b = b("current_value");
                if (b("quest_state") != 6) {
                    b -= m19238j();
                    break;
                }
                break;
            case 3:
            case 4:
                b = mo19241g();
                break;
            default:
                b = 0;
                break;
        }
        if (b < 0) {
            C5906h.m19938b("MilestoneRef", "Current progress should never be negative");
        } else {
            j = b;
        }
        if (j > mo19241g()) {
            C5906h.m19938b("MilestoneRef", "Current progress should never exceed target progress");
            return mo19241g();
        }
        return j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.quest.Milestone
    /* renamed from: e */
    public String mo19243e() {
        return e("external_event_id");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return MilestoneEntity.m19249a(this, obj);
    }

    @Override // com.google.android.gms.games.quest.Milestone
    /* renamed from: f */
    public int mo19242f() {
        return c("milestone_state");
    }

    @Override // com.google.android.gms.games.quest.Milestone
    /* renamed from: g */
    public long mo19241g() {
        return b("target_value");
    }

    @Override // com.google.android.gms.games.quest.Milestone
    /* renamed from: h */
    public byte[] mo19240h() {
        return g("completion_reward_data");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return MilestoneEntity.m19250a(this);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: i */
    public Milestone mo7785a() {
        return new MilestoneEntity(this);
    }

    public String toString() {
        return MilestoneEntity.m19248b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MilestoneEntity) ((Milestone) mo7785a())).writeToParcel(parcel, i);
    }
}
