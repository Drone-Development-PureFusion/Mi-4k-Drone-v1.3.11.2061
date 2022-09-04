package cn.sharesdk.twitter;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import cn.sharesdk.framework.authorize.AbstractC0787b;
import cn.sharesdk.framework.authorize.C0790e;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.tools.utils.ResHelper;
/* renamed from: cn.sharesdk.twitter.a */
/* loaded from: classes.dex */
public class C0839a extends AbstractC0787b {

    /* renamed from: d */
    private boolean f1684d;

    public C0839a(C0790e c0790e) {
        super(c0790e);
    }

    /* renamed from: a */
    public void m37752a(String str) {
        if (this.f1684d) {
            return;
        }
        this.f1684d = true;
        String m37749a = C0842b.m37751a(this.f1511a.a().getPlatform()).m37749a(str);
        if (m37749a == null || m37749a.length() <= 0) {
            if (this.f1513c == null) {
                return;
            }
            this.f1513c.onError(new Throwable());
            return;
        }
        String[] split = m37749a.split("&");
        Bundle bundle = new Bundle();
        for (String str2 : split) {
            if (str2 != null) {
                String[] split2 = str2.split("=");
                if (split2.length >= 2) {
                    bundle.putString(split2[0], split2[1]);
                }
            }
        }
        if (bundle == null || bundle.size() <= 0) {
            if (this.f1513c == null) {
                return;
            }
            this.f1513c.onError(new Throwable());
        } else if (this.f1513c != null) {
            this.f1513c.onComplete(bundle);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [cn.sharesdk.twitter.a$2] */
    @Override // cn.sharesdk.framework.C0816d, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f1512b != null && str.startsWith(this.f1512b)) {
            webView.stopLoading();
            this.f1511a.finish();
            final String valueOf = String.valueOf(ResHelper.urlToBundle(str).get("oauth_verifier"));
            new Thread() { // from class: cn.sharesdk.twitter.a.2
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        C0839a.this.m37752a(valueOf);
                    } catch (Throwable th) {
                        C0831d.m37772a().m6199d(th);
                    }
                }
            }.start();
        }
        super.onPageStarted(webView, str, bitmap);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [cn.sharesdk.twitter.a$1] */
    @Override // cn.sharesdk.framework.C0816d, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f1512b == null || !str.startsWith(this.f1512b)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        webView.stopLoading();
        this.f1511a.finish();
        final String valueOf = String.valueOf(ResHelper.urlToBundle(str).get("oauth_verifier"));
        new Thread() { // from class: cn.sharesdk.twitter.a.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    C0839a.this.m37752a(valueOf);
                } catch (Throwable th) {
                    C0831d.m37772a().m6199d(th);
                }
            }
        }.start();
        return true;
    }
}
