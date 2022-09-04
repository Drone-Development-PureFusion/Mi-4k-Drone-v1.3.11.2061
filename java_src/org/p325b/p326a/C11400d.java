package org.p325b.p326a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.p325b.AbstractC11415b;
import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11431i;
import org.p325b.AbstractC11433k;
/* renamed from: org.b.a.d */
/* loaded from: classes.dex */
public class C11400d<T> extends AbstractC11415b<T> {

    /* renamed from: d */
    private static final Pattern f36514d = Pattern.compile("%([0-9]+)");

    /* renamed from: a */
    private final String f36515a;

    /* renamed from: b */
    private final AbstractC11433k<T> f36516b;

    /* renamed from: c */
    private final Object[] f36517c;

    public C11400d(String str, AbstractC11433k<T> abstractC11433k, Object[] objArr) {
        this.f36515a = str;
        this.f36516b = abstractC11433k;
        this.f36517c = (Object[]) objArr.clone();
    }

    @AbstractC11431i
    /* renamed from: a */
    public static <T> AbstractC11433k<T> m1180a(String str, AbstractC11433k<T> abstractC11433k, Object... objArr) {
        return new C11400d(str, abstractC11433k, objArr);
    }

    @Override // org.p325b.AbstractC11415b, org.p325b.AbstractC11433k
    /* renamed from: a */
    public void mo1070a(Object obj, AbstractC11428g abstractC11428g) {
        this.f36516b.mo1070a(obj, abstractC11428g);
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        Matcher matcher = f36514d.matcher(this.f36515a);
        int i = 0;
        while (matcher.find()) {
            abstractC11428g.mo1086a(this.f36515a.substring(i, matcher.start()));
            abstractC11428g.mo1087a(this.f36517c[Integer.parseInt(matcher.group(1))]);
            i = matcher.end();
        }
        if (i < this.f36515a.length()) {
            abstractC11428g.mo1086a(this.f36515a.substring(i));
        }
    }

    @Override // org.p325b.AbstractC11433k
    /* renamed from: a */
    public boolean mo900a(Object obj) {
        return this.f36516b.mo900a(obj);
    }
}
