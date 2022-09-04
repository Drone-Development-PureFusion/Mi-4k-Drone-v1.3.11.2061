package p005b.p006a.p007a.p029b.p057q;

import java.util.ArrayList;
import java.util.List;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p055o.C0674r;
import p005b.p006a.p007a.p029b.p057q.C0697d;
/* renamed from: b.a.a.b.q.e */
/* loaded from: classes.dex */
public class C0699e {

    /* renamed from: a */
    final String f1262a;

    /* renamed from: b */
    final int f1263b;

    /* renamed from: c */
    EnumC0701a f1264c = EnumC0701a.LITERAL_STATE;

    /* renamed from: d */
    int f1265d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.a.a.b.q.e$a */
    /* loaded from: classes.dex */
    public enum EnumC0701a {
        LITERAL_STATE,
        START_STATE,
        DEFAULT_VAL_STATE
    }

    public C0699e(String str) {
        this.f1262a = str;
        this.f1263b = str.length();
    }

    /* renamed from: a */
    private void m38444a(char c, List<C0697d> list, StringBuilder sb) {
        switch (c) {
            case '$':
                sb.append(C0494h.f680A);
                m38443a(list, sb);
                sb.setLength(0);
                this.f1264c = EnumC0701a.START_STATE;
                return;
            case '-':
                list.add(C0697d.f1253d);
                this.f1264c = EnumC0701a.LITERAL_STATE;
                return;
            default:
                sb.append(C0494h.f680A).append(c);
                this.f1264c = EnumC0701a.LITERAL_STATE;
                return;
        }
    }

    /* renamed from: a */
    private void m38443a(List<C0697d> list, StringBuilder sb) {
        if (sb.length() == 0) {
            return;
        }
        list.add(new C0697d(C0697d.EnumC0698a.LITERAL, sb.toString()));
    }

    /* renamed from: b */
    private void m38442b(char c, List<C0697d> list, StringBuilder sb) {
        if (c == '{') {
            list.add(C0697d.f1250a);
        } else {
            sb.append(C0494h.f688I).append(c);
        }
        this.f1264c = EnumC0701a.LITERAL_STATE;
    }

    /* renamed from: c */
    private void m38441c(char c, List<C0697d> list, StringBuilder sb) {
        if (c == '$') {
            m38443a(list, sb);
            sb.setLength(0);
            this.f1264c = EnumC0701a.START_STATE;
        } else if (c == ':') {
            m38443a(list, sb);
            sb.setLength(0);
            this.f1264c = EnumC0701a.DEFAULT_VAL_STATE;
        } else if (c == '{') {
            m38443a(list, sb);
            list.add(C0697d.f1251b);
            sb.setLength(0);
        } else if (c != '}') {
            sb.append(c);
        } else {
            m38443a(list, sb);
            list.add(C0697d.f1252c);
            sb.setLength(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C0697d> m38445a() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        while (this.f1265d < this.f1263b) {
            char charAt = this.f1262a.charAt(this.f1265d);
            this.f1265d++;
            switch (this.f1264c) {
                case LITERAL_STATE:
                    m38441c(charAt, arrayList, sb);
                    break;
                case START_STATE:
                    m38442b(charAt, arrayList, sb);
                    break;
                case DEFAULT_VAL_STATE:
                    m38444a(charAt, arrayList, sb);
                    break;
            }
        }
        switch (this.f1264c) {
            case START_STATE:
                throw new C0674r("Unexpected end of pattern string");
            case LITERAL_STATE:
                m38443a(arrayList, sb);
                break;
        }
        return arrayList;
    }
}
