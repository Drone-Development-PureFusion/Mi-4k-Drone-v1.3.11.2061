package p005b.p006a.p007a.p029b.p042h;

import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.UnknownHostException;
import p005b.p006a.p007a.p029b.AbstractC0404b;
import p005b.p006a.p007a.p029b.AbstractC0594j;
/* renamed from: b.a.a.b.h.i */
/* loaded from: classes.dex */
public abstract class AbstractC0543i<E> extends AbstractC0404b<E> {

    /* renamed from: i */
    static final String f875i = "http://logback.qos.ch/codes.html#syslog_layout";

    /* renamed from: j */
    static final int f876j = 65000;

    /* renamed from: k */
    AbstractC0594j<E> f878k;

    /* renamed from: l */
    String f879l;

    /* renamed from: m */
    String f880m;

    /* renamed from: n */
    protected String f881n;

    /* renamed from: o */
    protected C0545k f882o;

    /* renamed from: r */
    int f885r;

    /* renamed from: p */
    int f883p = 514;

    /* renamed from: q */
    boolean f884q = false;

    /* renamed from: a */
    private boolean f877a = false;

    /* renamed from: a */
    private boolean m38894a() {
        try {
            this.f882o = new C0545k(this.f880m, this.f883p);
            int m38874b = this.f882o.m38874b();
            if (this.f885r == 0) {
                this.f885r = Math.min(m38874b, (int) f876j);
                d("Defaulting maxMessageSize to [" + this.f885r + "]");
            } else if (this.f885r > m38874b) {
                e("maxMessageSize of [" + this.f885r + "] is larger than the system defined datagram size of [" + m38874b + "].");
                e("This may result in dropped logs.");
            }
        } catch (SocketException e) {
            c("Failed to bind to a random datagram socket. Will try to reconnect later.", e);
        } catch (UnknownHostException e2) {
            a("Could not create SyslogWriter", e2);
        }
        return this.f882o != null;
    }

    /* renamed from: b */
    public static int m38887b(String str) {
        if ("KERN".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("USER".equalsIgnoreCase(str)) {
            return 8;
        }
        if ("MAIL".equalsIgnoreCase(str)) {
            return 16;
        }
        if ("DAEMON".equalsIgnoreCase(str)) {
            return 24;
        }
        if ("AUTH".equalsIgnoreCase(str)) {
            return 32;
        }
        if ("SYSLOG".equalsIgnoreCase(str)) {
            return 40;
        }
        if ("LPR".equalsIgnoreCase(str)) {
            return 48;
        }
        if ("NEWS".equalsIgnoreCase(str)) {
            return 56;
        }
        if ("UUCP".equalsIgnoreCase(str)) {
            return 64;
        }
        if ("CRON".equalsIgnoreCase(str)) {
            return 72;
        }
        if ("AUTHPRIV".equalsIgnoreCase(str)) {
            return 80;
        }
        if ("FTP".equalsIgnoreCase(str)) {
            return 88;
        }
        if ("NTP".equalsIgnoreCase(str)) {
            return 96;
        }
        if ("AUDIT".equalsIgnoreCase(str)) {
            return 104;
        }
        if ("ALERT".equalsIgnoreCase(str)) {
            return 112;
        }
        if ("CLOCK".equalsIgnoreCase(str)) {
            return 120;
        }
        if ("LOCAL0".equalsIgnoreCase(str)) {
            return 128;
        }
        if ("LOCAL1".equalsIgnoreCase(str)) {
            return 136;
        }
        if ("LOCAL2".equalsIgnoreCase(str)) {
            return 144;
        }
        if ("LOCAL3".equalsIgnoreCase(str)) {
            return 152;
        }
        if ("LOCAL4".equalsIgnoreCase(str)) {
            return 160;
        }
        if ("LOCAL5".equalsIgnoreCase(str)) {
            return 168;
        }
        if ("LOCAL6".equalsIgnoreCase(str)) {
            return 176;
        }
        if (!"LOCAL7".equalsIgnoreCase(str)) {
            throw new IllegalArgumentException(str + " is not a valid syslog facility string");
        }
        return 184;
    }

    /* renamed from: a */
    public void m38893a(int i) {
        this.f883p = i;
    }

    /* renamed from: a */
    public void m38892a(AbstractC0594j<E> abstractC0594j) {
        e("The layout of a SyslogAppender cannot be set directly. See also http://logback.qos.ch/codes.html#syslog_layout");
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b
    /* renamed from: a */
    protected void mo38607a(E e) {
        if (!b_()) {
            return;
        }
        if (!this.f884q && this.f877a) {
            this.f884q = true;
            m38894a();
        }
        if (this.f882o == null) {
            return;
        }
        try {
            String mo38773a = this.f878k.mo38773a((AbstractC0594j<E>) e);
            if (mo38773a == null) {
                return;
            }
            if (mo38773a.length() > this.f885r) {
                mo38773a = mo38773a.substring(0, this.f885r);
            }
            this.f882o.write(mo38773a.getBytes());
            this.f882o.flush();
            mo38891a(e, this.f882o);
        } catch (IOException e2) {
            a("Failed to send diagram to " + this.f880m, e2);
        }
    }

    /* renamed from: a */
    protected void mo38891a(Object obj, OutputStream outputStream) {
    }

    /* renamed from: b */
    public abstract int mo38888b(Object obj);

    /* renamed from: b */
    public abstract AbstractC0594j<E> mo38890b();

    /* renamed from: b */
    public void m38889b(int i) {
        this.f885r = i;
    }

    /* renamed from: b */
    public void m38886b(boolean z) {
        this.f877a = z;
    }

    /* renamed from: f */
    public String m38885f() {
        return this.f880m;
    }

    /* renamed from: f */
    public void m38884f(String str) {
        this.f880m = str;
    }

    /* renamed from: g */
    public void m38883g(String str) {
        if (str != null) {
            str = str.trim();
        }
        this.f879l = str;
    }

    /* renamed from: h */
    public void m38882h(String str) {
        this.f881n = str;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        int i = 0;
        if (this.f879l == null) {
            c("The Facility option is mandatory");
            i = 1;
        }
        if (!this.f877a && !m38894a()) {
            i++;
        }
        if (this.f878k == null) {
            this.f878k = mo38890b();
        }
        if (i == 0) {
            super.mo38474j();
        }
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        this.f882o.close();
        super.mo38473k();
    }

    /* renamed from: l */
    public String m38881l() {
        return this.f879l;
    }

    /* renamed from: m */
    public int m38880m() {
        return this.f883p;
    }

    /* renamed from: n */
    public int m38879n() {
        return this.f885r;
    }

    /* renamed from: o */
    public AbstractC0594j<E> m38878o() {
        return this.f878k;
    }

    /* renamed from: p */
    public boolean m38877p() {
        return this.f877a;
    }

    /* renamed from: q */
    public String m38876q() {
        return this.f881n;
    }
}
