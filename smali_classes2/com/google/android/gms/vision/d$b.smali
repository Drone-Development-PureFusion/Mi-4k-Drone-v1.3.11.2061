.class public Lcom/google/android/gms/vision/d$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:J

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/vision/d$b;->f:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/vision/d$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/vision/d$b;->f:I

    invoke-virtual {p1}, Lcom/google/android/gms/vision/d$b;->a()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/vision/d$b;->a:I

    invoke-virtual {p1}, Lcom/google/android/gms/vision/d$b;->b()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/vision/d$b;->b:I

    invoke-virtual {p1}, Lcom/google/android/gms/vision/d$b;->c()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/vision/d$b;->c:I

    invoke-virtual {p1}, Lcom/google/android/gms/vision/d$b;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/vision/d$b;->d:J

    invoke-virtual {p1}, Lcom/google/android/gms/vision/d$b;->e()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/vision/d$b;->e:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/vision/d$b;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/vision/d$b;->a:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/vision/d$b;J)J
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/vision/d$b;->d:J

    return-wide p1
.end method

.method static synthetic b(Lcom/google/android/gms/vision/d$b;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/vision/d$b;->b:I

    return p1
.end method

.method static synthetic c(Lcom/google/android/gms/vision/d$b;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/vision/d$b;->f:I

    return p1
.end method

.method static synthetic d(Lcom/google/android/gms/vision/d$b;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/vision/d$b;->c:I

    return p1
.end method

.method static synthetic e(Lcom/google/android/gms/vision/d$b;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/vision/d$b;->e:I

    return p1
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/vision/d$b;->a:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/vision/d$b;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/vision/d$b;->c:I

    return v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/vision/d$b;->d:J

    return-wide v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/vision/d$b;->e:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/vision/d$b;->f:I

    return v0
.end method

.method public g()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/vision/d$b;->e:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/vision/d$b;->a:I

    iget v1, p0, Lcom/google/android/gms/vision/d$b;->b:I

    iput v1, p0, Lcom/google/android/gms/vision/d$b;->a:I

    iput v0, p0, Lcom/google/android/gms/vision/d$b;->b:I

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/vision/d$b;->e:I

    return-void
.end method
