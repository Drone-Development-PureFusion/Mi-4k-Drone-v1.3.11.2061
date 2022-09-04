package it.p273a.p274a.p276b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/* renamed from: it.a.a.b.a */
/* loaded from: classes.dex */
public class C10857a extends C10858b {

    /* renamed from: a */
    private static final Object f34807a = new Object();

    /* renamed from: b */
    private static C10857a f34808b = null;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[EDGE_INSN: B:12:0x0043->B:13:0x0043 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e A[Catch: Exception -> 0x0031, all -> 0x0049, TryCatch #5 {Exception -> 0x0031, all -> 0x0049, blocks: (B:6:0x0018, B:8:0x001e, B:9:0x0023, B:11:0x0029), top: B:5:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C10857a() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("textualexts")));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                            while (true) {
                                if (stringTokenizer.hasMoreTokens()) {
                                    b(stringTokenizer.nextToken());
                                }
                            }
                            String readLine2 = bufferedReader.readLine();
                            if (readLine2 == null) {
                                break;
                            }
                        }
                    } catch (Exception e) {
                        if (bufferedReader == null) {
                            return;
                        }
                        bufferedReader.close();
                    } catch (Throwable th) {
                        bufferedReader2 = bufferedReader;
                        th = th;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable th2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                return;
            }
        } catch (Exception e2) {
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
    }

    /* renamed from: a */
    public static C10857a m3029a() {
        synchronized (f34807a) {
            if (f34808b == null) {
                f34808b = new C10857a();
            }
        }
        return f34808b;
    }
}
