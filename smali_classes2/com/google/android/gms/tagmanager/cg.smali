.class Lcom/google/android/gms/tagmanager/cg;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/tagmanager/cg$b;,
        Lcom/google/android/gms/tagmanager/cg$a;,
        Lcom/google/android/gms/tagmanager/cg$c;
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/tagmanager/bn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Lcom/google/android/gms/internal/hj$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/google/android/gms/internal/en$c;

.field private final c:Lcom/google/android/gms/tagmanager/q;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/t;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/t;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/t;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/tagmanager/di;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tagmanager/di",
            "<",
            "Lcom/google/android/gms/internal/en$a;",
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Lcom/google/android/gms/internal/hj$a;",
            ">;>;"
        }
    .end annotation
.end field

.field private final h:Lcom/google/android/gms/tagmanager/di;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tagmanager/di",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/cg$b;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/en$e;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lcom/google/android/gms/tagmanager/e;

.field private final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/cg$c;",
            ">;"
        }
    .end annotation
.end field

.field private volatile l:Ljava/lang/String;

.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/tagmanager/bn;

    invoke-static {}, Lcom/google/android/gms/tagmanager/cw;->g()Lcom/google/android/gms/internal/hj$a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/bn;-><init>(Ljava/lang/Object;Z)V

    sput-object v0, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/en$c;Lcom/google/android/gms/tagmanager/e;Lcom/google/android/gms/tagmanager/dr$a;Lcom/google/android/gms/tagmanager/dr$a;Lcom/google/android/gms/tagmanager/q;)V
    .locals 8

    const/high16 v2, 0x100000

    const/4 v4, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "resource cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p2, p0, Lcom/google/android/gms/tagmanager/cg;->b:Lcom/google/android/gms/internal/en$c;

    new-instance v0, Ljava/util/HashSet;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/en$c;->b()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->i:Ljava/util/Set;

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/cg;->j:Lcom/google/android/gms/tagmanager/e;

    iput-object p6, p0, Lcom/google/android/gms/tagmanager/cg;->c:Lcom/google/android/gms/tagmanager/q;

    new-instance v0, Lcom/google/android/gms/tagmanager/cg$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/cg$1;-><init>(Lcom/google/android/gms/tagmanager/cg;)V

    new-instance v1, Lcom/google/android/gms/tagmanager/dj;

    invoke-direct {v1}, Lcom/google/android/gms/tagmanager/dj;-><init>()V

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/tagmanager/dj;->a(ILcom/google/android/gms/tagmanager/dj$a;)Lcom/google/android/gms/tagmanager/di;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->g:Lcom/google/android/gms/tagmanager/di;

    new-instance v0, Lcom/google/android/gms/tagmanager/cg$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/cg$2;-><init>(Lcom/google/android/gms/tagmanager/cg;)V

    new-instance v1, Lcom/google/android/gms/tagmanager/dj;

    invoke-direct {v1}, Lcom/google/android/gms/tagmanager/dj;-><init>()V

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/tagmanager/dj;->a(ILcom/google/android/gms/tagmanager/dj$a;)Lcom/google/android/gms/tagmanager/di;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->h:Lcom/google/android/gms/tagmanager/di;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->d:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/tagmanager/dg;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/dg;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->b(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/dr;

    invoke-direct {v0, p5}, Lcom/google/android/gms/tagmanager/dr;-><init>(Lcom/google/android/gms/tagmanager/dr$a;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->b(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/dv;

    invoke-direct {v0, p3}, Lcom/google/android/gms/tagmanager/dv;-><init>(Lcom/google/android/gms/tagmanager/e;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->b(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/cx;

    invoke-direct {v0, p1, p3}, Lcom/google/android/gms/tagmanager/cx;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/e;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->b(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->e:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/tagmanager/dp;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/dp;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->c(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/n;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/n;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->c(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/o;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/o;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->c(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/v;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/v;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->c(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/w;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/w;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->c(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/as;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/as;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->c(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/at;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/at;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->c(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bw;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/bw;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->c(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/cq;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/cq;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->c(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->f:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/tagmanager/ah;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/ah;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bi;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/bi;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/db;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/db;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/dc;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/dc;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/dd;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/dd;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/de;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/de;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/df;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/df;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/dk;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/dk;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/do;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/cg;->b:Lcom/google/android/gms/internal/en$c;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/en$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/tagmanager/do;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/dr;

    invoke-direct {v0, p4}, Lcom/google/android/gms/tagmanager/dr;-><init>(Lcom/google/android/gms/tagmanager/dr$a;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/dt;

    invoke-direct {v0, p3}, Lcom/google/android/gms/tagmanager/dt;-><init>(Lcom/google/android/gms/tagmanager/e;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/i;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/i;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/j;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/j;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/m;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/m;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/r;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/r;-><init>(Lcom/google/android/gms/tagmanager/cg;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/x;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/x;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/y;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/y;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/am;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/am;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/ao;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/ao;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/ar;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/ar;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/ay;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/ay;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/ba;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/ba;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bo;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/bo;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bq;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/bq;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bt;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/bt;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bv;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/bv;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bx;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/bx;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/ch;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/ch;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/ci;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/ci;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/cs;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/cs;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/cy;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/cy;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/tagmanager/t;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->k:Ljava/util/Map;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->i:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/en$e;

    invoke-interface {p6}, Lcom/google/android/gms/tagmanager/q;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->f()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->g()Ljava/util/List;

    move-result-object v2

    const-string v3, "add macro"

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->k()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->h()Ljava/util/List;

    move-result-object v2

    const-string v3, "remove macro"

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->i()Ljava/util/List;

    move-result-object v2

    const-string v3, "add tag"

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->e()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->j()Ljava/util/List;

    move-result-object v2

    const-string v3, "remove tag"

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    :cond_2
    move v3, v4

    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/en$a;

    const-string v2, "Unknown"

    invoke-interface {p6}, Lcom/google/android/gms/tagmanager/q;->a()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->g()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v3, v6, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->g()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :cond_3
    iget-object v6, p0, Lcom/google/android/gms/tagmanager/cg;->k:Ljava/util/Map;

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/internal/en$a;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/Map;Ljava/lang/String;)Lcom/google/android/gms/tagmanager/cg$c;

    move-result-object v6

    invoke-virtual {v6, v0}, Lcom/google/android/gms/tagmanager/cg$c;->a(Lcom/google/android/gms/internal/en$e;)V

    invoke-virtual {v6, v0, v1}, Lcom/google/android/gms/tagmanager/cg$c;->a(Lcom/google/android/gms/internal/en$e;Lcom/google/android/gms/internal/en$a;)V

    invoke-virtual {v6, v0, v2}, Lcom/google/android/gms/tagmanager/cg$c;->a(Lcom/google/android/gms/internal/en$e;Ljava/lang/String;)V

    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_0

    :cond_4
    move v3, v4

    :goto_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->k()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->k()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/en$a;

    const-string v2, "Unknown"

    invoke-interface {p6}, Lcom/google/android/gms/tagmanager/q;->a()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->h()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v3, v6, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$e;->h()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :cond_5
    iget-object v6, p0, Lcom/google/android/gms/tagmanager/cg;->k:Ljava/util/Map;

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/internal/en$a;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/Map;Ljava/lang/String;)Lcom/google/android/gms/tagmanager/cg$c;

    move-result-object v6

    invoke-virtual {v6, v0}, Lcom/google/android/gms/tagmanager/cg$c;->a(Lcom/google/android/gms/internal/en$e;)V

    invoke-virtual {v6, v0, v1}, Lcom/google/android/gms/tagmanager/cg$c;->b(Lcom/google/android/gms/internal/en$e;Lcom/google/android/gms/internal/en$a;)V

    invoke-virtual {v6, v0, v2}, Lcom/google/android/gms/tagmanager/cg$c;->b(Lcom/google/android/gms/internal/en$e;Ljava/lang/String;)V

    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->b:Lcom/google/android/gms/internal/en$c;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/en$c;->d()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/en$a;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/en$a;->b()Ljava/util/Map;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/internal/fh;->bW:Lcom/google/android/gms/internal/fh;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/fh;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/hj$a;

    invoke-static {v2}, Lcom/google/android/gms/tagmanager/cw;->e(Lcom/google/android/gms/internal/hj$a;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v5, p0, Lcom/google/android/gms/tagmanager/cg;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v5, v2}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/Map;Ljava/lang/String;)Lcom/google/android/gms/tagmanager/cg$c;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/tagmanager/cg$c;->a(Lcom/google/android/gms/internal/en$a;)V

    goto :goto_2

    :cond_9
    return-void
.end method

.method private a(Lcom/google/android/gms/internal/hj$a;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cz;)Lcom/google/android/gms/tagmanager/bn;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/hj$a;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/tagmanager/cz;",
            ")",
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Lcom/google/android/gms/internal/hj$a;",
            ">;"
        }
    .end annotation

    const/4 v2, 0x0

    iget-boolean v0, p1, Lcom/google/android/gms/internal/hj$a;->l:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/tagmanager/bn;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/tagmanager/bn;-><init>(Ljava/lang/Object;Z)V

    :goto_0
    return-object v0

    :cond_0
    iget v0, p1, Lcom/google/android/gms/internal/hj$a;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget v0, p1, Lcom/google/android/gms/internal/hj$a;->a:I

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unknown type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lcom/google/android/gms/internal/en;->a(Lcom/google/android/gms/internal/hj$a;)Lcom/google/android/gms/internal/hj$a;

    move-result-object v3

    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->c:[Lcom/google/android/gms/internal/hj$a;

    array-length v0, v0

    new-array v0, v0, [Lcom/google/android/gms/internal/hj$a;

    iput-object v0, v3, Lcom/google/android/gms/internal/hj$a;->c:[Lcom/google/android/gms/internal/hj$a;

    move v1, v2

    :goto_1
    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->c:[Lcom/google/android/gms/internal/hj$a;

    array-length v0, v0

    if-ge v1, v0, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->c:[Lcom/google/android/gms/internal/hj$a;

    aget-object v0, v0, v1

    invoke-interface {p3, v1}, Lcom/google/android/gms/tagmanager/cz;->a(I)Lcom/google/android/gms/tagmanager/cz;

    move-result-object v4

    invoke-direct {p0, v0, p2, v4}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/internal/hj$a;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cz;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v0

    sget-object v4, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    if-ne v0, v4, :cond_1

    sget-object v0, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    goto :goto_0

    :cond_1
    iget-object v4, v3, Lcom/google/android/gms/internal/hj$a;->c:[Lcom/google/android/gms/internal/hj$a;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hj$a;

    aput-object v0, v4, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/google/android/gms/tagmanager/bn;

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/tagmanager/bn;-><init>(Ljava/lang/Object;Z)V

    goto :goto_0

    :pswitch_2
    invoke-static {p1}, Lcom/google/android/gms/internal/en;->a(Lcom/google/android/gms/internal/hj$a;)Lcom/google/android/gms/internal/hj$a;

    move-result-object v3

    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->d:[Lcom/google/android/gms/internal/hj$a;

    array-length v0, v0

    iget-object v1, p1, Lcom/google/android/gms/internal/hj$a;->e:[Lcom/google/android/gms/internal/hj$a;

    array-length v1, v1

    if-eq v0, v1, :cond_4

    const-string v1, "Invalid serving value: "

    invoke-virtual {p1}, Lcom/google/android/gms/internal/hj$a;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->d:[Lcom/google/android/gms/internal/hj$a;

    array-length v0, v0

    new-array v0, v0, [Lcom/google/android/gms/internal/hj$a;

    iput-object v0, v3, Lcom/google/android/gms/internal/hj$a;->d:[Lcom/google/android/gms/internal/hj$a;

    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->d:[Lcom/google/android/gms/internal/hj$a;

    array-length v0, v0

    new-array v0, v0, [Lcom/google/android/gms/internal/hj$a;

    iput-object v0, v3, Lcom/google/android/gms/internal/hj$a;->e:[Lcom/google/android/gms/internal/hj$a;

    move v1, v2

    :goto_3
    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->d:[Lcom/google/android/gms/internal/hj$a;

    array-length v0, v0

    if-ge v1, v0, :cond_7

    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->d:[Lcom/google/android/gms/internal/hj$a;

    aget-object v0, v0, v1

    invoke-interface {p3, v1}, Lcom/google/android/gms/tagmanager/cz;->b(I)Lcom/google/android/gms/tagmanager/cz;

    move-result-object v4

    invoke-direct {p0, v0, p2, v4}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/internal/hj$a;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cz;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v0

    iget-object v4, p1, Lcom/google/android/gms/internal/hj$a;->e:[Lcom/google/android/gms/internal/hj$a;

    aget-object v4, v4, v1

    invoke-interface {p3, v1}, Lcom/google/android/gms/tagmanager/cz;->c(I)Lcom/google/android/gms/tagmanager/cz;

    move-result-object v5

    invoke-direct {p0, v4, p2, v5}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/internal/hj$a;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cz;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    if-eq v0, v5, :cond_5

    sget-object v5, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    if-ne v4, v5, :cond_6

    :cond_5
    sget-object v0, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    goto/16 :goto_0

    :cond_6
    iget-object v5, v3, Lcom/google/android/gms/internal/hj$a;->d:[Lcom/google/android/gms/internal/hj$a;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hj$a;

    aput-object v0, v5, v1

    iget-object v5, v3, Lcom/google/android/gms/internal/hj$a;->e:[Lcom/google/android/gms/internal/hj$a;

    invoke-virtual {v4}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hj$a;

    aput-object v0, v5, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    :cond_7
    new-instance v0, Lcom/google/android/gms/tagmanager/bn;

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/tagmanager/bn;-><init>(Ljava/lang/Object;Z)V

    goto/16 :goto_0

    :pswitch_3
    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->f:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->f:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x4f

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Macro cycle detected.  Current macro reference: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".  Previous macro references: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    goto/16 :goto_0

    :cond_8
    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->f:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->f:Ljava/lang/String;

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/cz;->a()Lcom/google/android/gms/tagmanager/az;

    move-result-object v1

    invoke-direct {p0, v0, p2, v1}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/lang/String;Ljava/util/Set;Lcom/google/android/gms/tagmanager/az;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/hj$a;->k:[I

    invoke-static {v0, v1}, Lcom/google/android/gms/tagmanager/da;->a(Lcom/google/android/gms/tagmanager/bn;[I)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/hj$a;->f:Ljava/lang/String;

    invoke-interface {p2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_4
    invoke-static {p1}, Lcom/google/android/gms/internal/en;->a(Lcom/google/android/gms/internal/hj$a;)Lcom/google/android/gms/internal/hj$a;

    move-result-object v3

    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->j:[Lcom/google/android/gms/internal/hj$a;

    array-length v0, v0

    new-array v0, v0, [Lcom/google/android/gms/internal/hj$a;

    iput-object v0, v3, Lcom/google/android/gms/internal/hj$a;->j:[Lcom/google/android/gms/internal/hj$a;

    move v1, v2

    :goto_4
    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->j:[Lcom/google/android/gms/internal/hj$a;

    array-length v0, v0

    if-ge v1, v0, :cond_a

    iget-object v0, p1, Lcom/google/android/gms/internal/hj$a;->j:[Lcom/google/android/gms/internal/hj$a;

    aget-object v0, v0, v1

    invoke-interface {p3, v1}, Lcom/google/android/gms/tagmanager/cz;->d(I)Lcom/google/android/gms/tagmanager/cz;

    move-result-object v4

    invoke-direct {p0, v0, p2, v4}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/internal/hj$a;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cz;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v0

    sget-object v4, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    if-ne v0, v4, :cond_9

    sget-object v0, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    goto/16 :goto_0

    :cond_9
    iget-object v4, v3, Lcom/google/android/gms/internal/hj$a;->j:[Lcom/google/android/gms/internal/hj$a;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hj$a;

    aput-object v0, v4, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4

    :cond_a
    new-instance v0, Lcom/google/android/gms/tagmanager/bn;

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/tagmanager/bn;-><init>(Ljava/lang/Object;Z)V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method private a(Ljava/lang/String;Ljava/util/Set;Lcom/google/android/gms/tagmanager/az;)Lcom/google/android/gms/tagmanager/bn;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/tagmanager/az;",
            ")",
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Lcom/google/android/gms/internal/hj$a;",
            ">;"
        }
    .end annotation

    const/4 v10, 0x1

    iget v0, p0, Lcom/google/android/gms/tagmanager/cg;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/tagmanager/cg;->m:I

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->h:Lcom/google/android/gms/tagmanager/di;

    invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/di;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/cg$b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/cg;->c:Lcom/google/android/gms/tagmanager/q;

    invoke-interface {v1}, Lcom/google/android/gms/tagmanager/q;->a()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/cg$b;->b()Lcom/google/android/gms/internal/hj$a;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/internal/hj$a;Ljava/util/Set;)V

    iget v1, p0, Lcom/google/android/gms/tagmanager/cg;->m:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/android/gms/tagmanager/cg;->m:I

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/cg$b;->a()Lcom/google/android/gms/tagmanager/bn;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->k:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/google/android/gms/tagmanager/cg$c;

    if-nez v9, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cg;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0xf

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Invalid macro: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V

    iget v0, p0, Lcom/google/android/gms/tagmanager/cg;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/tagmanager/cg;->m:I

    sget-object v0, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    goto :goto_0

    :cond_1
    invoke-virtual {v9}, Lcom/google/android/gms/tagmanager/cg$c;->a()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v9}, Lcom/google/android/gms/tagmanager/cg$c;->b()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v9}, Lcom/google/android/gms/tagmanager/cg$c;->c()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v9}, Lcom/google/android/gms/tagmanager/cg$c;->e()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v9}, Lcom/google/android/gms/tagmanager/cg$c;->d()Ljava/util/Map;

    move-result-object v6

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/az;->b()Lcom/google/android/gms/tagmanager/cf;

    move-result-object v8

    move-object v0, p0

    move-object v1, p1

    move-object v7, p2

    invoke-virtual/range {v0 .. v8}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cf;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v9}, Lcom/google/android/gms/tagmanager/cg$c;->f()Lcom/google/android/gms/internal/en$a;

    move-result-object v0

    move-object v3, v0

    :goto_1
    if-nez v3, :cond_4

    iget v0, p0, Lcom/google/android/gms/tagmanager/cg;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/tagmanager/cg;->m:I

    sget-object v0, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    goto/16 :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-le v0, v10, :cond_3

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cg;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x25

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "Multiple macros active for macroName "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->b(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/en$a;

    move-object v3, v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->f:Ljava/util/Map;

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/az;->a()Lcom/google/android/gms/tagmanager/by;

    move-result-object v2

    invoke-direct {p0, v0, v3, p2, v2}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/Map;Lcom/google/android/gms/internal/en$a;Ljava/util/Set;Lcom/google/android/gms/tagmanager/by;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/bn;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v4}, Lcom/google/android/gms/tagmanager/bn;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    move v1, v10

    :goto_2
    sget-object v0, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    if-ne v4, v0, :cond_7

    sget-object v0, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    :goto_3
    invoke-virtual {v3}, Lcom/google/android/gms/internal/en$a;->c()Lcom/google/android/gms/internal/hj$a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bn;->b()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/cg;->h:Lcom/google/android/gms/tagmanager/di;

    new-instance v3, Lcom/google/android/gms/tagmanager/cg$b;

    invoke-direct {v3, v0, v1}, Lcom/google/android/gms/tagmanager/cg$b;-><init>(Lcom/google/android/gms/tagmanager/bn;Lcom/google/android/gms/internal/hj$a;)V

    invoke-interface {v2, p1, v3}, Lcom/google/android/gms/tagmanager/di;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    invoke-direct {p0, v1, p2}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/internal/hj$a;Ljava/util/Set;)V

    iget v1, p0, Lcom/google/android/gms/tagmanager/cg;->m:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/android/gms/tagmanager/cg;->m:I

    goto/16 :goto_0

    :cond_6
    const/4 v0, 0x0

    move v1, v0

    goto :goto_2

    :cond_7
    new-instance v2, Lcom/google/android/gms/tagmanager/bn;

    invoke-virtual {v4}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hj$a;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/tagmanager/bn;-><init>(Ljava/lang/Object;Z)V

    move-object v0, v2

    goto :goto_3
.end method

.method private a(Ljava/util/Map;Lcom/google/android/gms/internal/en$a;Ljava/util/Set;Lcom/google/android/gms/tagmanager/by;)Lcom/google/android/gms/tagmanager/bn;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/t;",
            ">;",
            "Lcom/google/android/gms/internal/en$a;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/tagmanager/by;",
            ")",
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Lcom/google/android/gms/internal/hj$a;",
            ">;"
        }
    .end annotation

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/en$a;->b()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/fh;->bf:Lcom/google/android/gms/internal/fh;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/fh;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hj$a;

    if-nez v0, :cond_1

    const-string v0, "No function id in properties"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    :cond_0
    :goto_0
    return-object v1

    :cond_1
    iget-object v7, v0, Lcom/google/android/gms/internal/hj$a;->g:Ljava/lang/String;

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/t;

    if-nez v0, :cond_2

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, " has no backing implementation."

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/cg;->g:Lcom/google/android/gms/tagmanager/di;

    invoke-interface {v1, p2}, Lcom/google/android/gms/tagmanager/di;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/tagmanager/bn;

    if-eqz v1, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/cg;->c:Lcom/google/android/gms/tagmanager/q;

    invoke-interface {v2}, Lcom/google/android/gms/tagmanager/q;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_3
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/en$a;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v4, v5

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p4, v2}, Lcom/google/android/gms/tagmanager/by;->a(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/ca;

    move-result-object v10

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/hj$a;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/hj$a;

    invoke-interface {v10, v3}, Lcom/google/android/gms/tagmanager/ca;->a(Lcom/google/android/gms/internal/hj$a;)Lcom/google/android/gms/tagmanager/cz;

    move-result-object v3

    invoke-direct {p0, v2, p3, v3}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/internal/hj$a;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cz;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v10

    sget-object v2, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    if-ne v10, v2, :cond_4

    sget-object v1, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    goto :goto_0

    :cond_4
    invoke-virtual {v10}, Lcom/google/android/gms/tagmanager/bn;->b()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v10}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/hj$a;

    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/internal/en$a;->a(Ljava/lang/String;Lcom/google/android/gms/internal/hj$a;)V

    move v3, v4

    :goto_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v10}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/hj$a;

    invoke-interface {v8, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v4, v3

    goto :goto_1

    :cond_5
    move v3, v6

    goto :goto_2

    :cond_6
    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/t;->a(Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/t;->c()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x2b

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Incorrect keys for function "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " required "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " had "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    goto/16 :goto_0

    :cond_7
    if-eqz v4, :cond_9

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/t;->a()Z

    move-result v1

    if-eqz v1, :cond_9

    :goto_3
    new-instance v1, Lcom/google/android/gms/tagmanager/bn;

    invoke-virtual {v0, v8}, Lcom/google/android/gms/tagmanager/t;->a(Ljava/util/Map;)Lcom/google/android/gms/internal/hj$a;

    move-result-object v0

    invoke-direct {v1, v0, v5}, Lcom/google/android/gms/tagmanager/bn;-><init>(Ljava/lang/Object;Z)V

    if-eqz v5, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->g:Lcom/google/android/gms/tagmanager/di;

    invoke-interface {v0, p2, v1}, Lcom/google/android/gms/tagmanager/di;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hj$a;

    invoke-interface {p4, v0}, Lcom/google/android/gms/tagmanager/by;->a(Lcom/google/android/gms/internal/hj$a;)V

    goto/16 :goto_0

    :cond_9
    move v5, v6

    goto :goto_3
.end method

.method private a(Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cg$a;Lcom/google/android/gms/tagmanager/cf;)Lcom/google/android/gms/tagmanager/bn;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/en$e;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/tagmanager/cg$a;",
            "Lcom/google/android/gms/tagmanager/cf;",
            ")",
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/en$a;",
            ">;>;"
        }
    .end annotation

    const/4 v3, 0x1

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v2, v3

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/en$e;

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/cf;->a()Lcom/google/android/gms/tagmanager/cb;

    move-result-object v7

    invoke-virtual {p0, v0, p2, v7}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/internal/en$e;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cb;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p3, v0, v4, v5, v7}, Lcom/google/android/gms/tagmanager/cg$a;->a(Lcom/google/android/gms/internal/en$e;Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cb;)V

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v8}, Lcom/google/android/gms/tagmanager/bn;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v3

    :goto_1
    move v2, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    invoke-interface {v4, v5}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    invoke-interface {p4, v4}, Lcom/google/android/gms/tagmanager/cf;->a(Ljava/util/Set;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bn;

    invoke-direct {v0, v4, v2}, Lcom/google/android/gms/tagmanager/bn;-><init>(Ljava/lang/Object;Z)V

    return-object v0
.end method

.method private static a(Ljava/util/Map;Ljava/lang/String;)Lcom/google/android/gms/tagmanager/cg$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/cg$c;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tagmanager/cg$c;"
        }
    .end annotation

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/cg$c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/tagmanager/cg$c;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/cg$c;-><init>()V

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private static a(Lcom/google/android/gms/internal/en$a;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/en$a;->b()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/fh;->br:Lcom/google/android/gms/internal/fh;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/fh;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hj$a;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/cw;->a(Lcom/google/android/gms/internal/hj$a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/hj$a;Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/hj$a;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/tagmanager/bl;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/bl;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/internal/hj$a;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cz;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/tagmanager/cg;->a:Lcom/google/android/gms/tagmanager/bn;

    if-eq v0, v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hj$a;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/cw;->f(Lcom/google/android/gms/internal/hj$a;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/cg;->j:Lcom/google/android/gms/tagmanager/e;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/tagmanager/e;->a(Ljava/util/Map;)V

    goto :goto_0

    :cond_2
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_4

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/util/Map;

    if-eqz v2, :cond_3

    check-cast v0, Ljava/util/Map;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/cg;->j:Lcom/google/android/gms/tagmanager/e;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/tagmanager/e;->a(Ljava/util/Map;)V

    goto :goto_1

    :cond_3
    const-string v0, "pushAfterEvaluate: value not a Map"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    const-string v0, "pushAfterEvaluate: value not a Map or List"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/en$a;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x66

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Invalid resource: imbalance of rule names of functions for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " operation. Using default rule name instead"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static a(Ljava/util/Map;Lcom/google/android/gms/tagmanager/t;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tagmanager/t;",
            ">;",
            "Lcom/google/android/gms/tagmanager/t;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/t;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Duplicate function type name: "

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/t;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/t;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private b()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/google/android/gms/tagmanager/cg;->m:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v0, p0, Lcom/google/android/gms/tagmanager/cg;->m:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x2

    :goto_1
    iget v2, p0, Lcom/google/android/gms/tagmanager/cg;->m:I

    if-ge v0, v2, :cond_1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    const-string v0, ": "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method a(Lcom/google/android/gms/internal/en$a;Ljava/util/Set;Lcom/google/android/gms/tagmanager/by;)Lcom/google/android/gms/tagmanager/bn;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/en$a;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/tagmanager/by;",
            ")",
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->e:Ljava/util/Map;

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/Map;Lcom/google/android/gms/internal/en$a;Ljava/util/Set;Lcom/google/android/gms/tagmanager/by;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hj$a;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/cw;->e(Lcom/google/android/gms/internal/hj$a;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/cw;->f(Ljava/lang/Object;)Lcom/google/android/gms/internal/hj$a;

    move-result-object v2

    invoke-interface {p3, v2}, Lcom/google/android/gms/tagmanager/by;->a(Lcom/google/android/gms/internal/hj$a;)V

    new-instance v2, Lcom/google/android/gms/tagmanager/bn;

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/bn;->b()Z

    move-result v1

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/tagmanager/bn;-><init>(Ljava/lang/Object;Z)V

    return-object v2
.end method

.method a(Lcom/google/android/gms/internal/en$e;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cb;)Lcom/google/android/gms/tagmanager/bn;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/en$e;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/tagmanager/cb;",
            ")",
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/en$e;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/en$a;

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/cb;->a()Lcom/google/android/gms/tagmanager/by;

    move-result-object v5

    invoke-virtual {p0, v0, p2, v5}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/internal/en$a;Ljava/util/Set;Lcom/google/android/gms/tagmanager/by;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/cw;->f(Ljava/lang/Object;)Lcom/google/android/gms/internal/hj$a;

    move-result-object v0

    invoke-interface {p3, v0}, Lcom/google/android/gms/tagmanager/cb;->a(Lcom/google/android/gms/internal/hj$a;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bn;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/bn;->b()Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/bn;-><init>(Ljava/lang/Object;Z)V

    :goto_1
    return-object v0

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/bn;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    :goto_2
    move v1, v0

    goto :goto_0

    :cond_1
    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/en$e;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/en$a;

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/cb;->b()Lcom/google/android/gms/tagmanager/by;

    move-result-object v5

    invoke-virtual {p0, v0, p2, v5}, Lcom/google/android/gms/tagmanager/cg;->a(Lcom/google/android/gms/internal/en$a;Ljava/util/Set;Lcom/google/android/gms/tagmanager/by;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/cw;->f(Ljava/lang/Object;)Lcom/google/android/gms/internal/hj$a;

    move-result-object v0

    invoke-interface {p3, v0}, Lcom/google/android/gms/tagmanager/cb;->a(Lcom/google/android/gms/internal/hj$a;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bn;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/bn;->b()Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/bn;-><init>(Ljava/lang/Object;Z)V

    goto :goto_1

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/bn;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    move v1, v3

    goto :goto_3

    :cond_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/cw;->f(Ljava/lang/Object;)Lcom/google/android/gms/internal/hj$a;

    move-result-object v0

    invoke-interface {p3, v0}, Lcom/google/android/gms/tagmanager/cb;->a(Lcom/google/android/gms/internal/hj$a;)V

    new-instance v0, Lcom/google/android/gms/tagmanager/bn;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/tagmanager/bn;-><init>(Ljava/lang/Object;Z)V

    goto :goto_1
.end method

.method a(Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cf;)Lcom/google/android/gms/tagmanager/bn;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/en$e;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/en$e;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/en$a;",
            ">;>;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/en$e;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/en$e;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/en$a;",
            ">;>;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/en$e;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/tagmanager/cf;",
            ")",
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/en$a;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tagmanager/cg$3;

    move-object v1, p0

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/tagmanager/cg$3;-><init>(Lcom/google/android/gms/tagmanager/cg;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-direct {p0, p2, p7, v0, p8}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cg$a;Lcom/google/android/gms/tagmanager/cf;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v0

    return-object v0
.end method

.method a(Ljava/util/Set;Lcom/google/android/gms/tagmanager/cf;)Lcom/google/android/gms/tagmanager/bn;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/en$e;",
            ">;",
            "Lcom/google/android/gms/tagmanager/cf;",
            ")",
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/en$a;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v1, Lcom/google/android/gms/tagmanager/cg$4;

    invoke-direct {v1, p0}, Lcom/google/android/gms/tagmanager/cg$4;-><init>(Lcom/google/android/gms/tagmanager/cg;)V

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/cg$a;Lcom/google/android/gms/tagmanager/cf;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v0

    return-object v0
.end method

.method declared-synchronized a()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->l:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method a(Lcom/google/android/gms/tagmanager/t;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->f:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/Map;Lcom/google/android/gms/tagmanager/t;)V

    return-void
.end method

.method public declared-synchronized a(Ljava/lang/String;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/cg;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->c:Lcom/google/android/gms/tagmanager/q;

    invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/q;->b(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/p;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/tagmanager/p;->b()Lcom/google/android/gms/tagmanager/ds;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->i:Ljava/util/Set;

    invoke-interface {v2}, Lcom/google/android/gms/tagmanager/ds;->b()Lcom/google/android/gms/tagmanager/cf;

    move-result-object v3

    invoke-virtual {p0, v0, v3}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/Set;Lcom/google/android/gms/tagmanager/cf;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/en$a;

    iget-object v4, p0, Lcom/google/android/gms/tagmanager/cg;->d:Ljava/util/Map;

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v2}, Lcom/google/android/gms/tagmanager/ds;->a()Lcom/google/android/gms/tagmanager/by;

    move-result-object v6

    invoke-direct {p0, v4, v0, v5, v6}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/Map;Lcom/google/android/gms/internal/en$a;Ljava/util/Set;Lcom/google/android/gms/tagmanager/by;)Lcom/google/android/gms/tagmanager/bn;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :try_start_1
    invoke-interface {v1}, Lcom/google/android/gms/tagmanager/p;->c()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/cg;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void
.end method

.method public declared-synchronized a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/gi$i;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gi$i;

    iget-object v2, v0, Lcom/google/android/gms/internal/gi$i;->a:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/google/android/gms/internal/gi$i;->a:Ljava/lang/String;

    const-string v3, "gaExperiment:"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x16

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Ignored supplemental: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/tagmanager/cg;->j:Lcom/google/android/gms/tagmanager/e;

    invoke-static {v2, v0}, Lcom/google/android/gms/tagmanager/s;->a(Lcom/google/android/gms/tagmanager/e;Lcom/google/android/gms/internal/gi$i;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_2
    monitor-exit p0

    return-void
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/bn;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Lcom/google/android/gms/internal/hj$a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/tagmanager/cg;->m:I

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->c:Lcom/google/android/gms/tagmanager/q;

    invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/q;->a(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/p;

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/p;->a()Lcom/google/android/gms/tagmanager/az;

    move-result-object v2

    invoke-direct {p0, p1, v1, v2}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/lang/String;Ljava/util/Set;Lcom/google/android/gms/tagmanager/az;)Lcom/google/android/gms/tagmanager/bn;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/p;->c()V

    return-object v1
.end method

.method b(Lcom/google/android/gms/tagmanager/t;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->d:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/Map;Lcom/google/android/gms/tagmanager/t;)V

    return-void
.end method

.method c(Lcom/google/android/gms/tagmanager/t;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg;->e:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/google/android/gms/tagmanager/cg;->a(Ljava/util/Map;Lcom/google/android/gms/tagmanager/t;)V

    return-void
.end method

.method declared-synchronized c(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cg;->l:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
