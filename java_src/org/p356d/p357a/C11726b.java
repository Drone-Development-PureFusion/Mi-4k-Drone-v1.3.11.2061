package org.p356d.p357a;

import java.util.Queue;
import org.p356d.AbstractC11747c;
import org.p356d.AbstractC11759f;
import org.p356d.p358b.C11742k;
/* renamed from: org.d.a.b */
/* loaded from: classes3.dex */
public class C11726b implements AbstractC11747c {

    /* renamed from: a */
    String f37011a;

    /* renamed from: b */
    C11742k f37012b;

    /* renamed from: d */
    Queue<C11729e> f37013d;

    public C11726b(C11742k c11742k, Queue<C11729e> queue) {
        this.f37012b = c11742k;
        this.f37011a = c11742k.mo88d();
        this.f37013d = queue;
    }

    /* renamed from: a */
    private void m187a(EnumC11727c enumC11727c, String str, Object[] objArr, Throwable th) {
        m186a(enumC11727c, null, str, objArr, th);
    }

    /* renamed from: a */
    private void m186a(EnumC11727c enumC11727c, AbstractC11759f abstractC11759f, String str, Object[] objArr, Throwable th) {
        C11729e c11729e = new C11729e();
        c11729e.m183a(System.currentTimeMillis());
        c11729e.m180a(enumC11727c);
        c11729e.m179a(this.f37012b);
        c11729e.m182a(this.f37011a);
        c11729e.m175b(str);
        c11729e.m177a(objArr);
        c11729e.m181a(th);
        c11729e.m173c(Thread.currentThread().getName());
        this.f37013d.add(c11729e);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo118a(String str, Object obj) {
        m187a(EnumC11727c.TRACE, str, new Object[]{obj}, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo117a(String str, Object obj, Object obj2) {
        m187a(EnumC11727c.TRACE, str, new Object[]{obj, obj2}, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo116a(String str, Throwable th) {
        m187a(EnumC11727c.TRACE, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo115a(String str, Object... objArr) {
        m187a(EnumC11727c.TRACE, str, objArr, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo113a(AbstractC11759f abstractC11759f, String str) {
        m186a(EnumC11727c.TRACE, abstractC11759f, str, null, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo112a(AbstractC11759f abstractC11759f, String str, Object obj) {
        m186a(EnumC11727c.TRACE, abstractC11759f, str, new Object[]{obj}, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo111a(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m186a(EnumC11727c.TRACE, abstractC11759f, str, new Object[]{obj, obj2}, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo110a(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m186a(EnumC11727c.TRACE, abstractC11759f, str, null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo109a(AbstractC11759f abstractC11759f, String str, Object... objArr) {
        m186a(EnumC11727c.TRACE, abstractC11759f, str, objArr, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public boolean mo114a(AbstractC11759f abstractC11759f) {
        return true;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo108b(String str, Object obj) {
        m187a(EnumC11727c.DEBUG, str, new Object[]{obj}, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo107b(String str, Object obj, Object obj2) {
        m187a(EnumC11727c.DEBUG, str, new Object[]{obj, obj2}, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo106b(String str, Throwable th) {
        m187a(EnumC11727c.DEBUG, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo105b(String str, Object... objArr) {
        m187a(EnumC11727c.DEBUG, str, objArr, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo103b(AbstractC11759f abstractC11759f, String str) {
        m186a(EnumC11727c.DEBUG, abstractC11759f, str, null, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo102b(AbstractC11759f abstractC11759f, String str, Object obj) {
        m186a(EnumC11727c.DEBUG, abstractC11759f, str, new Object[]{obj}, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo101b(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m186a(EnumC11727c.DEBUG, abstractC11759f, str, new Object[]{obj, obj2}, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo100b(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m186a(EnumC11727c.DEBUG, abstractC11759f, str, null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo99b(AbstractC11759f abstractC11759f, String str, Object... objArr) {
        m186a(EnumC11727c.DEBUG, abstractC11759f, str, objArr, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public boolean mo104b(AbstractC11759f abstractC11759f) {
        return true;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo98c(String str, Object obj) {
        m187a(EnumC11727c.ERROR, str, new Object[]{obj}, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo97c(String str, Object obj, Object obj2) {
        m187a(EnumC11727c.ERROR, str, new Object[]{obj, obj2}, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo96c(String str, Throwable th) {
        m187a(EnumC11727c.ERROR, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo95c(String str, Object... objArr) {
        m187a(EnumC11727c.ERROR, str, objArr, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo93c(AbstractC11759f abstractC11759f, String str) {
        m186a(EnumC11727c.ERROR, abstractC11759f, str, null, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo92c(AbstractC11759f abstractC11759f, String str, Object obj) {
        m186a(EnumC11727c.ERROR, abstractC11759f, str, new Object[]{obj}, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo91c(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m186a(EnumC11727c.ERROR, abstractC11759f, str, new Object[]{obj, obj2}, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo90c(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m186a(EnumC11727c.ERROR, abstractC11759f, str, null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo89c(AbstractC11759f abstractC11759f, String str, Object... objArr) {
        m186a(EnumC11727c.ERROR, abstractC11759f, str, objArr, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public boolean mo94c(AbstractC11759f abstractC11759f) {
        return true;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public String mo88d() {
        return this.f37011a;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo87d(String str, Object obj) {
        m187a(EnumC11727c.INFO, str, new Object[]{obj}, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo86d(String str, Object obj, Object obj2) {
        m187a(EnumC11727c.INFO, str, new Object[]{obj, obj2}, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo85d(String str, Throwable th) {
        m187a(EnumC11727c.INFO, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo84d(String str, Object... objArr) {
        m187a(EnumC11727c.INFO, str, objArr, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo82d(AbstractC11759f abstractC11759f, String str) {
        m186a(EnumC11727c.INFO, abstractC11759f, str, null, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo81d(AbstractC11759f abstractC11759f, String str, Object obj) {
        m186a(EnumC11727c.INFO, abstractC11759f, str, new Object[]{obj}, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo80d(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m186a(EnumC11727c.INFO, abstractC11759f, str, new Object[]{obj, obj2}, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo79d(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m186a(EnumC11727c.INFO, abstractC11759f, str, null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo78d(AbstractC11759f abstractC11759f, String str, Object... objArr) {
        m186a(EnumC11727c.INFO, abstractC11759f, str, objArr, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public boolean mo83d(AbstractC11759f abstractC11759f) {
        return true;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo77e(String str, Object obj) {
        m187a(EnumC11727c.WARN, str, new Object[]{obj}, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo76e(String str, Object obj, Object obj2) {
        m187a(EnumC11727c.WARN, str, new Object[]{obj, obj2}, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo75e(String str, Throwable th) {
        m187a(EnumC11727c.WARN, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo74e(String str, Object... objArr) {
        m187a(EnumC11727c.WARN, str, objArr, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo72e(AbstractC11759f abstractC11759f, String str) {
        m187a(EnumC11727c.WARN, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo71e(AbstractC11759f abstractC11759f, String str, Object obj) {
        m187a(EnumC11727c.WARN, str, new Object[]{obj}, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo70e(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m186a(EnumC11727c.WARN, abstractC11759f, str, new Object[]{obj, obj2}, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo69e(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m186a(EnumC11727c.WARN, abstractC11759f, str, null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo68e(AbstractC11759f abstractC11759f, String str, Object... objArr) {
        m186a(EnumC11727c.WARN, abstractC11759f, str, objArr, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public boolean mo73e(AbstractC11759f abstractC11759f) {
        return true;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: f */
    public void mo67f(String str) {
        m187a(EnumC11727c.TRACE, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: g */
    public void mo66g(String str) {
        m187a(EnumC11727c.TRACE, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: h */
    public void mo64h(String str) {
        m187a(EnumC11727c.ERROR, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: h */
    public boolean mo65h() {
        return true;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: i */
    public void mo62i(String str) {
        m187a(EnumC11727c.INFO, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: i */
    public boolean mo63i() {
        return true;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: j */
    public void mo60j(String str) {
        m187a(EnumC11727c.WARN, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: j */
    public boolean mo61j() {
        return true;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: k */
    public boolean mo59k() {
        return true;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: l */
    public boolean mo58l() {
        return true;
    }
}
