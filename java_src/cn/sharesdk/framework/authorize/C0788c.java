package cn.sharesdk.framework.authorize;

import android.content.Intent;
/* renamed from: cn.sharesdk.framework.authorize.c */
/* loaded from: classes.dex */
public class C0788c extends C0786a {

    /* renamed from: b */
    protected SSOListener f1514b;

    /* renamed from: c */
    private AbstractC0789d f1515c;

    /* renamed from: a */
    public void m37981a(SSOListener sSOListener) {
        this.f1514b = sSOListener;
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f1515c.mo37978a(i, i2, intent);
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        this.f1515c = this.f1510a.getSSOProcessor(this);
        if (this.f1515c != null) {
            this.f1515c.m37979a(32973);
            this.f1515c.mo37980a();
            return;
        }
        finish();
        AuthorizeListener authorizeListener = this.f1510a.getAuthorizeListener();
        if (authorizeListener == null) {
            return;
        }
        authorizeListener.onError(new Throwable("Failed to start SSO for " + this.f1510a.getPlatform().getName()));
    }

    @Override // com.mob.tools.FakeActivity
    public void onNewIntent(Intent intent) {
        this.f1515c.m37977a(intent);
    }
}
