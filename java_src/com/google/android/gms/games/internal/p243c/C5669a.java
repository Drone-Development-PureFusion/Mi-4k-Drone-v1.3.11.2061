package com.google.android.gms.games.internal.p243c;

import android.net.Uri;
import com.google.android.gms.games.C5355c;
/* renamed from: com.google.android.gms.games.internal.c.a */
/* loaded from: classes2.dex */
public final class C5669a {

    /* renamed from: c */
    private static final Uri f19798c = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();

    /* renamed from: a */
    public static final Uri f19796a = f19798c.buildUpon().appendPath("invitations").build();

    /* renamed from: b */
    public static final Uri f19797b = f19798c.buildUpon().appendEncodedPath(C5355c.f19402a).build();
}
