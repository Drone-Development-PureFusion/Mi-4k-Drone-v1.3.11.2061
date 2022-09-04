package com.xiaomi.smack;

import android.os.SystemClock;
import android.support.p001v4.view.MotionEventCompat;
import android.support.p001v4.view.ViewCompat;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.xiaomi.network.Fallback;
import com.xiaomi.network.Host;
import com.xiaomi.network.HostManager;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.slim.C10710b;
import com.xiaomi.smack.packet.AbstractC10735d;
import com.xiaomi.smack.util.C10750e;
import com.xiaomi.stats.C10764h;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.xiaomi.smack.h */
/* loaded from: classes.dex */
public abstract class AbstractC10726h extends AbstractC10716a {

    /* renamed from: p */
    protected Socket f33435p;

    /* renamed from: r */
    protected XMPushService f33437r;

    /* renamed from: v */
    private String f33441v;

    /* renamed from: w */
    private int f33442w;

    /* renamed from: o */
    protected Exception f33434o = null;

    /* renamed from: q */
    String f33436q = null;

    /* renamed from: s */
    protected volatile long f33438s = 0;

    /* renamed from: t */
    protected volatile long f33439t = 0;

    /* renamed from: u */
    protected volatile long f33440u = 0;

    public AbstractC10726h(XMPushService xMPushService, C10718b c10718b) {
        super(xMPushService, c10718b);
        this.f33437r = xMPushService;
    }

    /* renamed from: a */
    private void m3943a(C10718b c10718b) {
        m3941a(c10718b.m3956e(), c10718b.m3957d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0225, code lost:
        if (android.text.TextUtils.equals(r10, com.xiaomi.channel.commonutils.network.C10423d.m5206k(r16.f33437r)) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0228 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m3941a(String str, int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        this.f33434o = null;
        ArrayList<String> arrayList = new ArrayList<>();
        int intValue = AbstractC10404b.m5263e("get bucket for host : " + str).intValue();
        Fallback m3934b = m3934b(str);
        AbstractC10404b.m5270a(Integer.valueOf(intValue));
        if (m3934b != null) {
            arrayList = m3934b.mo4737a(true);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(str);
        }
        this.f33440u = 0L;
        String m5206k = C10423d.m5206k(this.f33437r);
        StringBuilder sb = new StringBuilder();
        Iterator<String> it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = z3;
                break;
            }
            String next = it2.next();
            long currentTimeMillis = System.currentTimeMillis();
            this.f33400b++;
            try {
                AbstractC10404b.m5269a("begin to connect to " + next);
                this.f33435p = m3928s();
                this.f33435p.connect(Host.m4753b(next, i), 8000);
                AbstractC10404b.m5269a("tcp connected");
                this.f33435p.setTcpNoDelay(true);
                this.f33441v = next;
                mo3936b();
                z = true;
                try {
                    this.f33401c = System.currentTimeMillis() - currentTimeMillis;
                    this.f33409k = m5206k;
                    if (m3934b != 0) {
                        m3934b.m4763b(next, this.f33401c, 0L);
                    }
                    this.f33440u = SystemClock.elapsedRealtime();
                    AbstractC10404b.m5269a("connected to " + next + " in " + this.f33401c);
                    break;
                } catch (C10730l e) {
                    e = e;
                    if (m3934b != 0) {
                        try {
                            m3934b.m4762b(next, System.currentTimeMillis() - currentTimeMillis, 0L, e);
                        } catch (Throwable th) {
                            th = th;
                            if (!z) {
                                C10764h.m3776a(next, this.f33434o);
                            }
                            throw th;
                        }
                    }
                    this.f33434o = e;
                    AbstractC10404b.m5264d("SMACK: Could not connect to:" + next);
                    sb.append("SMACK: Could not connect to ").append(next).append(" port:").append(i).append(" ").append(e.getMessage()).append("\n");
                    if (!z) {
                        C10764h.m3776a(next, this.f33434o);
                        if (!TextUtils.equals(m5206k, C10423d.m5206k(this.f33437r))) {
                            HostManager.getInstance().persist();
                            if (z) {
                            }
                        }
                    }
                    z2 = z;
                    z3 = z2;
                } catch (IOException e2) {
                    e = e2;
                    if (m3934b != null) {
                        m3934b.m4762b(next, System.currentTimeMillis() - currentTimeMillis, 0L, e);
                    }
                    this.f33434o = e;
                    AbstractC10404b.m5264d("SMACK: Could not connect to:" + next);
                    sb.append("SMACK: Could not connect to ").append(next).append(" port:").append(i).append(" ").append(e.getMessage()).append("\n");
                    if (!z) {
                        C10764h.m3776a(next, this.f33434o);
                        if (!TextUtils.equals(m5206k, C10423d.m5206k(this.f33437r))) {
                            HostManager.getInstance().persist();
                            if (z) {
                            }
                        }
                    }
                    z2 = z;
                    z3 = z2;
                } catch (Throwable th2) {
                    th = th2;
                    z3 = true;
                    try {
                        this.f33434o = new Exception("abnormal exception", th);
                        AbstractC10404b.m5267a(th);
                    } catch (Throwable th3) {
                        th = th3;
                        z = z3;
                        if (!z) {
                        }
                        throw th;
                    }
                    if (!z3) {
                        C10764h.m3776a(next, this.f33434o);
                        if (!TextUtils.equals(m5206k, C10423d.m5206k(this.f33437r))) {
                            z = z3;
                            HostManager.getInstance().persist();
                            if (z) {
                            }
                        }
                    }
                    z2 = z3;
                    z3 = z2;
                }
            } catch (C10730l e3) {
                e = e3;
                z = z3;
            } catch (IOException e4) {
                e = e4;
                z = z3;
            } catch (Throwable th4) {
                th = th4;
            }
            z3 = z2;
        }
        HostManager.getInstance().persist();
        if (z) {
            throw new C10730l(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo3944a(int i, Exception exc) {
        if (m() != 2) {
            a(2, i, exc);
            this.f33408j = "";
            try {
                this.f33435p.close();
            } catch (Throwable th) {
            }
            this.f33438s = 0L;
            this.f33439t = 0L;
        }
    }

    /* renamed from: a */
    protected void m3942a(Exception exc) {
        if (SystemClock.elapsedRealtime() - this.f33440u >= MiStatInterface.MIN_UPLOAD_INTERVAL) {
            this.f33442w = 0;
        } else if (!C10423d.m5213d(this.f33437r)) {
        } else {
            this.f33442w++;
            if (this.f33442w < 2) {
                return;
            }
            String mo3931d = mo3931d();
            AbstractC10404b.m5269a("max short conn time reached, sink down current host:" + mo3931d);
            m3940a(mo3931d, 0L, exc);
            this.f33442w = 0;
        }
    }

    /* renamed from: a */
    protected void m3940a(String str, long j, Exception exc) {
        Fallback fallbacksByHost = HostManager.getInstance().getFallbacksByHost(C10718b.m3960b(), false);
        if (fallbacksByHost != null) {
            fallbacksByHost.m4762b(str, j, 0L, exc);
            HostManager.getInstance().persist();
        }
    }

    /* renamed from: a */
    protected abstract void mo3939a(boolean z);

    @Override // com.xiaomi.smack.AbstractC10716a
    /* renamed from: a */
    public void mo3938a(C10710b[] c10710bArr) {
        throw new C10730l("Don't support send Blob");
    }

    @Override // com.xiaomi.smack.AbstractC10716a
    /* renamed from: a */
    public void mo3937a(AbstractC10735d[] abstractC10735dArr) {
        for (AbstractC10735d abstractC10735d : abstractC10735dArr) {
            a(abstractC10735d);
        }
    }

    /* renamed from: b */
    Fallback m3934b(String str) {
        Fallback fallbacksByHost = HostManager.getInstance().getFallbacksByHost(str, false);
        if (!fallbacksByHost.mo4736b()) {
            C10750e.m3831a(new RunnableC10729k(this, str));
        }
        this.f33404f = 0;
        try {
            byte[] address = InetAddress.getByName(fallbacksByHost.f32732f).getAddress();
            this.f33404f = address[0] & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
            this.f33404f |= (address[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK;
            this.f33404f |= (address[2] << 16) & 16711680;
            this.f33404f = ((address[3] << 24) & ViewCompat.MEASURED_STATE_MASK) | this.f33404f;
        } catch (UnknownHostException e) {
        }
        return fallbacksByHost;
    }

    /* renamed from: b */
    protected synchronized void mo3936b() {
    }

    @Override // com.xiaomi.smack.AbstractC10716a
    /* renamed from: b */
    public void mo3935b(int i, Exception exc) {
        mo3944a(i, exc);
        if ((exc != null || i == 18) && this.f33440u != 0) {
            m3942a(exc);
        }
    }

    @Override // com.xiaomi.smack.AbstractC10716a
    /* renamed from: b */
    public void mo3933b(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        mo3939a(z);
        if (!z) {
            this.f33437r.m4493a(new C10727i(this, 13, currentTimeMillis), 10000L);
        }
    }

    /* renamed from: c */
    public void m3932c(int i, Exception exc) {
        this.f33437r.m4494a(new C10728j(this, 2, i, exc));
    }

    @Override // com.xiaomi.smack.AbstractC10716a
    /* renamed from: d */
    public String mo3931d() {
        return this.f33441v;
    }

    /* renamed from: q */
    public String m3930q() {
        return this.f33408j;
    }

    /* renamed from: r */
    public synchronized void m3929r() {
        try {
            if (k() || j()) {
                AbstractC10404b.m5269a("WARNING: current xmpp has connected");
            } else {
                a(0, 0, (Exception) null);
                m3943a(this.f33411m);
            }
        } catch (IOException e) {
            throw new C10730l(e);
        }
    }

    /* renamed from: s */
    public Socket m3928s() {
        return new Socket();
    }

    /* renamed from: t */
    public void m3927t() {
        this.f33438s = SystemClock.elapsedRealtime();
    }

    /* renamed from: u */
    public void m3926u() {
        this.f33439t = SystemClock.elapsedRealtime();
    }
}
