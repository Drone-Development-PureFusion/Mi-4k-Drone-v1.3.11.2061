package com.google.android.gms.internal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.p356d.AbstractC11759f;
/* renamed from: com.google.android.gms.internal.pn */
/* loaded from: classes2.dex */
public final class C7562pn {

    /* renamed from: a */
    public static final AbstractC7488oj<Class> f25116a = new AbstractC7488oj<Class>() { // from class: com.google.android.gms.internal.pn.1
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Class mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, Class cls) {
            if (cls == null) {
                c7602ps.mo14095f();
            } else {
                String valueOf = String.valueOf(cls.getName());
                throw new UnsupportedOperationException(new StringBuilder(String.valueOf(valueOf).length() + 76).append("Attempted to serialize java.lang.Class: ").append(valueOf).append(". Forgot to register a type adapter?").toString());
            }
        }
    };

    /* renamed from: b */
    public static final AbstractC7489ok f25117b = m14230a(Class.class, f25116a);

    /* renamed from: c */
    public static final AbstractC7488oj<BitSet> f25118c = new AbstractC7488oj<BitSet>() { // from class: com.google.android.gms.internal.pn.4
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public BitSet mo14172b(C7598pp c7598pp) {
            boolean z;
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            BitSet bitSet = new BitSet();
            c7598pp.mo14165a();
            EnumC7600pq mo14146f = c7598pp.mo14146f();
            int i = 0;
            while (mo14146f != EnumC7600pq.END_ARRAY) {
                switch (mo14146f) {
                    case NUMBER:
                        if (c7598pp.mo14139m() == 0) {
                            z = false;
                            break;
                        } else {
                            z = true;
                            break;
                        }
                    case BOOLEAN:
                        z = c7598pp.mo14143i();
                        break;
                    case STRING:
                        String mo14144h = c7598pp.mo14144h();
                        try {
                            if (Integer.parseInt(mo14144h) == 0) {
                                z = false;
                                break;
                            } else {
                                z = true;
                                break;
                            }
                        } catch (NumberFormatException e) {
                            String valueOf = String.valueOf(mo14144h);
                            throw new C7481og(valueOf.length() != 0 ? "Error: Expecting: bitset number value (1, 0), Found: ".concat(valueOf) : new String("Error: Expecting: bitset number value (1, 0), Found: "));
                        }
                    default:
                        String valueOf2 = String.valueOf(mo14146f);
                        throw new C7481og(new StringBuilder(String.valueOf(valueOf2).length() + 27).append("Invalid bitset value type: ").append(valueOf2).toString());
                }
                if (z) {
                    bitSet.set(i);
                }
                i++;
                mo14146f = c7598pp.mo14146f();
            }
            c7598pp.mo14158b();
            return bitSet;
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, BitSet bitSet) {
            if (bitSet == null) {
                c7602ps.mo14095f();
                return;
            }
            c7602ps.mo14107b();
            for (int i = 0; i < bitSet.length(); i++) {
                c7602ps.mo14111a(bitSet.get(i) ? 1 : 0);
            }
            c7602ps.mo14103c();
        }
    };

    /* renamed from: d */
    public static final AbstractC7489ok f25119d = m14230a(BitSet.class, f25118c);

    /* renamed from: e */
    public static final AbstractC7488oj<Boolean> f25120e = new AbstractC7488oj<Boolean>() { // from class: com.google.android.gms.internal.pn.16
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Boolean mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() != EnumC7600pq.NULL) {
                return c7598pp.mo14146f() == EnumC7600pq.STRING ? Boolean.valueOf(Boolean.parseBoolean(c7598pp.mo14144h())) : Boolean.valueOf(c7598pp.mo14143i());
            }
            c7598pp.mo14142j();
            return null;
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, Boolean bool) {
            if (bool == null) {
                c7602ps.mo14095f();
            } else {
                c7602ps.mo14108a(bool.booleanValue());
            }
        }
    };

    /* renamed from: f */
    public static final AbstractC7488oj<Boolean> f25121f = new AbstractC7488oj<Boolean>() { // from class: com.google.android.gms.internal.pn.20
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Boolean mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            return Boolean.valueOf(c7598pp.mo14144h());
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, Boolean bool) {
            c7602ps.mo14105b(bool == null ? "null" : bool.toString());
        }
    };

    /* renamed from: g */
    public static final AbstractC7489ok f25122g = m14229a(Boolean.TYPE, Boolean.class, f25120e);

    /* renamed from: h */
    public static final AbstractC7488oj<Number> f25123h = new AbstractC7488oj<Number>() { // from class: com.google.android.gms.internal.pn.21
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Number mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            try {
                return Byte.valueOf((byte) c7598pp.mo14139m());
            } catch (NumberFormatException e) {
                throw new C7481og(e);
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, Number number) {
            c7602ps.mo14110a(number);
        }
    };

    /* renamed from: i */
    public static final AbstractC7489ok f25124i = m14229a(Byte.TYPE, Byte.class, f25123h);

    /* renamed from: j */
    public static final AbstractC7488oj<Number> f25125j = new AbstractC7488oj<Number>() { // from class: com.google.android.gms.internal.pn.22
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Number mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            try {
                return Short.valueOf((short) c7598pp.mo14139m());
            } catch (NumberFormatException e) {
                throw new C7481og(e);
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, Number number) {
            c7602ps.mo14110a(number);
        }
    };

    /* renamed from: k */
    public static final AbstractC7489ok f25126k = m14229a(Short.TYPE, Short.class, f25125j);

    /* renamed from: l */
    public static final AbstractC7488oj<Number> f25127l = new AbstractC7488oj<Number>() { // from class: com.google.android.gms.internal.pn.24
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Number mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            try {
                return Integer.valueOf(c7598pp.mo14139m());
            } catch (NumberFormatException e) {
                throw new C7481og(e);
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, Number number) {
            c7602ps.mo14110a(number);
        }
    };

    /* renamed from: m */
    public static final AbstractC7489ok f25128m = m14229a(Integer.TYPE, Integer.class, f25127l);

    /* renamed from: n */
    public static final AbstractC7488oj<Number> f25129n = new AbstractC7488oj<Number>() { // from class: com.google.android.gms.internal.pn.25
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Number mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            try {
                return Long.valueOf(c7598pp.mo14140l());
            } catch (NumberFormatException e) {
                throw new C7481og(e);
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, Number number) {
            c7602ps.mo14110a(number);
        }
    };

    /* renamed from: o */
    public static final AbstractC7488oj<Number> f25130o = new AbstractC7488oj<Number>() { // from class: com.google.android.gms.internal.pn.26
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Number mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            return Float.valueOf((float) c7598pp.mo14141k());
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, Number number) {
            c7602ps.mo14110a(number);
        }
    };

    /* renamed from: p */
    public static final AbstractC7488oj<Number> f25131p = new AbstractC7488oj<Number>() { // from class: com.google.android.gms.internal.pn.12
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Number mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            return Double.valueOf(c7598pp.mo14141k());
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, Number number) {
            c7602ps.mo14110a(number);
        }
    };

    /* renamed from: q */
    public static final AbstractC7488oj<Number> f25132q = new AbstractC7488oj<Number>() { // from class: com.google.android.gms.internal.pn.23
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Number mo14172b(C7598pp c7598pp) {
            EnumC7600pq mo14146f = c7598pp.mo14146f();
            switch (mo14146f) {
                case NUMBER:
                    return new C7516ov(c7598pp.mo14144h());
                case BOOLEAN:
                case STRING:
                default:
                    String valueOf = String.valueOf(mo14146f);
                    throw new C7481og(new StringBuilder(String.valueOf(valueOf).length() + 23).append("Expecting number, got: ").append(valueOf).toString());
                case NULL:
                    c7598pp.mo14142j();
                    return null;
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, Number number) {
            c7602ps.mo14110a(number);
        }
    };

    /* renamed from: r */
    public static final AbstractC7489ok f25133r = m14230a(Number.class, f25132q);

    /* renamed from: s */
    public static final AbstractC7488oj<Character> f25134s = new AbstractC7488oj<Character>() { // from class: com.google.android.gms.internal.pn.27
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Character mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            String mo14144h = c7598pp.mo14144h();
            if (mo14144h.length() == 1) {
                return Character.valueOf(mo14144h.charAt(0));
            }
            String valueOf = String.valueOf(mo14144h);
            throw new C7481og(valueOf.length() != 0 ? "Expecting character, got: ".concat(valueOf) : new String("Expecting character, got: "));
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, Character ch) {
            c7602ps.mo14105b(ch == null ? null : String.valueOf(ch));
        }
    };

    /* renamed from: t */
    public static final AbstractC7489ok f25135t = m14229a(Character.TYPE, Character.class, f25134s);

    /* renamed from: u */
    public static final AbstractC7488oj<String> f25136u = new AbstractC7488oj<String>() { // from class: com.google.android.gms.internal.pn.28
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public String mo14172b(C7598pp c7598pp) {
            EnumC7600pq mo14146f = c7598pp.mo14146f();
            if (mo14146f != EnumC7600pq.NULL) {
                return mo14146f == EnumC7600pq.BOOLEAN ? Boolean.toString(c7598pp.mo14143i()) : c7598pp.mo14144h();
            }
            c7598pp.mo14142j();
            return null;
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, String str) {
            c7602ps.mo14105b(str);
        }
    };

    /* renamed from: v */
    public static final AbstractC7488oj<BigDecimal> f25137v = new AbstractC7488oj<BigDecimal>() { // from class: com.google.android.gms.internal.pn.29
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public BigDecimal mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            try {
                return new BigDecimal(c7598pp.mo14144h());
            } catch (NumberFormatException e) {
                throw new C7481og(e);
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, BigDecimal bigDecimal) {
            c7602ps.mo14110a(bigDecimal);
        }
    };

    /* renamed from: w */
    public static final AbstractC7488oj<BigInteger> f25138w = new AbstractC7488oj<BigInteger>() { // from class: com.google.android.gms.internal.pn.30
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public BigInteger mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            try {
                return new BigInteger(c7598pp.mo14144h());
            } catch (NumberFormatException e) {
                throw new C7481og(e);
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, BigInteger bigInteger) {
            c7602ps.mo14110a(bigInteger);
        }
    };

    /* renamed from: x */
    public static final AbstractC7489ok f25139x = m14230a(String.class, f25136u);

    /* renamed from: y */
    public static final AbstractC7488oj<StringBuilder> f25140y = new AbstractC7488oj<StringBuilder>() { // from class: com.google.android.gms.internal.pn.31
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public StringBuilder mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            return new StringBuilder(c7598pp.mo14144h());
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, StringBuilder sb) {
            c7602ps.mo14105b(sb == null ? null : sb.toString());
        }
    };

    /* renamed from: z */
    public static final AbstractC7489ok f25141z = m14230a(StringBuilder.class, f25140y);

    /* renamed from: A */
    public static final AbstractC7488oj<StringBuffer> f25098A = new AbstractC7488oj<StringBuffer>() { // from class: com.google.android.gms.internal.pn.32
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public StringBuffer mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            return new StringBuffer(c7598pp.mo14144h());
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, StringBuffer stringBuffer) {
            c7602ps.mo14105b(stringBuffer == null ? null : stringBuffer.toString());
        }
    };

    /* renamed from: B */
    public static final AbstractC7489ok f25099B = m14230a(StringBuffer.class, f25098A);

    /* renamed from: C */
    public static final AbstractC7488oj<URL> f25100C = new AbstractC7488oj<URL>() { // from class: com.google.android.gms.internal.pn.2
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public URL mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            String mo14144h = c7598pp.mo14144h();
            if ("null".equals(mo14144h)) {
                return null;
            }
            return new URL(mo14144h);
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, URL url) {
            c7602ps.mo14105b(url == null ? null : url.toExternalForm());
        }
    };

    /* renamed from: D */
    public static final AbstractC7489ok f25101D = m14230a(URL.class, f25100C);

    /* renamed from: E */
    public static final AbstractC7488oj<URI> f25102E = new AbstractC7488oj<URI>() { // from class: com.google.android.gms.internal.pn.3
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public URI mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            try {
                String mo14144h = c7598pp.mo14144h();
                if ("null".equals(mo14144h)) {
                    return null;
                }
                return new URI(mo14144h);
            } catch (URISyntaxException e) {
                throw new C7472ny(e);
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, URI uri) {
            c7602ps.mo14105b(uri == null ? null : uri.toASCIIString());
        }
    };

    /* renamed from: F */
    public static final AbstractC7489ok f25103F = m14230a(URI.class, f25102E);

    /* renamed from: G */
    public static final AbstractC7488oj<InetAddress> f25104G = new AbstractC7488oj<InetAddress>() { // from class: com.google.android.gms.internal.pn.5
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public InetAddress mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            return InetAddress.getByName(c7598pp.mo14144h());
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, InetAddress inetAddress) {
            c7602ps.mo14105b(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    };

    /* renamed from: H */
    public static final AbstractC7489ok f25105H = m14228b(InetAddress.class, f25104G);

    /* renamed from: I */
    public static final AbstractC7488oj<UUID> f25106I = new AbstractC7488oj<UUID>() { // from class: com.google.android.gms.internal.pn.6
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public UUID mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            return UUID.fromString(c7598pp.mo14144h());
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, UUID uuid) {
            c7602ps.mo14105b(uuid == null ? null : uuid.toString());
        }
    };

    /* renamed from: J */
    public static final AbstractC7489ok f25107J = m14230a(UUID.class, f25106I);

    /* renamed from: K */
    public static final AbstractC7489ok f25108K = new AbstractC7489ok() { // from class: com.google.android.gms.internal.pn.7
        @Override // com.google.android.gms.internal.AbstractC7489ok
        /* renamed from: a */
        public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
            if (c7597po.m14171a() != Timestamp.class) {
                return null;
            }
            final AbstractC7488oj<T> m14399a = c7459nr.m14399a((Class) Date.class);
            return (AbstractC7488oj<T>) new AbstractC7488oj<Timestamp>() { // from class: com.google.android.gms.internal.pn.7.1
                @Override // com.google.android.gms.internal.AbstractC7488oj
                /* renamed from: a */
                public Timestamp mo14172b(C7598pp c7598pp) {
                    Date date = (Date) m14399a.mo14172b(c7598pp);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                @Override // com.google.android.gms.internal.AbstractC7488oj
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo14173a(C7602ps c7602ps, Timestamp timestamp) {
                    m14399a.mo14173a(c7602ps, timestamp);
                }
            };
        }
    };

    /* renamed from: L */
    public static final AbstractC7488oj<Calendar> f25109L = new AbstractC7488oj<Calendar>() { // from class: com.google.android.gms.internal.pn.8
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Calendar mo14172b(C7598pp c7598pp) {
            int i = 0;
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            c7598pp.mo14152c();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (c7598pp.mo14146f() != EnumC7600pq.END_OBJECT) {
                String mo14145g = c7598pp.mo14145g();
                int mo14139m = c7598pp.mo14139m();
                if ("year".equals(mo14145g)) {
                    i6 = mo14139m;
                } else if ("month".equals(mo14145g)) {
                    i5 = mo14139m;
                } else if ("dayOfMonth".equals(mo14145g)) {
                    i4 = mo14139m;
                } else if ("hourOfDay".equals(mo14145g)) {
                    i3 = mo14139m;
                } else if ("minute".equals(mo14145g)) {
                    i2 = mo14139m;
                } else if ("second".equals(mo14145g)) {
                    i = mo14139m;
                }
            }
            c7598pp.mo14149d();
            return new GregorianCalendar(i6, i5, i4, i3, i2, i);
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, Calendar calendar) {
            if (calendar == null) {
                c7602ps.mo14095f();
                return;
            }
            c7602ps.mo14100d();
            c7602ps.mo14109a("year");
            c7602ps.mo14111a(calendar.get(1));
            c7602ps.mo14109a("month");
            c7602ps.mo14111a(calendar.get(2));
            c7602ps.mo14109a("dayOfMonth");
            c7602ps.mo14111a(calendar.get(5));
            c7602ps.mo14109a("hourOfDay");
            c7602ps.mo14111a(calendar.get(11));
            c7602ps.mo14109a("minute");
            c7602ps.mo14111a(calendar.get(12));
            c7602ps.mo14109a("second");
            c7602ps.mo14111a(calendar.get(13));
            c7602ps.mo14097e();
        }
    };

    /* renamed from: M */
    public static final AbstractC7489ok f25110M = m14227b(Calendar.class, GregorianCalendar.class, f25109L);

    /* renamed from: N */
    public static final AbstractC7488oj<Locale> f25111N = new AbstractC7488oj<Locale>() { // from class: com.google.android.gms.internal.pn.9
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Locale mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c7598pp.mo14144h(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, Locale locale) {
            c7602ps.mo14105b(locale == null ? null : locale.toString());
        }
    };

    /* renamed from: O */
    public static final AbstractC7489ok f25112O = m14230a(Locale.class, f25111N);

    /* renamed from: P */
    public static final AbstractC7488oj<AbstractC7471nx> f25113P = new AbstractC7488oj<AbstractC7471nx>() { // from class: com.google.android.gms.internal.pn.10
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public AbstractC7471nx mo14172b(C7598pp c7598pp) {
            switch (C757319.f25154a[c7598pp.mo14146f().ordinal()]) {
                case 1:
                    return new C7478od((Number) new C7516ov(c7598pp.mo14144h()));
                case 2:
                    return new C7478od(Boolean.valueOf(c7598pp.mo14143i()));
                case 3:
                    return new C7478od(c7598pp.mo14144h());
                case 4:
                    c7598pp.mo14142j();
                    return C7473nz.f24952a;
                case 5:
                    C7468nu c7468nu = new C7468nu();
                    c7598pp.mo14165a();
                    while (c7598pp.mo14147e()) {
                        c7468nu.m14373a((AbstractC7471nx) mo14172b(c7598pp));
                    }
                    c7598pp.mo14158b();
                    return c7468nu;
                case 6:
                    C7475oa c7475oa = new C7475oa();
                    c7598pp.mo14152c();
                    while (c7598pp.mo14147e()) {
                        c7475oa.m14361a(c7598pp.mo14145g(), (AbstractC7471nx) mo14172b(c7598pp));
                    }
                    c7598pp.mo14149d();
                    return c7475oa;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo14173a(C7602ps c7602ps, AbstractC7471nx abstractC7471nx) {
            if (abstractC7471nx == null || abstractC7471nx.m14368k()) {
                c7602ps.mo14095f();
            } else if (abstractC7471nx.m14369j()) {
                C7478od m14365n = abstractC7471nx.m14365n();
                if (m14365n.m14342p()) {
                    c7602ps.mo14110a(m14365n.mo14350b());
                } else if (m14365n.m14353a()) {
                    c7602ps.mo14108a(m14365n.mo14344g());
                } else {
                    c7602ps.mo14105b(m14365n.mo14348c());
                }
            } else if (abstractC7471nx.m14371h()) {
                c7602ps.mo14107b();
                Iterator<AbstractC7471nx> it2 = abstractC7471nx.m14366m().iterator();
                while (it2.hasNext()) {
                    mo14173a(c7602ps, it2.next());
                }
                c7602ps.mo14103c();
            } else if (!abstractC7471nx.m14370i()) {
                String valueOf = String.valueOf(abstractC7471nx.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 15).append("Couldn't write ").append(valueOf).toString());
            } else {
                c7602ps.mo14100d();
                for (Map.Entry<String, AbstractC7471nx> entry : abstractC7471nx.m14367l().m14364a()) {
                    c7602ps.mo14109a(entry.getKey());
                    mo14173a(c7602ps, entry.getValue());
                }
                c7602ps.mo14097e();
            }
        }
    };

    /* renamed from: Q */
    public static final AbstractC7489ok f25114Q = m14228b(AbstractC7471nx.class, f25113P);

    /* renamed from: R */
    public static final AbstractC7489ok f25115R = new AbstractC7489ok() { // from class: com.google.android.gms.internal.pn.11
        @Override // com.google.android.gms.internal.AbstractC7489ok
        /* renamed from: a */
        public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
            Class m14171a = c7597po.m14171a();
            if (!Enum.class.isAssignableFrom(m14171a) || m14171a == Enum.class) {
                return null;
            }
            if (!m14171a.isEnum()) {
                m14171a = (Class<? super Object>) m14171a.getSuperclass();
            }
            return new C7596a(m14171a);
        }
    };

    /* renamed from: com.google.android.gms.internal.pn$a */
    /* loaded from: classes2.dex */
    private static final class C7596a<T extends Enum<T>> extends AbstractC7488oj<T> {

        /* renamed from: a */
        private final Map<String, T> f25157a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f25158b = new HashMap();

        public C7596a(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    AbstractC7491om abstractC7491om = (AbstractC7491om) cls.getField(name).getAnnotation(AbstractC7491om.class);
                    if (abstractC7491om != null) {
                        name = abstractC7491om.m14334a();
                        String[] m14333b = abstractC7491om.m14333b();
                        for (String str : m14333b) {
                            this.f25157a.put(str, t);
                        }
                    }
                    String str2 = name;
                    this.f25157a.put(str2, t);
                    this.f25158b.put(t, str2);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError();
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public T mo14172b(C7598pp c7598pp) {
            if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            return this.f25157a.get(c7598pp.mo14144h());
        }

        /* renamed from: a */
        public void m14174a(C7602ps c7602ps, T t) {
            c7602ps.mo14105b(t == null ? null : this.f25158b.get(t));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo14173a(C7602ps c7602ps, Object obj) {
            m14174a(c7602ps, (C7602ps) ((Enum) obj));
        }
    }

    /* renamed from: a */
    public static <TT> AbstractC7489ok m14231a(final C7597po<TT> c7597po, final AbstractC7488oj<TT> abstractC7488oj) {
        return new AbstractC7489ok() { // from class: com.google.android.gms.internal.pn.13
            @Override // com.google.android.gms.internal.AbstractC7489ok
            /* renamed from: a */
            public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po2) {
                if (c7597po2.equals(C7597po.this)) {
                    return abstractC7488oj;
                }
                return null;
            }
        };
    }

    /* renamed from: a */
    public static <TT> AbstractC7489ok m14230a(final Class<TT> cls, final AbstractC7488oj<TT> abstractC7488oj) {
        return new AbstractC7489ok() { // from class: com.google.android.gms.internal.pn.14
            @Override // com.google.android.gms.internal.AbstractC7489ok
            /* renamed from: a */
            public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
                if (c7597po.m14171a() == cls) {
                    return abstractC7488oj;
                }
                return null;
            }

            public String toString() {
                String valueOf = String.valueOf(cls.getName());
                String valueOf2 = String.valueOf(abstractC7488oj);
                return new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(valueOf2).length()).append("Factory[type=").append(valueOf).append(",adapter=").append(valueOf2).append("]").toString();
            }
        };
    }

    /* renamed from: a */
    public static <TT> AbstractC7489ok m14229a(final Class<TT> cls, final Class<TT> cls2, final AbstractC7488oj<? super TT> abstractC7488oj) {
        return new AbstractC7489ok() { // from class: com.google.android.gms.internal.pn.15
            @Override // com.google.android.gms.internal.AbstractC7489ok
            /* renamed from: a */
            public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
                Class<? super T> m14171a = c7597po.m14171a();
                if (m14171a == cls || m14171a == cls2) {
                    return abstractC7488oj;
                }
                return null;
            }

            public String toString() {
                String valueOf = String.valueOf(cls2.getName());
                String valueOf2 = String.valueOf(cls.getName());
                String valueOf3 = String.valueOf(abstractC7488oj);
                return new StringBuilder(String.valueOf(valueOf).length() + 24 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append("Factory[type=").append(valueOf).append(AbstractC11759f.f37105b).append(valueOf2).append(",adapter=").append(valueOf3).append("]").toString();
            }
        };
    }

    /* renamed from: b */
    public static <TT> AbstractC7489ok m14228b(final Class<TT> cls, final AbstractC7488oj<TT> abstractC7488oj) {
        return new AbstractC7489ok() { // from class: com.google.android.gms.internal.pn.18
            @Override // com.google.android.gms.internal.AbstractC7489ok
            /* renamed from: a */
            public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
                if (cls.isAssignableFrom(c7597po.m14171a())) {
                    return abstractC7488oj;
                }
                return null;
            }

            public String toString() {
                String valueOf = String.valueOf(cls.getName());
                String valueOf2 = String.valueOf(abstractC7488oj);
                return new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length()).append("Factory[typeHierarchy=").append(valueOf).append(",adapter=").append(valueOf2).append("]").toString();
            }
        };
    }

    /* renamed from: b */
    public static <TT> AbstractC7489ok m14227b(final Class<TT> cls, final Class<? extends TT> cls2, final AbstractC7488oj<? super TT> abstractC7488oj) {
        return new AbstractC7489ok() { // from class: com.google.android.gms.internal.pn.17
            @Override // com.google.android.gms.internal.AbstractC7489ok
            /* renamed from: a */
            public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
                Class<? super T> m14171a = c7597po.m14171a();
                if (m14171a == cls || m14171a == cls2) {
                    return abstractC7488oj;
                }
                return null;
            }

            public String toString() {
                String valueOf = String.valueOf(cls.getName());
                String valueOf2 = String.valueOf(cls2.getName());
                String valueOf3 = String.valueOf(abstractC7488oj);
                return new StringBuilder(String.valueOf(valueOf).length() + 24 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append("Factory[type=").append(valueOf).append(AbstractC11759f.f37105b).append(valueOf2).append(",adapter=").append(valueOf3).append("]").toString();
            }
        };
    }
}
