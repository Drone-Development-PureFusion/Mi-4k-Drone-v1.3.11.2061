package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.p184l.C1925k;
import com.fimi.soul.biz.p185m.AbstractC1942h;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.k */
/* loaded from: classes.dex */
public class C1973k implements Handler.Callback {

    /* renamed from: e */
    private static final int f5477e = 1;

    /* renamed from: f */
    private Context f5479f;

    /* renamed from: d */
    private static C1973k f5476d = null;

    /* renamed from: a */
    public static String f5474a = "1";

    /* renamed from: b */
    public static String f5475b = "2";

    /* renamed from: c */
    private HashMap<Integer, AbstractC1945k> f5478c = new HashMap<>();

    /* renamed from: g */
    private AbstractC1942h f5480g = new C1925k();

    /* renamed from: h */
    private Handler f5481h = new Handler(this);

    /* renamed from: com.fimi.soul.biz.manager.k$a */
    /* loaded from: classes.dex */
    class RunnableC1974a implements Runnable {

        /* renamed from: b */
        private User f5483b;

        /* renamed from: c */
        private int f5484c;

        /* renamed from: d */
        private String f5485d;

        public RunnableC1974a(int i, String str, User user) {
            this.f5484c = i;
            this.f5483b = user;
            this.f5485d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C1973k.this.f5481h.obtainMessage();
            PlaneMsg planeMsg = null;
            switch (this.f5484c) {
                case 1:
                    planeMsg = C1973k.this.f5480g.mo33483a(this.f5483b, this.f5485d, C1973k.this.f5479f);
                    break;
            }
            obtainMessage.what = this.f5484c;
            obtainMessage.obj = planeMsg;
            C1973k.this.f5481h.sendMessage(obtainMessage);
        }
    }

    public C1973k(Context context) {
        this.f5479f = null;
        this.f5479f = context;
    }

    /* renamed from: a */
    public static C1973k m33368a(Context context) {
        if (f5476d == null) {
            f5476d = new C1973k(context);
        }
        return f5476d;
    }

    /* renamed from: a */
    public void m33366a(User user, String str, AbstractC1945k abstractC1945k) {
        this.f5478c.put(1, abstractC1945k);
        C1685x.m34455b(new RunnableC1974a(1, str, user));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5478c.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return false;
        }
        return false;
    }
}
