package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p184l.C1915b;
import com.fimi.soul.biz.p185m.AbstractC1937c;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.BroadcastMode;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.b */
/* loaded from: classes.dex */
public class C1955b implements Handler.Callback {

    /* renamed from: a */
    private static C1955b f5371a = null;

    /* renamed from: b */
    private static final int f5372b = 0;

    /* renamed from: c */
    private static final int f5373c = 3;

    /* renamed from: d */
    private static final int f5374d = 5;

    /* renamed from: e */
    private static final int f5375e = 6;

    /* renamed from: f */
    private static final int f5376f = 7;

    /* renamed from: g */
    private static final int f5377g = 9;

    /* renamed from: h */
    private static final int f5378h = 10;

    /* renamed from: i */
    private static final int f5379i = 8;

    /* renamed from: j */
    private static final int f5380j = 1;

    /* renamed from: k */
    private static final int f5381k = 4;

    /* renamed from: l */
    private static final int f5382l = 2;

    /* renamed from: o */
    private Context f5385o;

    /* renamed from: m */
    private AbstractC1937c f5383m = new C1915b();

    /* renamed from: n */
    private Handler f5384n = new Handler(this);

    /* renamed from: p */
    private HashMap<Integer, AbstractC1945k> f5386p = new HashMap<>();

    /* renamed from: com.fimi.soul.biz.manager.b$a */
    /* loaded from: classes.dex */
    class RunnableC1956a implements Runnable {

        /* renamed from: b */
        private int f5388b;

        /* renamed from: c */
        private BroadcastMode f5389c;

        /* renamed from: d */
        private String f5390d;

        /* renamed from: e */
        private int f5391e;

        public RunnableC1956a(int i, String str, int i2, BroadcastMode broadcastMode) {
            this.f5388b = i;
            this.f5389c = broadcastMode;
            this.f5390d = str;
            this.f5391e = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C1955b.this.f5384n.obtainMessage();
            PlaneMsg planeMsg = null;
            if (this.f5388b == 0) {
                planeMsg = C1955b.this.f5383m.a(C1955b.this.f5385o);
            } else if (this.f5388b == 1) {
                planeMsg = C1955b.this.f5383m.mo33499a(this.f5389c, C1955b.this.f5385o);
            } else if (this.f5388b == 3) {
                planeMsg = C1955b.this.f5383m.mo33501a(C1955b.this.f5385o, this.f5390d, this.f5391e);
            } else if (this.f5388b == 6) {
                planeMsg = C1955b.this.f5383m.mo33503a(C1955b.this.f5385o, this.f5391e);
            } else if (this.f5388b == 5) {
                planeMsg = C1955b.this.f5383m.mo33498b(C1955b.this.f5385o, this.f5391e);
            } else if (this.f5388b == 7) {
                planeMsg = C1955b.this.f5383m.mo33494c(C1955b.this.f5385o, this.f5390d, this.f5391e);
            } else if (this.f5388b == 8) {
                planeMsg = C1955b.this.f5383m.mo33495b(this.f5389c, C1955b.this.f5385o);
            } else if (this.f5388b == 9) {
                planeMsg = C1955b.this.f5383m.mo33493c(this.f5389c, C1955b.this.f5385o);
            } else if (this.f5388b == 10) {
                planeMsg = C1955b.this.f5383m.mo33492c(this.f5389c.getBroadcastID(), C1955b.this.f5385o);
            }
            obtainMessage.what = this.f5388b;
            obtainMessage.obj = planeMsg;
            C1955b.this.f5384n.sendMessage(obtainMessage);
        }
    }

    /* renamed from: com.fimi.soul.biz.manager.b$b */
    /* loaded from: classes.dex */
    public enum EnumC1957b {
        BYUSERID,
        RECENT,
        HOT,
        FOLLOW
    }

    public C1955b(Context context) {
        this.f5385o = null;
        this.f5385o = context;
    }

    /* renamed from: a */
    public static C1955b m33431a(Context context) {
        if (f5371a == null) {
            f5371a = new C1955b(context);
        }
        return f5371a;
    }

    /* renamed from: a */
    public void m33430a(AbstractC1945k abstractC1945k) {
        this.f5386p.put(0, abstractC1945k);
        C1685x.m34455b(new RunnableC1956a(0, null, 1, null));
    }

    /* renamed from: a */
    public void m33428a(BroadcastMode broadcastMode, AbstractC1945k abstractC1945k) {
        this.f5386p.put(1, abstractC1945k);
        C1685x.m34455b(new RunnableC1956a(1, null, 1, broadcastMode));
    }

    /* renamed from: a */
    public void m33427a(String str, int i, EnumC1957b enumC1957b, AbstractC1945k abstractC1945k) {
        if (enumC1957b == EnumC1957b.BYUSERID) {
            this.f5386p.put(3, abstractC1945k);
            C1685x.m34455b(new RunnableC1956a(3, str, i, null));
        } else if (enumC1957b == EnumC1957b.FOLLOW) {
            this.f5386p.put(7, abstractC1945k);
            C1685x.m34455b(new RunnableC1956a(7, str, i, null));
        } else if (enumC1957b == EnumC1957b.HOT) {
            this.f5386p.put(5, abstractC1945k);
            C1685x.m34455b(new RunnableC1956a(5, str, i, null));
        } else if (enumC1957b != EnumC1957b.RECENT) {
        } else {
            this.f5386p.put(6, abstractC1945k);
            C1685x.m34455b(new RunnableC1956a(6, str, i, null));
        }
    }

    /* renamed from: a */
    public void m33426a(String str, AbstractC1945k abstractC1945k) {
        BroadcastMode broadcastMode = new BroadcastMode();
        broadcastMode.setBroadcastID(str);
        this.f5386p.put(10, abstractC1945k);
        C1685x.m34455b(new RunnableC1956a(10, null, 1, broadcastMode));
    }

    /* renamed from: b */
    public void m33424b(BroadcastMode broadcastMode, AbstractC1945k abstractC1945k) {
        this.f5386p.put(8, abstractC1945k);
        C1685x.m34455b(new RunnableC1956a(8, null, 1, broadcastMode));
    }

    /* renamed from: c */
    public void m33422c(BroadcastMode broadcastMode, AbstractC1945k abstractC1945k) {
        this.f5386p.put(9, abstractC1945k);
        C1685x.m34455b(new RunnableC1956a(9, null, 1, broadcastMode));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5386p.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return false;
        }
        return false;
    }
}
