.class public Lcom/google/android/gms/internal/kb;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/kc;


# instance fields
.field private final a:Lcom/google/android/gms/internal/kc$a;

.field private final b:Lcom/google/android/gms/internal/ie;

.field private final c:Lcom/google/firebase/database/b;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/kc$a;Lcom/google/android/gms/internal/ie;Lcom/google/firebase/database/b;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/kb;->a:Lcom/google/android/gms/internal/kc$a;

    iput-object p2, p0, Lcom/google/android/gms/internal/kb;->b:Lcom/google/android/gms/internal/ie;

    iput-object p3, p0, Lcom/google/android/gms/internal/kb;->c:Lcom/google/firebase/database/b;

    iput-object p4, p0, Lcom/google/android/gms/internal/kb;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/ij;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/kb;->c:Lcom/google/firebase/database/b;

    invoke-virtual {v0}, Lcom/google/firebase/database/b;->e()Lcom/google/firebase/database/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/kb;->a:Lcom/google/android/gms/internal/kc$a;

    sget-object v2, Lcom/google/android/gms/internal/kc$a;->e:Lcom/google/android/gms/internal/kc$a;

    if-ne v1, v2, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->f()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    goto :goto_0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kb;->b:Lcom/google/android/gms/internal/ie;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ie;->a(Lcom/google/android/gms/internal/kb;)V

    return-void
.end method

.method public c()Lcom/google/firebase/database/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kb;->c:Lcom/google/firebase/database/b;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kb;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/internal/kc$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kb;->a:Lcom/google/android/gms/internal/kc$a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    const/4 v4, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/kb;->a:Lcom/google/android/gms/internal/kc$a;

    sget-object v1, Lcom/google/android/gms/internal/kc$a;->e:Lcom/google/android/gms/internal/kc$a;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kb;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/kb;->a:Lcom/google/android/gms/internal/kc$a;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/kb;->c:Lcom/google/firebase/database/b;

    invoke-virtual {v2, v4}, Lcom/google/firebase/database/b;->a(Z)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ": "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/kb;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/kb;->a:Lcom/google/android/gms/internal/kc$a;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/kb;->c:Lcom/google/firebase/database/b;

    invoke-virtual {v2}, Lcom/google/firebase/database/b;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/kb;->c:Lcom/google/firebase/database/b;

    invoke-virtual {v3, v4}, Lcom/google/firebase/database/b;->a(Z)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ": "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": { "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
