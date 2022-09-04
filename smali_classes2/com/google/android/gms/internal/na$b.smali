.class Lcom/google/android/gms/internal/na$b;
.super Lcom/google/android/gms/internal/aij;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/na;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/na$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/aik;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/aij;-><init>(Lcom/google/android/gms/internal/aik;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/na$b;->a:Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/internal/na$b;->d:Lcom/google/android/gms/internal/aik;

    const-string v1, "StorageOnStopCallback"

    invoke-interface {v0, v1, p0}, Lcom/google/android/gms/internal/aik;->a(Ljava/lang/String;Lcom/google/android/gms/internal/aij;)V

    return-void
.end method

.method public static a(Landroid/app/Activity;)Lcom/google/android/gms/internal/na$b;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/aih;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aih;-><init>(Landroid/app/Activity;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/na$b;->b(Lcom/google/android/gms/internal/aih;)Lcom/google/android/gms/internal/aik;

    move-result-object v1

    const-string v0, "StorageOnStopCallback"

    const-class v2, Lcom/google/android/gms/internal/na$b;

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/aik;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/gms/internal/aij;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/na$b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/na$b;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/na$b;-><init>(Lcom/google/android/gms/internal/aik;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/na$b;->a:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/google/android/gms/internal/na$b;->a:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/na$b;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/na$a;

    if-eqz v0, :cond_0

    const-string v2, "StorageOnStopCallback"

    const-string v3, "removing subscription from activity."

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/na$a;->b()Ljava/lang/Runnable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    invoke-static {}, Lcom/google/android/gms/internal/na;->a()Lcom/google/android/gms/internal/na;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/na$a;->c()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/na;->a(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    return-void
.end method

.method public a(Lcom/google/android/gms/internal/na$a;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/na$b;->a:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/na$b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b(Lcom/google/android/gms/internal/na$a;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/na$b;->a:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/na$b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
