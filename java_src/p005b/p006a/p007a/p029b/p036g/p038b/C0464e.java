package p005b.p006a.p007a.p029b.p036g.p038b;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.sax2.Driver;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p036g.p040d.C0475g;
import p005b.p006a.p007a.p029b.p036g.p040d.C0481m;
import p005b.p006a.p007a.p029b.p055o.AbstractC0661e;
import p005b.p006a.p007a.p029b.p055o.C0663g;
import p005b.p006a.p007a.p029b.p056p.AbstractC0682g;
/* renamed from: b.a.a.b.g.b.e */
/* loaded from: classes.dex */
public class C0464e extends DefaultHandler implements AbstractC0661e {

    /* renamed from: a */
    C0475g f627a;

    /* renamed from: b */
    private final C0663g f628b;

    /* renamed from: c */
    private List<C0463d> f629c;

    /* renamed from: d */
    private Locator f630d;

    public C0464e() {
        this.f629c = new ArrayList();
        this.f627a = new C0475g();
        this.f628b = new C0663g(null, this);
    }

    public C0464e(AbstractC0427f abstractC0427f) {
        this.f629c = new ArrayList();
        this.f627a = new C0475g();
        this.f628b = new C0663g(abstractC0427f, this);
    }

    /* renamed from: a */
    private Driver m39247a() {
        try {
            Driver driver = new Driver();
            try {
                driver.setFeature("http://xml.org/sax/features/validation", false);
            } catch (SAXNotSupportedException e) {
            }
            driver.setFeature("http://xml.org/sax/features/namespaces", true);
            return driver;
        } catch (Exception e2) {
            mo38549a("Parser configuration error occurred", e2);
            throw new C0481m("Parser configuration error occurred", e2);
        }
    }

    /* renamed from: d */
    private void m39239d(String str, Throwable th) {
        mo38549a(str, th);
        throw new C0481m(str, th);
    }

    /* renamed from: a */
    String m39245a(String str, String str2) {
        return (str == null || str.length() < 1) ? str2 : str;
    }

    /* renamed from: a */
    public List<C0463d> mo39244a(InputSource inputSource) {
        Driver m39247a = m39247a();
        try {
            m39247a.setContentHandler(this);
            m39247a.setErrorHandler(this);
            m39247a.parse(inputSource);
            return this.f629c;
        } catch (EOFException e) {
            m39239d(e.getLocalizedMessage(), new SAXParseException(e.getLocalizedMessage(), this.f630d, e));
            throw new IllegalStateException("This point can never be reached");
        } catch (IOException e2) {
            m39239d("I/O error occurred while parsing xml file", e2);
            throw new IllegalStateException("This point can never be reached");
        } catch (SAXException e3) {
            throw new C0481m("Problem parsing XML document. See previously reported errors.", e3);
        } catch (Exception e4) {
            m39239d("Unexpected exception while parsing XML document.", e4);
            throw new IllegalStateException("This point can never be reached");
        }
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: a */
    public void mo38551a(AbstractC0427f abstractC0427f) {
        this.f628b.mo38551a(abstractC0427f);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: a */
    public void mo38550a(AbstractC0682g abstractC0682g) {
        this.f628b.mo38550a(abstractC0682g);
    }

    /* renamed from: a */
    public final void m39246a(InputStream inputStream) {
        mo39244a(new InputSource(inputStream));
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: a */
    public void mo38549a(String str, Throwable th) {
        this.f628b.mo38549a(str, th);
    }

    /* renamed from: b */
    public Locator m39243b() {
        return this.f630d;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: b */
    public void mo38547b(String str, Throwable th) {
        this.f628b.mo38547b(str, th);
    }

    /* renamed from: b */
    boolean m39242b(String str) {
        return str.trim().length() == 0;
    }

    /* renamed from: c */
    C0463d m39241c() {
        if (this.f629c.isEmpty()) {
            return null;
        }
        return this.f629c.get(this.f629c.size() - 1);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: c */
    public void mo38546c(String str) {
        this.f628b.mo38546c(str);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: c */
    public void mo38545c(String str, Throwable th) {
        this.f628b.mo38545c(str, th);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: c_ */
    public AbstractC0427f mo38544c_() {
        return this.f628b.mo38544c_();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        String str = new String(cArr, i, i2);
        C0463d m39241c = m39241c();
        if (m39241c instanceof C0460a) {
            ((C0460a) m39241c).m39253a(str);
        } else if (m39242b(str)) {
        } else {
            this.f629c.add(new C0460a(str, m39243b()));
        }
    }

    /* renamed from: d */
    public List<C0463d> m39240d() {
        return this.f629c;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: d */
    public void mo38543d(String str) {
        this.f628b.mo38543d(str);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0661e
    /* renamed from: e */
    public void mo38542e(String str) {
        this.f628b.mo38542e(str);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        if (str3 == null || str3.length() == 0) {
        }
        this.f629c.add(new C0461b(str, str2, str3, m39243b()));
        this.f627a.m39217c();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) {
        mo38549a("XML_PARSING - Parsing error on line " + sAXParseException.getLineNumber() + " and column " + sAXParseException.getColumnNumber(), sAXParseException);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) {
        mo38549a("XML_PARSING - Parsing fatal error on line " + sAXParseException.getLineNumber() + " and column " + sAXParseException.getColumnNumber(), sAXParseException);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.f630d = locator;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (str3 == null || str3.length() == 0) {
        }
        this.f627a.m39220a(m39245a(str2, str3));
        this.f629c.add(new C0465f(this.f627a.m39222a(), str, str2, str3, attributes, m39243b()));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) {
        mo38545c("XML_PARSING - Parsing warning on line " + sAXParseException.getLineNumber() + " and column " + sAXParseException.getColumnNumber(), sAXParseException);
    }
}
