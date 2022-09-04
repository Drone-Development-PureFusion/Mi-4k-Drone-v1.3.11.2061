package com.fimi.kernel.p158b.p162d;

import android.os.Message;
import com.fimi.kernel.AbstractC1584b;
import com.fimi.kernel.p158b.p161c.AbstractC1622a;
import com.fimi.kernel.p158b.p161c.AbstractC1625d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.kernel.b.d.c */
/* loaded from: classes.dex */
public class C1629c extends AbstractC1584b implements AbstractC1627a {

    /* renamed from: f */
    private static C1629c f4015f = null;

    /* renamed from: d */
    private DataOutputStream f4019d;

    /* renamed from: e */
    private DataInputStream f4020e;

    /* renamed from: c */
    private Socket f4018c = null;

    /* renamed from: g */
    private List<AbstractC1625d> f4021g = new ArrayList();

    /* renamed from: h */
    private List<AbstractC1622a> f4022h = new ArrayList();

    /* renamed from: i */
    private boolean f4023i = true;

    /* renamed from: a */
    boolean f4016a = true;

    /* renamed from: j */
    private StringBuffer f4024j = new StringBuffer();

    /* renamed from: b */
    private C1631d f4017b = new C1631d();

    /* renamed from: c */
    public static synchronized C1629c m34936c() {
        C1629c c1629c;
        synchronized (C1629c.class) {
            if (f4015f == null) {
                f4015f = new C1629c();
            }
            c1629c = f4015f;
        }
        return c1629c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m34934c(String str) {
        this.f4016a = false;
        Message message = new Message();
        message.obj = str;
        a().sendMessage(message);
    }

    @Override // com.fimi.kernel.AbstractC1584b
    /* renamed from: a */
    protected void mo30955a(Message message) {
        if (message == null || message.obj == null) {
            return;
        }
        for (AbstractC1625d abstractC1625d : this.f4021g) {
            abstractC1625d.mo28036a(message.obj.toString());
        }
    }

    /* renamed from: a */
    public void m34951a(AbstractC1622a abstractC1622a) {
        if (this.f4022h.contains(abstractC1622a)) {
            this.f4022h.remove(abstractC1622a);
        }
    }

    /* renamed from: a */
    public void m34950a(AbstractC1625d abstractC1625d) {
        if (this.f4021g.contains(abstractC1625d)) {
            this.f4021g.remove(abstractC1625d);
        }
    }

    /* renamed from: a */
    public void m34946a(C1631d c1631d) {
        this.f4017b = c1631d;
    }

    /* renamed from: a */
    public void m34943a(byte[] bArr) {
        try {
            if (this.f4023i && this.f4017b.m34921c()) {
                m34926h();
            }
            if (this.f4019d == null) {
                return;
            }
            this.f4019d.write(bArr);
            this.f4019d.flush();
        } catch (IOException e) {
            this.f4023i = true;
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m34942a(byte[] bArr, int i, int i2) {
        try {
            if (this.f4023i && this.f4017b.m34921c()) {
                m34926h();
            }
            this.f4019d.write(bArr, i, i2);
            this.f4019d.flush();
        } catch (IOException e) {
            this.f4023i = true;
        }
    }

    /* renamed from: a */
    public boolean m34945a(String str) {
        this.f4017b.a(str);
        return m34933d();
    }

    /* renamed from: a */
    public boolean m34944a(String str, int i) {
        this.f4017b.a(str);
        this.f4017b.a(i);
        return m34933d();
    }

    /* renamed from: b */
    public void m34940b(AbstractC1622a abstractC1622a) {
        if (abstractC1622a != null) {
            this.f4022h.add(abstractC1622a);
        }
    }

    /* renamed from: b */
    public void m34939b(AbstractC1625d abstractC1625d) {
        if (abstractC1625d != null) {
            this.f4021g.add(abstractC1625d);
        }
    }

    /* renamed from: b */
    public void m34937b(String str) {
        m34943a(str.getBytes());
    }

    /* renamed from: b */
    public boolean m34941b() {
        if (this.f4018c == null) {
            return false;
        }
        return this.f4018c.isConnected();
    }

    /* renamed from: d */
    public boolean m34933d() {
        try {
            this.f4018c = new Socket(this.f4017b.a(), this.f4017b.b());
            this.f4018c.setSoLinger(true, 0);
            this.f4019d = new DataOutputStream(this.f4018c.getOutputStream());
            this.f4020e = new DataInputStream(this.f4018c.getInputStream());
            a(new Runnable() { // from class: com.fimi.kernel.b.d.c.1
                @Override // java.lang.Runnable
                public void run() {
                    byte[] bArr = new byte[C1629c.this.f4017b.m34919e()];
                    do {
                        if (C1629c.this.f4018c.isConnected()) {
                            while (true) {
                                try {
                                    C1629c.this.f4023i = false;
                                    int read = C1629c.this.f4020e.read(bArr);
                                    if (read == -1) {
                                        break;
                                    } else if (C1629c.this.f4022h.size() > 0) {
                                        for (AbstractC1622a abstractC1622a : C1629c.this.f4022h) {
                                            abstractC1622a.mo34084a(read, bArr);
                                        }
                                    } else {
                                        String str = new String(bArr, 0, read, C1629c.this.f4017b.m34918f());
                                        if (C1629c.this.f4017b.m34920d()) {
                                            C1629c.this.m34934c(str);
                                        } else {
                                            String replace = str.replace(" ", "");
                                            if (replace.startsWith("{\"rval\":") || replace.startsWith("{\"msg_id\"")) {
                                                C1629c.this.f4024j.delete(0, C1629c.this.f4024j.length());
                                                C1629c.this.f4016a = true;
                                            }
                                            if (C1629c.this.f4016a) {
                                                C1629c.this.f4024j.append(str);
                                                if (C1629c.this.f4024j.toString().contains(":1282") && (C1629c.this.f4024j.length() > 50000 || str.endsWith("]}"))) {
                                                    String stringBuffer = C1629c.this.f4024j.toString();
                                                    if (stringBuffer.length() > 50000) {
                                                        String substring = stringBuffer.substring(0, 50000);
                                                        stringBuffer = substring.substring(0, substring.lastIndexOf("}") + 1) + "]}";
                                                    }
                                                    C1629c.this.m34934c(stringBuffer);
                                                    C1629c.this.f4024j.delete(0, C1629c.this.f4024j.length());
                                                } else if (!C1629c.this.f4024j.toString().contains(":1282") && str.endsWith("}")) {
                                                    C1629c.this.m34934c(C1629c.this.f4024j.toString());
                                                    C1629c.this.f4024j.delete(0, C1629c.this.f4024j.length());
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    C1629c.this.f4023i = true;
                                    e.printStackTrace();
                                    return;
                                }
                            }
                        }
                    } while (!C1629c.this.f4023i);
                }
            });
            return true;
        } catch (Exception e) {
            this.f4023i = true;
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    public boolean m34931e() {
        return this.f4023i;
    }

    /* renamed from: f */
    public C1631d m34929f() {
        return this.f4017b;
    }

    /* renamed from: g */
    public void m34927g() {
        try {
            this.f4019d.close();
            this.f4019d = null;
        } catch (Exception e) {
        }
        try {
            this.f4020e.close();
            this.f4020e = null;
        } catch (Exception e2) {
        }
        try {
            this.f4018c.close();
        } catch (Exception e3) {
        }
        this.f4023i = true;
    }

    /* renamed from: h */
    protected boolean m34926h() {
        m34927g();
        m34933d();
        return false;
    }
}
