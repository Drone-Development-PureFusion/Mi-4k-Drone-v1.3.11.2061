package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p184l.C1914a;
import com.fimi.soul.biz.p185m.AbstractC1935a;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.AddPlane;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.a */
/* loaded from: classes.dex */
public class C1953a implements Handler.Callback {

    /* renamed from: a */
    private static C1953a f5362a = null;

    /* renamed from: e */
    private static final int f5363e = 1;

    /* renamed from: f */
    private Context f5367f;

    /* renamed from: c */
    private AbstractC1935a f5365c = new C1914a();

    /* renamed from: b */
    private Handler f5364b = new Handler(this);

    /* renamed from: d */
    private HashMap<Integer, AbstractC1945k> f5366d = new HashMap<>();

    /* renamed from: com.fimi.soul.biz.manager.a$a */
    /* loaded from: classes.dex */
    class RunnableC1954a implements Runnable {

        /* renamed from: b */
        private int f5369b;

        /* renamed from: c */
        private AddPlane f5370c;

        public RunnableC1954a(int i, AddPlane addPlane) {
            this.f5369b = i;
            this.f5370c = addPlane;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C1953a.this.f5364b.obtainMessage();
            PlaneMsg planeMsg = null;
            if (this.f5369b == 1) {
                planeMsg = C1953a.this.f5365c.mo33506a(this.f5370c, C1953a.this.f5367f);
            }
            obtainMessage.what = this.f5369b;
            obtainMessage.obj = planeMsg;
            C1953a.this.f5364b.sendMessage(obtainMessage);
        }
    }

    public C1953a(Context context) {
        this.f5367f = null;
        this.f5367f = context;
    }

    /* renamed from: a */
    public static C1953a m33436a(Context context) {
        if (f5362a == null) {
            f5362a = new C1953a(context);
        }
        return f5362a;
    }

    /* renamed from: a */
    public void m33434a(AddPlane addPlane, AbstractC1945k abstractC1945k) {
        this.f5366d.put(1, abstractC1945k);
        C1685x.m34455b(new RunnableC1954a(1, addPlane));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5366d.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return false;
        }
        return false;
    }
}
