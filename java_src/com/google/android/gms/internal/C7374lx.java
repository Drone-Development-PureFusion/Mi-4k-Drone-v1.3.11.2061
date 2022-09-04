package com.google.android.gms.internal;

import com.google.android.gms.internal.C7358lq;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.google.android.gms.internal.lx */
/* loaded from: classes2.dex */
class C7374lx {

    /* renamed from: b */
    private C7365ls f24588b;

    /* renamed from: e */
    private C7358lq.AbstractC7360b f24591e;

    /* renamed from: a */
    private DataInputStream f24587a = null;

    /* renamed from: c */
    private AbstractC7370lt f24589c = null;

    /* renamed from: d */
    private byte[] f24590d = new byte[112];

    /* renamed from: f */
    private volatile boolean f24592f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7374lx(C7365ls c7365ls) {
        this.f24588b = null;
        this.f24588b = c7365ls;
    }

    /* renamed from: a */
    private int m14654a(byte[] bArr, int i, int i2) {
        this.f24587a.readFully(bArr, i, i2);
        return i2;
    }

    /* renamed from: a */
    private long m14655a(byte[] bArr, int i) {
        return (bArr[i + 0] << 56) + ((bArr[i + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 48) + ((bArr[i + 2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 40) + ((bArr[i + 3] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 32) + ((bArr[i + 4] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 24) + ((bArr[i + 5] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) + ((bArr[i + 6] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) + ((bArr[i + 7] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 0);
    }

    /* renamed from: a */
    private void m14659a(C7371lu c7371lu) {
        m14653b();
        this.f24588b.m14687a(c7371lu);
    }

    /* renamed from: a */
    private void m14657a(boolean z, byte b, byte[] bArr) {
        if (b == 9) {
            if (!z) {
                throw new C7371lu("PING must not fragment across frames");
            }
            m14656a(bArr);
        } else if (this.f24591e != null && b != 0) {
            throw new C7371lu("Failed to continue outstanding frame");
        } else {
            if (this.f24591e == null && b == 0) {
                throw new C7371lu("Received continuing frame, but there's nothing to continue");
            }
            if (this.f24591e == null) {
                this.f24591e = C7358lq.m14697a(b);
            }
            if (!this.f24591e.mo14695a(bArr)) {
                throw new C7371lu("Failed to decode frame");
            }
            if (!z) {
                return;
            }
            C7373lw mo14696a = this.f24591e.mo14696a();
            this.f24591e = null;
            if (mo14696a == null) {
                throw new C7371lu("Failed to decode whole message");
            }
            this.f24589c.mo14670a(mo14696a);
        }
    }

    /* renamed from: a */
    private void m14656a(byte[] bArr) {
        if (bArr.length <= 125) {
            this.f24588b.m14684a(bArr);
            return;
        }
        throw new C7371lu("PING frame too long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14660a() {
        int m14654a;
        boolean z;
        this.f24589c = this.f24588b.m14682c();
        while (!this.f24592f) {
            try {
                m14654a = m14654a(this.f24590d, 0, 1) + 0;
                z = (this.f24590d[0] & 128) != 0;
            } catch (C7371lu e) {
                m14659a(e);
            } catch (SocketTimeoutException e2) {
            } catch (IOException e3) {
                m14659a(new C7371lu("IO Error", e3));
            }
            if ((this.f24590d[0] & 112) != 0) {
                throw new C7371lu("Invalid frame received");
            }
            byte b = (byte) (this.f24590d[0] & 15);
            int m14654a2 = m14654a + m14654a(this.f24590d, m14654a, 1);
            byte b2 = this.f24590d[1];
            long j = 0;
            if (b2 < 126) {
                j = b2;
            } else if (b2 == 126) {
                int m14654a3 = m14654a(this.f24590d, m14654a2, 2) + m14654a2;
                j = ((this.f24590d[2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (this.f24590d[3] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
            } else if (b2 == Byte.MAX_VALUE) {
                j = m14655a(this.f24590d, (m14654a(this.f24590d, m14654a2, 8) + m14654a2) - 8);
            }
            byte[] bArr = new byte[(int) j];
            m14654a(bArr, 0, (int) j);
            if (b == 8) {
                this.f24588b.m14679f();
            } else if (b == 10) {
                continue;
            } else if (b != 1 && b != 2 && b != 9 && b != 0) {
                throw new C7371lu(new StringBuilder(24).append("Unsupported opcode: ").append((int) b).toString());
            } else {
                m14657a(z, b, bArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m14658a(DataInputStream dataInputStream) {
        this.f24587a = dataInputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m14653b() {
        this.f24592f = true;
    }
}
