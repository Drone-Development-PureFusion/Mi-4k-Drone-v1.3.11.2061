package org.p286a.p287a.p298e;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.p286a.p287a.p288a.AbstractC11010d;
@AbstractC11010d
/* renamed from: org.a.a.e.d */
/* loaded from: classes2.dex */
public final class C11092d<I> implements AbstractC11089b<I> {

    /* renamed from: a */
    private final Map<String, I> f35752a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11092d(Map<String, I> map) {
        this.f35752a = new ConcurrentHashMap(map);
    }

    @Override // org.p286a.p287a.p298e.AbstractC11089b
    /* renamed from: a */
    public I mo2043a(String str) {
        if (str == null) {
            return null;
        }
        return this.f35752a.get(str.toLowerCase(Locale.US));
    }

    public String toString() {
        return this.f35752a.toString();
    }
}
