package p005b.p006a.p007a.p029b.p052m.p053a;

import java.io.File;
import java.util.Date;
/* renamed from: b.a.a.b.m.a.p */
/* loaded from: classes.dex */
public class C0626p extends AbstractC0613g {
    public C0626p(C0618i c0618i, C0624o c0624o) {
        super(c0618i, c0624o);
    }

    @Override // p005b.p006a.p007a.p029b.p052m.p053a.AbstractC0613g
    /* renamed from: a */
    public void mo38678a(Date date, int i) {
        Date m38682a = this.f1073e.m38682a(date, i);
        String m38715a = C0614h.m38715a(this.f1072d.m38703a(m38682a));
        File parentFile = new File(this.f1072d.m38702a(m38682a, 0)).getAbsoluteFile().getAbsoluteFile().getParentFile();
        for (File file : C0614h.m38716a(parentFile, m38715a)) {
            file.delete();
        }
        if (this.f1075g) {
            a(parentFile);
        }
    }
}
