package p282m.framework.p283a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import p282m.framework.p284b.C10952a;
/* renamed from: m.framework.a.a */
/* loaded from: classes2.dex */
public class C10941a extends AbstractC10943c {

    /* renamed from: a */
    private byte[] f35318a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p282m.framework.p283a.AbstractC10943c
    /* renamed from: a */
    public InputStream mo2564a() {
        return (this.f35318a == null || this.f35318a.length <= 0) ? new ByteArrayInputStream(new byte[0]) : new ByteArrayInputStream(this.f35318a);
    }

    /* renamed from: a */
    public C10941a m2583a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.f35318a != null && this.f35318a.length > 0) {
            byteArrayOutputStream.write(this.f35318a);
        }
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.flush();
        this.f35318a = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p282m.framework.p283a.AbstractC10943c
    /* renamed from: b */
    public long mo2562b() {
        return this.f35318a == null ? 0 : this.f35318a.length;
    }

    public String toString() {
        return C10952a.m2556a(this.f35318a);
    }
}
