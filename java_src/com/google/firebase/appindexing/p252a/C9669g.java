package com.google.firebase.appindexing.p252a;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
import java.util.Date;
/* renamed from: com.google.firebase.appindexing.a.g */
/* loaded from: classes2.dex */
public final class C9669g extends AbstractC9667e<C9669g> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9669g() {
        super("Message");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9669g(String str) {
        super(str);
    }

    /* renamed from: a */
    public C9669g m7496a(@NonNull C9674l c9674l) {
        return a("sender", c9674l);
    }

    /* renamed from: a */
    public C9669g m7495a(@NonNull String str) {
        return put("text", str);
    }

    /* renamed from: a */
    public C9669g m7494a(@NonNull Date date) {
        C4588d.m23627a(date);
        return put("dateSent", date.getTime());
    }

    /* renamed from: a */
    public C9669g m7493a(@NonNull C9664b... c9664bArr) {
        return a("isPartOf", c9664bArr);
    }

    /* renamed from: a */
    public C9669g m7492a(@NonNull C9665c... c9665cArr) {
        return a("messageAttachment", c9665cArr);
    }

    /* renamed from: a */
    public C9669g m7491a(@NonNull C9674l... c9674lArr) {
        return a("recipient", c9674lArr);
    }

    /* renamed from: b */
    public C9669g m7490b(@NonNull Date date) {
        C4588d.m23627a(date);
        return put("dateReceived", date.getTime());
    }

    /* renamed from: c */
    public C9669g m7489c(@NonNull Date date) {
        C4588d.m23627a(date);
        return put("dateRead", date.getTime());
    }
}
