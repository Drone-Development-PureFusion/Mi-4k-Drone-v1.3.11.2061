package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.AbstractC4527f;
import com.google.android.gms.games.Player;
/* loaded from: classes.dex */
public interface Participant extends Parcelable, AbstractC4527f<Participant> {

    /* renamed from: a */
    public static final int f20153a = 0;

    /* renamed from: b */
    public static final int f20154b = 1;

    /* renamed from: c */
    public static final int f20155c = 2;

    /* renamed from: d */
    public static final int f20156d = 3;

    /* renamed from: e */
    public static final int f20157e = 4;

    /* renamed from: f */
    public static final int f20158f = 5;

    /* renamed from: g */
    public static final int f20159g = 6;

    /* renamed from: a */
    void mo19480a(CharArrayBuffer charArrayBuffer);

    /* renamed from: c */
    int mo19479c();

    /* renamed from: d */
    String mo19478d();

    /* renamed from: e */
    int mo19477e();

    /* renamed from: f */
    boolean mo19476f();

    /* renamed from: g */
    String mo19475g();

    @KeepName
    @Deprecated
    String getHiResImageUrl();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    /* renamed from: h */
    Uri mo19474h();

    /* renamed from: i */
    Uri mo19473i();

    /* renamed from: j */
    String mo19472j();

    /* renamed from: k */
    Player mo19471k();

    /* renamed from: l */
    ParticipantResult mo19470l();
}
