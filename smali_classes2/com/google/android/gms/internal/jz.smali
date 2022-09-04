.class public Lcom/google/android/gms/internal/jz;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/kc;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ij;

.field private final b:Lcom/google/android/gms/internal/ie;

.field private final c:Lcom/google/firebase/database/c;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ie;Lcom/google/firebase/database/c;Lcom/google/android/gms/internal/ij;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/jz;->b:Lcom/google/android/gms/internal/ie;

    iput-object p3, p0, Lcom/google/android/gms/internal/jz;->a:Lcom/google/android/gms/internal/ij;

    iput-object p2, p0, Lcom/google/android/gms/internal/jz;->c:Lcom/google/firebase/database/c;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/ij;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jz;->a:Lcom/google/android/gms/internal/ij;

    return-object v0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/jz;->b:Lcom/google/android/gms/internal/ie;

    iget-object v1, p0, Lcom/google/android/gms/internal/jz;->c:Lcom/google/firebase/database/c;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ie;->a(Lcom/google/firebase/database/c;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jz;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x7

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":CANCEL"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
