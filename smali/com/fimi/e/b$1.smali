.class Lcom/fimi/e/b$1;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/e/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/e/b;


# direct methods
.method constructor <init>(Lcom/fimi/e/b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/e/b$1;->a:Lcom/fimi/e/b;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/e/b$1;->a:Lcom/fimi/e/b;

    invoke-static {v0}, Lcom/fimi/e/b;->a(Lcom/fimi/e/b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/c/b;

    iget v3, p1, Landroid/os/Message;->what:I

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/fimi/a/e/c;

    invoke-interface {v0, v3, v1}, Lcom/fimi/c/b;->a(ILcom/fimi/a/e/c;)V

    goto :goto_0

    :cond_0
    return-void
.end method
