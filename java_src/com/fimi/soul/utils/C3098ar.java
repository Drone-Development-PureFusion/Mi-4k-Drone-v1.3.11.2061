package com.fimi.soul.utils;

import android.graphics.Point;
import com.google.firebase.p253b.C9755a;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.utils.ar */
/* loaded from: classes.dex */
public class C3098ar {
    /* renamed from: a */
    public static double m29280a(Point point, Point point2, Point point3) {
        double d;
        double d2 = point.x;
        double d3 = point.y;
        double d4 = point2.x;
        double d5 = point2.y;
        double d6 = point3.x;
        double d7 = point3.y;
        double d8 = d4 - d2;
        double d9 = d5 - d3;
        if (d8 != C9755a.f30449c || d9 != C9755a.f30449c) {
            double d10 = (((d6 - d2) * d8) + ((d7 - d3) * d9)) / ((d8 * d8) + (d9 * d9));
            if (d10 > 1.0d) {
                d3 = d5;
                d = d4;
            } else if (d10 > C9755a.f30449c) {
                d = (d8 * d10) + d2;
                d3 += d9 * d10;
            }
            double d11 = d6 - d;
            double d12 = d7 - d3;
            return (d12 * d12) + (d11 * d11);
        }
        d = d2;
        double d112 = d6 - d;
        double d122 = d7 - d3;
        return (d122 * d122) + (d112 * d112);
    }

    /* renamed from: a */
    public static List<Point> m29279a(List<Point> list, double d) {
        int i;
        double d2 = d * d;
        int size = list.size() - 1;
        double d3 = 0.0d;
        int i2 = 0;
        int i3 = 1;
        while (i3 < list.size() - 1) {
            double m29280a = m29280a(list.get(0), list.get(size), list.get(i3));
            if (m29280a > d3) {
                d3 = m29280a;
                i = i3;
            } else {
                i = i2;
            }
            i3++;
            i2 = i;
        }
        ArrayList arrayList = new ArrayList();
        if (d3 > d2) {
            List<Point> m29279a = m29279a(list.subList(0, i2 + 1), d);
            List<Point> m29279a2 = m29279a(list.subList(i2, size + 1), d);
            m29279a.remove(m29279a.size() - 1);
            arrayList.addAll(m29279a);
            arrayList.addAll(m29279a2);
        } else {
            arrayList.add(list.get(0));
            arrayList.add(list.get(size));
        }
        return arrayList;
    }
}
