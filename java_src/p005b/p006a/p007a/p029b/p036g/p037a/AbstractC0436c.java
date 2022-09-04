package p005b.p006a.p007a.p029b.p036g.p037a;

import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import p005b.p006a.p007a.p029b.p036g.p040d.C0479k;
import p005b.p006a.p007a.p029b.p055o.C0662f;
/* renamed from: b.a.a.b.g.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC0436c extends C0662f {

    /* renamed from: e */
    public static final String f558e = "name";

    /* renamed from: f */
    public static final String f559f = "key";

    /* renamed from: g */
    public static final String f560g = "value";

    /* renamed from: h */
    public static final String f561h = "file";

    /* renamed from: i */
    public static final String f562i = "class";

    /* renamed from: j */
    public static final String f563j = "pattern";

    /* renamed from: k */
    public static final String f564k = "scope";

    /* renamed from: l */
    public static final String f565l = "actionClass";

    /* renamed from: a */
    public abstract void mo39259a(C0479k c0479k, String str);

    /* renamed from: a */
    public abstract void mo39258a(C0479k c0479k, String str, Attributes attributes);

    /* renamed from: b */
    protected int m39287b(C0479k c0479k) {
        Locator m39166e = c0479k.m39192c().m39166e();
        if (m39166e != null) {
            return m39166e.getColumnNumber();
        }
        return -1;
    }

    /* renamed from: b */
    public void mo39269b(C0479k c0479k, String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m39286c(C0479k c0479k) {
        Locator m39166e = c0479k.m39192c().m39166e();
        if (m39166e != null) {
            return m39166e.getLineNumber();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public String m39285d(C0479k c0479k) {
        return "line: " + m39286c(c0479k) + ", column: " + m39287b(c0479k);
    }

    public String toString() {
        return getClass().getName();
    }
}
