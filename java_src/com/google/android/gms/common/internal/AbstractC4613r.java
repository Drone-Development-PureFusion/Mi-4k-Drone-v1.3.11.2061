package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.p286a.p287a.p299f.p302c.C11125l;
/* renamed from: com.google.android.gms.common.internal.r */
/* loaded from: classes2.dex */
public abstract class AbstractC4613r {

    /* renamed from: a */
    public static final AbstractC4613r f17088a = m23541a("\t\n\u000b\f\r \u0085\u1680\u2028\u2029\u205f\u3000 \u180e ").mo23539a(m23542a(8192, 8202));

    /* renamed from: b */
    public static final AbstractC4613r f17089b = m23541a("\t\n\u000b\f\r \u0085\u1680\u2028\u2029\u205f\u3000").mo23539a(m23542a(8192, 8198)).mo23539a(m23542a(8200, 8202));

    /* renamed from: c */
    public static final AbstractC4613r f17090c = m23542a(0, 127);

    /* renamed from: d */
    public static final AbstractC4613r f17091d;

    /* renamed from: e */
    public static final AbstractC4613r f17092e;

    /* renamed from: f */
    public static final AbstractC4613r f17093f;

    /* renamed from: g */
    public static final AbstractC4613r f17094g;

    /* renamed from: h */
    public static final AbstractC4613r f17095h;

    /* renamed from: i */
    public static final AbstractC4613r f17096i;

    /* renamed from: j */
    public static final AbstractC4613r f17097j;

    /* renamed from: k */
    public static final AbstractC4613r f17098k;

    /* renamed from: l */
    public static final AbstractC4613r f17099l;

    /* renamed from: m */
    public static final AbstractC4613r f17100m;

    /* renamed from: n */
    public static final AbstractC4613r f17101n;

    /* renamed from: o */
    public static final AbstractC4613r f17102o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.internal.r$a */
    /* loaded from: classes2.dex */
    public static class C4625a extends AbstractC4613r {

        /* renamed from: p */
        List<AbstractC4613r> f17109p;

        C4625a(List<AbstractC4613r> list) {
            this.f17109p = list;
        }

        @Override // com.google.android.gms.common.internal.AbstractC4613r
        /* renamed from: a */
        public AbstractC4613r mo23539a(AbstractC4613r abstractC4613r) {
            ArrayList arrayList = new ArrayList(this.f17109p);
            arrayList.add((AbstractC4613r) C4588d.m23627a(abstractC4613r));
            return new C4625a(arrayList);
        }

        @Override // com.google.android.gms.common.internal.AbstractC4613r
        /* renamed from: b */
        public boolean mo23538b(char c) {
            for (AbstractC4613r abstractC4613r : this.f17109p) {
                if (abstractC4613r.mo23538b(c)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        char[] charArray;
        AbstractC4613r m23542a = m23542a('0', '9');
        AbstractC4613r abstractC4613r = m23542a;
        for (char c : "٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray()) {
            abstractC4613r = abstractC4613r.mo23539a(m23542a(c, (char) (c + '\t')));
        }
        f17091d = abstractC4613r;
        f17092e = m23542a('\t', C11125l.f35803a).mo23539a(m23542a((char) 28, C11125l.f35805c)).mo23539a(m23543a((char) 5760)).mo23539a(m23543a((char) 6158)).mo23539a(m23542a((char) 8192, (char) 8198)).mo23539a(m23542a((char) 8200, (char) 8203)).mo23539a(m23542a((char) 8232, (char) 8233)).mo23539a(m23543a((char) 8287)).mo23539a(m23543a((char) 12288));
        f17093f = new AbstractC4613r() { // from class: com.google.android.gms.common.internal.r.1
            @Override // com.google.android.gms.common.internal.AbstractC4613r
            /* renamed from: b */
            public boolean mo23538b(char c2) {
                return Character.isDigit(c2);
            }
        };
        f17094g = new AbstractC4613r() { // from class: com.google.android.gms.common.internal.r.7
            @Override // com.google.android.gms.common.internal.AbstractC4613r
            /* renamed from: b */
            public boolean mo23538b(char c2) {
                return Character.isLetter(c2);
            }
        };
        f17095h = new AbstractC4613r() { // from class: com.google.android.gms.common.internal.r.8
            @Override // com.google.android.gms.common.internal.AbstractC4613r
            /* renamed from: b */
            public boolean mo23538b(char c2) {
                return Character.isLetterOrDigit(c2);
            }
        };
        f17096i = new AbstractC4613r() { // from class: com.google.android.gms.common.internal.r.9
            @Override // com.google.android.gms.common.internal.AbstractC4613r
            /* renamed from: b */
            public boolean mo23538b(char c2) {
                return Character.isUpperCase(c2);
            }
        };
        f17097j = new AbstractC4613r() { // from class: com.google.android.gms.common.internal.r.10
            @Override // com.google.android.gms.common.internal.AbstractC4613r
            /* renamed from: b */
            public boolean mo23538b(char c2) {
                return Character.isLowerCase(c2);
            }
        };
        f17098k = m23542a((char) 0, (char) 31).mo23539a(m23542a((char) 127, (char) 159));
        f17099l = m23542a((char) 0, C11125l.f35805c).mo23539a(m23542a((char) 127, (char) 160)).mo23539a(m23543a((char) 173)).mo23539a(m23542a((char) 1536, (char) 1539)).mo23539a(m23541a("\u06dd\u070f\u1680឴឵\u180e")).mo23539a(m23542a((char) 8192, (char) 8207)).mo23539a(m23542a((char) 8232, (char) 8239)).mo23539a(m23542a((char) 8287, (char) 8292)).mo23539a(m23542a((char) 8298, (char) 8303)).mo23539a(m23543a((char) 12288)).mo23539a(m23542a((char) 55296, (char) 63743)).mo23539a(m23541a("\ufeff\ufff9\ufffa\ufffb"));
        f17100m = m23542a((char) 0, (char) 1273).mo23539a(m23543a((char) 1470)).mo23539a(m23542a((char) 1488, (char) 1514)).mo23539a(m23543a((char) 1523)).mo23539a(m23543a((char) 1524)).mo23539a(m23542a((char) 1536, (char) 1791)).mo23539a(m23542a((char) 1872, (char) 1919)).mo23539a(m23542a((char) 3584, (char) 3711)).mo23539a(m23542a((char) 7680, (char) 8367)).mo23539a(m23542a((char) 8448, (char) 8506)).mo23539a(m23542a((char) 64336, (char) 65023)).mo23539a(m23542a((char) 65136, (char) 65279)).mo23539a(m23542a((char) 65377, (char) 65500));
        f17101n = new AbstractC4613r() { // from class: com.google.android.gms.common.internal.r.11
            @Override // com.google.android.gms.common.internal.AbstractC4613r
            /* renamed from: a */
            public AbstractC4613r mo23539a(AbstractC4613r abstractC4613r2) {
                C4588d.m23627a(abstractC4613r2);
                return this;
            }

            @Override // com.google.android.gms.common.internal.AbstractC4613r
            /* renamed from: b */
            public boolean mo23538b(char c2) {
                return true;
            }

            @Override // com.google.android.gms.common.internal.AbstractC4613r
            /* renamed from: b */
            public boolean mo23540b(CharSequence charSequence) {
                C4588d.m23627a(charSequence);
                return true;
            }
        };
        f17102o = new AbstractC4613r() { // from class: com.google.android.gms.common.internal.r.2
            @Override // com.google.android.gms.common.internal.AbstractC4613r
            /* renamed from: a */
            public AbstractC4613r mo23539a(AbstractC4613r abstractC4613r2) {
                return (AbstractC4613r) C4588d.m23627a(abstractC4613r2);
            }

            @Override // com.google.android.gms.common.internal.AbstractC4613r
            /* renamed from: b */
            public boolean mo23538b(char c2) {
                return false;
            }

            @Override // com.google.android.gms.common.internal.AbstractC4613r
            /* renamed from: b */
            public boolean mo23540b(CharSequence charSequence) {
                return charSequence.length() == 0;
            }
        };
    }

    /* renamed from: a */
    public static AbstractC4613r m23543a(final char c) {
        return new AbstractC4613r() { // from class: com.google.android.gms.common.internal.r.3
            @Override // com.google.android.gms.common.internal.AbstractC4613r
            /* renamed from: a */
            public AbstractC4613r mo23539a(AbstractC4613r abstractC4613r) {
                return abstractC4613r.mo23538b(c) ? abstractC4613r : super.mo23539a(abstractC4613r);
            }

            @Override // com.google.android.gms.common.internal.AbstractC4613r
            /* renamed from: b */
            public boolean mo23538b(char c2) {
                return c2 == c;
            }
        };
    }

    /* renamed from: a */
    public static AbstractC4613r m23542a(final char c, final char c2) {
        C4588d.m23619b(c2 >= c);
        return new AbstractC4613r() { // from class: com.google.android.gms.common.internal.r.6
            @Override // com.google.android.gms.common.internal.AbstractC4613r
            /* renamed from: b */
            public boolean mo23538b(char c3) {
                return c <= c3 && c3 <= c2;
            }
        };
    }

    /* renamed from: a */
    public static AbstractC4613r m23541a(CharSequence charSequence) {
        switch (charSequence.length()) {
            case 0:
                return f17102o;
            case 1:
                return m23543a(charSequence.charAt(0));
            case 2:
                final char charAt = charSequence.charAt(0);
                final char charAt2 = charSequence.charAt(1);
                return new AbstractC4613r() { // from class: com.google.android.gms.common.internal.r.4
                    @Override // com.google.android.gms.common.internal.AbstractC4613r
                    /* renamed from: b */
                    public boolean mo23538b(char c) {
                        return c == charAt || c == charAt2;
                    }
                };
            default:
                final char[] charArray = charSequence.toString().toCharArray();
                Arrays.sort(charArray);
                return new AbstractC4613r() { // from class: com.google.android.gms.common.internal.r.5
                    @Override // com.google.android.gms.common.internal.AbstractC4613r
                    /* renamed from: b */
                    public boolean mo23538b(char c) {
                        return Arrays.binarySearch(charArray, c) >= 0;
                    }
                };
        }
    }

    /* renamed from: a */
    public AbstractC4613r mo23539a(AbstractC4613r abstractC4613r) {
        return new C4625a(Arrays.asList(this, (AbstractC4613r) C4588d.m23627a(abstractC4613r)));
    }

    /* renamed from: b */
    public abstract boolean mo23538b(char c);

    /* renamed from: b */
    public boolean mo23540b(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo23538b(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }
}
