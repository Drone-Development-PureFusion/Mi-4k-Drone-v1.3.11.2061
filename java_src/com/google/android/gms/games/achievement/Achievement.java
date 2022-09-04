package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.AbstractC4527f;
import com.google.android.gms.games.Player;
/* loaded from: classes.dex */
public interface Achievement extends Parcelable, AbstractC4527f<Achievement> {

    /* renamed from: a */
    public static final int f19323a = 0;

    /* renamed from: b */
    public static final int f19324b = 1;

    /* renamed from: c */
    public static final int f19325c = 2;

    /* renamed from: d */
    public static final int f19326d = 0;

    /* renamed from: e */
    public static final int f19327e = 1;

    /* renamed from: a */
    void mo20646a(CharArrayBuffer charArrayBuffer);

    /* renamed from: b */
    void mo20645b(CharArrayBuffer charArrayBuffer);

    /* renamed from: c */
    String mo20644c();

    /* renamed from: c */
    void mo20643c(CharArrayBuffer charArrayBuffer);

    /* renamed from: d */
    int mo20642d();

    /* renamed from: d */
    void mo20641d(CharArrayBuffer charArrayBuffer);

    /* renamed from: e */
    String mo20640e();

    /* renamed from: f */
    String mo20639f();

    /* renamed from: g */
    Uri mo20638g();

    @KeepName
    @Deprecated
    String getRevealedImageUrl();

    @KeepName
    @Deprecated
    String getUnlockedImageUrl();

    /* renamed from: h */
    Uri mo20637h();

    /* renamed from: i */
    int mo20636i();

    /* renamed from: j */
    String mo20635j();

    /* renamed from: k */
    Player mo20634k();

    /* renamed from: l */
    int mo20633l();

    /* renamed from: m */
    int mo20632m();

    /* renamed from: n */
    String mo20631n();

    /* renamed from: o */
    long mo20630o();

    /* renamed from: p */
    long mo20629p();
}
