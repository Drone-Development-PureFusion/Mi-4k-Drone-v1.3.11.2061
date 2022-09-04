.class Lcom/fimi/soul/biz/j/o$1;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/biz/j/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/j/o;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/j/o;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v0, p1, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    invoke-static {v1}, Lcom/fimi/soul/biz/j/o;->a(Lcom/fimi/soul/biz/j/o;)I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/o;->b(Lcom/fimi/soul/biz/j/o;)Lcom/google/android/gms/maps/model/g;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/o;->c(Lcom/fimi/soul/biz/j/o;)Z

    move-result v0

    if-ne v0, v4, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/o;->d(Lcom/fimi/soul/biz/j/o;)Lcom/fimi/soul/drone/a;

    move-result-object v0

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f020307

    iget-object v2, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    invoke-static {v2}, Lcom/fimi/soul/biz/j/o;->e(Lcom/fimi/soul/biz/j/o;)Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v0, v1, v2, v3}, Lcom/fimi/soul/biz/j/j;->a(Landroid/content/Context;IFZ)Lcom/google/android/gms/maps/model/a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    invoke-static {v1}, Lcom/fimi/soul/biz/j/o;->b(Lcom/fimi/soul/biz/j/o;)Lcom/google/android/gms/maps/model/g;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    invoke-static {v0, v3}, Lcom/fimi/soul/biz/j/o;->a(Lcom/fimi/soul/biz/j/o;Z)Z

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    iget-object v0, v0, Lcom/fimi/soul/biz/j/o;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    invoke-static {v1}, Lcom/fimi/soul/biz/j/o;->a(Lcom/fimi/soul/biz/j/o;)I

    move-result v1

    iget-object v2, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    invoke-static {v2}, Lcom/fimi/soul/biz/j/o;->f(Lcom/fimi/soul/biz/j/o;)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/o;->d(Lcom/fimi/soul/biz/j/o;)Lcom/fimi/soul/drone/a;

    move-result-object v0

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f020308

    iget-object v2, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    invoke-static {v2}, Lcom/fimi/soul/biz/j/o;->e(Lcom/fimi/soul/biz/j/o;)Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v0, v1, v2, v3}, Lcom/fimi/soul/biz/j/j;->a(Landroid/content/Context;IFZ)Lcom/google/android/gms/maps/model/a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    invoke-static {v1}, Lcom/fimi/soul/biz/j/o;->b(Lcom/fimi/soul/biz/j/o;)Lcom/google/android/gms/maps/model/g;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/o$1;->a:Lcom/fimi/soul/biz/j/o;

    invoke-static {v0, v4}, Lcom/fimi/soul/biz/j/o;->a(Lcom/fimi/soul/biz/j/o;Z)Z

    goto :goto_0
.end method
