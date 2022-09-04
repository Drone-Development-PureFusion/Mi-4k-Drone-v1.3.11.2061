package com.google.firebase.appindexing.p252a;

import android.support.annotation.NonNull;
/* renamed from: com.google.firebase.appindexing.a.d */
/* loaded from: classes2.dex */
public final class C9666d extends AbstractC9667e<C9666d> {

    /* renamed from: a */
    public static final String f30265a = "ReadPermission";

    /* renamed from: b */
    public static final String f30266b = "WritePermission";

    /* renamed from: c */
    public static final String f30267c = "CommentPermission";

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9666d() {
        super("DigitalDocumentPermission");
    }

    /* renamed from: a */
    public C9666d m7519a(@NonNull String str) {
        return put("permissionType", str);
    }

    /* renamed from: a */
    public C9666d m7518a(@NonNull C9674l... c9674lArr) {
        return a("grantee", c9674lArr);
    }
}
