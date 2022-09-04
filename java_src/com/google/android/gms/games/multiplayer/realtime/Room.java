package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.AbstractC4527f;
import com.google.android.gms.games.multiplayer.AbstractC5948j;
import com.google.android.gms.games.multiplayer.Participant;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public interface Room extends Parcelable, AbstractC4527f<Room>, AbstractC5948j {

    /* renamed from: a */
    public static final int f20201a = -1;

    /* renamed from: b */
    public static final int f20202b = 0;

    /* renamed from: c */
    public static final int f20203c = 1;

    /* renamed from: d */
    public static final int f20204d = 2;

    /* renamed from: e */
    public static final int f20205e = 3;

    /* renamed from: a */
    int mo19426a(String str);

    /* renamed from: a */
    void mo19427a(CharArrayBuffer charArrayBuffer);

    /* renamed from: c */
    String mo19425c();

    /* renamed from: d */
    String mo19424d();

    /* renamed from: e */
    long mo19423e();

    /* renamed from: f */
    int mo19422f();

    /* renamed from: g */
    String mo19421g();

    /* renamed from: h */
    int mo19420h();

    /* renamed from: i */
    Bundle mo19419i();

    /* renamed from: j */
    int mo19418j();

    /* renamed from: k */
    ArrayList<String> mo19417k();

    /* renamed from: k_ */
    String mo19416k_(String str);

    /* renamed from: l_ */
    Participant mo19414l_(String str);
}
