.class Lcom/google/android/gms/internal/ia$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ju$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ia;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)Lcom/google/android/gms/internal/ia;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ju$a",
        "<",
        "Lcom/google/android/gms/internal/lh;",
        "Lcom/google/android/gms/internal/ia;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ij;

.field final synthetic b:Lcom/google/android/gms/internal/ia;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ia;Lcom/google/android/gms/internal/ij;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ia$1;->b:Lcom/google/android/gms/internal/ia;

    iput-object p2, p0, Lcom/google/android/gms/internal/ia$1;->a:Lcom/google/android/gms/internal/ij;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/ia;)Lcom/google/android/gms/internal/ia;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ia$1;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-virtual {p3, v0, p2}, Lcom/google/android/gms/internal/ia;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ia;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Lcom/google/android/gms/internal/ij;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Lcom/google/android/gms/internal/lh;

    check-cast p3, Lcom/google/android/gms/internal/ia;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ia$1;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/ia;)Lcom/google/android/gms/internal/ia;

    move-result-object v0

    return-object v0
.end method
