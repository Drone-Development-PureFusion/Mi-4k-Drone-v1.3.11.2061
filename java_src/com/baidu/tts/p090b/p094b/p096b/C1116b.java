package com.baidu.tts.p090b.p094b.p096b;

import android.media.AudioTrack;
import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p090b.p094b.AbstractC1103a;
import com.baidu.tts.p102f.EnumC1173e;
import com.baidu.tts.p102f.EnumC1179k;
import com.baidu.tts.p108i.p109a.C1194a;
import com.baidu.tts.p108i.p109a.C1195b;
import com.baidu.tts.p114m.C1232c;
import com.baidu.tts.p114m.C1237h;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* renamed from: com.baidu.tts.b.b.b.b */
/* loaded from: classes.dex */
public class C1116b extends AbstractC1115a {

    /* renamed from: d */
    private volatile AudioTrack f2583d;

    /* renamed from: e */
    private C1117a f2584e;

    /* renamed from: h */
    private int f2587h;

    /* renamed from: f */
    private C1195b f2585f = new C1195b();

    /* renamed from: b */
    protected final Lock f2581b = new ReentrantLock();

    /* renamed from: c */
    protected final Condition f2582c = this.f2581b.newCondition();

    /* renamed from: g */
    private boolean f2586g = false;

    /* renamed from: com.baidu.tts.b.b.b.b$a */
    /* loaded from: classes.dex */
    public static class C1117a extends C1232c<C1117a> {

        /* renamed from: a */
        private EnumC1179k f2588a = EnumC1179k.HZ16K;

        /* renamed from: b */
        private int f2589b = 4;

        /* renamed from: c */
        private int f2590c = 2;

        /* renamed from: d */
        private int f2591d = 1;

        /* renamed from: e */
        private float f2592e = 1.0f;

        /* renamed from: f */
        private float f2593f = 1.0f;

        /* renamed from: a */
        public int m36574a() {
            return this.f2588a.m36313a();
        }

        /* renamed from: a */
        public void m36573a(float f) {
            this.f2592e = f;
        }

        /* renamed from: b */
        public int m36572b() {
            return this.f2589b;
        }

        /* renamed from: b */
        public void m36571b(float f) {
            this.f2593f = f;
        }

        /* renamed from: c */
        public int m36570c() {
            return this.f2590c;
        }

        /* renamed from: d */
        public int m36569d() {
            return this.f2591d;
        }

        /* renamed from: e */
        public float m36568e() {
            return this.f2592e;
        }

        /* renamed from: f */
        public float m36567f() {
            return this.f2593f;
        }
    }

    /* renamed from: a */
    private int m36583a(int i, int i2, int i3) {
        int i4;
        int i5 = 2;
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3) * 2;
        switch (i2) {
            case 1:
            case 2:
            case 4:
                i4 = 1;
                break;
            case 3:
            case 12:
                i4 = 2;
                break;
            default:
                i4 = Integer.bitCount(i2);
                break;
        }
        if (i3 == 3) {
            i5 = 1;
        }
        if (minBufferSize % (i5 * i4) != 0 || minBufferSize < 1) {
            return 5120;
        }
        return minBufferSize;
    }

    /* renamed from: b */
    private int m36582b(int i) {
        if (i > this.f2587h) {
            this.f2587h = i;
        }
        return this.f2587h;
    }

    /* renamed from: b */
    private void m36581b(C1237h c1237h) {
        this.f2585f.m36271a(m36575h());
        this.f2585f.m36272a();
        this.f2587h = 0;
        m36579d(c1237h);
    }

    /* renamed from: c */
    private void m36580c(C1237h c1237h) {
        this.f2585f.m36270b();
        m36577f(c1237h);
    }

    /* renamed from: d */
    private void m36579d(C1237h c1237h) {
        if (this.f2580a != null) {
            this.f2580a.mo36591a(c1237h);
        }
    }

    /* renamed from: e */
    private void m36578e(C1237h c1237h) {
        if (this.f2580a != null) {
            this.f2580a.mo36590b(c1237h);
        }
    }

    /* renamed from: f */
    private void m36577f(C1237h c1237h) {
        if (this.f2580a != null) {
            this.f2580a.mo36589c(c1237h);
        }
    }

    /* renamed from: g */
    private void m36576g() {
        try {
            this.f2581b.lock();
            this.f2582c.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.f2581b.unlock();
        }
    }

    /* renamed from: h */
    private int m36575h() {
        return (this.f2584e.m36574a() * 2) / this.f2584e.h();
    }

    @Override // com.baidu.tts.p090b.p094b.p096b.AbstractC1118c
    /* renamed from: a */
    public int mo36565a(float f, float f2) {
        int stereoVolume = this.f2583d.setStereoVolume(f, f2);
        this.f2584e.m36573a(f);
        this.f2584e.m36571b(f2);
        return stereoVolume;
    }

    @Override // com.baidu.tts.p090b.p094b.p096b.AbstractC1118c
    /* renamed from: a */
    public int mo36564a(int i) {
        if (i != this.f2584e.g()) {
            int m36574a = this.f2584e.m36574a();
            int m36572b = this.f2584e.m36572b();
            int m36570c = this.f2584e.m36570c();
            this.f2583d = new AudioTrack(i, m36574a, m36572b, m36570c, m36583a(m36574a, m36572b, m36570c), this.f2584e.m36569d());
            this.f2584e.a(i);
            this.f2583d.setStereoVolume(this.f2584e.m36568e(), this.f2584e.m36567f());
            this.f2583d.play();
            return 0;
        }
        return 0;
    }

    @Override // com.baidu.tts.p090b.p094b.p096b.AbstractC1115a, com.baidu.tts.p090b.p094b.p096b.AbstractC1118c
    /* renamed from: a */
    public TtsError mo36566a() {
        int m36574a = this.f2584e.m36574a();
        int m36572b = this.f2584e.m36572b();
        int m36570c = this.f2584e.m36570c();
        this.f2583d = new AudioTrack(this.f2584e.g(), m36574a, m36572b, m36570c, m36583a(m36574a, m36572b, m36570c), this.f2584e.m36569d());
        this.f2583d.setStereoVolume(this.f2584e.m36568e(), this.f2584e.m36567f());
        return null;
    }

    @Override // com.baidu.tts.p090b.p094b.p096b.AbstractC1115a, com.baidu.tts.p090b.p094b.p096b.AbstractC1118c
    /* renamed from: a */
    public TtsError mo36562a(C1237h c1237h) {
        LoggerProxy.m36554d("AudioTrackPlayer", "enter put");
        if (c1237h != null) {
            EnumC1173e m36141g = c1237h.m36141g();
            if (m36141g == EnumC1173e.SYN_START) {
                m36581b(c1237h);
            }
            if (m36141g == EnumC1173e.SYN_DATA) {
                this.f2585f.m36267c(c1237h.m36147c());
            }
            byte[] m36145d = c1237h.m36145d();
            if (m36145d != null) {
                this.f2585f.m36269b(m36145d.length);
            }
            while (this.f2585f.hasNext()) {
                C1194a next = this.f2585f.next();
                int i = 0;
                int m36280a = next.m36280a();
                int m36276b = next.m36276b();
                while (i < m36276b && this.f2583d.getPlayState() != 1) {
                    LoggerProxy.m36554d("AudioTrackPlayer", "before write");
                    AudioTrack audioTrack = this.f2583d;
                    int write = audioTrack.write(m36145d, i + m36280a, m36276b - i);
                    LoggerProxy.m36554d("AudioTrackPlayer", "writtenbytes=" + write + "--offset=" + i + "--dataLength=" + m36276b);
                    int i2 = write + i;
                    while (this.f2586g) {
                        try {
                            this.f2581b.lock();
                            LoggerProxy.m36554d("AudioTrackPlayer", "await before" + System.currentTimeMillis());
                            this.f2582c.await();
                            LoggerProxy.m36554d("AudioTrackPlayer", "await after" + System.currentTimeMillis());
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            this.f2581b.unlock();
                        }
                    }
                    i = i2;
                }
                if (this.f2583d.getPlayState() == 1) {
                    break;
                } else if (next.m36274c()) {
                    int m36147c = c1237h.m36147c();
                    float m36273d = next.m36273d();
                    int round = Math.round(m36147c * m36273d);
                    int m36582b = m36582b(round);
                    LoggerProxy.m36554d("AudioTrackPlayer", "percent=" + m36273d + "--currentProgress=" + round + "--progress=" + m36582b);
                    C1237h A = c1237h.A();
                    A.m36146c(m36582b);
                    m36578e(A);
                }
            }
            if (m36141g == EnumC1173e.SYN_FINISH) {
                int m36266d = this.f2585f.m36266d();
                C1237h A2 = c1237h.A();
                A2.m36146c(m36266d);
                m36578e(A2);
                m36580c(c1237h);
            }
        } else {
            LoggerProxy.m36554d("AudioTrackPlayer", "put responseBag=null");
        }
        LoggerProxy.m36554d("AudioTrackPlayer", "end put");
        return null;
    }

    @Override // com.baidu.tts.p090b.p094b.p096b.AbstractC1115a, com.baidu.tts.p090b.p094b.p096b.AbstractC1118c
    /* renamed from: a */
    public void mo36563a(AbstractC1103a abstractC1103a) {
        this.f2580a = abstractC1103a;
    }

    @Override // com.baidu.tts.p090b.p094b.p096b.AbstractC1115a, com.baidu.tts.p090b.p094b.p096b.AbstractC1118c
    /* renamed from: a */
    public <AudioTrackPlayerParams> void mo36561a(AudioTrackPlayerParams audiotrackplayerparams) {
        this.f2584e = (C1117a) audiotrackplayerparams;
    }

    @Override // com.baidu.tts.p090b.p094b.p096b.AbstractC1115a, com.baidu.tts.p090b.p094b.p096b.AbstractC1118c
    /* renamed from: b */
    public void mo36560b() {
        this.f2583d.play();
    }

    @Override // com.baidu.tts.p090b.p094b.p096b.AbstractC1115a, com.baidu.tts.p090b.p094b.p096b.AbstractC1118c
    /* renamed from: c */
    public void mo36559c() {
        this.f2586g = true;
        this.f2583d.pause();
    }

    @Override // com.baidu.tts.p090b.p094b.p096b.AbstractC1115a, com.baidu.tts.p090b.p094b.p096b.AbstractC1118c
    /* renamed from: d */
    public void mo36558d() {
        this.f2586g = false;
        this.f2583d.play();
        m36576g();
    }

    @Override // com.baidu.tts.p090b.p094b.p096b.AbstractC1115a, com.baidu.tts.p090b.p094b.p096b.AbstractC1118c
    /* renamed from: e */
    public void mo36557e() {
        if (this.f2586g) {
            this.f2586g = false;
            m36576g();
        }
        this.f2583d.pause();
        this.f2583d.flush();
        this.f2583d.stop();
    }

    @Override // com.baidu.tts.p090b.p094b.p096b.AbstractC1115a, com.baidu.tts.p090b.p094b.p096b.AbstractC1118c
    /* renamed from: f */
    public TtsError mo36556f() {
        mo36557e();
        this.f2583d.release();
        this.f2583d = null;
        return null;
    }
}
