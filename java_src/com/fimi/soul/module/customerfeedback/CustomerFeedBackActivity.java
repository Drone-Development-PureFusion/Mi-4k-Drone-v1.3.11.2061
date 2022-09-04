package com.fimi.soul.module.customerfeedback;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.app.FragmentManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fimi.kernel.utils.C1678s;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.manager.C1964f;
import com.fimi.soul.biz.manager.C1999s;
import com.fimi.soul.biz.p179g.C1846a;
import com.fimi.soul.biz.p185m.AbstractC1939e;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.FdsMsg;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.SuggestBean;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.photodraweeview.AbstractC3312d;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class CustomerFeedBackActivity extends BaseActivity implements View.OnClickListener, View.OnTouchListener, AdapterView.OnItemClickListener, AbstractC3312d {

    /* renamed from: a */
    private Button f8285a;

    /* renamed from: b */
    private TextView f8286b;

    /* renamed from: c */
    private TextView f8287c;

    /* renamed from: d */
    private TextView f8288d;

    /* renamed from: e */
    private TextView f8289e;

    /* renamed from: f */
    private TextView f8290f;

    /* renamed from: g */
    private TextView f8291g;

    /* renamed from: h */
    private TextView f8292h;

    /* renamed from: i */
    private TextView f8293i;

    /* renamed from: j */
    private Button f8294j;

    /* renamed from: k */
    private EditText f8295k;

    /* renamed from: l */
    private EditText f8296l;

    /* renamed from: m */
    private EditText f8297m;

    /* renamed from: n */
    private GridView f8298n;

    /* renamed from: o */
    private LinkedList<Object> f8299o;

    /* renamed from: q */
    private View$OnClickListenerC2553c f8301q;

    /* renamed from: s */
    private ShowDetailPictureGroupFragment f8303s;

    /* renamed from: t */
    private FragmentManager f8304t;

    /* renamed from: u */
    private int f8305u;

    /* renamed from: v */
    private ProgressBar f8306v;

    /* renamed from: z */
    private C1964f f8310z;

    /* renamed from: p */
    private int f8300p = 1001;

    /* renamed from: r */
    private int f8302r = 10;

    /* renamed from: w */
    private final int f8307w = 10;

    /* renamed from: x */
    private final int f8308x = 30000;

    /* renamed from: y */
    private List<String> f8309y = new ArrayList();

    /* renamed from: A */
    private Handler f8284A = new Handler() { // from class: com.fimi.soul.module.customerfeedback.CustomerFeedBackActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (10 == message.what) {
                CustomerFeedBackActivity.this.f8294j.setClickable(true);
                CustomerFeedBackActivity.this.m31301a(CustomerFeedBackActivity.this.f8294j, 255);
                CustomerFeedBackActivity.this.f8306v.setVisibility(8);
            }
        }
    };

    /* renamed from: a */
    private View m31302a(int i) {
        return findViewById(i);
    }

    /* renamed from: a */
    private void m31303a() {
        this.f8304t = getSupportFragmentManager();
        this.f8303s = (ShowDetailPictureGroupFragment) this.f8304t.findFragmentById(C1704R.C1706id.show_detail_pic_fragment);
        if (this.f8303s == null) {
            this.f8303s = new ShowDetailPictureGroupFragment();
            this.f8303s.m31253a(this);
            this.f8304t.beginTransaction().add(C1704R.C1706id.show_detail_pic_fragment, this.f8303s).hide(this.f8303s).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m31301a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
    }

    /* renamed from: a */
    private boolean m31298a(String str) {
        return Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$").matcher(str).matches();
    }

    /* renamed from: b */
    private void m31297b() {
        this.f8295k.addTextChangedListener(new TextWatcher() { // from class: com.fimi.soul.module.customerfeedback.CustomerFeedBackActivity.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.length() < CustomerFeedBackActivity.this.f8300p) {
                    CustomerFeedBackActivity.this.f8290f.setText((CustomerFeedBackActivity.this.f8300p - charSequence.length()) + "");
                } else {
                    C1688z.m34449a(CustomerFeedBackActivity.this, (int) C1704R.C1707string.error_suggestcontent_tip, 3000);
                }
            }
        });
    }

    /* renamed from: b */
    private void m31296b(int i) {
        if (i < this.f8299o.size() - 1) {
            Object obj = this.f8299o.get(i);
            if (!(obj instanceof Uri)) {
                return;
            }
            try {
                this.f8310z.m33398a(C1678s.m34593a(getApplicationContext(), (Uri) obj, (int) IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING), new AbstractC1939e() { // from class: com.fimi.soul.module.customerfeedback.CustomerFeedBackActivity.3
                    @Override // com.fimi.soul.biz.p185m.AbstractC1939e
                    /* renamed from: a */
                    public void mo31276a(long j, long j2, String str) {
                    }

                    @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                    /* renamed from: a */
                    public void mo28106a(PlaneMsg planeMsg, File file) {
                        if (planeMsg.isSuccess()) {
                            CustomerFeedBackActivity.this.f8309y.add(((FdsMsg) planeMsg.getData()).getUrl());
                            CustomerFeedBackActivity.this.m31283h();
                        } else if ((CustomerFeedBackActivity.this.f8299o.size() - 1) - CustomerFeedBackActivity.this.f8305u > 0) {
                            CustomerFeedBackActivity.this.m31283h();
                        } else {
                            C1688z.m34449a(CustomerFeedBackActivity.this.getApplicationContext(), (int) C1704R.C1707string.feedback_error, 3000);
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
                C1688z.m34449a(getApplicationContext(), (int) C1704R.C1707string.feedback_error, 3000);
                m31279j();
            }
        }
    }

    /* renamed from: b */
    private boolean m31294b(String str) {
        return Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$").matcher(str).matches();
    }

    /* renamed from: c */
    private void m31293c() {
        if (this.f8299o == null) {
            this.f8299o = new LinkedList<>();
        } else {
            this.f8299o.clear();
        }
        this.f8299o.add(Integer.valueOf((int) C1704R.C1705drawable.add_images_box));
    }

    /* renamed from: d */
    private void m31291d() {
        this.f8285a = (Button) m31302a(C1704R.C1706id.black_btn);
        this.f8286b = (TextView) m31302a(C1704R.C1706id.tv_settingTitle);
        this.f8286b.setText(C1704R.C1707string.user_feedback);
        this.f8287c = (TextView) m31302a(C1704R.C1706id.judge_faq);
        this.f8287c.setOnClickListener(this);
        this.f8288d = (TextView) m31302a(C1704R.C1706id.customer_service_telephone);
        this.f8289e = (TextView) m31302a(C1704R.C1706id.question_feedback_des);
        this.f8290f = (TextView) m31302a(C1704R.C1706id.limit_number);
        this.f8291g = (TextView) m31302a(C1704R.C1706id.feedback_picture);
        this.f8292h = (TextView) m31302a(C1704R.C1706id.email_des);
        this.f8293i = (TextView) m31302a(C1704R.C1706id.telephone_des);
        this.f8294j = (Button) m31302a(C1704R.C1706id.sendSuggest);
        this.f8295k = (EditText) m31302a(C1704R.C1706id.suggestEdit);
        this.f8295k.setOnTouchListener(this);
        this.f8296l = (EditText) m31302a(C1704R.C1706id.email_content);
        this.f8297m = (EditText) m31302a(C1704R.C1706id.telephone_content);
        this.f8298n = (GridView) m31302a(C1704R.C1706id.add_picture_gridview);
        this.f8298n.setSelector(new ColorDrawable(0));
        this.f8301q = new View$OnClickListenerC2553c(this.f8299o, getApplicationContext());
        this.f8298n.setAdapter((ListAdapter) this.f8301q);
        this.f8298n.setOnItemClickListener(this);
        this.f8306v = (ProgressBar) findViewById(C1704R.C1706id.loading);
    }

    /* renamed from: e */
    private void m31289e() {
        this.f8285a.setOnClickListener(this);
        this.f8294j.setOnClickListener(this);
    }

    /* renamed from: f */
    private void m31287f() {
        C3103au.m29232a(getAssets(), this.f8287c, this.f8288d, this.f8289e, this.f8291g, this.f8292h, this.f8293i);
        C3103au.m29218b(getAssets(), this.f8290f);
    }

    /* renamed from: g */
    private void m31285g() {
        if (!TextUtils.isEmpty(this.f8296l.getText()) && !m31298a(this.f8296l.getText().toString())) {
            C1688z.m34449a(getApplicationContext(), (int) C1704R.C1707string.error_email_content, 3000);
        } else if (!TextUtils.isEmpty(this.f8297m.getText()) && !m31294b(this.f8297m.getText().toString())) {
            C1688z.m34449a(getApplicationContext(), (int) C1704R.C1707string.error_telephone_content, 3000);
        } else if (TextUtils.isEmpty(this.f8295k.getText())) {
            C1688z.m34449a(getApplicationContext(), (int) C1704R.C1707string.please_fill_feedcontent, 3000);
        } else if (this.f8295k.getText().length() < 5) {
            C1688z.m34449a(getApplicationContext(), (int) C1704R.C1707string.feedsize, 3000);
        } else {
            this.f8305u = 0;
            this.f8294j.setClickable(false);
            m31301a(this.f8294j, 127);
            if (this.f8284A.hasMessages(10)) {
                this.f8284A.removeMessages(10);
            }
            this.f8284A.sendEmptyMessageDelayed(10, NotificationOptions.f16268b);
            this.f8306v.setVisibility(0);
            this.f8309y.clear();
            this.f8310z = new C1964f(getApplicationContext());
            m31296b(this.f8305u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m31283h() {
        this.f8305u++;
        if (this.f8305u < this.f8299o.size() - 1) {
            m31296b(this.f8305u);
        } else {
            m31281i();
        }
    }

    /* renamed from: i */
    private void m31281i() {
        SuggestBean suggestBean = new SuggestBean();
        suggestBean.setContact(this.f8297m.getText().toString());
        suggestBean.setContent(this.f8295k.getText().toString());
        suggestBean.setList(this.f8309y);
        suggestBean.setModel("4");
        suggestBean.setUserID(C1756a.m34259c(getApplicationContext()).getUserID());
        suggestBean.setEmail(this.f8296l.getText().toString());
        new C1999s(getApplicationContext()).m33306b(suggestBean, new AbstractC1945k() { // from class: com.fimi.soul.module.customerfeedback.CustomerFeedBackActivity.4
            @Override // com.fimi.soul.biz.p185m.AbstractC1945k
            /* renamed from: a */
            public void mo28106a(PlaneMsg planeMsg, File file) {
                if (planeMsg == null) {
                    C1688z.m34449a(CustomerFeedBackActivity.this.getApplicationContext(), (int) C1704R.C1707string.feedback_error, 3000);
                } else if (planeMsg.isSuccess()) {
                    C1688z.m34449a(CustomerFeedBackActivity.this.getApplicationContext(), (int) C1704R.C1707string.feed_success, 3000);
                } else {
                    C1688z.m34449a(CustomerFeedBackActivity.this.getApplicationContext(), (int) C1704R.C1707string.feedback_error, 3000);
                }
                CustomerFeedBackActivity.this.m31279j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m31279j() {
        if (this.f8284A.hasMessages(10)) {
            this.f8284A.removeMessages(10);
        }
        this.f8284A.sendEmptyMessage(10);
    }

    /* renamed from: k */
    private void m31278k() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        startActivityForResult(intent, this.f8302r);
    }

    /* renamed from: l */
    private boolean m31277l() {
        if (this.f8303s == null || !this.f8303s.isVisible()) {
            return false;
        }
        this.f8304t.beginTransaction().hide(this.f8303s).commitAllowingStateLoss();
        return true;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3312d
    /* renamed from: a */
    public void mo28347a(View view, float f, float f2) {
        m31277l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (intent == null) {
            return;
        }
        super.onActivityResult(i, i2, intent);
        Uri data = intent.getData();
        if (data == null || this.f8299o.size() <= 0) {
            return;
        }
        this.f8299o.add(this.f8299o.size() - 1, data);
        if (this.f8301q == null) {
            return;
        }
        this.f8301q.m31242a(this.f8299o);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.sendSuggest /* 2131755461 */:
                if (!C3103au.m29221b(getApplicationContext())) {
                    C1688z.m34449a(getApplicationContext(), (int) C1704R.C1707string.no_available_network, 3000);
                    return;
                } else if (!this.drone.mo32906ab().mo32588a() || !C1846a.m33917a().m33914c()) {
                    m31285g();
                    return;
                } else {
                    C1688z.m34449a(getApplicationContext(), (int) C1704R.C1707string.no_available_network, 3000);
                    return;
                }
            case C1704R.C1706id.judge_faq /* 2131755612 */:
            default:
                return;
            case C1704R.C1706id.black_btn /* 2131756179 */:
                finish();
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.customer_feedback_activity);
        m31303a();
        m31293c();
        m31291d();
        m31289e();
        m31287f();
        m31297b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C2549a.m31251a().m31247b();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == this.f8299o.size() - 1) {
            m31278k();
        } else if (this.f8303s == null) {
        } else {
            this.f8303s.m31252a(this.f8299o);
            this.f8303s.m31254a(i);
            if (this.f8303s.isVisible()) {
                return;
            }
            this.f8304t.beginTransaction().show(this.f8303s).commitAllowingStateLoss();
        }
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m31277l()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (view == this.f8295k) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
        return false;
    }
}
