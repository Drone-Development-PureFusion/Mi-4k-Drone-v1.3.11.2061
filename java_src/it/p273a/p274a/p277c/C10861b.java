package it.p273a.p274a.p277c;

import com.xiaomi.mipush.sdk.Constants;
import it.p273a.p274a.AbstractC10879r;
import it.p273a.p274a.C10875n;
import it.p273a.p274a.C10878q;
import java.util.Date;
import java.util.StringTokenizer;
/* renamed from: it.a.a.c.b */
/* loaded from: classes.dex */
public class C10861b implements AbstractC10879r {
    /* renamed from: b */
    public static void m3025b(String[] strArr) {
        for (C10875n c10875n : new C10861b().mo2983a(new String[]{"+i8388621.29609,m824255902,/,\tdev", "+i8388621.44468,m839956783,r,s10376,\tRFCEPLF"})) {
            System.out.println(c10875n);
        }
    }

    @Override // it.p273a.p274a.AbstractC10879r
    /* renamed from: a */
    public C10875n[] mo2983a(String[] strArr) {
        int length = strArr.length;
        C10875n[] c10875nArr = null;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (str.charAt(0) != '+') {
                throw new C10878q();
            }
            int indexOf = str.indexOf(9);
            if (indexOf == -1) {
                throw new C10878q();
            }
            String substring = str.substring(1, indexOf);
            String substring2 = str.substring(indexOf + 1, str.length());
            Date date = null;
            boolean z = false;
            long j = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(substring, Constants.ACCEPT_TIME_SEPARATOR_SP);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int length2 = nextToken.length();
                if (length2 > 0) {
                    if (length2 != 1) {
                        char charAt = nextToken.charAt(0);
                        String substring3 = nextToken.substring(1, length2);
                        if (charAt == 's') {
                            try {
                                j = Long.parseLong(substring3);
                            } catch (Throwable th) {
                            }
                        } else if (charAt == 'm') {
                            try {
                                date = new Date(Long.parseLong(substring3) * 1000);
                            } catch (Throwable th2) {
                            }
                        }
                    } else if (nextToken.equals("/")) {
                        z = true;
                    }
                }
            }
            if (c10875nArr == null) {
                c10875nArr = new C10875n[length];
            }
            c10875nArr[i] = new C10875n();
            c10875nArr[i].m2990a(substring2);
            c10875nArr[i].m2989a(date);
            c10875nArr[i].m2991a(j);
            c10875nArr[i].m2992a(z ? 1 : 0);
        }
        return c10875nArr;
    }
}
