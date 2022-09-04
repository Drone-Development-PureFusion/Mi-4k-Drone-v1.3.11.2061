.class Lcom/fimi/soul/biz/k/c$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/k/c;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/k/c;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/k/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/k/c$1;->a:Lcom/fimi/soul/biz/k/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    invoke-static {}, Lcom/fimi/soul/biz/k/h;->a()Lcom/fimi/soul/biz/k/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/h;->d()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c$1;->a:Lcom/fimi/soul/biz/k/c;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v1, v2}, Lcom/fimi/soul/biz/k/c;->a(Lcom/fimi/soul/biz/k/c;I)I

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c$1;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v1}, Lcom/fimi/soul/biz/k/c;->a(Lcom/fimi/soul/biz/k/c;)I

    move-result v1

    iget-object v2, p0, Lcom/fimi/soul/biz/k/c$1;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v2}, Lcom/fimi/soul/biz/k/c;->b(Lcom/fimi/soul/biz/k/c;)I

    move-result v2

    if-gt v1, v2, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c$1;->a:Lcom/fimi/soul/biz/k/c;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/k/c;->b()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;

    iget-object v2, p0, Lcom/fimi/soul/biz/k/c$1;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v2, v0}, Lcom/fimi/soul/biz/k/c;->a(Lcom/fimi/soul/biz/k/c;Lcom/fimi/soul/entity/DynamicDYZ_Entity;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/biz/k/c$1;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v1}, Lcom/fimi/soul/biz/k/c;->c(Lcom/fimi/soul/biz/k/c;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x1e

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c$1;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v1, v0}, Lcom/fimi/soul/biz/k/c;->a(Lcom/fimi/soul/biz/k/c;Ljava/util/List;)V

    :cond_1
    return-void
.end method
