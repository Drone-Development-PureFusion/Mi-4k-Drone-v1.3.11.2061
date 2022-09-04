package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.AbstractC4527f;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
/* loaded from: classes.dex */
public interface Player extends Parcelable, AbstractC4527f<Player> {

    /* renamed from: a */
    public static final long f19228a = -1;

    /* renamed from: b */
    public static final long f19229b = -1;

    /* renamed from: a */
    void mo20736a(CharArrayBuffer charArrayBuffer);

    /* renamed from: b */
    void mo20735b(CharArrayBuffer charArrayBuffer);

    /* renamed from: c */
    String mo20734c();

    /* renamed from: d */
    String mo20733d();

    /* renamed from: e */
    String mo20732e();

    /* renamed from: f */
    String mo20731f();

    /* renamed from: g */
    boolean mo20730g();

    @KeepName
    @Deprecated
    String getBannerImageLandscapeUrl();

    @KeepName
    @Deprecated
    String getBannerImagePortraitUrl();

    @KeepName
    @Deprecated
    String getHiResImageUrl();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    /* renamed from: h */
    boolean mo20729h();

    /* renamed from: i */
    Uri mo20728i();

    /* renamed from: j */
    boolean mo20727j();

    /* renamed from: k */
    Uri mo20726k();

    /* renamed from: l */
    long mo20725l();

    /* renamed from: m */
    long mo20724m();

    @Deprecated
    /* renamed from: n */
    int mo20723n();

    /* renamed from: o */
    boolean mo20722o();

    /* renamed from: p */
    String mo20721p();

    /* renamed from: q */
    PlayerLevelInfo mo20720q();

    /* renamed from: r */
    MostRecentGameInfo mo20719r();

    /* renamed from: s */
    Uri mo20718s();

    /* renamed from: t */
    Uri mo20717t();

    /* renamed from: u */
    int mo20716u();

    /* renamed from: v */
    long mo20715v();

    /* renamed from: w */
    boolean mo20714w();
}
