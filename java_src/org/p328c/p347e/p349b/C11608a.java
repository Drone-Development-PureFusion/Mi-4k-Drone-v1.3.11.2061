package org.p328c.p347e.p349b;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import org.p328c.p347e.C11622c;
/* renamed from: org.c.e.b.a */
/* loaded from: classes2.dex */
public class C11608a implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final C11622c f36735a;

    /* renamed from: b */
    private final Throwable f36736b;

    public C11608a(C11622c c11622c, Throwable th) {
        this.f36736b = th;
        this.f36735a = c11622c;
    }

    /* renamed from: a */
    public String m575a() {
        return this.f36735a.m552a();
    }

    /* renamed from: b */
    public C11622c m574b() {
        return this.f36735a;
    }

    /* renamed from: c */
    public Throwable m573c() {
        return this.f36736b;
    }

    /* renamed from: d */
    public String m572d() {
        StringWriter stringWriter = new StringWriter();
        m573c().printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: e */
    public String m571e() {
        return m573c().getMessage();
    }

    public String toString() {
        return m575a() + ": " + this.f36736b.getMessage();
    }
}
