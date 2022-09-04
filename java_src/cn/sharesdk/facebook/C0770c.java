package cn.sharesdk.facebook;

import android.os.Bundle;
import android.webkit.WebView;
import cn.sharesdk.framework.authorize.AbstractC0787b;
import cn.sharesdk.framework.authorize.C0790e;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.tools.utils.ResHelper;
/* renamed from: cn.sharesdk.facebook.c */
/* loaded from: classes.dex */
public class C0770c extends AbstractC0787b {
    public C0770c(C0790e c0790e) {
        super(c0790e);
    }

    /* renamed from: a */
    protected void m38059a(String str) {
        int i;
        Bundle urlToBundle = ResHelper.urlToBundle(str);
        String string = urlToBundle.getString("error_message");
        if (string != null && this.f1513c != null) {
            string = "error_message ==>>" + string + "\nerror_code ==>>" + urlToBundle.getString("error_code");
            this.f1513c.onError(new Throwable(str));
        }
        if (string == null) {
            String string2 = urlToBundle.getString("access_token");
            String string3 = urlToBundle.containsKey("expires_in") ? urlToBundle.getString("expires_in") : "-1";
            if (this.f1513c == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("oauth_token", string2);
            bundle.putString("oauth_token_secret", "");
            try {
                i = ResHelper.parseInt(string3);
            } catch (Throwable th) {
                C0831d.m37772a().m6199d(th);
                i = -1;
            }
            bundle.putInt("oauth_token_expires", i);
            this.f1513c.onComplete(bundle);
        }
    }

    @Override // cn.sharesdk.framework.C0816d, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f1512b)) {
            webView.stopLoading();
            webView.postDelayed(new Runnable() { // from class: cn.sharesdk.facebook.c.1
                @Override // java.lang.Runnable
                public void run() {
                    C0770c.this.f1511a.finish();
                }
            }, 500L);
            m38059a(str);
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
