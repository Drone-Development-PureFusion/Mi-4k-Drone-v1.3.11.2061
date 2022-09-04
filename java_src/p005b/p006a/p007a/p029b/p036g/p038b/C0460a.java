package p005b.p006a.p007a.p029b.p036g.p038b;

import com.xiaomi.mipush.sdk.Constants;
import org.xml.sax.Locator;
/* renamed from: b.a.a.b.g.b.a */
/* loaded from: classes.dex */
public class C0460a extends C0463d {

    /* renamed from: e */
    private String f622e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0460a(String str, Locator locator) {
        super(null, null, null, locator);
        this.f622e = str;
    }

    /* renamed from: a */
    public String m39254a() {
        return this.f622e != null ? this.f622e.trim() : this.f622e;
    }

    /* renamed from: a */
    public void m39253a(String str) {
        this.f622e += str;
    }

    public String toString() {
        return "BodyEvent(" + m39254a() + ")" + this.f626d.getLineNumber() + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f626d.getColumnNumber();
    }
}
