package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p184l.C1933s;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.biz.p185m.AbstractC1949o;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.Relation;
import com.fimi.soul.entity.User;
import com.xiaomi.account.openauth.XMAuthericationException;
import java.io.File;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.y */
/* loaded from: classes.dex */
public class C2015y implements Handler.Callback {

    /* renamed from: a */
    private static C2015y f5642a = null;

    /* renamed from: b */
    private static final int f5643b = 0;

    /* renamed from: c */
    private static final int f5644c = 1;

    /* renamed from: d */
    private static final int f5645d = 2;

    /* renamed from: e */
    private static final int f5646e = 3;

    /* renamed from: f */
    private static final int f5647f = 4;

    /* renamed from: g */
    private static final int f5648g = 5;

    /* renamed from: h */
    private static final int f5649h = 6;

    /* renamed from: i */
    private static final int f5650i = 7;

    /* renamed from: j */
    private static final int f5651j = 8;

    /* renamed from: k */
    private static final int f5652k = 10;

    /* renamed from: l */
    private static final int f5653l = 11;

    /* renamed from: m */
    private static final int f5654m = 12;

    /* renamed from: n */
    private static final int f5655n = 13;

    /* renamed from: o */
    private static final int f5656o = 14;

    /* renamed from: p */
    private static final int f5657p = 15;

    /* renamed from: q */
    private static final int f5658q = 16;

    /* renamed from: r */
    private static final int f5659r = 17;

    /* renamed from: s */
    private static final int f5660s = 18;

    /* renamed from: t */
    private static final int f5661t = 19;

    /* renamed from: u */
    private AbstractC1949o f5662u;

    /* renamed from: v */
    private C1964f f5663v;

    /* renamed from: w */
    private Handler f5664w;

    /* renamed from: x */
    private HashMap<Integer, AbstractC1945k> f5665x = new HashMap<>();

    /* renamed from: y */
    private Context f5666y;

    /* renamed from: com.fimi.soul.biz.manager.y$a */
    /* loaded from: classes.dex */
    class RunnableC2017a implements Runnable {

        /* renamed from: b */
        private int f5669b;

        /* renamed from: c */
        private User f5670c;

        /* renamed from: d */
        private int f5671d;

        /* renamed from: e */
        private String f5672e;

        /* renamed from: f */
        private String f5673f;

        /* renamed from: g */
        private long f5674g;

        /* renamed from: h */
        private long f5675h;

        /* renamed from: i */
        private String f5676i;

        /* renamed from: j */
        private String f5677j;

        public RunnableC2017a(int i, int i2, User user) {
            this.f5669b = i;
            this.f5670c = user;
            this.f5671d = i2;
        }

        public RunnableC2017a(int i, int i2, User user, String str) {
            this.f5669b = i;
            this.f5670c = user;
            this.f5671d = i2;
            this.f5672e = str;
        }

        public RunnableC2017a(int i, String str) {
            this.f5669b = i;
            this.f5677j = str;
        }

        public RunnableC2017a(int i, String str, int i2) {
            this.f5669b = i;
            this.f5677j = str;
            this.f5676i = String.valueOf(i2);
        }

        public RunnableC2017a(int i, String str, long j, long j2, String str2) {
            this.f5669b = i;
            this.f5673f = str;
            this.f5674g = j;
            this.f5676i = str2;
            this.f5675h = j2;
        }

        public RunnableC2017a(int i, String str, String str2) {
            this.f5669b = i;
            this.f5673f = str;
            this.f5676i = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = C2015y.this.f5664w.obtainMessage();
            PlaneMsg planeMsg = null;
            if (this.f5669b == 0) {
                planeMsg = C2015y.this.f5662u.a(C2015y.this.f5666y);
            } else if (this.f5669b == 1) {
                planeMsg = C2015y.this.f5662u.mo33466a(this.f5670c, C2015y.this.f5666y);
            } else if (this.f5669b == 3) {
                try {
                    planeMsg = C2015y.this.f5662u.mo33463b(C2015y.this.f5666y);
                } catch (XMAuthericationException e) {
                    e.printStackTrace();
                }
            } else if (this.f5669b == 4) {
                planeMsg = C2015y.this.f5662u.mo33462b(this.f5670c, C2015y.this.f5666y);
            } else if (this.f5669b == 5) {
                planeMsg = C2015y.this.f5662u.mo33458c(this.f5670c, C2015y.this.f5666y);
            } else if (this.f5669b == 6) {
                planeMsg = C2015y.this.f5662u.mo33461b(this.f5670c.getUserID(), this.f5671d, C2015y.this.f5666y);
            } else if (this.f5669b == 16) {
                planeMsg = C2015y.this.f5662u.mo33457c(this.f5670c.getUserID(), this.f5671d, C2015y.this.f5666y);
            } else if (this.f5669b == 8) {
                planeMsg = C2015y.this.f5662u.mo33465a(this.f5670c.getNickName(), this.f5671d, C2015y.this.f5666y);
            } else if (this.f5669b == 7) {
                Relation relation = new Relation();
                relation.setUserID(this.f5670c.getUserID());
                relation.setRelationID(this.f5670c.getCountry());
                planeMsg = C2015y.this.f5662u.mo33468a(relation, C2015y.this.f5666y);
            } else if (this.f5669b == 10) {
                planeMsg = C2015y.this.f5662u.mo33454d(this.f5670c, C2015y.this.f5666y);
            } else if (this.f5669b == 11) {
                planeMsg = C2015y.this.f5662u.mo33453e(this.f5670c, C2015y.this.f5666y);
            } else if (this.f5669b == 12) {
                planeMsg = C2015y.this.f5662u.mo33467a(this.f5670c, this.f5671d, this.f5672e, C2015y.this.f5666y);
            } else if (this.f5669b == 13) {
                planeMsg = C2015y.this.f5662u.mo33452f(this.f5670c, C2015y.this.f5666y);
            } else if (this.f5669b == 14) {
                planeMsg = C2015y.this.f5662u.mo33460b(this.f5670c.getUserID(), this.f5670c.getDevice(), C2015y.this.f5666y);
            } else if (this.f5669b == 15) {
                planeMsg = C2015y.this.f5662u.mo33451g(this.f5670c, C2015y.this.f5666y);
            } else if (this.f5669b == 17) {
                planeMsg = C2015y.this.f5662u.mo33455c(this.f5673f, this.f5676i, C2015y.this.f5666y);
            } else if (this.f5669b == 18) {
                planeMsg = C2015y.this.f5662u.mo33456c(this.f5677j, C2015y.this.f5666y);
            } else if (this.f5669b == 19) {
                planeMsg = C2015y.this.f5662u.mo33459c(C2015y.this.f5666y);
            }
            obtainMessage.what = this.f5669b;
            obtainMessage.obj = planeMsg;
            C2015y.this.f5664w.sendMessage(obtainMessage);
        }
    }

    public C2015y(Context context) {
        this.f5666y = null;
        this.f5662u = new C1933s(context);
        this.f5663v = C1964f.m33399a(context);
        this.f5664w = new Handler(context.getMainLooper(), this);
        this.f5666y = context;
    }

    /* renamed from: a */
    public static C2015y m33256a(Context context) {
        if (f5642a == null) {
            f5642a = new C2015y(context.getApplicationContext());
        }
        return f5642a;
    }

    /* renamed from: a */
    public void m33255a(Context context, AbstractC1945k abstractC1945k) {
        this.f5663v.m33395a(new AbstractC1945k() { // from class: com.fimi.soul.biz.manager.y.1
            @Override // com.fimi.soul.biz.p185m.AbstractC1945k
            /* renamed from: a */
            public void mo28106a(PlaneMsg planeMsg, File file) {
                C1756a.m34261a("Create fds server" + planeMsg.isSuccess(), C2015y.class);
            }
        });
        this.f5665x.put(3, abstractC1945k);
        C1685x.m34455b(new RunnableC2017a(3, 0, (User) null));
    }

    /* renamed from: a */
    public void m33254a(AbstractC1945k abstractC1945k) {
        this.f5665x.put(0, abstractC1945k);
        C1685x.m34455b(new RunnableC2017a(0, 0, (User) null));
    }

    /* renamed from: a */
    public void m33252a(User user, int i, AbstractC1945k abstractC1945k) {
        this.f5665x.put(11, abstractC1945k);
        C1685x.m34455b(new RunnableC2017a(11, 0, user));
    }

    /* renamed from: a */
    public void m33251a(User user, int i, String str, AbstractC1945k abstractC1945k) {
        this.f5665x.put(12, abstractC1945k);
        C1685x.m34455b(new RunnableC2017a(12, i, user, str));
    }

    /* renamed from: a */
    public void m33250a(User user, AbstractC1945k abstractC1945k) {
        this.f5665x.put(15, abstractC1945k);
        C1685x.m34455b(new RunnableC2017a(15, 0, user));
    }

    /* renamed from: a */
    public void m33249a(String str, int i, AbstractC1945k abstractC1945k) {
        this.f5665x.put(6, abstractC1945k);
        User user = new User();
        user.setUserID(str);
        C1685x.m34455b(new RunnableC2017a(6, i, user));
    }

    /* renamed from: a */
    public void m33248a(String str, AbstractC1945k abstractC1945k) {
        this.f5665x.put(14, abstractC1945k);
        User user = new User();
        user.setUserID(C1756a.m34259c(this.f5666y).getUserID());
        user.setDevice(str);
        C1685x.m34455b(new RunnableC2017a(14, 0, user));
    }

    /* renamed from: a */
    public void m33247a(String str, String str2, AbstractC1945k abstractC1945k) {
        this.f5665x.put(10, abstractC1945k);
        User user = new User();
        user.setUserID(str);
        user.setCountry(str2);
        C1685x.m34455b(new RunnableC2017a(10, 0, user));
    }

    /* renamed from: b */
    public void m33246b(AbstractC1945k abstractC1945k) {
        this.f5665x.put(19, abstractC1945k);
        C1685x.m34455b(new RunnableC2017a(19, null));
    }

    /* renamed from: b */
    public void m33244b(User user, AbstractC1945k abstractC1945k) {
        this.f5665x.put(13, abstractC1945k);
        C1685x.m34455b(new RunnableC2017a(13, 0, user));
    }

    /* renamed from: b */
    public void m33243b(String str, int i, AbstractC1945k abstractC1945k) {
        this.f5665x.put(16, abstractC1945k);
        User user = new User();
        user.setUserID(str);
        C1685x.m34455b(new RunnableC2017a(16, i, user));
    }

    /* renamed from: b */
    public void m33242b(String str, AbstractC1945k abstractC1945k) {
        this.f5665x.put(18, abstractC1945k);
        C1685x.m34455b(new RunnableC2017a(18, str));
    }

    /* renamed from: b */
    public void m33241b(String str, String str2, AbstractC1945k abstractC1945k) {
        this.f5665x.put(7, abstractC1945k);
        User user = new User();
        user.setUserID(str);
        user.setCountry(str2);
        C1685x.m34455b(new RunnableC2017a(7, 0, user));
    }

    /* renamed from: c */
    public void m33239c(User user, AbstractC1945k abstractC1945k) {
        this.f5665x.put(4, abstractC1945k);
        C1685x.m34455b(new RunnableC2017a(4, 0, user));
    }

    /* renamed from: c */
    public void m33238c(String str, int i, AbstractC1945k abstractC1945k) {
        this.f5665x.put(8, abstractC1945k);
        User user = new User();
        user.setNickName(str);
        C1685x.m34455b(new RunnableC2017a(8, i, user));
    }

    /* renamed from: c */
    public void m33237c(String str, String str2, AbstractC1945k abstractC1945k) {
        this.f5665x.put(2, abstractC1945k);
        C1685x.m34455b(new RunnableC2017a(2, 0, new User()));
    }

    /* renamed from: d */
    public void m33236d(User user, AbstractC1945k abstractC1945k) {
        this.f5665x.put(1, abstractC1945k);
        C1685x.m34455b(new RunnableC2017a(1, 0, user));
    }

    /* renamed from: d */
    public void m33235d(String str, String str2, AbstractC1945k abstractC1945k) {
        this.f5665x.put(17, abstractC1945k);
        C1685x.m34455b(new RunnableC2017a(17, str, str2));
    }

    /* renamed from: e */
    public void m33234e(User user, AbstractC1945k abstractC1945k) {
        this.f5665x.put(5, abstractC1945k);
        C1685x.m34455b(new RunnableC2017a(5, 0, user));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5665x.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return false;
        }
        return false;
    }
}
