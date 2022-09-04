.class Lcom/fimi/soul/module/b/e$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/b/e;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/fimi/soul/module/b/e;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/b/e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/e$1;->b:Lcom/fimi/soul/module/b/e;

    iput-object p2, p0, Lcom/fimi/soul/module/b/e$1;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/b/e$1;->b:Lcom/fimi/soul/module/b/e;

    iget-object v0, v0, Lcom/fimi/soul/module/b/e;->i:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/b/e$1;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/b/e$1;->b:Lcom/fimi/soul/module/b/e;

    iget-object v1, v1, Lcom/fimi/soul/module/b/e;->i:Landroid/content/Context;

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_0
    return v2

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/b/e$1;->b:Lcom/fimi/soul/module/b/e;

    iget-object v0, v0, Lcom/fimi/soul/module/b/e;->i:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/b/e$1;->a:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
