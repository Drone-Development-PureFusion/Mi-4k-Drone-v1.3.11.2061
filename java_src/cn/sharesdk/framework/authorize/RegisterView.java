package cn.sharesdk.framework.authorize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.sharesdk.framework.TitleLayout;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.tools.utils.ResHelper;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class RegisterView extends ResizeLayout {

    /* renamed from: a */
    private TitleLayout f1502a;

    /* renamed from: b */
    private RelativeLayout f1503b;

    /* renamed from: c */
    private WebView f1504c;

    /* renamed from: d */
    private TextView f1505d;

    public RegisterView(Context context) {
        super(context);
        m37991a(context);
    }

    public RegisterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m37991a(context);
    }

    /* renamed from: a */
    private void m37991a(Context context) {
        setBackgroundColor(-1);
        setOrientation(1);
        final int m37987b = m37987b(context);
        this.f1502a = new TitleLayout(context);
        try {
            int bitmapRes = ResHelper.getBitmapRes(context, "ssdk_auth_title_back");
            if (bitmapRes > 0) {
                this.f1502a.setBackgroundResource(bitmapRes);
            }
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
        }
        this.f1502a.getBtnRight().setVisibility(8);
        int stringRes = ResHelper.getStringRes(getContext(), "ssdk_weibo_oauth_regiseter");
        if (stringRes > 0) {
            this.f1502a.getTvTitle().setText(stringRes);
        }
        addView(this.f1502a);
        ImageView imageView = new ImageView(context);
        int bitmapRes2 = ResHelper.getBitmapRes(context, "ssdk_logo");
        if (bitmapRes2 > 0) {
            imageView.setImageResource(bitmapRes2);
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setPadding(0, 0, ResHelper.dipToPx(context, 10), 0);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: cn.sharesdk.framework.authorize.RegisterView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    int stringRes2 = ResHelper.getStringRes(view.getContext(), "ssdk_website");
                    String str = null;
                    if (stringRes2 > 0) {
                        str = view.getResources().getString(stringRes2);
                    }
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (Throwable th2) {
                    C0831d.m37772a().m6199d(th2);
                }
            }
        });
        this.f1502a.addView(imageView);
        this.f1503b = new RelativeLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        this.f1503b.setLayoutParams(layoutParams);
        addView(this.f1503b);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f1503b.addView(linearLayout);
        this.f1505d = new TextView(context);
        this.f1505d.setLayoutParams(new LinearLayout.LayoutParams(-1, 5));
        this.f1505d.setBackgroundColor(-12929302);
        linearLayout.addView(this.f1505d);
        this.f1505d.setVisibility(8);
        this.f1504c = new WebView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 1.0f;
        this.f1504c.setLayoutParams(layoutParams2);
        WebChromeClient webChromeClient = new WebChromeClient() { // from class: cn.sharesdk.framework.authorize.RegisterView.2
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) RegisterView.this.f1505d.getLayoutParams();
                layoutParams3.width = (m37987b * i) / 100;
                RegisterView.this.f1505d.setLayoutParams(layoutParams3);
                if (i <= 0 || i >= 100) {
                    RegisterView.this.f1505d.setVisibility(8);
                } else {
                    RegisterView.this.f1505d.setVisibility(0);
                }
            }
        };
        if (Build.VERSION.SDK_INT > 10 && Build.VERSION.SDK_INT < 17) {
            try {
                Method method = this.f1504c.getClass().getMethod("removeJavascriptInterface", String.class);
                method.setAccessible(true);
                method.invoke(this.f1504c, "searchBoxJavaBridge_");
            } catch (Throwable th2) {
                C0831d.m37772a().m6199d(th2);
            }
        }
        this.f1504c.setWebChromeClient(webChromeClient);
        linearLayout.addView(this.f1504c);
        this.f1504c.requestFocus();
    }

    /* renamed from: b */
    private int m37987b(Context context) {
        WindowManager windowManager;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if ((context instanceof Activity) && (windowManager = ((Activity) context).getWindowManager()) != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        }
        return 0;
    }

    /* renamed from: a */
    public View m37992a() {
        return this.f1502a.getBtnBack();
    }

    /* renamed from: a */
    public void m37989a(boolean z) {
        this.f1502a.setVisibility(z ? 8 : 0);
    }

    /* renamed from: b */
    public WebView m37988b() {
        return this.f1504c;
    }

    /* renamed from: c */
    public TitleLayout m37986c() {
        return this.f1502a;
    }

    /* renamed from: d */
    public RelativeLayout m37985d() {
        return this.f1503b;
    }
}
