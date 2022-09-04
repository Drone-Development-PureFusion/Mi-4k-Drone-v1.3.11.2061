package p282m.framework.p283a;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
/* renamed from: m.framework.a.j */
/* loaded from: classes2.dex */
public class C10951j extends AbstractC10943c {

    /* renamed from: a */
    private StringBuilder f35329a = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p282m.framework.p283a.AbstractC10943c
    /* renamed from: a */
    public InputStream mo2564a() {
        return new ByteArrayInputStream(this.f35329a.toString().getBytes("utf-8"));
    }

    /* renamed from: a */
    public C10951j m2563a(String str) {
        this.f35329a.append(str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p282m.framework.p283a.AbstractC10943c
    /* renamed from: b */
    public long mo2562b() {
        return this.f35329a.toString().getBytes("utf-8").length;
    }

    public String toString() {
        return this.f35329a.toString();
    }
}
