package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.common.util.C4696s;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
@TargetApi(14)
/* renamed from: com.google.android.gms.internal.tq */
/* loaded from: classes.dex */
public class C7760tq extends Thread {

    /* renamed from: e */
    private final C7755to f25668e;

    /* renamed from: f */
    private final C8148zz f25669f;

    /* renamed from: a */
    private boolean f25664a = false;

    /* renamed from: b */
    private boolean f25665b = false;

    /* renamed from: c */
    private boolean f25666c = false;

    /* renamed from: d */
    private final Object f25667d = new Object();

    /* renamed from: h */
    private final int f25671h = C7788uf.f25733R.m13486c().intValue();

    /* renamed from: i */
    private final int f25672i = C7788uf.f25734S.m13486c().intValue();

    /* renamed from: j */
    private final int f25673j = C7788uf.f25735T.m13486c().intValue();

    /* renamed from: k */
    private final int f25674k = C7788uf.f25736U.m13486c().intValue();

    /* renamed from: g */
    private final int f25670g = C7788uf.f25737V.m13486c().intValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    @aaa
    /* renamed from: com.google.android.gms.internal.tq$a */
    /* loaded from: classes.dex */
    public class C7764a {

        /* renamed from: a */
        final int f25683a;

        /* renamed from: b */
        final int f25684b;

        C7764a(int i, int i2) {
            this.f25683a = i;
            this.f25684b = i2;
        }
    }

    public C7760tq(C7755to c7755to, C8148zz c8148zz) {
        this.f25668e = c7755to;
        this.f25669f = c8148zz;
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    C7764a m13539a(@Nullable View view, C7754tn c7754tn) {
        if (view == null) {
            return new C7764a(0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new C7764a(0, 0);
            }
            c7754tn.m13572b(text.toString(), globalVisibleRect);
            return new C7764a(1, 0);
        } else if ((view instanceof WebView) && !(view instanceof acy)) {
            c7754tn.m13567f();
            return m13538a((WebView) view, c7754tn, globalVisibleRect) ? new C7764a(0, 1) : new C7764a(0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new C7764a(0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                C7764a m13539a = m13539a(viewGroup.getChildAt(i3), c7754tn);
                i2 += m13539a.f25683a;
                i += m13539a.f25684b;
            }
            return new C7764a(i2, i);
        }
    }

    /* renamed from: a */
    public void m13544a() {
        synchronized (this.f25667d) {
            if (this.f25664a) {
                abr.a("Content hash thread already started, quiting...");
                return;
            }
            this.f25664a = true;
            start();
        }
    }

    /* renamed from: a */
    void m13543a(@Nullable Activity activity) {
        if (activity == null) {
            return;
        }
        View view = null;
        try {
            if (activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
                view = activity.getWindow().getDecorView().findViewById(16908290);
            }
        } catch (Throwable th) {
            abr.a("Failed getting root view of activity. Content not extracted.");
        }
        if (view == null) {
            return;
        }
        m13540a(view);
    }

    /* renamed from: a */
    void m13537a(C7754tn c7754tn, WebView webView, String str, boolean z) {
        c7754tn.m13568e();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!TextUtils.isEmpty(webView.getTitle())) {
                    String valueOf = String.valueOf(webView.getTitle());
                    c7754tn.m13575a(new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(optString).length()).append(valueOf).append("\n").append(optString).toString(), z);
                } else {
                    c7754tn.m13575a(optString, z);
                }
            }
            if (!c7754tn.m13578a()) {
                return;
            }
            this.f25668e.m13561b(c7754tn);
        } catch (JSONException e) {
            abr.a("Json string may be malformed.");
        } catch (Throwable th) {
            abr.a("Failed to get webview content.", th);
            this.f25669f.m12699a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: a */
    boolean m13542a(ActivityManager.RunningAppProcessInfo runningAppProcessInfo) {
        return runningAppProcessInfo.importance == 100;
    }

    /* renamed from: a */
    boolean m13541a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return false;
        }
        return powerManager.isScreenOn();
    }

    /* renamed from: a */
    boolean m13540a(@Nullable final View view) {
        if (view == null) {
            return false;
        }
        view.post(new Runnable() { // from class: com.google.android.gms.internal.tq.1
            @Override // java.lang.Runnable
            public void run() {
                C7760tq.this.m13535b(view);
            }
        });
        return true;
    }

    @TargetApi(19)
    /* renamed from: a */
    boolean m13538a(final WebView webView, final C7754tn c7754tn, final boolean z) {
        if (!C4696s.m23106h()) {
            return false;
        }
        c7754tn.m13567f();
        webView.post(new Runnable() { // from class: com.google.android.gms.internal.tq.2

            /* renamed from: a */
            ValueCallback<String> f25677a = new ValueCallback<String>() { // from class: com.google.android.gms.internal.tq.2.1
                @Override // android.webkit.ValueCallback
                /* renamed from: a */
                public void onReceiveValue(String str) {
                    C7760tq.this.m13537a(c7754tn, webView, str, z);
                }
            };

            @Override // java.lang.Runnable
            public void run() {
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f25677a);
                    } catch (Throwable th) {
                        this.f25677a.onReceiveValue("");
                    }
                }
            }
        });
        return true;
    }

    /* renamed from: b */
    void m13535b(View view) {
        try {
            C7754tn c7754tn = new C7754tn(this.f25671h, this.f25672i, this.f25673j, this.f25674k);
            C7764a m13539a = m13539a(view, c7754tn);
            c7754tn.m13566g();
            if (m13539a.f25683a == 0 && m13539a.f25684b == 0) {
                return;
            }
            if (m13539a.f25684b == 0 && c7754tn.m13564i() == 0) {
                return;
            }
            if (m13539a.f25684b == 0 && this.f25668e.m13562a(c7754tn)) {
                return;
            }
            this.f25668e.m13560c(c7754tn);
        } catch (Exception e) {
            abr.b("Exception in fetchContentOnUIThread", e);
            this.f25669f.m12699a(e, "ContentFetchTask.fetchContent");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (m13542a(r0) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        if (r1.inKeyguardRestrictedInputMode() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        if (m13541a(r3) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
        return true;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean m13536b() {
        try {
            Context m13556b = C3779u.m26887h().m13556b();
            if (m13556b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) m13556b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) m13556b.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            Iterator<ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it2.next();
                if (Process.myPid() == next.pid) {
                    break;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    /* renamed from: c */
    public C7754tn m13534c() {
        return this.f25668e.m13563a();
    }

    /* renamed from: d */
    public void m13533d() {
        synchronized (this.f25667d) {
            this.f25665b = false;
            this.f25667d.notifyAll();
            abr.a("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: e */
    public void m13532e() {
        synchronized (this.f25667d) {
            this.f25665b = true;
            abr.a(new StringBuilder(42).append("ContentFetchThread: paused, mPause = ").append(this.f25665b).toString());
        }
    }

    /* renamed from: f */
    public boolean m13531f() {
        return this.f25665b;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                if (m13536b()) {
                    Activity m13559a = C3779u.m26887h().m13559a();
                    if (m13559a == null) {
                        abr.a("ContentFetchThread: no activity. Sleeping.");
                        m13532e();
                    } else {
                        m13543a(m13559a);
                    }
                } else {
                    abr.a("ContentFetchTask: sleeping");
                    m13532e();
                }
                Thread.sleep(this.f25670g * 1000);
            } catch (Throwable th) {
                abr.b("Error in ContentFetchTask", th);
                this.f25669f.m12699a(th, "ContentFetchTask.run");
            }
            synchronized (this.f25667d) {
                while (this.f25665b) {
                    try {
                        abr.a("ContentFetchTask: waiting");
                        this.f25667d.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
}
