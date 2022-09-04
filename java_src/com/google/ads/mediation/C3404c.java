package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.C3392a;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
@Deprecated
/* renamed from: com.google.ads.mediation.c */
/* loaded from: classes.dex */
public class C3404c {

    /* renamed from: a */
    private final Date f13660a;

    /* renamed from: b */
    private final C3392a.EnumC3394b f13661b;

    /* renamed from: c */
    private final Set<String> f13662c;

    /* renamed from: d */
    private final boolean f13663d;

    /* renamed from: e */
    private final Location f13664e;

    public C3404c(Date date, C3392a.EnumC3394b enumC3394b, Set<String> set, boolean z, Location location) {
        this.f13660a = date;
        this.f13661b = enumC3394b;
        this.f13662c = set;
        this.f13663d = z;
        this.f13664e = location;
    }

    /* renamed from: a */
    public Integer m27921a() {
        if (this.f13660a != null) {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTime(this.f13660a);
            Integer valueOf = Integer.valueOf(calendar2.get(1) - calendar.get(1));
            return (calendar2.get(2) < calendar.get(2) || (calendar2.get(2) == calendar.get(2) && calendar2.get(5) < calendar.get(5))) ? Integer.valueOf(valueOf.intValue() - 1) : valueOf;
        }
        return null;
    }

    /* renamed from: b */
    public Date m27920b() {
        return this.f13660a;
    }

    /* renamed from: c */
    public C3392a.EnumC3394b m27919c() {
        return this.f13661b;
    }

    /* renamed from: d */
    public Set<String> m27918d() {
        return this.f13662c;
    }

    /* renamed from: e */
    public Location m27917e() {
        return this.f13664e;
    }

    /* renamed from: f */
    public boolean m27916f() {
        return this.f13663d;
    }
}
