.class public Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Field;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;->b:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;->b:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/fitness/data/Field;)Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/lang/String;I)Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Invalid name specified"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-static {p1, p2}, Lcom/google/android/gms/fitness/data/Field;->a(Ljava/lang/String;I)Lcom/google/android/gms/fitness/data/Field;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;->a(Lcom/google/android/gms/fitness/data/Field;)Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a()Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;
    .locals 4

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Must set the name"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_1
    const-string v0, "Must specify the data fields"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/DataTypeCreateRequest;-><init>(Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$a;Lcom/google/android/gms/fitness/request/DataTypeCreateRequest$1;)V

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method
