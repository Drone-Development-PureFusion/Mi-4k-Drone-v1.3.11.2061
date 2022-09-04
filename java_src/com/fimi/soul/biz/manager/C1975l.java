package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p184l.C1926l;
import com.fimi.soul.biz.p185m.AbstractC1943i;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.Plane;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.l */
/* loaded from: classes.dex */
public class C1975l implements Handler.Callback {

    /* renamed from: a */
    private static C1975l f5486a = null;

    /* renamed from: b */
    private static final int f5487b = 0;

    /* renamed from: c */
    private static final int f5488c = 1;

    /* renamed from: d */
    private static final int f5489d = 2;

    /* renamed from: e */
    private AbstractC1943i f5490e = new C1926l();

    /* renamed from: f */
    private Handler f5491f = new Handler(this);

    /* renamed from: g */
    private Context f5492g;

    /* renamed from: h */
    private HashMap<Integer, AbstractC1945k> f5493h;

    /* renamed from: com.fimi.soul.biz.manager.l$a */
    /* loaded from: classes.dex */
    class RunnableC1976a implements Runnable {

        /* renamed from: b */
        private int f5495b;

        /* renamed from: c */
        private Plane f5496c;

        public RunnableC1976a(int i, Plane plane) {
            this.f5495b = i;
            this.f5496c = plane;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C1975l.this.f5491f.obtainMessage();
            PlaneMsg planeMsg = null;
            if (this.f5495b == 0) {
                planeMsg = C1975l.this.f5490e.a(C1975l.this.f5492g);
            } else if (this.f5495b == 1) {
                planeMsg = C1975l.this.f5490e.mo33482a(this.f5496c, C1975l.this.f5492g);
            } else if (this.f5495b == 2) {
            }
            obtainMessage.what = this.f5495b;
            obtainMessage.obj = planeMsg;
            C1975l.this.f5491f.sendMessage(obtainMessage);
        }
    }

    public C1975l(Context context) {
        this.f5492g = null;
        this.f5492g = context;
    }

    /* renamed from: a */
    public static C1975l m33363a(Context context) {
        if (f5486a == null) {
            f5486a = new C1975l(context);
        }
        return f5486a;
    }

    /* renamed from: a */
    public void m33362a(AbstractC1945k abstractC1945k) {
        this.f5493h.put(0, abstractC1945k);
        C1685x.m34455b(new RunnableC1976a(0, null));
    }

    /* renamed from: a */
    public void m33360a(Plane plane, AbstractC1945k abstractC1945k) {
        this.f5493h.put(1, abstractC1945k);
        C1685x.m34455b(new RunnableC1976a(1, plane));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5493h.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return false;
        }
        return false;
    }
}
