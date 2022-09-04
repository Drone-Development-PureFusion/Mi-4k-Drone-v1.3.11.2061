package com.fimi.soul.module.setting;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p158b.AbstractC1632e;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.p170b.C1760b;
import com.fimi.soul.entity.APConfig;
import com.fimi.soul.module.setting.AbstractC2900a;
/* renamed from: com.fimi.soul.module.setting.c */
/* loaded from: classes.dex */
public class C2904c extends AbstractC2900a {

    /* renamed from: a */
    private EditText f10378a;

    /* renamed from: b */
    private EditText f10379b;

    /* renamed from: c */
    private Button f10380c;

    /* renamed from: d */
    private TextView f10381d;

    /* renamed from: e */
    private TextView f10382e;

    /* renamed from: f */
    private TextView f10383f;

    /* renamed from: g */
    private C1760b f10384g = new C1760b();

    /* renamed from: h */
    private APConfig f10385h;

    /* renamed from: i */
    private String f10386i;

    public C2904c(Context context) {
        super(context);
    }

    /* renamed from: g */
    private void m30014g() {
        this.f10382e = c(f().getString(C1704R.C1707string.version_info), "");
        this.f10381d = c(f().getString(C1704R.C1707string.ip_addr), "");
        this.f10383f = c(f().getString(C1704R.C1707string.country_code), "");
        this.f10378a = b(f().getString(C1704R.C1707string.SSID), "");
        this.f10379b = b(f().getString(C1704R.C1707string.relay_password), "");
        this.f10380c = a("出厂设置", "恢复", new View.OnClickListener() { // from class: com.fimi.soul.module.setting.c.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1642c.m34889b().mo34440a();
                C2904c.this.f10384g.m34235e(new AbstractC1632e<Boolean>() { // from class: com.fimi.soul.module.setting.c.1.1
                    @Override // com.fimi.kernel.p158b.AbstractC1632e
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo30004a(Boolean bool) {
                        C1642c.m34889b().mo34429c();
                        if (bool.booleanValue()) {
                            C1642c.m34889b().mo34435a("操作成功，中继重启");
                        } else {
                            C1642c.m34889b().mo34435a("操作失败");
                        }
                    }

                    @Override // com.fimi.kernel.p158b.AbstractC1632e
                    /* renamed from: b  reason: avoid collision after fix types in other method */
                    public void mo30002b(Boolean bool) {
                        C1642c.m34889b().mo34429c();
                        C1642c.m34889b().mo34435a("操作失败");
                    }
                });
            }
        });
        AbstractC2900a.C2901a a = a(f().getString(C1704R.C1707string.save), f().getString(C1704R.C1707string.reboot));
        a.m30029a().setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.setting.c.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C2904c.this.m30012h();
            }
        });
        a.m30027b().setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.setting.c.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1642c.m34889b().mo34440a();
                C2904c.this.f10384g.m34236d(new AbstractC1632e<Boolean>() { // from class: com.fimi.soul.module.setting.c.3.1
                    @Override // com.fimi.kernel.p158b.AbstractC1632e
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo30004a(Boolean bool) {
                        C1642c.m34889b().mo34429c();
                        C1642c.m34889b().mo34435a("开始重启");
                    }

                    @Override // com.fimi.kernel.p158b.AbstractC1632e
                    /* renamed from: b  reason: avoid collision after fix types in other method */
                    public void mo30002b(Boolean bool) {
                        C1642c.m34889b().mo34429c();
                        C1642c.m34889b().mo34435a("重置失败，请检查是否连接遥控器");
                    }
                });
            }
        });
        this.f10384g.m34245b(new AbstractC1632e<APConfig>() { // from class: com.fimi.soul.module.setting.c.4
            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo30004a(APConfig aPConfig) {
                if (aPConfig != null) {
                    C2904c.this.f10385h = aPConfig;
                    C2904c.this.f10378a.setText(aPConfig.getSsid());
                    C2904c.this.f10379b.setText(aPConfig.getApPwd());
                    C2904c.this.f10381d.setText(aPConfig.getIpAddr());
                    C2904c.this.f10382e.setText(aPConfig.getVersion());
                    C2904c.this.f10383f.setText(aPConfig.getCountryCode());
                }
            }

            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public void mo30002b(APConfig aPConfig) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m30012h() {
        if (this.f10385h != null) {
            this.f10385h.setIpAddr(this.f10381d.getText().toString());
            this.f10385h.setApPwd(this.f10379b.getText().toString());
            this.f10385h.setSsid(this.f10378a.getText().toString());
            C1642c.m34889b().mo34440a();
            this.f10384g.m34251a(this.f10385h, new AbstractC1632e<Boolean>() { // from class: com.fimi.soul.module.setting.c.5
                @Override // com.fimi.kernel.p158b.AbstractC1632e
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo30004a(Boolean bool) {
                    C1642c.m34889b().mo34429c();
                    C1642c.m34889b().mo34435a("设置成功");
                }

                @Override // com.fimi.kernel.p158b.AbstractC1632e
                /* renamed from: b  reason: avoid collision after fix types in other method */
                public void mo30002b(Boolean bool) {
                    C1642c.m34889b().mo34429c();
                    C1642c.m34889b().mo34435a("设置失败，请检查中继网络");
                }
            });
        }
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
    }

    @Override // com.fimi.soul.module.setting.AbstractC2900a
    /* renamed from: c */
    public View mo30019c() {
        m30014g();
        return b();
    }
}
