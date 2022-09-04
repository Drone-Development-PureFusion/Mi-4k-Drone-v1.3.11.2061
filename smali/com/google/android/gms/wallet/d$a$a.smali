.class public final Lcom/google/android/gms/wallet/d$a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/wallet/d$a$a;->a:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/wallet/d$a$a;->b:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/wallet/d$a$a;->c:Z

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/d$a$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/d$a$a;->a:I

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/wallet/d$a$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/d$a$a;->b:I

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/wallet/d$a$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/wallet/d$a$a;->c:Z

    return v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/wallet/d$a$a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/wallet/d$a$a;->c:Z

    return-object p0
.end method

.method public a(I)Lcom/google/android/gms/wallet/d$a$a;
    .locals 5

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    if-eq p1, v2, :cond_0

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    :cond_0
    iput p1, p0, Lcom/google/android/gms/wallet/d$a$a;->a:I

    return-object p0

    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "Invalid environment value %d"

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b(I)Lcom/google/android/gms/wallet/d$a$a;
    .locals 5

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    if-ne p1, v2, :cond_1

    :cond_0
    iput p1, p0, Lcom/google/android/gms/wallet/d$a$a;->b:I

    return-object p0

    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "Invalid theme value %d"

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b()Lcom/google/android/gms/wallet/d$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wallet/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/wallet/d$a;-><init>(Lcom/google/android/gms/wallet/d$a$a;Lcom/google/android/gms/wallet/d$1;)V

    return-object v0
.end method
