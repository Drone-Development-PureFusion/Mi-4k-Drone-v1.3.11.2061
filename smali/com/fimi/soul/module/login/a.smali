.class public Lcom/fimi/soul/module/login/a;
.super Lcom/fimi/a/b;


# instance fields
.field public p:Landroid/os/Handler;

.field private final q:I

.field private r:Lcom/fimi/soul/drone/a;

.field private s:Lcom/fimi/soul/module/login/LoginActivity;

.field private t:Lcom/fimi/soul/biz/f/a;

.field private u:Lcom/fimi/soul/biz/b/d;

.field private v:Lcom/fimi/soul/biz/b/c;

.field private w:Lcom/fimi/soul/module/setting/GimalCalibration/a;

.field private final x:Landroid/os/Handler;

.field private y:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/module/login/LoginActivity;Lcom/fimi/soul/drone/a;)V
    .locals 2

    invoke-direct {p0}, Lcom/fimi/a/b;-><init>()V

    const v0, 0x88b8

    iput v0, p0, Lcom/fimi/soul/module/login/a;->q:I

    new-instance v0, Lcom/fimi/soul/module/login/a$2;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/a$2;-><init>(Lcom/fimi/soul/module/login/a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/login/a;->x:Landroid/os/Handler;

    new-instance v0, Lcom/fimi/soul/module/login/a$3;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/a$3;-><init>(Lcom/fimi/soul/module/login/a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/login/a;->p:Landroid/os/Handler;

    new-instance v0, Lcom/fimi/soul/module/login/a$4;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/a$4;-><init>(Lcom/fimi/soul/module/login/a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/login/a;->y:Ljava/lang/Runnable;

    iput-object p2, p0, Lcom/fimi/soul/module/login/a;->r:Lcom/fimi/soul/drone/a;

    iput-object p1, p0, Lcom/fimi/soul/module/login/a;->s:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {}, Lcom/fimi/soul/biz/b/d;->a()Lcom/fimi/soul/biz/b/d;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/login/a;->u:Lcom/fimi/soul/biz/b/d;

    invoke-static {}, Lcom/fimi/soul/biz/b/c;->a()Lcom/fimi/soul/biz/b/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/login/a;->v:Lcom/fimi/soul/biz/b/c;

    new-instance v0, Lcom/fimi/soul/module/setting/GimalCalibration/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2}, Lcom/fimi/soul/module/setting/GimalCalibration/a;-><init>(Lcom/fimi/soul/module/setting/GimalCalibration/a$a;Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/login/a;->w:Lcom/fimi/soul/module/setting/GimalCalibration/a;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->s:Lcom/fimi/soul/module/login/LoginActivity;

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/login/a;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/login/a;->n:I

    return v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/drone/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->r:Lcom/fimi/soul/drone/a;

    return-object v0
.end method

.method static synthetic d(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/setting/GimalCalibration/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->w:Lcom/fimi/soul/module/setting/GimalCalibration/a;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/biz/f/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->t:Lcom/fimi/soul/biz/f/a;

    return-object v0
.end method

.method static synthetic f(Lcom/fimi/soul/module/login/a;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/login/a;->n:I

    return v0
.end method

.method static synthetic g(Lcom/fimi/soul/module/login/a;)Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->y:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic h(Lcom/fimi/soul/module/login/a;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/login/a;->n:I

    return v0
.end method

.method static synthetic i(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/biz/b/c;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->v:Lcom/fimi/soul/biz/b/c;

    return-object v0
.end method

.method private j()V
    .locals 1

    sget-object v0, Lcom/fimi/soul/drone/h/c;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/a/a;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->r:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ab()Lcom/fimi/soul/drone/droneconnection/connection/g$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/g$a;->b()V

    return-void
.end method

.method static synthetic j(Lcom/fimi/soul/module/login/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/login/a;->j()V

    return-void
.end method

.method static synthetic k(Lcom/fimi/soul/module/login/a;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->x:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/fimi/soul/biz/f/a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/login/a;->t:Lcom/fimi/soul/biz/f/a;

    return-void
.end method

.method public c()I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v0, 0x88b8

    return v0
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->u:Lcom/fimi/soul/biz/b/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/b/d;->o()Lcom/fimi/kernel/b/d/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/b/d/c;->f()Lcom/fimi/kernel/b/d/d;

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/camera/e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/b/d/d;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->v:Lcom/fimi/soul/biz/b/c;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/b/c;->f()Lcom/fimi/kernel/b/d/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/b/d/c;->f()Lcom/fimi/kernel/b/d/d;

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/camera/e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/b/d/d;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/a;->e()V

    return-void
.end method

.method public e()V
    .locals 3

    invoke-static {}, Lcom/fimi/soul/biz/camera/b;->a()Lcom/fimi/soul/biz/camera/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/b;->e()Lcom/fimi/soul/biz/camera/b/c;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/fimi/soul/biz/camera/a/b;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/fimi/soul/biz/camera/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/a/b;->g()Lcom/fimi/kernel/b/d/c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/fimi/kernel/b/d/c;->f()Lcom/fimi/kernel/b/d/d;

    move-result-object v1

    invoke-static {}, Lcom/fimi/soul/biz/camera/e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/kernel/b/d/d;->a(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/a/b;->f()Lcom/fimi/kernel/b/d/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/fimi/kernel/b/d/c;->f()Lcom/fimi/kernel/b/d/d;

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/camera/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/b/d/d;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public f()V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->x:Landroid/os/Handler;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->x:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/module/login/a;->y:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public h()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->p:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->p:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    return-void
.end method

.method public i()V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/login/a;->p:Landroid/os/Handler;

    new-instance v1, Lcom/fimi/soul/module/login/a$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/login/a$1;-><init>(Lcom/fimi/soul/module/login/a;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
