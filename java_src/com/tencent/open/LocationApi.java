package com.tencent.open;

import android.app.Activity;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.connect.auth.QQAuth;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.p259a.C10114a;
import com.tencent.open.C10276c;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IRequestListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class LocationApi extends BaseApi implements C10276c.AbstractC10277a {

    /* renamed from: a */
    private HandlerThread f31732a;

    /* renamed from: b */
    private Handler f31733b;

    /* renamed from: c */
    private Handler f31734c;

    /* renamed from: d */
    private C10276c f31735d;

    /* renamed from: e */
    private Bundle f31736e;

    /* renamed from: f */
    private IUiListener f31737f;

    /* renamed from: com.tencent.open.LocationApi$a */
    /* loaded from: classes2.dex */
    private abstract class AbstractC10216a implements IRequestListener {
        private AbstractC10216a() {
        }

        /* renamed from: a */
        protected abstract void mo5816a(Exception exc);

        @Override // com.tencent.tauth.IRequestListener
        public void onConnectTimeoutException(ConnectTimeoutException connectTimeoutException) {
            mo5816a(connectTimeoutException);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onHttpStatusException(HttpUtils.HttpStatusException httpStatusException) {
            mo5816a(httpStatusException);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onIOException(IOException iOException) {
            mo5816a(iOException);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onJSONException(JSONException jSONException) {
            mo5816a(jSONException);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onMalformedURLException(MalformedURLException malformedURLException) {
            mo5816a(malformedURLException);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onNetworkUnavailableException(HttpUtils.NetworkUnavailableException networkUnavailableException) {
            mo5816a(networkUnavailableException);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onSocketTimeoutException(SocketTimeoutException socketTimeoutException) {
            mo5816a(socketTimeoutException);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onUnknowException(Exception exc) {
            mo5816a(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tencent.open.LocationApi$b */
    /* loaded from: classes2.dex */
    public class C10217b extends AbstractC10216a {

        /* renamed from: c */
        private IUiListener f31745c;

        public C10217b(IUiListener iUiListener) {
            super();
            this.f31745c = iUiListener;
        }

        @Override // com.tencent.open.LocationApi.AbstractC10216a
        /* renamed from: a */
        protected void mo5816a(Exception exc) {
            if (this.f31745c != null) {
                this.f31745c.onError(new UiError(100, exc.getMessage(), null));
            }
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onComplete(JSONObject jSONObject) {
            if (this.f31745c != null) {
                this.f31745c.onComplete(jSONObject);
            }
            C10257f.m5673b("SDKQQAgentPref", "GetNearbySwitchEnd:" + SystemClock.elapsedRealtime());
        }
    }

    public LocationApi(QQAuth qQAuth, QQToken qQToken) {
        super(qQAuth, qQToken);
        m5827a();
    }

    public LocationApi(QQToken qQToken) {
        super(qQToken);
        m5827a();
    }

    /* renamed from: a */
    private void m5827a() {
        this.f31735d = new C10276c();
        this.f31732a = new HandlerThread("get_location");
        this.f31732a.start();
        this.f31733b = new Handler(this.f31732a.getLooper());
        this.f31734c = new Handler(Global.getContext().getMainLooper()) { // from class: com.tencent.open.LocationApi.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 101:
                        C10257f.m5673b(C10257f.f31917d, "location: get location timeout.");
                        LocationApi.this.m5826a(-13, Constants.MSG_LOCATION_TIMEOUT_ERROR);
                        break;
                    case 103:
                        C10257f.m5673b(C10257f.f31917d, "location: verify sosocode success.");
                        LocationApi.this.f31735d.m5617a(Global.getContext(), LocationApi.this);
                        LocationApi.this.f31734c.sendEmptyMessageDelayed(101, 10000L);
                        break;
                    case 104:
                        C10257f.m5673b(C10257f.f31917d, "location: verify sosocode failed.");
                        LocationApi.this.m5826a(-14, Constants.MSG_LOCATION_VERIFY_ERROR);
                        break;
                }
                super.handleMessage(message);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5826a(int i, String str) {
        this.f31735d.m5616b();
        if (this.f31737f == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ret", i);
            jSONObject.put("errMsg", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f31737f.onComplete(jSONObject);
    }

    /* renamed from: a */
    private void m5825a(Location location) {
        Bundle composeCGIParams;
        C10257f.m5673b(C10257f.f31917d, "location: search mParams: " + this.f31736e);
        if (this.f31736e != null) {
            composeCGIParams = new Bundle(this.f31736e);
            composeCGIParams.putAll(composeCGIParams());
        } else {
            composeCGIParams = composeCGIParams();
        }
        String valueOf = String.valueOf(location.getLatitude());
        String valueOf2 = String.valueOf(location.getLongitude());
        composeCGIParams.putString("appid", this.mToken.getAppId());
        if (!composeCGIParams.containsKey("latitude")) {
            composeCGIParams.putString("latitude", valueOf);
        }
        if (!composeCGIParams.containsKey("longitude")) {
            composeCGIParams.putString("longitude", valueOf2);
        }
        if (!composeCGIParams.containsKey("page")) {
            composeCGIParams.putString("page", String.valueOf(1));
        }
        composeCGIParams.putString("encrytoken", Util.encrypt("tencent&sdk&qazxc***14969%%" + this.mToken.getAccessToken() + this.mToken.getAppId() + this.mToken.getOpenId() + "qzone3.4"));
        C10257f.m5673b(C10257f.f31917d, "location: search params: " + composeCGIParams);
        C10257f.m5673b("SDKQQAgentPref", "GetNearbySwitchStart:" + SystemClock.elapsedRealtime());
        HttpUtils.requestAsync(this.mToken, Global.getContext(), "http://fusion.qq.com/cgi-bin/qzapps/mapp_lbs_getnear.cgi", composeCGIParams, "GET", new C10217b(this.f31737f));
    }

    /* renamed from: a */
    private void m5822a(final String str, final String... strArr) {
        this.f31733b.post(new Runnable() { // from class: com.tencent.open.LocationApi.3
            @Override // java.lang.Runnable
            public void run() {
                if (strArr == null || strArr.length == 0) {
                    return;
                }
                C10114a.m6184a(Global.getContext(), LocationApi.this.mToken, "search_nearby".equals(str) ? "id_search_nearby" : "id_delete_location", strArr);
            }
        });
    }

    /* renamed from: b */
    private void m5821b() {
        this.f31735d.m5616b();
    }

    /* renamed from: c */
    private boolean m5819c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) Global.getContext().getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
        }
        return false;
    }

    /* renamed from: d */
    private JSONObject m5817d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ret", -9);
            jSONObject.put("errMsg", Constants.MSG_IO_ERROR);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public void deleteLocation(Activity activity, Bundle bundle, IUiListener iUiListener) {
        Bundle composeCGIParams;
        if (!m5819c()) {
            if (iUiListener == null) {
                return;
            }
            iUiListener.onComplete(m5817d());
            return;
        }
        if (bundle != null) {
            composeCGIParams = new Bundle(bundle);
            composeCGIParams.putAll(composeCGIParams());
        } else {
            composeCGIParams = composeCGIParams();
        }
        composeCGIParams.putString("appid", this.mToken.getAppId());
        composeCGIParams.putString("timestamp", String.valueOf(System.currentTimeMillis()));
        composeCGIParams.putString("encrytoken", Util.encrypt("tencent&sdk&qazxc***14969%%" + this.mToken.getAccessToken() + this.mToken.getAppId() + this.mToken.getOpenId() + "qzone3.4"));
        C10257f.m5673b(C10257f.f31917d, "location: delete params: " + composeCGIParams);
        HttpUtils.requestAsync(this.mToken, Global.getContext(), "http://fusion.qq.com/cgi-bin/qzapps/mapp_lbs_delete.cgi", composeCGIParams, "GET", new C10217b(iUiListener));
        m5822a("delete_location", "success");
    }

    @Override // com.tencent.open.C10276c.AbstractC10277a
    public void onLocationUpdate(Location location) {
        m5825a(location);
        m5821b();
        this.f31734c.removeMessages(101);
    }

    public void searchNearby(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (!m5819c()) {
            if (iUiListener == null) {
                return;
            }
            iUiListener.onComplete(m5817d());
            return;
        }
        this.f31736e = bundle;
        this.f31737f = iUiListener;
        this.f31733b.post(new Runnable() { // from class: com.tencent.open.LocationApi.2
            @Override // java.lang.Runnable
            public void run() {
                if (LocationApi.this.f31735d.m5618a()) {
                    Message.obtain(LocationApi.this.f31734c, 103).sendToTarget();
                } else {
                    Message.obtain(LocationApi.this.f31734c, 104).sendToTarget();
                }
            }
        });
    }
}
