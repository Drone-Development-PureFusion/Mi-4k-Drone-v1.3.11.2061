.class Lcom/fimi/soul/module/thirdpartlogin/c$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/m/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/thirdpartlogin/c;->a(Lcn/sharesdk/framework/PlatformDb;Lcom/fimi/soul/module/thirdpartlogin/c$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/thirdpartlogin/c$a;

.field final synthetic b:Lcom/fimi/soul/module/thirdpartlogin/c;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/thirdpartlogin/c;Lcom/fimi/soul/module/thirdpartlogin/c$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/thirdpartlogin/c$2;->b:Lcom/fimi/soul/module/thirdpartlogin/c;

    iput-object p2, p0, Lcom/fimi/soul/module/thirdpartlogin/c$2;->a:Lcom/fimi/soul/module/thirdpartlogin/c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/entity/PlaneMsg;Ljava/io/File;)V
    .locals 4

    const/4 v3, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c$2;->b:Lcom/fimi/soul/module/thirdpartlogin/c;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/PlaneMsg;->getErrorMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/thirdpartlogin/c;->a(Lcom/fimi/soul/module/thirdpartlogin/c;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/PlaneMsg;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c$2;->b:Lcom/fimi/soul/module/thirdpartlogin/c;

    iget-object v0, v0, Lcom/fimi/soul/module/thirdpartlogin/c;->b:Landroid/content/Context;

    const-string v1, "2882303761517518920"

    const-string v2, "5761751863920"

    invoke-static {v0, v1, v2}, Lcom/xiaomi/mipush/sdk/MiPushClient;->registerPush(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c$2;->a:Lcom/fimi/soul/module/thirdpartlogin/c$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c$2;->a:Lcom/fimi/soul/module/thirdpartlogin/c$a;

    const/4 v1, 0x0

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Lcom/fimi/soul/module/thirdpartlogin/c$a;->a(ILjava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c$2;->b:Lcom/fimi/soul/module/thirdpartlogin/c;

    invoke-static {v0}, Lcom/fimi/soul/module/thirdpartlogin/c;->a(Lcom/fimi/soul/module/thirdpartlogin/c;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c$2;->a:Lcom/fimi/soul/module/thirdpartlogin/c$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c$2;->a:Lcom/fimi/soul/module/thirdpartlogin/c$a;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/c$2;->b:Lcom/fimi/soul/module/thirdpartlogin/c;

    invoke-static {v1}, Lcom/fimi/soul/module/thirdpartlogin/c;->a(Lcom/fimi/soul/module/thirdpartlogin/c;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Lcom/fimi/soul/module/thirdpartlogin/c$a;->a(ILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c$2;->a:Lcom/fimi/soul/module/thirdpartlogin/c$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c$2;->a:Lcom/fimi/soul/module/thirdpartlogin/c$a;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/c$2;->b:Lcom/fimi/soul/module/thirdpartlogin/c;

    iget-object v1, v1, Lcom/fimi/soul/module/thirdpartlogin/c;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0b02fc

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Lcom/fimi/soul/module/thirdpartlogin/c$a;->a(ILjava/lang/Object;)V

    goto :goto_0
.end method
