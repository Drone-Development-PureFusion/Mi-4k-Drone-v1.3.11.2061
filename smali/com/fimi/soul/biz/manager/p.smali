.class public Lcom/fimi/soul/biz/manager/p;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/biz/manager/p$a;,
        Lcom/fimi/soul/biz/manager/p$b;
    }
.end annotation


# static fields
.field public static a:I = 0x0

.field public static b:I = 0x0

.field public static final c:I = 0x1

.field public static final d:I = 0x2

.field public static final e:I = 0x3


# instance fields
.field public f:Lcom/tencent/tauth/IUiListener;

.field private g:Landroid/content/Context;

.field private h:Lcom/fimi/soul/entity/ShareInfo;

.field private i:Lcom/fimi/soul/biz/manager/p$b;

.field private final j:Ljava/lang/String;

.field private k:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput v0, Lcom/fimi/soul/biz/manager/p;->a:I

    const/4 v0, 0x1

    sput v0, Lcom/fimi/soul/biz/manager/p;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "tempImage.png"

    iput-object v0, p0, Lcom/fimi/soul/biz/manager/p;->j:Ljava/lang/String;

    new-instance v0, Lcom/fimi/soul/biz/manager/p$2;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/manager/p$2;-><init>(Lcom/fimi/soul/biz/manager/p;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/manager/p;->k:Landroid/os/Handler;

    new-instance v0, Lcom/fimi/soul/biz/manager/p$3;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/manager/p$3;-><init>(Lcom/fimi/soul/biz/manager/p;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/manager/p;->f:Lcom/tencent/tauth/IUiListener;

    iput-object p1, p0, Lcom/fimi/soul/biz/manager/p;->g:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/biz/manager/p;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p;->k:Landroid/os/Handler;

    return-object v0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "http://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/fimi/soul/biz/manager/p;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p;->g:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;ZLcom/fimi/soul/entity/ShareInfo;)V
    .locals 5

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p;->g:Landroid/content/Context;

    invoke-static {v0}, Lcn/sharesdk/framework/ShareSDK;->initSDK(Landroid/content/Context;)V

    new-instance v1, Lcom/fimi/soul/module/b/b;

    invoke-direct {v1}, Lcom/fimi/soul/module/b/b;-><init>()V

    if-nez p3, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/b/b;->a(Z)V

    if-eqz p2, :cond_0

    invoke-virtual {v1, p2}, Lcom/fimi/soul/module/b/b;->n(Ljava/lang/String;)V

    :cond_0
    sget-object v0, Lcom/fimi/soul/module/b/d;->a:Lcom/fimi/soul/module/b/d;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/b/b;->a(Lcom/fimi/soul/module/b/d;)V

    invoke-virtual {v1}, Lcom/fimi/soul/module/b/b;->e()V

    invoke-virtual {v1}, Lcom/fimi/soul/module/b/b;->d()V

    invoke-virtual {p4}, Lcom/fimi/soul/entity/ShareInfo;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/b/b;->b(Ljava/lang/String;)V

    invoke-virtual {p4}, Lcom/fimi/soul/entity/ShareInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/manager/p;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p4}, Lcom/fimi/soul/entity/ShareInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/b/b;->f(Ljava/lang/String;)V

    :goto_1
    new-instance v0, Lcom/fimi/soul/biz/manager/p$4;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/manager/p$4;-><init>(Lcom/fimi/soul/biz/manager/p;)V

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/b/b;->a(Lcn/sharesdk/framework/PlatformActionListener;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f020241

    invoke-static {v0, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v2, "Mi Drone"

    new-instance v3, Lcom/fimi/soul/biz/manager/p$5;

    invoke-direct {v3, p0}, Lcom/fimi/soul/biz/manager/p$5;-><init>(Lcom/fimi/soul/biz/manager/p;)V

    invoke-virtual {v1, v0, v2, v3}, Lcom/fimi/soul/module/b/b;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, p1}, Lcom/fimi/soul/module/b/b;->a(Landroid/content/Context;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    sget-object v0, Lcn/sharesdk/twitter/Twitter;->NAME:Ljava/lang/String;

    if-ne v0, p2, :cond_3

    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/fimi/soul/utils/m;->a()Ljava/lang/String;

    move-result-object v2

    const-string v3, "tempImage.png"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p4}, Lcom/fimi/soul/entity/ShareInfo;->getUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x1e0

    const/16 v4, 0x258

    invoke-static {v2, v3, v4}, Lcom/fimi/soul/utils/e;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/fimi/soul/utils/e;->a(Landroid/graphics/Bitmap;Ljava/io/File;)Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/fimi/soul/utils/m;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "tempImage.png"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/b/b;->e(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    goto :goto_1

    :cond_3
    invoke-virtual {p4}, Lcom/fimi/soul/entity/ShareInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/b/b;->e(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public a(Lcom/fimi/soul/biz/manager/p$b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/manager/p;->i:Lcom/fimi/soul/biz/manager/p$b;

    return-void
.end method

.method public a(Lcom/fimi/soul/entity/ShareInfo;)V
    .locals 2

    iput-object p1, p0, Lcom/fimi/soul/biz/manager/p;->h:Lcom/fimi/soul/entity/ShareInfo;

    new-instance v0, Lcom/fimi/soul/biz/manager/p$a;

    iget-object v1, p0, Lcom/fimi/soul/biz/manager/p;->g:Landroid/content/Context;

    invoke-direct {v0, p0, v1, p1}, Lcom/fimi/soul/biz/manager/p$a;-><init>(Lcom/fimi/soul/biz/manager/p;Landroid/content/Context;Lcom/fimi/soul/entity/ShareInfo;)V

    invoke-virtual {v0}, Lcom/fimi/soul/biz/manager/p$a;->show()V

    return-void
.end method

.method public a(Lcom/fimi/soul/entity/ShareInfo;Ljava/lang/String;)V
    .locals 3

    new-instance v0, Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-direct {v0}, Lcn/sharesdk/framework/Platform$ShareParams;-><init>()V

    invoke-virtual {p1}, Lcom/fimi/soul/entity/ShareInfo;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform$ShareParams;->setImagePath(Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform$ShareParams;->setShareType(I)V

    invoke-static {p2}, Lcn/sharesdk/framework/ShareSDK;->getPlatform(Ljava/lang/String;)Lcn/sharesdk/framework/Platform;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/biz/manager/p$1;

    invoke-direct {v2, p0}, Lcom/fimi/soul/biz/manager/p$1;-><init>(Lcom/fimi/soul/biz/manager/p;)V

    invoke-virtual {v1, v2}, Lcn/sharesdk/framework/Platform;->setPlatformActionListener(Lcn/sharesdk/framework/PlatformActionListener;)V

    invoke-virtual {v1, v0}, Lcn/sharesdk/framework/Platform;->share(Lcn/sharesdk/framework/Platform$ShareParams;)V

    return-void
.end method
