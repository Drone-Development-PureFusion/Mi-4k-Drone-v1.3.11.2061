.class public Lcom/google/android/gms/internal/dx$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/dx;
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
            "Lcom/google/android/gms/internal/dw;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/dw;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/dw;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/dw;",
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

    iput-object v0, p0, Lcom/google/android/gms/internal/dx$a;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/dx$a;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/dx$a;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/dx$a;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/dw;)Lcom/google/android/gms/internal/dx$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dx$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a()Lcom/google/android/gms/internal/dx;
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/dx;

    iget-object v1, p0, Lcom/google/android/gms/internal/dx$a;->a:Ljava/util/List;

    iget-object v2, p0, Lcom/google/android/gms/internal/dx$a;->b:Ljava/util/List;

    iget-object v3, p0, Lcom/google/android/gms/internal/dx$a;->c:Ljava/util/List;

    iget-object v4, p0, Lcom/google/android/gms/internal/dx$a;->d:Ljava/util/List;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/dx;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/dx$1;)V

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/dw;)Lcom/google/android/gms/internal/dx$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dx$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c(Lcom/google/android/gms/internal/dw;)Lcom/google/android/gms/internal/dx$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dx$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public d(Lcom/google/android/gms/internal/dw;)Lcom/google/android/gms/internal/dx$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dx$a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
