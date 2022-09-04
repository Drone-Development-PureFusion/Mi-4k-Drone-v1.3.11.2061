package p005b.p006a.p007a.p029b.p058r;

import java.io.Closeable;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/* renamed from: b.a.a.b.r.e */
/* loaded from: classes.dex */
public class C0706e {
    /* renamed from: a */
    public static void m38435a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
        }
    }

    /* renamed from: a */
    public static void m38434a(ServerSocket serverSocket) {
        if (serverSocket == null) {
            return;
        }
        try {
            serverSocket.close();
        } catch (IOException e) {
        }
    }

    /* renamed from: a */
    public static void m38433a(Socket socket) {
        if (socket == null) {
            return;
        }
        try {
            socket.close();
        } catch (IOException e) {
        }
    }
}
