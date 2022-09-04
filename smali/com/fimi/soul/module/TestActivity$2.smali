.class Lcom/fimi/soul/module/TestActivity$2;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/TestActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/TestActivity;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/TestActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/TestActivity$2;->a:Lcom/fimi/soul/module/TestActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget-object v0, p0, Lcom/fimi/soul/module/TestActivity$2;->a:Lcom/fimi/soul/module/TestActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/TestActivity;->d(Lcom/fimi/soul/module/TestActivity;)Lcom/fimi/soul/view/EVview;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/TestActivity$2;->a:Lcom/fimi/soul/module/TestActivity;

    invoke-static {v1}, Lcom/fimi/soul/module/TestActivity;->c(Lcom/fimi/soul/module/TestActivity;)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/EVview;->a(F)V

    return-void
.end method
