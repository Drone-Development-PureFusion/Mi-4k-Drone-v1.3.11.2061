package p005b.p006a.p007a.p029b.p058r;

import java.util.ArrayList;
import java.util.List;
/* renamed from: b.a.a.b.r.h */
/* loaded from: classes.dex */
public class C0709h {

    /* renamed from: a */
    final String f1282a;

    /* renamed from: b */
    final int f1283b;

    /* renamed from: c */
    final C0705d f1284c = new C0705d();

    public C0709h(String str) {
        this.f1282a = str;
        this.f1283b = str.length();
    }

    /* renamed from: b */
    private List<C0704c> m38427b() {
        ArrayList arrayList = new ArrayList();
        C0704c c0704c = null;
        for (int i = 0; i < this.f1283b; i++) {
            char charAt = this.f1282a.charAt(i);
            if (c0704c == null || c0704c.f1280a != charAt) {
                c0704c = new C0704c(charAt);
                arrayList.add(c0704c);
            } else {
                c0704c.m38438a();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public String m38428a() {
        List<C0704c> m38427b = m38427b();
        StringBuilder sb = new StringBuilder();
        for (C0704c c0704c : m38427b) {
            sb.append(this.f1284c.m38436a(c0704c));
        }
        return sb.toString();
    }
}
