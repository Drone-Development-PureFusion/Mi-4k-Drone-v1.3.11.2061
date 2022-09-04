package cn.sharesdk.wechat.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.utils.C0831d;
import com.fimi.kernel.C1576a;
import com.google.android.gms.drive.AbstractC4808e;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.UIHandler;
import com.tencent.open.SocialConstants;
import com.tencent.p263mm.sdk.plugin.MMPluginProviderConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URLConnection;
import java.util.HashMap;
/* loaded from: classes.dex */
public class WechatHelper {

    /* renamed from: a */
    private static WechatHelper f1700a;

    /* renamed from: b */
    private C0856h f1701b = new C0856h();

    /* renamed from: c */
    private C0857i f1702c;

    /* loaded from: classes.dex */
    public static class ShareParams extends Platform.ShareParams {
        @Deprecated
        public String extInfo;
        @Deprecated
        public String filePath;
        @Deprecated
        public Bitmap imageData;
        @Deprecated
        public String imageUrl;
        @Deprecated
        public String musicUrl;
        @Deprecated
        protected int scene;
        @Deprecated
        public int shareType;
        @Deprecated
        public String title;
        @Deprecated
        public String url;
    }

    private WechatHelper() {
    }

    /* renamed from: a */
    private Bitmap m37714a(Bitmap bitmap, double d) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double sqrt = Math.sqrt(d);
        return Bitmap.createScaledBitmap(bitmap, (int) (width / sqrt), (int) (height / sqrt), true);
    }

    /* renamed from: a */
    public static WechatHelper m37724a() {
        if (f1700a == null) {
            f1700a = new WechatHelper();
        }
        return f1700a;
    }

    /* renamed from: a */
    private void m37720a(Context context, String str, String str2, Bitmap bitmap, int i, C0857i c0857i) {
        WXImageObject wXImageObject = new WXImageObject();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        wXImageObject.imageData = byteArrayOutputStream.toByteArray();
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        if (i != 0) {
            wXMediaMessage.title = str;
            wXMediaMessage.description = str2;
        }
        wXMediaMessage.thumbData = m37723a(context, bitmap);
        m37713a(wXMediaMessage, SocialConstants.PARAM_IMG_URL, i, c0857i);
    }

    /* renamed from: a */
    private void m37719a(Context context, String str, String str2, String str3, int i, C0857i c0857i) {
        WXImageObject wXImageObject = new WXImageObject();
        if (str3.startsWith("/data/")) {
            wXImageObject.imageData = m37709a(str3);
        } else {
            wXImageObject.imagePath = str3;
        }
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        if (i != 0) {
            wXMediaMessage.title = str;
            wXMediaMessage.description = str2;
        }
        wXMediaMessage.thumbData = m37706b(context, str3);
        m37713a(wXMediaMessage, SocialConstants.PARAM_IMG_URL, i, c0857i);
    }

    /* renamed from: a */
    private void m37718a(Context context, String str, String str2, String str3, Bitmap bitmap, int i, C0857i c0857i) {
        WXVideoObject wXVideoObject = new WXVideoObject();
        wXVideoObject.videoUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXVideoObject;
        wXMediaMessage.thumbData = m37723a(context, bitmap);
        m37713a(wXMediaMessage, "video", i, c0857i);
    }

    /* renamed from: a */
    private void m37717a(Context context, String str, String str2, String str3, String str4, int i, C0857i c0857i) {
        WXVideoObject wXVideoObject = new WXVideoObject();
        wXVideoObject.videoUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXVideoObject;
        wXMediaMessage.thumbData = m37706b(context, str4);
        m37713a(wXMediaMessage, "video", i, c0857i);
    }

    /* renamed from: a */
    private void m37716a(Context context, String str, String str2, String str3, String str4, Bitmap bitmap, int i, C0857i c0857i) {
        WXMusicObject wXMusicObject = new WXMusicObject();
        wXMusicObject.musicUrl = str4;
        wXMusicObject.musicDataUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXMusicObject;
        wXMediaMessage.thumbData = m37723a(context, bitmap);
        m37713a(wXMediaMessage, "music", i, c0857i);
    }

    /* renamed from: a */
    private void m37715a(Context context, String str, String str2, String str3, String str4, String str5, int i, C0857i c0857i) {
        WXMusicObject wXMusicObject = new WXMusicObject();
        wXMusicObject.musicUrl = str4;
        wXMusicObject.musicDataUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXMusicObject;
        wXMediaMessage.thumbData = m37706b(context, str5);
        m37713a(wXMediaMessage, "music", i, c0857i);
    }

    /* renamed from: a */
    private void m37713a(WXMediaMessage wXMediaMessage, String str, int i, C0857i c0857i) {
        Class<?> cls;
        String str2 = DeviceHelper.getInstance(c0857i.m37664b().getContext()).getPackageName() + ".wxapi.WXEntryActivity";
        try {
            cls = Class.forName(str2);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            cls = null;
        }
        if (cls != null && !WechatHandlerActivity.class.isAssignableFrom(cls)) {
            new Throwable(str2 + " does not extend from " + WechatHandlerActivity.class.getName()).printStackTrace();
        }
        C0850d c0850d = new C0850d();
        c0850d.f1741c = str + System.currentTimeMillis();
        c0850d.f1721a = wXMediaMessage;
        c0850d.f1722b = i;
        this.f1702c = c0857i;
        this.f1701b.m37676a(c0850d);
    }

    /* renamed from: a */
    private void m37708a(String str, String str2, int i, C0857i c0857i) {
        WXTextObject wXTextObject = new WXTextObject();
        wXTextObject.text = str2;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.mediaObject = wXTextObject;
        wXMediaMessage.description = str2;
        m37713a(wXMediaMessage, "text", i, c0857i);
    }

    /* renamed from: a */
    private byte[] m37723a(Context context, Bitmap bitmap) {
        if (bitmap == null) {
            throw new RuntimeException("checkArgs fail, thumbData is null");
        }
        if (!bitmap.isRecycled()) {
            return m37722a(context, bitmap, Bitmap.CompressFormat.PNG);
        }
        throw new RuntimeException("checkArgs fail, thumbData is recycled");
    }

    /* renamed from: a */
    private byte[] m37722a(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        if (bitmap == null) {
            throw new RuntimeException("checkArgs fail, thumbData is null");
        }
        if (bitmap.isRecycled()) {
            throw new RuntimeException("checkArgs fail, thumbData is recycled");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 32768) {
            bitmap = m37714a(bitmap, length / 32768.0d);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            bitmap.compress(compressFormat, 100, byteArrayOutputStream2);
            byteArrayOutputStream2.flush();
            byteArrayOutputStream2.close();
            byteArray = byteArrayOutputStream2.toByteArray();
            length = byteArray.length;
        }
        return byteArray;
    }

    /* renamed from: a */
    private byte[] m37709a(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            for (int read = fileInputStream.read(bArr); read > 0; read = fileInputStream.read(bArr)) {
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
            fileInputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return null;
        }
    }

    /* renamed from: b */
    private void m37705b(Context context, String str, String str2, Bitmap bitmap, int i, C0857i c0857i) {
        WXEmojiObject wXEmojiObject = new WXEmojiObject();
        byte[] m37723a = m37723a(context, bitmap);
        wXEmojiObject.emojiData = m37723a;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.mediaObject = wXEmojiObject;
        wXMediaMessage.description = str2;
        wXMediaMessage.thumbData = m37723a;
        m37713a(wXMediaMessage, "emoji", i, c0857i);
    }

    /* renamed from: b */
    private void m37704b(Context context, String str, String str2, String str3, int i, C0857i c0857i) {
        WXEmojiObject wXEmojiObject = new WXEmojiObject();
        wXEmojiObject.emojiPath = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.mediaObject = wXEmojiObject;
        wXMediaMessage.description = str2;
        wXMediaMessage.thumbData = m37706b(context, str3);
        m37713a(wXMediaMessage, "emoji", i, c0857i);
    }

    /* renamed from: b */
    private void m37703b(Context context, String str, String str2, String str3, Bitmap bitmap, int i, C0857i c0857i) {
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXWebpageObject;
        if (bitmap != null && !bitmap.isRecycled()) {
            wXMediaMessage.thumbData = m37723a(context, bitmap);
            if (wXMediaMessage.thumbData == null) {
                throw new RuntimeException("checkArgs fail, thumbData is null");
            }
            if (wXMediaMessage.thumbData.length > 32768) {
                throw new RuntimeException("checkArgs fail, thumbData is too large: " + wXMediaMessage.thumbData.length + " > 32768");
            }
        }
        m37713a(wXMediaMessage, "webpage", i, c0857i);
    }

    /* renamed from: b */
    private void m37702b(Context context, String str, String str2, String str3, String str4, int i, C0857i c0857i) {
        WXWebpageObject wXWebpageObject = new WXWebpageObject();
        wXWebpageObject.webpageUrl = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXWebpageObject;
        if (str4 != null && new File(str4).exists()) {
            wXMediaMessage.thumbData = m37706b(context, str4);
            if (wXMediaMessage.thumbData == null) {
                throw new RuntimeException("checkArgs fail, thumbData is null");
            }
            if (wXMediaMessage.thumbData.length > 32768) {
                throw new RuntimeException("checkArgs fail, thumbData is too large: " + wXMediaMessage.thumbData.length + " > 32768");
            }
        }
        m37713a(wXMediaMessage, "webpage", i, c0857i);
    }

    /* renamed from: b */
    private void m37701b(Context context, String str, String str2, String str3, String str4, Bitmap bitmap, int i, C0857i c0857i) {
        WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
        wXAppExtendObject.filePath = str3;
        wXAppExtendObject.extInfo = str4;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXAppExtendObject;
        wXMediaMessage.thumbData = m37723a(context, bitmap);
        m37713a(wXMediaMessage, "appdata", i, c0857i);
    }

    /* renamed from: b */
    private void m37700b(Context context, String str, String str2, String str3, String str4, String str5, int i, C0857i c0857i) {
        WXAppExtendObject wXAppExtendObject = new WXAppExtendObject();
        wXAppExtendObject.filePath = str3;
        wXAppExtendObject.extInfo = str4;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXAppExtendObject;
        wXMediaMessage.thumbData = m37706b(context, str5);
        m37713a(wXMediaMessage, "appdata", i, c0857i);
    }

    /* renamed from: b */
    private byte[] m37706b(Context context, String str) {
        if (!new File(str).exists()) {
            throw new FileNotFoundException();
        }
        return m37722a(context, BitmapHelper.getBitmap(str), BitmapHelper.getBmpFormat(str));
    }

    /* renamed from: c */
    private void m37697c(Context context, String str, String str2, String str3, Bitmap bitmap, int i, C0857i c0857i) {
        WXFileObject wXFileObject = new WXFileObject();
        wXFileObject.filePath = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXFileObject;
        wXMediaMessage.thumbData = m37723a(context, bitmap);
        m37713a(wXMediaMessage, "filedata", i, c0857i);
    }

    /* renamed from: c */
    private void m37696c(Context context, String str, String str2, String str3, String str4, int i, C0857i c0857i) {
        WXFileObject wXFileObject = new WXFileObject();
        wXFileObject.filePath = str3;
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = str;
        wXMediaMessage.description = str2;
        wXMediaMessage.mediaObject = wXFileObject;
        wXMediaMessage.thumbData = m37706b(context, str4);
        m37713a(wXMediaMessage, "filedata", i, c0857i);
    }

    /* renamed from: a */
    public void m37711a(C0857i c0857i) {
        this.f1702c = c0857i;
        C0847a c0847a = new C0847a();
        c0847a.f1713a = "snsapi_userinfo";
        c0847a.f1714b = "sharesdk_wechat_auth";
        this.f1701b.m37676a(c0847a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d4, code lost:
        if (com.mob.tools.utils.ResHelper.copyFile(r0, r4) != false) goto L16;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m37710a(C0857i c0857i, Platform.ShareParams shareParams, final PlatformActionListener platformActionListener) {
        File file;
        final Platform m37664b = c0857i.m37664b();
        String imagePath = shareParams.getImagePath();
        String imageUrl = shareParams.getImageUrl();
        if (TextUtils.isEmpty(imagePath) || !new File(imagePath).exists()) {
            Bitmap imageData = shareParams.getImageData();
            if (imageData != null && !imageData.isRecycled()) {
                File file2 = new File(ResHelper.getCachePath(m37664b.getContext(), C1576a.f3872b), System.currentTimeMillis() + ".png");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                imageData.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                imagePath = file2.getAbsolutePath();
            } else if (!TextUtils.isEmpty(imageUrl)) {
                imagePath = BitmapHelper.downloadBitmap(m37664b.getContext(), imageUrl);
            }
        }
        Intent intent = new Intent("android.intent.action.SEND");
        String text = shareParams.getText();
        if (!TextUtils.isEmpty(text)) {
            String shortLintk = m37664b.getShortLintk(text, false);
            shareParams.setText(shortLintk);
            intent.putExtra("android.intent.extra.TEXT", shortLintk);
            intent.putExtra("Kdescription", shortLintk);
        }
        if (!TextUtils.isEmpty(imagePath)) {
            File file3 = new File(imagePath);
            if (file3.exists()) {
                if (imagePath.startsWith("/data/")) {
                    file = new File(ResHelper.getCachePath(m37664b.getContext(), C1576a.f3872b), System.currentTimeMillis() + file3.getName());
                    String absolutePath = file.getAbsolutePath();
                    file.createNewFile();
                }
                file = file3;
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.putExtra("android.intent.extra.STREAM", ResHelper.pathToContentUri(m37664b.getContext(), file.getAbsolutePath()));
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                }
                String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(imagePath);
                if (contentTypeFor == null || contentTypeFor.length() <= 0) {
                    contentTypeFor = "image/*";
                }
                intent.setType(contentTypeFor);
            }
        } else {
            intent.setType("text/plain");
        }
        intent.setClassName(MMPluginProviderConstants.PluginIntent.APP_PACKAGE_PATTERN, ((Integer) shareParams.get("scene", Integer.class)).intValue() == 1 ? "com.tencent.mm.ui.tools.ShareToTimeLineUI" : "com.tencent.mm.ui.tools.ShareImgUI");
        intent.addFlags(AbstractC4808e.f17570a_);
        m37664b.getContext().startActivity(intent);
        final DeviceHelper deviceHelper = DeviceHelper.getInstance(m37664b.getContext());
        final String packageName = m37664b.getContext().getPackageName();
        final HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ShareParams", shareParams);
        if (!TextUtils.isEmpty(deviceHelper.getTopTaskPackageName())) {
            UIHandler.sendEmptyMessageDelayed(0, 2000L, new Handler.Callback() { // from class: cn.sharesdk.wechat.utils.WechatHelper.1

                /* renamed from: a */
                int f1703a = 0;

                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    if (!packageName.equals(deviceHelper.getTopTaskPackageName())) {
                        if (platformActionListener == null) {
                            return true;
                        }
                        platformActionListener.onComplete(m37664b, 9, hashMap);
                        return true;
                    } else if (this.f1703a >= 5) {
                        return true;
                    } else {
                        this.f1703a++;
                        UIHandler.sendEmptyMessageDelayed(0, 500L, this);
                        return true;
                    }
                }
            });
        } else if (platformActionListener == null || platformActionListener == null) {
        } else {
            platformActionListener.onComplete(m37664b, 9, hashMap);
        }
    }

    /* renamed from: a */
    public boolean m37721a(Context context, String str) {
        return this.f1701b.m37678a(context, str);
    }

    /* renamed from: a */
    public boolean m37712a(WechatHandlerActivity wechatHandlerActivity) {
        return this.f1701b.m37677a(wechatHandlerActivity, this.f1702c);
    }

    /* renamed from: b */
    public void m37699b(C0857i c0857i) {
        Platform m37664b = c0857i.m37664b();
        Platform.ShareParams m37669a = c0857i.m37669a();
        PlatformActionListener m37663c = c0857i.m37663c();
        int shareType = m37669a.getShareType();
        String title = m37669a.getTitle();
        String text = m37669a.getText();
        int scence = m37669a.getScence();
        String imagePath = m37669a.getImagePath();
        String imageUrl = m37669a.getImageUrl();
        Bitmap imageData = m37669a.getImageData();
        String musicUrl = m37669a.getMusicUrl();
        String url = m37669a.getUrl();
        String filePath = m37669a.getFilePath();
        String extInfo = m37669a.getExtInfo();
        Context context = m37664b.getContext();
        switch (shareType) {
            case 1:
                m37708a(title, text, scence, c0857i);
                return;
            case 2:
                if (imagePath != null && imagePath.length() > 0) {
                    m37719a(context, title, text, imagePath, scence, c0857i);
                    return;
                } else if (imageData != null && !imageData.isRecycled()) {
                    m37720a(context, title, text, imageData, scence, c0857i);
                    return;
                } else if (imageUrl == null || imageUrl.length() <= 0) {
                    m37719a(context, title, text, "", scence, c0857i);
                    return;
                } else {
                    m37719a(context, title, text, BitmapHelper.downloadBitmap(m37664b.getContext(), imageUrl), scence, c0857i);
                    return;
                }
            case 3:
            default:
                if (m37663c == null) {
                    return;
                }
                m37663c.onError(m37664b, 9, new IllegalArgumentException("shareType = " + shareType));
                return;
            case 4:
                String shortLintk = m37664b.getShortLintk(url, false);
                c0857i.m37669a().setUrl(shortLintk);
                if (imagePath != null && imagePath.length() > 0) {
                    m37702b(context, title, text, shortLintk, imagePath, scence, c0857i);
                    return;
                } else if (imageData != null && !imageData.isRecycled()) {
                    m37703b(context, title, text, shortLintk, imageData, scence, c0857i);
                    return;
                } else if (imageUrl == null || imageUrl.length() <= 0) {
                    m37702b(context, title, text, shortLintk, "", scence, c0857i);
                    return;
                } else {
                    m37702b(context, title, text, shortLintk, BitmapHelper.downloadBitmap(m37664b.getContext(), imageUrl), scence, c0857i);
                    return;
                }
            case 5:
                String shortLintk2 = m37664b.getShortLintk(musicUrl + " " + url, false);
                String str = shortLintk2.split(" ")[0];
                String str2 = shortLintk2.split(" ")[1];
                if (imagePath != null && imagePath.length() > 0) {
                    m37715a(context, title, text, str, str2, imagePath, scence, c0857i);
                    return;
                } else if (imageData != null && !imageData.isRecycled()) {
                    m37716a(context, title, text, str, str2, imageData, scence, c0857i);
                    return;
                } else if (imageUrl == null || imageUrl.length() <= 0) {
                    m37715a(context, title, text, str, str2, "", scence, c0857i);
                    return;
                } else {
                    m37715a(context, title, text, str, str2, BitmapHelper.downloadBitmap(m37664b.getContext(), imageUrl), scence, c0857i);
                    return;
                }
            case 6:
                String shortLintk3 = m37664b.getShortLintk(url, false);
                c0857i.m37669a().setUrl(shortLintk3);
                if (imagePath != null && imagePath.length() > 0) {
                    m37717a(context, title, text, shortLintk3, imagePath, scence, c0857i);
                    return;
                } else if (imageData != null && !imageData.isRecycled()) {
                    m37718a(context, title, text, shortLintk3, imageData, scence, c0857i);
                    return;
                } else if (imageUrl == null || imageUrl.length() <= 0) {
                    m37717a(context, title, text, shortLintk3, "", scence, c0857i);
                    return;
                } else {
                    m37717a(context, title, text, shortLintk3, BitmapHelper.downloadBitmap(m37664b.getContext(), imageUrl), scence, c0857i);
                    return;
                }
            case 7:
                if (scence == 1) {
                    throw new Throwable("WechatMoments does not support SAHRE_APP");
                }
                if (scence == 2) {
                    throw new Throwable("WechatFavorite does not support SAHRE_APP");
                }
                if (imagePath != null && imagePath.length() > 0) {
                    m37700b(context, title, text, filePath, extInfo, imagePath, scence, c0857i);
                    return;
                } else if (imageData != null && !imageData.isRecycled()) {
                    m37701b(context, title, text, filePath, extInfo, imageData, scence, c0857i);
                    return;
                } else if (imageUrl == null || imageUrl.length() <= 0) {
                    m37700b(context, title, text, filePath, extInfo, "", scence, c0857i);
                    return;
                } else {
                    m37700b(context, title, text, filePath, extInfo, BitmapHelper.downloadBitmap(m37664b.getContext(), imageUrl), scence, c0857i);
                    return;
                }
            case 8:
                if (scence == 1) {
                    throw new Throwable("WechatMoments does not support SHARE_FILE");
                }
                if (imagePath != null && imagePath.length() > 0) {
                    m37696c(context, title, text, filePath, imagePath, scence, c0857i);
                    return;
                } else if (imageData != null && !imageData.isRecycled()) {
                    m37697c(context, title, text, filePath, imageData, scence, c0857i);
                    return;
                } else if (imageUrl == null || imageUrl.length() <= 0) {
                    m37696c(context, title, text, filePath, "", scence, c0857i);
                    return;
                } else {
                    m37696c(context, title, text, filePath, BitmapHelper.downloadBitmap(m37664b.getContext(), imageUrl), scence, c0857i);
                    return;
                }
            case 9:
                if (scence == 1) {
                    throw new Throwable("WechatMoments does not support SHARE_EMOJI");
                }
                if (scence == 2) {
                    throw new Throwable("WechatFavorite does not support SHARE_EMOJI");
                }
                if (imagePath != null && imagePath.length() > 0) {
                    m37704b(context, title, text, imagePath, scence, c0857i);
                    return;
                } else if (imageUrl != null && imageUrl.length() > 0) {
                    m37704b(context, title, text, new NetworkHelper().downloadCache(m37664b.getContext(), imageUrl, C1576a.f3872b, true, null), scence, c0857i);
                    return;
                } else if (imageData == null || imageData.isRecycled()) {
                    m37704b(context, title, text, "", scence, c0857i);
                    return;
                } else {
                    m37705b(context, title, text, imageData, scence, c0857i);
                    return;
                }
        }
    }

    /* renamed from: b */
    public boolean m37707b() {
        return this.f1701b.m37679a();
    }

    /* renamed from: c */
    public boolean m37698c() {
        return this.f1701b.m37672b();
    }

    /* renamed from: d */
    public boolean m37695d() {
        return this.f1701b.m37671c();
    }
}
