package com.p120c.p121a.p122a.p123a.p124a;

import android.graphics.Bitmap;
import com.p120c.p121a.p122a.p123a.p126b.AbstractC1270a;
import com.p120c.p121a.p129b.C1284a;
import com.p120c.p121a.p138c.C1354c;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.c.a.a.a.a.b */
/* loaded from: classes.dex */
public class C1268b extends AbstractC1256a {

    /* renamed from: j */
    private final long f3197j;

    /* renamed from: k */
    private final Map<File, Long> f3198k;

    public C1268b(File file, long j) {
        this(file, null, C1284a.m35952b(), j);
    }

    public C1268b(File file, File file2, long j) {
        this(file, file2, C1284a.m35952b(), j);
    }

    public C1268b(File file, File file2, AbstractC1270a abstractC1270a, long j) {
        super(file, file2, abstractC1270a);
        this.f3198k = Collections.synchronizedMap(new HashMap());
        this.f3197j = 1000 * j;
    }

    /* renamed from: d */
    private void m35974d(String str) {
        File c = c(str);
        long currentTimeMillis = System.currentTimeMillis();
        c.setLastModified(currentTimeMillis);
        this.f3198k.put(c, Long.valueOf(currentTimeMillis));
    }

    @Override // com.p120c.p121a.p122a.p123a.p124a.AbstractC1256a, com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: a */
    public File mo35979a(String str) {
        boolean z;
        File mo35979a = super.mo35979a(str);
        if (mo35979a != null && mo35979a.exists()) {
            Long l = this.f3198k.get(mo35979a);
            if (l == null) {
                z = false;
                l = Long.valueOf(mo35979a.lastModified());
            } else {
                z = true;
            }
            if (System.currentTimeMillis() - l.longValue() > this.f3197j) {
                mo35979a.delete();
                this.f3198k.remove(mo35979a);
            } else if (!z) {
                this.f3198k.put(mo35979a, l);
            }
        }
        return mo35979a;
    }

    @Override // com.p120c.p121a.p122a.p123a.p124a.AbstractC1256a, com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: a */
    public boolean mo35978a(String str, Bitmap bitmap) {
        boolean mo35978a = super.mo35978a(str, bitmap);
        m35974d(str);
        return mo35978a;
    }

    @Override // com.p120c.p121a.p122a.p123a.p124a.AbstractC1256a, com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: a */
    public boolean mo35977a(String str, InputStream inputStream, C1354c.AbstractC1355a abstractC1355a) {
        boolean mo35977a = super.mo35977a(str, inputStream, abstractC1355a);
        m35974d(str);
        return mo35977a;
    }

    @Override // com.p120c.p121a.p122a.p123a.p124a.AbstractC1256a, com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: b */
    public boolean mo35976b(String str) {
        this.f3198k.remove(c(str));
        return super.mo35976b(str);
    }

    @Override // com.p120c.p121a.p122a.p123a.p124a.AbstractC1256a, com.p120c.p121a.p122a.p123a.AbstractC1255a
    /* renamed from: c */
    public void mo35975c() {
        super.mo35975c();
        this.f3198k.clear();
    }
}
