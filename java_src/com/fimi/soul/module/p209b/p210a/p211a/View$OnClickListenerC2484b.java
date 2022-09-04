package com.fimi.soul.module.p209b.p210a.p211a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ShareSDK;
import com.fimi.soul.module.p209b.AbstractC2513e;
import com.fimi.soul.module.p209b.C2511c;
import com.fimi.soul.module.p209b.p210a.p211a.p212a.C2481b;
import com.fimi.soul.module.p209b.p210a.p211a.p213b.C2487b;
import com.mob.tools.gui.AsyncImageView;
import com.mob.tools.utils.C10109R;
import com.mob.tools.utils.DeviceHelper;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.p286a.p287a.p299f.p302c.C11125l;
/* renamed from: com.fimi.soul.module.b.a.a.b */
/* loaded from: classes.dex */
public class View$OnClickListenerC2484b extends C2511c implements TextWatcher, View.OnClickListener, Runnable {

    /* renamed from: a */
    protected Platform f8050a;

    /* renamed from: b */
    protected Platform.ShareParams f8051b;

    /* renamed from: c */
    protected LinearLayout f8052c;

    /* renamed from: d */
    protected RelativeLayout f8053d;

    /* renamed from: e */
    protected ScrollView f8054e;

    /* renamed from: f */
    protected EditText f8055f;

    /* renamed from: g */
    protected TextView f8056g;

    /* renamed from: h */
    protected TextView f8057h;

    /* renamed from: i */
    protected RelativeLayout f8058i;

    /* renamed from: j */
    protected AsyncImageView f8059j;

    /* renamed from: k */
    protected C2509l f8060k;

    /* renamed from: l */
    protected LinearLayout f8061l;

    /* renamed from: m */
    protected TextView f8062m;

    /* renamed from: n */
    protected TextView f8063n;

    /* renamed from: o */
    protected Bitmap f8064o;

    /* renamed from: p */
    protected int f8065p;

    /* renamed from: q */
    private AbstractC2513e f8066q;

    public View$OnClickListenerC2484b(AbstractC2513e abstractC2513e) {
        super(abstractC2513e);
        this.f8066q = abstractC2513e;
    }

    /* renamed from: a */
    private String m31527a(HashMap<String, Object> hashMap) {
        if (hashMap == null || !hashMap.containsKey("selected")) {
            return null;
        }
        ArrayList arrayList = (ArrayList) hashMap.get("selected");
        if ("FacebookMessenger".equals(((Platform) hashMap.get(Constants.PARAM_PLATFORM)).getName())) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sb.append('@').append((String) it2.next()).append(C11125l.f35805c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m31530a(Bitmap bitmap) {
        ViewTreeObserver$OnGlobalLayoutListenerC2500h viewTreeObserver$OnGlobalLayoutListenerC2500h = new ViewTreeObserver$OnGlobalLayoutListenerC2500h(this.f8066q);
        viewTreeObserver$OnGlobalLayoutListenerC2500h.m31496a(bitmap);
        viewTreeObserver$OnGlobalLayoutListenerC2500h.show(this.activity, null);
    }

    /* renamed from: i */
    private void m31525i() {
        ShareSDK.logDemoEvent(5, this.f8050a);
        finish();
    }

    /* renamed from: j */
    private void m31524j() {
        int stringRes = C10109R.getStringRes(this.activity, "ssdk_oks_sharing");
        if (stringRes > 0) {
            Toast.makeText(this.activity, stringRes, 0).show();
        }
        if (h()) {
            this.f8050a.SSOSetting(true);
        }
        this.f8050a.setPlatformActionListener(f());
        this.f8050a.share(this.f8051b);
        finish();
    }

    /* renamed from: k */
    private void m31523k() {
        this.f8051b.setImageArray(null);
        this.f8051b.setImageData(null);
        this.f8051b.setImagePath(null);
        this.f8051b.setImageUrl(null);
    }

    /* renamed from: l */
    private void m31522l() {
        AbstractView$OnClickListenerC2497e c2487b = this.activity.getResources().getConfiguration().orientation == 1 ? new C2487b(this.f8066q) : new C2481b(this.f8066q);
        c2487b.m31504d(this.f8050a);
        c2487b.showForResult(this.f8050a.getContext(), null, this);
    }

    /* renamed from: a */
    public void m31529a(Platform.ShareParams shareParams) {
        this.f8051b = shareParams;
    }

    /* renamed from: a */
    protected boolean m31528a(String str) {
        return "SinaWeibo".equals(str) || "TencentWeibo".equals(str) || "Facebook".equals(str) || "Twitter".equals(str);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: d */
    public void m31526d(Platform platform) {
        this.f8050a = platform;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.equals(this.f8056g)) {
            m31525i();
        } else if (view.equals(this.f8057h)) {
            this.f8051b.setText(this.f8055f.getText().toString().trim());
            m31524j();
        } else if (view.equals(this.f8059j)) {
            m31530a(this.f8064o);
        } else if (!view.equals(this.f8060k)) {
            if (!view.equals(this.f8062m)) {
                return;
            }
            m31522l();
        } else {
            this.f8065p = 0;
            this.f8058i.setVisibility(8);
            this.f8052c.measure(0, 0);
            onTextChanged(this.f8055f.getText(), 0, 0, 0);
            m31523k();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        this.activity.getWindow().setBackgroundDrawable(new ColorDrawable(-789517));
    }

    @Override // com.mob.tools.FakeActivity
    public void onPause() {
        DeviceHelper.getInstance(this.activity).hideSoftInput(getContentView());
        super.onPause();
    }

    @Override // com.mob.tools.FakeActivity
    public void onResult(HashMap<String, Object> hashMap) {
        String m31527a = m31527a(hashMap);
        if (!TextUtils.isEmpty(m31527a)) {
            this.f8055f.append(m31527a);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f8063n.setText(String.valueOf(charSequence.length()));
        if (this.f8065p == 0) {
            this.f8065p = (this.f8052c.getHeight() - this.f8053d.getHeight()) - this.f8061l.getHeight();
        }
        if (this.f8065p > 0) {
            this.f8054e.post(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int height = this.f8054e.getChildAt(0).getHeight();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) C10109R.forceCast(this.f8054e.getLayoutParams());
        if (height > this.f8065p && layoutParams.height != this.f8065p) {
            layoutParams.height = this.f8065p;
            this.f8054e.setLayoutParams(layoutParams);
        } else if (height >= this.f8065p || layoutParams.height != this.f8065p) {
        } else {
            layoutParams.height = -2;
            this.f8054e.setLayoutParams(layoutParams);
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void setActivity(Activity activity) {
        super.setActivity(activity);
        if (a()) {
            System.err.println("Theme classic does not support dialog mode!");
        }
        activity.getWindow().setSoftInputMode(37);
    }
}
