package com.p120c.p121a.p129b.p130a;

import java.io.FilterInputStream;
import java.io.InputStream;
/* renamed from: com.c.a.b.a.c */
/* loaded from: classes.dex */
public class C1298c extends FilterInputStream {
    public C1298c(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long j2 = 0;
        while (j2 < j) {
            long skip = this.in.skip(j - j2);
            if (skip == 0) {
                if (read() < 0) {
                    break;
                }
                skip = 1;
            }
            j2 = skip + j2;
        }
        return j2;
    }
}
