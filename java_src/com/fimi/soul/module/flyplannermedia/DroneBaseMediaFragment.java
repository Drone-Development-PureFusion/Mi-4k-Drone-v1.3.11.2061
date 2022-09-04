package com.fimi.soul.module.flyplannermedia;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p001v4.view.MotionEventCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import com.fimi.kernel.utils.C1675p;
import com.fimi.kernel.utils.C1679t;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p173b.AbstractC1791e;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.fimi.soul.p168b.C1735f;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.view.MyGridView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class DroneBaseMediaFragment extends Fragment implements AdapterView.OnItemLongClickListener, AbstractC1791e, AbstractC1792f<X11RespCmd> {

    /* renamed from: a */
    protected C1735f f9597a;

    /* renamed from: f */
    private C1827d f9602f;

    /* renamed from: i */
    private C2083a f9605i;

    /* renamed from: d */
    private MyGridView f9600d = null;

    /* renamed from: e */
    private TextView f9601e = null;

    /* renamed from: g */
    private boolean f9603g = false;

    /* renamed from: h */
    private boolean f9604h = false;

    /* renamed from: j */
    private boolean f9606j = false;

    /* renamed from: k */
    private boolean f9607k = false;

    /* renamed from: l */
    private boolean f9608l = false;

    /* renamed from: b */
    float f9598b = 0.0f;

    /* renamed from: c */
    List<X11FileInfo> f9599c = null;

    /* renamed from: o */
    private DroneMediaTabActivity m30365o() {
        return (DroneMediaTabActivity) getActivity();
    }

    /* renamed from: a */
    abstract void mo30342a(GridView gridView);

    /* renamed from: a */
    public void m30397a(WifiDistanceFile wifiDistanceFile) {
        if ((wifiDistanceFile == null || this.f9599c == null || this.f9599c.size() == 0) && !this.f9608l) {
            this.f9599c = m30367m().l().getCurDirFileList();
        }
        this.f9608l = true;
        if (this.f9599c == null || this.f9599c.size() <= 0) {
            return;
        }
        X11FileInfo x11FileInfo = null;
        for (X11FileInfo x11FileInfo2 : this.f9599c) {
            if (!x11FileInfo2.getAbsolutePath().equals(wifiDistanceFile.getAbsolutePath())) {
                x11FileInfo2 = x11FileInfo;
            }
            x11FileInfo = x11FileInfo2;
        }
        if (x11FileInfo == null) {
            return;
        }
        this.f9599c.remove(x11FileInfo);
    }

    /* renamed from: a */
    public void m30394a(List<WifiDistanceFile> list) {
        if (list == null || list.size() == 0 || this.f9599c == null || this.f9599c.size() == 0) {
            return;
        }
        Log.d("moweiru", "toDeleteFiles=" + list.get(0).getName());
        ArrayList<X11FileInfo> arrayList = new ArrayList();
        for (WifiDistanceFile wifiDistanceFile : list) {
            for (X11FileInfo x11FileInfo : this.f9599c) {
                if (x11FileInfo.getName().equals(wifiDistanceFile.getName())) {
                    arrayList.add(x11FileInfo);
                }
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        for (X11FileInfo x11FileInfo2 : arrayList) {
            this.f9599c.remove(x11FileInfo2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m30393a(boolean z) {
        this.f9604h = z;
    }

    /* renamed from: a */
    protected boolean m30398a() {
        return this.f9604h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public C1735f m30392b() {
        return this.f9597a;
    }

    /* renamed from: b */
    protected void m30389b(boolean z) {
        m30365o().m30349b().setVisibility(z ? 0 : 8);
    }

    /* renamed from: c */
    protected Button m30388c() {
        return (Button) m30365o().m30349b().findViewById(C1704R.C1706id.btn_topLeft);
    }

    /* renamed from: c */
    protected void m30385c(boolean z) {
        m30365o().m30352a().setVisibility(z ? 0 : 8);
    }

    /* renamed from: d */
    protected TextView m30384d() {
        return this.f9601e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m30382d(boolean z) {
        if (m30365o() != null) {
            m30365o().m30350a(z);
        }
    }

    /* renamed from: e */
    public List<X11FileInfo> m30381e() {
        return this.f9599c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void m30379e(boolean z) {
        m30365o().m30352a().findViewById(C1704R.C1706id.ll_bottomDownload).setVisibility(z ? 0 : 8);
    }

    /* renamed from: f */
    protected Button m30378f() {
        return (Button) m30365o().m30349b().findViewById(C1704R.C1706id.btn_topRight);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void m30376f(boolean z) {
        View findViewById = m30365o().m30352a().findViewById(C1704R.C1706id.ll_bottomShare);
        if (z) {
        }
        findViewById.setVisibility(8);
    }

    /* renamed from: g */
    protected TextView m30375g() {
        return (TextView) m30365o().m30349b().findViewById(C1704R.C1706id.tv_topCenter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void m30374g(boolean z) {
        if (m30365o() == null || m30365o().findViewById(C1704R.C1706id.load_pb) == null) {
            return;
        }
        m30365o().findViewById(C1704R.C1706id.load_pb).setVisibility(z ? 0 : 8);
    }

    /* renamed from: h */
    public String m30373h() {
        int i;
        int i2;
        File file = new File(C3129m.m29046u());
        if (file == null || !file.exists()) {
            i = 0;
            i2 = 0;
        } else {
            File[] listFiles = file.listFiles();
            i = 0;
            i2 = 0;
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (name.endsWith(X11FileInfo.FILE_TYPE_MP4)) {
                    i++;
                }
                if (name.endsWith(".jpg")) {
                    i2++;
                }
            }
        }
        return String.format(getActivity().getResources().getString(C1704R.C1707string.local_media_detail), i2 + "", i + "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m30372h(boolean z) {
        m30389b(z);
        m30385c(z);
        if (!z) {
            this.f9600d.setPadding(0, 0, 0, 0);
            m30392b().m34317a(C1735f.EnumC1739a.Normal);
            m30392b().m34292g();
            return;
        }
        this.f9600d.setPadding(0, 0, 0, (int) C1675p.m34634a((Context) getActivity(), 60.0f));
        m30392b().m34317a(C1735f.EnumC1739a.Choose);
        m30378f().setText(getString(C1704R.C1707string.select_all));
        this.f9603g = false;
    }

    /* renamed from: i */
    public String m30371i() {
        if (!this.f9608l) {
            this.f9599c = m30367m().l().getCurDirFileList();
        }
        if (this.f9599c == null || this.f9599c.size() != 0) {
            long j = 0;
            int i = 0;
            int i2 = 0;
            for (X11FileInfo x11FileInfo : this.f9599c) {
                int i3 = x11FileInfo.getName().endsWith(X11FileInfo.FILE_TYPE_MP4) ? i2 + 1 : i2;
                if (x11FileInfo.getName().endsWith(".jpg")) {
                    i++;
                }
                j = (x11FileInfo.getSize() / FimiMediaMeta.AV_CH_SIDE_RIGHT) + j;
                i2 = i3;
            }
            return String.format(getActivity().getResources().getString(C1704R.C1707string.online_media_detail), i + "", i2 + "", C1679t.m34556a(((float) m30367m().j().getFreeKBSpace()) / 1048576.0f, 2) + "", C1679t.m34556a(((float) m30367m().j().getTotalKBSpace()) / 1048576.0f, 2) + "");
        }
        return "";
    }

    /* renamed from: j */
    protected ImageButton m30370j() {
        return (ImageButton) m30365o().m30352a().findViewById(C1704R.C1706id.btn_bottomShare);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public ImageButton m30369k() {
        return (ImageButton) m30365o().m30352a().findViewById(C1704R.C1706id.btn_bottomDelete);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public ImageButton m30368l() {
        return (ImageButton) m30365o().m30352a().findViewById(C1704R.C1706id.btn_bottomDownload);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public C1827d m30367m() {
        if (this.f9602f == null) {
            this.f9602f = (C1827d) C1783b.m34166a().m34150d();
        }
        return this.f9602f;
    }

    /* renamed from: n */
    public void m30366n() {
        this.f9600d.setAdapter(this.f9597a);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f9605i = ((DroidPlannerApp) activity.getApplication()).f4493a;
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.fragment_gridview, (ViewGroup) null);
        this.f9600d = (MyGridView) inflate.findViewById(C1704R.C1706id.gv_content);
        if (this.f9597a == null) {
            this.f9597a = new C1735f(getActivity(), this.f9600d);
            this.f9597a.m34305a(m30398a());
            this.f9597a.m34311a(this.f9605i);
        }
        this.f9601e = (TextView) inflate.findViewById(C1704R.C1706id.media_detail);
        C3103au.m29232a(m30365o().getAssets(), this.f9601e);
        this.f9600d.setAdapter(this.f9597a);
        this.f9600d.setOnItemLongClickListener(this);
        this.f9600d.setOnItemClickListener(this.f9597a);
        this.f9600d.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.fimi.soul.module.flyplannermedia.DroneBaseMediaFragment.1

            /* renamed from: b */
            private int f9610b;

            /* renamed from: c */
            private int f9611c;

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                this.f9610b = i;
                this.f9611c = i2;
                DroneBaseMediaFragment.this.f9597a.m34320a(absListView, i, i2, i3);
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                DroneBaseMediaFragment.this.f9597a.m34321a(absListView, i);
                if (i != 1 || this.f9610b != 0 || !DroneBaseMediaFragment.this.f9606j || DroneBaseMediaFragment.this.f9597a.m34295e() == C1735f.EnumC1739a.Choose) {
                    DroneBaseMediaFragment.this.f9601e.setVisibility(8);
                } else {
                    if (!DroneBaseMediaFragment.this.f9607k) {
                        if (!DroneBaseMediaFragment.this.f9604h) {
                            DroneBaseMediaFragment.this.f9601e.setText(DroneBaseMediaFragment.this.m30373h());
                        } else {
                            DroneBaseMediaFragment.this.f9601e.setText(DroneBaseMediaFragment.this.m30371i());
                        }
                        DroneBaseMediaFragment.this.f9607k = true;
                    }
                    DroneBaseMediaFragment.this.f9601e.setVisibility(0);
                }
                if (DroneBaseMediaFragment.this.m30367m().l().getCurDirFileList().size() <= DroneBaseMediaFragment.this.f9600d.getCount() || this.f9610b + this.f9611c < DroneBaseMediaFragment.this.f9600d.getCount() || i != 0) {
                    return;
                }
                DroneBaseMediaFragment.this.mo30342a(DroneBaseMediaFragment.this.f9600d);
            }
        });
        this.f9600d.setOnTouchListener(new View.OnTouchListener() { // from class: com.fimi.soul.module.flyplannermedia.DroneBaseMediaFragment.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float y = motionEvent.getY();
                int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
                if (actionMasked == 2) {
                    if (DroneBaseMediaFragment.this.f9598b - y < 0.0f) {
                        DroneBaseMediaFragment.this.f9606j = true;
                    } else {
                        DroneBaseMediaFragment.this.f9606j = false;
                    }
                }
                if (actionMasked == 0) {
                    DroneBaseMediaFragment.this.f9598b = y;
                    DroneBaseMediaFragment.this.f9607k = false;
                }
                if (actionMasked == 1) {
                    DroneBaseMediaFragment.this.f9598b = 0.0f;
                }
                return false;
            }
        });
        this.f9597a.m34316a(new C1735f.AbstractC1740b() { // from class: com.fimi.soul.module.flyplannermedia.DroneBaseMediaFragment.3
            @Override // com.fimi.soul.p168b.C1735f.AbstractC1740b
            /* renamed from: a */
            public void mo30364a(int i) {
                DroneBaseMediaFragment.this.m30375g().setText(String.format(DroneBaseMediaFragment.this.getActivity().getString(C1704R.C1707string.media_you_select_size), Integer.valueOf(i)));
            }
        });
        m30388c().setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.flyplannermedia.DroneBaseMediaFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DroneBaseMediaFragment.this.m30372h(false);
            }
        });
        m30378f().setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.flyplannermedia.DroneBaseMediaFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DroneBaseMediaFragment.this.f9603g) {
                    DroneBaseMediaFragment.this.m30392b().m34292g();
                    DroneBaseMediaFragment.this.m30378f().setText(C1704R.C1707string.select_all);
                } else {
                    DroneBaseMediaFragment.this.m30378f().setText(C1704R.C1707string.undo_select_all);
                    DroneBaseMediaFragment.this.m30392b().m34293f();
                }
                DroneBaseMediaFragment.this.f9603g = !DroneBaseMediaFragment.this.f9603g;
            }
        });
        return inflate;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        m30372h(true);
        return false;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (!m30367m().e()) {
            m30367m().m33987w().m33996b();
        }
        m30367m().a((AbstractC1791e) this);
        m30367m().a((AbstractC1792f<X11RespCmd>) this);
    }
}
