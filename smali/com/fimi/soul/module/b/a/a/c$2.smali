.class Lcom/fimi/soul/module/b/a/a/c$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/b/a/a/c;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/b/a/a/c$a;

.field final synthetic b:Lcom/fimi/soul/module/b/a/a/c;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/b/a/a/c;Lcom/fimi/soul/module/b/a/a/c$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/c$2;->b:Lcom/fimi/soul/module/b/a/a/c;

    iput-object p2, p0, Lcom/fimi/soul/module/b/a/a/c$2;->a:Lcom/fimi/soul/module/b/a/a/c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c$2;->b:Lcom/fimi/soul/module/b/a/a/c;

    invoke-static {v0}, Lcom/fimi/soul/module/b/a/a/c;->a(Lcom/fimi/soul/module/b/a/a/c;)I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c$2;->b:Lcom/fimi/soul/module/b/a/a/c;

    invoke-static {v0}, Lcom/fimi/soul/module/b/a/a/c;->b(Lcom/fimi/soul/module/b/a/a/c;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c$2;->b:Lcom/fimi/soul/module/b/a/a/c;

    invoke-static {v0}, Lcom/fimi/soul/module/b/a/a/c;->b(Lcom/fimi/soul/module/b/a/a/c;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/c$2;->a:Lcom/fimi/soul/module/b/a/a/c$a;

    iget-object v1, v1, Lcom/fimi/soul/module/b/a/a/c$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/c$2;->b:Lcom/fimi/soul/module/b/a/a/c;

    invoke-virtual {v0}, Lcom/fimi/soul/module/b/a/a/c;->notifyDataSetChanged()V

    const/4 v0, 0x0

    return v0
.end method
