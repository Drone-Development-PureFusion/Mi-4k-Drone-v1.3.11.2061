package org.p328c.p346d;

import java.lang.management.ManagementFactory;
import java.util.List;
import org.p328c.p347e.C11622c;
import org.p328c.p350f.p351a.AbstractC11650j;
/* renamed from: org.c.d.a */
/* loaded from: classes2.dex */
public class C11568a implements AbstractC11585l {

    /* renamed from: a */
    private final AbstractC11585l f36686a;

    /* renamed from: b */
    private final boolean f36687b;

    public C11568a(AbstractC11585l abstractC11585l) {
        this(abstractC11585l, ManagementFactory.getRuntimeMXBean().getInputArguments());
    }

    C11568a(AbstractC11585l abstractC11585l, List<String> list) {
        this.f36686a = abstractC11585l;
        this.f36687b = m680a(list);
    }

    /* renamed from: a */
    private static boolean m680a(List<String> list) {
        for (String str : list) {
            if ("-Xdebug".equals(str)) {
                return true;
            }
            if (str.startsWith("-agentlib:jdwp")) {
                return true;
            }
        }
        return false;
    }

    @Override // org.p328c.p346d.AbstractC11585l
    /* renamed from: a */
    public AbstractC11650j mo587a(AbstractC11650j abstractC11650j, C11622c c11622c) {
        return this.f36687b ? abstractC11650j : this.f36686a.mo587a(abstractC11650j, c11622c);
    }

    /* renamed from: a */
    public boolean m681a() {
        return this.f36687b;
    }
}
