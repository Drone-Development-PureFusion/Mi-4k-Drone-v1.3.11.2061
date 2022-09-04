package p005b.p006a.p007a.p029b.p036g.p038b;

import com.xiaomi.mipush.sdk.Constants;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.AttributesImpl;
import p005b.p006a.p007a.p029b.p036g.p040d.C0475g;
/* renamed from: b.a.a.b.g.b.f */
/* loaded from: classes.dex */
public class C0465f extends C0463d {

    /* renamed from: e */
    public final Attributes f631e;

    /* renamed from: f */
    public final C0475g f632f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0465f(C0475g c0475g, String str, String str2, String str3, Attributes attributes, Locator locator) {
        super(str, str2, str3, locator);
        this.f631e = new AttributesImpl(attributes);
        this.f632f = c0475g;
    }

    /* renamed from: a */
    public Attributes m39238a() {
        return this.f631e;
    }

    public String toString() {
        return "StartEvent(" + e() + ")  [" + this.f626d.getLineNumber() + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f626d.getColumnNumber() + "]";
    }
}
