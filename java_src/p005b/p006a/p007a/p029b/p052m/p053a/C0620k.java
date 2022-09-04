package p005b.p006a.p007a.p029b.p052m.p053a;

import p005b.p006a.p007a.p029b.p045i.AbstractC0584d;
/* renamed from: b.a.a.b.m.a.k */
/* loaded from: classes.dex */
public class C0620k extends AbstractC0584d implements AbstractC0621l {

    /* renamed from: a */
    public static final String f1083a = "i";

    /* renamed from: a */
    public String m38695a(int i) {
        return Integer.toString(i);
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0566b
    /* renamed from: a */
    public String mo38694a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Null argument forbidden");
        }
        if (!(obj instanceof Integer)) {
            throw new IllegalArgumentException("Cannot convert " + obj + " of type" + obj.getClass().getName());
        }
        return m38695a(((Integer) obj).intValue());
    }

    @Override // p005b.p006a.p007a.p029b.p052m.p053a.AbstractC0621l
    /* renamed from: b */
    public boolean mo38693b(Object obj) {
        return obj instanceof Integer;
    }
}
