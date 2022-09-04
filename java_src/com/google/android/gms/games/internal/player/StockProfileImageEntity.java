package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class StockProfileImageEntity extends AbstractSafeParcelable implements StockProfileImage {
    public static final C5927e CREATOR = new C5927e();

    /* renamed from: a */
    private final int f20094a;

    /* renamed from: b */
    private final String f20095b;

    /* renamed from: c */
    private final Uri f20096c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StockProfileImageEntity(int i, String str, Uri uri) {
        this.f20094a = i;
        this.f20095b = str;
        this.f20096c = uri;
    }

    public StockProfileImageEntity(StockProfileImage stockProfileImage) {
        this(1, stockProfileImage.mo19541c(), stockProfileImage.mo19540d());
    }

    public StockProfileImageEntity(String str, Uri uri) {
        this(1, str, uri);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    /* renamed from: c */
    public String mo19541c() {
        return this.f20095b;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    /* renamed from: d */
    public Uri mo19540d() {
        return this.f20096c;
    }

    /* renamed from: e */
    public int m19543e() {
        return this.f20094a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StockProfileImage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        StockProfileImage stockProfileImage = (StockProfileImage) obj;
        return C4585c.m23634a(this.f20095b, stockProfileImage.mo19541c()) && C4585c.m23634a(this.f20096c, stockProfileImage.mo19540d());
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: f */
    public StockProfileImage mo7785a() {
        return this;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f20095b, this.f20096c);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("ImageId", this.f20095b).m23632a("ImageUri", this.f20096c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5927e.m19529a(this, parcel, i);
    }
}
