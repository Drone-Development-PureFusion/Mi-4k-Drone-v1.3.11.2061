package it.p273a.p274a.p277c;

import com.xiaomi.mipush.sdk.Constants;
import it.p273a.p274a.AbstractC10879r;
import it.p273a.p274a.C10875n;
import it.p273a.p274a.C10878q;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.p286a.p287a.p299f.p302c.C11125l;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p052m.p053a.C0612f;
/* renamed from: it.a.a.c.e */
/* loaded from: classes.dex */
public class C10864e implements AbstractC10879r {

    /* renamed from: a */
    private static final Pattern f34817a = Pattern.compile("^([dl\\-])[r\\-][w\\-][xSs\\-][r\\-][w\\-][xSs\\-][r\\-][w\\-][xTt\\-]\\s+(?:\\d+\\s+)?\\S+\\s*\\S+\\s+(\\d+)\\s+(?:(\\w{3})\\s+(\\d{1,2}))\\s+(?:(\\d{4})|(?:(\\d{1,2}):(\\d{1,2})))\\s+([^\\\\*?\"<>|]+)(?: -> ([^\\\\*?\"<>|]+))?$");

    /* renamed from: b */
    private static final DateFormat f34818b = new SimpleDateFormat("MMM dd yyyy HH:mm", Locale.US);

    @Override // it.p273a.p274a.AbstractC10879r
    /* renamed from: a */
    public C10875n[] mo2983a(String[] strArr) {
        boolean z;
        Date parse;
        Date date;
        int length = strArr.length;
        if (length == 0) {
            return new C10875n[0];
        }
        if (strArr[0].startsWith("total")) {
            length--;
            String[] strArr2 = new String[length];
            for (int i = 0; i < length; i++) {
                strArr2[i] = strArr[i + 1];
            }
            strArr = strArr2;
        }
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1);
        C10875n[] c10875nArr = new C10875n[length];
        for (int i3 = 0; i3 < length; i3++) {
            Matcher matcher = f34817a.matcher(strArr[i3]);
            if (!matcher.matches()) {
                throw new C10878q();
            }
            c10875nArr[i3] = new C10875n();
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            String group4 = matcher.group(4);
            String group5 = matcher.group(5);
            String group6 = matcher.group(6);
            String group7 = matcher.group(7);
            String group8 = matcher.group(8);
            String group9 = matcher.group(9);
            if (group.equals(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                c10875nArr[i3].m2992a(0);
            } else if (group.equals(C0612f.f1063a)) {
                c10875nArr[i3].m2992a(1);
            } else if (!group.equals("l")) {
                throw new C10878q();
            } else {
                c10875nArr[i3].m2992a(2);
                c10875nArr[i3].m2987b(group9);
            }
            try {
                c10875nArr[i3].m2991a(Long.parseLong(group2));
                if (group4.length() == 1) {
                    group4 = new StringBuffer().append("0").append(group4).toString();
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(group3);
                stringBuffer.append(C11125l.f35805c);
                stringBuffer.append(group4);
                stringBuffer.append(C11125l.f35805c);
                if (group5 == null) {
                    stringBuffer.append(i2);
                    z = true;
                } else {
                    stringBuffer.append(group5);
                    z = false;
                }
                stringBuffer.append(C11125l.f35805c);
                if (group6 == null || group7 == null) {
                    stringBuffer.append("00:00");
                } else {
                    if (group6.length() == 1) {
                        group6 = new StringBuffer().append("0").append(group6).toString();
                    }
                    if (group7.length() == 1) {
                        group7 = new StringBuffer().append("0").append(group7).toString();
                    }
                    stringBuffer.append(group6);
                    stringBuffer.append(C0494h.f680A);
                    stringBuffer.append(group7);
                }
                try {
                    synchronized (f34818b) {
                        parse = f34818b.parse(stringBuffer.toString());
                    }
                    if (z) {
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(parse);
                        if (calendar2.after(calendar) && calendar2.getTimeInMillis() - calendar.getTimeInMillis() > 86400000) {
                            calendar2.set(1, i2 - 1);
                            date = calendar2.getTime();
                            c10875nArr[i3].m2989a(date);
                            c10875nArr[i3].m2990a(group8);
                        }
                    }
                    date = parse;
                    c10875nArr[i3].m2989a(date);
                    c10875nArr[i3].m2990a(group8);
                } catch (ParseException e) {
                    throw new C10878q();
                }
            } finally {
                C10878q c10878q = new C10878q();
            }
        }
        return c10875nArr;
    }
}
