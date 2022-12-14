package com.tencent.p263mm.sdk.platformtools;

import android.content.Context;
import android.os.Build;
import java.util.List;
/* renamed from: com.tencent.mm.sdk.platformtools.PhoneUtil */
/* loaded from: classes2.dex */
public final class PhoneUtil {
    public static final String CELL_CDMA = "cdma";
    public static final String CELL_GSM = "gsm";

    /* renamed from: aJ */
    private static final int f31638aJ = 17;

    /* renamed from: com.tencent.mm.sdk.platformtools.PhoneUtil$CellInfo */
    /* loaded from: classes2.dex */
    public static class CellInfo {
        public static final int MAX_CID = 65535;
        public static final int MAX_LAC = 65535;
        public String cellid;
        public String dbm;
        public String lac;
        public String mcc;
        public String mnc;
        public String networkId;
        public String stationId;
        public String systemId;
        public String type;

        public CellInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.mcc = str;
            this.mnc = str2;
            this.lac = str3;
            this.type = str6;
            this.cellid = str4;
            this.stationId = str7;
            this.networkId = str8;
            this.systemId = str9;
            this.dbm = str5;
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.PhoneUtil$MacInfo */
    /* loaded from: classes2.dex */
    public static class MacInfo {
        public String dbm;
        public String mac;

        public MacInfo(String str, String str2) {
            this.mac = str;
            this.dbm = str2;
        }
    }

    private PhoneUtil() {
    }

    public static List<CellInfo> getCellInfoList(Context context) {
        return Integer.valueOf(Build.VERSION.SDK).intValue() >= 5 ? new PhoneUtil20Impl().getCellInfoList(context) : new PhoneUtil16Impl().getCellInfoList(context);
    }

    public static String getCellXml(List<CellInfo> list) {
        if (list == null || list.size() <= 0) {
            return "";
        }
        String str = "";
        int i = 0;
        while (i < list.size()) {
            i++;
            str = (((((((((((str + "<cell ") + "mcc=\"" + list.get(i).mcc + "\" ") + "mnc=\"" + list.get(i).mnc + "\" ") + "lac=\"" + list.get(i).lac + "\" ") + "type=\"" + list.get(i).type + "\" ") + "stationId=\"" + list.get(i).stationId + "\" ") + "networkId=\"" + list.get(i).networkId + "\" ") + "systemId=\"" + list.get(i).systemId + "\" ") + "dbm=\"" + list.get(i).dbm + "\" ") + " >") + list.get(i).cellid) + "</cell>";
        }
        return str;
    }

    public static String getMacXml(List<MacInfo> list) {
        String str;
        String str2 = "";
        if (list == null || list.size() <= 0) {
            return "";
        }
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) == null || list.get(i).mac.length() != f31638aJ) {
                str = str2;
            } else {
                str = ((((str2 + "<mac ") + "macDbm=\"" + list.get(i).dbm + "\"") + ">") + list.get(i).mac) + "</mac>";
            }
            i++;
            str2 = str;
        }
        return str2;
    }

    public static void getSignalStrength(Context context) {
        if (Integer.valueOf(Build.VERSION.SDK).intValue() >= 5) {
            new PhoneUtil20Impl().getSignalStrength(context);
        } else {
            new PhoneUtil16Impl().getSignalStrength(context);
        }
    }
}
