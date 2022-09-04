package cn.sharesdk.framework;

import android.content.Context;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.p076b.p078b.C0808f;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.Hashon;
import com.p255mi.live.openlivesdk.C10024b;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class Service {

    /* renamed from: a */
    private Context f1485a;

    /* renamed from: b */
    private String f1486b;

    /* loaded from: classes.dex */
    public static abstract class ServiceEvent {
        private static final int PLATFORM = 1;
        protected Service service;

        public ServiceEvent(Service service) {
            this.service = service;
        }

        protected HashMap<String, Object> filterShareContent(int i, Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
            C0808f.C0809a filterShareContent = ShareSDK.getPlatform(ShareSDK.platformIdToName(i)).filterShareContent(shareParams, hashMap);
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("shareID", filterShareContent.f1581a);
            hashMap2.put("shareContent", new Hashon().fromJson(filterShareContent.toString()));
            C0831d.m37772a().m6194i("filterShareContent ==>>%s", hashMap2);
            return hashMap2;
        }

        protected HashMap<String, Object> toMap() {
            HashMap<String, Object> hashMap = new HashMap<>();
            DeviceHelper deviceHelper = DeviceHelper.getInstance(this.service.f1485a);
            hashMap.put("deviceid", deviceHelper.getDeviceKey());
            hashMap.put(C10024b.f30903f, this.service.getAppKey());
            hashMap.put("apppkg", deviceHelper.getPackageName());
            hashMap.put("appver", Integer.valueOf(deviceHelper.getAppVersion()));
            hashMap.put("sdkver", Integer.valueOf(this.service.getServiceVersionInt()));
            hashMap.put("plat", 1);
            hashMap.put("networktype", deviceHelper.getDetailNetworkTypeForStatic());
            hashMap.put("deviceData", deviceHelper.getDeviceDataNotAES());
            return hashMap;
        }

        public final String toString() {
            return new Hashon().fromHashMap(toMap());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m38031a(Context context) {
        this.f1485a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m38029a(String str) {
        this.f1486b = str;
    }

    public String getAppKey() {
        return this.f1486b;
    }

    public Context getContext() {
        return this.f1485a;
    }

    public String getDeviceKey() {
        return DeviceHelper.getInstance(this.f1485a).getDeviceKey();
    }

    protected abstract int getServiceVersionInt();

    public abstract String getServiceVersionName();

    public void onBind() {
    }

    public void onUnbind() {
    }
}
