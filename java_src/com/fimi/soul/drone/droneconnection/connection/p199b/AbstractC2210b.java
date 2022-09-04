package com.fimi.soul.drone.droneconnection.connection.p199b;

import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.droneconnection.connection.AbstractC2224e;
import com.fimi.soul.drone.droneconnection.connection.C2204b;
import com.fimi.soul.utils.NetUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
/* renamed from: com.fimi.soul.drone.droneconnection.connection.b.b */
/* loaded from: classes.dex */
public abstract class AbstractC2210b extends AbstractC2224e {

    /* renamed from: a */
    private static final int f6966a = 20000;

    /* renamed from: o */
    private static final String f6967o = NetUtil.getSSL1234Key();

    /* renamed from: p */
    private static final String f6968p = "client.bks";

    /* renamed from: q */
    private static final String f6969q = "ca.bks";

    /* renamed from: i */
    private Socket f6970i;

    /* renamed from: j */
    private BufferedOutputStream f6971j;

    /* renamed from: k */
    private BufferedInputStream f6972k;

    /* renamed from: l */
    private String f6973l;

    /* renamed from: m */
    private int f6974m;

    /* renamed from: n */
    private String f6975n = null;

    /* renamed from: r */
    private SSLContext f6976r = null;

    /* renamed from: com.fimi.soul.drone.droneconnection.connection.b.b$a */
    /* loaded from: classes.dex */
    public class C2214a implements X509TrustManager {

        /* renamed from: b */
        private X509TrustManager f6982b;

        public C2214a(KeyStore keyStore) {
            this.f6982b = null;
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 0) {
                throw new NoSuchAlgorithmException("no trust manager found");
            }
            this.f6982b = (X509TrustManager) trustManagers[0];
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            this.f6982b.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            if (x509CertificateArr == null) {
                this.f6982b.checkServerTrusted(x509CertificateArr, str);
                return;
            }
            for (X509Certificate x509Certificate : x509CertificateArr) {
                x509Certificate.checkValidity();
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return this.f6982b.getAcceptedIssuers();
        }
    }

    /* renamed from: com.fimi.soul.drone.droneconnection.connection.b.b$b */
    /* loaded from: classes.dex */
    public class C2215b implements X509TrustManager {
        public C2215b() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    /* renamed from: l */
    private void m32687l() {
        this.f6974m = mo32696a();
        this.f6973l = mo32691b();
        InetAddress byName = InetAddress.getByName(this.f6973l);
        this.f6975n = byName.toString();
        this.f6970i = new Socket();
        this.f6970i.setReuseAddress(true);
        if (this.f6970i == null) {
            return;
        }
        this.f6970i.setSoLinger(true, 0);
        this.f6970i.connect(new InetSocketAddress(byName, this.f6974m), 20000);
        this.f6970i.setTrafficClass(20);
        if (!this.f6970i.isConnected()) {
            return;
        }
        this.f6971j = new BufferedOutputStream(this.f6970i.getOutputStream());
        this.f6972k = new BufferedInputStream(this.f6970i.getInputStream());
    }

    /* renamed from: a */
    protected abstract int mo32696a();

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2224e
    /* renamed from: b */
    public final int mo32630b(byte[] bArr) {
        if (this.f6972k != null) {
            return this.f6972k.read(bArr);
        }
        return -1;
    }

    /* renamed from: b */
    protected abstract String mo32691b();

    /* renamed from: c */
    public void m32689c() {
        this.f6974m = mo32696a();
        this.f6973l = mo32691b();
        try {
            this.f6975n = InetAddress.getByName(this.f6973l).toString();
            this.f6976r = SSLContext.getInstance("SSL");
            KeyStore keyStore = KeyStore.getInstance("BKS");
            keyStore.load(DroidPlannerApp.m34273g().getResources().getAssets().open(f6968p), f6967o.toCharArray());
            KeyStore keyStore2 = KeyStore.getInstance("BKS");
            keyStore2.load(DroidPlannerApp.m34273g().getResources().getAssets().open(f6969q), f6967o.toCharArray());
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("X509");
            keyManagerFactory.init(keyStore, f6967o.toCharArray());
            TrustManagerFactory.getInstance("X509").init(keyStore2);
            TrustManager[] trustManagerArr = {new C2214a(keyStore2)};
            new TrustManager[1][0] = new C2215b();
            this.f6976r.init(keyManagerFactory.getKeyManagers(), trustManagerArr, null);
            SSLSocket sSLSocket = (SSLSocket) this.f6976r.getSocketFactory().createSocket(this.f6973l, this.f6974m);
            sSLSocket.setTrafficClass(20);
            sSLSocket.addHandshakeCompletedListener(new HandshakeCompletedListener() { // from class: com.fimi.soul.drone.droneconnection.connection.b.b.3
                @Override // javax.net.ssl.HandshakeCompletedListener
                public void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
                }
            });
            sSLSocket.startHandshake();
            this.f6970i = sSLSocket;
            if (this.f6970i == null || !this.f6970i.isConnected()) {
                return;
            }
            this.f6971j = new BufferedOutputStream(this.f6970i.getOutputStream());
            this.f6972k = new BufferedInputStream(this.f6970i.getInputStream());
        } catch (Exception e) {
            h();
        }
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2224e
    /* renamed from: d */
    public final void mo32627d() {
        if (!C1772d.m34208a().m34187k()) {
            m32687l();
        } else {
            m32689c();
        }
        C2204b.m32706b(false);
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2224e
    /* renamed from: d */
    public final void mo32625d(final byte[] bArr) {
        C1685x.m34457a(new Runnable() { // from class: com.fimi.soul.drone.droneconnection.connection.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC2210b.this.f6971j == null || AbstractC2210b.this.f6971j == null) {
                    return;
                }
                try {
                    AbstractC2210b.this.f6971j.write(bArr);
                    AbstractC2210b.this.f6971j.flush();
                } catch (IOException e) {
                    AbstractC2210b.this.h();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.fimi.soul.drone.droneconnection.connection.b.b$2] */
    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2224e
    /* renamed from: e */
    public final void mo32624e() {
        if (this.f6970i != null) {
            new Thread() { // from class: com.fimi.soul.drone.droneconnection.connection.b.b.2
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        if (AbstractC2210b.this.f6972k != null) {
                            AbstractC2210b.this.f6972k.close();
                        }
                        if (AbstractC2210b.this.f6971j != null) {
                            AbstractC2210b.this.f6971j.close();
                        }
                        if (AbstractC2210b.this.f6970i != null) {
                            AbstractC2210b.this.f6970i.close();
                        }
                        AbstractC2210b.this.f6970i = null;
                        AbstractC2210b.this.f6972k = null;
                        AbstractC2210b.this.f6971j = null;
                    } catch (Exception e) {
                    }
                }
            }.start();
        }
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2224e
    /* renamed from: j */
    public final int mo32616j() {
        return 3;
    }
}
