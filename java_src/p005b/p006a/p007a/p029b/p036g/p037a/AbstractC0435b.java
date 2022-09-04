package p005b.p006a.p007a.p029b.p036g.p037a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p036g.p040d.C0481m;
import p005b.p006a.p007a.p029b.p058r.C0720s;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.g.a.b */
/* loaded from: classes.dex */
public abstract class AbstractC0435b extends AbstractC0436c {

    /* renamed from: a */
    private static final String f551a = "file";

    /* renamed from: b */
    private static final String f552b = "url";

    /* renamed from: c */
    private static final String f553c = "resource";

    /* renamed from: d */
    private static final String f554d = "optional";

    /* renamed from: m */
    private String f555m;

    /* renamed from: n */
    private boolean f556n;

    /* renamed from: o */
    private URL f557o;

    /* renamed from: a */
    private URL m39296a(C0479k c0479k, Attributes attributes) {
        String value = attributes.getValue("file");
        String value2 = attributes.getValue("url");
        String value3 = attributes.getValue(f553c);
        if (!C0724u.m38372e(value)) {
            this.f555m = c0479k.m39188f(value);
            return m39288f(this.f555m);
        } else if (!C0724u.m38372e(value2)) {
            this.f555m = c0479k.m39188f(value2);
            return m39294a(this.f555m);
        } else if (C0724u.m38372e(value3)) {
            throw new IllegalStateException("A URL stream should have been returned");
        } else {
            this.f555m = c0479k.m39188f(value3);
            return m39290b(this.f555m);
        }
    }

    /* renamed from: a */
    private URL m39294a(String str) {
        try {
            URL url = new URL(str);
            url.openStream().close();
            return url;
        } catch (MalformedURLException e) {
            if (!this.f556n) {
                mo39293a("URL [" + str + "] is not well formed.", (Exception) e);
            }
            return null;
        } catch (IOException e2) {
            if (!this.f556n) {
                mo39293a("URL [" + str + "] cannot be opened.", (Exception) e2);
            }
            return null;
        }
    }

    /* renamed from: a */
    private boolean m39292a(Attributes attributes) {
        String value = attributes.getValue("file");
        String value2 = attributes.getValue("url");
        String value3 = attributes.getValue(f553c);
        int i = !C0724u.m38372e(value) ? 1 : 0;
        if (!C0724u.m38372e(value2)) {
            i++;
        }
        if (!C0724u.m38372e(value3)) {
            i++;
        }
        if (i == 0) {
            mo39293a(String.format("One of \"%1$s\", \"%2$s\" or \"%3$s\" attributes must be set.", "file", f553c, "url"), (Exception) null);
            return false;
        } else if (i > 1) {
            mo39293a(String.format("Only one of \"%1$s\", \"%2$s\" or \"%3$s\" attributes should be set.", "file", f553c, "url"), (Exception) null);
            return false;
        } else if (i != 1) {
            throw new IllegalStateException("Count value [" + i + "] is not expected");
        } else {
            return true;
        }
    }

    /* renamed from: b */
    private URL m39290b(String str) {
        URL m38397a = C0720s.m38397a(str);
        if (m38397a == null) {
            if (this.f556n) {
                return null;
            }
            mo39293a("Could not find resource corresponding to [" + str + "]", (Exception) null);
            return null;
        }
        return m38397a;
    }

    /* renamed from: f */
    private URL m39288f(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            if (this.f556n) {
                return null;
            }
            mo39293a("File does not exist [" + str + "]", (Exception) new FileNotFoundException(str));
            return null;
        }
        try {
            return file.toURI().toURL();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public URL m39297a() {
        return this.f557o;
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        this.f555m = null;
        this.f556n = C0724u.m38377a(attributes.getValue(f554d), false);
        if (!m39292a(attributes)) {
            return;
        }
        try {
            URL m39296a = m39296a(c0479k, attributes);
            if (m39296a == null) {
                return;
            }
            mo39272a(c0479k, m39296a);
        } catch (C0481m e) {
            mo39293a("Error while parsing " + this.f555m, (Exception) e);
        }
    }

    /* renamed from: a */
    protected abstract void mo39272a(C0479k c0479k, URL url);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m39295a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    protected void mo39293a(String str, Exception exc) {
        a(str, (Throwable) exc);
    }

    /* renamed from: b */
    protected String m39291b() {
        return this.f555m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public boolean m39289c() {
        return this.f556n;
    }
}
