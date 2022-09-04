package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p184l.C1916c;
import com.fimi.soul.biz.p185m.AbstractC1938d;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.e */
/* loaded from: classes.dex */
public class C1962e implements Handler.Callback {

    /* renamed from: a */
    private static C1962e f5415a = null;

    /* renamed from: b */
    private static final int f5416b = 0;

    /* renamed from: c */
    private static final int f5417c = 1;

    /* renamed from: d */
    private static final int f5418d = 2;

    /* renamed from: e */
    private static final int f5419e = 3;

    /* renamed from: f */
    private AbstractC1938d f5420f = new C1916c();

    /* renamed from: g */
    private Handler f5421g = new Handler(this);

    /* renamed from: h */
    private HashMap<Integer, AbstractC1945k> f5422h = new HashMap<>();

    /* renamed from: i */
    private Context f5423i;

    /* renamed from: com.fimi.soul.biz.manager.e$a */
    /* loaded from: classes.dex */
    class RunnableC1963a implements Runnable {

        /* renamed from: b */
        private int f5425b;

        public RunnableC1963a(int i) {
            this.f5425b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C1962e.this.f5421g.obtainMessage();
            PlaneMsg planeMsg = null;
            if (this.f5425b == 0) {
                planeMsg = C1962e.this.f5420f.mo33491b(C1962e.this.f5423i);
            } else if (this.f5425b == 1) {
                planeMsg = C1962e.this.f5420f.mo33490c(C1962e.this.f5423i);
            } else if (this.f5425b == 2) {
                planeMsg = C1962e.this.f5420f.mo33489d(C1962e.this.f5423i);
            } else if (this.f5425b == 3) {
                planeMsg = C1962e.this.f5420f.mo33488e(C1962e.this.f5423i);
            }
            obtainMessage.what = this.f5425b;
            obtainMessage.obj = planeMsg;
            C1962e.this.f5421g.sendMessage(obtainMessage);
        }
    }

    public C1962e(Context context) {
        this.f5423i = null;
        this.f5423i = context;
    }

    /* renamed from: a */
    public static C1962e m33408a(Context context) {
        if (f5415a == null) {
            f5415a = new C1962e(context);
        }
        return f5415a;
    }

    /* renamed from: a */
    public void m33407a(AbstractC1945k abstractC1945k) {
        this.f5422h.put(0, abstractC1945k);
        C1685x.m34455b(new RunnableC1963a(0));
    }

    /* renamed from: b */
    public void m33405b(AbstractC1945k abstractC1945k) {
        this.f5422h.put(1, abstractC1945k);
        C1685x.m34455b(new RunnableC1963a(1));
    }

    /* renamed from: c */
    public void m33403c(AbstractC1945k abstractC1945k) {
        this.f5422h.put(2, abstractC1945k);
        C1685x.m34455b(new RunnableC1963a(2));
    }

    /* renamed from: d */
    public void m33401d(AbstractC1945k abstractC1945k) {
        this.f5422h.put(3, abstractC1945k);
        C1685x.m34455b(new RunnableC1963a(3));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5422h.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return false;
        }
        return false;
    }
}
