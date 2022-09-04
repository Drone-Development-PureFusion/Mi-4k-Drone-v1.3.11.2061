package com.fimi.kernel.utils;

import com.fimi.kernel.C1642c;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
/* renamed from: com.fimi.kernel.utils.n */
/* loaded from: classes.dex */
public class C1673n {
    /* renamed from: a */
    public static int m34658a(String str, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            i2 = str.substring(i3, i3 + 1).matches("[Α-￥]") ? i2 + 2 : i2 + 1;
            if (i2 >= i) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m34656a(String str, String str2) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            return str.getBytes(str2).length;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static String m34661a(long j) {
        String str = "B";
        if (j >= FimiMediaMeta.AV_CH_SIDE_RIGHT) {
            str = "K";
            j >>= 10;
            if (j >= FimiMediaMeta.AV_CH_SIDE_RIGHT) {
                str = "M";
                j >>= 10;
                if (j >= FimiMediaMeta.AV_CH_SIDE_RIGHT) {
                    str = "G";
                    j >>= 10;
                }
            }
        }
        return j + str;
    }

    /* renamed from: a */
    public static String m34660a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
        if (sb.indexOf("\n") != -1 && sb.lastIndexOf("\n") == sb.length() - 1) {
            sb.delete(sb.lastIndexOf("\n"), sb.lastIndexOf("\n") + 1);
        }
        try {
            inputStream.close();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m34659a(String str) {
        if (str == null || "null".equals(str.trim())) {
            str = "";
        }
        return str.trim();
    }

    /* renamed from: a */
    public static String m34657a(String str, int i, String str2) {
        int i2 = 0;
        if (m34656a(str, "GBK") <= i) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char c = charArray[i3];
            stringBuffer.append(c);
            i2 = c > 256 ? i2 + 2 : i2 + 1;
            if (i2 < i) {
                i3++;
            } else if (str2 != null) {
                stringBuffer.append(str2);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m34655a(String str, String str2, int i) {
        int indexOf;
        return (!m34653b(str) && (indexOf = str.indexOf(str2)) != -1 && str.length() > indexOf + i) ? str.substring(indexOf + i) : "";
    }

    /* renamed from: a */
    public static void m34654a(String[] strArr) {
        System.out.println(m34642k("2012-3-2 12:2:20"));
    }

    /* renamed from: b */
    public static String m34652b(String str, int i) {
        return m34657a(str, i, "");
    }

    /* renamed from: b */
    public static String m34651b(String str, String str2) {
        return m34653b(str) ? "" : str.substring(0, str.indexOf(str2));
    }

    /* renamed from: b */
    public static boolean m34653b(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* renamed from: c */
    public static int m34650c(String str) {
        if (!m34653b(str)) {
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (str.substring(i2, i2 + 1).matches("[Α-￥]")) {
                    i += 2;
                }
            }
            return i;
        }
        return 0;
    }

    /* renamed from: d */
    public static int m34649d(String str) {
        if (!m34653b(str)) {
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                i = str.substring(i2, i2 + 1).matches("[Α-￥]") ? i + 2 : i + 1;
            }
            return i;
        }
        return 0;
    }

    /* renamed from: e */
    public static Boolean m34648e(String str) {
        boolean z = false;
        try {
            return Boolean.valueOf(Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$").matcher(str).matches());
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }

    /* renamed from: f */
    public static Boolean m34647f(String str) {
        return str.matches("^[A-Za-z0-9]+$");
    }

    /* renamed from: g */
    public static Boolean m34646g(String str) {
        return str.matches("^[0-9]+$");
    }

    /* renamed from: h */
    public static Boolean m34645h(String str) {
        return str.matches("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
    }

    /* renamed from: i */
    public static Boolean m34644i(String str) {
        if (!m34653b(str)) {
            boolean z = true;
            for (int i = 0; i < str.length(); i++) {
                if (!str.substring(i, i + 1).matches("[Α-￥]")) {
                    z = false;
                }
            }
            return z;
        }
        return true;
    }

    /* renamed from: j */
    public static Boolean m34643j(String str) {
        boolean z = false;
        if (!m34653b(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).matches("[Α-￥]")) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: k */
    public static String m34642k(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (m34653b(str)) {
                return null;
            }
            String[] split = str.split(" ");
            if (split.length > 0) {
                for (String str2 : split) {
                    if (str2.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER) != -1) {
                        String[] split2 = str2.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                        for (int i = 0; i < split2.length; i++) {
                            sb.append(m34641l(split2[i]));
                            if (i < split2.length - 1) {
                                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            }
                        }
                    } else if (str2.indexOf(":") != -1) {
                        sb.append(" ");
                        String[] split3 = str2.split(":");
                        for (int i2 = 0; i2 < split3.length; i2++) {
                            sb.append(m34641l(split3[i2]));
                            if (i2 < split3.length - 1) {
                                sb.append(":");
                            }
                        }
                    }
                }
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: l */
    public static String m34641l(String str) {
        try {
            return str.length() <= 1 ? "0" + str : str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: m */
    public static long m34640m(String str) {
        String[] split = str.replace(".", Constants.ACCEPT_TIME_SEPARATOR_SP).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        return Long.valueOf(split[3]).longValue() | (Long.valueOf(split[0]).longValue() << 24) | (Long.valueOf(split[1]).longValue() << 16) | (Long.valueOf(split[2]).longValue() << 8);
    }

    /* renamed from: n */
    public static int m34639n(String str) {
        if (str == null || str == "") {
            return -1;
        }
        try {
            int lastIndexOf = str.toLowerCase().lastIndexOf("sp");
            return Integer.valueOf(str.substring(lastIndexOf - 2, lastIndexOf) + str.substring(lastIndexOf + 2, lastIndexOf + 4)).intValue();
        } catch (Exception e) {
            C1688z.m34443b(C1642c.m34893a(), "解析逻辑版本出错!");
            return -1;
        }
    }
}
