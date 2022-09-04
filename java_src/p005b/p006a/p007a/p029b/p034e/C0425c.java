package p005b.p006a.p007a.p029b.p034e;

import java.util.LinkedList;
import java.util.List;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: b.a.a.b.e.c */
/* loaded from: classes.dex */
public class C0425c {
    /* renamed from: a */
    private static int m39340a(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int i = 0;
        if (stackTraceElementArr2 != null) {
            int length = stackTraceElementArr.length - 1;
            for (int length2 = stackTraceElementArr2.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementArr2[length2]); length2--) {
                i++;
                length--;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static String m39342a(Throwable th, StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null) {
            str = C0494h.f727o;
        }
        String str2 = str + th.getClass().getName();
        return th.getMessage() != null ? str2 + ": " + th.getMessage() : str2;
    }

    /* renamed from: a */
    private static void m39341a(List<String> list, Throwable th, StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int m39340a = m39340a(stackTrace, stackTraceElementArr);
        list.add(m39342a(th, stackTraceElementArr));
        for (int i = 0; i < stackTrace.length - m39340a; i++) {
            list.add("\tat " + stackTrace[i].toString());
        }
        if (m39340a != 0) {
            list.add("\t... " + m39340a + " common frames omitted");
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            m39341a(list, cause, stackTrace);
        }
    }

    /* renamed from: a */
    public static String[] m39343a(Throwable th) {
        LinkedList linkedList = new LinkedList();
        m39341a(linkedList, th, null);
        return (String[]) linkedList.toArray(new String[0]);
    }
}
