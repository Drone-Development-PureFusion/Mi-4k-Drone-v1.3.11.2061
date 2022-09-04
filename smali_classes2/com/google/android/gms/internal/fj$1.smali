.class Lcom/google/android/gms/internal/fj$1;
.super Lcom/google/android/gms/internal/fk$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/fj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/fj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/fj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fj$1;->a:Lcom/google/android/gms/internal/fj;

    invoke-direct {p0}, Lcom/google/android/gms/internal/fk$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/fj$1;->a:Lcom/google/android/gms/internal/fj;

    iget-object v1, p0, Lcom/google/android/gms/internal/fj$1;->a:Lcom/google/android/gms/internal/fj;

    iget-object v1, v1, Lcom/google/android/gms/internal/fj;->a:Landroid/animation/Animator;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/fj;->a(Landroid/animation/Animator;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/fj$1;->a:Lcom/google/android/gms/internal/fj;

    iget-object v0, v0, Lcom/google/android/gms/internal/fj;->a:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->isStarted()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/fj$1;->a:Lcom/google/android/gms/internal/fj;

    invoke-static {v0}, Lcom/google/android/gms/internal/fj;->a(Lcom/google/android/gms/internal/fj;)Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/fj$1;->a:Lcom/google/android/gms/internal/fj;

    invoke-static {v0}, Lcom/google/android/gms/internal/fj;->a(Lcom/google/android/gms/internal/fj;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/fj$1;->a:Lcom/google/android/gms/internal/fj;

    iget-object v0, v0, Lcom/google/android/gms/internal/fj;->a:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    :cond_1
    return-void
.end method
