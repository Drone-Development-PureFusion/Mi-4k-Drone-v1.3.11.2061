package p005b.p006a.p007a.p008a.p020j;

import java.io.Serializable;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p008a.p026n.C0374l;
import p005b.p006a.p007a.p008a.p026n.C0375m;
import p005b.p006a.p007a.p029b.p055o.AbstractC0671o;
/* renamed from: b.a.a.a.j.a */
/* loaded from: classes.dex */
public class C0306a implements AbstractC0671o<AbstractC0366d> {
    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0671o
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public Serializable mo38530a(AbstractC0366d abstractC0366d) {
        if (abstractC0366d == null) {
            return null;
        }
        if (abstractC0366d instanceof C0374l) {
            return C0375m.m39539a(abstractC0366d);
        }
        if (!(abstractC0366d instanceof C0375m)) {
            throw new IllegalArgumentException("Unsupported type " + abstractC0366d.getClass().getName());
        }
        return (C0375m) abstractC0366d;
    }
}
