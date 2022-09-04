package com.google.android.gms.internal;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* renamed from: com.google.android.gms.internal.pk */
/* loaded from: classes2.dex */
public final class C7557pk extends AbstractC7488oj<Date> {

    /* renamed from: a */
    public static final AbstractC7489ok f25091a = new AbstractC7489ok() { // from class: com.google.android.gms.internal.pk.1
        @Override // com.google.android.gms.internal.AbstractC7489ok
        /* renamed from: a */
        public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
            if (c7597po.m14171a() == Date.class) {
                return new C7557pk();
            }
            return null;
        }
    };

    /* renamed from: b */
    private final DateFormat f25092b = new SimpleDateFormat("MMM d, yyyy");

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a */
    public synchronized Date mo14172b(C7598pp c7598pp) {
        Date date;
        if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
            c7598pp.mo14142j();
            date = null;
        } else {
            try {
                date = new Date(this.f25092b.parse(c7598pp.mo14144h()).getTime());
            } catch (ParseException e) {
                throw new C7481og(e);
            }
        }
        return date;
    }

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public synchronized void mo14173a(C7602ps c7602ps, Date date) {
        c7602ps.mo14105b(date == null ? null : this.f25092b.format((java.util.Date) date));
    }
}
