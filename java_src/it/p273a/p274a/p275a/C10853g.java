package it.p273a.p274a.p275a;

import it.p273a.p274a.AbstractC10869h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
/* renamed from: it.a.a.a.g */
/* loaded from: classes2.dex */
public class C10853g extends AbstractC10869h {

    /* renamed from: d */
    private String f34751d;

    /* renamed from: e */
    private int f34752e;

    /* renamed from: f */
    private String f34753f;

    public C10853g(String str, int i) {
        this(str, i, null);
    }

    public C10853g(String str, int i, String str2) {
        this.f34751d = str;
        this.f34752e = i;
        this.f34753f = str2;
    }

    /* renamed from: a */
    private int m3128a(InputStream inputStream) {
        int read = inputStream.read();
        if (read < 0) {
            throw new IOException("SOCKS4Connector: connection closed by the proxy");
        }
        return read;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Socket m3127a(String str, int i, boolean z) {
        byte[] bArr;
        OutputStream outputStream;
        InputStream inputStream;
        Socket socket;
        OutputStream outputStream2;
        Socket socket2;
        InputStream inputStream2 = null;
        boolean z2 = false;
        try {
            bArr = InetAddress.getByName(str).getAddress();
        } catch (Exception e) {
            bArr = new byte[]{0, 0, 0, 1};
            z2 = true;
        }
        try {
            socket = z ? b(this.f34751d, this.f34752e) : a(this.f34751d, this.f34752e);
            try {
                inputStream = socket.getInputStream();
                try {
                    outputStream = socket.getOutputStream();
                } catch (IOException e2) {
                    e = e2;
                    outputStream2 = null;
                    socket2 = socket;
                    inputStream2 = inputStream;
                } catch (Throwable th) {
                    th = th;
                    outputStream = null;
                }
            } catch (IOException e3) {
                e = e3;
                outputStream2 = null;
                socket2 = socket;
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                inputStream = null;
            }
        } catch (IOException e4) {
            e = e4;
            outputStream2 = null;
            socket2 = null;
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            inputStream = null;
            socket = null;
        }
        try {
            outputStream.write(4);
            outputStream.write(1);
            outputStream.write(i >> 8);
            outputStream.write(i);
            outputStream.write(bArr);
            if (this.f34753f != null) {
                outputStream.write(this.f34753f.getBytes("UTF-8"));
            }
            outputStream.write(0);
            if (z2) {
                outputStream.write(str.getBytes("UTF-8"));
                outputStream.write(0);
            }
            if (m3128a(inputStream) != 0) {
                throw new IOException("SOCKS4Connector: invalid proxy response");
            }
            switch (m3128a(inputStream)) {
                case 90:
                    inputStream.skip(6L);
                    return socket;
                case 91:
                    throw new IOException("SOCKS4Connector: connection refused/failed");
                case 92:
                    throw new IOException("SOCKS4Connector: cannot validate the user");
                case 93:
                    throw new IOException("SOCKS4Connector: invalid user");
                default:
                    throw new IOException("SOCKS4Connector: invalid proxy response");
            }
        } catch (IOException e5) {
            e = e5;
            outputStream2 = outputStream;
            inputStream2 = inputStream;
            socket2 = socket;
            try {
                throw e;
            } catch (Throwable th4) {
                th = th4;
                inputStream = inputStream2;
                socket = socket2;
                outputStream = outputStream2;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th6) {
                    }
                }
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Throwable th7) {
                    }
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (outputStream != null) {
            }
            if (inputStream != null) {
            }
            if (socket != null) {
            }
            throw th;
        }
    }

    @Override // it.p273a.p274a.AbstractC10869h
    /* renamed from: c */
    public Socket mo3004c(String str, int i) {
        return m3127a(str, i, false);
    }

    @Override // it.p273a.p274a.AbstractC10869h
    /* renamed from: d */
    public Socket mo3003d(String str, int i) {
        return m3127a(str, i, true);
    }
}
