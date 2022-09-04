package com.google.android.gms.drive;

import com.google.android.gms.common.data.AbstractC4527f;
import com.google.android.gms.drive.metadata.AbstractC4991a;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.ajw;
import com.google.android.gms.internal.ajy;
import com.google.android.gms.internal.aka;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
/* renamed from: com.google.android.gms.drive.l */
/* loaded from: classes2.dex */
public abstract class AbstractC4988l implements AbstractC4527f<AbstractC4988l> {

    /* renamed from: a */
    public static final int f17972a = 0;

    /* renamed from: b */
    public static final int f17973b = 1;

    /* renamed from: A */
    public boolean m22211A() {
        Boolean bool = (Boolean) mo22176a(ajw.f22090r);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: B */
    public boolean m22210B() {
        Boolean bool = (Boolean) mo22176a(ajw.f22091s);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: C */
    public boolean m22209C() {
        Boolean bool = (Boolean) mo22176a(ajw.f22060E);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: D */
    public boolean m22208D() {
        Boolean bool = (Boolean) mo22176a(ajw.f22063H);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: E */
    public boolean m22207E() {
        Boolean bool = (Boolean) mo22176a(ajw.f22094v);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: F */
    public boolean m22206F() {
        Boolean bool = (Boolean) mo22176a(ajw.f22086n);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: G */
    public boolean m22205G() {
        Boolean bool = (Boolean) mo22176a(ajw.f22095w);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    public abstract <T> T mo22176a(AbstractC4991a<T> abstractC4991a);

    /* renamed from: c */
    public String m22204c() {
        return (String) mo22176a(ajw.f22074b);
    }

    /* renamed from: d */
    public int m22203d() {
        Integer num = (Integer) mo22176a(aka.f22107a);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: e */
    public Date m22202e() {
        return (Date) mo22176a(ajy.f22100a);
    }

    /* renamed from: f */
    public Map<CustomPropertyKey, String> m22201f() {
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) mo22176a(ajw.f22075c);
        return appVisibleCustomProperties == null ? Collections.emptyMap() : appVisibleCustomProperties.m22162a();
    }

    /* renamed from: g */
    public String m22200g() {
        return (String) mo22176a(ajw.f22076d);
    }

    /* renamed from: h */
    public DriveId m22199h() {
        return (DriveId) mo22176a(ajw.f22073a);
    }

    /* renamed from: i */
    public String m22198i() {
        return (String) mo22176a(ajw.f22077e);
    }

    /* renamed from: j */
    public String m22197j() {
        return (String) mo22176a(ajw.f22078f);
    }

    /* renamed from: k */
    public long m22196k() {
        return ((Long) mo22176a(ajw.f22079g)).longValue();
    }

    /* renamed from: l */
    public Date m22195l() {
        return (Date) mo22176a(ajy.f22101b);
    }

    /* renamed from: m */
    public String m22194m() {
        return (String) mo22176a(ajw.f22096x);
    }

    /* renamed from: n */
    public Date m22193n() {
        return (Date) mo22176a(ajy.f22103d);
    }

    /* renamed from: o */
    public Date m22192o() {
        return (Date) mo22176a(ajy.f22102c);
    }

    /* renamed from: p */
    public String m22191p() {
        return (String) mo22176a(ajw.f22097y);
    }

    /* renamed from: q */
    public boolean m22190q() {
        Boolean bool = (Boolean) mo22176a(aka.f22108b);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: r */
    public boolean m22189r() {
        Boolean bool = (Boolean) mo22176a(ajw.f22088p);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: s */
    public long m22188s() {
        return ((Long) mo22176a(ajw.f22059D)).longValue();
    }

    /* renamed from: t */
    public Date m22187t() {
        return (Date) mo22176a(ajy.f22104e);
    }

    /* renamed from: u */
    public String m22186u() {
        return (String) mo22176a(ajw.f22062G);
    }

    /* renamed from: v */
    public String m22185v() {
        return (String) mo22176a(ajw.f22064I);
    }

    /* renamed from: w */
    public String m22184w() {
        return (String) mo22176a(ajw.f22065J);
    }

    /* renamed from: x */
    public boolean m22183x() {
        Boolean bool = (Boolean) mo22176a(ajw.f22083k);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: y */
    public boolean m22182y() {
        Boolean bool = (Boolean) mo22176a(ajw.f22085m);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: z */
    public boolean m22181z() {
        return AbstractC4836f.f17636b_.equals(m22194m());
    }
}
