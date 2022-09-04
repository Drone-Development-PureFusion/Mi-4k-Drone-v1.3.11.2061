.class Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$2;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a(Landroid/view/View;Landroid/view/View;ZLcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Z

.field final synthetic c:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;

.field final synthetic d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;Landroid/view/View;ZLcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$2;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    iput-object p2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$2;->a:Landroid/view/View;

    iput-boolean p3, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$2;->b:Z

    iput-object p4, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$2;->c:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$2;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$2;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$2;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$2;->c:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;->a()V

    :cond_1
    const/4 v0, 0x1

    return v0
.end method
