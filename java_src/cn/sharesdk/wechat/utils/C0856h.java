package cn.sharesdk.wechat.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.utils.C0831d;
import com.google.android.gms.drive.AbstractC4808e;
import com.mob.tools.utils.ResHelper;
import com.tencent.p263mm.sdk.channel.ConstantsMMessage;
import com.tencent.p263mm.sdk.openapi.ConstantsAPI;
import com.tencent.p263mm.sdk.plugin.MMPluginProviderConstants;
import com.xiaomi.market.sdk.AbstractC10446k;
import java.security.MessageDigest;
/* renamed from: cn.sharesdk.wechat.utils.h */
/* loaded from: classes.dex */
public class C0856h {

    /* renamed from: a */
    private Context f1734a;

    /* renamed from: b */
    private String f1735b;

    /* renamed from: a */
    private String m37675a(String str) {
        try {
            Cursor query = this.f1734a.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.plugin.provider/sharedpref"), new String[]{AbstractC10446k._ID, "key", "type", "value"}, "key = ?", new String[]{str}, null);
            if (query == null) {
                return null;
            }
            String string = query.moveToFirst() ? query.getString(query.getColumnIndex("value")) : null;
            query.close();
            return string;
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return null;
        }
    }

    /* renamed from: a */
    private boolean m37673a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0) {
            C0831d.m37772a().m6200d("checkSumConsistent fail, invalid arguments, \"_mmessage_checksum\" is empty", new Object[0]);
            return false;
        } else if (bArr2 == null || bArr2.length == 0) {
            C0831d.m37772a().m6200d("checkSumConsistent fail, invalid arguments, checksum is empty", new Object[0]);
            return false;
        } else if (bArr.length != bArr2.length) {
            C0831d.m37772a().m6200d("checkSumConsistent fail, length is different", new Object[0]);
            return false;
        } else {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    C0831d.m37772a().m6200d("checkSumConsistent fail, not match", new Object[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private byte[] m37674a(String str, String str2, int i) {
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        byte[] bytes = stringBuffer.toString().substring(1, 9).getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i2 = 0;
            for (byte b : digest) {
                cArr2[i2] = cArr[(b >>> 4) & 15];
                int i3 = i2 + 1;
                cArr2[i3] = cArr[b & 15];
                i2 = i3 + 1;
            }
            str3 = new String(cArr2);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            str3 = null;
        }
        if (str3 != null) {
            return str3.getBytes();
        }
        return null;
    }

    /* renamed from: d */
    private boolean m37670d() {
        C0831d.m37772a().m6200d("checking signature of wechat client...", new Object[0]);
        try {
            PackageInfo packageInfo = this.f1734a.getPackageManager().getPackageInfo(MMPluginProviderConstants.PluginIntent.APP_PACKAGE_PATTERN, 64);
            int length = packageInfo.signatures.length;
            for (int i = 0; i < length; i++) {
                if ("308202eb30820254a00302010202044d36f7a4300d06092a864886f70d01010505003081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e74301e170d3131303131393134333933325a170d3431303131313134333933325a3081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e7430819f300d06092a864886f70d010101050003818d0030818902818100c05f34b231b083fb1323670bfbe7bdab40c0c0a6efc87ef2072a1ff0d60cc67c8edb0d0847f210bea6cbfaa241be70c86daf56be08b723c859e52428a064555d80db448cdcacc1aea2501eba06f8bad12a4fa49d85cacd7abeb68945a5cb5e061629b52e3254c373550ee4e40cb7c8ae6f7a8151ccd8df582d446f39ae0c5e930203010001300d06092a864886f70d0101050500038181009c8d9d7f2f908c42081b4c764c377109a8b2c70582422125ce545842d5f520aea69550b6bd8bfd94e987b75a3077eb04ad341f481aac266e89d3864456e69fba13df018acdc168b9a19dfd7ad9d9cc6f6ace57c746515f71234df3a053e33ba93ece5cd0fc15f3e389a3f365588a9fcb439e069d3629cd7732a13fff7b891499".equals(packageInfo.signatures[i].toCharsString())) {
                    C0831d.m37772a().m6200d("pass!", new Object[0]);
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return false;
        }
    }

    /* renamed from: a */
    public void m37676a(AbstractC0858j abstractC0858j) {
        if (!m37672b()) {
            throw new WechatClientNotExistException();
        }
        if (!abstractC0858j.mo37660b()) {
            throw new Throwable("sendReq checkArgs fail");
        }
        String packageName = this.f1734a.getPackageName();
        String str = "weixin://sendreq?appid=" + this.f1735b;
        Intent intent = new Intent();
        intent.setClassName(MMPluginProviderConstants.PluginIntent.APP_PACKAGE_PATTERN, "com.tencent.mm.plugin.base.stub.WXEntryActivity");
        Bundle bundle = new Bundle();
        abstractC0858j.mo37661a(bundle);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra(ConstantsMMessage.SDK_VERSION, 553844737);
        intent.putExtra(ConstantsMMessage.APP_PACKAGE, packageName);
        intent.putExtra(ConstantsMMessage.CONTENT, str);
        intent.putExtra(ConstantsMMessage.CHECK_SUM, m37674a(str, packageName, 553844737));
        intent.addFlags(AbstractC4808e.f17570a_);
        intent.addFlags(134217728);
        this.f1734a.startActivity(intent);
        C0831d.m37772a().m6200d("starting activity, packageName=com.tencent.mm, className=com.tencent.mm.plugin.base.stub.WXEntryActivity", new Object[0]);
    }

    /* renamed from: a */
    public boolean m37679a() {
        String str;
        try {
            str = this.f1734a.getPackageManager().getPackageInfo(MMPluginProviderConstants.PluginIntent.APP_PACKAGE_PATTERN, 0).versionName;
            C0831d.m37772a().m6194i("wechat versionName ==>> " + str, new Object[0]);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            str = "0";
        }
        String[] split = str.split("_")[0].split("\\.");
        int[] iArr = new int[split.length];
        for (int i = 0; i < iArr.length; i++) {
            try {
                iArr[i] = ResHelper.parseInt(split[i]);
            } catch (Throwable th2) {
                C0831d.m37772a().m6199d(th2);
                iArr[i] = 0;
            }
        }
        return iArr.length >= 4 && iArr[0] == 6 && iArr[1] == 0 && iArr[2] == 2 && iArr[3] <= 56;
    }

    /* renamed from: a */
    public boolean m37678a(Context context, String str) {
        this.f1734a = context;
        this.f1735b = str;
        if (!m37670d()) {
            C0831d.m37772a().m6200d("register app failed for wechat app signature check failed", new Object[0]);
            return false;
        }
        String str2 = "weixin://registerapp?appid=" + str;
        String packageName = context.getPackageName();
        Intent intent = new Intent(ConstantsAPI.ACTION_HANDLE_APP_REGISTER);
        intent.putExtra(ConstantsMMessage.SDK_VERSION, 553910273);
        intent.putExtra(ConstantsMMessage.APP_PACKAGE, packageName);
        intent.putExtra(ConstantsMMessage.CONTENT, str2);
        intent.putExtra(ConstantsMMessage.CHECK_SUM, m37674a(str2, packageName, 553910273));
        context.sendBroadcast(intent, "com.tencent.mm.permission.MM_MESSAGE");
        C0831d.m37772a().m6200d("sending broadcast, intent=" + ConstantsAPI.ACTION_HANDLE_APP_REGISTER + ", perm=com.tencent.mm.permission.MM_MESSAGE", new Object[0]);
        return true;
    }

    /* renamed from: a */
    public boolean m37677a(WechatHandlerActivity wechatHandlerActivity, C0857i c0857i) {
        Intent intent = wechatHandlerActivity.getIntent();
        if (intent == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra(ConstantsAPI.WX_TOKEN_KEY);
        if (stringExtra == null || !stringExtra.equals(ConstantsAPI.WX_TOKEN_VALUE)) {
            C0831d.m37772a().m6200d("invalid argument, \"wx_token_key\" is empty or does not equals \"com.tencent.mm.openapi.token\"", new Object[0]);
            return false;
        }
        String stringExtra2 = intent.getStringExtra(ConstantsMMessage.APP_PACKAGE);
        if (TextUtils.isEmpty(stringExtra2)) {
            C0831d.m37772a().m6200d("invalid argument, \"_mmessage_appPackage\" is empty", new Object[0]);
            return false;
        }
        if (!m37673a(intent.getByteArrayExtra(ConstantsMMessage.CHECK_SUM), m37674a(intent.getStringExtra(ConstantsMMessage.CONTENT), stringExtra2, intent.getIntExtra(ConstantsMMessage.SDK_VERSION, 0)))) {
            C0831d.m37772a().m6200d("checksum fail", new Object[0]);
            return false;
        }
        Bundle extras = intent.getExtras();
        switch (extras.getInt("_wxapi_command_type", 0)) {
            case 1:
                c0857i.m37666a(new C0848b(extras));
                break;
            case 2:
                c0857i.m37666a(new C0851e(extras));
                break;
            case 3:
                wechatHandlerActivity.onGetMessageFromWXReq(new C0849c(extras).f1720a);
                break;
            case 4:
                wechatHandlerActivity.onShowMessageFromWXReq(new C0852f(extras).f1723a);
                break;
            default:
                return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean m37672b() {
        return m37670d();
    }

    /* renamed from: c */
    public boolean m37671c() {
        int i;
        try {
            i = ResHelper.parseInt(m37675a("_build_info_sdk_int_"));
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            i = -1;
        }
        return i >= 553779201;
    }
}
