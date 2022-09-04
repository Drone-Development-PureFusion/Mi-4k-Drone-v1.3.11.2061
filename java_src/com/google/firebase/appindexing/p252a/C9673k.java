package com.google.firebase.appindexing.p252a;

import android.support.annotation.NonNull;
/* renamed from: com.google.firebase.appindexing.a.k */
/* loaded from: classes2.dex */
public final class C9673k extends AbstractC9667e<C9673k> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9673k() {
        super("MusicRecording");
    }

    /* renamed from: a */
    public C9673k m7480a(int i) {
        return put("duration", i);
    }

    /* renamed from: a */
    public C9673k m7479a(@NonNull C9670h c9670h) {
        return a("inAlbum", c9670h);
    }

    /* renamed from: a */
    public C9673k m7478a(@NonNull C9671i c9671i) {
        return a("byArtist", c9671i);
    }

    /* renamed from: a */
    public C9673k m7477a(@NonNull C9672j... c9672jArr) {
        return a("inPlaylist", c9672jArr);
    }
}
