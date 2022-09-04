.class public Lcom/google/android/gms/internal/sf;
.super Lcom/google/android/gms/internal/sq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/internal/sq;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method private c()V
    .locals 7

    iget-object v1, p0, Lcom/google/android/gms/internal/sf;->e:Lcom/google/android/gms/internal/df$a;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/sf;->e:Lcom/google/android/gms/internal/df$a;

    iget-object v0, p0, Lcom/google/android/gms/internal/sf;->f:Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/google/android/gms/internal/sf;->b:Lcom/google/android/gms/internal/rw;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/rw;->b()Landroid/content/Context;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, v2, Lcom/google/android/gms/internal/df$a;->aa:Ljava/lang/String;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private d()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/sf;->b:Lcom/google/android/gms/internal/rw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/rw;->n()Lcom/google/android/gms/ads/a/a;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "E1"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/sf;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/ads/a/a;->b()Lcom/google/android/gms/ads/a/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/a/a$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ry;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/sf;->e:Lcom/google/android/gms/internal/df$a;

    monitor-enter v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v3, p0, Lcom/google/android/gms/internal/sf;->e:Lcom/google/android/gms/internal/df$a;

    iput-object v1, v3, Lcom/google/android/gms/internal/df$a;->aa:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/sf;->e:Lcom/google/android/gms/internal/df$a;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/a/a$a;->b()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/gms/internal/df$a;->ac:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/google/android/gms/internal/sf;->e:Lcom/google/android/gms/internal/df$a;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/df$a;->ab:Ljava/lang/Integer;

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    const-string v0, "E"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/sf;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    :try_start_3
    const-string v0, "E"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/sf;->a(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0
.end method


# virtual methods
.method protected a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/sf;->b:Lcom/google/android/gms/internal/rw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/rw;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/sf;->d()V

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/sf;->c()V

    goto :goto_0
.end method
