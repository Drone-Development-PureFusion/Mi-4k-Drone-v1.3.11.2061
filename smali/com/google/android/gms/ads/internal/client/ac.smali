.class public Lcom/google/android/gms/ads/internal/client/ac;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;

.field private static b:Lcom/google/android/gms/ads/internal/client/ac;


# instance fields
.field private final c:Lcom/google/android/gms/ads/internal/util/client/a;

.field private final d:Lcom/google/android/gms/ads/internal/client/ab;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/internal/client/ac;->a:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/ads/internal/client/ac;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/ac;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/ac;->a(Lcom/google/android/gms/ads/internal/client/ac;)V

    return-void
.end method

.method protected constructor <init>()V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/util/client/a;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/util/client/a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/ac;->c:Lcom/google/android/gms/ads/internal/util/client/a;

    new-instance v0, Lcom/google/android/gms/ads/internal/client/ab;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/v;

    invoke-direct {v1}, Lcom/google/android/gms/ads/internal/client/v;-><init>()V

    new-instance v2, Lcom/google/android/gms/ads/internal/client/u;

    invoke-direct {v2}, Lcom/google/android/gms/ads/internal/client/u;-><init>()V

    new-instance v3, Lcom/google/android/gms/ads/internal/client/j;

    invoke-direct {v3}, Lcom/google/android/gms/ads/internal/client/j;-><init>()V

    new-instance v4, Lcom/google/android/gms/internal/vj;

    invoke-direct {v4}, Lcom/google/android/gms/internal/vj;-><init>()V

    new-instance v5, Lcom/google/android/gms/ads/internal/reward/client/f;

    invoke-direct {v5}, Lcom/google/android/gms/ads/internal/reward/client/f;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/zf;

    invoke-direct {v6}, Lcom/google/android/gms/internal/zf;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/yp;

    invoke-direct {v7}, Lcom/google/android/gms/internal/yp;-><init>()V

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/ads/internal/client/ab;-><init>(Lcom/google/android/gms/ads/internal/client/v;Lcom/google/android/gms/ads/internal/client/u;Lcom/google/android/gms/ads/internal/client/j;Lcom/google/android/gms/internal/vj;Lcom/google/android/gms/ads/internal/reward/client/f;Lcom/google/android/gms/internal/zf;Lcom/google/android/gms/internal/yp;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/ac;->d:Lcom/google/android/gms/ads/internal/client/ab;

    return-void
.end method

.method public static a()Lcom/google/android/gms/ads/internal/util/client/a;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/ac;->c()Lcom/google/android/gms/ads/internal/client/ac;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/ac;->c:Lcom/google/android/gms/ads/internal/util/client/a;

    return-object v0
.end method

.method protected static a(Lcom/google/android/gms/ads/internal/client/ac;)V
    .locals 2

    sget-object v1, Lcom/google/android/gms/ads/internal/client/ac;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sput-object p0, Lcom/google/android/gms/ads/internal/client/ac;->b:Lcom/google/android/gms/ads/internal/client/ac;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static b()Lcom/google/android/gms/ads/internal/client/ab;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/ac;->c()Lcom/google/android/gms/ads/internal/client/ac;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/ac;->d:Lcom/google/android/gms/ads/internal/client/ab;

    return-object v0
.end method

.method private static c()Lcom/google/android/gms/ads/internal/client/ac;
    .locals 2

    sget-object v1, Lcom/google/android/gms/ads/internal/client/ac;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/ads/internal/client/ac;->b:Lcom/google/android/gms/ads/internal/client/ac;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
