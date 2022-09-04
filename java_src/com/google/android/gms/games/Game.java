package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.AbstractC4527f;
/* loaded from: classes.dex */
public interface Game extends Parcelable, AbstractC4527f<Game> {
    /* renamed from: a */
    void mo20779a(CharArrayBuffer charArrayBuffer);

    /* renamed from: b */
    void mo20778b(CharArrayBuffer charArrayBuffer);

    /* renamed from: c */
    String mo20777c();

    /* renamed from: c */
    void mo20776c(CharArrayBuffer charArrayBuffer);

    /* renamed from: d */
    String mo20775d();

    /* renamed from: e */
    String mo20774e();

    /* renamed from: f */
    String mo20773f();

    /* renamed from: g */
    String mo20772g();

    @KeepName
    @Deprecated
    String getFeaturedImageUrl();

    @KeepName
    @Deprecated
    String getHiResImageUrl();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    /* renamed from: h */
    String mo20771h();

    /* renamed from: i */
    Uri mo20770i();

    /* renamed from: j */
    Uri mo20769j();

    /* renamed from: k */
    Uri mo20768k();

    /* renamed from: l */
    boolean mo20767l();

    /* renamed from: m */
    boolean mo20766m();

    /* renamed from: n */
    boolean mo20765n();

    /* renamed from: o */
    boolean mo20764o();

    /* renamed from: p */
    String mo20763p();

    /* renamed from: q */
    int mo20762q();

    /* renamed from: r */
    int mo20761r();

    /* renamed from: s */
    boolean mo20760s();

    /* renamed from: t */
    boolean mo20759t();

    /* renamed from: u */
    boolean mo20758u();

    /* renamed from: v */
    String mo20757v();

    /* renamed from: w */
    boolean mo20756w();
}
