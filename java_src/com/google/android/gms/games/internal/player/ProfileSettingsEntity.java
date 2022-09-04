package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.AbstractC5978n;
/* loaded from: classes2.dex */
public class ProfileSettingsEntity extends AbstractSafeParcelable implements AbstractC5978n.AbstractC5980b {
    public static final C5925c CREATOR = new C5925c();

    /* renamed from: a */
    private final int f20085a;

    /* renamed from: b */
    private final Status f20086b;

    /* renamed from: c */
    private final String f20087c;

    /* renamed from: d */
    private final boolean f20088d;

    /* renamed from: e */
    private final boolean f20089e;

    /* renamed from: f */
    private final boolean f20090f;

    /* renamed from: g */
    private final StockProfileImageEntity f20091g;

    /* renamed from: h */
    private final boolean f20092h;

    /* renamed from: i */
    private final boolean f20093i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProfileSettingsEntity(int i, Status status, String str, boolean z, boolean z2, boolean z3, StockProfileImageEntity stockProfileImageEntity, boolean z4, boolean z5) {
        this.f20085a = i;
        this.f20086b = status;
        this.f20087c = str;
        this.f20088d = z;
        this.f20089e = z2;
        this.f20090f = z3;
        this.f20091g = stockProfileImageEntity;
        this.f20092h = z4;
        this.f20093i = z5;
    }

    public ProfileSettingsEntity(DataHolder dataHolder) {
        this.f20085a = 3;
        this.f20086b = new Status(dataHolder.m23883e());
        if (!this.f20086b.m24018f() || dataHolder.m23879g() <= 0) {
            this.f20087c = null;
            this.f20088d = false;
            this.f20089e = false;
            this.f20090f = false;
            this.f20091g = null;
            this.f20092h = false;
            this.f20093i = false;
            return;
        }
        int m23898a = dataHolder.m23898a(0);
        this.f20087c = dataHolder.m23886c("gamer_tag", 0, m23898a);
        this.f20088d = dataHolder.m23884d("gamer_tag_explicitly_set", 0, m23898a);
        this.f20089e = dataHolder.m23884d("profile_visible", 0, m23898a);
        this.f20090f = dataHolder.m23884d("profile_visibility_explicitly_set", 0, m23898a);
        String m23886c = dataHolder.m23886c("stock_avatar_url", 0, m23898a);
        String m23886c2 = dataHolder.m23886c("stock_avatar_uri", 0, m23898a);
        if (TextUtils.isEmpty(m23886c) || TextUtils.isEmpty(m23886c2)) {
            this.f20091g = null;
        } else {
            this.f20091g = new StockProfileImageEntity(m23886c, Uri.parse(m23886c2));
        }
        this.f20092h = dataHolder.m23884d("profile_discoverable", 0, m23898a);
        this.f20093i = dataHolder.m23884d("auto_sign_in", 0, m23898a);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f20086b;
    }

    @Override // com.google.android.gms.games.AbstractC5978n.AbstractC5980b
    /* renamed from: b */
    public boolean mo19257b() {
        return this.f20089e;
    }

    @Override // com.google.android.gms.games.AbstractC5978n.AbstractC5980b
    /* renamed from: c */
    public boolean mo19256c() {
        return this.f20090f;
    }

    @Override // com.google.android.gms.games.AbstractC5978n.AbstractC5980b
    /* renamed from: d */
    public String mo19255d() {
        return this.f20087c;
    }

    @Override // com.google.android.gms.games.AbstractC5978n.AbstractC5980b
    /* renamed from: e */
    public StockProfileImage mo19254e() {
        return this.f20091g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC5978n.AbstractC5980b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        AbstractC5978n.AbstractC5980b abstractC5980b = (AbstractC5978n.AbstractC5980b) obj;
        return C4585c.m23634a(this.f20087c, abstractC5980b.mo19255d()) && C4585c.m23634a(Boolean.valueOf(this.f20088d), Boolean.valueOf(abstractC5980b.mo19253f())) && C4585c.m23634a(Boolean.valueOf(this.f20089e), Boolean.valueOf(abstractC5980b.mo19257b())) && C4585c.m23634a(Boolean.valueOf(this.f20090f), Boolean.valueOf(abstractC5980b.mo19256c())) && C4585c.m23634a(this.f20086b, abstractC5980b.a()) && C4585c.m23634a(this.f20091g, abstractC5980b.mo19254e()) && C4585c.m23634a(Boolean.valueOf(this.f20092h), Boolean.valueOf(abstractC5980b.mo19252g())) && C4585c.m23634a(Boolean.valueOf(this.f20093i), Boolean.valueOf(abstractC5980b.mo19251h()));
    }

    @Override // com.google.android.gms.games.AbstractC5978n.AbstractC5980b
    /* renamed from: f */
    public boolean mo19253f() {
        return this.f20088d;
    }

    @Override // com.google.android.gms.games.AbstractC5978n.AbstractC5980b
    /* renamed from: g */
    public boolean mo19252g() {
        return this.f20092h;
    }

    @Override // com.google.android.gms.games.AbstractC5978n.AbstractC5980b
    /* renamed from: h */
    public boolean mo19251h() {
        return this.f20093i;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f20087c, Boolean.valueOf(this.f20088d), Boolean.valueOf(this.f20089e), Boolean.valueOf(this.f20090f), this.f20086b, this.f20091g, Boolean.valueOf(this.f20092h), Boolean.valueOf(this.f20093i));
    }

    /* renamed from: i */
    public int m19544i() {
        return this.f20085a;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("GamerTag", this.f20087c).m23632a("IsGamerTagExplicitlySet", Boolean.valueOf(this.f20088d)).m23632a("IsProfileVisible", Boolean.valueOf(this.f20089e)).m23632a("IsVisibilityExplicitlySet", Boolean.valueOf(this.f20090f)).m23632a("Status", this.f20086b).m23632a("StockProfileImage", this.f20091g).m23632a("IsProfileDiscoverable", Boolean.valueOf(this.f20092h)).m23632a("AutoSignIn", Boolean.valueOf(this.f20093i)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5925c.m19533a(this, parcel, i);
    }
}
