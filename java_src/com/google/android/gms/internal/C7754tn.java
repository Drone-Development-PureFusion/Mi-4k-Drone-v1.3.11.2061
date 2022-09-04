package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import org.p286a.p287a.p299f.p302c.C11125l;
@aaa
/* renamed from: com.google.android.gms.internal.tn */
/* loaded from: classes.dex */
public class C7754tn {

    /* renamed from: a */
    private final int f25635a;

    /* renamed from: b */
    private final int f25636b;

    /* renamed from: c */
    private final int f25637c;

    /* renamed from: d */
    private final C7766ts f25638d;

    /* renamed from: k */
    private int f25645k;

    /* renamed from: e */
    private final Object f25639e = new Object();

    /* renamed from: f */
    private ArrayList<String> f25640f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<String> f25641g = new ArrayList<>();

    /* renamed from: h */
    private int f25642h = 0;

    /* renamed from: i */
    private int f25643i = 0;

    /* renamed from: j */
    private int f25644j = 0;

    /* renamed from: l */
    private String f25646l = "";

    /* renamed from: m */
    private String f25647m = "";

    public C7754tn(int i, int i2, int i3, int i4) {
        this.f25635a = i;
        this.f25636b = i2;
        this.f25637c = i3;
        this.f25638d = new C7766ts(i4);
    }

    /* renamed from: a */
    private String m13574a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            stringBuffer.append(it2.next());
            stringBuffer.append(C11125l.f35805c);
            if (stringBuffer.length() > i) {
                break;
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() >= i ? stringBuffer2.substring(0, i) : stringBuffer2;
    }

    /* renamed from: c */
    private void m13570c(@Nullable String str, boolean z) {
        if (str == null || str.length() < this.f25637c) {
            return;
        }
        synchronized (this.f25639e) {
            this.f25640f.add(str);
            this.f25642h += str.length();
            if (z) {
                this.f25641g.add(str);
            }
        }
    }

    /* renamed from: a */
    int m13576a(int i, int i2) {
        return (this.f25635a * i) + (this.f25636b * i2);
    }

    /* renamed from: a */
    public void m13577a(int i) {
        this.f25643i = i;
    }

    /* renamed from: a */
    public void m13575a(String str, boolean z) {
        m13570c(str, z);
        synchronized (this.f25639e) {
            if (this.f25644j < 0) {
                abr.a("ActivityContent: negative number of WebViews.");
            }
            m13566g();
        }
    }

    /* renamed from: a */
    public boolean m13578a() {
        boolean z;
        synchronized (this.f25639e) {
            z = this.f25644j == 0;
        }
        return z;
    }

    /* renamed from: b */
    public String m13573b() {
        return this.f25646l;
    }

    /* renamed from: b */
    public void m13572b(String str, boolean z) {
        m13570c(str, z);
    }

    /* renamed from: c */
    public String m13571c() {
        return this.f25647m;
    }

    /* renamed from: d */
    public void m13569d() {
        synchronized (this.f25639e) {
            this.f25645k -= 100;
        }
    }

    /* renamed from: e */
    public void m13568e() {
        synchronized (this.f25639e) {
            this.f25644j--;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7754tn)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C7754tn c7754tn = (C7754tn) obj;
        return c7754tn.m13573b() != null && c7754tn.m13573b().equals(m13573b());
    }

    /* renamed from: f */
    public void m13567f() {
        synchronized (this.f25639e) {
            this.f25644j++;
        }
    }

    /* renamed from: g */
    public void m13566g() {
        synchronized (this.f25639e) {
            int m13576a = m13576a(this.f25642h, this.f25643i);
            if (m13576a > this.f25645k) {
                this.f25645k = m13576a;
                this.f25646l = this.f25638d.m13526a(this.f25640f);
                this.f25647m = this.f25638d.m13526a(this.f25641g);
            }
        }
    }

    /* renamed from: h */
    public int m13565h() {
        return this.f25645k;
    }

    public int hashCode() {
        return m13573b().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m13564i() {
        return this.f25642h;
    }

    public String toString() {
        int i = this.f25643i;
        int i2 = this.f25645k;
        int i3 = this.f25642h;
        String valueOf = String.valueOf(m13574a(this.f25640f, 100));
        String valueOf2 = String.valueOf(m13574a(this.f25641g, 100));
        String str = this.f25646l;
        String str2 = this.f25647m;
        return new StringBuilder(String.valueOf(valueOf).length() + 133 + String.valueOf(valueOf2).length() + String.valueOf(str).length() + String.valueOf(str2).length()).append("ActivityContent fetchId: ").append(i).append(" score:").append(i2).append(" total_length:").append(i3).append("\n text: ").append(valueOf).append("\n viewableText").append(valueOf2).append("\n signture: ").append(str).append("\n viewableSignture: ").append(str2).toString();
    }
}
