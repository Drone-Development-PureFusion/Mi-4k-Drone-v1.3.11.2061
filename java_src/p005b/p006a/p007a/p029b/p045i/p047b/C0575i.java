package p005b.p006a.p007a.p029b.p045i.p047b;

import com.google.android.gms.location.places.AbstractC8240d;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
import p005b.p006a.p007a.p029b.p045i.p048c.AbstractC0581c;
import p005b.p006a.p007a.p029b.p045i.p048c.C0582d;
import p005b.p006a.p007a.p029b.p045i.p048c.C0583e;
import p005b.p006a.p007a.p029b.p055o.C0674r;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.a.a.b.i.b.i */
/* loaded from: classes.dex */
public class C0575i {

    /* renamed from: a */
    final String f989a;

    /* renamed from: b */
    final int f990b;

    /* renamed from: c */
    final AbstractC0581c f991c;

    /* renamed from: d */
    final AbstractC0581c f992d;

    /* renamed from: e */
    EnumC0577a f993e;

    /* renamed from: f */
    int f994f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.a.a.b.i.b.i$a */
    /* loaded from: classes.dex */
    public enum EnumC0577a {
        LITERAL_STATE,
        FORMAT_MODIFIER_STATE,
        KEYWORD_STATE,
        OPTION_STATE,
        RIGHT_PARENTHESIS_STATE
    }

    C0575i(String str) {
        this(str, new C0582d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0575i(String str, AbstractC0581c abstractC0581c) {
        this.f992d = new C0583e();
        this.f993e = EnumC0577a.LITERAL_STATE;
        this.f994f = 0;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("null or empty pattern string not allowed");
        }
        this.f989a = str;
        this.f990b = str.length();
        this.f991c = abstractC0581c;
    }

    /* renamed from: a */
    private void m38825a(char c, List<C0574h> list, StringBuffer stringBuffer) {
        list.add(C0574h.f984n);
        switch (c) {
            case ')':
                return;
            case '\\':
                m38823a("%{}", stringBuffer);
                this.f993e = EnumC0577a.LITERAL_STATE;
                return;
            case Opcodes.LSHR /* 123 */:
                this.f993e = EnumC0577a.OPTION_STATE;
                return;
            default:
                stringBuffer.append(c);
                this.f993e = EnumC0577a.LITERAL_STATE;
                return;
        }
    }

    /* renamed from: a */
    private void m38824a(int i, StringBuffer stringBuffer, List<C0574h> list) {
        if (stringBuffer.length() > 0) {
            list.add(new C0574h(i, stringBuffer.toString()));
            stringBuffer.setLength(0);
        }
    }

    /* renamed from: b */
    private void m38822b(char c, List<C0574h> list, StringBuffer stringBuffer) {
        new C0571e(this).m38845a(c, list);
    }

    /* renamed from: c */
    private void m38820c(char c, List<C0574h> list, StringBuffer stringBuffer) {
        if (c == '(') {
            m38824a(1002, stringBuffer, list);
            list.add(C0574h.f985o);
            this.f993e = EnumC0577a.LITERAL_STATE;
        } else if (!Character.isJavaIdentifierStart(c)) {
            stringBuffer.append(c);
        } else {
            m38824a(1002, stringBuffer, list);
            this.f993e = EnumC0577a.KEYWORD_STATE;
            stringBuffer.append(c);
        }
    }

    /* renamed from: d */
    private void m38819d(char c, List<C0574h> list, StringBuffer stringBuffer) {
        switch (c) {
            case '%':
                m38824a(1000, stringBuffer, list);
                list.add(C0574h.f986p);
                this.f993e = EnumC0577a.FORMAT_MODIFIER_STATE;
                return;
            case ')':
                m38824a(1000, stringBuffer, list);
                this.f993e = EnumC0577a.RIGHT_PARENTHESIS_STATE;
                return;
            case '\\':
                m38823a("%()", stringBuffer);
                return;
            default:
                stringBuffer.append(c);
                return;
        }
    }

    /* renamed from: e */
    private void m38818e(char c, List<C0574h> list, StringBuffer stringBuffer) {
        if (Character.isJavaIdentifierPart(c)) {
            stringBuffer.append(c);
        } else if (c == '{') {
            m38824a(AbstractC8240d.f26967aW, stringBuffer, list);
            this.f993e = EnumC0577a.OPTION_STATE;
        } else if (c == '(') {
            m38824a(AbstractC8240d.f26968aX, stringBuffer, list);
            this.f993e = EnumC0577a.LITERAL_STATE;
        } else if (c == '%') {
            m38824a(AbstractC8240d.f26967aW, stringBuffer, list);
            list.add(C0574h.f986p);
            this.f993e = EnumC0577a.FORMAT_MODIFIER_STATE;
        } else if (c == ')') {
            m38824a(AbstractC8240d.f26967aW, stringBuffer, list);
            this.f993e = EnumC0577a.RIGHT_PARENTHESIS_STATE;
        } else {
            m38824a(AbstractC8240d.f26967aW, stringBuffer, list);
            if (c != '\\') {
                stringBuffer.append(c);
            } else if (this.f994f < this.f990b) {
                String str = this.f989a;
                int i = this.f994f;
                this.f994f = i + 1;
                this.f991c.mo38812a("%()", stringBuffer, str.charAt(i), this.f994f);
            }
            this.f993e = EnumC0577a.LITERAL_STATE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List m38826a() {
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        while (this.f994f < this.f990b) {
            char charAt = this.f989a.charAt(this.f994f);
            this.f994f++;
            switch (this.f993e) {
                case LITERAL_STATE:
                    m38819d(charAt, arrayList, stringBuffer);
                    break;
                case FORMAT_MODIFIER_STATE:
                    m38820c(charAt, arrayList, stringBuffer);
                    break;
                case OPTION_STATE:
                    m38822b(charAt, arrayList, stringBuffer);
                    break;
                case KEYWORD_STATE:
                    m38818e(charAt, arrayList, stringBuffer);
                    break;
                case RIGHT_PARENTHESIS_STATE:
                    m38825a(charAt, arrayList, stringBuffer);
                    break;
            }
        }
        switch (this.f993e) {
            case LITERAL_STATE:
                m38824a(1000, stringBuffer, arrayList);
                break;
            case FORMAT_MODIFIER_STATE:
            case OPTION_STATE:
                throw new C0674r("Unexpected end of pattern string");
            case KEYWORD_STATE:
                arrayList.add(new C0574h(AbstractC8240d.f26967aW, stringBuffer.toString()));
                break;
            case RIGHT_PARENTHESIS_STATE:
                arrayList.add(C0574h.f984n);
                break;
        }
        return arrayList;
    }

    /* renamed from: a */
    void m38823a(String str, StringBuffer stringBuffer) {
        if (this.f994f < this.f990b) {
            String str2 = this.f989a;
            int i = this.f994f;
            this.f994f = i + 1;
            this.f991c.mo38812a(str, stringBuffer, str2.charAt(i), this.f994f);
        }
    }

    /* renamed from: b */
    void m38821b(String str, StringBuffer stringBuffer) {
        if (this.f994f < this.f990b) {
            String str2 = this.f989a;
            int i = this.f994f;
            this.f994f = i + 1;
            this.f992d.mo38812a(str, stringBuffer, str2.charAt(i), this.f994f);
        }
    }
}
