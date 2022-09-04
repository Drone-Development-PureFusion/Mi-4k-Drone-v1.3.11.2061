.class public Lcom/google/android/gms/internal/id;
.super Lcom/google/android/gms/internal/ic;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lcom/google/firebase/b;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/id;->j:Lcom/google/firebase/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/google/firebase/database/j$a;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/id;->e()V

    sget-object v0, Lcom/google/android/gms/internal/id$1;->a:[I

    invoke-virtual {p1}, Lcom/google/firebase/database/j$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x13

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown log level: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :pswitch_0
    :try_start_1
    sget-object v0, Lcom/google/android/gms/internal/kt$a;->a:Lcom/google/android/gms/internal/kt$a;

    iput-object v0, p0, Lcom/google/android/gms/internal/id;->g:Lcom/google/android/gms/internal/kt$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :pswitch_1
    :try_start_2
    sget-object v0, Lcom/google/android/gms/internal/kt$a;->b:Lcom/google/android/gms/internal/kt$a;

    iput-object v0, p0, Lcom/google/android/gms/internal/id;->g:Lcom/google/android/gms/internal/kt$a;

    goto :goto_0

    :pswitch_2
    sget-object v0, Lcom/google/android/gms/internal/kt$a;->c:Lcom/google/android/gms/internal/kt$a;

    iput-object v0, p0, Lcom/google/android/gms/internal/id;->g:Lcom/google/android/gms/internal/kt$a;

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/google/android/gms/internal/kt$a;->d:Lcom/google/android/gms/internal/kt$a;

    iput-object v0, p0, Lcom/google/android/gms/internal/id;->g:Lcom/google/android/gms/internal/kt$a;

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/google/android/gms/internal/kt$a;->e:Lcom/google/android/gms/internal/kt$a;

    iput-object v0, p0, Lcom/google/android/gms/internal/id;->g:Lcom/google/android/gms/internal/kt$a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public declared-synchronized a(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/id;->e()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/id;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c(Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/id;->e()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Session identifier is not allowed to be empty or null!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/internal/id;->e:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void
.end method
