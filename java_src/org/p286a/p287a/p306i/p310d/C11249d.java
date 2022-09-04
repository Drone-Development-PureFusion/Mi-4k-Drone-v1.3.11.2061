package org.p286a.p287a.p306i.p310d;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.SetCookie;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.d.d */
/* loaded from: classes2.dex */
public class C11249d implements Serializable, Cloneable, ClientCookie, SetCookie {
    private static final long serialVersionUID = -3869795591041535538L;

    /* renamed from: a */
    private final String f36181a;

    /* renamed from: b */
    private Map<String, String> f36182b = new HashMap();

    /* renamed from: c */
    private String f36183c;

    /* renamed from: d */
    private String f36184d;

    /* renamed from: e */
    private String f36185e;

    /* renamed from: f */
    private Date f36186f;

    /* renamed from: g */
    private String f36187g;

    /* renamed from: h */
    private boolean f36188h;

    /* renamed from: i */
    private int f36189i;

    public C11249d(String str, String str2) {
        C11354a.m1321a(str, "Name");
        this.f36181a = str;
        this.f36183c = str2;
    }

    /* renamed from: a */
    public void m1554a(String str, String str2) {
        this.f36182b.put(str, str2);
    }

    public Object clone() {
        C11249d c11249d = (C11249d) super.clone();
        c11249d.f36182b = new HashMap(this.f36182b);
        return c11249d;
    }

    public boolean containsAttribute(String str) {
        return this.f36182b.get(str) != null;
    }

    public String getAttribute(String str) {
        return this.f36182b.get(str);
    }

    public String getComment() {
        return this.f36184d;
    }

    public String getCommentURL() {
        return null;
    }

    public String getDomain() {
        return this.f36185e;
    }

    public Date getExpiryDate() {
        return this.f36186f;
    }

    public String getName() {
        return this.f36181a;
    }

    public String getPath() {
        return this.f36187g;
    }

    public int[] getPorts() {
        return null;
    }

    public String getValue() {
        return this.f36183c;
    }

    public int getVersion() {
        return this.f36189i;
    }

    public boolean isExpired(Date date) {
        C11354a.m1321a(date, "Date");
        return this.f36186f != null && this.f36186f.getTime() <= date.getTime();
    }

    public boolean isPersistent() {
        return this.f36186f != null;
    }

    public boolean isSecure() {
        return this.f36188h;
    }

    public void setComment(String str) {
        this.f36184d = str;
    }

    public void setDomain(String str) {
        if (str != null) {
            this.f36185e = str.toLowerCase(Locale.ENGLISH);
        } else {
            this.f36185e = null;
        }
    }

    public void setExpiryDate(Date date) {
        this.f36186f = date;
    }

    public void setPath(String str) {
        this.f36187g = str;
    }

    public void setSecure(boolean z) {
        this.f36188h = z;
    }

    public void setValue(String str) {
        this.f36183c = str;
    }

    public void setVersion(int i) {
        this.f36189i = i;
    }

    public String toString() {
        return "[version: " + Integer.toString(this.f36189i) + "][name: " + this.f36181a + "][value: " + this.f36183c + "][domain: " + this.f36185e + "][path: " + this.f36187g + "][expiry: " + this.f36186f + "]";
    }
}
