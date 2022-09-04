.class Lcom/fimi/soul/module/b/a/a/i$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/b/a/a/i;->d(Lcn/sharesdk/framework/Platform;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/Platform;

.field final synthetic b:Lcom/fimi/soul/module/b/a/a/i;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/b/a/a/i;Lcn/sharesdk/framework/Platform;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/i$2;->b:Lcom/fimi/soul/module/b/a/a/i;

    iput-object p2, p0, Lcom/fimi/soul/module/b/a/a/i$2;->a:Lcn/sharesdk/framework/Platform;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i$2;->b:Lcom/fimi/soul/module/b/a/a/i;

    invoke-static {v0}, Lcom/fimi/soul/module/b/a/a/i;->a(Lcom/fimi/soul/module/b/a/a/i;)Z

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/i$2;->a:Lcn/sharesdk/framework/Platform;

    instance-of v1, v1, Lcn/sharesdk/framework/CustomPlatform;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/i$2;->b:Lcom/fimi/soul/module/b/a/a/i;

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/i$2;->a:Lcn/sharesdk/framework/Platform;

    invoke-static {v2, v3}, Lcom/fimi/soul/module/b/a/a/i;->a(Lcom/fimi/soul/module/b/a/a/i;Lcn/sharesdk/framework/Platform;)Z

    move-result v2

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    if-eqz v2, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i$2;->b:Lcom/fimi/soul/module/b/a/a/i;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/i$2;->a:Lcn/sharesdk/framework/Platform;

    invoke-static {v0, v1}, Lcom/fimi/soul/module/b/a/a/i;->b(Lcom/fimi/soul/module/b/a/a/i;Lcn/sharesdk/framework/Platform;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i$2;->b:Lcom/fimi/soul/module/b/a/a/i;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/i$2;->a:Lcn/sharesdk/framework/Platform;

    invoke-static {v0, v1}, Lcom/fimi/soul/module/b/a/a/i;->c(Lcom/fimi/soul/module/b/a/a/i;Lcn/sharesdk/framework/Platform;)Lcn/sharesdk/framework/Platform$ShareParams;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcn/sharesdk/framework/ShareSDK;->logDemoEvent(ILcn/sharesdk/framework/Platform;)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/i$2;->b:Lcom/fimi/soul/module/b/a/a/i;

    invoke-static {v1}, Lcom/fimi/soul/module/b/a/a/i;->b(Lcom/fimi/soul/module/b/a/a/i;)Lcom/fimi/soul/module/b/f;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/i$2;->b:Lcom/fimi/soul/module/b/a/a/i;

    invoke-static {v1}, Lcom/fimi/soul/module/b/a/a/i;->c(Lcom/fimi/soul/module/b/a/a/i;)Lcom/fimi/soul/module/b/f;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/i$2;->a:Lcn/sharesdk/framework/Platform;

    invoke-interface {v1, v2, v0}, Lcom/fimi/soul/module/b/f;->a(Lcn/sharesdk/framework/Platform;Lcn/sharesdk/framework/Platform$ShareParams;)V

    :cond_3
    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/i$2;->b:Lcom/fimi/soul/module/b/a/a/i;

    invoke-static {v1}, Lcom/fimi/soul/module/b/a/a/i;->e(Lcom/fimi/soul/module/b/a/a/i;)Lcom/fimi/soul/module/b/a/a/a;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/i$2;->b:Lcom/fimi/soul/module/b/a/a/i;

    invoke-static {v2}, Lcom/fimi/soul/module/b/a/a/i;->d(Lcom/fimi/soul/module/b/a/a/i;)Landroid/app/Activity;

    move-result-object v2

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/i$2;->a:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v1, v2, v3, v0}, Lcom/fimi/soul/module/b/a/a/a;->a(Landroid/content/Context;Lcn/sharesdk/framework/Platform;Lcn/sharesdk/framework/Platform$ShareParams;)V

    goto :goto_0
.end method
