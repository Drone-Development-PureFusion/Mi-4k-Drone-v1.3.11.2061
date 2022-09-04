package org.p325b.p326a;

import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11438p;
/* renamed from: org.b.a.r */
/* loaded from: classes2.dex */
public abstract class AbstractC11414r extends AbstractC11438p<String> {

    /* renamed from: a */
    protected final String f36528a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11414r(String str) {
        this.f36528a = str;
    }

    @Override // org.p325b.AbstractC11438p
    /* renamed from: a */
    public void mo902b(String str, AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a("was \"").mo1086a(str).mo1086a("\"");
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        abstractC11428g.mo1086a("a string ").mo1086a(mo1142b()).mo1086a(" ").mo1087a((Object) this.f36528a);
    }

    /* renamed from: a */
    protected abstract boolean mo1144a(String str);

    /* renamed from: b */
    protected abstract String mo1142b();

    @Override // org.p325b.AbstractC11438p
    /* renamed from: c */
    public boolean mo903b(String str) {
        return mo1144a(str);
    }
}
