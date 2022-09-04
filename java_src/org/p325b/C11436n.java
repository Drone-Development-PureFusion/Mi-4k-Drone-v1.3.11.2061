package org.p325b;

import java.io.IOException;
/* renamed from: org.b.n */
/* loaded from: classes2.dex */
public class C11436n extends AbstractC11394a {

    /* renamed from: b */
    private final Appendable f36546b;

    public C11436n() {
        this(new StringBuilder());
    }

    public C11436n(Appendable appendable) {
        this.f36546b = appendable;
    }

    /* renamed from: b */
    public static String m1073b(AbstractC11435m abstractC11435m) {
        return new C11436n().a(abstractC11435m).toString();
    }

    /* renamed from: c */
    public static String m1072c(AbstractC11435m abstractC11435m) {
        return m1073b(abstractC11435m);
    }

    @Override // org.p325b.AbstractC11394a
    /* renamed from: a */
    protected void mo1075a(char c) {
        try {
            this.f36546b.append(c);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    @Override // org.p325b.AbstractC11394a
    /* renamed from: b */
    protected void mo1074b(String str) {
        try {
            this.f36546b.append(str);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    public String toString() {
        return this.f36546b.toString();
    }
}
