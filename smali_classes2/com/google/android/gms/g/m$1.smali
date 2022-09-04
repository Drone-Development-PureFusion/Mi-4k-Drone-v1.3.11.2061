.class Lcom/google/android/gms/g/m$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/g/m;->a(Lcom/google/android/gms/g/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/g/f;

.field final synthetic b:Lcom/google/android/gms/g/m;


# direct methods
.method constructor <init>(Lcom/google/android/gms/g/m;Lcom/google/android/gms/g/f;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/g/m$1;->b:Lcom/google/android/gms/g/m;

    iput-object p2, p0, Lcom/google/android/gms/g/m$1;->a:Lcom/google/android/gms/g/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/g/m$1;->b:Lcom/google/android/gms/g/m;

    invoke-static {v0}, Lcom/google/android/gms/g/m;->a(Lcom/google/android/gms/g/m;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/g/m$1;->b:Lcom/google/android/gms/g/m;

    invoke-static {v0}, Lcom/google/android/gms/g/m;->b(Lcom/google/android/gms/g/m;)Lcom/google/android/gms/g/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/g/m$1;->b:Lcom/google/android/gms/g/m;

    invoke-static {v0}, Lcom/google/android/gms/g/m;->b(Lcom/google/android/gms/g/m;)Lcom/google/android/gms/g/c;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/g/m$1;->a:Lcom/google/android/gms/g/f;

    invoke-virtual {v2}, Lcom/google/android/gms/g/f;->d()Ljava/lang/Exception;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/g/c;->a(Ljava/lang/Exception;)V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
