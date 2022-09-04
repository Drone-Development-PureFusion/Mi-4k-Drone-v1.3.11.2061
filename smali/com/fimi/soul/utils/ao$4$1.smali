.class Lcom/fimi/soul/utils/ao$4$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/m/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/utils/ao$4;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/utils/ao$4;


# direct methods
.method constructor <init>(Lcom/fimi/soul/utils/ao$4;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/utils/ao$4$1;->a:Lcom/fimi/soul/utils/ao$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/entity/PlaneMsg;Ljava/io/File;)V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/utils/ao$4$1;->a:Lcom/fimi/soul/utils/ao$4;

    iget-object v0, v0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/PlaneMsg;->getErrorMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(Lcom/fimi/soul/utils/ao;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/PlaneMsg;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/utils/ao$4$1;->a:Lcom/fimi/soul/utils/ao$4;

    iget-object v0, v0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->c(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/utils/ap$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/utils/ao$4$1;->a:Lcom/fimi/soul/utils/ao$4;

    iget-object v0, v0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->c(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/utils/ap$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/utils/ap$a;->a()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/utils/ao$4$1;->a:Lcom/fimi/soul/utils/ao$4;

    iget-object v0, v0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->f(Lcom/fimi/soul/utils/ao;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/utils/ao$4$1;->a:Lcom/fimi/soul/utils/ao$4;

    iget-object v0, v0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->c(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/utils/ap$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/utils/ao$4$1;->a:Lcom/fimi/soul/utils/ao$4;

    iget-object v0, v0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->c(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/utils/ap$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/utils/ao$4$1;->a:Lcom/fimi/soul/utils/ao$4;

    iget-object v1, v1, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v1}, Lcom/fimi/soul/utils/ao;->f(Lcom/fimi/soul/utils/ao;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/utils/ap$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/utils/ao$4$1;->a:Lcom/fimi/soul/utils/ao$4;

    iget-object v0, v0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->c(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/utils/ap$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/utils/ao$4$1;->a:Lcom/fimi/soul/utils/ao$4;

    iget-object v0, v0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->c(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/utils/ap$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/utils/ao$4$1;->a:Lcom/fimi/soul/utils/ao$4;

    iget-object v1, v1, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v1}, Lcom/fimi/soul/utils/ao;->d(Lcom/fimi/soul/utils/ao;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0b02fc

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/utils/ap$a;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
