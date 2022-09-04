.class Lcom/fimi/soul/module/TestActivity$1;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/TestActivity;->onCreate(Landroid/os/Bundle;)V
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

    iput-object p1, p0, Lcom/fimi/soul/module/TestActivity$1;->a:Lcom/fimi/soul/module/TestActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/TestActivity$1;->a:Lcom/fimi/soul/module/TestActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/TestActivity;->a(Lcom/fimi/soul/module/TestActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iget-object v0, p0, Lcom/fimi/soul/module/TestActivity$1;->a:Lcom/fimi/soul/module/TestActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/TestActivity;->b(Lcom/fimi/soul/module/TestActivity;)I

    iget-object v0, p0, Lcom/fimi/soul/module/TestActivity$1;->a:Lcom/fimi/soul/module/TestActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/TestActivity;->c(Lcom/fimi/soul/module/TestActivity;)I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/TestActivity$1;->a:Lcom/fimi/soul/module/TestActivity;

    invoke-static {v0, v2}, Lcom/fimi/soul/module/TestActivity;->a(Lcom/fimi/soul/module/TestActivity;I)I

    :cond_0
    return-void
.end method
