package cn.sharesdk.framework;

import cn.sharesdk.framework.authorize.AbstractC0789d;
import cn.sharesdk.framework.authorize.AuthorizeHelper;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.C0788c;
import cn.sharesdk.framework.authorize.C0790e;
import cn.sharesdk.framework.authorize.SSOListener;
/* renamed from: cn.sharesdk.framework.b */
/* loaded from: classes.dex */
public abstract class AbstractC0795b implements AuthorizeHelper {

    /* renamed from: a */
    protected Platform f1527a;

    /* renamed from: b */
    private AuthorizeListener f1528b;

    /* renamed from: c */
    private SSOListener f1529c;

    public AbstractC0795b(Platform platform) {
        this.f1527a = platform;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m37971a(SSOListener sSOListener) {
        this.f1529c = sSOListener;
        C0788c c0788c = new C0788c();
        c0788c.m37981a(sSOListener);
        c0788c.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m37970b(AuthorizeListener authorizeListener) {
        this.f1528b = authorizeListener;
        C0790e c0790e = new C0790e();
        c0790e.m37976a(this.f1528b);
        c0790e.a(this);
    }

    /* renamed from: c */
    public int m37969c() {
        return this.f1527a.getPlatformId();
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public AuthorizeListener getAuthorizeListener() {
        return this.f1528b;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public Platform getPlatform() {
        return this.f1527a;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public SSOListener getSSOListener() {
        return this.f1529c;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public AbstractC0789d getSSOProcessor(C0788c c0788c) {
        return null;
    }
}
