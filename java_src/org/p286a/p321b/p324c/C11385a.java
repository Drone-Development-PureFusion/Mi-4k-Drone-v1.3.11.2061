package org.p286a.p321b.p324c;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* renamed from: org.a.b.c.a */
/* loaded from: classes2.dex */
public class C11385a extends AbstractC11388d {

    /* renamed from: a */
    protected InputStream f36497a;

    /* renamed from: b */
    protected OutputStream f36498b;

    protected C11385a() {
        this.f36497a = null;
        this.f36498b = null;
    }

    public C11385a(OutputStream outputStream) {
        this.f36497a = null;
        this.f36498b = null;
        this.f36498b = outputStream;
    }

    @Override // org.p286a.p321b.p324c.AbstractC11388d
    /* renamed from: a */
    public int mo1215a(byte[] bArr, int i, int i2) {
        if (this.f36497a == null) {
            throw new C11389e(1, "Cannot read from null inputStream");
        }
        try {
            int read = this.f36497a.read(bArr, i, i2);
            if (read >= 0) {
                return read;
            }
            throw new C11389e(4);
        } catch (IOException e) {
            throw new C11389e(0, e);
        }
    }

    @Override // org.p286a.p321b.p324c.AbstractC11388d
    /* renamed from: b */
    public void mo1213b(byte[] bArr, int i, int i2) {
        if (this.f36498b == null) {
            throw new C11389e(1, "Cannot write to null outputStream");
        }
        try {
            this.f36498b.write(bArr, i, i2);
        } catch (IOException e) {
            throw new C11389e(0, e);
        }
    }
}
