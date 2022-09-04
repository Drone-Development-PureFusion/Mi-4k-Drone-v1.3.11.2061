package com.google.android.gms.internal;

import android.text.TextUtils;
import com.fimi.kernel.C1576a;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.common.images.WebImage;
import com.google.zxing.client.result.optional.NDEFRecord;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class agt {

    /* renamed from: a */
    private static final C4440m f21657a = new C4440m("MetadataUtils");

    /* renamed from: b */
    private static final String[] f21658b = {"Z", "+hh", "+hhmm", "+hh:mm"};

    /* renamed from: c */
    private static final String f21659c;

    static {
        String valueOf = String.valueOf("yyyyMMdd'T'HHmmss");
        String valueOf2 = String.valueOf(f21658b[0]);
        f21659c = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    public static String m17575a(Calendar calendar) {
        if (calendar == null) {
            f21657a.m24160b("Calendar object cannot be null", new Object[0]);
            return null;
        }
        String str = f21659c;
        if (calendar.get(11) == 0 && calendar.get(12) == 0 && calendar.get(13) == 0) {
            str = "yyyyMMdd";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        simpleDateFormat.setTimeZone(calendar.getTimeZone());
        String format = simpleDateFormat.format(calendar.getTime());
        return format.endsWith("+0000") ? format.replace("+0000", f21658b[0]) : format;
    }

    /* renamed from: a */
    public static Calendar m17576a(String str) {
        if (TextUtils.isEmpty(str)) {
            f21657a.m24160b("Input string is empty or null", new Object[0]);
            return null;
        }
        String m17572b = m17572b(str);
        if (TextUtils.isEmpty(m17572b)) {
            f21657a.m24160b("Invalid date format", new Object[0]);
            return null;
        }
        String m17571c = m17571c(str);
        String str2 = "yyyyMMdd";
        if (!TextUtils.isEmpty(m17571c)) {
            String valueOf = String.valueOf(m17572b);
            m17572b = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(m17571c).length()).append(valueOf).append(NDEFRecord.TEXT_WELL_KNOWN_TYPE).append(m17571c).toString();
            str2 = m17571c.length() == "HHmmss".length() ? "yyyyMMdd'T'HHmmss" : f21659c;
        }
        Calendar gregorianCalendar = GregorianCalendar.getInstance();
        try {
            gregorianCalendar.setTime(new SimpleDateFormat(str2).parse(m17572b));
            return gregorianCalendar;
        } catch (ParseException e) {
            f21657a.m24160b("Error parsing string: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static void m17574a(List<WebImage> list, JSONObject jSONObject) {
        try {
            list.clear();
            JSONArray jSONArray = jSONObject.getJSONArray(C1576a.f3872b);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    list.add(new WebImage(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException e) {
                }
            }
        } catch (JSONException e2) {
        }
    }

    /* renamed from: a */
    public static void m17573a(JSONObject jSONObject, List<WebImage> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (WebImage webImage : list) {
            jSONArray.put(webImage.m23760e());
        }
        try {
            jSONObject.put(C1576a.f3872b, jSONArray);
        } catch (JSONException e) {
        }
    }

    /* renamed from: b */
    private static String m17572b(String str) {
        if (TextUtils.isEmpty(str)) {
            f21657a.m24160b("Input string is empty or null", new Object[0]);
            return null;
        }
        try {
            return str.substring(0, "yyyyMMdd".length());
        } catch (IndexOutOfBoundsException e) {
            f21657a.m24157c("Error extracting the date: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    private static String m17571c(String str) {
        if (TextUtils.isEmpty(str)) {
            f21657a.m24160b("string is empty or null", new Object[0]);
            return null;
        }
        int indexOf = str.indexOf(84);
        int i = indexOf + 1;
        if (indexOf != "yyyyMMdd".length()) {
            f21657a.m24160b("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            String substring = str.substring(i);
            if (substring.length() == "HHmmss".length()) {
                return substring;
            }
            switch (substring.charAt("HHmmss".length())) {
                case '+':
                case '-':
                    if (!m17570d(substring)) {
                        return null;
                    }
                    return substring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                case 'Z':
                    if (substring.length() != "HHmmss".length() + f21658b[0].length()) {
                        return null;
                    }
                    String valueOf = String.valueOf(substring.substring(0, substring.length() - 1));
                    String valueOf2 = String.valueOf("+0000");
                    return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                default:
                    return null;
            }
        } catch (IndexOutOfBoundsException e) {
            f21657a.m24160b("Error extracting the time substring: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    private static boolean m17570d(String str) {
        int length = str.length();
        int length2 = "HHmmss".length();
        return length == f21658b[1].length() + length2 || length == f21658b[2].length() + length2 || length == length2 + f21658b[3].length();
    }
}
