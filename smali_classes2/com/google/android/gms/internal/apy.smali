.class public final Lcom/google/android/gms/internal/apy;
.super Lcom/google/android/gms/internal/apf$a;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/aoq;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/concurrent/ExecutorService;

.field private final c:Lcom/google/android/gms/internal/aor;

.field private final d:Lcom/google/android/gms/tagmanager/aj;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/aor;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/gms/internal/aor;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;)V

    invoke-static {}, Lcom/google/android/gms/internal/apz;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-direct {p0, p2, v0, v1}, Lcom/google/android/gms/internal/apy;-><init>(Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/internal/aor;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/internal/aor;Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/apf$a;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/apy;->a:Ljava/util/Map;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/apy;->d:Lcom/google/android/gms/tagmanager/aj;

    iput-object p2, p0, Lcom/google/android/gms/internal/apy;->c:Lcom/google/android/gms/internal/aor;

    iput-object p3, p0, Lcom/google/android/gms/internal/apy;->b:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/apy;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/apy;->a:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/apy;)Lcom/google/android/gms/internal/aor;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/apy;->c:Lcom/google/android/gms/internal/aor;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/apy;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public a(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)V
    .locals 8

    new-instance v0, Lcom/google/android/gms/internal/aow;

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4, p4, p5}, Ljava/util/Date;-><init>(J)V

    iget-object v6, p0, Lcom/google/android/gms/internal/apy;->d:Lcom/google/android/gms/tagmanager/aj;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/aow;-><init>(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;ZLcom/google/android/gms/tagmanager/aj;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/apy;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/google/android/gms/internal/apy$2;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/apy$2;-><init>(Lcom/google/android/gms/internal/apy;Lcom/google/android/gms/internal/aow;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/apy;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ape;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ape;)V
    .locals 7
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/internal/ape;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    iget-object v6, p0, Lcom/google/android/gms/internal/apy;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lcom/google/android/gms/internal/apy$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/apy$1;-><init>(Lcom/google/android/gms/internal/apy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ape;)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/apy;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/android/gms/internal/apy$3;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/apy$3;-><init>(Lcom/google/android/gms/internal/apy;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
