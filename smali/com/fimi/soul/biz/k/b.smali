.class public Lcom/fimi/soul/biz/k/b;
.super Ljava/lang/Object;


# static fields
.field public static b:Lcom/fimi/soul/biz/k/b;


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
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

    iput-object v0, p0, Lcom/fimi/soul/biz/k/b;->a:Ljava/util/List;

    return-void
.end method

.method public static a()Lcom/fimi/soul/biz/k/b;
    .locals 2

    sget-object v0, Lcom/fimi/soul/biz/k/b;->b:Lcom/fimi/soul/biz/k/b;

    if-nez v0, :cond_1

    const-class v1, Lcom/fimi/soul/biz/k/b;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/fimi/soul/biz/k/b;->b:Lcom/fimi/soul/biz/k/b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/k/b;

    invoke-direct {v0}, Lcom/fimi/soul/biz/k/b;-><init>()V

    sput-object v0, Lcom/fimi/soul/biz/k/b;->b:Lcom/fimi/soul/biz/k/b;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/fimi/soul/biz/k/b;->b:Lcom/fimi/soul/biz/k/b;

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
.method public a(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/k/b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public b(Lcom/google/android/gms/maps/model/LatLng;)Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public c(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
