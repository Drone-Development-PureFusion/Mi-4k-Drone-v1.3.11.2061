package org.p328c.p337b.p341d;

import java.util.Arrays;
import java.util.List;
@Deprecated
/* renamed from: org.c.b.d.d */
/* loaded from: classes.dex */
public class C11541d extends Exception {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final List<Throwable> f36660a;

    public C11541d(String str) {
        this(new Exception(str));
    }

    public C11541d(List<Throwable> list) {
        this.f36660a = list;
    }

    public C11541d(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    /* renamed from: a */
    public List<Throwable> m843a() {
        return this.f36660a;
    }
}
