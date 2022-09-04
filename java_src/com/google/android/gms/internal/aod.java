package com.google.android.gms.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.tencent.p263mm.sdk.contact.RContact;
import com.xiaomi.market.sdk.C10445j;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.jackson.smile.SmileConstants;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* loaded from: classes2.dex */
public class aod {

    /* renamed from: a */
    private static final String f22549a = aod.class.getSimpleName();

    /* renamed from: b */
    private static final char[] f22550b = "0123456789ABCDEF".toCharArray();

    /* renamed from: c */
    private static final Pattern f22551c = Pattern.compile("/\\.\\.");

    /* renamed from: d */
    private static final Pattern f22552d = Pattern.compile("0[1-7][0-7]*");

    /* renamed from: e */
    private static final Pattern f22553e = Pattern.compile("0x[0-9a-f]*", 2);

    /* renamed from: f */
    private static final Pattern f22554f = Pattern.compile("^((?:0x[0-9a-f]+|[0-9\\\\.])+)$", 2);

    /* renamed from: g */
    private final String f22555g;

    /* renamed from: h */
    private final String f22556h;

    /* renamed from: i */
    private final String f22557i;

    /* renamed from: j */
    private final int f22558j;

    /* renamed from: k */
    private final String f22559k;

    /* renamed from: l */
    private final String f22560l;

    /* renamed from: com.google.android.gms.internal.aod$a */
    /* loaded from: classes2.dex */
    private static class C6678a {

        /* renamed from: a */
        private static final String[] f22561a = {UriUtil.HTTP_SCHEME, UriUtil.HTTPS_SCHEME, "ftp"};

        /* renamed from: b */
        private final String f22562b;

        /* renamed from: c */
        private final Uri f22563c;

        /* renamed from: d */
        private final URI f22564d;

        /* renamed from: e */
        private final String f22565e;

        /* renamed from: f */
        private final Boolean f22566f;

        /* renamed from: g */
        private final Integer f22567g;

        private C6678a(String str) {
            this.f22562b = str;
            this.f22563c = Uri.parse(this.f22562b);
            try {
                new URI(this.f22562b);
            } catch (URISyntaxException e) {
            } finally {
                this.f22564d = null;
            }
            this.f22565e = m16534a();
            this.f22566f = Boolean.valueOf(m16527d());
            this.f22567g = Integer.valueOf(m16529c());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public String m16534a() {
            if (this.f22565e != null) {
                return this.f22565e;
            }
            String scheme = this.f22563c != null ? this.f22563c.getScheme() : null;
            if (TextUtils.isEmpty(scheme)) {
            }
            if (TextUtils.isEmpty(scheme) && !TextUtils.isEmpty(this.f22562b)) {
                int indexOf = this.f22562b.indexOf(":");
                if (indexOf != -1) {
                    String lowerCase = this.f22562b.substring(0, indexOf).toLowerCase(Locale.US);
                    if (m16532a(lowerCase)) {
                        scheme = lowerCase;
                    }
                }
                if (TextUtils.isEmpty(scheme)) {
                    scheme = this.f22562b.startsWith("www.") ? UriUtil.HTTP_SCHEME : UriUtil.HTTP_SCHEME;
                }
            }
            if (scheme == null) {
                return null;
            }
            return scheme.toLowerCase(Locale.US);
        }

        /* renamed from: a */
        private static boolean m16532a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            for (int i = 0; i < f22561a.length; i++) {
                if (f22561a[i].equals(str)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public int m16531b() {
            return this.f22567g.intValue();
        }

        /* renamed from: c */
        private int m16529c() {
            int port;
            if (this.f22567g != null) {
                return this.f22567g.intValue();
            }
            if (this.f22563c != null && (port = this.f22563c.getPort()) != -1) {
                return port;
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public boolean m16527d() {
            return this.f22566f != null ? this.f22566f.booleanValue() : m16532a(this.f22565e);
        }
    }

    public aod(String str) {
        String str2;
        if (!m16538e(str)) {
            this.f22555g = null;
            this.f22556h = null;
            this.f22557i = null;
            this.f22558j = -1;
            this.f22559k = null;
            this.f22560l = null;
            return;
        }
        String replaceAll = str.replaceAll("^\\s+", "").replaceAll("\\s+$", "").replaceAll("[\\t\\n\\r]", "");
        int indexOf = replaceAll.indexOf(35);
        replaceAll = indexOf != -1 ? replaceAll.substring(0, indexOf) : replaceAll;
        C6678a c6678a = new C6678a(replaceAll);
        if (!c6678a.m16527d()) {
            this.f22555g = null;
            this.f22556h = null;
            this.f22557i = null;
            this.f22558j = -1;
            this.f22559k = null;
            this.f22560l = null;
            return;
        }
        this.f22556h = c6678a.m16534a();
        this.f22558j = c6678a.m16531b();
        if (this.f22556h != null) {
            String str3 = this.f22556h;
            replaceAll = replaceAll.replaceAll(new StringBuilder(String.valueOf(str3).length() + 2).append("^").append(str3).append(":").toString(), "");
        }
        String m16536g = m16536g(replaceAll.replaceAll("^/+", ""));
        int indexOf2 = m16536g.indexOf(63);
        if (indexOf2 != -1) {
            int i = indexOf2 + 1;
            str2 = i < m16536g.length() ? m16536g.substring(i) : "";
            m16536g = m16536g.substring(0, indexOf2);
        } else {
            str2 = null;
        }
        String m16546a = m16546a(m16536g);
        if (TextUtils.isEmpty(m16546a)) {
            this.f22555g = null;
            this.f22557i = null;
            this.f22559k = null;
            this.f22560l = null;
            return;
        }
        String m16539d = m16539d(m16536g);
        this.f22557i = m16537f(m16546a);
        this.f22559k = m16537f(m16539d);
        this.f22560l = !TextUtils.isEmpty(str2) ? m16537f(str2) : str2;
        this.f22555g = m16536g;
    }

    /* renamed from: a */
    private static Byte m16545a(byte[] bArr, int i) {
        if (i + 2 < bArr.length && ((char) (bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT)) == '%') {
            char c = (char) (bArr[i + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
            char c2 = (char) (bArr[i + 2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
            if (m16548a(c) && m16548a(c2)) {
                return Byte.valueOf((byte) ((Integer.parseInt(new StringBuilder(1).append(c).toString(), 16) * 16) + Integer.parseInt(new StringBuilder(1).append(c2).toString(), 16)));
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    private String m16546a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        int indexOf2 = str.indexOf(64);
        if (indexOf2 != -1) {
            str = str.substring(indexOf2 + 1);
        }
        if (this.f22558j != -1) {
            str = str.replaceAll(new StringBuilder(13).append(":").append(this.f22558j).append(RContact.FAVOUR_CONTACT_SHOW_HEAD_CHAR).toString(), "");
        }
        String replaceAll = str.replaceAll("^\\.*", "").replaceAll("\\.*$", "").replaceAll("\\.+", ".");
        String m16543b = m16543b(replaceAll);
        if (m16543b == null) {
            m16543b = replaceAll;
        }
        return m16543b.toLowerCase(Locale.getDefault());
    }

    /* renamed from: a */
    private static final void m16547a(Exception exc) {
    }

    /* renamed from: a */
    private static boolean m16548a(char c) {
        return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f');
    }

    /* renamed from: b */
    private static String m16543b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String replaceAll = str.replaceAll("^\\[", "").replaceAll("\\]$", "");
        if (aob.m16568a(replaceAll)) {
            String m16566a = aob.m16566a(aob.m16563b(replaceAll));
            return m16566a.contains(":") ? String.format("[%s]", m16566a) : m16566a;
        } else if (TextUtils.isDigitsOnly(str)) {
            String m16541c = m16541c(str);
            if (TextUtils.isEmpty(m16541c)) {
                return null;
            }
            return m16541c;
        } else if (!f22554f.matcher(replaceAll).find()) {
            return null;
        } else {
            Matcher matcher = f22552d.matcher(replaceAll);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(stringBuffer, new StringBuilder(11).append(Integer.parseInt(matcher.group(), 8)).toString());
            }
            matcher.appendTail(stringBuffer);
            Matcher matcher2 = f22553e.matcher(stringBuffer.toString());
            StringBuffer stringBuffer2 = new StringBuffer();
            while (matcher2.find()) {
                matcher2.appendReplacement(stringBuffer2, new StringBuilder(11).append(Integer.parseInt(matcher2.group().substring(2), 16)).toString());
            }
            matcher2.appendTail(stringBuffer2);
            String stringBuffer3 = stringBuffer2.toString();
            return stringBuffer3.contains(":") ? String.format("[%s]", stringBuffer3) : stringBuffer3;
        }
    }

    /* renamed from: c */
    private static String m16541c(String str) {
        byte[] bArr;
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            BigInteger bigInteger = new BigInteger(str);
            byte[] byteArray = bigInteger.toByteArray();
            if (byteArray.length < 4) {
                return null;
            }
            byte[] copyOfRange = Arrays.copyOfRange(byteArray, byteArray.length - 4, byteArray.length);
            if (bigInteger.equals(new BigInteger(new byte[]{0, copyOfRange[0], copyOfRange[1], copyOfRange[2], copyOfRange[3]}))) {
                return Inet4Address.getByAddress(copyOfRange).getHostAddress();
            }
            if (byteArray.length >= 16) {
                bArr = Arrays.copyOfRange(byteArray, byteArray.length - 16, byteArray.length);
            } else {
                bArr = new byte[16];
                int length = 16 - byteArray.length;
                int i2 = 1;
                int i3 = 0;
                while (i2 <= length) {
                    bArr[i3] = 0;
                    i2++;
                    i3++;
                }
                while (i < byteArray.length) {
                    int i4 = i3 + 1;
                    bArr[i3] = byteArray[i];
                    i++;
                    i3 = i4;
                }
            }
            return String.format("[%s]", Inet6Address.getByAddress(bArr).getHostAddress());
        } catch (ArrayIndexOutOfBoundsException e) {
            m16547a(e);
            return null;
        } catch (NumberFormatException e2) {
            m16547a(e2);
            return null;
        } catch (UnknownHostException e3) {
            m16547a(e3);
            return null;
        }
    }

    /* renamed from: c */
    private List<String> m16542c() {
        if (TextUtils.isEmpty(this.f22557i)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = this.f22557i.toCharArray();
        boolean z = false;
        for (int length = charArray.length - 2; length > 0 && arrayList.size() < 4; length--) {
            if (charArray[length] == '.') {
                if (z) {
                    arrayList.add(this.f22557i.substring(length + 1));
                } else {
                    z = true;
                }
            }
        }
        arrayList.add(this.f22557i);
        return arrayList;
    }

    /* renamed from: d */
    private String m16539d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(47);
        String replaceAll = (indexOf != -1 ? str.substring(indexOf) : "/").replaceAll("/\\./", "/").replaceAll("/\\.$", "/");
        if (f22551c.matcher(replaceAll).find()) {
            try {
                replaceAll = new URI(this.f22556h, C10445j.HOST, replaceAll, null).normalize().getRawPath();
            } catch (URISyntaxException e) {
            }
        }
        return replaceAll.replaceAll("/+", "/");
    }

    /* renamed from: d */
    private List<String> m16540d() {
        if (TextUtils.isEmpty(this.f22559k)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = this.f22559k.toCharArray();
        for (int i = 0; i < charArray.length && arrayList.size() < 4; i++) {
            if (charArray[i] == '/') {
                arrayList.add(this.f22559k.substring(0, i + 1));
            }
        }
        if (!arrayList.isEmpty() && !((String) arrayList.get(arrayList.size() - 1)).equals(this.f22559k)) {
            arrayList.add(this.f22559k);
        }
        if (!TextUtils.isEmpty(this.f22560l)) {
            String str = this.f22559k;
            String str2 = this.f22560l;
            arrayList.add(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append(C0363a.f360a).append(str2).toString());
        }
        return arrayList;
    }

    /* renamed from: e */
    private static boolean m16538e(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: f */
    private static String m16537f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                char c = (char) (b & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
                if (c <= ' ' || c > '~' || c == '#' || c == '%') {
                    sb.append("%");
                    sb.append(f22550b[c >>> 4]);
                    sb.append(f22550b[c & 15]);
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    /* renamed from: g */
    private static String m16536g(String str) {
        String str2;
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i = 0;
        while (true) {
            str2 = str;
            if (str2.equals(obj) || i >= 1024) {
                break;
            }
            str = m16535h(str2);
            i++;
            obj = str2;
        }
        return str2;
    }

    /* renamed from: h */
    private static String m16535h(String str) {
        try {
            byte[] bytes = str.replace("\\x", "%").getBytes("UTF-8");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bytes.length);
            int i = 0;
            while (i < bytes.length) {
                byte b = bytes[i];
                if (((char) (b & SmileConstants.BYTE_MARKER_END_OF_CONTENT)) >= 128) {
                    byteArrayOutputStream.write(b);
                } else {
                    Byte m16545a = m16545a(bytes, i);
                    if (m16545a != null) {
                        byteArrayOutputStream.write(m16545a.byteValue());
                        i += 2;
                    } else {
                        byteArrayOutputStream.write(b);
                    }
                }
                i++;
            }
            try {
                return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public List<String> m16549a() {
        List<String> m16542c;
        List<String> m16540d;
        if (TextUtils.isEmpty(this.f22555g)) {
            return null;
        }
        String m16543b = m16543b(this.f22557i);
        if (m16543b != null) {
            m16542c = new ArrayList<>();
            m16542c.add(m16543b);
        } else {
            m16542c = m16542c();
        }
        if (m16542c == null || m16542c.isEmpty() || (m16540d = m16540d()) == null || m16540d.isEmpty()) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (String str : m16542c) {
            for (String str2 : m16540d) {
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(str2);
                linkedList.add(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            }
        }
        return !linkedList.isEmpty() ? linkedList : null;
    }

    /* renamed from: b */
    public List<aoa> m16544b() {
        MessageDigest messageDigest;
        List<String> m16549a = m16549a();
        if (m16549a == null || m16549a.isEmpty()) {
            return null;
        }
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            m16547a(e);
            messageDigest = null;
        }
        if (messageDigest == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(m16549a.size());
        for (String str : m16549a) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    arrayList.add(new aoa(messageDigest.digest(str.getBytes("UTF-8"))));
                } catch (UnsupportedEncodingException e2) {
                    m16547a(e2);
                }
                messageDigest.reset();
            }
        }
        return !arrayList.isEmpty() ? arrayList : null;
    }
}
