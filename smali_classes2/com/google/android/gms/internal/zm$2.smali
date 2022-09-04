.class Lcom/google/android/gms/internal/zm$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zm;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/abi;

.field final synthetic b:Lcom/google/android/gms/internal/zm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zm;Lcom/google/android/gms/internal/abi;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zm$2;->b:Lcom/google/android/gms/internal/zm;

    iput-object p2, p0, Lcom/google/android/gms/internal/zm$2;->a:Lcom/google/android/gms/internal/abi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zm$2;->b:Lcom/google/android/gms/internal/zm;

    iget-object v1, v0, Lcom/google/android/gms/internal/zm;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zm$2;->b:Lcom/google/android/gms/internal/zm;

    iget-object v2, p0, Lcom/google/android/gms/internal/zm$2;->a:Lcom/google/android/gms/internal/abi;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zm;->a(Lcom/google/android/gms/internal/abi;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
