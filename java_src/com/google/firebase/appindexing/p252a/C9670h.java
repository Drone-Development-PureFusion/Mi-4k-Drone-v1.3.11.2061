package com.google.firebase.appindexing.p252a;

import android.support.annotation.NonNull;
/* renamed from: com.google.firebase.appindexing.a.h */
/* loaded from: classes2.dex */
public final class C9670h extends AbstractC9667e<C9670h> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9670h() {
        super("MusicAlbum");
    }

    /* renamed from: a */
    public C9670h m7488a(int i) {
        return put("numTracks", i);
    }

    /* renamed from: a */
    public C9670h m7487a(@NonNull C9671i c9671i) {
        return a("byArtist", c9671i);
    }

    /* renamed from: a */
    public C9670h m7486a(@NonNull C9673k... c9673kArr) {
        return a("track", c9673kArr);
    }
}
