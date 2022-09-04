.class Lcom/fimi/soul/biz/update/b$4;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/update/b;->a(Lcom/xiaomi/market/sdk/UpdateResponse;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/xiaomi/market/sdk/UpdateResponse;

.field final synthetic b:Lcom/fimi/soul/biz/update/b;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/update/b;Lcom/xiaomi/market/sdk/UpdateResponse;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/update/b$4;->b:Lcom/fimi/soul/biz/update/b;

    iput-object p2, p0, Lcom/fimi/soul/biz/update/b$4;->a:Lcom/xiaomi/market/sdk/UpdateResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b$4;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/update/b$4;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v1}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0b01b1

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/fimi/soul/utils/m;->i()Ljava/lang/String;

    move-result-object v1

    const-string v2, "temp_update.apk"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b$4;->a:Lcom/xiaomi/market/sdk/UpdateResponse;

    iget v0, v0, Lcom/xiaomi/market/sdk/UpdateResponse;->versionCode:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/update/b$4;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v1}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/fimi/soul/utils/m;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "temp_update.apk"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/fimi/soul/utils/au;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    new-instance v1, Ljava/io/File;

    invoke-static {}, Lcom/fimi/soul/utils/m;->i()Ljava/lang/String;

    move-result-object v2

    const-string v3, "temp_update.apk"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "application/vnd.android.package-archive"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/biz/update/b$4;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v1}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lcom/fimi/soul/utils/au;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/biz/update/b$4;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v1}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/fimi/soul/service/UpdateApkService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "down_url"

    iget-object v2, p0, Lcom/fimi/soul/biz/update/b$4;->a:Lcom/xiaomi/market/sdk/UpdateResponse;

    iget-object v2, v2, Lcom/xiaomi/market/sdk/UpdateResponse;->path:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x20000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/biz/update/b$4;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v1}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/biz/update/b$4;->b:Lcom/fimi/soul/biz/update/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/update/b;->b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0b04a9

    const/16 v2, 0x7d0

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0
.end method
