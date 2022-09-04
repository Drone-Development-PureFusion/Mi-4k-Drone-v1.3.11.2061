package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import com.google.android.gms.internal.EnumC6958fh;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.ao */
/* loaded from: classes2.dex */
public class C9053ao extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28697a = EnumC6890eg.JOINER.toString();

    /* renamed from: b */
    private static final String f28698b = EnumC6958fh.ARG0.toString();

    /* renamed from: c */
    private static final String f28699c = EnumC6958fh.ITEM_SEPARATOR.toString();

    /* renamed from: d */
    private static final String f28700d = EnumC6958fh.KEY_VALUE_SEPARATOR.toString();

    /* renamed from: e */
    private static final String f28701e = EnumC6958fh.ESCAPE.toString();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.tagmanager.ao$a */
    /* loaded from: classes2.dex */
    public enum EnumC9055a {
        NONE,
        URL,
        BACKSLASH
    }

    public C9053ao() {
        super(f28697a, f28698b);
    }

    /* renamed from: a */
    private String m9309a(String str, EnumC9055a enumC9055a, Set<Character> set) {
        switch (enumC9055a) {
            case URL:
                try {
                    return C9152da.m9080a(str);
                } catch (UnsupportedEncodingException e) {
                    C9065aw.m9300a("Joiner: unsupported encoding", e);
                    return str;
                }
            case BACKSLASH:
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
    private void m9308a(StringBuilder sb, String str, EnumC9055a enumC9055a, Set<Character> set) {
        sb.append(m9309a(str, enumC9055a, set));
    }

    /* renamed from: a */
    private void m9307a(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        HashSet hashSet;
        EnumC9055a enumC9055a;
        AbstractC7090hj.C7091a c7091a = map.get(f28698b);
        if (c7091a == null) {
            return C9147cw.m9110g();
        }
        AbstractC7090hj.C7091a c7091a2 = map.get(f28699c);
        String m9132a = c7091a2 != null ? C9147cw.m9132a(c7091a2) : "";
        AbstractC7090hj.C7091a c7091a3 = map.get(f28700d);
        String m9132a2 = c7091a3 != null ? C9147cw.m9132a(c7091a3) : "=";
        EnumC9055a enumC9055a2 = EnumC9055a.NONE;
        AbstractC7090hj.C7091a c7091a4 = map.get(f28701e);
        if (c7091a4 != null) {
            String m9132a3 = C9147cw.m9132a(c7091a4);
            if ("url".equals(m9132a3)) {
                enumC9055a = EnumC9055a.URL;
                hashSet = null;
            } else if (!"backslash".equals(m9132a3)) {
                String valueOf = String.valueOf(m9132a3);
                C9065aw.m9301a(valueOf.length() != 0 ? "Joiner: unsupported escape type: ".concat(valueOf) : new String("Joiner: unsupported escape type: "));
                return C9147cw.m9110g();
            } else {
                enumC9055a = EnumC9055a.BACKSLASH;
                hashSet = new HashSet();
                m9307a(hashSet, m9132a);
                m9307a(hashSet, m9132a2);
                hashSet.remove('\\');
            }
        } else {
            hashSet = null;
            enumC9055a = enumC9055a2;
        }
        StringBuilder sb = new StringBuilder();
        switch (c7091a.f23881a) {
            case 2:
                boolean z = true;
                AbstractC7090hj.C7091a[] c7091aArr = c7091a.f23883c;
                int length = c7091aArr.length;
                int i = 0;
                while (i < length) {
                    AbstractC7090hj.C7091a c7091a5 = c7091aArr[i];
                    if (!z) {
                        sb.append(m9132a);
                    }
                    m9308a(sb, C9147cw.m9132a(c7091a5), enumC9055a, hashSet);
                    i++;
                    z = false;
                }
                break;
            case 3:
                for (int i2 = 0; i2 < c7091a.f23884d.length; i2++) {
                    if (i2 > 0) {
                        sb.append(m9132a);
                    }
                    String m9132a4 = C9147cw.m9132a(c7091a.f23884d[i2]);
                    String m9132a5 = C9147cw.m9132a(c7091a.f23885e[i2]);
                    m9308a(sb, m9132a4, enumC9055a, hashSet);
                    sb.append(m9132a2);
                    m9308a(sb, m9132a5, enumC9055a, hashSet);
                }
                break;
            default:
                m9308a(sb, C9147cw.m9132a(c7091a), enumC9055a, hashSet);
                break;
        }
        return C9147cw.m9111f(sb.toString());
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
