.class public Lcom/google/android/gms/internal/ajr$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ajr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ajr$a$a;
    }
.end annotation


# instance fields
.field private final a:J

.field private final b:Ljava/util/Map;
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

.field private final c:I

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/config/internal/AnalyticsUserProperty;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ajr$a$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ajr$a$a;->a(Lcom/google/android/gms/internal/ajr$a$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ajr$a;->a:J

    invoke-static {p1}, Lcom/google/android/gms/internal/ajr$a$a;->b(Lcom/google/android/gms/internal/ajr$a$a;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ajr$a;->b:Ljava/util/Map;

    invoke-static {p1}, Lcom/google/android/gms/internal/ajr$a$a;->c(Lcom/google/android/gms/internal/ajr$a$a;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ajr$a;->c:I

    invoke-static {p1}, Lcom/google/android/gms/internal/ajr$a$a;->d(Lcom/google/android/gms/internal/ajr$a$a;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ajr$a;->d:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ajr$a$a;Lcom/google/android/gms/internal/ajr$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ajr$a;-><init>(Lcom/google/android/gms/internal/ajr$a$a;)V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ajr$a;->a:J

    return-wide v0
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ajr$a;->b:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ajr$a;->b:Ljava/util/Map;

    goto :goto_0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ajr$a;->c:I

    return v0
.end method
