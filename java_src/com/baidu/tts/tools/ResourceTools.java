package com.baidu.tts.tools;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.baidu.tts.p102f.EnumC1172d;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p114m.C1238i;
import java.io.UnsupportedEncodingException;
/* loaded from: classes.dex */
public class ResourceTools {
    public static final int TEXT_LENGTH_LIMIT = 1024;

    public static C1238i format(String str, String str2, C1238i c1238i) {
        try {
            c1238i.m36136b(new String(c1238i.m36135c().getBytes(str), str2));
            c1238i.m36134c(str2);
            return c1238i;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getAppFilesDirPath(Context context) {
        return context.getFilesDir().getAbsolutePath() + "/";
    }

    public static String getAppFilesPath(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.dataDir + "/files/";
        } catch (Exception e) {
            return context.getFilesDir().getAbsolutePath() + "/";
        }
    }

    public static String getByteMapAbsName(Context context, String str) {
        return getModelFileAbsName(context, str + ".bm");
    }

    public static String getDefaultResourcePath(Context context, String str) {
        return getSdcardFilesDirPath(context) + str;
    }

    public static String getModelFileAbsName(Context context, String str) {
        return FileTools.jointPathAndName(getAppFilesPath(context) + "modelDir/", str);
    }

    @SuppressLint({"SdCardPath"})
    public static String getSdcardFilesDirPath(Context context) {
        return "/sdcard/tts/";
    }

    public static EnumC1182n isTextValid(String str) {
        if (TextUtils.isEmpty(str)) {
            return EnumC1182n.TEXT_IS_EMPTY;
        }
        try {
            if (str.getBytes(EnumC1172d.GBK.m36323a()).length <= 1024) {
                return null;
            }
            return EnumC1182n.TEXT_IS_TOO_LONG;
        } catch (UnsupportedEncodingException e) {
            return EnumC1182n.TEXT_ENCODE_IS_WRONG;
        }
    }

    public static byte[] stringToByteArrayAddNull(String str) {
        if (str == null) {
            str = "";
        }
        byte[] bytes = str.getBytes();
        byte[] bArr = {0};
        byte[] bArr2 = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
        System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
        return bArr2;
    }
}
