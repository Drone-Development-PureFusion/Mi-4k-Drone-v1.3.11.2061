package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p184l.C1923i;
import com.fimi.soul.biz.p185m.AbstractC1940f;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.h */
/* loaded from: classes.dex */
public class C1967h implements Handler.Callback {

    /* renamed from: a */
    private static final int f5443a = 0;

    /* renamed from: f */
    private static C1967h f5444f;

    /* renamed from: b */
    private Context f5445b;

    /* renamed from: c */
    private Handler f5446c = new Handler(this);

    /* renamed from: d */
    private HashMap<Integer, AbstractC1945k> f5447d = new HashMap<>();

    /* renamed from: e */
    private AbstractC1940f f5448e = new C1923i();

    /* renamed from: com.fimi.soul.biz.manager.h$a */
    /* loaded from: classes.dex */
    class RunnableC1968a implements Runnable {

        /* renamed from: a */
        int f5449a;

        public RunnableC1968a(int i) {
            this.f5449a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C1967h.this.f5446c.obtainMessage();
            PlaneMsg planeMsg = null;
            if (this.f5449a == 0) {
                planeMsg = C1967h.this.f5448e.mo33487a(C1967h.this.f5445b);
            }
            obtainMessage.what = this.f5449a;
            obtainMessage.obj = planeMsg;
            C1967h.this.f5446c.sendMessage(obtainMessage);
        }
    }

    private C1967h(Context context) {
        this.f5445b = context;
        this.f5445b = context;
    }

    /* renamed from: a */
    public static C1967h m33384a(Context context) {
        if (f5444f == null) {
            f5444f = new C1967h(context.getApplicationContext());
        }
        return f5444f;
    }

    /* renamed from: a */
    public void m33383a(AbstractC1945k abstractC1945k) {
        this.f5447d.put(0, abstractC1945k);
        C1685x.m34455b(new RunnableC1968a(0));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5447d.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return false;
        }
        return false;
    }
}
