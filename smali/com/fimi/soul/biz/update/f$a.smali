.class Lcom/fimi/soul/biz/update/f$a;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/biz/update/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/update/f;

.field private b:Lcom/fimi/soul/drone/d/a/c;

.field private c:Lcom/fimi/soul/drone/a;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/biz/update/f;Lcom/fimi/soul/drone/d/a/c;Lcom/fimi/soul/drone/a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/update/f$a;->a:Lcom/fimi/soul/biz/update/f;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    iput-object p2, p0, Lcom/fimi/soul/biz/update/f$a;->b:Lcom/fimi/soul/drone/d/a/c;

    iput-object p3, p0, Lcom/fimi/soul/biz/update/f$a;->c:Lcom/fimi/soul/drone/a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    const-wide/16 v2, 0x0

    invoke-static {}, Lcom/fimi/soul/biz/update/f;->p()I

    iget-object v0, p0, Lcom/fimi/soul/biz/update/f$a;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ab()Lcom/fimi/soul/drone/droneconnection/connection/g$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/update/f$a;->b:Lcom/fimi/soul/drone/d/a/c;

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/g$a;->a(Lcom/fimi/soul/drone/d/a/c;)V

    invoke-static {}, Lcom/fimi/soul/biz/update/f;->q()I

    move-result v0

    const/16 v1, 0x14

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/update/f$a;->a:Lcom/fimi/soul/biz/update/f;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/f;->e(Lcom/fimi/soul/biz/update/f;)Ljava/util/Timer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/update/f$a;->a:Lcom/fimi/soul/biz/update/f;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/f;->e(Lcom/fimi/soul/biz/update/f;)Ljava/util/Timer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_0
    sget-object v0, Lcom/fimi/soul/biz/update/f;->f:Lcom/fimi/soul/biz/update/i;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/fimi/soul/biz/update/f;->f:Lcom/fimi/soul/biz/update/i;

    const/4 v1, 0x0

    const/4 v6, -0x1

    move-wide v4, v2

    invoke-interface/range {v0 .. v6}, Lcom/fimi/soul/biz/update/i;->a(ZJJI)V

    :cond_1
    return-void
.end method
