.class Lcom/fimi/soul/biz/update/b$7;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/update/b;->a(Ljava/lang/Object;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/entity/AppVersion;

.field final synthetic b:Lcom/fimi/soul/biz/update/b;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/update/b;Lcom/fimi/soul/entity/AppVersion;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/update/b$7;->b:Lcom/fimi/soul/biz/update/b;

    iput-object p2, p0, Lcom/fimi/soul/biz/update/b$7;->a:Lcom/fimi/soul/entity/AppVersion;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b$7;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/update/b$7;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v1}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0b01b1

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {}, Lcom/fimi/soul/utils/au;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/biz/update/b$7;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v1}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/fimi/soul/service/UpdateApkService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "down_url"

    iget-object v2, p0, Lcom/fimi/soul/biz/update/b$7;->a:Lcom/fimi/soul/entity/AppVersion;

    invoke-virtual {v2}, Lcom/fimi/soul/entity/AppVersion;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x20000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/biz/update/b$7;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v1}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/update/b$7;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0b04a9

    const/16 v2, 0x7d0

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0
.end method
