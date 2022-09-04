package org.p328c.p347e;

import java.util.Comparator;
import org.p328c.p337b.p338a.C11495a;
import org.p328c.p337b.p340c.C11509a;
import org.p328c.p337b.p340c.C11510b;
import org.p328c.p337b.p340c.C11511c;
import org.p328c.p337b.p341d.C11517b;
import org.p328c.p347e.p348a.AbstractC11598a;
import org.p328c.p350f.p351a.C11645e;
/* renamed from: org.c.e.i */
/* loaded from: classes2.dex */
public abstract class AbstractC11630i {
    /* renamed from: a */
    public static AbstractC11630i m499a(Class<?> cls) {
        return new C11509a(cls);
    }

    /* renamed from: a */
    public static AbstractC11630i m498a(Class<?> cls, String str) {
        return m499a(cls).m493a(C11622c.m549a(cls, str));
    }

    /* renamed from: a */
    public static AbstractC11630i m497a(Class<?> cls, Throwable th) {
        return m492a(new C11517b(cls, th));
    }

    /* renamed from: a */
    public static AbstractC11630i m494a(C11596a c11596a, Class<?>... clsArr) {
        try {
            return m492a(c11596a.mo585a(new C11495a(true), clsArr));
        } catch (C11645e e) {
            throw new RuntimeException("Bug in saff's brain: Suite constructor, called as above, should always complete");
        }
    }

    /* renamed from: a */
    public static AbstractC11630i m492a(final AbstractC11637l abstractC11637l) {
        return new AbstractC11630i() { // from class: org.c.e.i.1
            @Override // org.p328c.p347e.AbstractC11630i
            /* renamed from: a */
            public AbstractC11637l mo489a() {
                return AbstractC11637l.this;
            }
        };
    }

    /* renamed from: a */
    public static AbstractC11630i m491a(Class<?>... clsArr) {
        return m494a(C11629h.m503b(), clsArr);
    }

    /* renamed from: b */
    public static AbstractC11630i m490b(Class<?> cls) {
        return new C11509a(cls, false);
    }

    /* renamed from: a */
    public AbstractC11630i m496a(Comparator<C11622c> comparator) {
        return new C11511c(this, comparator);
    }

    /* renamed from: a */
    public AbstractC11630i m495a(AbstractC11598a abstractC11598a) {
        return new C11510b(this, abstractC11598a);
    }

    /* renamed from: a */
    public AbstractC11630i m493a(C11622c c11622c) {
        return m495a(AbstractC11598a.m583b(c11622c));
    }

    /* renamed from: a */
    public abstract AbstractC11637l mo489a();
}
