package cn.sharesdk.framework;

import android.os.Handler;
import android.os.Message;
import com.mob.tools.utils.UIHandler;
import java.util.HashMap;
/* loaded from: classes.dex */
public class ReflectablePlatformActionListener implements PlatformActionListener {

    /* renamed from: a */
    private int f1479a;

    /* renamed from: b */
    private Handler.Callback f1480b;

    /* renamed from: c */
    private int f1481c;

    /* renamed from: d */
    private Handler.Callback f1482d;

    /* renamed from: e */
    private int f1483e;

    /* renamed from: f */
    private Handler.Callback f1484f;

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onCancel(Platform platform, int i) {
        if (this.f1484f != null) {
            Message message = new Message();
            message.what = this.f1483e;
            message.obj = new Object[]{platform, Integer.valueOf(i)};
            UIHandler.sendMessage(message, this.f1484f);
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
        if (this.f1480b != null) {
            Message message = new Message();
            message.what = this.f1479a;
            message.obj = new Object[]{platform, Integer.valueOf(i), hashMap};
            UIHandler.sendMessage(message, this.f1480b);
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onError(Platform platform, int i, Throwable th) {
        if (this.f1482d != null) {
            Message message = new Message();
            message.what = this.f1481c;
            message.obj = new Object[]{platform, Integer.valueOf(i), th};
            UIHandler.sendMessage(message, this.f1482d);
        }
    }

    public void setOnCancelCallback(int i, Handler.Callback callback) {
        this.f1483e = i;
        this.f1484f = callback;
    }

    public void setOnCompleteCallback(int i, Handler.Callback callback) {
        this.f1479a = i;
        this.f1480b = callback;
    }

    public void setOnErrorCallback(int i, Handler.Callback callback) {
        this.f1481c = i;
        this.f1482d = callback;
    }
}
