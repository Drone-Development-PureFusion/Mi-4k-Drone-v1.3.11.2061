package com.fimi.soul.drone.p202f;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* renamed from: com.fimi.soul.drone.f.c */
/* loaded from: classes.dex */
public class C2271c {
    /* renamed from: a */
    public static String m32485a() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    /* renamed from: a */
    public static Date m32484a(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
