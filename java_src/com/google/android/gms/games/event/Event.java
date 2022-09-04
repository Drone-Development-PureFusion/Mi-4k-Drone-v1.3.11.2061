package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.AbstractC4527f;
import com.google.android.gms.games.Player;
/* loaded from: classes.dex */
public interface Event extends Parcelable, AbstractC4527f<Event> {
    /* renamed from: a */
    void mo20473a(CharArrayBuffer charArrayBuffer);

    /* renamed from: b */
    void mo20472b(CharArrayBuffer charArrayBuffer);

    /* renamed from: c */
    String mo20471c();

    /* renamed from: c */
    void mo20470c(CharArrayBuffer charArrayBuffer);

    /* renamed from: d */
    String mo20469d();

    /* renamed from: e */
    String mo20468e();

    /* renamed from: f */
    Uri mo20467f();

    /* renamed from: g */
    Player mo20466g();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    /* renamed from: h */
    long mo20465h();

    /* renamed from: i */
    String mo20464i();

    /* renamed from: j */
    boolean mo20463j();
}
