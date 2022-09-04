package cn.sharesdk.framework.utils;
/* renamed from: cn.sharesdk.framework.utils.e */
/* loaded from: classes.dex */
public abstract class AbstractC0833e implements Escaper {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cn.sharesdk.framework.utils.e$a */
    /* loaded from: classes.dex */
    public static final class C0835a extends ThreadLocal<char[]> {
        private C0835a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    /* renamed from: a */
    private static final char[] m37767a(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    /* renamed from: b */
    protected static final int m37766b(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            char charAt = charSequence.charAt(i);
            int i3 = i + 1;
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            if (charAt > 56319) {
                throw new IllegalArgumentException("Unexpected low surrogate character '" + charAt + "' with value " + ((int) charAt) + " at index " + (i3 - 1));
            }
            if (i3 == i2) {
                return -charAt;
            }
            char charAt2 = charSequence.charAt(i3);
            if (!Character.isLowSurrogate(charAt2)) {
                throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i3);
            }
            return Character.toCodePoint(charAt, charAt2);
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    /* renamed from: a */
    protected int mo37769a(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int m37766b = m37766b(charSequence, i, i2);
            if (m37766b < 0 || mo37770a(m37766b) != null) {
                break;
            }
            i += Character.isSupplementaryCodePoint(m37766b) ? 2 : 1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final String m37768a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        char[] cArr = new C0835a().get();
        int i3 = 0;
        while (i < length) {
            int m37766b = m37766b(str, i, length);
            if (m37766b < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] mo37770a = mo37770a(m37766b);
            if (mo37770a != null) {
                int i4 = i - i2;
                int length2 = i3 + i4 + mo37770a.length;
                if (cArr.length < length2) {
                    cArr = m37767a(cArr, i3, length2 + (length - i) + 32);
                }
                if (i4 > 0) {
                    str.getChars(i2, i, cArr, i3);
                    i3 += i4;
                }
                if (mo37770a.length > 0) {
                    System.arraycopy(mo37770a, 0, cArr, i3, mo37770a.length);
                    i3 += mo37770a.length;
                }
            }
            int i5 = (Character.isSupplementaryCodePoint(m37766b) ? 2 : 1) + i;
            i = mo37769a(str, i5, length);
            i2 = i5;
        }
        int i6 = length - i2;
        if (i6 > 0) {
            int i7 = i6 + i3;
            if (cArr.length < i7) {
                cArr = m37767a(cArr, i3, i7);
            }
            str.getChars(i2, length, cArr, i3);
            i3 = i7;
        }
        return new String(cArr, 0, i3);
    }

    /* renamed from: a */
    protected abstract char[] mo37770a(int i);

    @Override // cn.sharesdk.framework.utils.Escaper
    public Appendable escape(final Appendable appendable) {
        C0830c.m37773a(appendable);
        return new Appendable() { // from class: cn.sharesdk.framework.utils.e.1

            /* renamed from: a */
            int f1673a = -1;

            /* renamed from: b */
            char[] f1674b = new char[2];

            /* renamed from: a */
            private void m37765a(char[] cArr, int i) {
                for (int i2 = 0; i2 < i; i2++) {
                    appendable.append(cArr[i2]);
                }
            }

            @Override // java.lang.Appendable
            public Appendable append(char c) {
                if (this.f1673a != -1) {
                    if (!Character.isLowSurrogate(c)) {
                        throw new IllegalArgumentException("Expected low surrogate character but got '" + c + "' with value " + ((int) c));
                    }
                    char[] mo37770a = AbstractC0833e.this.mo37770a(Character.toCodePoint((char) this.f1673a, c));
                    if (mo37770a != null) {
                        m37765a(mo37770a, mo37770a.length);
                    } else {
                        appendable.append((char) this.f1673a);
                        appendable.append(c);
                    }
                    this.f1673a = -1;
                } else if (Character.isHighSurrogate(c)) {
                    this.f1673a = c;
                } else if (Character.isLowSurrogate(c)) {
                    throw new IllegalArgumentException("Unexpected low surrogate character '" + c + "' with value " + ((int) c));
                } else {
                    char[] mo37770a2 = AbstractC0833e.this.mo37770a(c);
                    if (mo37770a2 != null) {
                        m37765a(mo37770a2, mo37770a2.length);
                    } else {
                        appendable.append(c);
                    }
                }
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence) {
                return append(charSequence, 0, charSequence.length());
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence, int i, int i2) {
                int i3;
                if (i < i2) {
                    if (this.f1673a != -1) {
                        char charAt = charSequence.charAt(i);
                        i3 = i + 1;
                        if (!Character.isLowSurrogate(charAt)) {
                            throw new IllegalArgumentException("Expected low surrogate character but got " + charAt);
                        }
                        char[] mo37770a = AbstractC0833e.this.mo37770a(Character.toCodePoint((char) this.f1673a, charAt));
                        if (mo37770a != null) {
                            m37765a(mo37770a, mo37770a.length);
                            i++;
                        } else {
                            appendable.append((char) this.f1673a);
                        }
                        this.f1673a = -1;
                    } else {
                        i3 = i;
                    }
                    while (true) {
                        int mo37769a = AbstractC0833e.this.mo37769a(charSequence, i3, i2);
                        if (mo37769a > i) {
                            appendable.append(charSequence, i, mo37769a);
                        }
                        if (mo37769a == i2) {
                            break;
                        }
                        int m37766b = AbstractC0833e.m37766b(charSequence, mo37769a, i2);
                        if (m37766b < 0) {
                            this.f1673a = -m37766b;
                            break;
                        }
                        char[] mo37770a2 = AbstractC0833e.this.mo37770a(m37766b);
                        if (mo37770a2 != null) {
                            m37765a(mo37770a2, mo37770a2.length);
                        } else {
                            m37765a(this.f1674b, Character.toChars(m37766b, this.f1674b, 0));
                        }
                        i = mo37769a + (Character.isSupplementaryCodePoint(m37766b) ? 2 : 1);
                        i3 = i;
                    }
                }
                return this;
            }
        };
    }

    @Override // cn.sharesdk.framework.utils.Escaper
    public String escape(String str) {
        int length = str.length();
        int mo37769a = mo37769a(str, 0, length);
        return mo37769a == length ? str : m37768a(str, mo37769a);
    }
}
