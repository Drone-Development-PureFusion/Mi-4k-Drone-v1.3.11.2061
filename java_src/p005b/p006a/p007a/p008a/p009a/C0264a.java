package p005b.p006a.p007a.p008a.p009a;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;
import org.xmlpull.v1.XmlPullParser;
import p005b.p006a.p007a.p029b.p036g.p038b.C0463d;
import p005b.p006a.p007a.p029b.p036g.p038b.C0464e;
import p005b.p006a.p007a.p029b.p036g.p040d.C0481m;
import p005b.p006a.p007a.p059c.p060a.p061a.p062a.p063a.resXmlResourceParserC0729a;
/* renamed from: b.a.a.a.a.a */
/* loaded from: classes.dex */
public class C0264a extends C0464e {

    /* renamed from: b */
    private int[] f133b = new int[2];

    /* renamed from: c */
    private C0265a f134c = new C0265a(new String[0]);

    /* renamed from: d */
    private String f135d = null;

    /* renamed from: e */
    private Map<String, String> f136e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.a.a.a.a.a$a */
    /* loaded from: classes.dex */
    public static class C0265a {

        /* renamed from: a */
        private final String[] f137a;

        /* renamed from: b */
        private int f138b = 0;

        public C0265a(String... strArr) {
            this.f137a = strArr == null ? new String[0] : strArr;
        }

        /* renamed from: a */
        public int m39852a() {
            return this.f137a.length;
        }

        /* renamed from: a */
        public boolean m39851a(String str) {
            if (this.f138b == this.f137a.length) {
                return true;
            }
            if (str.equals(this.f137a[this.f138b])) {
                this.f138b++;
            }
            return false;
        }

        /* renamed from: b */
        public int m39850b() {
            return this.f138b;
        }

        /* renamed from: b */
        public boolean m39849b(String str) {
            if (this.f138b <= 0 || !str.equals(this.f137a[this.f138b - 1])) {
                return this.f138b == this.f137a.length;
            }
            this.f138b--;
            return false;
        }

        /* renamed from: c */
        public void m39848c() {
            this.f138b = 0;
        }

        /* renamed from: d */
        public boolean m39847d() {
            return this.f138b == this.f137a.length;
        }
    }

    /* renamed from: a */
    private void m39858a(XmlPullParser xmlPullParser) {
        super.startDocument();
        super.setDocumentLocator(new LocatorImpl());
    }

    /* renamed from: b */
    private void m39856b(XmlPullParser xmlPullParser) {
        if (this.f134c.m39847d()) {
            super.characters(xmlPullParser.getTextCharacters(this.f133b), this.f133b[0], this.f133b[1]);
        }
    }

    /* renamed from: c */
    private void m39855c(XmlPullParser xmlPullParser) {
        String name = xmlPullParser.getName();
        if (this.f134c.m39849b(name)) {
            endElement(xmlPullParser.getNamespace(), name, name);
        }
    }

    /* renamed from: d */
    private void m39854d(XmlPullParser xmlPullParser) {
        String name = xmlPullParser.getName();
        if (this.f134c.m39851a(name)) {
            AttributesImpl attributesImpl = new AttributesImpl();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= xmlPullParser.getAttributeCount()) {
                    break;
                }
                attributesImpl.addAttribute(xmlPullParser.getAttributeNamespace(i2), xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeName(i2), xmlPullParser.getAttributeType(i2), xmlPullParser.getAttributeValue(i2));
                i = i2 + 1;
            }
            startElement(xmlPullParser.getNamespace(), name, name, attributesImpl);
        }
        m39853e(xmlPullParser);
    }

    /* renamed from: e */
    private void m39853e(XmlPullParser xmlPullParser) {
        String str;
        if (this.f135d == null || this.f136e != null || !xmlPullParser.getName().equals(this.f135d)) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeNamespace = xmlPullParser.getAttributeNamespace(i);
            if (attributeNamespace.length() > 0) {
                int lastIndexOf = attributeNamespace.lastIndexOf("/");
                if (lastIndexOf > -1 && lastIndexOf + 1 < attributeNamespace.length()) {
                    attributeNamespace = attributeNamespace.substring(lastIndexOf + 1);
                }
                str = attributeNamespace + ":";
            } else {
                str = "";
            }
            hashMap.put(str + xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
        }
        this.f136e = hashMap;
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p038b.C0464e
    /* renamed from: a */
    public List<C0463d> mo39244a(InputSource inputSource) {
        InputStream byteStream = inputSource.getByteStream();
        if (byteStream == null) {
            throw new IllegalArgumentException("Input source must specify an input stream");
        }
        try {
            XmlPullParser resxmlresourceparserc0729a = new resXmlResourceParserC0729a(byteStream);
            this.f136e = null;
            while (true) {
                int next = resxmlresourceparserc0729a.next();
                if (next <= -1) {
                    break;
                } else if (next == 0) {
                    this.f134c.m39848c();
                    m39858a(resxmlresourceparserc0729a);
                } else if (1 == next) {
                    this.f134c.m39848c();
                    endDocument();
                    break;
                } else if (2 == next) {
                    m39854d(resxmlresourceparserc0729a);
                } else if (3 == next) {
                    m39855c(resxmlresourceparserc0729a);
                } else if (4 == next) {
                    m39856b(resxmlresourceparserc0729a);
                }
            }
            return d();
        } catch (Exception e) {
            a(e.getMessage(), e);
            throw new C0481m("Can't parse Android XML resource", e);
        }
    }

    /* renamed from: a */
    public Map<String, String> m39860a() {
        return this.f136e;
    }

    /* renamed from: a */
    public void m39859a(String str) {
        this.f135d = str;
    }

    /* renamed from: a */
    public void m39857a(String... strArr) {
        this.f134c = new C0265a(strArr);
    }
}
