package com.google.android.gms.internal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/* renamed from: com.google.android.gms.internal.pd */
/* loaded from: classes2.dex */
public final class C7541pd extends AbstractC7488oj<Date> {

    /* renamed from: a */
    public static final AbstractC7489ok f25055a = new AbstractC7489ok() { // from class: com.google.android.gms.internal.pd.1
        @Override // com.google.android.gms.internal.AbstractC7489ok
        /* renamed from: a */
        public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
            if (c7597po.m14171a() == Date.class) {
                return new C7541pd();
            }
            return null;
        }
    };

    /* renamed from: b */
    private final DateFormat f25056b = DateFormat.getDateTimeInstance(2, 2, Locale.US);

    /* renamed from: c */
    private final DateFormat f25057c = DateFormat.getDateTimeInstance(2, 2);

    /* renamed from: d */
    private final DateFormat f25058d = m14264a();

    /* renamed from: a */
    private static DateFormat m14264a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    /* renamed from: a */
    private synchronized Date m14261a(String str) {
        Date parse;
        try {
            parse = this.f25057c.parse(str);
        } catch (ParseException e) {
            try {
                parse = this.f25056b.parse(str);
            } catch (ParseException e2) {
                try {
                    parse = this.f25058d.parse(str);
                } catch (ParseException e3) {
                    throw new C7481og(str, e3);
                }
            }
        }
        return parse;
    }

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a */
    public Date mo14172b(C7598pp c7598pp) {
        if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
            c7598pp.mo14142j();
            return null;
        }
        return m14261a(c7598pp.mo14144h());
    }

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public synchronized void mo14173a(C7602ps c7602ps, Date date) {
        if (date == null) {
            c7602ps.mo14095f();
        } else {
            c7602ps.mo14105b(this.f25056b.format(date));
        }
    }
}
