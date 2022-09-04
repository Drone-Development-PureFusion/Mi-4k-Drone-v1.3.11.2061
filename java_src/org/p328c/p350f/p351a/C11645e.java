package org.p328c.p350f.p351a;

import java.util.Arrays;
import java.util.List;
/* renamed from: org.c.f.a.e */
/* loaded from: classes.dex */
public class C11645e extends Exception {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final List<Throwable> f36789a;

    public C11645e(String str) {
        this(new Exception(str));
    }

    public C11645e(Throwable th) {
        this(Arrays.asList(th));
    }

    public C11645e(List<Throwable> list) {
        this.f36789a = list;
    }

    /* renamed from: a */
    public List<Throwable> m440a() {
        return this.f36789a;
    }
}
