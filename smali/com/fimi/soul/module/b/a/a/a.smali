.class public Lcom/fimi/soul/module/b/a/a/a;
.super Lcom/fimi/soul/module/b/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/b/e;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Landroid/content/Context;Lcn/sharesdk/framework/Platform;Lcn/sharesdk/framework/Platform$ShareParams;)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/fimi/soul/module/b/a/a/b/a;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/b/a/a/b/a;-><init>(Lcom/fimi/soul/module/b/e;)V

    :goto_0
    invoke-virtual {v0, p2}, Lcom/fimi/soul/module/b/a/a/b;->d(Lcn/sharesdk/framework/Platform;)V

    invoke-virtual {v0, p3}, Lcom/fimi/soul/module/b/a/a/b;->a(Lcn/sharesdk/framework/Platform$ShareParams;)V

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/fimi/soul/module/b/a/a/b;->show(Landroid/content/Context;Landroid/content/Intent;)V

    return-void

    :cond_0
    new-instance v0, Lcom/fimi/soul/module/b/a/a/a/a;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/b/a/a/a/a;-><init>(Lcom/fimi/soul/module/b/e;)V

    goto :goto_0
.end method

.method protected b(Landroid/content/Context;)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/fimi/soul/module/b/a/a/b/d;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/b/a/a/b/d;-><init>(Lcom/fimi/soul/module/b/e;)V

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/fimi/soul/module/b/a/a/i;->show(Landroid/content/Context;Landroid/content/Intent;)V

    return-void

    :cond_0
    new-instance v0, Lcom/fimi/soul/module/b/a/a/a/d;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/b/a/a/a/d;-><init>(Lcom/fimi/soul/module/b/e;)V

    goto :goto_0
.end method
