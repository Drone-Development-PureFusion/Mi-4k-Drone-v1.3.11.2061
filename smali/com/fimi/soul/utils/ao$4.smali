.class Lcom/fimi/soul/utils/ao$4;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/utils/ao;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field a:Ljava/lang/Exception;

.field final synthetic b:Lcom/xiaomi/account/openauth/XiaomiOAuthFuture;

.field final synthetic c:Lcom/fimi/soul/utils/ao;


# direct methods
.method constructor <init>(Lcom/fimi/soul/utils/ao;Lcom/xiaomi/account/openauth/XiaomiOAuthFuture;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    iput-object p2, p0, Lcom/fimi/soul/utils/ao$4;->b:Lcom/xiaomi/account/openauth/XiaomiOAuthFuture;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/String;
    .locals 2

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/fimi/soul/utils/ao$4;->b:Lcom/xiaomi/account/openauth/XiaomiOAuthFuture;

    invoke-interface {v0}, Lcom/xiaomi/account/openauth/XiaomiOAuthFuture;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/accounts/OperationCanceledException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/xiaomi/account/openauth/XMAuthericationException; {:try_start_0 .. :try_end_0} :catch_2

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    iput-object v0, p0, Lcom/fimi/soul/utils/ao$4;->a:Ljava/lang/Exception;

    move-object v0, v1

    goto :goto_0

    :catch_1
    move-exception v0

    iput-object v0, p0, Lcom/fimi/soul/utils/ao$4;->a:Ljava/lang/Exception;

    move-object v0, v1

    goto :goto_0

    :catch_2
    move-exception v0

    iput-object v0, p0, Lcom/fimi/soul/utils/ao$4;->a:Ljava/lang/Exception;

    move-object v0, v1

    goto :goto_0
.end method

.method protected a(Ljava/lang/String;)V
    .locals 4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->c(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/utils/ap$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->c(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/utils/ap$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v1}, Lcom/fimi/soul/utils/ao;->d(Lcom/fimi/soul/utils/ao;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0b02fb

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/utils/ap$a;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "data"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v1}, Lcom/fimi/soul/utils/ao;->e(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/entity/User;

    move-result-object v1

    const-string v2, "userId"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/User;->setXiaomiID(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v1}, Lcom/fimi/soul/utils/ao;->e(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/entity/User;

    move-result-object v1

    const-string v2, "miliaoNick"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/User;->setName(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v1}, Lcom/fimi/soul/utils/ao;->e(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/entity/User;

    move-result-object v1

    const-string v2, "miliaoNick"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/User;->setNickName(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v1}, Lcom/fimi/soul/utils/ao;->e(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/entity/User;

    move-result-object v1

    invoke-static {}, Lcom/fimi/kernel/c;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/fimi/soul/utils/au;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/User;->setDevice(Ljava/lang/String;)V

    const-string v1, "sex"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "sex"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v2}, Lcom/fimi/soul/utils/ao;->d(Lcom/fimi/soul/utils/ao;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0b0308

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v1}, Lcom/fimi/soul/utils/ao;->e(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/entity/User;

    move-result-object v1

    const-string v2, "1"

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/User;->setSex(Ljava/lang/String;)V

    :cond_2
    :goto_1
    const-string v1, "miliaoIcon_orig"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v1}, Lcom/fimi/soul/utils/ao;->e(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/entity/User;

    move-result-object v1

    const-string v2, "miliaoIcon_orig"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/entity/User;->setUserImgUrl(Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->g(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/biz/manager/y;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v1}, Lcom/fimi/soul/utils/ao;->e(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/entity/User;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/utils/ao$4$1;

    invoke-direct {v2, p0}, Lcom/fimi/soul/utils/ao$4$1;-><init>(Lcom/fimi/soul/utils/ao$4;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/biz/manager/y;->d(Lcom/fimi/soul/entity/User;Lcom/fimi/soul/biz/m/k;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto/16 :goto_0

    :cond_4
    :try_start_1
    const-string v1, "sex"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v2}, Lcom/fimi/soul/utils/ao;->d(Lcom/fimi/soul/utils/ao;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0b0520

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/utils/ao$4;->c:Lcom/fimi/soul/utils/ao;

    invoke-static {v1}, Lcom/fimi/soul/utils/ao;->e(Lcom/fimi/soul/utils/ao;)Lcom/fimi/soul/entity/User;

    move-result-object v1

    const-string v2, "0"

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/User;->setSex(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/fimi/soul/utils/ao$4;->a([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/fimi/soul/utils/ao$4;->a(Ljava/lang/String;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    const-string v0, "waiting for Future result..."

    const-class v1, Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0, v1}, Lcom/fimi/soul/base/a;->a(Ljava/lang/String;Ljava/lang/Class;)V

    return-void
.end method
