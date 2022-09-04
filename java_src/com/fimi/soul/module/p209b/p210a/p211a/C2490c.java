package com.fimi.soul.module.p209b.p210a.p211a;

import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import com.facebook.common.util.UriUtil;
import com.mob.tools.gui.PullToRequestListAdapter;
import com.mob.tools.gui.PullToRequestView;
import com.mob.tools.utils.UIHandler;
import com.tencent.open.SocialConstants;
import com.xiaomi.market.sdk.C10445j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: com.fimi.soul.module.b.a.a.c */
/* loaded from: classes.dex */
public class C2490c extends PullToRequestListAdapter implements PlatformActionListener {

    /* renamed from: a */
    private AbstractView$OnClickListenerC2497e f8082a;

    /* renamed from: c */
    private Platform f8084c;

    /* renamed from: h */
    private C2499g f8089h;

    /* renamed from: i */
    private float f8090i;

    /* renamed from: d */
    private final int f8085d = 15;

    /* renamed from: e */
    private int f8086e = -1;

    /* renamed from: b */
    private boolean f8083b = true;

    /* renamed from: g */
    private HashMap<String, Boolean> f8088g = new HashMap<>();

    /* renamed from: f */
    private ArrayList<C2495b> f8087f = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.module.b.a.a.c$a */
    /* loaded from: classes.dex */
    public static class C2494a {

        /* renamed from: a */
        public ArrayList<C2495b> f8095a;

        /* renamed from: b */
        public boolean f8096b;

        private C2494a() {
            this.f8096b = false;
        }
    }

    /* renamed from: com.fimi.soul.module.b.a.a.c$b */
    /* loaded from: classes.dex */
    public static class C2495b {

        /* renamed from: a */
        public boolean f8097a;

        /* renamed from: b */
        public String f8098b;

        /* renamed from: c */
        public String f8099c;

        /* renamed from: d */
        public String f8100d;

        /* renamed from: e */
        public String f8101e;

        /* renamed from: f */
        public String f8102f;
    }

    public C2490c(AbstractView$OnClickListenerC2497e abstractView$OnClickListenerC2497e, PullToRequestView pullToRequestView) {
        super(pullToRequestView);
        this.f8082a = abstractView$OnClickListenerC2497e;
        getListView().setDivider(new ColorDrawable(-1381654));
    }

    /* renamed from: a */
    private C2494a m31509a(String str, HashMap<String, Object> hashMap, HashMap<String, Boolean> hashMap2) {
        boolean z = false;
        if (hashMap == null || hashMap.size() <= 0) {
            return null;
        }
        ArrayList<C2495b> arrayList = new ArrayList<>();
        if ("SinaWeibo".equals(str)) {
            Iterator it2 = ((ArrayList) hashMap.get("users")).iterator();
            while (it2.hasNext()) {
                HashMap hashMap3 = (HashMap) it2.next();
                String valueOf = String.valueOf(hashMap3.get("id"));
                if (!hashMap2.containsKey(valueOf)) {
                    C2495b c2495b = new C2495b();
                    c2495b.f8100d = valueOf;
                    c2495b.f8098b = String.valueOf(hashMap3.get("name"));
                    c2495b.f8099c = String.valueOf(hashMap3.get("description"));
                    c2495b.f8101e = String.valueOf(hashMap3.get("profile_image_url"));
                    c2495b.f8102f = c2495b.f8098b;
                    hashMap2.put(c2495b.f8100d, true);
                    arrayList.add(c2495b);
                }
            }
            z = ((Integer) hashMap.get("total_number")).intValue() > hashMap2.size();
        } else if ("TencentWeibo".equals(str)) {
            boolean z2 = ((Integer) hashMap.get("hasnext")).intValue() == 0;
            Iterator it3 = ((ArrayList) hashMap.get(C10445j.f32461ag)).iterator();
            while (it3.hasNext()) {
                HashMap hashMap4 = (HashMap) it3.next();
                String valueOf2 = String.valueOf(hashMap4.get("name"));
                if (!hashMap2.containsKey(valueOf2)) {
                    C2495b c2495b2 = new C2495b();
                    c2495b2.f8098b = String.valueOf(hashMap4.get("nick"));
                    c2495b2.f8100d = valueOf2;
                    c2495b2.f8102f = valueOf2;
                    Iterator it4 = ((ArrayList) hashMap4.get("tweet")).iterator();
                    if (it4.hasNext()) {
                        c2495b2.f8099c = String.valueOf(((HashMap) it4.next()).get("text"));
                    }
                    c2495b2.f8101e = String.valueOf(hashMap4.get("head")) + "/100";
                    hashMap2.put(c2495b2.f8100d, true);
                    arrayList.add(c2495b2);
                }
            }
            z = z2;
        } else if ("Facebook".equals(str)) {
            Iterator it5 = ((ArrayList) hashMap.get(UriUtil.DATA_SCHEME)).iterator();
            while (it5.hasNext()) {
                HashMap hashMap5 = (HashMap) it5.next();
                String valueOf3 = String.valueOf(hashMap5.get("id"));
                if (!hashMap2.containsKey(valueOf3)) {
                    C2495b c2495b3 = new C2495b();
                    c2495b3.f8100d = valueOf3;
                    c2495b3.f8102f = "[" + valueOf3 + "]";
                    c2495b3.f8098b = String.valueOf(hashMap5.get("name"));
                    HashMap hashMap6 = (HashMap) hashMap5.get(SocialConstants.PARAM_AVATAR_URI);
                    if (hashMap6 != null) {
                        c2495b3.f8101e = String.valueOf(((HashMap) hashMap6.get(UriUtil.DATA_SCHEME)).get("url"));
                    }
                    hashMap2.put(c2495b3.f8100d, true);
                    arrayList.add(c2495b3);
                }
            }
            z = ((HashMap) hashMap.get("paging")).containsKey("next");
        } else if ("Twitter".equals(str)) {
            Iterator it6 = ((ArrayList) hashMap.get("users")).iterator();
            while (it6.hasNext()) {
                HashMap hashMap7 = (HashMap) it6.next();
                String valueOf4 = String.valueOf(hashMap7.get("screen_name"));
                if (!hashMap2.containsKey(valueOf4)) {
                    C2495b c2495b4 = new C2495b();
                    c2495b4.f8100d = valueOf4;
                    c2495b4.f8102f = valueOf4;
                    c2495b4.f8098b = String.valueOf(hashMap7.get("name"));
                    c2495b4.f8099c = String.valueOf(hashMap7.get("description"));
                    c2495b4.f8101e = String.valueOf(hashMap7.get("profile_image_url"));
                    hashMap2.put(c2495b4.f8100d, true);
                    arrayList.add(c2495b4);
                }
            }
        }
        C2494a c2494a = new C2494a();
        c2494a.f8095a = arrayList;
        c2494a.f8096b = z;
        return c2494a;
    }

    /* renamed from: a */
    private void m31515a() {
        if (this.f8083b) {
            this.f8084c.listFriend(15, this.f8086e + 1, null);
        }
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    /* renamed from: a */
    public C2495b getItem(int i) {
        return this.f8087f.get(i);
    }

    /* renamed from: a */
    public void m31514a(float f) {
        this.f8090i = f;
        ListView listView = getListView();
        if (f < 1.0f) {
            f = 1.0f;
        }
        listView.setDividerHeight((int) f);
    }

    /* renamed from: a */
    public void m31512a(AdapterView.OnItemClickListener onItemClickListener) {
        getListView().setOnItemClickListener(onItemClickListener);
    }

    /* renamed from: a */
    public void m31511a(Platform platform) {
        this.f8084c = platform;
        platform.setPlatformActionListener(this);
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public int getCount() {
        if (this.f8087f == null) {
            return 0;
        }
        return this.f8087f.size();
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public View getFooterView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setMinimumHeight(10);
        return linearLayout;
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public View getHeaderView() {
        if (this.f8089h == null) {
            this.f8089h = new C2499g(getContext());
        }
        return this.f8089h;
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public long getItemId(int i) {
        return i;
    }

    @Override // com.mob.tools.gui.PullToRequestBaseListAdapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View c2496d = view == null ? new C2496d(viewGroup.getContext(), this.f8090i) : view;
        ((C2496d) c2496d).m31506a(getItem(i), isFling());
        if (i == getCount() - 1) {
            m31515a();
        }
        return c2496d;
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onCancel(Platform platform, int i) {
        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.fimi.soul.module.b.a.a.c.3
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                C2490c.this.f8082a.finish();
                return false;
            }
        });
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
        final C2494a m31509a = m31509a(this.f8084c.getName(), hashMap, this.f8088g);
        if (m31509a == null) {
            UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.fimi.soul.module.b.a.a.c.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    C2490c.this.notifyDataSetChanged();
                    return false;
                }
            });
            return;
        }
        this.f8083b = m31509a.f8096b;
        if (m31509a.f8095a == null || m31509a.f8095a.size() <= 0) {
            return;
        }
        this.f8086e++;
        Message message = new Message();
        message.what = 1;
        message.obj = m31509a.f8095a;
        UIHandler.sendMessage(message, new Handler.Callback() { // from class: com.fimi.soul.module.b.a.a.c.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message2) {
                if (C2490c.this.f8086e <= 0) {
                    C2490c.this.f8087f.clear();
                }
                C2490c.this.f8087f.addAll(m31509a.f8095a);
                C2490c.this.notifyDataSetChanged();
                return false;
            }
        });
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onError(Platform platform, int i, Throwable th) {
        th.printStackTrace();
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public void onPullDown(int i) {
        this.f8089h.m31498a(i);
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public void onRefresh() {
        this.f8089h.m31499a();
        this.f8086e = -1;
        this.f8083b = true;
        this.f8088g.clear();
        m31515a();
    }

    @Override // com.mob.tools.gui.PullToRequestAdatper
    public void onReversed() {
        this.f8089h.m31497b();
    }
}
