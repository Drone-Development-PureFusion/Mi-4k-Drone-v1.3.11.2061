.class public final Lcom/google/android/gms/wearable/s;
.super Lcom/google/android/gms/common/api/f;


# static fields
.field public static final a:I = 0xfa0

.field public static final b:I = 0xfa1

.field public static final c:I = 0xfa2

.field public static final d:I = 0xfa3

.field public static final e:I = 0xfa4

.field public static final f:I = 0xfa5

.field public static final g:I = 0xfa6

.field public static final h:I = 0xfa7

.field public static final i:I = 0xfa8


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/f;-><init>()V

    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    invoke-static {p0}, Lcom/google/android/gms/common/api/f;->b(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "TARGET_NODE_NOT_CONNECTED"

    goto :goto_0

    :pswitch_1
    const-string v0, "DUPLICATE_LISTENER"

    goto :goto_0

    :pswitch_2
    const-string v0, "UNKNOWN_LISTENER"

    goto :goto_0

    :pswitch_3
    const-string v0, "DATA_ITEM_TOO_LARGE"

    goto :goto_0

    :pswitch_4
    const-string v0, "INVALID_TARGET_NODE"

    goto :goto_0

    :pswitch_5
    const-string v0, "ASSET_UNAVAILABLE"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0xfa0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
