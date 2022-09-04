package p005b.p006a.p007a.p029b.p052m.p053a;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p055o.C0662f;
/* renamed from: b.a.a.b.m.a.o */
/* loaded from: classes.dex */
public class C0624o extends GregorianCalendar {

    /* renamed from: a */
    static final TimeZone f1096a = TimeZone.getTimeZone("GMT");
    private static final long serialVersionUID = -5937537740925066161L;

    /* renamed from: b */
    EnumC0622m f1097b = EnumC0622m.ERRONEOUS;

    public C0624o() {
    }

    public C0624o(TimeZone timeZone, Locale locale) {
        super(timeZone, locale);
    }

    /* renamed from: a */
    private void m38686a(EnumC0622m enumC0622m) {
        this.f1097b = enumC0622m;
    }

    /* renamed from: b */
    public static int m38681b(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException("startTime cannot be larger than endTime");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        return (calendar2.get(2) - calendar.get(2)) + ((calendar2.get(1) - calendar.get(1)) * 12);
    }

    /* renamed from: a */
    public long m38687a(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException("Start cannot come before end");
        }
        long j3 = j2 - j;
        switch (this.f1097b) {
            case TOP_OF_MILLISECOND:
                return j3;
            case TOP_OF_SECOND:
                return j3 / 1000;
            case TOP_OF_MINUTE:
                return j3 / 60000;
            case TOP_OF_HOUR:
                return ((int) j3) / C0494h.f704Y;
            case HALF_DAY:
            default:
                throw new IllegalStateException("Unknown periodicity type.");
            case TOP_OF_DAY:
                return j3 / 86400000;
            case TOP_OF_WEEK:
                return j3 / 604800000;
            case TOP_OF_MONTH:
                return m38681b(j, j2);
        }
    }

    /* renamed from: a */
    public long m38683a(Date date) {
        return m38679b(date).getTime();
    }

    /* renamed from: a */
    public EnumC0622m m38688a() {
        return this.f1097b;
    }

    /* renamed from: a */
    public Date m38682a(Date date, int i) {
        setTime(date);
        switch (this.f1097b) {
            case TOP_OF_MILLISECOND:
                add(14, i);
                break;
            case TOP_OF_SECOND:
                set(14, 0);
                add(13, i);
                break;
            case TOP_OF_MINUTE:
                set(13, 0);
                set(14, 0);
                add(12, i);
                break;
            case TOP_OF_HOUR:
                set(12, 0);
                set(13, 0);
                set(14, 0);
                add(11, i);
                break;
            case HALF_DAY:
            default:
                throw new IllegalStateException("Unknown periodicity type.");
            case TOP_OF_DAY:
                set(11, 0);
                set(12, 0);
                set(13, 0);
                set(14, 0);
                add(5, i);
                break;
            case TOP_OF_WEEK:
                set(7, getFirstDayOfWeek());
                set(11, 0);
                set(12, 0);
                set(13, 0);
                set(14, 0);
                add(3, i);
                break;
            case TOP_OF_MONTH:
                set(5, 1);
                set(11, 0);
                set(12, 0);
                set(13, 0);
                set(14, 0);
                add(2, i);
                break;
        }
        return getTime();
    }

    /* renamed from: a */
    public void m38685a(C0662f c0662f) {
        switch (this.f1097b) {
            case TOP_OF_MILLISECOND:
                c0662f.mo38543d("Roll-over every millisecond.");
                return;
            case TOP_OF_SECOND:
                c0662f.mo38543d("Roll-over every second.");
                return;
            case TOP_OF_MINUTE:
                c0662f.mo38543d("Roll-over every minute.");
                return;
            case TOP_OF_HOUR:
                c0662f.mo38543d("Roll-over at the top of every hour.");
                return;
            case HALF_DAY:
                c0662f.mo38543d("Roll-over at midday and midnight.");
                return;
            case TOP_OF_DAY:
                c0662f.mo38543d("Roll-over at midnight.");
                return;
            case TOP_OF_WEEK:
                c0662f.mo38543d("Rollover at the start of week.");
                return;
            case TOP_OF_MONTH:
                c0662f.mo38543d("Rollover at start of every month.");
                return;
            default:
                c0662f.mo38543d("Unknown periodicity.");
                return;
        }
    }

    /* renamed from: a */
    public void m38684a(String str) {
        this.f1097b = m38680b(str);
    }

    /* renamed from: b */
    public EnumC0622m m38680b(String str) {
        EnumC0622m[] enumC0622mArr;
        C0624o c0624o = new C0624o(f1096a, Locale.getDefault());
        Date date = new Date(0L);
        if (str != null) {
            for (EnumC0622m enumC0622m : EnumC0622m.f1093j) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
                simpleDateFormat.setTimeZone(f1096a);
                String format = simpleDateFormat.format(date);
                c0624o.m38686a(enumC0622m);
                String format2 = simpleDateFormat.format(new Date(c0624o.m38683a(date)));
                if (format != null && format2 != null && !format.equals(format2)) {
                    return enumC0622m;
                }
            }
        }
        return EnumC0622m.ERRONEOUS;
    }

    /* renamed from: b */
    public Date m38679b(Date date) {
        return m38682a(date, 1);
    }
}
