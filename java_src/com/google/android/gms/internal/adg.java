package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.overlay.BinderC3649d;
@aaa
@TargetApi(11)
/* loaded from: classes.dex */
public class adg extends WebChromeClient {

    /* renamed from: a */
    private final acy f21269a;

    /* renamed from: com.google.android.gms.internal.adg$7 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C62167 {

        /* renamed from: a */
        static final /* synthetic */ int[] f21277a = new int[ConsoleMessage.MessageLevel.values().length];

        static {
            try {
                f21277a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f21277a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f21277a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f21277a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f21277a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public adg(acy acyVar) {
        this.f21269a = acyVar;
    }

    /* renamed from: a */
    private final Context m18038a(WebView webView) {
        if (!(webView instanceof acy)) {
            return webView.getContext();
        }
        acy acyVar = (acy) webView;
        Activity mo18090f = acyVar.mo18090f();
        return mo18090f == null ? acyVar.getContext() : mo18090f;
    }

    /* renamed from: a */
    private static void m18042a(AlertDialog.Builder builder, String str, final JsResult jsResult) {
        builder.setMessage(str).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.adg.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.confirm();
            }
        }).setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.adg.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.cancel();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.adg.1
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                jsResult.cancel();
            }
        }).create().show();
    }

    /* renamed from: a */
    private static void m18041a(Context context, AlertDialog.Builder builder, String str, String str2, final JsPromptResult jsPromptResult) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(str);
        final EditText editText = new EditText(context);
        editText.setText(str2);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        builder.setView(linearLayout).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.adg.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                jsPromptResult.confirm(editText.getText().toString());
            }
        }).setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.adg.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                jsPromptResult.cancel();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.adg.4
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                jsPromptResult.cancel();
            }
        }).create().show();
    }

    /* renamed from: a */
    private final boolean m18043a() {
        return C3779u.m26890e().m18364a(this.f21269a.getContext().getPackageManager(), this.f21269a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION") || C3779u.m26890e().m18364a(this.f21269a.getContext().getPackageManager(), this.f21269a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m18039a(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        BinderC3649d mo18087i = this.f21269a.mo18087i();
        if (mo18087i == null) {
            abr.d("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        mo18087i.m27231a(view, customViewCallback);
        mo18087i.m27232a(i);
    }

    /* renamed from: a */
    protected boolean m18040a(Context context, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(str);
            if (z) {
                m18041a(context, builder, str2, str3, jsPromptResult);
            } else {
                m18042a(builder, str2, jsResult);
            }
            return true;
        } catch (WindowManager.BadTokenException e) {
            abr.d("Fail to display Dialog.", e);
            return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof acy)) {
            abr.d("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        BinderC3649d mo18087i = ((acy) webView).mo18087i();
        if (mo18087i == null) {
            abr.d("Tried to close an AdWebView not associated with an overlay.");
        } else {
            mo18087i.m27233a();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String valueOf = String.valueOf(consoleMessage.message());
        String valueOf2 = String.valueOf(consoleMessage.sourceId());
        String sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + String.valueOf(valueOf2).length()).append("JS: ").append(valueOf).append(" (").append(valueOf2).append(":").append(consoleMessage.lineNumber()).append(")").toString();
        if (sb.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (C62167.f21277a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                abr.b(sb);
                break;
            case 2:
                abr.d(sb);
                break;
            case 3:
            case 4:
                abr.c(sb);
                break;
            case 5:
                abr.a(sb);
                break;
            default:
                abr.c(sb);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.f21269a.mo18084l());
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min((long) FimiMediaMeta.AV_CH_TOP_BACK_RIGHT, j4) + j, 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (callback != null) {
            callback.invoke(str, m18043a(), true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        BinderC3649d mo18087i = this.f21269a.mo18087i();
        if (mo18087i == null) {
            abr.d("Could not get ad overlay when hiding custom view.");
        } else {
            mo18087i.m27226b();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m18040a(m18038a(webView), str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m18040a(m18038a(webView), str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m18040a(m18038a(webView), str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m18040a(m18038a(webView), str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = FimiMediaMeta.AV_CH_TOP_BACK_RIGHT + j;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        m18039a(view, -1, customViewCallback);
    }
}
