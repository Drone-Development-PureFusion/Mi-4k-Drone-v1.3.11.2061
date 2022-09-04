package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p184l.C1931q;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.biz.p185m.AbstractC1951q;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpgradeResultInfo;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.w */
/* loaded from: classes.dex */
public class C2011w implements Handler.Callback {

    /* renamed from: a */
    private static C2011w f5625a = null;

    /* renamed from: b */
    private static final int f5626b = 0;

    /* renamed from: c */
    private static final int f5627c = 1;

    /* renamed from: d */
    private static final int f5628d = 2;

    /* renamed from: e */
    private static final int f5629e = 3;

    /* renamed from: g */
    private Handler f5631g;

    /* renamed from: i */
    private Context f5633i;

    /* renamed from: f */
    private AbstractC1951q f5630f = new C1931q();

    /* renamed from: h */
    private HashMap<Integer, AbstractC1945k> f5632h = new HashMap<>();

    /* renamed from: com.fimi.soul.biz.manager.w$a */
    /* loaded from: classes.dex */
    class RunnableC2012a implements Runnable {

        /* renamed from: b */
        private int f5635b;

        /* renamed from: c */
        private String f5636c;

        /* renamed from: d */
        private UpgradeResultInfo f5637d;

        public RunnableC2012a(int i) {
            this.f5635b = i;
        }

        public RunnableC2012a(int i, UpgradeResultInfo upgradeResultInfo) {
            this.f5635b = i;
            this.f5637d = upgradeResultInfo;
        }

        public RunnableC2012a(int i, String str) {
            this.f5635b = i;
            this.f5636c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C2011w.this.f5631g.obtainMessage();
            PlaneMsg planeMsg = null;
            if (this.f5635b == 0) {
                planeMsg = C2011w.this.f5630f.mo33448a(C2011w.this.f5633i);
            } else if (this.f5635b == 1) {
                planeMsg = C2011w.this.f5630f.mo33446b(C2011w.this.f5633i);
            } else if (this.f5635b == 2) {
                planeMsg = C2011w.this.f5630f.mo33445c(C2011w.this.f5633i);
            } else if (this.f5635b == 3) {
                planeMsg = C2011w.this.f5630f.mo33447a(C2011w.this.f5633i, this.f5637d);
            }
            obtainMessage.what = this.f5635b;
            obtainMessage.obj = planeMsg;
            C2011w.this.f5631g.sendMessage(obtainMessage);
        }
    }

    public C2011w(Context context) {
        this.f5633i = null;
        this.f5631g = new Handler(context.getMainLooper(), this);
        this.f5633i = context;
    }

    /* renamed from: a */
    public static C2011w m33268a(Context context) {
        if (f5625a == null) {
            f5625a = new C2011w(context);
        }
        return f5625a;
    }

    /* renamed from: a */
    public void m33267a(AbstractC1945k abstractC1945k) {
        this.f5632h.put(0, abstractC1945k);
        C1685x.m34455b(new RunnableC2012a(0));
    }

    /* renamed from: a */
    public void m33266a(AbstractC1945k abstractC1945k, UpgradeResultInfo upgradeResultInfo) {
        this.f5632h.put(3, abstractC1945k);
        C1685x.m34455b(new RunnableC2012a(3, upgradeResultInfo));
    }

    /* renamed from: b */
    public void m33264b(AbstractC1945k abstractC1945k) {
        this.f5632h.put(1, abstractC1945k);
        C1685x.m34455b(new RunnableC2012a(1));
    }

    /* renamed from: c */
    public void m33262c(AbstractC1945k abstractC1945k) {
        this.f5632h.put(2, abstractC1945k);
        C1685x.m34455b(new RunnableC2012a(2));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj == null || this.f5632h.get(Integer.valueOf(message.what)) == null) {
            return false;
        }
        this.f5632h.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
        return false;
    }
}
