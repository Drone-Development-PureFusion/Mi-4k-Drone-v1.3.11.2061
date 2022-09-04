package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.internal.cc */
/* loaded from: classes2.dex */
public class C6799cc extends aqg {
    /* renamed from: a */
    private String m16195a(String str, int i, Set<Character> set) {
        switch (i) {
            case 1:
                try {
                    return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
                } catch (UnsupportedEncodingException e) {
                    return str;
                }
            case 2:
                String replace = str.replace("\\", "\\\\");
                Iterator<Character> it2 = set.iterator();
                while (true) {
                    String str2 = replace;
                    if (!it2.hasNext()) {
                        return str2;
                    }
                    String ch = it2.next().toString();
                    String valueOf = String.valueOf(ch);
                    replace = str2.replace(ch, valueOf.length() != 0 ? "\\".concat(valueOf) : new String("\\"));
                }
            default:
                return str;
        }
    }

    /* renamed from: a */
    private void m16194a(StringBuilder sb, String str, int i, Set<Character> set) {
        sb.append(m16195a(str, i, set));
    }

    /* renamed from: a */
    private void m16193a(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        int i = 2;
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length >= 1);
        AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[0];
        C6886ee c6886ee = abstractC6880eaArr.length > 1 ? abstractC6880eaArr[1] : C6886ee.f23122e;
        String str = "";
        if (abstractC6880eaArr.length > 2) {
            str = abstractC6880eaArr[2] == C6886ee.f23122e ? "" : aqf.m16218d(abstractC6880eaArr[2]);
        }
        String str2 = "=";
        if (abstractC6880eaArr.length > 3) {
            str2 = abstractC6880eaArr[3] == C6886ee.f23122e ? "=" : aqf.m16218d(abstractC6880eaArr[3]);
        }
        HashSet hashSet = null;
        if (c6886ee != C6886ee.f23122e) {
            C4588d.m23619b(c6886ee instanceof C6893ej);
            if ("url".equals(c6886ee.mo16034b())) {
                i = 1;
            } else if (!"backslash".equals(c6886ee.mo16034b())) {
                return new C6893ej("");
            } else {
                HashSet hashSet2 = new HashSet();
                m16193a(hashSet2, str);
                m16193a(hashSet2, str2);
                hashSet2.remove('\\');
                hashSet = hashSet2;
            }
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        if (abstractC6880ea instanceof C6887ef) {
            for (AbstractC6880ea<?> abstractC6880ea2 : ((C6887ef) abstractC6880ea).mo16034b()) {
                if (!z) {
                    sb.append(str);
                }
                m16194a(sb, aqf.m16218d(abstractC6880ea2), i, hashSet);
                z = false;
            }
        } else if (abstractC6880ea instanceof C6891eh) {
            Map<String, AbstractC6880ea<?>> mo16034b = ((C6891eh) abstractC6880ea).mo16034b();
            boolean z2 = true;
            for (String str3 : mo16034b.keySet()) {
                if (!z2) {
                    sb.append(str);
                }
                String m16218d = aqf.m16218d(mo16034b.get(str3));
                m16194a(sb, str3, i, hashSet);
                sb.append(str2);
                m16194a(sb, m16218d, i, hashSet);
                z2 = false;
            }
        } else {
            m16194a(sb, aqf.m16218d(abstractC6880ea), i, hashSet);
        }
        return new C6893ej(sb.toString());
    }
}
