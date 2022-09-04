package p005b.p006a.p007a.p029b.p036g.p040d;

import org.xml.sax.Locator;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p055o.C0663g;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.a.a.b.g.d.b */
/* loaded from: classes.dex */
public class C0468b extends C0663g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0468b(AbstractC0427f abstractC0427f, C0480l c0480l) {
        super(abstractC0427f, c0480l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p055o.C0663g
    /* renamed from: a */
    public Object mo38552a() {
        Locator locator = ((C0480l) super.mo38552a()).f656a;
        return locator != null ? C0480l.class.getName() + "@" + locator.getLineNumber() + ":" + locator.getColumnNumber() : C0480l.class.getName() + "@NA:NA";
    }
}
