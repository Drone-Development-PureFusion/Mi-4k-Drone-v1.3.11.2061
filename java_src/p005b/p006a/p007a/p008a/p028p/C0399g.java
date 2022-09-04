package p005b.p006a.p007a.p008a.p028p;
/* renamed from: b.a.a.a.p.g */
/* loaded from: classes.dex */
public class C0399g {
    /* renamed from: a */
    public static int m39423a(String str) {
        return m39422a(str, 0);
    }

    /* renamed from: a */
    public static int m39422a(String str, int i) {
        int indexOf = str.indexOf(46, i);
        int indexOf2 = str.indexOf(36, i);
        if (indexOf == -1 && indexOf2 == -1) {
            return -1;
        }
        return indexOf == -1 ? indexOf2 : (indexOf2 == -1 || indexOf < indexOf2) ? indexOf : indexOf2;
    }
}
