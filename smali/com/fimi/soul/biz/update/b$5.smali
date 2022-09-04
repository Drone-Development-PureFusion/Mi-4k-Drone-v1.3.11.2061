.class Lcom/fimi/soul/biz/update/b$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/m/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/update/b;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/fimi/soul/biz/update/b;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/update/b;Z)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/update/b$5;->b:Lcom/fimi/soul/biz/update/b;

    iput-boolean p2, p0, Lcom/fimi/soul/biz/update/b$5;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/entity/PlaneMsg;Ljava/io/File;)V
    .locals 3

    invoke-virtual {p1}, Lcom/fimi/soul/entity/PlaneMsg;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b$5;->b:Lcom/fimi/soul/biz/update/b;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/PlaneMsg;->getData()Ljava/lang/Object;

    move-result-object v1

    iget-boolean v2, p0, Lcom/fimi/soul/biz/update/b$5;->a:Z

    invoke-static {v0, v1, v2}, Lcom/fimi/soul/biz/update/b;->a(Lcom/fimi/soul/biz/update/b;Ljava/lang/Object;Z)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-boolean v0, p0, Lcom/fimi/soul/biz/update/b$5;->a:Z

    if-eqz v0, :cond_0

    const-string v0, ""

    invoke-virtual {p1}, Lcom/fimi/soul/entity/PlaneMsg;->getErrorMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b$5;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/fimi/soul/entity/PlaneMsg;->getErrorMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0
.end method
