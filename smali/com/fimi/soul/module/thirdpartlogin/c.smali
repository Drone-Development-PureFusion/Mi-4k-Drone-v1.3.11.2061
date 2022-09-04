.class public Lcom/fimi/soul/module/thirdpartlogin/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/thirdpartlogin/c$a;
    }
.end annotation


# static fields
.field public static a:Lcom/fimi/soul/module/thirdpartlogin/c; = null

.field public static final c:Ljava/lang/String; = "LoginManager"


# instance fields
.field public b:Landroid/content/Context;

.field public d:Ljava/lang/String;

.field private e:Lcom/fimi/soul/entity/User;

.field private f:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/fimi/soul/entity/User;

    invoke-direct {v0}, Lcom/fimi/soul/entity/User;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->e:Lcom/fimi/soul/entity/User;

    return-void
.end method

.method public static a()Lcom/fimi/soul/module/thirdpartlogin/c;
    .locals 1

    sget-object v0, Lcom/fimi/soul/module/thirdpartlogin/c;->a:Lcom/fimi/soul/module/thirdpartlogin/c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/module/thirdpartlogin/c;

    invoke-direct {v0}, Lcom/fimi/soul/module/thirdpartlogin/c;-><init>()V

    sput-object v0, Lcom/fimi/soul/module/thirdpartlogin/c;->a:Lcom/fimi/soul/module/thirdpartlogin/c;

    :cond_0
    sget-object v0, Lcom/fimi/soul/module/thirdpartlogin/c;->a:Lcom/fimi/soul/module/thirdpartlogin/c;

    return-object v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/thirdpartlogin/c;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/thirdpartlogin/c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->f:Ljava/lang/String;

    return-object p1
.end method

.method private a(Lcn/sharesdk/framework/PlatformDb;Lcom/fimi/soul/module/thirdpartlogin/c$a;)V
    .locals 6

    const-string v0, "LoginManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "thirPlaformLogin("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lcn/sharesdk/framework/PlatformDb;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcn/sharesdk/framework/PlatformDb;->getUserIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcn/sharesdk/framework/PlatformDb;->getPlatformNname()Ljava/lang/String;

    move-result-object v2

    const-string v3, "LoginManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "platformName:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v3, "LoginManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "userIcon:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v3, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->e:Lcom/fimi/soul/entity/User;

    invoke-virtual {v3, v0}, Lcom/fimi/soul/entity/User;->setXiaomiID(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->e:Lcom/fimi/soul/entity/User;

    const-string v3, "0"

    invoke-virtual {v0, v3}, Lcom/fimi/soul/entity/User;->setappType(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->e:Lcom/fimi/soul/entity/User;

    invoke-virtual {p1}, Lcn/sharesdk/framework/PlatformDb;->getUserName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/fimi/soul/entity/User;->setName(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->e:Lcom/fimi/soul/entity/User;

    invoke-virtual {p1}, Lcn/sharesdk/framework/PlatformDb;->getUserName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/fimi/soul/entity/User;->setNickName(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->e:Lcom/fimi/soul/entity/User;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/User;->setUserImgUrl(Ljava/lang/String;)V

    sget-object v0, Lcn/sharesdk/facebook/Facebook;->NAME:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "1"

    iput-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->d:Ljava/lang/String;

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->e:Lcom/fimi/soul/entity/User;

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/User;->setloginChannel(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/y;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/y;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->e:Lcom/fimi/soul/entity/User;

    new-instance v2, Lcom/fimi/soul/module/thirdpartlogin/c$2;

    invoke-direct {v2, p0, p2}, Lcom/fimi/soul/module/thirdpartlogin/c$2;-><init>(Lcom/fimi/soul/module/thirdpartlogin/c;Lcom/fimi/soul/module/thirdpartlogin/c$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/biz/manager/y;->d(Lcom/fimi/soul/entity/User;Lcom/fimi/soul/biz/m/k;)V

    return-void

    :cond_1
    sget-object v0, Lcn/sharesdk/twitter/Twitter;->NAME:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "2"

    iput-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->d:Ljava/lang/String;

    goto :goto_0
.end method

.method static synthetic a(Lcom/fimi/soul/module/thirdpartlogin/c;Lcn/sharesdk/framework/PlatformDb;Lcom/fimi/soul/module/thirdpartlogin/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/fimi/soul/module/thirdpartlogin/c;->a(Lcn/sharesdk/framework/PlatformDb;Lcom/fimi/soul/module/thirdpartlogin/c$a;)V

    return-void
.end method

.method private b(Ljava/lang/String;Lcom/fimi/soul/module/thirdpartlogin/c$a;)V
    .locals 3

    const-string v0, "LoginManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "innerLogin("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/fimi/soul/module/thirdpartlogin/b;

    invoke-direct {v0}, Lcom/fimi/soul/module/thirdpartlogin/b;-><init>()V

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/thirdpartlogin/b;->a(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->d:Ljava/lang/String;

    new-instance v1, Lcom/fimi/soul/module/thirdpartlogin/c$1;

    invoke-direct {v1, p0, p2}, Lcom/fimi/soul/module/thirdpartlogin/c$1;-><init>(Lcom/fimi/soul/module/thirdpartlogin/c;Lcom/fimi/soul/module/thirdpartlogin/c$a;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/thirdpartlogin/b;->a(Lcom/fimi/soul/module/thirdpartlogin/d;)V

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/thirdpartlogin/b;->a(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->b:Landroid/content/Context;

    invoke-static {p1}, Lcn/sharesdk/framework/ShareSDK;->initSDK(Landroid/content/Context;)V

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/fimi/soul/module/thirdpartlogin/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/fimi/soul/module/thirdpartlogin/c;->b(Ljava/lang/String;Lcom/fimi/soul/module/thirdpartlogin/c$a;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/c;->d:Ljava/lang/String;

    invoke-static {v0}, Lcn/sharesdk/framework/ShareSDK;->getPlatform(Ljava/lang/String;)Lcn/sharesdk/framework/Platform;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform;->removeAccount(Z)V

    :cond_0
    return-void
.end method
