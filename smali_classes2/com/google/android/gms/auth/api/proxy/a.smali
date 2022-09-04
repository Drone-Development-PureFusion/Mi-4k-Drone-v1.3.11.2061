.class public Lcom/google/android/gms/auth/api/proxy/a;
.super Lcom/google/android/gms/common/api/f;


# static fields
.field public static final a:I = 0xbb8

.field public static final b:I = 0xbb9

.field public static final c:I = 0xbba

.field public static final d:I = 0xbbb

.field public static final e:I = 0xbbc

.field public static final f:I = 0xbbd

.field public static final g:I = 0xbbe


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
    const-string v0, "AUTH_API_INVALID_CREDENTIALS"

    goto :goto_0

    :pswitch_1
    const-string v0, "AUTH_API_ACCESS_FORBIDDEN"

    goto :goto_0

    :pswitch_2
    const-string v0, "AUTH_API_CLIENT_ERROR"

    goto :goto_0

    :pswitch_3
    const-string v0, "AUTH_API_SERVER_ERROR"

    goto :goto_0

    :pswitch_4
    const-string v0, "AUTH_TOKEN_ERROR"

    goto :goto_0

    :pswitch_5
    const-string v0, "AUTH_URL_RESOLUTION"

    goto :goto_0

    :pswitch_6
    const-string v0, "AUTH_APP_CERT_ERROR"

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0xbb8
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
