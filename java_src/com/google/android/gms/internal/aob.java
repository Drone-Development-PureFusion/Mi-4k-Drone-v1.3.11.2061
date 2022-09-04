package com.google.android.gms.internal;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.codehaus.jackson.smile.SmileConstants;
import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes2.dex */
class aob {

    /* renamed from: a */
    private static final Pattern f22543a = Pattern.compile("[.]");

    /* renamed from: b */
    private static final Inet4Address f22544b = (Inet4Address) m16563b("127.0.0.1");

    /* renamed from: c */
    private static final Inet4Address f22545c = (Inet4Address) m16563b("0.0.0.0");

    /* renamed from: a */
    private static int m16569a(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) | ((b3 & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (b4 & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
    }

    /* renamed from: a */
    private static IllegalArgumentException m16567a(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m16566a(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return inetAddress.getHostAddress();
        }
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = m16569a((byte) 0, (byte) 0, address[i * 2], address[(i * 2) + 1]);
        }
        m16564a(iArr);
        return m16562b(iArr);
    }

    /* renamed from: a */
    private static InetAddress m16565a(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    private static void m16564a(int[] iArr) {
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < iArr.length + 1; i4++) {
            if (i4 >= iArr.length || iArr[i4] != 0) {
                if (i >= 0) {
                    int i5 = i4 - i;
                    if (i5 > i2) {
                        i2 = i5;
                    } else {
                        i = i3;
                    }
                    i3 = i;
                    i = -1;
                }
            } else if (i < 0) {
                i = i4;
            }
        }
        if (i2 >= 2) {
            Arrays.fill(iArr, i3, i3 + i2, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m16568a(String str) {
        return m16561c(str) != null;
    }

    /* renamed from: b */
    private static String m16562b(int[] iArr) {
        StringBuilder sb = new StringBuilder(39);
        int i = 0;
        boolean z = false;
        while (i < iArr.length) {
            boolean z2 = iArr[i] >= 0;
            if (z2) {
                if (z) {
                    sb.append(C0494h.f680A);
                }
                sb.append(Integer.toHexString(iArr[i]));
            } else if (i == 0 || z) {
                sb.append("::");
            }
            i++;
            z = z2;
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InetAddress m16563b(String str) {
        byte[] m16561c = m16561c(str);
        if (m16561c == null) {
            throw m16567a("'%s' is not an IP string literal.", str);
        }
        return m16565a(m16561c);
    }

    /* renamed from: c */
    private static byte[] m16561c(String str) {
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '.') {
                z = true;
            } else if (charAt == ':') {
                if (z) {
                    return null;
                }
                z2 = true;
            } else if (Character.digit(charAt, 16) == -1) {
                return null;
            }
        }
        if (!z2) {
            if (!z) {
                return null;
            }
            return m16559e(str);
        } else if (!z || (str = m16560d(str)) != null) {
            return m16557g(str);
        } else {
            return null;
        }
    }

    /* renamed from: d */
    private static String m16560d(String str) {
        int lastIndexOf = str.lastIndexOf(58);
        String substring = str.substring(0, lastIndexOf + 1);
        byte[] m16559e = m16559e(str.substring(lastIndexOf + 1));
        if (m16559e == null) {
            return null;
        }
        String hexString = Integer.toHexString(((m16559e[0] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (m16559e[1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT));
        String hexString2 = Integer.toHexString((m16559e[3] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | ((m16559e[2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8));
        return new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(hexString).length() + String.valueOf(hexString2).length()).append(substring).append(hexString).append(":").append(hexString2).toString();
    }

    /* renamed from: e */
    private static byte[] m16559e(String str) {
        int i = 0;
        byte[] bArr = new byte[4];
        try {
            String[] split = f22543a.split(str, 4);
            int length = split.length;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                bArr[i2] = m16558f(split[i]);
                i++;
                i2 = i3;
            }
            if (i2 == 4) {
                return bArr;
            }
            return null;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* renamed from: f */
    private static byte m16558f(String str) {
        int parseInt = Integer.parseInt(str);
        if (parseInt > 255 || (str.startsWith("0") && str.length() > 1)) {
            throw new NumberFormatException();
        }
        return (byte) parseInt;
    }

    /* renamed from: g */
    private static byte[] m16557g(String str) {
        int length;
        int i;
        int i2;
        String[] split = str.split(":", 10);
        if (split.length < 3 || split.length > 9) {
            return null;
        }
        int i3 = -1;
        for (int i4 = 1; i4 < split.length - 1; i4++) {
            if (split[i4].length() == 0) {
                if (i3 >= 0) {
                    return null;
                }
                i3 = i4;
            }
        }
        if (i3 >= 0) {
            int length2 = (split.length - i3) - 1;
            if (split[0].length() == 0) {
                i2 = i3 - 1;
                if (i2 != 0) {
                    return null;
                }
            } else {
                i2 = i3;
            }
            if (split[split.length - 1].length() == 0 && length2 - 1 != 0) {
                return null;
            }
            int i5 = length2;
            length = i2;
            i = i5;
        } else {
            length = split.length;
            i = 0;
        }
        int i6 = 8 - (length + i);
        if (i3 < 0 ? i6 != 0 : i6 < 1) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(16);
        for (int i7 = 0; i7 < length; i7++) {
            try {
                allocate.putShort(m16556h(split[i7]));
            } catch (NumberFormatException e) {
                return null;
            }
        }
        for (int i8 = 0; i8 < i6; i8++) {
            allocate.putShort((short) 0);
        }
        while (i > 0) {
            allocate.putShort(m16556h(split[split.length - i]));
            i--;
        }
        return allocate.array();
    }

    /* renamed from: h */
    private static short m16556h(String str) {
        int parseInt = Integer.parseInt(str, 16);
        if (parseInt > 65535) {
            throw new NumberFormatException();
        }
        return (short) parseInt;
    }
}
