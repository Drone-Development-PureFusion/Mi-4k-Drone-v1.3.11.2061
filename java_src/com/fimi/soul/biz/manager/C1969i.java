package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p184l.C1924j;
import com.fimi.soul.biz.p185m.AbstractC1941g;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.HomePage;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.i */
/* loaded from: classes.dex */
public class C1969i implements Handler.Callback {

    /* renamed from: a */
    private static C1969i f5451a = null;

    /* renamed from: b */
    private static final int f5452b = 10;

    /* renamed from: c */
    private static final int f5453c = 11;

    /* renamed from: d */
    private static final int f5454d = 12;

    /* renamed from: e */
    private Context f5455e;

    /* renamed from: f */
    private HashMap<Integer, AbstractC1945k> f5456f = new HashMap<>();

    /* renamed from: g */
    private Handler f5457g = new Handler(this);

    /* renamed from: h */
    private AbstractC1941g f5458h = new C1924j();

    /* renamed from: com.fimi.soul.biz.manager.i$a */
    /* loaded from: classes.dex */
    class RunnableC1970a implements Runnable {

        /* renamed from: b */
        private int f5460b;

        /* renamed from: c */
        private HomePage f5461c;

        public RunnableC1970a(int i, HomePage homePage) {
            this.f5460b = i;
            this.f5461c = homePage;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C1969i.this.f5457g.obtainMessage();
            PlaneMsg planeMsg = null;
            if (this.f5460b == 11) {
                planeMsg = C1969i.this.f5458h.mo33486a(this.f5461c, C1969i.this.f5455e);
            } else if (this.f5460b == 12) {
                planeMsg = C1969i.this.f5458h.mo33484b(this.f5461c, C1969i.this.f5455e);
            } else if (this.f5460b == 10) {
                planeMsg = C1969i.this.f5458h.mo33485b(C1969i.this.f5455e);
            }
            obtainMessage.what = this.f5460b;
            obtainMessage.obj = planeMsg;
            C1969i.this.f5457g.sendMessage(obtainMessage);
        }
    }

    public C1969i(Context context) {
        this.f5455e = null;
        this.f5455e = context;
    }

    /* renamed from: a */
    public static C1969i m33379a(Context context) {
        if (f5451a == null) {
            f5451a = new C1969i(context);
        }
        return f5451a;
    }

    /* renamed from: a */
    public void m33378a(AbstractC1945k abstractC1945k) {
        this.f5456f.put(10, abstractC1945k);
        C1685x.m34455b(new RunnableC1970a(10, null));
    }

    /* renamed from: a */
    public void m33376a(HomePage homePage, AbstractC1945k abstractC1945k) {
        this.f5456f.put(12, abstractC1945k);
        C1685x.m34455b(new RunnableC1970a(12, homePage));
    }

    /* renamed from: b */
    public void m33374b(HomePage homePage, AbstractC1945k abstractC1945k) {
        this.f5456f.put(11, abstractC1945k);
        C1685x.m34455b(new RunnableC1970a(11, homePage));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5456f.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return false;
        }
        return false;
    }
}
