package com.tencent.p263mm.sdk.plugin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import com.google.android.gms.common.C4538f;
import com.tencent.p263mm.algorithm.Base64;
import com.tencent.p263mm.sdk.ConstantsUI;
import com.tencent.p263mm.sdk.channel.MMessage;
import com.tencent.p263mm.sdk.platformtools.Log;
import com.tencent.p263mm.sdk.platformtools.Util;
import com.tencent.p263mm.sdk.plugin.MMPluginProviderConstants;
import org.p356d.AbstractC11759f;
/* renamed from: com.tencent.mm.sdk.plugin.MMPluginAPIImpl */
/* loaded from: classes2.dex */
public class MMPluginAPIImpl implements IMMPluginAPI {
    private static final String[] columns = {"key", "type", "value"};

    /* renamed from: R */
    private final Context f31684R;

    /* renamed from: aE */
    private String f31685aE;

    /* renamed from: bz */
    private MMessage.Receiver f31686bz;

    public MMPluginAPIImpl(Context context) {
        this.f31684R = context;
        this.f31685aE = context.getPackageName();
    }

    /* renamed from: a */
    private void m5852a(String str, String str2, Intent intent) {
        Intent intent2 = new Intent(str2);
        intent2.setClassName(MMPluginProviderConstants.PluginIntent.APP_PACKAGE_PATTERN, "com.tencent.mm.plugin.PluginProxyUI");
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra(MMPluginProviderConstants.PluginIntent.ACCESS_TOKEN, str);
        this.f31684R.startActivity(intent2);
    }

    /* renamed from: c */
    private Object m5851c(String str) {
        Object obj = null;
        Cursor query = this.f31684R.getContentResolver().query(MMPluginProviderConstants.PluginDB.CONTENT_URI, columns, null, new String[]{str}, null);
        if (query != null) {
            int columnIndex = query.getColumnIndex("type");
            int columnIndex2 = query.getColumnIndex("value");
            if (query.moveToFirst()) {
                obj = MMPluginProviderConstants.Resolver.resolveObj(query.getInt(columnIndex), query.getString(columnIndex2));
            }
            query.close();
        }
        return obj;
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public boolean appendNetStat(int i, int i2, int i3) {
        return Util.nullAsFalse((Boolean) m5851c("plugindb://" + this.f31685aE + "/action.appnetstat?recv=" + i + "&send=" + i2 + "&type=" + i3));
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public void createMsgController(String str) {
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public void createQRCodeController(String str) {
        m5852a(str, "qrcode", null);
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public void createQRCodeController(String str, MMessage.CallBack callBack) {
        createQRCodeController(str, callBack, AbstractC11759f.f37104a);
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public void createQRCodeController(String str, MMessage.CallBack callBack, String str2) {
        m5852a(str, "qrcode", new Intent().putExtra("qrcode_pattern", str2));
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public Profile getCurrentProfile(String str) {
        Profile profile = null;
        Cursor query = this.f31684R.getContentResolver().query(Profile.CONTENT_URI, Profile.columns, null, new String[]{str}, null);
        if (query == null) {
            Log.m5875e("MicroMsg.SDK.MMPluginMgrImpl", "get current profile failed");
        } else {
            if (query.moveToFirst()) {
                profile = new Profile();
                profile.convertFrom(query);
            }
            query.close();
        }
        return profile;
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public String getPluginKey(String str) {
        return (String) m5851c("plugindb://" + str + "/comm.pluginkey");
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public boolean installPlugin(String str) {
        return Util.nullAsFalse((Boolean) m5851c("plugindb://" + str + "/action.install"));
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public boolean isPluginInstalled(String str) {
        return Util.nullAsFalse((Boolean) m5851c("plugindb://" + str + "/comm.installed"));
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public void jumpToBindEmail(String str) {
        m5852a(str, "bindemail", new Intent());
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public void jumpToBindMobile(String str) {
        m5852a(str, "bindmobile", new Intent());
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public void jumpToBindQQ(String str) {
        m5852a(str, "bindqq", new Intent());
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public void jumpToChattingUI(String str, String str2) {
        m5852a(str, "chatting", new Intent().putExtra(ConstantsUI.Contact.KUser, str2).setFlags(67108864));
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public void jumpToSettingView(String str, String str2) {
        m5852a(str, C4538f.f16921a, new Intent().putExtra(ConstantsUI.Contact.KUser, str2).setFlags(67108864));
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public boolean registerAutoMsg(String str, String str2) {
        return Util.nullAsFalse((Boolean) m5851c("plugindb://" + this.f31685aE + "/action.automsg?pluginMsgUsername=" + str + "&pluginUsername=" + str2));
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public boolean registerPattern(String str, MMessage.CallBack callBack, String str2) {
        return false;
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public boolean registerQRCodePattern(String str, MMessage.CallBack callBack, String str2) {
        if (this.f31686bz != null) {
            this.f31684R.unregisterReceiver(this.f31686bz);
        }
        this.f31686bz = new MMessage.Receiver(callBack);
        this.f31684R.registerReceiver(this.f31686bz, new IntentFilter(MMPluginProviderConstants.PluginIntent.ACTION_QRCODE_SCANNED));
        return Util.nullAsFalse((Boolean) m5851c("plugindb://" + str + "/action.register_qrcode_result?pattern=" + str2));
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public void release() {
        Log.m5877d("MicroMsg.SDK.MMPluginMgrImpl", "release plugin mgr implemetation");
        if (this.f31686bz != null) {
            this.f31684R.unregisterReceiver(this.f31686bz);
            Log.m5877d("MicroMsg.SDK.MMPluginMgrImpl", "unregister qrcode scan result receiver");
        }
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public boolean sendMsgNotify(String str, String str2, int i, String str3, Class<?> cls) {
        if (cls == null) {
            return false;
        }
        return Util.nullAsFalse((Boolean) m5851c("plugindb://" + this.f31685aE + "/action.msgnotify?username=" + str + "&msgContent=" + str2 + "&msgType=" + i + "&customNotify=" + str3 + "&intentUri=" + Base64.encodeToString(new Intent(this.f31684R, cls).toUri(0).getBytes(), false)));
    }

    @Override // com.tencent.p263mm.sdk.plugin.IMMPluginAPI
    public boolean unregisterAutoMsg(String str, String str2) {
        return Util.nullAsFalse((Boolean) m5851c("plugindb://" + this.f31685aE + "/action.unautomsg?pluginMsgUsername=" + str + "&pluginUsername=" + str2));
    }
}
