package com.google.android.gms.internal;

import android.util.Base64;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.p239g.AbstractC5285f;
import com.google.android.gms.p239g.C5286g;
import com.google.firebase.database.C9831c;
import com.google.firebase.database.C9866d;
import com.google.firebase.database.C9867e;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.p356d.AbstractC11759f;
/* renamed from: com.google.android.gms.internal.mk */
/* loaded from: classes2.dex */
public class C7392mk {

    /* renamed from: a */
    private static final char[] f24619a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static int m14611a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: a */
    public static int m14610a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* renamed from: a */
    public static C7389mh<AbstractC5285f<Void>, C9867e.AbstractC9872a> m14609a(C9867e.AbstractC9872a abstractC9872a) {
        if (abstractC9872a == null) {
            final C5286g c5286g = new C5286g();
            return new C7389mh<>(c5286g.m20832a(), new C9867e.AbstractC9872a() { // from class: com.google.android.gms.internal.mk.1
                @Override // com.google.firebase.database.C9867e.AbstractC9872a
                /* renamed from: a */
                public void mo6745a(C9831c c9831c, C9867e c9867e) {
                    if (c9831c != null) {
                        C5286g.this.m20831a((Exception) c9831c.m6851d());
                    } else {
                        C5286g.this.m20830a((C5286g) null);
                    }
                }
            });
        }
        return new C7389mh<>(null, abstractC9872a);
    }

    /* renamed from: a */
    public static C7390mi m14608a(String str) {
        String str2;
        try {
            int indexOf = str.indexOf("//");
            if (indexOf == -1) {
                throw new URISyntaxException(str, "Invalid scheme specified");
            }
            int indexOf2 = str.substring(indexOf + 2).indexOf("/");
            if (indexOf2 != -1) {
                int i = indexOf + 2 + indexOf2;
                String[] split = str.substring(i).split("/");
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < split.length; i2++) {
                    if (!split[i2].equals("")) {
                        sb.append("/");
                        sb.append(URLEncoder.encode(split[i2], "UTF-8"));
                    }
                }
                String valueOf = String.valueOf(str.substring(0, i));
                String valueOf2 = String.valueOf(sb.toString());
                str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            } else {
                str2 = str;
            }
            URI uri = new URI(str2);
            String replace = uri.getPath().replace(AbstractC11759f.f37105b, " ");
            C7394ml.m14597b(replace);
            C7160ij c7160ij = new C7160ij(replace);
            String scheme = uri.getScheme();
            C7193in c7193in = new C7193in();
            c7193in.f24193a = uri.getHost().toLowerCase();
            int port = uri.getPort();
            if (port != -1) {
                c7193in.f24194b = scheme.equals(UriUtil.HTTPS_SCHEME);
                String valueOf3 = String.valueOf(c7193in.f24193a);
                c7193in.f24193a = new StringBuilder(String.valueOf(valueOf3).length() + 12).append(valueOf3).append(":").append(port).toString();
            } else {
                c7193in.f24194b = true;
            }
            c7193in.f24195c = c7193in.f24193a.split("\\.")[0].toLowerCase();
            c7193in.f24196d = c7193in.f24193a;
            C7390mi c7390mi = new C7390mi();
            c7390mi.f24614b = c7160ij;
            c7390mi.f24613a = c7193in;
            return c7390mi;
        } catch (UnsupportedEncodingException e) {
            throw new C9866d("Failed to URLEncode the path", e);
        } catch (URISyntaxException e2) {
            throw new C9866d("Invalid Firebase Database url specified", e2);
        }
    }

    /* renamed from: a */
    public static String m14612a(double d) {
        StringBuilder sb = new StringBuilder(16);
        long doubleToLongBits = Double.doubleToLongBits(d);
        for (int i = 7; i >= 0; i--) {
            int i2 = (int) ((doubleToLongBits >>> (i * 8)) & 255);
            sb.append(f24619a[(i2 >> 4) & 15]);
            sb.append(f24619a[i2 & 15]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m14607a(boolean z) {
        m14606a(z, "");
    }

    /* renamed from: a */
    public static void m14606a(boolean z, String str) {
        if (!z) {
            String valueOf = String.valueOf(str);
            throw new AssertionError(valueOf.length() != 0 ? "hardAssert failed: ".concat(valueOf) : new String("hardAssert failed: "));
        }
    }

    /* renamed from: b */
    public static String m14605b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e2);
        }
    }

    /* renamed from: c */
    public static String m14604c(String str) {
        String replace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            replace = replace.replace("\"", "\\\"");
        }
        return new StringBuilder(String.valueOf(replace).length() + 2).append("\"").append(replace).append("\"").toString();
    }

    /* renamed from: d */
    public static Integer m14603d(String str) {
        boolean z = true;
        int i = 0;
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        if (str.charAt(0) != '-') {
            z = false;
        } else if (str.length() == 1) {
            return null;
        } else {
            i = 1;
        }
        long j = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            j = (j * 10) + (charAt - '0');
            i++;
        }
        if (z) {
            if ((-j) >= -2147483648L) {
                return Integer.valueOf((int) (-j));
            }
            return null;
        } else if (j <= 2147483647L) {
            return Integer.valueOf((int) j);
        } else {
            return null;
        }
    }
}
