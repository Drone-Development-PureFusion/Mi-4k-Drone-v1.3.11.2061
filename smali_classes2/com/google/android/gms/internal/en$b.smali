.class public Lcom/google/android/gms/internal/en$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/en;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/hj$a;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/google/android/gms/internal/hj$a;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/en$b;->a:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/en$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/en$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/en$a;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/en$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/en$b;->a:Ljava/util/Map;

    iget-object v2, p0, Lcom/google/android/gms/internal/en$b;->b:Lcom/google/android/gms/internal/hj$a;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/en$a;-><init>(Ljava/util/Map;Lcom/google/android/gms/internal/hj$a;Lcom/google/android/gms/internal/en$1;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/hj$a;)Lcom/google/android/gms/internal/en$b;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/en$b;->b:Lcom/google/android/gms/internal/hj$a;

    return-object p0
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/internal/hj$a;)Lcom/google/android/gms/internal/en$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/en$b;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
