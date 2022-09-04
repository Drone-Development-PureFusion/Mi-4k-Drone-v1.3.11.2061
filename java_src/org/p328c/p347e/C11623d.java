package org.p328c.p347e;

import org.p328c.p337b.C11508c;
import org.p328c.p347e.AbstractC11624e;
import org.p328c.p347e.p348a.AbstractC11598a;
/* renamed from: org.c.e.d */
/* loaded from: classes2.dex */
class C11623d {
    C11623d() {
    }

    /* renamed from: a */
    public static AbstractC11598a m529a(Class<? extends AbstractC11624e> cls, C11626f c11626f) {
        return m530a(cls).mo525a(c11626f);
    }

    /* renamed from: a */
    public static AbstractC11598a m527a(String str, C11626f c11626f) {
        return m528a(str).mo525a(c11626f);
    }

    /* renamed from: a */
    public static AbstractC11598a m526a(AbstractC11630i abstractC11630i, String str) {
        C11622c mo327d = abstractC11630i.mo489a().mo327d();
        String[] split = str.contains("=") ? str.split("=", 2) : new String[]{str, ""};
        return m527a(split[0], new C11626f(mo327d, split[1]));
    }

    /* renamed from: a */
    static AbstractC11624e m530a(Class<? extends AbstractC11624e> cls) {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            throw new AbstractC11624e.C11625a(e);
        }
    }

    /* renamed from: a */
    static AbstractC11624e m528a(String str) {
        try {
            return m530a((Class<? extends AbstractC11624e>) C11508c.m897a(str).asSubclass(AbstractC11624e.class));
        } catch (Exception e) {
            throw new AbstractC11624e.C11625a(e);
        }
    }
}
