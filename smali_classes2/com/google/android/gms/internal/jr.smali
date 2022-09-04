.class public Lcom/google/android/gms/internal/jr;
.super Ljava/lang/Object;


# static fields
.field private static final b:Lcom/google/android/gms/internal/jv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/jv",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Lcom/google/android/gms/internal/jv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/jv",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Lcom/google/android/gms/internal/ju;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Lcom/google/android/gms/internal/ju;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/google/android/gms/internal/ju;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/jr$1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/jr$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/jr;->b:Lcom/google/android/gms/internal/jv;

    new-instance v0, Lcom/google/android/gms/internal/jr$2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/jr$2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/jr;->c:Lcom/google/android/gms/internal/jv;

    new-instance v0, Lcom/google/android/gms/internal/ju;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ju;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/google/android/gms/internal/jr;->d:Lcom/google/android/gms/internal/ju;

    new-instance v0, Lcom/google/android/gms/internal/ju;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ju;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/google/android/gms/internal/jr;->e:Lcom/google/android/gms/internal/ju;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ju;->a()Lcom/google/android/gms/internal/ju;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/ju;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/jr;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/ju;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ju;

    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ju;-><init>(Ljava/lang/Object;)V

    move-object v0, v1

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/jr;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/jr;-><init>(Lcom/google/android/gms/internal/ju;)V

    return-object v1

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ij;Ljava/lang/Object;)Lcom/google/android/gms/internal/ju;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method public a(Ljava/lang/Object;Lcom/google/android/gms/internal/ju$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/google/android/gms/internal/ju$a",
            "<",
            "Ljava/lang/Void;",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    new-instance v1, Lcom/google/android/gms/internal/jr$3;

    invoke-direct {v1, p0, p2}, Lcom/google/android/gms/internal/jr$3;-><init>(Lcom/google/android/gms/internal/jr;Lcom/google/android/gms/internal/ju$a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ju;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ju$a;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    sget-object v1, Lcom/google/android/gms/internal/jr;->c:Lcom/google/android/gms/internal/jv;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/jv;)Z

    move-result v0

    return v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ju;->b(Lcom/google/android/gms/internal/ij;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/internal/ij;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ju;->b(Lcom/google/android/gms/internal/ij;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jr;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    sget-object v1, Lcom/google/android/gms/internal/jr;->b:Lcom/google/android/gms/internal/jv;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ju;->b(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/jv;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t prune path that was kept previously!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    sget-object v1, Lcom/google/android/gms/internal/jr;->c:Lcom/google/android/gms/internal/jv;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ju;->b(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/jv;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    :goto_0
    return-object p0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    sget-object v1, Lcom/google/android/gms/internal/jr;->d:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ju;)Lcom/google/android/gms/internal/ju;

    move-result-object v0

    new-instance p0, Lcom/google/android/gms/internal/jr;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/jr;-><init>(Lcom/google/android/gms/internal/ju;)V

    goto :goto_0
.end method

.method public d(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jr;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    sget-object v1, Lcom/google/android/gms/internal/jr;->b:Lcom/google/android/gms/internal/jv;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ju;->b(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/jv;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    sget-object v1, Lcom/google/android/gms/internal/jr;->e:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ju;)Lcom/google/android/gms/internal/ju;

    move-result-object v0

    new-instance p0, Lcom/google/android/gms/internal/jr;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/jr;-><init>(Lcom/google/android/gms/internal/ju;)V

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/internal/jr;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/jr;

    iget-object v2, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    iget-object v3, p1, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ju;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/jr;->a:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0xe

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "{PruneForest:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
