package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p004v7.media.MediaRouteProviderProtocol;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.tencent.open.GameAppOperation;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
import org.p286a.p287a.p299f.p302c.C11125l;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p052m.p053a.C0620k;
/* loaded from: classes2.dex */
public final class Field extends AbstractSafeParcelable {

    /* renamed from: B */
    public static final int f18502B = 0;

    /* renamed from: C */
    public static final int f18503C = 1;

    /* renamed from: D */
    public static final int f18504D = 2;

    /* renamed from: E */
    public static final int f18505E = 3;

    /* renamed from: F */
    public static final int f18506F = 4;

    /* renamed from: J */
    public static final String f18510J = "fat.total";

    /* renamed from: K */
    public static final String f18511K = "fat.saturated";

    /* renamed from: L */
    public static final String f18512L = "fat.unsaturated";

    /* renamed from: M */
    public static final String f18513M = "fat.polyunsaturated";

    /* renamed from: N */
    public static final String f18514N = "fat.monounsaturated";

    /* renamed from: O */
    public static final String f18515O = "fat.trans";

    /* renamed from: P */
    public static final String f18516P = "cholesterol";

    /* renamed from: Q */
    public static final String f18517Q = "sodium";

    /* renamed from: R */
    public static final String f18518R = "potassium";

    /* renamed from: S */
    public static final String f18519S = "carbs.total";

    /* renamed from: T */
    public static final String f18520T = "dietary_fiber";

    /* renamed from: U */
    public static final String f18521U = "sugar";

    /* renamed from: V */
    public static final String f18522V = "protein";

    /* renamed from: W */
    public static final String f18523W = "vitamin_a";

    /* renamed from: X */
    public static final String f18524X = "vitamin_c";

    /* renamed from: Y */
    public static final String f18525Y = "calcium";

    /* renamed from: Z */
    public static final String f18526Z = "iron";

    /* renamed from: aD */
    public static final int f18531aD = 1;

    /* renamed from: aE */
    public static final int f18532aE = 2;

    /* renamed from: aF */
    public static final int f18533aF = 3;

    /* renamed from: aG */
    public static final int f18534aG = 4;

    /* renamed from: ak */
    public static final int f18545ak = 0;

    /* renamed from: al */
    public static final int f18546al = 1;

    /* renamed from: am */
    public static final int f18547am = 2;

    /* renamed from: an */
    public static final int f18548an = 3;

    /* renamed from: ao */
    public static final int f18549ao = 4;

    /* renamed from: ap */
    public static final int f18550ap = 5;

    /* renamed from: aq */
    public static final int f18551aq = 6;

    /* renamed from: aH */
    private final int f18586aH;

    /* renamed from: aI */
    private final String f18587aI;

    /* renamed from: aJ */
    private final int f18588aJ;

    /* renamed from: aK */
    private final Boolean f18589aK;

    /* renamed from: a */
    public static final Field f18527a = m21626a("activity");

    /* renamed from: b */
    public static final Field f18561b = m21620c("confidence");

    /* renamed from: c */
    public static final Field f18562c = m21616f("activity_confidence");

    /* renamed from: d */
    public static final Field f18563d = m21626a("steps");

    /* renamed from: e */
    public static final Field f18564e = m21626a("duration");

    /* renamed from: f */
    public static final Field f18565f = m21622b("duration");

    /* renamed from: g */
    public static final Field f18566g = m21616f("activity_duration");

    /* renamed from: h */
    public static final Field f18567h = m21616f("activity_duration.ascending");

    /* renamed from: i */
    public static final Field f18568i = m21616f("activity_duration.descending");

    /* renamed from: j */
    public static final Field f18569j = m21620c("bpm");

    /* renamed from: k */
    public static final Field f18570k = m21620c("latitude");

    /* renamed from: l */
    public static final Field f18571l = m21620c("longitude");

    /* renamed from: m */
    public static final Field f18572m = m21620c("accuracy");

    /* renamed from: n */
    public static final Field f18573n = m21618d("altitude");

    /* renamed from: o */
    public static final Field f18574o = m21620c("distance");

    /* renamed from: p */
    public static final Field f18575p = m21620c(FimiMediaMeta.IJKM_KEY_HEIGHT);

    /* renamed from: q */
    public static final Field f18576q = m21620c("weight");

    /* renamed from: r */
    public static final Field f18577r = m21620c("circumference");

    /* renamed from: s */
    public static final Field f18578s = m21620c("percentage");

    /* renamed from: t */
    public static final Field f18579t = m21620c("speed");

    /* renamed from: u */
    public static final Field f18580u = m21620c("rpm");

    /* renamed from: v */
    public static final Field f18581v = m21613i("google.android.fitness.StrideModel");

    /* renamed from: w */
    public static final Field f18582w = m21626a("revolutions");

    /* renamed from: I */
    public static final String f18509I = "calories";

    /* renamed from: x */
    public static final Field f18583x = m21620c(f18509I);

    /* renamed from: y */
    public static final Field f18584y = m21620c("watts");

    /* renamed from: z */
    public static final Field f18585z = m21620c(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME);

    /* renamed from: A */
    public static final Field f18501A = m21626a("meal_type");

    /* renamed from: G */
    public static final Field f18507G = m21617e("food_item");

    /* renamed from: H */
    public static final Field f18508H = m21616f("nutrients");

    /* renamed from: aa */
    public static final Field f18535aa = m21620c("elevation.change");

    /* renamed from: ab */
    public static final Field f18536ab = m21616f("elevation.gain");

    /* renamed from: ac */
    public static final Field f18537ac = m21616f("elevation.loss");

    /* renamed from: ad */
    public static final Field f18538ad = m21620c("floors");

    /* renamed from: ae */
    public static final Field f18539ae = m21616f("floor.gain");

    /* renamed from: af */
    public static final Field f18540af = m21616f("floor.loss");

    /* renamed from: ag */
    public static final Field f18541ag = m21617e("exercise");

    /* renamed from: ah */
    public static final Field f18542ah = m21626a("repetitions");

    /* renamed from: ai */
    public static final Field f18543ai = m21620c("resistance");

    /* renamed from: aj */
    public static final Field f18544aj = m21626a("resistance_type");

    /* renamed from: ar */
    public static final Field f18552ar = m21626a("num_segments");

    /* renamed from: as */
    public static final Field f18553as = m21620c("average");

    /* renamed from: at */
    public static final Field f18554at = m21620c("max");

    /* renamed from: au */
    public static final Field f18555au = m21620c("min");

    /* renamed from: av */
    public static final Field f18556av = m21620c("low_latitude");

    /* renamed from: aw */
    public static final Field f18557aw = m21620c("low_longitude");

    /* renamed from: ax */
    public static final Field f18558ax = m21620c("high_latitude");

    /* renamed from: ay */
    public static final Field f18559ay = m21620c("high_longitude");

    /* renamed from: az */
    public static final Field f18560az = m21626a("occurrences");

    /* renamed from: aA */
    public static final Field f18528aA = m21626a("sensor_type");

    /* renamed from: aB */
    public static final Field f18529aB = m21615g("timestamps");

    /* renamed from: aC */
    public static final Field f18530aC = m21614h("sensor_values");
    public static final Parcelable.Creator<Field> CREATOR = new C5162t();

    /* renamed from: com.google.android.gms.fitness.data.Field$a */
    /* loaded from: classes2.dex */
    public static class C5133a {

        /* renamed from: a */
        public static final Field f18590a = Field.m21620c("x");

        /* renamed from: b */
        public static final Field f18591b = Field.m21620c("y");

        /* renamed from: c */
        public static final Field f18592c = Field.m21620c("z");

        /* renamed from: d */
        public static final Field f18593d = Field.m21612j("debug_session");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Field(int i, String str, int i2, Boolean bool) {
        this.f18586aH = i;
        this.f18587aI = (String) C4588d.m23627a(str);
        this.f18588aJ = i2;
        this.f18589aK = bool;
    }

    private Field(String str, int i) {
        this(2, str, i, null);
    }

    private Field(String str, int i, Boolean bool) {
        this(2, str, i, bool);
    }

    /* renamed from: a */
    static Field m21626a(String str) {
        return new Field(str, 1);
    }

    /* renamed from: a */
    public static Field m21625a(String str, int i) {
        return m21624a(str, i, null);
    }

    /* renamed from: a */
    public static Field m21624a(String str, int i, Boolean bool) {
        char c = 65535;
        switch (str.hashCode()) {
            case -2131707655:
                if (str.equals("accuracy")) {
                    c = 0;
                    break;
                }
                break;
            case -2083865430:
                if (str.equals("debug_session")) {
                    c = 'W';
                    break;
                }
                break;
            case -2006370880:
                if (str.equals("body_temperature_measurement_location")) {
                    c = 21;
                    break;
                }
                break;
            case -1992012396:
                if (str.equals("duration")) {
                    c = C11125l.f35805c;
                    break;
                }
                break;
            case -1859447186:
                if (str.equals("blood_glucose_level")) {
                    c = '\b';
                    break;
                }
                break;
            case -1655966961:
                if (str.equals("activity")) {
                    c = 1;
                    break;
                }
                break;
            case -1595712862:
                if (str.equals("cervical_dilation")) {
                    c = 24;
                    break;
                }
                break;
            case -1579612127:
                if (str.equals("floor.gain")) {
                    c = C0494h.f730r;
                    break;
                }
                break;
            case -1579449403:
                if (str.equals("floor.loss")) {
                    c = '&';
                    break;
                }
                break;
            case -1569430471:
                if (str.equals("num_segments")) {
                    c = '4';
                    break;
                }
                break;
            case -1531570079:
                if (str.equals("elevation.change")) {
                    c = '!';
                    break;
                }
                break;
            case -1440707631:
                if (str.equals("oxygen_saturation")) {
                    c = '8';
                    break;
                }
                break;
            case -1439978388:
                if (str.equals("latitude")) {
                    c = C0494h.f736x;
                    break;
                }
                break;
            case -1271636505:
                if (str.equals("floors")) {
                    c = C0494h.f738z;
                    break;
                }
                break;
            case -1248595573:
                if (str.equals("supplemental_oxygen_flow_rate_average")) {
                    c = 'C';
                    break;
                }
                break;
            case -1221029593:
                if (str.equals(FimiMediaMeta.IJKM_KEY_HEIGHT)) {
                    c = C0494h.f732t;
                    break;
                }
                break;
            case -1220952307:
                if (str.equals("blood_pressure_measurement_location")) {
                    c = 14;
                    break;
                }
                break;
            case -1133736764:
                if (str.equals("activity_duration")) {
                    c = 3;
                    break;
                }
                break;
            case -1110756780:
                if (str.equals("food_item")) {
                    c = C0494h.f731s;
                    break;
                }
                break;
            case -921832806:
                if (str.equals("percentage")) {
                    c = 'F';
                    break;
                }
                break;
            case -918978307:
                if (str.equals("cervical_position")) {
                    c = 28;
                    break;
                }
                break;
            case -810883302:
                if (str.equals(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME)) {
                    c = 'Q';
                    break;
                }
                break;
            case -803244749:
                if (str.equals("blood_pressure_systolic")) {
                    c = 15;
                    break;
                }
                break;
            case -791592328:
                if (str.equals("weight")) {
                    c = 'S';
                    break;
                }
                break;
            case -631448035:
                if (str.equals("average")) {
                    c = 7;
                    break;
                }
                break;
            case -626344110:
                if (str.equals("high_longitude")) {
                    c = SignatureVisitor.EXTENDS;
                    break;
                }
                break;
            case -619868540:
                if (str.equals("low_longitude")) {
                    c = '/';
                    break;
                }
                break;
            case -511934137:
                if (str.equals("sensor_values")) {
                    c = 'A';
                    break;
                }
                break;
            case -494782871:
                if (str.equals("high_latitude")) {
                    c = '*';
                    break;
                }
                break;
            case -437053898:
                if (str.equals("meal_type")) {
                    c = '1';
                    break;
                }
                break;
            case -277306353:
                if (str.equals("circumference")) {
                    c = 29;
                    break;
                }
                break;
            case -266093204:
                if (str.equals("nutrients")) {
                    c = '5';
                    break;
                }
                break;
            case -228366862:
                if (str.equals("oxygen_saturation_measurement_method")) {
                    c = ';';
                    break;
                }
                break;
            case -168965370:
                if (str.equals(f18509I)) {
                    c = 23;
                    break;
                }
                break;
            case -126538880:
                if (str.equals("resistance_type")) {
                    c = 'I';
                    break;
                }
                break;
            case -28590302:
                if (str.equals("ovulation_test_result")) {
                    c = '7';
                    break;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    c = 'T';
                    break;
                }
                break;
            case Opcodes.LSHL /* 121 */:
                if (str.equals("y")) {
                    c = 'U';
                    break;
                }
                break;
            case 122:
                if (str.equals("z")) {
                    c = 'V';
                    break;
                }
                break;
            case 97759:
                if (str.equals("bpm")) {
                    c = 22;
                    break;
                }
                break;
            case 107876:
                if (str.equals("max")) {
                    c = '0';
                    break;
                }
                break;
            case 108114:
                if (str.equals("min")) {
                    c = '3';
                    break;
                }
                break;
            case 113135:
                if (str.equals("rpm")) {
                    c = 'K';
                    break;
                }
                break;
            case 66639641:
                if (str.equals("temporal_relation_to_sleep")) {
                    c = 'P';
                    break;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    c = 'L';
                    break;
                }
                break;
            case 109761319:
                if (str.equals("steps")) {
                    c = 'M';
                    break;
                }
                break;
            case 112903913:
                if (str.equals("watts")) {
                    c = 'R';
                    break;
                }
                break;
            case 137365935:
                if (str.equals("longitude")) {
                    c = '-';
                    break;
                }
                break;
            case 198162679:
                if (str.equals("low_latitude")) {
                    c = C0494h.f686G;
                    break;
                }
                break;
            case 220648413:
                if (str.equals("blood_pressure_diastolic_average")) {
                    c = 11;
                    break;
                }
                break;
            case 248891292:
                if (str.equals("blood_glucose_specimen_source")) {
                    c = '\t';
                    break;
                }
                break;
            case 286612066:
                if (str.equals("activity_duration.descending")) {
                    c = 5;
                    break;
                }
                break;
            case 288459765:
                if (str.equals("distance")) {
                    c = 31;
                    break;
                }
                break;
            case 320627489:
                if (str.equals("cervical_mucus_texture")) {
                    c = 27;
                    break;
                }
                break;
            case 455965230:
                if (str.equals("activity_duration.ascending")) {
                    c = 4;
                    break;
                }
                break;
            case 475560024:
                if (str.equals("blood_pressure_systolic_max")) {
                    c = 17;
                    break;
                }
                break;
            case 475560262:
                if (str.equals("blood_pressure_systolic_min")) {
                    c = 18;
                    break;
                }
                break;
            case 581888402:
                if (str.equals("cervical_mucus_amount")) {
                    c = 26;
                    break;
                }
                break;
            case 623947695:
                if (str.equals("oxygen_saturation_average")) {
                    c = '9';
                    break;
                }
                break;
            case 738210934:
                if (str.equals("google.android.fitness.StrideModel")) {
                    c = 'N';
                    break;
                }
                break;
            case 784486594:
                if (str.equals("occurrences")) {
                    c = '6';
                    break;
                }
                break;
            case 811264586:
                if (str.equals("revolutions")) {
                    c = 'J';
                    break;
                }
                break;
            case 815736413:
                if (str.equals("oxygen_saturation_system")) {
                    c = SignatureVisitor.INSTANCEOF;
                    break;
                }
                break;
            case 829251210:
                if (str.equals("confidence")) {
                    c = 30;
                    break;
                }
                break;
            case 833248065:
                if (str.equals("temporal_relation_to_meal")) {
                    c = 'O';
                    break;
                }
                break;
            case 883161687:
                if (str.equals("body_temperature")) {
                    c = GameAppOperation.PIC_SYMBOLE;
                    break;
                }
                break;
            case 984367650:
                if (str.equals("repetitions")) {
                    c = 'G';
                    break;
                }
                break;
            case 998412730:
                if (str.equals("activity_confidence")) {
                    c = 2;
                    break;
                }
                break;
            case 1276952063:
                if (str.equals("blood_pressure_diastolic")) {
                    c = '\n';
                    break;
                }
                break;
            case 1284575222:
                if (str.equals("oxygen_saturation_max")) {
                    c = C0494h.f680A;
                    break;
                }
                break;
            case 1284575460:
                if (str.equals("oxygen_saturation_min")) {
                    c = '<';
                    break;
                }
                break;
            case 1403812644:
                if (str.equals("blood_pressure_diastolic_max")) {
                    c = '\f';
                    break;
                }
                break;
            case 1403812882:
                if (str.equals("blood_pressure_diastolic_min")) {
                    c = C11125l.f35803a;
                    break;
                }
                break;
            case 1527920799:
                if (str.equals("sensor_type")) {
                    c = '@';
                    break;
                }
                break;
            case 1708915229:
                if (str.equals("timestamps")) {
                    c = '?';
                    break;
                }
                break;
            case 1857734768:
                if (str.equals("elevation.gain")) {
                    c = '\"';
                    break;
                }
                break;
            case 1857897492:
                if (str.equals("elevation.loss")) {
                    c = '#';
                    break;
                }
                break;
            case 1863800889:
                if (str.equals("resistance")) {
                    c = 'H';
                    break;
                }
                break;
            case 1880897007:
                if (str.equals("oxygen_therapy_administration_mode")) {
                    c = '>';
                    break;
                }
                break;
            case 1892583496:
                if (str.equals("menstrual_flow")) {
                    c = '2';
                    break;
                }
                break;
            case 1958191058:
                if (str.equals("supplemental_oxygen_flow_rate_max")) {
                    c = 'D';
                    break;
                }
                break;
            case 1958191296:
                if (str.equals("supplemental_oxygen_flow_rate_min")) {
                    c = 'E';
                    break;
                }
                break;
            case 1983072038:
                if (str.equals("body_position")) {
                    c = 19;
                    break;
                }
                break;
            case 2020153105:
                if (str.equals("blood_pressure_systolic_average")) {
                    c = 16;
                    break;
                }
                break;
            case 2036550306:
                if (str.equals("altitude")) {
                    c = 6;
                    break;
                }
                break;
            case 2056323544:
                if (str.equals("exercise")) {
                    c = C0494h.f688I;
                    break;
                }
                break;
            case 2072582505:
                if (str.equals("cervical_firmness")) {
                    c = 25;
                    break;
                }
                break;
            case 2078370221:
                if (str.equals("supplemental_oxygen_flow_rate")) {
                    c = 'B';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return f18572m;
            case 1:
                return f18527a;
            case 2:
                return f18562c;
            case 3:
                return f18566g;
            case 4:
                return f18567h;
            case 5:
                return f18568i;
            case 6:
                return f18573n;
            case 7:
                return f18553as;
            case '\b':
                return C5166x.f18786k;
            case '\t':
                return C5166x.f18789n;
            case '\n':
                return C5166x.f18780e;
            case 11:
                return C5166x.f18781f;
            case '\f':
                return C5166x.f18783h;
            case '\r':
                return C5166x.f18782g;
            case 14:
                return C5166x.f18785j;
            case 15:
                return C5166x.f18776a;
            case 16:
                return C5166x.f18777b;
            case 17:
                return C5166x.f18779d;
            case 18:
                return C5166x.f18778c;
            case 19:
                return C5166x.f18784i;
            case 20:
                return C5166x.f18801z;
            case 21:
                return C5166x.f18768A;
            case 22:
                return f18569j;
            case 23:
                return f18583x;
            case 24:
                return C5166x.f18772E;
            case 25:
                return C5166x.f18773F;
            case 26:
                return C5166x.f18770C;
            case 27:
                return C5166x.f18769B;
            case 28:
                return C5166x.f18771D;
            case 29:
                return f18577r;
            case 30:
                return f18561b;
            case 31:
                return f18574o;
            case ' ':
                return (bool == null || !bool.booleanValue()) ? f18564e : f18565f;
            case '!':
                return f18535aa;
            case '\"':
                return f18536ab;
            case '#':
                return f18537ac;
            case '$':
                return f18541ag;
            case '%':
                return f18539ae;
            case '&':
                return f18540af;
            case '\'':
                return f18538ad;
            case '(':
                return f18507G;
            case ')':
                return f18575p;
            case '*':
                return f18558ax;
            case '+':
                return f18559ay;
            case ',':
                return f18570k;
            case '-':
                return f18571l;
            case '.':
                return f18556av;
            case '/':
                return f18557aw;
            case '0':
                return f18554at;
            case '1':
                return f18501A;
            case '2':
                return C5166x.f18774G;
            case '3':
                return f18555au;
            case '4':
                return f18552ar;
            case '5':
                return f18508H;
            case '6':
                return f18560az;
            case '7':
                return C5166x.f18775H;
            case '8':
                return C5166x.f18790o;
            case '9':
                return C5166x.f18791p;
            case ':':
                return C5166x.f18793r;
            case ';':
                return C5166x.f18800y;
            case '<':
                return C5166x.f18792q;
            case '=':
                return C5166x.f18799x;
            case '>':
                return C5166x.f18798w;
            case '?':
                return f18529aB;
            case '@':
                return f18528aA;
            case 'A':
                return f18530aC;
            case 'B':
                return C5166x.f18794s;
            case 'C':
                return C5166x.f18795t;
            case 'D':
                return C5166x.f18797v;
            case 'E':
                return C5166x.f18796u;
            case 'F':
                return f18578s;
            case 'G':
                return f18542ah;
            case 'H':
                return f18543ai;
            case 'I':
                return f18544aj;
            case 'J':
                return f18582w;
            case 'K':
                return f18580u;
            case 'L':
                return f18579t;
            case 'M':
                return f18563d;
            case 'N':
                return f18581v;
            case 'O':
                return C5166x.f18787l;
            case 'P':
                return C5166x.f18788m;
            case 'Q':
                return f18585z;
            case 'R':
                return f18584y;
            case 'S':
                return f18576q;
            case 'T':
                return C5133a.f18590a;
            case 'U':
                return C5133a.f18591b;
            case 'V':
                return C5133a.f18592c;
            case 'W':
                return C5133a.f18593d;
            default:
                return new Field(str, i, bool);
        }
    }

    /* renamed from: a */
    private boolean m21627a(Field field) {
        return this.f18587aI.equals(field.f18587aI) && this.f18588aJ == field.f18588aJ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Field m21622b(String str) {
        return new Field(str, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Field m21620c(String str) {
        return new Field(str, 2);
    }

    /* renamed from: d */
    static Field m21618d(String str) {
        return new Field(str, 2, true);
    }

    /* renamed from: e */
    static Field m21617e(String str) {
        return new Field(str, 3);
    }

    /* renamed from: f */
    static Field m21616f(String str) {
        return new Field(str, 4);
    }

    /* renamed from: g */
    static Field m21615g(String str) {
        return new Field(str, 5);
    }

    /* renamed from: h */
    static Field m21614h(String str) {
        return new Field(str, 6);
    }

    /* renamed from: i */
    static Field m21613i(String str) {
        return new Field(str, 7);
    }

    /* renamed from: j */
    static Field m21612j(String str) {
        return new Field(str, 7, true);
    }

    /* renamed from: a */
    public String m21628a() {
        return this.f18587aI;
    }

    /* renamed from: b */
    public int m21623b() {
        return this.f18588aJ;
    }

    /* renamed from: c */
    public Boolean m21621c() {
        return this.f18589aK;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m21619d() {
        return this.f18586aH;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Field) && m21627a((Field) obj);
    }

    public int hashCode() {
        return this.f18587aI.hashCode();
    }

    public String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f18587aI;
        objArr[1] = this.f18588aJ == 1 ? C0620k.f1083a : "f";
        return String.format("%s(%s)", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5162t.m21426a(this, parcel, i);
    }
}
