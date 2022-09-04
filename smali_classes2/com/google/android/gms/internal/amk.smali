.class public final Lcom/google/android/gms/internal/amk;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/google/android/gms/internal/amk;


# instance fields
.field private final b:Lcom/google/android/gms/internal/amg;

.field private final c:Lcom/google/android/gms/internal/amh;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/amk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/amk;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/amk;->a(Lcom/google/android/gms/internal/amk;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/amg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/amg;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/amk;->b:Lcom/google/android/gms/internal/amg;

    new-instance v0, Lcom/google/android/gms/internal/amh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/amh;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/amk;->c:Lcom/google/android/gms/internal/amh;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/amg;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/amk;->c()Lcom/google/android/gms/internal/amk;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/amk;->b:Lcom/google/android/gms/internal/amg;

    return-object v0
.end method

.method protected static a(Lcom/google/android/gms/internal/amk;)V
    .locals 2

    const-class v1, Lcom/google/android/gms/internal/amk;

    monitor-enter v1

    :try_start_0
    sput-object p0, Lcom/google/android/gms/internal/amk;->a:Lcom/google/android/gms/internal/amk;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static b()Lcom/google/android/gms/internal/amh;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/amk;->c()Lcom/google/android/gms/internal/amk;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/amk;->c:Lcom/google/android/gms/internal/amh;

    return-object v0
.end method

.method private static c()Lcom/google/android/gms/internal/amk;
    .locals 2

    const-class v1, Lcom/google/android/gms/internal/amk;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/amk;->a:Lcom/google/android/gms/internal/amk;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
