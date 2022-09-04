.class Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$3;->b:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    iput-object p2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$3;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$3;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$3;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$3;->b:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a()V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$3;->b:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method
