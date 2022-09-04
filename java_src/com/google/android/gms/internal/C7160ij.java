package com.google.android.gms.internal;

import com.google.firebase.database.C9866d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* renamed from: com.google.android.gms.internal.ij */
/* loaded from: classes2.dex */
public class C7160ij implements Comparable<C7160ij>, Iterable<C7319kv> {

    /* renamed from: a */
    static final /* synthetic */ boolean f24081a;

    /* renamed from: e */
    private static final C7160ij f24082e;

    /* renamed from: b */
    private final C7319kv[] f24083b;

    /* renamed from: c */
    private final int f24084c;

    /* renamed from: d */
    private final int f24085d;

    static {
        f24081a = !C7160ij.class.desiredAssertionStatus();
        f24082e = new C7160ij("");
    }

    public C7160ij(String str) {
        int i;
        String[] split = str.split("/");
        int i2 = 0;
        for (String str2 : split) {
            if (str2.length() > 0) {
                i2++;
            }
        }
        this.f24083b = new C7319kv[i2];
        int length = split.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            String str3 = split[i3];
            if (str3.length() > 0) {
                i = i4 + 1;
                this.f24083b[i4] = C7319kv.m14828a(str3);
            } else {
                i = i4;
            }
            i3++;
            i4 = i;
        }
        this.f24084c = 0;
        this.f24085d = this.f24083b.length;
    }

    public C7160ij(List<String> list) {
        this.f24083b = new C7319kv[list.size()];
        int i = 0;
        for (String str : list) {
            this.f24083b[i] = C7319kv.m14828a(str);
            i++;
        }
        this.f24084c = 0;
        this.f24085d = list.size();
    }

    public C7160ij(C7319kv... c7319kvArr) {
        this.f24083b = (C7319kv[]) Arrays.copyOf(c7319kvArr, c7319kvArr.length);
        this.f24084c = 0;
        this.f24085d = c7319kvArr.length;
        for (C7319kv c7319kv : c7319kvArr) {
            if (!f24081a && c7319kv == null) {
                throw new AssertionError("Can't construct a path with a null value!");
            }
        }
    }

    private C7160ij(C7319kv[] c7319kvArr, int i, int i2) {
        this.f24083b = c7319kvArr;
        this.f24084c = i;
        this.f24085d = i2;
    }

    /* renamed from: a */
    public static C7160ij m15371a() {
        return f24082e;
    }

    /* renamed from: a */
    public static C7160ij m15369a(C7160ij c7160ij, C7160ij c7160ij2) {
        C7319kv m15363d = c7160ij.m15363d();
        C7319kv m15363d2 = c7160ij2.m15363d();
        if (m15363d == null) {
            return c7160ij2;
        }
        if (m15363d.equals(m15363d2)) {
            return m15369a(c7160ij.m15361e(), c7160ij2.m15361e());
        }
        String valueOf = String.valueOf(c7160ij2);
        String valueOf2 = String.valueOf(c7160ij);
        throw new C9866d(new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(valueOf2).length()).append("INTERNAL ERROR: ").append(valueOf).append(" is not contained in ").append(valueOf2).toString());
    }

    /* renamed from: a */
    public C7160ij m15370a(C7160ij c7160ij) {
        int m15355i = m15355i() + c7160ij.m15355i();
        C7319kv[] c7319kvArr = new C7319kv[m15355i];
        System.arraycopy(this.f24083b, this.f24084c, c7319kvArr, 0, m15355i());
        System.arraycopy(c7160ij.f24083b, c7160ij.f24084c, c7319kvArr, m15355i(), c7160ij.m15355i());
        return new C7160ij(c7319kvArr, 0, m15355i);
    }

    /* renamed from: a */
    public C7160ij m15368a(C7319kv c7319kv) {
        int m15355i = m15355i();
        C7319kv[] c7319kvArr = new C7319kv[m15355i + 1];
        System.arraycopy(this.f24083b, this.f24084c, c7319kvArr, 0, m15355i);
        c7319kvArr[m15355i] = c7319kv;
        return new C7160ij(c7319kvArr, 0, m15355i + 1);
    }

    /* renamed from: b */
    public String m15367b() {
        if (m15356h()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = this.f24084c; i < this.f24085d; i++) {
            if (i > this.f24084c) {
                sb.append("/");
            }
            sb.append(this.f24083b[i].m14823e());
        }
        return sb.toString();
    }

    /* renamed from: b */
    public boolean m15366b(C7160ij c7160ij) {
        if (m15355i() > c7160ij.m15355i()) {
            return false;
        }
        int i = this.f24084c;
        int i2 = c7160ij.f24084c;
        while (i < this.f24085d) {
            if (!this.f24083b[i].equals(c7160ij.f24083b[i2])) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(C7160ij c7160ij) {
        int i = this.f24084c;
        int i2 = c7160ij.f24084c;
        while (i < this.f24085d && i2 < c7160ij.f24085d) {
            int compareTo = this.f24083b[i].compareTo(c7160ij.f24083b[i2]);
            if (compareTo != 0) {
                return compareTo;
            }
            i++;
            i2++;
        }
        if (i == this.f24085d && i2 == c7160ij.f24085d) {
            return 0;
        }
        return i == this.f24085d ? -1 : 1;
    }

    /* renamed from: c */
    public List<String> m15365c() {
        ArrayList arrayList = new ArrayList(m15355i());
        Iterator<C7319kv> it2 = iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().m14823e());
        }
        return arrayList;
    }

    /* renamed from: d */
    public C7319kv m15363d() {
        if (m15356h()) {
            return null;
        }
        return this.f24083b[this.f24084c];
    }

    /* renamed from: e */
    public C7160ij m15361e() {
        int i = this.f24084c;
        if (!m15356h()) {
            i++;
        }
        return new C7160ij(this.f24083b, i, this.f24085d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7160ij)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C7160ij c7160ij = (C7160ij) obj;
        if (m15355i() != c7160ij.m15355i()) {
            return false;
        }
        int i = this.f24084c;
        for (int i2 = c7160ij.f24084c; i < this.f24085d && i2 < c7160ij.f24085d; i2++) {
            if (!this.f24083b[i].equals(c7160ij.f24083b[i2])) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: f */
    public C7160ij m15359f() {
        if (m15356h()) {
            return null;
        }
        return new C7160ij(this.f24083b, this.f24084c, this.f24085d - 1);
    }

    /* renamed from: g */
    public C7319kv m15357g() {
        if (!m15356h()) {
            return this.f24083b[this.f24085d - 1];
        }
        return null;
    }

    /* renamed from: h */
    public boolean m15356h() {
        return this.f24084c >= this.f24085d;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = this.f24084c; i2 < this.f24085d; i2++) {
            i = (i * 37) + this.f24083b[i2].hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public int m15355i() {
        return this.f24085d - this.f24084c;
    }

    @Override // java.lang.Iterable
    public Iterator<C7319kv> iterator() {
        return new Iterator<C7319kv>() { // from class: com.google.android.gms.internal.ij.1

            /* renamed from: a */
            int f24086a;

            {
                this.f24086a = C7160ij.this.f24084c;
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public C7319kv next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements.");
                }
                C7319kv c7319kv = C7160ij.this.f24083b[this.f24086a];
                this.f24086a++;
                return c7319kv;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f24086a < C7160ij.this.f24085d;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Can't remove component from immutable Path!");
            }
        };
    }

    public String toString() {
        if (m15356h()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = this.f24084c; i < this.f24085d; i++) {
            sb.append("/");
            sb.append(this.f24083b[i].m14823e());
        }
        return sb.toString();
    }
}
