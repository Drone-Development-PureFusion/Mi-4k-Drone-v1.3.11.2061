.class public final Lcom/google/android/gms/fitness/data/DataSource$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/data/DataSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/fitness/data/DataType;

.field private b:I

.field private c:Ljava/lang/String;

.field private d:Lcom/google/android/gms/fitness/data/Device;

.field private e:Lcom/google/android/gms/fitness/data/Application;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->b:I

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->f:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/fitness/data/DataSource$a;)Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->a:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/fitness/data/DataSource$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->b:I

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/fitness/data/DataSource$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/fitness/data/DataSource$a;)Lcom/google/android/gms/fitness/data/Device;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->d:Lcom/google/android/gms/fitness/data/Device;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/fitness/data/DataSource$a;)Lcom/google/android/gms/fitness/data/Application;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->e:Lcom/google/android/gms/fitness/data/Application;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/fitness/data/DataSource$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/fitness/data/DataSource$a;)[I
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/fitness/data/DataSource$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->b:I

    return-object p0
.end method

.method public a(Landroid/content/Context;)Lcom/google/android/gms/fitness/data/DataSource$a;
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/fitness/data/DataSource$a;->b(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/DataSource$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->a:Lcom/google/android/gms/fitness/data/DataType;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/fitness/data/Device;)Lcom/google/android/gms/fitness/data/DataSource$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->d:Lcom/google/android/gms/fitness/data/Device;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/fitness/data/DataSource;
    .locals 4

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->a:Lcom/google/android/gms/fitness/data/DataType;

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Must set data type"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget v0, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->b:I

    if-ltz v0, :cond_1

    :goto_1
    const-string v0, "Must set data source type"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/fitness/data/DataSource;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/data/DataSource;-><init>(Lcom/google/android/gms/fitness/data/DataSource$a;Lcom/google/android/gms/fitness/data/DataSource$1;)V

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$a;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/Application;->a(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Application;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->e:Lcom/google/android/gms/fitness/data/Application;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$a;
    .locals 2

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Must specify a valid stream name"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/fitness/data/DataSource$a;->f:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
