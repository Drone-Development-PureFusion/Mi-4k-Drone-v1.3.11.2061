package com.google.android.gms.internal;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.google.android.gms.internal.nl */
/* loaded from: classes2.dex */
final class C7448nl implements AbstractC7470nw<Date>, AbstractC7480of<Date> {

    /* renamed from: a */
    private final DateFormat f24911a;

    /* renamed from: b */
    private final DateFormat f24912b;

    /* renamed from: c */
    private final DateFormat f24913c;

    C7448nl() {
        this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
    }

    public C7448nl(int i, int i2) {
        this(DateFormat.getDateTimeInstance(i, i2, Locale.US), DateFormat.getDateTimeInstance(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7448nl(String str) {
        this(new SimpleDateFormat(str, Locale.US), new SimpleDateFormat(str));
    }

    C7448nl(DateFormat dateFormat, DateFormat dateFormat2) {
        this.f24911a = dateFormat;
        this.f24912b = dateFormat2;
        this.f24913c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        this.f24913c.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* renamed from: a */
    private Date m14427a(AbstractC7471nx abstractC7471nx) {
        Date parse;
        synchronized (this.f24912b) {
            try {
                parse = this.f24912b.parse(abstractC7471nx.mo14348c());
            } catch (ParseException e) {
                try {
                    parse = this.f24911a.parse(abstractC7471nx.mo14348c());
                } catch (ParseException e2) {
                    try {
                        parse = this.f24913c.parse(abstractC7471nx.mo14348c());
                    } catch (ParseException e3) {
                        throw new C7481og(abstractC7471nx.mo14348c(), e3);
                    }
                }
            }
        }
        return parse;
    }

    @Override // com.google.android.gms.internal.AbstractC7480of
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public AbstractC7471nx mo14340a(Date date, Type type, AbstractC7479oe abstractC7479oe) {
        C7478od c7478od;
        synchronized (this.f24912b) {
            c7478od = new C7478od(this.f24911a.format(date));
        }
        return c7478od;
    }

    @Override // com.google.android.gms.internal.AbstractC7470nw
    /* renamed from: a */
    public Date mo14372b(AbstractC7471nx abstractC7471nx, Type type, AbstractC7469nv abstractC7469nv) {
        if (!(abstractC7471nx instanceof C7478od)) {
            throw new C7476ob("The date should be a string value");
        }
        Date m14427a = m14427a(abstractC7471nx);
        if (type == Date.class) {
            return m14427a;
        }
        if (type == Timestamp.class) {
            return new Timestamp(m14427a.getTime());
        }
        if (type == java.sql.Date.class) {
            return new java.sql.Date(m14427a.getTime());
        }
        String valueOf = String.valueOf(getClass());
        String valueOf2 = String.valueOf(type);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(valueOf2).length()).append(valueOf).append(" cannot deserialize to ").append(valueOf2).toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C7448nl.class.getSimpleName());
        sb.append(C0494h.f731s).append(this.f24912b.getClass().getSimpleName()).append(C0494h.f732t);
        return sb.toString();
    }
}
