package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p184l.C1927m;
import com.fimi.soul.biz.p185m.AbstractC1944j;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.MessagePush;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.m */
/* loaded from: classes.dex */
public class C1977m implements Handler.Callback {

    /* renamed from: d */
    private static C1977m f5497d = null;

    /* renamed from: f */
    private static final int f5498f = 0;

    /* renamed from: c */
    private Context f5501c;

    /* renamed from: b */
    private HashMap<Integer, AbstractC1945k> f5500b = new HashMap<>();

    /* renamed from: e */
    private AbstractC1944j f5502e = new C1927m();

    /* renamed from: a */
    private Handler f5499a = new Handler(this);

    /* renamed from: com.fimi.soul.biz.manager.m$a */
    /* loaded from: classes.dex */
    class RunnableC1978a implements Runnable {

        /* renamed from: a */
        int f5503a;

        /* renamed from: b */
        MessagePush f5504b;

        public RunnableC1978a(int i) {
            this.f5503a = i;
        }

        public RunnableC1978a(int i, MessagePush messagePush) {
            this.f5503a = i;
            this.f5504b = messagePush;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C1977m.this.f5499a.obtainMessage();
            PlaneMsg planeMsg = null;
            if (this.f5503a == 0) {
                planeMsg = C1977m.this.f5502e.mo33481a(this.f5504b, C1977m.this.f5501c);
            }
            obtainMessage.what = this.f5503a;
            obtainMessage.obj = planeMsg;
            C1977m.this.f5499a.sendMessage(obtainMessage);
        }
    }

    private C1977m(Context context) {
        this.f5501c = context;
        this.f5501c = context;
    }

    /* renamed from: a */
    public static C1977m m33357a(Context context) {
        if (f5497d == null) {
            f5497d = new C1977m(context.getApplicationContext());
        }
        return f5497d;
    }

    /* renamed from: a */
    public void m33355a(MessagePush messagePush, AbstractC1945k abstractC1945k) {
        this.f5500b.put(0, abstractC1945k);
        C1685x.m34455b(new RunnableC1978a(0, messagePush));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5500b.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return false;
        }
        return false;
    }
}
