package it.p273a.p274a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLSocketFactory;
/* renamed from: it.a.a.f */
/* loaded from: classes.dex */
public class C10867f {

    /* renamed from: a */
    private ArrayList f34860a = new ArrayList();

    /* renamed from: b */
    private Socket f34861b;

    /* renamed from: c */
    private String f34862c;

    /* renamed from: d */
    private C10882u f34863d;

    /* renamed from: e */
    private C10883v f34864e;

    public C10867f(Socket socket, String str) {
        this.f34861b = null;
        this.f34862c = null;
        this.f34863d = null;
        this.f34864e = null;
        this.f34861b = socket;
        this.f34862c = str;
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        this.f34863d = new C10882u(inputStream, str);
        this.f34864e = new C10883v(outputStream, str);
    }

    /* renamed from: d */
    private String m3015d() {
        String m2978a = this.f34863d.m2978a();
        if (m2978a == null) {
            throw new IOException("FTPConnection closed");
        }
        Iterator it2 = this.f34860a.iterator();
        while (it2.hasNext()) {
            ((AbstractC10868g) it2.next()).m3013b(m2978a);
        }
        return m2978a;
    }

    /* renamed from: a */
    public void m3023a() {
        try {
            this.f34861b.close();
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public void m3022a(AbstractC10868g abstractC10868g) {
        this.f34860a.add(abstractC10868g);
    }

    /* renamed from: a */
    public void m3021a(String str) {
        this.f34864e.m2975b(str);
        Iterator it2 = this.f34860a.iterator();
        while (it2.hasNext()) {
            ((AbstractC10868g) it2.next()).m3014a(str);
        }
    }

    /* renamed from: a */
    public void m3020a(SSLSocketFactory sSLSocketFactory) {
        this.f34861b = sSLSocketFactory.createSocket(this.f34861b, this.f34861b.getInetAddress().getHostName(), this.f34861b.getPort(), true);
        InputStream inputStream = this.f34861b.getInputStream();
        OutputStream outputStream = this.f34861b.getOutputStream();
        this.f34863d = new C10882u(inputStream, this.f34862c);
        this.f34864e = new C10883v(outputStream, this.f34862c);
    }

    /* renamed from: b */
    public void m3018b(AbstractC10868g abstractC10868g) {
        this.f34860a.remove(abstractC10868g);
    }

    /* renamed from: b */
    public void m3017b(String str) {
        this.f34862c = str;
        this.f34863d.m2977a(str);
        this.f34864e.m2976a(str);
    }

    /* renamed from: b */
    public AbstractC10868g[] m3019b() {
        int size = this.f34860a.size();
        AbstractC10868g[] abstractC10868gArr = new AbstractC10868g[size];
        for (int i = 0; i < size; i++) {
            abstractC10868gArr[i] = (AbstractC10868g) this.f34860a.get(i);
        }
        return abstractC10868gArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
        r3 = r5.size();
        r4 = new java.lang.String[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
        if (r1 >= r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
        r4[r1] = (java.lang.String) r5.get(r1);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
        return new it.p273a.p274a.C10880s(r2, r4);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C10880s m3016c() {
        int i;
        int i2 = 0;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            String m3015d = m3015d();
            if (m3015d.trim().length() != 0) {
                String substring = m3015d.startsWith("\n") ? m3015d.substring(1) : m3015d;
                int length = substring.length();
                if (i3 == 0 && length < 3) {
                    throw new C10876o();
                }
                try {
                    i = Integer.parseInt(substring.substring(0, 3));
                } catch (Exception e) {
                    if (i3 == 0) {
                        throw new C10876o();
                    }
                    i = 0;
                }
                if (i3 != 0 && i != 0 && i != i3) {
                    throw new C10876o();
                }
                int i4 = i3 == 0 ? i : i3;
                if (i <= 0) {
                    arrayList.add(substring);
                } else if (length <= 3) {
                    if (length == 3) {
                        break;
                    }
                    arrayList.add(substring);
                } else {
                    char charAt = substring.charAt(3);
                    arrayList.add(substring.substring(4, length));
                    if (charAt == ' ') {
                        break;
                    } else if (charAt != '-') {
                        throw new C10876o();
                    } else {
                        i3 = i4;
                    }
                }
                i3 = i4;
            }
        }
    }
}
