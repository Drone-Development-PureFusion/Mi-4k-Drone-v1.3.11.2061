package p005b.p006a.p007a.p029b.p045i.p048c;
/* renamed from: b.a.a.b.i.c.e */
/* loaded from: classes.dex */
public class C0583e implements AbstractC0581c {
    @Override // p005b.p006a.p007a.p029b.p045i.p048c.AbstractC0581c
    /* renamed from: a */
    public void mo38812a(String str, StringBuffer stringBuffer, char c, int i) {
        if (str.indexOf(c) >= 0) {
            stringBuffer.append(c);
            return;
        }
        stringBuffer.append("\\");
        stringBuffer.append(c);
    }
}
