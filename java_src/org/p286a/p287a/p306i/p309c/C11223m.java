package org.p286a.p287a.p306i.p309c;

import android.util.Log;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.p286a.p287a.p299f.AbstractC11106b;
import org.p286a.p287a.p320o.C11354a;
/* renamed from: org.a.a.i.c.m */
/* loaded from: classes2.dex */
public class C11223m implements AbstractC11106b {

    /* renamed from: a */
    private static final String f36134a = "HttpClient";

    /* renamed from: b */
    private final Map<String, InetAddress[]> f36135b = new ConcurrentHashMap();

    /* renamed from: a */
    public void m1625a(String str, InetAddress... inetAddressArr) {
        C11354a.m1321a(str, "Host name");
        C11354a.m1321a(inetAddressArr, "Array of IP addresses");
        this.f36135b.put(str, inetAddressArr);
    }

    @Override // org.p286a.p287a.p299f.AbstractC11106b
    /* renamed from: a */
    public InetAddress[] mo1584a(String str) {
        InetAddress[] inetAddressArr = this.f36135b.get(str);
        if (Log.isLoggable(f36134a, 4)) {
            Log.i(f36134a, "Resolving " + str + " to " + Arrays.deepToString(inetAddressArr));
        }
        if (inetAddressArr == null) {
            throw new UnknownHostException(str + " cannot be resolved");
        }
        return inetAddressArr;
    }
}
