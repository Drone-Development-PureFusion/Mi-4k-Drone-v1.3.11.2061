.class Lcom/fimi/soul/utils/aq$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/utils/aq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/utils/aq;


# direct methods
.method constructor <init>(Lcom/fimi/soul/utils/aq;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/utils/aq$1;->a:Lcom/fimi/soul/utils/aq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/utils/aq$1;->a:Lcom/fimi/soul/utils/aq;

    invoke-static {v0}, Lcom/fimi/soul/utils/aq;->a(Lcom/fimi/soul/utils/aq;)I

    iget-object v0, p0, Lcom/fimi/soul/utils/aq$1;->a:Lcom/fimi/soul/utils/aq;

    invoke-static {v0}, Lcom/fimi/soul/utils/aq;->b(Lcom/fimi/soul/utils/aq;)I

    move-result v0

    if-gez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/utils/aq$1;->a:Lcom/fimi/soul/utils/aq;

    invoke-static {v0}, Lcom/fimi/soul/utils/aq;->c(Lcom/fimi/soul/utils/aq;)Lcom/fimi/soul/utils/aq$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/utils/aq$1;->a:Lcom/fimi/soul/utils/aq;

    invoke-static {v0}, Lcom/fimi/soul/utils/aq;->c(Lcom/fimi/soul/utils/aq;)Lcom/fimi/soul/utils/aq$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/utils/aq$a;->a()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/utils/aq$1;->a:Lcom/fimi/soul/utils/aq;

    invoke-static {v0}, Lcom/fimi/soul/utils/aq;->d(Lcom/fimi/soul/utils/aq;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
