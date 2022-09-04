.class Lcom/fimi/soul/biz/update/b$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/m/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/update/b;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/update/b;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/update/b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/update/b$2;->a:Lcom/fimi/soul/biz/update/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/entity/PlaneMsg;Ljava/io/File;)V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b$2;->a:Lcom/fimi/soul/biz/update/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/b;->c(Lcom/fimi/soul/biz/update/b;)Lcom/fimi/soul/biz/update/b$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/entity/PlaneMsg;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/entity/PlaneMsg;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/AppVersion;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/AppVersion;->getNewVersion()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/AppVersion;->getNewVersion()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v1, ""

    invoke-virtual {v0}, Lcom/fimi/soul/entity/AppVersion;->getNewVersion()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/fimi/soul/entity/AppVersion;->getNewVersion()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lcom/fimi/soul/biz/update/b$2;->a:Lcom/fimi/soul/biz/update/b;

    invoke-static {v2}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/fimi/soul/utils/au;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-eqz v0, :cond_0

    if-le v1, v2, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/update/b$2;->a:Lcom/fimi/soul/biz/update/b;

    invoke-static {v1}, Lcom/fimi/soul/biz/update/b;->c(Lcom/fimi/soul/biz/update/b;)Lcom/fimi/soul/biz/update/b$a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/fimi/soul/entity/AppVersion;->getUserVersion()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/fimi/soul/biz/update/b$a;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
