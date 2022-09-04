package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.AbstractC4527f;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.AbstractC5948j;
import com.google.android.gms.games.multiplayer.Participant;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public interface TurnBasedMatch extends Parcelable, AbstractC4527f<TurnBasedMatch>, AbstractC5948j {
    @KeepName
    public static final int[] MATCH_TURN_STATUS_ALL = {0, 1, 2, 3};

    /* renamed from: a */
    public static final int f20232a = -1;

    /* renamed from: b */
    public static final int f20233b = 0;

    /* renamed from: c */
    public static final int f20234c = 1;

    /* renamed from: d */
    public static final int f20235d = 2;

    /* renamed from: e */
    public static final int f20236e = 3;

    /* renamed from: f */
    public static final int f20237f = 4;

    /* renamed from: g */
    public static final int f20238g = 0;

    /* renamed from: h */
    public static final int f20239h = 1;

    /* renamed from: i */
    public static final int f20240i = 2;

    /* renamed from: j */
    public static final int f20241j = 3;

    /* renamed from: a */
    int mo19351a(String str);

    /* renamed from: a */
    void mo19352a(CharArrayBuffer charArrayBuffer);

    /* renamed from: c */
    Game mo19350c();

    /* renamed from: d */
    String mo19349d();

    /* renamed from: e */
    String mo19348e();

    /* renamed from: f */
    long mo19347f();

    /* renamed from: g */
    int mo19346g();

    /* renamed from: h */
    int mo19345h();

    /* renamed from: i */
    String mo19344i();

    /* renamed from: j */
    int mo19343j();

    /* renamed from: k */
    String mo19342k();

    /* renamed from: l */
    long mo19341l();

    /* renamed from: n */
    String mo19339n();

    /* renamed from: n_ */
    String mo19338n_(String str);

    /* renamed from: o */
    byte[] mo19337o();

    /* renamed from: o_ */
    Participant mo19336o_(String str);

    /* renamed from: p */
    int mo19335p();

    /* renamed from: q */
    boolean mo19334q();

    /* renamed from: r */
    String mo19333r();

    /* renamed from: s */
    byte[] mo19332s();

    /* renamed from: t */
    int mo19331t();

    /* renamed from: u */
    Bundle mo19330u();

    /* renamed from: v */
    int mo19329v();

    /* renamed from: w */
    boolean mo19328w();

    /* renamed from: x */
    ArrayList<String> mo19327x();

    /* renamed from: y */
    String mo19326y();

    /* renamed from: z */
    Participant mo19325z();
}
