package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import com.google.firebase.C9751b;
import it.p273a.p274a.AbstractC10866e;
import java.util.Random;
/* renamed from: com.google.android.gms.internal.nb */
/* loaded from: classes2.dex */
public class C7434nb {

    /* renamed from: a */
    static AbstractC7436nd f24892a = new C7437ne();

    /* renamed from: b */
    static AbstractC4682e f24893b = new C4685h();

    /* renamed from: c */
    private static Random f24894c = new Random();

    /* renamed from: d */
    private C9751b f24895d;

    /* renamed from: e */
    private long f24896e;

    /* renamed from: f */
    private volatile boolean f24897f;

    public C7434nb(C9751b c9751b, long j) {
        this.f24895d = c9751b;
        this.f24896e = j;
    }

    /* renamed from: a */
    public void m14495a() {
        this.f24897f = true;
    }

    /* renamed from: a */
    public void m14493a(@NonNull C7447nk c7447nk) {
        m14492a(c7447nk, true);
    }

    /* renamed from: a */
    public void m14492a(@NonNull C7447nk c7447nk, boolean z) {
        C4588d.m23627a(c7447nk);
        long mo16432b = f24893b.mo16432b() + this.f24896e;
        if (z) {
            c7447nk.m14437a(C7439ng.m14485a(this.f24895d), this.f24895d.m7224a());
        } else {
            c7447nk.m14435b(C7439ng.m14485a(this.f24895d));
        }
        int i = 1000;
        while (f24893b.mo16432b() + i <= mo16432b && !c7447nk.m14429h() && m14494a(c7447nk.m14430g())) {
            try {
                f24892a.mo14487a(f24894c.nextInt(AbstractC10866e.f34828G) + i);
                if (i < 30000) {
                    if (c7447nk.m14430g() != -2) {
                        i *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i = 1000;
                    }
                }
                if (this.f24897f) {
                    return;
                }
                c7447nk.m14441a();
                if (z) {
                    c7447nk.m14437a(C7439ng.m14485a(this.f24895d), this.f24895d.m7224a());
                } else {
                    c7447nk.m14435b(C7439ng.m14485a(this.f24895d));
                }
            } catch (InterruptedException e) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean m14494a(int i) {
        return (i >= 500 && i < 600) || i == -2 || i == 429;
    }

    /* renamed from: b */
    public void m14491b() {
        this.f24897f = false;
    }
}
