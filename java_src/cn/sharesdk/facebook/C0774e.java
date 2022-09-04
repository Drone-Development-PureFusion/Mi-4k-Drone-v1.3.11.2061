package cn.sharesdk.facebook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import com.mob.tools.FakeActivity;
import java.io.File;
import java.util.ArrayList;
/* renamed from: cn.sharesdk.facebook.e */
/* loaded from: classes.dex */
public class C0774e extends FakeActivity {

    /* renamed from: a */
    private PlatformActionListener f1461a;

    /* renamed from: b */
    private Platform f1462b;

    /* renamed from: c */
    private Platform.ShareParams f1463c;

    /* renamed from: d */
    private String f1464d;

    /* renamed from: e */
    private String[] f1465e;

    /* renamed from: a */
    public Intent m38042a() {
        Intent intent = new Intent("com.facebook.platform.PLATFORM_ACTIVITY");
        intent.setPackage("com.facebook.katana");
        intent.addCategory("android.intent.category.DEFAULT");
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("DATA_FAILURES_FATAL", false);
        bundle2.putString("TITLE", this.f1463c.getTitle());
        int shareType = this.f1463c.getShareType();
        switch (shareType) {
            case 2:
                ArrayList<String> arrayList = new ArrayList<>();
                Uri fromFile = Uri.fromFile(new File(this.f1463c.getImagePath()));
                arrayList.add(fromFile.toString());
                String[] imageArray = this.f1463c.getImageArray();
                if (imageArray != null && imageArray.length > 0) {
                    for (String str : imageArray) {
                        if (!TextUtils.isEmpty(str)) {
                            arrayList.add(str);
                        }
                    }
                }
                arrayList.add(fromFile.toString());
                bundle2.putStringArrayList("PHOTOS", arrayList);
                bundle2.putString("DESCRIPTION", this.f1463c.getText());
                bundle2.putString("NAME", this.f1463c.getTitle());
                break;
            case 3:
            case 5:
            default:
                if (this.f1461a != null) {
                    this.f1461a.onError(this.f1462b, 9, new IllegalArgumentException("shareType = " + shareType));
                    return null;
                }
                break;
            case 4:
                bundle2.putString("LINK", this.f1462b.getShortLintk(this.f1463c.getUrl(), false));
                bundle2.putString("type", "LINK");
                break;
            case 6:
                if (this.f1463c != null && !TextUtils.isEmpty(this.f1463c.getFilePath())) {
                    bundle2.putString("VIDEO", Uri.fromFile(new File(this.f1463c.getFilePath())).toString());
                    bundle2.putString("type", "VIDEO");
                    bundle2.putString("DESCRIPTION", this.f1463c.getText());
                    bundle2.putString("TITLE", this.f1463c.getTitle());
                    break;
                }
                break;
        }
        bundle.putBundle("com.facebook.platform.protocol.METHOD_ARGS", bundle2);
        bundle.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", 20160327);
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f1464d);
        bundle.putString("com.facebook.platform.protocol.PROTOCOL_ACTION", "com.facebook.platform.action.request.FEED_DIALOG");
        Bundle bundle3 = new Bundle();
        bundle3.putString("action_id", "cf61947c-a8fe-4fa3-aa7c-fbeb7f291352");
        bundle.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", bundle3);
        intent.putExtras(bundle);
        return intent;
    }

    /* renamed from: a */
    public void m38041a(PlatformActionListener platformActionListener, Platform platform, Platform.ShareParams shareParams, String str, String[] strArr) {
        this.f1461a = platformActionListener;
        this.f1462b = platform;
        this.f1463c = shareParams;
        this.f1464d = str;
        this.f1465e = strArr;
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        finish();
        this.f1461a.onComplete(this.f1462b, 9, null);
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        super.onCreate();
        try {
            if (m38042a() == null) {
                return;
            }
            this.activity.startActivityForResult(m38042a(), 64206);
        } catch (Throwable th) {
            finish();
            this.f1461a.onError(this.f1462b, 9, th);
        }
    }
}
