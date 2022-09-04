.class public abstract Lcom/google/firebase/c/j;
.super Lcom/google/firebase/c/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/c/j$b;,
        Lcom/google/firebase/c/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult::",
        "Lcom/google/firebase/c/j$a;",
        ">",
        "Lcom/google/firebase/c/b",
        "<TTResult;>;"
    }
.end annotation


# static fields
.field private static final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field protected final a:Ljava/lang/Object;

.field private final d:Lcom/google/firebase/c/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/c/q",
            "<",
            "Lcom/google/android/gms/g/d",
            "<-TTResult;>;TTResult;>;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/firebase/c/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/c/q",
            "<",
            "Lcom/google/android/gms/g/c;",
            "TTResult;>;"
        }
    .end annotation
.end field

.field private final f:Lcom/google/firebase/c/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/c/q",
            "<",
            "Lcom/google/firebase/c/f",
            "<-TTResult;>;TTResult;>;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/firebase/c/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/c/q",
            "<",
            "Lcom/google/firebase/c/e",
            "<-TTResult;>;TTResult;>;"
        }
    .end annotation
.end field

.field private h:I

.field private i:Lcom/google/firebase/c/j$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TTResult;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v9, 0x3

    const/16 v8, 0x40

    const/4 v7, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/firebase/c/j;->b:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/firebase/c/j;->c:Ljava/util/HashMap;

    sget-object v0, Lcom/google/firebase/c/j;->b:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    new-array v3, v5, [Ljava/lang/Integer;

    const/16 v4, 0x10

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    const/16 v4, 0x100

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/firebase/c/j;->b:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    new-array v3, v5, [Ljava/lang/Integer;

    const/16 v4, 0x8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    const/16 v4, 0x20

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/firebase/c/j;->b:Ljava/util/HashMap;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    new-array v3, v5, [Ljava/lang/Integer;

    const/16 v4, 0x8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    const/16 v4, 0x20

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/firebase/c/j;->b:Ljava/util/HashMap;

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    new-array v3, v5, [Ljava/lang/Integer;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    const/16 v4, 0x100

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/firebase/c/j;->b:Ljava/util/HashMap;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    new-array v3, v5, [Ljava/lang/Integer;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    const/16 v4, 0x100

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/firebase/c/j;->c:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/firebase/c/j;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    new-array v3, v9, [Ljava/lang/Integer;

    const/4 v4, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    const/16 v4, 0x80

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/firebase/c/j;->c:Ljava/util/HashMap;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    new-array v3, v9, [Ljava/lang/Integer;

    const/4 v4, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    const/16 v4, 0x80

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/firebase/c/j;->c:Ljava/util/HashMap;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    new-array v3, v9, [Ljava/lang/Integer;

    const/16 v4, 0x10

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    const/16 v4, 0x80

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/firebase/c/j;->c:Ljava/util/HashMap;

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    new-array v3, v9, [Ljava/lang/Integer;

    const/16 v4, 0x100

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    const/16 v4, 0x80

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/google/firebase/c/b;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/c/j;->a:Ljava/lang/Object;

    new-instance v0, Lcom/google/firebase/c/q;

    const/16 v1, 0x80

    new-instance v2, Lcom/google/firebase/c/j$1;

    invoke-direct {v2, p0}, Lcom/google/firebase/c/j$1;-><init>(Lcom/google/firebase/c/j;)V

    invoke-direct {v0, p0, v1, v2}, Lcom/google/firebase/c/q;-><init>(Lcom/google/firebase/c/j;ILcom/google/firebase/c/q$a;)V

    iput-object v0, p0, Lcom/google/firebase/c/j;->d:Lcom/google/firebase/c/q;

    new-instance v0, Lcom/google/firebase/c/q;

    const/16 v1, 0x140

    new-instance v2, Lcom/google/firebase/c/j$2;

    invoke-direct {v2, p0}, Lcom/google/firebase/c/j$2;-><init>(Lcom/google/firebase/c/j;)V

    invoke-direct {v0, p0, v1, v2}, Lcom/google/firebase/c/q;-><init>(Lcom/google/firebase/c/j;ILcom/google/firebase/c/q$a;)V

    iput-object v0, p0, Lcom/google/firebase/c/j;->e:Lcom/google/firebase/c/q;

    new-instance v0, Lcom/google/firebase/c/q;

    const/16 v1, -0x1d1

    new-instance v2, Lcom/google/firebase/c/j$3;

    invoke-direct {v2, p0}, Lcom/google/firebase/c/j$3;-><init>(Lcom/google/firebase/c/j;)V

    invoke-direct {v0, p0, v1, v2}, Lcom/google/firebase/c/q;-><init>(Lcom/google/firebase/c/j;ILcom/google/firebase/c/q$a;)V

    iput-object v0, p0, Lcom/google/firebase/c/j;->f:Lcom/google/firebase/c/q;

    new-instance v0, Lcom/google/firebase/c/q;

    const/16 v1, 0x10

    new-instance v2, Lcom/google/firebase/c/j$4;

    invoke-direct {v2, p0}, Lcom/google/firebase/c/j$4;-><init>(Lcom/google/firebase/c/j;)V

    invoke-direct {v0, p0, v1, v2}, Lcom/google/firebase/c/q;-><init>(Lcom/google/firebase/c/j;ILcom/google/firebase/c/q$a;)V

    iput-object v0, p0, Lcom/google/firebase/c/j;->g:Lcom/google/firebase/c/q;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/firebase/c/j;->h:I

    return-void
.end method

.method private a(I)Ljava/lang/String;
    .locals 1

    sparse-switch p1, :sswitch_data_0

    const-string v0, "Unknown Internal State!"

    :goto_0
    return-object v0

    :sswitch_0
    const-string v0, "INTERNAL_STATE_NOT_STARTED"

    goto :goto_0

    :sswitch_1
    const-string v0, "INTERNAL_STATE_QUEUED"

    goto :goto_0

    :sswitch_2
    const-string v0, "INTERNAL_STATE_IN_PROGRESS"

    goto :goto_0

    :sswitch_3
    const-string v0, "INTERNAL_STATE_PAUSING"

    goto :goto_0

    :sswitch_4
    const-string v0, "INTERNAL_STATE_PAUSED"

    goto :goto_0

    :sswitch_5
    const-string v0, "INTERNAL_STATE_CANCELING"

    goto :goto_0

    :sswitch_6
    const-string v0, "INTERNAL_STATE_FAILURE"

    goto :goto_0

    :sswitch_7
    const-string v0, "INTERNAL_STATE_SUCCESS"

    goto :goto_0

    :sswitch_8
    const-string v0, "INTERNAL_STATE_CANCELED"

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x4 -> :sswitch_2
        0x8 -> :sswitch_3
        0x10 -> :sswitch_4
        0x20 -> :sswitch_5
        0x40 -> :sswitch_6
        0x80 -> :sswitch_7
        0x100 -> :sswitch_8
    .end sparse-switch
.end method

.method private k()Lcom/google/firebase/c/j$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/c/j;->i:Lcom/google/firebase/c/j$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/c/j;->i:Lcom/google/firebase/c/j$a;

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/c/j;->a()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/c/j;->i:Lcom/google/firebase/c/j$a;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/firebase/c/j;->x()Lcom/google/firebase/c/j$a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/c/j;->i:Lcom/google/firebase/c/j$a;

    :cond_2
    iget-object v0, p0, Lcom/google/firebase/c/j;->i:Lcom/google/firebase/c/j$a;

    goto :goto_0
.end method


# virtual methods
.method protected A()V
    .locals 0

    return-void
.end method

.method protected B()V
    .locals 0

    return-void
.end method

.method protected C()V
    .locals 0

    return-void
.end method

.method D()Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lcom/google/firebase/c/j$5;

    invoke-direct {v0, p0}, Lcom/google/firebase/c/j$5;-><init>(Lcom/google/firebase/c/j;)V

    return-object v0
.end method

.method public synthetic a(Landroid/app/Activity;Lcom/google/android/gms/g/c;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/c/j;->b(Landroid/app/Activity;Lcom/google/android/gms/g/c;)Lcom/google/firebase/c/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Landroid/app/Activity;Lcom/google/android/gms/g/d;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/c/j;->b(Landroid/app/Activity;Lcom/google/android/gms/g/d;)Lcom/google/firebase/c/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Lcom/google/android/gms/g/c;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/android/gms/g/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/firebase/c/j;->b(Lcom/google/android/gms/g/c;)Lcom/google/firebase/c/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Lcom/google/android/gms/g/d;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/android/gms/g/d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/firebase/c/j;->b(Lcom/google/android/gms/g/d;)Lcom/google/firebase/c/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/c;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/c/j;->b(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/c;)Lcom/google/firebase/c/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/d;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/c/j;->b(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/d;)Lcom/google/firebase/c/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Landroid/app/Activity;Lcom/google/firebase/c/f;)Lcom/google/firebase/c/a;
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/c/j;->b(Landroid/app/Activity;Lcom/google/firebase/c/f;)Lcom/google/firebase/c/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Lcom/google/firebase/c/f;)Lcom/google/firebase/c/a;
    .locals 1
    .param p1    # Lcom/google/firebase/c/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/google/firebase/c/j;->b(Lcom/google/firebase/c/f;)Lcom/google/firebase/c/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Ljava/util/concurrent/Executor;Lcom/google/firebase/c/f;)Lcom/google/firebase/c/a;
    .locals 1
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/c/j;->b(Ljava/util/concurrent/Executor;Lcom/google/firebase/c/f;)Lcom/google/firebase/c/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Landroid/app/Activity;Lcom/google/firebase/c/e;)Lcom/google/firebase/c/b;
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/c/j;->b(Landroid/app/Activity;Lcom/google/firebase/c/e;)Lcom/google/firebase/c/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Lcom/google/firebase/c/e;)Lcom/google/firebase/c/b;
    .locals 1
    .param p1    # Lcom/google/firebase/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/google/firebase/c/j;->b(Lcom/google/firebase/c/e;)Lcom/google/firebase/c/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Ljava/util/concurrent/Executor;Lcom/google/firebase/c/e;)Lcom/google/firebase/c/b;
    .locals 1
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/c/j;->b(Ljava/util/concurrent/Executor;Lcom/google/firebase/c/e;)Lcom/google/firebase/c/j;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/google/firebase/c/j;->b(Ljava/lang/Class;)Lcom/google/firebase/c/j$a;

    move-result-object v0

    return-object v0
.end method

.method public a()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/c/j;->v()I

    move-result v0

    and-int/lit16 v0, v0, 0x80

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/firebase/c/j;->v()I

    move-result v0

    and-int/lit16 v0, v0, 0x140

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(IZ)Z
    .locals 7

    const-string v0, "StorageTask"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "StorageTask"

    invoke-direct {p0, p1}, Lcom/google/firebase/c/j;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/google/firebase/c/j;->h:I

    invoke-direct {p0, v2}, Lcom/google/firebase/c/j;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x36

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "changing internal state to: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " isUser: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " from state:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v1, p0, Lcom/google/firebase/c/j;->a:Ljava/lang/Object;

    monitor-enter v1

    if-eqz p2, :cond_1

    :try_start_0
    sget-object v0, Lcom/google/firebase/c/j;->b:Ljava/util/HashMap;

    :goto_0
    invoke-virtual {p0}, Lcom/google/firebase/c/j;->v()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    if-eqz v0, :cond_2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput p1, p0, Lcom/google/firebase/c/j;->h:I

    iget v0, p0, Lcom/google/firebase/c/j;->h:I

    sparse-switch v0, :sswitch_data_0

    :goto_1
    iget-object v0, p0, Lcom/google/firebase/c/j;->d:Lcom/google/firebase/c/q;

    invoke-virtual {v0}, Lcom/google/firebase/c/q;->a()V

    iget-object v0, p0, Lcom/google/firebase/c/j;->e:Lcom/google/firebase/c/q;

    invoke-virtual {v0}, Lcom/google/firebase/c/q;->a()V

    iget-object v0, p0, Lcom/google/firebase/c/j;->g:Lcom/google/firebase/c/q;

    invoke-virtual {v0}, Lcom/google/firebase/c/q;->a()V

    iget-object v0, p0, Lcom/google/firebase/c/j;->f:Lcom/google/firebase/c/q;

    invoke-virtual {v0}, Lcom/google/firebase/c/q;->a()V

    const/4 v0, 0x1

    monitor-exit v1

    :goto_2
    return v0

    :cond_1
    sget-object v0, Lcom/google/firebase/c/j;->c:Ljava/util/HashMap;

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lcom/google/firebase/c/o;->a()Lcom/google/firebase/c/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/firebase/c/o;->a(Lcom/google/firebase/c/j;)V

    invoke-virtual {p0}, Lcom/google/firebase/c/j;->y()V

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :sswitch_1
    :try_start_1
    invoke-virtual {p0}, Lcom/google/firebase/c/j;->z()V

    goto :goto_1

    :sswitch_2
    invoke-virtual {p0}, Lcom/google/firebase/c/j;->A()V

    goto :goto_1

    :sswitch_3
    invoke-virtual {p0}, Lcom/google/firebase/c/j;->B()V

    goto :goto_1

    :sswitch_4
    invoke-virtual {p0}, Lcom/google/firebase/c/j;->C()V

    goto :goto_1

    :sswitch_5
    invoke-virtual {p0}, Lcom/google/firebase/c/j;->p()V

    goto :goto_1

    :cond_2
    const-string v0, "StorageTask"

    invoke-direct {p0, p1}, Lcom/google/firebase/c/j;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/google/firebase/c/j;->h:I

    invoke-direct {p0, v3}, Lcom/google/firebase/c/j;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x3e

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "unable to change internal state to: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " isUser: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " from state:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x4 -> :sswitch_1
        0x10 -> :sswitch_2
        0x40 -> :sswitch_3
        0x80 -> :sswitch_4
        0x100 -> :sswitch_5
    .end sparse-switch
.end method

.method public b(Ljava/lang/Class;)Lcom/google/firebase/c/j$a;
    .locals 2
    .param p1    # Ljava/lang/Class;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class",
            "<TX;>;)TTResult;^TX;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/c/j;->k()Lcom/google/firebase/c/j$a;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_0
    invoke-direct {p0}, Lcom/google/firebase/c/j;->k()Lcom/google/firebase/c/j$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/firebase/c/j$a;->c()Ljava/lang/Exception;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/firebase/c/j;->k()Lcom/google/firebase/c/j$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/firebase/c/j$a;->c()Ljava/lang/Exception;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    :cond_1
    invoke-direct {p0}, Lcom/google/firebase/c/j;->k()Lcom/google/firebase/c/j$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/firebase/c/j$a;->c()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lcom/google/android/gms/g/e;

    invoke-direct {v1, v0}, Lcom/google/android/gms/g/e;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    invoke-direct {p0}, Lcom/google/firebase/c/j;->k()Lcom/google/firebase/c/j$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/app/Activity;Lcom/google/android/gms/g/c;)Lcom/google/firebase/c/j;
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/g/c;",
            ")",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->e:Lcom/google/firebase/c/q;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, Lcom/google/firebase/c/q;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V

    return-object p0
.end method

.method public b(Landroid/app/Activity;Lcom/google/android/gms/g/d;)Lcom/google/firebase/c/j;
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/g/d",
            "<-TTResult;>;)",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->d:Lcom/google/firebase/c/q;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, Lcom/google/firebase/c/q;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V

    return-object p0
.end method

.method public b(Landroid/app/Activity;Lcom/google/firebase/c/e;)Lcom/google/firebase/c/j;
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/firebase/c/e",
            "<-TTResult;>;)",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->g:Lcom/google/firebase/c/q;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, Lcom/google/firebase/c/q;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V

    return-object p0
.end method

.method public b(Landroid/app/Activity;Lcom/google/firebase/c/f;)Lcom/google/firebase/c/j;
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/firebase/c/f",
            "<-TTResult;>;)",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->f:Lcom/google/firebase/c/q;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, Lcom/google/firebase/c/q;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V

    return-object p0
.end method

.method public b(Lcom/google/android/gms/g/c;)Lcom/google/firebase/c/j;
    .locals 2
    .param p1    # Lcom/google/android/gms/g/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/c;",
            ")",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->e:Lcom/google/firebase/c/q;

    invoke-virtual {v0, v1, v1, p1}, Lcom/google/firebase/c/q;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V

    return-object p0
.end method

.method public b(Lcom/google/android/gms/g/d;)Lcom/google/firebase/c/j;
    .locals 2
    .param p1    # Lcom/google/android/gms/g/d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/d",
            "<-TTResult;>;)",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->d:Lcom/google/firebase/c/q;

    invoke-virtual {v0, v1, v1, p1}, Lcom/google/firebase/c/q;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V

    return-object p0
.end method

.method public b(Lcom/google/firebase/c/e;)Lcom/google/firebase/c/j;
    .locals 2
    .param p1    # Lcom/google/firebase/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/c/e",
            "<-TTResult;>;)",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->g:Lcom/google/firebase/c/q;

    invoke-virtual {v0, v1, v1, p1}, Lcom/google/firebase/c/q;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V

    return-object p0
.end method

.method public b(Lcom/google/firebase/c/f;)Lcom/google/firebase/c/j;
    .locals 2
    .param p1    # Lcom/google/firebase/c/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/c/f",
            "<-TTResult;>;)",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->f:Lcom/google/firebase/c/q;

    invoke-virtual {v0, v1, v1, p1}, Lcom/google/firebase/c/q;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V

    return-object p0
.end method

.method public b(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/c;)Lcom/google/firebase/c/j;
    .locals 2
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/gms/g/c;",
            ")",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->e:Lcom/google/firebase/c/q;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/firebase/c/q;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V

    return-object p0
.end method

.method public b(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/d;)Lcom/google/firebase/c/j;
    .locals 2
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/gms/g/d",
            "<-TTResult;>;)",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->d:Lcom/google/firebase/c/q;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/firebase/c/q;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V

    return-object p0
.end method

.method public b(Ljava/util/concurrent/Executor;Lcom/google/firebase/c/e;)Lcom/google/firebase/c/j;
    .locals 2
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/firebase/c/e",
            "<-TTResult;>;)",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->g:Lcom/google/firebase/c/q;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/firebase/c/q;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V

    return-object p0
.end method

.method public b(Ljava/util/concurrent/Executor;Lcom/google/firebase/c/f;)Lcom/google/firebase/c/j;
    .locals 2
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/firebase/c/f",
            "<-TTResult;>;)",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->f:Lcom/google/firebase/c/q;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/firebase/c/q;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V

    return-object p0
.end method

.method public b()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/c/j;->v()I

    move-result v0

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/g/c;)Lcom/google/firebase/c/j;
    .locals 1
    .param p1    # Lcom/google/android/gms/g/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/c;",
            ")",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->e:Lcom/google/firebase/c/q;

    invoke-virtual {v0, p1}, Lcom/google/firebase/c/q;->a(Ljava/lang/Object;)V

    return-object p0
.end method

.method public c(Lcom/google/android/gms/g/d;)Lcom/google/firebase/c/j;
    .locals 1
    .param p1    # Lcom/google/android/gms/g/d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/d",
            "<-TTResult;>;)",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->d:Lcom/google/firebase/c/q;

    invoke-virtual {v0, p1}, Lcom/google/firebase/c/q;->a(Ljava/lang/Object;)V

    return-object p0
.end method

.method public c(Lcom/google/firebase/c/e;)Lcom/google/firebase/c/j;
    .locals 1
    .param p1    # Lcom/google/firebase/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/c/e",
            "<-TTResult;>;)",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->g:Lcom/google/firebase/c/q;

    invoke-virtual {v0, p1}, Lcom/google/firebase/c/q;->a(Ljava/lang/Object;)V

    return-object p0
.end method

.method public c(Lcom/google/firebase/c/f;)Lcom/google/firebase/c/j;
    .locals 1
    .param p1    # Lcom/google/firebase/c/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/c/f",
            "<-TTResult;>;)",
            "Lcom/google/firebase/c/j",
            "<TTResult;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/c/j;->f:Lcom/google/firebase/c/q;

    invoke-virtual {v0, p1}, Lcom/google/firebase/c/q;->a(Ljava/lang/Object;)V

    return-object p0
.end method

.method public synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/c/j;->t()Lcom/google/firebase/c/j$a;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/Exception;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/c/j;->k()Lcom/google/firebase/c/j$a;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/google/firebase/c/j;->k()Lcom/google/firebase/c/j$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/firebase/c/j$a;->c()Ljava/lang/Exception;

    move-result-object v0

    goto :goto_0
.end method

.method public e()Z
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0x100

    invoke-virtual {p0, v1, v0}, Lcom/google/firebase/c/j;->a(IZ)Z

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0x20

    invoke-virtual {p0, v1, v0}, Lcom/google/firebase/c/j;->a(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/firebase/c/j;->v()I

    move-result v0

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/c/j;->v()I

    move-result v0

    and-int/lit16 v0, v0, -0x1d1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()Z
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0x10

    invoke-virtual {p0, v1, v0}, Lcom/google/firebase/c/j;->a(IZ)Z

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/google/firebase/c/j;->a(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public i()Z
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lcom/google/firebase/c/j;->a(IZ)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/google/firebase/c/j;->s()V

    invoke-virtual {p0}, Lcom/google/firebase/c/j;->m()V

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/c/j;->v()I

    move-result v0

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method abstract l()Lcom/google/firebase/c/i;
.end method

.method abstract m()V
.end method

.method abstract o()V
.end method

.method protected p()V
    .locals 0

    return-void
.end method

.method abstract q()Lcom/google/firebase/c/j$a;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation
.end method

.method r()Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lcom/google/firebase/c/j;->a(IZ)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/google/firebase/c/j;->m()V

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method s()V
    .locals 0

    return-void
.end method

.method public t()Lcom/google/firebase/c/j$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/c/j;->k()Lcom/google/firebase/c/j$a;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_0
    invoke-direct {p0}, Lcom/google/firebase/c/j;->k()Lcom/google/firebase/c/j$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/firebase/c/j$a;->c()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Lcom/google/android/gms/g/e;

    invoke-direct {v1, v0}, Lcom/google/android/gms/g/e;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    invoke-direct {p0}, Lcom/google/firebase/c/j;->k()Lcom/google/firebase/c/j$a;

    move-result-object v0

    return-object v0
.end method

.method public u()Lcom/google/firebase/c/j$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/c/j;->x()Lcom/google/firebase/c/j$a;

    move-result-object v0

    return-object v0
.end method

.method v()I
    .locals 1

    iget v0, p0, Lcom/google/firebase/c/j;->h:I

    return v0
.end method

.method w()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/j;->a:Ljava/lang/Object;

    return-object v0
.end method

.method x()Lcom/google/firebase/c/j$a;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/firebase/c/j;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/firebase/c/j;->q()Lcom/google/firebase/c/j$a;

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected y()V
    .locals 0

    return-void
.end method

.method protected z()V
    .locals 0

    return-void
.end method
