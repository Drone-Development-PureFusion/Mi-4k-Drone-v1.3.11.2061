.class public final Lcom/google/android/gms/analytics/c;
.super Lcom/google/android/gms/analytics/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/analytics/c$b;,
        Lcom/google/android/gms/analytics/c$a;
    }
.end annotation


# static fields
.field private static b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private c:Z

.field private d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/analytics/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private e:Z

.field private f:Z

.field private volatile g:Z

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/google/android/gms/analytics/c;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/analytics/internal/v;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/h;-><init>(Lcom/google/android/gms/analytics/internal/v;)V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/analytics/c;->d:Ljava/util/Set;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/analytics/c;
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        allOf = {
            "android.permission.INTERNET",
            "android.permission.ACCESS_NETWORK_STATE"
        }
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/analytics/internal/v;->a(Landroid/content/Context;)Lcom/google/android/gms/analytics/internal/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/v;->k()Lcom/google/android/gms/analytics/c;

    move-result-object v0

    return-object v0
.end method

.method public static d()V
    .locals 3

    const-class v1, Lcom/google/android/gms/analytics/c;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/analytics/c;->b:Ljava/util/List;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/analytics/c;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    sput-object v0, Lcom/google/android/gms/analytics/c;->b:Ljava/util/List;

    :cond_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method private p()Lcom/google/android/gms/analytics/internal/r;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/c;->k()Lcom/google/android/gms/analytics/internal/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/v;->i()Lcom/google/android/gms/analytics/internal/r;

    move-result-object v0

    return-object v0
.end method

.method private q()Lcom/google/android/gms/analytics/internal/q;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/c;->k()Lcom/google/android/gms/analytics/internal/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/v;->l()Lcom/google/android/gms/analytics/internal/q;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/analytics/g;
    .locals 4

    monitor-enter p0

    :try_start_0
    new-instance v1, Lcom/google/android/gms/analytics/g;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/c;->k()Lcom/google/android/gms/analytics/internal/v;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/gms/analytics/g;-><init>(Lcom/google/android/gms/analytics/internal/v;Ljava/lang/String;Lcom/google/android/gms/analytics/internal/e;)V

    if-lez p1, :cond_0

    new-instance v0, Lcom/google/android/gms/analytics/internal/n;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/c;->k()Lcom/google/android/gms/analytics/internal/v;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/android/gms/analytics/internal/n;-><init>(Lcom/google/android/gms/analytics/internal/v;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/internal/n;->a(I)Lcom/google/android/gms/analytics/internal/af;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/analytics/internal/o;

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/analytics/g;->a(Lcom/google/android/gms/analytics/internal/o;)V

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/analytics/g;->E()V

    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/analytics/g;
    .locals 3

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/analytics/g;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/c;->k()Lcom/google/android/gms/analytics/internal/v;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lcom/google/android/gms/analytics/g;-><init>(Lcom/google/android/gms/analytics/internal/v;Ljava/lang/String;Lcom/google/android/gms/analytics/internal/e;)V

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/g;->E()V

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/c;->b()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/analytics/c;->c:Z

    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/c;->e:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/analytics/c;->b(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public a(Landroid/app/Application;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/c;->e:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/analytics/c$b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/c$b;-><init>(Lcom/google/android/gms/analytics/c;)V

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/analytics/c;->e:Z

    :cond_0
    return-void
.end method

.method a(Lcom/google/android/gms/analytics/c$a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/c;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/c;->k()Lcom/google/android/gms/analytics/internal/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/v;->b()Landroid/content/Context;

    move-result-object v0

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Application;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/c;->a(Landroid/app/Application;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/analytics/e;)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/analytics/internal/f;->a(Lcom/google/android/gms/analytics/e;)V

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/c;->h:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/analytics/internal/ao;->c:Lcom/google/android/gms/analytics/internal/ao$a;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ao$a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/analytics/internal/ao;->c:Lcom/google/android/gms/analytics/internal/ao$a;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/ao$a;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x70

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " DEBUG"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/analytics/c;->h:Z

    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/analytics/c;->f:Z

    return-void
.end method

.method b()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/analytics/c;->q()Lcom/google/android/gms/analytics/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/q;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/c;->g()Lcom/google/android/gms/analytics/e;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/q;->e()I

    move-result v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/analytics/e;->a(I)V

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/q;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/q;->i()Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/analytics/c;->a(Z)V

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/q;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/google/android/gms/analytics/internal/f;->a()Lcom/google/android/gms/analytics/e;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/q;->e()I

    move-result v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/analytics/e;->a(I)V

    :cond_2
    return-void
.end method

.method public b(I)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/analytics/c;->p()Lcom/google/android/gms/analytics/internal/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/internal/r;->a(I)V

    return-void
.end method

.method b(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/c;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/analytics/c$a;

    invoke-interface {v0, p1}, Lcom/google/android/gms/analytics/c$a;->a(Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method b(Lcom/google/android/gms/analytics/c$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/c;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/google/android/gms/analytics/c;->g:Z

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/c;->g:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/analytics/c;->p()Lcom/google/android/gms/analytics/internal/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->c()V

    :cond_0
    return-void
.end method

.method public c(Landroid/app/Activity;)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/c;->e:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/analytics/c;->d(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/c;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method d(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/c;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/analytics/c$a;

    invoke-interface {v0, p1}, Lcom/google/android/gms/analytics/c$a;->b(Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/c;->f:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/c;->g:Z

    return v0
.end method

.method public g()Lcom/google/android/gms/analytics/e;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lcom/google/android/gms/analytics/internal/f;->a()Lcom/google/android/gms/analytics/e;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "getClientId can not be called from the main thread"

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->c(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/c;->k()Lcom/google/android/gms/analytics/internal/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/v;->p()Lcom/google/android/gms/analytics/internal/ad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ad;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/analytics/c;->p()Lcom/google/android/gms/analytics/internal/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->d()V

    return-void
.end method

.method j()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/analytics/c;->p()Lcom/google/android/gms/analytics/internal/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->e()Z

    return-void
.end method
