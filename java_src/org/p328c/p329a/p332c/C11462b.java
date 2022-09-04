package org.p328c.p329a.p332c;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import org.p328c.p337b.C11563j;
import org.p328c.p347e.AbstractC11630i;
import org.p328c.p347e.C11629h;
import org.p328c.p347e.C11632j;
import org.p328c.p347e.p349b.C11608a;
/* renamed from: org.c.a.c.b */
/* loaded from: classes2.dex */
public class C11462b {

    /* renamed from: a */
    private C11632j f36572a;

    public C11462b(List<C11608a> list) {
        this(new C11461a(list).m1007a());
    }

    private C11462b(C11632j c11632j) {
        this.f36572a = c11632j;
    }

    /* renamed from: a */
    public static C11462b m1005a(Class<?> cls) {
        return m1004a(AbstractC11630i.m499a(cls));
    }

    /* renamed from: a */
    public static C11462b m1004a(AbstractC11630i abstractC11630i) {
        return new C11462b(new C11629h().m507a(abstractC11630i));
    }

    /* renamed from: a */
    public int m1006a() {
        return this.f36572a.m482d().size();
    }

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new C11563j(new PrintStream(byteArrayOutputStream)).mo474a(this.f36572a);
        return byteArrayOutputStream.toString();
    }
}
