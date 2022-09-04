package cn.sharesdk.framework.utils;

import android.util.Base64;
import com.mob.tools.network.KVPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
import org.p286a.p287a.p290c.p293c.C11048l;
import org.p286a.p287a.p290c.p296f.C11081j;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: cn.sharesdk.framework.utils.a */
/* loaded from: classes.dex */
public class C0825a {

    /* renamed from: a */
    private C0828b f1655a = new C0828b();

    /* renamed from: b */
    private C0829b f1656b = new C0829b("-._~", false);

    /* renamed from: cn.sharesdk.framework.utils.a$a */
    /* loaded from: classes.dex */
    public enum EnumC0827a {
        HMAC_SHA1,
        PLAINTEXT
    }

    /* renamed from: cn.sharesdk.framework.utils.a$b */
    /* loaded from: classes.dex */
    public static class C0828b {

        /* renamed from: a */
        public String f1661a;

        /* renamed from: b */
        public String f1662b;

        /* renamed from: c */
        public String f1663c;

        /* renamed from: d */
        public String f1664d;

        /* renamed from: e */
        public String f1665e;
    }

    /* renamed from: a */
    private ArrayList<KVPair<String>> m37787a(long j, String str) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("oauth_consumer_key", this.f1655a.f1661a));
        arrayList.add(new KVPair<>("oauth_signature_method", str));
        arrayList.add(new KVPair<>("oauth_timestamp", String.valueOf(j / 1000)));
        arrayList.add(new KVPair<>("oauth_nonce", String.valueOf(j)));
        arrayList.add(new KVPair<>("oauth_version", "1.0"));
        String str2 = this.f1655a.f1663c;
        if (str2 != null && str2.length() > 0) {
            arrayList.add(new KVPair<>("oauth_token", str2));
        }
        return arrayList;
    }

    /* renamed from: a */
    private ArrayList<KVPair<String>> m37786a(long j, ArrayList<KVPair<String>> arrayList, String str) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator<KVPair<String>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                KVPair<String> next = it2.next();
                hashMap.put(m37785a(next.name), m37785a(next.value));
            }
        }
        ArrayList<KVPair<String>> m37787a = m37787a(j, str);
        if (m37787a != null) {
            Iterator<KVPair<String>> it3 = m37787a.iterator();
            while (it3.hasNext()) {
                KVPair<String> next2 = it3.next();
                hashMap.put(m37785a(next2.name), m37785a(next2.value));
            }
        }
        String[] strArr = new String[hashMap.size()];
        int i = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            strArr[i] = (String) entry.getKey();
            i++;
        }
        Arrays.sort(strArr);
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        for (String str2 : strArr) {
            arrayList2.add(new KVPair<>(str2, hashMap.get(str2)));
        }
        return arrayList2;
    }

    /* renamed from: a */
    private ArrayList<KVPair<String>> m37782a(String str, String str2, ArrayList<KVPair<String>> arrayList, EnumC0827a enumC0827a) {
        String str3;
        String str4 = null;
        long currentTimeMillis = System.currentTimeMillis();
        switch (enumC0827a) {
            case HMAC_SHA1:
                str4 = "HMAC-SHA1";
                SecretKeySpec secretKeySpec = new SecretKeySpec((m37785a(this.f1655a.f1662b) + '&' + m37785a(this.f1655a.f1664d)).getBytes("utf-8"), "HMAC-SHA1");
                Mac mac = Mac.getInstance("HMAC-SHA1");
                mac.init(secretKeySpec);
                str3 = new String(Base64.encode(mac.doFinal((str2 + '&' + m37785a(str) + '&' + m37785a(m37776b(m37786a(currentTimeMillis, arrayList, str4)))).getBytes("utf-8")), 0)).trim();
                break;
            case PLAINTEXT:
                str4 = "PLAINTEXT";
                str3 = m37785a(this.f1655a.f1662b) + '&' + m37785a(this.f1655a.f1664d);
                break;
            default:
                str3 = null;
                break;
        }
        ArrayList<KVPair<String>> m37787a = m37787a(currentTimeMillis, str4);
        m37787a.add(new KVPair<>("oauth_signature", str3));
        return m37787a;
    }

    /* renamed from: b */
    private String m37776b(ArrayList<KVPair<String>> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        Iterator<KVPair<String>> it2 = arrayList.iterator();
        while (true) {
            int i2 = i;
            if (!it2.hasNext()) {
                return sb.toString();
            }
            KVPair<String> next = it2.next();
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(next.name).append(SignatureVisitor.INSTANCEOF).append(next.value);
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    public C0828b m37788a() {
        return this.f1655a;
    }

    /* renamed from: a */
    public String m37785a(String str) {
        return str == null ? "" : this.f1656b.escape(str);
    }

    /* renamed from: a */
    public ArrayList<KVPair<String>> m37781a(String str, ArrayList<KVPair<String>> arrayList) {
        return m37780a(str, arrayList, EnumC0827a.HMAC_SHA1);
    }

    /* renamed from: a */
    public ArrayList<KVPair<String>> m37780a(String str, ArrayList<KVPair<String>> arrayList, EnumC0827a enumC0827a) {
        return m37782a(str, "POST", arrayList, enumC0827a);
    }

    /* renamed from: a */
    public ArrayList<KVPair<String>> m37779a(ArrayList<KVPair<String>> arrayList) {
        StringBuilder sb = new StringBuilder("OAuth ");
        int i = 0;
        Iterator<KVPair<String>> it2 = arrayList.iterator();
        while (true) {
            int i2 = i;
            if (!it2.hasNext()) {
                ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
                arrayList2.add(new KVPair<>("Authorization", sb.toString()));
                arrayList2.add(new KVPair<>("Content-Type", C11081j.f35660a));
                return arrayList2;
            }
            KVPair<String> next = it2.next();
            if (i2 > 0) {
                sb.append(C0494h.f736x);
            }
            sb.append(next.name).append("=\"").append(m37785a(next.value)).append("\"");
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    public void m37784a(String str, String str2) {
        this.f1655a.f1663c = str;
        this.f1655a.f1664d = str2;
    }

    /* renamed from: a */
    public void m37783a(String str, String str2, String str3) {
        this.f1655a.f1661a = str;
        this.f1655a.f1662b = str2;
        this.f1655a.f1665e = str3;
    }

    /* renamed from: b */
    public ArrayList<KVPair<String>> m37778b(String str, ArrayList<KVPair<String>> arrayList) {
        return m37777b(str, arrayList, EnumC0827a.HMAC_SHA1);
    }

    /* renamed from: b */
    public ArrayList<KVPair<String>> m37777b(String str, ArrayList<KVPair<String>> arrayList, EnumC0827a enumC0827a) {
        return m37782a(str, "GET", arrayList, enumC0827a);
    }

    /* renamed from: c */
    public ArrayList<KVPair<String>> m37775c(String str, ArrayList<KVPair<String>> arrayList, EnumC0827a enumC0827a) {
        return m37782a(str, C11048l.f35589a, arrayList, enumC0827a);
    }
}
