.class public Lcom/google/android/gms/internal/im;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/hr$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/im$a;,
        Lcom/google/android/gms/internal/im$b;
    }
.end annotation


# static fields
.field static final synthetic b:Z


# instance fields
.field public a:J

.field private final c:Lcom/google/android/gms/internal/in;

.field private final d:Lcom/google/android/gms/internal/mg;

.field private final e:Lcom/google/android/gms/internal/hr;

.field private f:Lcom/google/android/gms/internal/ir;

.field private g:Lcom/google/android/gms/internal/is;

.field private h:Lcom/google/android/gms/internal/jw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/jw",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/im$a;",
            ">;>;"
        }
    .end annotation
.end field

.field private i:Z

.field private final j:Lcom/google/android/gms/internal/ke;

.field private final k:Lcom/google/android/gms/internal/ic;

.field private final l:Lcom/google/android/gms/internal/ks;

.field private final m:Lcom/google/android/gms/internal/ks;

.field private final n:Lcom/google/android/gms/internal/ks;

.field private o:J

.field private p:Lcom/google/android/gms/internal/iu;

.field private q:Lcom/google/android/gms/internal/iu;

.field private r:Lcom/google/firebase/database/g;

.field private s:Z

.field private t:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/im;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/im;->b:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/google/android/gms/internal/in;Lcom/google/android/gms/internal/ic;Lcom/google/firebase/database/g;)V
    .locals 5

    const/4 v4, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/mg;

    new-instance v1, Lcom/google/android/gms/internal/md;

    invoke-direct {v1}, Lcom/google/android/gms/internal/md;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/mg;-><init>(Lcom/google/android/gms/internal/mc;J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    iput-boolean v4, p0, Lcom/google/android/gms/internal/im;->i:Z

    iput-wide v2, p0, Lcom/google/android/gms/internal/im;->a:J

    const-wide/16 v0, 0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/im;->o:J

    iput-boolean v4, p0, Lcom/google/android/gms/internal/im;->s:Z

    iput-wide v2, p0, Lcom/google/android/gms/internal/im;->t:J

    iput-object p1, p0, Lcom/google/android/gms/internal/im;->c:Lcom/google/android/gms/internal/in;

    iput-object p2, p0, Lcom/google/android/gms/internal/im;->k:Lcom/google/android/gms/internal/ic;

    iput-object p3, p0, Lcom/google/android/gms/internal/im;->r:Lcom/google/firebase/database/g;

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->k:Lcom/google/android/gms/internal/ic;

    const-string v1, "RepoOperation"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ic;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ks;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->k:Lcom/google/android/gms/internal/ic;

    const-string v1, "Transaction"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ic;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ks;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/im;->m:Lcom/google/android/gms/internal/ks;

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->k:Lcom/google/android/gms/internal/ic;

    const-string v1, "DataOperation"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ic;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ks;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/im;->n:Lcom/google/android/gms/internal/ks;

    new-instance v0, Lcom/google/android/gms/internal/ke;

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->k:Lcom/google/android/gms/internal/ic;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ke;-><init>(Lcom/google/android/gms/internal/ic;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/im;->j:Lcom/google/android/gms/internal/ke;

    new-instance v0, Lcom/google/android/gms/internal/hp;

    iget-object v1, p1, Lcom/google/android/gms/internal/in;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/internal/in;->c:Ljava/lang/String;

    iget-boolean v3, p1, Lcom/google/android/gms/internal/in;->b:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/hp;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p2, v0, p0}, Lcom/google/android/gms/internal/ic;->a(Lcom/google/android/gms/internal/hp;Lcom/google/android/gms/internal/hr$a;)Lcom/google/android/gms/internal/hr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/im;->e:Lcom/google/android/gms/internal/hr;

    new-instance v0, Lcom/google/android/gms/internal/im$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/im$1;-><init>(Lcom/google/android/gms/internal/im;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/ij;I)Lcom/google/android/gms/internal/ij;
    .locals 7

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/im;->c(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jw;->b()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->m:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x2c

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Aborting transactions for path: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ". Affected: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/im;->h:Lcom/google/android/gms/internal/jw;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/jw;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jw;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/im$6;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/im$6;-><init>(Lcom/google/android/gms/internal/im;I)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/jw;->a(Lcom/google/android/gms/internal/jw$a;)Z

    invoke-direct {p0, v1, p2}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/jw;I)V

    new-instance v2, Lcom/google/android/gms/internal/im$7;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/im$7;-><init>(Lcom/google/android/gms/internal/im;I)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/jw;->a(Lcom/google/android/gms/internal/jw$b;)V

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;I)Lcom/google/android/gms/internal/ij;
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ij;I)Lcom/google/android/gms/internal/ij;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ij;Ljava/util/List;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/ij;Ljava/util/List;)Lcom/google/android/gms/internal/lh;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/android/gms/internal/lh;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/ij;Ljava/util/List;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method static synthetic a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/c;
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/im;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/c;

    move-result-object v0

    return-object v0
.end method

.method private a(JLcom/google/android/gms/internal/ij;Lcom/google/firebase/database/c;)V
    .locals 7

    const/4 v2, 0x0

    const/4 v5, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Lcom/google/firebase/database/c;->a()I

    move-result v0

    const/16 v1, -0x19

    if-ne v0, v1, :cond_0

    :goto_0
    return-void

    :cond_0
    if-nez p4, :cond_2

    move v0, v5

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    if-nez v0, :cond_3

    move v4, v5

    :goto_2
    iget-object v6, p0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    move-wide v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/iu;->a(JZZLcom/google/android/gms/internal/mc;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    :cond_1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;)V

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    move v4, v2

    goto :goto_2
.end method

.method static synthetic a(Lcom/google/android/gms/internal/im;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/im;->j()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/im;JLcom/google/android/gms/internal/ij;Lcom/google/firebase/database/c;)V
    .locals 1

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/im;->a(JLcom/google/android/gms/internal/ij;Lcom/google/firebase/database/c;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/jw;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/jw;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/jw;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/jw;I)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/im;Ljava/lang/String;Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/c;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/c;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/im;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/im;Ljava/util/List;Lcom/google/android/gms/internal/jw;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;Lcom/google/android/gms/internal/jw;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/jp;)V
    .locals 12

    invoke-interface {p1}, Lcom/google/android/gms/internal/jp;->b()Ljava/util/List;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    invoke-static {v0}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/mc;)Ljava/util/Map;

    move-result-object v10

    const-wide/high16 v0, -0x8000000000000000L

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-wide v2, v0

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/internal/iy;

    new-instance v0, Lcom/google/android/gms/internal/im$11;

    invoke-direct {v0, p0, v4}, Lcom/google/android/gms/internal/im$11;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/iy;)V

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->a()J

    move-result-wide v6

    cmp-long v1, v2, v6

    if-ltz v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Write ids were not in order."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->a()J

    move-result-wide v8

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->a()J

    move-result-wide v2

    const-wide/16 v6, 0x1

    add-long/2addr v2, v6

    iput-wide v2, p0, Lcom/google/android/gms/internal/im;->o:J

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->a()J

    move-result-wide v2

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x30

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Restoring overwrite with id "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/im;->e:Lcom/google/android/gms/internal/hr;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->b()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ij;->c()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->c()Lcom/google/android/gms/internal/lh;

    move-result-object v3

    const/4 v5, 0x1

    invoke-interface {v3, v5}, Lcom/google/android/gms/internal/lh;->a(Z)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v2, v3, v0}, Lcom/google/android/gms/internal/hr;->a(Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;)V

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->c()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {v0, v10}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/lh;Ljava/util/Map;)Lcom/google/android/gms/internal/lh;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->b()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->c()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->a()J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lh;JZZ)Ljava/util/List;

    :goto_1
    move-wide v2, v8

    goto/16 :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->a()J

    move-result-wide v2

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x2c

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Restoring merge with id "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/im;->e:Lcom/google/android/gms/internal/hr;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->b()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ij;->c()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->d()Lcom/google/android/gms/internal/ia;

    move-result-object v3

    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ia;->a(Z)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v1, v2, v3, v0}, Lcom/google/android/gms/internal/hr;->a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/hu;)V

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->d()Lcom/google/android/gms/internal/ia;

    move-result-object v0

    invoke-static {v0, v10}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/ia;Ljava/util/Map;)Lcom/google/android/gms/internal/ia;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->b()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->d()Lcom/google/android/gms/internal/ia;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/android/gms/internal/iy;->a()J

    move-result-wide v4

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;Lcom/google/android/gms/internal/ia;JZ)Ljava/util/List;

    goto :goto_1

    :cond_4
    return-void
.end method

.method private a(Lcom/google/android/gms/internal/jw;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/jw",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/im$a;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/jw;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/im;->c(Lcom/google/android/gms/internal/jw;)Ljava/util/List;

    move-result-object v2

    sget-boolean v0, Lcom/google/android/gms/internal/im;->b:Z

    if-nez v0, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/im$a;

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->d(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/im$b;

    move-result-object v0

    sget-object v4, Lcom/google/android/gms/internal/im$b;->b:Lcom/google/android/gms/internal/im$b;

    if-eq v0, v4, :cond_1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/jw;->b()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;Lcom/google/android/gms/internal/ij;)V

    :cond_2
    :goto_1
    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/jw;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/im$21;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/im$21;-><init>(Lcom/google/android/gms/internal/im;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/jw;->b(Lcom/google/android/gms/internal/jw$b;)V

    goto :goto_1

    :cond_4
    move-object v0, v1

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/internal/jw;I)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/jw",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/im$a;",
            ">;>;I)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/jw;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_a

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const/16 v1, -0x9

    if-ne p2, v1, :cond_0

    const-string v1, "overriddenBySet"

    invoke-static {v1}, Lcom/google/firebase/database/c;->a(Ljava/lang/String;)Lcom/google/firebase/database/c;

    move-result-object v1

    move-object v8, v1

    :goto_0
    const/4 v2, -0x1

    const/4 v1, 0x0

    move v9, v1

    move v10, v2

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v9, v1, :cond_8

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/google/android/gms/internal/im$a;

    invoke-static {v7}, Lcom/google/android/gms/internal/im$a;->d(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/im$b;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/im$b;->e:Lcom/google/android/gms/internal/im$b;

    if-ne v1, v2, :cond_2

    move v2, v10

    :goto_2
    add-int/lit8 v1, v9, 0x1

    move v9, v1

    move v10, v2

    goto :goto_1

    :cond_0
    const/16 v1, -0x19

    if-ne p2, v1, :cond_1

    const/4 v1, 0x1

    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x2d

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown transaction abort reason: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/mk;->a(ZLjava/lang/String;)V

    const/16 v1, -0x19

    invoke-static {v1}, Lcom/google/firebase/database/c;->a(I)Lcom/google/firebase/database/c;

    move-result-object v1

    move-object v8, v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_3

    :cond_2
    invoke-static {v7}, Lcom/google/android/gms/internal/im$a;->d(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/im$b;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/im$b;->c:Lcom/google/android/gms/internal/im$b;

    if-ne v1, v2, :cond_4

    sget-boolean v1, Lcom/google/android/gms/internal/im;->b:Z

    if-nez v1, :cond_3

    add-int/lit8 v1, v9, -0x1

    if-eq v10, v1, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_3
    sget-object v1, Lcom/google/android/gms/internal/im$b;->e:Lcom/google/android/gms/internal/im$b;

    invoke-static {v7, v1}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/im$b;)Lcom/google/android/gms/internal/im$b;

    invoke-static {v7, v8}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;Lcom/google/firebase/database/c;)Lcom/google/firebase/database/c;

    move v2, v9

    goto :goto_2

    :cond_4
    sget-boolean v1, Lcom/google/android/gms/internal/im;->b:Z

    if-nez v1, :cond_5

    invoke-static {v7}, Lcom/google/android/gms/internal/im$a;->d(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/im$b;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/im$b;->b:Lcom/google/android/gms/internal/im$b;

    if-eq v1, v2, :cond_5

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_5
    new-instance v1, Lcom/google/android/gms/internal/ja;

    invoke-static {v7}, Lcom/google/android/gms/internal/im$a;->j(Lcom/google/android/gms/internal/im$a;)Lcom/google/firebase/database/r;

    move-result-object v2

    invoke-static {v7}, Lcom/google/android/gms/internal/im$a;->f(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/ij;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/kg;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/kg;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3}, Lcom/google/android/gms/internal/ja;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/r;Lcom/google/android/gms/internal/kg;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ie;)V

    const/16 v1, -0x9

    if-ne p2, v1, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-static {v7}, Lcom/google/android/gms/internal/im$a;->c(Lcom/google/android/gms/internal/im$a;)J

    move-result-wide v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/iu;->a(JZZLcom/google/android/gms/internal/mc;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v11, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_4
    new-instance v1, Lcom/google/android/gms/internal/im$8;

    invoke-direct {v1, p0, v7, v8}, Lcom/google/android/gms/internal/im$8;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/im$a;Lcom/google/firebase/database/c;)V

    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v2, v10

    goto/16 :goto_2

    :cond_6
    const/16 v1, -0x19

    if-ne p2, v1, :cond_7

    const/4 v1, 0x1

    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x2d

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unknown transaction abort reason: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/mk;->a(ZLjava/lang/String;)V

    goto :goto_4

    :cond_7
    const/4 v1, 0x0

    goto :goto_5

    :cond_8
    const/4 v1, -0x1

    if-ne v10, v1, :cond_9

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/jw;->a(Ljava/lang/Object;)V

    :goto_6
    invoke-direct {p0, v11}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;)V

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/im;->b(Ljava/lang/Runnable;)V

    goto :goto_7

    :cond_9
    const/4 v1, 0x0

    add-int/lit8 v2, v10, 0x1

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/jw;->a(Ljava/lang/Object;)V

    goto :goto_6

    :cond_a
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/c;)V
    .locals 6

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lcom/google/firebase/database/c;->a()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p3}, Lcom/google/firebase/database/c;->a()I

    move-result v0

    const/16 v1, -0x19

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ij;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3}, Lcom/google/firebase/database/c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0xd

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " at "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " failed: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->j:Lcom/google/android/gms/internal/ke;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ke;->a(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method private a(Ljava/util/List;Lcom/google/android/gms/internal/ij;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/im$a;",
            ">;",
            "Lcom/google/android/gms/internal/ij;",
            ")V"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/im$a;

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->c(Lcom/google/android/gms/internal/im$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2, v1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ij;Ljava/util/List;)Lcom/google/android/gms/internal/lh;

    move-result-object v2

    const-string v0, "badhash"

    invoke-interface {v2}, Lcom/google/android/gms/internal/lh;->d()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/im$a;

    sget-boolean v4, Lcom/google/android/gms/internal/im;->b:Z

    if-nez v4, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->d(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/im$b;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/internal/im$b;->b:Lcom/google/android/gms/internal/im$b;

    if-eq v4, v5, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_1
    sget-object v4, Lcom/google/android/gms/internal/im$b;->c:Lcom/google/android/gms/internal/im$b;

    invoke-static {v0, v4}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/im$b;)Lcom/google/android/gms/internal/im$b;

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->e(Lcom/google/android/gms/internal/im$a;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->f(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/ij;

    move-result-object v4

    invoke-static {p2, v4}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    move-result-object v4

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->g(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v2, v4, v0}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    move-object v2, v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/lh;->a(Z)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/internal/im;->k()J

    iget-object v2, p0, Lcom/google/android/gms/internal/im;->e:Lcom/google/android/gms/internal/hr;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ij;->c()Ljava/util/List;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/im$22;

    invoke-direct {v4, p0, p2, p1, p0}, Lcom/google/android/gms/internal/im$22;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;Ljava/util/List;Lcom/google/android/gms/internal/im;)V

    invoke-interface {v2, v3, v0, v1, v4}, Lcom/google/android/gms/internal/hr;->a(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method private a(Ljava/util/List;Lcom/google/android/gms/internal/jw;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/im$a;",
            ">;",
            "Lcom/google/android/gms/internal/jw",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/im$a;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/internal/jw;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/im$5;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/im$5;-><init>(Lcom/google/android/gms/internal/im;Ljava/util/List;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/jw;->b(Lcom/google/android/gms/internal/jw$b;)V

    return-void
.end method

.method private b(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/im;->c(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jw;->b()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->c(Lcom/google/android/gms/internal/jw;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/im;->b(Ljava/util/List;Lcom/google/android/gms/internal/ij;)V

    return-object v1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/ks;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    return-object v0
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/c;
    .locals 1

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Lcom/google/firebase/database/c;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/c;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/jw;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/jw;)V

    return-void
.end method

.method private b(Lcom/google/android/gms/internal/jw;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/jw",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/im$a;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/jw;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/im$a;

    invoke-static {v1}, Lcom/google/android/gms/internal/im$a;->d(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/im$b;

    move-result-object v1

    sget-object v3, Lcom/google/android/gms/internal/im$b;->d:Lcom/google/android/gms/internal/im$b;

    if-ne v1, v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move v1, v2

    :goto_1
    move v2, v1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v2, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_3

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/jw;->a(Ljava/lang/Object;)V

    :cond_2
    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/im$23;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/im$23;-><init>(Lcom/google/android/gms/internal/im;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/jw;->b(Lcom/google/android/gms/internal/jw$b;)V

    return-void

    :cond_3
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/jw;->a(Ljava/lang/Object;)V

    goto :goto_2
.end method

.method private b(Lcom/google/android/gms/internal/kv;Ljava/lang/Object;)V
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/ib;->b:Lcom/google/android/gms/internal/kv;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/kv;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    move-object v0, p2

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/mg;->a(J)V

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ij;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/android/gms/internal/kv;

    const/4 v2, 0x0

    sget-object v3, Lcom/google/android/gms/internal/ib;->a:Lcom/google/android/gms/internal/kv;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ij;-><init>([Lcom/google/android/gms/internal/kv;)V

    :try_start_0
    invoke-static {p2}, Lcom/google/android/gms/internal/li;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/im;->f:Lcom/google/android/gms/internal/ir;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ir;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/im;->p:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;)V
    :try_end_0
    .catch Lcom/google/firebase/database/d; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    const-string v2, "Failed to parse info update"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private b(Ljava/util/List;Lcom/google/android/gms/internal/ij;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/im$a;",
            ">;",
            "Lcom/google/android/gms/internal/ij;",
            ")V"
        }
    .end annotation

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/im$a;

    invoke-static {v2}, Lcom/google/android/gms/internal/im$a;->c(Lcom/google/android/gms/internal/im$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :cond_2
    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/google/android/gms/internal/im$a;

    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->f(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/ij;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    move-result-object v2

    const/4 v12, 0x0

    const/4 v11, 0x0

    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    sget-boolean v3, Lcom/google/android/gms/internal/im;->b:Z

    if-nez v3, :cond_3

    if-nez v2, :cond_3

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    :cond_3
    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->d(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/im$b;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/im$b;->f:Lcom/google/android/gms/internal/im$b;

    if-ne v2, v3, :cond_5

    const/4 v2, 0x1

    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->k(Lcom/google/android/gms/internal/im$a;)Lcom/google/firebase/database/c;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/firebase/database/c;->a()I

    move-result v3

    const/16 v4, -0x19

    if-eq v3, v4, :cond_4

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->c(Lcom/google/android/gms/internal/im$a;)J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/iu;->a(JZZLcom/google/android/gms/internal/mc;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_4
    :goto_3
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;)V

    if-eqz v2, :cond_2

    sget-object v2, Lcom/google/android/gms/internal/im$b;->d:Lcom/google/android/gms/internal/im$b;

    invoke-static {v10, v2}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/im$b;)Lcom/google/android/gms/internal/im$b;

    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->f(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/ij;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/google/firebase/database/s;->a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)Lcom/google/firebase/database/e;

    move-result-object v2

    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->b(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/lh;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/firebase/database/s;->a(Lcom/google/firebase/database/e;Lcom/google/android/gms/internal/lc;)Lcom/google/firebase/database/b;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/im$2;

    move-object/from16 v0, p0

    invoke-direct {v3, v0, v10}, Lcom/google/android/gms/internal/im$2;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/im$a;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/Runnable;)V

    new-instance v3, Lcom/google/android/gms/internal/im$3;

    move-object/from16 v0, p0

    invoke-direct {v3, v0, v10, v9, v2}, Lcom/google/android/gms/internal/im$3;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/im$a;Lcom/google/firebase/database/c;Lcom/google/firebase/database/b;)V

    invoke-interface {v13, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_5
    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->d(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/im$b;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/im$b;->b:Lcom/google/android/gms/internal/im$b;

    if-ne v2, v3, :cond_a

    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->l(Lcom/google/android/gms/internal/im$a;)I

    move-result v2

    const/16 v3, 0x19

    if-lt v2, v3, :cond_6

    const/4 v2, 0x1

    const-string v3, "maxretries"

    invoke-static {v3}, Lcom/google/firebase/database/c;->a(Ljava/lang/String;)Lcom/google/firebase/database/c;

    move-result-object v9

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->c(Lcom/google/android/gms/internal/im$a;)J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/iu;->a(JZZLcom/google/android/gms/internal/mc;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    :cond_6
    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->f(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/ij;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v14}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ij;Ljava/util/List;)Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-static {v10, v2}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    invoke-static {v2}, Lcom/google/firebase/database/s;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/firebase/database/k;

    move-result-object v2

    const/4 v3, 0x0

    :try_start_0
    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->i(Lcom/google/android/gms/internal/im$a;)Lcom/google/firebase/database/q$a;

    move-result-object v4

    invoke-interface {v4, v2}, Lcom/google/firebase/database/q$a;->a(Lcom/google/firebase/database/k;)Lcom/google/firebase/database/q$b;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    move-object v9, v3

    :goto_4
    invoke-virtual {v2}, Lcom/google/firebase/database/q$b;->a()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->c(Lcom/google/android/gms/internal/im$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    invoke-static {v3}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/mc;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/firebase/database/q$b;->b()Lcom/google/android/gms/internal/lh;

    move-result-object v4

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/lh;Ljava/util/Map;)Lcom/google/android/gms/internal/lh;

    move-result-object v5

    invoke-static {v10, v4}, Lcom/google/android/gms/internal/im$a;->b(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    invoke-static {v10, v5}, Lcom/google/android/gms/internal/im$a;->c(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/im;->k()J

    move-result-wide v2

    invoke-static {v10, v2, v3}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;J)J

    move-object/from16 v0, v17

    invoke-interface {v14, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->f(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/ij;

    move-result-object v3

    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->c(Lcom/google/android/gms/internal/im$a;)J

    move-result-wide v6

    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->m(Lcom/google/android/gms/internal/im$a;)Z

    move-result v8

    const/4 v9, 0x0

    invoke-virtual/range {v2 .. v9}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lh;JZZ)Ljava/util/List;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/iu;->a(JZZLcom/google/android/gms/internal/mc;)Ljava/util/List;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-object v9, v11

    move v2, v12

    goto/16 :goto_3

    :catch_0
    move-exception v2

    invoke-static {v2}, Lcom/google/firebase/database/c;->a(Ljava/lang/Throwable;)Lcom/google/firebase/database/c;

    move-result-object v3

    invoke-static {}, Lcom/google/firebase/database/q;->a()Lcom/google/firebase/database/q$b;

    move-result-object v2

    move-object v9, v3

    goto :goto_4

    :cond_7
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-static {v10}, Lcom/google/android/gms/internal/im$a;->c(Lcom/google/android/gms/internal/im$a;)J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/internal/iu;->a(JZZLcom/google/android/gms/internal/mc;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v0, v16

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_3

    :cond_8
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/im;->h:Lcom/google/android/gms/internal/jw;

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/jw;)V

    const/4 v2, 0x0

    move v3, v2

    :goto_5
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v2

    if-ge v3, v2, :cond_9

    invoke-interface {v13, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/im;->b(Ljava/lang/Runnable;)V

    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_5

    :cond_9
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/im;->m()V

    goto/16 :goto_0

    :cond_a
    move-object v9, v11

    move v2, v12

    goto/16 :goto_3
.end method

.method static synthetic c(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/hr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->e:Lcom/google/android/gms/internal/hr;

    return-object v0
.end method

.method private c(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jw;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            ")",
            "Lcom/google/android/gms/internal/jw",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/im$a;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->h:Lcom/google/android/gms/internal/jw;

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jw;->a()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ij;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/internal/kv;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ij;-><init>([Lcom/google/android/gms/internal/kv;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/jw;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jw;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->e()Lcom/google/android/gms/internal/ij;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private c(Lcom/google/android/gms/internal/jw;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/jw",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/im$a;",
            ">;>;)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/im$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;Lcom/google/android/gms/internal/jw;)V

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/ir;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->f:Lcom/google/android/gms/internal/ir;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/iu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->p:Lcom/google/android/gms/internal/iu;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/is;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->g:Lcom/google/android/gms/internal/is;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/iu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/mg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    return-object v0
.end method

.method static synthetic i(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/internal/jw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->h:Lcom/google/android/gms/internal/jw;

    return-object v0
.end method

.method private j()V
    .locals 6

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->k:Lcom/google/android/gms/internal/ic;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ic;->p()Lcom/google/android/gms/internal/hy;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/im$4;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/im$4;-><init>(Lcom/google/android/gms/internal/im;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/hy;->a(Lcom/google/android/gms/internal/hy$b;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->e:Lcom/google/android/gms/internal/hr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hr;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->k:Lcom/google/android/gms/internal/ic;

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->c:Lcom/google/android/gms/internal/in;

    iget-object v1, v1, Lcom/google/android/gms/internal/in;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ic;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/jp;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ir;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ir;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/im;->f:Lcom/google/android/gms/internal/ir;

    new-instance v1, Lcom/google/android/gms/internal/is;

    invoke-direct {v1}, Lcom/google/android/gms/internal/is;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/im;->g:Lcom/google/android/gms/internal/is;

    new-instance v1, Lcom/google/android/gms/internal/jw;

    invoke-direct {v1}, Lcom/google/android/gms/internal/jw;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/im;->h:Lcom/google/android/gms/internal/jw;

    new-instance v1, Lcom/google/android/gms/internal/iu;

    iget-object v2, p0, Lcom/google/android/gms/internal/im;->k:Lcom/google/android/gms/internal/ic;

    new-instance v3, Lcom/google/android/gms/internal/jo;

    invoke-direct {v3}, Lcom/google/android/gms/internal/jo;-><init>()V

    new-instance v4, Lcom/google/android/gms/internal/im$9;

    invoke-direct {v4, p0}, Lcom/google/android/gms/internal/im$9;-><init>(Lcom/google/android/gms/internal/im;)V

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/iu;-><init>(Lcom/google/android/gms/internal/ic;Lcom/google/android/gms/internal/jp;Lcom/google/android/gms/internal/iu$d;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/im;->p:Lcom/google/android/gms/internal/iu;

    new-instance v1, Lcom/google/android/gms/internal/iu;

    iget-object v2, p0, Lcom/google/android/gms/internal/im;->k:Lcom/google/android/gms/internal/ic;

    new-instance v3, Lcom/google/android/gms/internal/im$10;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/im$10;-><init>(Lcom/google/android/gms/internal/im;)V

    invoke-direct {v1, v2, v0, v3}, Lcom/google/android/gms/internal/iu;-><init>(Lcom/google/android/gms/internal/ic;Lcom/google/android/gms/internal/jp;Lcom/google/android/gms/internal/iu$d;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/jp;)V

    sget-object v0, Lcom/google/android/gms/internal/ib;->c:Lcom/google/android/gms/internal/kv;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/kv;Ljava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/internal/ib;->d:Lcom/google/android/gms/internal/kv;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/kv;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic j(Lcom/google/android/gms/internal/im;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/im;->m()V

    return-void
.end method

.method private k()J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/im;->o:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/google/android/gms/internal/im;->o:J

    return-wide v0
.end method

.method private l()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    invoke-static {v0}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/mc;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->g:Lcom/google/android/gms/internal/is;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/is;Ljava/util/Map;)Lcom/google/android/gms/internal/is;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/im$18;

    invoke-direct {v3, p0, v1}, Lcom/google/android/gms/internal/im$18;-><init>(Lcom/google/android/gms/internal/im;Ljava/util/List;)V

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/is$b;)V

    new-instance v0, Lcom/google/android/gms/internal/is;

    invoke-direct {v0}, Lcom/google/android/gms/internal/is;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/im;->g:Lcom/google/android/gms/internal/is;

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;)V

    return-void
.end method

.method private m()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->h:Lcom/google/android/gms/internal/jw;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/jw;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/jw;)V

    return-void
.end method

.method private n()J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/im;->t:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/google/android/gms/internal/im;->t:J

    return-wide v0
.end method


# virtual methods
.method public a()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ib;->d:Lcom/google/android/gms/internal/kv;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/kv;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ie;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ib;->a:Lcom/google/android/gms/internal/kv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ie;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kv;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->p:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/ie;)Ljava/util/List;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/ie;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;Lcom/google/firebase/database/e$a;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Lcom/google/android/gms/internal/ia;",
            "Lcom/google/firebase/database/e$a;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x8

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "update: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->n:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->n:Lcom/google/android/gms/internal/ks;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x9

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "update: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ia;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    const-string v1, "update called with no changes. No-op"

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, p3, v0, p1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/firebase/database/e$a;Lcom/google/firebase/database/c;Lcom/google/android/gms/internal/ij;)V

    :goto_0
    return-void

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    invoke-static {v0}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/mc;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/ia;Ljava/util/Map;)Lcom/google/android/gms/internal/ia;

    move-result-object v3

    invoke-direct {p0}, Lcom/google/android/gms/internal/im;->k()J

    move-result-wide v4

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    const/4 v6, 0x1

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;Lcom/google/android/gms/internal/ia;JZ)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->e:Lcom/google/android/gms/internal/hr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->c()Ljava/util/List;

    move-result-object v7

    new-instance v1, Lcom/google/android/gms/internal/im$15;

    move-object v2, p0

    move-object v3, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/im$15;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;JLcom/google/firebase/database/e$a;)V

    invoke-interface {v0, v7, p4, v1}, Lcom/google/android/gms/internal/hr;->a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/hu;)V

    const/16 v0, -0x9

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ij;I)Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)V
    .locals 9

    const/4 v7, 0x0

    const/4 v6, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x5

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "set: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->n:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->n:Lcom/google/android/gms/internal/ks;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x6

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "set: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    invoke-static {v0}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/mc;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/lh;Ljava/util/Map;)Lcom/google/android/gms/internal/lh;

    move-result-object v3

    invoke-direct {p0}, Lcom/google/android/gms/internal/im;->k()J

    move-result-wide v4

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    move-object v1, p1

    move-object v2, p2

    move v7, v6

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lh;JZZ)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->e:Lcom/google/android/gms/internal/hr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->c()Ljava/util/List;

    move-result-object v7

    invoke-interface {p2, v6}, Lcom/google/android/gms/internal/lh;->a(Z)Ljava/lang/Object;

    move-result-object v8

    new-instance v1, Lcom/google/android/gms/internal/im$14;

    move-object v2, p0

    move-object v3, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/im$14;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;JLcom/google/firebase/database/e$a;)V

    invoke-interface {v0, v7, v8, v1}, Lcom/google/android/gms/internal/hr;->a(Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;)V

    const/16 v0, -0x9

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ij;I)Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/e$a;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->e:Lcom/google/android/gms/internal/hr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->c()Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/im$17;

    invoke-direct {v2, p0, p1, p2}, Lcom/google/android/gms/internal/im$17;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/e$a;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/hr;->a(Ljava/util/List;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/q$a;Z)V
    .locals 12

    const/4 v10, 0x0

    const/4 v8, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xd

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "transaction: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v10, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->n:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xd

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "transaction: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v10, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->k:Lcom/google/android/gms/internal/ic;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ic;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/im;->s:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/im;->s:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->m:Lcom/google/android/gms/internal/ks;

    const-string v1, "runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details."

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ks;->b(Ljava/lang/String;)V

    :cond_2
    invoke-static {p0, p1}, Lcom/google/firebase/database/s;->a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)Lcom/google/firebase/database/e;

    move-result-object v9

    new-instance v3, Lcom/google/android/gms/internal/im$19;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/im$19;-><init>(Lcom/google/android/gms/internal/im;)V

    new-instance v0, Lcom/google/android/gms/internal/ja;

    invoke-virtual {v9}, Lcom/google/firebase/database/e;->o()Lcom/google/android/gms/internal/kg;

    move-result-object v1

    invoke-direct {v0, p0, v3, v1}, Lcom/google/android/gms/internal/ja;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/r;Lcom/google/android/gms/internal/kg;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/ie;)V

    new-instance v0, Lcom/google/android/gms/internal/im$a;

    sget-object v4, Lcom/google/android/gms/internal/im$b;->a:Lcom/google/android/gms/internal/im$b;

    invoke-direct {p0}, Lcom/google/android/gms/internal/im;->n()J

    move-result-wide v6

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/im$a;-><init>(Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/q$a;Lcom/google/firebase/database/r;Lcom/google/android/gms/internal/im$b;ZJLcom/google/android/gms/internal/im$1;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    invoke-static {v1}, Lcom/google/firebase/database/s;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/firebase/database/k;

    move-result-object v1

    :try_start_0
    invoke-interface {p2, v1}, Lcom/google/firebase/database/q$a;->a(Lcom/google/firebase/database/k;)Lcom/google/firebase/database/q$b;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Transaction returned null as result"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v1

    invoke-static {v1}, Lcom/google/firebase/database/c;->a(Ljava/lang/Throwable;)Lcom/google/firebase/database/c;

    move-result-object v2

    invoke-static {}, Lcom/google/firebase/database/q;->a()Lcom/google/firebase/database/q$b;

    move-result-object v1

    move-object v11, v1

    move-object v1, v2

    move-object v2, v11

    :goto_0
    invoke-virtual {v2}, Lcom/google/firebase/database/q$b;->a()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v0, v8}, Lcom/google/android/gms/internal/im$a;->b(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    invoke-static {v0, v8}, Lcom/google/android/gms/internal/im$a;->c(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->b(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/firebase/database/s;->a(Lcom/google/firebase/database/e;Lcom/google/android/gms/internal/lc;)Lcom/google/firebase/database/b;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/im$20;

    invoke-direct {v2, p0, p2, v1, v0}, Lcom/google/android/gms/internal/im$20;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/q$a;Lcom/google/firebase/database/c;Lcom/google/firebase/database/b;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/im;->b(Ljava/lang/Runnable;)V

    :goto_1
    return-void

    :cond_3
    move-object v2, v1

    move-object v1, v8

    goto :goto_0

    :cond_4
    sget-object v1, Lcom/google/android/gms/internal/im$b;->b:Lcom/google/android/gms/internal/im$b;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/im$b;)Lcom/google/android/gms/internal/im$b;

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->h:Lcom/google/android/gms/internal/jw;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/jw;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jw;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/jw;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_5

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_5
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/jw;->a(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    invoke-static {v1}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/mc;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v2}, Lcom/google/firebase/database/q$b;->b()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/lh;Ljava/util/Map;)Lcom/google/android/gms/internal/lh;

    move-result-object v3

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/im$a;->b(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/im$a;->c(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    invoke-direct {p0}, Lcom/google/android/gms/internal/im;->k()J

    move-result-wide v4

    invoke-static {v0, v4, v5}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;J)J

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->c(Lcom/google/android/gms/internal/im$a;)J

    move-result-wide v4

    move-object v0, v1

    move-object v1, p1

    move v6, p3

    move v7, v10

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lh;JZZ)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/im;->m()V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/internal/ij;Ljava/util/Map;Lcom/google/firebase/database/e$a;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/ij;",
            "Lcom/google/android/gms/internal/lh;",
            ">;",
            "Lcom/google/firebase/database/e$a;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->e:Lcom/google/android/gms/internal/hr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->c()Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/im$12;

    invoke-direct {v2, p0, p1, p2, p3}, Lcom/google/android/gms/internal/im$12;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;Ljava/util/Map;Lcom/google/firebase/database/e$a;)V

    invoke-interface {v0, v1, p4, v2}, Lcom/google/android/gms/internal/hr;->b(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/kg;Z)V
    .locals 2

    sget-boolean v0, Lcom/google/android/gms/internal/im;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ib;->a:Lcom/google/android/gms/internal/kv;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kv;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/kg;Z)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/kv;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/kv;Ljava/lang/Object;)V

    return-void
.end method

.method a(Lcom/google/firebase/database/e$a;Lcom/google/firebase/database/c;Lcom/google/android/gms/internal/ij;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ij;->g()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kv;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ij;->f()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/firebase/database/s;->a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)Lcom/google/firebase/database/e;

    move-result-object v0

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/im$13;

    invoke-direct {v1, p0, p1, p2, v0}, Lcom/google/android/gms/internal/im$13;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/e$a;Lcom/google/firebase/database/c;Lcom/google/firebase/database/e;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/im;->b(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :cond_1
    invoke-static {p0, p3}, Lcom/google/firebase/database/s;->a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)Lcom/google/firebase/database/e;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->k:Lcom/google/android/gms/internal/ic;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ic;->c()V

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->k:Lcom/google/android/gms/internal/ic;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ic;->m()Lcom/google/android/gms/internal/ip;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ip;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/util/List;Ljava/lang/Object;ZLjava/lang/Long;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Z",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    const/4 v7, 0x0

    new-instance v1, Lcom/google/android/gms/internal/ij;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ij;-><init>(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0xe

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "onDataUpdate: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->n:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0xf

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "onDataUpdate: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-wide v2, p0, Lcom/google/android/gms/internal/im;->a:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/internal/im;->a:J

    if-eqz p4, :cond_5

    :try_start_0
    new-instance v2, Lcom/google/android/gms/internal/iv;

    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-direct {v2, v4, v5}, Lcom/google/android/gms/internal/iv;-><init>(J)V

    if-eqz p3, :cond_4

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lcom/google/android/gms/internal/li;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v5

    new-instance v6, Lcom/google/android/gms/internal/ij;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v6, v0}, Lcom/google/android/gms/internal/ij;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/firebase/database/d; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    const-string v2, "FIREBASE INTERNAL ERROR"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v0, v1, v3, v2}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Ljava/util/Map;Lcom/google/android/gms/internal/iv;)Ljava/util/List;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_3

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    :cond_3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lcom/google/android/gms/internal/li;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v3, v1, v0, v2}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/iv;)Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :cond_5
    if-eqz p3, :cond_7

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/li;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/internal/ij;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v5, v0}, Lcom/google/android/gms/internal/ij;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :cond_7
    invoke-static {p2}, Lcom/google/android/gms/internal/li;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Ljava/util/List;
    :try_end_1
    .catch Lcom/google/firebase/database/d; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_2
.end method

.method public a(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ht;",
            ">;",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    const/4 v7, 0x0

    new-instance v1, Lcom/google/android/gms/internal/ij;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ij;-><init>(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x14

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "onRangeMergeUpdate: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->n:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x15

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "onRangeMergeUpdate: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-wide v2, p0, Lcom/google/android/gms/internal/im;->a:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/internal/im;->a:J

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ht;

    new-instance v4, Lcom/google/android/gms/internal/lm;

    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/lm;-><init>(Lcom/google/android/gms/internal/ht;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    new-instance v3, Lcom/google/android/gms/internal/iv;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Lcom/google/android/gms/internal/iv;-><init>(J)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Ljava/util/List;Lcom/google/android/gms/internal/iv;)Ljava/util/List;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_3

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    :cond_3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_1
.end method

.method public a(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/internal/kv;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/kv;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/im;->b(Lcom/google/android/gms/internal/kv;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ib;->c:Lcom/google/android/gms/internal/kv;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/kv;Ljava/lang/Object;)V

    return-void
.end method

.method public b()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ib;->d:Lcom/google/android/gms/internal/kv;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/kv;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/im;->l()V

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/ie;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ie;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ib;->a:Lcom/google/android/gms/internal/kv;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kv;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->p:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ie;)Ljava/util/List;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ie;)Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->e:Lcom/google/android/gms/internal/hr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->c()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p2, v2}, Lcom/google/android/gms/internal/lh;->a(Z)Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/im$16;

    invoke-direct {v3, p0, p1, p2, p3}, Lcom/google/android/gms/internal/im$16;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)V

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/hr;->b(Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->k:Lcom/google/android/gms/internal/ic;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ic;->c()V

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->k:Lcom/google/android/gms/internal/ic;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ic;->l()Lcom/google/android/gms/internal/ig;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ig;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c()Lcom/google/firebase/database/g;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->r:Lcom/google/firebase/database/g;

    return-object v0
.end method

.method public d()Lcom/google/android/gms/internal/in;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->c:Lcom/google/android/gms/internal/in;

    return-object v0
.end method

.method public e()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->d:Lcom/google/android/gms/internal/mg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mg;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method f()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->p:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/iu;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/iu;->a()Z

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

.method public g()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->l:Lcom/google/android/gms/internal/ks;

    const-string v1, "Purging writes"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/im;->q:Lcom/google/android/gms/internal/iu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/iu;->b()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/im;->a(Ljava/util/List;)V

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    const/16 v1, -0x19

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ij;I)Lcom/google/android/gms/internal/ij;

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->e:Lcom/google/android/gms/internal/hr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hr;->d()V

    return-void
.end method

.method h()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->e:Lcom/google/android/gms/internal/hr;

    const-string v1, "repo_interrupt"

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/hr;->d(Ljava/lang/String;)V

    return-void
.end method

.method i()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->e:Lcom/google/android/gms/internal/hr;

    const-string v1, "repo_interrupt"

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/hr;->e(Ljava/lang/String;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im;->c:Lcom/google/android/gms/internal/in;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/in;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
