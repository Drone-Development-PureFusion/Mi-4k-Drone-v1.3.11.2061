package com.google.android.gms.games.request;

import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.AbstractC4527f;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import java.util.List;
/* loaded from: classes2.dex */
public interface GameRequest extends Parcelable, AbstractC4527f<GameRequest> {
    @KeepName
    public static final int TYPE_ALL = 65535;

    /* renamed from: a */
    public static final int f20328a = 1;

    /* renamed from: b */
    public static final int f20329b = 2;

    /* renamed from: c */
    public static final int f20330c = 0;

    /* renamed from: d */
    public static final int f20331d = 1;

    /* renamed from: e */
    public static final int f20332e = 0;

    /* renamed from: f */
    public static final int f20333f = 1;

    /* renamed from: a */
    boolean mo19184a(String str);

    /* renamed from: e */
    String mo19182e();

    /* renamed from: f */
    Game mo19181f();

    /* renamed from: g */
    Player mo19180g();

    /* renamed from: i */
    byte[] mo19179i();

    /* renamed from: j */
    int mo19178j();

    /* renamed from: k */
    long mo19177k();

    /* renamed from: l */
    long mo19176l();

    /* renamed from: m */
    int mo19175m();

    /* renamed from: o */
    List<Player> mo19174o();

    /* renamed from: p_ */
    int mo19173p_(String str);
}
