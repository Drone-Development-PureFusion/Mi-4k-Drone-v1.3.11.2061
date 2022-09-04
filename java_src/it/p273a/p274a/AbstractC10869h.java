package it.p273a.p274a;

import android.support.p001v4.view.accessibility.AccessibilityEventCompat;
import com.fimi.soul.biz.camera.C1831e;
import java.net.InetSocketAddress;
import java.net.Socket;
/* renamed from: it.a.a.h */
/* loaded from: classes.dex */
public abstract class AbstractC10869h {

    /* renamed from: a */
    protected int f34865a;

    /* renamed from: b */
    protected int f34866b;

    /* renamed from: c */
    protected int f34867c;

    /* renamed from: d */
    private boolean f34868d;

    /* renamed from: e */
    private Socket f34869e;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10869h() {
        this(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10869h(boolean z) {
        this.f34865a = 10;
        this.f34866b = 10;
        this.f34867c = 10;
        String property = System.getProperty(AbstractC10877p.f34887d);
        if ("true".equalsIgnoreCase(property) || C1831e.f4910cD.equalsIgnoreCase(property) || "1".equals(property)) {
            this.f34868d = true;
        } else if ("false".equalsIgnoreCase(property) || "no".equalsIgnoreCase(property) || "0".equals(property)) {
            this.f34868d = false;
        } else {
            this.f34868d = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Socket m3010a(String str, int i) {
        try {
            this.f34869e = new Socket();
            this.f34869e.setKeepAlive(true);
            this.f34869e.setSoTimeout(this.f34866b * 1000);
            this.f34869e.setSoLinger(true, this.f34867c);
            this.f34869e.connect(new InetSocketAddress(str, i), this.f34865a * 1000);
            return this.f34869e;
        } finally {
            this.f34869e = null;
        }
    }

    /* renamed from: a */
    public void m3011a(int i) {
        this.f34865a = i;
    }

    /* renamed from: a */
    public void m3009a(boolean z) {
        this.f34868d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m3012a() {
        return this.f34868d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public Socket m3006b(String str, int i) {
        Socket socket = new Socket();
        socket.setSoTimeout(this.f34866b * 1000);
        socket.setSoLinger(true, this.f34867c);
        socket.setReceiveBufferSize(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        socket.setSendBufferSize(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        socket.connect(new InetSocketAddress(str, i), this.f34865a * 1000);
        return socket;
    }

    /* renamed from: b */
    public void m3008b() {
        if (this.f34869e != null) {
            try {
                this.f34869e.close();
            } catch (Throwable th) {
            }
        }
    }

    /* renamed from: b */
    public void m3007b(int i) {
        this.f34866b = i;
    }

    /* renamed from: c */
    public abstract Socket mo3004c(String str, int i);

    /* renamed from: c */
    public void m3005c(int i) {
        this.f34867c = i;
    }

    /* renamed from: d */
    public abstract Socket mo3003d(String str, int i);
}
