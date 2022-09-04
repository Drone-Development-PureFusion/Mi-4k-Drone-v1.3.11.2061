package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p184l.C1930p;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.biz.p185m.AbstractC1947m;
import com.fimi.soul.entity.PlaneMsg;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.r */
/* loaded from: classes.dex */
public class C1997r implements Handler.Callback {

    /* renamed from: e */
    private static final int f5567e = 0;

    /* renamed from: f */
    private static final int f5568f = 1;

    /* renamed from: g */
    private static C1997r f5569g = null;

    /* renamed from: a */
    private Handler f5570a;

    /* renamed from: c */
    private Context f5572c;

    /* renamed from: d */
    private AbstractC1947m f5573d = new C1930p();

    /* renamed from: b */
    private HashMap<Integer, AbstractC1945k> f5571b = new HashMap<>();

    /* renamed from: com.fimi.soul.biz.manager.r$a */
    /* loaded from: classes.dex */
    class RunnableC1998a implements Runnable {

        /* renamed from: a */
        int f5574a;

        /* renamed from: b */
        String f5575b;

        public RunnableC1998a(int i, String str) {
            this.f5574a = i;
            this.f5575b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C1997r.this.f5570a.obtainMessage();
            PlaneMsg planeMsg = null;
            if (this.f5574a == 0) {
                planeMsg = C1997r.this.f5573d.mo33476c(this.f5575b, C1997r.this.f5572c);
            } else if (this.f5574a == 1) {
                planeMsg = C1997r.this.f5573d.mo33475d(this.f5575b, C1997r.this.f5572c);
            }
            obtainMessage.what = this.f5574a;
            obtainMessage.obj = planeMsg;
            C1997r.this.f5570a.sendMessage(obtainMessage);
        }
    }

    private C1997r(Context context) {
        this.f5572c = context;
        this.f5570a = new Handler(this.f5572c.getMainLooper(), this);
    }

    /* renamed from: a */
    public static C1997r m33315a(Context context) {
        if (f5569g == null) {
            f5569g = new C1997r(context.getApplicationContext());
        }
        return f5569g;
    }

    /* renamed from: a */
    public void m33313a(String str, AbstractC1945k abstractC1945k) {
        this.f5571b.put(0, abstractC1945k);
        C1685x.m34455b(new RunnableC1998a(0, str));
    }

    /* renamed from: b */
    public void m33311b(String str, AbstractC1945k abstractC1945k) {
        this.f5571b.put(1, abstractC1945k);
        C1685x.m34455b(new RunnableC1998a(1, str));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5571b.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return false;
        }
        return false;
    }
}
