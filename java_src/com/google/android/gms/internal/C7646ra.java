package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ra */
/* loaded from: classes2.dex */
public class C7646ra implements Cloneable {

    /* renamed from: a */
    private C7643qy<?, ?> f25385a;

    /* renamed from: b */
    private Object f25386b;

    /* renamed from: c */
    private List<C7651rf> f25387c = new ArrayList();

    /* renamed from: c */
    private byte[] m13876c() {
        byte[] bArr = new byte[m13881a()];
        m13880a(C7640qw.m13959a(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m13881a() {
        int i = 0;
        if (this.f25386b != null) {
            return this.f25385a.m13901a(this.f25386b);
        }
        Iterator<C7651rf> it2 = this.f25387c.iterator();
        while (true) {
            int i2 = i;
            if (!it2.hasNext()) {
                return i2;
            }
            i = it2.next().m13845a() + i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T> T m13879a(C7643qy<?, T> c7643qy) {
        if (this.f25386b == null) {
            this.f25385a = c7643qy;
            this.f25386b = c7643qy.m13899a(this.f25387c);
            this.f25387c = null;
        } else if (!this.f25385a.equals(c7643qy)) {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return (T) this.f25386b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13880a(C7640qw c7640qw) {
        if (this.f25386b != null) {
            this.f25385a.m13900a(this.f25386b, c7640qw);
            return;
        }
        for (C7651rf c7651rf : this.f25387c) {
            c7651rf.m13844a(c7640qw);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13878a(C7651rf c7651rf) {
        this.f25387c.add(c7651rf);
    }

    /* renamed from: b */
    public final C7646ra clone() {
        int i = 0;
        C7646ra c7646ra = new C7646ra();
        try {
            c7646ra.f25385a = this.f25385a;
            if (this.f25387c == null) {
                c7646ra.f25387c = null;
            } else {
                c7646ra.f25387c.addAll(this.f25387c);
            }
            if (this.f25386b != null) {
                if (this.f25386b instanceof AbstractC7649rd) {
                    c7646ra.f25386b = (AbstractC7649rd) ((AbstractC7649rd) this.f25386b).clone();
                } else if (this.f25386b instanceof byte[]) {
                    c7646ra.f25386b = ((byte[]) this.f25386b).clone();
                } else if (this.f25386b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.f25386b;
                    byte[][] bArr2 = new byte[bArr.length];
                    c7646ra.f25386b = bArr2;
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        bArr2[i2] = (byte[]) bArr[i2].clone();
                    }
                } else if (this.f25386b instanceof boolean[]) {
                    c7646ra.f25386b = ((boolean[]) this.f25386b).clone();
                } else if (this.f25386b instanceof int[]) {
                    c7646ra.f25386b = ((int[]) this.f25386b).clone();
                } else if (this.f25386b instanceof long[]) {
                    c7646ra.f25386b = ((long[]) this.f25386b).clone();
                } else if (this.f25386b instanceof float[]) {
                    c7646ra.f25386b = ((float[]) this.f25386b).clone();
                } else if (this.f25386b instanceof double[]) {
                    c7646ra.f25386b = ((double[]) this.f25386b).clone();
                } else if (this.f25386b instanceof AbstractC7649rd[]) {
                    AbstractC7649rd[] abstractC7649rdArr = (AbstractC7649rd[]) this.f25386b;
                    AbstractC7649rd[] abstractC7649rdArr2 = new AbstractC7649rd[abstractC7649rdArr.length];
                    c7646ra.f25386b = abstractC7649rdArr2;
                    while (true) {
                        int i3 = i;
                        if (i3 >= abstractC7649rdArr.length) {
                            break;
                        }
                        abstractC7649rdArr2[i3] = (AbstractC7649rd) abstractC7649rdArr[i3].clone();
                        i = i3 + 1;
                    }
                }
            }
            return c7646ra;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7646ra)) {
            return false;
        }
        C7646ra c7646ra = (C7646ra) obj;
        if (this.f25386b != null && c7646ra.f25386b != null) {
            if (this.f25385a != c7646ra.f25385a) {
                return false;
            }
            return !this.f25385a.f25376b.isArray() ? this.f25386b.equals(c7646ra.f25386b) : this.f25386b instanceof byte[] ? Arrays.equals((byte[]) this.f25386b, (byte[]) c7646ra.f25386b) : this.f25386b instanceof int[] ? Arrays.equals((int[]) this.f25386b, (int[]) c7646ra.f25386b) : this.f25386b instanceof long[] ? Arrays.equals((long[]) this.f25386b, (long[]) c7646ra.f25386b) : this.f25386b instanceof float[] ? Arrays.equals((float[]) this.f25386b, (float[]) c7646ra.f25386b) : this.f25386b instanceof double[] ? Arrays.equals((double[]) this.f25386b, (double[]) c7646ra.f25386b) : this.f25386b instanceof boolean[] ? Arrays.equals((boolean[]) this.f25386b, (boolean[]) c7646ra.f25386b) : Arrays.deepEquals((Object[]) this.f25386b, (Object[]) c7646ra.f25386b);
        } else if (this.f25387c != null && c7646ra.f25387c != null) {
            return this.f25387c.equals(c7646ra.f25387c);
        } else {
            try {
                return Arrays.equals(m13876c(), c7646ra.m13876c());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(m13876c()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
