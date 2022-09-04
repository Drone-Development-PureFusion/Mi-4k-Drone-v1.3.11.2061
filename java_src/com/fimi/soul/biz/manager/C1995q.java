package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p184l.C1929o;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.q */
/* loaded from: classes.dex */
public class C1995q implements Handler.Callback {

    /* renamed from: a */
    private static C1995q f5556a = null;

    /* renamed from: b */
    private static final int f5557b = 0;

    /* renamed from: c */
    private static final int f5558c = 1;

    /* renamed from: f */
    private Context f5561f;

    /* renamed from: e */
    private C1929o f5560e = new C1929o();

    /* renamed from: g */
    private Handler f5562g = new Handler(this);

    /* renamed from: d */
    private HashMap<Integer, AbstractC1945k> f5559d = new HashMap<>();

    /* renamed from: com.fimi.soul.biz.manager.q$a */
    /* loaded from: classes.dex */
    class RunnableC1996a implements Runnable {

        /* renamed from: b */
        private int f5564b;

        /* renamed from: c */
        private String f5565c;

        /* renamed from: d */
        private String f5566d;

        public RunnableC1996a(int i, String str, String str2) {
            this.f5564b = i;
            this.f5565c = str;
            this.f5566d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C1995q.this.f5562g.obtainMessage();
            PlaneMsg planeMsg = null;
            if (this.f5564b == 0) {
                planeMsg = C1995q.this.f5560e.m33509a(this.f5565c, this.f5566d, C1995q.this.f5561f);
            }
            if (this.f5564b == 1) {
                planeMsg = C1995q.this.f5560e.m33510a(C1995q.this.f5561f);
            }
            obtainMessage.what = this.f5564b;
            obtainMessage.obj = planeMsg;
            C1995q.this.f5562g.sendMessage(obtainMessage);
        }
    }

    public C1995q(Context context) {
        this.f5561f = null;
        this.f5561f = context;
    }

    /* renamed from: a */
    public static C1995q m33321a(Context context) {
        if (f5556a == null) {
            f5556a = new C1995q(context);
        }
        return f5556a;
    }

    /* renamed from: a */
    public void m33320a(AbstractC1945k abstractC1945k) {
        this.f5559d.put(1, abstractC1945k);
        C1685x.m34455b(new RunnableC1996a(1, null, null));
    }

    /* renamed from: a */
    public void m33318a(String str, String str2, AbstractC1945k abstractC1945k) {
        this.f5559d.put(0, abstractC1945k);
        C1685x.m34455b(new RunnableC1996a(0, str, str2));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5559d.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return true;
        }
        return true;
    }
}
