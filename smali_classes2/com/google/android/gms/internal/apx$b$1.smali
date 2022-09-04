.class Lcom/google/android/gms/internal/apx$b$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/apx$b;->a(ZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/google/android/gms/internal/apx$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/apx$b;ZLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/apx$b$1;->c:Lcom/google/android/gms/internal/apx$b;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/apx$b$1;->a:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/apx$b$1;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/apx$b$1;->c:Lcom/google/android/gms/internal/apx$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/apx$b;->a:Lcom/google/android/gms/internal/apx;

    invoke-static {v0}, Lcom/google/android/gms/internal/apx;->a(Lcom/google/android/gms/internal/apx;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/apx$b$1;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/apx$b$1;->c:Lcom/google/android/gms/internal/apx$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/apx$b;->a:Lcom/google/android/gms/internal/apx;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/apx;->a(Lcom/google/android/gms/internal/apx;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/apx$b$1;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x12

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Container "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " loaded."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/apx$b$1;->c:Lcom/google/android/gms/internal/apx$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/apx$b;->a:Lcom/google/android/gms/internal/apx;

    invoke-static {v0}, Lcom/google/android/gms/internal/apx;->d(Lcom/google/android/gms/internal/apx;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/apx$b$1;->c:Lcom/google/android/gms/internal/apx$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/apx$b;->a:Lcom/google/android/gms/internal/apx;

    invoke-static {v0}, Lcom/google/android/gms/internal/apx;->e(Lcom/google/android/gms/internal/apx;)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/apx$b$1;->c:Lcom/google/android/gms/internal/apx$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/apx$b;->a:Lcom/google/android/gms/internal/apx;

    invoke-static {v0}, Lcom/google/android/gms/internal/apx;->d(Lcom/google/android/gms/internal/apx;)Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/apx$b$1;->c:Lcom/google/android/gms/internal/apx$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/apx$b;->a:Lcom/google/android/gms/internal/apx;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/apx;->a(Lcom/google/android/gms/internal/apx;I)I

    const-string v1, "Error loading container:"

    iget-object v0, p0, Lcom/google/android/gms/internal/apx$b$1;->b:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-string v0, "Container load callback completed after timeout"

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->b(Ljava/lang/String;)V

    :cond_3
    return-void
.end method
