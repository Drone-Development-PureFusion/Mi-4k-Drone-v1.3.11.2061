package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p184l.C1932r;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.biz.p185m.AbstractC1948n;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpdateDroneItem;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.v */
/* loaded from: classes.dex */
public class C2009v implements Handler.Callback {

    /* renamed from: a */
    private static C2009v f5608a = null;

    /* renamed from: b */
    private static final int f5609b = 0;

    /* renamed from: c */
    private static final int f5610c = 1;

    /* renamed from: d */
    private static final int f5611d = 2;

    /* renamed from: e */
    private static final int f5612e = 3;

    /* renamed from: f */
    private static final int f5613f = 4;

    /* renamed from: g */
    private static final int f5614g = 5;

    /* renamed from: h */
    private AbstractC1948n f5615h = new C1932r();

    /* renamed from: i */
    private Handler f5616i = new Handler(this);

    /* renamed from: j */
    private HashMap<Integer, AbstractC1945k> f5617j = new HashMap<>();

    /* renamed from: k */
    private Context f5618k;

    /* renamed from: com.fimi.soul.biz.manager.v$a */
    /* loaded from: classes.dex */
    class RunnableC2010a implements Runnable {

        /* renamed from: b */
        private int f5620b;

        /* renamed from: c */
        private UpdateDroneItem f5621c;

        /* renamed from: d */
        private String f5622d;

        /* renamed from: e */
        private int f5623e;

        /* renamed from: f */
        private String f5624f;

        public RunnableC2010a(int i, UpdateDroneItem updateDroneItem) {
            this.f5620b = i;
            this.f5621c = updateDroneItem;
        }

        public RunnableC2010a(int i, String str) {
            this.f5622d = str;
            this.f5620b = i;
        }

        public RunnableC2010a(int i, String str, int i2) {
            this.f5620b = i;
            this.f5622d = str;
            this.f5623e = i2;
        }

        public RunnableC2010a(int i, String str, int i2, String str2) {
            this.f5620b = i;
            this.f5622d = str;
            this.f5623e = i2;
            this.f5624f = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C2009v.this.f5616i.obtainMessage();
            PlaneMsg planeMsg = null;
            if (this.f5620b == 0) {
                planeMsg = C2009v.this.f5615h.mo33474a(this.f5621c, C2009v.this.f5618k);
            } else if (this.f5620b == 1) {
                planeMsg = C2009v.this.f5615h.mo33472b(this.f5621c, C2009v.this.f5618k);
            } else if (this.f5620b == 2) {
                planeMsg = C2009v.this.f5615h.mo33471c(this.f5622d, C2009v.this.f5618k);
            } else if (this.f5620b == 3) {
                planeMsg = C2009v.this.f5615h.mo33470d(this.f5622d, C2009v.this.f5618k);
            } else if (this.f5620b == 4) {
                planeMsg = C2009v.this.f5615h.mo33469e(this.f5622d, C2009v.this.f5618k);
            } else if (this.f5620b == 5) {
                planeMsg = C2009v.this.f5615h.mo33473a(this.f5622d, this.f5624f, this.f5623e, C2009v.this.f5618k);
            }
            obtainMessage.what = this.f5620b;
            obtainMessage.obj = planeMsg;
            C2009v.this.f5616i.sendMessage(obtainMessage);
        }
    }

    public C2009v(Context context) {
        this.f5618k = null;
        this.f5618k = context;
    }

    /* renamed from: a */
    public static C2009v m33278a(Context context) {
        if (f5608a == null) {
            f5608a = new C2009v(context);
        }
        return f5608a;
    }

    /* renamed from: a */
    public void m33276a(UpdateDroneItem updateDroneItem, AbstractC1945k abstractC1945k) {
        this.f5617j.put(0, abstractC1945k);
        C1685x.m34455b(new RunnableC2010a(0, updateDroneItem));
    }

    /* renamed from: a */
    public void m33275a(String str, AbstractC1945k abstractC1945k) {
        this.f5617j.put(2, abstractC1945k);
        C1685x.m34455b(new RunnableC2010a(2, str));
    }

    /* renamed from: a */
    public void m33274a(String str, String str2, int i, AbstractC1945k abstractC1945k) {
        this.f5617j.put(5, abstractC1945k);
        C1685x.m34455b(new RunnableC2010a(5, str, i, str2));
    }

    /* renamed from: b */
    public void m33272b(UpdateDroneItem updateDroneItem, AbstractC1945k abstractC1945k) {
        this.f5617j.put(1, abstractC1945k);
        C1685x.m34455b(new RunnableC2010a(1, updateDroneItem));
    }

    /* renamed from: b */
    public void m33271b(String str, AbstractC1945k abstractC1945k) {
        this.f5617j.put(3, abstractC1945k);
        C1685x.m34455b(new RunnableC2010a(3, str));
    }

    /* renamed from: c */
    public void m33269c(String str, AbstractC1945k abstractC1945k) {
        this.f5617j.put(4, abstractC1945k);
        C1685x.m34455b(new RunnableC2010a(4, str));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5617j.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return false;
        }
        return false;
    }
}
