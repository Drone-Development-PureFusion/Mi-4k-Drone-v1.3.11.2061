package it.p273a.p274a;

import com.fimi.kernel.utils.C1662f;
import com.xiaomi.mipush.sdk.Constants;
import it.p273a.p274a.p275a.C10850d;
import it.p273a.p274a.p276b.C10857a;
import it.p273a.p274a.p277c.C10860a;
import it.p273a.p274a.p277c.C10861b;
import it.p273a.p274a.p277c.C10862c;
import it.p273a.p274a.p277c.C10863d;
import it.p273a.p274a.p277c.C10864e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.SSLSocketFactory;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: it.a.a.b */
/* loaded from: classes.dex */
public class C10855b {

    /* renamed from: a */
    public static final int f34758a = 0;

    /* renamed from: b */
    public static final int f34759b = 1;

    /* renamed from: c */
    public static final int f34760c = 2;

    /* renamed from: d */
    public static final int f34761d = 0;

    /* renamed from: e */
    public static final int f34762e = 1;

    /* renamed from: f */
    public static final int f34763f = 2;

    /* renamed from: g */
    public static final int f34764g = 0;

    /* renamed from: h */
    public static final int f34765h = 1;

    /* renamed from: i */
    public static final int f34766i = 2;

    /* renamed from: j */
    private static final int f34767j = 65536;

    /* renamed from: k */
    private static final DateFormat f34768k = new SimpleDateFormat(C1662f.f4115e);

    /* renamed from: l */
    private static final Pattern f34769l = Pattern.compile("\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}");

    /* renamed from: m */
    private static final Pattern f34770m = Pattern.compile("\"/.*\"");

    /* renamed from: E */
    private C10856a f34775E;

    /* renamed from: F */
    private long f34776F;

    /* renamed from: w */
    private String f34802w;

    /* renamed from: x */
    private String f34803x;

    /* renamed from: n */
    private AbstractC10869h f34793n = new C10850d();

    /* renamed from: o */
    private SSLSocketFactory f34794o = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: p */
    private ArrayList f34795p = new ArrayList();

    /* renamed from: q */
    private ArrayList f34796q = new ArrayList();

    /* renamed from: r */
    private AbstractC10881t f34797r = C10857a.m3029a();

    /* renamed from: s */
    private AbstractC10879r f34798s = null;

    /* renamed from: t */
    private String f34799t = null;

    /* renamed from: u */
    private int f34800u = 0;

    /* renamed from: v */
    private int f34801v = 0;

    /* renamed from: y */
    private boolean f34804y = false;

    /* renamed from: z */
    private boolean f34805z = false;

    /* renamed from: A */
    private boolean f34771A = true;

    /* renamed from: B */
    private int f34772B = 0;

    /* renamed from: C */
    private int f34773C = 0;

    /* renamed from: D */
    private long f34774D = 0;

    /* renamed from: G */
    private boolean f34777G = false;

    /* renamed from: H */
    private String f34778H = null;

    /* renamed from: I */
    private boolean f34779I = false;

    /* renamed from: J */
    private boolean f34780J = false;

    /* renamed from: K */
    private boolean f34781K = false;

    /* renamed from: L */
    private boolean f34782L = false;

    /* renamed from: M */
    private boolean f34783M = false;

    /* renamed from: N */
    private boolean f34784N = false;

    /* renamed from: O */
    private boolean f34785O = false;

    /* renamed from: P */
    private InputStream f34786P = null;

    /* renamed from: Q */
    private OutputStream f34787Q = null;

    /* renamed from: R */
    private boolean f34788R = false;

    /* renamed from: S */
    private boolean f34789S = false;

    /* renamed from: T */
    private Object f34790T = new Object();

    /* renamed from: U */
    private Object f34791U = new Object();

    /* renamed from: V */
    private C10867f f34792V = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: it.a.a.b$a */
    /* loaded from: classes.dex */
    public class C10856a extends Thread {

        /* renamed from: a */
        private final C10855b f34806a;

        private C10856a(C10855b c10855b) {
            this.f34806a = c10855b;
        }

        C10856a(C10855b c10855b, C10859c c10859c) {
            this(c10855b);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (C10855b.m3065d(this.f34806a)) {
                if (C10855b.m3061e(this.f34806a) <= 0 && C10855b.m3058f(this.f34806a) > 0) {
                    C10855b.m3105a(this.f34806a, System.currentTimeMillis() + C10855b.m3058f(this.f34806a));
                }
                while (!Thread.interrupted() && C10855b.m3058f(this.f34806a) > 0) {
                    long m3061e = C10855b.m3061e(this.f34806a) - System.currentTimeMillis();
                    if (m3061e > 0) {
                        try {
                            C10855b.m3065d(this.f34806a).wait(m3061e);
                        } catch (InterruptedException e) {
                        }
                    }
                    if (System.currentTimeMillis() >= C10855b.m3061e(this.f34806a)) {
                        try {
                            this.f34806a.m3032x();
                        } catch (Throwable th) {
                        }
                    }
                }
            }
        }
    }

    public C10855b() {
        m3101a(new C10864e());
        m3101a(new C10860a());
        m3101a(new C10861b());
        m3101a(new C10863d());
        m3101a(new C10862c());
    }

    /* renamed from: E */
    private void m3120E() {
        synchronized (this.f34790T) {
            this.f34780J = false;
            this.f34777G = false;
            this.f34781K = false;
            this.f34782L = false;
            this.f34784N = false;
            this.f34792V.m3021a("FEAT");
            C10880s m3016c = this.f34792V.m3016c();
            if (m3016c.m2982a() == 211) {
                String[] m2980c = m3016c.m2980c();
                for (int i = 1; i < m2980c.length - 1; i++) {
                    String upperCase = m2980c[i].trim().toUpperCase();
                    if ("REST STREAM".equalsIgnoreCase(upperCase)) {
                        this.f34777G = true;
                    } else if ("UTF8".equalsIgnoreCase(upperCase)) {
                        this.f34780J = true;
                        this.f34792V.m3017b("UTF-8");
                    } else if ("MLSD".equalsIgnoreCase(upperCase)) {
                        this.f34781K = true;
                    } else if ("MODE Z".equalsIgnoreCase(upperCase) || upperCase.startsWith("MODE Z ")) {
                        this.f34782L = true;
                    }
                }
            }
            if (this.f34780J) {
                this.f34792V.m3021a("OPTS UTF8 ON");
                this.f34792V.m3016c();
            }
            if (this.f34801v == 1 || this.f34801v == 2) {
                this.f34792V.m3021a("PBSZ 0");
                this.f34792V.m3016c();
                this.f34792V.m3021a("PROT P");
                if (this.f34792V.m3016c().m2981b()) {
                    this.f34784N = true;
                }
            }
        }
    }

    /* renamed from: F */
    private AbstractC10870i m3119F() {
        if (!this.f34782L || !this.f34779I) {
            if (this.f34783M) {
                this.f34792V.m3021a("MODE S");
                C10880s m3016c = this.f34792V.m3016c();
                m3110O();
                if (m3016c.m2981b()) {
                    this.f34783M = false;
                }
            }
        } else if (!this.f34783M) {
            this.f34792V.m3021a("MODE Z");
            C10880s m3016c2 = this.f34792V.m3016c();
            m3110O();
            if (m3016c2.m2981b()) {
                this.f34783M = true;
            }
        }
        return this.f34771A ? m3117H() : m3118G();
    }

    /* renamed from: G */
    private AbstractC10870i m3118G() {
        C10859c c10859c = new C10859c(this);
        int m2995c = c10859c.m2995c();
        int[] m3115J = m3115J();
        this.f34792V.m3021a(new StringBuffer().append("PORT ").append(m3115J[0]).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(m3115J[1]).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(m3115J[2]).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(m3115J[3]).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(m2995c >>> 8).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(m2995c & 255).toString());
        C10880s m3016c = this.f34792V.m3016c();
        m3110O();
        if (!m3016c.m2981b()) {
            c10859c.mo2996b();
            try {
                c10859c.mo2997a().close();
            } catch (Throwable th) {
            }
            throw new C10874m(m3016c);
        }
        return c10859c;
    }

    /* renamed from: H */
    private AbstractC10870i m3117H() {
        String str;
        this.f34792V.m3021a("PASV");
        C10880s m3016c = this.f34792V.m3016c();
        m3110O();
        if (!m3016c.m2981b()) {
            throw new C10874m(m3016c);
        }
        String[] m2980c = m3016c.m2980c();
        int i = 0;
        while (true) {
            if (i >= m2980c.length) {
                str = null;
                break;
            }
            Matcher matcher = f34769l.matcher(m2980c[i]);
            if (matcher.find()) {
                str = m2980c[i].substring(matcher.start(), matcher.end());
                break;
            }
            i++;
        }
        if (str == null) {
            throw new C10876o();
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
        int parseInt = Integer.parseInt(stringTokenizer.nextToken());
        int parseInt2 = Integer.parseInt(stringTokenizer.nextToken());
        int parseInt3 = Integer.parseInt(stringTokenizer.nextToken());
        return new C10865d(this, new StringBuffer().append(parseInt).append(".").append(parseInt2).append(".").append(parseInt3).append(".").append(Integer.parseInt(stringTokenizer.nextToken())).toString(), Integer.parseInt(stringTokenizer.nextToken()) | (Integer.parseInt(stringTokenizer.nextToken()) << 8));
    }

    /* renamed from: I */
    private String m3116I() {
        return this.f34778H != null ? this.f34778H : this.f34780J ? "UTF-8" : System.getProperty("file.encoding");
    }

    /* renamed from: J */
    private int[] m3115J() {
        int[] m3114K = m3114K();
        return m3114K == null ? m3113L() : m3114K;
    }

    /* renamed from: K */
    private int[] m3114K() {
        boolean z = false;
        int[] iArr = null;
        String property = System.getProperty(AbstractC10877p.f34885b);
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            if (stringTokenizer.countTokens() == 4) {
                int[] iArr2 = new int[4];
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        z = true;
                        break;
                    }
                    try {
                        iArr2[i] = Integer.parseInt(stringTokenizer.nextToken());
                    } catch (NumberFormatException e) {
                        iArr2[i] = -1;
                    }
                    if (iArr2[i] < 0 || iArr2[i] > 255) {
                        break;
                    }
                    i++;
                }
                if (z) {
                    iArr = iArr2;
                }
            }
            if (!z) {
                System.err.println(new StringBuffer().append("WARNING: invalid value \"").append(property).append("\" for the ").append(AbstractC10877p.f34885b).append(" system property. The value should ").append("be in the x.x.x.x form.").toString());
            }
        }
        return iArr;
    }

    /* renamed from: L */
    private int[] m3113L() {
        byte[] address = InetAddress.getLocalHost().getAddress();
        return new int[]{address[0] & SmileConstants.BYTE_MARKER_END_OF_CONTENT, address[1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT, address[2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT, address[3] & SmileConstants.BYTE_MARKER_END_OF_CONTENT};
    }

    /* renamed from: M */
    private void m3112M() {
        if (this.f34774D > 0) {
            this.f34775E = new C10856a(this, null);
            this.f34775E.start();
        }
    }

    /* renamed from: N */
    private void m3111N() {
        if (this.f34775E != null) {
            this.f34775E.interrupt();
            this.f34775E = null;
        }
    }

    /* renamed from: O */
    private void m3110O() {
        if (this.f34775E != null) {
            this.f34776F = System.currentTimeMillis() + this.f34774D;
        }
    }

    /* renamed from: a */
    static long m3105a(C10855b c10855b, long j) {
        c10855b.f34776F = j;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Socket m3104a(C10855b c10855b, Socket socket, String str, int i) {
        return c10855b.m3084a(socket, str, i);
    }

    /* renamed from: a */
    private Socket m3084a(Socket socket, String str, int i) {
        return this.f34794o.createSocket(socket, str, i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m3106a(C10855b c10855b) {
        return c10855b.f34784N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC10869h m3079b(C10855b c10855b) {
        return c10855b.f34793n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m3069c(C10855b c10855b) {
        return c10855b.f34799t;
    }

    /* renamed from: d */
    static Object m3065d(C10855b c10855b) {
        return c10855b.f34790T;
    }

    /* renamed from: e */
    static long m3061e(C10855b c10855b) {
        return c10855b.f34776F;
    }

    /* renamed from: f */
    static long m3058f(C10855b c10855b) {
        return c10855b.f34774D;
    }

    /* renamed from: m */
    private int m3043m(String str) {
        int lastIndexOf = str.lastIndexOf(46) + 1;
        int length = str.length();
        if (lastIndexOf <= 0 || lastIndexOf >= length - 1) {
            return 2;
        }
        return this.f34797r.mo2979a(str.substring(lastIndexOf, length).toLowerCase()) ? 1 : 2;
    }

    /* renamed from: A */
    public String[] m3124A() {
        String[] m2980c;
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a("HELP");
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
            m2980c = m3016c.m2980c();
        }
        return m2980c;
    }

    /* renamed from: B */
    public String[] m3123B() {
        String[] m2980c;
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a("STAT");
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
            m2980c = m3016c.m2980c();
        }
        return m2980c;
    }

    /* renamed from: C */
    public C10875n[] m3122C() {
        return m3045l(null);
    }

    /* renamed from: D */
    public String[] m3121D() {
        String[] strArr;
        C10882u c10882u = null;
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a("TYPE A");
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
            ArrayList arrayList = new ArrayList();
            AbstractC10870i m3119F = m3119F();
            this.f34792V.m3021a("NLST");
            try {
                Socket mo2997a = m3119F.mo2997a();
                m3119F.mo2996b();
                synchronized (this.f34791U) {
                    this.f34785O = true;
                    this.f34788R = false;
                    this.f34789S = false;
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C10880s m3016c2 = this.f34792V.m3016c();
                        if (m3016c2.m2982a() != 150 && m3016c2.m2982a() != 125) {
                            throw new C10874m(m3016c2);
                        }
                        C10880s m3016c3 = this.f34792V.m3016c();
                        if (c10882u == null && m3016c3.m2982a() != 226) {
                            throw new C10874m(m3016c3);
                        }
                        if (this.f34789S) {
                            this.f34792V.m3016c();
                            this.f34789S = false;
                        }
                        throw th;
                    }
                }
                try {
                    this.f34786P = mo2997a.getInputStream();
                    if (this.f34783M) {
                        this.f34786P = new InflaterInputStream(this.f34786P);
                    }
                    C10882u c10882u2 = new C10882u(this.f34786P, m3116I());
                    while (true) {
                        try {
                            String m2978a = c10882u2.m2978a();
                            if (m2978a == null) {
                                break;
                            } else if (m2978a.length() > 0) {
                                arrayList.add(m2978a);
                            }
                        } catch (IOException e) {
                            e = e;
                            synchronized (this.f34791U) {
                                if (!this.f34788R) {
                                    throw new C10871j("I/O error in data transfer", e);
                                }
                                throw new C10846a();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c10882u = c10882u2;
                            if (c10882u != null) {
                                try {
                                    c10882u.close();
                                } catch (Throwable th4) {
                                }
                            }
                            try {
                                mo2997a.close();
                            } catch (Throwable th5) {
                            }
                            this.f34786P = null;
                            try {
                                synchronized (this.f34791U) {
                                    try {
                                        boolean z = this.f34788R;
                                        this.f34785O = false;
                                        this.f34788R = false;
                                        throw th;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        }
                    }
                    if (c10882u2 != null) {
                        try {
                            c10882u2.close();
                        } catch (Throwable th8) {
                        }
                    }
                    try {
                        mo2997a.close();
                    } catch (Throwable th9) {
                    }
                    this.f34786P = null;
                    try {
                        synchronized (this.f34791U) {
                            try {
                                boolean z2 = this.f34788R;
                                this.f34785O = false;
                                this.f34788R = false;
                                C10880s m3016c4 = this.f34792V.m3016c();
                                if (m3016c4.m2982a() != 150 && m3016c4.m2982a() != 125) {
                                    throw new C10874m(m3016c4);
                                }
                                C10880s m3016c5 = this.f34792V.m3016c();
                                if (!z2 && m3016c5.m2982a() != 226) {
                                    throw new C10874m(m3016c5);
                                }
                                if (this.f34789S) {
                                    this.f34792V.m3016c();
                                    this.f34789S = false;
                                }
                                int size = arrayList.size();
                                strArr = new String[size];
                                for (int i = 0; i < size; i++) {
                                    strArr[i] = (String) arrayList.get(i);
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                throw th;
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th12) {
                th = th12;
                c10882u = null;
            }
        }
        return strArr;
    }

    /* renamed from: a */
    public AbstractC10869h m3109a() {
        AbstractC10869h abstractC10869h;
        synchronized (this.f34790T) {
            abstractC10869h = this.f34793n;
        }
        return abstractC10869h;
    }

    /* renamed from: a */
    public void m3108a(int i) {
        if (i == 0 || i == 1 || i == 2) {
            synchronized (this.f34790T) {
                if (this.f34804y) {
                    throw new IllegalStateException("The security level of the connection can't be changed while the client is connected");
                }
                this.f34801v = i;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid security");
    }

    /* renamed from: a */
    public void m3107a(long j) {
        synchronized (this.f34790T) {
            if (this.f34804y && this.f34805z) {
                m3111N();
            }
            long j2 = this.f34774D;
            this.f34774D = j;
            if (j2 != 0 && j != 0 && this.f34776F > 0) {
                this.f34776F -= j2 - j;
            }
            if (this.f34804y && this.f34805z) {
                m3112M();
            }
        }
    }

    /* renamed from: a */
    public void m3103a(AbstractC10868g abstractC10868g) {
        synchronized (this.f34790T) {
            this.f34795p.add(abstractC10868g);
            if (this.f34792V != null) {
                this.f34792V.m3022a(abstractC10868g);
            }
        }
    }

    /* renamed from: a */
    public void m3102a(AbstractC10869h abstractC10869h) {
        synchronized (this.f34790T) {
            this.f34793n = abstractC10869h;
        }
    }

    /* renamed from: a */
    public void m3101a(AbstractC10879r abstractC10879r) {
        synchronized (this.f34790T) {
            this.f34796q.add(abstractC10879r);
        }
    }

    /* renamed from: a */
    public void m3100a(AbstractC10881t abstractC10881t) {
        synchronized (this.f34790T) {
            this.f34797r = abstractC10881t;
        }
    }

    /* renamed from: a */
    public void m3099a(File file) {
        m3097a(file, 0L, (AbstractC10872k) null);
    }

    /* renamed from: a */
    public void m3098a(File file, long j) {
        m3097a(file, j, (AbstractC10872k) null);
    }

    /* renamed from: a */
    public void m3097a(File file, long j, AbstractC10872k abstractC10872k) {
        FileInputStream fileInputStream;
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        try {
                            m3089a(file.getName(), fileInputStream, j, j, abstractC10872k);
                            if (fileInputStream == null) {
                                return;
                            }
                            try {
                                fileInputStream.close();
                            } catch (Throwable th) {
                            }
                        } catch (C10871j e) {
                            throw e;
                        } catch (IOException e2) {
                            throw e2;
                        }
                    } catch (C10846a e3) {
                        throw e3;
                    } catch (C10876o e4) {
                        throw e4;
                    }
                } catch (C10874m e5) {
                    throw e5;
                } catch (IllegalStateException e6) {
                    throw e6;
                }
            } catch (IOException e7) {
                throw new C10871j(e7);
            }
        } catch (Throwable th2) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                }
            }
            throw th2;
        }
    }

    /* renamed from: a */
    public void m3096a(File file, AbstractC10872k abstractC10872k) {
        m3097a(file, 0L, abstractC10872k);
    }

    /* renamed from: a */
    public void m3095a(String str) {
        synchronized (this.f34790T) {
            this.f34778H = str;
            if (this.f34804y) {
                try {
                    this.f34792V.m3017b(m3116I());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public void m3093a(String str, File file) {
        m3091a(str, file, 0L, (AbstractC10872k) null);
    }

    /* renamed from: a */
    public void m3092a(String str, File file, long j) {
        m3091a(str, file, j, (AbstractC10872k) null);
    }

    /* renamed from: a */
    public void m3091a(String str, File file, long j, AbstractC10872k abstractC10872k) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, j > 0);
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    m3087a(str, fileOutputStream, j, abstractC10872k);
                                    if (fileOutputStream == null) {
                                        return;
                                    }
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th) {
                                    }
                                } catch (IllegalStateException e) {
                                    throw e;
                                }
                            } catch (C10871j e2) {
                                throw e2;
                            }
                        } catch (C10876o e3) {
                            throw e3;
                        }
                    } catch (C10846a e4) {
                        throw e4;
                    } catch (C10874m e5) {
                        throw e5;
                    }
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                        }
                    }
                    throw th2;
                }
            } catch (IOException e6) {
                throw e6;
            }
        } catch (IOException e7) {
            throw new C10871j(e7);
        }
    }

    /* renamed from: a */
    public void m3090a(String str, File file, AbstractC10872k abstractC10872k) {
        m3091a(str, file, 0L, abstractC10872k);
    }

    /* renamed from: a */
    public void m3089a(String str, InputStream inputStream, long j, long j2, AbstractC10872k abstractC10872k) {
        boolean z;
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            int i = this.f34772B;
            if (i == 0) {
                i = m3043m(str);
            }
            if (i == 1) {
                this.f34792V.m3021a("TYPE A");
            } else if (i == 2) {
                this.f34792V.m3021a("TYPE I");
            }
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
            AbstractC10870i m3119F = m3119F();
            if (this.f34777G || j > 0) {
                this.f34792V.m3021a(new StringBuffer().append("REST ").append(j).toString());
                C10880s m3016c2 = this.f34792V.m3016c();
                m3110O();
                if (m3016c2.m2982a() != 350 && ((m3016c2.m2982a() != 501 && m3016c2.m2982a() != 502) || j > 0)) {
                    throw new C10874m(m3016c2);
                }
            }
            this.f34792V.m3021a(new StringBuffer().append("STOR ").append(str).toString());
            try {
                Socket mo2997a = m3119F.mo2997a();
                m3119F.mo2996b();
                synchronized (this.f34791U) {
                    this.f34785O = true;
                    this.f34788R = false;
                    this.f34789S = false;
                    try {
                    } catch (Throwable th) {
                        if (this.f34787Q != null) {
                            try {
                                this.f34787Q.close();
                            } catch (Throwable th2) {
                            }
                        }
                        try {
                            mo2997a.close();
                        } catch (Throwable th3) {
                        }
                        this.f34787Q = null;
                        synchronized (this.f34791U) {
                            boolean z2 = this.f34788R;
                            this.f34785O = false;
                            this.f34788R = false;
                            throw th;
                        }
                    }
                }
                try {
                    inputStream.skip(j2);
                    this.f34787Q = mo2997a.getOutputStream();
                    if (this.f34783M) {
                        this.f34787Q = new DeflaterOutputStream(this.f34787Q);
                    }
                    if (abstractC10872k != null) {
                        abstractC10872k.mo2998d();
                    }
                    if (i == 1) {
                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f34787Q, m3116I());
                        char[] cArr = new char[65536];
                        while (true) {
                            int read = inputStreamReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            outputStreamWriter.write(cArr, 0, read);
                            outputStreamWriter.flush();
                            if (abstractC10872k != null) {
                                abstractC10872k.mo3001a(read);
                            }
                        }
                    } else if (i == 2) {
                        byte[] bArr = new byte[65536];
                        while (true) {
                            int read2 = inputStream.read(bArr);
                            if (read2 == -1) {
                                break;
                            }
                            this.f34787Q.write(bArr, 0, read2);
                            this.f34787Q.flush();
                            if (abstractC10872k != null) {
                                abstractC10872k.mo3001a(read2);
                            }
                        }
                    }
                    if (this.f34787Q != null) {
                        try {
                            this.f34787Q.close();
                        } catch (Throwable th4) {
                        }
                    }
                    try {
                        mo2997a.close();
                    } catch (Throwable th5) {
                    }
                    this.f34787Q = null;
                    synchronized (this.f34791U) {
                        z = this.f34788R;
                        this.f34785O = false;
                        this.f34788R = false;
                    }
                    C10880s m3016c3 = this.f34792V.m3016c();
                    m3110O();
                    if (m3016c3.m2982a() != 150 && m3016c3.m2982a() != 125) {
                        throw new C10874m(m3016c3);
                    }
                    C10880s m3016c4 = this.f34792V.m3016c();
                    if (!z && m3016c4.m2982a() != 226) {
                        throw new C10874m(m3016c4);
                    }
                    if (this.f34789S) {
                        this.f34792V.m3016c();
                        this.f34789S = false;
                    }
                    if (abstractC10872k != null) {
                        abstractC10872k.mo3000b();
                    }
                } catch (IOException e) {
                    synchronized (this.f34791U) {
                        if (this.f34788R) {
                            if (abstractC10872k != null) {
                                abstractC10872k.mo3002a();
                            }
                            throw new C10846a();
                        }
                        if (abstractC10872k != null) {
                            abstractC10872k.mo2999c();
                        }
                        throw new C10871j("I/O error in data transfer", e);
                    }
                }
            } catch (Throwable th6) {
                m3119F.mo2996b();
                throw th6;
            }
        }
    }

    /* renamed from: a */
    public void m3088a(String str, InputStream inputStream, long j, AbstractC10872k abstractC10872k) {
        boolean z;
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            int i = this.f34772B;
            if (i == 0) {
                i = m3043m(str);
            }
            if (i == 1) {
                this.f34792V.m3021a("TYPE A");
            } else if (i == 2) {
                this.f34792V.m3021a("TYPE I");
            }
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
            AbstractC10870i m3119F = m3119F();
            this.f34792V.m3021a(new StringBuffer().append("APPE ").append(str).toString());
            try {
                Socket mo2997a = m3119F.mo2997a();
                m3119F.mo2996b();
                synchronized (this.f34791U) {
                    this.f34785O = true;
                    this.f34788R = false;
                    this.f34789S = false;
                    try {
                    } catch (Throwable th) {
                        if (this.f34787Q != null) {
                            try {
                                this.f34787Q.close();
                            } catch (Throwable th2) {
                            }
                        }
                        try {
                            mo2997a.close();
                        } catch (Throwable th3) {
                        }
                        this.f34787Q = null;
                        synchronized (this.f34791U) {
                            boolean z2 = this.f34788R;
                            this.f34785O = false;
                            this.f34788R = false;
                            throw th;
                        }
                    }
                }
                try {
                    inputStream.skip(j);
                    this.f34787Q = mo2997a.getOutputStream();
                    if (this.f34783M) {
                        this.f34787Q = new DeflaterOutputStream(this.f34787Q);
                    }
                    if (abstractC10872k != null) {
                        abstractC10872k.mo2998d();
                    }
                    if (i == 1) {
                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f34787Q, m3116I());
                        char[] cArr = new char[65536];
                        while (true) {
                            int read = inputStreamReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            outputStreamWriter.write(cArr, 0, read);
                            outputStreamWriter.flush();
                            if (abstractC10872k != null) {
                                abstractC10872k.mo3001a(read);
                            }
                        }
                    } else if (i == 2) {
                        byte[] bArr = new byte[65536];
                        while (true) {
                            int read2 = inputStream.read(bArr);
                            if (read2 == -1) {
                                break;
                            }
                            this.f34787Q.write(bArr, 0, read2);
                            this.f34787Q.flush();
                            if (abstractC10872k != null) {
                                abstractC10872k.mo3001a(read2);
                            }
                        }
                    }
                    if (this.f34787Q != null) {
                        try {
                            this.f34787Q.close();
                        } catch (Throwable th4) {
                        }
                    }
                    try {
                        mo2997a.close();
                    } catch (Throwable th5) {
                    }
                    this.f34787Q = null;
                    synchronized (this.f34791U) {
                        z = this.f34788R;
                        this.f34785O = false;
                        this.f34788R = false;
                    }
                    C10880s m3016c2 = this.f34792V.m3016c();
                    m3110O();
                    if (m3016c2.m2982a() != 150 && m3016c2.m2982a() != 125) {
                        throw new C10874m(m3016c2);
                    }
                    C10880s m3016c3 = this.f34792V.m3016c();
                    if (!z && m3016c3.m2982a() != 226) {
                        throw new C10874m(m3016c3);
                    }
                    if (this.f34789S) {
                        this.f34792V.m3016c();
                        this.f34789S = false;
                    }
                    if (abstractC10872k != null) {
                        abstractC10872k.mo3000b();
                    }
                } catch (IOException e) {
                    synchronized (this.f34791U) {
                        if (this.f34788R) {
                            if (abstractC10872k != null) {
                                abstractC10872k.mo3002a();
                            }
                            throw new C10846a();
                        }
                        if (abstractC10872k != null) {
                            abstractC10872k.mo2999c();
                        }
                        throw new C10871j("I/O error in data transfer", e);
                    }
                }
            } catch (Throwable th6) {
                m3119F.mo2996b();
                throw th6;
            }
        }
    }

    /* renamed from: a */
    public void m3087a(String str, OutputStream outputStream, long j, AbstractC10872k abstractC10872k) {
        boolean z;
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            int i = this.f34772B;
            if (i == 0) {
                i = m3043m(str);
            }
            if (i == 1) {
                this.f34792V.m3021a("TYPE A");
            } else if (i == 2) {
                this.f34792V.m3021a("TYPE I");
            }
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
            AbstractC10870i m3119F = m3119F();
            if (this.f34777G || j > 0) {
                this.f34792V.m3021a(new StringBuffer().append("REST ").append(j).toString());
                C10880s m3016c2 = this.f34792V.m3016c();
                m3110O();
                if (m3016c2.m2982a() != 350 && ((m3016c2.m2982a() != 501 && m3016c2.m2982a() != 502) || j > 0)) {
                    throw new C10874m(m3016c2);
                }
            }
            this.f34792V.m3021a(new StringBuffer().append("RETR ").append(str).toString());
            Socket mo2997a = m3119F.mo2997a();
            m3119F.mo2996b();
            synchronized (this.f34791U) {
                this.f34785O = true;
                this.f34788R = false;
                this.f34789S = false;
            }
            try {
                this.f34786P = mo2997a.getInputStream();
                if (this.f34783M) {
                    this.f34786P = new InflaterInputStream(this.f34786P);
                }
                if (abstractC10872k != null) {
                    abstractC10872k.mo2998d();
                }
                if (i == 1) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.f34786P, m3116I());
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                    char[] cArr = new char[65536];
                    while (true) {
                        int read = inputStreamReader.read(cArr, 0, cArr.length);
                        if (read == -1) {
                            break;
                        }
                        outputStreamWriter.write(cArr, 0, read);
                        outputStreamWriter.flush();
                        if (abstractC10872k != null) {
                            abstractC10872k.mo3001a(read);
                        }
                    }
                } else if (i == 2) {
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int read2 = this.f34786P.read(bArr, 0, bArr.length);
                        if (read2 == -1) {
                            break;
                        }
                        outputStream.write(bArr, 0, read2);
                        if (abstractC10872k != null) {
                            abstractC10872k.mo3001a(read2);
                        }
                    }
                }
                if (this.f34786P != null) {
                    try {
                        this.f34786P.close();
                    } catch (Throwable th) {
                    }
                }
                try {
                    mo2997a.close();
                } catch (Throwable th2) {
                }
                this.f34786P = null;
                synchronized (this.f34791U) {
                    z = this.f34788R;
                    this.f34785O = false;
                    this.f34788R = false;
                }
                C10880s m3016c3 = this.f34792V.m3016c();
                m3110O();
                if (m3016c3.m2982a() != 150 && m3016c3.m2982a() != 125) {
                    throw new C10874m(m3016c3);
                }
                C10880s m3016c4 = this.f34792V.m3016c();
                if (!z && m3016c4.m2982a() != 226) {
                    throw new C10874m(m3016c4);
                }
                if (this.f34789S) {
                    this.f34792V.m3016c();
                    this.f34789S = false;
                }
                if (abstractC10872k != null) {
                    abstractC10872k.mo3000b();
                }
            } catch (IOException e) {
                synchronized (this.f34791U) {
                    if (this.f34788R) {
                        if (abstractC10872k != null) {
                            abstractC10872k.mo3002a();
                        }
                        throw new C10846a();
                    }
                    if (abstractC10872k != null) {
                        abstractC10872k.mo2999c();
                    }
                    throw new C10871j("I/O error in data transfer", e);
                }
            }
        }
    }

    /* renamed from: a */
    public void m3086a(String str, String str2) {
        m3085a(str, str2, (String) null);
    }

    /* renamed from: a */
    public void m3085a(String str, String str2, String str3) {
        boolean z;
        boolean z2 = false;
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (this.f34801v == 2) {
                this.f34792V.m3021a("AUTH TLS");
                if (this.f34792V.m3016c().m2981b()) {
                    this.f34792V.m3020a(this.f34794o);
                } else {
                    this.f34792V.m3021a("AUTH SSL");
                    C10880s m3016c = this.f34792V.m3016c();
                    if (!m3016c.m2981b()) {
                        throw new C10874m(m3016c.m2982a(), "SECURITY_FTPES cannot be applied: the server refused both AUTH TLS and AUTH SSL commands");
                    }
                    this.f34792V.m3020a(this.f34794o);
                }
            }
            this.f34805z = false;
            this.f34792V.m3021a(new StringBuffer().append("USER ").append(str).toString());
            C10880s m3016c2 = this.f34792V.m3016c();
            switch (m3016c2.m2982a()) {
                case AbstractC10866e.f34827F /* 230 */:
                    z = false;
                    break;
                case AbstractC10866e.f34850q /* 331 */:
                    z = true;
                    break;
                case AbstractC10866e.f34851r /* 332 */:
                default:
                    throw new C10874m(m3016c2);
            }
            if (z) {
                if (str2 != null) {
                    this.f34792V.m3021a(new StringBuffer().append("PASS ").append(str2).toString());
                    C10880s m3016c3 = this.f34792V.m3016c();
                    switch (m3016c3.m2982a()) {
                        case AbstractC10866e.f34827F /* 230 */:
                            break;
                        default:
                            throw new C10874m(m3016c3);
                        case AbstractC10866e.f34851r /* 332 */:
                            z2 = true;
                            break;
                    }
                } else {
                    throw new C10874m((int) AbstractC10866e.f34850q);
                }
            }
            if (z2) {
                if (str3 == null) {
                    throw new C10874m((int) AbstractC10866e.f34851r);
                }
                this.f34792V.m3021a(new StringBuffer().append("ACCT ").append(str3).toString());
                C10880s m3016c4 = this.f34792V.m3016c();
                switch (m3016c4.m2982a()) {
                    case AbstractC10866e.f34827F /* 230 */:
                        break;
                    default:
                        throw new C10874m(m3016c4);
                }
            }
            this.f34805z = true;
            this.f34802w = str;
            this.f34803x = str2;
        }
        m3120E();
        m3112M();
    }

    /* renamed from: a */
    public void m3083a(SSLSocketFactory sSLSocketFactory) {
        synchronized (this.f34790T) {
            this.f34794o = sSLSocketFactory;
        }
    }

    /* renamed from: a */
    public void m3082a(boolean z) {
        synchronized (this.f34790T) {
            this.f34771A = z;
        }
    }

    /* renamed from: a */
    public String[] m3094a(String str, int i) {
        String[] m2980c;
        synchronized (this.f34790T) {
            if (this.f34804y) {
                throw new IllegalStateException(new StringBuffer().append("Client already connected to ").append(str).append(" on port ").append(i).toString());
            }
            try {
                Socket mo3004c = this.f34793n.mo3004c(str, i);
                if (this.f34801v == 1) {
                    mo3004c = m3084a(mo3004c, str, i);
                }
                this.f34792V = new C10867f(mo3004c, m3116I());
                Iterator it2 = this.f34795p.iterator();
                while (it2.hasNext()) {
                    this.f34792V.m3022a((AbstractC10868g) it2.next());
                }
                C10880s m3016c = this.f34792V.m3016c();
                if (!m3016c.m2981b()) {
                    throw new C10874m(m3016c);
                }
                this.f34804y = true;
                this.f34805z = false;
                this.f34798s = null;
                this.f34799t = str;
                this.f34800u = i;
                this.f34802w = null;
                this.f34803x = null;
                this.f34780J = false;
                this.f34777G = false;
                this.f34781K = false;
                this.f34782L = false;
                this.f34784N = false;
                m2980c = m3016c.m2980c();
                if (!this.f34804y && mo3004c != null) {
                    try {
                        mo3004c.close();
                    } catch (Throwable th) {
                    }
                }
            } catch (IOException e) {
                throw e;
            }
        }
        return m2980c;
    }

    /* renamed from: b */
    public SSLSocketFactory m3081b() {
        SSLSocketFactory sSLSocketFactory;
        synchronized (this.f34790T) {
            sSLSocketFactory = this.f34794o;
        }
        return sSLSocketFactory;
    }

    /* renamed from: b */
    public void m3080b(int i) {
        if (i == 0 || i == 2 || i == 1) {
            synchronized (this.f34790T) {
                this.f34772B = i;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid type");
    }

    /* renamed from: b */
    public void m3078b(AbstractC10868g abstractC10868g) {
        synchronized (this.f34790T) {
            this.f34795p.remove(abstractC10868g);
            if (this.f34792V != null) {
                this.f34792V.m3018b(abstractC10868g);
            }
        }
    }

    /* renamed from: b */
    public void m3077b(AbstractC10879r abstractC10879r) {
        synchronized (this.f34790T) {
            this.f34796q.remove(abstractC10879r);
        }
    }

    /* renamed from: b */
    public void m3076b(File file) {
        m3075b(file, (AbstractC10872k) null);
    }

    /* renamed from: b */
    public void m3075b(File file, AbstractC10872k abstractC10872k) {
        FileInputStream fileInputStream;
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        try {
                            m3088a(file.getName(), fileInputStream, 0L, abstractC10872k);
                            if (fileInputStream == null) {
                                return;
                            }
                            try {
                                fileInputStream.close();
                            } catch (Throwable th) {
                            }
                        } catch (C10871j e) {
                            throw e;
                        } catch (IOException e2) {
                            throw e2;
                        }
                    } catch (C10846a e3) {
                        throw e3;
                    } catch (C10876o e4) {
                        throw e4;
                    }
                } catch (C10874m e5) {
                    throw e5;
                } catch (IllegalStateException e6) {
                    throw e6;
                }
            } catch (IOException e7) {
                throw new C10871j(e7);
            }
        } catch (Throwable th2) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                }
            }
            throw th2;
        }
    }

    /* renamed from: b */
    public void m3073b(String str, String str2) {
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a(new StringBuffer().append("RNFR ").append(str).toString());
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (m3016c.m2982a() != 350) {
                throw new C10874m(m3016c);
            }
            this.f34792V.m3021a(new StringBuffer().append("RNTO ").append(str2).toString());
            C10880s m3016c2 = this.f34792V.m3016c();
            m3110O();
            if (!m3016c2.m2981b()) {
                throw new C10874m(m3016c2);
            }
        }
    }

    /* renamed from: b */
    public void m3072b(boolean z) {
        this.f34779I = z;
    }

    /* renamed from: b */
    public String[] m3074b(String str) {
        return m3094a(str, this.f34801v == 1 ? 990 : 21);
    }

    /* renamed from: c */
    public int m3071c() {
        return this.f34801v;
    }

    /* renamed from: c */
    public C10880s m3068c(String str) {
        C10880s m3016c;
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            this.f34792V.m3021a(str);
            m3110O();
            m3016c = this.f34792V.m3016c();
        }
        return m3016c;
    }

    /* renamed from: c */
    public void m3070c(int i) {
        if (this.f34772B == 0 || this.f34772B == 1 || this.f34772B == 2) {
            synchronized (this.f34790T) {
                this.f34773C = i;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid MLSD policy");
    }

    /* renamed from: c */
    public void m3067c(boolean z) {
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (this.f34805z) {
                m3111N();
            }
            if (z) {
                this.f34792V.m3021a("QUIT");
                C10880s m3016c = this.f34792V.m3016c();
                if (!m3016c.m2981b()) {
                    throw new C10874m(m3016c);
                }
            }
            this.f34792V.m3023a();
            this.f34792V = null;
            this.f34804y = false;
        }
    }

    /* renamed from: d */
    public int m3066d() {
        int i;
        synchronized (this.f34790T) {
            i = this.f34772B;
        }
        return i;
    }

    /* renamed from: d */
    public C10880s m3064d(String str) {
        C10880s m3016c;
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            this.f34792V.m3021a(new StringBuffer().append("SITE ").append(str).toString());
            m3110O();
            m3016c = this.f34792V.m3016c();
        }
        return m3016c;
    }

    /* renamed from: d */
    public void m3063d(boolean z) {
        synchronized (this.f34791U) {
            if (this.f34785O && !this.f34788R) {
                if (z) {
                    this.f34792V.m3021a("ABOR");
                    m3110O();
                    this.f34789S = true;
                }
                if (this.f34786P != null) {
                    try {
                        this.f34786P.close();
                    } catch (Throwable th) {
                    }
                }
                if (this.f34787Q != null) {
                    try {
                        this.f34787Q.close();
                    } catch (Throwable th2) {
                    }
                }
                this.f34788R = true;
            }
        }
    }

    /* renamed from: e */
    public int m3062e() {
        int i;
        synchronized (this.f34790T) {
            i = this.f34773C;
        }
        return i;
    }

    /* renamed from: e */
    public void m3060e(String str) {
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a(new StringBuffer().append("ACCT ").append(str).toString());
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
        }
    }

    /* renamed from: f */
    public String m3059f() {
        String str;
        synchronized (this.f34790T) {
            str = this.f34778H;
        }
        return str;
    }

    /* renamed from: f */
    public void m3057f(String str) {
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a(new StringBuffer().append("CWD ").append(str).toString());
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
        }
    }

    /* renamed from: g */
    public Date m3055g(String str) {
        Date parse;
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a(new StringBuffer().append("MDTM ").append(str).toString());
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
            String[] m2980c = m3016c.m2980c();
            if (m2980c.length != 1) {
                throw new C10876o();
            }
            try {
                parse = f34768k.parse(m2980c[0]);
            } catch (ParseException e) {
                throw new C10876o();
            }
        }
        return parse;
    }

    /* renamed from: g */
    public boolean m3056g() {
        boolean z;
        synchronized (this.f34790T) {
            z = this.f34777G;
        }
        return z;
    }

    /* renamed from: h */
    public long m3053h(String str) {
        long parseLong;
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a("TYPE I");
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
            this.f34792V.m3021a(new StringBuffer().append("SIZE ").append(str).toString());
            C10880s m3016c2 = this.f34792V.m3016c();
            m3110O();
            if (!m3016c2.m2981b()) {
                throw new C10874m(m3016c2);
            }
            String[] m2980c = m3016c2.m2980c();
            if (m2980c.length != 1) {
                throw new C10876o();
            }
            parseLong = Long.parseLong(m2980c[0]);
        }
        return parseLong;
    }

    /* renamed from: h */
    public boolean m3054h() {
        return this.f34782L;
    }

    /* renamed from: i */
    public void m3051i(String str) {
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a(new StringBuffer().append("DELE ").append(str).toString());
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
        }
    }

    /* renamed from: i */
    public boolean m3052i() {
        return this.f34779I;
    }

    /* renamed from: j */
    public AbstractC10881t m3050j() {
        AbstractC10881t abstractC10881t;
        synchronized (this.f34790T) {
            abstractC10881t = this.f34797r;
        }
        return abstractC10881t;
    }

    /* renamed from: j */
    public void m3049j(String str) {
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a(new StringBuffer().append("RMD ").append(str).toString());
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
        }
    }

    /* renamed from: k */
    public void m3047k(String str) {
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a(new StringBuffer().append("MKD ").append(str).toString());
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
        }
    }

    /* renamed from: k */
    public boolean m3048k() {
        boolean z;
        synchronized (this.f34790T) {
            z = this.f34805z;
        }
        return z;
    }

    /* renamed from: l */
    public boolean m3046l() {
        boolean z;
        synchronized (this.f34790T) {
            z = this.f34804y;
        }
        return z;
    }

    /* renamed from: l */
    public C10875n[] m3045l(String str) {
        char c = 0;
        r1 = null;
        C10875n[] mo2983a = null;
        C10882u c10882u = null;
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a("TYPE A");
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
            AbstractC10870i m3119F = m3119F();
            boolean z = this.f34773C == 0 ? this.f34781K : this.f34773C == 1;
            String str2 = z ? "MLSD" : "LIST";
            if (str != null && str.length() > 0) {
                str2 = new StringBuffer().append(str2).append(" ").append(str).toString();
            }
            ArrayList arrayList = new ArrayList();
            this.f34792V.m3021a(str2);
            try {
                Socket mo2997a = m3119F.mo2997a();
                m3119F.mo2996b();
                synchronized (this.f34791U) {
                    this.f34785O = true;
                    this.f34788R = false;
                    this.f34789S = false;
                    try {
                    } catch (Throwable th) {
                        th = th;
                        C10880s m3016c2 = this.f34792V.m3016c();
                        m3110O();
                        if (m3016c2.m2982a() != 150 && m3016c2.m2982a() != 125) {
                            throw new C10874m(m3016c2);
                        }
                        C10880s m3016c3 = this.f34792V.m3016c();
                        if (c == 0 && m3016c3.m2982a() != 226) {
                            throw new C10874m(m3016c3);
                        }
                        if (this.f34789S) {
                            this.f34792V.m3016c();
                            this.f34789S = false;
                        }
                        throw th;
                    }
                }
                try {
                    try {
                        this.f34786P = mo2997a.getInputStream();
                        if (this.f34783M) {
                            this.f34786P = new InflaterInputStream(this.f34786P);
                        }
                        C10882u c10882u2 = new C10882u(this.f34786P, z ? "UTF-8" : m3116I());
                        while (true) {
                            try {
                                String m2978a = c10882u2.m2978a();
                                if (m2978a == null) {
                                    break;
                                } else if (m2978a.length() > 0) {
                                    arrayList.add(m2978a);
                                }
                            } catch (IOException e) {
                                e = e;
                                synchronized (this.f34791U) {
                                    if (!this.f34788R) {
                                        throw new C10871j("I/O error in data transfer", e);
                                    }
                                    throw new C10846a();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                c10882u = c10882u2;
                                if (c10882u != null) {
                                    try {
                                        c10882u.close();
                                    } catch (Throwable th3) {
                                    }
                                }
                                try {
                                    mo2997a.close();
                                } catch (Throwable th4) {
                                }
                                this.f34786P = null;
                                try {
                                    synchronized (this.f34791U) {
                                        try {
                                            boolean z2 = this.f34788R;
                                            this.f34785O = false;
                                            this.f34788R = false;
                                            throw th;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            }
                        }
                        if (c10882u2 != null) {
                            try {
                                c10882u2.close();
                            } catch (Throwable th7) {
                            }
                        }
                        try {
                            mo2997a.close();
                        } catch (Throwable th8) {
                        }
                        this.f34786P = null;
                        synchronized (this.f34791U) {
                            try {
                                boolean z3 = this.f34788R;
                                try {
                                    this.f34785O = false;
                                    this.f34788R = false;
                                    C10880s m3016c4 = this.f34792V.m3016c();
                                    m3110O();
                                    if (m3016c4.m2982a() != 150 && m3016c4.m2982a() != 125) {
                                        throw new C10874m(m3016c4);
                                    }
                                    C10880s m3016c5 = this.f34792V.m3016c();
                                    if (!z3 && m3016c5.m2982a() != 226) {
                                        throw new C10874m(m3016c5);
                                    }
                                    if (this.f34789S) {
                                        this.f34792V.m3016c();
                                        this.f34789S = false;
                                    }
                                    int size = arrayList.size();
                                    String[] strArr = new String[size];
                                    for (int i = 0; i < size; i++) {
                                        strArr[i] = (String) arrayList.get(i);
                                    }
                                    if (z) {
                                        mo2983a = new C10862c().mo2983a(strArr);
                                    } else {
                                        if (this.f34798s != null) {
                                            try {
                                                mo2983a = this.f34798s.mo2983a(strArr);
                                            } catch (C10878q e2) {
                                                this.f34798s = null;
                                            }
                                        }
                                        if (mo2983a == null) {
                                            Iterator it2 = this.f34796q.iterator();
                                            while (it2.hasNext()) {
                                                AbstractC10879r abstractC10879r = (AbstractC10879r) it2.next();
                                                try {
                                                    mo2983a = abstractC10879r.mo2983a(strArr);
                                                    this.f34798s = abstractC10879r;
                                                    break;
                                                } catch (C10878q e3) {
                                                    mo2983a = mo2983a;
                                                }
                                            }
                                        }
                                    }
                                    if (mo2983a == null) {
                                        throw new C10878q();
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    while (true) {
                                        try {
                                            break;
                                        } catch (Throwable th10) {
                                            th = th10;
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                            }
                        }
                    } catch (IOException e4) {
                        e = e4;
                    }
                } catch (Throwable th12) {
                    th = th12;
                }
            } catch (Throwable th13) {
                th = th13;
                c = 0;
            }
        }
        return mo2983a;
    }

    /* renamed from: m */
    public boolean m3044m() {
        boolean z;
        synchronized (this.f34790T) {
            z = this.f34771A;
        }
        return z;
    }

    /* renamed from: n */
    public String m3042n() {
        String str;
        synchronized (this.f34790T) {
            str = this.f34799t;
        }
        return str;
    }

    /* renamed from: o */
    public int m3041o() {
        int i;
        synchronized (this.f34790T) {
            i = this.f34800u;
        }
        return i;
    }

    /* renamed from: p */
    public String m3040p() {
        String str;
        synchronized (this.f34790T) {
            str = this.f34803x;
        }
        return str;
    }

    /* renamed from: q */
    public String m3039q() {
        String str;
        synchronized (this.f34790T) {
            str = this.f34802w;
        }
        return str;
    }

    /* renamed from: r */
    public long m3038r() {
        long j;
        synchronized (this.f34790T) {
            j = this.f34774D;
        }
        return j;
    }

    /* renamed from: s */
    public AbstractC10868g[] m3037s() {
        AbstractC10868g[] abstractC10868gArr;
        synchronized (this.f34790T) {
            int size = this.f34795p.size();
            abstractC10868gArr = new AbstractC10868g[size];
            for (int i = 0; i < size; i++) {
                abstractC10868gArr[i] = (AbstractC10868g) this.f34795p.get(i);
            }
        }
        return abstractC10868gArr;
    }

    /* renamed from: t */
    public AbstractC10879r[] m3036t() {
        AbstractC10879r[] abstractC10879rArr;
        synchronized (this.f34790T) {
            int size = this.f34796q.size();
            abstractC10879rArr = new AbstractC10879r[size];
            for (int i = 0; i < size; i++) {
                abstractC10879rArr[i] = (AbstractC10879r) this.f34796q.get(i);
            }
        }
        return abstractC10879rArr;
    }

    public String toString() {
        String stringBuffer;
        synchronized (this.f34790T) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(getClass().getName());
            stringBuffer2.append(" [connected=");
            stringBuffer2.append(this.f34804y);
            if (this.f34804y) {
                stringBuffer2.append(", host=");
                stringBuffer2.append(this.f34799t);
                stringBuffer2.append(", port=");
                stringBuffer2.append(this.f34800u);
            }
            stringBuffer2.append(", connector=");
            stringBuffer2.append(this.f34793n);
            stringBuffer2.append(", security=");
            switch (this.f34801v) {
                case 0:
                    stringBuffer2.append("SECURITY_FTP");
                    break;
                case 1:
                    stringBuffer2.append("SECURITY_FTPS");
                    break;
                case 2:
                    stringBuffer2.append("SECURITY_FTPES");
                    break;
            }
            stringBuffer2.append(", authenticated=");
            stringBuffer2.append(this.f34805z);
            if (this.f34805z) {
                stringBuffer2.append(", username=");
                stringBuffer2.append(this.f34802w);
                stringBuffer2.append(", password=");
                StringBuffer stringBuffer3 = new StringBuffer();
                for (int i = 0; i < this.f34803x.length(); i++) {
                    stringBuffer3.append('*');
                }
                stringBuffer2.append(stringBuffer3);
                stringBuffer2.append(", restSupported=");
                stringBuffer2.append(this.f34777G);
                stringBuffer2.append(", utf8supported=");
                stringBuffer2.append(this.f34780J);
                stringBuffer2.append(", mlsdSupported=");
                stringBuffer2.append(this.f34781K);
                stringBuffer2.append(", mode=modezSupported");
                stringBuffer2.append(this.f34782L);
                stringBuffer2.append(", mode=modezEnabled");
                stringBuffer2.append(this.f34783M);
            }
            stringBuffer2.append(", transfer mode=");
            stringBuffer2.append(this.f34771A ? "passive" : "active");
            stringBuffer2.append(", transfer type=");
            switch (this.f34772B) {
                case 0:
                    stringBuffer2.append("TYPE_AUTO");
                    break;
                case 1:
                    stringBuffer2.append("TYPE_TEXTUAL");
                    break;
                case 2:
                    stringBuffer2.append("TYPE_BINARY");
                    break;
            }
            stringBuffer2.append(", textualExtensionRecognizer=");
            stringBuffer2.append(this.f34797r);
            AbstractC10879r[] m3036t = m3036t();
            if (m3036t.length > 0) {
                stringBuffer2.append(", listParsers=");
                for (int i2 = 0; i2 < m3036t.length; i2++) {
                    if (i2 > 0) {
                        stringBuffer2.append(", ");
                    }
                    stringBuffer2.append(m3036t[i2]);
                }
            }
            AbstractC10868g[] m3037s = m3037s();
            if (m3037s.length > 0) {
                stringBuffer2.append(", communicationListeners=");
                for (int i3 = 0; i3 < m3037s.length; i3++) {
                    if (i3 > 0) {
                        stringBuffer2.append(", ");
                    }
                    stringBuffer2.append(m3037s[i3]);
                }
            }
            stringBuffer2.append(", autoNoopTimeout=");
            stringBuffer2.append(this.f34774D);
            stringBuffer2.append("]");
            stringBuffer = stringBuffer2.toString();
        }
        return stringBuffer;
    }

    /* renamed from: u */
    public void m3035u() {
        this.f34793n.m3008b();
    }

    /* renamed from: v */
    public void m3034v() {
        if (this.f34792V != null) {
            this.f34792V.m3023a();
            this.f34792V = null;
        }
        this.f34804y = false;
        m3111N();
    }

    /* renamed from: w */
    public void m3033w() {
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a("REIN");
            C10880s m3016c = this.f34792V.m3016c();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
            m3111N();
            this.f34805z = false;
            this.f34802w = null;
            this.f34803x = null;
        }
    }

    /* renamed from: x */
    public void m3032x() {
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a("NOOP");
            C10880s m3016c = this.f34792V.m3016c();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
            m3110O();
        }
    }

    /* renamed from: y */
    public String m3031y() {
        String substring;
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a("PWD");
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
            String[] m2980c = m3016c.m2980c();
            if (m2980c.length != 1) {
                throw new C10876o();
            }
            Matcher matcher = f34770m.matcher(m2980c[0]);
            if (!matcher.find()) {
                throw new C10876o();
            }
            substring = m2980c[0].substring(matcher.start() + 1, matcher.end() - 1);
        }
        return substring;
    }

    /* renamed from: z */
    public void m3030z() {
        synchronized (this.f34790T) {
            if (!this.f34804y) {
                throw new IllegalStateException("Client not connected");
            }
            if (!this.f34805z) {
                throw new IllegalStateException("Client not authenticated");
            }
            this.f34792V.m3021a("CDUP");
            C10880s m3016c = this.f34792V.m3016c();
            m3110O();
            if (!m3016c.m2981b()) {
                throw new C10874m(m3016c);
            }
        }
    }
}
