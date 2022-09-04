package com.tencent.p263mm.sdk.platformtools;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Pattern;
/* renamed from: com.tencent.mm.sdk.platformtools.InetUtil */
/* loaded from: classes2.dex */
public final class InetUtil {

    /* renamed from: X */
    private static final Pattern f31595X = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: Y */
    private static final Pattern f31596Y = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: Z */
    private static final Pattern f31597Z = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private InetUtil() {
    }

    public static InetAddress getByDottedAddress(String str) {
        if (!isIPv4Address(str) && !isIPv6Address(str)) {
            throw new UnknownHostException("invalid ipv4 or ipv6 dotted string");
        }
        return InetAddress.getByName(str);
    }

    public static boolean isIPv4Address(String str) {
        return f31595X.matcher(str).matches();
    }

    public static boolean isIPv6Address(String str) {
        return isIPv6StdAddress(str) || isIPv6HexCompressedAddress(str);
    }

    public static boolean isIPv6HexCompressedAddress(String str) {
        return f31597Z.matcher(str).matches();
    }

    public static boolean isIPv6StdAddress(String str) {
        return f31596Y.matcher(str).matches();
    }
}
