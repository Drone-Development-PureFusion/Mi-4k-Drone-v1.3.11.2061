.class Lcom/google/android/gms/internal/im$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/im;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/google/android/gms/internal/im$a;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/ij;

.field private b:Lcom/google/firebase/database/q$a;

.field private c:Lcom/google/firebase/database/r;

.field private d:Lcom/google/android/gms/internal/im$b;

.field private e:J

.field private f:Z

.field private g:I

.field private h:Lcom/google/firebase/database/c;

.field private i:J

.field private j:Lcom/google/android/gms/internal/lh;

.field private k:Lcom/google/android/gms/internal/lh;

.field private l:Lcom/google/android/gms/internal/lh;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/q$a;Lcom/google/firebase/database/r;Lcom/google/android/gms/internal/im$b;ZJ)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/im$a;->a:Lcom/google/android/gms/internal/ij;

    iput-object p2, p0, Lcom/google/android/gms/internal/im$a;->b:Lcom/google/firebase/database/q$a;

    iput-object p3, p0, Lcom/google/android/gms/internal/im$a;->c:Lcom/google/firebase/database/r;

    iput-object p4, p0, Lcom/google/android/gms/internal/im$a;->d:Lcom/google/android/gms/internal/im$b;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/im$a;->g:I

    iput-boolean p5, p0, Lcom/google/android/gms/internal/im$a;->f:Z

    iput-wide p6, p0, Lcom/google/android/gms/internal/im$a;->e:J

    iput-object v1, p0, Lcom/google/android/gms/internal/im$a;->h:Lcom/google/firebase/database/c;

    iput-object v1, p0, Lcom/google/android/gms/internal/im$a;->j:Lcom/google/android/gms/internal/lh;

    iput-object v1, p0, Lcom/google/android/gms/internal/im$a;->k:Lcom/google/android/gms/internal/lh;

    iput-object v1, p0, Lcom/google/android/gms/internal/im$a;->l:Lcom/google/android/gms/internal/lh;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/q$a;Lcom/google/firebase/database/r;Lcom/google/android/gms/internal/im$b;ZJLcom/google/android/gms/internal/im$1;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/google/android/gms/internal/im$a;-><init>(Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/q$a;Lcom/google/firebase/database/r;Lcom/google/android/gms/internal/im$b;ZJ)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/im$a;J)J
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/internal/im$a;->i:J

    return-wide p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/im$b;)Lcom/google/android/gms/internal/im$b;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$a;->d:Lcom/google/android/gms/internal/im$b;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$a;->j:Lcom/google/android/gms/internal/lh;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/im$a;Lcom/google/firebase/database/c;)Lcom/google/firebase/database/c;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$a;->h:Lcom/google/firebase/database/c;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/lh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im$a;->j:Lcom/google/android/gms/internal/lh;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$a;->k:Lcom/google/android/gms/internal/lh;

    return-object p1
.end method

.method static synthetic c(Lcom/google/android/gms/internal/im$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/im$a;->i:J

    return-wide v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/im$a;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$a;->l:Lcom/google/android/gms/internal/lh;

    return-object p1
.end method

.method static synthetic d(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/im$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im$a;->d:Lcom/google/android/gms/internal/im$b;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/im$a;)I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/im$a;->g:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/im$a;->g:I

    return v0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/ij;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im$a;->a:Lcom/google/android/gms/internal/ij;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/lh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im$a;->k:Lcom/google/android/gms/internal/lh;

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/internal/im$a;)Lcom/google/android/gms/internal/lh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im$a;->l:Lcom/google/android/gms/internal/lh;

    return-object v0
.end method

.method static synthetic i(Lcom/google/android/gms/internal/im$a;)Lcom/google/firebase/database/q$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im$a;->b:Lcom/google/firebase/database/q$a;

    return-object v0
.end method

.method static synthetic j(Lcom/google/android/gms/internal/im$a;)Lcom/google/firebase/database/r;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im$a;->c:Lcom/google/firebase/database/r;

    return-object v0
.end method

.method static synthetic k(Lcom/google/android/gms/internal/im$a;)Lcom/google/firebase/database/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/im$a;->h:Lcom/google/firebase/database/c;

    return-object v0
.end method

.method static synthetic l(Lcom/google/android/gms/internal/im$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/im$a;->g:I

    return v0
.end method

.method static synthetic m(Lcom/google/android/gms/internal/im$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/im$a;->f:Z

    return v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/im$a;)I
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/im$a;->e:J

    iget-wide v2, p1, Lcom/google/android/gms/internal/im$a;->e:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/im$a;->e:J

    iget-wide v2, p1, Lcom/google/android/gms/internal/im$a;->e:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/im$a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/im$a;->a(Lcom/google/android/gms/internal/im$a;)I

    move-result v0

    return v0
.end method
