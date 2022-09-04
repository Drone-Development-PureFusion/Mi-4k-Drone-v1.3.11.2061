package p282m.framework.p283a;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
/* renamed from: m.framework.a.b */
/* loaded from: classes2.dex */
public class C10942b extends AbstractC10943c {

    /* renamed from: a */
    private File f35319a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p282m.framework.p283a.AbstractC10943c
    /* renamed from: a */
    public InputStream mo2564a() {
        return new FileInputStream(this.f35319a);
    }

    /* renamed from: a */
    public void m2582a(File file) {
        this.f35319a = file;
    }

    /* renamed from: a */
    public void m2581a(String str) {
        this.f35319a = new File(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p282m.framework.p283a.AbstractC10943c
    /* renamed from: b */
    public long mo2562b() {
        return this.f35319a.length();
    }

    public String toString() {
        return this.f35319a.toString();
    }
}
