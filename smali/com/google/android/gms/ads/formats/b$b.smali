.class public final Lcom/google/android/gms/ads/formats/b$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/ads/formats/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:Z

.field private d:Lcom/google/android/gms/ads/i;

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/ads/formats/b$b;->a:Z

    iput v0, p0, Lcom/google/android/gms/ads/formats/b$b;->b:I

    iput-boolean v0, p0, Lcom/google/android/gms/ads/formats/b$b;->c:Z

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/ads/formats/b$b;->e:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/formats/b$b;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/formats/b$b;->a:Z

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/ads/formats/b$b;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/formats/b$b;->b:I

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/ads/formats/b$b;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/formats/b$b;->c:Z

    return v0
.end method

.method static synthetic d(Lcom/google/android/gms/ads/formats/b$b;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/formats/b$b;->e:I

    return v0
.end method

.method static synthetic e(Lcom/google/android/gms/ads/formats/b$b;)Lcom/google/android/gms/ads/i;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/formats/b$b;->d:Lcom/google/android/gms/ads/i;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/ads/formats/b$b;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/ads/formats/b$b;->b:I

    return-object p0
.end method

.method public a(Lcom/google/android/gms/ads/i;)Lcom/google/android/gms/ads/formats/b$b;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/formats/b$b;->d:Lcom/google/android/gms/ads/i;

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/ads/formats/b$b;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/ads/formats/b$b;->a:Z

    return-object p0
.end method

.method public a()Lcom/google/android/gms/ads/formats/b;
    .locals 2

    new-instance v0, Lcom/google/android/gms/ads/formats/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/formats/b;-><init>(Lcom/google/android/gms/ads/formats/b$b;Lcom/google/android/gms/ads/formats/b$1;)V

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/ads/formats/b$b;
    .locals 0
    .param p1    # I
        .annotation build Lcom/google/android/gms/ads/formats/b$a;
        .end annotation
    .end param

    iput p1, p0, Lcom/google/android/gms/ads/formats/b$b;->e:I

    return-object p0
.end method

.method public b(Z)Lcom/google/android/gms/ads/formats/b$b;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/ads/formats/b$b;->c:Z

    return-object p0
.end method
