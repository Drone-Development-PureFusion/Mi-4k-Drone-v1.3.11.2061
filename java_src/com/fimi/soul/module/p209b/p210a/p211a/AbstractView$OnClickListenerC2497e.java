package com.fimi.soul.module.p209b.p210a.p211a;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import com.fimi.soul.module.p209b.AbstractC2513e;
import com.fimi.soul.module.p209b.C2511c;
import com.fimi.soul.module.p209b.p210a.p211a.C2490c;
import com.mob.tools.gui.PullToRequestView;
import com.mob.tools.utils.C10109R;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: com.fimi.soul.module.b.a.a.e */
/* loaded from: classes.dex */
public abstract class AbstractView$OnClickListenerC2497e extends C2511c implements View.OnClickListener, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private static final int f8112a = 40;

    /* renamed from: b */
    private Platform f8113b;

    /* renamed from: c */
    private LinearLayout f8114c;

    /* renamed from: d */
    private RelativeLayout f8115d;

    /* renamed from: e */
    private TextView f8116e;

    /* renamed from: f */
    private TextView f8117f;

    /* renamed from: g */
    private C2490c f8118g;

    /* renamed from: h */
    private int f8119h = -1;

    /* renamed from: i */
    private int f8120i = 0;

    public AbstractView$OnClickListenerC2497e(AbstractC2513e abstractC2513e) {
        super(abstractC2513e);
    }

    /* renamed from: a */
    private void m31505a(RelativeLayout relativeLayout, float f) {
        this.f8116e = new TextView(this.activity);
        this.f8116e.setTextColor(-12895429);
        this.f8116e.setTextSize(2, 18.0f);
        this.f8116e.setGravity(17);
        int stringRes = C10109R.getStringRes(this.activity, "ssdk_oks_cancel");
        if (stringRes > 0) {
            this.f8116e.setText(stringRes);
        }
        int i = (int) (40.0f * f);
        this.f8116e.setPadding(i, 0, i, 0);
        relativeLayout.addView(this.f8116e, new RelativeLayout.LayoutParams(-2, -1));
        this.f8116e.setOnClickListener(this);
        TextView textView = new TextView(this.activity);
        textView.setTextColor(-12895429);
        textView.setTextSize(2, 22.0f);
        textView.setGravity(17);
        int stringRes2 = C10109R.getStringRes(this.activity, "ssdk_oks_contacts");
        if (stringRes2 > 0) {
            textView.setText(stringRes2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.addRule(13);
        relativeLayout.addView(textView, layoutParams);
        this.f8117f = new TextView(this.activity);
        this.f8117f.setTextColor(-37615);
        this.f8117f.setTextSize(2, 18.0f);
        this.f8117f.setGravity(17);
        int stringRes3 = C10109R.getStringRes(this.activity, "ssdk_oks_confirm");
        if (stringRes3 > 0) {
            this.f8117f.setText(stringRes3);
        }
        this.f8117f.setPadding(i, 0, i, 0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams2.addRule(11);
        relativeLayout.addView(this.f8117f, layoutParams2);
        this.f8117f.setOnClickListener(this);
    }

    /* renamed from: k */
    private void m31501k() {
        int stringRes = C10109R.getStringRes(this.activity, "ssdk_oks_confirm");
        String str = "Confirm";
        if (stringRes > 0) {
            str = getContext().getResources().getString(stringRes);
        }
        if (this.f8120i == 0) {
            this.f8117f.setText(str);
        } else if (this.f8120i <= 0) {
        } else {
            this.f8117f.setText(str + "(" + this.f8120i + ")");
        }
    }

    /* renamed from: d */
    public void m31504d(Platform platform) {
        this.f8113b = platform;
    }

    /* renamed from: i */
    protected abstract float mo31503i();

    /* renamed from: j */
    protected abstract int mo31502j();

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.equals(this.f8116e)) {
            finish();
            return;
        }
        ArrayList arrayList = new ArrayList();
        int count = this.f8118g.getCount();
        for (int i = 0; i < count; i++) {
            if (this.f8118g.getItem(i).f8097a) {
                arrayList.add(this.f8118g.getItem(i).f8102f);
            }
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("selected", arrayList);
        hashMap.put(Constants.PARAM_PLATFORM, this.f8113b);
        setResult(hashMap);
        finish();
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        this.activity.getWindow().setBackgroundDrawable(new ColorDrawable(-789517));
        this.f8114c = new LinearLayout(this.activity);
        this.f8114c.setOrientation(1);
        this.activity.setContentView(this.f8114c);
        this.f8115d = new RelativeLayout(this.activity);
        float mo31503i = mo31503i();
        this.f8114c.addView(this.f8115d, new LinearLayout.LayoutParams(-1, (int) (mo31502j() * mo31503i)));
        m31505a(this.f8115d, mo31503i);
        View view = new View(this.activity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) (mo31503i < 1.0f ? 1.0f : mo31503i));
        view.setBackgroundColor(-2434599);
        this.f8114c.addView(view, layoutParams);
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams2);
        this.f8114c.addView(frameLayout);
        PullToRequestView pullToRequestView = new PullToRequestView(getContext());
        pullToRequestView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(pullToRequestView);
        this.f8118g = new C2490c(this, pullToRequestView);
        this.f8118g.m31511a(this.f8113b);
        this.f8118g.m31514a(mo31503i);
        this.f8118g.m31512a(this);
        pullToRequestView.setAdapter(this.f8118g);
        pullToRequestView.performPullingDown(true);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean z = false;
        if ("FacebookMessenger".equals(this.f8113b.getName())) {
            if (this.f8119h >= 0) {
                this.f8118g.getItem(this.f8119h).f8097a = false;
            }
            this.f8119h = i;
        }
        C2490c.C2495b item = this.f8118g.getItem(i);
        if (!item.f8097a) {
            z = true;
        }
        item.f8097a = z;
        if (item.f8097a) {
            this.f8120i++;
        } else {
            this.f8120i--;
        }
        m31501k();
        this.f8118g.notifyDataSetChanged();
    }
}
