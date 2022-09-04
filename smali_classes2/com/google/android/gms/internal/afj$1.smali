.class Lcom/google/android/gms/internal/afj$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/afj;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/afj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/afj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/afj$1;->a:Lcom/google/android/gms/internal/afj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/afj$1;->a:Lcom/google/android/gms/internal/afj;

    invoke-static {v0}, Lcom/google/android/gms/internal/afj;->a(Lcom/google/android/gms/internal/afj;)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/afj$1;->a:Lcom/google/android/gms/internal/afj;

    invoke-static {v0}, Lcom/google/android/gms/internal/afj;->b(Lcom/google/android/gms/internal/afj;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/h$c;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afj$1;->a:Lcom/google/android/gms/internal/afj;

    invoke-static {v0}, Lcom/google/android/gms/internal/afj;->e(Lcom/google/android/gms/internal/afj;)Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/afj$1$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/afj$1$1;-><init>(Lcom/google/android/gms/internal/afj$1;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->c(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/afj$1;->a:Lcom/google/android/gms/internal/afj;

    invoke-static {v0}, Lcom/google/android/gms/internal/afj;->a(Lcom/google/android/gms/internal/afj;)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/afj$1;->a:Lcom/google/android/gms/internal/afj;

    invoke-static {v0}, Lcom/google/android/gms/internal/afj;->b(Lcom/google/android/gms/internal/afj;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/h$c;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afj$1;->a:Lcom/google/android/gms/internal/afj;

    invoke-static {v0}, Lcom/google/android/gms/internal/afj;->e(Lcom/google/android/gms/internal/afj;)Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/afj$1$2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/afj$1$2;-><init>(Lcom/google/android/gms/internal/afj$1;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->b(Ljava/lang/Runnable;)V

    goto :goto_0
.end method
