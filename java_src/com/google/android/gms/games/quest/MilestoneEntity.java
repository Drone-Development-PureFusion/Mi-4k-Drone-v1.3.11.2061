package com.google.android.gms.games.quest;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class MilestoneEntity extends AbstractSafeParcelable implements Milestone {
    public static final Parcelable.Creator<MilestoneEntity> CREATOR = new C5987b();

    /* renamed from: e */
    private final int f20282e;

    /* renamed from: f */
    private final String f20283f;

    /* renamed from: g */
    private final long f20284g;

    /* renamed from: h */
    private final long f20285h;

    /* renamed from: i */
    private final byte[] f20286i;

    /* renamed from: j */
    private final int f20287j;

    /* renamed from: k */
    private final String f20288k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MilestoneEntity(int i, String str, long j, long j2, byte[] bArr, int i2, String str2) {
        this.f20282e = i;
        this.f20283f = str;
        this.f20284g = j;
        this.f20285h = j2;
        this.f20286i = bArr;
        this.f20287j = i2;
        this.f20288k = str2;
    }

    public MilestoneEntity(Milestone milestone) {
        this.f20282e = 4;
        this.f20283f = milestone.mo19245c();
        this.f20284g = milestone.mo19244d();
        this.f20285h = milestone.mo19241g();
        this.f20287j = milestone.mo19242f();
        this.f20288k = milestone.mo19243e();
        byte[] mo19240h = milestone.mo19240h();
        if (mo19240h == null) {
            this.f20286i = null;
            return;
        }
        this.f20286i = new byte[mo19240h.length];
        System.arraycopy(mo19240h, 0, this.f20286i, 0, mo19240h.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19250a(Milestone milestone) {
        return C4585c.m23633a(milestone.mo19245c(), Long.valueOf(milestone.mo19244d()), Long.valueOf(milestone.mo19241g()), Integer.valueOf(milestone.mo19242f()), milestone.mo19243e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19249a(Milestone milestone, Object obj) {
        if (!(obj instanceof Milestone)) {
            return false;
        }
        if (milestone == obj) {
            return true;
        }
        Milestone milestone2 = (Milestone) obj;
        return C4585c.m23634a(milestone2.mo19245c(), milestone.mo19245c()) && C4585c.m23634a(Long.valueOf(milestone2.mo19244d()), Long.valueOf(milestone.mo19244d())) && C4585c.m23634a(Long.valueOf(milestone2.mo19241g()), Long.valueOf(milestone.mo19241g())) && C4585c.m23634a(Integer.valueOf(milestone2.mo19242f()), Integer.valueOf(milestone.mo19242f())) && C4585c.m23634a(milestone2.mo19243e(), milestone.mo19243e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19248b(Milestone milestone) {
        return C4585c.m23635a(milestone).m23632a("MilestoneId", milestone.mo19245c()).m23632a("CurrentProgress", Long.valueOf(milestone.mo19244d())).m23632a("TargetProgress", Long.valueOf(milestone.mo19241g())).m23632a("State", Integer.valueOf(milestone.mo19242f())).m23632a("CompletionRewardData", milestone.mo19240h()).m23632a("EventId", milestone.mo19243e()).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.quest.Milestone
    /* renamed from: c */
    public String mo19245c() {
        return this.f20283f;
    }

    @Override // com.google.android.gms.games.quest.Milestone
    /* renamed from: d */
    public long mo19244d() {
        return this.f20284g;
    }

    @Override // com.google.android.gms.games.quest.Milestone
    /* renamed from: e */
    public String mo19243e() {
        return this.f20288k;
    }

    public boolean equals(Object obj) {
        return m19249a(this, obj);
    }

    @Override // com.google.android.gms.games.quest.Milestone
    /* renamed from: f */
    public int mo19242f() {
        return this.f20287j;
    }

    @Override // com.google.android.gms.games.quest.Milestone
    /* renamed from: g */
    public long mo19241g() {
        return this.f20285h;
    }

    @Override // com.google.android.gms.games.quest.Milestone
    /* renamed from: h */
    public byte[] mo19240h() {
        return this.f20286i;
    }

    public int hashCode() {
        return m19250a(this);
    }

    /* renamed from: i */
    public int m19247i() {
        return this.f20282e;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: j */
    public Milestone mo7785a() {
        return this;
    }

    public String toString() {
        return m19248b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5987b.m19210a(this, parcel, i);
    }
}
