.class public Lcom/google/android/gms/fitness/request/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/request/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/fitness/request/d$a;


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/fitness/request/a;",
            "Lcom/google/android/gms/fitness/request/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/d$a;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/d$a;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/d$a;->a:Lcom/google/android/gms/fitness/request/d$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/d$a;->b:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/google/android/gms/fitness/request/d$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/fitness/request/d$a;->a:Lcom/google/android/gms/fitness/request/d$a;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/fitness/request/a;)Lcom/google/android/gms/fitness/request/d;
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/fitness/request/d$a;->b:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/d$a;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/request/d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/fitness/request/d;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2}, Lcom/google/android/gms/fitness/request/d;-><init>(Lcom/google/android/gms/fitness/request/a;Lcom/google/android/gms/fitness/request/d$1;)V

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/d$a;->b:Ljava/util/Map;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b(Lcom/google/android/gms/fitness/request/a;)Lcom/google/android/gms/fitness/request/d;
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/fitness/request/d$a;->b:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/d$a;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/request/d;

    if-eqz v0, :cond_0

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/fitness/request/d;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2}, Lcom/google/android/gms/fitness/request/d;-><init>(Lcom/google/android/gms/fitness/request/a;Lcom/google/android/gms/fitness/request/d$1;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
