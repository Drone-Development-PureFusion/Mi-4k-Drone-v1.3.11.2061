package com.baidu.tts.auth;

import com.baidu.tts.auth.C1068b;
import com.baidu.tts.auth.C1070c;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p090b.p091a.p093b.C1092e;
import com.baidu.tts.p090b.p091a.p093b.C1096f;
import com.baidu.tts.p102f.EnumC1180l;
import com.baidu.tts.p102f.EnumC1181m;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1191c;
import com.baidu.tts.p105h.p107b.C1192a;
import com.baidu.tts.p105h.p107b.C1193b;
import com.baidu.tts.p111k.C1201c;
import com.baidu.tts.p114m.C1231b;
import com.baidu.tts.p114m.C1239j;
import com.baidu.tts.tools.StringTool;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: com.baidu.tts.auth.a */
/* loaded from: classes.dex */
public class C1062a {

    /* renamed from: a */
    private static volatile C1062a f2462a = null;

    /* renamed from: b */
    private C1201c<C1070c, C1070c.C1071a> f2463b = new C1201c<>();

    /* renamed from: c */
    private C1201c<C1068b, C1068b.C1069a> f2464c = new C1201c<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.baidu.tts.auth.a$a */
    /* loaded from: classes.dex */
    public class CallableC1066a implements Callable<C1068b.C1069a> {

        /* renamed from: b */
        private C1092e.C1094b f2473b;

        public CallableC1066a(C1092e.C1094b c1094b) {
            this.f2473b = c1094b;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C1068b.C1069a call() {
            C1068b.C1069a c1069a = new C1068b.C1069a();
            C1192a m36284g = C1193b.m36288a().m36284g();
            if (m36284g == null) {
                c1069a.m36774a(C1191c.m36299a().m36292b(EnumC1182n.APP_RESOURCE_IS_NULL));
                return c1069a;
            }
            String m36672g = this.f2473b.m36672g();
            String m36674f = this.f2473b.m36674f();
            if (StringTool.isEmpty(m36674f)) {
                m36674f = m36284g.m36290b();
            }
            LoggerProxy.m36554d("AuthClient", "appCode=" + m36672g);
            LoggerProxy.m36554d("AuthClient", "licenseFilePath=" + m36674f);
            C1068b c1068b = new C1068b();
            c1068b.m36780a(m36672g);
            c1068b.m36778b(m36674f);
            return (C1068b.C1069a) C1062a.this.f2464c.m36247a(c1068b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.baidu.tts.auth.a$b */
    /* loaded from: classes.dex */
    public class CallableC1067b implements Callable<C1070c.C1071a> {

        /* renamed from: b */
        private C1096f.C1098b f2475b;

        public CallableC1067b(C1096f.C1098b c1098b) {
            this.f2475b = c1098b;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C1070c.C1071a call() {
            String m36646d = this.f2475b.m36646d();
            String m36657a = this.f2475b.m36657a();
            String m36652b = this.f2475b.m36652b();
            LoggerProxy.m36554d("AuthClient", "pid=" + m36646d);
            LoggerProxy.m36554d("AuthClient", "ak=" + m36657a);
            LoggerProxy.m36554d("AuthClient", "sk=" + m36652b);
            C1070c c1070c = new C1070c();
            c1070c.m36764a(m36646d);
            c1070c.m36761b(m36657a);
            c1070c.m36758c(m36652b);
            return (C1070c.C1071a) C1062a.this.f2463b.m36247a(c1070c);
        }
    }

    private C1062a() {
    }

    /* renamed from: a */
    public static C1062a m36796a() {
        if (f2462a == null) {
            synchronized (C1062a.class) {
                if (f2462a == null) {
                    f2462a = new C1062a();
                }
            }
        }
        return f2462a;
    }

    /* renamed from: a */
    private <T> T m36789a(Callable<T> callable, long j) {
        return m36790a(callable).get(j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    private <T> FutureTask<T> m36790a(Callable<T> callable) {
        FutureTask<T> futureTask = new FutureTask<>(callable);
        new Thread(futureTask).start();
        return futureTask;
    }

    /* renamed from: a */
    public AuthInfo m36792a(EnumC1181m enumC1181m, C1239j c1239j) {
        C1231b m36128a = c1239j.m36128a();
        AuthInfo authInfo = new AuthInfo();
        authInfo.setTtsEnum(enumC1181m);
        switch (enumC1181m) {
            case ONLINE:
                authInfo.setOnlineResult(m36793a(m36128a.m36199a()));
                return authInfo;
            case OFFLINE:
                authInfo.setOfflineResult(m36794a(m36128a.m36196b()));
                return authInfo;
            case MIX:
                return m36791a(m36128a);
            default:
                return authInfo;
        }
    }

    /* renamed from: a */
    public AuthInfo m36791a(final C1231b c1231b) {
        C1068b.C1069a c1069a;
        LoggerProxy.m36554d("AuthClient", "enter authMix");
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        FutureTask futureTask = new FutureTask(new Callable<C1070c.C1071a>() { // from class: com.baidu.tts.auth.a.1
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public C1070c.C1071a call() {
                try {
                    return C1062a.this.m36793a(c1231b.m36199a());
                } finally {
                    countDownLatch.countDown();
                }
            }
        });
        FutureTask futureTask2 = new FutureTask(new Callable<C1068b.C1069a>() { // from class: com.baidu.tts.auth.a.2
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public C1068b.C1069a call() {
                try {
                    return C1062a.this.m36794a(c1231b.m36196b());
                } finally {
                    countDownLatch.countDown();
                }
            }
        });
        new Thread(futureTask).start();
        new Thread(futureTask2).start();
        try {
            LoggerProxy.m36554d("AuthClient", "+ await");
            countDownLatch.await();
            LoggerProxy.m36554d("AuthClient", "- await");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            futureTask.cancel(true);
            futureTask2.cancel(true);
        }
        C1070c.C1071a c1071a = new C1070c.C1071a();
        LoggerProxy.m36554d("AuthClient", "+ mix online get onlineResult=" + c1071a);
        try {
            c1071a = (C1070c.C1071a) futureTask.get();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            futureTask.cancel(true);
            c1071a.m36754a(C1191c.m36299a().m36293a(EnumC1182n.ONLINE_AUTH_INTERRUPTED_EXCEPTION, e2));
        } catch (CancellationException e3) {
            c1071a.m36754a(C1191c.m36299a().m36293a(EnumC1182n.ONLINE_AUTH_CANCELLATION_EXCEPTION, e3));
        } catch (ExecutionException e4) {
            c1071a.m36754a(C1191c.m36299a().m36293a(EnumC1182n.ONLINE_AUTH_EXECUTION_EXCEPTION, e4.getCause()));
        }
        LoggerProxy.m36554d("AuthClient", "- online get");
        C1068b.C1069a c1069a2 = new C1068b.C1069a();
        LoggerProxy.m36554d("AuthClient", "+ mix offline get offlineResult=" + c1069a2);
        try {
            c1069a = (C1068b.C1069a) futureTask2.get();
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            futureTask2.cancel(true);
            c1069a2.m36774a(C1191c.m36299a().m36293a(EnumC1182n.OFFLINE_AUTH_INTERRUPTED_EXCEPTION, e5));
            c1069a = c1069a2;
        } catch (CancellationException e6) {
            c1069a2.m36774a(C1191c.m36299a().m36293a(EnumC1182n.OFFLINE_AUTH_CANCELLATION_EXCEPTION, e6));
            c1069a = c1069a2;
        } catch (ExecutionException e7) {
            c1069a2.m36774a(C1191c.m36299a().m36293a(EnumC1182n.OFFLINE_AUTH_EXECUTION_EXCEPTION, e7.getCause()));
            c1069a = c1069a2;
        }
        LoggerProxy.m36554d("AuthClient", "- offline get");
        AuthInfo authInfo = new AuthInfo();
        authInfo.setTtsEnum(EnumC1181m.MIX);
        authInfo.setOnlineResult(c1071a);
        authInfo.setOfflineResult(c1069a);
        LoggerProxy.m36554d("AuthClient", "end authMix");
        return authInfo;
    }

    /* renamed from: a */
    public C1068b.C1069a m36794a(C1092e.C1094b c1094b) {
        C1068b.C1069a c1069a = new C1068b.C1069a();
        try {
            return (C1068b.C1069a) m36789a(new CallableC1066a(c1094b), EnumC1180l.DEFAULT.m36312a());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            c1069a.m36774a(C1191c.m36299a().m36293a(EnumC1182n.OFFLINE_AUTH_INTERRUPTED_EXCEPTION, e));
            return c1069a;
        } catch (CancellationException e2) {
            c1069a.m36774a(C1191c.m36299a().m36293a(EnumC1182n.OFFLINE_AUTH_CANCELLATION_EXCEPTION, e2));
            return c1069a;
        } catch (ExecutionException e3) {
            c1069a.m36774a(C1191c.m36299a().m36293a(EnumC1182n.OFFLINE_AUTH_EXECUTION_EXCEPTION, e3.getCause()));
            return c1069a;
        } catch (TimeoutException e4) {
            c1069a.m36774a(C1191c.m36299a().m36293a(EnumC1182n.OFFLINE_AUTH_TIMEOUT_EXCEPTION, e4));
            return c1069a;
        }
    }

    /* renamed from: a */
    public C1070c.C1071a m36793a(C1096f.C1098b c1098b) {
        C1070c.C1071a c1071a = new C1070c.C1071a();
        try {
            return (C1070c.C1071a) m36789a(new CallableC1067b(c1098b), EnumC1180l.DEFAULT.m36312a());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            c1071a.m36754a(C1191c.m36299a().m36293a(EnumC1182n.ONLINE_AUTH_INTERRUPTED_EXCEPTION, e));
            return c1071a;
        } catch (CancellationException e2) {
            c1071a.m36754a(C1191c.m36299a().m36293a(EnumC1182n.ONLINE_AUTH_CANCELLATION_EXCEPTION, e2));
            return c1071a;
        } catch (ExecutionException e3) {
            c1071a.m36754a(C1191c.m36299a().m36293a(EnumC1182n.ONLINE_AUTH_EXECUTION_EXCEPTION, e3.getCause()));
            return c1071a;
        } catch (TimeoutException e4) {
            c1071a.m36754a(C1191c.m36299a().m36293a(EnumC1182n.ONLINE_AUTH_TIMEOUT_EXCEPTION, e4));
            return c1071a;
        }
    }

    /* renamed from: b */
    public void m36788b() {
        if (this.f2463b != null) {
            this.f2463b.m36248a();
        }
        if (this.f2464c != null) {
            this.f2464c.m36248a();
        }
    }
}
