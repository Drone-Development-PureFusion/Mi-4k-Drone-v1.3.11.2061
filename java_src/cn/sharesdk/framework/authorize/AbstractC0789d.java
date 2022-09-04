package cn.sharesdk.framework.authorize;

import android.content.Intent;
/* renamed from: cn.sharesdk.framework.authorize.d */
/* loaded from: classes.dex */
public abstract class AbstractC0789d {

    /* renamed from: a */
    protected C0788c f1516a;

    /* renamed from: b */
    protected int f1517b;

    /* renamed from: c */
    protected SSOListener f1518c;

    public AbstractC0789d(C0788c c0788c) {
        this.f1516a = c0788c;
        this.f1518c = c0788c.a().getSSOListener();
    }

    /* renamed from: a */
    public abstract void mo37980a();

    /* renamed from: a */
    public void m37979a(int i) {
        this.f1517b = i;
    }

    /* renamed from: a */
    public void mo37978a(int i, int i2, Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m37977a(Intent intent) {
    }
}
