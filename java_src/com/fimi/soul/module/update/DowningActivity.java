package com.fimi.soul.module.update;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.C1514f;
import com.fimi.p140a.p142b.EnumC1495b;
import com.fimi.p152e.C1549d;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.p181i.C1867a;
import com.fimi.soul.biz.update.AbstractC2056c;
import com.fimi.soul.biz.update.AbstractC2077i;
import com.fimi.soul.biz.update.C2080l;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3129m;
import com.fimi.x1bh.module.main.CloudTerraceMainActivity;
import com.fimi.x1bh.module.update.X1bhFindNewFirmwareAvtivity;
import java.io.File;
import java.util.List;
/* loaded from: classes.dex */
public class DowningActivity extends BaseActivity {

    /* renamed from: g */
    private static final int f11033g = 100;

    /* renamed from: h */
    private static final int f11034h = 0;

    /* renamed from: m */
    private static final int f11035m = 1;

    /* renamed from: b */
    List<UpdateVersonBean> f11037b;

    /* renamed from: c */
    private ImageView f11038c;

    /* renamed from: d */
    private ProgressView f11039d;

    /* renamed from: e */
    private TextView f11040e;

    /* renamed from: k */
    private long f11044k;

    /* renamed from: l */
    private boolean f11045l;

    /* renamed from: n */
    private C2083a f11046n;

    /* renamed from: o */
    private TextView f11047o;

    /* renamed from: p */
    private TextView f11048p;

    /* renamed from: q */
    private boolean f11049q;

    /* renamed from: r */
    private Toast f11050r;

    /* renamed from: f */
    private int f11041f = 0;

    /* renamed from: a */
    C3020a f11036a = null;

    /* renamed from: i */
    private long f11042i = 0;

    /* renamed from: j */
    private int f11043j = 1;

    /* renamed from: a */
    private void m29720a(UpdateVersonBean updateVersonBean) {
        this.f11036a.m29618b(updateVersonBean, this.f11036a.m29617e(updateVersonBean), new AbstractC2077i() { // from class: com.fimi.soul.module.update.DowningActivity.1
            @Override // com.fimi.soul.biz.update.AbstractC2077i
            /* renamed from: a */
            public void mo28035a(boolean z, long j, long j2, int i) {
                if (!z) {
                    Message message = new Message();
                    message.what = 100;
                    message.arg1 = (int) j;
                    message.arg2 = (int) j2;
                    DowningActivity.this.getHandler().sendMessageDelayed(message, 300L);
                } else if (j == -2) {
                    DowningActivity.this.m29714c();
                } else if (DowningActivity.this.f11043j < DowningActivity.this.f11041f) {
                    DowningActivity.this.getHandler().sendEmptyMessageDelayed(0, 300L);
                } else if (C1514f.m35431a().m35429b() == EnumC1495b.DRONE) {
                    if (DowningActivity.this.f11046n.mo32905ac()) {
                        DowningActivity.this.m29718a(FindNewFirmwareAvtivity.class);
                        return;
                    }
                    C1688z.m34450a(DowningActivity.this, (int) C1704R.C1707string.finish_down);
                    DowningActivity.this.m29718a(FlightActivity.class);
                } else if (C1514f.m35431a().m35429b() != EnumC1495b.X1BH) {
                } else {
                    if (C1549d.m35208b().m35205d()) {
                        DowningActivity.this.m29718a(X1bhFindNewFirmwareAvtivity.class);
                        return;
                    }
                    C1688z.m34450a(DowningActivity.this, (int) C1704R.C1707string.cloud_finish_down);
                    DowningActivity.this.m29718a(CloudTerraceMainActivity.class);
                }
            }
        });
    }

    /* renamed from: a */
    private void m29717a(List<UpdateVersonBean> list) {
        File file = new File(C3129m.m29045v());
        if (!file.exists()) {
            file.mkdir();
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f11041f = list.size();
        this.f11036a = new C3020a();
        this.f11042i = C2080l.m33058a(list);
        this.f11039d.setMaxCount((float) this.f11042i);
        m29720a(list.get(0));
    }

    /* renamed from: d */
    private void m29712d() {
        if (this.f11045l) {
            AbstractC2056c.f5764b = true;
            this.f11050r.cancel();
            m29718a(FindOnlineFirmwareAvtivity.class);
            finish();
            return;
        }
        this.f11045l = true;
        this.f11050r = Toast.makeText(getApplicationContext(), (int) C1704R.C1707string.cancel_downing, 0);
        this.f11050r.show();
        getHandler().sendEmptyMessageDelayed(1, 2000L);
    }

    /* renamed from: a */
    public void m29721a() {
        this.f11047o = (TextView) findViewById(C1704R.C1706id.upgrade_result);
        this.f11048p = (TextView) findViewById(C1704R.C1706id.upgrading_warning);
        C3103au.m29232a(getAssets(), this.f11047o);
        C3103au.m29232a(getAssets(), this.f11048p);
    }

    /* renamed from: a */
    public void m29718a(Class cls) {
        startActivity(new Intent(this, cls));
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    /* renamed from: b */
    public void m29716b() {
        StringBuilder sb = new StringBuilder();
        sb.append(getString(C1704R.C1707string.down_ing2));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f11037b.size()) {
                this.f11048p.setText(sb.toString());
                return;
            }
            sb.append(this.f11037b.get(i2).getSysname());
            if (i2 != this.f11037b.size() - 1) {
                sb.append(getString(C1704R.C1707string.upgrade_symbol));
            }
            i = i2 + 1;
        }
    }

    /* renamed from: c */
    public void m29714c() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.f11043j - 1;
        while (true) {
            int i2 = i;
            if (i2 >= this.f11037b.size()) {
                Intent intent = new Intent(this, DownFailedActivity.class);
                intent.putExtra("DownLoadFailedInfo", stringBuffer.toString().substring(0, stringBuffer.length() - 1));
                startActivity(intent);
                finish();
                overridePendingTransition(17432576, 17432577);
                return;
            }
            stringBuffer.append(this.f11037b.get(i2).getSysname());
            if (i2 != this.f11037b.size() - 1) {
                stringBuffer.append(getString(C1704R.C1707string.upgrade_symbol));
            } else {
                stringBuffer.append(getString(C1704R.C1707string.downfail1));
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dpa.m34276b(this);
        setContentView(C1704R.layout.activity_downing);
        getWindow().setFlags(128, 128);
        this.f11049q = getIntent().getBooleanExtra("isForce", false);
        this.f11038c = (ImageView) findViewById(C1704R.C1706id.down_img_anim);
        this.f11039d = (ProgressView) findViewById(C1704R.C1706id.down_progress_view);
        this.f11040e = (TextView) findViewById(C1704R.C1706id.tv_down_progress);
        AbstractC2056c.f5764b = false;
        AbstractC2056c.f5765c = false;
        this.f11037b = C1642c.m34887c().mo34874b(UpdateVersonBean.SP_NEED_DOWN_FIRMWWARES, UpdateVersonBean.class);
        m29717a(this.f11037b);
        this.f11046n = this.dpa.f4493a;
        m29721a();
        m29716b();
        C1867a.m33847a().m33841a(getLocalClassName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AbstractC2056c.f5765c = true;
    }

    @Override // com.fimi.kernel.BaseActivity
    public void onHandleMessage(Message message) {
        super.onHandleMessage(message);
        if (message.what == 100) {
            long j = this.f11044k + message.arg1;
            this.f11040e.setText(((100 * j) / this.f11042i) + "");
            this.f11039d.setCurrentCount((float) j);
        }
        if (message.what == 0) {
            this.f11044k = Long.valueOf(this.f11037b.get(this.f11043j - 1).getSize()).longValue() + this.f11044k;
            this.f11043j++;
            m29720a(this.f11037b.get(this.f11043j));
        }
        if (message.what == 1) {
            this.f11045l = false;
        }
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (!this.f11049q) {
                m29712d();
            }
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        C1867a.m33847a().m33840a(getLocalClassName(), 1, this.f11046n);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f11038c.setBackgroundResource(C1704R.C1705drawable.update_anim);
        ((AnimationDrawable) this.f11038c.getBackground()).start();
    }
}
