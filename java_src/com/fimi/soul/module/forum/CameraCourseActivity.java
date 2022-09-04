package com.fimi.soul.module.forum;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.module.social.SystemBarTintManager;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class CameraCourseActivity extends Activity {

    /* renamed from: b */
    public static final String f9685b = "type";

    /* renamed from: a */
    WebView f9686a;

    /* renamed from: c */
    private ImageView f9687c;

    /* renamed from: d */
    private TextView f9688d;

    /* renamed from: e */
    private Button f9689e;

    /* renamed from: g */
    private String f9691g;

    /* renamed from: h */
    private String f9692h;

    /* renamed from: k */
    private int f9695k;

    /* renamed from: f */
    private String f9690f = "https://api.jr.mi.com/insurance/insurance_asset.html?source=p0&from=local#/index";

    /* renamed from: i */
    private String f9693i = "http://bbs.xiaomi.cn/t-13416587";

    /* renamed from: j */
    private String f9694j = "http://bbs.xiaomi.cn/t-13416558";

    /* renamed from: a */
    public void m30300a() {
        if (!this.f9686a.canGoBack()) {
            finish();
        } else if (this.f9692h.equals(this.f9691g)) {
            finish();
        } else {
            this.f9689e.setVisibility(0);
            this.f9686a.loadUrl(this.f9691g);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setFlags(67108864, 67108864);
            SystemBarTintManager systemBarTintManager = new SystemBarTintManager(this);
            systemBarTintManager.setStatusBarTintEnabled(true);
            systemBarTintManager.setStatusBarTintResource(C1704R.color.list_press);
        }
        setContentView(C1704R.layout.activity_camera_course);
        this.f9687c = (ImageView) findViewById(C1704R.C1706id.back_btn);
        this.f9689e = (Button) findViewById(C1704R.C1706id.right_bt);
        this.f9688d = (TextView) findViewById(C1704R.C1706id.title);
        this.f9688d.setText(getString(C1704R.C1707string.camera_course));
        C3103au.m29232a(getAssets(), this.f9688d, this.f9689e);
        this.f9689e.setVisibility(8);
        this.f9687c.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.forum.CameraCourseActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CameraCourseActivity.this.m30300a();
            }
        });
        this.f9689e.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.forum.CameraCourseActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WebBackForwardList copyBackForwardList = CameraCourseActivity.this.f9686a.copyBackForwardList();
                CameraCourseActivity.this.f9695k = copyBackForwardList.getCurrentIndex();
                CameraCourseActivity.this.f9689e.setVisibility(8);
                CameraCourseActivity.this.f9686a.loadUrl(CameraCourseActivity.this.f9690f);
            }
        });
        this.f9686a = (WebView) findViewById(C1704R.C1706id.web_view);
        this.f9686a.getSettings().setJavaScriptEnabled(true);
        this.f9686a.getSettings().setDomStorageEnabled(true);
        this.f9686a.getSettings().setAllowFileAccess(true);
        this.f9686a.getSettings().setBuiltInZoomControls(true);
        this.f9686a.getSettings().setDefaultTextEncodingName("UTF-8");
        int intExtra = getIntent().getIntExtra("type", 1);
        String str = null;
        if (intExtra == 1) {
            str = this.f9694j;
        } else if (intExtra == 2) {
            str = this.f9693i;
        }
        setTitle(getString(C1704R.C1707string.camera_course));
        if (str == null) {
            finish();
            return;
        }
        this.f9691g = str;
        this.f9686a.loadUrl(str);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f9692h == null) {
                finish();
            } else if (this.f9692h.equals(this.f9691g)) {
                finish();
            } else {
                if (this.f9695k == this.f9686a.copyBackForwardList().getCurrentIndex() - 1) {
                    this.f9689e.setVisibility(8);
                }
                this.f9686a.goBack();
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
