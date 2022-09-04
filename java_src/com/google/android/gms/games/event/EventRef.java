package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
/* loaded from: classes2.dex */
public final class EventRef extends AbstractC4531j implements Event {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EventRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: a */
    public void mo20473a(CharArrayBuffer charArrayBuffer) {
        a("name", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: b */
    public void mo20472b(CharArrayBuffer charArrayBuffer) {
        a("description", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: c */
    public String mo20471c() {
        return e("external_event_id");
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: c */
    public void mo20470c(CharArrayBuffer charArrayBuffer) {
        a("formatted_value", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: d */
    public String mo20469d() {
        return e("name");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: e */
    public String mo20468e() {
        return e("description");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return EventEntity.m20477a(this, obj);
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: f */
    public Uri mo20467f() {
        return h("icon_image_uri");
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: g */
    public Player mo20466g() {
        return new PlayerRef(this.f16909c_, this.f16910d_);
    }

    @Override // com.google.android.gms.games.event.Event
    public String getIconImageUrl() {
        return e("icon_image_url");
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: h */
    public long mo20465h() {
        return b("value");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return EventEntity.m20478a(this);
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: i */
    public String mo20464i() {
        return e("formatted_value");
    }

    @Override // com.google.android.gms.games.event.Event
    /* renamed from: j */
    public boolean mo20463j() {
        return d("visibility");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: k */
    public Event mo7785a() {
        return new EventEntity(this);
    }

    public String toString() {
        return EventEntity.m20476b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((EventEntity) ((Event) mo7785a())).writeToParcel(parcel, i);
    }
}
