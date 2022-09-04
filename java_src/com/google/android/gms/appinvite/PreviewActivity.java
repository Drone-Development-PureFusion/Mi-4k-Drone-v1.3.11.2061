package com.google.android.gms.appinvite;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class PreviewActivity extends Activity {

    /* renamed from: a */
    public static final String f15300a = "com.google.android.gms.appinvite.ACTION_PREVIEW";

    /* renamed from: b */
    public static final String f15301b = "com.google.android.gms.appinvite.LAYOUT_RES_ID";

    /* renamed from: c */
    public static final String f15302c = "com.google.android.gms.appinvite.TABS";

    /* renamed from: d */
    public static final String f15303d = "tabTag";

    /* renamed from: e */
    public static final String f15304e = "tabContentId";

    /* renamed from: f */
    public static final String f15305f = "com.google.android.gms.appinvite.VIEWS";

    /* renamed from: g */
    public static final String f15306g = "View_id";

    /* renamed from: h */
    public static final String f15307h = "View_backgroundColor";

    /* renamed from: i */
    public static final String f15308i = "View_minHeight";

    /* renamed from: j */
    public static final String f15309j = "View_onClickListener";

    /* renamed from: k */
    public static final String f15310k = "TextView_text";

    /* renamed from: l */
    public static final String f15311l = "TextView_isTitle";

    /* renamed from: m */
    public static final String f15312m = "TextView_textColor";

    /* renamed from: n */
    public static final String f15313n = "WebView_data";

    /* renamed from: o */
    public static final String f15314o = "close";

    /* renamed from: a */
    private View m25901a(Context context, ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(context).inflate(bundle.getInt(f15301b), viewGroup, false);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f15305f);
        if (parcelableArrayList != null) {
            Iterator it2 = parcelableArrayList.iterator();
            while (it2.hasNext()) {
                m25900a(inflate, (Bundle) it2.next());
            }
        }
        return inflate;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private void m25900a(View view, Bundle bundle) {
        char c;
        boolean z;
        View findViewById = view.findViewById(bundle.getInt(f15306g));
        for (String str : bundle.keySet()) {
            switch (str.hashCode()) {
                case -1829808865:
                    if (str.equals(f15308i)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -499175494:
                    if (str.equals(f15310k)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -111184848:
                    if (str.equals(f15313n)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 573559753:
                    if (str.equals(f15312m)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 966644059:
                    if (str.equals(f15307h)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1729346977:
                    if (str.equals(f15311l)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1920443715:
                    if (str.equals(f15309j)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    findViewById.setBackgroundColor(bundle.getInt(str));
                    break;
                case 1:
                    findViewById.setMinimumHeight(bundle.getInt(str));
                    break;
                case 2:
                    String string = bundle.getString(str);
                    switch (string.hashCode()) {
                        case 94756344:
                            if (string.equals(f15314o)) {
                                z = false;
                                break;
                            }
                        default:
                            z = true;
                            break;
                    }
                    switch (z) {
                        case false:
                            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.appinvite.PreviewActivity.1
                                @Override // android.view.View.OnClickListener
                                public void onClick(View view2) {
                                    PreviewActivity.this.finish();
                                }
                            });
                            continue;
                    }
                case 3:
                    if (findViewById instanceof TextView) {
                        ((TextView) findViewById).setText(bundle.getCharSequence(str));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (findViewById instanceof TextView) {
                        ((TextView) findViewById).setTextColor(bundle.getInt(str));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((findViewById instanceof TextView) && bundle.getBoolean(str)) {
                        setTitle(((TextView) findViewById).getText());
                        break;
                    }
                    break;
                case 6:
                    if (findViewById instanceof ViewGroup) {
                        WebView webView = new WebView(this);
                        webView.loadData(bundle.getString(str), "text/html; charset=utf-8", "UTF-8");
                        ((ViewGroup) findViewById).addView(webView, new ViewGroup.LayoutParams(-1, -1));
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getCallingActivity() == null || !"com.google.android.gms".equals(getCallingActivity().getPackageName())) {
            finish();
            return;
        }
        try {
            Context createPackageContext = createPackageContext("com.google.android.gms", 0);
            Bundle extras = getIntent().getExtras();
            View m25901a = m25901a(createPackageContext, null, extras);
            if (m25901a == null) {
                finish();
                return;
            }
            TabHost tabHost = (TabHost) m25901a.findViewById(16908306);
            TabWidget tabWidget = (TabWidget) m25901a.findViewById(16908307);
            ArrayList parcelableArrayList = extras.getParcelableArrayList(f15302c);
            if (tabHost != null && tabWidget != null && parcelableArrayList != null) {
                tabHost.setup();
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    Bundle bundle2 = (Bundle) it2.next();
                    TabHost.TabSpec newTabSpec = tabHost.newTabSpec(bundle2.getString(f15303d));
                    newTabSpec.setContent(bundle2.getInt(f15304e));
                    newTabSpec.setIndicator(m25901a(createPackageContext, tabWidget, bundle2));
                    tabHost.addTab(newTabSpec);
                }
            }
            setContentView(m25901a);
        } catch (PackageManager.NameNotFoundException e) {
            finish();
        }
    }
}
