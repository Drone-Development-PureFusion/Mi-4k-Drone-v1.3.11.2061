package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p184l.C1928n;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.n */
/* loaded from: classes.dex */
public class C1979n implements Handler.Callback {

    /* renamed from: a */
    private static C1979n f5506a = null;

    /* renamed from: b */
    private static final int f5507b = 0;

    /* renamed from: c */
    private static final int f5508c = 1;

    /* renamed from: d */
    private static final int f5509d = 2;

    /* renamed from: e */
    private static final int f5510e = 3;

    /* renamed from: g */
    private C1928n f5512g;

    /* renamed from: h */
    private Handler f5513h = new Handler(this);

    /* renamed from: f */
    private HashMap<Integer, AbstractC1945k> f5511f = new HashMap<>();

    /* renamed from: com.fimi.soul.biz.manager.n$a */
    /* loaded from: classes.dex */
    class RunnableC1980a implements Runnable {

        /* renamed from: a */
        String f5514a;

        /* renamed from: b */
        String f5515b;

        /* renamed from: d */
        private int f5517d;

        public RunnableC1980a(int i, String str, String str2) {
            this.f5517d = i;
            this.f5515b = str2;
            this.f5514a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C1979n.this.f5513h.obtainMessage();
            PlaneMsg planeMsg = null;
            if (this.f5517d == 0) {
                planeMsg = C1979n.this.f5512g.mo33478c();
                if (planeMsg.isSuccess()) {
                    planeMsg = C1979n.this.f5512g.mo33479b();
                }
            } else if (this.f5517d == 1) {
                planeMsg = C1979n.this.f5512g.mo33480a(this.f5514a, this.f5515b);
            } else if (this.f5517d == 2) {
                planeMsg = C1979n.this.f5512g.mo33478c();
            } else if (this.f5517d == 3) {
                planeMsg = C1979n.this.f5512g.mo33477d();
            }
            obtainMessage.what = this.f5517d;
            obtainMessage.obj = planeMsg;
            C1979n.this.f5513h.sendMessage(obtainMessage);
        }
    }

    public C1979n(Context context) {
        this.f5512g = new C1928n(context);
    }

    /* renamed from: a */
    public static C1979n m33351a(Context context) {
        if (f5506a == null) {
            f5506a = new C1979n(context);
        }
        return f5506a;
    }

    /* renamed from: a */
    public String m33352a() {
        return this.f5512g.m33512a();
    }

    /* renamed from: a */
    public void m33350a(AbstractC1945k abstractC1945k) {
        this.f5511f.put(0, abstractC1945k);
        C1685x.m34455b(new RunnableC1980a(0, null, null));
    }

    /* renamed from: a */
    public void m33348a(String str) {
        this.f5512g.m33511a(str);
    }

    /* renamed from: a */
    public void m33347a(String str, String str2, AbstractC1945k abstractC1945k) {
        this.f5511f.put(1, abstractC1945k);
        C1685x.m34455b(new RunnableC1980a(1, str, str2));
    }

    /* renamed from: b */
    public void m33346b(AbstractC1945k abstractC1945k) {
        this.f5511f.put(2, abstractC1945k);
        C1685x.m34455b(new RunnableC1980a(2, null, null));
    }

    /* renamed from: c */
    public void m33344c(AbstractC1945k abstractC1945k) {
        this.f5511f.put(3, abstractC1945k);
        C1685x.m34455b(new RunnableC1980a(3, null, null));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5511f.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return true;
        }
        return true;
    }
}
