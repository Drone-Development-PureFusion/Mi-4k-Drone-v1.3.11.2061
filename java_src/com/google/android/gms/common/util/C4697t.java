package com.google.android.gms.common.util;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/* renamed from: com.google.android.gms.common.util.t */
/* loaded from: classes2.dex */
public class C4697t {

    /* renamed from: a */
    private static String f17306a = null;

    /* renamed from: a */
    public static String m23100a() {
        return m23099a(Binder.getCallingPid());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m23099a(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        String str = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(new StringBuilder(25).append("/proc/").append(i).append("/cmdline").toString()));
            try {
                try {
                    str = bufferedReader.readLine().trim();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e) {
                            Log.w("ProcessUtils", e.getMessage(), e);
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    Log.e("ProcessUtils", e.getMessage(), e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e3) {
                            Log.w("ProcessUtils", e3.getMessage(), e3);
                        }
                    }
                    return str;
                }
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception e4) {
                        Log.w("ProcessUtils", e4.getMessage(), e4);
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
            if (bufferedReader != null) {
            }
            throw th;
        }
        return str;
    }

    /* renamed from: b */
    public static String m23098b() {
        if (f17306a == null) {
            f17306a = m23099a(Process.myPid());
        }
        return f17306a;
    }
}
