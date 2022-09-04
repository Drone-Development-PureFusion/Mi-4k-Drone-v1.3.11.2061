.class public Lcom/fimi/soul/biz/k/a;
.super Ljava/lang/Object;


# static fields
.field public static b:Lcom/fimi/soul/biz/k/a;


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/k/a;->a:Ljava/util/List;

    return-void
.end method

.method public static a()Lcom/fimi/soul/biz/k/a;
    .locals 2

    sget-object v0, Lcom/fimi/soul/biz/k/a;->b:Lcom/fimi/soul/biz/k/a;

    if-nez v0, :cond_1

    const-class v1, Lcom/fimi/soul/biz/k/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/fimi/soul/biz/k/a;->b:Lcom/fimi/soul/biz/k/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/k/a;

    invoke-direct {v0}, Lcom/fimi/soul/biz/k/a;-><init>()V

    sput-object v0, Lcom/fimi/soul/biz/k/a;->b:Lcom/fimi/soul/biz/k/a;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/fimi/soul/biz/k/a;->b:Lcom/fimi/soul/biz/k/a;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/c;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLng;)Z
    .locals 8

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v0, v1

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-static {v3, p1}, Lcom/fimi/soul/utils/ae;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/am;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fimi/soul/utils/am;->a()D

    move-result-wide v4

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->d()D

    move-result-wide v6

    cmpl-double v0, v4, v6

    if-lez v0, :cond_2

    move v0, v1

    :goto_0
    if-eqz v0, :cond_0

    :cond_1
    return v0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
