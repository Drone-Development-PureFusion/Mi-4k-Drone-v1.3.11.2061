package com.tencent.p263mm.sdk.contact;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p263mm.sdk.platformtools.LVBuffer;
import com.tencent.p263mm.sdk.platformtools.Log;
import com.tencent.p263mm.sdk.platformtools.Util;
import com.tencent.p263mm.sdk.storage.MAutoDBItem;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
import org.p286a.p287a.p299f.p302c.C11125l;
/* renamed from: com.tencent.mm.sdk.contact.RContact */
/* loaded from: classes2.dex */
public class RContact extends MAutoDBItem {
    public static final String[] COLUMNS;
    public static final String COL_ALIAS = "alias";
    public static final String COL_CONREMARK = "conRemark";
    public static final String COL_CONREMARK_PYFULL = "conRemarkPYFull";
    public static final String COL_CONREMARK_PYSHORT = "conRemarkPYShort";
    public static final String COL_DOMAINLIST = "domainList";
    public static final int COL_ID_INVALID_VALUE = -1;
    public static final String COL_NICKNAME = "nickname";
    public static final String COL_PYINITIAL = "pyInitial";
    public static final String COL_QUANPIN = "quanPin";
    public static final String COL_SHOWHEAD = "showHead";
    public static final String COL_TYPE = "type";
    public static final String COL_USERNAME = "username";
    public static final String COL_VERIFY_FLAG = "verifyFlag";
    public static final String COL_WEIBOFLAG = "weiboFlag";
    public static final String COL_WEIBONICKNAME = "weiboNickname";
    public static final int DEL_CONTACT_MSG = -1;
    public static final String FAVOUR_CONTACT_SHOW_HEAD_CHAR = "$";
    public static final int FAVOUR_CONTACT_SHOW_HEAD_CODE = 32;
    public static final int MM_CONTACTFLAG_ALL = 127;
    public static final int MM_CONTACTFLAG_BLACKLISTCONTACT = 8;
    public static final int MM_CONTACTFLAG_CHATCONTACT = 2;
    public static final int MM_CONTACTFLAG_CHATROOMCONTACT = 4;
    public static final int MM_CONTACTFLAG_CONTACT = 1;
    public static final int MM_CONTACTFLAG_DOMAINCONTACT = 16;
    public static final int MM_CONTACTFLAG_FAVOURCONTACT = 64;
    public static final int MM_CONTACTFLAG_HIDECONTACT = 32;
    public static final int MM_CONTACTFLAG_NULL = 0;
    public static final int MM_CONTACTIMGFLAG_HAS_HEADIMG = 3;
    public static final int MM_CONTACTIMGFLAG_HAS_NO_HEADIMG = 4;
    public static final int MM_CONTACTIMGFLAG_LOCAL_EXIST = 153;
    public static final int MM_CONTACTIMGFLAG_MODIFY = 2;
    public static final int MM_CONTACTIMGFLAG_NOTMODIFY = 1;
    public static final int MM_CONTACT_BOTTLE = 5;
    public static final int MM_CONTACT_CHATROOM = 2;
    public static final int MM_CONTACT_EMAIL = 3;
    public static final int MM_CONTACT_QQ = 4;
    public static final int MM_CONTACT_QQMICROBLOG = 1;
    public static final int MM_CONTACT_WEIXIN = 0;
    public static final int MM_SEX_FEMALE = 2;
    public static final int MM_SEX_MALE = 1;
    public static final int MM_SEX_UNKNOWN = 0;
    public static final int NOT_IN_CHAT_LIST = 0;

    /* renamed from: p */
    protected static Field[] f31558p;

    /* renamed from: A */
    private String f31559A;

    /* renamed from: B */
    private int f31560B;

    /* renamed from: C */
    private int f31561C;

    /* renamed from: D */
    private String f31562D;

    /* renamed from: E */
    private String f31563E;

    /* renamed from: F */
    private String f31564F;

    /* renamed from: G */
    private String f31565G;

    /* renamed from: H */
    private int f31566H;

    /* renamed from: I */
    private int f31567I;

    /* renamed from: J */
    private String f31568J;

    /* renamed from: K */
    private String f31569K;

    /* renamed from: L */
    private String f31570L;
    public long contactId;
    public String field_alias;
    public String field_conRemark;
    public String field_conRemarkPYFull;
    public String field_conRemarkPYShort;
    public String field_domainList;
    public byte[] field_lvbuff;
    public String field_nickname;
    public String field_pyInitial;
    public String field_quanPin;
    public int field_showHead;
    public int field_type;
    public String field_username;
    public int field_verifyFlag;
    public int field_weiboFlag;
    public String field_weiboNickname;

    /* renamed from: h */
    private int f31571h;

    /* renamed from: q */
    private int f31572q;

    /* renamed from: r */
    private int f31573r;

    /* renamed from: s */
    private String f31574s;

    /* renamed from: u */
    private long f31575u;

    /* renamed from: v */
    private String f31576v;

    /* renamed from: w */
    private String f31577w;

    /* renamed from: x */
    private int f31578x;

    /* renamed from: y */
    private int f31579y;

    /* renamed from: z */
    private String f31580z;

    /* renamed from: M */
    private static Map<String, String> f31556M = new HashMap();

    /* renamed from: N */
    private static Map<String, String> f31557N = new HashMap();

    static {
        Field[] validFields = MAutoDBItem.getValidFields(RContact.class);
        f31558p = validFields;
        COLUMNS = MAutoDBItem.getFullColumns(validFields);
    }

    public RContact() {
        reset();
    }

    public RContact(String str) {
        this();
        this.field_username = str == null ? "" : str;
    }

    /* renamed from: a */
    private byte[] m5889a() {
        try {
            LVBuffer lVBuffer = new LVBuffer();
            lVBuffer.initBuild();
            lVBuffer.putInt(this.f31572q);
            lVBuffer.putInt(this.f31573r);
            lVBuffer.putString(this.f31574s);
            lVBuffer.putLong(this.f31575u);
            lVBuffer.putInt(this.f31571h);
            lVBuffer.putString(this.f31576v);
            lVBuffer.putString(this.f31577w);
            lVBuffer.putInt(this.f31578x);
            lVBuffer.putInt(this.f31579y);
            lVBuffer.putString(this.f31580z);
            lVBuffer.putString(this.f31559A);
            lVBuffer.putInt(this.f31560B);
            lVBuffer.putInt(this.f31561C);
            lVBuffer.putString(this.f31562D);
            lVBuffer.putString(this.f31563E);
            lVBuffer.putString(this.f31564F);
            lVBuffer.putString(this.f31565G);
            lVBuffer.putInt(this.f31566H);
            lVBuffer.putInt(this.f31567I);
            lVBuffer.putString(this.f31568J);
            lVBuffer.putInt(this.field_verifyFlag);
            lVBuffer.putString(this.f31569K);
            lVBuffer.putString(this.f31570L);
            return lVBuffer.buildFinish();
        } catch (Exception e) {
            Log.m5875e("MicroMsg.Contact", "get value failed");
            e.printStackTrace();
            return null;
        }
    }

    public static String formatDisplayNick(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase().endsWith("@t.qq.com") ? "@" + str.replace("@t.qq.com", "") : str.toLowerCase().endsWith("@qqim") ? str.replace("@qqim", "") : str;
    }

    public static int getBlackListContactBit() {
        return 8;
    }

    public static int getContactBit() {
        return 1;
    }

    public static int getDomainContactBit() {
        return 16;
    }

    public static int getHiddenContactBit() {
        return 32;
    }

    public static boolean isContact(int i) {
        return (i & 1) != 0;
    }

    private static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static void setHardCodeAliasMaps(Map<String, String> map) {
        f31557N = map;
    }

    public static void setHardCodeNickMaps(Map<String, String> map) {
        f31556M = map;
    }

    public int calculateShowHead() {
        char c = C11125l.f35805c;
        if (this.field_conRemarkPYShort != null && !this.field_conRemarkPYShort.equals("")) {
            c = this.field_conRemarkPYShort.charAt(0);
        } else if (this.field_conRemarkPYFull != null && !this.field_conRemarkPYFull.equals("")) {
            c = this.field_conRemarkPYFull.charAt(0);
        } else if (this.field_pyInitial != null && !this.field_pyInitial.equals("")) {
            c = this.field_pyInitial.charAt(0);
        } else if (this.field_quanPin != null && !this.field_quanPin.equals("")) {
            c = this.field_quanPin.charAt(0);
        } else if (this.field_nickname != null && !this.field_nickname.equals("") && isLetter(this.field_nickname.charAt(0))) {
            c = this.field_nickname.charAt(0);
        } else if (this.field_username != null && !this.field_username.equals("") && isLetter(this.field_username.charAt(0))) {
            c = this.field_username.charAt(0);
        }
        return (c < 'a' || c > 'z') ? (c < 'A' || c > 'Z') ? Opcodes.LSHR : c : (char) (c - ' ');
    }

    @Override // com.tencent.p263mm.sdk.storage.MAutoDBItem, com.tencent.p263mm.sdk.storage.MDBItem
    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
        this.contactId = (int) cursor.getLong(cursor.getColumnCount() - 1);
        byte[] bArr = this.field_lvbuff;
        try {
            LVBuffer lVBuffer = new LVBuffer();
            int initParse = lVBuffer.initParse(bArr);
            if (initParse != 0) {
                Log.m5875e("MicroMsg.Contact", "parse LVBuffer error:" + initParse);
            } else {
                this.f31572q = lVBuffer.getInt();
                this.f31573r = lVBuffer.getInt();
                this.f31574s = lVBuffer.getString();
                this.f31575u = lVBuffer.getLong();
                this.f31571h = lVBuffer.getInt();
                this.f31576v = lVBuffer.getString();
                this.f31577w = lVBuffer.getString();
                this.f31578x = lVBuffer.getInt();
                this.f31579y = lVBuffer.getInt();
                this.f31580z = lVBuffer.getString();
                this.f31559A = lVBuffer.getString();
                this.f31560B = lVBuffer.getInt();
                this.f31561C = lVBuffer.getInt();
                this.f31562D = lVBuffer.getString();
                this.f31563E = lVBuffer.getString();
                this.f31564F = lVBuffer.getString();
                this.f31565G = lVBuffer.getString();
                this.f31566H = lVBuffer.getInt();
                this.f31567I = lVBuffer.getInt();
                this.f31568J = lVBuffer.getString();
                this.field_verifyFlag = lVBuffer.getInt();
                this.f31569K = lVBuffer.getString();
                if (!lVBuffer.checkGetFinish()) {
                    this.f31570L = lVBuffer.getString();
                }
            }
        } catch (Exception e) {
            Log.m5875e("MicroMsg.Contact", "get value failed");
            e.printStackTrace();
        }
    }

    @Override // com.tencent.p263mm.sdk.storage.MAutoDBItem, com.tencent.p263mm.sdk.storage.MDBItem
    public ContentValues convertTo() {
        this.field_lvbuff = m5889a();
        return super.convertTo();
    }

    @Override // com.tencent.p263mm.sdk.storage.MAutoDBItem
    public Field[] fields() {
        return f31558p;
    }

    public String getAlias() {
        String str = f31557N.get(this.field_username);
        return str == null ? this.field_alias : str;
    }

    public int getChatroomNotify() {
        return this.f31560B;
    }

    public String getCity() {
        return this.f31564F;
    }

    public String getConQQMBlog() {
        return this.f31559A;
    }

    public String getConRemark() {
        return this.field_conRemark;
    }

    public String getConRemarkPYFull() {
        return this.field_conRemarkPYFull;
    }

    public String getConRemarkPYShort() {
        return this.field_conRemarkPYShort;
    }

    public String getConSMBlog() {
        return this.f31580z;
    }

    public int getConType() {
        return this.f31579y;
    }

    public int getContactID() {
        return (int) this.contactId;
    }

    public String getDisplayNick() {
        String str = f31556M.get(this.field_username);
        return str != null ? str : (this.field_nickname == null || this.field_nickname.length() <= 0) ? getDisplayUser() : this.field_nickname;
    }

    public String getDisplayRemark() {
        return (this.field_conRemark == null || this.field_conRemark.trim().equals("")) ? getDisplayNick() : this.field_conRemark;
    }

    public String getDisplayUser() {
        String alias = getAlias();
        if (!Util.isNullOrNil(alias)) {
            return alias;
        }
        String formatDisplayNick = formatDisplayNick(this.field_username);
        return (formatDisplayNick == null || formatDisplayNick.length() == 0) ? this.field_username : formatDisplayNick;
    }

    public String getDistance() {
        return this.f31565G;
    }

    public String getDomainList() {
        return this.field_domainList;
    }

    public String getEmail() {
        return this.f31576v;
    }

    public long getFaceBookId() {
        return this.f31575u;
    }

    public String getFaceBookUsername() {
        return this.f31574s;
    }

    public int getFromType() {
        return this.f31566H;
    }

    public int getImgFlag() {
        return this.f31572q;
    }

    public String getMobile() {
        return this.f31577w;
    }

    public String getNickname() {
        return this.field_nickname;
    }

    public int getPersonalCard() {
        return this.f31561C;
    }

    public String getProvince() {
        return this.f31563E;
    }

    public String getPyInitial() {
        return (this.field_pyInitial == null || this.field_pyInitial.length() < 0) ? getQuanPin() : this.field_pyInitial;
    }

    public String getQuanPin() {
        return (this.field_quanPin == null || this.field_quanPin.length() < 0) ? getNickname() : this.field_quanPin;
    }

    public String getRegionCode() {
        return this.f31570L;
    }

    public int getSex() {
        return this.f31573r;
    }

    public int getShowFlag() {
        return this.f31578x;
    }

    public int getShowHead() {
        return this.field_showHead;
    }

    public String getSignature() {
        return this.f31562D;
    }

    public int getSource() {
        return this.f31567I;
    }

    public int getType() {
        return this.field_type;
    }

    public int getUin() {
        return this.f31571h;
    }

    public String getUsername() {
        return this.field_username;
    }

    public int getVerifyFlag() {
        return this.field_verifyFlag;
    }

    public String getVerifyInfo() {
        return this.f31569K;
    }

    public String getWeibo() {
        return this.f31568J;
    }

    public int getWeiboFlag() {
        return this.field_weiboFlag;
    }

    public String getWeiboNickName() {
        return this.field_weiboNickname;
    }

    public boolean isBlackListContact() {
        return (this.field_type & 8) != 0;
    }

    public boolean isChatContact() {
        return (this.field_type & 2) != 0;
    }

    public boolean isChatRoomContact() {
        return (this.field_type & 4) != 0;
    }

    public boolean isContact() {
        return isContact(this.field_type);
    }

    public boolean isDomainContact() {
        return (this.field_type & 16) != 0;
    }

    public boolean isFavourContact() {
        return (this.field_type & 64) != 0;
    }

    public boolean isHidden() {
        return (this.field_type & 32) != 0;
    }

    public boolean isImgLocalExist() {
        return 153 == this.f31572q;
    }

    public void reset() {
        this.field_username = "";
        this.field_nickname = "";
        this.field_pyInitial = "";
        this.field_quanPin = "";
        this.field_alias = "";
        this.field_conRemark = "";
        this.field_conRemarkPYShort = "";
        this.field_conRemarkPYFull = "";
        this.field_domainList = "";
        this.field_weiboFlag = 0;
        this.field_weiboNickname = "";
        this.field_showHead = 0;
        this.field_type = 0;
        this.field_verifyFlag = 0;
        this.f31573r = 0;
        this.f31565G = "";
        this.f31566H = 0;
        this.f31571h = 0;
        this.f31576v = "";
        this.f31577w = "";
        this.f31578x = 0;
        this.f31579y = 0;
        this.f31580z = "";
        this.f31559A = "";
        this.f31560B = 1;
        this.f31572q = 0;
        this.f31561C = 0;
        this.f31562D = "";
        this.f31563E = "";
        this.f31564F = "";
        this.f31567I = 0;
        this.f31569K = "";
        this.f31568J = "";
        this.f31575u = 0L;
        this.f31574s = "";
        this.f31570L = "";
    }

    public void setAlias(String str) {
        this.field_alias = str;
    }

    public void setBlackList() {
        this.field_type |= 8;
    }

    public void setChatContact() {
        this.field_type |= 2;
    }

    public void setChatroomContact() {
        this.field_type |= 4;
    }

    public void setChatroomNotify(int i) {
        this.f31560B = i;
    }

    public void setCity(String str) {
        this.f31564F = str;
    }

    public void setConQQMBlog(String str) {
        this.f31559A = str;
    }

    public void setConRemark(String str) {
        this.field_conRemark = str;
    }

    public void setConRemarkPYFull(String str) {
        this.field_conRemarkPYFull = str;
    }

    public void setConRemarkPYShort(String str) {
        this.field_conRemarkPYShort = str;
    }

    public void setConSMBlog(String str) {
        this.f31580z = str;
    }

    public void setConType(int i) {
        this.f31579y = i;
    }

    public void setContact() {
        this.field_type |= 1;
    }

    public void setDistance(String str) {
        this.f31565G = str;
    }

    public void setDomainList(String str) {
        this.field_domainList = str;
    }

    public void setEmail(String str) {
        this.f31576v = str;
    }

    public void setFaceBookId(long j) {
        this.f31575u = j;
    }

    public void setFaceBookUsername(String str) {
        this.f31574s = str;
    }

    public void setFavour() {
        this.field_type |= 64;
    }

    public void setFromType(int i) {
        this.f31566H = i;
    }

    public void setHidden() {
        this.field_type |= 32;
    }

    public void setImgFlag(int i) {
        this.f31572q = i;
    }

    public void setMobile(String str) {
        this.f31577w = str;
    }

    public void setNickname(String str) {
        this.field_nickname = str;
    }

    public void setNullContact() {
        this.field_type = 0;
    }

    public void setPersonalCard(int i) {
        this.f31561C = i;
    }

    public void setProvince(String str) {
        this.f31563E = str;
    }

    public void setPyInitial(String str) {
        this.field_pyInitial = str;
    }

    public void setQuanPin(String str) {
        this.field_quanPin = str;
    }

    public void setRegionCode(String str) {
        this.f31570L = str;
    }

    public void setSex(int i) {
        this.f31573r = i;
    }

    public void setShowFlag(int i) {
        this.f31578x = i;
    }

    public void setShowHead(int i) {
        this.field_showHead = i;
    }

    public void setSignature(String str) {
        this.f31562D = str;
    }

    public void setSource(int i) {
        this.f31567I = i;
    }

    public void setType(int i) {
        this.field_type = i;
    }

    public void setUin(int i) {
        this.f31571h = i;
    }

    public void setUsername(String str) {
        this.field_username = str;
    }

    public void setVerifyFlag(int i) {
        this.field_verifyFlag = i;
    }

    public void setVerifyInfo(String str) {
        this.f31569K = str;
    }

    public void setWeibo(String str) {
        this.f31568J = str;
    }

    public void setWeiboFlag(int i) {
        this.field_weiboFlag = i;
    }

    public void setWeiboNickName(String str) {
        this.field_weiboNickname = str;
    }

    public void unSetBlackList() {
        this.field_type &= -9;
    }

    public void unSetChatContact() {
        this.field_type &= -3;
    }

    public void unSetContact() {
        this.field_type &= -2;
    }

    public void unSetFavour() {
        this.field_type &= -65;
    }

    public void unSetHidden() {
        this.field_type &= -33;
    }
}
