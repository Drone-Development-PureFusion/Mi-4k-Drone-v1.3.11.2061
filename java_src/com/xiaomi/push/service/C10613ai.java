package com.xiaomi.push.service;

import android.util.Pair;
import com.xiaomi.channel.commonutils.misc.C10406b;
import com.xiaomi.xmpush.thrift.C10771ac;
import com.xiaomi.xmpush.thrift.C10773ad;
import com.xiaomi.xmpush.thrift.C10819n;
import com.xiaomi.xmpush.thrift.C10822p;
import com.xiaomi.xmpush.thrift.EnumC10807f;
import com.xiaomi.xmpush.thrift.EnumC10808g;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.xiaomi.push.service.ai */
/* loaded from: classes2.dex */
public class C10613ai {
    /* renamed from: a */
    public static int m4387a(C10612ah c10612ah, EnumC10807f enumC10807f) {
        int i = 0;
        String m4385a = m4385a(enumC10807f);
        switch (enumC10807f) {
            case MISC_CONFIG:
                i = 1;
                break;
        }
        return c10612ah.f32990a.getInt(m4385a, i);
    }

    /* renamed from: a */
    private static String m4385a(EnumC10807f enumC10807f) {
        return "oc_version_" + enumC10807f.m3436a();
    }

    /* renamed from: a */
    private static List<Pair<Integer, Object>> m4384a(List<C10822p> list, boolean z) {
        Pair pair;
        if (C10406b.m5258a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C10822p c10822p : list) {
            int m3346a = c10822p.m3346a();
            EnumC10808g m3434a = EnumC10808g.m3434a(c10822p.m3340c());
            if (m3434a != null) {
                if (!z || !c10822p.f34430c) {
                    switch (m3434a) {
                        case INT:
                            pair = new Pair(Integer.valueOf(m3346a), Integer.valueOf(c10822p.m3334f()));
                            break;
                        case LONG:
                            pair = new Pair(Integer.valueOf(m3346a), Long.valueOf(c10822p.m3331h()));
                            break;
                        case STRING:
                            pair = new Pair(Integer.valueOf(m3346a), c10822p.m3329j());
                            break;
                        case BOOLEAN:
                            pair = new Pair(Integer.valueOf(m3346a), Boolean.valueOf(c10822p.m3327l()));
                            break;
                        default:
                            pair = null;
                            break;
                    }
                    arrayList.add(pair);
                } else {
                    arrayList.add(new Pair(Integer.valueOf(m3346a), null));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m4389a(C10612ah c10612ah, C10771ac c10771ac) {
        c10612ah.m4390b(m4384a(c10771ac.m3723a(), true));
    }

    /* renamed from: a */
    public static void m4388a(C10612ah c10612ah, C10773ad c10773ad) {
        for (C10819n c10819n : c10773ad.m3717a()) {
            if (c10819n.m3356a() > m4387a(c10612ah, c10819n.m3350d())) {
                m4386a(c10612ah, c10819n.m3350d(), c10819n.m3356a());
                c10612ah.m4392a(m4384a(c10819n.f34367b, false));
            }
        }
    }

    /* renamed from: a */
    public static void m4386a(C10612ah c10612ah, EnumC10807f enumC10807f, int i) {
        c10612ah.f32990a.edit().putInt(m4385a(enumC10807f), i).commit();
    }
}
