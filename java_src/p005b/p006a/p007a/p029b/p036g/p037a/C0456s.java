package p005b.p006a.p007a.p029b.p036g.p037a;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.xml.sax.Attributes;
import p005b.p006a.p007a.p029b.p036g.p037a.C0438e;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p045i.p048c.C0582d;
import p005b.p006a.p007a.p029b.p058r.C0720s;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.g.a.s */
/* loaded from: classes.dex */
public class C0456s extends AbstractC0436c {

    /* renamed from: a */
    static final String f614a = "resource";

    /* renamed from: b */
    static String f615b = "In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.";

    /* renamed from: a */
    public void m39265a(C0479k c0479k) {
    }

    /* renamed from: a */
    void m39264a(C0479k c0479k, InputStream inputStream, C0438e.EnumC0440a enumC0440a) {
        Properties properties = new Properties();
        properties.load(inputStream);
        inputStream.close();
        C0438e.m39283a(c0479k, properties, enumC0440a);
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39259a(C0479k c0479k, String str) {
    }

    @Override // p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0436c
    /* renamed from: a */
    public void mo39258a(C0479k c0479k, String str, Attributes attributes) {
        if ("substitutionProperty".equals(str)) {
            e("[substitutionProperty] element has been deprecated. Please use the [property] element instead.");
        }
        String value = attributes.getValue("name");
        String value2 = attributes.getValue("value");
        C0438e.EnumC0440a m39282a = C0438e.m39282a(attributes.getValue("scope"));
        if (m39263a(attributes)) {
            String m39188f = c0479k.m39188f(attributes.getValue("file"));
            try {
                m39264a(c0479k, new FileInputStream(m39188f), m39282a);
            } catch (FileNotFoundException e) {
                c("Could not find properties file [" + m39188f + "].");
            } catch (IOException e2) {
                a("Could not read properties file [" + m39188f + "].", e2);
            }
        } else if (!m39262b(attributes)) {
            if (m39261c(attributes)) {
                C0438e.m39284a(c0479k, value, c0479k.m39188f(C0582d.m38813b(value2).trim()), m39282a);
            } else {
                c(f615b);
            }
        } else {
            String m39188f2 = c0479k.m39188f(attributes.getValue(f614a));
            URL m38397a = C0720s.m38397a(m39188f2);
            if (m38397a == null) {
                c("Could not find resource [" + m39188f2 + "].");
                return;
            }
            try {
                m39264a(c0479k, m38397a.openStream(), m39282a);
            } catch (IOException e3) {
                a("Could not read resource file [" + m39188f2 + "].", e3);
            }
        }
    }

    /* renamed from: a */
    boolean m39263a(Attributes attributes) {
        return !C0724u.m38372e(attributes.getValue("file")) && C0724u.m38372e(attributes.getValue("name")) && C0724u.m38372e(attributes.getValue("value")) && C0724u.m38372e(attributes.getValue(f614a));
    }

    /* renamed from: b */
    boolean m39262b(Attributes attributes) {
        return !C0724u.m38372e(attributes.getValue(f614a)) && C0724u.m38372e(attributes.getValue("name")) && C0724u.m38372e(attributes.getValue("value")) && C0724u.m38372e(attributes.getValue("file"));
    }

    /* renamed from: c */
    boolean m39261c(Attributes attributes) {
        return !C0724u.m38372e(attributes.getValue("name")) && !C0724u.m38372e(attributes.getValue("value")) && C0724u.m38372e(attributes.getValue("file")) && C0724u.m38372e(attributes.getValue(f614a));
    }
}
