package com.p120c.p121a.p129b;

import android.graphics.Bitmap;
import android.os.Handler;
import com.p120c.p121a.p129b.p130a.EnumC1301f;
import com.p120c.p121a.p138c.C1356d;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.c.a.b.i */
/* loaded from: classes.dex */
public final class RunnableC1350i implements Runnable {

    /* renamed from: a */
    private static final String f3521a = "PostProcess image before displaying [%s]";

    /* renamed from: b */
    private final C1337f f3522b;

    /* renamed from: c */
    private final Bitmap f3523c;

    /* renamed from: d */
    private final C1343g f3524d;

    /* renamed from: e */
    private final Handler f3525e;

    public RunnableC1350i(C1337f c1337f, Bitmap bitmap, C1343g c1343g, Handler handler) {
        this.f3522b = c1337f;
        this.f3523c = bitmap;
        this.f3524d = c1343g;
        this.f3525e = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1356d.m35612a(f3521a, this.f3524d.f3468b);
        RunnableC1345h.m35646a(new RunnableC1305b(this.f3524d.f3471e.m35851p().m35650a(this.f3523c), this.f3524d, this.f3522b, EnumC1301f.MEMORY_CACHE), this.f3524d.f3471e.m35845s(), this.f3525e, this.f3522b);
    }
}
