package com.fimi.soul.module.setting;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.entity.FlightTimeInfo;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.FlyLogTools;
import java.io.File;
/* loaded from: classes.dex */
public class FlyRecordActivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: a */
    TextView f10169a;

    /* renamed from: b */
    TextView f10170b;

    /* renamed from: c */
    TextView f10171c;

    /* renamed from: d */
    TextView f10172d;

    /* renamed from: e */
    TextView f10173e;

    /* renamed from: f */
    TextView f10174f;

    /* renamed from: g */
    TextView f10175g;

    /* renamed from: h */
    ImageView f10176h;

    /* renamed from: i */
    DroidPlannerApp f10177i;

    /* renamed from: j */
    C2083a f10178j;

    /* renamed from: k */
    ImageView f10179k;

    /* renamed from: l */
    FlyLogTools f10180l;

    /* renamed from: m */
    private boolean f10181m = false;

    /* renamed from: n */
    private final int f10182n = 16;

    /* renamed from: o */
    private Handler f10183o = new Handler() { // from class: com.fimi.soul.module.setting.FlyRecordActivity.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Bundle data = message.getData();
            long j = data.getLong("fly_distance");
            long j2 = data.getLong("flyTime");
            int i = data.getInt("fly_count");
            switch (message.what) {
                case 16:
                    FlyRecordActivity.this.m30143a(i, j2, j);
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: com.fimi.soul.module.setting.FlyRecordActivity$a */
    /* loaded from: classes.dex */
    private class C2870a implements AbstractC1945k {
        private C2870a() {
        }

        @Override // com.fimi.soul.biz.p185m.AbstractC1945k
        /* renamed from: a */
        public void mo28106a(PlaneMsg planeMsg, File file) {
            if (!planeMsg.isSuccess()) {
                C1688z.m34448a(FlyRecordActivity.this, FlyRecordActivity.this.getString(C1704R.C1707string.ask_exception));
                return;
            }
            C1642c.m34887c();
            FlightTimeInfo flightTimeInfo = (FlightTimeInfo) planeMsg.getData();
            Message message = new Message();
            Bundle bundle = new Bundle();
            long totalFlyTime = flightTimeInfo.getTotalFlyTime();
            int flyCount = flightTimeInfo.getFlyCount();
            long totalDistance = flightTimeInfo.getTotalDistance();
            bundle.putLong("flyTime", totalFlyTime);
            bundle.putInt("fly_count", flyCount);
            bundle.putLong("fly_distance", totalDistance);
            message.what = 16;
            message.setData(bundle);
            FlyRecordActivity.this.f10183o.sendMessage(message);
        }
    }

    /* renamed from: a */
    void m30143a(int i, long j, long j2) {
        this.f10171c.setText(String.format("%d", Integer.valueOf(i)));
        if (j > 0) {
            j /= 60;
        }
        this.f10170b.setText(String.format("%d", Long.valueOf(j)));
        double d = j2 / 1000.0d;
        if (this.f10181m) {
            this.f10169a.setText(String.format("%s", C1679t.m34552b(C1679t.m34557a(d), 2)));
        } else {
            this.f10169a.setText(String.format("%s", C1679t.m34552b(d, 2)));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.back_btn /* 2131755442 */:
                finish();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.fly_record_layout);
        this.f10172d = (TextView) findViewById(C1704R.C1706id.fly_log_title);
        this.f10169a = (TextView) findViewById(C1704R.C1706id.fly_Killometers);
        this.f10170b = (TextView) findViewById(C1704R.C1706id.fly_long);
        this.f10171c = (TextView) findViewById(C1704R.C1706id.fly_times);
        this.f10173e = (TextView) findViewById(C1704R.C1706id.killo_v);
        this.f10174f = (TextView) findViewById(C1704R.C1706id.fly_min_v);
        this.f10175g = (TextView) findViewById(C1704R.C1706id.fly_count_v);
        this.f10179k = (ImageView) findViewById(C1704R.C1706id.back_btn);
        this.f10179k.setOnClickListener(this);
        this.f10176h = (ImageView) findViewById(C1704R.C1706id.icon_killo);
        this.f10181m = C1642c.m34885e().m34501p();
        if (this.f10181m) {
            this.f10173e.setText(getString(C1704R.C1707string.fly_miles));
            this.f10176h.setImageResource(C1704R.C1705drawable.fly_kilometre_ft);
        } else {
            this.f10173e.setText(getString(C1704R.C1707string.fly_kilometer));
            this.f10176h.setImageResource(C1704R.C1705drawable.icon_fly_kilometre);
        }
        C3103au.m29218b(getAssets(), this.f10169a, this.f10170b, this.f10171c);
        C3103au.m29232a(getAssets(), this.f10173e, this.f10174f, this.f10175g, this.f10172d);
        getWindow().addFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f10177i = (DroidPlannerApp) getApplication();
        this.f10178j = this.f10177i.f4493a;
        this.f10180l.m29419a(new FlyLogTools.AbstractC3062a() { // from class: com.fimi.soul.module.setting.FlyRecordActivity.1
            @Override // com.fimi.soul.utils.FlyLogTools.AbstractC3062a
            /* renamed from: a */
            public void mo29418a() {
                FlyRecordActivity.this.f10180l.m29421a(new C2870a());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f10180l = FlyLogTools.m29422a(this);
    }
}
