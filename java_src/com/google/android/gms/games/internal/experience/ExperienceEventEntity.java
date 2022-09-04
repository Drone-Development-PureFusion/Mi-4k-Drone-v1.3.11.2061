package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
/* loaded from: classes2.dex */
public final class ExperienceEventEntity extends AbstractSafeParcelable implements ExperienceEvent {
    public static final C5846b CREATOR = new C5846b();

    /* renamed from: a */
    private final int f19992a;

    /* renamed from: b */
    private final String f19993b;

    /* renamed from: c */
    private final GameEntity f19994c;

    /* renamed from: d */
    private final String f19995d;

    /* renamed from: e */
    private final String f19996e;

    /* renamed from: f */
    private final String f19997f;

    /* renamed from: g */
    private final Uri f19998g;

    /* renamed from: h */
    private final long f19999h;

    /* renamed from: i */
    private final long f20000i;

    /* renamed from: j */
    private final long f20001j;

    /* renamed from: k */
    private final int f20002k;

    /* renamed from: l */
    private final int f20003l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExperienceEventEntity(int i, String str, GameEntity gameEntity, String str2, String str3, String str4, Uri uri, long j, long j2, long j3, int i2, int i3) {
        this.f19992a = i;
        this.f19993b = str;
        this.f19994c = gameEntity;
        this.f19995d = str2;
        this.f19996e = str3;
        this.f19997f = str4;
        this.f19998g = uri;
        this.f19999h = j;
        this.f20000i = j2;
        this.f20001j = j3;
        this.f20002k = i2;
        this.f20003l = i3;
    }

    public ExperienceEventEntity(ExperienceEvent experienceEvent) {
        this.f19992a = 1;
        this.f19993b = experienceEvent.mo19982c();
        this.f19994c = new GameEntity(experienceEvent.mo19981d());
        this.f19995d = experienceEvent.mo19980e();
        this.f19996e = experienceEvent.mo19979f();
        this.f19997f = experienceEvent.getIconImageUrl();
        this.f19998g = experienceEvent.mo19978g();
        this.f19999h = experienceEvent.mo19977h();
        this.f20000i = experienceEvent.mo19976i();
        this.f20001j = experienceEvent.mo19975j();
        this.f20002k = experienceEvent.mo19974k();
        this.f20003l = experienceEvent.mo19973l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19987a(ExperienceEvent experienceEvent) {
        return C4585c.m23633a(experienceEvent.mo19982c(), experienceEvent.mo19981d(), experienceEvent.mo19980e(), experienceEvent.mo19979f(), experienceEvent.getIconImageUrl(), experienceEvent.mo19978g(), Long.valueOf(experienceEvent.mo19977h()), Long.valueOf(experienceEvent.mo19976i()), Long.valueOf(experienceEvent.mo19975j()), Integer.valueOf(experienceEvent.mo19974k()), Integer.valueOf(experienceEvent.mo19973l()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19986a(ExperienceEvent experienceEvent, Object obj) {
        if (!(obj instanceof ExperienceEvent)) {
            return false;
        }
        if (experienceEvent == obj) {
            return true;
        }
        ExperienceEvent experienceEvent2 = (ExperienceEvent) obj;
        return C4585c.m23634a(experienceEvent2.mo19982c(), experienceEvent.mo19982c()) && C4585c.m23634a(experienceEvent2.mo19981d(), experienceEvent.mo19981d()) && C4585c.m23634a(experienceEvent2.mo19980e(), experienceEvent.mo19980e()) && C4585c.m23634a(experienceEvent2.mo19979f(), experienceEvent.mo19979f()) && C4585c.m23634a(experienceEvent2.getIconImageUrl(), experienceEvent.getIconImageUrl()) && C4585c.m23634a(experienceEvent2.mo19978g(), experienceEvent.mo19978g()) && C4585c.m23634a(Long.valueOf(experienceEvent2.mo19977h()), Long.valueOf(experienceEvent.mo19977h())) && C4585c.m23634a(Long.valueOf(experienceEvent2.mo19976i()), Long.valueOf(experienceEvent.mo19976i())) && C4585c.m23634a(Long.valueOf(experienceEvent2.mo19975j()), Long.valueOf(experienceEvent.mo19975j())) && C4585c.m23634a(Integer.valueOf(experienceEvent2.mo19974k()), Integer.valueOf(experienceEvent.mo19974k())) && C4585c.m23634a(Integer.valueOf(experienceEvent2.mo19973l()), Integer.valueOf(experienceEvent.mo19973l()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19985b(ExperienceEvent experienceEvent) {
        return C4585c.m23635a(experienceEvent).m23632a("ExperienceId", experienceEvent.mo19982c()).m23632a("Game", experienceEvent.mo19981d()).m23632a("DisplayTitle", experienceEvent.mo19980e()).m23632a("DisplayDescription", experienceEvent.mo19979f()).m23632a("IconImageUrl", experienceEvent.getIconImageUrl()).m23632a("IconImageUri", experienceEvent.mo19978g()).m23632a("CreatedTimestamp", Long.valueOf(experienceEvent.mo19977h())).m23632a("XpEarned", Long.valueOf(experienceEvent.mo19976i())).m23632a("CurrentXp", Long.valueOf(experienceEvent.mo19975j())).m23632a("Type", Integer.valueOf(experienceEvent.mo19974k())).m23632a("NewLevel", Integer.valueOf(experienceEvent.mo19973l())).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: c */
    public String mo19982c() {
        return this.f19993b;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: d */
    public Game mo19981d() {
        return this.f19994c;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: e */
    public String mo19980e() {
        return this.f19995d;
    }

    public boolean equals(Object obj) {
        return m19986a(this, obj);
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: f */
    public String mo19979f() {
        return this.f19996e;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: g */
    public Uri mo19978g() {
        return this.f19998g;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public String getIconImageUrl() {
        return this.f19997f;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: h */
    public long mo19977h() {
        return this.f19999h;
    }

    public int hashCode() {
        return m19987a(this);
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: i */
    public long mo19976i() {
        return this.f20000i;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: j */
    public long mo19975j() {
        return this.f20001j;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: k */
    public int mo19974k() {
        return this.f20002k;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    /* renamed from: l */
    public int mo19973l() {
        return this.f20003l;
    }

    /* renamed from: m */
    public int m19984m() {
        return this.f19992a;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: n */
    public ExperienceEvent mo7785a() {
        return this;
    }

    public String toString() {
        return m19985b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5846b.m19968a(this, parcel, i);
    }
}
