package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p185m.AbstractC1939e;
import com.fimi.soul.drone.p202f.C2269a;
import com.fimi.soul.entity.DeviceVersion;
import com.fimi.soul.entity.FdsMsg;
import com.fimi.soul.entity.HistoryFileInfo;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.module.setting.C2918f;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.utils.NetUtil;
import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.biz.manager.u */
/* loaded from: classes.dex */
public class C2004u {

    /* renamed from: d */
    private static C2004u f5592d;

    /* renamed from: a */
    AbstractC1966g f5593a;

    /* renamed from: b */
    AbstractC2008b f5594b;

    /* renamed from: c */
    private Context f5595c;

    /* renamed from: f */
    private C2269a f5597f;

    /* renamed from: h */
    private String f5599h;

    /* renamed from: i */
    private String f5600i;

    /* renamed from: e */
    private LinkedList<File> f5596e = new LinkedList<>();

    /* renamed from: g */
    private C1645c f5598g = C1645c.m34884a();

    /* renamed from: j */
    private Handler f5601j = new Handler() { // from class: com.fimi.soul.biz.manager.u.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 0:
                    PlaneMsg planeMsg = new PlaneMsg();
                    planeMsg.setSuccess(false);
                    C2004u.this.f5594b.mo29993a(planeMsg, (String) message.obj);
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: com.fimi.soul.biz.manager.u$a */
    /* loaded from: classes.dex */
    class C2007a implements AbstractC1939e {

        /* renamed from: a */
        boolean f5606a = true;

        C2007a() {
        }

        @Override // com.fimi.soul.biz.p185m.AbstractC1939e
        /* renamed from: a */
        public void mo31276a(long j, long j2, String str) {
            if (!this.f5606a || C2004u.this.f5593a == null || j2 / 100 == 0) {
                return;
            }
            C2004u.this.f5593a.mo29994a((int) (j / (j2 / 100)), str);
        }

        @Override // com.fimi.soul.biz.p185m.AbstractC1945k
        /* renamed from: a */
        public void mo28106a(PlaneMsg planeMsg, File file) {
            this.f5606a = planeMsg.isSuccess();
            FdsMsg fdsMsg = (FdsMsg) planeMsg.getData();
            if (C2004u.this.f5597f == null) {
                C2004u.this.f5597f = (C2269a) C1642c.m34887c().mo34880a("0", C2269a.class);
            }
            if (C1756a.m34259c(C2004u.this.f5595c).getUserID() == null) {
                return;
            }
            if (planeMsg.isSuccess()) {
                C2004u.this.m33291a(fdsMsg, file, C2004u.this.f5597f);
            }
            if (C2004u.this.f5594b == null) {
                return;
            }
            C2004u.this.f5594b.mo29993a(planeMsg, file.getPath());
        }
    }

    /* renamed from: com.fimi.soul.biz.manager.u$b */
    /* loaded from: classes.dex */
    public interface AbstractC2008b {
        /* renamed from: a */
        void mo29993a(PlaneMsg planeMsg, String str);
    }

    public C2004u(Context context) {
        this.f5595c = context;
    }

    /* renamed from: a */
    public static C2004u m33297a(Context context) {
        if (f5592d == null) {
            f5592d = new C2004u(context);
        }
        return f5592d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m33291a(FdsMsg fdsMsg, final File file, C2269a c2269a) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "uploadFlyLog"));
        arrayList.add(new BasicNameValuePair("userID", C1756a.m34259c(this.f5595c).getUserID() != null ? C1756a.m34259c(this.f5595c).getUserID() : "000"));
        arrayList.add(new BasicNameValuePair("planeSsid", C3021a.m29616a().m29615a(0).m29550i()));
        arrayList.add(new BasicNameValuePair("binVersion", C3021a.m29616a().m29615a(0).m29566b() + ""));
        arrayList.add(new BasicNameValuePair("fileFdsUrl", fdsMsg.getUrl()));
        arrayList.add(new BasicNameValuePair("currentTime", C3103au.m29222b(System.currentTimeMillis())));
        String name = file.getParentFile().getName();
        if (name.equals("NoFly")) {
            arrayList.add(new BasicNameValuePair("isInSky", "1"));
        } else if (name.equals("AirFly")) {
            arrayList.add(new BasicNameValuePair("isInSky", "0"));
        } else {
            arrayList.add(new BasicNameValuePair("isInSky", "0"));
        }
        arrayList.add(new BasicNameValuePair("appType", "0"));
        if (file.getName().endsWith(".sf") || file.getName().endsWith(".fc")) {
            arrayList.add(new BasicNameValuePair("flyLogType", "2"));
            HistoryFileInfo historyFileInfo = (HistoryFileInfo) this.f5598g.mo34880a(file.getName(), HistoryFileInfo.class);
            if (historyFileInfo != null) {
                this.f5599h = historyFileInfo.getFcId();
                this.f5600i = historyFileInfo.getDeviceType();
            }
        } else if (m33289a(file.getName())) {
            int m33285b = m33285b(file.getAbsolutePath());
            if (m33285b == -1) {
                return;
            }
            arrayList.add(new BasicNameValuePair("flyLogType", "" + m33285b));
        } else {
            arrayList.add(new BasicNameValuePair("flyLogType", "0"));
            HistoryFileInfo historyFileInfo2 = (HistoryFileInfo) this.f5598g.mo34880a(file.getName(), HistoryFileInfo.class);
            if (historyFileInfo2 != null) {
                this.f5599h = historyFileInfo2.getFcId();
                this.f5600i = historyFileInfo2.getDeviceType();
            }
        }
        String[] split = file.getName().substring(0, file.getName().lastIndexOf(".")).split(" ");
        if (split != null && split.length > 0) {
            arrayList.add(new BasicNameValuePair("createFlieTime", split[0] + " " + split[1].replace('-', C0494h.f680A)));
        }
        DeviceVersion deviceVersion = new DeviceVersion();
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        try {
            deviceVersion.setAppVer(this.f5595c.getPackageManager().getPackageInfo(this.f5595c.getPackageName(), 16384).versionName);
            deviceVersion.setBatteryVer(c3022b.m29582l() + "");
            deviceVersion.setCamVer(c3022b.m29578n() + "");
            deviceVersion.setFcVer(c3022b.m29604a() + "");
            deviceVersion.setGcVer(c3022b.m29600c() + "");
            deviceVersion.setNoflyVer(c3022b.m29592g() + "");
            deviceVersion.setRcVer(c3022b.m29602b() + "");
            deviceVersion.setServVer(c3022b.m29590h() + "");
            deviceVersion.setX2Ver(c3022b.m29594f() + "");
            deviceVersion.setX6D4kVer(c3022b.m29584k() + "");
            deviceVersion.setX6RVer(c3022b.m29596e() + "");
            arrayList.add(new BasicNameValuePair("fwsVersion", new Gson().toJson(deviceVersion)));
        } catch (Exception e) {
        }
        if (this.f5599h == null || this.f5600i == null) {
            arrayList.add(new BasicNameValuePair("fcId", " "));
            arrayList.add(new BasicNameValuePair("deviceType", " "));
        } else {
            arrayList.add(new BasicNameValuePair("fcId", this.f5599h));
            arrayList.add(new BasicNameValuePair("deviceType", this.f5600i));
        }
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.biz.manager.u.1
            @Override // java.lang.Runnable
            public void run() {
                String m29406b = NetUtil.m29406b(C1756a.f4551j, arrayList, C2004u.this.f5595c);
                PlaneMsg planeMsg = new PlaneMsg();
                planeMsg.setFile(file);
                try {
                    if ("true".equals(new JSONObject(m29406b).getString("success"))) {
                        if (C2004u.this.f5594b != null) {
                            planeMsg.setSuccess(true);
                            C2004u.this.f5594b.mo29993a(planeMsg, file.getPath());
                            C2004u.this.f5598g.m34871e(file.getName());
                        } else {
                            planeMsg.setSuccess(false);
                            C2004u.this.f5594b.mo29993a(planeMsg, file.getPath());
                        }
                    }
                } catch (Exception e2) {
                    Log.e("good", e2.toString());
                    C2004u.this.f5601j.obtainMessage(0, file.getPath()).sendToTarget();
                }
            }
        });
    }

    /* renamed from: a */
    public void m33298a() {
        File[] listFiles;
        File[] listFiles2;
        File file;
        File[] listFiles3;
        File file2;
        try {
            File file3 = new File(C3129m.m29070a() + "/fw_upgrade/FMLink_Up_Log/");
            file3.mkdirs();
            if (file3.exists()) {
                for (File file4 : file3.listFiles()) {
                    if (file4 != null && (file2 = new File(file3, file4.getName())) != null && file2.exists()) {
                        file2.delete();
                    }
                }
                file3.delete();
            }
            File file5 = new File(C3129m.m29070a() + "/fw_upgrade/FMLink_Down_Log/");
            file5.mkdirs();
            if (file5.exists()) {
                for (File file6 : file5.listFiles()) {
                    if (file6 != null && (file = new File(file5, file6.getName())) != null && file.exists()) {
                        file.delete();
                    }
                }
                file5.delete();
            }
            File file7 = new File(C3103au.m29187o(this.f5595c));
            if (file7.exists()) {
                file7.delete();
            }
            File file8 = new File(C3129m.m29070a() + "/SAVEDRONEINFO/");
            file8.mkdirs();
            if (!file8.exists()) {
                return;
            }
            for (File file9 : file8.listFiles()) {
                if (file9 != null && file9.exists()) {
                    file9.delete();
                }
            }
            file8.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m33296a(AbstractC1966g abstractC1966g) {
        this.f5593a = abstractC1966g;
    }

    /* renamed from: a */
    public void m33295a(AbstractC2008b abstractC2008b) {
        this.f5594b = abstractC2008b;
    }

    /* renamed from: a */
    public void m33290a(File file) {
        C1964f.m33399a(this.f5595c).m33392a(file, (AbstractC1939e) new C2007a());
    }

    /* renamed from: a */
    public boolean m33289a(String str) {
        return str.endsWith(C2918f.f10429a);
    }

    /* renamed from: b */
    public int m33285b(String str) {
        if (str.contains(C3129m.m29050q())) {
            return 5;
        }
        if (str.contains(C3129m.m29049r())) {
            return 4;
        }
        return str.contains(C3129m.m29048s()) ? 6 : -1;
    }

    /* renamed from: b */
    public void m33288b() {
        File[] listFiles;
        File file;
        this.f5596e.clear();
        this.f5597f = (C2269a) C1642c.m34887c().mo34880a("0", C2269a.class);
        if (this.f5597f != null) {
            String str = this.f5597f.m32513d() + "" + this.f5597f.m32511e() + "" + this.f5597f.m32509g();
        }
        File file2 = new File(C3129m.m29070a() + "/SAVEDRONEINFO/");
        file2.mkdirs();
        if (!file2.exists() || !C3103au.m29213c(this.f5595c)) {
            return;
        }
        for (File file3 : file2.listFiles()) {
            if (file3 != null && (file = new File(file2, file3.getName())) != null && file.exists()) {
                file.delete();
            }
        }
        file2.delete();
    }

    /* renamed from: b */
    public void m33286b(File file) {
        C1964f.m33399a(this.f5595c).m33393a(file);
    }

    /* renamed from: c */
    public void m33284c() {
        C1964f.m33399a(this.f5595c).m33400a();
    }

    /* renamed from: c */
    public void m33282c(File file) {
        C1964f.m33399a(this.f5595c).m33386b(file, new C2007a());
    }

    /* renamed from: d */
    public AbstractC2008b m33281d() {
        return this.f5594b;
    }

    /* renamed from: d */
    public void m33279d(File file) {
        C1964f.m33399a(this.f5595c).m33387b(file);
    }
}
