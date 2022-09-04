.class public Lcom/google/android/gms/internal/dv$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/dv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/dx;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/dw;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/dv$a;->a:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/dv$a;->b:Ljava/util/Map;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/dv$a;->c:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/dv$a;->d:I

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/dw;)Lcom/google/android/gms/internal/dv$a;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/dw;->a()Ljava/util/Map;

    move-result-object v0

    const-string v1, "instance_name"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/dv$a;->b:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/internal/dx;)Lcom/google/android/gms/internal/dv$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dv$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/internal/dv$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/dv$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/internal/dv;
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/dv;

    iget-object v1, p0, Lcom/google/android/gms/internal/dv$a;->a:Ljava/util/List;

    iget-object v2, p0, Lcom/google/android/gms/internal/dv$a;->b:Ljava/util/Map;

    iget-object v3, p0, Lcom/google/android/gms/internal/dv$a;->c:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/dv;-><init>(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;I)V

    return-object v0
.end method
