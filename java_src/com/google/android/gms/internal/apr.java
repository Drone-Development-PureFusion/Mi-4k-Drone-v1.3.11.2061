package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class apr {

    /* renamed from: a */
    private apr f22752a;

    /* renamed from: b */
    private Map<String, AbstractC6880ea> f22753b;

    public apr() {
        this(null);
    }

    private apr(@Nullable apr aprVar) {
        this.f22753b = null;
        this.f22752a = aprVar;
    }

    /* renamed from: a */
    public apr m16318a() {
        return new apr(this);
    }

    /* renamed from: a */
    public void m16316a(String str, AbstractC6880ea<?> abstractC6880ea) {
        if (this.f22753b == null) {
            this.f22753b = new HashMap();
        }
        this.f22753b.put(str, abstractC6880ea);
    }

    /* renamed from: a */
    public boolean m16317a(String str) {
        if (this.f22753b == null || !this.f22753b.containsKey(str)) {
            if (this.f22752a == null) {
                return false;
            }
            return this.f22752a.m16317a(str);
        }
        return true;
    }

    /* renamed from: b */
    public AbstractC6880ea<?> m16315b(String str) {
        if (this.f22753b == null || !this.f22753b.containsKey(str)) {
            if (this.f22752a != null) {
                return this.f22752a.m16315b(str);
            }
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Trying to get a non existent symbol: ".concat(valueOf) : new String("Trying to get a non existent symbol: "));
        }
        return this.f22753b.get(str);
    }

    /* renamed from: b */
    public void m16314b(String str, AbstractC6880ea<?> abstractC6880ea) {
        if (this.f22753b != null && this.f22753b.containsKey(str)) {
            this.f22753b.put(str, abstractC6880ea);
        } else if (this.f22752a == null) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Trying to modify a non existent symbol: ".concat(valueOf) : new String("Trying to modify a non existent symbol: "));
        } else {
            this.f22752a.m16314b(str, abstractC6880ea);
        }
    }

    /* renamed from: c */
    public void m16313c(String str) {
        C4588d.m23623a(m16317a(str));
        if (this.f22753b == null || !this.f22753b.containsKey(str)) {
            this.f22752a.m16313c(str);
        } else {
            this.f22753b.remove(str);
        }
    }
}
