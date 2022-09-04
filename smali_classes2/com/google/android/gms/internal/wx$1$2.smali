.class Lcom/google/android/gms/internal/wx$1$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/vt;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/wx$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/wu;

.field final synthetic b:Lcom/google/android/gms/internal/wx$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/wx$1;Lcom/google/android/gms/internal/wu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/wx$1$2;->b:Lcom/google/android/gms/internal/wx$1;

    iput-object p2, p0, Lcom/google/android/gms/internal/wx$1$2;->a:Lcom/google/android/gms/internal/wu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/acy;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/acy;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/wx$1$2;->b:Lcom/google/android/gms/internal/wx$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/wx$1;->c:Lcom/google/android/gms/internal/wx;

    invoke-static {v0}, Lcom/google/android/gms/internal/wx;->c(Lcom/google/android/gms/internal/wx;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/wx$1$2;->b:Lcom/google/android/gms/internal/wx$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/wx$1;->b:Lcom/google/android/gms/internal/wx$d;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wx$d;->b()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/wx$1$2;->b:Lcom/google/android/gms/internal/wx$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/wx$1;->b:Lcom/google/android/gms/internal/wx$d;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wx$d;->b()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    :cond_0
    monitor-exit v1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/wx$1$2;->b:Lcom/google/android/gms/internal/wx$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/wx$1;->c:Lcom/google/android/gms/internal/wx;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/wx;->a(Lcom/google/android/gms/internal/wx;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/wx$1$2;->b:Lcom/google/android/gms/internal/wx$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/wx$1;->c:Lcom/google/android/gms/internal/wx;

    invoke-static {v0}, Lcom/google/android/gms/internal/wx;->d(Lcom/google/android/gms/internal/wx;)Lcom/google/android/gms/internal/aca;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/wx$1$2;->a:Lcom/google/android/gms/internal/wu;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/aca;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/wx$1$2;->b:Lcom/google/android/gms/internal/wx$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/wx$1;->b:Lcom/google/android/gms/internal/wx$d;

    iget-object v2, p0, Lcom/google/android/gms/internal/wx$1$2;->a:Lcom/google/android/gms/internal/wu;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/wx$d;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/wx$1$2;->b:Lcom/google/android/gms/internal/wx$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/wx$1;->c:Lcom/google/android/gms/internal/wx;

    iget-object v2, p0, Lcom/google/android/gms/internal/wx$1$2;->b:Lcom/google/android/gms/internal/wx$1;

    iget-object v2, v2, Lcom/google/android/gms/internal/wx$1;->b:Lcom/google/android/gms/internal/wx$d;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/wx;->a(Lcom/google/android/gms/internal/wx;Lcom/google/android/gms/internal/wx$d;)Lcom/google/android/gms/internal/wx$d;

    const-string v0, "Successfully loaded JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->e(Ljava/lang/String;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
