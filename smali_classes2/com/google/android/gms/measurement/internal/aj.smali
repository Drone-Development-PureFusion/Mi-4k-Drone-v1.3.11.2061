.class public Lcom/google/android/gms/measurement/internal/aj;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/measurement/internal/aj$a;
    }
.end annotation


# static fields
.field private static volatile a:Lcom/google/android/gms/measurement/internal/aj;


# instance fields
.field private A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private B:I

.field private C:I

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/measurement/internal/p;

.field private final d:Lcom/google/android/gms/measurement/internal/af;

.field private final e:Lcom/google/android/gms/measurement/internal/ab;

.field private final f:Lcom/google/android/gms/measurement/internal/ai;

.field private final g:Lcom/google/android/gms/measurement/internal/g;

.field private final h:Lcom/google/android/gms/measurement/internal/ah;

.field private final i:Lcom/google/android/gms/measurement/AppMeasurement;

.field private final j:Lcom/google/firebase/a/a;

.field private final k:Lcom/google/android/gms/measurement/internal/m;

.field private final l:Lcom/google/android/gms/measurement/internal/q;

.field private final m:Lcom/google/android/gms/measurement/internal/ac;

.field private final n:Lcom/google/android/gms/common/util/e;

.field private final o:Lcom/google/android/gms/measurement/internal/e;

.field private final p:Lcom/google/android/gms/measurement/internal/s;

.field private final q:Lcom/google/android/gms/measurement/internal/d;

.field private final r:Lcom/google/android/gms/measurement/internal/z;

.field private final s:Lcom/google/android/gms/measurement/internal/ad;

.field private final t:Lcom/google/android/gms/measurement/internal/j;

.field private final u:Lcom/google/android/gms/measurement/internal/o;

.field private final v:Z

.field private w:Z

.field private x:Ljava/lang/Boolean;

.field private y:Ljava/nio/channels/FileLock;

.field private z:Ljava/nio/channels/FileChannel;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/c;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/c;->a:Landroid/content/Context;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->b:Landroid/content/Context;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->m(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/common/util/e;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->n:Lcom/google/android/gms/common/util/e;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->a(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->c:Lcom/google/android/gms/measurement/internal/p;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->b(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/af;->d()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->d:Lcom/google/android/gms/measurement/internal/af;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->c(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->d()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->e:Lcom/google/android/gms/measurement/internal/ab;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->C()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "App measurement is starting up, version"

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/p;->M()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->C()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->D()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Debug-level message logging enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->D()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "AppMeasurement singleton hash"

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->j(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/m;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->k:Lcom/google/android/gms/measurement/internal/m;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->o(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/s;->d()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->p:Lcom/google/android/gms/measurement/internal/s;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->p(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/z;->d()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->r:Lcom/google/android/gms/measurement/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/z;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/m;->m(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->C()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop firebase.analytics.debug-mode .none."

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->k(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->d()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->l:Lcom/google/android/gms/measurement/internal/q;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->s(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/o;->d()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->u:Lcom/google/android/gms/measurement/internal/o;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->l(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ac;->d()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->m:Lcom/google/android/gms/measurement/internal/ac;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->n(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/e;->d()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->o:Lcom/google/android/gms/measurement/internal/e;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->i(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/d;->d()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->q:Lcom/google/android/gms/measurement/internal/d;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->r(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j;->d()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->t:Lcom/google/android/gms/measurement/internal/j;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->q(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/ad;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->s:Lcom/google/android/gms/measurement/internal/ad;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->h(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/AppMeasurement;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->i:Lcom/google/android/gms/measurement/AppMeasurement;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->g(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/firebase/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->j:Lcom/google/firebase/a/a;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->e(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/g;->d()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->g:Lcom/google/android/gms/measurement/internal/g;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->f(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ah;->d()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->h:Lcom/google/android/gms/measurement/internal/ah;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/measurement/internal/c;->d(Lcom/google/android/gms/measurement/internal/aj;)Lcom/google/android/gms/measurement/internal/ai;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ai;->d()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->f:Lcom/google/android/gms/measurement/internal/ai;

    iget v0, p0, Lcom/google/android/gms/measurement/internal/aj;->B:I

    iget v1, p0, Lcom/google/android/gms/measurement/internal/aj;->C:I

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Not all components initialized"

    iget v2, p0, Lcom/google/android/gms/measurement/internal/aj;->B:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Lcom/google/android/gms/measurement/internal/aj;->C:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/aj;->v:Z

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->c:Lcom/google/android/gms/measurement/internal/p;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->D()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Application;

    if-eqz v0, :cond_5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->l()Lcom/google/android/gms/measurement/internal/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/d;->f()V

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->f:Lcom/google/android/gms/measurement/internal/ai;

    new-instance v1, Lcom/google/android/gms/measurement/internal/aj$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/measurement/internal/aj$1;-><init>(Lcom/google/android/gms/measurement/internal/aj;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ai;->a(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->C()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "To enable faster debug mode event logging run:\n  adb shell setprop firebase.analytics.debug-mode "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->D()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Not tracking deep linking pre-ICS"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Application context is not an Application"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private M()Z
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->A:Ljava/util/List;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private N()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->I()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->C()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private O()V
    .locals 10
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const-wide/16 v8, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->L()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/aj;->N()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->w()Lcom/google/android/gms/measurement/internal/ad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ad;->b()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->x()Lcom/google/android/gms/measurement/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j;->f()V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/aj;->P()J

    move-result-wide v0

    cmp-long v2, v0, v8

    if-nez v2, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->w()Lcom/google/android/gms/measurement/internal/ad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ad;->b()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->x()Lcom/google/android/gms/measurement/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j;->f()V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->q()Lcom/google/android/gms/measurement/internal/ac;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ac;->f()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->w()Lcom/google/android/gms/measurement/internal/ad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ad;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->x()Lcom/google/android/gms/measurement/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j;->f()V

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/af;->e:Lcom/google/android/gms/measurement/internal/af$b;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/af$b;->a()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/p;->aa()J

    move-result-wide v4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v6

    invoke-virtual {v6, v2, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/m;->a(JJ)Z

    move-result v6

    if-nez v6, :cond_5

    add-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->w()Lcom/google/android/gms/measurement/internal/ad;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ad;->b()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    cmp-long v2, v0, v8

    if-gtz v2, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->ad()J

    move-result-wide v0

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "Upload scheduled in approximately ms"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->x()Lcom/google/android/gms/measurement/internal/j;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/measurement/internal/j;->a(J)V

    goto/16 :goto_0
.end method

.method private P()J
    .locals 16

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->ag()J

    move-result-wide v6

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->J()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->D()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    const/4 v0, 0x1

    move v4, v0

    :goto_0
    if-eqz v4, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->ac()J

    move-result-wide v0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v5

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/af;->c:Lcom/google/android/gms/measurement/internal/af$b;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/af$b;->a()J

    move-result-wide v8

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v5

    iget-object v5, v5, Lcom/google/android/gms/measurement/internal/af;->d:Lcom/google/android/gms/measurement/internal/af$b;

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/af$b;->a()J

    move-result-wide v10

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/q;->G()J

    move-result-wide v12

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/q;->H()J

    move-result-wide v14

    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    const-wide/16 v14, 0x0

    cmp-long v5, v12, v14

    if-nez v5, :cond_4

    const-wide/16 v2, 0x0

    :cond_1
    :goto_2
    return-wide v2

    :cond_2
    const/4 v0, 0x0

    move v4, v0

    goto :goto_0

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->ab()J

    move-result-wide v0

    goto :goto_1

    :cond_4
    sub-long/2addr v12, v2

    invoke-static {v12, v13}, Ljava/lang/Math;->abs(J)J

    move-result-wide v12

    sub-long v12, v2, v12

    sub-long/2addr v8, v2

    invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J

    move-result-wide v8

    sub-long v8, v2, v8

    sub-long/2addr v10, v2

    invoke-static {v10, v11}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    sub-long v10, v2, v10

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    add-long v2, v12, v6

    if-eqz v4, :cond_5

    const-wide/16 v4, 0x0

    cmp-long v4, v8, v4

    if-lez v4, :cond_5

    invoke-static {v12, v13, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    add-long/2addr v2, v0

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v4

    invoke-virtual {v4, v8, v9, v0, v1}, Lcom/google/android/gms/measurement/internal/m;->a(JJ)Z

    move-result v4

    if-nez v4, :cond_6

    add-long v2, v8, v0

    :cond_6
    const-wide/16 v0, 0x0

    cmp-long v0, v10, v0

    if-eqz v0, :cond_1

    cmp-long v0, v10, v12

    if-ltz v0, :cond_1

    const/4 v0, 0x0

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p;->ai()I

    move-result v1

    if-ge v0, v1, :cond_7

    const/4 v1, 0x1

    shl-int/2addr v1, v0

    int-to-long v4, v1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p;->ah()J

    move-result-wide v6

    mul-long/2addr v4, v6

    add-long/2addr v2, v4

    cmp-long v1, v2, v10

    if-gtz v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_7
    const-wide/16 v2, 0x0

    goto :goto_2
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/measurement/internal/aj;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/measurement/internal/aj;->a:Lcom/google/android/gms/measurement/internal/aj;

    if-nez v0, :cond_1

    const-class v1, Lcom/google/android/gms/measurement/internal/aj;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/measurement/internal/aj;->a:Lcom/google/android/gms/measurement/internal/aj;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/measurement/internal/c;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/c;->a()Lcom/google/android/gms/measurement/internal/aj;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/measurement/internal/aj;->a:Lcom/google/android/gms/measurement/internal/aj;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/measurement/internal/aj;->a:Lcom/google/android/gms/measurement/internal/aj;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(ILjava/lang/Throwable;[B)V
    .locals 6
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    if-nez p3, :cond_0

    new-array p3, v0, [B

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/aj;->A:Ljava/util/List;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/aj;->A:Ljava/util/List;

    const/16 v2, 0xc8

    if-eq p1, v2, :cond_1

    const/16 v2, 0xcc

    if-ne p1, v2, :cond_4

    :cond_1
    if-nez p2, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/af;->c:Lcom/google/android/gms/measurement/internal/af$b;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/af$b;->a(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/af;->d:Lcom/google/android/gms/measurement/internal/af$b;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/af$b;->a(J)V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/aj;->O()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v2, "Successful upload. Got network response. code, size"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    array-length v4, p3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->f()V

    :try_start_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/measurement/internal/q;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q;->z()V

    throw v0

    :cond_2
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->q()Lcom/google/android/gms/measurement/internal/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ac;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/aj;->N()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->I()V

    :goto_1
    return-void

    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/aj;->O()V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "Network upload failed. Will retry later. code, error"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, p2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/af;->d:Lcom/google/android/gms/measurement/internal/af$b;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/af$b;->a(J)V

    const/16 v1, 0x1f7

    if-eq p1, v1, :cond_5

    const/16 v1, 0x1ad

    if-ne p1, v1, :cond_6

    :cond_5
    const/4 v0, 0x1

    :cond_6
    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/af;->e:Lcom/google/android/gms/measurement/internal/af$b;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/af$b;->a(J)V

    :cond_7
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/aj;->O()V

    goto :goto_1
.end method

.method static synthetic a(Lcom/google/android/gms/measurement/internal/aj;ILjava/lang/Throwable;[B)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/aj;->a(ILjava/lang/Throwable;[B)V

    return-void
.end method

.method private a(Lcom/google/android/gms/measurement/internal/al;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Component not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->A:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Set uploading progress before finishing the previous upload"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->A:Ljava/util/List;

    goto :goto_1
.end method

.method private a(Lcom/google/android/gms/measurement/internal/t;)Z
    .locals 11

    const/4 v10, 0x1

    const/4 v5, 0x0

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/t;->f:Lcom/google/android/gms/measurement/internal/EventParams;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return v5

    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/t;->f:Lcom/google/android/gms/measurement/internal/EventParams;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/EventParams;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v2, "_r"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v5, v10

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->j()Lcom/google/android/gms/measurement/internal/ah;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/t;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/t;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/ah;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->F()J

    move-result-wide v2

    iget-object v4, p1, Lcom/google/android/gms/measurement/internal/t;->a:Ljava/lang/String;

    move v6, v5

    move v7, v5

    move v8, v5

    move v9, v5

    invoke-virtual/range {v1 .. v9}, Lcom/google/android/gms/measurement/internal/q;->a(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/measurement/internal/q$a;

    move-result-object v1

    if-eqz v0, :cond_0

    iget-wide v0, v1, Lcom/google/android/gms/measurement/internal/q$a;->e:J

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/t;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/p;->c(Ljava/lang/String;)I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    move v5, v10

    goto :goto_0
.end method

.method private a(Ljava/lang/String;J)Z
    .locals 22

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/q;->f()V

    :try_start_0
    new-instance v18, Lcom/google/android/gms/measurement/internal/aj$a;

    const/4 v4, 0x0

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v4}, Lcom/google/android/gms/measurement/internal/aj$a;-><init>(Lcom/google/android/gms/measurement/internal/aj;Lcom/google/android/gms/measurement/internal/aj$1;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v4

    move-object/from16 v0, p1

    move-wide/from16 v1, p2

    move-object/from16 v3, v18

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/q;->a(Ljava/lang/String;JLcom/google/android/gms/measurement/internal/q$b;)V

    invoke-virtual/range {v18 .. v18}, Lcom/google/android/gms/measurement/internal/aj$a;->a()Z

    move-result v4

    if-nez v4, :cond_18

    const/4 v15, 0x0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/aj$a;->a:Lcom/google/android/gms/internal/amw$e;

    move-object/from16 v19, v0

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    new-array v4, v4, [Lcom/google/android/gms/internal/amw$b;

    move-object/from16 v0, v19

    iput-object v4, v0, Lcom/google/android/gms/internal/amw$e;->b:[Lcom/google/android/gms/internal/amw$b;

    const/4 v14, 0x0

    const/4 v4, 0x0

    move/from16 v17, v4

    :goto_0
    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    move/from16 v0, v17

    if-ge v0, v4, :cond_10

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->j()Lcom/google/android/gms/measurement/internal/ah;

    move-result-object v5

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->a:Lcom/google/android/gms/internal/amw$e;

    iget-object v6, v4, Lcom/google/android/gms/internal/amw$e;->o:Ljava/lang/String;

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    iget-object v4, v4, Lcom/google/android/gms/internal/amw$b;->b:Ljava/lang/String;

    invoke-virtual {v5, v6, v4}, Lcom/google/android/gms/measurement/internal/ah;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v5

    const-string v6, "Dropping blacklisted raw event"

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    iget-object v4, v4, Lcom/google/android/gms/internal/amw$b;->b:Ljava/lang/String;

    invoke-virtual {v5, v6, v4}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v5

    const/16 v6, 0xb

    const-string v7, "_ev"

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    iget-object v4, v4, Lcom/google/android/gms/internal/amw$b;->b:Ljava/lang/String;

    const/4 v8, 0x0

    invoke-virtual {v5, v6, v7, v4, v8}, Lcom/google/android/gms/measurement/internal/m;->a(ILjava/lang/String;Ljava/lang/String;I)V

    move v4, v14

    move v5, v15

    :goto_1
    add-int/lit8 v6, v17, 0x1

    move/from16 v17, v6

    move v14, v4

    move v15, v5

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->j()Lcom/google/android/gms/measurement/internal/ah;

    move-result-object v5

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->a:Lcom/google/android/gms/internal/amw$e;

    iget-object v6, v4, Lcom/google/android/gms/internal/amw$e;->o:Ljava/lang/String;

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    iget-object v4, v4, Lcom/google/android/gms/internal/amw$b;->b:Ljava/lang/String;

    invoke-virtual {v5, v6, v4}, Lcom/google/android/gms/measurement/internal/ah;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_f

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    iget-object v4, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    if-nez v4, :cond_1

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    const/4 v7, 0x0

    new-array v7, v7, [Lcom/google/android/gms/internal/amw$c;

    iput-object v7, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    :cond_1
    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    iget-object v8, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    array-length v9, v8

    const/4 v4, 0x0

    move v7, v4

    :goto_2
    if-ge v7, v9, :cond_3

    aget-object v4, v8, v7

    const-string v10, "_c"

    iget-object v11, v4, Lcom/google/android/gms/internal/amw$c;->a:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const-wide/16 v10, 0x1

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v4, Lcom/google/android/gms/internal/amw$c;->c:Ljava/lang/Long;

    const/4 v4, 0x1

    move v5, v4

    move v4, v6

    :goto_3
    add-int/lit8 v6, v7, 0x1

    move v7, v6

    move v6, v4

    goto :goto_2

    :cond_2
    const-string v10, "_r"

    iget-object v11, v4, Lcom/google/android/gms/internal/amw$c;->a:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1d

    const-wide/16 v10, 0x1

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iput-object v6, v4, Lcom/google/android/gms/internal/amw$c;->c:Ljava/lang/Long;

    const/4 v4, 0x1

    goto :goto_3

    :cond_3
    if-nez v5, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v5

    const-string v7, "Marking event as conversion"

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    iget-object v4, v4, Lcom/google/android/gms/internal/amw$b;->b:Ljava/lang/String;

    invoke-virtual {v5, v7, v4}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    iget-object v5, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    iget-object v4, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    array-length v4, v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lcom/google/android/gms/internal/amw$c;

    new-instance v5, Lcom/google/android/gms/internal/amw$c;

    invoke-direct {v5}, Lcom/google/android/gms/internal/amw$c;-><init>()V

    const-string v7, "_c"

    iput-object v7, v5, Lcom/google/android/gms/internal/amw$c;->a:Ljava/lang/String;

    const-wide/16 v8, 0x1

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iput-object v7, v5, Lcom/google/android/gms/internal/amw$c;->c:Ljava/lang/Long;

    array-length v7, v4

    add-int/lit8 v7, v7, -0x1

    aput-object v5, v4, v7

    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/amw$b;

    iput-object v4, v5, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    :cond_4
    if-nez v6, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v5

    const-string v6, "Marking event as real-time"

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    iget-object v4, v4, Lcom/google/android/gms/internal/amw$b;->b:Ljava/lang/String;

    invoke-virtual {v5, v6, v4}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    iget-object v5, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    iget-object v4, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    array-length v4, v4

    add-int/lit8 v4, v4, 0x1

    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lcom/google/android/gms/internal/amw$c;

    new-instance v5, Lcom/google/android/gms/internal/amw$c;

    invoke-direct {v5}, Lcom/google/android/gms/internal/amw$c;-><init>()V

    const-string v6, "_r"

    iput-object v6, v5, Lcom/google/android/gms/internal/amw$c;->a:Ljava/lang/String;

    const-wide/16 v6, 0x1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iput-object v6, v5, Lcom/google/android/gms/internal/amw$c;->c:Ljava/lang/Long;

    array-length v6, v4

    add-int/lit8 v6, v6, -0x1

    aput-object v5, v4, v6

    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/amw$b;

    iput-object v4, v5, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    :cond_5
    const/16 v16, 0x1

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    iget-object v4, v4, Lcom/google/android/gms/internal/amw$b;->b:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/m;->a(Ljava/lang/String;)Z

    move-result v20

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->F()J

    move-result-wide v6

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->a:Lcom/google/android/gms/internal/amw$e;

    iget-object v8, v4, Lcom/google/android/gms/internal/amw$e;->o:Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-virtual/range {v5 .. v13}, Lcom/google/android/gms/measurement/internal/q;->a(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/measurement/internal/q$a;

    move-result-object v4

    iget-wide v4, v4, Lcom/google/android/gms/measurement/internal/q$a;->e:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v6

    move-object/from16 v0, v18

    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/aj$a;->a:Lcom/google/android/gms/internal/amw$e;

    iget-object v7, v7, Lcom/google/android/gms/internal/amw$e;->o:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/p;->c(Ljava/lang/String;)I

    move-result v6

    int-to-long v6, v6

    cmp-long v4, v4, v6

    if-lez v4, :cond_1c

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    const/4 v5, 0x0

    :goto_4
    iget-object v6, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    array-length v6, v6

    if-ge v5, v6, :cond_8

    const-string v6, "_r"

    iget-object v7, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    aget-object v7, v7, v5

    iget-object v7, v7, Lcom/google/android/gms/internal/amw$c;->a:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    iget-object v6, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    array-length v6, v6

    add-int/lit8 v6, v6, -0x1

    new-array v6, v6, [Lcom/google/android/gms/internal/amw$c;

    if-lez v5, :cond_6

    iget-object v7, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v7, v8, v6, v9, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_6
    array-length v7, v6

    if-ge v5, v7, :cond_7

    iget-object v7, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    add-int/lit8 v8, v5, 0x1

    array-length v9, v6

    sub-int/2addr v9, v5

    invoke-static {v7, v8, v6, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_7
    iput-object v6, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    :cond_8
    :goto_5
    if-eqz v20, :cond_f

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->F()J

    move-result-wide v6

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->a:Lcom/google/android/gms/internal/amw$e;

    iget-object v8, v4, Lcom/google/android/gms/internal/amw$e;->o:Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-virtual/range {v5 .. v13}, Lcom/google/android/gms/measurement/internal/q;->a(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/measurement/internal/q$a;

    move-result-object v4

    iget-wide v4, v4, Lcom/google/android/gms/measurement/internal/q$a;->c:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v6

    move-object/from16 v0, v18

    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/aj$a;->a:Lcom/google/android/gms/internal/amw$e;

    iget-object v7, v7, Lcom/google/android/gms/internal/amw$e;->o:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/p;->b(Ljava/lang/String;)I

    move-result v6

    int-to-long v6, v6

    cmp-long v4, v4, v6

    if-lez v4, :cond_f

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v4

    const-string v5, "Too many conversions. Not logging as conversion."

    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    const/4 v7, 0x0

    const/4 v6, 0x0

    iget-object v9, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    array-length v10, v9

    const/4 v5, 0x0

    move v8, v5

    :goto_6
    if-ge v8, v10, :cond_b

    aget-object v5, v9, v8

    const-string v11, "_c"

    iget-object v12, v5, Lcom/google/android/gms/internal/amw$c;->a:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    move v6, v7

    :goto_7
    add-int/lit8 v7, v8, 0x1

    move v8, v7

    move v7, v6

    move-object v6, v5

    goto :goto_6

    :cond_9
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_4

    :cond_a
    const-string v11, "_err"

    iget-object v5, v5, Lcom/google/android/gms/internal/amw$c;->a:Ljava/lang/String;

    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1b

    const/4 v5, 0x1

    move-object/from16 v21, v6

    move v6, v5

    move-object/from16 v5, v21

    goto :goto_7

    :cond_b
    if-eqz v7, :cond_d

    if-eqz v6, :cond_d

    iget-object v5, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    array-length v5, v5

    add-int/lit8 v5, v5, -0x1

    new-array v9, v5, [Lcom/google/android/gms/internal/amw$c;

    const/4 v7, 0x0

    iget-object v10, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    array-length v11, v10

    const/4 v5, 0x0

    move v8, v5

    :goto_8
    if-ge v8, v11, :cond_c

    aget-object v12, v10, v8

    if-eq v12, v6, :cond_1a

    add-int/lit8 v5, v7, 0x1

    aput-object v12, v9, v7

    :goto_9
    add-int/lit8 v7, v8, 0x1

    move v8, v7

    move v7, v5

    goto :goto_8

    :cond_c
    iput-object v9, v4, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    move v6, v15

    :goto_a
    move-object/from16 v0, v19

    iget-object v7, v0, Lcom/google/android/gms/internal/amw$e;->b:[Lcom/google/android/gms/internal/amw$b;

    add-int/lit8 v5, v14, 0x1

    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    move/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/amw$b;

    aput-object v4, v7, v14

    move v4, v5

    move v5, v6

    goto/16 :goto_1

    :cond_d
    if-eqz v6, :cond_e

    const-string v4, "_err"

    iput-object v4, v6, Lcom/google/android/gms/internal/amw$c;->a:Ljava/lang/String;

    const-wide/16 v4, 0xa

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iput-object v4, v6, Lcom/google/android/gms/internal/amw$c;->c:Ljava/lang/Long;

    move v6, v15

    goto :goto_a

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v4

    const-string v5, "Did not find conversion parameter. Error not tracked"

    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :cond_f
    move v6, v15

    goto :goto_a

    :cond_10
    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->c:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v14, v4, :cond_11

    move-object/from16 v0, v19

    iget-object v4, v0, Lcom/google/android/gms/internal/amw$e;->b:[Lcom/google/android/gms/internal/amw$b;

    invoke-static {v4, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lcom/google/android/gms/internal/amw$b;

    move-object/from16 v0, v19

    iput-object v4, v0, Lcom/google/android/gms/internal/amw$e;->b:[Lcom/google/android/gms/internal/amw$b;

    :cond_11
    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->a:Lcom/google/android/gms/internal/amw$e;

    iget-object v4, v4, Lcom/google/android/gms/internal/amw$e;->o:Ljava/lang/String;

    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/aj$a;->a:Lcom/google/android/gms/internal/amw$e;

    iget-object v5, v5, Lcom/google/android/gms/internal/amw$e;->c:[Lcom/google/android/gms/internal/amw$g;

    move-object/from16 v0, v19

    iget-object v6, v0, Lcom/google/android/gms/internal/amw$e;->b:[Lcom/google/android/gms/internal/amw$b;

    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5, v6}, Lcom/google/android/gms/measurement/internal/aj;->a(Ljava/lang/String;[Lcom/google/android/gms/internal/amw$g;[Lcom/google/android/gms/internal/amw$b;)[Lcom/google/android/gms/internal/amw$a;

    move-result-object v4

    move-object/from16 v0, v19

    iput-object v4, v0, Lcom/google/android/gms/internal/amw$e;->A:[Lcom/google/android/gms/internal/amw$a;

    move-object/from16 v0, v19

    iget-object v4, v0, Lcom/google/android/gms/internal/amw$e;->b:[Lcom/google/android/gms/internal/amw$b;

    const/4 v5, 0x0

    aget-object v4, v4, v5

    iget-object v4, v4, Lcom/google/android/gms/internal/amw$b;->c:Ljava/lang/Long;

    move-object/from16 v0, v19

    iput-object v4, v0, Lcom/google/android/gms/internal/amw$e;->e:Ljava/lang/Long;

    move-object/from16 v0, v19

    iget-object v4, v0, Lcom/google/android/gms/internal/amw$e;->b:[Lcom/google/android/gms/internal/amw$b;

    const/4 v5, 0x0

    aget-object v4, v4, v5

    iget-object v4, v4, Lcom/google/android/gms/internal/amw$b;->c:Ljava/lang/Long;

    move-object/from16 v0, v19

    iput-object v4, v0, Lcom/google/android/gms/internal/amw$e;->f:Ljava/lang/Long;

    const/4 v4, 0x1

    :goto_b
    move-object/from16 v0, v19

    iget-object v5, v0, Lcom/google/android/gms/internal/amw$e;->b:[Lcom/google/android/gms/internal/amw$b;

    array-length v5, v5

    if-ge v4, v5, :cond_14

    move-object/from16 v0, v19

    iget-object v5, v0, Lcom/google/android/gms/internal/amw$e;->b:[Lcom/google/android/gms/internal/amw$b;

    aget-object v5, v5, v4

    iget-object v6, v5, Lcom/google/android/gms/internal/amw$b;->c:Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    move-object/from16 v0, v19

    iget-object v8, v0, Lcom/google/android/gms/internal/amw$e;->e:Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    cmp-long v6, v6, v8

    if-gez v6, :cond_12

    iget-object v6, v5, Lcom/google/android/gms/internal/amw$b;->c:Ljava/lang/Long;

    move-object/from16 v0, v19

    iput-object v6, v0, Lcom/google/android/gms/internal/amw$e;->e:Ljava/lang/Long;

    :cond_12
    iget-object v6, v5, Lcom/google/android/gms/internal/amw$b;->c:Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    move-object/from16 v0, v19

    iget-object v8, v0, Lcom/google/android/gms/internal/amw$e;->f:Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    cmp-long v6, v6, v8

    if-lez v6, :cond_13

    iget-object v5, v5, Lcom/google/android/gms/internal/amw$b;->c:Ljava/lang/Long;

    move-object/from16 v0, v19

    iput-object v5, v0, Lcom/google/android/gms/internal/amw$e;->f:Ljava/lang/Long;

    :cond_13
    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    :cond_14
    move-object/from16 v0, v18

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/aj$a;->a:Lcom/google/android/gms/internal/amw$e;

    iget-object v8, v4, Lcom/google/android/gms/internal/amw$e;->o:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/measurement/internal/q;->b(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/a;

    move-result-object v9

    if-nez v9, :cond_15

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v4

    const-string v5, "Bundling raw events w/o app info"

    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :goto_c
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/ab;->F()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, v19

    iput-object v4, v0, Lcom/google/android/gms/internal/amw$e;->x:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v4

    move-object/from16 v0, v19

    invoke-virtual {v4, v0, v15}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/internal/amw$e;Z)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v4

    move-object/from16 v0, v18

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/aj$a;->b:Ljava/util/List;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/q;->a(Ljava/util/List;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/google/android/gms/measurement/internal/q;->i(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/q;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/q;->z()V

    const/4 v4, 0x1

    :goto_d
    return v4

    :cond_15
    :try_start_1
    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/a;->h()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-eqz v6, :cond_16

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_e
    move-object/from16 v0, v19

    iput-object v6, v0, Lcom/google/android/gms/internal/amw$e;->h:Ljava/lang/Long;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/a;->g()J

    move-result-wide v6

    const-wide/16 v10, 0x0

    cmp-long v10, v6, v10

    if-nez v10, :cond_19

    :goto_f
    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-eqz v6, :cond_17

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    :goto_10
    move-object/from16 v0, v19

    iput-object v4, v0, Lcom/google/android/gms/internal/amw$e;->g:Ljava/lang/Long;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/a;->r()V

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/a;->o()J

    move-result-wide v4

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v0, v19

    iput-object v4, v0, Lcom/google/android/gms/internal/amw$e;->w:Ljava/lang/Integer;

    move-object/from16 v0, v19

    iget-object v4, v0, Lcom/google/android/gms/internal/amw$e;->e:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v9, v4, v5}, Lcom/google/android/gms/measurement/internal/a;->a(J)V

    move-object/from16 v0, v19

    iget-object v4, v0, Lcom/google/android/gms/internal/amw$e;->f:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v9, v4, v5}, Lcom/google/android/gms/measurement/internal/a;->b(J)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v4

    invoke-virtual {v4, v9}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/measurement/internal/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_c

    :catchall_0
    move-exception v4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/q;->z()V

    throw v4

    :cond_16
    const/4 v6, 0x0

    goto :goto_e

    :cond_17
    const/4 v4, 0x0

    goto :goto_10

    :cond_18
    :try_start_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/q;->g()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/q;->z()V

    const/4 v4, 0x0

    goto :goto_d

    :cond_19
    move-wide v4, v6

    goto :goto_f

    :cond_1a
    move v5, v7

    goto/16 :goto_9

    :cond_1b
    move-object v5, v6

    move v6, v7

    goto/16 :goto_7

    :cond_1c
    move/from16 v15, v16

    goto/16 :goto_5

    :cond_1d
    move v4, v6

    goto/16 :goto_3
.end method

.method private a(Ljava/lang/String;[Lcom/google/android/gms/internal/amw$g;[Lcom/google/android/gms/internal/amw$b;)[Lcom/google/android/gms/internal/amw$a;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->y()Lcom/google/android/gms/measurement/internal/o;

    move-result-object v0

    invoke-virtual {v0, p1, p3, p2}, Lcom/google/android/gms/measurement/internal/o;->a(Ljava/lang/String;[Lcom/google/android/gms/internal/amw$b;[Lcom/google/android/gms/internal/amw$g;)[Lcom/google/android/gms/internal/amw$a;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/google/android/gms/measurement/internal/b;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Component not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/b;->a()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Component not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method private c(Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    .locals 8
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/q;->b(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/a;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/af;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    if-nez v2, :cond_9

    new-instance v0, Lcom/google/android/gms/measurement/internal/a;

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-direct {v0, p0, v2}, Lcom/google/android/gms/measurement/internal/a;-><init>(Lcom/google/android/gms/measurement/internal/aj;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/af;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/a;->a(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/a;->c(Ljava/lang/String;)V

    move-object v2, v0

    move v0, v1

    :cond_0
    :goto_0
    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->c:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->c:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->c:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/a;->b(Ljava/lang/String;)V

    move v0, v1

    :cond_1
    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->l:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->l:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->l:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/a;->d(Ljava/lang/String;)V

    move v0, v1

    :cond_2
    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->f:J

    const-wide/16 v6, 0x0

    cmp-long v3, v4, v6

    if-eqz v3, :cond_3

    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->f:J

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->l()J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-eqz v3, :cond_3

    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->f:J

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/measurement/internal/a;->d(J)V

    move v0, v1

    :cond_3
    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->d:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->d:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->d:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/a;->e(Ljava/lang/String;)V

    move v0, v1

    :cond_4
    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->k:J

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->j()J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-eqz v3, :cond_5

    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->k:J

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/measurement/internal/a;->c(J)V

    move v0, v1

    :cond_5
    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->e:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->e:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->k()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->e:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/a;->f(Ljava/lang/String;)V

    move v0, v1

    :cond_6
    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->g:J

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->m()J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-eqz v3, :cond_7

    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->g:J

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/measurement/internal/a;->e(J)V

    move v0, v1

    :cond_7
    iget-boolean v3, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->i:Z

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->n()Z

    move-result v4

    if-eq v3, v4, :cond_a

    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->i:Z

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/a;->a(Z)V

    :goto_1
    if-eqz v1, :cond_8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/measurement/internal/a;)V

    :cond_8
    return-void

    :cond_9
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/a;->c(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/af;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/a;->a(Ljava/lang/String;)V

    move v0, v1

    goto/16 :goto_0

    :cond_a
    move v1, v0

    goto :goto_1
.end method


# virtual methods
.method A()Ljava/nio/channels/FileChannel;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->z:Ljava/nio/channels/FileChannel;

    return-object v0
.end method

.method B()V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->A()Ljava/nio/channels/FileChannel;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->a(Ljava/nio/channels/FileChannel;)I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->v()Lcom/google/android/gms/measurement/internal/z;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/z;->A()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/measurement/internal/aj;->a(II)Z

    :cond_0
    return-void
.end method

.method C()Z
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->l:Lcom/google/android/gms/measurement/internal/q;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->B()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->r()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "rw"

    invoke-direct {v0, v2, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->z:Ljava/nio/channels/FileChannel;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->z:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->y:Ljava/nio/channels/FileLock;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->y:Ljava/nio/channels/FileLock;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Storage concurrent access okay"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Storage concurrent data access panic"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "Failed to acquire storage lock"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "Failed to access storage lock file"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public D()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public E()Z
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p;->P()Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p;->Q()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/af;->c(Z)Z

    move-result v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p;->R()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1
.end method

.method F()J
    .locals 6

    const-wide/16 v4, 0x3c

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/af;->z()J

    move-result-wide v2

    add-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    div-long/2addr v0, v4

    div-long/2addr v0, v4

    const-wide/16 v2, 0x18

    div-long/2addr v0, v2

    return-wide v0
.end method

.method G()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected call on package side"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method H()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected call on client side"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public I()V
    .locals 12
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/af;->B()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Upload data called on the client side before use of service was decided"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Upload called in the client side when service should be used"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/aj;->M()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Uploading requested multiple times"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->q()Lcom/google/android/gms/measurement/internal/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ac;->f()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Network not connected, ignoring upload request"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/aj;->O()V

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->Z()J

    move-result-wide v0

    sub-long v0, v8, v0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/measurement/internal/aj;->a(J)Z

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/af;->c:Lcom/google/android/gms/measurement/internal/af$b;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/af$b;->a()J

    move-result-wide v0

    const-wide/16 v6, 0x0

    cmp-long v2, v0, v6

    if-eqz v2, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->D()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v4, "Uploading events. Elapsed time since last upload attempt (ms)"

    sub-long v0, v8, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->C()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/p;->h(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/measurement/internal/p;->i(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v4

    invoke-virtual {v4, v1, v0, v2}, Lcom/google/android/gms/measurement/internal/q;->a(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/amw$e;

    iget-object v6, v0, Lcom/google/android/gms/internal/amw$e;->s:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_6

    iget-object v0, v0, Lcom/google/android/gms/internal/amw$e;->s:Ljava/lang/String;

    move-object v6, v0

    :goto_1
    if-eqz v6, :cond_e

    move v2, v3

    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_e

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/amw$e;

    iget-object v7, v0, Lcom/google/android/gms/internal/amw$e;->s:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_8

    :cond_7
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    :cond_8
    iget-object v0, v0, Lcom/google/android/gms/internal/amw$e;->s:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-interface {v4, v3, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    move-object v2, v0

    :goto_3
    new-instance v6, Lcom/google/android/gms/internal/amw$d;

    invoke-direct {v6}, Lcom/google/android/gms/internal/amw$d;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/gms/internal/amw$e;

    iput-object v0, v6, Lcom/google/android/gms/internal/amw$d;->a:[Lcom/google/android/gms/internal/amw$e;

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_4
    iget-object v0, v6, Lcom/google/android/gms/internal/amw$d;->a:[Lcom/google/android/gms/internal/amw$e;

    array-length v0, v0

    if-ge v3, v0, :cond_9

    iget-object v7, v6, Lcom/google/android/gms/internal/amw$d;->a:[Lcom/google/android/gms/internal/amw$e;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/amw$e;

    aput-object v0, v7, v3

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v6, Lcom/google/android/gms/internal/amw$d;->a:[Lcom/google/android/gms/internal/amw$e;

    aget-object v0, v0, v3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/p;->M()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iput-object v7, v0, Lcom/google/android/gms/internal/amw$e;->r:Ljava/lang/Long;

    iget-object v0, v6, Lcom/google/android/gms/internal/amw$d;->a:[Lcom/google/android/gms/internal/amw$e;

    aget-object v0, v0, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iput-object v7, v0, Lcom/google/android/gms/internal/amw$e;->d:Ljava/lang/Long;

    iget-object v0, v6, Lcom/google/android/gms/internal/amw$d;->a:[Lcom/google/android/gms/internal/amw$e;

    aget-object v0, v0, v3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iput-object v7, v0, Lcom/google/android/gms/internal/amw$e;->z:Ljava/lang/Boolean;

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_9
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/ab;->a(I)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {v6}, Lcom/google/android/gms/measurement/internal/m;->b(Lcom/google/android/gms/internal/amw$d;)Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/google/android/gms/measurement/internal/m;->a(Lcom/google/android/gms/internal/amw$d;)[B

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/p;->Y()Ljava/lang/String;

    move-result-object v7

    :try_start_0
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, v7}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v4}, Lcom/google/android/gms/measurement/internal/aj;->a(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v4

    iget-object v4, v4, Lcom/google/android/gms/measurement/internal/af;->d:Lcom/google/android/gms/measurement/internal/af$b;

    invoke-virtual {v4, v8, v9}, Lcom/google/android/gms/measurement/internal/af$b;->a(J)V

    const-string v4, "?"

    iget-object v5, v6, Lcom/google/android/gms/internal/amw$d;->a:[Lcom/google/android/gms/internal/amw$e;

    array-length v5, v5

    if-lez v5, :cond_a

    iget-object v4, v6, Lcom/google/android/gms/internal/amw$d;->a:[Lcom/google/android/gms/internal/amw$e;

    const/4 v5, 0x0

    aget-object v4, v4, v5

    iget-object v4, v4, Lcom/google/android/gms/internal/amw$e;->o:Ljava/lang/String;

    :cond_a
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v5

    const-string v6, "Uploading data. app, uncompressed size, data"

    array-length v8, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v5, v6, v4, v8, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->q()Lcom/google/android/gms/measurement/internal/ac;

    move-result-object v0

    const/4 v4, 0x0

    new-instance v5, Lcom/google/android/gms/measurement/internal/aj$2;

    invoke-direct {v5, p0}, Lcom/google/android/gms/measurement/internal/aj$2;-><init>(Lcom/google/android/gms/measurement/internal/aj;)V

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/ac;->a(Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/ac$a;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Failed to parse upload URL. Not uploading"

    invoke-virtual {v0, v1, v7}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_b
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/p;->Z()J

    move-result-wide v2

    sub-long v2, v8, v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/q;->b(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/q;->b(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/p;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :try_start_1
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v4

    const-string v6, "Fetching remote configuration"

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/a;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->j()Lcom/google/android/gms/measurement/internal/ah;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/google/android/gms/measurement/internal/ah;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/amv$b;

    move-result-object v4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->j()Lcom/google/android/gms/measurement/internal/ah;

    move-result-object v6

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Lcom/google/android/gms/measurement/internal/ah;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v4, :cond_c

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_c

    new-instance v5, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v5}, Landroid/support/v4/util/ArrayMap;-><init>()V

    const-string v4, "If-Modified-Since"

    invoke-interface {v5, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->q()Lcom/google/android/gms/measurement/internal/ac;

    move-result-object v1

    new-instance v4, Lcom/google/android/gms/measurement/internal/aj$3;

    invoke-direct {v4, p0}, Lcom/google/android/gms/measurement/internal/aj$3;-><init>(Lcom/google/android/gms/measurement/internal/aj;)V

    invoke-virtual {v1, v0, v3, v5, v4}, Lcom/google/android/gms/measurement/internal/ac;->a(Ljava/lang/String;Ljava/net/URL;Ljava/util/Map;Lcom/google/android/gms/measurement/internal/ac$a;)V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Failed to parse config URL. Not fetching"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_d
    move-object v0, v5

    goto/16 :goto_5

    :cond_e
    move-object v2, v4

    goto/16 :goto_3

    :cond_f
    move-object v6, v5

    goto/16 :goto_1
.end method

.method J()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/measurement/internal/aj;->C:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/measurement/internal/aj;->C:I

    return-void
.end method

.method K()V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/aj;->w:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->C()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "This instance being marked as an uploader"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->B()V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/aj;->w:Z

    return-void
.end method

.method L()Z
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/aj;->w:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->D()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(Ljava/nio/channels/FileChannel;)I
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v4, 0x4

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->isOpen()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "Bad chanel to read from"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return v0

    :cond_2
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    const-wide/16 v2, 0x0

    :try_start_0
    invoke-virtual {p1, v2, v3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {p1, v1}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v2

    if-eq v2, v4, :cond_3

    const/4 v1, -0x1

    if-eq v2, v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v3, "Unexpected data length. Bytes read"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "Failed to read from channel"

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    :try_start_1
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    goto :goto_0
.end method

.method a()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/measurement/internal/aj;->v:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "AppMeasurement is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method a(Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/aj;->c(Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    return-void
.end method

.method a(Lcom/google/android/gms/measurement/internal/AppMetadata;J)V
    .locals 6
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/q;->b(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a;->d()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "New GMP App Id passed in. Removing cached database data."

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/q;->g(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a;->i()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a;->i()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v1, "_pv"

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/measurement/internal/EventParcel;

    const-string v1, "_au"

    new-instance v2, Lcom/google/android/gms/measurement/internal/EventParams;

    invoke-direct {v2, v3}, Lcom/google/android/gms/measurement/internal/EventParams;-><init>(Landroid/os/Bundle;)V

    const-string v3, "auto"

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/EventParcel;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/EventParams;Ljava/lang/String;J)V

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/aj;->a(Lcom/google/android/gms/measurement/internal/EventParcel;Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    :cond_1
    return-void
.end method

.method a(Lcom/google/android/gms/measurement/internal/EventParcel;Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    .locals 18
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v16

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    move-object/from16 v0, p2

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-object/from16 v0, p2

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/AppMetadata;->c:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    return-void

    :cond_0
    move-object/from16 v0, p2

    iget-boolean v2, v0, Lcom/google/android/gms/measurement/internal/AppMetadata;->i:Z

    if-nez v2, :cond_1

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/google/android/gms/measurement/internal/aj;->c(Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    goto :goto_0

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->j()Lcom/google/android/gms/measurement/internal/ah;

    move-result-object v2

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/measurement/internal/ah;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "Dropping blacklisted event"

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    const/16 v3, 0xb

    const-string v4, "_ev"

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/google/android/gms/measurement/internal/m;->a(ILjava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/ab;->a(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "Logging event"

    move-object/from16 v0, p1

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->f()V

    :try_start_0
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->c:Lcom/google/android/gms/measurement/internal/EventParams;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/EventParams;->b()Landroid/os/Bundle;

    move-result-object v14

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/google/android/gms/measurement/internal/aj;->c(Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    const-string v2, "_iap"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string v2, "ecommerce_purchase"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_4
    const-string v2, "currency"

    invoke-virtual {v14, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v2, "ecommerce_purchase"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const-string v2, "value"

    invoke-virtual {v14, v2}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    const-wide v6, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v2, v6

    const-wide/16 v6, 0x0

    cmpl-double v6, v2, v6

    if-nez v6, :cond_5

    const-string v2, "value"

    invoke-virtual {v14, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    long-to-double v2, v2

    const-wide v6, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v2, v6

    :cond_5
    const-wide/high16 v6, 0x43e0000000000000L    # 9.223372036854776E18

    cmpg-double v6, v2, v6

    if-gtz v6, :cond_9

    const-wide/high16 v6, -0x3c20000000000000L    # -9.223372036854776E18

    cmpl-double v6, v2, v6

    if-ltz v6, :cond_9

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    move-wide v8, v2

    :goto_1
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v5, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "[A-Z]{3}"

    invoke-virtual {v2, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    const-string v3, "_ltv_"

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/measurement/internal/q;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/l;

    move-result-object v2

    if-eqz v2, :cond_6

    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/l;->d:Ljava/lang/Object;

    instance-of v3, v3, Ljava/lang/Long;

    if-nez v3, :cond_c

    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/measurement/internal/p;->e(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/measurement/internal/q;->a(Ljava/lang/String;I)V

    new-instance v3, Lcom/google/android/gms/measurement/internal/l;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v6

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/measurement/internal/l;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/measurement/internal/l;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v5, "Too many unique user properties are set. Ignoring user property."

    iget-object v6, v3, Lcom/google/android/gms/measurement/internal/l;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/l;->d:Ljava/lang/Object;

    invoke-virtual {v2, v5, v6, v3}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    const/16 v3, 0x9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {v2, v3, v5, v6, v7}, Lcom/google/android/gms/measurement/internal/m;->a(ILjava/lang/String;Ljava/lang/String;I)V

    :cond_7
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/m;->a(Ljava/lang/String;)Z

    move-result v10

    const-string v2, "_err"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->F()J

    move-result-wide v6

    const/4 v9, 0x1

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v8, v4

    invoke-virtual/range {v5 .. v13}, Lcom/google/android/gms/measurement/internal/q;->a(JLjava/lang/String;ZZZZZ)Lcom/google/android/gms/measurement/internal/q$a;

    move-result-object v2

    iget-wide v6, v2, Lcom/google/android/gms/measurement/internal/q$a;->b:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/p;->C()J

    move-result-wide v8

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x0

    cmp-long v3, v6, v8

    if-lez v3, :cond_d

    const-wide/16 v4, 0x3e8

    rem-long v4, v6, v4

    const-wide/16 v6, 0x1

    cmp-long v3, v4, v6

    if-nez v3, :cond_8

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v3

    const-string v4, "Data loss. Too many events logged. count"

    iget-wide v6, v2, Lcom/google/android/gms/measurement/internal/q$a;->b:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    const/16 v3, 0x10

    const-string v4, "_ev"

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/google/android/gms/measurement/internal/m;->a(ILjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->z()V

    goto/16 :goto_0

    :cond_9
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v4

    const-string v5, "Data lost. Currency value is too big"

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v4, v5, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->z()V

    goto/16 :goto_0

    :cond_a
    :try_start_2
    const-string v2, "value"

    invoke-virtual {v14, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    move-wide v8, v2

    goto/16 :goto_1

    :cond_b
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/q;->z()V

    throw v2

    :cond_c
    :try_start_3
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/l;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    new-instance v3, Lcom/google/android/gms/measurement/internal/l;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v6

    add-long/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/measurement/internal/l;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    goto/16 :goto_3

    :cond_d
    if-eqz v10, :cond_f

    iget-wide v6, v2, Lcom/google/android/gms/measurement/internal/q$a;->a:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/p;->D()J

    move-result-wide v8

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x0

    cmp-long v3, v6, v8

    if-lez v3, :cond_f

    const-wide/16 v4, 0x3e8

    rem-long v4, v6, v4

    const-wide/16 v6, 0x1

    cmp-long v3, v4, v6

    if-nez v3, :cond_e

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v3

    const-string v4, "Data loss. Too many public events logged. count"

    iget-wide v6, v2, Lcom/google/android/gms/measurement/internal/q$a;->a:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    const/16 v3, 0x10

    const-string v4, "_ev"

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/google/android/gms/measurement/internal/m;->a(ILjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->g()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->z()V

    goto/16 :goto_0

    :cond_f
    if-eqz v12, :cond_11

    :try_start_4
    iget-wide v6, v2, Lcom/google/android/gms/measurement/internal/q$a;->d:J

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v3

    move-object/from16 v0, p2

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-virtual {v3, v5}, Lcom/google/android/gms/measurement/internal/p;->a(Ljava/lang/String;)I

    move-result v3

    int-to-long v8, v3

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x0

    cmp-long v3, v6, v8

    if-lez v3, :cond_11

    const-wide/16 v4, 0x1

    cmp-long v3, v6, v4

    if-nez v3, :cond_10

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v3

    const-string v4, "Too many error events logged. count"

    iget-wide v6, v2, Lcom/google/android/gms/measurement/internal/q$a;->d:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_10
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->g()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->z()V

    goto/16 :goto_0

    :cond_11
    :try_start_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    const-string v3, "_o"

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->d:Ljava/lang/String;

    invoke-virtual {v2, v14, v3, v5}, Lcom/google/android/gms/measurement/internal/m;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/measurement/internal/m;->m(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    const-string v3, "_dbg"

    const-wide/16 v6, 0x1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v14, v3, v5}, Lcom/google/android/gms/measurement/internal/m;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    const-string v3, "_r"

    const-wide/16 v6, 0x1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v14, v3, v5}, Lcom/google/android/gms/measurement/internal/m;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_12
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/measurement/internal/q;->c(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v6, 0x0

    cmp-long v5, v2, v6

    if-lez v5, :cond_13

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v5

    const-string v6, "Data lost. Too many events stored on disk, deleted"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v5, v6, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_13
    new-instance v5, Lcom/google/android/gms/measurement/internal/t;

    move-object/from16 v0, p1

    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->d:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v9, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-wide v10, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->e:J

    const-wide/16 v12, 0x0

    move-object/from16 v6, p0

    move-object v8, v4

    invoke-direct/range {v5 .. v14}, Lcom/google/android/gms/measurement/internal/t;-><init>(Lcom/google/android/gms/measurement/internal/aj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    iget-object v3, v5, Lcom/google/android/gms/measurement/internal/t;->b:Ljava/lang/String;

    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/measurement/internal/q;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/u;

    move-result-object v2

    if-nez v2, :cond_16

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/measurement/internal/q;->j(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/p;->B()I

    move-result v6

    int-to-long v6, v6

    cmp-long v2, v2, v6

    if-ltz v2, :cond_14

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "Too many event names used, ignoring event. name, supported count"

    iget-object v4, v5, Lcom/google/android/gms/measurement/internal/t;->b:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/p;->B()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    const/16 v3, 0x8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/google/android/gms/measurement/internal/m;->a(ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->z()V

    goto/16 :goto_0

    :cond_14
    :try_start_6
    new-instance v7, Lcom/google/android/gms/measurement/internal/u;

    iget-object v9, v5, Lcom/google/android/gms/measurement/internal/t;->b:Ljava/lang/String;

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    iget-wide v14, v5, Lcom/google/android/gms/measurement/internal/t;->d:J

    move-object v8, v4

    invoke-direct/range {v7 .. v15}, Lcom/google/android/gms/measurement/internal/u;-><init>(Ljava/lang/String;Ljava/lang/String;JJJ)V

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/measurement/internal/u;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual {v0, v5, v1}, Lcom/google/android/gms/measurement/internal/aj;->a(Lcom/google/android/gms/measurement/internal/t;Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->g()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/ab;->a(I)Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "Event recorded"

    invoke-virtual {v2, v3, v5}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_15
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->z()V

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->O()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "Background event processing time, ms"

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long v4, v4, v16

    const-wide/32 v6, 0x7a120

    add-long/2addr v4, v6

    const-wide/32 v6, 0xf4240

    div-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_16
    :try_start_7
    iget-wide v6, v2, Lcom/google/android/gms/measurement/internal/u;->e:J

    move-object/from16 v0, p0

    invoke-virtual {v5, v0, v6, v7}, Lcom/google/android/gms/measurement/internal/t;->a(Lcom/google/android/gms/measurement/internal/aj;J)Lcom/google/android/gms/measurement/internal/t;

    move-result-object v5

    iget-wide v6, v5, Lcom/google/android/gms/measurement/internal/t;->d:J

    invoke-virtual {v2, v6, v7}, Lcom/google/android/gms/measurement/internal/u;->a(J)Lcom/google/android/gms/measurement/internal/u;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-result-object v7

    goto :goto_4
.end method

.method a(Lcom/google/android/gms/measurement/internal/EventParcel;Ljava/lang/String;)V
    .locals 18
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/q;->b(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/a;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->i()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->D()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "No app data available; dropping event"

    move-object/from16 v0, p2

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->r()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/4 v4, 0x0

    move-object/from16 v0, p2

    invoke-virtual {v3, v0, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->i()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v3

    const-string v4, "App version does not match; dropping event"

    move-object/from16 v0, p2

    invoke-virtual {v3, v4, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v3, "_ui"

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v3

    const-string v4, "Could not find package"

    move-object/from16 v0, p2

    invoke-virtual {v3, v4, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    new-instance v3, Lcom/google/android/gms/measurement/internal/AppMetadata;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->j()J

    move-result-wide v7

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->k()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->l()J

    move-result-wide v10

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->m()J

    move-result-wide v12

    const/4 v14, 0x0

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->n()Z

    move-result v15

    const/16 v16, 0x0

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/a;->f()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v4, p2

    invoke-direct/range {v3 .. v17}, Lcom/google/android/gms/measurement/internal/AppMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/measurement/internal/aj;->a(Lcom/google/android/gms/measurement/internal/EventParcel;Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    goto :goto_0
.end method

.method a(Lcom/google/android/gms/measurement/internal/UserAttributeParcel;Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    .locals 7
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v5, 0x1

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->c:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-boolean v1, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->i:Z

    if-nez v1, :cond_2

    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/aj;->c(Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/m;->e(Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/p;->d()I

    move-result v4

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/m;->a(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->b:Ljava/lang/String;

    if-eqz v3, :cond_3

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v3

    const-string v4, "_ev"

    invoke-virtual {v3, v1, v4, v2, v0}, Lcom/google/android/gms/measurement/internal/m;->a(ILjava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/m;->c(Ljava/lang/String;Ljava/lang/Object;)I

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/p;->d()I

    move-result v4

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/m;->a(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->a()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_6

    instance-of v4, v3, Ljava/lang/String;

    if-nez v4, :cond_5

    instance-of v4, v3, Ljava/lang/CharSequence;

    if-eqz v4, :cond_6

    :cond_5
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v3

    const-string v4, "_ev"

    invoke-virtual {v3, v1, v4, v2, v0}, Lcom/google/android/gms/measurement/internal/m;->a(ILjava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/m;->d(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_0

    new-instance v1, Lcom/google/android/gms/measurement/internal/l;

    iget-object v2, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->b:Ljava/lang/String;

    iget-wide v4, p1, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->c:J

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/l;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->D()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v2, "Setting user property"

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/l;->b:Ljava/lang/String;

    invoke-virtual {v0, v2, v3, v6}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->f()V

    :try_start_0
    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/aj;->c(Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/measurement/internal/l;)Z

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->g()V

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->D()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v2, "User property set"

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/l;->b:Ljava/lang/String;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/l;->d:Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->z()V

    goto/16 :goto_0

    :cond_8
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v2, "Too many unique user properties are set. Ignoring user property."

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/l;->b:Ljava/lang/String;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/l;->d:Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v0

    const/16 v1, 0x9

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/m;->a(ILjava/lang/String;Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q;->z()V

    throw v0
.end method

.method a(Lcom/google/android/gms/measurement/internal/b;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/measurement/internal/aj;->B:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/measurement/internal/aj;->B:I

    return-void
.end method

.method a(Lcom/google/android/gms/measurement/internal/t;Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    .locals 8

    const-wide/16 v6, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/t;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/t;->a:Ljava/lang/String;

    iget-object v2, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    new-instance v2, Lcom/google/android/gms/internal/amw$e;

    invoke-direct {v2}, Lcom/google/android/gms/internal/amw$e;-><init>()V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->a:Ljava/lang/Integer;

    const-string v0, "android"

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->i:Ljava/lang/String;

    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->o:Ljava/lang/String;

    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->e:Ljava/lang/String;

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->n:Ljava/lang/String;

    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->d:Ljava/lang/String;

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->p:Ljava/lang/String;

    iget-wide v4, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->k:J

    long-to-int v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->C:Ljava/lang/Integer;

    iget-wide v4, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->f:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->q:Ljava/lang/Long;

    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->c:Ljava/lang/String;

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->y:Ljava/lang/String;

    iget-wide v4, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->g:J

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    move-object v0, v1

    :goto_0
    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->v:Ljava/lang/Long;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    iget-object v3, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/af;->a(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v0, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->s:Ljava/lang/String;

    iget-object v0, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->t:Ljava/lang/Boolean;

    :cond_0
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->u()Lcom/google/android/gms/measurement/internal/s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/s;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->k:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->u()Lcom/google/android/gms/measurement/internal/s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/s;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->j:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->u()Lcom/google/android/gms/measurement/internal/s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/s;->z()J

    move-result-wide v4

    long-to-int v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->m:Ljava/lang/Integer;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->u()Lcom/google/android/gms/measurement/internal/s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/s;->A()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->l:Ljava/lang/String;

    iput-object v1, v2, Lcom/google/android/gms/internal/amw$e;->r:Ljava/lang/Long;

    iput-object v1, v2, Lcom/google/android/gms/internal/amw$e;->d:Ljava/lang/Long;

    iput-object v1, v2, Lcom/google/android/gms/internal/amw$e;->e:Ljava/lang/Long;

    iput-object v1, v2, Lcom/google/android/gms/internal/amw$e;->f:Ljava/lang/Long;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/q;->b(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/a;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/measurement/internal/a;

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/measurement/internal/a;-><init>(Lcom/google/android/gms/measurement/internal/aj;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/af;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/a;->a(Ljava/lang/String;)V

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/a;->d(Ljava/lang/String;)V

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/a;->b(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v1

    iget-object v3, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/measurement/internal/af;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/a;->c(Ljava/lang/String;)V

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/measurement/internal/a;->f(J)V

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/measurement/internal/a;->a(J)V

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/measurement/internal/a;->b(J)V

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/a;->e(Ljava/lang/String;)V

    iget-wide v4, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->k:J

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/measurement/internal/a;->c(J)V

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/a;->f(Ljava/lang/String;)V

    iget-wide v4, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->f:J

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/measurement/internal/a;->d(J)V

    iget-wide v4, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->g:J

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/measurement/internal/a;->e(J)V

    iget-boolean v1, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->i:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/a;->a(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/measurement/internal/a;)V

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lcom/google/android/gms/internal/amw$e;->u:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->B:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/q;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/gms/internal/amw$g;

    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->c:[Lcom/google/android/gms/internal/amw$g;

    const/4 v0, 0x0

    move v1, v0

    :goto_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_6

    new-instance v4, Lcom/google/android/gms/internal/amw$g;

    invoke-direct {v4}, Lcom/google/android/gms/internal/amw$g;-><init>()V

    iget-object v0, v2, Lcom/google/android/gms/internal/amw$e;->c:[Lcom/google/android/gms/internal/amw$g;

    aput-object v4, v0, v1

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/l;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/l;->b:Ljava/lang/String;

    iput-object v0, v4, Lcom/google/android/gms/internal/amw$g;->b:Ljava/lang/String;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/l;

    iget-wide v6, v0, Lcom/google/android/gms/measurement/internal/l;->c:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v4, Lcom/google/android/gms/internal/amw$g;->a:Ljava/lang/Long;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v5

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/l;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/l;->d:Ljava/lang/Object;

    invoke-virtual {v5, v4, v0}, Lcom/google/android/gms/measurement/internal/m;->a(Lcom/google/android/gms/internal/amw$g;Ljava/lang/Object;)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_2
    iget-wide v4, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->g:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto/16 :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->u()Lcom/google/android/gms/measurement/internal/s;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/aj;->b:Landroid/content/Context;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/s;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v3, "android_id"

    invoke-static {v0, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v3, "null secure ID"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    const-string v0, "null"

    :cond_4
    :goto_3
    iput-object v0, v2, Lcom/google/android/gms/internal/amw$e;->F:Ljava/lang/String;

    goto/16 :goto_1

    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v3

    const-string v4, "empty secure ID"

    invoke-virtual {v3, v4}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/internal/amw$e;)J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/aj;->a(Lcom/google/android/gms/measurement/internal/t;)Z

    move-result v3

    invoke-virtual {v2, p1, v0, v1, v3}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/measurement/internal/t;JZ)V

    :goto_4
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "Data loss. Failed to insert raw event metadata"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_4
.end method

.method a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 7
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Throwable;",
            "[B",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    const/16 v6, 0x130

    const/4 v1, 0x1

    const/16 v5, 0x194

    const/4 v2, 0x0

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    if-nez p4, :cond_0

    new-array p4, v0, [B

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/q;->f()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/google/android/gms/measurement/internal/q;->b(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/a;

    move-result-object v4

    const/16 v3, 0xc8

    if-eq p2, v3, :cond_1

    const/16 v3, 0xcc

    if-eq p2, v3, :cond_1

    if-ne p2, v6, :cond_2

    :cond_1
    if-nez p3, :cond_2

    move v3, v1

    :goto_0
    if-nez v4, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "App does not exist in onConfigFetched"

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->z()V

    :goto_2
    return-void

    :cond_2
    move v3, v0

    goto :goto_0

    :cond_3
    if-nez v3, :cond_4

    if-ne p2, v5, :cond_c

    :cond_4
    if-eqz p5, :cond_6

    :try_start_1
    const-string v0, "Last-Modified"

    invoke-interface {p5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    :goto_3
    if-eqz v0, :cond_7

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_7

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_4
    if-eq p2, v5, :cond_5

    if-ne p2, v6, :cond_8

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->j()Lcom/google/android/gms/measurement/internal/ah;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/measurement/internal/ah;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/amv$b;

    move-result-object v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->j()Lcom/google/android/gms/measurement/internal/ah;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/measurement/internal/ah;->a(Ljava/lang/String;[BLjava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->z()V

    goto :goto_2

    :cond_6
    move-object v0, v2

    goto :goto_3

    :cond_7
    move-object v0, v2

    goto :goto_4

    :cond_8
    :try_start_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->j()Lcom/google/android/gms/measurement/internal/ah;

    move-result-object v1

    invoke-virtual {v1, p1, p4, v0}, Lcom/google/android/gms/measurement/internal/ah;->a(Ljava/lang/String;[BLjava/lang/String;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->z()V

    goto :goto_2

    :cond_9
    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/google/android/gms/measurement/internal/a;->g(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/measurement/internal/a;)V

    if-ne p2, v5, :cond_a

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->z()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Config not found. Using empty config"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :goto_5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->q()Lcom/google/android/gms/measurement/internal/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ac;->f()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/aj;->N()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->I()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q;->z()V

    throw v0

    :cond_a
    :try_start_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Successfully fetched config. Got network response. code, size"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    array-length v3, p4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_b
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/aj;->O()V

    goto/16 :goto_1

    :cond_c
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v2

    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/measurement/internal/a;->h(J)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/measurement/internal/a;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "Fetching config failed. code, error"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4, p3}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->j()Lcom/google/android/gms/measurement/internal/ah;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/android/gms/measurement/internal/ah;->c(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/af;->d:Lcom/google/android/gms/measurement/internal/af$b;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/measurement/internal/af$b;->a(J)V

    const/16 v2, 0x1f7

    if-eq p2, v2, :cond_d

    const/16 v2, 0x1ad

    if-ne p2, v2, :cond_e

    :cond_d
    move v0, v1

    :cond_e
    if-eqz v0, :cond_f

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/af;->e:Lcom/google/android/gms/measurement/internal/af$b;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/af$b;->a(J)V

    :cond_f
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/aj;->O()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_1
.end method

.method public a(Z)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/aj;->O()V

    return-void
.end method

.method a(II)Z
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    if-le p1, p2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "Panic: can\'t downgrade version. Previous, current version"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return v0

    :cond_0
    if-ge p1, p2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->A()Ljava/nio/channels/FileChannel;

    move-result-object v1

    invoke-virtual {p0, p2, v1}, Lcom/google/android/gms/measurement/internal/aj;->a(ILjava/nio/channels/FileChannel;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->E()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Storage version upgraded. Previous, current version"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v1

    const-string v2, "Storage version upgrade failed. Previous, current version"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method a(ILjava/nio/channels/FileChannel;)Z
    .locals 6
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->isOpen()Z

    move-result v2

    if-nez v2, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v2, "Bad chanel to read from"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    move v0, v1

    :cond_1
    :goto_0
    return v0

    :cond_2
    const/4 v2, 0x4

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    const-wide/16 v4, 0x0

    :try_start_0
    invoke-virtual {p2, v4, v5}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {p2, v2}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    const/4 v2, 0x1

    invoke-virtual {p2, v2}, Ljava/nio/channels/FileChannel;->force(Z)V

    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v2

    const-wide/16 v4, 0x4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "Error writing to channel. Bytes written"

    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "Failed to write to channel"

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move v0, v1

    goto :goto_0
.end method

.method a(J)Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/measurement/internal/aj;->a(Ljava/lang/String;J)Z

    move-result v0

    return v0
.end method

.method public b(Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    .locals 8
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const-wide/32 v6, 0x36ee80

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->i:Z

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/aj;->c(Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->f()V

    :try_start_0
    invoke-virtual {p0, p1, v2, v3}, Lcom/google/android/gms/measurement/internal/aj;->a(Lcom/google/android/gms/measurement/internal/AppMetadata;J)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/aj;->c(Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    const-string v4, "_f"

    invoke-virtual {v0, v1, v4}, Lcom/google/android/gms/measurement/internal/q;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/u;

    move-result-object v0

    if-nez v0, :cond_3

    const-wide/16 v0, 0x1

    const-wide/32 v4, 0x36ee80

    div-long v4, v2, v4

    add-long/2addr v0, v4

    mul-long v4, v0, v6

    new-instance v0, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;

    const-string v1, "_fot"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const-string v5, "auto"

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/aj;->a(Lcom/google/android/gms/measurement/internal/UserAttributeParcel;Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    invoke-virtual {p0, p1, v2, v3}, Lcom/google/android/gms/measurement/internal/aj;->b(Lcom/google/android/gms/measurement/internal/AppMetadata;J)V

    invoke-virtual {p0, p1, v2, v3}, Lcom/google/android/gms/measurement/internal/aj;->c(Lcom/google/android/gms/measurement/internal/AppMetadata;J)V

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->z()V

    goto :goto_0

    :cond_3
    :try_start_1
    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->j:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1, v2, v3}, Lcom/google/android/gms/measurement/internal/aj;->d(Lcom/google/android/gms/measurement/internal/AppMetadata;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q;->z()V

    throw v0
.end method

.method b(Lcom/google/android/gms/measurement/internal/AppMetadata;J)V
    .locals 12
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v1, 0x0

    const-wide/16 v10, 0x1

    const-wide/16 v8, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v0, "_c"

    invoke-virtual {v3, v0, v10, v11}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "_r"

    invoke-virtual {v3, v0, v10, v11}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "_uwa"

    invoke-virtual {v3, v0, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "_pfo"

    invoke-virtual {v3, v0, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "_sys"

    invoke-virtual {v3, v0, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "_sysu"

    invoke-virtual {v3, v0, v8, v9}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->r()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "PackageManager is null, first open report might be inaccurate"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/q;->h(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v2, v0, v8

    if-eqz v2, :cond_1

    const-string v2, "_pfo"

    invoke-virtual {v3, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_1
    new-instance v0, Lcom/google/android/gms/measurement/internal/EventParcel;

    const-string v1, "_f"

    new-instance v2, Lcom/google/android/gms/measurement/internal/EventParams;

    invoke-direct {v2, v3}, Lcom/google/android/gms/measurement/internal/EventParams;-><init>(Landroid/os/Bundle;)V

    const-string v3, "auto"

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/EventParcel;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/EventParams;Ljava/lang/String;J)V

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/aj;->a(Lcom/google/android/gms/measurement/internal/EventParcel;Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    return-void

    :cond_2
    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_3

    iget-wide v4, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    cmp-long v4, v4, v8

    if-eqz v4, :cond_3

    iget-wide v4, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    iget-wide v6, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v0, v4, v6

    if-eqz v0, :cond_3

    const-string v0, "_uwa"

    invoke-virtual {v3, v0, v10, v11}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_3
    :try_start_1
    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    :goto_2
    if-eqz v0, :cond_0

    iget v1, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_4

    const-string v1, "_sys"

    invoke-virtual {v3, v1, v10, v11}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_4
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const-string v0, "_sysu"

    invoke-virtual {v3, v0, v10, v11}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v4

    const-string v5, "Package info is null, first open report might be inaccurate"

    invoke-virtual {v4, v5, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v0, v1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v4, "Application info is null, first open report might be inaccurate"

    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v0, v1

    goto :goto_2
.end method

.method b(Lcom/google/android/gms/measurement/internal/UserAttributeParcel;Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    iget-object v0, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-boolean v0, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->i:Z

    if-nez v0, :cond_1

    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/aj;->c(Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->D()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Removing user property"

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->f()V

    :try_start_0
    invoke-direct {p0, p2}, Lcom/google/android/gms/measurement/internal/aj;->c(Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    iget-object v1, p2, Lcom/google/android/gms/measurement/internal/AppMetadata;->b:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/q;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->g()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->D()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "User property removed"

    iget-object v2, p1, Lcom/google/android/gms/measurement/internal/UserAttributeParcel;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->z()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/q;->z()V

    throw v0
.end method

.method protected b()Z
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/aj;->x:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/aj;->x:Ljava/lang/Boolean;

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    const-string v3, "android.permission.INTERNET"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/m;->k(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/m;->k(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->r()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/google/android/gms/measurement/internal/ag;->a(Landroid/content/Context;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->r()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/google/android/gms/measurement/internal/f;->a(Landroid/content/Context;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->x:Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->x:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->v()Lcom/google/android/gms/measurement/internal/z;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/z;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/m;->h(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->x:Ljava/lang/Boolean;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->x:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method public b(Lcom/google/android/gms/measurement/internal/EventParcel;Ljava/lang/String;)[B
    .locals 18
    .param p1    # Lcom/google/android/gms/measurement/internal/EventParcel;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Size;
            min = 0x1L
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->a()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->H()V

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    new-instance v13, Lcom/google/android/gms/internal/amw$d;

    invoke-direct {v13}, Lcom/google/android/gms/internal/amw$d;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->f()V

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/q;->b(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/a;

    move-result-object v16

    if-nez v16, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->D()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "Log and bundle not available. package_name"

    move-object/from16 v0, p2

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x0

    new-array v2, v2, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/q;->z()V

    :goto_0
    return-object v2

    :cond_0
    :try_start_1
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->n()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->D()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "Log and bundle disabled. package_name"

    move-object/from16 v0, p2

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x0

    new-array v2, v2, [B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/q;->z()V

    goto :goto_0

    :cond_1
    :try_start_2
    new-instance v17, Lcom/google/android/gms/internal/amw$e;

    invoke-direct/range {v17 .. v17}, Lcom/google/android/gms/internal/amw$e;-><init>()V

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/internal/amw$e;

    const/4 v3, 0x0

    aput-object v17, v2, v3

    iput-object v2, v13, Lcom/google/android/gms/internal/amw$d;->a:[Lcom/google/android/gms/internal/amw$e;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->a:Ljava/lang/Integer;

    const-string v2, "android"

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->i:Ljava/lang/String;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->b()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->o:Ljava/lang/String;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->k()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->n:Ljava/lang/String;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->i()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->p:Ljava/lang/String;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->j()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->C:Ljava/lang/Integer;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->l()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->q:Ljava/lang/Long;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->d()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->y:Ljava/lang/String;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->m()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->v:Ljava/lang/Long;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/af;->a(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v2, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->s:Ljava/lang/String;

    iget-object v2, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->t:Ljava/lang/Boolean;

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->u()Lcom/google/android/gms/measurement/internal/s;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/s;->f()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->k:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->u()Lcom/google/android/gms/measurement/internal/s;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/s;->g()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->j:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->u()Lcom/google/android/gms/measurement/internal/s;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/s;->z()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->m:Ljava/lang/Integer;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->u()Lcom/google/android/gms/measurement/internal/s;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/s;->A()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->l:Ljava/lang/String;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->c()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->u:Ljava/lang/String;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->f()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->B:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/q;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Lcom/google/android/gms/internal/amw$g;

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->c:[Lcom/google/android/gms/internal/amw$g;

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    if-ge v3, v2, :cond_3

    new-instance v5, Lcom/google/android/gms/internal/amw$g;

    invoke-direct {v5}, Lcom/google/android/gms/internal/amw$g;-><init>()V

    move-object/from16 v0, v17

    iget-object v2, v0, Lcom/google/android/gms/internal/amw$e;->c:[Lcom/google/android/gms/internal/amw$g;

    aput-object v5, v2, v3

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/measurement/internal/l;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/l;->b:Ljava/lang/String;

    iput-object v2, v5, Lcom/google/android/gms/internal/amw$g;->b:Ljava/lang/String;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/measurement/internal/l;

    iget-wide v6, v2, Lcom/google/android/gms/measurement/internal/l;->c:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v5, Lcom/google/android/gms/internal/amw$g;->a:Ljava/lang/Long;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v6

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/measurement/internal/l;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/l;->d:Ljava/lang/Object;

    invoke-virtual {v6, v5, v2}, Lcom/google/android/gms/measurement/internal/m;->a(Lcom/google/android/gms/internal/amw$g;Ljava/lang/Object;)V

    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_1

    :cond_3
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->c:Lcom/google/android/gms/measurement/internal/EventParams;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/EventParams;->b()Landroid/os/Bundle;

    move-result-object v12

    const-string v2, "_iap"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "_c"

    const-wide/16 v4, 0x1

    invoke-virtual {v12, v2, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/ab;->D()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v2

    const-string v3, "Marking in-app purchase as real-time"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    const-string v2, "_r"

    const-wide/16 v4, 0x1

    invoke-virtual {v12, v2, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_4
    const-string v2, "_o"

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->d:Ljava/lang/String;

    invoke-virtual {v12, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    move-object/from16 v0, v17

    iget-object v3, v0, Lcom/google/android/gms/internal/amw$e;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/m;->m(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    const-string v3, "_dbg"

    const-wide/16 v4, 0x1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v12, v3, v4}, Lcom/google/android/gms/measurement/internal/m;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v2

    const-string v3, "_r"

    const-wide/16 v4, 0x1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v12, v3, v4}, Lcom/google/android/gms/measurement/internal/m;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    move-object/from16 v0, p2

    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/measurement/internal/q;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/u;

    move-result-object v2

    if-nez v2, :cond_6

    const-wide/16 v14, 0x0

    new-instance v3, Lcom/google/android/gms/measurement/internal/u;

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    const-wide/16 v6, 0x1

    const-wide/16 v8, 0x0

    move-object/from16 v0, p1

    iget-wide v10, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->e:J

    move-object/from16 v4, p2

    invoke-direct/range {v3 .. v11}, Lcom/google/android/gms/measurement/internal/u;-><init>(Ljava/lang/String;Ljava/lang/String;JJJ)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/measurement/internal/u;)V

    move-wide v10, v14

    :goto_2
    new-instance v3, Lcom/google/android/gms/measurement/internal/t;

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->d:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->b:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-wide v8, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->e:J

    move-object/from16 v4, p0

    move-object/from16 v6, p2

    invoke-direct/range {v3 .. v12}, Lcom/google/android/gms/measurement/internal/t;-><init>(Lcom/google/android/gms/measurement/internal/aj;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    new-instance v6, Lcom/google/android/gms/internal/amw$b;

    invoke-direct {v6}, Lcom/google/android/gms/internal/amw$b;-><init>()V

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/internal/amw$b;

    const/4 v4, 0x0

    aput-object v6, v2, v4

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->b:[Lcom/google/android/gms/internal/amw$b;

    iget-wide v4, v3, Lcom/google/android/gms/measurement/internal/t;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v6, Lcom/google/android/gms/internal/amw$b;->c:Ljava/lang/Long;

    iget-object v2, v3, Lcom/google/android/gms/measurement/internal/t;->b:Ljava/lang/String;

    iput-object v2, v6, Lcom/google/android/gms/internal/amw$b;->b:Ljava/lang/String;

    iget-wide v4, v3, Lcom/google/android/gms/measurement/internal/t;->e:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v6, Lcom/google/android/gms/internal/amw$b;->d:Ljava/lang/Long;

    iget-object v2, v3, Lcom/google/android/gms/measurement/internal/t;->f:Lcom/google/android/gms/measurement/internal/EventParams;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/EventParams;->a()I

    move-result v2

    new-array v2, v2, [Lcom/google/android/gms/internal/amw$c;

    iput-object v2, v6, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    const/4 v2, 0x0

    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/t;->f:Lcom/google/android/gms/measurement/internal/EventParams;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/EventParams;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v4, v2

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v8, Lcom/google/android/gms/internal/amw$c;

    invoke-direct {v8}, Lcom/google/android/gms/internal/amw$c;-><init>()V

    iget-object v9, v6, Lcom/google/android/gms/internal/amw$b;->a:[Lcom/google/android/gms/internal/amw$c;

    add-int/lit8 v5, v4, 0x1

    aput-object v8, v9, v4

    iput-object v2, v8, Lcom/google/android/gms/internal/amw$c;->a:Ljava/lang/String;

    iget-object v4, v3, Lcom/google/android/gms/measurement/internal/t;->f:Lcom/google/android/gms/measurement/internal/EventParams;

    invoke-virtual {v4, v2}, Lcom/google/android/gms/measurement/internal/EventParams;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v4

    invoke-virtual {v4, v8, v2}, Lcom/google/android/gms/measurement/internal/m;->a(Lcom/google/android/gms/internal/amw$c;Ljava/lang/Object;)V

    move v4, v5

    goto :goto_3

    :cond_6
    iget-wide v10, v2, Lcom/google/android/gms/measurement/internal/u;->e:J

    move-object/from16 v0, p1

    iget-wide v4, v0, Lcom/google/android/gms/measurement/internal/EventParcel;->e:J

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/measurement/internal/u;->a(J)Lcom/google/android/gms/measurement/internal/u;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/u;->a()Lcom/google/android/gms/measurement/internal/u;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/measurement/internal/u;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/q;->z()V

    throw v2

    :cond_7
    :try_start_3
    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->b()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v17

    iget-object v3, v0, Lcom/google/android/gms/internal/amw$e;->c:[Lcom/google/android/gms/internal/amw$g;

    move-object/from16 v0, v17

    iget-object v4, v0, Lcom/google/android/gms/internal/amw$e;->b:[Lcom/google/android/gms/internal/amw$b;

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/aj;->a(Ljava/lang/String;[Lcom/google/android/gms/internal/amw$g;[Lcom/google/android/gms/internal/amw$b;)[Lcom/google/android/gms/internal/amw$a;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->A:[Lcom/google/android/gms/internal/amw$a;

    iget-object v2, v6, Lcom/google/android/gms/internal/amw$b;->c:Ljava/lang/Long;

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->e:Ljava/lang/Long;

    iget-object v2, v6, Lcom/google/android/gms/internal/amw$b;->c:Ljava/lang/Long;

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->f:Ljava/lang/Long;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->h()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_8

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    :goto_4
    move-object/from16 v0, v17

    iput-object v4, v0, Lcom/google/android/gms/internal/amw$e;->h:Ljava/lang/Long;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->g()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-nez v6, :cond_a

    :goto_5
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_9

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_6
    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->g:Ljava/lang/Long;

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->r()V

    invoke-virtual/range {v16 .. v16}, Lcom/google/android/gms/measurement/internal/a;->o()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->w:Ljava/lang/Integer;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/p;->M()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->r:Ljava/lang/Long;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->d:Ljava/lang/Long;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v0, v17

    iput-object v2, v0, Lcom/google/android/gms/internal/amw$e;->z:Ljava/lang/Boolean;

    move-object/from16 v0, v17

    iget-object v2, v0, Lcom/google/android/gms/internal/amw$e;->e:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v0, v16

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/a;->a(J)V

    move-object/from16 v0, v17

    iget-object v2, v0, Lcom/google/android/gms/internal/amw$e;->f:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-object/from16 v0, v16

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/a;->b(J)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/q;->a(Lcom/google/android/gms/measurement/internal/a;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->g()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->z()V

    :try_start_4
    invoke-virtual {v13}, Lcom/google/android/gms/internal/amw$d;->g()I

    move-result v2

    new-array v2, v2, [B

    invoke-static {v2}, Lcom/google/android/gms/internal/qw;->a([B)Lcom/google/android/gms/internal/qw;

    move-result-object v3

    invoke-virtual {v13, v3}, Lcom/google/android/gms/internal/amw$d;->a(Lcom/google/android/gms/internal/qw;)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/qw;->b()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/measurement/internal/m;->a([B)[B
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    move-result-object v2

    goto/16 :goto_0

    :cond_8
    const/4 v4, 0x0

    goto/16 :goto_4

    :cond_9
    const/4 v2, 0x0

    goto/16 :goto_6

    :catch_0
    move-exception v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v3

    const-string v4, "Data loss. Failed to bundle and serialize"

    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_a
    move-wide v2, v4

    goto/16 :goto_5
.end method

.method protected c()V
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v4, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->z()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->D()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->f:Lcom/google/android/gms/measurement/internal/ai;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ai;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->f:Lcom/google/android/gms/measurement/internal/ai;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ai;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Scheduler shutting down before Scion.start() called"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->p()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/q;->E()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/af;->c:Lcom/google/android/gms/measurement/internal/af$b;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/af$b;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/af;->c:Lcom/google/android/gms/measurement/internal/af$b;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->s()Lcom/google/android/gms/common/util/e;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/af$b;->a(J)V

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->b()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->E()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v0

    const-string v1, "android.permission.INTERNET"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/m;->k(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "App is missing INTERNET permission"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->o()Lcom/google/android/gms/measurement/internal/m;

    move-result-object v0

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/m;->k(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "App is missing ACCESS_NETWORK_STATE permission"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->r()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/google/android/gms/measurement/internal/ag;->a(Landroid/content/Context;Z)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "AppMeasurementReceiver not registered/enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->r()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/google/android/gms/measurement/internal/f;->a(Landroid/content/Context;Z)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "AppMeasurementService not registered/enabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->D()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->f()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Uploading is not possible. App measurement disabled"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    :cond_7
    :goto_1
    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/aj;->O()V

    goto/16 :goto_0

    :cond_8
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->v()Lcom/google/android/gms/measurement/internal/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/z;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/af;->A()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_a

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->v()Lcom/google/android/gms/measurement/internal/z;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/z;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/af;->c(Ljava/lang/String;)V

    :cond_9
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->d()Lcom/google/android/gms/measurement/internal/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/p;->N()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->D()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->v()Lcom/google/android/gms/measurement/internal/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/z;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->l()Lcom/google/android/gms/measurement/internal/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/d;->g()V

    goto :goto_1

    :cond_a
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->v()Lcom/google/android/gms/measurement/internal/z;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/z;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->f()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->C()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Rechecking which service to use due to a GMP App Id change"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/af;->C()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->o:Lcom/google/android/gms/measurement/internal/e;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/e;->C()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->o:Lcom/google/android/gms/measurement/internal/e;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/e;->A()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->e()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->v()Lcom/google/android/gms/measurement/internal/z;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/z;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/af;->c(Ljava/lang/String;)V

    goto :goto_2
.end method

.method c(Lcom/google/android/gms/measurement/internal/AppMetadata;J)V
    .locals 6
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v0, "_et"

    const-wide/16 v4, 0x1

    invoke-virtual {v3, v0, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    new-instance v0, Lcom/google/android/gms/measurement/internal/EventParcel;

    const-string v1, "_e"

    new-instance v2, Lcom/google/android/gms/measurement/internal/EventParams;

    invoke-direct {v2, v3}, Lcom/google/android/gms/measurement/internal/EventParams;-><init>(Landroid/os/Bundle;)V

    const-string v3, "auto"

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/EventParcel;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/EventParams;Ljava/lang/String;J)V

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/aj;->a(Lcom/google/android/gms/measurement/internal/EventParcel;Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    return-void
.end method

.method public d()Lcom/google/android/gms/measurement/internal/p;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->c:Lcom/google/android/gms/measurement/internal/p;

    return-object v0
.end method

.method d(Lcom/google/android/gms/measurement/internal/AppMetadata;J)V
    .locals 6
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    new-instance v0, Lcom/google/android/gms/measurement/internal/EventParcel;

    const-string v1, "_cd"

    new-instance v2, Lcom/google/android/gms/measurement/internal/EventParams;

    invoke-direct {v2, v3}, Lcom/google/android/gms/measurement/internal/EventParams;-><init>(Landroid/os/Bundle;)V

    const-string v3, "auto"

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/EventParcel;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/EventParams;Ljava/lang/String;J)V

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/aj;->a(Lcom/google/android/gms/measurement/internal/EventParcel;Lcom/google/android/gms/measurement/internal/AppMetadata;)V

    return-void
.end method

.method public e()Lcom/google/android/gms/measurement/internal/af;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->d:Lcom/google/android/gms/measurement/internal/af;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->a(Lcom/google/android/gms/measurement/internal/al;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->d:Lcom/google/android/gms/measurement/internal/af;

    return-object v0
.end method

.method public f()Lcom/google/android/gms/measurement/internal/ab;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->e:Lcom/google/android/gms/measurement/internal/ab;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->b(Lcom/google/android/gms/measurement/internal/b;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->e:Lcom/google/android/gms/measurement/internal/ab;

    return-object v0
.end method

.method public g()Lcom/google/android/gms/measurement/internal/ab;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->e:Lcom/google/android/gms/measurement/internal/ab;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->e:Lcom/google/android/gms/measurement/internal/ab;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->e:Lcom/google/android/gms/measurement/internal/ab;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()Lcom/google/android/gms/measurement/internal/ai;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->f:Lcom/google/android/gms/measurement/internal/ai;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->b(Lcom/google/android/gms/measurement/internal/b;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->f:Lcom/google/android/gms/measurement/internal/ai;

    return-object v0
.end method

.method public i()Lcom/google/android/gms/measurement/internal/g;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->g:Lcom/google/android/gms/measurement/internal/g;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->b(Lcom/google/android/gms/measurement/internal/b;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->g:Lcom/google/android/gms/measurement/internal/g;

    return-object v0
.end method

.method public j()Lcom/google/android/gms/measurement/internal/ah;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->h:Lcom/google/android/gms/measurement/internal/ah;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->b(Lcom/google/android/gms/measurement/internal/b;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->h:Lcom/google/android/gms/measurement/internal/ah;

    return-object v0
.end method

.method k()Lcom/google/android/gms/measurement/internal/ai;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->f:Lcom/google/android/gms/measurement/internal/ai;

    return-object v0
.end method

.method public l()Lcom/google/android/gms/measurement/internal/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->q:Lcom/google/android/gms/measurement/internal/d;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->b(Lcom/google/android/gms/measurement/internal/b;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->q:Lcom/google/android/gms/measurement/internal/d;

    return-object v0
.end method

.method public m()Lcom/google/android/gms/measurement/AppMeasurement;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->i:Lcom/google/android/gms/measurement/AppMeasurement;

    return-object v0
.end method

.method public n()Lcom/google/firebase/a/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->j:Lcom/google/firebase/a/a;

    return-object v0
.end method

.method public o()Lcom/google/android/gms/measurement/internal/m;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->k:Lcom/google/android/gms/measurement/internal/m;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->a(Lcom/google/android/gms/measurement/internal/al;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->k:Lcom/google/android/gms/measurement/internal/m;

    return-object v0
.end method

.method public p()Lcom/google/android/gms/measurement/internal/q;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->l:Lcom/google/android/gms/measurement/internal/q;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->b(Lcom/google/android/gms/measurement/internal/b;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->l:Lcom/google/android/gms/measurement/internal/q;

    return-object v0
.end method

.method public q()Lcom/google/android/gms/measurement/internal/ac;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->m:Lcom/google/android/gms/measurement/internal/ac;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->b(Lcom/google/android/gms/measurement/internal/b;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->m:Lcom/google/android/gms/measurement/internal/ac;

    return-object v0
.end method

.method public r()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->b:Landroid/content/Context;

    return-object v0
.end method

.method public s()Lcom/google/android/gms/common/util/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->n:Lcom/google/android/gms/common/util/e;

    return-object v0
.end method

.method public t()Lcom/google/android/gms/measurement/internal/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->o:Lcom/google/android/gms/measurement/internal/e;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->b(Lcom/google/android/gms/measurement/internal/b;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->o:Lcom/google/android/gms/measurement/internal/e;

    return-object v0
.end method

.method public u()Lcom/google/android/gms/measurement/internal/s;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->p:Lcom/google/android/gms/measurement/internal/s;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->b(Lcom/google/android/gms/measurement/internal/b;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->p:Lcom/google/android/gms/measurement/internal/s;

    return-object v0
.end method

.method public v()Lcom/google/android/gms/measurement/internal/z;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->r:Lcom/google/android/gms/measurement/internal/z;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->b(Lcom/google/android/gms/measurement/internal/b;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->r:Lcom/google/android/gms/measurement/internal/z;

    return-object v0
.end method

.method public w()Lcom/google/android/gms/measurement/internal/ad;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->s:Lcom/google/android/gms/measurement/internal/ad;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Network broadcast receiver not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->s:Lcom/google/android/gms/measurement/internal/ad;

    return-object v0
.end method

.method public x()Lcom/google/android/gms/measurement/internal/j;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->t:Lcom/google/android/gms/measurement/internal/j;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->b(Lcom/google/android/gms/measurement/internal/b;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->t:Lcom/google/android/gms/measurement/internal/j;

    return-object v0
.end method

.method public y()Lcom/google/android/gms/measurement/internal/o;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->u:Lcom/google/android/gms/measurement/internal/o;

    invoke-direct {p0, v0}, Lcom/google/android/gms/measurement/internal/aj;->b(Lcom/google/android/gms/measurement/internal/b;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/aj;->u:Lcom/google/android/gms/measurement/internal/o;

    return-object v0
.end method

.method public z()V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/aj;->h()Lcom/google/android/gms/measurement/internal/ai;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ai;->j()V

    return-void
.end method
