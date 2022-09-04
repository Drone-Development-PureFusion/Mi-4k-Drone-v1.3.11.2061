package it.p273a.p274a;

import android.support.p001v4.view.accessibility.AccessibilityEventCompat;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;
/* renamed from: it.a.a.l */
/* loaded from: classes.dex */
class RunnableC10873l implements AbstractC10870i, Runnable {

    /* renamed from: a */
    private ServerSocket f34870a;

    /* renamed from: b */
    private Socket f34871b;

    /* renamed from: c */
    private IOException f34872c;

    /* renamed from: d */
    private Thread f34873d;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RunnableC10873l() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        boolean z4 = false;
        this.f34870a = null;
        String property = System.getProperty(AbstractC10877p.f34884a);
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (stringTokenizer.countTokens() == 2) {
                String nextToken = stringTokenizer.nextToken();
                String nextToken2 = stringTokenizer.nextToken();
                try {
                    i4 = Integer.parseInt(nextToken);
                } catch (NumberFormatException e) {
                    i4 = 0;
                }
                try {
                    i3 = Integer.parseInt(nextToken2);
                } catch (NumberFormatException e2) {
                    i3 = 0;
                }
                if (i4 > 0 && i3 > 0 && i3 >= i4) {
                    z3 = true;
                    z = true;
                    if (!z3) {
                        System.err.println(new StringBuffer().append("WARNING: invalid value \"").append(property).append("\" for the ").append(AbstractC10877p.f34884a).append(" system property. The value should ").append("be in the start-stop form, with ").append("start > 0, stop > 0 and start <= stop.").toString());
                    }
                    int i5 = i3;
                    i2 = i4;
                    i = i5;
                }
            }
            z3 = false;
            i3 = 0;
            i4 = 0;
            z = false;
            if (!z3) {
            }
            int i52 = i3;
            i2 = i4;
            i = i52;
        } else {
            i = 0;
            i2 = 0;
            z = false;
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            while (i2 <= i) {
                arrayList.add(new Integer(i2));
                i2++;
            }
            while (!z4) {
                int size = arrayList.size();
                if (size <= 0) {
                    break;
                }
                int intValue = ((Integer) arrayList.remove((int) Math.floor(Math.random() * size))).intValue();
                try {
                    this.f34870a = new ServerSocket();
                    this.f34870a.setReceiveBufferSize(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
                    this.f34870a.bind(new InetSocketAddress(intValue));
                    z2 = true;
                } catch (IOException e3) {
                    z2 = z4;
                }
                z4 = z2;
            }
            if (!z4) {
                throw new C10871j(new StringBuffer().append("Cannot open the ServerSocket. No available port found in range ").append(property).toString());
            }
        } else {
            try {
                this.f34870a = new ServerSocket();
                this.f34870a.setReceiveBufferSize(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
                this.f34870a.bind(new InetSocketAddress(0));
            } catch (IOException e4) {
                throw new C10871j("Cannot open the ServerSocket", e4);
            }
        }
        this.f34873d = new Thread(this);
        this.f34873d.start();
    }

    @Override // it.p273a.p274a.AbstractC10870i
    /* renamed from: a */
    public Socket mo2997a() {
        if (this.f34871b == null && this.f34872c == null) {
            try {
                this.f34873d.join();
            } catch (Exception e) {
            }
        }
        if (this.f34872c != null) {
            throw new C10871j("Cannot receive the incoming connection", this.f34872c);
        }
        if (this.f34871b != null) {
            return this.f34871b;
        }
        throw new C10871j("No socket available");
    }

    @Override // it.p273a.p274a.AbstractC10870i
    /* renamed from: b */
    public void mo2996b() {
        if (this.f34870a != null) {
            try {
                this.f34870a.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: c */
    public int m2995c() {
        return this.f34870a.getLocalPort();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        int i2 = 30000;
        String property = System.getProperty(AbstractC10877p.f34886c);
        if (property != null) {
            boolean z = false;
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                i = -1;
            }
            if (i >= 0) {
                z = true;
                i2 = i;
            }
            if (!z) {
                System.err.println(new StringBuffer().append("WARNING: invalid value \"").append(property).append("\" for the ").append(AbstractC10877p.f34886c).append(" system property. The value should ").append("be an integer greater or equal to 0.").toString());
            }
        }
        try {
            try {
                this.f34870a.setSoTimeout(i2);
                this.f34871b = this.f34870a.accept();
                this.f34871b.setSendBufferSize(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
            } catch (IOException e2) {
                this.f34872c = e2;
                try {
                    this.f34870a.close();
                } catch (IOException e3) {
                }
            }
        } finally {
            try {
                this.f34870a.close();
            } catch (IOException e4) {
            }
        }
    }
}
