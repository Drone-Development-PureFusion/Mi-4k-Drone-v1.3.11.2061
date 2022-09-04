package p005b.p006a.p007a.p029b.p036g.p040d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import org.xml.sax.Locator;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.p036g.p038b.AbstractC0462c;
import p005b.p006a.p007a.p029b.p036g.p038b.C0463d;
import p005b.p006a.p007a.p029b.p055o.AbstractC0672p;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.g.d.k */
/* loaded from: classes.dex */
public class C0479k extends C0662f implements AbstractC0672p {

    /* renamed from: d */
    C0480l f652d;

    /* renamed from: e */
    final List<AbstractC0462c> f653e = new ArrayList();

    /* renamed from: f */
    C0474f f654f = new C0474f();

    /* renamed from: a */
    Stack<Object> f649a = new Stack<>();

    /* renamed from: b */
    Map<String, Object> f650b = new HashMap(5);

    /* renamed from: c */
    Map<String, String> f651c = new HashMap(5);

    public C0479k(AbstractC0427f abstractC0427f, C0480l c0480l) {
        this.f1199s = abstractC0427f;
        this.f652d = c0480l;
    }

    /* renamed from: a */
    public C0474f m39203a() {
        return this.f654f;
    }

    /* renamed from: a */
    public Object m39202a(int i) {
        return this.f649a.get(i);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0672p
    /* renamed from: a */
    public String mo38529a(String str) {
        String str2 = this.f651c.get(str);
        return str2 != null ? str2 : this.f1199s.mo38529a(str);
    }

    /* renamed from: a */
    public void m39201a(AbstractC0462c abstractC0462c) {
        if (this.f653e.contains(abstractC0462c)) {
            e("InPlayListener " + abstractC0462c + " has been already registered");
        } else {
            this.f653e.add(abstractC0462c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m39200a(C0463d c0463d) {
        for (AbstractC0462c abstractC0462c : this.f653e) {
            abstractC0462c.mo39252a(c0463d);
        }
    }

    /* renamed from: a */
    public void m39199a(Object obj) {
        this.f649a.push(obj);
    }

    /* renamed from: a */
    public void m39198a(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.f651c.put(str, str2.trim());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m39197a(Map<String, String> map) {
        this.f651c = map;
    }

    /* renamed from: a */
    public void m39196a(Properties properties) {
        if (properties == null) {
            return;
        }
        for (String str : properties.keySet()) {
            m39198a(str, properties.getProperty(str));
        }
    }

    /* renamed from: b */
    String m39193b(String str) {
        Locator m39166e = this.f652d.m39166e();
        return m39166e != null ? str + m39166e.getLineNumber() + ":" + m39166e.getColumnNumber() : str;
    }

    /* renamed from: b */
    public Locator m39195b() {
        return this.f652d.m39166e();
    }

    /* renamed from: b */
    public boolean m39194b(AbstractC0462c abstractC0462c) {
        return this.f653e.remove(abstractC0462c);
    }

    /* renamed from: c */
    public C0480l m39192c() {
        return this.f652d;
    }

    /* renamed from: d */
    public Stack<Object> m39191d() {
        return this.f649a;
    }

    /* renamed from: e */
    public boolean m39190e() {
        return this.f649a.isEmpty();
    }

    /* renamed from: f */
    public Object m39189f() {
        return this.f649a.peek();
    }

    /* renamed from: f */
    public String m39188f(String str) {
        if (str == null) {
            return null;
        }
        return C0724u.m38383a(str, this, this.f1199s);
    }

    /* renamed from: g */
    public Object m39187g() {
        return this.f649a.pop();
    }

    /* renamed from: h */
    public Map<String, Object> m39186h() {
        return this.f650b;
    }

    /* renamed from: j */
    public boolean m39185j() {
        return this.f653e.isEmpty();
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0672p
    /* renamed from: o */
    public Map<String, String> mo38528o() {
        return new HashMap(this.f651c);
    }
}
