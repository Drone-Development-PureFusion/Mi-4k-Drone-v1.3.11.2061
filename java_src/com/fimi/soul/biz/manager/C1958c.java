package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p184l.C1915b;
import com.fimi.soul.biz.p185m.AbstractC1937c;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.BroadcastComment;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.c */
/* loaded from: classes.dex */
public class C1958c implements Handler.Callback {

    /* renamed from: a */
    private static C1958c f5397a = null;

    /* renamed from: b */
    private static final int f5398b = 1;

    /* renamed from: c */
    private static final int f5399c = 2;

    /* renamed from: d */
    private static final int f5400d = 4;

    /* renamed from: e */
    private static final int f5401e = 3;

    /* renamed from: h */
    private Context f5404h;

    /* renamed from: f */
    private AbstractC1937c f5402f = new C1915b();

    /* renamed from: g */
    private Handler f5403g = new Handler(this);

    /* renamed from: i */
    private HashMap<Integer, AbstractC1945k> f5405i = new HashMap<>();

    /* renamed from: com.fimi.soul.biz.manager.c$a */
    /* loaded from: classes.dex */
    class RunnableC1959a implements Runnable {

        /* renamed from: b */
        private int f5407b;

        /* renamed from: c */
        private BroadcastComment f5408c;

        /* renamed from: d */
        private String f5409d;

        /* renamed from: e */
        private int f5410e;

        public RunnableC1959a(int i, String str, int i2, BroadcastComment broadcastComment) {
            this.f5407b = i;
            this.f5408c = broadcastComment;
            this.f5409d = str;
            this.f5410e = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C1958c.this.f5403g.obtainMessage();
            PlaneMsg planeMsg = null;
            if (this.f5407b == 1) {
                planeMsg = C1958c.this.f5402f.mo33502a(C1958c.this.f5404h, this.f5408c);
            } else if (this.f5407b == 3) {
                planeMsg = C1958c.this.f5402f.mo33497b(C1958c.this.f5404h, this.f5409d, this.f5410e);
            } else if (this.f5407b == 2) {
                planeMsg = C1958c.this.f5402f.mo33500a(C1958c.this.f5404h, this.f5409d, this.f5408c.getUserID());
            } else if (this.f5407b == 4) {
                planeMsg = C1958c.this.f5402f.mo33496b(C1958c.this.f5404h, this.f5409d, this.f5408c.getUserID());
            }
            obtainMessage.what = this.f5407b;
            obtainMessage.obj = planeMsg;
            C1958c.this.f5403g.sendMessage(obtainMessage);
        }
    }

    public C1958c(Context context) {
        this.f5404h = null;
        this.f5404h = context;
    }

    /* renamed from: a */
    public static C1958c m33421a(Context context) {
        if (f5397a == null) {
            f5397a = new C1958c(context);
        }
        return f5397a;
    }

    /* renamed from: a */
    public void m33419a(BroadcastComment broadcastComment, AbstractC1945k abstractC1945k) {
        this.f5405i.put(1, abstractC1945k);
        C1685x.m34455b(new RunnableC1959a(1, null, 1, broadcastComment));
    }

    /* renamed from: a */
    public void m33418a(String str, int i, AbstractC1945k abstractC1945k) {
        this.f5405i.put(3, abstractC1945k);
        C1685x.m34455b(new RunnableC1959a(3, str, i, null));
    }

    /* renamed from: a */
    public void m33417a(String str, String str2, AbstractC1945k abstractC1945k) {
        BroadcastComment broadcastComment = new BroadcastComment();
        broadcastComment.setUserID(str2);
        this.f5405i.put(2, abstractC1945k);
        C1685x.m34455b(new RunnableC1959a(2, str, 1, broadcastComment));
    }

    /* renamed from: b */
    public void m33415b(String str, String str2, AbstractC1945k abstractC1945k) {
        BroadcastComment broadcastComment = new BroadcastComment();
        broadcastComment.setUserID(str2);
        this.f5405i.put(4, abstractC1945k);
        C1685x.m34455b(new RunnableC1959a(4, str, 1, broadcastComment));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5405i.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return false;
        }
        return false;
    }
}
