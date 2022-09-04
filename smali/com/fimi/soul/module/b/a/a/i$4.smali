.class Lcom/fimi/soul/module/b/a/a/i$4;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/b/a/a/i;->onFinish()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/b/a/a/i;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/b/a/a/i;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/i$4;->a:Lcom/fimi/soul/module/b/a/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i$4;->a:Lcom/fimi/soul/module/b/a/a/i;

    invoke-static {v0}, Lcom/fimi/soul/module/b/a/a/i;->f(Lcom/fimi/soul/module/b/a/a/i;)Ljava/lang/Runnable;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0, v1}, Lcn/sharesdk/framework/ShareSDK;->logDemoEvent(ILcn/sharesdk/framework/Platform;)V

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i$4;->a:Lcom/fimi/soul/module/b/a/a/i;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/b/a/a/i;->a(Lcom/fimi/soul/module/b/a/a/i;Z)Z

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i$4;->a:Lcom/fimi/soul/module/b/a/a/i;

    invoke-virtual {v0}, Lcom/fimi/soul/module/b/a/a/i;->finish()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i$4;->a:Lcom/fimi/soul/module/b/a/a/i;

    invoke-static {v0}, Lcom/fimi/soul/module/b/a/a/i;->f(Lcom/fimi/soul/module/b/a/a/i;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i$4;->a:Lcom/fimi/soul/module/b/a/a/i;

    invoke-static {v0, v1}, Lcom/fimi/soul/module/b/a/a/i;->a(Lcom/fimi/soul/module/b/a/a/i;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    goto :goto_0
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
