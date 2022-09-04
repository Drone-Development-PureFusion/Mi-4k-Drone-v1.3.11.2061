package p005b.p006a.p007a.p029b;

import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import p005b.p006a.p007a.p029b.p051l.C0601b;
import p005b.p006a.p007a.p029b.p058r.C0713l;
import p005b.p006a.p007a.p029b.p058r.C0716o;
/* renamed from: b.a.a.b.i */
/* loaded from: classes.dex */
public class C0546i<E> extends C0651o<E> {

    /* renamed from: a */
    protected boolean f924a = true;

    /* renamed from: b */
    protected String f925b = null;

    /* renamed from: e */
    private boolean f926e = false;

    /* renamed from: f */
    private boolean f927f = false;

    /* renamed from: g */
    private boolean f928g = false;

    /* renamed from: f */
    private String m38864f(String str) {
        return C0713l.m38418a() ? C0716o.m38407a(this.f1199s.mo38529a(C0494h.f696Q), str) : str;
    }

    /* renamed from: f */
    private void m38865f(E e) {
        FileChannel m38748a = ((C0601b) l()).m38748a();
        if (m38748a == null) {
            return;
        }
        FileLock fileLock = null;
        try {
            fileLock = m38748a.lock();
            long position = m38748a.position();
            long size = m38748a.size();
            if (size != position) {
                m38748a.position(size);
            }
            super.mo38592b((C0546i<E>) e);
        } finally {
            if (fileLock != null) {
                fileLock.release();
            }
        }
    }

    /* renamed from: a */
    public void mo38665a(String str) {
        if (str == null) {
            this.f925b = null;
        } else {
            this.f925b = str.trim();
        }
    }

    /* renamed from: a */
    public void m38872a(boolean z) {
        this.f926e = z;
    }

    /* renamed from: a */
    public boolean m38873a() {
        return this.f924a;
    }

    /* renamed from: b */
    public final String m38871b() {
        return this.f925b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.C0651o
    /* renamed from: b */
    public void mo38592b(E e) {
        if (this.f926e) {
            m38865f((C0546i<E>) e);
        } else {
            super.mo38592b((C0546i<E>) e);
        }
    }

    /* renamed from: b */
    public void m38869b(boolean z) {
        this.f924a = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public boolean m38870b(String str) {
        String m38864f = m38864f(str);
        synchronized (this.f1176d) {
            File file = new File(m38864f);
            if (C0716o.m38406b(file) && !C0716o.m38404c(file)) {
                c("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
            }
            C0601b c0601b = new C0601b(file, this.f924a);
            c0601b.a(this.f1199s);
            a((OutputStream) c0601b);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.C0651o
    /* renamed from: c */
    public void mo38591c(E e) {
        if (!this.f927f && this.f928g) {
            this.f927f = true;
            try {
                m38870b(mo38664d());
            } catch (IOException e2) {
                this.f1233j = false;
                a("openFile(" + this.f925b + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f924a + ") failed", e2);
            }
        }
        super.mo38591c((C0546i<E>) e);
    }

    /* renamed from: c */
    public void m38868c(boolean z) {
        this.f928g = z;
    }

    /* renamed from: d */
    public String mo38664d() {
        return this.f925b;
    }

    /* renamed from: e */
    public boolean m38867e() {
        return this.f926e;
    }

    /* renamed from: f */
    public boolean m38866f() {
        return this.f928g;
    }

    @Override // p005b.p006a.p007a.p029b.C0651o, p005b.p006a.p007a.p029b.AbstractC0689q, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        boolean z = false;
        String mo38664d = mo38664d();
        if (mo38664d != null) {
            String m38864f = m38864f(mo38664d);
            d("File property is set to [" + m38864f + "]");
            if (this.f926e && !m38873a()) {
                m38869b(true);
                e("Setting \"Append\" property to true on account of \"Prudent\" mode");
            }
            if (!this.f928g) {
                try {
                    m38870b(m38864f);
                } catch (IOException e) {
                    a("openFile(" + m38864f + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f924a + ") failed", e);
                    z = true;
                }
            } else {
                a((OutputStream) new C0642n());
            }
        } else {
            c("\"File\" property not set for appender named [" + this.f1234k + "]");
            z = true;
        }
        if (!z) {
            super.mo38474j();
        }
    }
}
