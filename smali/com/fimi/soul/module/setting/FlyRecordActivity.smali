.class public Lcom/fimi/soul/module/setting/FlyRecordActivity;
.super Lcom/fimi/soul/base/BaseActivity;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/setting/FlyRecordActivity$a;
    }
.end annotation


# instance fields
.field a:Landroid/widget/TextView;

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/TextView;

.field d:Landroid/widget/TextView;

.field e:Landroid/widget/TextView;

.field f:Landroid/widget/TextView;

.field g:Landroid/widget/TextView;

.field h:Landroid/widget/ImageView;

.field i:Lcom/fimi/soul/base/DroidPlannerApp;

.field j:Lcom/fimi/soul/drone/a;

.field k:Landroid/widget/ImageView;

.field l:Lcom/fimi/soul/utils/FlyLogTools;

.field private m:Z

.field private final n:I

.field private o:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/base/BaseActivity;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->m:Z

    const/16 v0, 0x10

    iput v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->n:I

    new-instance v0, Lcom/fimi/soul/module/setting/FlyRecordActivity$2;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/setting/FlyRecordActivity$2;-><init>(Lcom/fimi/soul/module/setting/FlyRecordActivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->o:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/setting/FlyRecordActivity;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->o:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method a(IJJ)V
    .locals 8

    const/4 v6, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->c:Landroid/widget/TextView;

    const-string v1, "%d"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_0

    const-wide/16 v0, 0x3c

    div-long/2addr p2, v0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->b:Landroid/widget/TextView;

    const-string v1, "%d"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    long-to-double v0, p4

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    iget-boolean v2, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->m:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->a:Landroid/widget/TextView;

    const-string v3, "%s"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->a(D)D

    move-result-wide v0

    invoke-static {v0, v1, v6}, Lcom/fimi/kernel/utils/t;->b(DI)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void

    :cond_1
    iget-object v2, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->a:Landroid/widget/TextView;

    const-string v3, "%s"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v6}, Lcom/fimi/kernel/utils/t;->b(DI)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->finish()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x7f1001b2
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f04007f

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->setContentView(I)V

    const v0, 0x7f10031a

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->d:Landroid/widget/TextView;

    const v0, 0x7f100329

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->a:Landroid/widget/TextView;

    const v0, 0x7f10032c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->b:Landroid/widget/TextView;

    const v0, 0x7f100330

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->c:Landroid/widget/TextView;

    const v0, 0x7f100328

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->e:Landroid/widget/TextView;

    const v0, 0x7f10032b

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->f:Landroid/widget/TextView;

    const v0, 0x7f10032f

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->g:Landroid/widget/TextView;

    const v0, 0x7f1001b2

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->k:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f100327

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->h:Landroid/widget/ImageView;

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->p()Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->m:Z

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->m:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->e:Landroid/widget/TextView;

    const v1, 0x7f0b0223

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->h:Landroid/widget/ImageView;

    const v1, 0x7f0201eb

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v1, v6, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->a:Landroid/widget/TextView;

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->b:Landroid/widget/TextView;

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->c:Landroid/widget/TextView;

    aput-object v2, v1, v5

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/au;->b(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->e:Landroid/widget/TextView;

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->f:Landroid/widget/TextView;

    aput-object v2, v1, v4

    iget-object v2, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->g:Landroid/widget/TextView;

    aput-object v2, v1, v5

    iget-object v2, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->d:Landroid/widget/TextView;

    aput-object v2, v1, v6

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/au;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->e:Landroid/widget/TextView;

    const v1, 0x7f0b0220

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->h:Landroid/widget/ImageView;

    const v1, 0x7f0202cd

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0
.end method

.method protected onResume()V
    .locals 2

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onResume()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/FlyRecordActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/base/DroidPlannerApp;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->i:Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->i:Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, v0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->j:Lcom/fimi/soul/drone/a;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->l:Lcom/fimi/soul/utils/FlyLogTools;

    new-instance v1, Lcom/fimi/soul/module/setting/FlyRecordActivity$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/setting/FlyRecordActivity$1;-><init>(Lcom/fimi/soul/module/setting/FlyRecordActivity;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/utils/FlyLogTools;->a(Lcom/fimi/soul/utils/FlyLogTools$a;)V

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onStart()V

    invoke-static {p0}, Lcom/fimi/soul/utils/FlyLogTools;->a(Landroid/content/Context;)Lcom/fimi/soul/utils/FlyLogTools;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/FlyRecordActivity;->l:Lcom/fimi/soul/utils/FlyLogTools;

    return-void
.end method
