package org.p286a.p287a.p306i.p312f;

import java.io.InterruptedIOException;
import org.p286a.p287a.p288a.AbstractC11008b;
@AbstractC11008b
/* renamed from: org.a.a.i.f.i */
/* loaded from: classes2.dex */
public class C11288i extends InterruptedIOException {
    private static final long serialVersionUID = 4973849966012490112L;

    public C11288i(String str) {
        super(str);
    }

    public C11288i(String str, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
    }
}
