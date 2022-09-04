package cn.sharesdk.framework.p075a;

import android.text.TextUtils;
import cn.sharesdk.framework.ShareSDK;
import com.mob.tools.network.HTTPPart;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.network.RawNetworkCallback;
import java.util.ArrayList;
/* renamed from: cn.sharesdk.framework.a.a */
/* loaded from: classes.dex */
public class C0783a extends NetworkHelper {

    /* renamed from: a */
    private static C0783a f1501a = null;

    private C0783a() {
    }

    /* renamed from: a */
    public static C0783a m38003a() {
        if (f1501a == null) {
            f1501a = new C0783a();
        }
        return f1501a;
    }

    /* renamed from: a */
    private void m38002a(String str, int i) {
        if (TextUtils.isEmpty(str) || i <= 0) {
            return;
        }
        ShareSDK.logApiEvent(str, i);
    }

    /* renamed from: a */
    public String m38000a(String str, ArrayList<KVPair<String>> arrayList, KVPair<String> kVPair, String str2, int i) {
        return m37998a(str, arrayList, kVPair, (ArrayList<KVPair<String>>) null, str2, i);
    }

    /* renamed from: a */
    public String m37999a(String str, ArrayList<KVPair<String>> arrayList, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList2, NetworkHelper.NetworkTimeOut networkTimeOut, String str2, int i) {
        m38002a(str2, i);
        return super.httpPost(str, arrayList, kVPair, arrayList2, networkTimeOut);
    }

    /* renamed from: a */
    public String m37998a(String str, ArrayList<KVPair<String>> arrayList, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList2, String str2, int i) {
        return m37999a(str, arrayList, kVPair, arrayList2, null, str2, i);
    }

    /* renamed from: a */
    public String m37997a(String str, ArrayList<KVPair<String>> arrayList, String str2, int i) {
        return m37996a(str, arrayList, (ArrayList<KVPair<String>>) null, (NetworkHelper.NetworkTimeOut) null, str2, i);
    }

    /* renamed from: a */
    public String m37996a(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, NetworkHelper.NetworkTimeOut networkTimeOut, String str2, int i) {
        m38002a(str2, i);
        return super.httpGet(str, arrayList, arrayList2, networkTimeOut);
    }

    /* renamed from: a */
    public void m38001a(String str, ArrayList<KVPair<String>> arrayList, HTTPPart hTTPPart, RawNetworkCallback rawNetworkCallback, String str2, int i) {
        m38002a(str2, i);
        super.rawPost(str, arrayList, hTTPPart, rawNetworkCallback, (NetworkHelper.NetworkTimeOut) null);
    }

    /* renamed from: b */
    public String m37995b(String str, ArrayList<KVPair<String>> arrayList, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList2, NetworkHelper.NetworkTimeOut networkTimeOut, String str2, int i) {
        m38002a(str2, i);
        return super.httpPut(str, arrayList, kVPair, arrayList2, networkTimeOut);
    }

    /* renamed from: b */
    public String m37994b(String str, ArrayList<KVPair<String>> arrayList, String str2, int i) {
        return m38000a(str, arrayList, null, str2, i);
    }

    /* renamed from: b */
    public String m37993b(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, NetworkHelper.NetworkTimeOut networkTimeOut, String str2, int i) {
        m38002a(str2, i);
        return super.jsonPost(str, arrayList, arrayList2, networkTimeOut);
    }
}
