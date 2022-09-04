package com.google.android.gms.internal;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* renamed from: com.google.android.gms.internal.pl */
/* loaded from: classes2.dex */
public final class C7559pl extends AbstractC7488oj<Time> {

    /* renamed from: a */
    public static final AbstractC7489ok f25093a = new AbstractC7489ok() { // from class: com.google.android.gms.internal.pl.1
        @Override // com.google.android.gms.internal.AbstractC7489ok
        /* renamed from: a */
        public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
            if (c7597po.m14171a() == Time.class) {
                return new C7559pl();
            }
            return null;
        }
    };

    /* renamed from: b */
    private final DateFormat f25094b = new SimpleDateFormat("hh:mm:ss a");

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a */
    public synchronized Time mo14172b(C7598pp c7598pp) {
        Time time;
        if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
            c7598pp.mo14142j();
            time = null;
        } else {
            try {
                time = new Time(this.f25094b.parse(c7598pp.mo14144h()).getTime());
            } catch (ParseException e) {
                throw new C7481og(e);
            }
        }
        return time;
    }

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public synchronized void mo14173a(C7602ps c7602ps, Time time) {
        c7602ps.mo14105b(time == null ? null : this.f25094b.format((Date) time));
    }
}
