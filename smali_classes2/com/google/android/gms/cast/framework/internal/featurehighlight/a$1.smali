.class Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$1;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$1;->a:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$1;->a:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;FF)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$1;->a:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    invoke-static {v2}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;)Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;->a(FF)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$1;->a:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->b(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;)Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;->b()V

    :cond_1
    const/4 v0, 0x1

    return v0
.end method
