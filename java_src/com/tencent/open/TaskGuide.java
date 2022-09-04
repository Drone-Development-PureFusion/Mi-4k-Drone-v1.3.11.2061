package com.tencent.open;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.connect.auth.QQAuth;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.p259a.C10114a;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.utils.HttpUtils;
import com.tencent.p263mm.sdk.message.RMsgInfoDB;
import com.tencent.tauth.AuthActivity;
import com.tencent.tauth.IRequestListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import it.p273a.p274a.AbstractC10866e;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class TaskGuide extends BaseApi {

    /* renamed from: k */
    private static Drawable f31782k;

    /* renamed from: l */
    private static Drawable f31783l;

    /* renamed from: m */
    private static Drawable f31784m;

    /* renamed from: F */
    private Context f31803F;

    /* renamed from: I */
    private long f31806I;

    /* renamed from: J */
    private int f31807J;

    /* renamed from: K */
    private int f31808K;

    /* renamed from: c */
    IUiListener f31812c;

    /* renamed from: f */
    private WindowManager f31815f;

    /* renamed from: h */
    private C10236h f31817h;

    /* renamed from: n */
    private static int f31785n = 75;

    /* renamed from: o */
    private static int f31786o = 284;

    /* renamed from: p */
    private static int f31787p = 75;

    /* renamed from: q */
    private static int f31788q = 30;

    /* renamed from: r */
    private static int f31789r = 29;

    /* renamed from: s */
    private static int f31790s = 5;

    /* renamed from: t */
    private static int f31791t = 74;

    /* renamed from: u */
    private static int f31792u = 0;

    /* renamed from: v */
    private static int f31793v = 6;

    /* renamed from: w */
    private static int f31794w = 153;

    /* renamed from: x */
    private static int f31795x = 30;

    /* renamed from: y */
    private static int f31796y = 6;

    /* renamed from: z */
    private static int f31797z = 3;

    /* renamed from: b */
    static long f31781b = 5000;

    /* renamed from: L */
    private static int f31780L = 3000;

    /* renamed from: d */
    private WindowManager.LayoutParams f31813d = null;

    /* renamed from: e */
    private ViewGroup f31814e = null;

    /* renamed from: g */
    private Handler f31816g = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private EnumC10240k f31818i = EnumC10240k.INIT;

    /* renamed from: j */
    private EnumC10240k f31819j = EnumC10240k.INIT;

    /* renamed from: A */
    private int f31798A = 0;

    /* renamed from: B */
    private int f31799B = 0;

    /* renamed from: C */
    private float f31800C = 0.0f;

    /* renamed from: D */
    private Interpolator f31801D = new AccelerateInterpolator();

    /* renamed from: E */
    private boolean f31802E = false;

    /* renamed from: a */
    boolean f31811a = false;

    /* renamed from: G */
    private boolean f31804G = false;

    /* renamed from: H */
    private boolean f31805H = false;

    /* renamed from: M */
    private Runnable f31809M = null;

    /* renamed from: N */
    private Runnable f31810N = null;

    /* renamed from: com.tencent.open.TaskGuide$a */
    /* loaded from: classes2.dex */
    private abstract class AbstractC10228a implements IRequestListener {
        private AbstractC10228a() {
        }

        /* renamed from: a */
        protected abstract void mo5729a(Exception exc);

        @Override // com.tencent.tauth.IRequestListener
        public void onConnectTimeoutException(ConnectTimeoutException connectTimeoutException) {
            mo5729a(connectTimeoutException);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onHttpStatusException(HttpUtils.HttpStatusException httpStatusException) {
            mo5729a(httpStatusException);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onIOException(IOException iOException) {
            mo5729a(iOException);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onJSONException(JSONException jSONException) {
            mo5729a(jSONException);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onMalformedURLException(MalformedURLException malformedURLException) {
            mo5729a(malformedURLException);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onNetworkUnavailableException(HttpUtils.NetworkUnavailableException networkUnavailableException) {
            mo5729a(networkUnavailableException);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onSocketTimeoutException(SocketTimeoutException socketTimeoutException) {
            mo5729a(socketTimeoutException);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onUnknowException(Exception exc) {
            mo5729a(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tencent.open.TaskGuide$b */
    /* loaded from: classes2.dex */
    public class RunnableC10229b implements Runnable {
        private RunnableC10229b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TaskGuide.this.m5743l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.open.TaskGuide$c */
    /* loaded from: classes2.dex */
    public class RunnableC10230c implements Runnable {

        /* renamed from: a */
        boolean f31828a;

        /* renamed from: b */
        float f31829b = 0.0f;

        public RunnableC10230c(boolean z) {
            this.f31828a = false;
            this.f31828a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = true;
            SystemClock.currentThreadTimeMillis();
            this.f31829b = (float) (this.f31829b + 0.1d);
            float f = this.f31829b;
            if (f > 1.0f) {
                f = 1.0f;
            }
            boolean z2 = f >= 1.0f;
            int interpolation = (int) (TaskGuide.this.f31801D.getInterpolation(f) * TaskGuide.this.f31807J);
            if (this.f31828a) {
                TaskGuide.this.f31813d.y = TaskGuide.this.f31808K + interpolation;
            } else {
                TaskGuide.this.f31813d.y = TaskGuide.this.f31808K - interpolation;
            }
            C10257f.m5673b("TAG", "mWinParams.y = " + TaskGuide.this.f31813d.y + "deltaDistence = " + interpolation);
            if (TaskGuide.this.f31802E) {
                TaskGuide.this.f31815f.updateViewLayout(TaskGuide.this.f31814e, TaskGuide.this.f31813d);
                z = z2;
            }
            if (z) {
                TaskGuide.this.m5749i();
            } else {
                TaskGuide.this.f31816g.postDelayed(TaskGuide.this.f31809M, 5L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tencent.open.TaskGuide$d */
    /* loaded from: classes2.dex */
    public class C10231d extends AbstractC10228a {

        /* renamed from: b */
        int f31831b;

        public C10231d(int i) {
            super();
            this.f31831b = -1;
            this.f31831b = i;
        }

        @Override // com.tencent.open.TaskGuide.AbstractC10228a
        /* renamed from: a */
        protected void mo5729a(final Exception exc) {
            if (exc != null) {
                exc.printStackTrace();
            }
            TaskGuide.this.f31812c.onError(new UiError(101, "error ", "金券领取时出现异常"));
            if (TaskGuide.this.f31816g != null) {
                TaskGuide.this.f31816g.post(new Runnable() { // from class: com.tencent.open.TaskGuide.d.1
                    @Override // java.lang.Runnable
                    public void run() {
                        EnumC10240k enumC10240k = EnumC10240k.INIT;
                        if ((C10231d.this.f31831b == 0 ? TaskGuide.this.f31818i : TaskGuide.this.f31819j) == EnumC10240k.WAITTING_BACK_REWARD) {
                            TaskGuide.this.m5787a(C10231d.this.f31831b, EnumC10240k.NORAML);
                            TaskGuide.this.m5776a("领取失败 :" + exc.getClass().getName());
                        }
                        TaskGuide.this.m5772b(C10231d.this.f31831b);
                        TaskGuide.this.m5762d(2000);
                    }
                });
            }
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onComplete(JSONObject jSONObject) {
            int i;
            String str = null;
            try {
                i = jSONObject.getInt(XiaomiOAuthConstants.EXTRA_CODE_2);
                str = jSONObject.getString(RMsgInfoDB.TABLE);
            } catch (JSONException e) {
                TaskGuide.this.m5787a(this.f31831b, EnumC10240k.NORAML);
                TaskGuide.this.m5776a(str);
                e.printStackTrace();
            }
            if (i == 0) {
                TaskGuide.this.m5787a(this.f31831b, EnumC10240k.REWARD_SUCCESS);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("result", "金券领取成功");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                TaskGuide.this.f31812c.onComplete(jSONObject2);
                TaskGuide.this.m5772b(this.f31831b);
                TaskGuide.this.m5762d(2000);
            }
            TaskGuide.this.m5787a(this.f31831b, EnumC10240k.NORAML);
            TaskGuide.this.m5776a(str);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("result", "金券领取失败");
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            TaskGuide.this.f31812c.onComplete(jSONObject3);
            TaskGuide.this.m5772b(this.f31831b);
            TaskGuide.this.m5762d(2000);
            TaskGuide.this.m5787a(this.f31831b, EnumC10240k.NORAML);
            TaskGuide.this.m5776a(str);
            e.printStackTrace();
            TaskGuide.this.m5772b(this.f31831b);
            TaskGuide.this.m5762d(2000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tencent.open.TaskGuide$e */
    /* loaded from: classes2.dex */
    public class C10233e extends RelativeLayout {

        /* renamed from: a */
        int f31835a = 0;

        public C10233e(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            int y = (int) motionEvent.getY();
            C10257f.m5673b("XXXX", "onInterceptTouchEvent-- action = " + motionEvent.getAction() + "currentY = " + y);
            TaskGuide.this.m5762d(3000);
            switch (motionEvent.getAction()) {
                case 0:
                    this.f31835a = y;
                    return false;
                case 1:
                    if (this.f31835a - y > ViewConfiguration.getTouchSlop() * 2) {
                        TaskGuide.this.m5743l();
                        return true;
                    }
                    break;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            int y = (int) motionEvent.getY();
            C10257f.m5673b("XXXX", " onTouchEvent-----startY = " + this.f31835a + "currentY = " + y);
            switch (motionEvent.getAction()) {
                case 0:
                    this.f31835a = y;
                    return false;
                case 1:
                    if (this.f31835a - y <= ViewConfiguration.getTouchSlop() * 2) {
                        return false;
                    }
                    TaskGuide.this.m5743l();
                    return false;
                case 2:
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.open.TaskGuide$f */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC10234f implements View.OnClickListener {

        /* renamed from: a */
        int f31837a;

        public View$OnClickListenerC10234f(int i) {
            this.f31837a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Button button = (Button) view;
            if (TaskGuide.this.m5766c(this.f31837a) == EnumC10240k.NORAML) {
                TaskGuide.this.m5758e(this.f31837a);
                TaskGuide.this.m5772b(this.f31837a);
            }
            TaskGuide.this.m5751h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tencent.open.TaskGuide$g */
    /* loaded from: classes2.dex */
    public static class C10235g {

        /* renamed from: a */
        int f31839a;

        /* renamed from: b */
        String f31840b;

        /* renamed from: c */
        String f31841c;

        /* renamed from: d */
        long f31842d;

        /* renamed from: e */
        int f31843e;

        public C10235g(int i, String str, String str2, long j, int i2) {
            this.f31839a = i;
            this.f31840b = str;
            this.f31841c = str2;
            this.f31842d = j;
            this.f31843e = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tencent.open.TaskGuide$h */
    /* loaded from: classes2.dex */
    public static class C10236h {

        /* renamed from: a */
        String f31844a;

        /* renamed from: b */
        String f31845b;

        /* renamed from: c */
        C10235g[] f31846c;

        private C10236h() {
        }

        /* renamed from: a */
        static C10236h m5732a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C10236h c10236h = new C10236h();
            JSONObject jSONObject2 = jSONObject.getJSONObject("task_info");
            c10236h.f31844a = jSONObject2.getString("task_id");
            c10236h.f31845b = jSONObject2.getString("task_desc");
            JSONArray jSONArray = jSONObject2.getJSONArray("step_info");
            int length = jSONArray.length();
            if (length > 0) {
                c10236h.f31846c = new C10235g[length];
            }
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                c10236h.f31846c[i] = new C10235g(jSONObject3.getInt("step_no"), jSONObject3.getString("step_desc"), jSONObject3.getString("step_gift"), jSONObject3.getLong("end_time"), jSONObject3.getInt("status"));
            }
            return c10236h;
        }

        /* renamed from: a */
        public boolean m5733a() {
            return !TextUtils.isEmpty(this.f31844a) && this.f31846c != null && this.f31846c.length > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tencent.open.TaskGuide$i */
    /* loaded from: classes2.dex */
    public class C10237i extends LinearLayout {

        /* renamed from: b */
        private TextView f31848b;

        /* renamed from: c */
        private Button f31849c;

        /* renamed from: d */
        private C10235g f31850d;

        public C10237i(Context context, C10235g c10235g) {
            super(context);
            this.f31850d = c10235g;
            setOrientation(0);
            m5731a();
        }

        /* renamed from: a */
        private void m5731a() {
            this.f31848b = new TextView(TaskGuide.this.f31803F);
            this.f31848b.setTextColor(Color.rgb(255, 255, 255));
            this.f31848b.setTextSize(15.0f);
            this.f31848b.setShadowLayer(1.0f, 1.0f, 1.0f, Color.rgb(242, (int) AbstractC10866e.f34855v, 199));
            this.f31848b.setGravity(3);
            this.f31848b.setEllipsize(TextUtils.TruncateAt.END);
            this.f31848b.setIncludeFontPadding(false);
            this.f31848b.setSingleLine(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            layoutParams.leftMargin = TaskGuide.this.m5788a(4);
            addView(this.f31848b, layoutParams);
            this.f31849c = new Button(TaskGuide.this.f31803F);
            this.f31849c.setPadding(0, 0, 0, 0);
            this.f31849c.setTextSize(16.0f);
            this.f31849c.setTextColor(Color.rgb(255, 255, 255));
            this.f31849c.setShadowLayer(1.0f, 1.0f, 1.0f, Color.rgb(242, (int) AbstractC10866e.f34855v, 199));
            this.f31849c.setIncludeFontPadding(false);
            this.f31849c.setOnClickListener(new View$OnClickListenerC10234f(this.f31850d.f31839a));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(TaskGuide.this.m5788a(TaskGuide.f31787p), TaskGuide.this.m5788a(TaskGuide.f31788q));
            layoutParams2.leftMargin = TaskGuide.this.m5788a(2);
            layoutParams2.rightMargin = TaskGuide.this.m5788a(8);
            addView(this.f31849c, layoutParams2);
        }

        /* renamed from: a */
        public void m5730a(EnumC10240k enumC10240k) {
            if (!TextUtils.isEmpty(this.f31850d.f31840b)) {
                this.f31848b.setText(this.f31850d.f31840b);
            }
            switch (enumC10240k) {
                case INIT:
                    this.f31849c.setEnabled(false);
                    return;
                case NORAML:
                    if (this.f31850d.f31843e == 1) {
                        this.f31849c.setText(this.f31850d.f31841c);
                        this.f31849c.setBackgroundDrawable(null);
                        this.f31849c.setTextColor(Color.rgb(255, 246, 0));
                        this.f31849c.setEnabled(false);
                        return;
                    } else if (this.f31850d.f31843e != 2) {
                        return;
                    } else {
                        this.f31849c.setText("领取奖励");
                        this.f31849c.setTextColor(Color.rgb(255, 255, 255));
                        this.f31849c.setBackgroundDrawable(TaskGuide.this.m5755f());
                        this.f31849c.setEnabled(true);
                        return;
                    }
                case WAITTING_BACK_REWARD:
                    this.f31849c.setText("领取中...");
                    this.f31849c.setEnabled(false);
                    return;
                case REWARD_SUCCESS:
                    this.f31849c.setText("已领取");
                    this.f31849c.setBackgroundDrawable(TaskGuide.this.m5753g());
                    this.f31849c.setEnabled(false);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tencent.open.TaskGuide$j */
    /* loaded from: classes2.dex */
    public class C10238j extends AbstractC10228a {
        private C10238j() {
            super();
        }

        @Override // com.tencent.open.TaskGuide.AbstractC10228a
        /* renamed from: a */
        protected void mo5729a(Exception exc) {
            if (exc != null) {
                exc.printStackTrace();
            }
            if (exc == null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("result", "暂无任务");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                TaskGuide.this.f31812c.onComplete(jSONObject);
            } else {
                TaskGuide.this.f31812c.onError(new UiError(100, "error ", "获取任务失败"));
            }
            TaskGuide.this.f31816g.post(new Runnable() { // from class: com.tencent.open.TaskGuide.j.1
                @Override // java.lang.Runnable
                public void run() {
                    TaskGuide.this.m5787a(2, EnumC10240k.INIT);
                }
            });
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onComplete(JSONObject jSONObject) {
            try {
                TaskGuide.this.f31817h = C10236h.m5732a(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (TaskGuide.this.f31817h == null || !TaskGuide.this.f31817h.m5733a()) {
                mo5729a(null);
                return;
            }
            TaskGuide.this.showWindow();
            TaskGuide.this.m5787a(2, EnumC10240k.NORAML);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("result", "获取成功");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            TaskGuide.this.f31812c.onComplete(jSONObject2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tencent.open.TaskGuide$k */
    /* loaded from: classes2.dex */
    public enum EnumC10240k {
        INIT,
        WAITTING_BACK_TASKINFO,
        WAITTING_BACK_REWARD,
        NORAML,
        REWARD_SUCCESS,
        REWARD_FAIL
    }

    public TaskGuide(Context context, QQAuth qQAuth, QQToken qQToken) {
        super(qQAuth, qQToken);
        this.f31803F = context;
        this.f31815f = (WindowManager) context.getSystemService("window");
        m5767c();
    }

    public TaskGuide(Context context, QQToken qQToken) {
        super(qQToken);
        this.f31803F = context;
        this.f31815f = (WindowManager) context.getSystemService("window");
        m5767c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m5788a(int i) {
        return (int) (i * this.f31800C);
    }

    /* renamed from: a */
    private Drawable m5775a(String str, Context context) {
        Drawable drawable;
        IOException e;
        try {
            InputStream open = context.getApplicationContext().getAssets().open(str);
            if (open == null) {
                drawable = null;
            } else if (str.endsWith(".9.png")) {
                Bitmap decodeStream = BitmapFactory.decodeStream(open);
                if (decodeStream != null) {
                    byte[] ninePatchChunk = decodeStream.getNinePatchChunk();
                    NinePatch.isNinePatchChunk(ninePatchChunk);
                    drawable = new NinePatchDrawable(decodeStream, ninePatchChunk, new Rect(), null);
                } else {
                    drawable = null;
                }
            } else {
                drawable = Drawable.createFromStream(open, str);
                try {
                    open.close();
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    return drawable;
                }
            }
        } catch (IOException e3) {
            drawable = null;
            e = e3;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public WindowManager.LayoutParams m5786a(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 49;
        this.f31815f.getDefaultDisplay().getWidth();
        this.f31815f.getDefaultDisplay().getHeight();
        layoutParams.width = m5788a(f31786o);
        layoutParams.height = m5788a(f31785n);
        layoutParams.windowAnimations = 16973826;
        layoutParams.format = 1;
        layoutParams.flags |= 520;
        layoutParams.type = 2;
        this.f31813d = layoutParams;
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5787a(int i, EnumC10240k enumC10240k) {
        if (i == 0) {
            this.f31818i = enumC10240k;
        } else if (i == 1) {
            this.f31819j = enumC10240k;
        } else {
            this.f31818i = enumC10240k;
            this.f31819j = enumC10240k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5776a(final String str) {
        this.f31816g.post(new Runnable() { // from class: com.tencent.open.TaskGuide.3
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(TaskGuide.this.f31803F, "失败：" + str, 1).show();
            }
        });
    }

    /* renamed from: a */
    private void m5774a(boolean z) {
        this.f31806I = SystemClock.currentThreadTimeMillis();
        if (z) {
            this.f31804G = true;
        } else {
            this.f31805H = true;
        }
        this.f31807J = this.f31813d.height;
        this.f31808K = this.f31813d.y;
        this.f31813d.flags |= 16;
        this.f31815f.updateViewLayout(this.f31814e, this.f31813d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public ViewGroup m5771b(Context context) {
        C10233e c10233e = new C10233e(context);
        C10235g[] c10235gArr = this.f31817h.f31846c;
        if (c10235gArr.length == 1) {
            C10237i c10237i = new C10237i(context, c10235gArr[0]);
            c10237i.setId(1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(15);
            c10233e.addView(c10237i, layoutParams);
        } else {
            C10237i c10237i2 = new C10237i(context, c10235gArr[0]);
            c10237i2.setId(1);
            C10237i c10237i3 = new C10237i(context, c10235gArr[1]);
            c10237i3.setId(2);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(14);
            layoutParams2.setMargins(0, m5788a(6), 0, 0);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams3.addRule(14);
            layoutParams3.setMargins(0, m5788a(4), 0, 0);
            layoutParams3.addRule(3, 1);
            layoutParams3.addRule(5, 1);
            c10233e.addView(c10237i2, layoutParams2);
            c10233e.addView(c10237i3, layoutParams3);
        }
        c10233e.setBackgroundDrawable(m5759e());
        return c10233e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m5772b(final int i) {
        if (this.f31816g != null) {
            this.f31816g.post(new Runnable() { // from class: com.tencent.open.TaskGuide.1
                @Override // java.lang.Runnable
                public void run() {
                    if (TaskGuide.this.f31802E) {
                        if (i == 0) {
                            ((C10237i) TaskGuide.this.f31814e.findViewById(1)).m5730a(TaskGuide.this.f31818i);
                        } else if (i == 1) {
                            ((C10237i) TaskGuide.this.f31814e.findViewById(2)).m5730a(TaskGuide.this.f31819j);
                        } else if (i != 2) {
                        } else {
                            ((C10237i) TaskGuide.this.f31814e.findViewById(1)).m5730a(TaskGuide.this.f31818i);
                            if (TaskGuide.this.f31814e.getChildCount() <= 1) {
                                return;
                            }
                            ((C10237i) TaskGuide.this.f31814e.findViewById(2)).m5730a(TaskGuide.this.f31819j);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public EnumC10240k m5766c(int i) {
        return i == 0 ? this.f31818i : i == 1 ? this.f31819j : EnumC10240k.INIT;
    }

    /* renamed from: c */
    private void m5767c() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f31815f.getDefaultDisplay().getMetrics(displayMetrics);
        this.f31798A = displayMetrics.widthPixels;
        this.f31799B = displayMetrics.heightPixels;
        this.f31800C = displayMetrics.density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m5763d() {
        if (this.f31813d != null) {
            this.f31813d.y = -this.f31813d.height;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m5762d(int i) {
        m5751h();
        this.f31810N = new RunnableC10229b();
        this.f31816g.postDelayed(this.f31810N, i);
    }

    /* renamed from: e */
    private Drawable m5759e() {
        if (f31782k == null) {
            f31782k = m5775a("background.9.png", this.f31803F);
        }
        return f31782k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m5758e(int i) {
        Bundle composeCGIParams = composeCGIParams();
        composeCGIParams.putString(AuthActivity.ACTION_KEY, "get_gift");
        composeCGIParams.putString("task_id", this.f31817h.f31844a);
        composeCGIParams.putString("step_no", new Integer(i).toString());
        composeCGIParams.putString("appid", this.mToken.getAppId());
        HttpUtils.requestAsync(this.mToken, this.f31803F, "http://appact.qzone.qq.com/appstore_activity_task_pcpush_sdk", composeCGIParams, "GET", new C10231d(i));
        m5787a(i, EnumC10240k.WAITTING_BACK_REWARD);
        C10114a.m6184a(this.f31803F, this.mToken, "TaskApi", "getGift");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public Drawable m5755f() {
        if (f31783l == null) {
            f31783l = m5775a("button_green.9.png", this.f31803F);
        }
        return f31783l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public Drawable m5753g() {
        if (f31784m == null) {
            f31784m = m5775a("button_red.9.png", this.f31803F);
        }
        return f31784m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m5751h() {
        this.f31816g.removeCallbacks(this.f31810N);
        if (!m5747j()) {
            this.f31816g.removeCallbacks(this.f31809M);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m5749i() {
        if (this.f31804G) {
            m5762d(3000);
        } else {
            removeWindow();
        }
        if (this.f31804G) {
            this.f31813d.flags &= -17;
            this.f31815f.updateViewLayout(this.f31814e, this.f31813d);
        }
        this.f31804G = false;
        this.f31805H = false;
    }

    /* renamed from: j */
    private boolean m5747j() {
        return this.f31804G || this.f31805H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m5745k() {
        if (!m5747j()) {
            this.f31816g.removeCallbacks(this.f31810N);
            this.f31816g.removeCallbacks(this.f31809M);
            this.f31809M = new RunnableC10230c(true);
            m5774a(true);
            this.f31816g.post(this.f31809M);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m5743l() {
        if (!m5747j()) {
            this.f31816g.removeCallbacks(this.f31810N);
            this.f31816g.removeCallbacks(this.f31809M);
            this.f31809M = new RunnableC10230c(false);
            m5774a(false);
            this.f31816g.post(this.f31809M);
        }
    }

    public void removeWindow() {
        if (this.f31802E) {
            this.f31815f.removeView(this.f31814e);
            this.f31802E = false;
        }
    }

    public void showTaskGuideWindow(Activity activity, Bundle bundle, IUiListener iUiListener) {
        Bundle composeCGIParams;
        this.f31803F = activity;
        this.f31812c = iUiListener;
        if (this.f31818i == EnumC10240k.WAITTING_BACK_TASKINFO || this.f31819j == EnumC10240k.WAITTING_BACK_TASKINFO || this.f31802E) {
            return;
        }
        this.f31817h = null;
        if (bundle != null) {
            composeCGIParams = new Bundle(bundle);
            composeCGIParams.putAll(composeCGIParams());
        } else {
            composeCGIParams = composeCGIParams();
        }
        C10238j c10238j = new C10238j();
        composeCGIParams.putString(AuthActivity.ACTION_KEY, "task_list");
        composeCGIParams.putString("auth", "mobile");
        composeCGIParams.putString("appid", this.mToken.getAppId());
        HttpUtils.requestAsync(this.mToken, this.f31803F, "http://appact.qzone.qq.com/appstore_activity_task_pcpush_sdk", composeCGIParams, "GET", c10238j);
        m5787a(2, EnumC10240k.WAITTING_BACK_TASKINFO);
    }

    @SuppressLint({"ResourceAsColor"})
    public void showWindow() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.open.TaskGuide.2
            @Override // java.lang.Runnable
            public void run() {
                TaskGuide.this.f31814e = TaskGuide.this.m5771b(TaskGuide.this.f31803F);
                TaskGuide.this.f31813d = TaskGuide.this.m5786a(TaskGuide.this.f31803F);
                TaskGuide.this.m5763d();
                WindowManager windowManager = (WindowManager) TaskGuide.this.f31803F.getSystemService("window");
                if (((Activity) TaskGuide.this.f31803F).isFinishing()) {
                    return;
                }
                if (!TaskGuide.this.f31802E) {
                    windowManager.addView(TaskGuide.this.f31814e, TaskGuide.this.f31813d);
                }
                TaskGuide.this.f31802E = true;
                TaskGuide.this.m5772b(2);
                TaskGuide.this.m5745k();
            }
        });
        C10114a.m6184a(this.f31803F, this.mToken, "TaskApi", "showTaskWindow");
    }
}
