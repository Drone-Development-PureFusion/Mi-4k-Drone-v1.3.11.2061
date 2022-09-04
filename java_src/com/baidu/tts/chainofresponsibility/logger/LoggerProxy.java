package com.baidu.tts.chainofresponsibility.logger;

import android.util.Log;
import java.util.List;
/* loaded from: classes.dex */
public class LoggerProxy {

    /* renamed from: a */
    private static C1125d f2594a = C1125d.m36542a();

    /* renamed from: a */
    public static void m36555a(String str, String str2) {
        log(7, str, str2);
    }

    public static void addPrintString(String str) {
        f2594a.m36537a(str);
    }

    public static void addPrintStrings(List<String> list) {
        f2594a.m36536a(list);
    }

    public static void addUnPrintString(String str) {
        f2594a.m36532b(str);
    }

    public static void clearHandler() {
        f2594a.m36534b();
    }

    public static void clearSpecifyStrings() {
        f2594a.m36531c();
    }

    /* renamed from: d */
    public static void m36554d(String str, String str2) {
        log(3, str, str2);
    }

    /* renamed from: e */
    public static void m36553e(String str, String str2) {
        log(6, str, str2);
    }

    /* renamed from: i */
    public static void m36552i(String str, String str2) {
        log(4, str, str2);
    }

    public static boolean isModeRelease() {
        return f2594a.m36529e();
    }

    public static void log(int i, String str, String str2) {
        try {
            f2594a.m36541a(i, str, str2);
        } catch (Exception e) {
            Log.e("LoggerProxy", "log exception=" + e.toString());
        }
    }

    public static void printable(boolean z) {
        f2594a.m36535a(z);
    }

    public static void setModeRelease() {
        f2594a.m36530d();
    }

    /* renamed from: v */
    public static void m36551v(String str, String str2) {
        log(2, str, str2);
    }

    /* renamed from: w */
    public static void m36550w(String str, String str2) {
        log(5, str, str2);
    }
}
