.class public Lcom/google/android/gms/common/api/f;
.super Ljava/lang/Object;


# static fields
.field public static final k:I = -0x1

.field public static final l:I = 0x0

.field public static final m:I = 0x2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final n:I = 0x3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final o:I = 0x4

.field public static final p:I = 0x5

.field public static final q:I = 0x6

.field public static final r:I = 0x7

.field public static final s:I = 0x8

.field public static final t:I = 0xa

.field public static final u:I = 0xd

.field public static final v:I = 0xe

.field public static final w:I = 0xf

.field public static final x:I = 0x10

.field public static final y:I = 0x11

.field public static final z:I = 0x12


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(I)Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "unknown status code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_1
    const-string v0, "SUCCESS_CACHE"

    goto :goto_0

    :pswitch_2
    const-string v0, "SUCCESS"

    goto :goto_0

    :pswitch_3
    const-string v0, "SERVICE_VERSION_UPDATE_REQUIRED"

    goto :goto_0

    :pswitch_4
    const-string v0, "SERVICE_DISABLED"

    goto :goto_0

    :pswitch_5
    const-string v0, "SIGN_IN_REQUIRED"

    goto :goto_0

    :pswitch_6
    const-string v0, "INVALID_ACCOUNT"

    goto :goto_0

    :pswitch_7
    const-string v0, "RESOLUTION_REQUIRED"

    goto :goto_0

    :pswitch_8
    const-string v0, "NETWORK_ERROR"

    goto :goto_0

    :pswitch_9
    const-string v0, "INTERNAL_ERROR"

    goto :goto_0

    :pswitch_a
    const-string v0, "DEVELOPER_ERROR"

    goto :goto_0

    :pswitch_b
    const-string v0, "ERROR"

    goto :goto_0

    :pswitch_c
    const-string v0, "INTERRUPTED"

    goto :goto_0

    :pswitch_d
    const-string v0, "TIMEOUT"

    goto :goto_0

    :pswitch_e
    const-string v0, "CANCELED"

    goto :goto_0

    :pswitch_f
    const-string v0, "API_NOT_CONNECTED"

    goto :goto_0

    :pswitch_10
    const-string v0, "DEAD_CLIENT"

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_0
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
    .end packed-switch
.end method
