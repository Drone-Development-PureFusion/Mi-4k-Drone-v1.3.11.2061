package com.tencent.open;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.connect.auth.QQToken;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
/* loaded from: classes2.dex */
public class SocialApi {

    /* renamed from: a */
    private SocialApiIml f31747a;

    public SocialApi(QQToken qQToken) {
        this.f31747a = new SocialApiIml(qQToken);
    }

    public void ask(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f31747a.ask(activity, bundle, iUiListener);
    }

    public void brag(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f31747a.brag(activity, bundle, iUiListener);
    }

    public void challenge(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f31747a.challenge(activity, bundle, iUiListener);
    }

    public boolean checkVoiceApi(Activity activity, Bundle bundle, IUiListener iUiListener) {
        bundle.putString("version", Util.getAppVersion(activity));
        this.f31747a.grade(activity, bundle, iUiListener);
        return true;
    }

    public void gift(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f31747a.gift(activity, bundle, iUiListener);
    }

    public void grade(Activity activity, Bundle bundle, IUiListener iUiListener) {
        bundle.putString("version", Util.getAppVersion(activity));
        this.f31747a.grade(activity, bundle, iUiListener);
    }

    public void invite(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f31747a.invite(activity, bundle, iUiListener);
    }

    public void reactive(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f31747a.reactive(activity, bundle, iUiListener);
    }

    public void story(Activity activity, Bundle bundle, IUiListener iUiListener) {
        this.f31747a.story(activity, bundle, iUiListener);
    }

    public void voice(Activity activity, Bundle bundle, IUiListener iUiListener) {
        bundle.putString("version", Util.getAppVersion(activity));
        this.f31747a.voice(activity, bundle, iUiListener);
    }
}
