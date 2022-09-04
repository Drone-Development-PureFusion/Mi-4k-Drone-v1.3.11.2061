package com.fimi.kernel.p158b.p159a;

import android.os.Message;
import android.util.Log;
import com.fimi.kernel.AbstractC1584b;
import com.fimi.kernel.p158b.p159a.AbstractC1587a;
import com.fimi.kernel.p158b.p161c.AbstractC1623b;
import it.p273a.p274a.C10855b;
import java.io.File;
/* renamed from: com.fimi.kernel.b.a.b */
/* loaded from: classes.dex */
public class C1589b extends AbstractC1584b implements AbstractC1597d {

    /* renamed from: b */
    private static C1589b f3920b;

    /* renamed from: c */
    private C10855b f3922c;

    /* renamed from: d */
    private C1596c f3923d;

    /* renamed from: g */
    private String f3926g;

    /* renamed from: h */
    private String f3927h;

    /* renamed from: i */
    private File f3928i;

    /* renamed from: a */
    private final String f3921a = C1589b.class.getName();

    /* renamed from: e */
    private AbstractC1623b f3924e = null;

    /* renamed from: f */
    private AbstractC1587a f3925f = null;

    /* renamed from: com.fimi.kernel.b.a.b$a */
    /* loaded from: classes.dex */
    private enum EnumC1595a {
        ConnectServer,
        DownloadFile,
        UploadFile
    }

    private C1589b() {
        this.f3922c = null;
        this.f3923d = null;
        this.f3922c = new C10855b();
        this.f3923d = new C1596c();
    }

    /* renamed from: a */
    private boolean m35085a(String str, int i, String str2, String str3, boolean z) {
        try {
            this.f3922c.m3082a(z);
            if (this.f3922c.m3046l()) {
                return true;
            }
            this.f3922c.m3094a(str, i);
            this.f3922c.m3086a(str2, str3);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public static synchronized C1589b m35080b() {
        C1589b c1589b;
        synchronized (C1589b.class) {
            f3920b = new C1589b();
            c1589b = f3920b;
        }
        return c1589b;
    }

    @Override // com.fimi.kernel.AbstractC1584b
    /* renamed from: a */
    protected void mo30955a(Message message) {
        boolean z = true;
        if (message.what == EnumC1595a.ConnectServer.ordinal()) {
            if (message.arg1 != 1) {
                z = false;
            }
            if (this.f3924e != null) {
                this.f3924e.mo33142a(z, "SUCCESS");
            }
        }
        if ((message.what == EnumC1595a.DownloadFile.ordinal() || message.what == EnumC1595a.UploadFile.ordinal()) && this.f3925f != null) {
            this.f3925f.mo33141a(AbstractC1587a.EnumC1588a.values()[message.arg1], message.arg2);
        }
    }

    /* renamed from: a */
    public void m35091a(C1596c c1596c) {
        this.f3923d = c1596c;
    }

    /* renamed from: a */
    public void m35090a(AbstractC1623b abstractC1623b) {
        this.f3924e = abstractC1623b;
        a(new Runnable() { // from class: com.fimi.kernel.b.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                Message message = new Message();
                message.what = EnumC1595a.ConnectServer.ordinal();
                if (C1589b.this.m35070e()) {
                    message.arg1 = 1;
                } else {
                    message.arg1 = 0;
                }
                C1589b.this.a().sendMessage(message);
            }
        });
    }

    /* renamed from: a */
    public void m35089a(File file, AbstractC1587a abstractC1587a) {
        try {
            this.f3922c.m3096a(file, abstractC1587a);
        } catch (Exception e) {
            Log.d(this.f3921a, e.toString());
        }
    }

    /* renamed from: a */
    public void m35086a(String str, int i, AbstractC1623b abstractC1623b) {
        this.f3923d.a(str);
        this.f3923d.a(i);
        m35090a(abstractC1623b);
    }

    /* renamed from: a */
    public void m35084a(String str, AbstractC1587a abstractC1587a) {
        File file = new File(str);
        try {
            if (abstractC1587a != null) {
                this.f3922c.m3096a(file, abstractC1587a);
            } else {
                this.f3922c.m3099a(file);
            }
        } catch (Exception e) {
            Log.d(this.f3921a, e.toString());
        }
    }

    /* renamed from: a */
    public void m35083a(String str, AbstractC1623b abstractC1623b) {
        this.f3923d.a(str);
        m35090a(abstractC1623b);
    }

    /* renamed from: a */
    public void m35081a(String str, String str2, AbstractC1587a abstractC1587a) {
        try {
            this.f3922c.m3090a(str, new File(str2), abstractC1587a);
        } catch (Exception e) {
            Log.d(this.f3921a, e.toString());
        }
    }

    /* renamed from: a */
    public boolean m35088a(String str) {
        return m35085a(str, this.f3923d.b(), this.f3923d.m35060c(), this.f3923d.m35058d(), this.f3923d.m35057e());
    }

    /* renamed from: a */
    public boolean m35087a(String str, int i) {
        return m35085a(str, i, this.f3923d.m35060c(), this.f3923d.m35058d(), this.f3923d.m35057e());
    }

    /* renamed from: a */
    public boolean m35082a(String str, String str2) {
        try {
            this.f3922c.m3073b(str, str2);
            return true;
        } catch (Exception e) {
            Log.d(this.f3921a, e.toString());
            return false;
        }
    }

    /* renamed from: b */
    public void m35078b(File file, AbstractC1587a abstractC1587a) {
        this.f3928i = file;
        this.f3925f = abstractC1587a;
        a(new Runnable() { // from class: com.fimi.kernel.b.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!C1589b.this.f3928i.isFile()) {
                        return;
                    }
                    C1589b.this.f3922c.m3096a(C1589b.this.f3928i, new AbstractC1587a() { // from class: com.fimi.kernel.b.a.b.3.1
                        @Override // com.fimi.kernel.p158b.p159a.AbstractC1587a
                        /* renamed from: a */
                        public void mo33141a(AbstractC1587a.EnumC1588a enumC1588a, int i) {
                            Message message = new Message();
                            message.what = EnumC1595a.UploadFile.ordinal();
                            message.arg1 = enumC1588a.ordinal();
                            message.arg2 = i;
                            C1589b.this.a().sendMessage(message);
                        }
                    });
                } catch (Exception e) {
                    Log.d(C1589b.this.f3921a, e.toString());
                }
            }
        });
    }

    /* renamed from: b */
    public void m35076b(String str, AbstractC1587a abstractC1587a) {
        this.f3925f = abstractC1587a;
        if (new File(str).isFile()) {
            m35078b(this.f3928i, abstractC1587a);
        }
    }

    /* renamed from: b */
    public void m35075b(String str, String str2, AbstractC1587a abstractC1587a) {
        this.f3925f = abstractC1587a;
        this.f3926g = str;
        this.f3927h = str2;
        a(new Runnable() { // from class: com.fimi.kernel.b.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C1589b.this.f3922c.m3090a(C1589b.this.f3926g, new File(C1589b.this.f3927h), new AbstractC1587a() { // from class: com.fimi.kernel.b.a.b.2.1
                        @Override // com.fimi.kernel.p158b.p159a.AbstractC1587a
                        /* renamed from: a */
                        public void mo33141a(AbstractC1587a.EnumC1588a enumC1588a, int i) {
                            Message message = new Message();
                            message.what = EnumC1595a.DownloadFile.ordinal();
                            message.arg1 = enumC1588a.ordinal();
                            message.arg2 = i;
                            C1589b.this.a().sendMessage(message);
                        }
                    });
                } catch (Exception e) {
                }
            }
        });
    }

    /* renamed from: b */
    public boolean m35077b(String str) {
        try {
            this.f3922c.m3060e(str);
            return true;
        } catch (Exception e) {
            Log.d(this.f3921a, e.toString());
            return false;
        }
    }

    /* renamed from: c */
    public C1596c m35074c() {
        return this.f3923d;
    }

    /* renamed from: d */
    public boolean m35072d() {
        return this.f3922c.m3046l();
    }

    /* renamed from: e */
    public boolean m35070e() {
        return m35085a(this.f3923d.a(), this.f3923d.b(), this.f3923d.m35060c(), this.f3923d.m35058d(), this.f3923d.m35057e());
    }

    /* renamed from: f */
    public String m35068f() {
        try {
            return this.f3922c.m3031y();
        } catch (Exception e) {
            Log.d(this.f3921a, e.toString());
            return null;
        }
    }

    /* renamed from: g */
    public String[] m35066g() {
        try {
            return this.f3922c.m3121D();
        } catch (Exception e) {
            Log.d(this.f3921a, e.toString());
            return null;
        }
    }

    /* renamed from: h */
    public void m35064h() {
        try {
            this.f3922c.m3067c(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
