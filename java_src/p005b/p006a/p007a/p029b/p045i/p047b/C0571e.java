package p005b.p006a.p007a.p029b.p045i.p047b;

import com.google.android.gms.location.places.AbstractC8240d;
import java.util.ArrayList;
import java.util.List;
import p005b.p006a.p007a.p029b.p045i.p047b.C0575i;
import p005b.p006a.p007a.p029b.p045i.p048c.AbstractC0581c;
import p005b.p006a.p007a.p029b.p045i.p048c.C0580b;
import p005b.p006a.p007a.p029b.p055o.C0674r;
/* renamed from: b.a.a.b.i.b.e */
/* loaded from: classes.dex */
public class C0571e {

    /* renamed from: g */
    private static final int f956g = 0;

    /* renamed from: h */
    private static final int f957h = 1;

    /* renamed from: i */
    private static final int f958i = 2;

    /* renamed from: a */
    final AbstractC0581c f959a;

    /* renamed from: b */
    final C0575i f960b;

    /* renamed from: c */
    final String f961c;

    /* renamed from: d */
    final int f962d;

    /* renamed from: e */
    char f963e;

    /* renamed from: f */
    int f964f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0571e(C0575i c0575i) {
        this(c0575i, new C0580b());
    }

    C0571e(C0575i c0575i, AbstractC0581c abstractC0581c) {
        this.f964f = 0;
        this.f960b = c0575i;
        this.f961c = c0575i.f989a;
        this.f962d = c0575i.f990b;
        this.f959a = abstractC0581c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m38845a(char c, List<C0574h> list) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (this.f960b.f994f < this.f962d) {
            switch (this.f964f) {
                case 0:
                    switch (c) {
                        case '\t':
                        case '\n':
                        case '\r':
                        case ' ':
                        case ',':
                            break;
                        case '\"':
                        case '\'':
                            this.f964f = 2;
                            this.f963e = c;
                            continue;
                        case '}':
                            m38843a(list, arrayList);
                            return;
                        default:
                            stringBuffer.append(c);
                            this.f964f = 1;
                            continue;
                    }
                case 1:
                    switch (c) {
                        case ',':
                            arrayList.add(stringBuffer.toString().trim());
                            stringBuffer.setLength(0);
                            this.f964f = 0;
                            continue;
                        case '}':
                            arrayList.add(stringBuffer.toString().trim());
                            m38843a(list, arrayList);
                            return;
                        default:
                            stringBuffer.append(c);
                            continue;
                    }
                case 2:
                    if (c != this.f963e) {
                        if (c != '\\') {
                            stringBuffer.append(c);
                            break;
                        } else {
                            m38844a(String.valueOf(this.f963e), stringBuffer);
                            break;
                        }
                    } else {
                        arrayList.add(stringBuffer.toString());
                        stringBuffer.setLength(0);
                        this.f964f = 0;
                        break;
                    }
            }
            c = this.f961c.charAt(this.f960b.f994f);
            this.f960b.f994f++;
        }
        if (c == '}') {
            if (this.f964f == 0) {
                m38843a(list, arrayList);
                return;
            } else if (this.f964f != 1) {
                throw new C0674r("Unexpected end of pattern string in OptionTokenizer");
            } else {
                arrayList.add(stringBuffer.toString().trim());
                m38843a(list, arrayList);
                return;
            }
        }
        throw new C0674r("Unexpected end of pattern string in OptionTokenizer");
    }

    /* renamed from: a */
    void m38844a(String str, StringBuffer stringBuffer) {
        if (this.f960b.f994f < this.f962d) {
            String str2 = this.f961c;
            C0575i c0575i = this.f960b;
            int i = c0575i.f994f;
            c0575i.f994f = i + 1;
            this.f959a.mo38812a(str, stringBuffer, str2.charAt(i), this.f960b.f994f);
        }
    }

    /* renamed from: a */
    void m38843a(List<C0574h> list, List<String> list2) {
        list.add(new C0574h(AbstractC8240d.f26969aY, list2));
        this.f960b.f993e = C0575i.EnumC0577a.LITERAL_STATE;
    }
}
