.class public Lcom/fimi/soul/module/TestActivity;
.super Landroid/app/Activity;


# instance fields
.field private a:Lcom/fimi/soul/view/EVview;

.field private b:I

.field private c:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/module/TestActivity;->b:I

    new-instance v0, Lcom/fimi/soul/module/TestActivity$2;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/TestActivity$2;-><init>(Lcom/fimi/soul/module/TestActivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/TestActivity;->c:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/TestActivity;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/TestActivity;->b:I

    return p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/TestActivity;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/TestActivity;->c:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/TestActivity;)I
    .locals 2

    iget v0, p0, Lcom/fimi/soul/module/TestActivity;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/fimi/soul/module/TestActivity;->b:I

    return v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/TestActivity;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/TestActivity;->b:I

    return v0
.end method

.method static synthetic d(Lcom/fimi/soul/module/TestActivity;)Lcom/fimi/soul/view/EVview;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/TestActivity;->a:Lcom/fimi/soul/view/EVview;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f040079

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/TestActivity;->setContentView(I)V

    const v0, 0x7f1002f0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/TestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/EVview;

    iput-object v0, p0, Lcom/fimi/soul/module/TestActivity;->a:Lcom/fimi/soul/view/EVview;

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v1, Lcom/fimi/soul/module/TestActivity$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/TestActivity$1;-><init>(Lcom/fimi/soul/module/TestActivity;)V

    const-wide/16 v2, 0x1f4

    const-wide/16 v4, 0x3e8

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method
