package com.google.android.gms.fitness.data;

import com.google.android.gms.fitness.data.DataType;
import com.tencent.open.GameAppOperation;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
import org.p286a.p287a.p299f.p302c.C11125l;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.google.android.gms.fitness.data.p */
/* loaded from: classes2.dex */
public class C5158p {

    /* renamed from: a */
    public static final DataType[] f18751a = {DataType.f18458m, DataType.f18427E, DataType.f18456k, DataType.f18457l, DataType.f18450e, DataType.f18428F, C5165w.f18757e, C5165w.f18767o, C5165w.f18754b, C5165w.f18764l, C5165w.f18753a, C5165w.f18763k, DataType.f18471z, DataType.f18439Q, DataType.f18424B, DataType.f18440R, C5165w.f18756d, C5165w.f18766n, DataType.f18423A, DataType.f18441S, DataType.f18454i, DataType.f18430H, DataType.f18452g, DataType.f18453h, C5165w.f18758f, C5165w.f18759g, DataType.f18468w, DataType.f18467v, DataType.f18465t, DataType.f18466u, DataType.TYPE_DISTANCE_CUMULATIVE, DataType.f18463r, DataType.f18451f, DataType.f18429G, DataType.f18460o, DataType.f18435M, DataType.f18469x, DataType.f18436N, DataType.f18461p, DataType.f18462q, C5165w.f18760h, DataType.f18425C, DataType.f18426D, DataType.f18443U, C5165w.f18761i, C5165w.f18755c, C5165w.f18765m, DataType.f18455j, DataType.f18437O, DataType.f18459n, DataType.f18464s, DataType.f18438P, DataType.f18448c, DataType.f18449d, DataType.TYPE_STEP_COUNT_CUMULATIVE, DataType.f18447b, C5165w.f18762j, DataType.f18470y, DataType.f18442T};

    /* renamed from: b */
    public static final DataType[] f18752b = {C5165w.f18757e, C5165w.f18767o, C5165w.f18754b, C5165w.f18764l, C5165w.f18753a, C5165w.f18763k, C5165w.f18756d, C5165w.f18766n, C5165w.f18758f, C5165w.f18759g, C5165w.f18760h, C5165w.f18761i, C5165w.f18755c, C5165w.f18765m, C5165w.f18762j};

    /* renamed from: a */
    public static DataType m21438a(String str) {
        char c = 65535;
        switch (str.hashCode()) {
            case -2060095039:
                if (str.equals("com.google.cycling.wheel_revolution.rpm")) {
                    c = 29;
                    break;
                }
                break;
            case -2027664088:
                if (str.equals("com.google.calories.consumed")) {
                    c = 22;
                    break;
                }
                break;
            case -2023954015:
                if (str.equals("com.google.location.bounding_box")) {
                    c = C0494h.f730r;
                    break;
                }
                break;
            case -1939429191:
                if (str.equals("com.google.blood_glucose.summary")) {
                    c = '\n';
                    break;
                }
                break;
            case -1783842905:
                if (str.equals("com.google.accelerometer")) {
                    c = 0;
                    break;
                }
                break;
            case -1757812901:
                if (str.equals("com.google.location.sample")) {
                    c = '&';
                    break;
                }
                break;
            case -1659958877:
                if (str.equals("com.google.menstruation")) {
                    c = C0494h.f731s;
                    break;
                }
                break;
            case -1487055015:
                if (str.equals("com.google.body.temperature.basal.summary")) {
                    c = 7;
                    break;
                }
                break;
            case -1466904157:
                if (str.equals("com.google.floor_change.summary")) {
                    c = '!';
                    break;
                }
                break;
            case -1248818137:
                if (str.equals("com.google.distance.delta")) {
                    c = 31;
                    break;
                }
                break;
            case -1102520626:
                if (str.equals("com.google.step_count.delta")) {
                    c = '7';
                    break;
                }
                break;
            case -1099695423:
                if (str.equals("com.google.activity.sample")) {
                    c = 2;
                    break;
                }
                break;
            case -1091068721:
                if (str.equals("com.google.height")) {
                    c = C0494h.f688I;
                    break;
                }
                break;
            case -922976890:
                if (str.equals("com.google.cycling.pedaling.cumulative")) {
                    c = 27;
                    break;
                }
                break;
            case -900592674:
                if (str.equals("com.google.cycling.pedaling.cadence")) {
                    c = 26;
                    break;
                }
                break;
            case -886569606:
                if (str.equals("com.google.location.track")) {
                    c = C0494h.f738z;
                    break;
                }
                break;
            case -777285735:
                if (str.equals("com.google.heart_rate.summary")) {
                    c = '#';
                    break;
                }
                break;
            case -661631456:
                if (str.equals("com.google.weight")) {
                    c = C0494h.f680A;
                    break;
                }
                break;
            case -424876584:
                if (str.equals("com.google.weight.summary")) {
                    c = ';';
                    break;
                }
                break;
            case -362418992:
                if (str.equals("com.google.body.temperature")) {
                    c = 16;
                    break;
                }
                break;
            case -217611775:
                if (str.equals("com.google.blood_glucose")) {
                    c = '\t';
                    break;
                }
                break;
            case -185830635:
                if (str.equals("com.google.power.summary")) {
                    c = '0';
                    break;
                }
                break;
            case -177293656:
                if (str.equals("com.google.nutrition.summary")) {
                    c = SignatureVisitor.EXTENDS;
                    break;
                }
                break;
            case -164586193:
                if (str.equals("com.google.activity.exercise")) {
                    c = 1;
                    break;
                }
                break;
            case -98150574:
                if (str.equals("com.google.heart_rate.bpm")) {
                    c = '\"';
                    break;
                }
                break;
            case -56824761:
                if (str.equals("com.google.calories.bmr")) {
                    c = GameAppOperation.PIC_SYMBOLE;
                    break;
                }
                break;
            case -43729332:
                if (str.equals("com.google.body.hip.circumference")) {
                    c = 14;
                    break;
                }
                break;
            case 2484093:
                if (str.equals("com.google.body.waist.circumference")) {
                    c = 18;
                    break;
                }
                break;
            case 53773386:
                if (str.equals("com.google.blood_pressure.summary")) {
                    c = '\f';
                    break;
                }
                break;
            case 269180370:
                if (str.equals("com.google.activity.samples")) {
                    c = 3;
                    break;
                }
                break;
            case 295793957:
                if (str.equals("com.google.sensor.events")) {
                    c = '1';
                    break;
                }
                break;
            case 296250623:
                if (str.equals("com.google.calories.bmr.summary")) {
                    c = 21;
                    break;
                }
                break;
            case 324760871:
                if (str.equals("com.google.step_count.cadence")) {
                    c = '5';
                    break;
                }
                break;
            case 378060028:
                if (str.equals("com.google.activity.segment")) {
                    c = 4;
                    break;
                }
                break;
            case 529727579:
                if (str.equals("com.google.power.sample")) {
                    c = '/';
                    break;
                }
                break;
            case 657433501:
                if (str.equals("com.google.step_count.cumulative")) {
                    c = '6';
                    break;
                }
                break;
            case 682891187:
                if (str.equals("com.google.body.fat.percentage")) {
                    c = '\b';
                    break;
                }
                break;
            case 841663855:
                if (str.equals("com.google.activity.summary")) {
                    c = 5;
                    break;
                }
                break;
            case 877955159:
                if (str.equals("com.google.speed.summary")) {
                    c = '4';
                    break;
                }
                break;
            case 899666941:
                if (str.equals("com.google.calories.expended")) {
                    c = 23;
                    break;
                }
                break;
            case 936279698:
                if (str.equals("com.google.blood_pressure")) {
                    c = 11;
                    break;
                }
                break;
            case 946706510:
                if (str.equals("com.google.hydration")) {
                    c = '*';
                    break;
                }
                break;
            case 946938859:
                if (str.equals("com.google.stride_model")) {
                    c = '8';
                    break;
                }
                break;
            case 1098265835:
                if (str.equals("com.google.floor_change")) {
                    c = C11125l.f35805c;
                    break;
                }
                break;
            case 1111714923:
                if (str.equals("com.google.body.fat.percentage.summary")) {
                    c = C11125l.f35803a;
                    break;
                }
                break;
            case 1214093899:
                if (str.equals("com.google.vaginal_spotting")) {
                    c = '9';
                    break;
                }
                break;
            case 1404118825:
                if (str.equals("com.google.oxygen_saturation")) {
                    c = '-';
                    break;
                }
                break;
            case 1439932546:
                if (str.equals("com.google.ovulation_test")) {
                    c = C0494h.f736x;
                    break;
                }
                break;
            case 1483133089:
                if (str.equals("com.google.body.temperature.basal")) {
                    c = 6;
                    break;
                }
                break;
            case 1524007137:
                if (str.equals("com.google.cycling.wheel_revolution.cumulative")) {
                    c = 28;
                    break;
                }
                break;
            case 1633152752:
                if (str.equals("com.google.nutrition")) {
                    c = C0494h.f732t;
                    break;
                }
                break;
            case 1674865156:
                if (str.equals("com.google.body.hip.circumference.summary")) {
                    c = 15;
                    break;
                }
                break;
            case 1819660853:
                if (str.equals("com.google.body.waist.circumference.summary")) {
                    c = 19;
                    break;
                }
                break;
            case 1921738212:
                if (str.equals("com.google.distance.cumulative")) {
                    c = 30;
                    break;
                }
                break;
            case 1925848149:
                if (str.equals("com.google.cervical_position")) {
                    c = 25;
                    break;
                }
                break;
            case 1975902189:
                if (str.equals("com.google.cervical_mucus")) {
                    c = 24;
                    break;
                }
                break;
            case 1980033842:
                if (str.equals("com.google.internal.session.debug")) {
                    c = '3';
                    break;
                }
                break;
            case 2051843553:
                if (str.equals("com.google.oxygen_saturation.summary")) {
                    c = C0494h.f686G;
                    break;
                }
                break;
            case 2053496735:
                if (str.equals("com.google.speed")) {
                    c = '2';
                    break;
                }
                break;
            case 2131809416:
                if (str.equals("com.google.body.temperature.summary")) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return DataType.f18458m;
            case 1:
                return DataType.f18427E;
            case 2:
                return DataType.f18456k;
            case 3:
                return DataType.f18457l;
            case 4:
                return DataType.f18450e;
            case 5:
                return DataType.f18428F;
            case 6:
                return C5165w.f18757e;
            case 7:
                return C5165w.f18767o;
            case '\b':
                return DataType.f18471z;
            case '\t':
                return C5165w.f18754b;
            case '\n':
                return C5165w.f18764l;
            case 11:
                return C5165w.f18753a;
            case '\f':
                return C5165w.f18763k;
            case '\r':
                return DataType.f18439Q;
            case 14:
                return DataType.f18424B;
            case 15:
                return DataType.f18440R;
            case 16:
                return C5165w.f18756d;
            case 17:
                return C5165w.f18766n;
            case 18:
                return DataType.f18423A;
            case 19:
                return DataType.f18441S;
            case 20:
                return DataType.f18454i;
            case 21:
                return DataType.f18430H;
            case 22:
                return DataType.f18452g;
            case 23:
                return DataType.f18453h;
            case 24:
                return C5165w.f18758f;
            case 25:
                return C5165w.f18759g;
            case 26:
                return DataType.f18468w;
            case 27:
                return DataType.f18467v;
            case 28:
                return DataType.f18465t;
            case 29:
                return DataType.f18466u;
            case 30:
                return DataType.TYPE_DISTANCE_CUMULATIVE;
            case 31:
                return DataType.f18463r;
            case ' ':
                return DataType.f18451f;
            case '!':
                return DataType.f18429G;
            case '\"':
                return DataType.f18460o;
            case '#':
                return DataType.f18435M;
            case '$':
                return DataType.f18469x;
            case '%':
                return DataType.f18436N;
            case '&':
                return DataType.f18461p;
            case '\'':
                return DataType.f18462q;
            case '(':
                return C5165w.f18760h;
            case ')':
                return DataType.f18425C;
            case '*':
                return DataType.f18426D;
            case '+':
                return DataType.f18443U;
            case ',':
                return C5165w.f18761i;
            case '-':
                return C5165w.f18755c;
            case '.':
                return C5165w.f18765m;
            case '/':
                return DataType.f18455j;
            case '0':
                return DataType.f18437O;
            case '1':
                return DataType.f18459n;
            case '2':
                return DataType.f18464s;
            case '3':
                return DataType.C5132a.f18475a;
            case '4':
                return DataType.f18438P;
            case '5':
                return DataType.f18448c;
            case '6':
                return DataType.TYPE_STEP_COUNT_CUMULATIVE;
            case '7':
                return DataType.f18447b;
            case '8':
                return DataType.f18449d;
            case '9':
                return C5165w.f18762j;
            case ':':
                return DataType.f18470y;
            case ';':
                return DataType.f18442T;
            default:
                return null;
        }
    }
}
