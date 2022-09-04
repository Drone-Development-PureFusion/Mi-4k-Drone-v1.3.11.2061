package com.fimi.soul.module.thirdpartlogin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import cn.sharesdk.framework.Platform;
/* renamed from: com.fimi.soul.module.thirdpartlogin.e */
/* loaded from: classes.dex */
public class C2993e {
    /* renamed from: a */
    public static Bitmap m29756a(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i = options.outWidth;
        int i2 = options.outHeight;
        int i3 = (i <= i2 || ((float) i) <= 480.0f) ? (i >= i2 || ((float) i2) <= 800.0f) ? 1 : (int) (options.outHeight / 800.0f) : (int) (options.outWidth / 480.0f);
        if (i3 <= 0) {
            i3 = 1;
        }
        options.inSampleSize = i3;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: a */
    public static String m29758a(int i) {
        switch (i) {
            case 1:
                return "ACTION_AUTHORIZING";
            case 2:
                return "ACTION_GETTING_FRIEND_LIST";
            case 3:
            case 4:
            default:
                return "UNKNOWN";
            case 5:
                return "ACTION_SENDING_DIRECT_MESSAGE";
            case 6:
                return "ACTION_FOLLOWING_USER";
            case 7:
                return "ACTION_TIMELINE";
            case 8:
                return "ACTION_USER_INFOR";
            case 9:
                return "ACTION_SHARE";
        }
    }

    /* renamed from: a */
    public static boolean m29757a(Platform platform) {
        if (platform == null) {
            return false;
        }
        String name = platform.getName();
        if ("Wechat".equals(name) && !platform.isClientValid()) {
            return false;
        }
        return (!"GooglePlus".equals(name) || platform.isClientValid()) && !"WechatMoments".equals(name) && !"WechatFavorite".equals(name) && !"ShortMessage".equals(name) && !"Email".equals(name) && !"Pinterest".equals(name) && !"Yixin".equals(name) && !"YixinMoments".equals(name) && !"Line".equals(name) && !"Bluetooth".equals(name) && !"WhatsApp".equals(name) && !"Pocket".equals(name) && !"BaiduTieba".equals(name) && !"Laiwang".equals(name) && !"LaiwangMoments".equals(name) && !"Alipay".equals(name);
    }
}
