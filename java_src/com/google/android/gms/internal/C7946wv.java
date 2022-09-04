package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C3588d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.AbstractC7944wu;
import java.util.concurrent.Future;
@aaa
/* renamed from: com.google.android.gms.internal.wv */
/* loaded from: classes.dex */
public class C7946wv {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.wv$a */
    /* loaded from: classes2.dex */
    public static class C7949a<JavascriptEngine> extends acl<JavascriptEngine> {

        /* renamed from: a */
        JavascriptEngine f26145a;

        private C7949a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.wu, JavascriptEngine, com.google.android.gms.internal.ww] */
    /* renamed from: a */
    public AbstractC7944wu m13162a(Context context, VersionInfoParcel versionInfoParcel, final C7949a<AbstractC7944wu> c7949a, C7667ro c7667ro, C3588d c3588d) {
        ?? c7950ww = new C7950ww(context, versionInfoParcel, c7667ro, c3588d);
        c7949a.f26145a = c7950ww;
        c7950ww.mo13157a(new AbstractC7944wu.AbstractC7945a() { // from class: com.google.android.gms.internal.wv.2
            @Override // com.google.android.gms.internal.AbstractC7944wu.AbstractC7945a
            /* renamed from: a */
            public void mo13136a() {
                c7949a.b((C7949a) ((AbstractC7944wu) c7949a.f26145a));
            }
        });
        return c7950ww;
    }

    /* renamed from: a */
    public Future<AbstractC7944wu> m13161a(final Context context, final VersionInfoParcel versionInfoParcel, final String str, final C7667ro c7667ro, final C3588d c3588d) {
        final C7949a c7949a = new C7949a();
        abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.wv.1
            @Override // java.lang.Runnable
            public void run() {
                C7946wv.this.m13162a(context, versionInfoParcel, c7949a, c7667ro, c3588d).mo13152b(str);
            }
        });
        return c7949a;
    }
}
