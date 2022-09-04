.class public abstract Lcom/google/android/gms/internal/rm;
.super Lcom/google/android/gms/internal/pr;


# static fields
.field static n:Z

.field protected static volatile q:Lcom/google/android/gms/internal/rw;

.field protected static final r:Ljava/lang/Object;

.field private static final s:Ljava/lang/String;

.field private static t:J


# instance fields
.field protected l:Z

.field protected m:Ljava/lang/String;

.field protected o:Z

.field protected p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/rm;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/rm;->s:Ljava/lang/String;

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/google/android/gms/internal/rm;->t:J

    const/4 v0, 0x0

    sput-boolean v0, Lcom/google/android/gms/internal/rm;->n:Z

    const/4 v0, 0x0

    sput-object v0, Lcom/google/android/gms/internal/rm;->q:Lcom/google/android/gms/internal/rw;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/rm;->r:Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/pr;-><init>(Landroid/content/Context;)V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/rm;->l:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/rm;->o:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/rm;->p:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/rm;->m:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/google/android/gms/internal/rm;->l:Z

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/pr;-><init>(Landroid/content/Context;)V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/rm;->l:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/rm;->o:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/rm;->p:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/rm;->m:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/rm;->l:Z

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/rw;Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Lcom/google/android/gms/internal/rx;
    .locals 5

    invoke-static {}, Lcom/google/android/gms/internal/rr;->H()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/rr;->I()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/rs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/rs;-><init>()V

    throw v0

    :cond_1
    :try_start_0
    new-instance v1, Lcom/google/android/gms/internal/rx;

    const/4 v2, 0x0

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    aput-object p2, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/rx;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v1

    :catch_0
    move-exception v0

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/rs;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/rs;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected static declared-synchronized a(Landroid/content/Context;Z)V
    .locals 6

    const-class v1, Lcom/google/android/gms/internal/rm;

    monitor-enter v1

    :try_start_0
    sget-boolean v0, Lcom/google/android/gms/internal/rm;->n:Z

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    sput-wide v2, Lcom/google/android/gms/internal/rm;->t:J

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/rm;->b(Landroid/content/Context;Z)Lcom/google/android/gms/internal/rw;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/rm;->q:Lcom/google/android/gms/internal/rw;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/google/android/gms/internal/rm;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static a(Lcom/google/android/gms/internal/rw;)V
    .locals 6

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    const-class v0, Landroid/content/Context;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/rr;->n()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/rr;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/internal/rr;->x()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/rr;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/internal/rr;->v()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/rr;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/internal/rr;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/rr;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/internal/rr;->r()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/rr;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/internal/rr;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/rr;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/internal/rr;->J()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/rr;->K()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    new-array v0, v5, [Ljava/lang/Class;

    const-class v1, Landroid/view/MotionEvent;

    aput-object v1, v0, v3

    const-class v1, Landroid/util/DisplayMetrics;

    aput-object v1, v0, v4

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/rr;->H()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/rr;->I()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/internal/rr;->F()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/rr;->G()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/internal/rr;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/rr;->m()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/internal/rr;->D()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/rr;->E()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/internal/rr;->t()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/rr;->u()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/internal/rr;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/rr;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/internal/rr;->p()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/rr;->q()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    invoke-static {}, Lcom/google/android/gms/internal/rr;->B()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/rr;->C()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    new-array v0, v5, [Ljava/lang/Class;

    const-class v1, Landroid/content/Context;

    aput-object v1, v0, v3

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v1, v0, v4

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/rr;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/rr;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    new-array v0, v4, [Ljava/lang/Class;

    const-class v1, [Ljava/lang/StackTraceElement;

    aput-object v1, v0, v3

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/rr;->z()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/rr;->A()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    return-void
.end method

.method protected static b(Landroid/content/Context;Z)Lcom/google/android/gms/internal/rw;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/rm;->q:Lcom/google/android/gms/internal/rw;

    if-nez v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/rm;->r:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/rm;->q:Lcom/google/android/gms/internal/rw;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/rr;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/rr;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v0, v2, p1}, Lcom/google/android/gms/internal/rw;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/internal/rw;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/rm;->a(Lcom/google/android/gms/internal/rw;)V

    sput-object v0, Lcom/google/android/gms/internal/rm;->q:Lcom/google/android/gms/internal/rw;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/rm;->q:Lcom/google/android/gms/internal/rw;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private d(Lcom/google/android/gms/internal/rw;Lcom/google/android/gms/internal/df$a;)V
    .locals 12

    const/4 v3, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    const-wide/16 v10, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/rm;->a:Landroid/view/MotionEvent;

    iget-object v4, p0, Lcom/google/android/gms/internal/rm;->k:Landroid/util/DisplayMetrics;

    invoke-static {p1, v0, v4}, Lcom/google/android/gms/internal/rm;->a(Lcom/google/android/gms/internal/rw;Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Lcom/google/android/gms/internal/rx;

    move-result-object v0

    iget-object v4, v0, Lcom/google/android/gms/internal/rx;->a:Ljava/lang/Long;

    iput-object v4, p2, Lcom/google/android/gms/internal/df$a;->n:Ljava/lang/Long;

    iget-object v4, v0, Lcom/google/android/gms/internal/rx;->b:Ljava/lang/Long;

    iput-object v4, p2, Lcom/google/android/gms/internal/df$a;->o:Ljava/lang/Long;

    iget-object v4, v0, Lcom/google/android/gms/internal/rx;->c:Ljava/lang/Long;

    iput-object v4, p2, Lcom/google/android/gms/internal/df$a;->p:Ljava/lang/Long;

    iget-boolean v4, p0, Lcom/google/android/gms/internal/rm;->j:Z

    if-eqz v4, :cond_0

    iget-object v4, v0, Lcom/google/android/gms/internal/rx;->d:Ljava/lang/Long;

    iput-object v4, p2, Lcom/google/android/gms/internal/df$a;->D:Ljava/lang/Long;

    iget-object v0, v0, Lcom/google/android/gms/internal/rx;->e:Ljava/lang/Long;

    iput-object v0, p2, Lcom/google/android/gms/internal/df$a;->E:Ljava/lang/Long;

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/uf;->bk:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/uf;->bf:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_1
    new-instance v4, Lcom/google/android/gms/internal/df$a$a;

    invoke-direct {v4}, Lcom/google/android/gms/internal/df$a$a;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/rm;->a:Landroid/view/MotionEvent;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/rm;->b(Landroid/view/MotionEvent;)Lcom/google/android/gms/internal/rx;

    move-result-object v5

    iget-object v0, v5, Lcom/google/android/gms/internal/rx;->a:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/internal/df$a$a;->a:Ljava/lang/Long;

    iget-object v0, v5, Lcom/google/android/gms/internal/rx;->b:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/internal/df$a$a;->b:Ljava/lang/Long;

    iget-object v0, v5, Lcom/google/android/gms/internal/rx;->c:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/internal/df$a$a;->h:Ljava/lang/Long;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/rm;->j:Z

    if-eqz v0, :cond_3

    iget-object v0, v5, Lcom/google/android/gms/internal/rx;->e:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/internal/df$a$a;->c:Ljava/lang/Long;

    iget-object v0, v5, Lcom/google/android/gms/internal/rx;->d:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/internal/df$a$a;->e:Ljava/lang/Long;

    iget-object v0, v5, Lcom/google/android/gms/internal/rx;->f:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v0, v6, v10

    if-eqz v0, :cond_9

    move v0, v2

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v4, Lcom/google/android/gms/internal/df$a$a;->g:Ljava/lang/Integer;

    iget-wide v6, p0, Lcom/google/android/gms/internal/rm;->d:J

    cmp-long v0, v6, v10

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/rm;->k:Landroid/util/DisplayMetrics;

    if-eqz v0, :cond_a

    iget-wide v6, p0, Lcom/google/android/gms/internal/rm;->i:J

    long-to-double v6, v6

    iget-wide v8, p0, Lcom/google/android/gms/internal/rm;->d:J

    long-to-double v8, v8

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_1
    iput-object v0, v4, Lcom/google/android/gms/internal/df$a$a;->d:Ljava/lang/Long;

    iget-wide v6, p0, Lcom/google/android/gms/internal/rm;->h:J

    long-to-double v6, v6

    iget-wide v8, p0, Lcom/google/android/gms/internal/rm;->d:J

    long-to-double v8, v8

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v4, Lcom/google/android/gms/internal/df$a$a;->f:Ljava/lang/Long;

    :cond_2
    iget-object v0, v5, Lcom/google/android/gms/internal/rx;->i:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/internal/df$a$a;->j:Ljava/lang/Long;

    iget-object v0, v5, Lcom/google/android/gms/internal/rx;->j:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/internal/df$a$a;->i:Ljava/lang/Long;

    iget-object v0, v5, Lcom/google/android/gms/internal/rx;->k:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v0, v6, v10

    if-eqz v0, :cond_b

    move v0, v2

    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v4, Lcom/google/android/gms/internal/df$a$a;->k:Ljava/lang/Integer;

    iget-wide v6, p0, Lcom/google/android/gms/internal/rm;->g:J

    cmp-long v0, v6, v10

    if-lez v0, :cond_3

    iget-wide v6, p0, Lcom/google/android/gms/internal/rm;->g:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v4, Lcom/google/android/gms/internal/df$a$a;->l:Ljava/lang/Long;

    :cond_3
    iput-object v4, p2, Lcom/google/android/gms/internal/df$a;->W:Lcom/google/android/gms/internal/df$a$a;
    :try_end_0
    .catch Lcom/google/android/gms/internal/rs; {:try_start_0 .. :try_end_0} :catch_1

    :cond_4
    :goto_3
    iget-wide v4, p0, Lcom/google/android/gms/internal/rm;->c:J

    cmp-long v0, v4, v10

    if-lez v0, :cond_5

    iget-wide v4, p0, Lcom/google/android/gms/internal/rm;->c:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p2, Lcom/google/android/gms/internal/df$a;->I:Ljava/lang/Long;

    :cond_5
    iget-wide v4, p0, Lcom/google/android/gms/internal/rm;->d:J

    cmp-long v0, v4, v10

    if-lez v0, :cond_6

    iget-wide v4, p0, Lcom/google/android/gms/internal/rm;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p2, Lcom/google/android/gms/internal/df$a;->H:Ljava/lang/Long;

    :cond_6
    iget-wide v4, p0, Lcom/google/android/gms/internal/rm;->e:J

    cmp-long v0, v4, v10

    if-lez v0, :cond_7

    iget-wide v4, p0, Lcom/google/android/gms/internal/rm;->e:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p2, Lcom/google/android/gms/internal/df$a;->G:Ljava/lang/Long;

    :cond_7
    iget-wide v4, p0, Lcom/google/android/gms/internal/rm;->f:J

    cmp-long v0, v4, v10

    if-lez v0, :cond_8

    iget-wide v4, p0, Lcom/google/android/gms/internal/rm;->f:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p2, Lcom/google/android/gms/internal/df$a;->J:Ljava/lang/Long;

    :cond_8
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/rm;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    add-int/lit8 v2, v0, -0x1

    if-lez v2, :cond_c

    new-array v0, v2, [Lcom/google/android/gms/internal/df$a$a;

    iput-object v0, p2, Lcom/google/android/gms/internal/df$a;->X:[Lcom/google/android/gms/internal/df$a$a;

    :goto_4
    if-ge v1, v2, :cond_c

    iget-object v0, p0, Lcom/google/android/gms/internal/rm;->b:Ljava/util/LinkedList;

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MotionEvent;

    iget-object v4, p0, Lcom/google/android/gms/internal/rm;->k:Landroid/util/DisplayMetrics;

    invoke-static {p1, v0, v4}, Lcom/google/android/gms/internal/rm;->a(Lcom/google/android/gms/internal/rw;Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Lcom/google/android/gms/internal/rx;

    move-result-object v0

    new-instance v4, Lcom/google/android/gms/internal/df$a$a;

    invoke-direct {v4}, Lcom/google/android/gms/internal/df$a$a;-><init>()V

    iget-object v5, v0, Lcom/google/android/gms/internal/rx;->a:Ljava/lang/Long;

    iput-object v5, v4, Lcom/google/android/gms/internal/df$a$a;->a:Ljava/lang/Long;

    iget-object v0, v0, Lcom/google/android/gms/internal/rx;->b:Ljava/lang/Long;

    iput-object v0, v4, Lcom/google/android/gms/internal/df$a$a;->b:Ljava/lang/Long;

    iget-object v0, p2, Lcom/google/android/gms/internal/df$a;->X:[Lcom/google/android/gms/internal/df$a$a;

    aput-object v4, v0, v1
    :try_end_1
    .catch Lcom/google/android/gms/internal/rs; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4

    :cond_9
    move v0, v1

    goto/16 :goto_0

    :cond_a
    move-object v0, v3

    goto/16 :goto_1

    :cond_b
    move v0, v1

    goto/16 :goto_2

    :catch_0
    move-exception v0

    iput-object v3, p2, Lcom/google/android/gms/internal/df$a;->X:[Lcom/google/android/gms/internal/df$a$a;

    :cond_c
    return-void

    :catch_1
    move-exception v0

    goto :goto_3
.end method


# virtual methods
.method protected a([Ljava/lang/StackTraceElement;)J
    .locals 5

    sget-object v0, Lcom/google/android/gms/internal/rm;->q:Lcom/google/android/gms/internal/rw;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->z()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/rr;->A()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/rs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/rs;-><init>()V

    throw v0

    :cond_1
    :try_start_0
    new-instance v1, Lcom/google/android/gms/internal/rt;

    const/4 v2, 0x0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/rt;-><init>(Ljava/lang/String;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/rt;->a:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-wide v0

    return-wide v0

    :catch_0
    move-exception v0

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/rs;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/rs;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected a(Landroid/content/Context;Landroid/view/View;)Lcom/google/android/gms/internal/df$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/df$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/df$a;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/rm;->m:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/rm;->m:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/android/gms/internal/df$a;->b:Ljava/lang/String;

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/rm;->l:Z

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/rm;->b(Landroid/content/Context;Z)Lcom/google/android/gms/internal/rw;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/rw;->o()V

    invoke-virtual {p0, v1, v0, p2}, Lcom/google/android/gms/internal/rm;->a(Lcom/google/android/gms/internal/rw;Lcom/google/android/gms/internal/df$a;Landroid/view/View;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/rw;->p()V

    return-object v0
.end method

.method protected a(Lcom/google/android/gms/internal/rw;Lcom/google/android/gms/internal/df$a;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/rw;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/rm;->b(Lcom/google/android/gms/internal/rw;Lcom/google/android/gms/internal/df$a;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/rm;->a(Ljava/util/List;)V

    goto :goto_0
.end method

.method protected a(Lcom/google/android/gms/internal/rw;Lcom/google/android/gms/internal/df$a;Landroid/view/View;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/rm;->d(Lcom/google/android/gms/internal/rw;Lcom/google/android/gms/internal/df$a;)V

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/rm;->c(Lcom/google/android/gms/internal/rw;Lcom/google/android/gms/internal/df$a;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/rm;->a(Ljava/util/List;)V

    return-void
.end method

.method protected a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/util/concurrent/Callable",
            "<",
            "Ljava/lang/Void;",
            ">;>;)V"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/rm;->q:Lcom/google/android/gms/internal/rw;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/rm;->q:Lcom/google/android/gms/internal/rw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/rw;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/uf;->ba:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, p1, v2, v3, v0}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/rm;->s:Ljava/lang/String;

    const-string v2, "class methods got exception: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ry;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method protected b(Landroid/content/Context;)Lcom/google/android/gms/internal/df$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/df$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/df$a;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/rm;->m:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/rm;->m:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/android/gms/internal/df$a;->b:Ljava/lang/String;

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/rm;->l:Z

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/rm;->b(Landroid/content/Context;Z)Lcom/google/android/gms/internal/rw;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/rw;->o()V

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/rm;->a(Lcom/google/android/gms/internal/rw;Lcom/google/android/gms/internal/df$a;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/rw;->p()V

    return-object v0
.end method

.method protected b(Landroid/view/MotionEvent;)Lcom/google/android/gms/internal/rx;
    .locals 6

    sget-object v0, Lcom/google/android/gms/internal/rm;->q:Lcom/google/android/gms/internal/rw;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->F()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/rr;->G()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/rw;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/rs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/rs;-><init>()V

    throw v0

    :cond_1
    :try_start_0
    new-instance v1, Lcom/google/android/gms/internal/rx;

    const/4 v2, 0x0

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    iget-object v5, p0, Lcom/google/android/gms/internal/rm;->k:Landroid/util/DisplayMetrics;

    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/rx;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v1

    :catch_0
    move-exception v0

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/rs;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/rs;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected b(Lcom/google/android/gms/internal/rw;Lcom/google/android/gms/internal/df$a;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/rw;",
            "Lcom/google/android/gms/internal/df$a;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/util/concurrent/Callable",
            "<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/rw;->q()I

    move-result v7

    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/sb;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->f()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->g()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x1b

    sget-object v3, Lcom/google/android/gms/internal/uf;->be:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Lcom/google/android/gms/internal/uf;->bf:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_5

    :cond_0
    const/4 v9, 0x1

    :goto_0
    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/internal/sb;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;IIZ)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v9, Lcom/google/android/gms/internal/se;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->l()Ljava/lang/String;

    move-result-object v11

    invoke-static {}, Lcom/google/android/gms/internal/rr;->m()Ljava/lang/String;

    move-result-object v12

    sget-wide v14, Lcom/google/android/gms/internal/rm;->t:J

    const/16 v17, 0x19

    move-object/from16 v10, p1

    move-object/from16 v13, p2

    move/from16 v16, v7

    invoke-direct/range {v9 .. v17}, Lcom/google/android/gms/internal/se;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;JII)V

    move-object/from16 v0, v18

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/sj;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->t()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->u()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x1

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/sj;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/sk;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->v()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->w()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x1f

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/sk;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/sn;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->D()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->E()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x21

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/sn;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/sa;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->x()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->y()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x1d

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/sa;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/sc;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->h()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->i()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x5

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/sc;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/si;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->r()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->s()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0xc

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/si;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/rz;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->e()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x3

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/rz;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/sd;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->j()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->k()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x2c

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/sd;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/sh;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->p()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->q()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x16

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/sh;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lcom/google/android/gms/internal/uf;->bh:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lcom/google/android/gms/internal/uf;->bf:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    new-instance v2, Lcom/google/android/gms/internal/so;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->J()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->K()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x30

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/so;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    sget-object v2, Lcom/google/android/gms/internal/uf;->bm:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v2, Lcom/google/android/gms/internal/uf;->bf:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    new-instance v2, Lcom/google/android/gms/internal/sm;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->B()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->C()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x33

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/sm;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object v18

    :cond_5
    const/4 v9, 0x0

    goto/16 :goto_0
.end method

.method protected c(Lcom/google/android/gms/internal/rw;Lcom/google/android/gms/internal/df$a;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/rw;",
            "Lcom/google/android/gms/internal/df$a;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/util/concurrent/Callable",
            "<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/rw;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    if-nez v2, :cond_0

    move-object/from16 v2, v18

    :goto_0
    return-object v2

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/rw;->q()I

    move-result v7

    new-instance v2, Lcom/google/android/gms/internal/sg;

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/sg;-><init>(Lcom/google/android/gms/internal/rw;Lcom/google/android/gms/internal/df$a;)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/sj;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->t()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->u()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x1

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/sj;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v9, Lcom/google/android/gms/internal/se;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->l()Ljava/lang/String;

    move-result-object v11

    invoke-static {}, Lcom/google/android/gms/internal/rr;->m()Ljava/lang/String;

    move-result-object v12

    sget-wide v14, Lcom/google/android/gms/internal/rm;->t:J

    const/16 v17, 0x19

    move-object/from16 v10, p1

    move-object/from16 v13, p2

    move/from16 v16, v7

    invoke-direct/range {v9 .. v17}, Lcom/google/android/gms/internal/se;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;JII)V

    move-object/from16 v0, v18

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/sd;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->j()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->k()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x2c

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/sd;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/rz;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->e()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x3

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/rz;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/google/android/gms/internal/sh;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->p()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->q()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x16

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/sh;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lcom/google/android/gms/internal/uf;->bq:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lcom/google/android/gms/internal/uf;->bf:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    new-instance v2, Lcom/google/android/gms/internal/sc;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->h()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->i()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x5

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/sc;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    sget-object v2, Lcom/google/android/gms/internal/uf;->bj:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v2, Lcom/google/android/gms/internal/uf;->bf:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    new-instance v2, Lcom/google/android/gms/internal/so;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->J()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->K()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x30

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/so;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    sget-object v2, Lcom/google/android/gms/internal/uf;->bo:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_5

    sget-object v2, Lcom/google/android/gms/internal/uf;->bf:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_5
    new-instance v2, Lcom/google/android/gms/internal/sm;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->B()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->C()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x33

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/sm;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    sget-object v2, Lcom/google/android/gms/internal/uf;->bt:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_7

    sget-object v2, Lcom/google/android/gms/internal/uf;->bf:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_8

    :cond_7
    new-instance v2, Lcom/google/android/gms/internal/sl;

    invoke-static {}, Lcom/google/android/gms/internal/rr;->z()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/rr;->A()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x2d

    new-instance v3, Ljava/lang/Throwable;

    invoke-direct {v3}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v3}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v9

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/internal/sl;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II[Ljava/lang/StackTraceElement;)V

    move-object/from16 v0, v18

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    move-object/from16 v2, v18

    goto/16 :goto_0
.end method
