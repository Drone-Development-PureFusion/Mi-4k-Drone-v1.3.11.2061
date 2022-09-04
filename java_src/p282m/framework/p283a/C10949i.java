package p282m.framework.p283a;

import java.net.Socket;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.p286a.p287a.p299f.p302c.C11118g;
/* renamed from: m.framework.a.i */
/* loaded from: classes2.dex */
public class C10949i extends SSLSocketFactory {

    /* renamed from: a */
    SSLContext f35327a = SSLContext.getInstance(C11118g.f35782a);

    public C10949i(KeyStore keyStore) {
        super(keyStore);
        this.f35327a.init(null, new TrustManager[]{new X509TrustManager() { // from class: m.framework.a.i.1
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
        }}, null);
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() {
        return this.f35327a.getSocketFactory().createSocket();
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.f35327a.getSocketFactory().createSocket(socket, str, i, z);
    }
}
