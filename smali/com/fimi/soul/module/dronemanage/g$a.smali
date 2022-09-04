.class Lcom/fimi/soul/module/dronemanage/g$a;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/dronemanage/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/dronemanage/g;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/dronemanage/g;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/dronemanage/g$a;->a:Lcom/fimi/soul/module/dronemanage/g;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/g$a;->a:Lcom/fimi/soul/module/dronemanage/g;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/dronemanage/g;->a(Landroid/os/Message;)V

    return-void
.end method
