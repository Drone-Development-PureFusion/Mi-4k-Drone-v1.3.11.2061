package org.p286a.p287a.p290c.p296f;

import java.lang.ref.SoftReference;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.c.f.b */
/* loaded from: classes2.dex */
public final class C11071b {

    /* renamed from: f */
    private static final Date f35633f;

    /* renamed from: a */
    public static final String f35628a = "EEE, dd MMM yyyy HH:mm:ss zzz";

    /* renamed from: b */
    public static final String f35629b = "EEE, dd-MMM-yy HH:mm:ss zzz";

    /* renamed from: c */
    public static final String f35630c = "EEE MMM d HH:mm:ss yyyy";

    /* renamed from: e */
    private static final String[] f35632e = {f35628a, f35629b, f35630c};

    /* renamed from: d */
    public static final TimeZone f35631d = TimeZone.getTimeZone("GMT");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.a.a.c.f.b$a */
    /* loaded from: classes2.dex */
    public static final class C11072a {

        /* renamed from: a */
        private static final ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> f35634a = new ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>>() { // from class: org.a.a.c.f.b.a.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: a */
            public SoftReference<Map<String, SimpleDateFormat>> initialValue() {
                return new SoftReference<>(new HashMap());
            }
        };

        C11072a() {
        }

        /* renamed from: a */
        public static SimpleDateFormat m2148a(String str) {
            HashMap hashMap;
            Map<String, SimpleDateFormat> map = f35634a.get().get();
            if (map == null) {
                HashMap hashMap2 = new HashMap();
                f35634a.set(new SoftReference<>(hashMap2));
                hashMap = hashMap2;
            } else {
                hashMap = map;
            }
            SimpleDateFormat simpleDateFormat = hashMap.get(str);
            if (simpleDateFormat == null) {
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
                simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
                hashMap.put(str, simpleDateFormat2);
                return simpleDateFormat2;
            }
            return simpleDateFormat;
        }

        /* renamed from: a */
        public static void m2149a() {
            f35634a.remove();
        }
    }

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(f35631d);
        calendar.set(2000, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        f35633f = calendar.getTime();
    }

    private C11071b() {
    }

    /* renamed from: a */
    public static String m2151a(Date date) {
        return m2150a(date, f35628a);
    }

    /* renamed from: a */
    public static String m2150a(Date date, String str) {
        C11354a.m1321a(date, "Date");
        C11354a.m1321a(str, "Pattern");
        return C11072a.m2148a(str).format(date);
    }

    /* renamed from: a */
    public static Date m2154a(String str) {
        return m2152a(str, null, null);
    }

    /* renamed from: a */
    public static Date m2153a(String str, String[] strArr) {
        return m2152a(str, strArr, null);
    }

    /* renamed from: a */
    public static Date m2152a(String str, String[] strArr, Date date) {
        C11354a.m1321a(str, "Date value");
        if (strArr == null) {
            strArr = f35632e;
        }
        if (date == null) {
            date = f35633f;
        }
        if (str.length() > 1 && str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1);
        }
        for (String str2 : strArr) {
            SimpleDateFormat m2148a = C11072a.m2148a(str2);
            m2148a.set2DigitYearStart(date);
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = m2148a.parse(str, parsePosition);
            if (parsePosition.getIndex() != 0) {
                return parse;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m2155a() {
        C11072a.m2149a();
    }
}
