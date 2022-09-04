package p005b.p006a.p007a.p008a.p011c;

import p005b.p006a.p007a.p008a.p011c.p012a.AbstractC0277b;
import p005b.p006a.p007a.p008a.p011c.p012a.EnumC0276a;
import p005b.p006a.p007a.p008a.p011c.p012a.EnumC0280e;
/* renamed from: b.a.a.a.c.a */
/* loaded from: classes.dex */
public class C0275a {
    /* renamed from: a */
    public static String m39816a(AbstractC0277b abstractC0277b) {
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(abstractC0277b.mo39810a(EnumC0280e.LOGGING_EVENT_PROPERTY)).append(" (");
        sb.append(abstractC0277b.mo39808b(EnumC0276a.EVENT_ID)).append(", ");
        sb.append(abstractC0277b.mo39808b(EnumC0276a.MAPPED_KEY)).append(", ");
        sb.append(abstractC0277b.mo39808b(EnumC0276a.MAPPED_VALUE)).append(") ");
        sb.append("VALUES (?, ?, ?)");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m39815b(AbstractC0277b abstractC0277b) {
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(abstractC0277b.mo39810a(EnumC0280e.LOGGING_EVENT_EXCEPTION)).append(" (").append(abstractC0277b.mo39808b(EnumC0276a.EVENT_ID)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.I)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.TRACE_LINE)).append(") ").append("VALUES (?, ?, ?)");
        return sb.toString();
    }

    /* renamed from: c */
    public static String m39814c(AbstractC0277b abstractC0277b) {
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(abstractC0277b.mo39810a(EnumC0280e.LOGGING_EVENT)).append(" (").append(abstractC0277b.mo39808b(EnumC0276a.TIMESTMP)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.FORMATTED_MESSAGE)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.LOGGER_NAME)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.LEVEL_STRING)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.THREAD_NAME)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.REFERENCE_FLAG)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.ARG0)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.ARG1)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.ARG2)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.ARG3)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.CALLER_FILENAME)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.CALLER_CLASS)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.CALLER_METHOD)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.CALLER_LINE)).append(") ").append("VALUES (?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m39813d(AbstractC0277b abstractC0277b) {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(abstractC0277b.mo39810a(EnumC0280e.LOGGING_EVENT)).append(" (").append(abstractC0277b.mo39808b(EnumC0276a.TIMESTMP)).append(" BIGINT NOT NULL, ").append(abstractC0277b.mo39808b(EnumC0276a.FORMATTED_MESSAGE)).append(" TEXT NOT NULL, ").append(abstractC0277b.mo39808b(EnumC0276a.LOGGER_NAME)).append(" VARCHAR(254) NOT NULL, ").append(abstractC0277b.mo39808b(EnumC0276a.LEVEL_STRING)).append(" VARCHAR(254) NOT NULL, ").append(abstractC0277b.mo39808b(EnumC0276a.THREAD_NAME)).append(" VARCHAR(254), ").append(abstractC0277b.mo39808b(EnumC0276a.REFERENCE_FLAG)).append(" SMALLINT, ").append(abstractC0277b.mo39808b(EnumC0276a.ARG0)).append(" VARCHAR(254), ").append(abstractC0277b.mo39808b(EnumC0276a.ARG1)).append(" VARCHAR(254), ").append(abstractC0277b.mo39808b(EnumC0276a.ARG2)).append(" VARCHAR(254), ").append(abstractC0277b.mo39808b(EnumC0276a.ARG3)).append(" VARCHAR(254), ").append(abstractC0277b.mo39808b(EnumC0276a.CALLER_FILENAME)).append(" VARCHAR(254), ").append(abstractC0277b.mo39808b(EnumC0276a.CALLER_CLASS)).append(" VARCHAR(254), ").append(abstractC0277b.mo39808b(EnumC0276a.CALLER_METHOD)).append(" VARCHAR(254), ").append(abstractC0277b.mo39808b(EnumC0276a.CALLER_LINE)).append(" CHAR(4), ").append(abstractC0277b.mo39808b(EnumC0276a.EVENT_ID)).append(" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT").append(")");
        return sb.toString();
    }

    /* renamed from: e */
    public static String m39812e(AbstractC0277b abstractC0277b) {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(abstractC0277b.mo39810a(EnumC0280e.LOGGING_EVENT_PROPERTY)).append(" (").append(abstractC0277b.mo39808b(EnumC0276a.EVENT_ID)).append(" BIGINT NOT NULL, ").append(abstractC0277b.mo39808b(EnumC0276a.MAPPED_KEY)).append(" VARCHAR(254) NOT NULL, ").append(abstractC0277b.mo39808b(EnumC0276a.MAPPED_VALUE)).append(" VARCHAR(254) NOT NULL, ").append("PRIMARY KEY (").append(abstractC0277b.mo39808b(EnumC0276a.EVENT_ID)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.MAPPED_KEY)).append("), ").append("FOREIGN KEY (").append(abstractC0277b.mo39808b(EnumC0276a.EVENT_ID)).append(") ").append("REFERENCES ").append(abstractC0277b.mo39810a(EnumC0280e.LOGGING_EVENT)).append(" (").append(abstractC0277b.mo39808b(EnumC0276a.EVENT_ID)).append(") ").append(")");
        return sb.toString();
    }

    /* renamed from: f */
    public static String m39811f(AbstractC0277b abstractC0277b) {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(abstractC0277b.mo39810a(EnumC0280e.LOGGING_EVENT_EXCEPTION)).append(" (").append(abstractC0277b.mo39808b(EnumC0276a.EVENT_ID)).append(" BIGINT NOT NULL, ").append(abstractC0277b.mo39808b(EnumC0276a.I)).append(" SMALLINT NOT NULL, ").append(abstractC0277b.mo39808b(EnumC0276a.TRACE_LINE)).append(" VARCHAR(254) NOT NULL, ").append("PRIMARY KEY (").append(abstractC0277b.mo39808b(EnumC0276a.EVENT_ID)).append(", ").append(abstractC0277b.mo39808b(EnumC0276a.I)).append("), ").append("FOREIGN KEY (").append(abstractC0277b.mo39808b(EnumC0276a.EVENT_ID)).append(") ").append("REFERENCES ").append(abstractC0277b.mo39810a(EnumC0280e.LOGGING_EVENT)).append(" (").append(abstractC0277b.mo39808b(EnumC0276a.EVENT_ID)).append(") ").append(")");
        return sb.toString();
    }
}
