package com.google.android.gms.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
/* renamed from: com.google.android.gms.internal.oz */
/* loaded from: classes2.dex */
public final class C7527oz {

    /* renamed from: com.google.android.gms.internal.oz$a */
    /* loaded from: classes2.dex */
    private static final class C7529a extends Writer {

        /* renamed from: a */
        private final Appendable f25040a;

        /* renamed from: b */
        private final C7530a f25041b;

        /* renamed from: com.google.android.gms.internal.oz$a$a */
        /* loaded from: classes2.dex */
        static class C7530a implements CharSequence {

            /* renamed from: a */
            char[] f25042a;

            C7530a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.f25042a[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f25042a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.f25042a, i, i2 - i);
            }
        }

        private C7529a(Appendable appendable) {
            this.f25041b = new C7530a();
            this.f25040a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i) {
            this.f25040a.append((char) i);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            this.f25041b.f25042a = cArr;
            this.f25040a.append(this.f25041b, i, i + i2);
        }
    }

    /* renamed from: a */
    public static AbstractC7471nx m14270a(C7598pp c7598pp) {
        boolean z = true;
        try {
            c7598pp.mo14146f();
            z = false;
            return C7562pn.f25113P.mo14172b(c7598pp);
        } catch (C7603pt e) {
            throw new C7481og(e);
        } catch (EOFException e2) {
            if (!z) {
                throw new C7481og(e2);
            }
            return C7473nz.f24952a;
        } catch (IOException e3) {
            throw new C7472ny(e3);
        } catch (NumberFormatException e4) {
            throw new C7481og(e4);
        }
    }

    /* renamed from: a */
    public static Writer m14269a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C7529a(appendable);
    }

    /* renamed from: a */
    public static void m14271a(AbstractC7471nx abstractC7471nx, C7602ps c7602ps) {
        C7562pn.f25113P.mo14173a(c7602ps, abstractC7471nx);
    }
}
