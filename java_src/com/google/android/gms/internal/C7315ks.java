package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7316kt;
import java.io.PrintWriter;
import java.io.StringWriter;
/* renamed from: com.google.android.gms.internal.ks */
/* loaded from: classes2.dex */
public class C7315ks {

    /* renamed from: a */
    private final AbstractC7316kt f24473a;

    /* renamed from: b */
    private final String f24474b;

    /* renamed from: c */
    private final String f24475c;

    public C7315ks(AbstractC7316kt abstractC7316kt, String str) {
        this(abstractC7316kt, str, null);
    }

    public C7315ks(AbstractC7316kt abstractC7316kt, String str, String str2) {
        this.f24473a = abstractC7316kt;
        this.f24474b = str;
        this.f24475c = str2;
    }

    /* renamed from: a */
    private static String m14839a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    private long m14838b() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    private String m14835b(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.f24475c == null) {
            return str;
        }
        String str2 = this.f24475c;
        return new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(str).length()).append(str2).append(" - ").append(str).toString();
    }

    /* renamed from: a */
    public void m14843a(String str) {
        m14836b(str, (Throwable) null);
    }

    /* renamed from: a */
    public void m14842a(String str, Throwable th) {
        String valueOf = String.valueOf(m14835b(str, new Object[0]));
        String valueOf2 = String.valueOf(m14839a(th));
        this.f24473a.mo14833b(AbstractC7316kt.EnumC7317a.ERROR, this.f24474b, new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append("\n").append(valueOf2).toString(), m14838b());
    }

    /* renamed from: a */
    public void m14841a(String str, Throwable th, Object... objArr) {
        if (m14844a()) {
            String m14835b = m14835b(str, objArr);
            if (th != null) {
                String valueOf = String.valueOf(m14839a(th));
                m14835b = new StringBuilder(String.valueOf(m14835b).length() + 1 + String.valueOf(valueOf).length()).append(m14835b).append("\n").append(valueOf).toString();
            }
            this.f24473a.mo14833b(AbstractC7316kt.EnumC7317a.DEBUG, this.f24474b, m14835b, m14838b());
        }
    }

    /* renamed from: a */
    public void m14840a(String str, Object... objArr) {
        m14841a(str, null, objArr);
    }

    /* renamed from: a */
    public boolean m14844a() {
        return this.f24473a.mo14834a().ordinal() <= AbstractC7316kt.EnumC7317a.DEBUG.ordinal();
    }

    /* renamed from: b */
    public void m14837b(String str) {
        this.f24473a.mo14833b(AbstractC7316kt.EnumC7317a.INFO, this.f24474b, m14835b(str, new Object[0]), m14838b());
    }

    /* renamed from: b */
    public void m14836b(String str, Throwable th) {
        String m14835b = m14835b(str, new Object[0]);
        if (th != null) {
            String valueOf = String.valueOf(m14839a(th));
            m14835b = new StringBuilder(String.valueOf(m14835b).length() + 1 + String.valueOf(valueOf).length()).append(m14835b).append("\n").append(valueOf).toString();
        }
        this.f24473a.mo14833b(AbstractC7316kt.EnumC7317a.WARN, this.f24474b, m14835b, m14838b());
    }
}
