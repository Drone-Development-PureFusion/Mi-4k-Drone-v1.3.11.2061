.class public Lcom/google/android/gms/internal/ajr$a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ajr$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:J

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0xa8c0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ajr$a$a;->a:J

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ajr$a$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ajr$a$a;->a:J

    return-wide v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ajr$a$a;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ajr$a$a;->b:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ajr$a$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ajr$a$a;->c:I

    return v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/ajr$a$a;)Ljava/util/List;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/internal/ajr$a$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ajr$a$a;->c:I

    return-object p0
.end method

.method public a(J)Lcom/google/android/gms/internal/ajr$a$a;
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ajr$a$a;->a:J

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ajr$a$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ajr$a$a;->b:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ajr$a$a;->b:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ajr$a$a;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/internal/ajr$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ajr$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ajr$a;-><init>(Lcom/google/android/gms/internal/ajr$a$a;Lcom/google/android/gms/internal/ajr$1;)V

    return-object v0
.end method
