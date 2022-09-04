package com.google.android.gms.common.util;
/* renamed from: com.google.android.gms.common.util.u */
/* loaded from: classes2.dex */
public final class C4698u {
    /* renamed from: a */
    private static int m23096a(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int i = 0;
        int length = stackTraceElementArr2.length;
        int length2 = stackTraceElementArr.length;
        while (true) {
            length2--;
            if (length2 < 0 || length - 1 < 0 || !stackTraceElementArr2[length].equals(stackTraceElementArr[length2])) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static String m23097a() {
        StringBuilder sb = new StringBuilder();
        Throwable th = new Throwable();
        StackTraceElement[] stackTrace = th.getStackTrace();
        sb.append("Async stack trace:");
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("\n\tat ").append(stackTraceElement);
        }
        StackTraceElement[] stackTraceElementArr = stackTrace;
        Throwable cause = th.getCause();
        while (cause != null) {
            sb.append("\nCaused by: ");
            sb.append(cause);
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            int m23096a = m23096a(stackTrace2, stackTraceElementArr);
            for (int i = 0; i < stackTrace2.length - m23096a; i++) {
                String valueOf = String.valueOf(stackTrace2[i]);
                sb.append(new StringBuilder(String.valueOf(valueOf).length() + 5).append("\n\tat ").append(valueOf).toString());
            }
            if (m23096a > 0) {
                sb.append(new StringBuilder(22).append("\n\t... ").append(m23096a).append(" more").toString());
            }
            cause = cause.getCause();
            stackTraceElementArr = stackTrace2;
        }
        return sb.toString();
    }
}
