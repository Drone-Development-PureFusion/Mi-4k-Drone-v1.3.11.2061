package org.p286a.p287a.p299f.p302c;

import java.net.Socket;
import java.security.KeyStore;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import org.p286a.p287a.p288a.AbstractC11009c;
@AbstractC11009c
/* renamed from: org.a.a.f.c.h */
/* loaded from: classes2.dex */
public class C11119h {

    /* renamed from: a */
    static final String f35793a = "TLS";

    /* renamed from: b */
    static final String f35794b = "SSL";

    /* renamed from: c */
    private String f35795c;

    /* renamed from: d */
    private Set<KeyManager> f35796d = new HashSet();

    /* renamed from: e */
    private Set<TrustManager> f35797e = new HashSet();

    /* renamed from: f */
    private SecureRandom f35798f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.a.a.f.c.h$a */
    /* loaded from: classes2.dex */
    public static class C11120a implements X509KeyManager {

        /* renamed from: a */
        private final X509KeyManager f35799a;

        /* renamed from: b */
        private final AbstractC11117f f35800b;

        C11120a(X509KeyManager x509KeyManager, AbstractC11117f abstractC11117f) {
            this.f35799a = x509KeyManager;
            this.f35800b = abstractC11117f;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
            HashMap hashMap = new HashMap();
            for (String str : strArr) {
                String[] clientAliases = this.f35799a.getClientAliases(str, principalArr);
                if (clientAliases != null) {
                    for (String str2 : clientAliases) {
                        hashMap.put(str2, new C11116e(str, this.f35799a.getCertificateChain(str2)));
                    }
                }
            }
            return this.f35800b.m1994a(hashMap, socket);
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
            HashMap hashMap = new HashMap();
            String[] serverAliases = this.f35799a.getServerAliases(str, principalArr);
            if (serverAliases != null) {
                for (String str2 : serverAliases) {
                    hashMap.put(str2, new C11116e(str, this.f35799a.getCertificateChain(str2)));
                }
            }
            return this.f35800b.m1994a(hashMap, socket);
        }

        @Override // javax.net.ssl.X509KeyManager
        public X509Certificate[] getCertificateChain(String str) {
            return this.f35799a.getCertificateChain(str);
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getClientAliases(String str, Principal[] principalArr) {
            return this.f35799a.getClientAliases(str, principalArr);
        }

        @Override // javax.net.ssl.X509KeyManager
        public PrivateKey getPrivateKey(String str) {
            return this.f35799a.getPrivateKey(str);
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getServerAliases(String str, Principal[] principalArr) {
            return this.f35799a.getServerAliases(str, principalArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.a.a.f.c.h$b */
    /* loaded from: classes2.dex */
    public static class C11121b implements X509TrustManager {

        /* renamed from: a */
        private final X509TrustManager f35801a;

        /* renamed from: b */
        private final AbstractC11127n f35802b;

        C11121b(X509TrustManager x509TrustManager, AbstractC11127n abstractC11127n) {
            this.f35801a = x509TrustManager;
            this.f35802b = abstractC11127n;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            this.f35801a.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            if (!this.f35802b.mo1964a(x509CertificateArr, str)) {
                this.f35801a.checkServerTrusted(x509CertificateArr, str);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return this.f35801a.getAcceptedIssuers();
        }
    }

    /* renamed from: a */
    public C11119h m1984a() {
        this.f35795c = "TLS";
        return this;
    }

    /* renamed from: a */
    public C11119h m1983a(String str) {
        this.f35795c = str;
        return this;
    }

    /* renamed from: a */
    public C11119h m1982a(KeyStore keyStore) {
        return m1981a(keyStore, (AbstractC11127n) null);
    }

    /* renamed from: a */
    public C11119h m1981a(KeyStore keyStore, AbstractC11127n abstractC11127n) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers != null) {
            if (abstractC11127n != null) {
                for (int i = 0; i < trustManagers.length; i++) {
                    TrustManager trustManager = trustManagers[i];
                    if (trustManager instanceof X509TrustManager) {
                        trustManagers[i] = new C11121b((X509TrustManager) trustManager, abstractC11127n);
                    }
                }
            }
            for (TrustManager trustManager2 : trustManagers) {
                this.f35797e.add(trustManager2);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C11119h m1980a(KeyStore keyStore, char[] cArr) {
        m1979a(keyStore, cArr, null);
        return this;
    }

    /* renamed from: a */
    public C11119h m1979a(KeyStore keyStore, char[] cArr, AbstractC11117f abstractC11117f) {
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStore, cArr);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        if (keyManagers != null) {
            if (abstractC11117f != null) {
                for (int i = 0; i < keyManagers.length; i++) {
                    KeyManager keyManager = keyManagers[i];
                    if (keyManager instanceof X509KeyManager) {
                        keyManagers[i] = new C11120a((X509KeyManager) keyManager, abstractC11117f);
                    }
                }
            }
            for (KeyManager keyManager2 : keyManagers) {
                this.f35796d.add(keyManager2);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C11119h m1978a(SecureRandom secureRandom) {
        this.f35798f = secureRandom;
        return this;
    }

    /* renamed from: b */
    public C11119h m1977b() {
        this.f35795c = "SSL";
        return this;
    }

    /* renamed from: c */
    public SSLContext m1976c() {
        SSLContext sSLContext = SSLContext.getInstance(this.f35795c != null ? this.f35795c : "TLS");
        sSLContext.init(!this.f35796d.isEmpty() ? (KeyManager[]) this.f35796d.toArray(new KeyManager[this.f35796d.size()]) : null, !this.f35797e.isEmpty() ? (TrustManager[]) this.f35797e.toArray(new TrustManager[this.f35797e.size()]) : null, this.f35798f);
        return sSLContext;
    }
}
