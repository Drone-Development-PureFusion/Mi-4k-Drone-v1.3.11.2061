package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.internal.agv;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
/* renamed from: com.google.android.gms.cast.internal.l */
/* loaded from: classes.dex */
public final class C4439l {

    /* renamed from: a */
    public static final C4467a.C4478g<C4423e> f16660a = new C4467a.C4478g<>();

    /* renamed from: b */
    public static final C4467a.C4478g<agv> f16661b = new C4467a.C4478g<>();

    /* renamed from: c */
    public static final C4467a.C4478g<Object> f16662c = new C4467a.C4478g<>();

    /* renamed from: d */
    public static final C4467a.C4478g<Object> f16663d = new C4467a.C4478g<>();

    /* renamed from: e */
    public static final Charset f16664e;

    /* renamed from: f */
    public static final String f16665f;

    static {
        Charset charset = null;
        try {
            charset = Charset.forName("UTF-8");
        } catch (IllegalCharsetNameException e) {
        } catch (UnsupportedCharsetException e2) {
        }
        f16664e = charset;
        f16665f = C4430f.m24203b("com.google.cast.multizone");
    }
}
