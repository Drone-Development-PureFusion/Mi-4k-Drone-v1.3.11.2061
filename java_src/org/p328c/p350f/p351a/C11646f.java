package org.p328c.p350f.p351a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.p328c.p337b.C11564k;
import org.p328c.p337b.p341d.p342a.C11515b;
/* renamed from: org.c.f.a.f */
/* loaded from: classes2.dex */
public class C11646f extends Exception {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final List<Throwable> f36790a;

    public C11646f(List<Throwable> list) {
        this.f36790a = new ArrayList(list);
    }

    /* renamed from: a */
    public static void m438a(List<Throwable> list) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new C11515b(list);
        }
        throw C11564k.m768a(list.get(0));
    }

    /* renamed from: a */
    public List<Throwable> m439a() {
        return Collections.unmodifiableList(this.f36790a);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(String.format("There were %d errors:", Integer.valueOf(this.f36790a.size())));
        for (Throwable th : this.f36790a) {
            sb.append(String.format("\n  %s(%s)", th.getClass().getName(), th.getMessage()));
        }
        return sb.toString();
    }
}
