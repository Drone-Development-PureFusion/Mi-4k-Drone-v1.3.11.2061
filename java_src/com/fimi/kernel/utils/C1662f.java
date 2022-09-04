package com.fimi.kernel.utils;

import com.fimi.soul.module.setting.newhand.C2954b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/* renamed from: com.fimi.kernel.utils.f */
/* loaded from: classes.dex */
public class C1662f {

    /* renamed from: a */
    public static final String f4111a = "yyyy-MM-dd HH:mm:ss";

    /* renamed from: b */
    public static final String f4112b = "yyyy-MM-dd";

    /* renamed from: c */
    public static final String f4113c = "yyyy-MM";

    /* renamed from: d */
    public static final String f4114d = "yyyy-MM-dd HH:mm";

    /* renamed from: e */
    public static final String f4115e = "yyyyMMddHHmmss";

    /* renamed from: f */
    public static final String f4116f = "MM/dd";

    /* renamed from: g */
    public static final String f4117g = "HH:mm:ss";

    /* renamed from: h */
    public static final String f4118h = "HH:mm";

    /* renamed from: i */
    public static final String f4119i = "AM";

    /* renamed from: j */
    public static final String f4120j = "PM";

    /* renamed from: a */
    public static int m34792a(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        int i = calendar.get(1);
        int i2 = calendar2.get(1);
        int i3 = calendar.get(6);
        int i4 = calendar2.get(6);
        if (i - i2 > 0) {
            return calendar2.getActualMaximum(6) + (i3 - i4);
        }
        if (i - i2 >= 0) {
            return i3 - i4;
        }
        return (i3 - i4) - calendar.getActualMaximum(6);
    }

    /* renamed from: a */
    public static long m34795a() {
        try {
            return m34787a(m34790a("yyyy-MM-dd") + " 00:00:00", "yyyy-MM-dd HH:mm:ss").getTime();
        } catch (Exception e) {
            return -1L;
        }
    }

    /* renamed from: a */
    public static String m34793a(long j) {
        if (j > 1000) {
            if ((j / 1000) / 60 <= 1) {
                return (j / 1000) + "秒";
            }
            return ((j / 1000) / 60) + "分" + ((j / 1000) % 60) + "秒";
        }
        return j + "毫秒";
    }

    /* renamed from: a */
    public static String m34791a(long j, String str) {
        try {
            return new SimpleDateFormat(str).format(Long.valueOf(j));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m34790a(String str) {
        C1670k.m34711a(C1662f.class, "getCurrentDate:" + str);
        try {
            return new SimpleDateFormat(str).format(new GregorianCalendar().getTime());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static String m34789a(String str, int i) {
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            int i2 = gregorianCalendar.get(7);
            if (i2 == i) {
                return simpleDateFormat.format(gregorianCalendar.getTime());
            }
            int i3 = i - i2;
            if (i == 1) {
                i3 = 7 - Math.abs(i3);
            }
            gregorianCalendar.add(5, i3);
            return simpleDateFormat.format(gregorianCalendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m34788a(String str, int i, int i2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.add(i, i2);
            return simpleDateFormat.format(gregorianCalendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m34786a(String str, String str2, int i, int i2) {
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
            gregorianCalendar.setTime(simpleDateFormat.parse(str));
            gregorianCalendar.add(i, i2);
            return simpleDateFormat.format(gregorianCalendar.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m34784a(Date date, String str) {
        try {
            return new SimpleDateFormat(str).format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m34783a(Date date, String str, int i, int i2) {
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            gregorianCalendar.setTime(date);
            gregorianCalendar.add(i, i2);
            return simpleDateFormat.format(gregorianCalendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static Date m34787a(String str, String str2) {
        try {
            return new SimpleDateFormat(str2).parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m34782a(String[] strArr) {
        System.out.println(m34775c("2012-3-2 12:2:20", "MM月dd日  HH:mm"));
    }

    /* renamed from: a */
    public static boolean m34794a(int i) {
        return (i % 4 == 0 && i % C2954b.f10826ao != 0) || i % C2954b.f10826ao == 0;
    }

    /* renamed from: b */
    public static int m34780b(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return (calendar.get(11) - calendar2.get(11)) + (m34792a(j, j2) * 24);
    }

    /* renamed from: b */
    public static long m34781b() {
        try {
            return m34787a(m34790a("yyyy-MM-dd") + " 24:00:00", "yyyy-MM-dd HH:mm:ss").getTime();
        } catch (Exception e) {
            return -1L;
        }
    }

    /* renamed from: b */
    public static String m34779b(String str) {
        return m34789a(str, 2);
    }

    /* renamed from: b */
    public static String m34778b(String str, String str2) {
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str));
            return new SimpleDateFormat(str2).format(gregorianCalendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static int m34777c(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return (calendar.get(12) - calendar2.get(12)) + (m34780b(j, j2) * 60);
    }

    /* renamed from: c */
    public static String m34776c(String str) {
        return m34789a(str, 1);
    }

    /* renamed from: c */
    public static String m34775c(String str, String str2) {
        int m34792a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        try {
            calendar2.setTime(simpleDateFormat.parse(str));
            calendar.setTime(new Date());
            m34792a = m34792a(calendar.getTimeInMillis(), calendar2.getTimeInMillis());
        } catch (Exception e) {
        }
        if (m34792a == 0) {
            int m34780b = m34780b(calendar.getTimeInMillis(), calendar2.getTimeInMillis());
            if (m34780b > 0) {
                str = "今天" + m34778b(str, f4118h);
            } else if (m34780b >= 0 && m34780b == 0) {
                int m34777c = m34777c(calendar.getTimeInMillis(), calendar2.getTimeInMillis());
                if (m34777c > 0) {
                    str = m34777c + "分钟前";
                } else if (m34777c >= 0) {
                    str = "刚刚";
                }
            }
            return str;
        } else if (m34792a <= 0 ? m34792a >= 0 || m34792a == -1 || m34792a == -2 : m34792a == 1 || m34792a == 2) {
        }
        String m34778b = m34778b(str, str2);
        if (!C1673n.m34653b(m34778b)) {
            str = m34778b;
        }
        return str;
    }

    /* renamed from: d */
    public static String m34774d(String str) {
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            gregorianCalendar.set(5, 1);
            return simpleDateFormat.format(gregorianCalendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static String m34773d(String str, String str2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        try {
            gregorianCalendar.setTime(new SimpleDateFormat(str2).parse(str));
            switch (gregorianCalendar.get(7) - 1) {
                case 0:
                    return "星期日";
                case 1:
                    return "星期一";
                case 2:
                    return "星期二";
                case 3:
                    return "星期三";
                case 4:
                    return "星期四";
                case 5:
                    return "星期五";
                case 6:
                    return "星期六";
                default:
                    return "星期日";
            }
        } catch (Exception e) {
            return "错误";
        }
    }

    /* renamed from: e */
    public static String m34772e(String str) {
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            gregorianCalendar.set(5, 1);
            gregorianCalendar.roll(5, -1);
            return simpleDateFormat.format(gregorianCalendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static String m34771e(String str, String str2) {
        return m34787a(str, str2).getHours() >= 12 ? f4120j : f4119i;
    }

    /* renamed from: a */
    public Date m34785a(Date date, int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        try {
            gregorianCalendar.setTime(date);
            gregorianCalendar.add(i, i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gregorianCalendar.getTime();
    }
}
