package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.AbstractC4527f;
import com.google.android.gms.games.Game;
/* loaded from: classes.dex */
public interface ExperienceEvent extends Parcelable, AbstractC4527f<ExperienceEvent> {
    /* renamed from: c */
    String mo19982c();

    /* renamed from: d */
    Game mo19981d();

    /* renamed from: e */
    String mo19980e();

    /* renamed from: f */
    String mo19979f();

    /* renamed from: g */
    Uri mo19978g();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    /* renamed from: h */
    long mo19977h();

    /* renamed from: i */
    long mo19976i();

    /* renamed from: j */
    long mo19975j();

    /* renamed from: k */
    int mo19974k();

    /* renamed from: l */
    int mo19973l();
}
