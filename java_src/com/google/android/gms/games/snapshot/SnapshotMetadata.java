package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.AbstractC4527f;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
/* loaded from: classes.dex */
public interface SnapshotMetadata extends Parcelable, AbstractC4527f<SnapshotMetadata> {

    /* renamed from: a */
    public static final long f20364a = -1;

    /* renamed from: b */
    public static final long f20365b = -1;

    /* renamed from: a */
    void mo19125a(CharArrayBuffer charArrayBuffer);

    /* renamed from: c */
    Game mo19124c();

    /* renamed from: d */
    Player mo19123d();

    /* renamed from: e */
    String mo19122e();

    /* renamed from: f */
    Uri mo19121f();

    /* renamed from: g */
    float mo19120g();

    @KeepName
    @Deprecated
    String getCoverImageUrl();

    /* renamed from: h */
    String mo19119h();

    /* renamed from: i */
    String mo19118i();

    /* renamed from: j */
    String mo19117j();

    /* renamed from: k */
    long mo19116k();

    /* renamed from: l */
    long mo19115l();

    /* renamed from: m */
    boolean mo19114m();

    /* renamed from: n */
    long mo19113n();

    /* renamed from: o */
    String mo19112o();
}
