.class Lcom/fimi/soul/module/dronemanage/h$1;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/dronemanage/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/dronemanage/h;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/dronemanage/h;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/dronemanage/h$1;->a:Lcom/fimi/soul/module/dronemanage/h;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    sget-object v0, Lcom/fimi/soul/module/dronemanage/h;->a:Lcom/fimi/soul/drone/h/f;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/fimi/soul/module/dronemanage/h;->a:Lcom/fimi/soul/drone/h/f;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/f;->e()V

    sget-object v0, Lcom/fimi/soul/module/dronemanage/h;->a:Lcom/fimi/soul/drone/h/f;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/f;->f()V

    goto :goto_0

    :pswitch_1
    sget-object v0, Lcom/fimi/soul/module/dronemanage/h;->a:Lcom/fimi/soul/drone/h/f;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/fimi/soul/module/dronemanage/h;->a:Lcom/fimi/soul/drone/h/f;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/f;->e()V

    sget-object v0, Lcom/fimi/soul/module/dronemanage/h;->a:Lcom/fimi/soul/drone/h/f;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/f;->f()V

    :cond_1
    sget-object v0, Lcom/fimi/soul/module/dronemanage/h;->g:Lcom/fimi/soul/module/dronemanage/h$a;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/fimi/soul/module/dronemanage/h;->g:Lcom/fimi/soul/module/dronemanage/h$a;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/fimi/soul/module/dronemanage/h$a;->a(I)V

    const/4 v0, 0x0

    sput-object v0, Lcom/fimi/soul/module/dronemanage/h;->g:Lcom/fimi/soul/module/dronemanage/h$a;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
