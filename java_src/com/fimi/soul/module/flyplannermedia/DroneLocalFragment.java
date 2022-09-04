package com.fimi.soul.module.flyplannermedia;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p158b.p160b.C1600b;
import com.fimi.kernel.p158b.p160b.C1609c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.view.DialogC3245f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class DroneLocalFragment extends DroneBaseMediaFragment {

    /* renamed from: d */
    private C1609c f9616d;

    /* renamed from: e */
    private List<WifiDistanceFile> f9617e;

    /* renamed from: f */
    private HandlerC2767a f9618f = new HandlerC2767a();

    /* renamed from: g */
    private Handler f9619g = new Handler();

    /* renamed from: h */
    private boolean f9620h = false;

    /* renamed from: com.fimi.soul.module.flyplannermedia.DroneLocalFragment$a */
    /* loaded from: classes.dex */
    class HandlerC2767a extends Handler {
        HandlerC2767a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 100) {
                if (message.what != 99) {
                    return;
                }
                DroneLocalFragment.this.b().notifyDataSetChanged();
                return;
            }
            DroneLocalFragment.this.f9620h = false;
            if (DroneLocalFragment.this.f9617e == null) {
                DroneLocalFragment.this.g(false);
                DroneLocalFragment.this.d(true);
                return;
            }
            DroneLocalFragment.this.b().m34306a(DroneLocalFragment.this.f9617e);
            DroneLocalFragment.this.g(false);
            if (DroneLocalFragment.this.f9617e.size() > 0) {
                DroneLocalFragment.this.d(false);
            } else {
                DroneLocalFragment.this.d(true);
            }
            DroneLocalFragment.this.b().notifyDataSetChanged();
        }
    }

    public DroneLocalFragment() {
        a(false);
    }

    /* renamed from: p */
    private void m30354p() {
        if (!this.f9620h) {
            this.f9620h = true;
            new Thread(new Runnable() { // from class: com.fimi.soul.module.flyplannermedia.DroneLocalFragment.2
                @Override // java.lang.Runnable
                public void run() {
                    DroneLocalFragment.this.f9617e = DroneLocalFragment.this.m30353q();
                    DroneLocalFragment.this.f9618f.sendEmptyMessage(100);
                    DroneLocalFragment.this.f9620h = false;
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public List<WifiDistanceFile> m30353q() {
        File[] listFiles;
        File file = new File(C3129m.m29046u());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (file == null || !file.exists()) {
            return null;
        }
        File[] listFiles2 = file.listFiles();
        for (int i = 0; i < listFiles2.length; i++) {
            if (listFiles2[i].getName().endsWith(".jpg") || listFiles2[i].getName().endsWith(".JPG") || listFiles2[i].getName().endsWith(".mp4") || listFiles2[i].getName().endsWith(X11FileInfo.FILE_TYPE_MP4)) {
                arrayList.add(listFiles2[i]);
            }
        }
        File file2 = new File(C3129m.m29053n());
        if (file2 != null && (listFiles = file2.listFiles()) != null) {
            for (File file3 : listFiles) {
                arrayList2.add(file3);
            }
        }
        Collections.sort(arrayList, new C2782b());
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            File file4 = (File) it2.next();
            String name = file4.getName();
            WifiDistanceFile wifiDistanceFile = new WifiDistanceFile(name);
            String format = String.format("file://%s%s", C3129m.m29046u(), name);
            wifiDistanceFile.setLocalThumbnailPath(format);
            wifiDistanceFile.setPath(format);
            C1600b m34996a = this.f9616d.m34996a(getActivity(), name.replace(".mp4", X11FileInfo.FILE_TYPE_MP4));
            if (m34996a != null) {
                m34996a.m35052a(this.f9619g);
                this.f9616d.m34988c();
                wifiDistanceFile.setDownloadTaskInfo(m34996a);
                wifiDistanceFile.setRemoteUrl(m34996a.m35012m());
                String replace = name.replace(".mp4", X11FileInfo.FILE_TYPE_MP4);
                if (replace.contains(X11FileInfo.FILE_TYPE_MP4)) {
                    replace = replace.replace(X11FileInfo.FILE_TYPE_MP4, ".jpg");
                    if (m34996a.m35056a() != null) {
                        wifiDistanceFile.setDurationString(m34996a.m35056a());
                    }
                }
                String str = replace;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    File file5 = (File) it3.next();
                    if (file5.getName().contains(str)) {
                        wifiDistanceFile.setLocalDownloadCachePath(file5.getPath());
                        break;
                    }
                }
            }
            if (file4.length() > 0) {
                arrayList3.add(wifiDistanceFile);
            }
        }
        return arrayList3;
    }

    /* renamed from: a */
    public void m30363a(Intent intent) {
        String stringExtra = intent.getStringExtra("del_file");
        if (intent == null || "".equals(stringExtra) || stringExtra == null) {
            return;
        }
        b().m34301b(stringExtra);
    }

    @Override // com.fimi.soul.module.flyplannermedia.DroneBaseMediaFragment
    /* renamed from: a */
    void mo30342a(GridView gridView) {
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1791e
    /* renamed from: a */
    public void mo30333a(String str, String str2) {
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        if (getActivity() != null) {
            if (x11RespCmd.getNotificationType() == X11RespCmd.NotificationType.StartingVideoRecord) {
                b().notifyDataSetChanged();
            }
            if (x11RespCmd.getNotificationType() != X11RespCmd.NotificationType.VideoRecordComplete) {
                return;
            }
            b().notifyDataSetChanged();
        }
    }

    /* renamed from: o */
    public void m30355o() {
        h(false);
    }

    @Override // com.fimi.soul.module.flyplannermedia.DroneBaseMediaFragment, android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f9616d = C1609c.m34997a(getActivity());
        k().setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.flyplannermedia.DroneLocalFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                final List<WifiDistanceFile> m34297d = DroneLocalFragment.this.b().m34297d();
                DialogC3245f.C3246a c3246a = new DialogC3245f.C3246a(DroneLocalFragment.this.getActivity());
                if (DroneLocalFragment.this.b().m34300c() == null || DroneLocalFragment.this.b().m34300c().size() <= 0) {
                    return;
                }
                c3246a.m28641a(String.format(DroneLocalFragment.this.getString(C1704R.C1707string.ensure_delete_image), DroneLocalFragment.this.b().m34300c().size() + "")).m28644a(DroneLocalFragment.this.getActivity().getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(DroneLocalFragment.this.getString(C1704R.C1707string.delete), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.flyplannermedia.DroneLocalFragment.1.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C1642c.m34889b().mo34440a();
                        for (WifiDistanceFile wifiDistanceFile : DroneLocalFragment.this.b().m34300c()) {
                            if (m34297d.contains(wifiDistanceFile)) {
                                File file = new File(wifiDistanceFile.getPath().replace("file://", ""));
                                if (file.exists()) {
                                    file.delete();
                                }
                                m34297d.remove(wifiDistanceFile);
                            }
                            C1600b m34996a = DroneLocalFragment.this.f9616d.m34996a(DroneLocalFragment.this.getActivity(), wifiDistanceFile.getRemoteUrl());
                            if (m34996a != null) {
                                DroneLocalFragment.this.f9616d.m34995a(m34996a);
                            }
                        }
                        DroneLocalFragment.this.b().m34306a(m34297d);
                        DroneLocalFragment.this.b().m34292g();
                        DroneLocalFragment.this.f9618f.sendEmptyMessageDelayed(99, 200L);
                        DroneLocalFragment.this.h(false);
                        C1642c.m34889b().mo34429c();
                        if (m34297d.size() == 0) {
                            DroneLocalFragment.this.d(true);
                        }
                    }
                }).m28640a(DroneLocalFragment.this.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.flyplannermedia.DroneLocalFragment.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).m28645a().show();
            }
        });
        return onCreateView;
    }

    @Override // com.fimi.soul.module.flyplannermedia.DroneBaseMediaFragment, android.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(false);
        f(true);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        g(true);
        d(false);
        m30354p();
    }
}
