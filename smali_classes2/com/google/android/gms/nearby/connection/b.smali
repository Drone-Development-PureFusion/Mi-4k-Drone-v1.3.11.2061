.class public final Lcom/google/android/gms/nearby/connection/b;
.super Lcom/google/android/gms/common/api/f;


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0xd

.field public static final c:I = 0x1f40

.field public static final d:I = 0x1f41

.field public static final e:I = 0x1f42

.field public static final f:I = 0x1f43

.field public static final g:I = 0x1f44

.field public static final h:I = 0x1f45


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
    const-string v0, "STATUS_NETWORK_NOT_CONNECTED"

    goto :goto_0

    :pswitch_1
    const-string v0, "STATUS_ALREADY_ADVERTISING"

    goto :goto_0

    :pswitch_2
    const-string v0, "STATUS_ALREADY_DISCOVERING"

    goto :goto_0

    :pswitch_3
    const-string v0, "STATUS_ALREADY_CONNECTED_TO_ENDPOINT"

    goto :goto_0

    :pswitch_4
    const-string v0, "STATUS_CONNECTION_REJECTED"

    goto :goto_0

    :pswitch_5
    const-string v0, "STATUS_NOT_CONNECTED_TO_ENDPOINT"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1f40
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
