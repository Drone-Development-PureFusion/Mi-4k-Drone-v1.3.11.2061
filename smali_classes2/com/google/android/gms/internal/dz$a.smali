.class public Lcom/google/android/gms/internal/dz$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/dz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Integer;

.field private final b:Ljava/lang/Object;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z


# direct methods
.method public constructor <init>(ILjava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/dz$a;->c:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dz$a;->d:Z

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/dz$a;->a:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/google/android/gms/internal/dz$a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/internal/dz$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/dz$a;->c:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/internal/dz$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/dz$a;->d:Z

    return-object p0
.end method

.method public a()Lcom/google/android/gms/internal/dz;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/dz$a;->a:Ljava/lang/Integer;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/dz$a;->b:Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/dz;

    iget-object v1, p0, Lcom/google/android/gms/internal/dz$a;->a:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/google/android/gms/internal/dz$a;->b:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/internal/dz$a;->c:Ljava/util/List;

    iget-boolean v4, p0, Lcom/google/android/gms/internal/dz$a;->d:Z

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/dz;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Ljava/util/List;ZLcom/google/android/gms/internal/dz$1;)V

    return-object v0
.end method
