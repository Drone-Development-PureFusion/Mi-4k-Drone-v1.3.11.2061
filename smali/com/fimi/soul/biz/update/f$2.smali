.class Lcom/fimi/soul/biz/update/f$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/update/f;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/update/f;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/update/f;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/update/f$2;->a:Lcom/fimi/soul/biz/update/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    invoke-static {}, Lcom/fimi/soul/biz/update/f;->o()Lcom/fimi/soul/drone/d/a/a/bz;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/update/f$2;->a:Lcom/fimi/soul/biz/update/f;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/f;->a(Lcom/fimi/soul/biz/update/f;)Lcom/fimi/soul/drone/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ab()Lcom/fimi/soul/drone/droneconnection/connection/g$a;

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/update/f;->o()Lcom/fimi/soul/drone/d/a/a/bz;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/d/a/a/bz;->b()Lcom/fimi/soul/drone/d/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/g$a;->a(Lcom/fimi/soul/drone/d/a/c;)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/update/f$2;->a:Lcom/fimi/soul/biz/update/f;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/f;->b(Lcom/fimi/soul/biz/update/f;)I

    iget-object v0, p0, Lcom/fimi/soul/biz/update/f$2;->a:Lcom/fimi/soul/biz/update/f;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/f;->c(Lcom/fimi/soul/biz/update/f;)I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/update/f$2;->a:Lcom/fimi/soul/biz/update/f;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/f;->d(Lcom/fimi/soul/biz/update/f;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_1
    return-void
.end method
