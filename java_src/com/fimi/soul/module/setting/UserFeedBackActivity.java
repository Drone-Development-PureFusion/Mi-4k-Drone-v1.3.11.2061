package com.fimi.soul.module.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.utils.C1678s;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.manager.C1999s;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.SuggestBean;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.titlebar.FmTitleBar;
import com.google.firebase.p251a.C9654a;
import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public class UserFeedBackActivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: e */
    private Button f10342e;

    /* renamed from: f */
    private Button f10343f;

    /* renamed from: g */
    private FmTitleBar f10344g;

    /* renamed from: h */
    private InputMethodManager f10345h;

    /* renamed from: i */
    private CheckBox f10346i;

    /* renamed from: j */
    private CheckBox f10347j;

    /* renamed from: k */
    private CheckBox f10348k;

    /* renamed from: l */
    private CheckBox f10349l;

    /* renamed from: m */
    private TextView f10350m;

    /* renamed from: n */
    private TextView f10351n;

    /* renamed from: o */
    private TextView f10352o;

    /* renamed from: p */
    private TextView f10353p;

    /* renamed from: q */
    private EditText f10354q;

    /* renamed from: r */
    private EditText f10355r;

    /* renamed from: s */
    private TextView f10356s;

    /* renamed from: t */
    private TextView f10357t;

    /* renamed from: u */
    private TextView f10358u;

    /* renamed from: v */
    private TextView f10359v;

    /* renamed from: a */
    private ImageView f10338a = null;

    /* renamed from: b */
    private ImageView f10339b = null;

    /* renamed from: c */
    private Bitmap f10340c = null;

    /* renamed from: d */
    private Bitmap f10341d = null;

    /* renamed from: w */
    private ProgressDialog f10360w = null;

    /* renamed from: x */
    private SuggestBean f10361x = new SuggestBean();

    /* renamed from: y */
    private final String f10362y = "1";

    /* renamed from: z */
    private final String f10363z = "2";

    /* renamed from: A */
    private final String f10334A = "3";

    /* renamed from: B */
    private final String f10335B = "4";

    /* renamed from: C */
    private String f10336C = "1";

    /* renamed from: D */
    private CompoundButton.OnCheckedChangeListener f10337D = new CompoundButton.OnCheckedChangeListener() { // from class: com.fimi.soul.module.setting.UserFeedBackActivity.2
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                switch (compoundButton.getId()) {
                    case C1704R.C1706id.fimi_plane /* 2131755446 */:
                        UserFeedBackActivity.this.f10347j.setChecked(false);
                        UserFeedBackActivity.this.f10348k.setChecked(false);
                        UserFeedBackActivity.this.f10349l.setChecked(false);
                        compoundButton.setTag("1");
                        break;
                    case C1704R.C1706id.fimi_control /* 2131755448 */:
                        UserFeedBackActivity.this.f10346i.setChecked(false);
                        UserFeedBackActivity.this.f10348k.setChecked(false);
                        UserFeedBackActivity.this.f10349l.setChecked(false);
                        compoundButton.setTag("2");
                        break;
                    case C1704R.C1706id.fimi_camera /* 2131755450 */:
                        UserFeedBackActivity.this.f10346i.setChecked(false);
                        UserFeedBackActivity.this.f10347j.setChecked(false);
                        UserFeedBackActivity.this.f10349l.setChecked(false);
                        compoundButton.setTag("3");
                        break;
                    case C1704R.C1706id.fimi_app /* 2131755452 */:
                        UserFeedBackActivity.this.f10346i.setChecked(false);
                        UserFeedBackActivity.this.f10347j.setChecked(false);
                        UserFeedBackActivity.this.f10348k.setChecked(false);
                        compoundButton.setTag("4");
                        break;
                }
                UserFeedBackActivity.this.f10336C = compoundButton.getTag().toString();
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m30060a(int i, int i2) {
        C1688z.m34449a(this, i, i2);
    }

    /* renamed from: b */
    private void m30056b() {
        this.f10342e = (Button) findViewById(C1704R.C1706id.back_btn);
        this.f10342e.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.setting.UserFeedBackActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UserFeedBackActivity.this.finish();
            }
        });
    }

    /* renamed from: c */
    private void m30054c() {
        this.f10356s = (TextView) findViewById(C1704R.C1706id.textView1);
        this.f10357t = (TextView) findViewById(C1704R.C1706id.textView2);
        this.f10358u = (TextView) findViewById(C1704R.C1706id.textView3);
        this.f10359v = (TextView) findViewById(C1704R.C1706id.textView4);
        this.f10346i = (CheckBox) findViewById(C1704R.C1706id.fimi_plane);
        this.f10347j = (CheckBox) findViewById(C1704R.C1706id.fimi_control);
        this.f10348k = (CheckBox) findViewById(C1704R.C1706id.fimi_camera);
        this.f10349l = (CheckBox) findViewById(C1704R.C1706id.fimi_app);
        this.f10346i.setChecked(true);
        this.f10346i.setOnCheckedChangeListener(this.f10337D);
        this.f10347j.setOnCheckedChangeListener(this.f10337D);
        this.f10348k.setOnCheckedChangeListener(this.f10337D);
        this.f10349l.setOnCheckedChangeListener(this.f10337D);
        this.f10350m = (TextView) findViewById(C1704R.C1706id.plane_des);
        this.f10351n = (TextView) findViewById(C1704R.C1706id.control_des);
        this.f10353p = (TextView) findViewById(C1704R.C1706id.app_des);
        this.f10352o = (TextView) findViewById(C1704R.C1706id.camera_des);
        this.f10354q = (EditText) findViewById(C1704R.C1706id.suggestEdit);
        this.f10355r = (EditText) findViewById(C1704R.C1706id.contactEdit);
        this.f10338a = (ImageView) findViewById(C1704R.C1706id.image_add0);
        this.f10339b = (ImageView) findViewById(C1704R.C1706id.image_del);
        this.f10343f = (Button) findViewById(C1704R.C1706id.sendSuggest);
        this.f10339b.setVisibility(4);
        this.f10339b.setOnClickListener(this);
        this.f10338a.setOnClickListener(this);
        this.f10343f.setOnClickListener(this);
    }

    /* renamed from: d */
    private boolean m30052d() {
        if (!this.preferencesUtil.m34546a().contains("isfirstloading")) {
            Intent intent = new Intent(this, LoginActivity.class);
            intent.putExtra(C9654a.C9655a.f30195k, true);
            startActivity(intent);
            finish();
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m30061a() {
        Log.v("Method:", "doTrans");
        try {
            if (TextUtils.isEmpty(this.f10354q.getText())) {
                m30060a(C1704R.C1707string.please_fill_feedcontent, 1000);
            } else if (this.f10354q.getText().length() < 5) {
                m30060a(C1704R.C1707string.feedsize, 1000);
            } else if (this.f10354q.getText().length() >= 1000) {
                m30060a(C1704R.C1707string.feed_max_size, 1000);
            } else {
                this.f10361x.setModel(this.f10336C);
                this.f10360w = ProgressDialog.show(this, null, getString(C1704R.C1707string.commit_ing));
                this.f10360w.setCancelable(true);
                C1999s c1999s = new C1999s(this);
                if (this.f10340c != null && !this.f10340c.isRecycled()) {
                    c1999s.m33309a(this.f10340c);
                }
                this.f10361x.setUserID(C1756a.m34259c(this).getUserID());
                this.f10361x.setContact(this.f10355r.getText().toString());
                this.f10361x.setContent(this.f10354q.getText().toString());
                c1999s.m33308a(this.f10361x, new AbstractC1945k() { // from class: com.fimi.soul.module.setting.UserFeedBackActivity.3
                    @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                    /* renamed from: a */
                    public void mo28106a(PlaneMsg planeMsg, File file) {
                        if (planeMsg == null || !planeMsg.isSuccess()) {
                            UserFeedBackActivity.this.m30060a((int) C1704R.C1707string.feed_false, 1000);
                        } else {
                            UserFeedBackActivity.this.m30060a((int) C1704R.C1707string.feed_success, 1000);
                            UserFeedBackActivity.this.finish();
                        }
                        UserFeedBackActivity.this.f10360w.dismiss();
                    }
                });
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (this.f10341d != null && !this.f10341d.isRecycled()) {
            this.f10341d.recycle();
            this.f10341d = null;
        }
        getContentResolver();
        try {
            this.f10341d = C1678s.m34593a(this, intent.getData(), getResources().getInteger(C1704R.integer.image_lagar));
        } catch (IOException e) {
            e.getStackTrace();
        }
        if (this.f10341d == null) {
            return;
        }
        if (i == 0) {
            this.f10338a.setImageBitmap(this.f10341d);
            this.f10340c = this.f10341d;
            this.f10339b.setVisibility(0);
        }
        this.f10341d = null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.image_add0 /* 2131755457 */:
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("image/*");
                startActivityForResult(intent, 0);
                return;
            case C1704R.C1706id.image_del /* 2131755458 */:
                this.f10338a.setImageBitmap(null);
                this.f10339b.setVisibility(4);
                return;
            case C1704R.C1706id.textView4 /* 2131755459 */:
            case C1704R.C1706id.contactEdit /* 2131755460 */:
            default:
                return;
            case C1704R.C1706id.sendSuggest /* 2131755461 */:
                if (!C3103au.m29221b(this) || C3103au.m29207d("192.168.100.1")) {
                    m30060a(C1704R.C1707string.login_result_net, 2000);
                    return;
                } else {
                    m30061a();
                    return;
                }
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_userfeedback);
        m30056b();
        m30054c();
        C3103au.m29232a(getAssets(), this.f10346i, this.f10347j, this.f10348k, this.f10349l, this.f10350m, this.f10351n, this.f10352o, this.f10353p, this.f10354q, this.f10355r, this.f10343f, this.f10356s, this.f10357t, this.f10358u, this.f10359v);
    }
}
