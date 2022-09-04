package com.baidu.tts.database;

import com.baidu.tts.tools.SqlTool;
/* renamed from: com.baidu.tts.database.e */
/* loaded from: classes.dex */
public class C1158e {
    /* renamed from: a */
    public static String m36364a() {
        return "CREATE TABLE StatisticsInfo(id INTEGER PRIMARY KEY AUTOINCREMENT,uuid varchar(256),startInfo varchar(256),endInfo varchar(256))";
    }

    /* renamed from: b */
    public static String m36363b() {
        return SqlTool.sqlDropTable("StatisticsInfo");
    }
}
