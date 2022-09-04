package com.baidu.tts.database;

import com.baidu.tts.tools.SqlTool;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
/* loaded from: classes.dex */
public class FsFileInfoTable {

    /* loaded from: classes.dex */
    public enum Field {
        ABS_PATH("absPath", "varchar primary key"),
        STATE(XiaomiOAuthConstants.EXTRA_STATE_2, "integer");
        

        /* renamed from: c */
        private final String f2729c;

        /* renamed from: d */
        private final String f2730d;

        Field(String str, String str2) {
            this.f2729c = str;
            this.f2730d = str2;
        }

        public String getColumnName() {
            return this.f2729c;
        }

        public String getDataType() {
            return this.f2730d;
        }
    }

    /* renamed from: a */
    public static String m36395a() {
        return SqlTool.sqlCreateTable("fsFileInfo", Field.values());
    }

    /* renamed from: b */
    public static String m36394b() {
        return SqlTool.sqlDropTable("fsFileInfo");
    }
}
