package p005b.p006a.p007a.p029b.p054n;

import java.util.List;
import java.util.Map;
import p005b.p006a.p007a.p029b.AbstractC0401a;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p036g.p038b.C0463d;
/* renamed from: b.a.a.b.n.a */
/* loaded from: classes.dex */
public abstract class AbstractC0643a<E> implements AbstractC0645c<E> {

    /* renamed from: a */
    final List<C0463d> f1155a;

    /* renamed from: b */
    protected String f1156b;

    /* renamed from: c */
    protected Map<String, String> f1157c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0643a(List<C0463d> list, String str, Map<String, String> map) {
        this.f1155a = m38620a(list);
        this.f1156b = str;
        this.f1157c = map;
    }

    @Override // p005b.p006a.p007a.p029b.p054n.AbstractC0645c
    /* renamed from: a */
    public AbstractC0401a<E> mo38619a(AbstractC0427f abstractC0427f, String str) {
        AbstractC0650h<E> mo38621a = mo38621a(str);
        mo38621a.a(abstractC0427f);
        mo38621a.mo38598a(this.f1155a);
        return mo38621a.mo38596c();
    }

    /* renamed from: a */
    public abstract AbstractC0650h<E> mo38621a(String str);

    /* renamed from: a */
    public List<C0463d> m38622a() {
        return this.f1155a;
    }

    /* renamed from: a */
    List<C0463d> m38620a(List<C0463d> list) {
        return list.subList(1, list.size() - 1);
    }
}
