.class Lcom/b/c/d$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/b/c/d;->a(Lcom/b/a/a$a;)Lcom/b/c/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/b/a/a$a;

.field final synthetic b:Lcom/b/c/d;


# direct methods
.method constructor <init>(Lcom/b/c/d;Lcom/b/a/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/b/c/d$1;->b:Lcom/b/c/d;

    iput-object p2, p0, Lcom/b/c/d$1;->a:Lcom/b/a/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Lcom/b/c/d$1;->a:Lcom/b/a/a$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/b/a/a$a;->c(Lcom/b/a/a;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Lcom/b/c/d$1;->a:Lcom/b/a/a$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/b/a/a$a;->b(Lcom/b/a/a;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Lcom/b/c/d$1;->a:Lcom/b/a/a$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/b/a/a$a;->d(Lcom/b/a/a;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Lcom/b/c/d$1;->a:Lcom/b/a/a$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/b/a/a$a;->a(Lcom/b/a/a;)V

    return-void
.end method
