package com.fimi.soul.module.setting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.manager.AbstractC1966g;
import com.fimi.soul.biz.manager.C2004u;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.utils.C3144w;
import com.fimi.soul.view.ImageLoadingView;
import com.google.firebase.p253b.C9755a;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.List;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.module.setting.e */
/* loaded from: classes.dex */
public class C2913e extends BaseAdapter implements AbstractC1966g, C2004u.AbstractC2008b {

    /* renamed from: a */
    Context f10404a;

    /* renamed from: b */
    List<C2918f> f10405b;

    /* renamed from: c */
    C2004u f10406c;

    /* renamed from: d */
    ListView f10407d;

    /* renamed from: e */
    boolean f10408e = false;

    /* renamed from: f */
    boolean f10409f = false;

    /* renamed from: g */
    C2917c f10410g;

    /* renamed from: h */
    private long f10411h;

    /* renamed from: i */
    private EnumC2915a f10412i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.module.setting.e$a */
    /* loaded from: classes.dex */
    public enum EnumC2915a {
        HeadView,
        BodyView
    }

    /* renamed from: com.fimi.soul.module.setting.e$b */
    /* loaded from: classes.dex */
    class C2916b {

        /* renamed from: a */
        TextView f10418a;

        C2916b() {
        }
    }

    /* renamed from: com.fimi.soul.module.setting.e$c */
    /* loaded from: classes.dex */
    class C2917c {

        /* renamed from: a */
        TextView f10420a;

        /* renamed from: b */
        TextView f10421b;

        /* renamed from: c */
        TextView f10422c;

        /* renamed from: d */
        ImageLoadingView f10423d;

        /* renamed from: e */
        ImageView f10424e;

        /* renamed from: f */
        ImageView f10425f;

        /* renamed from: g */
        ImageView f10426g;

        /* renamed from: h */
        RelativeLayout f10427h;

        C2917c() {
        }
    }

    public C2913e(Context context, List<C2918f> list, ListView listView) {
        this.f10404a = context;
        this.f10405b = list;
        this.f10407d = listView;
        this.f10406c = C2004u.m33297a(this.f10404a);
        this.f10406c.m33296a((AbstractC1966g) this);
        this.f10406c.m33295a((C2004u.AbstractC2008b) this);
    }

    /* renamed from: a */
    private void m29987a(String str, int i) {
        if (this.f10405b == null || this.f10405b.size() <= 0) {
            return;
        }
        if (str.endsWith(C2918f.f10429a)) {
            if (i != 100) {
                return;
            }
            if (!(str.endsWith(C2918f.f10429a) && (str.contains(new StringBuilder().append(C3129m.m29051p()).append("/").append(C3129m.m29049r()).toString()) || str.contains(new StringBuilder().append(C3129m.m29051p()).append("/").append(C3129m.m29050q()).toString())))) {
                return;
            }
            m29989a(new File(str));
            return;
        }
        for (C2918f c2918f : this.f10405b) {
            if (c2918f.m29938v().equals(str)) {
                if (i == 100) {
                    c2918f.m29974a(2);
                    c2918f.m29957e(c2918f.m29939u().replace(".", "&synced."));
                    notifyDataSetChanged();
                    if (c2918f.m29956f() > 1) {
                        m29990a(c2918f);
                    }
                } else if (i > 0) {
                    c2918f.m29974a(1);
                } else {
                    c2918f.m29974a(0);
                }
                c2918f.m29968b(i);
            }
        }
    }

    /* renamed from: a */
    public void m29995a(int i) {
        C2918f c2918f = this.f10405b.get(i);
        if (c2918f != null) {
            this.f10405b.get(i).m29970a(!c2918f.m29940t());
        }
        notifyDataSetChanged();
    }

    @Override // com.fimi.soul.biz.manager.AbstractC1966g
    /* renamed from: a */
    public void mo29994a(int i, String str) {
        if (!str.endsWith(C2918f.f10429a) && i > 0) {
            ImageLoadingView imageLoadingView = (ImageLoadingView) this.f10407d.findViewWithTag("log_" + str);
            if (imageLoadingView != null) {
                imageLoadingView.m28887a();
                imageLoadingView.setSweepAngle(i);
            }
            TextView textView = (TextView) this.f10407d.findViewWithTag("percent_" + str);
            ImageView imageView = (ImageView) this.f10407d.findViewWithTag("load_" + str);
            if (textView != null) {
                if (i >= 100 || i <= 0) {
                    textView.setText(String.format("%s", this.f10404a.getString(C1704R.C1707string.fly_finish_over)));
                    if (imageView != null) {
                        imageView.setImageResource(C1704R.C1705drawable.icon_upload_ok);
                    }
                    m29989a(new File(str));
                } else {
                    textView.setText(String.format("%s | %s%s", this.f10404a.getString(C1704R.C1707string.fly_uploading), Integer.valueOf(i), "%"));
                    imageView.setImageResource(C1704R.C1705drawable.icon_download_pause);
                }
            }
        }
        m29987a(str, i);
    }

    @Override // com.fimi.soul.biz.manager.C2004u.AbstractC2008b
    /* renamed from: a */
    public void mo29993a(PlaneMsg planeMsg, String str) {
        if (planeMsg != null && !planeMsg.isSuccess()) {
            if (!str.endsWith(C2918f.f10429a)) {
                ImageLoadingView imageLoadingView = (ImageLoadingView) this.f10407d.findViewWithTag("log_" + str);
                TextView textView = (TextView) this.f10407d.findViewWithTag("percent_" + str);
                ImageView imageView = (ImageView) this.f10407d.findViewWithTag("load_" + str);
                if (imageView != null) {
                    imageView.setImageResource(C1704R.C1705drawable.icon_download_continue);
                }
                if (textView != null) {
                    textView.setText(this.f10404a.getString(C1704R.C1707string.fly_upload_fail));
                }
            }
            this.f10406c.m33279d(new File(str));
        }
        if (str.endsWith(C2918f.f10429a) || this.f10405b == null || this.f10405b.size() <= 0) {
            return;
        }
        for (C2918f c2918f : this.f10405b) {
            if (c2918f != null && c2918f.m29938v().equals(str)) {
                c2918f.m29974a(0);
                return;
            }
        }
    }

    /* renamed from: a */
    public void m29990a(C2918f c2918f) {
        if (!c2918f.m29939u().contains(".fc")) {
            return;
        }
        List<C2918f> m29975a = c2918f.m29975a();
        for (int i = 0; i < m29975a.size(); i++) {
            C2918f c2918f2 = m29975a.get(i);
            if (!c2918f2.m29939u().contains("&synced.")) {
                this.f10406c.m33290a(new File(c2918f2.m29938v()));
            }
        }
        List<C2918f> m29969b = c2918f.m29969b();
        for (int i2 = 0; i2 < m29969b.size(); i2++) {
            C2918f c2918f3 = m29969b.get(i2);
            if (!c2918f3.m29939u().contains("&synced.")) {
                this.f10406c.m33290a(new File(c2918f3.m29938v()));
            }
        }
        List<C2918f> m29963c = c2918f.m29963c();
        for (int i3 = 0; i3 < m29963c.size(); i3++) {
            C2918f c2918f4 = m29963c.get(i3);
            if (!c2918f4.m29939u().contains("&synced.")) {
                this.f10406c.m33290a(new File(c2918f4.m29938v()));
            }
        }
    }

    /* renamed from: a */
    void m29989a(File file) {
        if (file.exists()) {
            file.renameTo(new File(file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf("/") + 1) + file.getName().replace(".", "&synced.")));
        }
    }

    /* renamed from: a */
    public void m29988a(String str) {
        String replace = str.replace("&synced", "").replace(".fc", "");
        File file = new File(C3129m.m29051p() + "/" + C3129m.m29050q() + "/" + replace);
        File file2 = new File(C3129m.m29051p() + "/" + C3129m.m29049r() + "/" + replace);
        C3144w c3144w = new C3144w();
        if (file2 != null) {
            c3144w.m29018a(file2);
        }
        if (file != null) {
            c3144w.m29018a(file);
        }
    }

    /* renamed from: a */
    public void m29986a(List<C2918f> list) {
        if (list != null) {
            this.f10405b = list;
            m29980c();
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void m29985a(boolean z) {
        this.f10408e = z;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public boolean m29996a() {
        return this.f10408e;
    }

    /* renamed from: b */
    public void m29983b(C2918f c2918f) {
        if (c2918f != null) {
            if (!c2918f.m29939u().endsWith(".sf") && !c2918f.m29939u().endsWith(".txt") && !c2918f.m29939u().endsWith(".fc") && !c2918f.m29939u().endsWith(".pb")) {
                return;
            }
            this.f10406c.m33290a(new File(c2918f.m29938v()));
            c2918f.m29961c(true);
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public void m29982b(List<C2918f> list) {
        synchronized (this.f10405b) {
            if (list != null) {
                if (list.size() > 0) {
                    for (C2918f c2918f : list) {
                        int size = this.f10405b.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                C2918f c2918f2 = this.f10405b.get(size);
                                if (c2918f.m29939u().equals(c2918f2.m29939u())) {
                                    if (c2918f2.m29956f() > 1) {
                                        m29988a(c2918f2.m29939u());
                                    }
                                    this.f10405b.remove(c2918f2);
                                } else {
                                    size--;
                                }
                            }
                        }
                    }
                }
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void m29981b(boolean z) {
        this.f10409f = z;
    }

    /* renamed from: b */
    public boolean m29984b() {
        return this.f10409f;
    }

    /* renamed from: c */
    public void m29980c() {
        if (this.f10405b == null || this.f10405b.size() <= 0) {
            return;
        }
        for (C2918f c2918f : this.f10405b) {
            if (c2918f.m29956f() > 1 && c2918f.m29939u().contains("&synced")) {
                m29990a(c2918f);
            }
        }
    }

    /* renamed from: c */
    public void m29979c(boolean z) {
        this.f10409f = z;
        for (C2918f c2918f : this.f10405b) {
            c2918f.m29970a(z);
        }
        notifyDataSetChanged();
    }

    /* renamed from: d */
    public void m29978d() {
        if (this.f10406c != null) {
            this.f10406c.m33296a((AbstractC1966g) null);
            this.f10406c.m33284c();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f10405b != null) {
            return this.f10405b.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (this.f10405b != null) {
            return this.f10405b.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        C2918f c2918f;
        return (this.f10405b == null || i >= this.f10405b.size() || this.f10405b.size() <= 0 || (c2918f = this.f10405b.get(i)) == null || !c2918f.m29977A()) ? EnumC2915a.BodyView.ordinal() : EnumC2915a.HeadView.ordinal();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C2916b c2916b;
        String[] split;
        String replaceAll;
        String[] split2;
        if (getItemViewType(i) == EnumC2915a.BodyView.ordinal()) {
            if (view == null) {
                this.f10410g = new C2917c();
                view = LinearLayout.inflate(this.f10404a, C1704R.layout.fly_logs_item, null);
                this.f10410g.f10420a = (TextView) view.findViewById(C1704R.C1706id.log_name);
                this.f10410g.f10421b = (TextView) view.findViewById(C1704R.C1706id.log_size);
                this.f10410g.f10422c = (TextView) view.findViewById(C1704R.C1706id.upload_status);
                this.f10410g.f10423d = (ImageLoadingView) view.findViewById(C1704R.C1706id.upload_icon);
                this.f10410g.f10424e = (ImageView) view.findViewById(C1704R.C1706id.upload_v);
                this.f10410g.f10427h = (RelativeLayout) view.findViewById(C1704R.C1706id.upload_layout);
                this.f10410g.f10425f = (ImageView) view.findViewById(C1704R.C1706id.select_icon);
                this.f10410g.f10426g = (ImageView) view.findViewById(C1704R.C1706id.head_arrow);
                view.setTag(this.f10410g);
                C3103au.m29232a(this.f10404a.getAssets(), this.f10410g.f10420a, this.f10410g.f10421b, this.f10410g.f10422c);
            } else {
                this.f10410g = (C2917c) view.getTag();
            }
            final C2918f c2918f = this.f10405b.get(i);
            this.f10410g.f10423d.setTag("log_" + c2918f.m29938v());
            this.f10410g.f10422c.setTag("percent_" + c2918f.m29938v());
            this.f10410g.f10424e.setTag("load_" + c2918f.m29938v());
            if (this.f10408e) {
                this.f10410g.f10427h.setVisibility(8);
                if (c2918f.m29937w() == 0 || c2918f.m29937w() == 2) {
                    this.f10410g.f10425f.setVisibility(0);
                } else {
                    this.f10410g.f10425f.setVisibility(4);
                }
                this.f10410g.f10422c.setVisibility(8);
                this.f10410g.f10426g.setVisibility(8);
            } else {
                this.f10410g.f10427h.setVisibility(0);
                this.f10410g.f10425f.setVisibility(8);
                this.f10410g.f10422c.setVisibility(0);
                this.f10410g.f10426g.setVisibility(0);
            }
            if (c2918f != null) {
                this.f10410g.f10425f.setSelected(c2918f.f10436h);
                this.f10410g.f10423d.setPaintColor(this.f10404a.getResources().getColor(C1704R.color.gray));
                String m29939u = c2918f.m29939u();
                if (m29939u.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER) && m29939u.contains(" ") && (split2 = m29939u.split(" ")) != null && split2.length > 0) {
                    m29939u = this.f10404a.getResources().getConfiguration().locale.getCountry().equals("CN") ? split2[1].replace('-', C0494h.f680A) : split2[1].replace('-', C0494h.f680A);
                    if (!m29939u.contains(":") && m29939u.length() > 4) {
                        m29939u = m29939u.substring(0, 2) + ":" + m29939u.substring(2, 4) + ":" + m29939u.substring(4, m29939u.length());
                    }
                }
                if (m29939u.contains(".sf") || m29939u.contains(".fc")) {
                    replaceAll = m29939u.replaceAll(".sf", "").replaceAll(".fc", "");
                    this.f10410g.f10421b.setText(this.f10404a.getString(C1704R.C1707string.black_box));
                    if (!this.f10408e) {
                        this.f10410g.f10426g.setVisibility(8);
                    }
                } else {
                    replaceAll = m29939u.replaceAll(".txt", "").replaceAll(".pb", "");
                    this.f10410g.f10421b.setText(this.f10404a.getString(C1704R.C1707string.video_log));
                    if (!this.f10408e) {
                        this.f10410g.f10426g.setVisibility(0);
                    }
                }
                if (!replaceAll.contains("&synced")) {
                    this.f10410g.f10424e.setImageResource(C1704R.C1705drawable.icon_upload_start);
                    this.f10410g.f10420a.setText(String.format("%s", replaceAll));
                    if (c2918f.m29937w() == 0) {
                        c2918f.m29974a(0);
                        this.f10410g.f10423d.setSweepAngle(0.0f);
                        if (!c2918f.f10437i) {
                            this.f10410g.f10422c.setText(c2918f.m29936x());
                        } else {
                            this.f10410g.f10422c.setText(this.f10404a.getResources().getString(C1704R.C1707string.wait_upload));
                        }
                    } else if (c2918f.m29937w() == 1) {
                        c2918f.m29974a(1);
                        this.f10410g.f10424e.setImageResource(C1704R.C1705drawable.icon_download_pause);
                        this.f10410g.f10423d.m28887a();
                        this.f10410g.f10423d.setSweepAngle(c2918f.m29934z());
                        this.f10410g.f10422c.setText(String.format("%s | %s%s", this.f10404a.getString(C1704R.C1707string.fly_uploading), Integer.valueOf(c2918f.m29934z()), "%"));
                    } else if (c2918f.m29937w() == 3) {
                        c2918f.m29974a(3);
                        this.f10410g.f10424e.setImageResource(C1704R.C1705drawable.icon_download_pause);
                        this.f10410g.f10423d.m28887a();
                        this.f10410g.f10423d.setSweepAngle(c2918f.m29934z());
                        this.f10410g.f10422c.setText(String.format("%s | %s%s", this.f10404a.getString(C1704R.C1707string.fly_upload_pause), Integer.valueOf(c2918f.m29934z()), "%"));
                    }
                } else {
                    this.f10410g.f10423d.m28887a();
                    this.f10410g.f10423d.setSweepAngle(100.0f);
                    this.f10410g.f10424e.setImageResource(C1704R.C1705drawable.icon_upload_ok);
                    this.f10410g.f10422c.setText(this.f10404a.getResources().getString(C1704R.C1707string.fly_finish_over));
                    this.f10410g.f10420a.setText(replaceAll.replaceAll("&synced", ""));
                    c2918f.m29974a(2);
                }
            }
            this.f10410g.f10423d.setTag(C1704R.C1706id.tag_first, c2918f);
            this.f10410g.f10423d.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.module.setting.e.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    double d;
                    if (System.currentTimeMillis() - C2913e.this.f10411h < 1000) {
                        return;
                    }
                    C2913e.this.f10411h = System.currentTimeMillis();
                    ImageView imageView = (ImageView) C2913e.this.f10407d.findViewWithTag("load_" + c2918f.m29938v());
                    if (C2913e.this.f10406c == null || c2918f.m29937w() == 2) {
                        return;
                    }
                    TextView textView = (TextView) C2913e.this.f10407d.findViewWithTag("percent_" + c2918f.m29938v());
                    if (c2918f.m29937w() == 1) {
                        C2913e.this.f10406c.m33286b(new File(c2918f.m29938v()));
                        c2918f.m29974a(3);
                        textView.setText(String.format("%s | %s%s", C2913e.this.f10404a.getString(C1704R.C1707string.fly_upload_pause), Integer.valueOf(c2918f.m29934z()), "%"));
                        imageView.setImageResource(C1704R.C1705drawable.icon_upload_start);
                        if (C2913e.this.f10405b == null) {
                            return;
                        }
                        for (C2918f c2918f2 : C2913e.this.f10405b) {
                            if (c2918f2.m29938v().equals(c2918f.m29938v())) {
                                c2918f2.m29974a(3);
                                return;
                            }
                        }
                    } else if (c2918f.m29937w() == 3) {
                        textView.setText(String.format("%s | %s%s", C2913e.this.f10404a.getString(C1704R.C1707string.fly_uploading), Integer.valueOf(c2918f.m29934z()), "%"));
                        C2913e.this.f10406c.m33282c(new File(c2918f.m29938v()));
                        c2918f.m29974a(1);
                        imageView.setImageResource(C1704R.C1705drawable.icon_download_pause);
                        if (C2913e.this.f10405b == null) {
                            return;
                        }
                        for (C2918f c2918f3 : C2913e.this.f10405b) {
                            if (c2918f3.m29938v().equals(c2918f.m29938v())) {
                                c2918f3.m29974a(1);
                                return;
                            }
                        }
                    } else if (c2918f.m29937w() == 0) {
                        textView.setText(C2913e.this.f10404a.getResources().getString(C1704R.C1707string.wait_upload));
                        String m29936x = c2918f.m29936x();
                        try {
                            d = Double.valueOf(m29936x.split(" ")[0].replace(Constants.ACCEPT_TIME_SEPARATOR_SP, ".")).doubleValue();
                        } catch (Exception e) {
                            e.printStackTrace();
                            d = -1.0d;
                        }
                        if (m29936x == null || d <= C9755a.f30449c) {
                            ((TextView) C2913e.this.f10407d.findViewWithTag("percent_" + c2918f.m29938v())).setText(C1704R.C1707string.inabvility);
                            return;
                        }
                        C2913e.this.f10406c.m33290a(new File(c2918f.m29938v()));
                        c2918f.m29961c(true);
                    }
                }
            });
        } else {
            if (view == null) {
                view = LayoutInflater.from(this.f10404a).inflate(C1704R.layout.drone_log_item_title, (ViewGroup) null);
                c2916b = new C2916b();
                c2916b.f10418a = (TextView) view.findViewById(C1704R.C1706id.headview);
                view.setTag(c2916b);
                C3103au.m29232a(this.f10404a.getAssets(), c2916b.f10418a);
            } else {
                c2916b = (C2916b) view.getTag();
            }
            String m29939u2 = this.f10405b.get(i).m29939u();
            if (m29939u2 != null) {
                if (m29939u2.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER).length >= 2) {
                    c2916b.f10418a.setText(split[1] + "/" + split[2] + "/" + split[0]);
                }
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
