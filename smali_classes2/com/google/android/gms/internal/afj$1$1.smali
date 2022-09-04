.class Lcom/google/android/gms/internal/afj$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/afj$1;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/afj$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/afj$1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/afj$1$1;->a:Lcom/google/android/gms/internal/afj$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/afj$1$1;->a:Lcom/google/android/gms/internal/afj$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/afj$1;->a:Lcom/google/android/gms/internal/afj;

    invoke-static {v0}, Lcom/google/android/gms/internal/afj;->a(Lcom/google/android/gms/internal/afj;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/afj$1$1;->a:Lcom/google/android/gms/internal/afj$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/afj$1;->a:Lcom/google/android/gms/internal/afj;

    invoke-static {v0}, Lcom/google/android/gms/internal/afj;->b(Lcom/google/android/gms/internal/afj;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/gms/internal/afj$1$1;->a:Lcom/google/android/gms/internal/afj$1;

    iget-object v1, v1, Lcom/google/android/gms/internal/afj$1;->a:Lcom/google/android/gms/internal/afj;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afj$1$1;->a:Lcom/google/android/gms/internal/afj$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/afj$1;->a:Lcom/google/android/gms/internal/afj;

    invoke-static {v0}, Lcom/google/android/gms/internal/afj;->c(Lcom/google/android/gms/internal/afj;)Lcom/google/android/gms/cast/framework/h$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/afj$1$1;->a:Lcom/google/android/gms/internal/afj$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/afj$1;->a:Lcom/google/android/gms/internal/afj;

    invoke-static {v0}, Lcom/google/android/gms/internal/afj;->c(Lcom/google/android/gms/internal/afj;)Lcom/google/android/gms/cast/framework/h$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/h$b;->a()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/afj$1$1;->a:Lcom/google/android/gms/internal/afj$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/afj$1;->a:Lcom/google/android/gms/internal/afj;

    invoke-static {v0}, Lcom/google/android/gms/internal/afj;->d(Lcom/google/android/gms/internal/afj;)V

    :cond_1
    return-void
.end method
