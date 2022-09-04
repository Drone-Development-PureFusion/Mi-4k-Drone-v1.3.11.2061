package com.tencent.connect.avatar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.open.p265b.C10266d;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class QQAvatar extends BaseApi {

    /* renamed from: a */
    private IUiListener f31257a;

    public QQAvatar(QQToken qQToken) {
        super(qQToken);
    }

    /* renamed from: a */
    private Intent m6089a(Activity activity) {
        Intent intent = new Intent();
        intent.setClass(activity, ImageActivity.class);
        return intent;
    }

    /* renamed from: a */
    private void m6088a(Activity activity, Bundle bundle) {
        m6087a(bundle);
        this.mActivityIntent.putExtra(Constants.KEY_ACTION, "action_avatar");
        this.mActivityIntent.putExtra(Constants.KEY_PARAMS, bundle);
        startAssitActivity(activity, this.f31257a);
    }

    /* renamed from: a */
    private void m6087a(Bundle bundle) {
        if (this.mToken != null) {
            bundle.putString("appid", this.mToken.getAppId());
            if (this.mToken.isSessionValid()) {
                bundle.putString(Constants.PARAM_KEY_STR, this.mToken.getAccessToken());
                bundle.putString(Constants.PARAM_KEY_TYPE, "0x80");
            }
            String openId = this.mToken.getOpenId();
            if (openId != null) {
                bundle.putString("hopenid", openId);
            }
            bundle.putString(Constants.PARAM_PLATFORM, "androidqz");
            try {
                bundle.putString(Constants.PARAM_PLATFORM_ID, Global.getContext().getSharedPreferences(Constants.PREFERENCE_PF, 0).getString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF));
            } catch (Exception e) {
                e.printStackTrace();
                bundle.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
            }
        }
        bundle.putString("sdkv", Constants.SDK_VERSION);
        bundle.putString("sdkp", "a");
    }

    @Override // com.tencent.connect.common.BaseApi
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (i2 != -1) {
            this.f31257a.onCancel();
            return;
        }
        int intExtra = intent.getIntExtra(Constants.KEY_ERROR_CODE, 0);
        if (intExtra != 0) {
            this.f31257a.onError(new UiError(intExtra, intent.getStringExtra(Constants.KEY_ERROR_MSG), intent.getStringExtra(Constants.KEY_ERROR_DETAIL)));
            return;
        }
        String stringExtra = intent.getStringExtra(Constants.KEY_RESPONSE);
        if (stringExtra == null) {
            this.f31257a.onComplete(new JSONObject());
            return;
        }
        try {
            this.f31257a.onComplete(Util.parseJson(stringExtra));
        } catch (JSONException e) {
            this.f31257a.onError(new UiError(-4, Constants.MSG_JSON_ERROR, stringExtra));
        }
    }

    public void setAvatar(Activity activity, Uri uri, IUiListener iUiListener, int i) {
        if (this.f31257a != null) {
            this.f31257a.onCancel();
        }
        this.f31257a = iUiListener;
        Bundle bundle = new Bundle();
        bundle.putString(SocialConstants.PARAM_AVATAR_URI, uri.toString());
        bundle.putInt("exitAnim", i);
        bundle.putString("appid", this.mToken.getAppId());
        bundle.putString("access_token", this.mToken.getAccessToken());
        bundle.putLong("expires_in", this.mToken.getExpireTimeInSecond());
        bundle.putString("openid", this.mToken.getOpenId());
        this.mActivityIntent = m6089a(activity);
        if (!hasActivityForIntent()) {
            C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_SET_AVATAR, "12", "18", "1");
            return;
        }
        m6088a(activity, bundle);
        C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_SET_AVATAR, "12", "18", "0");
    }
}
