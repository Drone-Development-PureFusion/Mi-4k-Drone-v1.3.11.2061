package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes2.dex */
class apb extends Thread implements apa {

    /* renamed from: d */
    private static apb f22682d;

    /* renamed from: e */
    private volatile apc f22686e;

    /* renamed from: f */
    private final Context f22687f;

    /* renamed from: a */
    private final LinkedBlockingQueue<Runnable> f22683a = new LinkedBlockingQueue<>();

    /* renamed from: b */
    private volatile boolean f22684b = false;

    /* renamed from: c */
    private volatile boolean f22685c = false;

    /* renamed from: g */
    private final AbstractC4682e f22688g = C4685h.m23138d();

    private apb(Context context) {
        super("GAThread");
        if (context != null) {
            this.f22687f = context.getApplicationContext();
        } else {
            this.f22687f = context;
        }
        start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static apb m16409a(Context context) {
        if (f22682d == null) {
            f22682d = new apb(context);
        }
        return f22682d;
    }

    /* renamed from: a */
    private String m16403a(Throwable th) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        th.printStackTrace(printStream);
        printStream.flush();
        return new String(byteArrayOutputStream.toByteArray());
    }

    @Override // com.google.android.gms.internal.apa
    /* renamed from: a */
    public void mo16406a(Runnable runnable) {
        this.f22683a.add(runnable);
    }

    /* renamed from: a */
    void m16405a(final String str, final long j, @Nullable final String str2, @Nullable final String str3, @Nullable final Map<String, String> map, @Nullable final String str4) {
        mo16406a(new Runnable() { // from class: com.google.android.gms.internal.apb.1
            @Override // java.lang.Runnable
            public void run() {
                if (apb.this.f22686e == null) {
                    apu m16305b = apu.m16305b();
                    m16305b.m16310a(apb.this.f22687f, this);
                    apb.this.f22686e = m16305b.m16303c();
                }
                apb.this.f22686e.mo16378a(j, str, str2, str3, map, str4);
            }
        });
    }

    @Override // com.google.android.gms.internal.apa
    /* renamed from: a */
    public void mo16404a(String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable String str4) {
        m16405a(str, this.f22688g.mo16434a(), str2, str3, map, str4);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (!this.f22685c) {
            try {
                try {
                    Runnable take = this.f22683a.take();
                    if (!this.f22684b) {
                        take.run();
                    }
                } catch (InterruptedException e) {
                    aph.m16392c(e.toString());
                }
            } catch (Throwable th) {
                String valueOf = String.valueOf(m16403a(th));
                aph.m16396a(valueOf.length() != 0 ? "Error on Google TagManager Thread: ".concat(valueOf) : new String("Error on Google TagManager Thread: "));
                aph.m16396a("Google TagManager is shutting down.");
                this.f22684b = true;
            }
        }
    }
}
