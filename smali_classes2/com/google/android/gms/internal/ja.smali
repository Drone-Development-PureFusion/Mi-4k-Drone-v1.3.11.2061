.class public Lcom/google/android/gms/internal/ja;
.super Lcom/google/android/gms/internal/ie;


# instance fields
.field private final b:Lcom/google/android/gms/internal/im;

.field private final c:Lcom/google/firebase/database/r;

.field private final d:Lcom/google/android/gms/internal/kg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/r;Lcom/google/android/gms/internal/kg;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ie;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ja;->b:Lcom/google/android/gms/internal/im;

    iput-object p2, p0, Lcom/google/android/gms/internal/ja;->c:Lcom/google/firebase/database/r;

    iput-object p3, p0, Lcom/google/android/gms/internal/ja;->d:Lcom/google/android/gms/internal/kg;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/ie;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ja;

    iget-object v1, p0, Lcom/google/android/gms/internal/ja;->b:Lcom/google/android/gms/internal/im;

    iget-object v2, p0, Lcom/google/android/gms/internal/ja;->c:Lcom/google/firebase/database/r;

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ja;-><init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/r;Lcom/google/android/gms/internal/kg;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ka;Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kb;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ja;->b:Lcom/google/android/gms/internal/im;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/database/s;->a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)Lcom/google/firebase/database/e;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->c()Lcom/google/android/gms/internal/lc;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/database/s;->a(Lcom/google/firebase/database/e;Lcom/google/android/gms/internal/lc;)Lcom/google/firebase/database/b;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/kb;

    sget-object v2, Lcom/google/android/gms/internal/kc$a;->e:Lcom/google/android/gms/internal/kc$a;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p0, v0, v3}, Lcom/google/android/gms/internal/kb;-><init>(Lcom/google/android/gms/internal/kc$a;Lcom/google/android/gms/internal/ie;Lcom/google/firebase/database/b;Ljava/lang/String;)V

    return-object v1
.end method

.method public a()Lcom/google/android/gms/internal/kg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ja;->d:Lcom/google/android/gms/internal/kg;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/kb;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ja;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ja;->c:Lcom/google/firebase/database/r;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kb;->c()Lcom/google/firebase/database/b;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/firebase/database/r;->a(Lcom/google/firebase/database/b;)V

    goto :goto_0
.end method

.method public a(Lcom/google/firebase/database/c;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ja;->c:Lcom/google/firebase/database/r;

    invoke-interface {v0, p1}, Lcom/google/firebase/database/r;->a(Lcom/google/firebase/database/c;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ie;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/ja;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/ja;

    iget-object v0, p1, Lcom/google/android/gms/internal/ja;->c:Lcom/google/firebase/database/r;

    iget-object v1, p0, Lcom/google/android/gms/internal/ja;->c:Lcom/google/firebase/database/r;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/kc$a;)Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/kc$a;->e:Lcom/google/android/gms/internal/kc$a;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/ja;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ja;

    iget-object v0, v0, Lcom/google/android/gms/internal/ja;->c:Lcom/google/firebase/database/r;

    iget-object v1, p0, Lcom/google/android/gms/internal/ja;->c:Lcom/google/firebase/database/r;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/ja;

    iget-object v0, v0, Lcom/google/android/gms/internal/ja;->b:Lcom/google/android/gms/internal/im;

    iget-object v1, p0, Lcom/google/android/gms/internal/ja;->b:Lcom/google/android/gms/internal/im;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/ja;

    iget-object v0, p1, Lcom/google/android/gms/internal/ja;->d:Lcom/google/android/gms/internal/kg;

    iget-object v1, p0, Lcom/google/android/gms/internal/ja;->d:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kg;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ja;->c:Lcom/google/firebase/database/r;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/ja;->b:Lcom/google/android/gms/internal/im;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/ja;->d:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kg;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ValueEventRegistration"

    return-object v0
.end method
