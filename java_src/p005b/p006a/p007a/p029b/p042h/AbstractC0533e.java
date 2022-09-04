package p005b.p006a.p007a.p029b.p042h;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import p005b.p006a.p007a.p029b.AbstractC0404b;
import p005b.p006a.p007a.p029b.AbstractC0594j;
import p005b.p006a.p007a.p029b.p031b.AbstractC0406b;
import p005b.p006a.p007a.p029b.p031b.C0405a;
import p005b.p006a.p007a.p029b.p034e.C0423a;
import p005b.p006a.p007a.p029b.p045i.AbstractC0589i;
import p005b.p006a.p007a.p029b.p054n.AbstractC0648f;
import p005b.p006a.p007a.p029b.p054n.C0647e;
import p005b.p006a.p007a.p029b.p055o.C0664h;
import p005b.p006a.p007a.p029b.p058r.C0707f;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.h.e */
/* loaded from: classes.dex */
public abstract class AbstractC0533e<E> extends AbstractC0404b<E> {

    /* renamed from: b */
    static InternetAddress[] f837b = new InternetAddress[0];

    /* renamed from: c */
    static final int f838c = 1228800000;

    /* renamed from: i */
    protected AbstractC0594j<E> f844i;

    /* renamed from: j */
    protected AbstractC0594j<E> f845j;

    /* renamed from: k */
    String f846k;

    /* renamed from: l */
    String f847l;

    /* renamed from: m */
    String f848m;

    /* renamed from: o */
    protected MimeMessage f850o;

    /* renamed from: p */
    protected AbstractC0406b<E> f851p;

    /* renamed from: r */
    protected C0664h<E> f853r;

    /* renamed from: u */
    private String f854u;

    /* renamed from: w */
    private String f856w;

    /* renamed from: d */
    long f842d = 0;

    /* renamed from: e */
    int f843e = 300000;

    /* renamed from: a */
    private List<AbstractC0589i<E>> f841a = new ArrayList();

    /* renamed from: v */
    private String f855v = null;

    /* renamed from: x */
    private int f857x = 25;

    /* renamed from: y */
    private boolean f858y = false;

    /* renamed from: z */
    private boolean f859z = false;

    /* renamed from: n */
    boolean f849n = true;

    /* renamed from: A */
    private String f839A = "UTF-8";

    /* renamed from: q */
    protected AbstractC0648f<E> f852q = new C0647e();

    /* renamed from: B */
    private int f840B = 0;

    /* renamed from: b.a.a.b.h.e$a */
    /* loaded from: classes.dex */
    class RunnableC0534a implements Runnable {

        /* renamed from: a */
        final C0423a<E> f860a;

        /* renamed from: b */
        final E f861b;

        RunnableC0534a(C0423a<E> c0423a, E e) {
            this.f860a = c0423a;
            this.f861b = e;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0533e.this.m38941b((C0423a<C0423a<E>>) this.f860a, (C0423a<E>) this.f861b);
        }
    }

    /* renamed from: a */
    private Session m38953a() {
        Properties properties = new Properties(C0724u.m38388a());
        if (this.f856w != null) {
            properties.put("mail.smtp.host", this.f856w);
        }
        properties.put("mail.smtp.port", Integer.toString(this.f857x));
        if (this.f848m != null) {
            properties.put("mail.smtp.localhost", this.f848m);
        }
        C0532d c0532d = null;
        if (this.f846k != null) {
            c0532d = new C0532d(this.f846k, this.f847l);
            properties.put("mail.smtp.auth", "true");
        }
        if (!m38911v() || !m38910w()) {
            if (m38911v()) {
                properties.put("mail.smtp.starttls.enable", "true");
            }
            if (m38910w()) {
                properties.put("mail.smtp.socketFactory.port", Integer.toString(this.f857x));
                properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                properties.put("mail.smtp.socketFactory.fallback", "true");
            }
        } else {
            c("Both SSL and StartTLS cannot be enabled simultaneously");
        }
        return Session.getInstance(properties, c0532d);
    }

    /* renamed from: c */
    private List<InternetAddress> m38938c(E e) {
        int size = this.f841a.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            try {
                String a = this.f841a.get(i).a((AbstractC0589i<E>) e);
                if (a != null && a.length() != 0) {
                    arrayList.addAll(Arrays.asList(InternetAddress.parse(a, true)));
                }
            } catch (AddressException e2) {
                a("Could not parse email address for [" + this.f841a.get(i) + "] for event [" + e + "]", (Throwable) e2);
                return arrayList;
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public AbstractC0594j<E> m38954A() {
        return this.f845j;
    }

    /* renamed from: a */
    protected abstract AbstractC0594j<E> mo38945a(String str);

    /* renamed from: a */
    public void m38952a(int i) {
        m38942b(i);
    }

    /* renamed from: a */
    public void m38951a(AbstractC0406b<E> abstractC0406b) {
        this.f851p = abstractC0406b;
    }

    /* renamed from: a */
    protected abstract void mo38950a(C0423a<E> c0423a, E e);

    /* renamed from: a */
    protected abstract void mo38949a(C0423a<E> c0423a, StringBuffer stringBuffer);

    /* renamed from: a */
    public void m38948a(AbstractC0594j<E> abstractC0594j) {
        this.f845j = abstractC0594j;
    }

    /* renamed from: a */
    public void m38947a(AbstractC0648f<E> abstractC0648f) {
        this.f852q = abstractC0648f;
    }

    /* renamed from: a */
    public void m38946a(C0664h<E> c0664h) {
        this.f853r = c0664h;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b
    /* renamed from: a */
    protected void mo38607a(E e) {
        if (!m38943b()) {
            return;
        }
        String mo38613a = this.f852q.mo38613a(e);
        long currentTimeMillis = System.currentTimeMillis();
        C0423a<E> a = this.f853r.a(mo38613a, currentTimeMillis);
        mo38950a((C0423a<C0423a<E>>) a, (C0423a<E>) e);
        try {
            if (this.f851p.mo39408a((AbstractC0406b<E>) e)) {
                C0423a<E> c0423a = new C0423a<>(a);
                a.m39352a();
                if (this.f849n) {
                    this.f1199s.mo39311s().execute(new RunnableC0534a(c0423a, e));
                } else {
                    m38941b((C0423a<C0423a<E>>) c0423a, (C0423a<E>) e);
                }
            }
        } catch (C0405a e2) {
            this.f840B++;
            if (this.f840B < 4) {
                a("SMTPAppender's EventEvaluator threw an Exception-", e2);
            }
        }
        if (mo38940b((AbstractC0533e<E>) e)) {
            this.f853r.d(mo38613a);
        }
        this.f853r.a(currentTimeMillis);
        if (this.f842d + this.f843e >= currentTimeMillis) {
            return;
        }
        d("SMTPAppender [" + this.f485g + "] is tracking [" + this.f853r.a() + "] buffers");
        this.f842d = currentTimeMillis;
        if (this.f843e >= f838c) {
            return;
        }
        this.f843e *= 4;
    }

    /* renamed from: a */
    public void m38944a(MimeMessage mimeMessage) {
        this.f850o = mimeMessage;
    }

    /* renamed from: b */
    public void m38942b(int i) {
        this.f857x = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0016, B:8:0x001e, B:9:0x0021, B:11:0x002c, B:12:0x002f, B:14:0x0037, B:15:0x003a, B:17:0x0040, B:19:0x0048, B:21:0x0050, B:22:0x0056, B:24:0x0067, B:27:0x006f, B:29:0x008a, B:30:0x0097, B:32:0x00df), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0016, B:8:0x001e, B:9:0x0021, B:11:0x002c, B:12:0x002f, B:14:0x0037, B:15:0x003a, B:17:0x0040, B:19:0x0048, B:21:0x0050, B:22:0x0056, B:24:0x0067, B:27:0x006f, B:29:0x008a, B:30:0x0097, B:32:0x00df), top: B:2:0x0001 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void m38941b(C0423a<E> c0423a, E e) {
        String str;
        List<InternetAddress> m38938c;
        try {
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            StringBuffer stringBuffer = new StringBuffer();
            String mo38763e = this.f845j.mo38763e();
            if (mo38763e != null) {
                stringBuffer.append(mo38763e);
            }
            String mo38762f = this.f845j.mo38762f();
            if (mo38762f != null) {
                stringBuffer.append(mo38762f);
            }
            mo38949a((C0423a) c0423a, stringBuffer);
            String mo38761g = this.f845j.mo38761g();
            if (mo38761g != null) {
                stringBuffer.append(mo38761g);
            }
            String mo38760h = this.f845j.mo38760h();
            if (mo38760h != null) {
                stringBuffer.append(mo38760h);
            }
            String str2 = "Undefined subject";
            if (this.f844i != null) {
                str2 = this.f844i.mo38773a((AbstractC0594j<E>) e);
                int indexOf = str2 != null ? str2.indexOf(10) : -1;
                if (indexOf > -1) {
                    str = str2.substring(0, indexOf);
                    this.f850o.setSubject(str, this.f839A);
                    m38938c = m38938c((AbstractC0533e<E>) e);
                    if (!m38938c.isEmpty()) {
                        d("Empty destination address. Aborting email transmission");
                        return;
                    }
                    InternetAddress[] internetAddressArr = (InternetAddress[]) m38938c.toArray(f837b);
                    this.f850o.setRecipients(Message.RecipientType.TO, internetAddressArr);
                    String mo38765d = this.f845j.mo38765d();
                    if (C0707f.m38432a(mo38765d)) {
                        mimeBodyPart.setText(stringBuffer.toString(), this.f839A, C0707f.m38431b(mo38765d));
                    } else {
                        mimeBodyPart.setContent(stringBuffer.toString(), this.f845j.mo38765d());
                    }
                    MimeMultipart mimeMultipart = new MimeMultipart();
                    mimeMultipart.addBodyPart(mimeBodyPart);
                    this.f850o.setContent(mimeMultipart);
                    this.f850o.setSentDate(new Date());
                    d("About to send out SMTP message \"" + str + "\" to " + Arrays.toString(internetAddressArr));
                    Transport.send(this.f850o);
                    return;
                }
            }
            str = str2;
            this.f850o.setSubject(str, this.f839A);
            m38938c = m38938c((AbstractC0533e<E>) e);
            if (!m38938c.isEmpty()) {
            }
        } catch (Exception e2) {
            a("Error occurred while sending e-mail notification.", e2);
        }
    }

    /* renamed from: b */
    public void m38939b(boolean z) {
        this.f849n = z;
    }

    /* renamed from: b */
    public boolean m38943b() {
        if (!this.f484f) {
            c("Attempting to append to a non-started appender: " + g());
            return false;
        } else if (this.f850o == null) {
            c("Message object not configured.");
            return false;
        } else if (this.f851p == null) {
            c("No EventEvaluator is set for appender [" + this.f485g + "].");
            return false;
        } else if (this.f845j != null) {
            return true;
        } else {
            c("No layout set for appender named [" + this.f485g + "]. For more information, please visit http://logback.qos.ch/codes.html#smtp_no_layout");
            return false;
        }
    }

    /* renamed from: b */
    protected abstract boolean mo38940b(E e);

    /* renamed from: c */
    public void m38937c(boolean z) {
        this.f858y = z;
    }

    /* renamed from: d */
    public List<AbstractC0589i<E>> m38936d() {
        return this.f841a;
    }

    /* renamed from: d */
    public void m38935d(boolean z) {
        this.f859z = z;
    }

    /* renamed from: e */
    public String m38934e() {
        return this.f854u;
    }

    /* renamed from: f */
    public String m38933f() {
        return this.f855v;
    }

    /* renamed from: f */
    InternetAddress m38932f(String str) {
        try {
            return new InternetAddress(str);
        } catch (AddressException e) {
            a("Could not parse address [" + str + "].", (Throwable) e);
            return null;
        }
    }

    /* renamed from: f_ */
    protected abstract AbstractC0589i<E> mo38931f_(String str);

    /* renamed from: g */
    public void m38930g(String str) {
        this.f854u = str;
    }

    /* renamed from: h */
    public void m38929h(String str) {
        this.f855v = str;
    }

    /* renamed from: i */
    public void m38928i(String str) {
        m38927j(str);
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (this.f853r == null) {
            this.f853r = new C0664h<>();
        }
        Session m38953a = m38953a();
        if (m38953a == null) {
            c("Failed to obtain javax.mail.Session. Cannot start.");
            return;
        }
        this.f850o = new MimeMessage(m38953a);
        try {
            if (this.f854u != null) {
                this.f850o.setFrom(m38932f(this.f854u));
            } else {
                this.f850o.setFrom();
            }
            this.f844i = mo38945a(this.f855v);
            this.f484f = true;
        } catch (MessagingException e) {
            a("Could not activate SMTPAppender options.", (Throwable) e);
        }
    }

    /* renamed from: j */
    public void m38927j(String str) {
        this.f856w = str;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public synchronized void mo38473k() {
        this.f484f = false;
    }

    /* renamed from: k */
    public void m38926k(String str) {
        this.f848m = str;
    }

    /* renamed from: l */
    public String m38925l() {
        return m38923m();
    }

    /* renamed from: l */
    public void m38924l(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Null or empty <to> property");
        }
        AbstractC0589i<E> mo38931f_ = mo38931f_(str.trim());
        mo38931f_.a(this.f1199s);
        mo38931f_.mo38474j();
        this.f841a.add(mo38931f_);
    }

    /* renamed from: m */
    public String m38923m() {
        return this.f856w;
    }

    /* renamed from: m */
    public void m38922m(String str) {
        this.f846k = str;
    }

    /* renamed from: n */
    public int m38921n() {
        return m38919o();
    }

    /* renamed from: n */
    public void m38920n(String str) {
        this.f847l = str;
    }

    /* renamed from: o */
    public int m38919o() {
        return this.f857x;
    }

    /* renamed from: o */
    public void m38918o(String str) {
        this.f839A = str;
    }

    /* renamed from: p */
    public String m38917p() {
        return this.f848m;
    }

    /* renamed from: q */
    public C0664h<E> m38916q() {
        return this.f853r;
    }

    /* renamed from: r */
    public AbstractC0648f<E> m38915r() {
        return this.f852q;
    }

    /* renamed from: s */
    public boolean m38914s() {
        return this.f849n;
    }

    /* renamed from: t */
    public List<String> m38913t() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0589i<E> abstractC0589i : this.f841a) {
            arrayList.add(abstractC0589i.m38789l());
        }
        return arrayList;
    }

    /* renamed from: u */
    public Message m38912u() {
        return this.f850o;
    }

    /* renamed from: v */
    public boolean m38911v() {
        return this.f858y;
    }

    /* renamed from: w */
    public boolean m38910w() {
        return this.f859z;
    }

    /* renamed from: x */
    public String m38909x() {
        return this.f846k;
    }

    /* renamed from: y */
    public String m38908y() {
        return this.f847l;
    }

    /* renamed from: z */
    public String m38907z() {
        return this.f839A;
    }
}
