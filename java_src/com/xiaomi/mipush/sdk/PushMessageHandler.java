package com.xiaomi.mipush.sdk;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.service.C10636aw;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class PushMessageHandler extends IntentService {

    /* renamed from: a */
    private static List<MiPushClient.MiPushClientCallback> f32540a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.mipush.sdk.PushMessageHandler$a */
    /* loaded from: classes.dex */
    public interface AbstractC10468a extends Serializable {
    }

    public PushMessageHandler() {
        super("mipush message handler");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m5046a() {
        synchronized (f32540a) {
            f32540a.clear();
        }
    }

    /* renamed from: a */
    public static void m5045a(long j, String str, String str2) {
        synchronized (f32540a) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : f32540a) {
                miPushClientCallback.onInitializeResult(j, str, str2);
            }
        }
    }

    /* renamed from: a */
    public static void m5044a(Context context, MiPushMessage miPushMessage) {
        synchronized (f32540a) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : f32540a) {
                if (m5039a(miPushMessage.getCategory(), miPushClientCallback.getCategory())) {
                    miPushClientCallback.onReceiveMessage(miPushMessage.getContent(), miPushMessage.getAlias(), miPushMessage.getTopic(), miPushMessage.isNotified());
                    miPushClientCallback.onReceiveMessage(miPushMessage);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m5043a(Context context, AbstractC10468a abstractC10468a) {
        String str = null;
        if (abstractC10468a instanceof MiPushMessage) {
            m5044a(context, (MiPushMessage) abstractC10468a);
        } else if (!(abstractC10468a instanceof MiPushCommandMessage)) {
        } else {
            MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) abstractC10468a;
            String command = miPushCommandMessage.getCommand();
            if (MiPushClient.COMMAND_REGISTER.equals(command)) {
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                if (commandArguments != null && !commandArguments.isEmpty()) {
                    str = commandArguments.get(0);
                }
                m5045a(miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            } else if (MiPushClient.COMMAND_SET_ALIAS.equals(command) || MiPushClient.COMMAND_UNSET_ALIAS.equals(command) || MiPushClient.COMMAND_SET_ACCEPT_TIME.equals(command)) {
                m5041a(context, miPushCommandMessage.getCategory(), command, miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), miPushCommandMessage.getCommandArguments());
            } else if (MiPushClient.COMMAND_SUBSCRIBE_TOPIC.equals(command)) {
                List<String> commandArguments2 = miPushCommandMessage.getCommandArguments();
                m5042a(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), (commandArguments2 == null || commandArguments2.isEmpty()) ? null : commandArguments2.get(0));
            } else if (!MiPushClient.COMMAND_UNSUBSCRIBE_TOPIC.equals(command)) {
            } else {
                List<String> commandArguments3 = miPushCommandMessage.getCommandArguments();
                m5037b(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), (commandArguments3 == null || commandArguments3.isEmpty()) ? null : commandArguments3.get(0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m5042a(Context context, String str, long j, String str2, String str3) {
        synchronized (f32540a) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : f32540a) {
                if (m5039a(str, miPushClientCallback.getCategory())) {
                    miPushClientCallback.onSubscribeResult(j, str2, str3);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m5041a(Context context, String str, String str2, long j, String str3, List<String> list) {
        synchronized (f32540a) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : f32540a) {
                if (m5039a(str, miPushClientCallback.getCategory())) {
                    miPushClientCallback.onCommandResult(str2, j, str3, list);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m5040a(MiPushClient.MiPushClientCallback miPushClientCallback) {
        synchronized (f32540a) {
            if (!f32540a.contains(miPushClientCallback)) {
                f32540a.add(miPushClientCallback);
            }
        }
    }

    /* renamed from: a */
    protected static boolean m5039a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }

    /* renamed from: b */
    protected static void m5037b(Context context, String str, long j, String str2, String str3) {
        synchronized (f32540a) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : f32540a) {
                if (m5039a(str, miPushClientCallback.getCategory())) {
                    miPushClientCallback.onUnsubscribeResult(j, str2, str3);
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m5038b() {
        return f32540a.isEmpty();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        ResolveInfo resolveInfo;
        try {
            if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
                if (!C10469a.m5034a(this).m5020i()) {
                    return;
                }
                C10494u.m4943a(this).m4945a();
                String stringExtra = intent.getStringExtra("waker_pkgname");
                JSONObject jSONObject = new JSONObject();
                if (TextUtils.isEmpty(stringExtra)) {
                    jSONObject.put("wakerPkgName", stringExtra);
                }
                jSONObject.put("selfPkgName", getPackageName());
                C10636aw.m4319a().m4309a("system_running_log", "wake_up_app", 1L, jSONObject.toString());
            } else if (1 == PushMessageHelper.getPushMode(this)) {
                if (m5038b()) {
                    AbstractC10404b.m5264d("receive a message before application calling initialize");
                    return;
                }
                AbstractC10468a m4952a = C10492s.m4955a(this).m4952a(intent);
                if (m4952a == null) {
                    return;
                }
                m5043a(this, m4952a);
            } else {
                Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                intent2.setPackage(getPackageName());
                intent2.putExtras(intent);
                try {
                    List<ResolveInfo> queryBroadcastReceivers = getPackageManager().queryBroadcastReceivers(intent2, 32);
                    if (queryBroadcastReceivers != null) {
                        Iterator<ResolveInfo> it2 = queryBroadcastReceivers.iterator();
                        while (it2.hasNext()) {
                            resolveInfo = it2.next();
                            if (resolveInfo.activityInfo != null && resolveInfo.activityInfo.packageName.equals(getPackageName())) {
                                break;
                            }
                        }
                    }
                    resolveInfo = null;
                    if (resolveInfo != null) {
                        ((PushMessageReceiver) Class.forName(resolveInfo.activityInfo.name).newInstance()).onReceive(getApplicationContext(), intent2);
                    } else {
                        AbstractC10404b.m5264d("cannot find the receiver to handler this message, check your manifest");
                    }
                } catch (Exception e) {
                    AbstractC10404b.m5267a(e);
                }
            }
        } catch (Throwable th) {
            AbstractC10404b.m5267a(th);
        }
    }
}
