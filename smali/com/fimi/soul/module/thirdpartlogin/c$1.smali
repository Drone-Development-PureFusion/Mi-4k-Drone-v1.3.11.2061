.class Lcom/fimi/soul/module/thirdpartlogin/c$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/module/thirdpartlogin/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/thirdpartlogin/c;->b(Ljava/lang/String;Lcom/fimi/soul/module/thirdpartlogin/c$a;)V
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

    iput-object p1, p0, Lcom/fimi/soul/module/thirdpartlogin/c$1;->b:Lcom/fimi/soul/module/thirdpartlogin/c;

    iput-object p2, p0, Lcom/fimi/soul/module/thirdpartlogin/c$1;->a:Lcom/fimi/soul/module/thirdpartlogin/c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/module/thirdpartlogin/f;)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/util/HashMap;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c$1;->a:Lcom/fimi/soul/module/thirdpartlogin/c$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c$1;->a:Lcom/fimi/soul/module/thirdpartlogin/c$a;

    const/4 v1, -0x1

    const-string v2, "msg"

    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/fimi/soul/module/thirdpartlogin/c$a;->a(ILjava/lang/Object;)V

    :cond_0
    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-static {p1}, Lcn/sharesdk/framework/ShareSDK;->getPlatform(Ljava/lang/String;)Lcn/sharesdk/framework/Platform;

    move-result-object v0

    invoke-virtual {v0}, Lcn/sharesdk/framework/Platform;->getDb()Lcn/sharesdk/framework/PlatformDb;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/c$1;->b:Lcom/fimi/soul/module/thirdpartlogin/c;

    iget-object v2, p0, Lcom/fimi/soul/module/thirdpartlogin/c$1;->a:Lcom/fimi/soul/module/thirdpartlogin/c$a;

    invoke-static {v1, v0, v2}, Lcom/fimi/soul/module/thirdpartlogin/c;->a(Lcom/fimi/soul/module/thirdpartlogin/c;Lcn/sharesdk/framework/PlatformDb;Lcom/fimi/soul/module/thirdpartlogin/c$a;)V

    goto :goto_0
.end method
