package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.AbstractC4527f;
import com.google.android.gms.games.Game;
import java.util.List;
/* loaded from: classes.dex */
public interface Quest extends Parcelable, AbstractC4527f<Quest> {
    @KeepName
    public static final int[] QUEST_STATE_ALL = {1, 2, 3, 4, 6, 5};
    @KeepName
    public static final String[] QUEST_STATE_NON_TERMINAL = {Integer.toString(1), Integer.toString(2), Integer.toString(3)};

    /* renamed from: a */
    public static final int f20289a = 1;

    /* renamed from: b */
    public static final int f20290b = 2;

    /* renamed from: c */
    public static final int f20291c = 3;

    /* renamed from: d */
    public static final int f20292d = 4;

    /* renamed from: e */
    public static final int f20293e = 5;

    /* renamed from: f */
    public static final int f20294f = 6;

    /* renamed from: g */
    public static final long f20295g = -1;

    /* renamed from: a */
    void mo19232a(CharArrayBuffer charArrayBuffer);

    /* renamed from: b */
    void mo19231b(CharArrayBuffer charArrayBuffer);

    /* renamed from: c */
    String mo19230c();

    /* renamed from: d */
    String mo19229d();

    /* renamed from: e */
    String mo19228e();

    /* renamed from: f */
    Uri mo19227f();

    /* renamed from: g */
    Uri mo19226g();

    @KeepName
    @Deprecated
    String getBannerImageUrl();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    /* renamed from: h */
    Milestone mo19225h();

    /* renamed from: i */
    List<Milestone> mo19224i();

    /* renamed from: j */
    Game mo19223j();

    /* renamed from: k */
    int mo19222k();

    /* renamed from: l */
    int mo19221l();

    /* renamed from: m */
    long mo19220m();

    /* renamed from: n */
    long mo19219n();

    /* renamed from: o */
    long mo19218o();

    /* renamed from: p */
    long mo19217p();

    /* renamed from: q */
    long mo19216q();

    /* renamed from: r */
    boolean mo19215r();
}
