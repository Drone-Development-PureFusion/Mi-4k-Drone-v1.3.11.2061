package com.fimi.soul.module.flyplannermedia;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.fimi.kernel.p158b.p161c.AbstractC1625d;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p173b.AbstractC1791e;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
/* loaded from: classes.dex */
public class DroneMediaTestActivity extends BaseActivity implements AbstractC1792f<X11RespCmd> {

    /* renamed from: a */
    C1827d f9648a;

    /* renamed from: b */
    long f9649b = 0;

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        Log.d("Good", x11RespCmd.getErrorMsg());
        switch (x11RespCmd.getMsg_id()) {
            case 257:
                this.f9648a.m33988v().m34019d();
                return;
            case C1831e.f4793T /* 1283 */:
                getViewManager().mo34435a("切换目录成功！");
                this.f9648a.m33988v().m34015f();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Button button = new Button(this);
        button.setText("获取IDR");
        button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.flyplannermedia.DroneMediaTestActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Log.d("Good", "开始获取IDR");
                DroneMediaTestActivity.this.f9649b = System.currentTimeMillis();
                if (DroneMediaTestActivity.this.f9648a.l().getCurDirFileList() != null) {
                }
            }
        });
        setContentView(button);
        this.f9648a = (C1827d) C1783b.m34166a().m34150d();
        this.f9648a.a(new AbstractC1791e() { // from class: com.fimi.soul.module.flyplannermedia.DroneMediaTestActivity.2
            @Override // com.fimi.soul.biz.camera.p173b.AbstractC1791e
            /* renamed from: a */
            public void mo30333a(String str, String str2) {
                String str3 = "花费:" + (System.currentTimeMillis() - DroneMediaTestActivity.this.f9649b) + "毫秒";
                Log.d("Good", str3);
                DroneMediaTestActivity.this.getViewManager().mo34435a(str3);
            }
        });
        if (!this.f9648a.e()) {
            this.f9648a.m33987w().m33996b();
        }
        this.f9648a.a(this);
        this.f9648a.c(new AbstractC1625d() { // from class: com.fimi.soul.module.flyplannermedia.DroneMediaTestActivity.3
            @Override // com.fimi.kernel.p158b.p161c.AbstractC1625d
            /* renamed from: a */
            public void mo28036a(String str) {
                Log.d("Good", str + "");
            }
        });
    }
}
