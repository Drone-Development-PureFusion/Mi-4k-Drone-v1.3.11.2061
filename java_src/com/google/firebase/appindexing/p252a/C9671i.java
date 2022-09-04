package com.google.firebase.appindexing.p252a;

import android.support.annotation.NonNull;
/* renamed from: com.google.firebase.appindexing.a.i */
/* loaded from: classes2.dex */
public final class C9671i extends AbstractC9667e<C9671i> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9671i() {
        super("MusicGroup");
    }

    /* renamed from: a */
    public C9671i m7485a(@NonNull String str) {
        return put("genre", str);
    }

    /* renamed from: a */
    public C9671i m7484a(@NonNull C9670h... c9670hArr) {
        return a("album", c9670hArr);
    }

    /* renamed from: a */
    public C9671i m7483a(@NonNull C9673k... c9673kArr) {
        return a("track", c9673kArr);
    }
}
