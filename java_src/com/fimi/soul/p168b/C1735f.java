package com.fimi.soul.p168b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.fimi.kernel.p158b.p160b.C1600b;
import com.fimi.kernel.p158b.p160b.C1609c;
import com.fimi.kernel.utils.C1675p;
import com.fimi.kernel.utils.C1678s;
import com.fimi.kernel.utils.C1685x;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.media.gallery.DroneImagePagerActivity;
import com.fimi.soul.media.player.FermiPlayerUtils;
import com.fimi.soul.utils.C3073ab;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3108aw;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.view.MediaImageLoadingView;
import com.fimi.soul.view.MyGridView;
import com.fimi.soul.view.StrokeDigitalView;
import com.fimi.soul.view.StrokeTextView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: com.fimi.soul.b.f */
/* loaded from: classes.dex */
public class C1735f extends BaseAdapter implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public static List<WifiDistanceFile> f4402a;

    /* renamed from: d */
    private int f4405d;

    /* renamed from: e */
    private int f4406e;

    /* renamed from: h */
    private Context f4409h;

    /* renamed from: l */
    private AbstractC1740b f4413l;

    /* renamed from: o */
    private C2083a f4416o;

    /* renamed from: p */
    private C1827d f4417p;

    /* renamed from: q */
    private float f4418q;

    /* renamed from: s */
    private MyGridView f4420s;

    /* renamed from: u */
    private HashMap f4422u;

    /* renamed from: f */
    private boolean f4407f = true;

    /* renamed from: g */
    private boolean f4408g = false;

    /* renamed from: k */
    private EnumC1739a f4412k = EnumC1739a.Normal;

    /* renamed from: m */
    private int f4414m = 0;

    /* renamed from: n */
    private boolean f4415n = false;

    /* renamed from: b */
    ExecutorService f4403b = Executors.newFixedThreadPool(3);

    /* renamed from: v */
    private HashMap<Integer, C1742d> f4423v = new HashMap<>();

    /* renamed from: c */
    Object f4404c = new Object();

    /* renamed from: w */
    private Boolean f4424w = true;

    /* renamed from: x */
    private int f4425x = 0;

    /* renamed from: y */
    private int f4426y = 0;

    /* renamed from: i */
    private List<C1743e> f4410i = new ArrayList();

    /* renamed from: j */
    private List<WifiDistanceFile> f4411j = new ArrayList();

    /* renamed from: r */
    private Set<AsyncTaskC1741c> f4419r = new HashSet();

    /* renamed from: t */
    private C3108aw f4421t = C3108aw.m29180a();

    /* renamed from: com.fimi.soul.b.f$a */
    /* loaded from: classes.dex */
    public enum EnumC1739a {
        Normal,
        Choose
    }

    /* renamed from: com.fimi.soul.b.f$b */
    /* loaded from: classes.dex */
    public interface AbstractC1740b {
        /* renamed from: a */
        void mo30364a(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.b.f$c */
    /* loaded from: classes.dex */
    public class AsyncTaskC1741c extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: a */
        String f4434a = null;

        /* renamed from: c */
        private String f4436c;

        /* renamed from: d */
        private String f4437d;

        AsyncTaskC1741c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            this.f4437d = strArr[0];
            this.f4436c = strArr[1];
            Bitmap bitmap = null;
            if (!"".equalsIgnoreCase(this.f4437d) && !new File(this.f4436c).exists()) {
                File file = new File(C3129m.m29053n());
                if (file != null && !file.exists()) {
                    file.mkdirs();
                }
                if (FermiPlayerUtils.createRemoteVideoThumbnail(this.f4437d, this.f4436c)) {
                    bitmap = BitmapFactory.decodeFile(this.f4436c);
                }
            } else if (C3073ab.m29370c(this.f4436c, C1735f.this.f4409h)) {
                bitmap = ThumbnailUtils.createVideoThumbnail(this.f4436c, 1);
                try {
                    this.f4434a = FermiPlayerUtils.getVideoDurationString(C1735f.this.f4409h, this.f4436c, "mm:ss");
                    if (C1735f.this.m34304b()) {
                        C1735f.this.f4422u.put("getdur_online" + this.f4436c, this.f4434a);
                    } else {
                        C1735f.this.f4422u.put("getdur_local" + this.f4436c, this.f4434a);
                    }
                } catch (Exception e) {
                }
            } else {
                try {
                    bitmap = C1678s.m34591a(C1735f.this.f4409h, this.f4436c, 160);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            if (bitmap != null) {
                C1735f.this.m34308a(this.f4436c, bitmap);
            }
            return bitmap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        @TargetApi(16)
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            String str = C1735f.this.m34304b() ? "getdur_online" + this.f4436c : "getdur_local" + this.f4436c;
            ImageView imageView = (ImageView) C1735f.this.f4420s.findViewWithTag(this.f4436c);
            TextView textView = (TextView) C1735f.this.f4420s.findViewWithTag(str);
            if (textView != null && this.f4434a != null) {
                textView.setVisibility(0);
                textView.setText((String) C1735f.this.f4422u.get(str));
            } else if (!C1735f.this.m34304b() && textView != null) {
                textView.setVisibility(8);
            }
            Bitmap m34309a = C1735f.this.m34309a(this.f4436c);
            if (m34309a != null && imageView != null) {
                C1735f.this.m34319a(imageView, this.f4436c, m34309a);
            }
            C1735f.this.f4419r.remove(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.fimi.soul.b.f$d */
    /* loaded from: classes.dex */
    public class C1742d {

        /* renamed from: a */
        View f4438a;

        /* renamed from: b */
        SimpleDraweeView f4439b;

        /* renamed from: c */
        ImageView f4440c;

        /* renamed from: d */
        ImageView f4441d;

        /* renamed from: e */
        MediaImageLoadingView f4442e;

        /* renamed from: f */
        StrokeDigitalView f4443f;

        /* renamed from: g */
        ImageView f4444g;

        /* renamed from: h */
        TextView f4445h;

        /* renamed from: i */
        ImageView f4446i;

        /* renamed from: j */
        StrokeTextView f4447j;

        /* renamed from: k */
        WifiDistanceFile f4448k;

        /* renamed from: l */
        int f4449l;

        /* renamed from: m */
        ImageView f4450m;

        protected C1742d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.b.f$e */
    /* loaded from: classes.dex */
    public class C1743e {

        /* renamed from: a */
        WifiDistanceFile f4452a;

        /* renamed from: b */
        boolean f4453b = false;

        public C1743e(WifiDistanceFile wifiDistanceFile) {
            this.f4452a = wifiDistanceFile;
        }
    }

    public C1735f(Context context, MyGridView myGridView) {
        this.f4422u = null;
        this.f4409h = context;
        this.f4422u = DroidPlannerApp.m34275c();
        this.f4420s = myGridView;
        this.f4418q = C1675p.m34624b(context) < ((float) C1675p.m34635a(context)) ? C1675p.m34624b(context) : C1675p.m34635a(context);
    }

    /* renamed from: a */
    private C1742d m34322a(View view) {
        C1742d c1742d = new C1742d();
        c1742d.f4440c = (ImageView) view.findViewById(C1704R.C1706id.iv_flleType);
        c1742d.f4439b = (SimpleDraweeView) view.findViewById(C1704R.C1706id.iv_thumbnail);
        c1742d.f4441d = (ImageView) view.findViewById(C1704R.C1706id.iv_downloadStatus);
        c1742d.f4442e = (MediaImageLoadingView) view.findViewById(C1704R.C1706id.iv_downloadprogress);
        c1742d.f4450m = (ImageView) view.findViewById(C1704R.C1706id.iv_downloading_mask);
        c1742d.f4443f = (StrokeDigitalView) view.findViewById(C1704R.C1706id.tv_duration);
        c1742d.f4438a = view.findViewById(C1704R.C1706id.v_blackMask);
        c1742d.f4444g = (ImageView) view.findViewById(C1704R.C1706id.iv_selected);
        c1742d.f4445h = (TextView) view.findViewById(C1704R.C1706id.tv_progress);
        c1742d.f4446i = (ImageView) view.findViewById(C1704R.C1706id.mask_iv);
        c1742d.f4447j = (StrokeTextView) view.findViewById(C1704R.C1706id.tv_is_down);
        C3103au.m29232a(this.f4409h.getAssets(), c1742d.f4445h);
        return c1742d;
    }

    /* renamed from: a */
    private void m34324a(int i, int i2) {
        String path;
        String str;
        for (int i3 = i; i3 < i + i2; i3++) {
            try {
                WifiDistanceFile wifiDistanceFile = this.f4411j.get(i3);
                if (wifiDistanceFile.getDownloadTaskInfo() == null) {
                    if (m34304b() && wifiDistanceFile.getType() == 2) {
                        String name = wifiDistanceFile.getName();
                        String remoteThmUrl = wifiDistanceFile.getRemoteThmUrl();
                        path = C3129m.m29068a(name, wifiDistanceFile.getDateString());
                        str = remoteThmUrl;
                    } else if (wifiDistanceFile.getType() == 1) {
                        path = wifiDistanceFile.getLocalThumbnailPath();
                        str = "";
                    } else {
                        path = wifiDistanceFile.getPath();
                        str = "";
                    }
                    if (path != null) {
                        String replace = path.replace("file://", "");
                        String str2 = "getdur" + replace;
                        Bitmap m34309a = m34309a(replace);
                        String str3 = (String) this.f4422u.get(str2);
                        if (m34309a == null) {
                            AsyncTaskC1741c asyncTaskC1741c = new AsyncTaskC1741c();
                            this.f4419r.add(asyncTaskC1741c);
                            asyncTaskC1741c.executeOnExecutor(this.f4403b, str, replace);
                        } else {
                            ImageView imageView = (ImageView) this.f4420s.findViewWithTag(replace);
                            TextView textView = (TextView) this.f4420s.findViewWithTag(str2);
                            if (!m34304b() && wifiDistanceFile.getType() == 2) {
                                if (textView != null && str3 != null) {
                                    textView.setVisibility(0);
                                    textView.setText((String) this.f4422u.get(str2));
                                } else if (textView != null) {
                                    textView.setVisibility(8);
                                }
                            }
                            if (imageView != null && m34309a != null) {
                                m34319a(imageView, replace, m34309a);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(16)
    /* renamed from: a */
    public void m34319a(ImageView imageView, String str, Bitmap bitmap) {
        if (bitmap == null) {
            imageView.setBackgroundResource(C1704R.C1705drawable.friends_sends_pictures_no);
            return;
        }
        imageView.setBackground(C1678s.m34590a(bitmap));
        imageView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(16)
    /* renamed from: a */
    public void m34318a(C1600b.EnumC1602a enumC1602a, C1742d c1742d) {
        ImageView imageView = c1742d.f4441d;
        String localDownloadCachePath = c1742d.f4448k.getLocalDownloadCachePath();
        switch (enumC1602a) {
            case Wait:
                c1742d.f4445h.setVisibility(0);
                imageView.setImageResource(C1704R.C1705drawable.download_icon);
                return;
            case Pause:
                c1742d.f4445h.setText(C1704R.C1707string.pasued);
                c1742d.f4445h.setVisibility(0);
                imageView.setImageResource(C1704R.C1705drawable.download_icon);
                return;
            case Error:
                c1742d.f4445h.setText(C1704R.C1707string.down_media_false);
                imageView.setImageResource(C1704R.C1705drawable.continue_icon);
                c1742d.f4442e.m28879b();
                return;
            case Downloading:
                imageView.setImageResource(C1704R.C1705drawable.pause_icon);
                c1742d.f4442e.m28880a();
                Bitmap m34309a = m34309a(localDownloadCachePath);
                if (m34309a != null) {
                    c1742d.f4450m.setVisibility(0);
                    c1742d.f4439b.setBackground(C1678s.m34590a(m34309a));
                } else {
                    c1742d.f4450m.setVisibility(8);
                    c1742d.f4439b.setBackgroundResource(C1704R.C1705drawable.friends_sends_pictures_no);
                }
                imageView.setVisibility(0);
                return;
            case Completed:
                c1742d.f4442e.setVisibility(8);
                c1742d.f4445h.setVisibility(8);
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
                c1742d.f4450m.setVisibility(8);
                return;
            default:
                return;
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private void m34315a(C1742d c1742d, int i, C1600b c1600b) {
        String str;
        String path;
        if (m34304b() && c1742d.f4448k.getType() == 2) {
            String name = c1742d.f4448k.getName();
            String remoteThmUrl = c1742d.f4448k.getRemoteThmUrl();
            String m29068a = C3129m.m29068a(name, c1742d.f4448k.getDateString());
            c1742d.f4448k.setLocalThumbnailPath(m29068a);
            str = remoteThmUrl;
            path = m29068a;
        } else if (!m34304b() && c1600b != null && c1600b.m35024g() != C1600b.EnumC1602a.Completed) {
            str = "";
            path = c1742d.f4448k.getLocalDownloadCachePath();
        } else if (c1742d.f4448k.getType() == 1) {
            str = "";
            path = c1742d.f4448k.getLocalThumbnailPath();
        } else {
            str = "";
            path = c1742d.f4448k.getPath();
        }
        if (path == null) {
            return;
        }
        String replace = path.replace("file://", "");
        String str2 = m34304b() ? "getdur_online" + replace : "getdur_local" + replace;
        if (!m34304b() && c1742d.f4448k.getType() == 2) {
            c1742d.f4443f.setTag(str2);
            String str3 = (String) this.f4422u.get(str2);
            if (str3 != null) {
                c1742d.f4443f.setVisibility(0);
                c1742d.f4443f.setText(str3);
            } else if (c1742d.f4448k.getDurationString() != null) {
                c1742d.f4443f.setVisibility(0);
                c1742d.f4443f.setText(c1742d.f4448k.getDurationString());
            } else {
                c1742d.f4443f.setVisibility(8);
            }
        }
        c1742d.f4439b.setTag(replace);
        c1742d.f4443f.setTag(str2);
        Bitmap m34309a = m34309a(replace);
        if (c1600b == null || c1600b.m35024g() == C1600b.EnumC1602a.Completed) {
            c1742d.f4450m.setVisibility(8);
        } else {
            c1742d.f4450m.setVisibility(0);
        }
        m34319a(c1742d.f4439b, replace, m34309a);
        if (i >= 12 || m34309a != null) {
            return;
        }
        m34307a(replace, c1742d.f4439b);
        AsyncTaskC1741c asyncTaskC1741c = new AsyncTaskC1741c();
        this.f4419r.add(asyncTaskC1741c);
        asyncTaskC1741c.executeOnExecutor(this.f4403b, str, replace);
    }

    @TargetApi(16)
    /* renamed from: a */
    private void m34307a(String str, ImageView imageView) {
        Bitmap m34309a = m34309a(str);
        imageView.setBackground(null);
        if (m34309a != null) {
            imageView.setBackground(C1678s.m34590a(m34309a));
        } else {
            imageView.setBackgroundResource(C1704R.C1705drawable.friends_sends_pictures_no);
        }
    }

    /* renamed from: a */
    public Bitmap m34309a(String str) {
        if (str == null) {
            return null;
        }
        return this.f4421t.mo29179a(str);
    }

    /* renamed from: a */
    public void m34326a() {
        this.f4408g = true;
    }

    /* renamed from: a */
    public void m34325a(int i) {
        this.f4410i.remove(i);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void m34323a(int i, C1742d c1742d) {
        boolean z = false;
        if (this.f4412k != EnumC1739a.Choose) {
            return;
        }
        if (i >= 0 && i < this.f4410i.size()) {
            C1743e c1743e = this.f4410i.get(i);
            Log.d("Good", "total " + this.f4410i.size() + " index " + i);
            if (c1743e.f4453b) {
                this.f4414m--;
                c1742d.f4444g.setVisibility(8);
                c1742d.f4446i.setVisibility(8);
            } else {
                this.f4414m++;
                c1742d.f4444g.setVisibility(0);
                c1742d.f4446i.setVisibility(0);
            }
            if (!c1743e.f4453b) {
                z = true;
            }
            c1743e.f4453b = z;
        }
        if (this.f4413l == null) {
            return;
        }
        this.f4413l.mo30364a(this.f4414m);
    }

    /* renamed from: a */
    public void m34321a(AbsListView absListView, int i) {
        if (i != 0) {
            m34289j();
            this.f4424w = false;
            return;
        }
        m34324a(this.f4405d, this.f4406e);
        this.f4424w = true;
        this.f4425x = this.f4405d;
        this.f4426y = this.f4406e;
    }

    /* renamed from: a */
    public void m34320a(AbsListView absListView, int i, int i2, int i3) {
        this.f4405d = i;
        this.f4406e = i2;
        if (this.f4407f && i2 > 0) {
            m34324a(i, i2);
            this.f4407f = false;
        }
        if (!this.f4424w.booleanValue() || this.f4425x + this.f4426y >= this.f4405d + this.f4406e) {
            return;
        }
        this.f4425x = this.f4405d;
        this.f4426y = this.f4406e;
        m34324a(this.f4405d, this.f4406e);
    }

    /* renamed from: a */
    public void m34317a(EnumC1739a enumC1739a) {
        this.f4412k = enumC1739a;
    }

    /* renamed from: a */
    public void m34316a(AbstractC1740b abstractC1740b) {
        this.f4413l = abstractC1740b;
    }

    /* renamed from: a */
    public void m34311a(C2083a c2083a) {
        this.f4416o = c2083a;
    }

    /* renamed from: a */
    public void m34310a(WifiDistanceFile wifiDistanceFile) {
        if (!this.f4411j.contains(wifiDistanceFile)) {
            this.f4411j.add(wifiDistanceFile);
            this.f4410i.add(new C1743e(wifiDistanceFile));
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void m34308a(String str, Bitmap bitmap) {
        if (m34309a(str) == null) {
            this.f4421t.mo29177a(str, bitmap);
        }
    }

    /* renamed from: a */
    public void m34306a(List<WifiDistanceFile> list) {
        ArrayList arrayList = new ArrayList();
        for (WifiDistanceFile wifiDistanceFile : list) {
            arrayList.add(new C1743e(wifiDistanceFile));
        }
        this.f4410i = arrayList;
        this.f4411j = list;
    }

    /* renamed from: a */
    public void m34305a(boolean z) {
        this.f4415n = z;
    }

    /* renamed from: b */
    public void m34302b(WifiDistanceFile wifiDistanceFile) {
        if (this.f4411j.contains(wifiDistanceFile)) {
            int indexOf = this.f4411j.indexOf(wifiDistanceFile);
            this.f4411j.remove(indexOf);
            this.f4410i.remove(indexOf);
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void m34301b(String str) {
        Iterator<C1743e> it2 = this.f4410i.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1743e next = it2.next();
            if (next.f4452a.getPath().equals(str)) {
                this.f4410i.remove(next);
                break;
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public boolean m34304b() {
        return this.f4415n;
    }

    /* renamed from: c */
    public List<WifiDistanceFile> m34300c() {
        ArrayList arrayList = new ArrayList();
        for (C1743e c1743e : this.f4410i) {
            if (c1743e.f4453b) {
                arrayList.add(c1743e.f4452a);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public void m34298c(WifiDistanceFile wifiDistanceFile) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f4411j.size()) {
                if (wifiDistanceFile.getName().equals(this.f4411j.get(i2).getName())) {
                    this.f4411j.remove(i2);
                    this.f4410i.remove(i2);
                    notifyDataSetChanged();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public List<WifiDistanceFile> m34297d() {
        return this.f4411j;
    }

    /* renamed from: e */
    public EnumC1739a m34295e() {
        return this.f4412k;
    }

    /* renamed from: f */
    public void m34293f() {
        for (C1743e c1743e : this.f4410i) {
            c1743e.f4453b = true;
        }
        this.f4414m = this.f4410i.size();
        if (this.f4413l != null) {
            this.f4413l.mo30364a(this.f4414m);
        }
        notifyDataSetChanged();
    }

    /* renamed from: g */
    public void m34292g() {
        for (C1743e c1743e : this.f4410i) {
            c1743e.f4453b = false;
        }
        this.f4414m = 0;
        if (this.f4413l != null) {
            this.f4413l.mo30364a(this.f4414m);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f4410i != null) {
            return this.f4410i.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f4410i.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    @TargetApi(16)
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1742d c1742d;
        this.f4420s = (MyGridView) viewGroup;
        C1743e c1743e = this.f4410i.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.f4409h).inflate(C1704R.layout.item_thumbnail_info, (ViewGroup) null);
            c1742d = m34322a(view);
            c1742d.f4448k = c1743e.f4452a;
            view.setLayoutParams(new AbsListView.LayoutParams(-1, (int) (((this.f4418q - C1675p.m34634a(this.f4409h, 50.0f)) - (4.0f * C1675p.m34634a(this.f4409h, 5.0f))) / 3.0f)));
            view.setTag(c1742d);
        } else {
            c1742d = (C1742d) view.getTag();
        }
        c1742d.f4449l = i;
        final C1600b downloadTaskInfo = c1743e.f4452a.getDownloadTaskInfo();
        if (!this.f4408g) {
            this.f4423v.put(Integer.valueOf(i), c1742d);
        }
        if (!this.f4415n) {
            if (downloadTaskInfo != null) {
                downloadTaskInfo.m35042a(Integer.valueOf(i));
                downloadTaskInfo.m35051a(new C1600b.AbstractC1606d() { // from class: com.fimi.soul.b.f.1
                    @Override // com.fimi.kernel.p158b.p160b.C1600b.AbstractC1606d
                    /* renamed from: a */
                    public void mo31727a(C1600b.EnumC1602a enumC1602a, C1600b c1600b) {
                        if (c1600b.m35018j() != null) {
                            int intValue = ((Integer) c1600b.m35018j()).intValue();
                            C1742d c1742d2 = (C1742d) C1735f.this.f4423v.get(Integer.valueOf(intValue));
                            if (c1742d2.f4449l != intValue) {
                                return;
                            }
                            C1609c m34997a = C1609c.m34997a(C1735f.this.f4409h);
                            if (enumC1602a == C1600b.EnumC1602a.Error) {
                                if (c1600b == null) {
                                    return;
                                }
                                m34997a.m34988c();
                                C1735f.this.m34318a(enumC1602a, c1742d2);
                                return;
                            }
                            long m35016k = c1600b.m35016k() / (c1600b.m35020i() / 100);
                            String replace = c1742d2.f4445h.getText().toString().substring(3).replace("%", "");
                            if (!C3103au.m29203e(replace) || replace.equals("")) {
                                c1742d2.f4445h.setText(String.format(C1735f.this.f4409h.getString(C1704R.C1707string.downing_media), m35016k + "%"));
                                c1742d2.f4442e.setVisibility(0);
                                c1742d2.f4442e.setSweepAngle((float) m35016k);
                                C1735f.this.m34318a(enumC1602a, c1742d2);
                                return;
                            }
                            long parseLong = Long.parseLong(replace);
                            if (c1600b.m35024g() != C1600b.EnumC1602a.Completed) {
                                if (parseLong == m35016k) {
                                    return;
                                }
                                if (c1600b.m35056a() != null) {
                                    c1742d2.f4443f.setVisibility(0);
                                    c1742d2.f4443f.setText(c1600b.m35056a());
                                }
                                c1742d2.f4445h.setVisibility(0);
                                c1742d2.f4445h.setText(String.format(C1735f.this.f4409h.getString(C1704R.C1707string.downing_media), m35016k + "%"));
                                c1742d2.f4442e.setVisibility(0);
                                c1742d2.f4442e.setSweepAngle((float) m35016k);
                                C1735f.this.m34318a(enumC1602a, c1742d2);
                                return;
                            }
                            C1735f.this.m34318a(c1600b.m35024g(), c1742d2);
                            if (c1600b.m35010n() != null) {
                                String replace2 = c1600b.m35022h().replace("file://", "");
                                C1735f.this.m34308a(replace2, c1600b.m35010n());
                                C1735f.this.m34319a(c1742d2.f4439b, replace2, c1600b.m35010n());
                                if (c1600b.m35056a() != null) {
                                    C1735f.this.f4422u.put("getdur_local" + replace2, c1600b.m35056a());
                                    c1742d2.f4443f.setVisibility(0);
                                    c1742d2.f4443f.setText(c1600b.m35056a());
                                }
                            }
                            m34997a.m34995a(c1600b);
                            m34997a.m34998a();
                        }
                    }
                });
            }
        } else if (!C1783b.m34151c(c1743e.f4452a.getName())) {
            c1742d.f4447j.setVisibility(0);
            c1742d.f4447j.setText(this.f4409h.getString(C1704R.C1707string.no_down));
        } else {
            c1742d.f4447j.setVisibility(8);
        }
        if (c1743e.f4453b) {
            c1742d.f4444g.setVisibility(0);
            c1742d.f4446i.setVisibility(0);
        } else {
            c1742d.f4444g.setVisibility(8);
            c1742d.f4446i.setVisibility(8);
        }
        c1742d.f4448k = c1743e.f4452a;
        c1742d.f4440c.setVisibility(8);
        c1742d.f4443f.setVisibility(4);
        c1742d.f4441d.setVisibility(4);
        c1742d.f4442e.setVisibility(4);
        c1742d.f4439b.setBackgroundResource(C1704R.C1705drawable.friends_sends_pictures_no);
        c1742d.f4439b.invalidate();
        c1742d.f4439b.setTag(null);
        c1742d.f4445h.setVisibility(4);
        if (downloadTaskInfo != null) {
            c1742d.f4441d.setVisibility(0);
            c1742d.f4442e.setVisibility(0);
            long m35016k = downloadTaskInfo.m35016k() / (downloadTaskInfo.m35020i() / 100);
            c1742d.f4445h.setVisibility(0);
            c1742d.f4442e.setSweepAngle((float) m35016k);
            c1742d.f4445h.setText(String.format(this.f4409h.getString(C1704R.C1707string.downing_media), m35016k + "%"));
            if (m35016k == 100) {
                downloadTaskInfo.m35026f();
            }
            String localDownloadCachePath = c1742d.f4448k.getLocalDownloadCachePath();
            switch (downloadTaskInfo.m35024g()) {
                case Wait:
                case Downloading:
                    Bitmap m34309a = m34309a(localDownloadCachePath);
                    if (m34309a != null) {
                        c1742d.f4450m.setVisibility(0);
                        c1742d.f4439b.setBackground(C1678s.m34590a(m34309a));
                    } else {
                        c1742d.f4450m.setVisibility(8);
                        c1742d.f4439b.setBackgroundResource(C1704R.C1705drawable.friends_sends_pictures_no);
                    }
                    c1742d.f4441d.setImageResource(C1704R.C1705drawable.pause_icon);
                    c1742d.f4442e.m28880a();
                    break;
                case Pause:
                    c1742d.f4445h.setText(C1704R.C1707string.pasued);
                    c1742d.f4441d.setImageResource(C1704R.C1705drawable.download_icon);
                    c1742d.f4442e.m28880a();
                    break;
                case Error:
                    Bitmap m34309a2 = m34309a(localDownloadCachePath);
                    if (m34309a2 != null) {
                        c1742d.f4450m.setVisibility(0);
                        c1742d.f4439b.setBackground(C1678s.m34590a(m34309a2));
                    } else {
                        c1742d.f4450m.setVisibility(8);
                        c1742d.f4439b.setBackgroundResource(C1704R.C1705drawable.friends_sends_pictures_no);
                    }
                    c1742d.f4445h.setText(C1704R.C1707string.down_media_false);
                    c1742d.f4441d.setImageResource(C1704R.C1705drawable.continue_icon);
                    c1742d.f4442e.m28879b();
                    break;
                case Completed:
                    c1742d.f4441d.setVisibility(8);
                    c1742d.f4442e.setVisibility(8);
                    c1742d.f4445h.setVisibility(8);
                    c1743e.f4452a.setDownloadTaskInfo(null);
                    m34315a(c1742d, i, downloadTaskInfo);
                    C1685x.m34457a(new Runnable() { // from class: com.fimi.soul.b.f.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C1609c.m34997a(C1735f.this.f4409h).m34995a(downloadTaskInfo);
                        }
                    });
                    break;
            }
        }
        if (c1742d.f4448k.getType() == 2) {
            c1742d.f4440c.setVisibility(0);
            if (c1742d.f4448k.getDurationString() != null) {
                c1742d.f4443f.setVisibility(0);
                c1742d.f4443f.setText(c1742d.f4448k.getDurationString());
            } else {
                c1742d.f4443f.setVisibility(8);
            }
        }
        if (this.f4408g) {
            this.f4408g = false;
        } else {
            m34315a(c1742d, i, downloadTaskInfo);
        }
        return view;
    }

    /* renamed from: h */
    public void m34291h() {
        this.f4411j.clear();
        this.f4410i.clear();
        notifyDataSetChanged();
    }

    /* renamed from: i */
    protected C1827d m34290i() {
        if (this.f4417p == null) {
            this.f4417p = (C1827d) C1783b.m34166a().m34150d();
        }
        return this.f4417p;
    }

    /* renamed from: j */
    public void m34289j() {
        if (this.f4419r != null) {
            for (AsyncTaskC1741c asyncTaskC1741c : this.f4419r) {
                asyncTaskC1741c.cancel(false);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f4415n && !m34290i().e()) {
            C1688z.m34449a(this.f4409h, (int) C1704R.C1707string.no_connect_camera, C1688z.f4191b);
            return;
        }
        f4402a = new ArrayList();
        C1742d c1742d = (C1742d) view.getTag();
        if (this.f4412k == EnumC1739a.Choose) {
            m34323a(i, c1742d);
            return;
        }
        C1743e c1743e = this.f4410i.get(i);
        C1600b downloadTaskInfo = c1743e.f4452a.getDownloadTaskInfo();
        if (downloadTaskInfo != null && downloadTaskInfo.m35024g() != C1600b.EnumC1602a.Completed) {
            switch (downloadTaskInfo.m35024g()) {
                case Wait:
                    downloadTaskInfo.m35029e();
                    c1742d.f4445h.setText(this.f4409h.getResources().getString(C1704R.C1707string.pasued));
                    c1742d.f4441d.setImageResource(C1704R.C1705drawable.download_icon);
                    c1742d.f4442e.m28880a();
                    return;
                case Pause:
                case Error:
                    long m35016k = downloadTaskInfo.m35016k() / (downloadTaskInfo.m35020i() / 100);
                    Log.d("Good", "执行点击事件" + downloadTaskInfo.m35024g());
                    if (C1609c.m34997a(this.f4409h).m34990b() < 3) {
                        downloadTaskInfo.m35035c();
                    } else {
                        downloadTaskInfo.m35032d();
                    }
                    c1742d.f4441d.setImageResource(C1704R.C1705drawable.pause_icon);
                    c1742d.f4442e.m28880a();
                    c1742d.f4445h.setText(String.format(this.f4409h.getString(C1704R.C1707string.downing_media), m35016k + "%"));
                    return;
                case Downloading:
                    Log.d("Good", "执行点击事件->停止");
                    downloadTaskInfo.m35029e();
                    c1742d.f4445h.setText(this.f4409h.getResources().getString(C1704R.C1707string.pasued));
                    c1742d.f4441d.setImageResource(C1704R.C1705drawable.download_icon);
                    c1742d.f4442e.m28880a();
                    C1609c.m34997a(this.f4409h).m34988c();
                    return;
                default:
                    return;
            }
        }
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Intent intent = new Intent(this.f4409h, DroneImagePagerActivity.class);
            int i2 = 0;
            int i3 = i;
            while (i2 < this.f4410i.size()) {
                C1743e c1743e2 = this.f4410i.get(i2);
                if (this.f4415n) {
                    if (c1743e2.f4452a.getType() == 2) {
                        arrayList.add(c1743e2.f4452a.getRemoteThmUrl() + "&&" + c1743e2.f4452a.getRemoteUrl());
                        arrayList3.add(c1743e2.f4452a.getDurationString());
                    } else {
                        arrayList.add(c1743e2.f4452a.getRemoteUrl());
                        arrayList3.add("");
                    }
                    arrayList2.add(c1743e2.f4452a.getLocalThumbnailPath());
                    f4402a.add(this.f4410i.get(i2).f4452a);
                    intent.putExtra(DroneImagePagerActivity.f7803d, true);
                } else {
                    C1600b downloadTaskInfo2 = c1743e2.f4452a.getDownloadTaskInfo();
                    if (downloadTaskInfo2 != null && downloadTaskInfo2.m35024g() == C1600b.EnumC1602a.Completed) {
                        arrayList.add(c1743e2.f4452a.getLocalThumbnailPath());
                        arrayList2.add(c1743e2.f4452a.getPath());
                    }
                    if (downloadTaskInfo2 == null) {
                        arrayList.add(c1743e2.f4452a.getLocalThumbnailPath());
                        arrayList2.add(c1743e2.f4452a.getPath());
                    }
                    intent.putExtra(DroneImagePagerActivity.f7803d, false);
                }
                i2++;
                i3 = c1743e.f4452a == c1743e2.f4452a ? arrayList.size() - 1 : i3;
            }
            intent.putExtra("image_urls", arrayList);
            intent.putExtra(DroneImagePagerActivity.f7804e, arrayList2);
            intent.putExtra("image_index", i3);
            intent.putExtra(DroneImagePagerActivity.f7801b, c1743e.f4452a.getType());
            intent.putExtra(DroneImagePagerActivity.f7805f, arrayList3);
            ((Activity) this.f4409h).startActivityForResult(intent, 0);
            ((Activity) this.f4409h).overridePendingTransition(17432576, 17432577);
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }
    }
}
