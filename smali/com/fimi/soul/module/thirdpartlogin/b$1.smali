.class Lcom/fimi/soul/module/thirdpartlogin/b$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcn/sharesdk/framework/PlatformActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/thirdpartlogin/b;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/thirdpartlogin/b;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/thirdpartlogin/b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/thirdpartlogin/b$1;->a:Lcom/fimi/soul/module/thirdpartlogin/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Lcn/sharesdk/framework/Platform;I)V
    .locals 2

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v1}, Lcn/sharesdk/framework/Platform;->removeAccount(Z)V

    :cond_0
    const/16 v0, 0x8

    if-ne p2, v0, :cond_1

    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    iput v1, v0, Landroid/os/Message;->what:I

    iput p2, v0, Landroid/os/Message;->arg2:I

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/b$1;->a:Lcom/fimi/soul/module/thirdpartlogin/b;

    invoke-static {v1}, Lcom/fimi/soul/module/thirdpartlogin/b;->a(Lcom/fimi/soul/module/thirdpartlogin/b;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_1
    return-void
.end method

.method public onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcn/sharesdk/framework/Platform;",
            "I",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/16 v0, 0x8

    if-ne p2, v0, :cond_0

    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    const/4 v1, 0x3

    iput v1, v0, Landroid/os/Message;->what:I

    iput p2, v0, Landroid/os/Message;->arg2:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p3, v1, v2

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/b$1;->a:Lcom/fimi/soul/module/thirdpartlogin/b;

    invoke-static {v1}, Lcom/fimi/soul/module/thirdpartlogin/b;->a(Lcom/fimi/soul/module/thirdpartlogin/b;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method public onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
    .locals 2

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v1}, Lcn/sharesdk/framework/Platform;->removeAccount(Z)V

    :cond_0
    const/16 v0, 0x8

    if-ne p2, v0, :cond_2

    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    const/4 v1, 0x2

    iput v1, v0, Landroid/os/Message;->what:I

    iput p2, v0, Landroid/os/Message;->arg2:I

    iput-object p3, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/b$1;->a:Lcom/fimi/soul/module/thirdpartlogin/b;

    invoke-static {v1}, Lcom/fimi/soul/module/thirdpartlogin/b;->a(Lcom/fimi/soul/module/thirdpartlogin/b;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_1
    :goto_0
    invoke-virtual {p3}, Ljava/lang/Throwable;->printStackTrace()V

    return-void

    :cond_2
    if-ne p2, v1, :cond_1

    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    iput v1, v0, Landroid/os/Message;->what:I

    iput p2, v0, Landroid/os/Message;->arg2:I

    iput-object p3, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/b$1;->a:Lcom/fimi/soul/module/thirdpartlogin/b;

    invoke-static {v1}, Lcom/fimi/soul/module/thirdpartlogin/b;->a(Lcom/fimi/soul/module/thirdpartlogin/b;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method
