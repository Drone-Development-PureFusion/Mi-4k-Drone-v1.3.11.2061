.class public Lcom/google/android/gms/internal/wv;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/wv$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/wv$a;Lcom/google/android/gms/internal/ro;Lcom/google/android/gms/ads/internal/d;)Lcom/google/android/gms/internal/wu;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;",
            "Lcom/google/android/gms/internal/wv$a",
            "<",
            "Lcom/google/android/gms/internal/wu;",
            ">;",
            "Lcom/google/android/gms/internal/ro;",
            "Lcom/google/android/gms/ads/internal/d;",
            ")",
            "Lcom/google/android/gms/internal/wu;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ww;

    invoke-direct {v0, p1, p2, p4, p5}, Lcom/google/android/gms/internal/ww;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ro;Lcom/google/android/gms/ads/internal/d;)V

    iput-object v0, p3, Lcom/google/android/gms/internal/wv$a;->a:Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/wv$2;

    invoke-direct {v1, p0, p3}, Lcom/google/android/gms/internal/wv$2;-><init>(Lcom/google/android/gms/internal/wv;Lcom/google/android/gms/internal/wv$a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/wu;->a(Lcom/google/android/gms/internal/wu$a;)V

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/wv;Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/wv$a;Lcom/google/android/gms/internal/ro;Lcom/google/android/gms/ads/internal/d;)Lcom/google/android/gms/internal/wu;
    .locals 1

    invoke-direct/range {p0 .. p5}, Lcom/google/android/gms/internal/wv;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/wv$a;Lcom/google/android/gms/internal/ro;Lcom/google/android/gms/ads/internal/d;)Lcom/google/android/gms/internal/wu;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;Lcom/google/android/gms/internal/ro;Lcom/google/android/gms/ads/internal/d;)Ljava/util/concurrent/Future;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ro;",
            "Lcom/google/android/gms/ads/internal/d;",
            ")",
            "Ljava/util/concurrent/Future",
            "<",
            "Lcom/google/android/gms/internal/wu;",
            ">;"
        }
    .end annotation

    new-instance v4, Lcom/google/android/gms/internal/wv$a;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/wv$a;-><init>(Lcom/google/android/gms/internal/wv$1;)V

    sget-object v8, Lcom/google/android/gms/internal/abv;->a:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/wv$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p4

    move-object v6, p5

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/wv$1;-><init>(Lcom/google/android/gms/internal/wv;Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/wv$a;Lcom/google/android/gms/internal/ro;Lcom/google/android/gms/ads/internal/d;Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v4
.end method
