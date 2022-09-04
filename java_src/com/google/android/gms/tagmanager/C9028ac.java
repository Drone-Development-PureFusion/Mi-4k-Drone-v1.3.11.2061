package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: com.google.android.gms.tagmanager.ac */
/* loaded from: classes2.dex */
class C9028ac extends Thread implements AbstractC9027ab {

    /* renamed from: d */
    private static C9028ac f28674d;

    /* renamed from: a */
    private final LinkedBlockingQueue<Runnable> f28675a = new LinkedBlockingQueue<>();

    /* renamed from: b */
    private volatile boolean f28676b = false;

    /* renamed from: c */
    private volatile boolean f28677c = false;

    /* renamed from: e */
    private volatile AbstractC9030ad f28678e;

    /* renamed from: f */
    private final Context f28679f;

    private C9028ac(Context context) {
        super("GAThread");
        if (context != null) {
            this.f28679f = context.getApplicationContext();
        } else {
            this.f28679f = context;
        }
        start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C9028ac m9329a(Context context) {
        if (f28674d == null) {
            f28674d = new C9028ac(context);
        }
        return f28674d;
    }

    /* renamed from: a */
    private String m9323a(Throwable th) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        th.printStackTrace(printStream);
        printStream.flush();
        return new String(byteArrayOutputStream.toByteArray());
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9027ab
    /* renamed from: a */
    public void mo9326a(Runnable runnable) {
        this.f28675a.add(runnable);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9027ab
    /* renamed from: a */
    public void mo9325a(String str) {
        m9324a(str, System.currentTimeMillis());
    }

    /* renamed from: a */
    void m9324a(final String str, final long j) {
        mo9326a(new Runnable() { // from class: com.google.android.gms.tagmanager.ac.1
            @Override // java.lang.Runnable
            public void run() {
                if (C9028ac.this.f28678e == null) {
                    C9127cm m9177c = C9127cm.m9177c();
                    m9177c.m9183a(C9028ac.this.f28679f, this);
                    C9028ac.this.f28678e = m9177c.m9175d();
                }
                C9028ac.this.f28678e.mo9282a(j, str);
            }
        });
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (!this.f28677c) {
            try {
                try {
                    Runnable take = this.f28675a.take();
                    if (!this.f28676b) {
                        take.run();
                    }
                } catch (InterruptedException e) {
                    C9065aw.m9297c(e.toString());
                }
            } catch (Throwable th) {
                String valueOf = String.valueOf(m9323a(th));
                C9065aw.m9301a(valueOf.length() != 0 ? "Error on Google TagManager Thread: ".concat(valueOf) : new String("Error on Google TagManager Thread: "));
                C9065aw.m9301a("Google TagManager is shutting down.");
                this.f28676b = true;
            }
        }
    }
}
