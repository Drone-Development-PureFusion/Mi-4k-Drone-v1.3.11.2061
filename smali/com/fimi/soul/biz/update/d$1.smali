.class Lcom/fimi/soul/biz/update/d$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/kernel/b/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/update/d;->a(Lcom/fimi/soul/biz/update/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/fimi/kernel/b/e",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/update/k;

.field final synthetic b:Lcom/fimi/soul/biz/update/d;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/update/d;Lcom/fimi/soul/biz/update/k;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/update/d$1;->b:Lcom/fimi/soul/biz/update/d;

    iput-object p2, p0, Lcom/fimi/soul/biz/update/d$1;->a:Lcom/fimi/soul/biz/update/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/fimi/soul/biz/update/d$1;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    const-string v0, "Good"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/fimi/soul/biz/update/d$1;->b:Lcom/fimi/soul/biz/update/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/update/d;->g()Lcom/google/gson/Gson;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/biz/update/d$1$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/biz/update/d$1$1;-><init>(Lcom/fimi/soul/biz/update/d$1;)V

    invoke-virtual {v1}, Lcom/fimi/soul/biz/update/d$1$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/ServerResult;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/fimi/soul/biz/update/d$1;->b:Lcom/fimi/soul/biz/update/d;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/ServerResult;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/entity/UpdateVersonBean;

    invoke-virtual {v2, v1}, Lcom/fimi/soul/biz/update/d;->b(Lcom/fimi/soul/entity/UpdateVersonBean;)V

    iget-object v1, p0, Lcom/fimi/soul/biz/update/d$1;->b:Lcom/fimi/soul/biz/update/d;

    iget-object v2, p0, Lcom/fimi/soul/biz/update/d$1;->b:Lcom/fimi/soul/biz/update/d;

    invoke-virtual {v2}, Lcom/fimi/soul/biz/update/d;->i()Lcom/fimi/soul/entity/UpdateVersonBean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/biz/update/d;->c(Lcom/fimi/soul/entity/UpdateVersonBean;)V

    iget-object v1, p0, Lcom/fimi/soul/biz/update/d$1;->a:Lcom/fimi/soul/biz/update/k;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/ServerResult;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/fimi/soul/biz/update/k;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/biz/update/d$1;->a:Lcom/fimi/soul/biz/update/k;

    iget-object v1, p0, Lcom/fimi/soul/biz/update/d$1;->b:Lcom/fimi/soul/biz/update/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/update/d;->j()Lcom/fimi/soul/entity/UpdateVersonBean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/biz/update/k;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/fimi/soul/biz/update/d$1;->b(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    const-string v0, "Good"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/fimi/soul/biz/update/d$1;->a:Lcom/fimi/soul/biz/update/k;

    iget-object v1, p0, Lcom/fimi/soul/biz/update/d$1;->b:Lcom/fimi/soul/biz/update/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/update/d;->j()Lcom/fimi/soul/entity/UpdateVersonBean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/biz/update/k;->a(Ljava/lang/Object;)V

    return-void
.end method
