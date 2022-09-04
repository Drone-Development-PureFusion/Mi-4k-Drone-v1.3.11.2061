package com.tencent.p263mm.sdk.platformtools;

import android.os.Process;
import java.io.File;
import java.util.Scanner;
/* renamed from: com.tencent.mm.sdk.platformtools.TrafficStats */
/* loaded from: classes2.dex */
public final class TrafficStats {
    public static final String DEV_FILE = "/proc/self/net/dev";
    public static final String GPRSLINE = "rmnet0";
    public static final String WIFILINE = "tiwlan0";

    /* renamed from: bl */
    private static long f31670bl;

    /* renamed from: bm */
    private static long f31671bm;

    /* renamed from: bn */
    private static long f31672bn;

    /* renamed from: bo */
    private static long f31673bo;

    /* renamed from: bp */
    private static long f31674bp;

    /* renamed from: bq */
    private static long f31675bq;

    /* renamed from: br */
    private static long f31676br;

    /* renamed from: bs */
    private static long f31677bs;

    private TrafficStats() {
    }

    public static long getMobileRx(long j) {
        return f31675bq > j ? f31675bq : j;
    }

    public static long getMobileTx(long j) {
        return f31674bp > j ? f31674bp : j;
    }

    public static long getWifiRx(long j) {
        return f31677bs > j ? f31677bs : j;
    }

    public static long getWifiTx(long j) {
        return f31676br > j ? f31676br : j;
    }

    public static void reset() {
        f31670bl = -1L;
        f31671bm = -1L;
        f31672bn = -1L;
        f31673bo = -1L;
        update();
    }

    public static void update() {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        try {
            Scanner scanner = new Scanner(new File("/proc/" + Process.myPid() + "/net/dev"));
            scanner.nextLine();
            scanner.nextLine();
            while (scanner.hasNext()) {
                String[] split = scanner.nextLine().split("[ :\t]+");
                int i = split[0].length() == 0 ? 1 : 0;
                if (!split[0].equals("lo") && split[i + 0].startsWith("rmnet")) {
                    j += Long.parseLong(split[i + 9]);
                    j2 += Long.parseLong(split[i + 1]);
                }
                if (!split[i + 0].equals("lo") && !split[i + 0].startsWith("rmnet")) {
                    j3 += Long.parseLong(split[i + 9]);
                    j4 += Long.parseLong(split[i + 1]);
                }
            }
            scanner.close();
            if (f31670bl < 0) {
                f31670bl = j;
                Log.m5868v("MicroMsg.SDK.TrafficStats", "fix loss newMobileTx %d", Long.valueOf(j));
            }
            if (f31671bm < 0) {
                f31671bm = j2;
                Log.m5868v("MicroMsg.SDK.TrafficStats", "fix loss newMobileRx %d", Long.valueOf(j2));
            }
            if (f31672bn < 0) {
                f31672bn = j3;
                Log.m5868v("MicroMsg.SDK.TrafficStats", "fix loss newWifiTx %d", Long.valueOf(j3));
            }
            if (f31673bo < 0) {
                f31673bo = j4;
                Log.m5868v("MicroMsg.SDK.TrafficStats", "fix loss newWifiRx %d", Long.valueOf(j4));
            }
            if (j4 - f31673bo < 0) {
                Log.m5868v("MicroMsg.SDK.TrafficStats", "minu %d", Long.valueOf(j4 - f31673bo));
            }
            if (j3 - f31672bn < 0) {
                Log.m5868v("MicroMsg.SDK.TrafficStats", "minu %d", Long.valueOf(j3 - f31672bn));
            }
            f31674bp = j >= f31670bl ? j - f31670bl : j;
            f31675bq = j2 >= f31671bm ? j2 - f31671bm : j2;
            f31676br = j3 >= f31672bn ? j3 - f31672bn : j3;
            f31677bs = j4 >= f31673bo ? j4 - f31673bo : j4;
            f31670bl = j;
            f31671bm = j2;
            f31672bn = j3;
            f31673bo = j4;
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.m5876d("MicroMsg.SDK.TrafficStats", "current system traffic: wifi rx/tx=%d/%d, mobile rx/tx=%d/%d", Long.valueOf(f31677bs), Long.valueOf(f31676br), Long.valueOf(f31675bq), Long.valueOf(f31674bp));
    }

    public static long updateMobileRx(long j) {
        update();
        return getMobileRx(j);
    }

    public static long updateMobileTx(long j) {
        update();
        return getMobileTx(j);
    }

    public static long updateWifiRx(long j) {
        update();
        return getWifiRx(j);
    }

    public static long updateWifiTx(long j) {
        update();
        return getWifiTx(j);
    }
}
