package it.p273a.p274a.p277c;

import it.p273a.p274a.AbstractC10879r;
import it.p273a.p274a.C10875n;
import it.p273a.p274a.C10878q;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: it.a.a.c.a */
/* loaded from: classes.dex */
public class C10860a implements AbstractC10879r {

    /* renamed from: a */
    private static final Pattern f34811a = Pattern.compile("^(\\d{2})-(\\d{2})-(\\d{2})\\s+(\\d{2}):(\\d{2})(AM|PM)\\s+(<DIR>|\\d+)\\s+([^\\\\/*?\"<>|]+)$");

    /* renamed from: b */
    private static final DateFormat f34812b = new SimpleDateFormat("MM/dd/yy hh:mm a");

    @Override // it.p273a.p274a.AbstractC10879r
    /* renamed from: a */
    public C10875n[] mo2983a(String[] strArr) {
        Date parse;
        int length = strArr.length;
        C10875n[] c10875nArr = new C10875n[length];
        for (int i = 0; i < length; i++) {
            Matcher matcher = f34811a.matcher(strArr[i]);
            if (!matcher.matches()) {
                throw new C10878q();
            }
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            String group4 = matcher.group(4);
            String group5 = matcher.group(5);
            String group6 = matcher.group(6);
            String group7 = matcher.group(7);
            String group8 = matcher.group(8);
            c10875nArr[i] = new C10875n();
            c10875nArr[i].m2990a(group8);
            if (group7.equalsIgnoreCase("<DIR>")) {
                c10875nArr[i].m2992a(1);
                c10875nArr[i].m2991a(0L);
            } else {
                try {
                    long parseLong = Long.parseLong(group7);
                    c10875nArr[i].m2992a(0);
                    c10875nArr[i].m2991a(parseLong);
                } finally {
                    C10878q c10878q = new C10878q();
                }
            }
            String stringBuffer = new StringBuffer().append(group).append("/").append(group2).append("/").append(group3).append(" ").append(group4).append(":").append(group5).append(" ").append(group6).toString();
            try {
                synchronized (f34812b) {
                    parse = f34812b.parse(stringBuffer);
                }
                c10875nArr[i].m2989a(parse);
            } catch (ParseException e) {
                throw new C10878q();
            }
        }
        return c10875nArr;
    }
}
