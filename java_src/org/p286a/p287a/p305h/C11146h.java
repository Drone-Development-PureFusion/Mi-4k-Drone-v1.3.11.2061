package org.p286a.p287a.p305h;

import com.fimi.soul.media.player.FimiMediaMeta;
import java.io.InputStream;
import java.io.OutputStream;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.h.h */
/* loaded from: classes2.dex */
public class C11146h extends AbstractC11139a {

    /* renamed from: e */
    private final InputStream f35848e;

    /* renamed from: f */
    private final long f35849f;

    public C11146h(InputStream inputStream) {
        this(inputStream, -1L);
    }

    public C11146h(InputStream inputStream, long j) {
        this(inputStream, j, null);
    }

    public C11146h(InputStream inputStream, long j, C11143e c11143e) {
        this.f35848e = (InputStream) C11354a.m1321a(inputStream, "Source input stream");
        this.f35849f = j;
        if (c11143e != null) {
            a(c11143e.toString());
        }
    }

    public C11146h(InputStream inputStream, C11143e c11143e) {
        this(inputStream, -1L, c11143e);
    }

    public InputStream getContent() {
        return this.f35848e;
    }

    public long getContentLength() {
        return this.f35849f;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return true;
    }

    public void writeTo(OutputStream outputStream) {
        int read;
        C11354a.m1321a(outputStream, "Output stream");
        InputStream inputStream = this.f35848e;
        try {
            byte[] bArr = new byte[4096];
            if (this.f35849f < 0) {
                while (true) {
                    int read2 = inputStream.read(bArr);
                    if (read2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read2);
                }
            } else {
                long j = this.f35849f;
                while (j > 0 && (read = inputStream.read(bArr, 0, (int) Math.min((long) FimiMediaMeta.AV_CH_TOP_FRONT_LEFT, j))) != -1) {
                    outputStream.write(bArr, 0, read);
                    j -= read;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}
