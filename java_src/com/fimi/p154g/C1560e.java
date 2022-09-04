package com.fimi.p154g;

import android.os.SystemClock;
import com.fimi.p140a.p145e.AbstractC1507b;
import com.fimi.p152e.C1549d;
import com.fimi.p154g.C1555c;
import com.fimi.soul.media.player.IMediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.fimi.g.e */
/* loaded from: classes.dex */
public class C1560e extends Thread {

    /* renamed from: c */
    private AbstractC1561a f3840c;

    /* renamed from: a */
    private List<AbstractC1507b> f3838a = new ArrayList();

    /* renamed from: b */
    private boolean f3839b = false;

    /* renamed from: d */
    private long f3841d = SystemClock.uptimeMillis();

    /* renamed from: com.fimi.g.e$a */
    /* loaded from: classes.dex */
    public interface AbstractC1561a {
        /* renamed from: a */
        void mo35150a(int i);
    }

    public C1560e(AbstractC1561a abstractC1561a) {
        this.f3840c = abstractC1561a;
    }

    /* renamed from: a */
    public void m35154a() {
        this.f3839b = true;
        interrupt();
    }

    /* renamed from: a */
    public void m35153a(int i) {
        AbstractC1507b abstractC1507b;
        synchronized (this.f3838a) {
            Iterator<AbstractC1507b> it2 = this.f3838a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    abstractC1507b = null;
                    break;
                }
                abstractC1507b = it2.next();
                if (abstractC1507b.m35479d() == i) {
                    break;
                }
            }
            if (abstractC1507b != null) {
                this.f3838a.remove(abstractC1507b);
            }
        }
    }

    /* renamed from: a */
    public void m35152a(AbstractC1507b abstractC1507b) {
        byte[] m35464f = abstractC1507b.mo35234g().m35464f();
        C1549d.m35208b().m35209a(m35464f, m35464f.length);
    }

    /* renamed from: a */
    public void m35151a(AbstractC1507b abstractC1507b, C1555c.EnumC1558a enumC1558a) {
        byte[] m35464f = abstractC1507b.mo35234g().m35464f();
        C1549d.m35208b().m35209a(m35464f, m35464f.length);
        this.f3841d = SystemClock.uptimeMillis();
        synchronized (this.f3838a) {
            this.f3838a.add(abstractC1507b);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        AbstractC1507b abstractC1507b;
        while (!this.f3839b) {
            synchronized (this.f3838a) {
                int i = 0;
                while (true) {
                    if (i >= this.f3838a.size()) {
                        abstractC1507b = null;
                        break;
                    }
                    abstractC1507b = this.f3838a.get(i);
                    if (SystemClock.uptimeMillis() - this.f3841d >= ((long) IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING)) {
                        int m35481c = abstractC1507b.m35481c();
                        if (m35481c > 10) {
                            break;
                        }
                        abstractC1507b.m35484a(m35481c + 1);
                        m35152a(abstractC1507b);
                        this.f3841d = SystemClock.uptimeMillis();
                    }
                    i++;
                }
                if (abstractC1507b != null) {
                    this.f3840c.mo35150a(abstractC1507b.m35479d());
                    this.f3838a.remove(abstractC1507b);
                } else {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        this.f3839b = true;
                        return;
                    }
                }
            }
        }
    }
}
