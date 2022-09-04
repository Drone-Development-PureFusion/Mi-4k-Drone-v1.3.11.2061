.class public Lcom/google/android/gms/measurement/internal/e;
.super Lcom/google/android/gms/measurement/internal/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/measurement/internal/e$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/measurement/internal/e$a;

.field private b:Lcom/google/android/gms/measurement/internal/y;

.field private c:Ljava/lang/Boolean;

.field private final d:Lcom/google/android/gms/measurement/internal/r;

.field private final e:Lcom/google/android/gms/measurement/internal/i;

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/measurement/internal/r;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/measurement/internal/aj;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/b;-><init>(Lcom/google/android/gms/measurement/internal/aj;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->f:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/measurement/internal/i;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/measurement/internal/i;-><init>(Lcom/google/android/gms/common/util/e;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->e:Lcom/google/android/gms/measurement/internal/i;

    new-instance v0, Lcom/google/android/gms/measurement/internal/e$a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/e$a;-><init>(Lcom/google/android/gms/measurement/internal/e;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->a:Lcom/google/android/gms/measurement/internal/e$a;

    new-instance v0, Lcom/google/android/gms/measurement/internal/e$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/e$1;-><init>(Lcom/google/android/gms/measurement/internal/e;Lcom/google/android/gms/measurement/internal/aj;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->d:Lcom/google/android/gms/measurement/internal/r;

    new-instance v0, Lcom/google/android/gms/measurement/internal/e$2;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/e$2;-><init>(Lcom/google/android/gms/measurement/internal/e;Lcom/google/android/gms/measurement/internal/aj;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->g:Lcom/google/android/gms/measurement/internal/r;

    return-void
.end method

.method private D()V
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->e:Lcom/google/android/gms/measurement/internal/i;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/i;->a()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->n:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->D()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->d:Lcom/google/android/gms/measurement/internal/r;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p;->J()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/r;->a(J)V

    :cond_0
    return-void
.end method

.method private E()Z
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->q()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->q()Landroid/content/Context;

    move-result-object v3

    const-string v4, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const/high16 v3, 0x10000

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private F()V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->f()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Inactivity, disconnecting from the service"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->C()V

    goto :goto_0
.end method

.method private G()V
    .locals 0
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->A()V

    return-void
.end method

.method private H()V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Processing queued up service tasks"

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/e;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->v()Lcom/google/android/gms/measurement/internal/ai;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/ai;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->g:Lcom/google/android/gms/measurement/internal/r;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/r;->c()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/measurement/internal/e;)Lcom/google/android/gms/measurement/internal/e$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->a:Lcom/google/android/gms/measurement/internal/e$a;

    return-object v0
.end method

.method private a(Landroid/content/ComponentName;)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->b:Lcom/google/android/gms/measurement/internal/y;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->b:Lcom/google/android/gms/measurement/internal/y;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Disconnected from device MeasurementService"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/e;->G()V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/measurement/internal/e;Landroid/content/ComponentName;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/e;->a(Landroid/content/ComponentName;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/measurement/internal/e;Lcom/google/android/gms/measurement/internal/y;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/e;->a(Lcom/google/android/gms/measurement/internal/y;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/measurement/internal/y;)V
    .locals 0
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/e;->b:Lcom/google/android/gms/measurement/internal/y;

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/e;->D()V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/e;->H()V

    return-void
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/p;->U()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Discarding data. Max runnable queue size reached"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->n:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->D()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->g:Lcom/google/android/gms/measurement/internal/r;

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/r;->a(J)V

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->A()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/measurement/internal/e;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/e;->F()V

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/measurement/internal/e;)Lcom/google/android/gms/measurement/internal/y;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->b:Lcom/google/android/gms/measurement/internal/y;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/measurement/internal/e;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/e;->D()V

    return-void
.end method


# virtual methods
.method A()V
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->c()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->c:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->x()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/af;->B()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->c:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->c:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "State of service unknown"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->B()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->c:Ljava/lang/Boolean;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->x()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/e;->c:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/af;->a(Z)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->c:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Using measurement service"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->a:Lcom/google/android/gms/measurement/internal/e$a;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/e$a;->a()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->n:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->D()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/e;->E()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Using local app measurement service"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-string v0, "com.google.android.gms.measurement.START"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v2, Landroid/content/ComponentName;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->q()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "com.google.android.gms.measurement.PackageMeasurementService"

    :goto_1
    invoke-direct {v2, v3, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->a:Lcom/google/android/gms/measurement/internal/e$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/e$a;->a(Landroid/content/Intent;)V

    goto/16 :goto_0

    :cond_3
    const-string v0, "com.google.android.gms.measurement.AppMeasurementService"

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method protected B()Z
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->c()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "Checking service availability"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/common/j;->b()Lcom/google/android/gms/common/j;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->q()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/common/j;->a(Landroid/content/Context;)I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    move v0, v1

    goto :goto_0

    :sswitch_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "Service available"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v2, "Service missing"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    move v0, v1

    goto :goto_0

    :sswitch_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "Service updating"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->D()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "Service container out of date"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v2, "Service disabled"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    move v0, v1

    goto :goto_0

    :sswitch_5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v2, "Service invalid"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    move v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_3
        0x3 -> :sswitch_4
        0x9 -> :sswitch_5
        0x12 -> :sswitch_2
    .end sparse-switch
.end method

.method public C()V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->c()V

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/stats/b;->a()Lcom/google/android/gms/common/stats/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->q()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/e;->a:Lcom/google/android/gms/measurement/internal/e$a;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/stats/b;->a(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->b:Lcom/google/android/gms/measurement/internal/y;

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected a(Lcom/google/android/gms/measurement/internal/EventParcel;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->c()V

    new-instance v0, Lcom/google/android/gms/measurement/internal/e$4;

    invoke-direct {v0, p0, p2, p1}, Lcom/google/android/gms/measurement/internal/e$4;-><init>(Lcom/google/android/gms/measurement/internal/e;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/EventParcel;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/measurement/internal/UserAttributeParcel;)V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->c()V

    new-instance v0, Lcom/google/android/gms/measurement/internal/e$5;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/measurement/internal/e$5;-><init>(Lcom/google/android/gms/measurement/internal/e;Lcom/google/android/gms/measurement/internal/UserAttributeParcel;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected a(Ljava/util/concurrent/atomic/AtomicReference;Z)V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/measurement/internal/UserAttributeParcel;",
            ">;>;Z)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->c()V

    new-instance v0, Lcom/google/android/gms/measurement/internal/e$6;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/measurement/internal/e$6;-><init>(Lcom/google/android/gms/measurement/internal/e;Ljava/util/concurrent/atomic/AtomicReference;Z)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected e()V
    .locals 0

    return-void
.end method

.method public f()Z
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->c()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->b:Lcom/google/android/gms/measurement/internal/y;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected g()V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->c()V

    new-instance v0, Lcom/google/android/gms/measurement/internal/e$3;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/e$3;-><init>(Lcom/google/android/gms/measurement/internal/e;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public bridge synthetic h()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->h()V

    return-void
.end method

.method public bridge synthetic i()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->i()V

    return-void
.end method

.method public bridge synthetic j()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->j()V

    return-void
.end method

.method public bridge synthetic k()Lcom/google/android/gms/measurement/internal/o;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->k()Lcom/google/android/gms/measurement/internal/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l()Lcom/google/android/gms/measurement/internal/d;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->l()Lcom/google/android/gms/measurement/internal/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic m()Lcom/google/android/gms/measurement/internal/z;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->m()Lcom/google/android/gms/measurement/internal/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n()Lcom/google/android/gms/measurement/internal/s;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->n()Lcom/google/android/gms/measurement/internal/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o()Lcom/google/android/gms/measurement/internal/e;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->o()Lcom/google/android/gms/measurement/internal/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p()Lcom/google/android/gms/common/util/e;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->p()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic q()Landroid/content/Context;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->q()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic r()Lcom/google/android/gms/measurement/internal/q;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->r()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic s()Lcom/google/android/gms/measurement/internal/m;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->s()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic t()Lcom/google/android/gms/measurement/internal/ah;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->t()Lcom/google/android/gms/measurement/internal/ah;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic u()Lcom/google/android/gms/measurement/internal/g;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->u()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v()Lcom/google/android/gms/measurement/internal/ai;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->v()Lcom/google/android/gms/measurement/internal/ai;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic w()Lcom/google/android/gms/measurement/internal/ab;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic x()Lcom/google/android/gms/measurement/internal/af;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->x()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic y()Lcom/google/android/gms/measurement/internal/p;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/b;->y()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    return-object v0
.end method

.method protected z()V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->j()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/e;->c()V

    new-instance v0, Lcom/google/android/gms/measurement/internal/e$7;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/e$7;-><init>(Lcom/google/android/gms/measurement/internal/e;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/e;->a(Ljava/lang/Runnable;)V

    return-void
.end method
