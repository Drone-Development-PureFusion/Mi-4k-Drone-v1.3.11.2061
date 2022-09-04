package it.p273a.p274a.p277c;

import it.p273a.p274a.AbstractC10879r;
import it.p273a.p274a.C10875n;
import it.p273a.p274a.C10878q;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.StringTokenizer;
/* renamed from: it.a.a.c.c */
/* loaded from: classes.dex */
public class C10862c implements AbstractC10879r {

    /* renamed from: a */
    private static final DateFormat f34813a = new SimpleDateFormat("yyyyMMddhhmmss.SSS Z");

    /* renamed from: b */
    private static final DateFormat f34814b = new SimpleDateFormat("yyyyMMddhhmmss Z");

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0109 -> B:58:0x010a). Please submit an issue!!! */
    /* renamed from: a */
    private C10875n m3024a(String str) {
        int i;
        Date date;
        long j;
        long j2 = 0;
        Date date2 = null;
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreElements()) {
            String trim = stringTokenizer.nextToken().trim();
            if (trim.length() > 0) {
                arrayList.add(trim);
            }
        }
        if (arrayList.size() == 0) {
            throw new C10878q();
        }
        String str2 = (String) arrayList.remove(arrayList.size() - 1);
        Properties properties = new Properties();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            int indexOf = str3.indexOf(61);
            if (indexOf == -1) {
                throw new C10878q();
            }
            String trim2 = str3.substring(0, indexOf).trim();
            String trim3 = str3.substring(indexOf + 1, str3.length()).trim();
            if (trim2.length() == 0 || trim3.length() == 0) {
                throw new C10878q();
            }
            properties.setProperty(trim2, trim3);
        }
        String property = properties.getProperty("type");
        if (property == null) {
            throw new C10878q();
        }
        if ("file".equalsIgnoreCase(property)) {
            i = 0;
        } else if (!"dir".equalsIgnoreCase(property)) {
            if ("cdir".equalsIgnoreCase(property) || "pdir".equalsIgnoreCase(property)) {
            }
            return null;
        } else {
            i = 1;
        }
        String property2 = properties.getProperty("modify");
        if (property2 != null) {
            String stringBuffer = new StringBuffer().append(property2).append(" +0000").toString();
            try {
                synchronized (f34813a) {
                    try {
                        date = f34813a.parse(stringBuffer);
                        try {
                        } catch (Throwable th) {
                            date2 = date;
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                throw th;
            } catch (ParseException e) {
                try {
                    try {
                        synchronized (f34814b) {
                            date = f34814b.parse(stringBuffer);
                            try {
                            } catch (Throwable th3) {
                                date2 = date;
                                th = th3;
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (ParseException e2) {
                    date = date2;
                }
            }
        } else {
            date = null;
        }
        String property3 = properties.getProperty("size");
        if (property3 != null) {
            try {
                j = Long.parseLong(property3);
            } catch (NumberFormatException e3) {
                j = 0;
            }
            if (j >= 0) {
                j2 = j;
            }
        }
        C10875n c10875n = new C10875n();
        c10875n.m2992a(i);
        c10875n.m2989a(date);
        c10875n.m2991a(j2);
        c10875n.m2990a(str2);
        return c10875n;
    }

    @Override // it.p273a.p274a.AbstractC10879r
    /* renamed from: a */
    public C10875n[] mo2983a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            C10875n m3024a = m3024a(str);
            if (m3024a != null) {
                arrayList.add(m3024a);
            }
        }
        int size = arrayList.size();
        C10875n[] c10875nArr = new C10875n[size];
        for (int i = 0; i < size; i++) {
            c10875nArr[i] = (C10875n) arrayList.get(i);
        }
        return c10875nArr;
    }
}
