package org.p286a.p321b.p323b;

import com.baidu.android.common.logging.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.p286a.p321b.C11392f;
import org.p286a.p321b.p323b.C11371a;
import org.p286a.p321b.p324c.AbstractC11388d;
/* renamed from: org.a.b.b.k */
/* loaded from: classes2.dex */
public class C11382k extends C11371a {

    /* renamed from: f */
    private static int f36492f = 10000;

    /* renamed from: g */
    private static int f36493g = 10000;

    /* renamed from: h */
    private static int f36494h = 10000;

    /* renamed from: i */
    private static int f36495i = Log.FILE_LIMETE;

    /* renamed from: j */
    private static int f36496j = 104857600;

    /* renamed from: org.a.b.b.k$a */
    /* loaded from: classes2.dex */
    public static class C11383a extends C11371a.C11372a {
        public C11383a() {
            super(false, true);
        }

        public C11383a(boolean z, boolean z2, int i) {
            super(z, z2, i);
        }

        @Override // org.p286a.p321b.p323b.C11371a.C11372a, org.p286a.p321b.p323b.AbstractC11378g
        /* renamed from: a */
        public AbstractC11376e mo1221a(AbstractC11388d abstractC11388d) {
            C11382k c11382k = new C11382k(abstractC11388d, this.f36475a, this.f36476b);
            if (this.f36477c != 0) {
                c11382k.m1263c(this.f36477c);
            }
            return c11382k;
        }
    }

    public C11382k(AbstractC11388d abstractC11388d, boolean z, boolean z2) {
        super(abstractC11388d, z, z2);
    }

    @Override // org.p286a.p321b.p323b.C11371a, org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: k */
    public C11375d mo1226k() {
        byte r = r();
        byte r2 = r();
        int t = t();
        if (t > f36492f) {
            throw new C11377f(3, "Thrift map size " + t + " out of range!");
        }
        return new C11375d(r, r2, t);
    }

    @Override // org.p286a.p321b.p323b.C11371a, org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: m */
    public C11374c mo1225m() {
        byte r = r();
        int t = t();
        if (t > f36493g) {
            throw new C11377f(3, "Thrift list size " + t + " out of range!");
        }
        return new C11374c(r, t);
    }

    @Override // org.p286a.p321b.p323b.C11371a, org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: o */
    public C11380i mo1224o() {
        byte r = r();
        int t = t();
        if (t > f36494h) {
            throw new C11377f(3, "Thrift set size " + t + " out of range!");
        }
        return new C11380i(r, t);
    }

    @Override // org.p286a.p321b.p323b.C11371a, org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: w */
    public String mo1223w() {
        int t = t();
        if (t > f36495i) {
            throw new C11377f(3, "Thrift string size " + t + " out of range!");
        }
        if (this.f36486e.mo1212c() < t) {
            return b(t);
        }
        try {
            String str = new String(this.f36486e.mo1217a(), this.f36486e.mo1214b(), t, "UTF-8");
            this.f36486e.mo1216a(t);
            return str;
        } catch (UnsupportedEncodingException e) {
            throw new C11392f("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // org.p286a.p321b.p323b.C11371a, org.p286a.p321b.p323b.AbstractC11376e
    /* renamed from: x */
    public ByteBuffer mo1222x() {
        int t = t();
        if (t > f36496j) {
            throw new C11377f(3, "Thrift binary size " + t + " out of range!");
        }
        d(t);
        if (this.f36486e.mo1212c() >= t) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f36486e.mo1217a(), this.f36486e.mo1214b(), t);
            this.f36486e.mo1216a(t);
            return wrap;
        }
        byte[] bArr = new byte[t];
        this.f36486e.m1211d(bArr, 0, t);
        return ByteBuffer.wrap(bArr);
    }
}
