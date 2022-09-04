package com.tencent.open.web.security;

import com.tencent.open.C10241a;
import com.tencent.open.p264a.C10257f;
/* loaded from: classes2.dex */
public class SecureJsInterface extends C10241a.C10243b {

    /* renamed from: a */
    private static final String f32032a = C10257f.f31917d + ".SI";
    public static boolean isPWDEdit = false;

    /* renamed from: b */
    private String f32033b;

    public void clearAllEdit() {
        C10257f.m5670c(f32032a, "-->clear all edit.");
        try {
            JniInterface.clearAllPWD();
        } catch (Exception e) {
            C10257f.m5667e(f32032a, "-->clear all edit exception: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void curPosFromJS(String str) {
        C10257f.m5670c(f32032a, "-->curPosFromJS: " + str);
        int i = -1;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            C10257f.m5667e(f32032a, "-->curPosFromJS number format exception.");
        }
        if (i < 0) {
            throw new RuntimeException("position is illegal.");
        }
        if (!C10291a.f32036c) {
        }
        if (C10291a.f32035b) {
            if (!Boolean.valueOf(JniInterface.BackSpaceChar(C10291a.f32035b, i)).booleanValue()) {
                return;
            }
            C10291a.f32035b = false;
            return;
        }
        this.f32033b = C10291a.f32034a;
        JniInterface.insetTextToArray(i, this.f32033b, this.f32033b.length());
        C10257f.m5673b(f32032a, "mKey: " + this.f32033b);
    }

    @Override // com.tencent.open.C10241a.C10243b
    public boolean customCallback() {
        return true;
    }

    public String getMD5FromNative() {
        C10257f.m5670c(f32032a, "-->get md5 form native");
        try {
            String pWDKeyToMD5 = JniInterface.getPWDKeyToMD5(null);
            C10257f.m5673b(f32032a, "-->getMD5FromNative, MD5= " + pWDKeyToMD5);
            return pWDKeyToMD5;
        } catch (Exception e) {
            C10257f.m5667e(f32032a, "-->get md5 form native exception: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void isPasswordEdit(String str) {
        C10257f.m5670c(f32032a, "-->is pswd edit, flag: " + str);
        int i = -1;
        try {
            i = Integer.parseInt(str);
        } catch (Exception e) {
            C10257f.m5667e(f32032a, "-->is pswd edit exception: " + e.getMessage());
        }
        if (i == 0 || i == 1) {
            if (i == 0) {
                isPWDEdit = false;
                return;
            } else if (i != 1) {
                return;
            } else {
                isPWDEdit = true;
                return;
            }
        }
        throw new RuntimeException("is pswd edit flag is illegal.");
    }
}
