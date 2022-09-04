.class public Lcom/google/android/gms/drive/query/Query$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/query/Query;
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
            "Lcom/google/android/gms/drive/query/Filter;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;

.field private c:Lcom/google/android/gms/drive/query/SortOrder;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private e:Z

.field private f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/drive/DriveSpace;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/drive/query/Query$a;->a:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/query/Query;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/drive/query/Query$a;->a:Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/drive/query/Query$a;->a:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->a()Lcom/google/android/gms/drive/query/Filter;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/query/Query$a;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->c()Lcom/google/android/gms/drive/query/SortOrder;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/query/Query$a;->c:Lcom/google/android/gms/drive/query/SortOrder;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/query/Query$a;->d:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/drive/query/Query$a;->e:Z

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->f()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/query/Query$a;->f:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/query/Query;->g()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/drive/query/Query$a;->g:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/drive/query/Filter;)Lcom/google/android/gms/drive/query/Query$a;
    .locals 1

    instance-of v0, p1, Lcom/google/android/gms/drive/query/internal/MatchAllFilter;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/query/Query$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public a(Lcom/google/android/gms/drive/query/SortOrder;)Lcom/google/android/gms/drive/query/Query$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/query/Query$a;->c:Lcom/google/android/gms/drive/query/SortOrder;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/drive/query/Query$a;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/drive/query/Query$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/drive/query/Query;
    .locals 9

    new-instance v0, Lcom/google/android/gms/drive/query/Query;

    new-instance v1, Lcom/google/android/gms/drive/query/internal/LogicalFilter;

    sget-object v2, Lcom/google/android/gms/drive/query/internal/Operator;->f:Lcom/google/android/gms/drive/query/internal/Operator;

    iget-object v3, p0, Lcom/google/android/gms/drive/query/Query$a;->a:Ljava/util/List;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/query/internal/LogicalFilter;-><init>(Lcom/google/android/gms/drive/query/internal/Operator;Ljava/lang/Iterable;)V

    iget-object v2, p0, Lcom/google/android/gms/drive/query/Query$a;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/drive/query/Query$a;->c:Lcom/google/android/gms/drive/query/SortOrder;

    iget-object v4, p0, Lcom/google/android/gms/drive/query/Query$a;->d:Ljava/util/List;

    iget-boolean v5, p0, Lcom/google/android/gms/drive/query/Query$a;->e:Z

    iget-object v6, p0, Lcom/google/android/gms/drive/query/Query$a;->f:Ljava/util/Set;

    iget-boolean v7, p0, Lcom/google/android/gms/drive/query/Query$a;->g:Z

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/drive/query/Query;-><init>(Lcom/google/android/gms/drive/query/internal/LogicalFilter;Ljava/lang/String;Lcom/google/android/gms/drive/query/SortOrder;Ljava/util/List;ZLjava/util/Set;ZLcom/google/android/gms/drive/query/Query$1;)V

    return-object v0
.end method
