.class Lcom/google/android/gms/internal/wx$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/acr$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/wx;->a(Lcom/google/android/gms/internal/ro;)Lcom/google/android/gms/internal/wx$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/wx$d;

.field final synthetic b:Lcom/google/android/gms/internal/wx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/wx;Lcom/google/android/gms/internal/wx$d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/wx$3;->b:Lcom/google/android/gms/internal/wx;

    iput-object p2, p0, Lcom/google/android/gms/internal/wx$3;->a:Lcom/google/android/gms/internal/wx$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/wx$3;->b:Lcom/google/android/gms/internal/wx;

    invoke-static {v0}, Lcom/google/android/gms/internal/wx;->c(Lcom/google/android/gms/internal/wx;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/wx$3;->b:Lcom/google/android/gms/internal/wx;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/wx;->a(Lcom/google/android/gms/internal/wx;I)I

    const-string v0, "Failed loading new engine. Marking new engine destroyable."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/wx$3;->a:Lcom/google/android/gms/internal/wx$d;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wx$d;->c()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
