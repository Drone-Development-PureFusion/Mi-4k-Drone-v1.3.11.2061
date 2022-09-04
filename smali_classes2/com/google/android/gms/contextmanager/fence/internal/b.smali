.class public Lcom/google/android/gms/contextmanager/fence/internal/b;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/internal/pw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/pw;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/pw;

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/b;->a:Lcom/google/android/gms/internal/pw;

    return-void
.end method

.method public static a()Lcom/google/android/gms/contextmanager/fence/internal/b;
    .locals 5

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/b;

    const/4 v1, 0x2

    const-wide/16 v2, 0xbb8

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lcom/google/android/gms/contextmanager/fence/internal/b;->a(IJI)Lcom/google/android/gms/internal/pw;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/contextmanager/fence/internal/b;-><init>(Lcom/google/android/gms/internal/pw;)V

    return-object v0
.end method

.method public static a(I)Lcom/google/android/gms/contextmanager/fence/internal/b;
    .locals 4

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/b;

    const/4 v1, 0x1

    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3, p0}, Lcom/google/android/gms/contextmanager/fence/internal/b;->a(IJI)Lcom/google/android/gms/internal/pw;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/contextmanager/fence/internal/b;-><init>(Lcom/google/android/gms/internal/pw;)V

    return-object v0
.end method

.method private static a(IJI)Lcom/google/android/gms/internal/pw;
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/pw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/pw;-><init>()V

    iput p0, v0, Lcom/google/android/gms/internal/pw;->a:I

    iput-wide p1, v0, Lcom/google/android/gms/internal/pw;->b:J

    packed-switch p0, :pswitch_data_0

    const-string v1, "AudioStateFenceStub"

    const-string v2, "Unknown trigger type=%s"

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/sw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    :goto_0
    return-object v0

    :pswitch_0
    iput p3, v0, Lcom/google/android/gms/internal/pw;->c:I

    goto :goto_0

    :pswitch_1
    iput p3, v0, Lcom/google/android/gms/internal/pw;->d:I

    goto :goto_0

    :pswitch_2
    iput p3, v0, Lcom/google/android/gms/internal/pw;->e:I

    goto :goto_0

    :pswitch_3
    iput p3, v0, Lcom/google/android/gms/internal/pw;->f:I

    goto :goto_0

    :pswitch_4
    iput p3, v0, Lcom/google/android/gms/internal/pw;->g:I

    goto :goto_0

    :pswitch_5
    iput p3, v0, Lcom/google/android/gms/internal/pw;->h:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method

.method public static b()Lcom/google/android/gms/contextmanager/fence/internal/b;
    .locals 5

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/b;

    const/4 v1, 0x3

    const-wide/16 v2, 0xbb8

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lcom/google/android/gms/contextmanager/fence/internal/b;->a(IJI)Lcom/google/android/gms/internal/pw;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/contextmanager/fence/internal/b;-><init>(Lcom/google/android/gms/internal/pw;)V

    return-object v0
.end method


# virtual methods
.method public c()Lcom/google/android/gms/internal/pw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/b;->a:Lcom/google/android/gms/internal/pw;

    return-object v0
.end method
