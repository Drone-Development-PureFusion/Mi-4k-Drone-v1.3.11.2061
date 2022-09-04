.class public Lcom/google/android/gms/internal/aor;
.super Ljava/lang/Object;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/di;

.field private final c:Ljava/util/concurrent/ExecutorService;

.field private final d:Ljava/util/concurrent/ScheduledExecutorService;

.field private final e:Lcom/google/android/gms/tagmanager/aj;

.field private final f:Lcom/google/android/gms/tagmanager/af;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;)V
    .locals 7

    new-instance v4, Lcom/google/android/gms/internal/di;

    invoke-direct {v4, p1}, Lcom/google/android/gms/internal/di;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/internal/apz;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/apz;->b()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/aor;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;Lcom/google/android/gms/internal/di;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;Lcom/google/android/gms/internal/di;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aor;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/aj;

    iput-object v0, p0, Lcom/google/android/gms/internal/aor;->e:Lcom/google/android/gms/tagmanager/aj;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/af;

    iput-object v0, p0, Lcom/google/android/gms/internal/aor;->f:Lcom/google/android/gms/tagmanager/af;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/di;

    iput-object v0, p0, Lcom/google/android/gms/internal/aor;->b:Lcom/google/android/gms/internal/di;

    invoke-static {p5}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    iput-object v0, p0, Lcom/google/android/gms/internal/aor;->c:Ljava/util/concurrent/ExecutorService;

    invoke-static {p6}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    iput-object v0, p0, Lcom/google/android/gms/internal/aor;->d:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/aoq;
    .locals 11
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    new-instance v4, Lcom/google/android/gms/internal/apq;

    iget-object v0, p0, Lcom/google/android/gms/internal/aor;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/aor;->e:Lcom/google/android/gms/tagmanager/aj;

    iget-object v2, p0, Lcom/google/android/gms/internal/aor;->f:Lcom/google/android/gms/tagmanager/af;

    invoke-direct {v4, v0, v1, v2, p1}, Lcom/google/android/gms/internal/apq;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;Ljava/lang/String;)V

    new-instance v10, Lcom/google/android/gms/internal/aos;

    iget-object v0, p0, Lcom/google/android/gms/internal/aor;->a:Landroid/content/Context;

    invoke-direct {v10, v0, p1}, Lcom/google/android/gms/internal/aos;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/aoq;

    iget-object v5, p0, Lcom/google/android/gms/internal/aor;->b:Lcom/google/android/gms/internal/di;

    iget-object v6, p0, Lcom/google/android/gms/internal/aor;->c:Ljava/util/concurrent/ExecutorService;

    iget-object v7, p0, Lcom/google/android/gms/internal/aor;->d:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v8, p0, Lcom/google/android/gms/internal/aor;->e:Lcom/google/android/gms/tagmanager/aj;

    invoke-static {}, Lcom/google/android/gms/common/util/h;->d()Lcom/google/android/gms/common/util/e;

    move-result-object v9

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/aoq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/apq;Lcom/google/android/gms/internal/di;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/common/util/e;Lcom/google/android/gms/internal/aos;)V

    return-object v0
.end method
