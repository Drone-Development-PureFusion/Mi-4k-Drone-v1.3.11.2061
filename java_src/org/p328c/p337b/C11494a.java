package org.p328c.p337b;

import java.util.ArrayList;
import java.util.List;
/* renamed from: org.c.b.a */
/* loaded from: classes2.dex */
public class C11494a extends AssertionError {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final List<Integer> f36599a = new ArrayList();

    /* renamed from: b */
    private final String f36600b;

    public C11494a(String str, AssertionError assertionError, int i) {
        this.f36600b = str;
        initCause(assertionError);
        m925a(i);
    }

    /* renamed from: a */
    public void m925a(int i) {
        this.f36599a.add(0, Integer.valueOf(i));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        if (this.f36600b != null) {
            sb.append(this.f36600b);
        }
        sb.append("arrays first differed at element ");
        for (Integer num : this.f36599a) {
            int intValue = num.intValue();
            sb.append("[");
            sb.append(intValue);
            sb.append("]");
        }
        sb.append("; ");
        sb.append(getCause().getMessage());
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }
}
