package cn.sharesdk.framework.authorize;

import android.webkit.WebView;
import cn.sharesdk.framework.C0816d;
/* renamed from: cn.sharesdk.framework.authorize.b */
/* loaded from: classes.dex */
public abstract class AbstractC0787b extends C0816d {

    /* renamed from: a */
    protected C0790e f1511a;

    /* renamed from: b */
    protected String f1512b;

    /* renamed from: c */
    protected AuthorizeListener f1513c;

    public AbstractC0787b(C0790e c0790e) {
        this.f1511a = c0790e;
        AuthorizeHelper a = c0790e.a();
        this.f1512b = a.getRedirectUri();
        this.f1513c = a.getAuthorizeListener();
    }

    @Override // cn.sharesdk.framework.C0816d, android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.stopLoading();
        AuthorizeListener authorizeListener = this.f1511a.a().getAuthorizeListener();
        this.f1511a.finish();
        if (authorizeListener != null) {
            authorizeListener.onError(new Throwable(str + " (" + i + "): " + str2));
        }
    }
}
