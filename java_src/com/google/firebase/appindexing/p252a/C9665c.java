package com.google.firebase.appindexing.p252a;

import android.support.annotation.NonNull;
import java.util.Date;
/* renamed from: com.google.firebase.appindexing.a.c */
/* loaded from: classes2.dex */
public final class C9665c extends AbstractC9667e<C9665c> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9665c() {
        super("DigitalDocument");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9665c(String str) {
        super(str);
    }

    /* renamed from: a */
    public C9665c m7524a(@NonNull String str) {
        return put("text", str);
    }

    /* renamed from: a */
    public C9665c m7523a(@NonNull Date date) {
        return put("dateCreated", date.getTime());
    }

    /* renamed from: a */
    public C9665c m7522a(@NonNull C9666d... c9666dArr) {
        return a("hasDigitalDocumentPermission", c9666dArr);
    }

    /* renamed from: a */
    public C9665c m7521a(@NonNull C9674l... c9674lArr) {
        return a("author", c9674lArr);
    }

    /* renamed from: b */
    public C9665c m7520b(@NonNull Date date) {
        return put("dateModified", date.getTime());
    }
}
