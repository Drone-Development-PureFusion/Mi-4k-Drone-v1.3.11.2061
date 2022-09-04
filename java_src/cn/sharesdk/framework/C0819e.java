package cn.sharesdk.framework;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import cn.sharesdk.framework.p076b.C0796a;
import cn.sharesdk.framework.p076b.C0812d;
import cn.sharesdk.framework.p076b.p078b.C0803a;
import cn.sharesdk.framework.p076b.p078b.C0806d;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.commons.eventrecoder.EventRecorder;
import com.mob.tools.utils.ResHelper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: cn.sharesdk.framework.e */
/* loaded from: classes.dex */
public class C0819e {

    /* renamed from: a */
    private Context f1631a;

    /* renamed from: b */
    private String f1632b;

    public C0819e(Context context, String str) {
        this.f1631a = context;
        this.f1632b = str;
    }

    /* renamed from: d */
    private ArrayList<Platform> m37826d() {
        ArrayList<Platform> arrayList = new ArrayList<>();
        for (String str : new String[]{"cn.sharesdk.douban.Douban", "cn.sharesdk.evernote.Evernote", "cn.sharesdk.facebook.Facebook", "cn.sharesdk.renren.Renren", "cn.sharesdk.sina.weibo.SinaWeibo", "cn.sharesdk.kaixin.KaiXin", "cn.sharesdk.linkedin.LinkedIn", "cn.sharesdk.system.email.Email", "cn.sharesdk.system.text.ShortMessage", "cn.sharesdk.tencent.qq.QQ", "cn.sharesdk.tencent.qzone.QZone", "cn.sharesdk.tencent.weibo.TencentWeibo", "cn.sharesdk.twitter.Twitter", "cn.sharesdk.wechat.friends.Wechat", "cn.sharesdk.wechat.moments.WechatMoments", "cn.sharesdk.wechat.favorite.WechatFavorite", "cn.sharesdk.youdao.YouDao", "cn.sharesdk.google.GooglePlus", "cn.sharesdk.foursquare.FourSquare", "cn.sharesdk.pinterest.Pinterest", "cn.sharesdk.flickr.Flickr", "cn.sharesdk.tumblr.Tumblr", "cn.sharesdk.dropbox.Dropbox", "cn.sharesdk.vkontakte.VKontakte", "cn.sharesdk.instagram.Instagram", "cn.sharesdk.yixin.friends.Yixin", "cn.sharesdk.yixin.moments.YixinMoments", "cn.sharesdk.mingdao.Mingdao", "cn.sharesdk.line.Line", "cn.sharesdk.kakao.story.KakaoStory", "cn.sharesdk.kakao.talk.KakaoTalk", "cn.sharesdk.whatsapp.WhatsApp", "cn.sharesdk.pocket.Pocket", "cn.sharesdk.instapaper.Instapaper", "cn.sharesdk.facebookmessenger.FacebookMessenger", "cn.sharesdk.alipay.friends.Alipay", "cn.sharesdk.alipay.moments.AlipayMoments", "cn.sharesdk.dingding.friends.Dingding", "cn.sharesdk.youtube.Youtube", "cn.sharesdk.meipai.Meipai"}) {
            try {
                Constructor<?> constructor = Class.forName(str).getConstructor(Context.class);
                constructor.setAccessible(true);
                arrayList.add((Platform) constructor.newInstance(this.f1631a));
            } catch (Throwable th) {
                C0831d.m37772a().m6199d(th);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public String m37837a(int i, String str, HashMap<Integer, HashMap<String, Object>> hashMap) {
        HashMap<String, Object> hashMap2 = hashMap.get(Integer.valueOf(i));
        if (hashMap2 == null) {
            return null;
        }
        Object obj = hashMap2.get(str);
        return obj == null ? null : String.valueOf(obj);
    }

    /* renamed from: a */
    public String m37836a(Bitmap bitmap) {
        return C0796a.m37967a(this.f1631a, this.f1632b).m37966a(bitmap);
    }

    /* renamed from: a */
    public String m37833a(String str) {
        return C0796a.m37967a(this.f1631a, this.f1632b).m37961a(str);
    }

    /* renamed from: a */
    public String m37831a(String str, boolean z, int i, String str2) {
        return C0796a.m37967a(this.f1631a, this.f1632b).m37960a(str, i, z, str2);
    }

    /* renamed from: a */
    public ArrayList<Platform> m37840a() {
        ArrayList<Platform> m37826d = m37826d();
        m37830a(m37826d);
        return m37826d;
    }

    /* renamed from: a */
    public void m37839a(int i, int i2, HashMap<Integer, HashMap<String, Object>> hashMap) {
        hashMap.put(Integer.valueOf(i2), hashMap.get(Integer.valueOf(i)));
    }

    /* renamed from: a */
    public void m37838a(int i, Platform platform) {
        C0806d c0806d = new C0806d();
        switch (i) {
            case 1:
                c0806d.f1567a = "SHARESDK_ENTER_SHAREMENU";
                break;
            case 2:
                c0806d.f1567a = "SHARESDK_CANCEL_SHAREMENU";
                break;
            case 3:
                c0806d.f1567a = "SHARESDK_EDIT_SHARE";
                break;
            case 4:
                c0806d.f1567a = "SHARESDK_FAILED_SHARE";
                break;
            case 5:
                c0806d.f1567a = "SHARESDK_CANCEL_SHARE";
                break;
        }
        if (platform != null) {
            c0806d.f1568b = platform.getPlatformId();
        }
        C0812d m37877a = C0812d.m37877a(this.f1631a, this.f1632b);
        if (m37877a != null) {
            m37877a.m37875a(c0806d);
        }
    }

    /* renamed from: a */
    public void m37835a(Handler handler, boolean z, int i) {
        C0812d m37877a = C0812d.m37877a(this.f1631a, this.f1632b);
        if (m37877a != null) {
            m37877a.m37876a(handler);
            m37877a.m37874a(z);
            m37877a.m37878a(i);
            m37877a.startThread();
        }
    }

    /* renamed from: a */
    public void m37834a(C0821f c0821f) {
    }

    /* renamed from: a */
    public void m37832a(String str, int i) {
        C0812d m37877a = C0812d.m37877a(this.f1631a, this.f1632b);
        if (m37877a == null) {
            return;
        }
        C0803a c0803a = new C0803a();
        c0803a.f1549b = str;
        c0803a.f1548a = i;
        m37877a.m37875a(c0803a);
    }

    /* renamed from: a */
    public void m37830a(ArrayList<Platform> arrayList) {
        if (arrayList == null) {
            return;
        }
        Collections.sort(arrayList, new Comparator<Platform>() { // from class: cn.sharesdk.framework.e.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(Platform platform, Platform platform2) {
                return platform.getSortId() != platform2.getSortId() ? platform.getSortId() - platform2.getSortId() : platform.getPlatformId() - platform2.getPlatformId();
            }
        });
    }

    /* renamed from: a */
    public boolean m37829a(HashMap<String, Object> hashMap, HashMap<Integer, HashMap<String, Object>> hashMap2) {
        int i;
        if (hashMap == null || hashMap.size() <= 0) {
            return false;
        }
        ArrayList arrayList = (ArrayList) hashMap.get("fakelist");
        if (arrayList == null) {
            return false;
        }
        EventRecorder.addBegin("ShareSDK", "parseDevInfo");
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            HashMap<String, Object> hashMap3 = (HashMap) it2.next();
            if (hashMap3 != null) {
                try {
                    i = ResHelper.parseInt(String.valueOf(hashMap3.get("snsplat")));
                } catch (Throwable th) {
                    C0831d.m37772a().m6187w(th);
                    i = -1;
                }
                if (i != -1) {
                    hashMap2.put(Integer.valueOf(i), hashMap3);
                }
            }
        }
        EventRecorder.addEnd("ShareSDK", "parseDevInfo");
        return true;
    }

    /* renamed from: b */
    public void m37828b() {
        C0812d m37877a = C0812d.m37877a(this.f1631a, this.f1632b);
        if (m37877a != null) {
            m37877a.stopThread();
        }
    }

    /* renamed from: c */
    public String m37827c() {
        return "2.8.1";
    }
}
