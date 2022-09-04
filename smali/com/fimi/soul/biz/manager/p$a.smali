.class Lcom/fimi/soul/biz/manager/p$a;
.super Landroid/app/AlertDialog;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/biz/manager/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Landroid/widget/ImageView;

.field b:Landroid/widget/ImageView;

.field c:Landroid/widget/ImageView;

.field d:Landroid/widget/Button;

.field final synthetic e:Lcom/fimi/soul/biz/manager/p;

.field private f:Landroid/content/Context;

.field private g:Lcom/fimi/soul/entity/ShareInfo;

.field private h:Z

.field private i:Z


# direct methods
.method public constructor <init>(Lcom/fimi/soul/biz/manager/p;Landroid/content/Context;Lcom/fimi/soul/entity/ShareInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/manager/p$a;->e:Lcom/fimi/soul/biz/manager/p;

    invoke-direct {p0, p2}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/fimi/soul/biz/manager/p$a;->f:Landroid/content/Context;

    iput-object p3, p0, Lcom/fimi/soul/biz/manager/p$a;->g:Lcom/fimi/soul/entity/ShareInfo;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/biz/manager/p$a;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p$a;->f:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/biz/manager/p$a;)Lcom/fimi/soul/entity/ShareInfo;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p$a;->g:Lcom/fimi/soul/entity/ShareInfo;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/AlertDialog;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f04006e

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/manager/p$a;->setContentView(I)V

    const v0, 0x7f10027f

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/manager/p$a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/biz/manager/p$a$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/biz/manager/p$a$1;-><init>(Lcom/fimi/soul/biz/manager/p$a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f100281

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/manager/p$a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/biz/manager/p$a$2;

    invoke-direct {v1, p0}, Lcom/fimi/soul/biz/manager/p$a$2;-><init>(Lcom/fimi/soul/biz/manager/p$a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f10027e

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/manager/p$a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v0, 0x7f100283

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/manager/p$a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/biz/manager/p$a;->a:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p$a;->a:Landroid/widget/ImageView;

    new-instance v1, Lcom/fimi/soul/biz/manager/p$a$3;

    invoke-direct {v1, p0}, Lcom/fimi/soul/biz/manager/p$a$3;-><init>(Lcom/fimi/soul/biz/manager/p$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f100285

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/manager/p$a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/biz/manager/p$a;->b:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p$a;->b:Landroid/widget/ImageView;

    new-instance v1, Lcom/fimi/soul/biz/manager/p$a$4;

    invoke-direct {v1, p0}, Lcom/fimi/soul/biz/manager/p$a$4;-><init>(Lcom/fimi/soul/biz/manager/p$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f100287

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/manager/p$a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/biz/manager/p$a;->d:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p$a;->d:Landroid/widget/Button;

    new-instance v1, Lcom/fimi/soul/biz/manager/p$a$5;

    invoke-direct {v1, p0}, Lcom/fimi/soul/biz/manager/p$a$5;-><init>(Lcom/fimi/soul/biz/manager/p$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/fimi/soul/biz/manager/p$a;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {}, Lcom/fimi/kernel/c;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/fimi/soul/utils/au;->a(Landroid/content/res/AssetManager;Landroid/view/ViewGroup;)V

    return-void
.end method

.method protected onStart()V
    .locals 4

    const/high16 v3, 0x3f800000    # 1.0f

    const v2, 0x3e99999a    # 0.3f

    invoke-super {p0}, Landroid/app/AlertDialog;->onStart()V

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p$a;->f:Landroid/content/Context;

    const-string v1, "com.tencent.mm"

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/au;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/biz/manager/p$a;->h:Z

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p$a;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p$a;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setAlpha(F)V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/biz/manager/p$a;->h:Z

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p$a;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/p$a;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setAlpha(F)V

    goto :goto_0
.end method
