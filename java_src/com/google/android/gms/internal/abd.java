package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.AbstractC7674ru;
import com.google.android.gms.internal.adf;
import com.google.android.gms.internal.ajg;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
/* loaded from: classes.dex */
public abstract class abd<T> implements Comparable<abd<T>> {

    /* renamed from: a */
    private final ajg.C6407a f20864a;

    /* renamed from: b */
    private final int f20865b;

    /* renamed from: c */
    private final String f20866c;

    /* renamed from: d */
    private final int f20867d;

    /* renamed from: e */
    private final adf.AbstractC6208a f20868e;

    /* renamed from: f */
    private Integer f20869f;

    /* renamed from: g */
    private ace f20870g;

    /* renamed from: h */
    private boolean f20871h;

    /* renamed from: i */
    private boolean f20872i;

    /* renamed from: j */
    private boolean f20873j;

    /* renamed from: k */
    private long f20874k;

    /* renamed from: l */
    private afg f20875l;

    /* renamed from: m */
    private AbstractC7674ru.C7675a f20876m;

    /* renamed from: com.google.android.gms.internal.abd$a */
    /* loaded from: classes2.dex */
    public enum EnumC6128a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public abd(int i, String str, adf.AbstractC6208a abstractC6208a) {
        this.f20864a = ajg.C6407a.f22013a ? new ajg.C6407a() : null;
        this.f20871h = true;
        this.f20872i = false;
        this.f20873j = false;
        this.f20874k = 0L;
        this.f20876m = null;
        this.f20865b = i;
        this.f20866c = str;
        this.f20868e = abstractC6208a;
        m18515a((afg) new C7773tw());
        this.f20867d = m18512a(str);
    }

    /* renamed from: a */
    private static int m18512a(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* renamed from: a */
    private byte[] m18511a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append(SignatureVisitor.INSTANCEOF);
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? "Encoding not supported: ".concat(valueOf) : new String("Encoding not supported: "), e);
        }
    }

    /* renamed from: a */
    public int m18519a() {
        return this.f20865b;
    }

    /* renamed from: a */
    public int m18517a(abd<T> abdVar) {
        EnumC6128a m18493q = m18493q();
        EnumC6128a m18493q2 = abdVar.m18493q();
        return m18493q == m18493q2 ? this.f20869f.intValue() - abdVar.f20869f.intValue() : m18493q2.ordinal() - m18493q.ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final abd<?> m18518a(int i) {
        this.f20869f = Integer.valueOf(i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public abd<?> m18516a(ace aceVar) {
        this.f20870g = aceVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public abd<?> m18515a(afg afgVar) {
        this.f20875l = afgVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public abd<?> m18513a(AbstractC7674ru.C7675a c7675a) {
        this.f20876m = c7675a;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract adf<T> mo18238a(C8092zb c8092zb);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public aii m18514a(aii aiiVar) {
        return aiiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18236a(T t);

    /* renamed from: b */
    public int m18510b() {
        return this.f20867d;
    }

    /* renamed from: b */
    public void m18508b(aii aiiVar) {
        if (this.f20868e != null) {
            this.f20868e.mo18045a(aiiVar);
        }
    }

    /* renamed from: b */
    public void m18507b(String str) {
        if (ajg.C6407a.f22013a) {
            this.f20864a.m17126a(str, Thread.currentThread().getId());
        } else if (this.f20874k != 0) {
        } else {
            this.f20874k = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: c */
    public String m18506c() {
        return this.f20866c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m18505c(final String str) {
        if (this.f20870g != null) {
            this.f20870g.m18228b(this);
        }
        if (!ajg.C6407a.f22013a) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f20874k;
            if (elapsedRealtime < 3000) {
                return;
            }
            ajg.m17131b("%d ms: %s", Long.valueOf(elapsedRealtime), toString());
            return;
        }
        final long id = Thread.currentThread().getId();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.abd.1
                @Override // java.lang.Runnable
                public void run() {
                    abd.this.f20864a.m17126a(str, id);
                    abd.this.f20864a.m17127a(toString());
                }
            });
            return;
        }
        this.f20864a.m17126a(str, id);
        this.f20864a.m17127a(toString());
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        return m18517a((abd) ((abd) obj));
    }

    /* renamed from: d */
    public String m18504d() {
        return m18506c();
    }

    /* renamed from: e */
    public AbstractC7674ru.C7675a m18503e() {
        return this.f20876m;
    }

    /* renamed from: f */
    public boolean m18502f() {
        return false;
    }

    /* renamed from: g */
    public Map<String, String> mo18240g() {
        return Collections.emptyMap();
    }

    @Deprecated
    /* renamed from: h */
    protected Map<String, String> m18501h() {
        return m18497l();
    }

    @Deprecated
    /* renamed from: i */
    protected String m18500i() {
        return m18496m();
    }

    @Deprecated
    /* renamed from: j */
    public String m18499j() {
        return m18495n();
    }

    @Deprecated
    /* renamed from: k */
    public byte[] m18498k() {
        Map<String, String> m18501h = m18501h();
        if (m18501h == null || m18501h.size() <= 0) {
            return null;
        }
        return m18511a(m18501h, m18500i());
    }

    /* renamed from: l */
    protected Map<String, String> m18497l() {
        return null;
    }

    /* renamed from: m */
    protected String m18496m() {
        return "UTF-8";
    }

    /* renamed from: n */
    public String m18495n() {
        String valueOf = String.valueOf(m18496m());
        return valueOf.length() != 0 ? "application/x-www-form-urlencoded; charset=".concat(valueOf) : new String("application/x-www-form-urlencoded; charset=");
    }

    /* renamed from: o */
    public byte[] mo18239o() {
        Map<String, String> m18497l = m18497l();
        if (m18497l == null || m18497l.size() <= 0) {
            return null;
        }
        return m18511a(m18497l, m18496m());
    }

    /* renamed from: p */
    public final boolean m18494p() {
        return this.f20871h;
    }

    /* renamed from: q */
    public EnumC6128a m18493q() {
        return EnumC6128a.NORMAL;
    }

    /* renamed from: r */
    public final int m18492r() {
        return this.f20875l.mo13507a();
    }

    /* renamed from: s */
    public afg m18491s() {
        return this.f20875l;
    }

    /* renamed from: t */
    public void m18490t() {
        this.f20873j = true;
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(m18510b()));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        String valueOf2 = String.valueOf(m18506c());
        String valueOf3 = String.valueOf(m18493q());
        String valueOf4 = String.valueOf(this.f20869f);
        return new StringBuilder(String.valueOf("[ ] ").length() + 3 + String.valueOf(valueOf2).length() + String.valueOf(concat).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length()).append("[ ] ").append(valueOf2).append(" ").append(concat).append(" ").append(valueOf3).append(" ").append(valueOf4).toString();
    }

    /* renamed from: u */
    public boolean m18489u() {
        return this.f20873j;
    }
}
