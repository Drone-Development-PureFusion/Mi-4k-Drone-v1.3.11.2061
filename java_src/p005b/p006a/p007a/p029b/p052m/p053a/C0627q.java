package p005b.p006a.p007a.p029b.p052m.p053a;

import java.io.File;
import java.util.Date;
/* renamed from: b.a.a.b.m.a.q */
/* loaded from: classes.dex */
public class C0627q extends AbstractC0613g {
    public C0627q(C0618i c0618i, C0624o c0624o) {
        super(c0618i, c0624o);
    }

    @Override // p005b.p006a.p007a.p029b.p052m.p053a.AbstractC0613g
    /* renamed from: a */
    protected void mo38678a(Date date, int i) {
        File file = new File(this.f1072d.m38705a((Object) this.f1073e.m38682a(date, i)));
        if (!file.exists() || !file.isFile()) {
            return;
        }
        file.delete();
        d("deleting " + file);
        if (!this.f1075g) {
            return;
        }
        a(file.getParentFile());
    }

    public String toString() {
        return "c.q.l.core.rolling.helper.TimeBasedArchiveRemover";
    }
}
