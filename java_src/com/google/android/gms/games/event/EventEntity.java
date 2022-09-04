package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4684g;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
/* loaded from: classes2.dex */
public final class EventEntity extends AbstractSafeParcelable implements Event {
    public static final C5381b CREATOR = new C5381b();

    /* renamed from: a */
    private final int f19459a;

    /* renamed from: b */
    private final String f19460b;

    /* renamed from: c */
    private final String f19461c;

    /* renamed from: d */
    private final String f19462d;

    /* renamed from: e */
    private final Uri f19463e;

    /* renamed from: f */
    private final String f19464f;

    /* renamed from: g */
    private final PlayerEntity f19465g;

    /* renamed from: h */
    private final long f19466h;

    /* renamed from: i */
    private final String f19467i;

    /* renamed from: j */
    private final boolean f19468j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EventEntity(int i, String str, String str2, String str3, Uri uri, String str4, Player player, long j, String str5, boolean z) {
        this.f19459a = i;
        this.f19460b = str;
        this.f19461c = str2;
        this.f19462d = str3;
        this.f19463e = uri;
        this.f19464f = str4;
        this.f19465g = new PlayerEntity(player);
        this.f19466h = j;
        this.f19467i = str5;
        this.f19468j = z;
    }

    public EventEntity(Event event) {
        this.f19459a = 1;
        this.f19460b = event.mo20471c();
        this.f19461c = event.mo20469d();
        this.f19462d = event.mo20468e();
        this.f19463e = event.mo20467f();
        this.f19464f = event.getIconImageUrl();
        this.f19465g = (PlayerEntity) event.mo20466g().a();
        this.f19466h = event.mo20465h();
        this.f19467i = event.mo20464i();
        this.f19468j = event.mo20463j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20478a(Event event) {
        return C4585c.m23633a(event.mo20471c(), event.mo20469d(), event.mo20468e(), event.mo20467f(), event.getIconImageUrl(), event.mo20466g(), Long.valueOf(event.mo20465h()), event.mo20464i(), Boolean.valueOf(event.mo20463j()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m20477a(Event event, Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        if (event == obj) {
            return true;
        }
        Event event2 = (Event) obj;
        return C4585c.m23634a(event2.mo20471c(), event.mo20471c()) && C4585c.m23634a(event2.mo20469d(), event.mo20469d()) && C4585c.m23634a(event2.mo20468e(), event.mo20468e()) && C4585c.m23634a(event2.mo20467f(), event.mo20467f()) && C4585c.m23634a(event2.getIconImageUrl(), event.getIconImageUrl()) && C4585c.m23634a(event2.mo20466g(), event.mo20466g()) && C4585c.m23634a(Long.valueOf(event2.mo20465h()), Long.valueOf(event.mo20465h())) && C4585c.m23634a(event2.mo20464i(), event.mo20464i()) && C4585c.m23634a(Boolean.valueOf(event2.mo20463j()), Boolean.valueOf(event.mo20463j()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m20476b(Event event) {
        return C4585c.m23635a(event).m23632a("Id", event.mo20471c()).m23632a("Name", event.mo20469d()).m23632a("Description", event.mo20468e()).m23632a("IconImageUri", event.mo20467f()).m23632a("IconImageUrl", event.getIconImageUrl()).m23632a("Player", event.mo20466g()).m23632a("Value", Long.valueOf(event.mo20465h())).m23632a("FormattedValue", event.mo20464i()).m23632a("isVisible", Boolean.valueOf(event.mo20463j())).toString();
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: a */
    public void mo20473a(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f19461c, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: b */
    public void mo20472b(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f19462d, charArrayBuffer);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: c */
    public String mo20471c() {
        return this.f19460b;
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: c */
    public void mo20470c(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f19467i, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: d */
    public String mo20469d() {
        return this.f19461c;
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: e */
    public String mo20468e() {
        return this.f19462d;
    }

    public boolean equals(Object obj) {
        return m20477a(this, obj);
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: f */
    public Uri mo20467f() {
        return this.f19463e;
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: g */
    public Player mo20466g() {
        return this.f19465g;
    }

    @Override // com.google.android.gms.games.event.Event
    public String getIconImageUrl() {
        return this.f19464f;
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: h */
    public long mo20465h() {
        return this.f19466h;
    }

    public int hashCode() {
        return m20478a(this);
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: i */
    public String mo20464i() {
        return this.f19467i;
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: j */
    public boolean mo20463j() {
        return this.f19468j;
    }

    /* renamed from: k */
    public int m20475k() {
        return this.f19459a;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: l */
    public Event mo7785a() {
        return this;
    }

    public String toString() {
        return m20476b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5381b.m20458a(this, parcel, i);
    }
}
