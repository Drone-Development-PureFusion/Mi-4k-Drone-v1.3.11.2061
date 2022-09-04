package com.fimi.soul.module.login;

import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.twitter.Twitter;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.manager.C2015y;
import com.fimi.soul.biz.p183k.C1903e;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.p215d.C2558a;
import com.fimi.soul.module.setting.ShowTextActivity;
import com.fimi.soul.module.thirdpartlogin.C2988c;
import com.fimi.soul.service.InitAppService;
import com.fimi.soul.service.QueryDynamicFlyZoneSetvice;
import com.fimi.soul.utils.AbstractC3093ap;
import com.fimi.soul.utils.C3087ao;
import com.fimi.soul.utils.C3103au;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import com.xiaomi.mipush.sdk.MiPushClient;
/* loaded from: classes.dex */
public class LoginFragment extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private TextView f9813a;

    /* renamed from: b */
    private Context f9814b;

    /* renamed from: c */
    private TextView f9815c;

    /* renamed from: d */
    private TextView f9816d;

    /* renamed from: e */
    private Button f9817e;

    /* renamed from: f */
    private Button f9818f;

    /* renamed from: g */
    private Button f9819g;

    /* renamed from: h */
    private Button f9820h;

    /* renamed from: i */
    private LinearLayout f9821i;

    /* renamed from: j */
    private TextView f9822j;

    /* renamed from: k */
    private TextView f9823k;

    /* renamed from: l */
    private TextView f9824l;

    /* renamed from: m */
    private TextView f9825m;

    /* renamed from: n */
    private RelativeLayout f9826n;

    /* renamed from: o */
    private RelativeLayout f9827o;

    /* renamed from: p */
    private LayoutTransition f9828p;

    /* renamed from: q */
    private AbstractC2800a f9829q;

    /* renamed from: s */
    private XiaomiOAuthResults f9831s;

    /* renamed from: t */
    private C2015y f9832t;

    /* renamed from: u */
    private String f9833u;

    /* renamed from: x */
    private AbstractC3093ap f9836x;

    /* renamed from: r */
    private String f9830r = "http://dev.xiaomi.com";

    /* renamed from: v */
    private User f9834v = new User();

    /* renamed from: w */
    private Boolean f9835w = false;

    /* renamed from: y */
    private boolean f9837y = false;

    /* renamed from: z */
    private int f9838z = -10;

    /* renamed from: A */
    private C2988c.AbstractC2991a f9812A = new C2988c.AbstractC2991a() { // from class: com.fimi.soul.module.login.LoginFragment.1
        @Override // com.fimi.soul.module.thirdpartlogin.C2988c.AbstractC2991a
        /* renamed from: a */
        public void mo29761a(int i, Object obj) {
            LoginFragment.this.f9837y = false;
            LoginFragment.this.f9838z = i;
            if (i != 0) {
                if (i != 1) {
                    LoginFragment.this.f9827o.setVisibility(4);
                    return;
                }
                LoginFragment.this.f9827o.setVisibility(4);
                C1688z.m34447a(LoginFragment.this.f9814b, (String) obj, C1688z.f4192c);
                return;
            }
            LoginFragment.this.f9827o.setVisibility(4);
            MiPushClient.registerPush(LoginFragment.this.f9814b, "2882303761517518920", C1756a.f4559r);
            if (!C1642c.m34887c().mo34872d(C1756a.f4560s)) {
                if (LoginFragment.this.f9829q != null) {
                    LoginFragment.this.f9829q.mo30231c();
                }
            } else if (LoginFragment.this.f9829q != null) {
                LoginFragment.this.f9829q.mo30230d();
            }
            LoginFragment.this.f9814b.startService(new Intent(LoginFragment.this.f9814b, InitAppService.class));
        }
    };

    /* renamed from: com.fimi.soul.module.login.LoginFragment$a */
    /* loaded from: classes.dex */
    public interface AbstractC2800a {
        /* renamed from: b */
        void mo30232b();

        /* renamed from: c */
        void mo30231c();

        /* renamed from: d */
        void mo30230d();
    }

    /* renamed from: a */
    private void m30238a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9813a, "translationX", this.f9813a.getTranslationX(), 1000.0f);
        ofFloat.setDuration(500L);
        ofFloat.start();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9816d, "translationX", this.f9816d.getTranslationX(), 1000.0f);
        ofFloat2.setStartDelay(100L);
        ofFloat2.setDuration(500L);
        ofFloat2.start();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f9817e, "translationX", this.f9816d.getTranslationX(), 1000.0f);
        ofFloat3.setStartDelay(200L);
        ofFloat3.setDuration(500L);
        ofFloat3.start();
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f9821i, "translationX", this.f9816d.getTranslationX(), 1000.0f);
        ofFloat4.setStartDelay(200L);
        ofFloat4.setDuration(500L);
        ofFloat4.start();
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f9818f, "translationX", this.f9816d.getTranslationX(), 1000.0f);
        ofFloat5.setStartDelay(300L);
        ofFloat5.setDuration(500L);
        ofFloat5.start();
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f9822j, "translationX", this.f9816d.getTranslationX(), 1000.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f9823k, "translationX", this.f9816d.getTranslationX(), 1000.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f9825m, "translationX", this.f9816d.getTranslationX(), 1000.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f9824l, "translationX", this.f9816d.getTranslationX(), 1000.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat6).with(ofFloat9).with(ofFloat7).with(ofFloat8);
        animatorSet.setStartDelay(400L);
        animatorSet.setDuration(500L);
        animatorSet.start();
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f9815c, "translationX", this.f9816d.getTranslationX(), 1000.0f);
        ofFloat10.setStartDelay(500L);
        ofFloat10.setDuration(500L);
        ofFloat10.start();
        this.f9829q.mo30232b();
    }

    public void facebookLogin() {
        if (this.f9837y) {
            return;
        }
        this.f9837y = false;
        if (C2558a.m31240a(this.f9814b)) {
            this.f9827o.setVisibility(0);
        }
        C2988c.m29770a().m29764a(Facebook.NAME, this.f9812A);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f9829q = (AbstractC2800a) activity;
        this.f9814b = activity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.agreementshengming_tv /* 2131755245 */:
                Intent intent = new Intent(getActivity(), ShowTextActivity.class);
                intent.putExtra(ShowTextActivity.f10328c, C1756a.f4549h);
                intent.putExtra(ShowTextActivity.f10326a, C1704R.C1707string.agreement_shengming);
                intent.putExtra(ShowTextActivity.f10327b, "file:///android_asset/statement.html");
                startActivity(intent);
                return;
            case C1704R.C1706id.register_bt /* 2131755852 */:
                if (!C3103au.m29221b(this.f9814b)) {
                    C1688z.m34449a(this.f9814b, (int) C1704R.C1707string.login_result_net, 1000);
                    return;
                }
                this.f9814b.startActivity(new Intent(this.f9814b, RegisterActivity.class));
                return;
            case C1704R.C1706id.login_bt /* 2131755853 */:
                if (!C3103au.m29221b(this.f9814b)) {
                    C1688z.m34449a(this.f9814b, (int) C1704R.C1707string.login_result_net, 1000);
                    return;
                }
                this.f9827o.setVisibility(0);
                this.f9836x.mo29292a(this.f9814b, new AbstractC3093ap.AbstractC3094a() { // from class: com.fimi.soul.module.login.LoginFragment.2
                    @Override // com.fimi.soul.utils.AbstractC3093ap.AbstractC3094a
                    /* renamed from: a */
                    public void mo29291a() {
                        LoginFragment.this.f9827o.setVisibility(4);
                        MiPushClient.registerPush(LoginFragment.this.f9814b, "2882303761517518920", C1756a.f4559r);
                        if (!C1642c.m34887c().mo34872d(C1756a.f4560s)) {
                            if (LoginFragment.this.f9829q != null) {
                                LoginFragment.this.f9829q.mo30231c();
                            }
                        } else if (LoginFragment.this.f9829q != null) {
                            LoginFragment.this.f9829q.mo30230d();
                        }
                        LoginFragment.this.f9814b.startService(new Intent(LoginFragment.this.f9814b, InitAppService.class));
                        C1903e.m33631a().m33629a(C1903e.EnumC1904a.IDEL);
                        QueryDynamicFlyZoneSetvice.m29455a(LoginFragment.this.f9814b);
                    }

                    @Override // com.fimi.soul.utils.AbstractC3093ap.AbstractC3094a
                    /* renamed from: a */
                    public void mo29290a(String str) {
                        LoginFragment.this.f9827o.setVisibility(4);
                        C1688z.m34447a(LoginFragment.this.f9814b, str, C1688z.f4192c);
                    }

                    @Override // com.fimi.soul.utils.AbstractC3093ap.AbstractC3094a
                    /* renamed from: b */
                    public void mo29289b() {
                        LoginFragment.this.f9827o.setVisibility(4);
                    }
                });
                return;
            case C1704R.C1706id.btn_facebook_login /* 2131755855 */:
                facebookLogin();
                return;
            case C1704R.C1706id.btn_twitter_login /* 2131755856 */:
                twitterLogin();
                return;
            case C1704R.C1706id.agreementprivacy_tv /* 2131755858 */:
                Intent intent2 = new Intent(getActivity(), ShowTextActivity.class);
                intent2.putExtra(ShowTextActivity.f10328c, C1756a.f4550i);
                intent2.putExtra(ShowTextActivity.f10326a, C1704R.C1707string.agreement_privacy);
                intent2.putExtra(ShowTextActivity.f10327b, "file:///android_asset/privacy.html");
                startActivity(intent2);
                return;
            case C1704R.C1706id.nologin_tv /* 2131755860 */:
                if (this.f9835w.booleanValue()) {
                    return;
                }
                this.f9835w = true;
                if (this.f9829q == null) {
                    return;
                }
                this.f9829q.mo30230d();
                return;
            default:
                return;
        }
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.fragment_login, viewGroup, false);
        this.f9815c = (TextView) inflate.findViewById(C1704R.C1706id.nologin_tv);
        this.f9815c.setOnClickListener(this);
        this.f9813a = (TextView) inflate.findViewById(C1704R.C1706id.welcom_tv);
        this.f9817e = (Button) inflate.findViewById(C1704R.C1706id.login_bt);
        this.f9818f = (Button) inflate.findViewById(C1704R.C1706id.register_bt);
        this.f9816d = (TextView) inflate.findViewById(C1704R.C1706id.miaircraft_tv);
        this.f9816d = (TextView) inflate.findViewById(C1704R.C1706id.miaircraft_tv);
        this.f9817e = (Button) inflate.findViewById(C1704R.C1706id.login_bt);
        this.f9817e.setOnClickListener(this);
        this.f9821i = (LinearLayout) inflate.findViewById(C1704R.C1706id.ll_trilateral_login);
        this.f9819g = (Button) inflate.findViewById(C1704R.C1706id.btn_facebook_login);
        this.f9819g.setOnClickListener(this);
        this.f9820h = (Button) inflate.findViewById(C1704R.C1706id.btn_twitter_login);
        this.f9820h.setOnClickListener(this);
        this.f9825m = (TextView) inflate.findViewById(C1704R.C1706id.agreement_tv);
        this.f9818f = (Button) inflate.findViewById(C1704R.C1706id.register_bt);
        this.f9818f.setOnClickListener(this);
        this.f9822j = (TextView) inflate.findViewById(C1704R.C1706id.agreementprivacy_tv);
        this.f9822j.getPaint().setFlags(8);
        this.f9822j.getPaint().setAntiAlias(true);
        this.f9822j.setOnClickListener(this);
        this.f9823k = (TextView) inflate.findViewById(C1704R.C1706id.agreementshengming_tv);
        this.f9823k.getPaint().setFlags(8);
        this.f9823k.getPaint().setAntiAlias(true);
        this.f9823k.setOnClickListener(this);
        this.f9824l = (TextView) inflate.findViewById(C1704R.C1706id.loginmillet_tv);
        this.f9826n = (RelativeLayout) inflate.findViewById(C1704R.C1706id.login_rl);
        this.f9827o = (RelativeLayout) inflate.findViewById(C1704R.C1706id.login_progress_rl);
        this.f9832t = C2015y.m33256a(this.f9814b);
        C3103au.m29232a(this.f9814b.getAssets(), this.f9815c, this.f9813a, this.f9817e, this.f9818f, this.f9816d, this.f9822j, this.f9825m, this.f9823k, this.f9824l, this.f9819g, this.f9820h);
        this.f9836x = new C3087ao();
        if (getActivity() != null) {
            C2988c.m29770a().m29769a(getActivity());
        }
        return inflate;
    }

    public void twitterLogin() {
        if (this.f9837y) {
            return;
        }
        this.f9837y = false;
        if (C2558a.m31240a(this.f9814b)) {
            this.f9827o.setVisibility(0);
        }
        C2988c.m29770a().m29764a(Twitter.NAME, this.f9812A);
    }
}
