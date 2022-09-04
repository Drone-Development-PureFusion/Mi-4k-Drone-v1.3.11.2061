package p005b.p006a.p007a.p029b.p036g.p040d;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import p005b.p006a.p007a.p029b.p055o.C0662f;
/* renamed from: b.a.a.b.g.d.c */
/* loaded from: classes.dex */
public class C0469c extends C0662f {

    /* renamed from: a */
    URL f634a;

    /* renamed from: b */
    List<File> f635b = new ArrayList();

    /* renamed from: c */
    List<Long> f636c = new ArrayList();

    /* renamed from: d */
    private void m39230d(URL url) {
        File m39232c = m39232c(url);
        if (m39232c != null) {
            this.f635b.add(m39232c);
            this.f636c.add(Long.valueOf(m39232c.lastModified()));
        }
    }

    /* renamed from: a */
    public void m39237a() {
        this.f634a = null;
        this.f636c.clear();
        this.f635b.clear();
    }

    /* renamed from: a */
    public void m39236a(URL url) {
        this.f634a = url;
        if (url != null) {
            m39230d(url);
        }
    }

    /* renamed from: b */
    public URL m39235b() {
        return this.f634a;
    }

    /* renamed from: b */
    public void m39234b(URL url) {
        m39230d(url);
    }

    /* renamed from: c */
    File m39232c(URL url) {
        if ("file".equals(url.getProtocol())) {
            return new File(URLDecoder.decode(url.getFile()));
        }
        d("URL [" + url + "] is not of type file");
        return null;
    }

    /* renamed from: c */
    public List<File> m39233c() {
        return new ArrayList(this.f635b);
    }

    /* renamed from: d */
    public boolean m39231d() {
        int size = this.f635b.size();
        for (int i = 0; i < size; i++) {
            if (this.f636c.get(i).longValue() != this.f635b.get(i).lastModified()) {
                return true;
            }
        }
        return false;
    }
}
