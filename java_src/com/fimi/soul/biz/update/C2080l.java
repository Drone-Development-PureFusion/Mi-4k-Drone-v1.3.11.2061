package com.fimi.soul.biz.update;

import android.content.Context;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1662f;
import com.fimi.kernel.utils.C1673n;
import com.fimi.kernel.utils.C1679t;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.p202f.C2269a;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.entity.UpgradeDetInfo;
import com.fimi.soul.entity.UpgradeResultInfo;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3025e;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.utils.C3143v;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.fimi.soul.biz.update.l */
/* loaded from: classes.dex */
public class C2080l {

    /* renamed from: a */
    public static final String f5839a = "/fw_upgrade/Camera_Log/";

    /* renamed from: b */
    public static final String f5840b = "/fw_upgrade/X6_Log/";

    /* renamed from: c */
    public static final String f5841c = "10010";

    /* renamed from: d */
    public static final long f5842d = 524288;

    /* renamed from: e */
    public static final String f5843e = "sp_update_camara_version";

    /* renamed from: f */
    public static final String f5844f = "sp_update_x6_version";

    /* renamed from: g */
    private static HashMap<Integer, Integer> f5845g = null;

    /* renamed from: com.fimi.soul.biz.update.l$a */
    /* loaded from: classes.dex */
    public enum EnumC2081a {
        Camera,
        Ap
    }

    /* renamed from: a */
    public static long m33058a(List<UpdateVersonBean> list) {
        long j = 0;
        Iterator<UpdateVersonBean> it2 = list.iterator();
        while (true) {
            long j2 = j;
            if (it2.hasNext()) {
                j = Long.valueOf(it2.next().getSize()).longValue() + j2;
            } else {
                return j2;
            }
        }
    }

    /* renamed from: a */
    public static UpgradeResultInfo m33064a(Context context) {
        UpgradeResultInfo upgradeResultInfo = new UpgradeResultInfo();
        User m34259c = C1756a.m34259c(context);
        if (m34259c != null) {
            upgradeResultInfo.setUserID(m34259c.getUserID());
        }
        Gson gson = new Gson();
        m33050c(gson.toJson(m33044e()));
        upgradeResultInfo.setJsonStr(gson.toJson(m33044e()));
        return upgradeResultInfo;
    }

    /* renamed from: a */
    public static File m33063a(EnumC2081a enumC2081a) {
        File file = null;
        if (enumC2081a == EnumC2081a.Camera) {
            file = new File(C3129m.m29070a() + f5839a);
        }
        if (enumC2081a == EnumC2081a.Ap) {
            file = new File(C3129m.m29070a() + f5840b);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, C1662f.m34784a(new Date(), "yyyy-MM-dd") + ".txt");
        try {
            if (file2.exists() && file2.length() > f5842d) {
                file2.delete();
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file2;
    }

    /* renamed from: a */
    public static String m33065a(int i) {
        return String.valueOf(i <= 60 ? 1 : (int) Math.ceil(i / 60.0d));
    }

    /* renamed from: a */
    private static String m33062a(C2269a c2269a) {
        return "" + c2269a.m32513d() + c2269a.m32511e() + c2269a.m32509g() + c2269a.m32510f();
    }

    /* renamed from: a */
    public static String m33060a(String str) {
        return C3029b.f11267L + str + ".bin";
    }

    /* renamed from: a */
    public static String m33059a(String str, String str2) {
        return "X6E-RC-5G-" + str2 + "_" + str + ".bin";
    }

    /* renamed from: a */
    public static HashMap<Integer, Integer> m33066a() {
        if (f5845g == null || f5845g.isEmpty()) {
            f5845g = new HashMap<>();
            f5845g.put(0, 210);
            f5845g.put(1, 20);
            f5845g.put(9, 120);
            f5845g.put(10, 40);
            f5845g.put(3, Integer.valueOf((int) Opcodes.GETFIELD));
            f5845g.put(6, 50);
            f5845g.put(4, 150);
            f5845g.put(11, 60);
            f5845g.put(15, 60);
            f5845g.put(26, 60);
            f5845g.put(14, 60);
            f5845g.put(25, 60);
            f5845g.put(13, 600);
            f5845g.put(253, 600);
            f5845g.put(5, 60);
            f5845g.put(8, 60);
        }
        return f5845g;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m33061a(File file, String str) {
        RandomAccessFile randomAccessFile;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file.getAbsoluteFile(), "rw");
                try {
                    randomAccessFile.seek(randomAccessFile.length());
                    randomAccessFile.writeBytes("\n" + C3143v.m29020a() + "    " + new String(str.getBytes("ISO-8859-1"), "UTF-8"));
                    if (randomAccessFile == null) {
                        return;
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (randomAccessFile == null) {
                        return;
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
            if (randomAccessFile != null) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static int m33056b(int i) {
        switch (i) {
            case 0:
                return 8;
            case 1:
                return 11;
            case 3:
                return 3;
            case 4:
            case 13:
                return 1;
            case 5:
                return 9;
            case 6:
                return 4;
            case 8:
                return 5;
            case 9:
                return 5;
            case 10:
                return 6;
            case 11:
                return 12;
            case 14:
                return 10;
            case 15:
                return 13;
            case 25:
                return 10;
            case 26:
                return 13;
            case 253:
                return 7;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public static long m33053b(List<FirmwareInfo> list) {
        long j = 0;
        Iterator<FirmwareInfo> it2 = list.iterator();
        while (true) {
            long j2 = j;
            if (it2.hasNext()) {
                j = it2.next().getFileSize() + j2;
            } else {
                return j2;
            }
        }
    }

    /* renamed from: b */
    public static String m33057b() {
        return C3029b.f11277V;
    }

    /* renamed from: b */
    public static String m33054b(String str, String str2) {
        return "X6E-RC-5G-" + str2 + "_" + str + ".bin";
    }

    /* renamed from: b */
    public static void m33055b(String str) {
        m33061a(m33063a(EnumC2081a.Ap), str);
    }

    /* renamed from: c */
    public static int m33051c(int i) {
        if (i == 17) {
            return 0;
        }
        if (i == 16) {
            return 1;
        }
        if (i == 12) {
            return 3;
        }
        if (i == 18) {
            return 10;
        }
        if (i == 19) {
            return 9;
        }
        if (i == 20) {
            return 6;
        }
        if (i == 23) {
            return 5;
        }
        if (i != 27) {
            return i;
        }
        return 8;
    }

    /* renamed from: c */
    public static String m33052c() {
        List<UpdateVersonBean> m29607e = C3021a.m29616a().m29607e();
        if (m29607e == null || m29607e.size() <= 0) {
            return null;
        }
        return String.valueOf(C1679t.m34556a((m33058a(m29607e) / 1024.0d) / 1024.0d, 2));
    }

    /* renamed from: c */
    public static String m33049c(String str, String str2) {
        return "X6E-DR-5G-" + str2 + "_" + str + ".bin";
    }

    /* renamed from: c */
    public static void m33050c(String str) {
        m33061a(m33063a(EnumC2081a.Camera), str);
    }

    /* renamed from: d */
    public static String m33048d() {
        List<FirmwareInfo> m29608d = C3021a.m29616a().m29608d();
        if (m29608d == null || m29608d.size() <= 0) {
            return null;
        }
        return String.valueOf(C1679t.m34556a((m33053b(m29608d) / 1024.0d) / 1024.0d, 2));
    }

    /* renamed from: d */
    public static String m33045d(String str, String str2) {
        return "X6E-DR-5G-" + str2 + "_" + str + ".bin";
    }

    /* renamed from: d */
    public static void m33046d(String str) {
        C1642c.m34887c().mo34878a(f5844f, str);
    }

    /* renamed from: d */
    public static boolean m33047d(int i) {
        return i == 199 || i == 201 || i == 202 || i == 203 || i == 204 || i == 106 || i == 193;
    }

    /* renamed from: e */
    public static UpgradeDetInfo m33044e() {
        UpgradeDetInfo upgradeDetInfo = new UpgradeDetInfo();
        C3021a m29616a = C3021a.m29616a();
        if (m29616a != null) {
            C3025e m29615a = m29616a.m29615a(0);
            upgradeDetInfo.setFcHwVersion(m29615a.m29561c());
            upgradeDetInfo.setFcID(m29615a.m29550i());
            upgradeDetInfo.setFcSwVersion(m29615a.m29566b() + "");
            C3025e m29615a2 = m29616a.m29615a(1);
            upgradeDetInfo.setRcHwVersion(m29615a2.m29561c());
            upgradeDetInfo.setRcSwVersion(m29615a2.m29566b() + "");
            upgradeDetInfo.setRcID(m29615a2.m29550i());
            C3025e m29615a3 = m29616a.m29615a(10);
            upgradeDetInfo.setNoFlyHwVersion(m29615a3.m29561c());
            upgradeDetInfo.setNoFlySwVersion(m29615a3.m29566b() + "");
            upgradeDetInfo.setNoFlyID(m29615a3.m29550i());
            C3025e m29615a4 = m29616a.m29615a(3);
            upgradeDetInfo.setGcHwVersion(m29615a4.m29561c());
            upgradeDetInfo.setGcSwVersion(m29615a4.m29566b() + "");
            upgradeDetInfo.setGcID(m29615a4.m29550i());
            C3025e m29615a5 = m29616a.m29615a(9);
            upgradeDetInfo.setX2HwVersion(m29615a5.m29561c());
            upgradeDetInfo.setX2SwVersion(m29615a5.m29566b() + "");
            upgradeDetInfo.setX2ID(m29615a5.m29550i());
            C3025e m29615a6 = m29616a.m29615a(6);
            upgradeDetInfo.setServoHwVersion(m29615a6.m29561c());
            upgradeDetInfo.setServoSwVersion(m29615a6.m29566b() + "");
            upgradeDetInfo.setServoID(m29615a6.m29550i());
            C3025e m29615a7 = m29616a.m29615a(4);
            upgradeDetInfo.setX1HwVersion(m29615a7.m29561c());
            upgradeDetInfo.setX1SwVersion(m29615a7.m29566b() + "");
            upgradeDetInfo.setX1ID(m29615a7.m29550i());
            C3025e m29615a8 = m29616a.m29615a(4);
            upgradeDetInfo.setX6HwVersion(m29615a8.m29561c());
            upgradeDetInfo.setX6SwVersion(m29615a8.m29566b() + "");
            upgradeDetInfo.setX6ID(m29615a8.m29550i());
        }
        return upgradeDetInfo;
    }

    /* renamed from: e */
    public static void m33043e(String str) {
        C1642c.m34887c().mo34878a(f5843e, str);
    }

    /* renamed from: f */
    public static void m33042f() {
        m33046d((String) null);
        m33043e(null);
    }

    /* renamed from: g */
    public static String m33041g() {
        String mo34883a = C1642c.m34887c().mo34883a(UpdateVersonBean.SP_CAMERA_VERSION);
        return mo34883a != null ? String.valueOf(C1673n.m34639n(mo34883a)) : "";
    }

    /* renamed from: h */
    public static String m33040h() {
        String m34197d = C1772d.m34208a().m34197d();
        int i = -1;
        if (m34197d != null) {
            i = Integer.valueOf(C1673n.m34639n(m34197d)).intValue();
        }
        return String.valueOf(i);
    }
}
