package com.fimi.soul.biz.update;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.manager.C2011w;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.AppVersion;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.service.UpdateApkService;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.view.DialogC3245f;
import com.google.android.gms.drive.AbstractC4808e;
import com.xiaomi.market.sdk.UpdateResponse;
import com.xiaomi.market.sdk.XiaomiUpdateAgent;
import com.xiaomi.market.sdk.XiaomiUpdateListener;
import java.io.File;
/* renamed from: com.fimi.soul.biz.update.b */
/* loaded from: classes.dex */
public class C2046b {

    /* renamed from: a */
    private Context f5747a;

    /* renamed from: b */
    private AbstractC2054a f5748b;

    /* renamed from: c */
    private AbstractC2055b f5749c;

    /* renamed from: d */
    private C2011w f5750d;

    /* renamed from: e */
    private DialogC3245f.C3246a f5751e;

    /* renamed from: com.fimi.soul.biz.update.b$a */
    /* loaded from: classes.dex */
    public interface AbstractC2054a {
        /* renamed from: a */
        void mo30102a(String str);
    }

    /* renamed from: com.fimi.soul.biz.update.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC2055b {
        /* renamed from: a */
        void m33127a(UpdateResponse updateResponse);
    }

    public C2046b(Context context) {
        this.f5750d = C2011w.m33268a(context);
        this.f5747a = context;
    }

    /* renamed from: a */
    private void m33133a(final UpdateResponse updateResponse, String str) {
        if (C1642c.m34886d() == null) {
            return;
        }
        this.f5747a = C1642c.m34886d();
        if (this.f5751e == null) {
            this.f5751e = new DialogC3245f.C3246a(this.f5747a);
        }
        this.f5751e.m28634b(this.f5747a.getString(C1704R.C1707string.updates), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.biz.update.b.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                C1688z.m34448a(C2046b.this.f5747a, C2046b.this.f5747a.getString(C1704R.C1707string.downloading_apk));
                if (new File(C3129m.m29058i(), C1756a.f4511D).exists() && String.valueOf(updateResponse.versionCode).compareTo(C3103au.m29236a(C2046b.this.f5747a, C3129m.m29058i() + C1756a.f4511D)) == 0) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setFlags(AbstractC4808e.f17570a_);
                    intent.setDataAndType(Uri.fromFile(new File(C3129m.m29058i(), C1756a.f4511D)), "application/vnd.android.package-archive");
                    C2046b.this.f5747a.startActivity(intent);
                } else if (C3103au.m29215c() == null) {
                    C1688z.m34449a(C2046b.this.f5747a, (int) C1704R.C1707string.system_sd_tip, 2000);
                } else {
                    Intent intent2 = new Intent(C2046b.this.f5747a, UpdateApkService.class);
                    intent2.putExtra("down_url", updateResponse.path);
                    intent2.setFlags(AbstractC4808e.f17572c);
                    C2046b.this.f5747a.startService(intent2);
                }
            }
        }).m28644a(this.f5747a.getResources().getColor(C1704R.color.dialog_update_right_text)).m28641a(String.format(this.f5747a.getString(C1704R.C1707string.findupdate), updateResponse.versionName)).m28640a(this.f5747a.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.biz.update.b.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).m28635b(str);
        if (this.f5751e.m28638b().isShowing()) {
            return;
        }
        this.f5751e.m28645a().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m33132a(Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        final AppVersion appVersion = (AppVersion) obj;
        if (this.f5751e == null) {
            this.f5751e = new DialogC3245f.C3246a(this.f5747a);
        }
        if (String.valueOf(appVersion.getNewVersion()) == null || "".equals(String.valueOf(appVersion.getNewVersion()))) {
            return;
        }
        if (Integer.parseInt(String.valueOf(appVersion.getNewVersion())) <= Integer.parseInt(C3103au.m29205e(this.f5747a))) {
            if (!z) {
                return;
            }
            C1688z.m34450a(this.f5747a, (int) C1704R.C1707string.version_tip);
            return;
        }
        this.f5751e.m28634b(this.f5747a.getString(C1704R.C1707string.updates), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.biz.update.b.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                C1688z.m34448a(C2046b.this.f5747a, C2046b.this.f5747a.getString(C1704R.C1707string.downloading_apk));
                if (C3103au.m29215c() == null) {
                    C1688z.m34449a(C2046b.this.f5747a, (int) C1704R.C1707string.system_sd_tip, 2000);
                    return;
                }
                Intent intent = new Intent(C2046b.this.f5747a, UpdateApkService.class);
                intent.putExtra("down_url", appVersion.getUrl());
                intent.setFlags(AbstractC4808e.f17572c);
                C2046b.this.f5747a.startService(intent);
            }
        }).m28644a(this.f5747a.getResources().getColor(C1704R.color.dialog_update_right_text)).m28641a(String.format(this.f5747a.getString(C1704R.C1707string.findupdate), appVersion.getUserVersion())).m28640a(this.f5747a.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.biz.update.b.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).m28635b(appVersion.getUpdcontents());
        if (this.f5751e.m28638b().isShowing()) {
            return;
        }
        this.f5751e.m28645a().show();
    }

    /* renamed from: a */
    public void m33140a() {
        this.f5750d.m33264b(new AbstractC1945k() { // from class: com.fimi.soul.biz.update.b.2
            @Override // com.fimi.soul.biz.p185m.AbstractC1945k
            /* renamed from: a */
            public void mo28106a(PlaneMsg planeMsg, File file) {
                AppVersion appVersion;
                if (C2046b.this.f5748b == null || !planeMsg.isSuccess() || (appVersion = (AppVersion) planeMsg.getData()) == null || appVersion.getNewVersion() == null || String.valueOf(appVersion.getNewVersion()) == null || "".equals(String.valueOf(appVersion.getNewVersion()))) {
                    return;
                }
                int parseInt = Integer.parseInt(String.valueOf(appVersion.getNewVersion()));
                int parseInt2 = Integer.parseInt(C3103au.m29205e(C2046b.this.f5747a));
                if (appVersion == null || parseInt <= parseInt2) {
                    return;
                }
                C2046b.this.f5748b.mo30102a(appVersion.getUserVersion());
            }
        });
    }

    /* renamed from: a */
    public void m33139a(final int i) {
        XiaomiUpdateAgent.setUpdateAutoPopup(false);
        XiaomiUpdateAgent.setUpdateListener(new XiaomiUpdateListener() { // from class: com.fimi.soul.biz.update.b.1
            @Override // com.xiaomi.market.sdk.XiaomiUpdateListener
            public void onUpdateReturned(int i2, UpdateResponse updateResponse) {
                switch (i2) {
                    case 0:
                        if (C2046b.this.f5749c == null) {
                            return;
                        }
                        C2046b.this.f5749c.m33127a(updateResponse);
                        return;
                    case 1:
                        if (i != 1) {
                            return;
                        }
                        C1688z.m34449a(C2046b.this.f5747a, (int) C1704R.C1707string.version_tip, 2000);
                        return;
                    case 2:
                    default:
                        return;
                    case 3:
                        if (i != 1) {
                            return;
                        }
                        C1688z.m34449a(C2046b.this.f5747a, (int) C1704R.C1707string.login_result_net, 2000);
                        return;
                }
            }
        });
        XiaomiUpdateAgent.update(this.f5747a);
    }

    /* renamed from: a */
    public void m33138a(AbstractC2054a abstractC2054a) {
        this.f5748b = abstractC2054a;
    }

    /* renamed from: a */
    public void m33137a(AbstractC2055b abstractC2055b) {
        this.f5749c = abstractC2055b;
    }

    /* renamed from: a */
    public void m33134a(UpdateResponse updateResponse) {
        m33133a(updateResponse, updateResponse.updateLog);
    }

    /* renamed from: a */
    public void m33131a(final boolean z) {
        this.f5750d.m33264b(new AbstractC1945k() { // from class: com.fimi.soul.biz.update.b.5
            @Override // com.fimi.soul.biz.p185m.AbstractC1945k
            /* renamed from: a */
            public void mo28106a(PlaneMsg planeMsg, File file) {
                if (planeMsg.isSuccess()) {
                    C2046b.this.m33132a(planeMsg.getData(), z);
                } else if (!z || !"".equals(planeMsg.getErrorMessage())) {
                } else {
                    C1688z.m34447a(C2046b.this.f5747a, planeMsg.getErrorMessage(), 0);
                }
            }
        });
    }

    /* renamed from: b */
    public AbstractC2055b m33130b() {
        return this.f5749c;
    }
}
