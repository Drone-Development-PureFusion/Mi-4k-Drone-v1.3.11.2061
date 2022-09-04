package com.fimi.kernel.p158b;

import com.fimi.kernel.p158b.p159a.C1589b;
import com.fimi.kernel.p158b.p160b.C1615e;
import com.fimi.kernel.p158b.p162d.C1629c;
import com.fimi.kernel.p158b.p163e.C1634b;
/* renamed from: com.fimi.kernel.b.c */
/* loaded from: classes.dex */
public final class C1620c {
    /* renamed from: a */
    public static AbstractC1598b m34954a(EnumC1626d enumC1626d) {
        switch (enumC1626d) {
            case Ftp:
                return C1589b.m35080b();
            case Volley:
                return new C1634b();
            case Socket:
                return new C1629c();
            case Http:
                return new C1615e();
            default:
                return null;
        }
    }
}
