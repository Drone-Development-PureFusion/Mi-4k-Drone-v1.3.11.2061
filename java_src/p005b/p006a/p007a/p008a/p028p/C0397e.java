package p005b.p006a.p007a.p008a.p028p;

import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
/* renamed from: b.a.a.a.p.e */
/* loaded from: classes.dex */
public class C0397e {
    /* renamed from: a */
    public static int m39429a(AbstractC0366d abstractC0366d) {
        C0281d mo39538b = abstractC0366d.mo39538b();
        switch (mo39538b.f217v) {
            case 5000:
            case 10000:
                return 7;
            case 20000:
                return 6;
            case 30000:
                return 4;
            case C0281d.f197b /* 40000 */:
                return 3;
            default:
                throw new IllegalArgumentException("Level " + mo39538b + " is not a valid level for a printing method");
        }
    }
}
