package com.fimi.soul.module.flyplannermedia;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.fimi.kernel.p158b.p160b.C1600b;
import com.fimi.kernel.p158b.p160b.C1609c;
import com.fimi.kernel.p158b.p161c.AbstractC1625d;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.C1514f;
import com.fimi.p140a.p142b.EnumC1495b;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.X11DeviceInfo;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p174c.C1820d;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.entity.CameraValue;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.media.player.FermiPlayerUtils;
import com.fimi.soul.module.flyplannermedia.C2780a;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.view.DialogC3245f;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class DroneOnlineFragment extends DroneBaseMediaFragment implements C1609c.AbstractC1612a, C1609c.AbstractC1613b {

    /* renamed from: e */
    private static final String f9653e = "DroneOnlineFragment";

    /* renamed from: l */
    private static final int f9654l = 153;

    /* renamed from: m */
    private static final int f9655m = 152;

    /* renamed from: n */
    private static final int f9656n = 1000;

    /* renamed from: o */
    private static final int f9657o = 3;

    /* renamed from: g */
    private int f9660g;

    /* renamed from: h */
    private C2780a<X11FileInfo> f9661h;

    /* renamed from: i */
    private List<WifiDistanceFile> f9662i;

    /* renamed from: k */
    private X11DeviceInfo f9664k;

    /* renamed from: q */
    private X11FileInfo f9666q;

    /* renamed from: v */
    private boolean f9671v;

    /* renamed from: f */
    private int f9659f = 0;

    /* renamed from: j */
    private List<X11FileInfo> f9663j = new ArrayList();

    /* renamed from: p */
    private boolean f9665p = true;

    /* renamed from: r */
    private int f9667r = 0;

    /* renamed from: s */
    private int f9668s = 1;

    /* renamed from: t */
    private boolean f9669t = false;

    /* renamed from: u */
    private boolean f9670u = false;

    /* renamed from: w */
    private boolean f9672w = false;

    /* renamed from: d */
    Handler f9658d = new Handler() { // from class: com.fimi.soul.module.flyplannermedia.DroneOnlineFragment.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (153 == message.what) {
                if (C1514f.m35431a().m35429b() == EnumC1495b.X1BH) {
                    DroneOnlineFragment.this.m().m33988v().m34024b(1);
                } else if (!C1772d.m34208a().m34187k()) {
                    DroneOnlineFragment.this.m().m33988v().m34024b(0);
                } else if (CameraValue.version < 1058) {
                    DroneOnlineFragment.this.m().m33988v().m34024b(0);
                } else {
                    DroneOnlineFragment.this.m().m33988v().m34024b(1);
                }
            }
            if (152 == message.what) {
                if (!DroneOnlineFragment.this.f9665p) {
                    if (DroneOnlineFragment.this.f9667r >= 3 && DroneOnlineFragment.this.f9668s == 1) {
                        DroneOnlineFragment.m30319j(DroneOnlineFragment.this);
                        DroneOnlineFragment.this.m30340a(DroneOnlineFragment.this.f9666q);
                    } else if (DroneOnlineFragment.this.f9668s >= 2 && DroneOnlineFragment.this.f9667r >= 3) {
                        DroneOnlineFragment.this.m30312s();
                    }
                }
                DroneOnlineFragment.m30317l(DroneOnlineFragment.this);
                DroneOnlineFragment.this.f9658d.sendEmptyMessageDelayed(152, 1000L);
            }
        }
    };

    public DroneOnlineFragment() {
        this.f9671v = false;
        a(true);
        this.f9671v = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m30340a(X11FileInfo x11FileInfo) {
        int fileType = WifiDistanceFile.getFileType(x11FileInfo.getName());
        if (fileType == 1) {
            this.f9667r = 0;
            String m34164a = C1783b.m34164a(x11FileInfo);
            if (C1783b.m34155b(m34164a)) {
                this.f9665p = true;
                m30339a(x11FileInfo, String.format("file://%s", C3129m.m29069a(m34164a)));
                this.f9661h.m30307b();
            } else {
                this.f9665p = false;
                m().m33988v().m34027a(x11FileInfo.getName(), x11FileInfo.getAbsolutePath(), x11FileInfo.getCreateDate(), C1820d.EnumC1823a.Thumb);
            }
        }
        if (fileType == 2) {
            this.f9665p = false;
            this.f9667r = 0;
            this.f9670u = true;
            m().m33988v().m34012g(x11FileInfo.getAbsolutePath());
        }
    }

    /* renamed from: a */
    private void m30339a(X11FileInfo x11FileInfo, String str) {
        WifiDistanceFile wifiDistanceFile = new WifiDistanceFile(x11FileInfo.getName());
        wifiDistanceFile.setLocalThumbnailPath(str);
        wifiDistanceFile.setDateString(x11FileInfo.getCreateDate());
        wifiDistanceFile.setSize(x11FileInfo.getSize());
        wifiDistanceFile.setRealPath(x11FileInfo.getRemotePath());
        wifiDistanceFile.setAbsolutePath(x11FileInfo.getAbsolutePath());
        wifiDistanceFile.setRemoteUrl(x11FileInfo.getHttpUrl());
        if (wifiDistanceFile.getType() == 2) {
            wifiDistanceFile.setRemoteThmUrl(x11FileInfo.getHttpThmUrl());
        }
        b().m34310a(wifiDistanceFile);
        g(false);
    }

    /* renamed from: b */
    private void m30327b(List<X11FileInfo> list) {
        if (list == null || list.size() <= b().getCount()) {
            d(true);
            m().a(true);
        } else if (list == null || list.size() <= 0) {
            d(true);
        } else {
            this.f9661h = new C2780a<>(list);
            this.f9661h.m30309a(new C2780a.AbstractC2781a<X11FileInfo>() { // from class: com.fimi.soul.module.flyplannermedia.DroneOnlineFragment.4
                @Override // com.fimi.soul.module.flyplannermedia.C2780a.AbstractC2781a
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public boolean mo30303a(X11FileInfo x11FileInfo) {
                    DroneOnlineFragment.this.f9666q = x11FileInfo;
                    DroneOnlineFragment.m30324e(DroneOnlineFragment.this);
                    DroneOnlineFragment.this.f9668s = 1;
                    DroneOnlineFragment.this.m30340a(DroneOnlineFragment.this.f9666q);
                    return true;
                }
            });
            this.f9661h.m30307b();
            d(false);
            g(false);
        }
    }

    /* renamed from: e */
    static /* synthetic */ int m30324e(DroneOnlineFragment droneOnlineFragment) {
        int i = droneOnlineFragment.f9659f;
        droneOnlineFragment.f9659f = i + 1;
        return i;
    }

    /* renamed from: j */
    static /* synthetic */ int m30319j(DroneOnlineFragment droneOnlineFragment) {
        int i = droneOnlineFragment.f9668s;
        droneOnlineFragment.f9668s = i + 1;
        return i;
    }

    /* renamed from: l */
    static /* synthetic */ int m30317l(DroneOnlineFragment droneOnlineFragment) {
        int i = droneOnlineFragment.f9667r;
        droneOnlineFragment.f9667r = i + 1;
        return i;
    }

    /* renamed from: q */
    private void m30314q() {
        l().setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.flyplannermedia.DroneOnlineFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DroneOnlineFragment.this.m30313r();
            }
        });
        k().setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.flyplannermedia.DroneOnlineFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DroneOnlineFragment.this.f9662i = DroneOnlineFragment.this.b().m34300c();
                new DialogC3245f.C3246a(DroneOnlineFragment.this.getActivity()).m28641a(String.format(DroneOnlineFragment.this.getString(C1704R.C1707string.ensure_delete_image), DroneOnlineFragment.this.f9662i.size() + "")).m28644a(DroneOnlineFragment.this.getActivity().getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(DroneOnlineFragment.this.getString(C1704R.C1707string.delete), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.flyplannermedia.DroneOnlineFragment.3.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        DroneOnlineFragment.this.f9660g = 0;
                        DroneOnlineFragment.this.f9670u = false;
                        if (DroneOnlineFragment.this.f9662i.size() == 0) {
                            return;
                        }
                        DroneOnlineFragment.this.f9663j.clear();
                        for (int i2 = 0; i2 < DroneOnlineFragment.this.f9662i.size(); i2++) {
                            Iterator<X11FileInfo> it2 = DroneOnlineFragment.this.m().l().getCurDirFileList().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    X11FileInfo next = it2.next();
                                    if (((WifiDistanceFile) DroneOnlineFragment.this.f9662i.get(i2)).getName().equals(next.getName())) {
                                        DroneOnlineFragment.this.f9663j.add(next);
                                        break;
                                    }
                                }
                            }
                        }
                        DroneOnlineFragment.this.m().m33988v().m34020c(((WifiDistanceFile) DroneOnlineFragment.this.f9662i.get(DroneOnlineFragment.this.f9660g)).getAbsolutePath());
                        DroneOnlineFragment.this.h(false);
                        DroneOnlineFragment.this.g(true);
                    }
                }).m28640a(DroneOnlineFragment.this.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.flyplannermedia.DroneOnlineFragment.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).m28645a().show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m30313r() {
        List<WifiDistanceFile> m34300c = b().m34300c();
        C1609c m34997a = C1609c.m34997a(getActivity());
        m34997a.m34993a((C1609c.AbstractC1613b) this);
        m34997a.m34994a((C1609c.AbstractC1612a) this);
        if (m34300c != null && m34300c.size() > 0) {
            h(false);
            for (WifiDistanceFile wifiDistanceFile : m34300c) {
                String m34159a = C1783b.m34159a(wifiDistanceFile.getName(), wifiDistanceFile.getDateString());
                String str = "";
                if (wifiDistanceFile.getType() == 2) {
                    str = wifiDistanceFile.getDurationString();
                }
                m34997a.m34991a(wifiDistanceFile.getRemoteUrl(), str, wifiDistanceFile.getSize(), false, C3129m.m29066b(m34159a).replace(X11FileInfo.FILE_TYPE_MP4, ".mp4"));
            }
        }
        C1688z.m34447a(getActivity(), getActivity().getString(C1704R.C1707string.media_success_add, new Object[]{Integer.valueOf(m34300c.size())}), 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m30312s() {
        if (this.f9659f > 0) {
            this.f9659f--;
            if (b().getCount() + 1 >= m().l().getCurDirFileList().size()) {
                return;
            }
            m().l().getCurDirFileList().remove(b().getCount() + 1);
            if (this.f9661h.m30307b() || this.f9661h.m30306c() != 12 || b().getCount() + 1 >= 12) {
                return;
            }
            this.f9661h.m30304e();
            this.f9661h.m30307b();
        }
    }

    /* renamed from: a */
    public void m30343a(Intent intent) {
        if (intent != null) {
            WifiDistanceFile wifiDistanceFile = (WifiDistanceFile) intent.getSerializableExtra(C1756a.f4522O);
            if (wifiDistanceFile != null && b() != null) {
                b().m34298c(wifiDistanceFile);
                if (b().getCount() == 0) {
                    d(true);
                }
            }
            if (this.f9659f > 0) {
                this.f9659f--;
            }
            a(wifiDistanceFile);
        }
    }

    @Override // com.fimi.soul.module.flyplannermedia.DroneBaseMediaFragment
    /* renamed from: a */
    void mo30342a(GridView gridView) {
        if (b().m34297d().size() == this.f9659f && this.f9661h != null && this.f9665p && this.f9661h.m30304e()) {
            this.f9661h.m30307b();
            b().notifyDataSetChanged();
        }
    }

    @Override // com.fimi.kernel.p158b.p160b.C1609c.AbstractC1612a
    /* renamed from: a */
    public void mo30341a(C1600b c1600b, int i) {
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1791e
    /* renamed from: a */
    public void mo30333a(String str, String str2) {
        if (this.f9672w) {
            return;
        }
        this.f9665p = true;
        try {
            if (C1783b.m34145f(str2) != C1783b.EnumC1785a.Thumbnail) {
                return;
            }
            List<X11FileInfo> curDirFileList = m().l().getCurDirFileList();
            if (b().getCount() >= curDirFileList.size()) {
                return;
            }
            m30339a(curDirFileList.get(b().getCount()), String.format("file://%s%s", str, str2));
            if (this.f9661h.m30307b()) {
            }
        } catch (Exception e) {
            Log.d("Good", e + "");
        }
    }

    @Override // com.fimi.kernel.p158b.p160b.C1609c.AbstractC1613b
    /* renamed from: a */
    public void mo30332a(List<C1600b> list, boolean z, C1600b c1600b) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        String timelineString;
        int indexOf;
        if (!"".equalsIgnoreCase(x11RespCmd.getErrorMsg())) {
        }
        if (getActivity() != null) {
            if (x11RespCmd.getNotificationType() == X11RespCmd.NotificationType.CardRemoved) {
                d(true);
                C1688z.m34448a(getActivity(), getActivity().getString(C1704R.C1707string.tf_removed));
                return;
            } else if (x11RespCmd.getNotificationType() == X11RespCmd.NotificationType.FmLsEnd) {
                this.f9671v = true;
                if (z) {
                    m30327b(m().l().getCurDirFileList());
                } else {
                    d(true);
                    g(false);
                }
            }
        }
        switch (x11RespCmd.getMsg_id()) {
            case 257:
                m().m33988v().m34019d();
                return;
            case 261:
                if (!C1772d.m34208a().m34187k()) {
                    m().m33988v().m34024b(0);
                    return;
                } else if (CameraValue.version < 1058) {
                    m().m33988v().m34024b(0);
                    return;
                } else {
                    m().m33988v().m34024b(1);
                    return;
                }
            case 1026:
                break;
            case C1831e.f4791R /* 1281 */:
                if (!z && x11RespCmd.getRval() != -26) {
                    g(false);
                    C1688z.m34447a(getActivity(), getString(C1704R.C1707string.del_fail), 2000);
                    return;
                } else if (this.f9660g < this.f9663j.size() && this.f9660g < this.f9662i.size()) {
                    m().a(true);
                    b().m34302b(this.f9662i.get(this.f9660g));
                    if (this.f9659f > 0) {
                        this.f9659f--;
                    }
                    m().l().getCurDirFileList().remove(this.f9663j.get(this.f9660g));
                    if (this.f9662i.get(this.f9660g).getLocalThumbnailPath() != null) {
                        File file = new File(this.f9662i.get(this.f9660g).getLocalThumbnailPath().replace("file://", ""));
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                    this.f9660g++;
                    if (this.f9660g >= this.f9662i.size()) {
                        g(false);
                        C1688z.m34447a(getActivity(), getString(C1704R.C1707string.del_success), C1688z.f4191b);
                        a(this.f9662i);
                        m().m33989u().m34046d(C1831e.f4927cU);
                        if (b().getCount() + 1 < 12 && this.f9661h != null && this.f9661h.m30304e() && !this.f9661h.m30307b() && b().getCount() == 0) {
                            d(true);
                        }
                        b().notifyDataSetChanged();
                        break;
                    } else {
                        m().m33988v().m34020c(this.f9662i.get(this.f9660g).getAbsolutePath());
                        break;
                    }
                } else {
                    g(false);
                    return;
                }
                break;
            case C1831e.f4792S /* 1282 */:
                g(false);
                this.f9659f = 0;
                m30327b(m().l().getCurDirFileList());
                return;
            case C1831e.f4793T /* 1283 */:
                m().m33988v().m34015f();
                return;
            case C1831e.f4839am /* 10066328 */:
                X11FileInfo curDownloadFile = m().l().getCurDownloadFile();
                if (curDownloadFile == null) {
                    return;
                }
                m().m33988v().m34027a(curDownloadFile.getName(), curDownloadFile.getAbsolutePath(), curDownloadFile.getCreateDate(), C1820d.EnumC1823a.Thumb);
                return;
            default:
                return;
        }
        if (!this.f9670u || this.f9672w) {
            return;
        }
        this.f9665p = true;
        if (!z) {
            m30312s();
            return;
        }
        List<X11FileInfo> curDirFileList = m().l().getCurDirFileList();
        if (b().getCount() < 0 || b().getCount() >= curDirFileList.size()) {
            return;
        }
        X11FileInfo x11FileInfo = curDirFileList.get(b().getCount());
        String name = x11FileInfo.getName();
        WifiDistanceFile wifiDistanceFile = new WifiDistanceFile(name);
        if (z) {
            try {
                timelineString = FermiPlayerUtils.getTimelineString(Long.parseLong(x11RespCmd.getDuration()) * 1000, "mm:ss");
            } catch (Exception e) {
            }
        } else {
            timelineString = "00:00";
        }
        wifiDistanceFile.setDurationString(timelineString);
        wifiDistanceFile.setDateString(x11FileInfo.getCreateDate());
        wifiDistanceFile.setRemoteUrl(C1783b.m34160a(x11FileInfo.getRemotePath()));
        wifiDistanceFile.setSize(x11FileInfo.getSize());
        wifiDistanceFile.setRealPath(x11FileInfo.getRemotePath());
        wifiDistanceFile.setAbsolutePath(x11FileInfo.getAbsolutePath());
        if (x11FileInfo.getRemotePath().indexOf(".") > 0 && wifiDistanceFile.getType() == 2) {
            wifiDistanceFile.setRemoteThmUrl(C1783b.m34160a(!name.contains("_THM.MP4") ? x11FileInfo.getRemotePath().substring(0, indexOf) + "_THM.MP4" : x11FileInfo.getRemotePath()));
        }
        b().m34310a(wifiDistanceFile);
        this.f9661h.m30307b();
        b().notifyDataSetChanged();
    }

    /* renamed from: o */
    public void m30316o() {
        h(false);
    }

    @Override // com.fimi.soul.module.flyplannermedia.DroneBaseMediaFragment, android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        m().c(new AbstractC1625d() { // from class: com.fimi.soul.module.flyplannermedia.DroneOnlineFragment.1
            @Override // com.fimi.kernel.p158b.p161c.AbstractC1625d
            /* renamed from: a */
            public void mo28036a(String str) {
            }
        });
    }

    @Override // com.fimi.soul.module.flyplannermedia.DroneBaseMediaFragment, android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        m30314q();
        return onCreateView;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.fimi.soul.module.flyplannermedia.DroneBaseMediaFragment, android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f9672w = false;
        if (!this.f9669t && m().e() && b().getCount() > 0 && b().getCount() < 12 && m().l().getCurDirFileList().size() > b().getCount()) {
            b().m34291h();
            this.f9659f = 0;
            m30327b(m().l().getCurDirFileList());
        }
        b().notifyDataSetChanged();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(true);
        f(false);
        this.f9658d.sendEmptyMessage(152);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f9669t = false;
        this.f9672w = true;
        this.f9658d.removeCallbacksAndMessages(152);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        d(false);
        if (!m().i()) {
            C1688z.m34449a(getActivity(), (int) C1704R.C1707string.tf_remove_error, 3000);
            d(true);
            return;
        }
        if (m().e() && b().getCount() <= 0) {
            this.f9669t = true;
            g(true);
            d(false);
            if (!this.f9671v) {
                this.f9658d.sendEmptyMessageDelayed(153, 300L);
                m().m33989u().m34046d(C1831e.f4928cV);
            } else {
                g(false);
                d(true);
            }
        } else if (!m().e()) {
            this.f9669t = true;
            d(true);
        } else {
            this.f9669t = false;
        }
        this.f9664k = m().j().getX11DeviceInfo();
    }

    /* renamed from: p */
    public Handler m30315p() {
        return this.f9658d;
    }
}
